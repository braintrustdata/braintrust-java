// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.services.blocking.ProjectService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/**
 * List out all projects. The projects are sorted by creation date, with the most recently-created
 * projects coming first
 */
class ProjectListPage
private constructor(
    private val projectsService: ProjectService,
    private val params: ProjectListParams,
    private val response: ProjectListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): ProjectListPageResponse = response

    /**
     * Delegates to [ProjectListPageResponse], but gracefully handles missing data.
     *
     * @see [ProjectListPageResponse.objects]
     */
    fun objects(): List<Project> =
        response._objects().getOptional("objects").getOrNull() ?: emptyList()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ProjectListPage && projectsService == other.projectsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(projectsService, params, response) /* spotless:on */

    override fun toString() =
        "ProjectListPage{projectsService=$projectsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = objects().isNotEmpty()

    fun getNextPageParams(): Optional<ProjectListParams> {
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

    fun getNextPage(): Optional<ProjectListPage> {
        return getNextPageParams().map { projectsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            projectsService: ProjectService,
            params: ProjectListParams,
            response: ProjectListPageResponse,
        ) = ProjectListPage(projectsService, params, response)
    }

    class AutoPager(private val firstPage: ProjectListPage) : Iterable<Project> {

        override fun iterator(): Iterator<Project> = iterator {
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

        fun stream(): Stream<Project> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
