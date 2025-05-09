// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.AutoPager
import com.braintrustdata.api.core.Page
import com.braintrustdata.api.core.checkRequired
import com.braintrustdata.api.services.blocking.FunctionService
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

/** @see [FunctionService.list] */
class FunctionListPage
private constructor(
    private val service: FunctionService,
    private val params: FunctionListParams,
    private val response: FunctionListPageResponse,
) : Page<Function> {

    /**
     * Delegates to [FunctionListPageResponse], but gracefully handles missing data.
     *
     * @see [FunctionListPageResponse.objects]
     */
    fun objects(): List<Function> =
        response._objects().getOptional("objects").getOrNull() ?: emptyList()

    override fun items(): List<Function> = objects()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): FunctionListParams =
        if (params.endingBefore().isPresent) {
            params.toBuilder().endingBefore(items().first()._id().getOptional("id")).build()
        } else {
            params.toBuilder().startingAfter(items().last()._id().getOptional("id")).build()
        }

    override fun nextPage(): FunctionListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<Function> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): FunctionListParams = params

    /** The response that this page was parsed from. */
    fun response(): FunctionListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [FunctionListPage].
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

    /** A builder for [FunctionListPage]. */
    class Builder internal constructor() {

        private var service: FunctionService? = null
        private var params: FunctionListParams? = null
        private var response: FunctionListPageResponse? = null

        @JvmSynthetic
        internal fun from(functionListPage: FunctionListPage) = apply {
            service = functionListPage.service
            params = functionListPage.params
            response = functionListPage.response
        }

        fun service(service: FunctionService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: FunctionListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: FunctionListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [FunctionListPage].
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
        fun build(): FunctionListPage =
            FunctionListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is FunctionListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "FunctionListPage{service=$service, params=$params, response=$response}"
}
