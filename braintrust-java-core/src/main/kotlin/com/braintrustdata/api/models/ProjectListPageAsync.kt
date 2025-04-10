// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.services.async.ProjectServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/**
 * List out all projects. The projects are sorted by creation date, with the most recently-created
 * projects coming first
 */
class ProjectListPageAsync
private constructor(
    private val projectsService: ProjectServiceAsync,
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

        return /* spotless:off */ other is ProjectListPageAsync && projectsService == other.projectsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(projectsService, params, response) /* spotless:on */

    override fun toString() =
        "ProjectListPageAsync{projectsService=$projectsService, params=$params, response=$response}"

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

    fun getNextPage(): CompletableFuture<Optional<ProjectListPageAsync>> {
        return getNextPageParams()
            .map { projectsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            projectsService: ProjectServiceAsync,
            params: ProjectListParams,
            response: ProjectListPageResponse,
        ) = ProjectListPageAsync(projectsService, params, response)
    }

    class AutoPager(private val firstPage: ProjectListPageAsync) {

        fun forEach(action: Predicate<Project>, executor: Executor): CompletableFuture<Void> {
            fun CompletableFuture<Optional<ProjectListPageAsync>>.forEach(
                action: (Project) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<Project>> {
            val values = mutableListOf<Project>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
