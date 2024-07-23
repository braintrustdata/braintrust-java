// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import java.util.Spliterator
import java.util.Spliterators
import java.util.UUID
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector
import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.toUnmodifiable
import com.braintrustdata.api.models.Project
import com.braintrustdata.api.services.async.ProjectServiceAsync

class ProjectListPageAsync private constructor(private val projectsService: ProjectServiceAsync, private val params: ProjectListParams, private val response: Response, ) {

    fun response(): Response = response

    fun objects(): List<Project> = response().objects()

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return other is ProjectListPageAsync &&
          this.projectsService == other.projectsService &&
          this.params == other.params &&
          this.response == other.response
    }

    override fun hashCode(): Int {
      return Objects.hash(
          projectsService,
          params,
          response,
      )
    }

    override fun toString() = "ProjectListPageAsync{projectsService=$projectsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
      return !objects().isEmpty()
    }

    fun getNextPageParams(): Optional<ProjectListParams> {
      if (!hasNextPage()) {
        return Optional.empty()
      }

      return if (params.endingBefore().isPresent) {
        Optional.of(ProjectListParams.builder().from(params).endingBefore(objects().first().id()).build());
      } else {
        Optional.of(ProjectListParams.builder().from(params).startingAfter(objects().last().id()).build());
      }
    }

    fun getNextPage(): CompletableFuture<Optional<ProjectListPageAsync>> {
      return getNextPageParams().map {
        projectsService.list(it).thenApply { Optional.of(it) }
      }.orElseGet {
          CompletableFuture.completedFuture(Optional.empty())
      }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(projectsService: ProjectServiceAsync, params: ProjectListParams, response: Response) = ProjectListPageAsync(
            projectsService,
            params,
            response,
        )
    }

    @JsonDeserialize(builder = Response.Builder::class)
    @NoAutoDetect
    class Response constructor(private val objects: JsonField<List<Project>>, private val additionalProperties: Map<String, JsonValue>, ) {

        private var validated: Boolean = false

        fun objects(): List<Project> = objects.getNullable("objects") ?: listOf()

        @JsonProperty("objects")
        fun _objects(): Optional<JsonField<List<Project>>> = Optional.ofNullable(objects)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Response = apply {
            if (!validated) {
              objects().map { it.validate() }
              validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is Response &&
              this.objects == other.objects &&
              this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
          return Objects.hash(objects, additionalProperties)
        }

        override fun toString() = "ProjectListPageAsync.Response{objects=$objects, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic
            fun builder() = Builder()
        }

        class Builder {

            private var objects: JsonField<List<Project>> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(page: Response) = apply {
                this.objects = page.objects
                this.additionalProperties.putAll(page.additionalProperties)
            }

            fun objects(objects: List<Project>) = objects(JsonField.of(objects))

            @JsonProperty("objects")
            fun objects(objects: JsonField<List<Project>>) = apply { this.objects = objects }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun build() = Response(objects, additionalProperties.toUnmodifiable())
        }
    }

    class AutoPager constructor(private val firstPage: ProjectListPageAsync, ) {

        fun forEach(action: Predicate<Project>, executor: Executor): CompletableFuture<Void> {
          fun CompletableFuture<Optional<ProjectListPageAsync>>.forEach(action: (Project) -> Boolean, executor: Executor): CompletableFuture<Void> = thenComposeAsync({ page -> 
              page
              .filter {
                  it.objects().all(action)
              }
              .map {
                  it.getNextPage().forEach(action, executor)
              }
              .orElseGet {
                  CompletableFuture.completedFuture(null)
              }
          }, executor)
          return CompletableFuture.completedFuture(Optional.of(firstPage))
          .forEach(action::test, executor)
        }

        fun toList(executor: Executor): CompletableFuture<List<Project>> {
          val values = mutableListOf<Project>()
          return forEach(values::add, executor)
          .thenApply {
              values
          }
        }
    }
}
