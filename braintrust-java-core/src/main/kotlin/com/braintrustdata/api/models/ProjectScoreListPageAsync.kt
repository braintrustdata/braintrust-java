// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.checkRequired
import com.braintrustdata.api.services.async.ProjectScoreServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** @see [ProjectScoreServiceAsync.list] */
class ProjectScoreListPageAsync
private constructor(
    private val service: ProjectScoreServiceAsync,
    private val params: ProjectScoreListParams,
    private val response: ProjectScoreListPageResponse,
) {

    /**
     * Delegates to [ProjectScoreListPageResponse], but gracefully handles missing data.
     *
     * @see [ProjectScoreListPageResponse.objects]
     */
    fun objects(): List<ProjectScore> =
        response._objects().getOptional("objects").getOrNull() ?: emptyList()

    fun hasNextPage(): Boolean = objects().isNotEmpty()

    fun getNextPageParams(): Optional<ProjectScoreListParams> {
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

    fun getNextPage(): CompletableFuture<Optional<ProjectScoreListPageAsync>> =
        getNextPageParams()
            .map { service.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): ProjectScoreListParams = params

    /** The response that this page was parsed from. */
    fun response(): ProjectScoreListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ProjectScoreListPageAsync].
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

    /** A builder for [ProjectScoreListPageAsync]. */
    class Builder internal constructor() {

        private var service: ProjectScoreServiceAsync? = null
        private var params: ProjectScoreListParams? = null
        private var response: ProjectScoreListPageResponse? = null

        @JvmSynthetic
        internal fun from(projectScoreListPageAsync: ProjectScoreListPageAsync) = apply {
            service = projectScoreListPageAsync.service
            params = projectScoreListPageAsync.params
            response = projectScoreListPageAsync.response
        }

        fun service(service: ProjectScoreServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ProjectScoreListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ProjectScoreListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ProjectScoreListPageAsync].
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
        fun build(): ProjectScoreListPageAsync =
            ProjectScoreListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: ProjectScoreListPageAsync) {

        fun forEach(action: Predicate<ProjectScore>, executor: Executor): CompletableFuture<Void> {
            fun CompletableFuture<Optional<ProjectScoreListPageAsync>>.forEach(
                action: (ProjectScore) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<ProjectScore>> {
            val values = mutableListOf<ProjectScore>()
            return forEach(values::add, executor).thenApply { values }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ProjectScoreListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "ProjectScoreListPageAsync{service=$service, params=$params, response=$response}"
}
