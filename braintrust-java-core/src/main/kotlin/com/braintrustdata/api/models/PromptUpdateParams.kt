// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.Params
import com.braintrustdata.api.core.checkKnown
import com.braintrustdata.api.core.checkRequired
import com.braintrustdata.api.core.http.Headers
import com.braintrustdata.api.core.http.QueryParams
import com.braintrustdata.api.core.immutableEmptyMap
import com.braintrustdata.api.core.toImmutable
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Partially update a prompt object. Specify the fields to update in the payload. Any object-type
 * fields will be deep-merged with existing content. Currently we do not support removing fields or
 * setting them to null.
 */
class PromptUpdateParams
private constructor(
    private val promptId: String,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Prompt id */
    fun promptId(): String = promptId

    /** Textual description of the prompt */
    fun description(): Optional<String> = body.description()

    /** Name of the prompt */
    fun name(): Optional<String> = body.name()

    /** The prompt, model, and its parameters */
    fun promptData(): Optional<PromptData> = body.promptData()

    /** Unique identifier for the prompt */
    fun slug(): Optional<String> = body.slug()

    /** A list of tags for the prompt */
    fun tags(): Optional<List<String>> = body.tags()

    /** Textual description of the prompt */
    fun _description(): JsonField<String> = body._description()

    /** Name of the prompt */
    fun _name(): JsonField<String> = body._name()

    /** The prompt, model, and its parameters */
    fun _promptData(): JsonField<PromptData> = body._promptData()

    /** Unique identifier for the prompt */
    fun _slug(): JsonField<String> = body._slug()

    /** A list of tags for the prompt */
    fun _tags(): JsonField<List<String>> = body._tags()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> promptId
            else -> ""
        }
    }

    @NoAutoDetect
    class Body
    @JsonCreator
    private constructor(
        @JsonProperty("description")
        @ExcludeMissing
        private val description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("prompt_data")
        @ExcludeMissing
        private val promptData: JsonField<PromptData> = JsonMissing.of(),
        @JsonProperty("slug")
        @ExcludeMissing
        private val slug: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tags")
        @ExcludeMissing
        private val tags: JsonField<List<String>> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Textual description of the prompt */
        fun description(): Optional<String> =
            Optional.ofNullable(description.getNullable("description"))

        /** Name of the prompt */
        fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

        /** The prompt, model, and its parameters */
        fun promptData(): Optional<PromptData> =
            Optional.ofNullable(promptData.getNullable("prompt_data"))

        /** Unique identifier for the prompt */
        fun slug(): Optional<String> = Optional.ofNullable(slug.getNullable("slug"))

        /** A list of tags for the prompt */
        fun tags(): Optional<List<String>> = Optional.ofNullable(tags.getNullable("tags"))

        /** Textual description of the prompt */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /** Name of the prompt */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /** The prompt, model, and its parameters */
        @JsonProperty("prompt_data")
        @ExcludeMissing
        fun _promptData(): JsonField<PromptData> = promptData

        /** Unique identifier for the prompt */
        @JsonProperty("slug") @ExcludeMissing fun _slug(): JsonField<String> = slug

        /** A list of tags for the prompt */
        @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<String>> = tags

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            description()
            name()
            promptData().ifPresent { it.validate() }
            slug()
            tags()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var description: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var promptData: JsonField<PromptData> = JsonMissing.of()
            private var slug: JsonField<String> = JsonMissing.of()
            private var tags: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                description = body.description
                name = body.name
                promptData = body.promptData
                slug = body.slug
                tags = body.tags.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Textual description of the prompt */
            fun description(description: String?) = description(JsonField.ofNullable(description))

            /** Textual description of the prompt */
            fun description(description: Optional<String>) = description(description.getOrNull())

            /** Textual description of the prompt */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /** Name of the prompt */
            fun name(name: String?) = name(JsonField.ofNullable(name))

            /** Name of the prompt */
            fun name(name: Optional<String>) = name(name.getOrNull())

            /** Name of the prompt */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** The prompt, model, and its parameters */
            fun promptData(promptData: PromptData?) = promptData(JsonField.ofNullable(promptData))

            /** The prompt, model, and its parameters */
            fun promptData(promptData: Optional<PromptData>) = promptData(promptData.getOrNull())

            /** The prompt, model, and its parameters */
            fun promptData(promptData: JsonField<PromptData>) = apply {
                this.promptData = promptData
            }

            /** Unique identifier for the prompt */
            fun slug(slug: String?) = slug(JsonField.ofNullable(slug))

            /** Unique identifier for the prompt */
            fun slug(slug: Optional<String>) = slug(slug.getOrNull())

            /** Unique identifier for the prompt */
            fun slug(slug: JsonField<String>) = apply { this.slug = slug }

            /** A list of tags for the prompt */
            fun tags(tags: List<String>?) = tags(JsonField.ofNullable(tags))

            /** A list of tags for the prompt */
            fun tags(tags: Optional<List<String>>) = tags(tags.getOrNull())

            /** A list of tags for the prompt */
            fun tags(tags: JsonField<List<String>>) = apply {
                this.tags = tags.map { it.toMutableList() }
            }

            /** A list of tags for the prompt */
            fun addTag(tag: String) = apply {
                tags =
                    (tags ?: JsonField.of(mutableListOf())).also { checkKnown("tags", it).add(tag) }
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            fun build(): Body =
                Body(
                    description,
                    name,
                    promptData,
                    slug,
                    (tags ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && description == other.description && name == other.name && promptData == other.promptData && slug == other.slug && tags == other.tags && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(description, name, promptData, slug, tags, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{description=$description, name=$name, promptData=$promptData, slug=$slug, tags=$tags, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PromptUpdateParams].
         *
         * The following fields are required:
         * ```java
         * .promptId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PromptUpdateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var promptId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(promptUpdateParams: PromptUpdateParams) = apply {
            promptId = promptUpdateParams.promptId
            body = promptUpdateParams.body.toBuilder()
            additionalHeaders = promptUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = promptUpdateParams.additionalQueryParams.toBuilder()
        }

        /** Prompt id */
        fun promptId(promptId: String) = apply { this.promptId = promptId }

        /** Textual description of the prompt */
        fun description(description: String?) = apply { body.description(description) }

        /** Textual description of the prompt */
        fun description(description: Optional<String>) = description(description.getOrNull())

        /** Textual description of the prompt */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        /** Name of the prompt */
        fun name(name: String?) = apply { body.name(name) }

        /** Name of the prompt */
        fun name(name: Optional<String>) = name(name.getOrNull())

        /** Name of the prompt */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /** The prompt, model, and its parameters */
        fun promptData(promptData: PromptData?) = apply { body.promptData(promptData) }

        /** The prompt, model, and its parameters */
        fun promptData(promptData: Optional<PromptData>) = promptData(promptData.getOrNull())

        /** The prompt, model, and its parameters */
        fun promptData(promptData: JsonField<PromptData>) = apply { body.promptData(promptData) }

        /** Unique identifier for the prompt */
        fun slug(slug: String?) = apply { body.slug(slug) }

        /** Unique identifier for the prompt */
        fun slug(slug: Optional<String>) = slug(slug.getOrNull())

        /** Unique identifier for the prompt */
        fun slug(slug: JsonField<String>) = apply { body.slug(slug) }

        /** A list of tags for the prompt */
        fun tags(tags: List<String>?) = apply { body.tags(tags) }

        /** A list of tags for the prompt */
        fun tags(tags: Optional<List<String>>) = tags(tags.getOrNull())

        /** A list of tags for the prompt */
        fun tags(tags: JsonField<List<String>>) = apply { body.tags(tags) }

        /** A list of tags for the prompt */
        fun addTag(tag: String) = apply { body.addTag(tag) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        fun build(): PromptUpdateParams =
            PromptUpdateParams(
                checkRequired("promptId", promptId),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PromptUpdateParams && promptId == other.promptId && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(promptId, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "PromptUpdateParams{promptId=$promptId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
