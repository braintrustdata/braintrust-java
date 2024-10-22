// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.BaseDeserializer
import com.braintrustdata.api.core.BaseSerializer
import com.braintrustdata.api.core.Enum
import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.getOrThrow
import com.braintrustdata.api.core.toUnmodifiable
import com.braintrustdata.api.errors.BraintrustInvalidDataException
import com.braintrustdata.api.models.*
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.util.Objects
import java.util.Optional

class FunctionCreateParams
constructor(
    private val functionData: FunctionData,
    private val name: String,
    private val projectId: String,
    private val slug: String,
    private val description: String?,
    private val functionSchema: FunctionSchema?,
    private val functionType: FunctionType?,
    private val origin: Origin?,
    private val promptData: PromptData?,
    private val tags: List<String>?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun functionData(): FunctionData = functionData

    fun name(): String = name

    fun projectId(): String = projectId

    fun slug(): String = slug

    fun description(): Optional<String> = Optional.ofNullable(description)

    fun functionSchema(): Optional<FunctionSchema> = Optional.ofNullable(functionSchema)

    fun functionType(): Optional<FunctionType> = Optional.ofNullable(functionType)

    fun origin(): Optional<Origin> = Optional.ofNullable(origin)

    fun promptData(): Optional<PromptData> = Optional.ofNullable(promptData)

    fun tags(): Optional<List<String>> = Optional.ofNullable(tags)

    @JvmSynthetic
    internal fun getBody(): FunctionCreateBody {
        return FunctionCreateBody(
            functionData,
            name,
            projectId,
            slug,
            description,
            functionSchema,
            functionType,
            origin,
            promptData,
            tags,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = FunctionCreateBody.Builder::class)
    @NoAutoDetect
    class FunctionCreateBody
    internal constructor(
        private val functionData: FunctionData?,
        private val name: String?,
        private val projectId: String?,
        private val slug: String?,
        private val description: String?,
        private val functionSchema: FunctionSchema?,
        private val functionType: FunctionType?,
        private val origin: Origin?,
        private val promptData: PromptData?,
        private val tags: List<String>?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonProperty("function_data") fun functionData(): FunctionData? = functionData

        /** Name of the prompt */
        @JsonProperty("name") fun name(): String? = name

        /** Unique identifier for the project that the prompt belongs under */
        @JsonProperty("project_id") fun projectId(): String? = projectId

        /** Unique identifier for the prompt */
        @JsonProperty("slug") fun slug(): String? = slug

        /** Textual description of the prompt */
        @JsonProperty("description") fun description(): String? = description

        /** JSON schema for the function's parameters and return type */
        @JsonProperty("function_schema") fun functionSchema(): FunctionSchema? = functionSchema

        @JsonProperty("function_type") fun functionType(): FunctionType? = functionType

        @JsonProperty("origin") fun origin(): Origin? = origin

        /** The prompt, model, and its parameters */
        @JsonProperty("prompt_data") fun promptData(): PromptData? = promptData

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

            private var functionData: FunctionData? = null
            private var name: String? = null
            private var projectId: String? = null
            private var slug: String? = null
            private var description: String? = null
            private var functionSchema: FunctionSchema? = null
            private var functionType: FunctionType? = null
            private var origin: Origin? = null
            private var promptData: PromptData? = null
            private var tags: List<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(functionCreateBody: FunctionCreateBody) = apply {
                this.functionData = functionCreateBody.functionData
                this.name = functionCreateBody.name
                this.projectId = functionCreateBody.projectId
                this.slug = functionCreateBody.slug
                this.description = functionCreateBody.description
                this.functionSchema = functionCreateBody.functionSchema
                this.functionType = functionCreateBody.functionType
                this.origin = functionCreateBody.origin
                this.promptData = functionCreateBody.promptData
                this.tags = functionCreateBody.tags
                additionalProperties(functionCreateBody.additionalProperties)
            }

            @JsonProperty("function_data")
            fun functionData(functionData: FunctionData) = apply {
                this.functionData = functionData
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

            /** JSON schema for the function's parameters and return type */
            @JsonProperty("function_schema")
            fun functionSchema(functionSchema: FunctionSchema) = apply {
                this.functionSchema = functionSchema
            }

            @JsonProperty("function_type")
            fun functionType(functionType: FunctionType) = apply {
                this.functionType = functionType
            }

            @JsonProperty("origin") fun origin(origin: Origin) = apply { this.origin = origin }

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

            fun build(): FunctionCreateBody =
                FunctionCreateBody(
                    checkNotNull(functionData) { "`functionData` is required but was not set" },
                    checkNotNull(name) { "`name` is required but was not set" },
                    checkNotNull(projectId) { "`projectId` is required but was not set" },
                    checkNotNull(slug) { "`slug` is required but was not set" },
                    description,
                    functionSchema,
                    functionType,
                    origin,
                    promptData,
                    tags?.toUnmodifiable(),
                    additionalProperties.toUnmodifiable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is FunctionCreateBody && this.functionData == other.functionData && this.name == other.name && this.projectId == other.projectId && this.slug == other.slug && this.description == other.description && this.functionSchema == other.functionSchema && this.functionType == other.functionType && this.origin == other.origin && this.promptData == other.promptData && this.tags == other.tags && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(functionData, name, projectId, slug, description, functionSchema, functionType, origin, promptData, tags, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "FunctionCreateBody{functionData=$functionData, name=$name, projectId=$projectId, slug=$slug, description=$description, functionSchema=$functionSchema, functionType=$functionType, origin=$origin, promptData=$promptData, tags=$tags, additionalProperties=$additionalProperties}"
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is FunctionCreateParams && this.functionData == other.functionData && this.name == other.name && this.projectId == other.projectId && this.slug == other.slug && this.description == other.description && this.functionSchema == other.functionSchema && this.functionType == other.functionType && this.origin == other.origin && this.promptData == other.promptData && this.tags == other.tags && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(functionData, name, projectId, slug, description, functionSchema, functionType, origin, promptData, tags, additionalQueryParams, additionalHeaders, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "FunctionCreateParams{functionData=$functionData, name=$name, projectId=$projectId, slug=$slug, description=$description, functionSchema=$functionSchema, functionType=$functionType, origin=$origin, promptData=$promptData, tags=$tags, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var functionData: FunctionData? = null
        private var name: String? = null
        private var projectId: String? = null
        private var slug: String? = null
        private var description: String? = null
        private var functionSchema: FunctionSchema? = null
        private var functionType: FunctionType? = null
        private var origin: Origin? = null
        private var promptData: PromptData? = null
        private var tags: MutableList<String> = mutableListOf()
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(functionCreateParams: FunctionCreateParams) = apply {
            this.functionData = functionCreateParams.functionData
            this.name = functionCreateParams.name
            this.projectId = functionCreateParams.projectId
            this.slug = functionCreateParams.slug
            this.description = functionCreateParams.description
            this.functionSchema = functionCreateParams.functionSchema
            this.functionType = functionCreateParams.functionType
            this.origin = functionCreateParams.origin
            this.promptData = functionCreateParams.promptData
            this.tags(functionCreateParams.tags ?: listOf())
            additionalQueryParams(functionCreateParams.additionalQueryParams)
            additionalHeaders(functionCreateParams.additionalHeaders)
            additionalBodyProperties(functionCreateParams.additionalBodyProperties)
        }

        fun functionData(functionData: FunctionData) = apply { this.functionData = functionData }

        fun functionData(prompt: FunctionData.Prompt) = apply {
            this.functionData = FunctionData.ofPrompt(prompt)
        }

        fun functionData(code: FunctionData.Code) = apply {
            this.functionData = FunctionData.ofCode(code)
        }

        fun functionData(global: FunctionData.Global) = apply {
            this.functionData = FunctionData.ofGlobal(global)
        }

        /** Name of the prompt */
        fun name(name: String) = apply { this.name = name }

        /** Unique identifier for the project that the prompt belongs under */
        fun projectId(projectId: String) = apply { this.projectId = projectId }

        /** Unique identifier for the prompt */
        fun slug(slug: String) = apply { this.slug = slug }

        /** Textual description of the prompt */
        fun description(description: String) = apply { this.description = description }

        /** JSON schema for the function's parameters and return type */
        fun functionSchema(functionSchema: FunctionSchema) = apply {
            this.functionSchema = functionSchema
        }

        fun functionType(functionType: FunctionType) = apply { this.functionType = functionType }

        fun origin(origin: Origin) = apply { this.origin = origin }

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

        fun build(): FunctionCreateParams =
            FunctionCreateParams(
                checkNotNull(functionData) { "`functionData` is required but was not set" },
                checkNotNull(name) { "`name` is required but was not set" },
                checkNotNull(projectId) { "`projectId` is required but was not set" },
                checkNotNull(slug) { "`slug` is required but was not set" },
                description,
                functionSchema,
                functionType,
                origin,
                promptData,
                if (tags.size == 0) null else tags.toUnmodifiable(),
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(using = FunctionData.Deserializer::class)
    @JsonSerialize(using = FunctionData.Serializer::class)
    class FunctionData
    private constructor(
        private val prompt: Prompt? = null,
        private val code: Code? = null,
        private val global: Global? = null,
        private val _json: JsonValue? = null,
    ) {

        private var validated: Boolean = false

        fun prompt(): Optional<Prompt> = Optional.ofNullable(prompt)

        fun code(): Optional<Code> = Optional.ofNullable(code)

        fun global(): Optional<Global> = Optional.ofNullable(global)

        fun isPrompt(): Boolean = prompt != null

        fun isCode(): Boolean = code != null

        fun isGlobal(): Boolean = global != null

        fun asPrompt(): Prompt = prompt.getOrThrow("prompt")

        fun asCode(): Code = code.getOrThrow("code")

        fun asGlobal(): Global = global.getOrThrow("global")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                prompt != null -> visitor.visitPrompt(prompt)
                code != null -> visitor.visitCode(code)
                global != null -> visitor.visitGlobal(global)
                else -> visitor.unknown(_json)
            }
        }

        fun validate(): FunctionData = apply {
            if (!validated) {
                if (prompt == null && code == null && global == null) {
                    throw BraintrustInvalidDataException("Unknown FunctionData: $_json")
                }
                prompt?.validate()
                code?.validate()
                global?.validate()
                validated = true
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is FunctionData && this.prompt == other.prompt && this.code == other.code && this.global == other.global /* spotless:on */
        }

        override fun hashCode(): Int {
            return /* spotless:off */ Objects.hash(prompt, code, global) /* spotless:on */
        }

        override fun toString(): String {
            return when {
                prompt != null -> "FunctionData{prompt=$prompt}"
                code != null -> "FunctionData{code=$code}"
                global != null -> "FunctionData{global=$global}"
                _json != null -> "FunctionData{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid FunctionData")
            }
        }

        companion object {

            @JvmStatic fun ofPrompt(prompt: Prompt) = FunctionData(prompt = prompt)

            @JvmStatic fun ofCode(code: Code) = FunctionData(code = code)

            @JvmStatic fun ofGlobal(global: Global) = FunctionData(global = global)
        }

        interface Visitor<out T> {

            fun visitPrompt(prompt: Prompt): T

            fun visitCode(code: Code): T

            fun visitGlobal(global: Global): T

            fun unknown(json: JsonValue?): T {
                throw BraintrustInvalidDataException("Unknown FunctionData: $json")
            }
        }

        class Deserializer : BaseDeserializer<FunctionData>(FunctionData::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): FunctionData {
                val json = JsonValue.fromJsonNode(node)

                tryDeserialize(node, jacksonTypeRef<Prompt>()) { it.validate() }
                    ?.let {
                        return FunctionData(prompt = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<Code>()) { it.validate() }
                    ?.let {
                        return FunctionData(code = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<Global>()) { it.validate() }
                    ?.let {
                        return FunctionData(global = it, _json = json)
                    }

                return FunctionData(_json = json)
            }
        }

        class Serializer : BaseSerializer<FunctionData>(FunctionData::class) {

            override fun serialize(
                value: FunctionData,
                generator: JsonGenerator,
                provider: SerializerProvider
            ) {
                when {
                    value.prompt != null -> generator.writeObject(value.prompt)
                    value.code != null -> generator.writeObject(value.code)
                    value.global != null -> generator.writeObject(value.global)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid FunctionData")
                }
            }
        }

        @JsonDeserialize(builder = Prompt.Builder::class)
        @NoAutoDetect
        class Prompt
        private constructor(
            private val type: JsonField<Type>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            fun type(): Type = type.getRequired("type")

            @JsonProperty("type") @ExcludeMissing fun _type() = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Prompt = apply {
                if (!validated) {
                    type()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var type: JsonField<Type> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(prompt: Prompt) = apply {
                    this.type = prompt.type
                    additionalProperties(prompt.additionalProperties)
                }

                fun type(type: Type) = type(JsonField.of(type))

                @JsonProperty("type")
                @ExcludeMissing
                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Prompt = Prompt(type, additionalProperties.toUnmodifiable())
            }

            class Type
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Type && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    @JvmField val PROMPT = Type(JsonField.of("prompt"))

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                enum class Known {
                    PROMPT,
                }

                enum class Value {
                    PROMPT,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        PROMPT -> Value.PROMPT
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        PROMPT -> Known.PROMPT
                        else -> throw BraintrustInvalidDataException("Unknown Type: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Prompt && this.type == other.type && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(type, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "Prompt{type=$type, additionalProperties=$additionalProperties}"
        }

        @JsonDeserialize(builder = Code.Builder::class)
        @NoAutoDetect
        class Code
        private constructor(
            private val type: JsonField<Type>,
            private val data: JsonField<Data>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            fun type(): Type = type.getRequired("type")

            fun data(): Data = data.getRequired("data")

            @JsonProperty("type") @ExcludeMissing fun _type() = type

            @JsonProperty("data") @ExcludeMissing fun _data() = data

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Code = apply {
                if (!validated) {
                    type()
                    data()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var type: JsonField<Type> = JsonMissing.of()
                private var data: JsonField<Data> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(code: Code) = apply {
                    this.type = code.type
                    this.data = code.data
                    additionalProperties(code.additionalProperties)
                }

                fun type(type: Type) = type(JsonField.of(type))

                @JsonProperty("type")
                @ExcludeMissing
                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun data(data: Data) = data(JsonField.of(data))

                @JsonProperty("data")
                @ExcludeMissing
                fun data(data: JsonField<Data>) = apply { this.data = data }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Code =
                    Code(
                        type,
                        data,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            @JsonDeserialize(using = Data.Deserializer::class)
            @JsonSerialize(using = Data.Serializer::class)
            class Data
            private constructor(
                private val bundle: Bundle? = null,
                private val inline: Inline? = null,
                private val _json: JsonValue? = null,
            ) {

                private var validated: Boolean = false

                fun bundle(): Optional<Bundle> = Optional.ofNullable(bundle)

                fun inline(): Optional<Inline> = Optional.ofNullable(inline)

                fun isBundle(): Boolean = bundle != null

                fun isInline(): Boolean = inline != null

                fun asBundle(): Bundle = bundle.getOrThrow("bundle")

                fun asInline(): Inline = inline.getOrThrow("inline")

                fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                fun <T> accept(visitor: Visitor<T>): T {
                    return when {
                        bundle != null -> visitor.visitBundle(bundle)
                        inline != null -> visitor.visitInline(inline)
                        else -> visitor.unknown(_json)
                    }
                }

                fun validate(): Data = apply {
                    if (!validated) {
                        if (bundle == null && inline == null) {
                            throw BraintrustInvalidDataException("Unknown Data: $_json")
                        }
                        inline?.validate()
                        validated = true
                    }
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Data && this.bundle == other.bundle && this.inline == other.inline /* spotless:on */
                }

                override fun hashCode(): Int {
                    return /* spotless:off */ Objects.hash(bundle, inline) /* spotless:on */
                }

                override fun toString(): String {
                    return when {
                        bundle != null -> "Data{bundle=$bundle}"
                        inline != null -> "Data{inline=$inline}"
                        _json != null -> "Data{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid Data")
                    }
                }

                companion object {

                    @JvmStatic fun ofBundle(bundle: Bundle) = Data(bundle = bundle)

                    @JvmStatic fun ofInline(inline: Inline) = Data(inline = inline)
                }

                interface Visitor<out T> {

                    fun visitBundle(bundle: Bundle): T

                    fun visitInline(inline: Inline): T

                    fun unknown(json: JsonValue?): T {
                        throw BraintrustInvalidDataException("Unknown Data: $json")
                    }
                }

                class Deserializer : BaseDeserializer<Data>(Data::class) {

                    override fun ObjectCodec.deserialize(node: JsonNode): Data {
                        val json = JsonValue.fromJsonNode(node)

                        tryDeserialize(node, jacksonTypeRef<Bundle>())?.let {
                            return Data(bundle = it, _json = json)
                        }
                        tryDeserialize(node, jacksonTypeRef<Inline>()) { it.validate() }
                            ?.let {
                                return Data(inline = it, _json = json)
                            }

                        return Data(_json = json)
                    }
                }

                class Serializer : BaseSerializer<Data>(Data::class) {

                    override fun serialize(
                        value: Data,
                        generator: JsonGenerator,
                        provider: SerializerProvider
                    ) {
                        when {
                            value.bundle != null -> generator.writeObject(value.bundle)
                            value.inline != null -> generator.writeObject(value.inline)
                            value._json != null -> generator.writeObject(value._json)
                            else -> throw IllegalStateException("Invalid Data")
                        }
                    }
                }

                @JsonDeserialize(builder = Bundle.Builder::class)
                @NoAutoDetect
                class Bundle
                private constructor(
                    private val runtimeContext: JsonField<RuntimeContext>,
                    private val location: JsonField<Location>,
                    private val bundleId: JsonField<String>,
                    private val preview: JsonField<String>,
                    private val type: JsonField<Type>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    fun runtimeContext(): RuntimeContext =
                        runtimeContext.getRequired("runtime_context")

                    fun location(): Location = location.getRequired("location")

                    fun bundleId(): String = bundleId.getRequired("bundle_id")

                    /** A preview of the code */
                    fun preview(): Optional<String> =
                        Optional.ofNullable(preview.getNullable("preview"))

                    fun type(): Type = type.getRequired("type")

                    fun toCodeBundle(): CodeBundle =
                        CodeBundle.builder()
                            .runtimeContext(runtimeContext)
                            .location(location)
                            .bundleId(bundleId)
                            .preview(preview)
                            .build()

                    @JsonProperty("runtime_context")
                    @ExcludeMissing
                    fun _runtimeContext() = runtimeContext

                    @JsonProperty("location") @ExcludeMissing fun _location() = location

                    @JsonProperty("bundle_id") @ExcludeMissing fun _bundleId() = bundleId

                    /** A preview of the code */
                    @JsonProperty("preview") @ExcludeMissing fun _preview() = preview

                    @JsonProperty("type") @ExcludeMissing fun _type() = type

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): Bundle = apply {
                        if (!validated) {
                            runtimeContext().validate()
                            location()
                            bundleId()
                            preview()
                            type()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var runtimeContext: JsonField<RuntimeContext> = JsonMissing.of()
                        private var location: JsonField<Location> = JsonMissing.of()
                        private var bundleId: JsonField<String> = JsonMissing.of()
                        private var preview: JsonField<String> = JsonMissing.of()
                        private var type: JsonField<Type> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(bundle: Bundle) = apply {
                            this.runtimeContext = bundle.runtimeContext
                            this.location = bundle.location
                            this.bundleId = bundle.bundleId
                            this.preview = bundle.preview
                            this.type = bundle.type
                            additionalProperties(bundle.additionalProperties)
                        }

                        fun runtimeContext(runtimeContext: RuntimeContext) =
                            runtimeContext(JsonField.of(runtimeContext))

                        @JsonProperty("runtime_context")
                        @ExcludeMissing
                        fun runtimeContext(runtimeContext: JsonField<RuntimeContext>) = apply {
                            this.runtimeContext = runtimeContext
                        }

                        fun location(location: Location) = location(JsonField.of(location))

                        @JsonProperty("location")
                        @ExcludeMissing
                        fun location(location: JsonField<Location>) = apply {
                            this.location = location
                        }

                        fun bundleId(bundleId: String) = bundleId(JsonField.of(bundleId))

                        @JsonProperty("bundle_id")
                        @ExcludeMissing
                        fun bundleId(bundleId: JsonField<String>) = apply {
                            this.bundleId = bundleId
                        }

                        /** A preview of the code */
                        fun preview(preview: String) = preview(JsonField.of(preview))

                        /** A preview of the code */
                        @JsonProperty("preview")
                        @ExcludeMissing
                        fun preview(preview: JsonField<String>) = apply { this.preview = preview }

                        fun type(type: Type) = type(JsonField.of(type))

                        @JsonProperty("type")
                        @ExcludeMissing
                        fun type(type: JsonField<Type>) = apply { this.type = type }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): Bundle =
                            Bundle(
                                runtimeContext,
                                location,
                                bundleId,
                                preview,
                                type,
                                additionalProperties.toUnmodifiable(),
                            )
                    }

                    class Type
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) : Enum {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Type && this.value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()

                        companion object {

                            @JvmField val BUNDLE = Type(JsonField.of("bundle"))

                            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                        }

                        enum class Known {
                            BUNDLE,
                        }

                        enum class Value {
                            BUNDLE,
                            _UNKNOWN,
                        }

                        fun value(): Value =
                            when (this) {
                                BUNDLE -> Value.BUNDLE
                                else -> Value._UNKNOWN
                            }

                        fun known(): Known =
                            when (this) {
                                BUNDLE -> Known.BUNDLE
                                else -> throw BraintrustInvalidDataException("Unknown Type: $value")
                            }

                        fun asString(): String = _value().asStringOrThrow()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Bundle && this.runtimeContext == other.runtimeContext && this.location == other.location && this.bundleId == other.bundleId && this.preview == other.preview && this.type == other.type && this.additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    private var hashCode: Int = 0

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode = /* spotless:off */ Objects.hash(runtimeContext, location, bundleId, preview, type, additionalProperties) /* spotless:on */
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "Bundle{runtimeContext=$runtimeContext, location=$location, bundleId=$bundleId, preview=$preview, type=$type, additionalProperties=$additionalProperties}"
                }

                @JsonDeserialize(builder = Inline.Builder::class)
                @NoAutoDetect
                class Inline
                private constructor(
                    private val type: JsonField<Type>,
                    private val runtimeContext: JsonField<RuntimeContext>,
                    private val code: JsonField<String>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    fun type(): Type = type.getRequired("type")

                    fun runtimeContext(): RuntimeContext =
                        runtimeContext.getRequired("runtime_context")

                    fun code(): String = code.getRequired("code")

                    @JsonProperty("type") @ExcludeMissing fun _type() = type

                    @JsonProperty("runtime_context")
                    @ExcludeMissing
                    fun _runtimeContext() = runtimeContext

                    @JsonProperty("code") @ExcludeMissing fun _code() = code

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): Inline = apply {
                        if (!validated) {
                            type()
                            runtimeContext().validate()
                            code()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var type: JsonField<Type> = JsonMissing.of()
                        private var runtimeContext: JsonField<RuntimeContext> = JsonMissing.of()
                        private var code: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(inline: Inline) = apply {
                            this.type = inline.type
                            this.runtimeContext = inline.runtimeContext
                            this.code = inline.code
                            additionalProperties(inline.additionalProperties)
                        }

                        fun type(type: Type) = type(JsonField.of(type))

                        @JsonProperty("type")
                        @ExcludeMissing
                        fun type(type: JsonField<Type>) = apply { this.type = type }

                        fun runtimeContext(runtimeContext: RuntimeContext) =
                            runtimeContext(JsonField.of(runtimeContext))

                        @JsonProperty("runtime_context")
                        @ExcludeMissing
                        fun runtimeContext(runtimeContext: JsonField<RuntimeContext>) = apply {
                            this.runtimeContext = runtimeContext
                        }

                        fun code(code: String) = code(JsonField.of(code))

                        @JsonProperty("code")
                        @ExcludeMissing
                        fun code(code: JsonField<String>) = apply { this.code = code }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): Inline =
                            Inline(
                                type,
                                runtimeContext,
                                code,
                                additionalProperties.toUnmodifiable(),
                            )
                    }

                    @JsonDeserialize(builder = RuntimeContext.Builder::class)
                    @NoAutoDetect
                    class RuntimeContext
                    private constructor(
                        private val runtime: JsonField<Runtime>,
                        private val version: JsonField<String>,
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        private var validated: Boolean = false

                        fun runtime(): Runtime = runtime.getRequired("runtime")

                        fun version(): String = version.getRequired("version")

                        @JsonProperty("runtime") @ExcludeMissing fun _runtime() = runtime

                        @JsonProperty("version") @ExcludeMissing fun _version() = version

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun validate(): RuntimeContext = apply {
                            if (!validated) {
                                runtime()
                                version()
                                validated = true
                            }
                        }

                        fun toBuilder() = Builder().from(this)

                        companion object {

                            @JvmStatic fun builder() = Builder()
                        }

                        class Builder {

                            private var runtime: JsonField<Runtime> = JsonMissing.of()
                            private var version: JsonField<String> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(runtimeContext: RuntimeContext) = apply {
                                this.runtime = runtimeContext.runtime
                                this.version = runtimeContext.version
                                additionalProperties(runtimeContext.additionalProperties)
                            }

                            fun runtime(runtime: Runtime) = runtime(JsonField.of(runtime))

                            @JsonProperty("runtime")
                            @ExcludeMissing
                            fun runtime(runtime: JsonField<Runtime>) = apply {
                                this.runtime = runtime
                            }

                            fun version(version: String) = version(JsonField.of(version))

                            @JsonProperty("version")
                            @ExcludeMissing
                            fun version(version: JsonField<String>) = apply {
                                this.version = version
                            }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    this.additionalProperties.putAll(additionalProperties)
                                }

                            @JsonAnySetter
                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                this.additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun build(): RuntimeContext =
                                RuntimeContext(
                                    runtime,
                                    version,
                                    additionalProperties.toUnmodifiable(),
                                )
                        }

                        class Runtime
                        @JsonCreator
                        private constructor(
                            private val value: JsonField<String>,
                        ) : Enum {

                            @com.fasterxml.jackson.annotation.JsonValue
                            fun _value(): JsonField<String> = value

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return /* spotless:off */ other is Runtime && this.value == other.value /* spotless:on */
                            }

                            override fun hashCode() = value.hashCode()

                            override fun toString() = value.toString()

                            companion object {

                                @JvmField val NODE = Runtime(JsonField.of("node"))

                                @JvmField val PYTHON = Runtime(JsonField.of("python"))

                                @JvmStatic fun of(value: String) = Runtime(JsonField.of(value))
                            }

                            enum class Known {
                                NODE,
                                PYTHON,
                            }

                            enum class Value {
                                NODE,
                                PYTHON,
                                _UNKNOWN,
                            }

                            fun value(): Value =
                                when (this) {
                                    NODE -> Value.NODE
                                    PYTHON -> Value.PYTHON
                                    else -> Value._UNKNOWN
                                }

                            fun known(): Known =
                                when (this) {
                                    NODE -> Known.NODE
                                    PYTHON -> Known.PYTHON
                                    else ->
                                        throw BraintrustInvalidDataException(
                                            "Unknown Runtime: $value"
                                        )
                                }

                            fun asString(): String = _value().asStringOrThrow()
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is RuntimeContext && this.runtime == other.runtime && this.version == other.version && this.additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        private var hashCode: Int = 0

                        override fun hashCode(): Int {
                            if (hashCode == 0) {
                                hashCode = /* spotless:off */ Objects.hash(runtime, version, additionalProperties) /* spotless:on */
                            }
                            return hashCode
                        }

                        override fun toString() =
                            "RuntimeContext{runtime=$runtime, version=$version, additionalProperties=$additionalProperties}"
                    }

                    class Type
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) : Enum {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Type && this.value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()

                        companion object {

                            @JvmField val INLINE = Type(JsonField.of("inline"))

                            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                        }

                        enum class Known {
                            INLINE,
                        }

                        enum class Value {
                            INLINE,
                            _UNKNOWN,
                        }

                        fun value(): Value =
                            when (this) {
                                INLINE -> Value.INLINE
                                else -> Value._UNKNOWN
                            }

                        fun known(): Known =
                            when (this) {
                                INLINE -> Known.INLINE
                                else -> throw BraintrustInvalidDataException("Unknown Type: $value")
                            }

                        fun asString(): String = _value().asStringOrThrow()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Inline && this.type == other.type && this.runtimeContext == other.runtimeContext && this.code == other.code && this.additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    private var hashCode: Int = 0

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode = /* spotless:off */ Objects.hash(type, runtimeContext, code, additionalProperties) /* spotless:on */
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "Inline{type=$type, runtimeContext=$runtimeContext, code=$code, additionalProperties=$additionalProperties}"
                }
            }

            class Type
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Type && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    @JvmField val CODE = Type(JsonField.of("code"))

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                enum class Known {
                    CODE,
                }

                enum class Value {
                    CODE,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        CODE -> Value.CODE
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        CODE -> Known.CODE
                        else -> throw BraintrustInvalidDataException("Unknown Type: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Code && this.type == other.type && this.data == other.data && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(type, data, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "Code{type=$type, data=$data, additionalProperties=$additionalProperties}"
        }

        @JsonDeserialize(builder = Global.Builder::class)
        @NoAutoDetect
        class Global
        private constructor(
            private val type: JsonField<Type>,
            private val name: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            fun type(): Type = type.getRequired("type")

            fun name(): String = name.getRequired("name")

            @JsonProperty("type") @ExcludeMissing fun _type() = type

            @JsonProperty("name") @ExcludeMissing fun _name() = name

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Global = apply {
                if (!validated) {
                    type()
                    name()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var type: JsonField<Type> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(global: Global) = apply {
                    this.type = global.type
                    this.name = global.name
                    additionalProperties(global.additionalProperties)
                }

                fun type(type: Type) = type(JsonField.of(type))

                @JsonProperty("type")
                @ExcludeMissing
                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun name(name: String) = name(JsonField.of(name))

                @JsonProperty("name")
                @ExcludeMissing
                fun name(name: JsonField<String>) = apply { this.name = name }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Global =
                    Global(
                        type,
                        name,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class Type
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Type && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    @JvmField val GLOBAL = Type(JsonField.of("global"))

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                enum class Known {
                    GLOBAL,
                }

                enum class Value {
                    GLOBAL,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        GLOBAL -> Value.GLOBAL
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        GLOBAL -> Known.GLOBAL
                        else -> throw BraintrustInvalidDataException("Unknown Type: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Global && this.type == other.type && this.name == other.name && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(type, name, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "Global{type=$type, name=$name, additionalProperties=$additionalProperties}"
        }
    }

    /** JSON schema for the function's parameters and return type */
    @JsonDeserialize(builder = FunctionSchema.Builder::class)
    @NoAutoDetect
    class FunctionSchema
    private constructor(
        private val parameters: JsonValue?,
        private val returns: JsonValue?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonProperty("parameters") fun parameters(): JsonValue? = parameters

        @JsonProperty("returns") fun returns(): JsonValue? = returns

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var parameters: JsonValue? = null
            private var returns: JsonValue? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(functionSchema: FunctionSchema) = apply {
                this.parameters = functionSchema.parameters
                this.returns = functionSchema.returns
                additionalProperties(functionSchema.additionalProperties)
            }

            @JsonProperty("parameters")
            fun parameters(parameters: JsonValue) = apply { this.parameters = parameters }

            @JsonProperty("returns")
            fun returns(returns: JsonValue) = apply { this.returns = returns }

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

            fun build(): FunctionSchema =
                FunctionSchema(
                    parameters,
                    returns,
                    additionalProperties.toUnmodifiable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is FunctionSchema && this.parameters == other.parameters && this.returns == other.returns && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(parameters, returns, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "FunctionSchema{parameters=$parameters, returns=$returns, additionalProperties=$additionalProperties}"
    }

    class FunctionType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is FunctionType && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val LLM = FunctionType(JsonField.of("llm"))

            @JvmField val SCORER = FunctionType(JsonField.of("scorer"))

            @JvmField val TASK = FunctionType(JsonField.of("task"))

            @JvmField val TOOL = FunctionType(JsonField.of("tool"))

            @JvmStatic fun of(value: String) = FunctionType(JsonField.of(value))
        }

        enum class Known {
            LLM,
            SCORER,
            TASK,
            TOOL,
        }

        enum class Value {
            LLM,
            SCORER,
            TASK,
            TOOL,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                LLM -> Value.LLM
                SCORER -> Value.SCORER
                TASK -> Value.TASK
                TOOL -> Value.TOOL
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                LLM -> Known.LLM
                SCORER -> Known.SCORER
                TASK -> Known.TASK
                TOOL -> Known.TOOL
                else -> throw BraintrustInvalidDataException("Unknown FunctionType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    @JsonDeserialize(builder = Origin.Builder::class)
    @NoAutoDetect
    class Origin
    private constructor(
        private val objectType: ObjectType?,
        private val objectId: String?,
        private val internal_: Boolean?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The object type that the ACL applies to */
        @JsonProperty("object_type") fun objectType(): ObjectType? = objectType

        /** Id of the object the function is originating from */
        @JsonProperty("object_id") fun objectId(): String? = objectId

        /**
         * The function exists for internal purposes and should not be displayed in the list of
         * functions.
         */
        @JsonProperty("internal") fun internal_(): Boolean? = internal_

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var objectType: ObjectType? = null
            private var objectId: String? = null
            private var internal_: Boolean? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(origin: Origin) = apply {
                this.objectType = origin.objectType
                this.objectId = origin.objectId
                this.internal_ = origin.internal_
                additionalProperties(origin.additionalProperties)
            }

            /** The object type that the ACL applies to */
            @JsonProperty("object_type")
            fun objectType(objectType: ObjectType) = apply { this.objectType = objectType }

            /** Id of the object the function is originating from */
            @JsonProperty("object_id")
            fun objectId(objectId: String) = apply { this.objectId = objectId }

            /**
             * The function exists for internal purposes and should not be displayed in the list of
             * functions.
             */
            @JsonProperty("internal")
            fun internal_(internal_: Boolean) = apply { this.internal_ = internal_ }

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

            fun build(): Origin =
                Origin(
                    checkNotNull(objectType) { "`objectType` is required but was not set" },
                    checkNotNull(objectId) { "`objectId` is required but was not set" },
                    internal_,
                    additionalProperties.toUnmodifiable(),
                )
        }

        class ObjectType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ObjectType && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val ORGANIZATION = ObjectType(JsonField.of("organization"))

                @JvmField val PROJECT = ObjectType(JsonField.of("project"))

                @JvmField val EXPERIMENT = ObjectType(JsonField.of("experiment"))

                @JvmField val DATASET = ObjectType(JsonField.of("dataset"))

                @JvmField val PROMPT = ObjectType(JsonField.of("prompt"))

                @JvmField val PROMPT_SESSION = ObjectType(JsonField.of("prompt_session"))

                @JvmField val GROUP = ObjectType(JsonField.of("group"))

                @JvmField val ROLE = ObjectType(JsonField.of("role"))

                @JvmField val ORG_MEMBER = ObjectType(JsonField.of("org_member"))

                @JvmField val PROJECT_LOG = ObjectType(JsonField.of("project_log"))

                @JvmField val ORG_PROJECT = ObjectType(JsonField.of("org_project"))

                @JvmStatic fun of(value: String) = ObjectType(JsonField.of(value))
            }

            enum class Known {
                ORGANIZATION,
                PROJECT,
                EXPERIMENT,
                DATASET,
                PROMPT,
                PROMPT_SESSION,
                GROUP,
                ROLE,
                ORG_MEMBER,
                PROJECT_LOG,
                ORG_PROJECT,
            }

            enum class Value {
                ORGANIZATION,
                PROJECT,
                EXPERIMENT,
                DATASET,
                PROMPT,
                PROMPT_SESSION,
                GROUP,
                ROLE,
                ORG_MEMBER,
                PROJECT_LOG,
                ORG_PROJECT,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    ORGANIZATION -> Value.ORGANIZATION
                    PROJECT -> Value.PROJECT
                    EXPERIMENT -> Value.EXPERIMENT
                    DATASET -> Value.DATASET
                    PROMPT -> Value.PROMPT
                    PROMPT_SESSION -> Value.PROMPT_SESSION
                    GROUP -> Value.GROUP
                    ROLE -> Value.ROLE
                    ORG_MEMBER -> Value.ORG_MEMBER
                    PROJECT_LOG -> Value.PROJECT_LOG
                    ORG_PROJECT -> Value.ORG_PROJECT
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    ORGANIZATION -> Known.ORGANIZATION
                    PROJECT -> Known.PROJECT
                    EXPERIMENT -> Known.EXPERIMENT
                    DATASET -> Known.DATASET
                    PROMPT -> Known.PROMPT
                    PROMPT_SESSION -> Known.PROMPT_SESSION
                    GROUP -> Known.GROUP
                    ROLE -> Known.ROLE
                    ORG_MEMBER -> Known.ORG_MEMBER
                    PROJECT_LOG -> Known.PROJECT_LOG
                    ORG_PROJECT -> Known.ORG_PROJECT
                    else -> throw BraintrustInvalidDataException("Unknown ObjectType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Origin && this.objectType == other.objectType && this.objectId == other.objectId && this.internal_ == other.internal_ && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(objectType, objectId, internal_, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "Origin{objectType=$objectType, objectId=$objectId, internal_=$internal_, additionalProperties=$additionalProperties}"
    }
}
