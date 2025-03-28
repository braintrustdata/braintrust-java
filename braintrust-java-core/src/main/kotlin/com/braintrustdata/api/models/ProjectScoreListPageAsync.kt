// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.services.async.ProjectScoreServiceAsync
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate

/**
 * List out all project_scores. The project_scores are sorted by creation date, with the most
 * recently-created project_scores coming first
 */
class ProjectScoreListPageAsync
private constructor(
    private val projectScoresService: ProjectScoreServiceAsync,
    private val params: ProjectScoreListParams,
    private val response: Response,
) {

    fun response(): Response = response

    fun objects(): List<ProjectScore> = response().objects()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ProjectScoreListPageAsync && projectScoresService == other.projectScoresService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(projectScoresService, params, response) /* spotless:on */

    override fun toString() =
        "ProjectScoreListPageAsync{projectScoresService=$projectScoresService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
        return !objects().isEmpty()
    }

    fun getNextPageParams(): Optional<ProjectScoreListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return if (params.endingBefore().isPresent) {
            Optional.of(params.toBuilder().endingBefore(objects().first().id()).build())
        } else {
            Optional.of(params.toBuilder().startingAfter(objects().last().id()).build())
        }
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
            response: Response,
        ) = ProjectScoreListPageAsync(projectScoresService, params, response)
    }

    class Response(
        private val objects: JsonField<List<ProjectScore>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("objects") objects: JsonField<List<ProjectScore>> = JsonMissing.of()
        ) : this(objects, mutableMapOf())

        fun objects(): List<ProjectScore> = objects.getNullable("objects") ?: listOf()

        @JsonProperty("objects")
        fun _objects(): Optional<JsonField<List<ProjectScore>>> = Optional.ofNullable(objects)

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        private var validated: Boolean = false

        fun validate(): Response = apply {
            if (validated) {
                return@apply
            }

            objects().map { it.validate() }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Response && objects == other.objects && additionalProperties == other.additionalProperties /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(objects, additionalProperties) /* spotless:on */

        override fun toString() =
            "Response{objects=$objects, additionalProperties=$additionalProperties}"

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of
             * [ProjectScoreListPageAsync].
             */
            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var objects: JsonField<List<ProjectScore>> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(page: Response) = apply {
                this.objects = page.objects
                this.additionalProperties.putAll(page.additionalProperties)
            }

            fun objects(objects: List<ProjectScore>) = objects(JsonField.of(objects))

            fun objects(objects: JsonField<List<ProjectScore>>) = apply { this.objects = objects }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            /**
             * Returns an immutable instance of [Response].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Response = Response(objects, additionalProperties.toMutableMap())
        }
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
