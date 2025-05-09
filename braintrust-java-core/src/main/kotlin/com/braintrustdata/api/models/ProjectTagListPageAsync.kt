// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.AutoPagerAsync
import com.braintrustdata.api.core.PageAsync
import com.braintrustdata.api.core.checkRequired
import com.braintrustdata.api.services.async.ProjectTagServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see [ProjectTagServiceAsync.list] */
class ProjectTagListPageAsync
private constructor(
    private val service: ProjectTagServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: ProjectTagListParams,
    private val response: ProjectTagListPageResponse,
) : PageAsync<ProjectTag> {

    /**
     * Delegates to [ProjectTagListPageResponse], but gracefully handles missing data.
     *
     * @see [ProjectTagListPageResponse.objects]
     */
    fun objects(): List<ProjectTag> =
        response._objects().getOptional("objects").getOrNull() ?: emptyList()

    override fun items(): List<ProjectTag> = objects()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): ProjectTagListParams =
        if (params.endingBefore().isPresent) {
            params.toBuilder().endingBefore(items().first()._id().getOptional("id")).build()
        } else {
            params.toBuilder().startingAfter(items().last()._id().getOptional("id")).build()
        }

    override fun nextPage(): CompletableFuture<ProjectTagListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<ProjectTag> = AutoPagerAsync.from(this, streamHandlerExecutor)

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
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ProjectTagListPageAsync]. */
    class Builder internal constructor() {

        private var service: ProjectTagServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: ProjectTagListParams? = null
        private var response: ProjectTagListPageResponse? = null

        @JvmSynthetic
        internal fun from(projectTagListPageAsync: ProjectTagListPageAsync) = apply {
            service = projectTagListPageAsync.service
            streamHandlerExecutor = projectTagListPageAsync.streamHandlerExecutor
            params = projectTagListPageAsync.params
            response = projectTagListPageAsync.response
        }

        fun service(service: ProjectTagServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

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
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ProjectTagListPageAsync =
            ProjectTagListPageAsync(
                checkRequired("service", service),
                checkRequired("streamHandlerExecutor", streamHandlerExecutor),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ProjectTagListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, response) /* spotless:on */

    override fun toString() =
        "ProjectTagListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
