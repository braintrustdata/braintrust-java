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
import com.braintrustdata.api.core.toImmutable
import com.braintrustdata.api.errors.BraintrustInvalidDataException
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

@JsonDeserialize(using = ToolChoice.Deserializer::class)
@JsonSerialize(using = ToolChoice.Serializer::class)
class ToolChoice
private constructor(
    private val auto: Auto? = null,
    private val none: None? = null,
    private val function: Function? = null,
    private val _json: JsonValue? = null,
) {

    private var validated: Boolean = false

    fun auto(): Optional<Auto> = Optional.ofNullable(auto)

    fun none(): Optional<None> = Optional.ofNullable(none)

    fun function(): Optional<Function> = Optional.ofNullable(function)

    fun isAuto(): Boolean = auto != null

    fun isNone(): Boolean = none != null

    fun isFunction(): Boolean = function != null

    fun asAuto(): Auto = auto.getOrThrow("auto")

    fun asNone(): None = none.getOrThrow("none")

    fun asFunction(): Function = function.getOrThrow("function")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    fun <T> accept(visitor: Visitor<T>): T {
        return when {
            auto != null -> visitor.visitAuto(auto)
            none != null -> visitor.visitNone(none)
            function != null -> visitor.visitFunction(function)
            else -> visitor.unknown(_json)
        }
    }

    fun validate(): ToolChoice = apply {
        if (!validated) {
            if (auto == null && none == null && function == null) {
                throw BraintrustInvalidDataException("Unknown ToolChoice: $_json")
            }
            function?.validate()
            validated = true
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ToolChoice && this.auto == other.auto && this.none == other.none && this.function == other.function /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(auto, none, function) /* spotless:on */
    }

    override fun toString(): String {
        return when {
            auto != null -> "ToolChoice{auto=$auto}"
            none != null -> "ToolChoice{none=$none}"
            function != null -> "ToolChoice{function=$function}"
            _json != null -> "ToolChoice{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid ToolChoice")
        }
    }

    companion object {

        @JvmStatic fun ofAuto(auto: Auto) = ToolChoice(auto = auto)

        @JvmStatic fun ofNone(none: None) = ToolChoice(none = none)

        @JvmStatic fun ofFunction(function: Function) = ToolChoice(function = function)
    }

    interface Visitor<out T> {

        fun visitAuto(auto: Auto): T

        fun visitNone(none: None): T

        fun visitFunction(function: Function): T

        fun unknown(json: JsonValue?): T {
            throw BraintrustInvalidDataException("Unknown ToolChoice: $json")
        }
    }

    class Deserializer : BaseDeserializer<ToolChoice>(ToolChoice::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): ToolChoice {
            val json = JsonValue.fromJsonNode(node)

            tryDeserialize(node, jacksonTypeRef<Auto>())?.let {
                return ToolChoice(auto = it, _json = json)
            }
            tryDeserialize(node, jacksonTypeRef<None>())?.let {
                return ToolChoice(none = it, _json = json)
            }
            tryDeserialize(node, jacksonTypeRef<Function>()) { it.validate() }
                ?.let {
                    return ToolChoice(function = it, _json = json)
                }

            return ToolChoice(_json = json)
        }
    }

    class Serializer : BaseSerializer<ToolChoice>(ToolChoice::class) {

        override fun serialize(
            value: ToolChoice,
            generator: JsonGenerator,
            provider: SerializerProvider
        ) {
            when {
                value.auto != null -> generator.writeObject(value.auto)
                value.none != null -> generator.writeObject(value.none)
                value.function != null -> generator.writeObject(value.function)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid ToolChoice")
            }
        }
    }

    class Auto
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Auto && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val AUTO = Auto(JsonField.of("auto"))

            @JvmStatic fun of(value: String) = Auto(JsonField.of(value))
        }

        enum class Known {
            AUTO,
        }

        enum class Value {
            AUTO,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                AUTO -> Value.AUTO
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                AUTO -> Known.AUTO
                else -> throw BraintrustInvalidDataException("Unknown Auto: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    class None
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is None && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val NONE = None(JsonField.of("none"))

            @JvmStatic fun of(value: String) = None(JsonField.of(value))
        }

        enum class Known {
            NONE,
        }

        enum class Value {
            NONE,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                NONE -> Value.NONE
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                NONE -> Known.NONE
                else -> throw BraintrustInvalidDataException("Unknown None: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    @JsonDeserialize(builder = Function.Builder::class)
    @NoAutoDetect
    class Function
    private constructor(
        private val type: JsonField<Type>,
        private val function: JsonField<FunctionToolChoice>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun type(): Type = type.getRequired("type")

        fun function(): FunctionToolChoice = function.getRequired("function")

        @JsonProperty("type") @ExcludeMissing fun _type() = type

        @JsonProperty("function") @ExcludeMissing fun _function() = function

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Function = apply {
            if (!validated) {
                type()
                function().validate()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var type: JsonField<Type> = JsonMissing.of()
            private var function: JsonField<FunctionToolChoice> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(function: Function) = apply {
                this.type = function.type
                this.function = function.function
                additionalProperties(function.additionalProperties)
            }

            fun type(type: Type) = type(JsonField.of(type))

            @JsonProperty("type")
            @ExcludeMissing
            fun type(type: JsonField<Type>) = apply { this.type = type }

            fun function(function: FunctionToolChoice) = function(JsonField.of(function))

            @JsonProperty("function")
            @ExcludeMissing
            fun function(function: JsonField<FunctionToolChoice>) = apply {
                this.function = function
            }

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

            fun build(): Function =
                Function(
                    type,
                    function,
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

                @JvmField val FUNCTION = Type(JsonField.of("function"))

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            enum class Known {
                FUNCTION,
            }

            enum class Value {
                FUNCTION,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    FUNCTION -> Value.FUNCTION
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    FUNCTION -> Known.FUNCTION
                    else -> throw BraintrustInvalidDataException("Unknown Type: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Function && this.type == other.type && this.function == other.function && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(type, function, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "Function{type=$type, function=$function, additionalProperties=$additionalProperties}"
    }
}
