// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.AutoPagerAsync
import com.braintrustdata.api.core.PageAsync
import com.braintrustdata.api.core.checkRequired
import com.braintrustdata.api.services.async.AiSecretServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see [AiSecretServiceAsync.list] */
class AiSecretListPageAsync
private constructor(
    private val service: AiSecretServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: AiSecretListParams,
    private val response: AiSecretListPageResponse,
) : PageAsync<AISecret> {

    /**
     * Delegates to [AiSecretListPageResponse], but gracefully handles missing data.
     *
     * @see [AiSecretListPageResponse.objects]
     */
    fun objects(): List<AISecret> =
        response._objects().getOptional("objects").getOrNull() ?: emptyList()

    override fun items(): List<AISecret> = objects()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): AiSecretListParams =
        if (params.endingBefore().isPresent) {
            params.toBuilder().endingBefore(items().first()._id().getOptional("id")).build()
        } else {
            params.toBuilder().startingAfter(items().last()._id().getOptional("id")).build()
        }

    override fun nextPage(): CompletableFuture<AiSecretListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<AISecret> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): AiSecretListParams = params

    /** The response that this page was parsed from. */
    fun response(): AiSecretListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AiSecretListPageAsync].
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

    /** A builder for [AiSecretListPageAsync]. */
    class Builder internal constructor() {

        private var service: AiSecretServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: AiSecretListParams? = null
        private var response: AiSecretListPageResponse? = null

        @JvmSynthetic
        internal fun from(aiSecretListPageAsync: AiSecretListPageAsync) = apply {
            service = aiSecretListPageAsync.service
            streamHandlerExecutor = aiSecretListPageAsync.streamHandlerExecutor
            params = aiSecretListPageAsync.params
            response = aiSecretListPageAsync.response
        }

        fun service(service: AiSecretServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: AiSecretListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AiSecretListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [AiSecretListPageAsync].
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
        fun build(): AiSecretListPageAsync =
            AiSecretListPageAsync(
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

        return /* spotless:off */ other is AiSecretListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, response) /* spotless:on */

    override fun toString() =
        "AiSecretListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
