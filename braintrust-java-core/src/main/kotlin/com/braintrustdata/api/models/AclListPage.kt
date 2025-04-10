// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.services.blocking.AclService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/**
 * List out all acls. The acls are sorted by creation date, with the most recently-created acls
 * coming first
 */
class AclListPage
private constructor(
    private val aclsService: AclService,
    private val params: AclListParams,
    private val response: AclListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): AclListPageResponse = response

    /**
     * Delegates to [AclListPageResponse], but gracefully handles missing data.
     *
     * @see [AclListPageResponse.objects]
     */
    fun objects(): List<Acl> = response._objects().getOptional("objects").getOrNull() ?: emptyList()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AclListPage && aclsService == other.aclsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(aclsService, params, response) /* spotless:on */

    override fun toString() =
        "AclListPage{aclsService=$aclsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = objects().isNotEmpty()

    fun getNextPageParams(): Optional<AclListParams> {
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

    fun getNextPage(): Optional<AclListPage> {
        return getNextPageParams().map { aclsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(aclsService: AclService, params: AclListParams, response: AclListPageResponse) =
            AclListPage(aclsService, params, response)
    }

    class AutoPager(private val firstPage: AclListPage) : Iterable<Acl> {

        override fun iterator(): Iterator<Acl> = iterator {
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

        fun stream(): Stream<Acl> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
