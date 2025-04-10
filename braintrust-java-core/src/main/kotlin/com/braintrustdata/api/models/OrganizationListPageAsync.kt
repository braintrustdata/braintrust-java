// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.services.async.OrganizationServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/**
 * List out all organizations. The organizations are sorted by creation date, with the most
 * recently-created organizations coming first
 */
class OrganizationListPageAsync
private constructor(
    private val organizationsService: OrganizationServiceAsync,
    private val params: OrganizationListParams,
    private val response: OrganizationListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): OrganizationListPageResponse = response

    /**
     * Delegates to [OrganizationListPageResponse], but gracefully handles missing data.
     *
     * @see [OrganizationListPageResponse.objects]
     */
    fun objects(): List<Organization> =
        response._objects().getOptional("objects").getOrNull() ?: emptyList()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is OrganizationListPageAsync && organizationsService == other.organizationsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(organizationsService, params, response) /* spotless:on */

    override fun toString() =
        "OrganizationListPageAsync{organizationsService=$organizationsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = objects().isNotEmpty()

    fun getNextPageParams(): Optional<OrganizationListParams> {
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

    fun getNextPage(): CompletableFuture<Optional<OrganizationListPageAsync>> {
        return getNextPageParams()
            .map { organizationsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            organizationsService: OrganizationServiceAsync,
            params: OrganizationListParams,
            response: OrganizationListPageResponse,
        ) = OrganizationListPageAsync(organizationsService, params, response)
    }

    class AutoPager(private val firstPage: OrganizationListPageAsync) {

        fun forEach(action: Predicate<Organization>, executor: Executor): CompletableFuture<Void> {
            fun CompletableFuture<Optional<OrganizationListPageAsync>>.forEach(
                action: (Organization) -> Boolean,
                executor: Executor,
            ): CompletableFuture<Void> =
                thenComposeAsync(
                    { page ->
                        page
                            .filter { it.objects().all(action) }
                            .map { it.getNextPage().forEach(action, executor) }
                            .orElseGet { CompletableFuture.completedFuture(null) }
                    },
                    executor,
                )
            return CompletableFuture.completedFuture(Optional.of(firstPage))
                .forEach(action::test, executor)
        }

        fun toList(executor: Executor): CompletableFuture<List<Organization>> {
            val values = mutableListOf<Organization>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
