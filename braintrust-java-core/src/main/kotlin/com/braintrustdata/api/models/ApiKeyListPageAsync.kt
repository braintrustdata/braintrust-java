// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.services.async.ApiKeyServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/**
 * List out all api_keys. The api_keys are sorted by creation date, with the most recently-created
 * api_keys coming first
 */
class ApiKeyListPageAsync
private constructor(
    private val apiKeysService: ApiKeyServiceAsync,
    private val params: ApiKeyListParams,
    private val response: ApiKeyListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): ApiKeyListPageResponse = response

    /**
     * Delegates to [ApiKeyListPageResponse], but gracefully handles missing data.
     *
     * @see [ApiKeyListPageResponse.objects]
     */
    fun objects(): List<ApiKey> =
        response._objects().getOptional("objects").getOrNull() ?: emptyList()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ApiKeyListPageAsync && apiKeysService == other.apiKeysService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(apiKeysService, params, response) /* spotless:on */

    override fun toString() =
        "ApiKeyListPageAsync{apiKeysService=$apiKeysService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = objects().isNotEmpty()

    fun getNextPageParams(): Optional<ApiKeyListParams> {
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

    fun getNextPage(): CompletableFuture<Optional<ApiKeyListPageAsync>> {
        return getNextPageParams()
            .map { apiKeysService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            apiKeysService: ApiKeyServiceAsync,
            params: ApiKeyListParams,
            response: ApiKeyListPageResponse,
        ) = ApiKeyListPageAsync(apiKeysService, params, response)
    }

    class AutoPager(private val firstPage: ApiKeyListPageAsync) {

        fun forEach(action: Predicate<ApiKey>, executor: Executor): CompletableFuture<Void> {
            fun CompletableFuture<Optional<ApiKeyListPageAsync>>.forEach(
                action: (ApiKey) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<ApiKey>> {
            val values = mutableListOf<ApiKey>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
