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
import com.braintrustdata.api.models.Prompt
import com.braintrustdata.api.services.async.PromptServiceAsync

class PromptListPageAsync private constructor(private val promptsService: PromptServiceAsync, private val params: PromptListParams, private val response: Response, ) {

    fun response(): Response = response

    fun objects(): List<Prompt> = response().objects()

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return other is PromptListPageAsync &&
          this.promptsService == other.promptsService &&
          this.params == other.params &&
          this.response == other.response
    }

    override fun hashCode(): Int {
      return Objects.hash(
          promptsService,
          params,
          response,
      )
    }

    override fun toString() = "PromptListPageAsync{promptsService=$promptsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
      return !objects().isEmpty()
    }

    fun getNextPageParams(): Optional<PromptListParams> {
      if (!hasNextPage()) {
        return Optional.empty()
      }

      return if (params.endingBefore().isPresent) {
        Optional.of(PromptListParams.builder().from(params).endingBefore(objects().first().id()).build());
      } else {
        Optional.of(PromptListParams.builder().from(params).startingAfter(objects().last().id()).build());
      }
    }

    fun getNextPage(): CompletableFuture<Optional<PromptListPageAsync>> {
      return getNextPageParams().map {
        promptsService.list(it).thenApply { Optional.of(it) }
      }.orElseGet {
          CompletableFuture.completedFuture(Optional.empty())
      }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(promptsService: PromptServiceAsync, params: PromptListParams, response: Response) = PromptListPageAsync(
            promptsService,
            params,
            response,
        )
    }

    @JsonDeserialize(builder = Response.Builder::class)
    @NoAutoDetect
    class Response constructor(private val objects: JsonField<List<Prompt>>, private val additionalProperties: Map<String, JsonValue>, ) {

        private var validated: Boolean = false

        fun objects(): List<Prompt> = objects.getNullable("objects") ?: listOf()

        @JsonProperty("objects")
        fun _objects(): Optional<JsonField<List<Prompt>>> = Optional.ofNullable(objects)

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

        override fun toString() = "PromptListPageAsync.Response{objects=$objects, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic
            fun builder() = Builder()
        }

        class Builder {

            private var objects: JsonField<List<Prompt>> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(page: Response) = apply {
                this.objects = page.objects
                this.additionalProperties.putAll(page.additionalProperties)
            }

            fun objects(objects: List<Prompt>) = objects(JsonField.of(objects))

            @JsonProperty("objects")
            fun objects(objects: JsonField<List<Prompt>>) = apply { this.objects = objects }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun build() = Response(objects, additionalProperties.toUnmodifiable())
        }
    }

    class AutoPager constructor(private val firstPage: PromptListPageAsync, ) {

        fun forEach(action: Predicate<Prompt>, executor: Executor): CompletableFuture<Void> {
          fun CompletableFuture<Optional<PromptListPageAsync>>.forEach(action: (Prompt) -> Boolean, executor: Executor): CompletableFuture<Void> = thenComposeAsync({ page -> 
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

        fun toList(executor: Executor): CompletableFuture<List<Prompt>> {
          val values = mutableListOf<Prompt>()
          return forEach(values::add, executor)
          .thenApply {
              values
          }
        }
    }
}
