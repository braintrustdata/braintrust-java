// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.AutoPager
import com.braintrustdata.api.core.Page
import com.braintrustdata.api.core.checkRequired
import com.braintrustdata.api.services.blocking.ProjectScoreService
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

/** @see [ProjectScoreService.list] */
class ProjectScoreListPage
private constructor(
    private val service: ProjectScoreService,
    private val params: ProjectScoreListParams,
    private val response: ProjectScoreListPageResponse,
) : Page<ProjectScore> {

    /**
     * Delegates to [ProjectScoreListPageResponse], but gracefully handles missing data.
     *
     * @see [ProjectScoreListPageResponse.objects]
     */
    fun objects(): List<ProjectScore> =
        response._objects().getOptional("objects").getOrNull() ?: emptyList()

    override fun items(): List<ProjectScore> = objects()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): ProjectScoreListParams =
        if (params.endingBefore().isPresent) {
            params.toBuilder().endingBefore(items().first()._id().getOptional("id")).build()
        } else {
            params.toBuilder().startingAfter(items().last()._id().getOptional("id")).build()
        }

    override fun nextPage(): ProjectScoreListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<ProjectScore> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ProjectScoreListParams = params

    /** The response that this page was parsed from. */
    fun response(): ProjectScoreListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ProjectScoreListPage].
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

    /** A builder for [ProjectScoreListPage]. */
    class Builder internal constructor() {

        private var service: ProjectScoreService? = null
        private var params: ProjectScoreListParams? = null
        private var response: ProjectScoreListPageResponse? = null

        @JvmSynthetic
        internal fun from(projectScoreListPage: ProjectScoreListPage) = apply {
            service = projectScoreListPage.service
            params = projectScoreListPage.params
            response = projectScoreListPage.response
        }

        fun service(service: ProjectScoreService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ProjectScoreListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ProjectScoreListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ProjectScoreListPage].
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
        fun build(): ProjectScoreListPage =
            ProjectScoreListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ProjectScoreListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "ProjectScoreListPage{service=$service, params=$params, response=$response}"
}
