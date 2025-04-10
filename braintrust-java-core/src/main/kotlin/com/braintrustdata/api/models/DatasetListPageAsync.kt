// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.services.async.DatasetServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/**
 * List out all datasets. The datasets are sorted by creation date, with the most recently-created
 * datasets coming first
 */
class DatasetListPageAsync
private constructor(
    private val datasetsService: DatasetServiceAsync,
    private val params: DatasetListParams,
    private val response: DatasetListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): DatasetListPageResponse = response

    /**
     * Delegates to [DatasetListPageResponse], but gracefully handles missing data.
     *
     * @see [DatasetListPageResponse.objects]
     */
    fun objects(): List<Dataset> =
        response._objects().getOptional("objects").getOrNull() ?: emptyList()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DatasetListPageAsync && datasetsService == other.datasetsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(datasetsService, params, response) /* spotless:on */

    override fun toString() =
        "DatasetListPageAsync{datasetsService=$datasetsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = objects().isNotEmpty()

    fun getNextPageParams(): Optional<DatasetListParams> {
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

    fun getNextPage(): CompletableFuture<Optional<DatasetListPageAsync>> {
        return getNextPageParams()
            .map { datasetsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            datasetsService: DatasetServiceAsync,
            params: DatasetListParams,
            response: DatasetListPageResponse,
        ) = DatasetListPageAsync(datasetsService, params, response)
    }

    class AutoPager(private val firstPage: DatasetListPageAsync) {

        fun forEach(action: Predicate<Dataset>, executor: Executor): CompletableFuture<Void> {
            fun CompletableFuture<Optional<DatasetListPageAsync>>.forEach(
                action: (Dataset) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<Dataset>> {
            val values = mutableListOf<Dataset>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
