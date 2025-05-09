// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.AutoPager
import com.braintrustdata.api.core.Page
import com.braintrustdata.api.core.checkRequired
import com.braintrustdata.api.services.blocking.ViewService
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

/** @see [ViewService.list] */
class ViewListPage
private constructor(
    private val service: ViewService,
    private val params: ViewListParams,
    private val response: ViewListPageResponse,
) : Page<View> {

    /**
     * Delegates to [ViewListPageResponse], but gracefully handles missing data.
     *
     * @see [ViewListPageResponse.objects]
     */
    fun objects(): List<View> =
        response._objects().getOptional("objects").getOrNull() ?: emptyList()

    override fun items(): List<View> = objects()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): ViewListParams =
        if (params.endingBefore().isPresent) {
            params.toBuilder().endingBefore(items().first()._id().getOptional("id")).build()
        } else {
            params.toBuilder().startingAfter(items().last()._id().getOptional("id")).build()
        }

    override fun nextPage(): ViewListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<View> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ViewListParams = params

    /** The response that this page was parsed from. */
    fun response(): ViewListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ViewListPage].
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

    /** A builder for [ViewListPage]. */
    class Builder internal constructor() {

        private var service: ViewService? = null
        private var params: ViewListParams? = null
        private var response: ViewListPageResponse? = null

        @JvmSynthetic
        internal fun from(viewListPage: ViewListPage) = apply {
            service = viewListPage.service
            params = viewListPage.params
            response = viewListPage.response
        }

        fun service(service: ViewService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ViewListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ViewListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ViewListPage].
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
        fun build(): ViewListPage =
            ViewListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ViewListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() = "ViewListPage{service=$service, params=$params, response=$response}"
}
