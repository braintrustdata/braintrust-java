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
import com.braintrustdata.api.services.async.ApiKeyServiceAsync
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/**
 * List out all api_keys. The api_keys are sorted by creation date, with the most
 * recently-created api_keys coming first
 */
class ApiKeyListPageAsync private constructor(
    private val apiKeysService: ApiKeyServiceAsync,
    private val params: ApiKeyListParams,
    private val response: Response,

) {

    fun response(): Response = response

    fun objects(): List<ApiKey> = response().objects()

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return /* spotless:off */ other is ApiKeyListPageAsync && apiKeysService == other.apiKeysService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(apiKeysService, params, response) /* spotless:on */

    override fun toString() = "ApiKeyListPageAsync{apiKeysService=$apiKeysService, params=$params, response=$response}"

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

    fun getNextPage(): CompletableFuture<Optional<ApiKeyListPageAsync>> {
      return getNextPageParams().map {
        apiKeysService.list(it).thenApply { Optional.of(it) }
      }.orElseGet {
          CompletableFuture.completedFuture(Optional.empty())
      }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(apiKeysService: ApiKeyServiceAsync, params: ApiKeyListParams, response: Response) =
            ApiKeyListPageAsync(
              apiKeysService,
              params,
              response,
            )
    }

    @NoAutoDetect
    class Response @JsonCreator constructor(
        @JsonProperty("objects") private val objects: JsonField<List<ApiKey>> = JsonMissing.of(),
        @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),

    ) {

        fun objects(): List<ApiKey> = objects.getNullable("objects") ?: listOf()

        @JsonProperty("objects")
        fun _objects(): Optional<JsonField<List<ApiKey>>> = Optional.ofNullable(objects)

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

            /** Returns a mutable builder for constructing an instance of [ApiKeyListPageAsync]. */
            @JvmStatic
            fun builder() = Builder()
        }

        class Builder {

            private var objects: JsonField<List<ApiKey>> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(page: Response) =
                apply {
                    this.objects = page.objects
                    this.additionalProperties.putAll(page.additionalProperties)
                }

            fun objects(objects: List<ApiKey>) = objects(JsonField.of(objects))

            fun objects(objects: JsonField<List<ApiKey>>) = apply { this.objects = objects }

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
        private val firstPage: ApiKeyListPageAsync,

    ) {

        fun forEach(action: Predicate<ApiKey>, executor: Executor): CompletableFuture<Void> {
          fun CompletableFuture<Optional<ApiKeyListPageAsync>>.forEach(action: (ApiKey) -> Boolean, executor: Executor): CompletableFuture<Void> =
              thenComposeAsync(
                { page ->
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
                }, executor
              )
          return CompletableFuture.completedFuture(Optional.of(firstPage))
          .forEach(
            action::test, executor
          )
        }

        fun toList(executor: Executor): CompletableFuture<List<ApiKey>> {
          val values = mutableListOf<ApiKey>()
          return forEach(
            values::add, executor
          )
          .thenApply {
              values
          }
        }
    }
}
