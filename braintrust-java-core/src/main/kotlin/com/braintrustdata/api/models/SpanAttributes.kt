// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.Enum
import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.toImmutable
import com.braintrustdata.api.errors.BraintrustInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import java.util.Objects
import java.util.Optional

/** Human-identifying attributes of the span, such as name, type, etc. */
@JsonDeserialize(builder = SpanAttributes.Builder::class)
@NoAutoDetect
class SpanAttributes
private constructor(
    private val name: JsonField<String>,
    private val type: JsonField<Type>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /** Name of the span, for display purposes only */
    fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

    /** Type of the span, for display purposes only */
    fun type(): Optional<Type> = Optional.ofNullable(type.getNullable("type"))

    /** Name of the span, for display purposes only */
    @JsonProperty("name") @ExcludeMissing fun _name() = name

    /** Type of the span, for display purposes only */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): SpanAttributes = apply {
        if (!validated) {
            name()
            type()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var name: JsonField<String> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(spanAttributes: SpanAttributes) = apply {
            this.name = spanAttributes.name
            this.type = spanAttributes.type
            additionalProperties(spanAttributes.additionalProperties)
        }

        /** Name of the span, for display purposes only */
        fun name(name: String) = name(JsonField.of(name))

        /** Name of the span, for display purposes only */
        @JsonProperty("name")
        @ExcludeMissing
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Type of the span, for display purposes only */
        fun type(type: Type) = type(JsonField.of(type))

        /** Type of the span, for display purposes only */
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

        fun build(): SpanAttributes =
            SpanAttributes(
                name,
                type,
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

            return /* spotless:off */ other is Type && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val LLM = Type(JsonField.of("llm"))

            @JvmField val SCORE = Type(JsonField.of("score"))

            @JvmField val FUNCTION = Type(JsonField.of("function"))

            @JvmField val EVAL = Type(JsonField.of("eval"))

            @JvmField val TASK = Type(JsonField.of("task"))

            @JvmField val TOOL = Type(JsonField.of("tool"))

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            LLM,
            SCORE,
            FUNCTION,
            EVAL,
            TASK,
            TOOL,
        }

        enum class Value {
            LLM,
            SCORE,
            FUNCTION,
            EVAL,
            TASK,
            TOOL,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                LLM -> Value.LLM
                SCORE -> Value.SCORE
                FUNCTION -> Value.FUNCTION
                EVAL -> Value.EVAL
                TASK -> Value.TASK
                TOOL -> Value.TOOL
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                LLM -> Known.LLM
                SCORE -> Known.SCORE
                FUNCTION -> Known.FUNCTION
                EVAL -> Known.EVAL
                TASK -> Known.TASK
                TOOL -> Known.TOOL
                else -> throw BraintrustInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SpanAttributes && name == other.name && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(name, type, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SpanAttributes{name=$name, type=$type, additionalProperties=$additionalProperties}"
}
