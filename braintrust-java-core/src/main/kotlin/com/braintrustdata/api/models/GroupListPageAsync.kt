// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.services.async.GroupServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/**
 * List out all groups. The groups are sorted by creation date, with the most recently-created
 * groups coming first
 */
class GroupListPageAsync
private constructor(
    private val groupsService: GroupServiceAsync,
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

        return /* spotless:off */ other is GroupListPageAsync && groupsService == other.groupsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(groupsService, params, response) /* spotless:on */

    override fun toString() =
        "GroupListPageAsync{groupsService=$groupsService, params=$params, response=$response}"

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

    fun getNextPage(): CompletableFuture<Optional<GroupListPageAsync>> {
        return getNextPageParams()
            .map { groupsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            groupsService: GroupServiceAsync,
            params: GroupListParams,
            response: GroupListPageResponse,
        ) = GroupListPageAsync(groupsService, params, response)
    }

    class AutoPager(private val firstPage: GroupListPageAsync) {

        fun forEach(action: Predicate<Group>, executor: Executor): CompletableFuture<Void> {
            fun CompletableFuture<Optional<GroupListPageAsync>>.forEach(
                action: (Group) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<Group>> {
            val values = mutableListOf<Group>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
