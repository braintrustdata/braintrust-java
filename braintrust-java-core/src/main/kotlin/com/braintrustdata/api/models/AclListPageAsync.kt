// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.services.async.AclServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/**
 * List out all acls. The acls are sorted by creation date, with the most recently-created acls
 * coming first
 */
class AclListPageAsync
private constructor(
    private val aclsService: AclServiceAsync,
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

        return /* spotless:off */ other is AclListPageAsync && aclsService == other.aclsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(aclsService, params, response) /* spotless:on */

    override fun toString() =
        "AclListPageAsync{aclsService=$aclsService, params=$params, response=$response}"

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

    fun getNextPage(): CompletableFuture<Optional<AclListPageAsync>> {
        return getNextPageParams()
            .map { aclsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(aclsService: AclServiceAsync, params: AclListParams, response: AclListPageResponse) =
            AclListPageAsync(aclsService, params, response)
    }

    class AutoPager(private val firstPage: AclListPageAsync) {

        fun forEach(action: Predicate<Acl>, executor: Executor): CompletableFuture<Void> {
            fun CompletableFuture<Optional<AclListPageAsync>>.forEach(
                action: (Acl) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<Acl>> {
            val values = mutableListOf<Acl>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
