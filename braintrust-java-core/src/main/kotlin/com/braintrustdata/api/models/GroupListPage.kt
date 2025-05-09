// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.AutoPager
import com.braintrustdata.api.core.Page
import com.braintrustdata.api.core.checkRequired
import com.braintrustdata.api.services.blocking.GroupService
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

/** @see [GroupService.list] */
class GroupListPage
private constructor(
    private val service: GroupService,
    private val params: GroupListParams,
    private val response: GroupListPageResponse,
) : Page<Group> {

    /**
     * Delegates to [GroupListPageResponse], but gracefully handles missing data.
     *
     * @see [GroupListPageResponse.objects]
     */
    fun objects(): List<Group> =
        response._objects().getOptional("objects").getOrNull() ?: emptyList()

    override fun items(): List<Group> = objects()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): GroupListParams =
        if (params.endingBefore().isPresent) {
            params.toBuilder().endingBefore(items().first()._id().getOptional("id")).build()
        } else {
            params.toBuilder().startingAfter(items().last()._id().getOptional("id")).build()
        }

    override fun nextPage(): GroupListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<Group> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): GroupListParams = params

    /** The response that this page was parsed from. */
    fun response(): GroupListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [GroupListPage].
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

    /** A builder for [GroupListPage]. */
    class Builder internal constructor() {

        private var service: GroupService? = null
        private var params: GroupListParams? = null
        private var response: GroupListPageResponse? = null

        @JvmSynthetic
        internal fun from(groupListPage: GroupListPage) = apply {
            service = groupListPage.service
            params = groupListPage.params
            response = groupListPage.response
        }

        fun service(service: GroupService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: GroupListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: GroupListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [GroupListPage].
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
        fun build(): GroupListPage =
            GroupListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is GroupListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() = "GroupListPage{service=$service, params=$params, response=$response}"
}
