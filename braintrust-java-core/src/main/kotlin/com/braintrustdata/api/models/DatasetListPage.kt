// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.services.blocking.DatasetService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/**
 * List out all datasets. The datasets are sorted by creation date, with the most recently-created
 * datasets coming first
 */
class DatasetListPage
private constructor(
    private val datasetsService: DatasetService,
    private val params: DatasetListParams,
    private val response: DatasetListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): DatasetListPageResponse = response

    /**
     * Delegates to [DatasetListPageResponse], but gracefully handles missing data.
     *
     * @see [DatasetListPageResponse.objects]
     */
    fun objects(): List<Dataset> =
        response._objects().getOptional("objects").getOrNull() ?: emptyList()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DatasetListPage && datasetsService == other.datasetsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(datasetsService, params, response) /* spotless:on */

    override fun toString() =
        "DatasetListPage{datasetsService=$datasetsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = objects().isNotEmpty()

    fun getNextPageParams(): Optional<DatasetListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            if (params.endingBefore().isPresent) {
                params.toBuilder().endingBefore(objects().first()._id().getOptional("id")).build()
            } else {
                params.toBuilder().startingAfter(objects().last()._id().getOptional("id")).build()
            }
        )
    }

    fun getNextPage(): Optional<DatasetListPage> {
        return getNextPageParams().map { datasetsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            datasetsService: DatasetService,
            params: DatasetListParams,
            response: DatasetListPageResponse,
        ) = DatasetListPage(datasetsService, params, response)
    }

    class AutoPager(private val firstPage: DatasetListPage) : Iterable<Dataset> {

        override fun iterator(): Iterator<Dataset> = iterator {
            var page = firstPage
            var index = 0
            while (true) {
                while (index < page.objects().size) {
                    yield(page.objects()[index++])
                }
                page = page.getNextPage().getOrNull() ?: break
                index = 0
            }
        }

        fun stream(): Stream<Dataset> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
