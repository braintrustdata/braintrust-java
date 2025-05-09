// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.AutoPager
import com.braintrustdata.api.core.Page
import com.braintrustdata.api.core.checkRequired
import com.braintrustdata.api.services.blocking.DatasetService
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

/** @see [DatasetService.list] */
class DatasetListPage
private constructor(
    private val service: DatasetService,
    private val params: DatasetListParams,
    private val response: DatasetListPageResponse,
) : Page<Dataset> {

    /**
     * Delegates to [DatasetListPageResponse], but gracefully handles missing data.
     *
     * @see [DatasetListPageResponse.objects]
     */
    fun objects(): List<Dataset> =
        response._objects().getOptional("objects").getOrNull() ?: emptyList()

    override fun items(): List<Dataset> = objects()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): DatasetListParams =
        if (params.endingBefore().isPresent) {
            params.toBuilder().endingBefore(items().first()._id().getOptional("id")).build()
        } else {
            params.toBuilder().startingAfter(items().last()._id().getOptional("id")).build()
        }

    override fun nextPage(): DatasetListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<Dataset> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): DatasetListParams = params

    /** The response that this page was parsed from. */
    fun response(): DatasetListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DatasetListPage].
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

    /** A builder for [DatasetListPage]. */
    class Builder internal constructor() {

        private var service: DatasetService? = null
        private var params: DatasetListParams? = null
        private var response: DatasetListPageResponse? = null

        @JvmSynthetic
        internal fun from(datasetListPage: DatasetListPage) = apply {
            service = datasetListPage.service
            params = datasetListPage.params
            response = datasetListPage.response
        }

        fun service(service: DatasetService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: DatasetListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: DatasetListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [DatasetListPage].
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
        fun build(): DatasetListPage =
            DatasetListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DatasetListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "DatasetListPage{service=$service, params=$params, response=$response}"
}
