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
import com.braintrustdata.api.core.http.Headers
import com.braintrustdata.api.core.http.QueryParams
import com.braintrustdata.api.core.toImmutable
import com.braintrustdata.api.errors.BraintrustInvalidDataException
import com.braintrustdata.api.models.CodeBundle.*
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
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
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

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

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
                    tags?.toImmutable(),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is FunctionUpdateBody && this.description == other.description && this.functionData == other.functionData && this.name == other.name && this.promptData == other.promptData && this.tags == other.tags && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(description, functionData, name, promptData, tags, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "FunctionUpdateBody{description=$description, functionData=$functionData, name=$name, promptData=$promptData, tags=$tags, additionalProperties=$additionalProperties}"
    }

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is FunctionUpdateParams && this.functionId == other.functionId && this.description == other.description && this.functionData == other.functionData && this.name == other.name && this.promptData == other.promptData && this.tags == other.tags && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(functionId, description, functionData, name, promptData, tags, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "FunctionUpdateParams{functionId=$functionId, description=$description, functionData=$functionData, name=$name, promptData=$promptData, tags=$tags, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

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
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(functionUpdateParams: FunctionUpdateParams) = apply {
            this.functionId = functionUpdateParams.functionId
            this.description = functionUpdateParams.description
            this.functionData = functionUpdateParams.functionData
            this.name = functionUpdateParams.name
            this.promptData = functionUpdateParams.promptData
            this.tags(functionUpdateParams.tags ?: listOf())
            additionalHeaders(functionUpdateParams.additionalHeaders)
            additionalQueryParams(functionUpdateParams.additionalQueryParams)
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

        fun functionData(code: FunctionData.Code) = apply {
            this.functionData = FunctionData.ofCode(code)
        }

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

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            putAllAdditionalBodyProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply {
            additionalBodyProperties.remove(key)
        }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalBodyProperty)
        }

        fun build(): FunctionUpdateParams =
            FunctionUpdateParams(
                checkNotNull(functionId) { "`functionId` is required but was not set" },
                description,
                functionData,
                name,
                promptData,
                if (tags.size == 0) null else tags.toImmutable(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
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

            return /* spotless:off */ other is FunctionData && this.prompt == other.prompt && this.code == other.code && this.global == other.global && this.nullableVariant == other.nullableVariant /* spotless:on */
        }

        override fun hashCode(): Int {
            return /* spotless:off */ Objects.hash(prompt, code, global, nullableVariant) /* spotless:on */
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

                fun build(): Prompt = Prompt(type, additionalProperties.toImmutable())
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
                        additionalProperties.toImmutable(),
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
                                additionalProperties.toImmutable(),
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
                                additionalProperties.toImmutable(),
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
                                    additionalProperties.toImmutable(),
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
                        additionalProperties.toImmutable(),
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

        @JsonDeserialize(builder = NullableVariant.Builder::class)
        @NoAutoDetect
        class NullableVariant
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): NullableVariant = apply {
                if (!validated) {
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

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

                fun build(): NullableVariant = NullableVariant(additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is NullableVariant && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() = "NullableVariant{additionalProperties=$additionalProperties}"
        }
    }
}
