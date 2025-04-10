// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.services.async.ExperimentServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/**
 * List out all experiments. The experiments are sorted by creation date, with the most
 * recently-created experiments coming first
 */
class ExperimentListPageAsync
private constructor(
    private val experimentsService: ExperimentServiceAsync,
    private val params: ExperimentListParams,
    private val response: ExperimentListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): ExperimentListPageResponse = response

    /**
     * Delegates to [ExperimentListPageResponse], but gracefully handles missing data.
     *
     * @see [ExperimentListPageResponse.objects]
     */
    fun objects(): List<Experiment> =
        response._objects().getOptional("objects").getOrNull() ?: emptyList()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ExperimentListPageAsync && experimentsService == other.experimentsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(experimentsService, params, response) /* spotless:on */

    override fun toString() =
        "ExperimentListPageAsync{experimentsService=$experimentsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = objects().isNotEmpty()

    fun getNextPageParams(): Optional<ExperimentListParams> {
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

    fun getNextPage(): CompletableFuture<Optional<ExperimentListPageAsync>> {
        return getNextPageParams()
            .map { experimentsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            experimentsService: ExperimentServiceAsync,
            params: ExperimentListParams,
            response: ExperimentListPageResponse,
        ) = ExperimentListPageAsync(experimentsService, params, response)
    }

    class AutoPager(private val firstPage: ExperimentListPageAsync) {

        fun forEach(action: Predicate<Experiment>, executor: Executor): CompletableFuture<Void> {
            fun CompletableFuture<Optional<ExperimentListPageAsync>>.forEach(
                action: (Experiment) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<Experiment>> {
            val values = mutableListOf<Experiment>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
