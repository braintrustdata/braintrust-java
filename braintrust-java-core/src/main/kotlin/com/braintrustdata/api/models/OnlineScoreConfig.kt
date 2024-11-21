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

@JsonDeserialize(builder = OnlineScoreConfig.Builder::class)
@NoAutoDetect
class OnlineScoreConfig
private constructor(
    private val samplingRate: JsonField<Double>,
    private val scorers: JsonField<List<Scorer>>,
    private val applyToRootSpan: JsonField<Boolean>,
    private val applyToSpanNames: JsonField<List<String>>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /** The sampling rate for online scoring */
    fun samplingRate(): Double = samplingRate.getRequired("sampling_rate")

    /** The list of scorers to use for online scoring */
    fun scorers(): List<Scorer> = scorers.getRequired("scorers")

    /** Whether to trigger online scoring on the root span of each trace */
    fun applyToRootSpan(): Optional<Boolean> =
        Optional.ofNullable(applyToRootSpan.getNullable("apply_to_root_span"))

    /** Trigger online scoring on any spans with a name in this list */
    fun applyToSpanNames(): Optional<List<String>> =
        Optional.ofNullable(applyToSpanNames.getNullable("apply_to_span_names"))

    /** The sampling rate for online scoring */
    @JsonProperty("sampling_rate") @ExcludeMissing fun _samplingRate() = samplingRate

    /** The list of scorers to use for online scoring */
    @JsonProperty("scorers") @ExcludeMissing fun _scorers() = scorers

    /** Whether to trigger online scoring on the root span of each trace */
    @JsonProperty("apply_to_root_span") @ExcludeMissing fun _applyToRootSpan() = applyToRootSpan

    /** Trigger online scoring on any spans with a name in this list */
    @JsonProperty("apply_to_span_names") @ExcludeMissing fun _applyToSpanNames() = applyToSpanNames

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): OnlineScoreConfig = apply {
        if (!validated) {
            samplingRate()
            scorers()
            applyToRootSpan()
            applyToSpanNames()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var samplingRate: JsonField<Double> = JsonMissing.of()
        private var scorers: JsonField<List<Scorer>> = JsonMissing.of()
        private var applyToRootSpan: JsonField<Boolean> = JsonMissing.of()
        private var applyToSpanNames: JsonField<List<String>> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(onlineScoreConfig: OnlineScoreConfig) = apply {
            this.samplingRate = onlineScoreConfig.samplingRate
            this.scorers = onlineScoreConfig.scorers
            this.applyToRootSpan = onlineScoreConfig.applyToRootSpan
            this.applyToSpanNames = onlineScoreConfig.applyToSpanNames
            additionalProperties(onlineScoreConfig.additionalProperties)
        }

        /** The sampling rate for online scoring */
        fun samplingRate(samplingRate: Double) = samplingRate(JsonField.of(samplingRate))

        /** The sampling rate for online scoring */
        @JsonProperty("sampling_rate")
        @ExcludeMissing
        fun samplingRate(samplingRate: JsonField<Double>) = apply {
            this.samplingRate = samplingRate
        }

        /** The list of scorers to use for online scoring */
        fun scorers(scorers: List<Scorer>) = scorers(JsonField.of(scorers))

        /** The list of scorers to use for online scoring */
        @JsonProperty("scorers")
        @ExcludeMissing
        fun scorers(scorers: JsonField<List<Scorer>>) = apply { this.scorers = scorers }

        /** Whether to trigger online scoring on the root span of each trace */
        fun applyToRootSpan(applyToRootSpan: Boolean) =
            applyToRootSpan(JsonField.of(applyToRootSpan))

        /** Whether to trigger online scoring on the root span of each trace */
        @JsonProperty("apply_to_root_span")
        @ExcludeMissing
        fun applyToRootSpan(applyToRootSpan: JsonField<Boolean>) = apply {
            this.applyToRootSpan = applyToRootSpan
        }

        /** Trigger online scoring on any spans with a name in this list */
        fun applyToSpanNames(applyToSpanNames: List<String>) =
            applyToSpanNames(JsonField.of(applyToSpanNames))

        /** Trigger online scoring on any spans with a name in this list */
        @JsonProperty("apply_to_span_names")
        @ExcludeMissing
        fun applyToSpanNames(applyToSpanNames: JsonField<List<String>>) = apply {
            this.applyToSpanNames = applyToSpanNames
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

        fun build(): OnlineScoreConfig =
            OnlineScoreConfig(
                samplingRate,
                scorers.map { it.toImmutable() },
                applyToRootSpan,
                applyToSpanNames.map { it.toImmutable() },
                additionalProperties.toImmutable(),
            )
    }

    @JsonDeserialize(using = Scorer.Deserializer::class)
    @JsonSerialize(using = Scorer.Serializer::class)
    class Scorer
    private constructor(
        private val function: Function? = null,
        private val global: Global? = null,
        private val _json: JsonValue? = null,
    ) {

        private var validated: Boolean = false

        fun function(): Optional<Function> = Optional.ofNullable(function)

        fun global(): Optional<Global> = Optional.ofNullable(global)

        fun isFunction(): Boolean = function != null

        fun isGlobal(): Boolean = global != null

        fun asFunction(): Function = function.getOrThrow("function")

        fun asGlobal(): Global = global.getOrThrow("global")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                function != null -> visitor.visitFunction(function)
                global != null -> visitor.visitGlobal(global)
                else -> visitor.unknown(_json)
            }
        }

        fun validate(): Scorer = apply {
            if (!validated) {
                if (function == null && global == null) {
                    throw BraintrustInvalidDataException("Unknown Scorer: $_json")
                }
                function?.validate()
                global?.validate()
                validated = true
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Scorer && function == other.function && global == other.global /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(function, global) /* spotless:on */

        override fun toString(): String =
            when {
                function != null -> "Scorer{function=$function}"
                global != null -> "Scorer{global=$global}"
                _json != null -> "Scorer{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Scorer")
            }

        companion object {

            @JvmStatic fun ofFunction(function: Function) = Scorer(function = function)

            @JvmStatic fun ofGlobal(global: Global) = Scorer(global = global)
        }

        interface Visitor<out T> {

            fun visitFunction(function: Function): T

            fun visitGlobal(global: Global): T

            fun unknown(json: JsonValue?): T {
                throw BraintrustInvalidDataException("Unknown Scorer: $json")
            }
        }

        class Deserializer : BaseDeserializer<Scorer>(Scorer::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Scorer {
                val json = JsonValue.fromJsonNode(node)

                tryDeserialize(node, jacksonTypeRef<Function>()) { it.validate() }
                    ?.let {
                        return Scorer(function = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<Global>()) { it.validate() }
                    ?.let {
                        return Scorer(global = it, _json = json)
                    }

                return Scorer(_json = json)
            }
        }

        class Serializer : BaseSerializer<Scorer>(Scorer::class) {

            override fun serialize(
                value: Scorer,
                generator: JsonGenerator,
                provider: SerializerProvider
            ) {
                when {
                    value.function != null -> generator.writeObject(value.function)
                    value.global != null -> generator.writeObject(value.global)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Scorer")
                }
            }
        }

        @JsonDeserialize(builder = Function.Builder::class)
        @NoAutoDetect
        class Function
        private constructor(
            private val type: JsonField<Type>,
            private val id: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            fun type(): Type = type.getRequired("type")

            fun id(): String = id.getRequired("id")

            @JsonProperty("type") @ExcludeMissing fun _type() = type

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Function = apply {
                if (!validated) {
                    type()
                    id()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var type: JsonField<Type> = JsonMissing.of()
                private var id: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(function: Function) = apply {
                    this.type = function.type
                    this.id = function.id
                    additionalProperties(function.additionalProperties)
                }

                fun type(type: Type) = type(JsonField.of(type))

                @JsonProperty("type")
                @ExcludeMissing
                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun id(id: String) = id(JsonField.of(id))

                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

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

                fun build(): Function =
                    Function(
                        type,
                        id,
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

                return /* spotless:off */ other is Function && type == other.type && id == other.id && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(type, id, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Function{type=$type, id=$id, additionalProperties=$additionalProperties}"
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

                    return /* spotless:off */ other is Type && value == other.value /* spotless:on */
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

                return /* spotless:off */ other is Global && type == other.type && name == other.name && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(type, name, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Global{type=$type, name=$name, additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is OnlineScoreConfig && samplingRate == other.samplingRate && scorers == other.scorers && applyToRootSpan == other.applyToRootSpan && applyToSpanNames == other.applyToSpanNames && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(samplingRate, scorers, applyToRootSpan, applyToSpanNames, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "OnlineScoreConfig{samplingRate=$samplingRate, scorers=$scorers, applyToRootSpan=$applyToRootSpan, applyToSpanNames=$applyToSpanNames, additionalProperties=$additionalProperties}"
}
