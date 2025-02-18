// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.Enum
import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.Params
import com.braintrustdata.api.core.checkRequired
import com.braintrustdata.api.core.http.Headers
import com.braintrustdata.api.core.http.QueryParams
import com.braintrustdata.api.core.immutableEmptyMap
import com.braintrustdata.api.core.toImmutable
import com.braintrustdata.api.errors.BraintrustInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Objects
import java.util.Optional

/**
 * Create a new prompt. If there is an existing prompt in the project with the same slug as the one
 * specified in the request, will return the existing prompt unmodified
 */
class PromptCreateParams
private constructor(
    private val body: PromptCreateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Name of the prompt */
    fun name(): String = body.name()

    /** Unique identifier for the project that the prompt belongs under */
    fun projectId(): String = body.projectId()

    /** Unique identifier for the prompt */
    fun slug(): String = body.slug()

    /** Textual description of the prompt */
    fun description(): Optional<String> = body.description()

    fun functionType(): Optional<FunctionType> = body.functionType()

    /** The prompt, model, and its parameters */
    fun promptData(): Optional<PromptData> = body.promptData()

    /** A list of tags for the prompt */
    fun tags(): Optional<List<String>> = body.tags()

    /** Name of the prompt */
    fun _name(): JsonField<String> = body._name()

    /** Unique identifier for the project that the prompt belongs under */
    fun _projectId(): JsonField<String> = body._projectId()

    /** Unique identifier for the prompt */
    fun _slug(): JsonField<String> = body._slug()

    /** Textual description of the prompt */
    fun _description(): JsonField<String> = body._description()

    fun _functionType(): JsonField<FunctionType> = body._functionType()

    /** The prompt, model, and its parameters */
    fun _promptData(): JsonField<PromptData> = body._promptData()

    /** A list of tags for the prompt */
    fun _tags(): JsonField<List<String>> = body._tags()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun _body(): PromptCreateBody = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class PromptCreateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("project_id")
        @ExcludeMissing
        private val projectId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("slug")
        @ExcludeMissing
        private val slug: JsonField<String> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        private val description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("function_type")
        @ExcludeMissing
        private val functionType: JsonField<FunctionType> = JsonMissing.of(),
        @JsonProperty("prompt_data")
        @ExcludeMissing
        private val promptData: JsonField<PromptData> = JsonMissing.of(),
        @JsonProperty("tags")
        @ExcludeMissing
        private val tags: JsonField<List<String>> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Name of the prompt */
        fun name(): String = name.getRequired("name")

        /** Unique identifier for the project that the prompt belongs under */
        fun projectId(): String = projectId.getRequired("project_id")

        /** Unique identifier for the prompt */
        fun slug(): String = slug.getRequired("slug")

        /** Textual description of the prompt */
        fun description(): Optional<String> =
            Optional.ofNullable(description.getNullable("description"))

        fun functionType(): Optional<FunctionType> =
            Optional.ofNullable(functionType.getNullable("function_type"))

        /** The prompt, model, and its parameters */
        fun promptData(): Optional<PromptData> =
            Optional.ofNullable(promptData.getNullable("prompt_data"))

        /** A list of tags for the prompt */
        fun tags(): Optional<List<String>> = Optional.ofNullable(tags.getNullable("tags"))

        /** Name of the prompt */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /** Unique identifier for the project that the prompt belongs under */
        @JsonProperty("project_id") @ExcludeMissing fun _projectId(): JsonField<String> = projectId

        /** Unique identifier for the prompt */
        @JsonProperty("slug") @ExcludeMissing fun _slug(): JsonField<String> = slug

        /** Textual description of the prompt */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        @JsonProperty("function_type")
        @ExcludeMissing
        fun _functionType(): JsonField<FunctionType> = functionType

        /** The prompt, model, and its parameters */
        @JsonProperty("prompt_data")
        @ExcludeMissing
        fun _promptData(): JsonField<PromptData> = promptData

        /** A list of tags for the prompt */
        @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<String>> = tags

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): PromptCreateBody = apply {
            if (validated) {
                return@apply
            }

            name()
            projectId()
            slug()
            description()
            functionType()
            promptData().ifPresent { it.validate() }
            tags()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [PromptCreateBody]. */
        class Builder internal constructor() {

            private var name: JsonField<String>? = null
            private var projectId: JsonField<String>? = null
            private var slug: JsonField<String>? = null
            private var description: JsonField<String> = JsonMissing.of()
            private var functionType: JsonField<FunctionType> = JsonMissing.of()
            private var promptData: JsonField<PromptData> = JsonMissing.of()
            private var tags: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(promptCreateBody: PromptCreateBody) = apply {
                name = promptCreateBody.name
                projectId = promptCreateBody.projectId
                slug = promptCreateBody.slug
                description = promptCreateBody.description
                functionType = promptCreateBody.functionType
                promptData = promptCreateBody.promptData
                tags = promptCreateBody.tags.map { it.toMutableList() }
                additionalProperties = promptCreateBody.additionalProperties.toMutableMap()
            }

            /** Name of the prompt */
            fun name(name: String) = name(JsonField.of(name))

            /** Name of the prompt */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** Unique identifier for the project that the prompt belongs under */
            fun projectId(projectId: String) = projectId(JsonField.of(projectId))

            /** Unique identifier for the project that the prompt belongs under */
            fun projectId(projectId: JsonField<String>) = apply { this.projectId = projectId }

            /** Unique identifier for the prompt */
            fun slug(slug: String) = slug(JsonField.of(slug))

            /** Unique identifier for the prompt */
            fun slug(slug: JsonField<String>) = apply { this.slug = slug }

            /** Textual description of the prompt */
            fun description(description: String?) = description(JsonField.ofNullable(description))

            /** Textual description of the prompt */
            fun description(description: Optional<String>) = description(description.orElse(null))

            /** Textual description of the prompt */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            fun functionType(functionType: FunctionType?) =
                functionType(JsonField.ofNullable(functionType))

            fun functionType(functionType: Optional<FunctionType>) =
                functionType(functionType.orElse(null))

            fun functionType(functionType: JsonField<FunctionType>) = apply {
                this.functionType = functionType
            }

            /** The prompt, model, and its parameters */
            fun promptData(promptData: PromptData?) = promptData(JsonField.ofNullable(promptData))

            /** The prompt, model, and its parameters */
            fun promptData(promptData: Optional<PromptData>) = promptData(promptData.orElse(null))

            /** The prompt, model, and its parameters */
            fun promptData(promptData: JsonField<PromptData>) = apply {
                this.promptData = promptData
            }

            /** A list of tags for the prompt */
            fun tags(tags: List<String>?) = tags(JsonField.ofNullable(tags))

            /** A list of tags for the prompt */
            fun tags(tags: Optional<List<String>>) = tags(tags.orElse(null))

            /** A list of tags for the prompt */
            fun tags(tags: JsonField<List<String>>) = apply {
                this.tags = tags.map { it.toMutableList() }
            }

            /** A list of tags for the prompt */
            fun addTag(tag: String) = apply {
                tags =
                    (tags ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(tag)
                    }
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

            fun build(): PromptCreateBody =
                PromptCreateBody(
                    checkRequired("name", name),
                    checkRequired("projectId", projectId),
                    checkRequired("slug", slug),
                    description,
                    functionType,
                    promptData,
                    (tags ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PromptCreateBody && name == other.name && projectId == other.projectId && slug == other.slug && description == other.description && functionType == other.functionType && promptData == other.promptData && tags == other.tags && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(name, projectId, slug, description, functionType, promptData, tags, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PromptCreateBody{name=$name, projectId=$projectId, slug=$slug, description=$description, functionType=$functionType, promptData=$promptData, tags=$tags, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PromptCreateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var body: PromptCreateBody.Builder = PromptCreateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(promptCreateParams: PromptCreateParams) = apply {
            body = promptCreateParams.body.toBuilder()
            additionalHeaders = promptCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = promptCreateParams.additionalQueryParams.toBuilder()
        }

        /** Name of the prompt */
        fun name(name: String) = apply { body.name(name) }

        /** Name of the prompt */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /** Unique identifier for the project that the prompt belongs under */
        fun projectId(projectId: String) = apply { body.projectId(projectId) }

        /** Unique identifier for the project that the prompt belongs under */
        fun projectId(projectId: JsonField<String>) = apply { body.projectId(projectId) }

        /** Unique identifier for the prompt */
        fun slug(slug: String) = apply { body.slug(slug) }

        /** Unique identifier for the prompt */
        fun slug(slug: JsonField<String>) = apply { body.slug(slug) }

        /** Textual description of the prompt */
        fun description(description: String?) = apply { body.description(description) }

        /** Textual description of the prompt */
        fun description(description: Optional<String>) = description(description.orElse(null))

        /** Textual description of the prompt */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        fun functionType(functionType: FunctionType?) = apply { body.functionType(functionType) }

        fun functionType(functionType: Optional<FunctionType>) =
            functionType(functionType.orElse(null))

        fun functionType(functionType: JsonField<FunctionType>) = apply {
            body.functionType(functionType)
        }

        /** The prompt, model, and its parameters */
        fun promptData(promptData: PromptData?) = apply { body.promptData(promptData) }

        /** The prompt, model, and its parameters */
        fun promptData(promptData: Optional<PromptData>) = promptData(promptData.orElse(null))

        /** The prompt, model, and its parameters */
        fun promptData(promptData: JsonField<PromptData>) = apply { body.promptData(promptData) }

        /** A list of tags for the prompt */
        fun tags(tags: List<String>?) = apply { body.tags(tags) }

        /** A list of tags for the prompt */
        fun tags(tags: Optional<List<String>>) = tags(tags.orElse(null))

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

        fun build(): PromptCreateParams =
            PromptCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    class FunctionType @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val LLM = of("llm")

            @JvmField val SCORER = of("scorer")

            @JvmField val TASK = of("task")

            @JvmField val TOOL = of("tool")

            @JvmStatic fun of(value: String) = FunctionType(JsonField.of(value))
        }

        /** An enum containing [FunctionType]'s known values. */
        enum class Known {
            LLM,
            SCORER,
            TASK,
            TOOL,
        }

        /**
         * An enum containing [FunctionType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [FunctionType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            LLM,
            SCORER,
            TASK,
            TOOL,
            /**
             * An enum member indicating that [FunctionType] was instantiated with an unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                LLM -> Value.LLM
                SCORER -> Value.SCORER
                TASK -> Value.TASK
                TOOL -> Value.TOOL
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws BraintrustInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                LLM -> Known.LLM
                SCORER -> Known.SCORER
                TASK -> Known.TASK
                TOOL -> Known.TOOL
                else -> throw BraintrustInvalidDataException("Unknown FunctionType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is FunctionType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PromptCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "PromptCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
