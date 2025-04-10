// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.services.async.ProjectScoreServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/**
 * List out all project_scores. The project_scores are sorted by creation date, with the most
 * recently-created project_scores coming first
 */
class ProjectScoreListPageAsync
private constructor(
    private val projectScoresService: ProjectScoreServiceAsync,
    private val params: ProjectScoreListParams,
    private val response: ProjectScoreListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): ProjectScoreListPageResponse = response

    /**
     * Delegates to [ProjectScoreListPageResponse], but gracefully handles missing data.
     *
     * @see [ProjectScoreListPageResponse.objects]
     */
    fun objects(): List<ProjectScore> =
        response._objects().getOptional("objects").getOrNull() ?: emptyList()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ProjectScoreListPageAsync && projectScoresService == other.projectScoresService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(projectScoresService, params, response) /* spotless:on */

    override fun toString() =
        "ProjectScoreListPageAsync{projectScoresService=$projectScoresService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = objects().isNotEmpty()

    fun getNextPageParams(): Optional<ProjectScoreListParams> {
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

    fun getNextPage(): CompletableFuture<Optional<ProjectScoreListPageAsync>> {
        return getNextPageParams()
            .map { projectScoresService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            projectScoresService: ProjectScoreServiceAsync,
            params: ProjectScoreListParams,
            response: ProjectScoreListPageResponse,
        ) = ProjectScoreListPageAsync(projectScoresService, params, response)
    }

    class AutoPager(private val firstPage: ProjectScoreListPageAsync) {

        fun forEach(action: Predicate<ProjectScore>, executor: Executor): CompletableFuture<Void> {
            fun CompletableFuture<Optional<ProjectScoreListPageAsync>>.forEach(
                action: (ProjectScore) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<ProjectScore>> {
            val values = mutableListOf<ProjectScore>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
