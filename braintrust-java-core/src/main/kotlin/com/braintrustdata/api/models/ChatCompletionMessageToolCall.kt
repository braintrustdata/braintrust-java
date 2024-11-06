// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.Enum
import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.toUnmodifiable
import com.braintrustdata.api.errors.BraintrustInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import java.util.Objects

@JsonDeserialize(builder = ChatCompletionMessageToolCall.Builder::class)
@NoAutoDetect
class ChatCompletionMessageToolCall
private constructor(
    private val id: JsonField<String>,
    private val function: JsonField<Function>,
    private val type: JsonField<Type>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    fun id(): String = id.getRequired("id")

    fun function(): Function = function.getRequired("function")

    fun type(): Type = type.getRequired("type")

    @JsonProperty("id") @ExcludeMissing fun _id() = id

    @JsonProperty("function") @ExcludeMissing fun _function() = function

    @JsonProperty("type") @ExcludeMissing fun _type() = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): ChatCompletionMessageToolCall = apply {
        if (!validated) {
            id()
            function().validate()
            type()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var function: JsonField<Function> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(chatCompletionMessageToolCall: ChatCompletionMessageToolCall) = apply {
            this.id = chatCompletionMessageToolCall.id
            this.function = chatCompletionMessageToolCall.function
            this.type = chatCompletionMessageToolCall.type
            additionalProperties(chatCompletionMessageToolCall.additionalProperties)
        }

        fun id(id: String) = id(JsonField.of(id))

        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        fun function(function: Function) = function(JsonField.of(function))

        @JsonProperty("function")
        @ExcludeMissing
        fun function(function: JsonField<Function>) = apply { this.function = function }

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

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun build(): ChatCompletionMessageToolCall =
            ChatCompletionMessageToolCall(
                id,
                function,
                type,
                additionalProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(builder = Function.Builder::class)
    @NoAutoDetect
    class Function
    private constructor(
        private val arguments: JsonField<String>,
        private val name: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun arguments(): String = arguments.getRequired("arguments")

        fun name(): String = name.getRequired("name")

        @JsonProperty("arguments") @ExcludeMissing fun _arguments() = arguments

        @JsonProperty("name") @ExcludeMissing fun _name() = name

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Function = apply {
            if (!validated) {
                arguments()
                name()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var arguments: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(function: Function) = apply {
                this.arguments = function.arguments
                this.name = function.name
                additionalProperties(function.additionalProperties)
            }

            fun arguments(arguments: String) = arguments(JsonField.of(arguments))

            @JsonProperty("arguments")
            @ExcludeMissing
            fun arguments(arguments: JsonField<String>) = apply { this.arguments = arguments }

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

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): Function =
                Function(
                    arguments,
                    name,
                    additionalProperties.toUnmodifiable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Function && this.arguments == other.arguments && this.name == other.name && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(arguments, name, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "Function{arguments=$arguments, name=$name, additionalProperties=$additionalProperties}"
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

        return /* spotless:off */ other is ChatCompletionMessageToolCall && this.id == other.id && this.function == other.function && this.type == other.type && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(id, function, type, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() =
        "ChatCompletionMessageToolCall{id=$id, function=$function, type=$type, additionalProperties=$additionalProperties}"
}
