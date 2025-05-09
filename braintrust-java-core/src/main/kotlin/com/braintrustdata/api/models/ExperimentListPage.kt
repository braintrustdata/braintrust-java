// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.AutoPager
import com.braintrustdata.api.core.Page
import com.braintrustdata.api.core.checkRequired
import com.braintrustdata.api.services.blocking.ExperimentService
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

/** @see [ExperimentService.list] */
class ExperimentListPage
private constructor(
    private val service: ExperimentService,
    private val params: ExperimentListParams,
    private val response: ExperimentListPageResponse,
) : Page<Experiment> {

    /**
     * Delegates to [ExperimentListPageResponse], but gracefully handles missing data.
     *
     * @see [ExperimentListPageResponse.objects]
     */
    fun objects(): List<Experiment> =
        response._objects().getOptional("objects").getOrNull() ?: emptyList()

    override fun items(): List<Experiment> = objects()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): ExperimentListParams =
        if (params.endingBefore().isPresent) {
            params.toBuilder().endingBefore(items().first()._id().getOptional("id")).build()
        } else {
            params.toBuilder().startingAfter(items().last()._id().getOptional("id")).build()
        }

    override fun nextPage(): ExperimentListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<Experiment> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ExperimentListParams = params

    /** The response that this page was parsed from. */
    fun response(): ExperimentListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ExperimentListPage].
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

    /** A builder for [ExperimentListPage]. */
    class Builder internal constructor() {

        private var service: ExperimentService? = null
        private var params: ExperimentListParams? = null
        private var response: ExperimentListPageResponse? = null

        @JvmSynthetic
        internal fun from(experimentListPage: ExperimentListPage) = apply {
            service = experimentListPage.service
            params = experimentListPage.params
            response = experimentListPage.response
        }

        fun service(service: ExperimentService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ExperimentListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ExperimentListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ExperimentListPage].
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
        fun build(): ExperimentListPage =
            ExperimentListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ExperimentListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "ExperimentListPage{service=$service, params=$params, response=$response}"
}
