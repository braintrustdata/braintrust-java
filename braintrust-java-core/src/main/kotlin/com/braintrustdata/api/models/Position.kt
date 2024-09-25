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

@JsonDeserialize(using = Position.Deserializer::class)
@JsonSerialize(using = Position.Serializer::class)
class Position
private constructor(
    private val type: Type? = null,
    private val scorer: Scorer? = null,
    private val _json: JsonValue? = null,
) {

    private var validated: Boolean = false

    fun type(): Optional<Type> = Optional.ofNullable(type)

    fun scorer(): Optional<Scorer> = Optional.ofNullable(scorer)

    fun isType(): Boolean = type != null

    fun isScorer(): Boolean = scorer != null

    fun asType(): Type = type.getOrThrow("type")

    fun asScorer(): Scorer = scorer.getOrThrow("scorer")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    fun <T> accept(visitor: Visitor<T>): T {
        return when {
            type != null -> visitor.visitType(type)
            scorer != null -> visitor.visitScorer(scorer)
            else -> visitor.unknown(_json)
        }
    }

    fun validate(): Position = apply {
        if (!validated) {
            if (type == null && scorer == null) {
                throw BraintrustInvalidDataException("Unknown Position: $_json")
            }
            type?.validate()
            scorer?.validate()
            validated = true
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Position && this.type == other.type && this.scorer == other.scorer
    }

    override fun hashCode(): Int {
        return Objects.hash(type, scorer)
    }

    override fun toString(): String {
        return when {
            type != null -> "Position{type=$type}"
            scorer != null -> "Position{scorer=$scorer}"
            _json != null -> "Position{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid Position")
        }
    }

    companion object {

        @JvmStatic fun ofType(type: Type) = Position(type = type)

        @JvmStatic fun ofScorer(scorer: Scorer) = Position(scorer = scorer)
    }

    interface Visitor<out T> {

        fun visitType(type: Type): T

        fun visitScorer(scorer: Scorer): T

        fun unknown(json: JsonValue?): T {
            throw BraintrustInvalidDataException("Unknown Position: $json")
        }
    }

    class Deserializer : BaseDeserializer<Position>(Position::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): Position {
            val json = JsonValue.fromJsonNode(node)
            tryDeserialize(node, jacksonTypeRef<Type>()) { it.validate() }
                ?.let {
                    return Position(type = it, _json = json)
                }
            tryDeserialize(node, jacksonTypeRef<Scorer>()) { it.validate() }
                ?.let {
                    return Position(scorer = it, _json = json)
                }

            return Position(_json = json)
        }
    }

    class Serializer : BaseSerializer<Position>(Position::class) {

        override fun serialize(
            value: Position,
            generator: JsonGenerator,
            provider: SerializerProvider
        ) {
            when {
                value.type != null -> generator.writeObject(value.type)
                value.scorer != null -> generator.writeObject(value.scorer)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid Position")
            }
        }
    }

    @JsonDeserialize(builder = Type.Builder::class)
    @NoAutoDetect
    class Type
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

        fun validate(): Type = apply {
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

            return other is Type &&
                this.type == other.type &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(type, additionalProperties)
            }
            return hashCode
        }

        override fun toString() = "Type{type=$type, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var type: JsonField<Type> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(type: Type) = apply {
                this.type = type.type
                additionalProperties(type.additionalProperties)
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

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): Type = Type(type, additionalProperties.toUnmodifiable())
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

                @JvmField val TASK = Type(JsonField.of("task"))

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            enum class Known {
                TASK,
            }

            enum class Value {
                TASK,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    TASK -> Value.TASK
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    TASK -> Known.TASK
                    else -> throw BraintrustInvalidDataException("Unknown Type: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }
    }

    @JsonDeserialize(builder = Scorer.Builder::class)
    @NoAutoDetect
    class Scorer
    private constructor(
        private val type: JsonField<Type>,
        private val index: JsonField<Long>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        fun type(): Type = type.getRequired("type")

        fun index(): Long = index.getRequired("index")

        @JsonProperty("type") @ExcludeMissing fun _type() = type

        @JsonProperty("index") @ExcludeMissing fun _index() = index

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Scorer = apply {
            if (!validated) {
                type()
                index()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Scorer &&
                this.type == other.type &&
                this.index == other.index &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        type,
                        index,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Scorer{type=$type, index=$index, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var type: JsonField<Type> = JsonMissing.of()
            private var index: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(scorer: Scorer) = apply {
                this.type = scorer.type
                this.index = scorer.index
                additionalProperties(scorer.additionalProperties)
            }

            fun type(type: Type) = type(JsonField.of(type))

            @JsonProperty("type")
            @ExcludeMissing
            fun type(type: JsonField<Type>) = apply { this.type = type }

            fun index(index: Long) = index(JsonField.of(index))

            @JsonProperty("index")
            @ExcludeMissing
            fun index(index: JsonField<Long>) = apply { this.index = index }

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

            fun build(): Scorer =
                Scorer(
                    type,
                    index,
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

                @JvmField val SCORER = Type(JsonField.of("scorer"))

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            enum class Known {
                SCORER,
            }

            enum class Value {
                SCORER,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    SCORER -> Value.SCORER
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    SCORER -> Known.SCORER
                    else -> throw BraintrustInvalidDataException("Unknown Type: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }
    }
}
