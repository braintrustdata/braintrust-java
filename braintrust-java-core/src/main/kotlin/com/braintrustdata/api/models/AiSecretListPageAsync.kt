// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.services.async.AiSecretServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/**
 * List out all ai_secrets. The ai_secrets are sorted by creation date, with the most
 * recently-created ai_secrets coming first
 */
class AiSecretListPageAsync
private constructor(
    private val aiSecretsService: AiSecretServiceAsync,
    private val params: AiSecretListParams,
    private val response: AiSecretListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): AiSecretListPageResponse = response

    /**
     * Delegates to [AiSecretListPageResponse], but gracefully handles missing data.
     *
     * @see [AiSecretListPageResponse.objects]
     */
    fun objects(): List<AISecret> =
        response._objects().getOptional("objects").getOrNull() ?: emptyList()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AiSecretListPageAsync && aiSecretsService == other.aiSecretsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(aiSecretsService, params, response) /* spotless:on */

    override fun toString() =
        "AiSecretListPageAsync{aiSecretsService=$aiSecretsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = objects().isNotEmpty()

    fun getNextPageParams(): Optional<AiSecretListParams> {
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

    fun getNextPage(): CompletableFuture<Optional<AiSecretListPageAsync>> {
        return getNextPageParams()
            .map { aiSecretsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            aiSecretsService: AiSecretServiceAsync,
            params: AiSecretListParams,
            response: AiSecretListPageResponse,
        ) = AiSecretListPageAsync(aiSecretsService, params, response)
    }

    class AutoPager(private val firstPage: AiSecretListPageAsync) {

        fun forEach(action: Predicate<AISecret>, executor: Executor): CompletableFuture<Void> {
            fun CompletableFuture<Optional<AiSecretListPageAsync>>.forEach(
                action: (AISecret) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<AISecret>> {
            val values = mutableListOf<AISecret>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
