// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.services.async.SpanIframeServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/**
 * List out all span_iframes. The span_iframes are sorted by creation date, with the most
 * recently-created span_iframes coming first
 */
class SpanIframeListPageAsync
private constructor(
    private val spanIframesService: SpanIframeServiceAsync,
    private val params: SpanIframeListParams,
    private val response: SpanIframeListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): SpanIframeListPageResponse = response

    /**
     * Delegates to [SpanIframeListPageResponse], but gracefully handles missing data.
     *
     * @see [SpanIframeListPageResponse.objects]
     */
    fun objects(): List<SpanIFrame> =
        response._objects().getOptional("objects").getOrNull() ?: emptyList()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SpanIframeListPageAsync && spanIframesService == other.spanIframesService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(spanIframesService, params, response) /* spotless:on */

    override fun toString() =
        "SpanIframeListPageAsync{spanIframesService=$spanIframesService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = objects().isNotEmpty()

    fun getNextPageParams(): Optional<SpanIframeListParams> {
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

    fun getNextPage(): CompletableFuture<Optional<SpanIframeListPageAsync>> {
        return getNextPageParams()
            .map { spanIframesService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            spanIframesService: SpanIframeServiceAsync,
            params: SpanIframeListParams,
            response: SpanIframeListPageResponse,
        ) = SpanIframeListPageAsync(spanIframesService, params, response)
    }

    class AutoPager(private val firstPage: SpanIframeListPageAsync) {

        fun forEach(action: Predicate<SpanIFrame>, executor: Executor): CompletableFuture<Void> {
            fun CompletableFuture<Optional<SpanIframeListPageAsync>>.forEach(
                action: (SpanIFrame) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<SpanIFrame>> {
            val values = mutableListOf<SpanIFrame>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
