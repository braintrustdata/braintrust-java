// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.toImmutable
import com.braintrustdata.api.services.blocking.PromptService
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport

class PromptListPage
private constructor(
    private val promptsService: PromptService,
    private val params: PromptListParams,
    private val response: Response,
) {

    fun response(): Response = response

    fun objects(): List<Prompt> = response().objects()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PromptListPage && promptsService == other.promptsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(promptsService, params, response) /* spotless:on */

    override fun toString() =
        "PromptListPage{promptsService=$promptsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
        return !objects().isEmpty()
    }

    fun getNextPageParams(): Optional<PromptListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return if (params.endingBefore().isPresent) {
            Optional.of(
                PromptListParams.builder().from(params).endingBefore(objects().first().id()).build()
            )
        } else {
            Optional.of(
                PromptListParams.builder().from(params).startingAfter(objects().last().id()).build()
            )
        }
    }

    fun getNextPage(): Optional<PromptListPage> {
        return getNextPageParams().map { promptsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(promptsService: PromptService, params: PromptListParams, response: Response) =
            PromptListPage(
                promptsService,
                params,
                response,
            )
    }

    @JsonDeserialize(builder = Response.Builder::class)
    @NoAutoDetect
    class Response
    constructor(
        private val objects: JsonField<List<Prompt>>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

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

            return /* spotless:off */ other is Response && objects == other.objects && additionalProperties == other.additionalProperties /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(objects, additionalProperties) /* spotless:on */

        override fun toString() =
            "Response{objects=$objects, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
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

            fun build() = Response(objects, additionalProperties.toImmutable())
        }
    }

    class AutoPager
    constructor(
        private val firstPage: PromptListPage,
    ) : Iterable<Prompt> {

        override fun iterator(): Iterator<Prompt> = iterator {
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

        fun stream(): Stream<Prompt> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
