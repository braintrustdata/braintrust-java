// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.services.blocking.GroupService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/**
 * List out all groups. The groups are sorted by creation date, with the most recently-created
 * groups coming first
 */
class GroupListPage
private constructor(
    private val groupsService: GroupService,
    private val params: GroupListParams,
    private val response: GroupListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): GroupListPageResponse = response

    /**
     * Delegates to [GroupListPageResponse], but gracefully handles missing data.
     *
     * @see [GroupListPageResponse.objects]
     */
    fun objects(): List<Group> =
        response._objects().getOptional("objects").getOrNull() ?: emptyList()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is GroupListPage && groupsService == other.groupsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(groupsService, params, response) /* spotless:on */

    override fun toString() =
        "GroupListPage{groupsService=$groupsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = objects().isNotEmpty()

    fun getNextPageParams(): Optional<GroupListParams> {
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

    fun getNextPage(): Optional<GroupListPage> {
        return getNextPageParams().map { groupsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            groupsService: GroupService,
            params: GroupListParams,
            response: GroupListPageResponse,
        ) = GroupListPage(groupsService, params, response)
    }

    class AutoPager(private val firstPage: GroupListPage) : Iterable<Group> {

        override fun iterator(): Iterator<Group> = iterator {
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

        fun stream(): Stream<Group> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
