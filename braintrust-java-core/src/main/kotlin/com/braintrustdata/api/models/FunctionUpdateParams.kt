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
import com.braintrustdata.api.core.Params
import com.braintrustdata.api.core.checkRequired
import com.braintrustdata.api.core.getOrThrow
import com.braintrustdata.api.core.http.Headers
import com.braintrustdata.api.core.http.QueryParams
import com.braintrustdata.api.core.immutableEmptyMap
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

/**
 * Partially update a function object. Specify the fields to update in the payload. Any object-type
 * fields will be deep-merged with existing content. Currently we do not support removing fields or
 * setting them to null.
 */
class FunctionUpdateParams
private constructor(
    private val functionId: String,
    private val body: FunctionUpdateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Function id */
    fun functionId(): String = functionId

    /** Textual description of the prompt */
    fun description(): Optional<String> = body.description()

    fun functionData(): Optional<FunctionData> = body.functionData()

    /** Name of the prompt */
    fun name(): Optional<String> = body.name()

    /** The prompt, model, and its parameters */
    fun promptData(): Optional<PromptData> = body.promptData()

    /** A list of tags for the prompt */
    fun tags(): Optional<List<String>> = body.tags()

    /** Textual description of the prompt */
    fun _description(): JsonField<String> = body._description()

    fun _functionData(): JsonField<FunctionData> = body._functionData()

    /** Name of the prompt */
    fun _name(): JsonField<String> = body._name()

    /** The prompt, model, and its parameters */
    fun _promptData(): JsonField<PromptData> = body._promptData()

    /** A list of tags for the prompt */
    fun _tags(): JsonField<List<String>> = body._tags()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun _body(): FunctionUpdateBody = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> functionId
            else -> ""
        }
    }

    @NoAutoDetect
    class FunctionUpdateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("description")
        @ExcludeMissing
        private val description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("function_data")
        @ExcludeMissing
        private val functionData: JsonField<FunctionData> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("prompt_data")
        @ExcludeMissing
        private val promptData: JsonField<PromptData> = JsonMissing.of(),
        @JsonProperty("tags")
        @ExcludeMissing
        private val tags: JsonField<List<String>> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Textual description of the prompt */
        fun description(): Optional<String> =
            Optional.ofNullable(description.getNullable("description"))

        fun functionData(): Optional<FunctionData> =
            Optional.ofNullable(functionData.getNullable("function_data"))

        /** Name of the prompt */
        fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

        /** The prompt, model, and its parameters */
        fun promptData(): Optional<PromptData> =
            Optional.ofNullable(promptData.getNullable("prompt_data"))

        /** A list of tags for the prompt */
        fun tags(): Optional<List<String>> = Optional.ofNullable(tags.getNullable("tags"))

        /** Textual description of the prompt */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        @JsonProperty("function_data")
        @ExcludeMissing
        fun _functionData(): JsonField<FunctionData> = functionData

        /** Name of the prompt */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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

        fun validate(): FunctionUpdateBody = apply {
            if (validated) {
                return@apply
            }

            description()
            functionData().ifPresent { it.validate() }
            name()
            promptData().ifPresent { it.validate() }
            tags()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [FunctionUpdateBody]. */
        class Builder internal constructor() {

            private var description: JsonField<String> = JsonMissing.of()
            private var functionData: JsonField<FunctionData> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var promptData: JsonField<PromptData> = JsonMissing.of()
            private var tags: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(functionUpdateBody: FunctionUpdateBody) = apply {
                description = functionUpdateBody.description
                functionData = functionUpdateBody.functionData
                name = functionUpdateBody.name
                promptData = functionUpdateBody.promptData
                tags = functionUpdateBody.tags.map { it.toMutableList() }
                additionalProperties = functionUpdateBody.additionalProperties.toMutableMap()
            }

            /** Textual description of the prompt */
            fun description(description: String?) = description(JsonField.ofNullable(description))

            /** Textual description of the prompt */
            fun description(description: Optional<String>) = description(description.orElse(null))

            /** Textual description of the prompt */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            fun functionData(functionData: FunctionData) = functionData(JsonField.of(functionData))

            fun functionData(functionData: JsonField<FunctionData>) = apply {
                this.functionData = functionData
            }

            fun functionData(prompt: FunctionData.Prompt) =
                functionData(FunctionData.ofPrompt(prompt))

            fun functionData(code: FunctionData.Code) = functionData(FunctionData.ofCode(code))

            fun functionData(global: FunctionData.Global) =
                functionData(FunctionData.ofGlobal(global))

            fun functionData(nullableVariant: FunctionData.NullableVariant) =
                functionData(FunctionData.ofNullableVariant(nullableVariant))

            /** Name of the prompt */
            fun name(name: String?) = name(JsonField.ofNullable(name))

            /** Name of the prompt */
            fun name(name: Optional<String>) = name(name.orElse(null))

            /** Name of the prompt */
            fun name(name: JsonField<String>) = apply { this.name = name }

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

            fun build(): FunctionUpdateBody =
                FunctionUpdateBody(
                    description,
                    functionData,
                    name,
                    promptData,
                    (tags ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is FunctionUpdateBody && description == other.description && functionData == other.functionData && name == other.name && promptData == other.promptData && tags == other.tags && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(description, functionData, name, promptData, tags, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "FunctionUpdateBody{description=$description, functionData=$functionData, name=$name, promptData=$promptData, tags=$tags, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FunctionUpdateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var functionId: String? = null
        private var body: FunctionUpdateBody.Builder = FunctionUpdateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(functionUpdateParams: FunctionUpdateParams) = apply {
            functionId = functionUpdateParams.functionId
            body = functionUpdateParams.body.toBuilder()
            additionalHeaders = functionUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = functionUpdateParams.additionalQueryParams.toBuilder()
        }

        /** Function id */
        fun functionId(functionId: String) = apply { this.functionId = functionId }

        /** Textual description of the prompt */
        fun description(description: String?) = apply { body.description(description) }

        /** Textual description of the prompt */
        fun description(description: Optional<String>) = description(description.orElse(null))

        /** Textual description of the prompt */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        fun functionData(functionData: FunctionData) = apply { body.functionData(functionData) }

        fun functionData(functionData: JsonField<FunctionData>) = apply {
            body.functionData(functionData)
        }

        fun functionData(prompt: FunctionData.Prompt) = apply { body.functionData(prompt) }

        fun functionData(code: FunctionData.Code) = apply { body.functionData(code) }

        fun functionData(global: FunctionData.Global) = apply { body.functionData(global) }

        fun functionData(nullableVariant: FunctionData.NullableVariant) = apply {
            body.functionData(nullableVariant)
        }

        /** Name of the prompt */
        fun name(name: String?) = apply { body.name(name) }

        /** Name of the prompt */
        fun name(name: Optional<String>) = name(name.orElse(null))

        /** Name of the prompt */
        fun name(name: JsonField<String>) = apply { body.name(name) }

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

        fun build(): FunctionUpdateParams =
            FunctionUpdateParams(
                checkRequired("functionId", functionId),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
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

        private var validated: Boolean = false

        fun validate(): FunctionData = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitPrompt(prompt: Prompt) {
                        prompt.validate()
                    }

                    override fun visitCode(code: Code) {
                        code.validate()
                    }

                    override fun visitGlobal(global: Global) {
                        global.validate()
                    }

                    override fun visitNullableVariant(nullableVariant: NullableVariant) {
                        nullableVariant.validate()
                    }
                }
            )
            validated = true
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is FunctionData && prompt == other.prompt && code == other.code && global == other.global && nullableVariant == other.nullableVariant /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(prompt, code, global, nullableVariant) /* spotless:on */

        override fun toString(): String =
            when {
                prompt != null -> "FunctionData{prompt=$prompt}"
                code != null -> "FunctionData{code=$code}"
                global != null -> "FunctionData{global=$global}"
                nullableVariant != null -> "FunctionData{nullableVariant=$nullableVariant}"
                _json != null -> "FunctionData{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid FunctionData")
            }

        companion object {

            @JvmStatic fun ofPrompt(prompt: Prompt) = FunctionData(prompt = prompt)

            @JvmStatic fun ofCode(code: Code) = FunctionData(code = code)

            @JvmStatic fun ofGlobal(global: Global) = FunctionData(global = global)

            @JvmStatic
            fun ofNullableVariant(nullableVariant: NullableVariant) =
                FunctionData(nullableVariant = nullableVariant)
        }

        /**
         * An interface that defines how to map each variant of [FunctionData] to a value of type
         * [T].
         */
        interface Visitor<out T> {

            fun visitPrompt(prompt: Prompt): T

            fun visitCode(code: Code): T

            fun visitGlobal(global: Global): T

            fun visitNullableVariant(nullableVariant: NullableVariant): T

            /**
             * Maps an unknown variant of [FunctionData] to a value of type [T].
             *
             * An instance of [FunctionData] can contain an unknown variant if it was deserialized
             * from data that doesn't match any known variant. For example, if the SDK is on an
             * older version than the API, then the API may respond with new variants that the SDK
             * is unaware of.
             *
             * @throws BraintrustInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw BraintrustInvalidDataException("Unknown FunctionData: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<FunctionData>(FunctionData::class) {

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

        internal class Serializer : BaseSerializer<FunctionData>(FunctionData::class) {

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

        @NoAutoDetect
        class Prompt
        @JsonCreator
        private constructor(
            @JsonProperty("type")
            @ExcludeMissing
            private val type: JsonField<Type> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun type(): Type = type.getRequired("type")

            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Prompt = apply {
                if (validated) {
                    return@apply
                }

                type()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Prompt]. */
            class Builder internal constructor() {

                private var type: JsonField<Type>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(prompt: Prompt) = apply {
                    type = prompt.type
                    additionalProperties = prompt.additionalProperties.toMutableMap()
                }

                fun type(type: Type) = type(JsonField.of(type))

                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): Prompt =
                    Prompt(checkRequired("type", type), additionalProperties.toImmutable())
            }

            class Type
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val PROMPT = of("prompt")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    PROMPT,
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    PROMPT,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        PROMPT -> Value.PROMPT
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws BraintrustInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        PROMPT -> Known.PROMPT
                        else -> throw BraintrustInvalidDataException("Unknown Type: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Type && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Prompt && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Prompt{type=$type, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class Code
        @JsonCreator
        private constructor(
            @JsonProperty("data")
            @ExcludeMissing
            private val data: JsonField<Data> = JsonMissing.of(),
            @JsonProperty("type")
            @ExcludeMissing
            private val type: JsonField<Type> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun data(): Data = data.getRequired("data")

            fun type(): Type = type.getRequired("type")

            @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<Data> = data

            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Code = apply {
                if (validated) {
                    return@apply
                }

                data().validate()
                type()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Code]. */
            class Builder internal constructor() {

                private var data: JsonField<Data>? = null
                private var type: JsonField<Type>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(code: Code) = apply {
                    data = code.data
                    type = code.type
                    additionalProperties = code.additionalProperties.toMutableMap()
                }

                fun data(data: Data) = data(JsonField.of(data))

                fun data(data: JsonField<Data>) = apply { this.data = data }

                fun data(bundle: Data.Bundle) = data(Data.ofBundle(bundle))

                fun data(inline: Data.Inline) = data(Data.ofInline(inline))

                fun type(type: Type) = type(JsonField.of(type))

                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): Code =
                    Code(
                        checkRequired("data", data),
                        checkRequired("type", type),
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

                private var validated: Boolean = false

                fun validate(): Data = apply {
                    if (validated) {
                        return@apply
                    }

                    accept(
                        object : Visitor<Unit> {
                            override fun visitBundle(bundle: Bundle) {
                                bundle.validate()
                            }

                            override fun visitInline(inline: Inline) {
                                inline.validate()
                            }
                        }
                    )
                    validated = true
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Data && bundle == other.bundle && inline == other.inline /* spotless:on */
                }

                override fun hashCode(): Int = /* spotless:off */ Objects.hash(bundle, inline) /* spotless:on */

                override fun toString(): String =
                    when {
                        bundle != null -> "Data{bundle=$bundle}"
                        inline != null -> "Data{inline=$inline}"
                        _json != null -> "Data{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid Data")
                    }

                companion object {

                    @JvmStatic fun ofBundle(bundle: Bundle) = Data(bundle = bundle)

                    @JvmStatic fun ofInline(inline: Inline) = Data(inline = inline)
                }

                /**
                 * An interface that defines how to map each variant of [Data] to a value of type
                 * [T].
                 */
                interface Visitor<out T> {

                    fun visitBundle(bundle: Bundle): T

                    fun visitInline(inline: Inline): T

                    /**
                     * Maps an unknown variant of [Data] to a value of type [T].
                     *
                     * An instance of [Data] can contain an unknown variant if it was deserialized
                     * from data that doesn't match any known variant. For example, if the SDK is on
                     * an older version than the API, then the API may respond with new variants
                     * that the SDK is unaware of.
                     *
                     * @throws BraintrustInvalidDataException in the default implementation.
                     */
                    fun unknown(json: JsonValue?): T {
                        throw BraintrustInvalidDataException("Unknown Data: $json")
                    }
                }

                internal class Deserializer : BaseDeserializer<Data>(Data::class) {

                    override fun ObjectCodec.deserialize(node: JsonNode): Data {
                        val json = JsonValue.fromJsonNode(node)

                        tryDeserialize(node, jacksonTypeRef<Bundle>()) { it.validate() }
                            ?.let {
                                return Data(bundle = it, _json = json)
                            }
                        tryDeserialize(node, jacksonTypeRef<Inline>()) { it.validate() }
                            ?.let {
                                return Data(inline = it, _json = json)
                            }

                        return Data(_json = json)
                    }
                }

                internal class Serializer : BaseSerializer<Data>(Data::class) {

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

                @NoAutoDetect
                class Bundle
                @JsonCreator
                private constructor(
                    @JsonProperty("bundle_id")
                    @ExcludeMissing
                    private val bundleId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("location")
                    @ExcludeMissing
                    private val location: JsonField<CodeBundle.Location> = JsonMissing.of(),
                    @JsonProperty("runtime_context")
                    @ExcludeMissing
                    private val runtimeContext: JsonField<CodeBundle.RuntimeContext> =
                        JsonMissing.of(),
                    @JsonProperty("preview")
                    @ExcludeMissing
                    private val preview: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("type")
                    @ExcludeMissing
                    private val type: JsonField<Type> = JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    fun bundleId(): String = bundleId.getRequired("bundle_id")

                    fun location(): CodeBundle.Location = location.getRequired("location")

                    fun runtimeContext(): CodeBundle.RuntimeContext =
                        runtimeContext.getRequired("runtime_context")

                    /** A preview of the code */
                    fun preview(): Optional<String> =
                        Optional.ofNullable(preview.getNullable("preview"))

                    fun type(): Type = type.getRequired("type")

                    @JsonProperty("bundle_id")
                    @ExcludeMissing
                    fun _bundleId(): JsonField<String> = bundleId

                    @JsonProperty("location")
                    @ExcludeMissing
                    fun _location(): JsonField<CodeBundle.Location> = location

                    @JsonProperty("runtime_context")
                    @ExcludeMissing
                    fun _runtimeContext(): JsonField<CodeBundle.RuntimeContext> = runtimeContext

                    /** A preview of the code */
                    @JsonProperty("preview")
                    @ExcludeMissing
                    fun _preview(): JsonField<String> = preview

                    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toCodeBundle(): CodeBundle =
                        CodeBundle.builder()
                            .bundleId(bundleId)
                            .location(location)
                            .runtimeContext(runtimeContext)
                            .preview(preview)
                            .build()

                    private var validated: Boolean = false

                    fun validate(): Bundle = apply {
                        if (validated) {
                            return@apply
                        }

                        bundleId()
                        location().validate()
                        runtimeContext().validate()
                        preview()
                        type()
                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Bundle]. */
                    class Builder internal constructor() {

                        private var bundleId: JsonField<String>? = null
                        private var location: JsonField<CodeBundle.Location>? = null
                        private var runtimeContext: JsonField<CodeBundle.RuntimeContext>? = null
                        private var preview: JsonField<String> = JsonMissing.of()
                        private var type: JsonField<Type>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(bundle: Bundle) = apply {
                            bundleId = bundle.bundleId
                            location = bundle.location
                            runtimeContext = bundle.runtimeContext
                            preview = bundle.preview
                            type = bundle.type
                            additionalProperties = bundle.additionalProperties.toMutableMap()
                        }

                        fun bundleId(bundleId: String) = bundleId(JsonField.of(bundleId))

                        fun bundleId(bundleId: JsonField<String>) = apply {
                            this.bundleId = bundleId
                        }

                        fun location(location: CodeBundle.Location) =
                            location(JsonField.of(location))

                        fun location(location: JsonField<CodeBundle.Location>) = apply {
                            this.location = location
                        }

                        fun location(experiment: CodeBundle.Location.Experiment) =
                            location(CodeBundle.Location.ofExperiment(experiment))

                        fun location(function: CodeBundle.Location.Function) =
                            location(CodeBundle.Location.ofFunction(function))

                        fun runtimeContext(runtimeContext: CodeBundle.RuntimeContext) =
                            runtimeContext(JsonField.of(runtimeContext))

                        fun runtimeContext(runtimeContext: JsonField<CodeBundle.RuntimeContext>) =
                            apply {
                                this.runtimeContext = runtimeContext
                            }

                        /** A preview of the code */
                        fun preview(preview: String?) = preview(JsonField.ofNullable(preview))

                        /** A preview of the code */
                        fun preview(preview: Optional<String>) = preview(preview.orElse(null))

                        /** A preview of the code */
                        fun preview(preview: JsonField<String>) = apply { this.preview = preview }

                        fun type(type: Type) = type(JsonField.of(type))

                        fun type(type: JsonField<Type>) = apply { this.type = type }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        fun build(): Bundle =
                            Bundle(
                                checkRequired("bundleId", bundleId),
                                checkRequired("location", location),
                                checkRequired("runtimeContext", runtimeContext),
                                preview,
                                checkRequired("type", type),
                                additionalProperties.toImmutable(),
                            )
                    }

                    class Type
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val BUNDLE = of("bundle")

                            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                        }

                        /** An enum containing [Type]'s known values. */
                        enum class Known {
                            BUNDLE,
                        }

                        /**
                         * An enum containing [Type]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [Type] can contain an unknown value in a couple of cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            BUNDLE,
                            /**
                             * An enum member indicating that [Type] was instantiated with an
                             * unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
                         */
                        fun value(): Value =
                            when (this) {
                                BUNDLE -> Value.BUNDLE
                                else -> Value._UNKNOWN
                            }

                        /**
                         * Returns an enum member corresponding to this class instance's value.
                         *
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws BraintrustInvalidDataException if this class instance's value is
                         *   a not a known member.
                         */
                        fun known(): Known =
                            when (this) {
                                BUNDLE -> Known.BUNDLE
                                else -> throw BraintrustInvalidDataException("Unknown Type: $value")
                            }

                        fun asString(): String = _value().asStringOrThrow()

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Type && value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Bundle && bundleId == other.bundleId && location == other.location && runtimeContext == other.runtimeContext && preview == other.preview && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(bundleId, location, runtimeContext, preview, type, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Bundle{bundleId=$bundleId, location=$location, runtimeContext=$runtimeContext, preview=$preview, type=$type, additionalProperties=$additionalProperties}"
                }

                @NoAutoDetect
                class Inline
                @JsonCreator
                private constructor(
                    @JsonProperty("code")
                    @ExcludeMissing
                    private val code: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("runtime_context")
                    @ExcludeMissing
                    private val runtimeContext: JsonField<RuntimeContext> = JsonMissing.of(),
                    @JsonProperty("type")
                    @ExcludeMissing
                    private val type: JsonField<Type> = JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    fun code(): String = code.getRequired("code")

                    fun runtimeContext(): RuntimeContext =
                        runtimeContext.getRequired("runtime_context")

                    fun type(): Type = type.getRequired("type")

                    @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

                    @JsonProperty("runtime_context")
                    @ExcludeMissing
                    fun _runtimeContext(): JsonField<RuntimeContext> = runtimeContext

                    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): Inline = apply {
                        if (validated) {
                            return@apply
                        }

                        code()
                        runtimeContext().validate()
                        type()
                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Inline]. */
                    class Builder internal constructor() {

                        private var code: JsonField<String>? = null
                        private var runtimeContext: JsonField<RuntimeContext>? = null
                        private var type: JsonField<Type>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(inline: Inline) = apply {
                            code = inline.code
                            runtimeContext = inline.runtimeContext
                            type = inline.type
                            additionalProperties = inline.additionalProperties.toMutableMap()
                        }

                        fun code(code: String) = code(JsonField.of(code))

                        fun code(code: JsonField<String>) = apply { this.code = code }

                        fun runtimeContext(runtimeContext: RuntimeContext) =
                            runtimeContext(JsonField.of(runtimeContext))

                        fun runtimeContext(runtimeContext: JsonField<RuntimeContext>) = apply {
                            this.runtimeContext = runtimeContext
                        }

                        fun type(type: Type) = type(JsonField.of(type))

                        fun type(type: JsonField<Type>) = apply { this.type = type }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        fun build(): Inline =
                            Inline(
                                checkRequired("code", code),
                                checkRequired("runtimeContext", runtimeContext),
                                checkRequired("type", type),
                                additionalProperties.toImmutable(),
                            )
                    }

                    @NoAutoDetect
                    class RuntimeContext
                    @JsonCreator
                    private constructor(
                        @JsonProperty("runtime")
                        @ExcludeMissing
                        private val runtime: JsonField<Runtime> = JsonMissing.of(),
                        @JsonProperty("version")
                        @ExcludeMissing
                        private val version: JsonField<String> = JsonMissing.of(),
                        @JsonAnySetter
                        private val additionalProperties: Map<String, JsonValue> =
                            immutableEmptyMap(),
                    ) {

                        fun runtime(): Runtime = runtime.getRequired("runtime")

                        fun version(): String = version.getRequired("version")

                        @JsonProperty("runtime")
                        @ExcludeMissing
                        fun _runtime(): JsonField<Runtime> = runtime

                        @JsonProperty("version")
                        @ExcludeMissing
                        fun _version(): JsonField<String> = version

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        private var validated: Boolean = false

                        fun validate(): RuntimeContext = apply {
                            if (validated) {
                                return@apply
                            }

                            runtime()
                            version()
                            validated = true
                        }

                        fun toBuilder() = Builder().from(this)

                        companion object {

                            @JvmStatic fun builder() = Builder()
                        }

                        /** A builder for [RuntimeContext]. */
                        class Builder internal constructor() {

                            private var runtime: JsonField<Runtime>? = null
                            private var version: JsonField<String>? = null
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(runtimeContext: RuntimeContext) = apply {
                                runtime = runtimeContext.runtime
                                version = runtimeContext.version
                                additionalProperties =
                                    runtimeContext.additionalProperties.toMutableMap()
                            }

                            fun runtime(runtime: Runtime) = runtime(JsonField.of(runtime))

                            fun runtime(runtime: JsonField<Runtime>) = apply {
                                this.runtime = runtime
                            }

                            fun version(version: String) = version(JsonField.of(version))

                            fun version(version: JsonField<String>) = apply {
                                this.version = version
                            }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

                            fun build(): RuntimeContext =
                                RuntimeContext(
                                    checkRequired("runtime", runtime),
                                    checkRequired("version", version),
                                    additionalProperties.toImmutable(),
                                )
                        }

                        class Runtime
                        @JsonCreator
                        private constructor(
                            private val value: JsonField<String>,
                        ) : Enum {

                            /**
                             * Returns this class instance's raw value.
                             *
                             * This is usually only useful if this instance was deserialized from
                             * data that doesn't match any known member, and you want to know that
                             * value. For example, if the SDK is on an older version than the API,
                             * then the API may respond with new members that the SDK is unaware of.
                             */
                            @com.fasterxml.jackson.annotation.JsonValue
                            fun _value(): JsonField<String> = value

                            companion object {

                                @JvmField val NODE = of("node")

                                @JvmField val PYTHON = of("python")

                                @JvmStatic fun of(value: String) = Runtime(JsonField.of(value))
                            }

                            /** An enum containing [Runtime]'s known values. */
                            enum class Known {
                                NODE,
                                PYTHON,
                            }

                            /**
                             * An enum containing [Runtime]'s known values, as well as an [_UNKNOWN]
                             * member.
                             *
                             * An instance of [Runtime] can contain an unknown value in a couple of
                             * cases:
                             * - It was deserialized from data that doesn't match any known member.
                             *   For example, if the SDK is on an older version than the API, then
                             *   the API may respond with new members that the SDK is unaware of.
                             * - It was constructed with an arbitrary value using the [of] method.
                             */
                            enum class Value {
                                NODE,
                                PYTHON,
                                /**
                                 * An enum member indicating that [Runtime] was instantiated with an
                                 * unknown value.
                                 */
                                _UNKNOWN,
                            }

                            /**
                             * Returns an enum member corresponding to this class instance's value,
                             * or [Value._UNKNOWN] if the class was instantiated with an unknown
                             * value.
                             *
                             * Use the [known] method instead if you're certain the value is always
                             * known or if you want to throw for the unknown case.
                             */
                            fun value(): Value =
                                when (this) {
                                    NODE -> Value.NODE
                                    PYTHON -> Value.PYTHON
                                    else -> Value._UNKNOWN
                                }

                            /**
                             * Returns an enum member corresponding to this class instance's value.
                             *
                             * Use the [value] method instead if you're uncertain the value is
                             * always known and don't want to throw for the unknown case.
                             *
                             * @throws BraintrustInvalidDataException if this class instance's value
                             *   is a not a known member.
                             */
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

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return /* spotless:off */ other is Runtime && value == other.value /* spotless:on */
                            }

                            override fun hashCode() = value.hashCode()

                            override fun toString() = value.toString()
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is RuntimeContext && runtime == other.runtime && version == other.version && additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        /* spotless:off */
                        private val hashCode: Int by lazy { Objects.hash(runtime, version, additionalProperties) }
                        /* spotless:on */

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "RuntimeContext{runtime=$runtime, version=$version, additionalProperties=$additionalProperties}"
                    }

                    class Type
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val INLINE = of("inline")

                            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                        }

                        /** An enum containing [Type]'s known values. */
                        enum class Known {
                            INLINE,
                        }

                        /**
                         * An enum containing [Type]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [Type] can contain an unknown value in a couple of cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            INLINE,
                            /**
                             * An enum member indicating that [Type] was instantiated with an
                             * unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
                         */
                        fun value(): Value =
                            when (this) {
                                INLINE -> Value.INLINE
                                else -> Value._UNKNOWN
                            }

                        /**
                         * Returns an enum member corresponding to this class instance's value.
                         *
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws BraintrustInvalidDataException if this class instance's value is
                         *   a not a known member.
                         */
                        fun known(): Known =
                            when (this) {
                                INLINE -> Known.INLINE
                                else -> throw BraintrustInvalidDataException("Unknown Type: $value")
                            }

                        fun asString(): String = _value().asStringOrThrow()

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Type && value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Inline && code == other.code && runtimeContext == other.runtimeContext && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(code, runtimeContext, type, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Inline{code=$code, runtimeContext=$runtimeContext, type=$type, additionalProperties=$additionalProperties}"
                }
            }

            class Type
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val CODE = of("code")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    CODE,
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    CODE,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        CODE -> Value.CODE
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws BraintrustInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        CODE -> Known.CODE
                        else -> throw BraintrustInvalidDataException("Unknown Type: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Type && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Code && data == other.data && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(data, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Code{data=$data, type=$type, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class Global
        @JsonCreator
        private constructor(
            @JsonProperty("name")
            @ExcludeMissing
            private val name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type")
            @ExcludeMissing
            private val type: JsonField<Type> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun name(): String = name.getRequired("name")

            fun type(): Type = type.getRequired("type")

            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Global = apply {
                if (validated) {
                    return@apply
                }

                name()
                type()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Global]. */
            class Builder internal constructor() {

                private var name: JsonField<String>? = null
                private var type: JsonField<Type>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(global: Global) = apply {
                    name = global.name
                    type = global.type
                    additionalProperties = global.additionalProperties.toMutableMap()
                }

                fun name(name: String) = name(JsonField.of(name))

                fun name(name: JsonField<String>) = apply { this.name = name }

                fun type(type: Type) = type(JsonField.of(type))

                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): Global =
                    Global(
                        checkRequired("name", name),
                        checkRequired("type", type),
                        additionalProperties.toImmutable(),
                    )
            }

            class Type
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val GLOBAL = of("global")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    GLOBAL,
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    GLOBAL,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        GLOBAL -> Value.GLOBAL
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws BraintrustInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        GLOBAL -> Known.GLOBAL
                        else -> throw BraintrustInvalidDataException("Unknown Type: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Type && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Global && name == other.name && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(name, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Global{name=$name, type=$type, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class NullableVariant
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): NullableVariant = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [NullableVariant]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(nullableVariant: NullableVariant) = apply {
                    additionalProperties = nullableVariant.additionalProperties.toMutableMap()
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): NullableVariant = NullableVariant(additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is NullableVariant && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "NullableVariant{additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is FunctionUpdateParams && functionId == other.functionId && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(functionId, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "FunctionUpdateParams{functionId=$functionId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
