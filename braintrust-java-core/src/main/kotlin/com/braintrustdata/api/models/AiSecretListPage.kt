// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.AutoPager
import com.braintrustdata.api.core.Page
import com.braintrustdata.api.core.checkRequired
import com.braintrustdata.api.services.blocking.AiSecretService
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

/** @see [AiSecretService.list] */
class AiSecretListPage
private constructor(
    private val service: AiSecretService,
    private val params: AiSecretListParams,
    private val response: AiSecretListPageResponse,
) : Page<AISecret> {

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

    override fun nextPage(): AiSecretListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<AISecret> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): AiSecretListParams = params

    /** The response that this page was parsed from. */
    fun response(): AiSecretListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AiSecretListPage].
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

    /** A builder for [AiSecretListPage]. */
    class Builder internal constructor() {

        private var service: AiSecretService? = null
        private var params: AiSecretListParams? = null
        private var response: AiSecretListPageResponse? = null

        @JvmSynthetic
        internal fun from(aiSecretListPage: AiSecretListPage) = apply {
            service = aiSecretListPage.service
            params = aiSecretListPage.params
            response = aiSecretListPage.response
        }

        fun service(service: AiSecretService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: AiSecretListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AiSecretListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [AiSecretListPage].
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
        fun build(): AiSecretListPage =
            AiSecretListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AiSecretListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "AiSecretListPage{service=$service, params=$params, response=$response}"
}
