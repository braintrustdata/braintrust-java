// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.services.blocking.RoleService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/**
 * List out all roles. The roles are sorted by creation date, with the most recently-created roles
 * coming first
 */
class RoleListPage
private constructor(
    private val rolesService: RoleService,
    private val params: RoleListParams,
    private val response: RoleListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): RoleListPageResponse = response

    /**
     * Delegates to [RoleListPageResponse], but gracefully handles missing data.
     *
     * @see [RoleListPageResponse.objects]
     */
    fun objects(): List<Role> =
        response._objects().getOptional("objects").getOrNull() ?: emptyList()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is RoleListPage && rolesService == other.rolesService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(rolesService, params, response) /* spotless:on */

    override fun toString() =
        "RoleListPage{rolesService=$rolesService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = objects().isNotEmpty()

    fun getNextPageParams(): Optional<RoleListParams> {
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

    fun getNextPage(): Optional<RoleListPage> {
        return getNextPageParams().map { rolesService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(rolesService: RoleService, params: RoleListParams, response: RoleListPageResponse) =
            RoleListPage(rolesService, params, response)
    }

    class AutoPager(private val firstPage: RoleListPage) : Iterable<Role> {

        override fun iterator(): Iterator<Role> = iterator {
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

        fun stream(): Stream<Role> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
