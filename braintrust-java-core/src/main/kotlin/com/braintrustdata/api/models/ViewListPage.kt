// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.services.blocking.ViewService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/**
 * List out all views. The views are sorted by creation date, with the most recently-created views
 * coming first
 */
class ViewListPage
private constructor(
    private val viewsService: ViewService,
    private val params: ViewListParams,
    private val response: ViewListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): ViewListPageResponse = response

    /**
     * Delegates to [ViewListPageResponse], but gracefully handles missing data.
     *
     * @see [ViewListPageResponse.objects]
     */
    fun objects(): List<View> =
        response._objects().getOptional("objects").getOrNull() ?: emptyList()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ViewListPage && viewsService == other.viewsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(viewsService, params, response) /* spotless:on */

    override fun toString() =
        "ViewListPage{viewsService=$viewsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = objects().isNotEmpty()

    fun getNextPageParams(): Optional<ViewListParams> {
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

    fun getNextPage(): Optional<ViewListPage> {
        return getNextPageParams().map { viewsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(viewsService: ViewService, params: ViewListParams, response: ViewListPageResponse) =
            ViewListPage(viewsService, params, response)
    }

    class AutoPager(private val firstPage: ViewListPage) : Iterable<View> {

        override fun iterator(): Iterator<View> = iterator {
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

        fun stream(): Stream<View> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
