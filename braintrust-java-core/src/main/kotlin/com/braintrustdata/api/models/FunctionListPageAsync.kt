// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.services.async.FunctionServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/**
 * List out all functions. The functions are sorted by creation date, with the most recently-created
 * functions coming first
 */
class FunctionListPageAsync
private constructor(
    private val functionsService: FunctionServiceAsync,
    private val params: FunctionListParams,
    private val response: FunctionListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): FunctionListPageResponse = response

    /**
     * Delegates to [FunctionListPageResponse], but gracefully handles missing data.
     *
     * @see [FunctionListPageResponse.objects]
     */
    fun objects(): List<Function> =
        response._objects().getOptional("objects").getOrNull() ?: emptyList()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is FunctionListPageAsync && functionsService == other.functionsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(functionsService, params, response) /* spotless:on */

    override fun toString() =
        "FunctionListPageAsync{functionsService=$functionsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = objects().isNotEmpty()

    fun getNextPageParams(): Optional<FunctionListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            if (params.endingBefore().isPresent) {
                params.toBuilder().endingBefore(objects().first()._id().getOptional("id")).build()
            } else {
                params.toBuilder().startingAfter(objects().last()._id().getOptional("id")).build()
            }
        )
    }

    fun getNextPage(): CompletableFuture<Optional<FunctionListPageAsync>> {
        return getNextPageParams()
            .map { functionsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            functionsService: FunctionServiceAsync,
            params: FunctionListParams,
            response: FunctionListPageResponse,
        ) = FunctionListPageAsync(functionsService, params, response)
    }

    class AutoPager(private val firstPage: FunctionListPageAsync) {

        fun forEach(action: Predicate<Function>, executor: Executor): CompletableFuture<Void> {
            fun CompletableFuture<Optional<FunctionListPageAsync>>.forEach(
                action: (Function) -> Boolean,
                executor: Executor,
            ): CompletableFuture<Void> =
                thenComposeAsync(
                    { page ->
                        page
                            .filter { it.objects().all(action) }
                            .map { it.getNextPage().forEach(action, executor) }
                            .orElseGet { CompletableFuture.completedFuture(null) }
                    },
                    executor,
                )
            return CompletableFuture.completedFuture(Optional.of(firstPage))
                .forEach(action::test, executor)
        }

        fun toList(executor: Executor): CompletableFuture<List<Function>> {
            val values = mutableListOf<Function>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
