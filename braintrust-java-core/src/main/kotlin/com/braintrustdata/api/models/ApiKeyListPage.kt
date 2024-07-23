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
import com.braintrustdata.api.models.ApiKey
import com.braintrustdata.api.services.blocking.ApiKeyService

class ApiKeyListPage private constructor(private val apiKeyService: ApiKeyService, private val params: ApiKeyListParams, private val response: Response, ) {

    fun response(): Response = response

    fun objects(): List<ApiKey> = response().objects()

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return other is ApiKeyListPage &&
          this.apiKeyService == other.apiKeyService &&
          this.params == other.params &&
          this.response == other.response
    }

    override fun hashCode(): Int {
      return Objects.hash(
          apiKeyService,
          params,
          response,
      )
    }

    override fun toString() = "ApiKeyListPage{apiKeyService=$apiKeyService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
      return !objects().isEmpty()
    }

    fun getNextPageParams(): Optional<ApiKeyListParams> {
      if (!hasNextPage()) {
        return Optional.empty()
      }

      return if (params.endingBefore().isPresent) {
        Optional.of(ApiKeyListParams.builder().from(params).endingBefore(objects().first().id()).build());
      } else {
        Optional.of(ApiKeyListParams.builder().from(params).startingAfter(objects().last().id()).build());
      }
    }

    fun getNextPage(): Optional<ApiKeyListPage> {
      return getNextPageParams().map { apiKeyService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(apiKeyService: ApiKeyService, params: ApiKeyListParams, response: Response) = ApiKeyListPage(
            apiKeyService,
            params,
            response,
        )
    }

    @JsonDeserialize(builder = Response.Builder::class)
    @NoAutoDetect
    class Response constructor(private val objects: JsonField<List<ApiKey>>, private val additionalProperties: Map<String, JsonValue>, ) {

        private var validated: Boolean = false

        fun objects(): List<ApiKey> = objects.getNullable("objects") ?: listOf()

        @JsonProperty("objects")
        fun _objects(): Optional<JsonField<List<ApiKey>>> = Optional.ofNullable(objects)

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

        override fun toString() = "ApiKeyListPage.Response{objects=$objects, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic
            fun builder() = Builder()
        }

        class Builder {

            private var objects: JsonField<List<ApiKey>> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(page: Response) = apply {
                this.objects = page.objects
                this.additionalProperties.putAll(page.additionalProperties)
            }

            fun objects(objects: List<ApiKey>) = objects(JsonField.of(objects))

            @JsonProperty("objects")
            fun objects(objects: JsonField<List<ApiKey>>) = apply { this.objects = objects }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun build() = Response(objects, additionalProperties.toUnmodifiable())
        }
    }

    class AutoPager constructor(private val firstPage: ApiKeyListPage, ) : Iterable<ApiKey> {

        override fun iterator(): Iterator<ApiKey> = iterator {
            var page = firstPage
            var index = 0
            while (true) {
              while (index < page.objects().size) {
                yield(page.objects()[index++])
              }
              page = page.getNextPage().orElse(null) ?: break
              index = 0
            }
        }

        fun stream(): Stream<ApiKey> {
          return StreamSupport.stream(spliterator(), false)
        }
    }
}
