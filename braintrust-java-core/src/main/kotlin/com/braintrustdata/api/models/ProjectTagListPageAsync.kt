// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.services.async.ProjectTagServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/**
 * List out all project_tags. The project_tags are sorted by creation date, with the most
 * recently-created project_tags coming first
 */
class ProjectTagListPageAsync
private constructor(
    private val projectTagsService: ProjectTagServiceAsync,
    private val params: ProjectTagListParams,
    private val response: ProjectTagListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): ProjectTagListPageResponse = response

    /**
     * Delegates to [ProjectTagListPageResponse], but gracefully handles missing data.
     *
     * @see [ProjectTagListPageResponse.objects]
     */
    fun objects(): List<ProjectTag> =
        response._objects().getOptional("objects").getOrNull() ?: emptyList()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ProjectTagListPageAsync && projectTagsService == other.projectTagsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(projectTagsService, params, response) /* spotless:on */

    override fun toString() =
        "ProjectTagListPageAsync{projectTagsService=$projectTagsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = objects().isNotEmpty()

    fun getNextPageParams(): Optional<ProjectTagListParams> {
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

    fun getNextPage(): CompletableFuture<Optional<ProjectTagListPageAsync>> {
        return getNextPageParams()
            .map { projectTagsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            projectTagsService: ProjectTagServiceAsync,
            params: ProjectTagListParams,
            response: ProjectTagListPageResponse,
        ) = ProjectTagListPageAsync(projectTagsService, params, response)
    }

    class AutoPager(private val firstPage: ProjectTagListPageAsync) {

        fun forEach(action: Predicate<ProjectTag>, executor: Executor): CompletableFuture<Void> {
            fun CompletableFuture<Optional<ProjectTagListPageAsync>>.forEach(
                action: (ProjectTag) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<ProjectTag>> {
            val values = mutableListOf<ProjectTag>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
