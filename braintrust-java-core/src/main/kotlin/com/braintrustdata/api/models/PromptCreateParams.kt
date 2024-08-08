// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.toUnmodifiable
import com.braintrustdata.api.models.*
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import java.util.Objects
import java.util.Optional

class PromptCreateParams
constructor(
    private val name: String,
    private val projectId: String,
    private val slug: String,
    private val description: String?,
    private val promptData: PromptData?,
    private val tags: List<String>?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun name(): String = name

    fun projectId(): String = projectId

    fun slug(): String = slug

    fun description(): Optional<String> = Optional.ofNullable(description)

    fun promptData(): Optional<PromptData> = Optional.ofNullable(promptData)

    fun tags(): Optional<List<String>> = Optional.ofNullable(tags)

    @JvmSynthetic
    internal fun getBody(): PromptCreateBody {
        return PromptCreateBody(
            name,
            projectId,
            slug,
            description,
            promptData,
            tags,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = PromptCreateBody.Builder::class)
    @NoAutoDetect
    class PromptCreateBody
    internal constructor(
        private val name: String?,
        private val projectId: String?,
        private val slug: String?,
        private val description: String?,
        private val promptData: PromptData?,
        private val tags: List<String>?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** Name of the prompt */
        @JsonProperty("name") fun name(): String? = name

        /** Unique identifier for the project that the prompt belongs under */
        @JsonProperty("project_id") fun projectId(): String? = projectId

        /** Unique identifier for the prompt */
        @JsonProperty("slug") fun slug(): String? = slug

        /** Textual description of the prompt */
        @JsonProperty("description") fun description(): String? = description

        /** The prompt, model, and its parameters */
        @JsonProperty("prompt_data") fun promptData(): PromptData? = promptData

        /** A list of tags for the prompt */
        @JsonProperty("tags") fun tags(): List<String>? = tags

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PromptCreateBody &&
                this.name == other.name &&
                this.projectId == other.projectId &&
                this.slug == other.slug &&
                this.description == other.description &&
                this.promptData == other.promptData &&
                this.tags == other.tags &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        name,
                        projectId,
                        slug,
                        description,
                        promptData,
                        tags,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "PromptCreateBody{name=$name, projectId=$projectId, slug=$slug, description=$description, promptData=$promptData, tags=$tags, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var name: String? = null
            private var projectId: String? = null
            private var slug: String? = null
            private var description: String? = null
            private var promptData: PromptData? = null
            private var tags: List<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(promptCreateBody: PromptCreateBody) = apply {
                this.name = promptCreateBody.name
                this.projectId = promptCreateBody.projectId
                this.slug = promptCreateBody.slug
                this.description = promptCreateBody.description
                this.promptData = promptCreateBody.promptData
                this.tags = promptCreateBody.tags
                additionalProperties(promptCreateBody.additionalProperties)
            }

            /** Name of the prompt */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            /** Unique identifier for the project that the prompt belongs under */
            @JsonProperty("project_id")
            fun projectId(projectId: String) = apply { this.projectId = projectId }

            /** Unique identifier for the prompt */
            @JsonProperty("slug") fun slug(slug: String) = apply { this.slug = slug }

            /** Textual description of the prompt */
            @JsonProperty("description")
            fun description(description: String) = apply { this.description = description }

            /** The prompt, model, and its parameters */
            @JsonProperty("prompt_data")
            fun promptData(promptData: PromptData) = apply { this.promptData = promptData }

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

            fun build(): PromptCreateBody =
                PromptCreateBody(
                    checkNotNull(name) { "`name` is required but was not set" },
                    checkNotNull(projectId) { "`projectId` is required but was not set" },
                    checkNotNull(slug) { "`slug` is required but was not set" },
                    description,
                    promptData,
                    tags?.toUnmodifiable(),
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PromptCreateParams &&
            this.name == other.name &&
            this.projectId == other.projectId &&
            this.slug == other.slug &&
            this.description == other.description &&
            this.promptData == other.promptData &&
            this.tags == other.tags &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            name,
            projectId,
            slug,
            description,
            promptData,
            tags,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "PromptCreateParams{name=$name, projectId=$projectId, slug=$slug, description=$description, promptData=$promptData, tags=$tags, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var name: String? = null
        private var projectId: String? = null
        private var slug: String? = null
        private var description: String? = null
        private var promptData: PromptData? = null
        private var tags: MutableList<String> = mutableListOf()
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(promptCreateParams: PromptCreateParams) = apply {
            this.name = promptCreateParams.name
            this.projectId = promptCreateParams.projectId
            this.slug = promptCreateParams.slug
            this.description = promptCreateParams.description
            this.promptData = promptCreateParams.promptData
            this.tags(promptCreateParams.tags ?: listOf())
            additionalQueryParams(promptCreateParams.additionalQueryParams)
            additionalHeaders(promptCreateParams.additionalHeaders)
            additionalBodyProperties(promptCreateParams.additionalBodyProperties)
        }

        /** Name of the prompt */
        fun name(name: String) = apply { this.name = name }

        /** Unique identifier for the project that the prompt belongs under */
        fun projectId(projectId: String) = apply { this.projectId = projectId }

        /** Unique identifier for the prompt */
        fun slug(slug: String) = apply { this.slug = slug }

        /** Textual description of the prompt */
        fun description(description: String) = apply { this.description = description }

        /** The prompt, model, and its parameters */
        fun promptData(promptData: PromptData) = apply { this.promptData = promptData }

        /** A list of tags for the prompt */
        fun tags(tags: List<String>) = apply {
            this.tags.clear()
            this.tags.addAll(tags)
        }

        /** A list of tags for the prompt */
        fun addTag(tag: String) = apply { this.tags.add(tag) }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

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

        fun build(): PromptCreateParams =
            PromptCreateParams(
                checkNotNull(name) { "`name` is required but was not set" },
                checkNotNull(projectId) { "`projectId` is required but was not set" },
                checkNotNull(slug) { "`slug` is required but was not set" },
                description,
                promptData,
                if (tags.size == 0) null else tags.toUnmodifiable(),
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }
}
