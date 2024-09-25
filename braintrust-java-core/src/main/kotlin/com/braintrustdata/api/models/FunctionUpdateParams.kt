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

class FunctionUpdateParams
constructor(
    private val functionId: String,
    private val description: String?,
    private val functionData: FunctionData?,
    private val name: String?,
    private val promptData: PromptData?,
    private val tags: List<String>?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun functionId(): String = functionId

    fun description(): Optional<String> = Optional.ofNullable(description)

    fun functionData(): Optional<FunctionData> = Optional.ofNullable(functionData)

    fun name(): Optional<String> = Optional.ofNullable(name)

    fun promptData(): Optional<PromptData> = Optional.ofNullable(promptData)

    fun tags(): Optional<List<String>> = Optional.ofNullable(tags)

    @JvmSynthetic
    internal fun getBody(): FunctionUpdateBody {
        return FunctionUpdateBody(
            description,
            functionData,
            name,
            promptData,
            tags,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> functionId
            else -> ""
        }
    }

    @JsonDeserialize(builder = FunctionUpdateBody.Builder::class)
    @NoAutoDetect
    class FunctionUpdateBody
    internal constructor(
        private val description: String?,
        private val functionData: FunctionData?,
        private val name: String?,
        private val promptData: PromptData?,
        private val tags: List<String>?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** Textual description of the prompt */
        @JsonProperty("description") fun description(): String? = description

        @JsonProperty("function_data") fun functionData(): FunctionData? = functionData

        /** Name of the prompt */
        @JsonProperty("name") fun name(): String? = name

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

            return other is FunctionUpdateBody &&
                this.description == other.description &&
                this.functionData == other.functionData &&
                this.name == other.name &&
                this.promptData == other.promptData &&
                this.tags == other.tags &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        description,
                        functionData,
                        name,
                        promptData,
                        tags,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "FunctionUpdateBody{description=$description, functionData=$functionData, name=$name, promptData=$promptData, tags=$tags, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var description: String? = null
            private var functionData: FunctionData? = null
            private var name: String? = null
            private var promptData: PromptData? = null
            private var tags: List<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(functionUpdateBody: FunctionUpdateBody) = apply {
                this.description = functionUpdateBody.description
                this.functionData = functionUpdateBody.functionData
                this.name = functionUpdateBody.name
                this.promptData = functionUpdateBody.promptData
                this.tags = functionUpdateBody.tags
                additionalProperties(functionUpdateBody.additionalProperties)
            }

            /** Textual description of the prompt */
            @JsonProperty("description")
            fun description(description: String) = apply { this.description = description }

            @JsonProperty("function_data")
            fun functionData(functionData: FunctionData) = apply {
                this.functionData = functionData
            }

            /** Name of the prompt */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

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

            fun build(): FunctionUpdateBody =
                FunctionUpdateBody(
                    description,
                    functionData,
                    name,
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

        return other is FunctionUpdateParams &&
            this.functionId == other.functionId &&
            this.description == other.description &&
            this.functionData == other.functionData &&
            this.name == other.name &&
            this.promptData == other.promptData &&
            this.tags == other.tags &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            functionId,
            description,
            functionData,
            name,
            promptData,
            tags,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "FunctionUpdateParams{functionId=$functionId, description=$description, functionData=$functionData, name=$name, promptData=$promptData, tags=$tags, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var functionId: String? = null
        private var description: String? = null
        private var functionData: FunctionData? = null
        private var name: String? = null
        private var promptData: PromptData? = null
        private var tags: MutableList<String> = mutableListOf()
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(functionUpdateParams: FunctionUpdateParams) = apply {
            this.functionId = functionUpdateParams.functionId
            this.description = functionUpdateParams.description
            this.functionData = functionUpdateParams.functionData
            this.name = functionUpdateParams.name
            this.promptData = functionUpdateParams.promptData
            this.tags(functionUpdateParams.tags ?: listOf())
            additionalQueryParams(functionUpdateParams.additionalQueryParams)
            additionalHeaders(functionUpdateParams.additionalHeaders)
            additionalBodyProperties(functionUpdateParams.additionalBodyProperties)
        }

        /** Function id */
        fun functionId(functionId: String) = apply { this.functionId = functionId }

        /** Textual description of the prompt */
        fun description(description: String) = apply { this.description = description }

        fun functionData(functionData: FunctionData) = apply { this.functionData = functionData }

        fun functionData(prompt: FunctionData.Prompt) = apply {
            this.functionData = FunctionData.ofPrompt(prompt)
        }

        fun functionData(code: Code) = apply { this.functionData = FunctionData.ofCode(code) }

        fun functionData(global: FunctionData.Global) = apply {
            this.functionData = FunctionData.ofGlobal(global)
        }

        fun functionData(nullableVariant: FunctionData.NullableVariant) = apply {
            this.functionData = FunctionData.ofNullableVariant(nullableVariant)
        }

        /** Name of the prompt */
        fun name(name: String) = apply { this.name = name }

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

        fun build(): FunctionUpdateParams =
            FunctionUpdateParams(
                checkNotNull(functionId) { "`functionId` is required but was not set" },
                description,
                functionData,
                name,
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
        private val nullableVariant: NullableVariant? = null,
        private val _json: JsonValue? = null,
    ) {

        private var validated: Boolean = false

        fun prompt(): Optional<Prompt> = Optional.ofNullable(prompt)

        fun code(): Optional<Code> = Optional.ofNullable(code)

        fun global(): Optional<Global> = Optional.ofNullable(global)

        fun nullableVariant(): Optional<NullableVariant> = Optional.ofNullable(nullableVariant)

        fun isPrompt(): Boolean = prompt != null

        fun isCode(): Boolean = code != null

        fun isGlobal(): Boolean = global != null

        fun isNullableVariant(): Boolean = nullableVariant != null

        fun asPrompt(): Prompt = prompt.getOrThrow("prompt")

        fun asCode(): Code = code.getOrThrow("code")

        fun asGlobal(): Global = global.getOrThrow("global")

        fun asNullableVariant(): NullableVariant = nullableVariant.getOrThrow("nullableVariant")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                prompt != null -> visitor.visitPrompt(prompt)
                code != null -> visitor.visitCode(code)
                global != null -> visitor.visitGlobal(global)
                nullableVariant != null -> visitor.visitNullableVariant(nullableVariant)
                else -> visitor.unknown(_json)
            }
        }

        fun validate(): FunctionData = apply {
            if (!validated) {
                if (prompt == null && code == null && global == null && nullableVariant == null) {
                    throw BraintrustInvalidDataException("Unknown FunctionData: $_json")
                }
                prompt?.validate()
                code?.validate()
                global?.validate()
                nullableVariant?.validate()
                validated = true
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is FunctionData &&
                this.prompt == other.prompt &&
                this.code == other.code &&
                this.global == other.global &&
                this.nullableVariant == other.nullableVariant
        }

        override fun hashCode(): Int {
            return Objects.hash(
                prompt,
                code,
                global,
                nullableVariant,
            )
        }

        override fun toString(): String {
            return when {
                prompt != null -> "FunctionData{prompt=$prompt}"
                code != null -> "FunctionData{code=$code}"
                global != null -> "FunctionData{global=$global}"
                nullableVariant != null -> "FunctionData{nullableVariant=$nullableVariant}"
                _json != null -> "FunctionData{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid FunctionData")
            }
        }

        companion object {

            @JvmStatic fun ofPrompt(prompt: Prompt) = FunctionData(prompt = prompt)

            @JvmStatic fun ofCode(code: Code) = FunctionData(code = code)

            @JvmStatic fun ofGlobal(global: Global) = FunctionData(global = global)

            @JvmStatic
            fun ofNullableVariant(nullableVariant: NullableVariant) =
                FunctionData(nullableVariant = nullableVariant)
        }

        interface Visitor<out T> {

            fun visitPrompt(prompt: Prompt): T

            fun visitCode(code: Code): T

            fun visitGlobal(global: Global): T

            fun visitNullableVariant(nullableVariant: NullableVariant): T

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
                tryDeserialize(node, jacksonTypeRef<NullableVariant>()) { it.validate() }
                    ?.let {
                        return FunctionData(nullableVariant = it, _json = json)
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
                    value.nullableVariant != null -> generator.writeObject(value.nullableVariant)
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

            private var hashCode: Int = 0

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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Prompt &&
                    this.type == other.type &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = Objects.hash(type, additionalProperties)
                }
                return hashCode
            }

            override fun toString() =
                "Prompt{type=$type, additionalProperties=$additionalProperties}"

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

                    return other is Type && this.value == other.value
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

            private var hashCode: Int = 0

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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Global &&
                    this.type == other.type &&
                    this.name == other.name &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            type,
                            name,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Global{type=$type, name=$name, additionalProperties=$additionalProperties}"

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

                    return other is Type && this.value == other.value
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
        }

        @JsonDeserialize(builder = NullableVariant.Builder::class)
        @NoAutoDetect
        class NullableVariant
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): NullableVariant = apply {
                if (!validated) {
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is NullableVariant &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = Objects.hash(additionalProperties)
                }
                return hashCode
            }

            override fun toString() = "NullableVariant{additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(nullableVariant: NullableVariant) = apply {
                    additionalProperties(nullableVariant.additionalProperties)
                }

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

                fun build(): NullableVariant =
                    NullableVariant(additionalProperties.toUnmodifiable())
            }
        }
    }
}
