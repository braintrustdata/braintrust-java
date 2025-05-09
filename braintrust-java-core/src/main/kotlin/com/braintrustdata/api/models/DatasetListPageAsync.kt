// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.AutoPagerAsync
import com.braintrustdata.api.core.PageAsync
import com.braintrustdata.api.core.checkRequired
import com.braintrustdata.api.services.async.DatasetServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see [DatasetServiceAsync.list] */
class DatasetListPageAsync
private constructor(
    private val service: DatasetServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: DatasetListParams,
    private val response: DatasetListPageResponse,
) : PageAsync<Dataset> {

    /**
     * Delegates to [DatasetListPageResponse], but gracefully handles missing data.
     *
     * @see [DatasetListPageResponse.objects]
     */
    fun objects(): List<Dataset> =
        response._objects().getOptional("objects").getOrNull() ?: emptyList()

    override fun items(): List<Dataset> = objects()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): DatasetListParams =
        if (params.endingBefore().isPresent) {
            params.toBuilder().endingBefore(items().first()._id().getOptional("id")).build()
        } else {
            params.toBuilder().startingAfter(items().last()._id().getOptional("id")).build()
        }

    override fun nextPage(): CompletableFuture<DatasetListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<Dataset> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): DatasetListParams = params

    /** The response that this page was parsed from. */
    fun response(): DatasetListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DatasetListPageAsync].
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

    /** A builder for [DatasetListPageAsync]. */
    class Builder internal constructor() {

        private var service: DatasetServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: DatasetListParams? = null
        private var response: DatasetListPageResponse? = null

        @JvmSynthetic
        internal fun from(datasetListPageAsync: DatasetListPageAsync) = apply {
            service = datasetListPageAsync.service
            streamHandlerExecutor = datasetListPageAsync.streamHandlerExecutor
            params = datasetListPageAsync.params
            response = datasetListPageAsync.response
        }

        fun service(service: DatasetServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: DatasetListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: DatasetListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [DatasetListPageAsync].
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
        fun build(): DatasetListPageAsync =
            DatasetListPageAsync(
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

        return /* spotless:off */ other is DatasetListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, response) /* spotless:on */

    override fun toString() =
        "DatasetListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
