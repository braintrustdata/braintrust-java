// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.services.blocking.ExperimentService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/**
 * List out all experiments. The experiments are sorted by creation date, with the most
 * recently-created experiments coming first
 */
class ExperimentListPage
private constructor(
    private val experimentsService: ExperimentService,
    private val params: ExperimentListParams,
    private val response: ExperimentListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): ExperimentListPageResponse = response

    /**
     * Delegates to [ExperimentListPageResponse], but gracefully handles missing data.
     *
     * @see [ExperimentListPageResponse.objects]
     */
    fun objects(): List<Experiment> =
        response._objects().getOptional("objects").getOrNull() ?: emptyList()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ExperimentListPage && experimentsService == other.experimentsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(experimentsService, params, response) /* spotless:on */

    override fun toString() =
        "ExperimentListPage{experimentsService=$experimentsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = objects().isNotEmpty()

    fun getNextPageParams(): Optional<ExperimentListParams> {
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

    fun getNextPage(): Optional<ExperimentListPage> {
        return getNextPageParams().map { experimentsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            experimentsService: ExperimentService,
            params: ExperimentListParams,
            response: ExperimentListPageResponse,
        ) = ExperimentListPage(experimentsService, params, response)
    }

    class AutoPager(private val firstPage: ExperimentListPage) : Iterable<Experiment> {

        override fun iterator(): Iterator<Experiment> = iterator {
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

        fun stream(): Stream<Experiment> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
