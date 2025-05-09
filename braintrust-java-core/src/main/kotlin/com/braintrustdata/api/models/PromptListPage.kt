// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.AutoPager
import com.braintrustdata.api.core.Page
import com.braintrustdata.api.core.checkRequired
import com.braintrustdata.api.services.blocking.PromptService
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

/** @see [PromptService.list] */
class PromptListPage
private constructor(
    private val service: PromptService,
    private val params: PromptListParams,
    private val response: PromptListPageResponse,
) : Page<Prompt> {

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

    override fun nextPage(): PromptListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<Prompt> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): PromptListParams = params

    /** The response that this page was parsed from. */
    fun response(): PromptListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PromptListPage].
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

    /** A builder for [PromptListPage]. */
    class Builder internal constructor() {

        private var service: PromptService? = null
        private var params: PromptListParams? = null
        private var response: PromptListPageResponse? = null

        @JvmSynthetic
        internal fun from(promptListPage: PromptListPage) = apply {
            service = promptListPage.service
            params = promptListPage.params
            response = promptListPage.response
        }

        fun service(service: PromptService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: PromptListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PromptListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [PromptListPage].
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
        fun build(): PromptListPage =
            PromptListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PromptListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() = "PromptListPage{service=$service, params=$params, response=$response}"
}
