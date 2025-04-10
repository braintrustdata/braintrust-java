// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.checkRequired
import com.braintrustdata.api.services.async.ProjectTagServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** @see [ProjectTagServiceAsync.list] */
class ProjectTagListPageAsync
private constructor(
    private val service: ProjectTagServiceAsync,
    private val params: ProjectTagListParams,
    private val response: ProjectTagListPageResponse,
) {

    /**
     * Delegates to [ProjectTagListPageResponse], but gracefully handles missing data.
     *
     * @see [ProjectTagListPageResponse.objects]
     */
    fun objects(): List<ProjectTag> =
        response._objects().getOptional("objects").getOrNull() ?: emptyList()

    fun hasNextPage(): Boolean = objects().isNotEmpty()

    fun getNextPageParams(): Optional<ProjectTagListParams> {
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

    fun getNextPage(): CompletableFuture<Optional<ProjectTagListPageAsync>> =
        getNextPageParams()
            .map { service.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): ProjectTagListParams = params

    /** The response that this page was parsed from. */
    fun response(): ProjectTagListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ProjectTagListPageAsync].
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

    /** A builder for [ProjectTagListPageAsync]. */
    class Builder internal constructor() {

        private var service: ProjectTagServiceAsync? = null
        private var params: ProjectTagListParams? = null
        private var response: ProjectTagListPageResponse? = null

        @JvmSynthetic
        internal fun from(projectTagListPageAsync: ProjectTagListPageAsync) = apply {
            service = projectTagListPageAsync.service
            params = projectTagListPageAsync.params
            response = projectTagListPageAsync.response
        }

        fun service(service: ProjectTagServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ProjectTagListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ProjectTagListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ProjectTagListPageAsync].
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
        fun build(): ProjectTagListPageAsync =
            ProjectTagListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: ProjectTagListPageAsync) {

        fun forEach(action: Predicate<ProjectTag>, executor: Executor): CompletableFuture<Void> {
            fun CompletableFuture<Optional<ProjectTagListPageAsync>>.forEach(
                action: (ProjectTag) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<ProjectTag>> {
            val values = mutableListOf<ProjectTag>()
            return forEach(values::add, executor).thenApply { values }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ProjectTagListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "ProjectTagListPageAsync{service=$service, params=$params, response=$response}"
}
