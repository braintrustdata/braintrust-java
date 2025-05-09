// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.AutoPager
import com.braintrustdata.api.core.Page
import com.braintrustdata.api.core.checkRequired
import com.braintrustdata.api.services.blocking.ProjectTagService
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

/** @see [ProjectTagService.list] */
class ProjectTagListPage
private constructor(
    private val service: ProjectTagService,
    private val params: ProjectTagListParams,
    private val response: ProjectTagListPageResponse,
) : Page<ProjectTag> {

    /**
     * Delegates to [ProjectTagListPageResponse], but gracefully handles missing data.
     *
     * @see [ProjectTagListPageResponse.objects]
     */
    fun objects(): List<ProjectTag> =
        response._objects().getOptional("objects").getOrNull() ?: emptyList()

    override fun items(): List<ProjectTag> = objects()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): ProjectTagListParams =
        if (params.endingBefore().isPresent) {
            params.toBuilder().endingBefore(items().first()._id().getOptional("id")).build()
        } else {
            params.toBuilder().startingAfter(items().last()._id().getOptional("id")).build()
        }

    override fun nextPage(): ProjectTagListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<ProjectTag> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ProjectTagListParams = params

    /** The response that this page was parsed from. */
    fun response(): ProjectTagListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ProjectTagListPage].
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

    /** A builder for [ProjectTagListPage]. */
    class Builder internal constructor() {

        private var service: ProjectTagService? = null
        private var params: ProjectTagListParams? = null
        private var response: ProjectTagListPageResponse? = null

        @JvmSynthetic
        internal fun from(projectTagListPage: ProjectTagListPage) = apply {
            service = projectTagListPage.service
            params = projectTagListPage.params
            response = projectTagListPage.response
        }

        fun service(service: ProjectTagService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ProjectTagListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ProjectTagListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ProjectTagListPage].
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
        fun build(): ProjectTagListPage =
            ProjectTagListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ProjectTagListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "ProjectTagListPage{service=$service, params=$params, response=$response}"
}
