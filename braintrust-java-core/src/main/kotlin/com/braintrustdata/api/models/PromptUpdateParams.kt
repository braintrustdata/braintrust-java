// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.toImmutable
import com.braintrustdata.api.models.*
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import java.util.Objects
import java.util.Optional

class PromptUpdateParams
constructor(
    private val promptId: String,
    private val description: String?,
    private val name: String?,
    private val promptData: PromptData?,
    private val slug: String?,
    private val tags: List<String>?,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun promptId(): String = promptId

    fun description(): Optional<String> = Optional.ofNullable(description)

    fun name(): Optional<String> = Optional.ofNullable(name)

    fun promptData(): Optional<PromptData> = Optional.ofNullable(promptData)

    fun slug(): Optional<String> = Optional.ofNullable(slug)

    fun tags(): Optional<List<String>> = Optional.ofNullable(tags)

    @JvmSynthetic
    internal fun getBody(): PromptUpdateBody {
        return PromptUpdateBody(
            description,
            name,
            promptData,
            slug,
            tags,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> promptId
            else -> ""
        }
    }

    @JsonDeserialize(builder = PromptUpdateBody.Builder::class)
    @NoAutoDetect
    class PromptUpdateBody
    internal constructor(
        private val description: String?,
        private val name: String?,
        private val promptData: PromptData?,
        private val slug: String?,
        private val tags: List<String>?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** Textual description of the prompt */
        @JsonProperty("description") fun description(): String? = description

        /** Name of the prompt */
        @JsonProperty("name") fun name(): String? = name

        /** The prompt, model, and its parameters */
        @JsonProperty("prompt_data") fun promptData(): PromptData? = promptData

        /** Unique identifier for the prompt */
        @JsonProperty("slug") fun slug(): String? = slug

        /** A list of tags for the prompt */
        @JsonProperty("tags") fun tags(): List<String>? = tags

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var description: String? = null
            private var name: String? = null
            private var promptData: PromptData? = null
            private var slug: String? = null
            private var tags: List<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(promptUpdateBody: PromptUpdateBody) = apply {
                this.description = promptUpdateBody.description
                this.name = promptUpdateBody.name
                this.promptData = promptUpdateBody.promptData
                this.slug = promptUpdateBody.slug
                this.tags = promptUpdateBody.tags
                additionalProperties(promptUpdateBody.additionalProperties)
            }

            /** Textual description of the prompt */
            @JsonProperty("description")
            fun description(description: String) = apply { this.description = description }

            /** Name of the prompt */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            /** The prompt, model, and its parameters */
            @JsonProperty("prompt_data")
            fun promptData(promptData: PromptData) = apply { this.promptData = promptData }

            /** Unique identifier for the prompt */
            @JsonProperty("slug") fun slug(slug: String) = apply { this.slug = slug }

            /** A list of tags for the prompt */
            @JsonProperty("tags") fun tags(tags: List<String>) = apply { this.tags = tags }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): PromptUpdateBody =
                PromptUpdateBody(
                    description,
                    name,
                    promptData,
                    slug,
                    tags?.toImmutable(),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PromptUpdateBody && this.description == other.description && this.name == other.name && this.promptData == other.promptData && this.slug == other.slug && this.tags == other.tags && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(description, name, promptData, slug, tags, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "PromptUpdateBody{description=$description, name=$name, promptData=$promptData, slug=$slug, tags=$tags, additionalProperties=$additionalProperties}"
    }

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PromptUpdateParams && this.promptId == other.promptId && this.description == other.description && this.name == other.name && this.promptData == other.promptData && this.slug == other.slug && this.tags == other.tags && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(promptId, description, name, promptData, slug, tags, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "PromptUpdateParams{promptId=$promptId, description=$description, name=$name, promptData=$promptData, slug=$slug, tags=$tags, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var promptId: String? = null
        private var description: String? = null
        private var name: String? = null
        private var promptData: PromptData? = null
        private var slug: String? = null
        private var tags: MutableList<String> = mutableListOf()
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(promptUpdateParams: PromptUpdateParams) = apply {
            this.promptId = promptUpdateParams.promptId
            this.description = promptUpdateParams.description
            this.name = promptUpdateParams.name
            this.promptData = promptUpdateParams.promptData
            this.slug = promptUpdateParams.slug
            this.tags(promptUpdateParams.tags ?: listOf())
            additionalHeaders(promptUpdateParams.additionalHeaders)
            additionalQueryParams(promptUpdateParams.additionalQueryParams)
            additionalBodyProperties(promptUpdateParams.additionalBodyProperties)
        }

        /** Prompt id */
        fun promptId(promptId: String) = apply { this.promptId = promptId }

        /** Textual description of the prompt */
        fun description(description: String) = apply { this.description = description }

        /** Name of the prompt */
        fun name(name: String) = apply { this.name = name }

        /** The prompt, model, and its parameters */
        fun promptData(promptData: PromptData) = apply { this.promptData = promptData }

        /** Unique identifier for the prompt */
        fun slug(slug: String) = apply { this.slug = slug }

        /** A list of tags for the prompt */
        fun tags(tags: List<String>) = apply {
            this.tags.clear()
            this.tags.addAll(tags)
        }

        /** A list of tags for the prompt */
        fun addTag(tag: String) = apply { this.tags.add(tag) }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.putAll(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(::putAdditionalHeaders)
        }

        fun removeAdditionalHeader(name: String) = apply { additionalHeaders.removeAll(name) }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.putAll(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                additionalQueryParams.forEach(::putAdditionalQueryParams)
            }

        fun removeAdditionalQueryParam(key: String) = apply { additionalQueryParams.removeAll(key) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): PromptUpdateParams =
            PromptUpdateParams(
                checkNotNull(promptId) { "`promptId` is required but was not set" },
                description,
                name,
                promptData,
                slug,
                if (tags.size == 0) null else tags.toImmutable(),
                additionalHeaders
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalQueryParams
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalBodyProperties.toImmutable(),
            )
    }
}
