// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.AutoPager
import com.braintrustdata.api.core.Page
import com.braintrustdata.api.core.checkRequired
import com.braintrustdata.api.services.blocking.AclService
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

/** @see [AclService.list] */
class AclListPage
private constructor(
    private val service: AclService,
    private val params: AclListParams,
    private val response: AclListPageResponse,
) : Page<Acl> {

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

    override fun nextPage(): AclListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<Acl> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): AclListParams = params

    /** The response that this page was parsed from. */
    fun response(): AclListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AclListPage].
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

    /** A builder for [AclListPage]. */
    class Builder internal constructor() {

        private var service: AclService? = null
        private var params: AclListParams? = null
        private var response: AclListPageResponse? = null

        @JvmSynthetic
        internal fun from(aclListPage: AclListPage) = apply {
            service = aclListPage.service
            params = aclListPage.params
            response = aclListPage.response
        }

        fun service(service: AclService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: AclListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AclListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [AclListPage].
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
        fun build(): AclListPage =
            AclListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AclListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() = "AclListPage{service=$service, params=$params, response=$response}"
}
