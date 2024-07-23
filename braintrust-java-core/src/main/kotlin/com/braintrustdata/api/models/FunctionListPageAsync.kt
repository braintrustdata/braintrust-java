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
import com.braintrustdata.api.models.Function
import com.braintrustdata.api.services.async.FunctionServiceAsync

class FunctionListPageAsync private constructor(private val functionsService: FunctionServiceAsync, private val params: FunctionListParams, private val response: Response, ) {

    fun response(): Response = response

    fun objects(): List<Function> = response().objects()

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return other is FunctionListPageAsync &&
          this.functionsService == other.functionsService &&
          this.params == other.params &&
          this.response == other.response
    }

    override fun hashCode(): Int {
      return Objects.hash(
          functionsService,
          params,
          response,
      )
    }

    override fun toString() = "FunctionListPageAsync{functionsService=$functionsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
      return !objects().isEmpty()
    }

    fun getNextPageParams(): Optional<FunctionListParams> {
      if (!hasNextPage()) {
        return Optional.empty()
      }

      return if (params.endingBefore().isPresent) {
        Optional.of(FunctionListParams.builder().from(params).endingBefore(objects().first().id()).build());
      } else {
        Optional.of(FunctionListParams.builder().from(params).startingAfter(objects().last().id()).build());
      }
    }

    fun getNextPage(): CompletableFuture<Optional<FunctionListPageAsync>> {
      return getNextPageParams().map {
        functionsService.list(it).thenApply { Optional.of(it) }
      }.orElseGet {
          CompletableFuture.completedFuture(Optional.empty())
      }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(functionsService: FunctionServiceAsync, params: FunctionListParams, response: Response) = FunctionListPageAsync(
            functionsService,
            params,
            response,
        )
    }

    @JsonDeserialize(builder = Response.Builder::class)
    @NoAutoDetect
    class Response constructor(private val objects: JsonField<List<Function>>, private val additionalProperties: Map<String, JsonValue>, ) {

        private var validated: Boolean = false

        fun objects(): List<Function> = objects.getNullable("objects") ?: listOf()

        @JsonProperty("objects")
        fun _objects(): Optional<JsonField<List<Function>>> = Optional.ofNullable(objects)

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

        override fun toString() = "FunctionListPageAsync.Response{objects=$objects, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic
            fun builder() = Builder()
        }

        class Builder {

            private var objects: JsonField<List<Function>> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(page: Response) = apply {
                this.objects = page.objects
                this.additionalProperties.putAll(page.additionalProperties)
            }

            fun objects(objects: List<Function>) = objects(JsonField.of(objects))

            @JsonProperty("objects")
            fun objects(objects: JsonField<List<Function>>) = apply { this.objects = objects }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun build() = Response(objects, additionalProperties.toUnmodifiable())
        }
    }

    class AutoPager constructor(private val firstPage: FunctionListPageAsync, ) {

        fun forEach(action: Predicate<Function>, executor: Executor): CompletableFuture<Void> {
          fun CompletableFuture<Optional<FunctionListPageAsync>>.forEach(action: (Function) -> Boolean, executor: Executor): CompletableFuture<Void> = thenComposeAsync({ page -> 
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

        fun toList(executor: Executor): CompletableFuture<List<Function>> {
          val values = mutableListOf<Function>()
          return forEach(values::add, executor)
          .thenApply {
              values
          }
        }
    }
}
