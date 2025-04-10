// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.services.async.PromptServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/**
 * List out all prompts. The prompts are sorted by creation date, with the most recently-created
 * prompts coming first
 */
class PromptListPageAsync
private constructor(
    private val promptsService: PromptServiceAsync,
    private val params: PromptListParams,
    private val response: PromptListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): PromptListPageResponse = response

    /**
     * Delegates to [PromptListPageResponse], but gracefully handles missing data.
     *
     * @see [PromptListPageResponse.objects]
     */
    fun objects(): List<Prompt> =
        response._objects().getOptional("objects").getOrNull() ?: emptyList()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PromptListPageAsync && promptsService == other.promptsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(promptsService, params, response) /* spotless:on */

    override fun toString() =
        "PromptListPageAsync{promptsService=$promptsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = objects().isNotEmpty()

    fun getNextPageParams(): Optional<PromptListParams> {
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

    fun getNextPage(): CompletableFuture<Optional<PromptListPageAsync>> {
        return getNextPageParams()
            .map { promptsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            promptsService: PromptServiceAsync,
            params: PromptListParams,
            response: PromptListPageResponse,
        ) = PromptListPageAsync(promptsService, params, response)
    }

    class AutoPager(private val firstPage: PromptListPageAsync) {

        fun forEach(action: Predicate<Prompt>, executor: Executor): CompletableFuture<Void> {
            fun CompletableFuture<Optional<PromptListPageAsync>>.forEach(
                action: (Prompt) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<Prompt>> {
            val values = mutableListOf<Prompt>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
