// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.AutoPagerAsync
import com.braintrustdata.api.core.PageAsync
import com.braintrustdata.api.core.checkRequired
import com.braintrustdata.api.services.async.PromptServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see [PromptServiceAsync.list] */
class PromptListPageAsync
private constructor(
    private val service: PromptServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: PromptListParams,
    private val response: PromptListPageResponse,
) : PageAsync<Prompt> {

    /**
     * Delegates to [PromptListPageResponse], but gracefully handles missing data.
     *
     * @see [PromptListPageResponse.objects]
     */
    fun objects(): List<Prompt> =
        response._objects().getOptional("objects").getOrNull() ?: emptyList()

    override fun items(): List<Prompt> = objects()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): PromptListParams =
        if (params.endingBefore().isPresent) {
            params.toBuilder().endingBefore(items().first()._id().getOptional("id")).build()
        } else {
            params.toBuilder().startingAfter(items().last()._id().getOptional("id")).build()
        }

    override fun nextPage(): CompletableFuture<PromptListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<Prompt> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): PromptListParams = params

    /** The response that this page was parsed from. */
    fun response(): PromptListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PromptListPageAsync].
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

    /** A builder for [PromptListPageAsync]. */
    class Builder internal constructor() {

        private var service: PromptServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: PromptListParams? = null
        private var response: PromptListPageResponse? = null

        @JvmSynthetic
        internal fun from(promptListPageAsync: PromptListPageAsync) = apply {
            service = promptListPageAsync.service
            streamHandlerExecutor = promptListPageAsync.streamHandlerExecutor
            params = promptListPageAsync.params
            response = promptListPageAsync.response
        }

        fun service(service: PromptServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: PromptListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PromptListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [PromptListPageAsync].
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
        fun build(): PromptListPageAsync =
            PromptListPageAsync(
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

        return /* spotless:off */ other is PromptListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, response) /* spotless:on */

    override fun toString() =
        "PromptListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
