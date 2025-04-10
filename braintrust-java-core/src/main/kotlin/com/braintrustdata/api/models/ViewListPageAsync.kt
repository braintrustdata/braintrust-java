// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.services.async.ViewServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/**
 * List out all views. The views are sorted by creation date, with the most recently-created views
 * coming first
 */
class ViewListPageAsync
private constructor(
    private val viewsService: ViewServiceAsync,
    private val params: ViewListParams,
    private val response: ViewListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): ViewListPageResponse = response

    /**
     * Delegates to [ViewListPageResponse], but gracefully handles missing data.
     *
     * @see [ViewListPageResponse.objects]
     */
    fun objects(): List<View> =
        response._objects().getOptional("objects").getOrNull() ?: emptyList()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ViewListPageAsync && viewsService == other.viewsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(viewsService, params, response) /* spotless:on */

    override fun toString() =
        "ViewListPageAsync{viewsService=$viewsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = objects().isNotEmpty()

    fun getNextPageParams(): Optional<ViewListParams> {
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

    fun getNextPage(): CompletableFuture<Optional<ViewListPageAsync>> {
        return getNextPageParams()
            .map { viewsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            viewsService: ViewServiceAsync,
            params: ViewListParams,
            response: ViewListPageResponse,
        ) = ViewListPageAsync(viewsService, params, response)
    }

    class AutoPager(private val firstPage: ViewListPageAsync) {

        fun forEach(action: Predicate<View>, executor: Executor): CompletableFuture<Void> {
            fun CompletableFuture<Optional<ViewListPageAsync>>.forEach(
                action: (View) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<View>> {
            val values = mutableListOf<View>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
