// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.services.blocking.ProjectScoreService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/**
 * List out all project_scores. The project_scores are sorted by creation date, with the most
 * recently-created project_scores coming first
 */
class ProjectScoreListPage
private constructor(
    private val projectScoresService: ProjectScoreService,
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

        return /* spotless:off */ other is ProjectScoreListPage && projectScoresService == other.projectScoresService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(projectScoresService, params, response) /* spotless:on */

    override fun toString() =
        "ProjectScoreListPage{projectScoresService=$projectScoresService, params=$params, response=$response}"

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

    fun getNextPage(): Optional<ProjectScoreListPage> {
        return getNextPageParams().map { projectScoresService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            projectScoresService: ProjectScoreService,
            params: ProjectScoreListParams,
            response: ProjectScoreListPageResponse,
        ) = ProjectScoreListPage(projectScoresService, params, response)
    }

    class AutoPager(private val firstPage: ProjectScoreListPage) : Iterable<ProjectScore> {

        override fun iterator(): Iterator<ProjectScore> = iterator {
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

        fun stream(): Stream<ProjectScore> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
