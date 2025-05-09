// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.AutoPagerAsync
import com.braintrustdata.api.core.PageAsync
import com.braintrustdata.api.core.checkRequired
import com.braintrustdata.api.services.async.AclServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see [AclServiceAsync.list] */
class AclListPageAsync
private constructor(
    private val service: AclServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: AclListParams,
    private val response: AclListPageResponse,
) : PageAsync<Acl> {

    /**
     * Delegates to [AclListPageResponse], but gracefully handles missing data.
     *
     * @see [AclListPageResponse.objects]
     */
    fun objects(): List<Acl> = response._objects().getOptional("objects").getOrNull() ?: emptyList()

    override fun items(): List<Acl> = objects()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): AclListParams =
        if (params.endingBefore().isPresent) {
            params.toBuilder().endingBefore(items().first()._id().getOptional("id")).build()
        } else {
            params.toBuilder().startingAfter(items().last()._id().getOptional("id")).build()
        }

    override fun nextPage(): CompletableFuture<AclListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<Acl> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): AclListParams = params

    /** The response that this page was parsed from. */
    fun response(): AclListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AclListPageAsync].
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

    /** A builder for [AclListPageAsync]. */
    class Builder internal constructor() {

        private var service: AclServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: AclListParams? = null
        private var response: AclListPageResponse? = null

        @JvmSynthetic
        internal fun from(aclListPageAsync: AclListPageAsync) = apply {
            service = aclListPageAsync.service
            streamHandlerExecutor = aclListPageAsync.streamHandlerExecutor
            params = aclListPageAsync.params
            response = aclListPageAsync.response
        }

        fun service(service: AclServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: AclListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AclListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [AclListPageAsync].
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
        fun build(): AclListPageAsync =
            AclListPageAsync(
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

        return /* spotless:off */ other is AclListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, response) /* spotless:on */

    override fun toString() =
        "AclListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
