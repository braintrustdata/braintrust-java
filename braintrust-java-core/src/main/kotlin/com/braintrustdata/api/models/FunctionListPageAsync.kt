// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.checkRequired
import com.braintrustdata.api.services.async.FunctionServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** @see [FunctionServiceAsync.list] */
class FunctionListPageAsync
private constructor(
    private val service: FunctionServiceAsync,
    private val params: FunctionListParams,
    private val response: FunctionListPageResponse,
) {

    /**
     * Delegates to [FunctionListPageResponse], but gracefully handles missing data.
     *
     * @see [FunctionListPageResponse.objects]
     */
    fun objects(): List<Function> =
        response._objects().getOptional("objects").getOrNull() ?: emptyList()

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

    fun getNextPage(): CompletableFuture<Optional<FunctionListPageAsync>> =
        getNextPageParams()
            .map { service.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): FunctionListParams = params

    /** The response that this page was parsed from. */
    fun response(): FunctionListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [FunctionListPageAsync].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FunctionListPageAsync]. */
    class Builder internal constructor() {

        private var service: FunctionServiceAsync? = null
        private var params: FunctionListParams? = null
        private var response: FunctionListPageResponse? = null

        @JvmSynthetic
        internal fun from(functionListPageAsync: FunctionListPageAsync) = apply {
            service = functionListPageAsync.service
            params = functionListPageAsync.params
            response = functionListPageAsync.response
        }

        fun service(service: FunctionServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: FunctionListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: FunctionListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [FunctionListPageAsync].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): FunctionListPageAsync =
            FunctionListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is FunctionListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "FunctionListPageAsync{service=$service, params=$params, response=$response}"
}
