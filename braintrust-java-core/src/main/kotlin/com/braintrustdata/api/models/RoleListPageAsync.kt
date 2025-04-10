// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.services.async.RoleServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/**
 * List out all roles. The roles are sorted by creation date, with the most recently-created roles
 * coming first
 */
class RoleListPageAsync
private constructor(
    private val rolesService: RoleServiceAsync,
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

        return /* spotless:off */ other is RoleListPageAsync && rolesService == other.rolesService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(rolesService, params, response) /* spotless:on */

    override fun toString() =
        "RoleListPageAsync{rolesService=$rolesService, params=$params, response=$response}"

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

    fun getNextPage(): CompletableFuture<Optional<RoleListPageAsync>> {
        return getNextPageParams()
            .map { rolesService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            rolesService: RoleServiceAsync,
            params: RoleListParams,
            response: RoleListPageResponse,
        ) = RoleListPageAsync(rolesService, params, response)
    }

    class AutoPager(private val firstPage: RoleListPageAsync) {

        fun forEach(action: Predicate<Role>, executor: Executor): CompletableFuture<Void> {
            fun CompletableFuture<Optional<RoleListPageAsync>>.forEach(
                action: (Role) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<Role>> {
            val values = mutableListOf<Role>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
