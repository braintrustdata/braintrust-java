// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.services.blocking.PromptService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/**
 * List out all prompts. The prompts are sorted by creation date, with the most recently-created
 * prompts coming first
 */
class PromptListPage
private constructor(
    private val promptsService: PromptService,
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

        return /* spotless:off */ other is PromptListPage && promptsService == other.promptsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(promptsService, params, response) /* spotless:on */

    override fun toString() =
        "PromptListPage{promptsService=$promptsService, params=$params, response=$response}"

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

    fun getNextPage(): Optional<PromptListPage> {
        return getNextPageParams().map { promptsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            promptsService: PromptService,
            params: PromptListParams,
            response: PromptListPageResponse,
        ) = PromptListPage(promptsService, params, response)
    }

    class AutoPager(private val firstPage: PromptListPage) : Iterable<Prompt> {

        override fun iterator(): Iterator<Prompt> = iterator {
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

        fun stream(): Stream<Prompt> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
