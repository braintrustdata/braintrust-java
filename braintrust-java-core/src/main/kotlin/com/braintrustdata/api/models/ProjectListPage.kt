// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.immutableEmptyMap
import com.braintrustdata.api.core.toImmutable
import com.braintrustdata.api.models
import com.braintrustdata.api.services.blocking.ProjectService
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/**
 * List out all projects. The projects are sorted by creation date, with the most
 * recently-created projects coming first
 */
class ProjectListPage private constructor(
    private val projectsService: ProjectService,
    private val params: ProjectListParams,
    private val response: Response,

) {

    fun response(): Response = response

    fun objects(): List<Project> = response().objects()

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return /* spotless:off */ other is ProjectListPage && projectsService == other.projectsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(projectsService, params, response) /* spotless:on */

    override fun toString() = "ProjectListPage{projectsService=$projectsService, params=$params, response=$response}"

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

    fun getNextPage(): Optional<ProjectListPage> {
      return getNextPageParams().map { projectsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(projectsService: ProjectService, params: ProjectListParams, response: Response) =
            ProjectListPage(
              projectsService,
              params,
              response,
            )
    }

    @NoAutoDetect
    class Response @JsonCreator constructor(
        @JsonProperty("objects") private val objects: JsonField<List<Project>> = JsonMissing.of(),
        @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),

    ) {

        fun objects(): List<Project> = objects.getNullable("objects") ?: listOf()

        @JsonProperty("objects")
        fun _objects(): Optional<JsonField<List<Project>>> = Optional.ofNullable(objects)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Response =
            apply {
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

        override fun toString() = "Response{objects=$objects, additionalProperties=$additionalProperties}"

        companion object {

            /** Returns a mutable builder for constructing an instance of [ProjectListPage]. */
            @JvmStatic
            fun builder() = Builder()
        }

        class Builder {

            private var objects: JsonField<List<Project>> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(page: Response) =
                apply {
                    this.objects = page.objects
                    this.additionalProperties.putAll(page.additionalProperties)
                }

            fun objects(objects: List<Project>) = objects(JsonField.of(objects))

            fun objects(objects: JsonField<List<Project>>) = apply { this.objects = objects }

            fun putAdditionalProperty(key: String, value: JsonValue) =
                apply {
                    this.additionalProperties.put(key, value)
                }

            fun build() =
                Response(
                  objects, additionalProperties.toImmutable()
                )
        }
    }

    class AutoPager(
        private val firstPage: ProjectListPage,

    ) : Iterable<Project> {

        override fun iterator(): Iterator<Project> =
            iterator {
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
