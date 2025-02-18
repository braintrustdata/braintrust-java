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
import com.braintrustdata.api.core.checkRequired
import com.braintrustdata.api.core.getOrThrow
import com.braintrustdata.api.core.immutableEmptyMap
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

@NoAutoDetect
class OnlineScoreConfig
@JsonCreator
private constructor(
    @JsonProperty("sampling_rate")
    @ExcludeMissing
    private val samplingRate: JsonField<Double> = JsonMissing.of(),
    @JsonProperty("scorers")
    @ExcludeMissing
    private val scorers: JsonField<List<Scorer>> = JsonMissing.of(),
    @JsonProperty("apply_to_root_span")
    @ExcludeMissing
    private val applyToRootSpan: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("apply_to_span_names")
    @ExcludeMissing
    private val applyToSpanNames: JsonField<List<String>> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

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
    @JsonProperty("sampling_rate")
    @ExcludeMissing
    fun _samplingRate(): JsonField<Double> = samplingRate

    /** The list of scorers to use for online scoring */
    @JsonProperty("scorers") @ExcludeMissing fun _scorers(): JsonField<List<Scorer>> = scorers

    /** Whether to trigger online scoring on the root span of each trace */
    @JsonProperty("apply_to_root_span")
    @ExcludeMissing
    fun _applyToRootSpan(): JsonField<Boolean> = applyToRootSpan

    /** Trigger online scoring on any spans with a name in this list */
    @JsonProperty("apply_to_span_names")
    @ExcludeMissing
    fun _applyToSpanNames(): JsonField<List<String>> = applyToSpanNames

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): OnlineScoreConfig = apply {
        if (validated) {
            return@apply
        }

        samplingRate()
        scorers().forEach { it.validate() }
        applyToRootSpan()
        applyToSpanNames()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [OnlineScoreConfig]. */
    class Builder internal constructor() {

        private var samplingRate: JsonField<Double>? = null
        private var scorers: JsonField<MutableList<Scorer>>? = null
        private var applyToRootSpan: JsonField<Boolean> = JsonMissing.of()
        private var applyToSpanNames: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(onlineScoreConfig: OnlineScoreConfig) = apply {
            samplingRate = onlineScoreConfig.samplingRate
            scorers = onlineScoreConfig.scorers.map { it.toMutableList() }
            applyToRootSpan = onlineScoreConfig.applyToRootSpan
            applyToSpanNames = onlineScoreConfig.applyToSpanNames.map { it.toMutableList() }
            additionalProperties = onlineScoreConfig.additionalProperties.toMutableMap()
        }

        /** The sampling rate for online scoring */
        fun samplingRate(samplingRate: Double) = samplingRate(JsonField.of(samplingRate))

        /** The sampling rate for online scoring */
        fun samplingRate(samplingRate: JsonField<Double>) = apply {
            this.samplingRate = samplingRate
        }

        /** The list of scorers to use for online scoring */
        fun scorers(scorers: List<Scorer>) = scorers(JsonField.of(scorers))

        /** The list of scorers to use for online scoring */
        fun scorers(scorers: JsonField<List<Scorer>>) = apply {
            this.scorers = scorers.map { it.toMutableList() }
        }

        /** The list of scorers to use for online scoring */
        fun addScorer(scorer: Scorer) = apply {
            scorers =
                (scorers ?: JsonField.of(mutableListOf())).apply {
                    asKnown()
                        .orElseThrow {
                            IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            )
                        }
                        .add(scorer)
                }
        }

        /** The list of scorers to use for online scoring */
        fun addScorer(function: Scorer.Function) = addScorer(Scorer.ofFunction(function))

        /** The list of scorers to use for online scoring */
        fun addScorer(global: Scorer.Global) = addScorer(Scorer.ofGlobal(global))

        /** Whether to trigger online scoring on the root span of each trace */
        fun applyToRootSpan(applyToRootSpan: Boolean?) =
            applyToRootSpan(JsonField.ofNullable(applyToRootSpan))

        /** Whether to trigger online scoring on the root span of each trace */
        fun applyToRootSpan(applyToRootSpan: Boolean) = applyToRootSpan(applyToRootSpan as Boolean?)

        /** Whether to trigger online scoring on the root span of each trace */
        @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
        fun applyToRootSpan(applyToRootSpan: Optional<Boolean>) =
            applyToRootSpan(applyToRootSpan.orElse(null) as Boolean?)

        /** Whether to trigger online scoring on the root span of each trace */
        fun applyToRootSpan(applyToRootSpan: JsonField<Boolean>) = apply {
            this.applyToRootSpan = applyToRootSpan
        }

        /** Trigger online scoring on any spans with a name in this list */
        fun applyToSpanNames(applyToSpanNames: List<String>?) =
            applyToSpanNames(JsonField.ofNullable(applyToSpanNames))

        /** Trigger online scoring on any spans with a name in this list */
        fun applyToSpanNames(applyToSpanNames: Optional<List<String>>) =
            applyToSpanNames(applyToSpanNames.orElse(null))

        /** Trigger online scoring on any spans with a name in this list */
        fun applyToSpanNames(applyToSpanNames: JsonField<List<String>>) = apply {
            this.applyToSpanNames = applyToSpanNames.map { it.toMutableList() }
        }

        /** Trigger online scoring on any spans with a name in this list */
        fun addApplyToSpanName(applyToSpanName: String) = apply {
            applyToSpanNames =
                (applyToSpanNames ?: JsonField.of(mutableListOf())).apply {
                    asKnown()
                        .orElseThrow {
                            IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            )
                        }
                        .add(applyToSpanName)
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

        fun build(): OnlineScoreConfig =
            OnlineScoreConfig(
                checkRequired("samplingRate", samplingRate),
                checkRequired("scorers", scorers).map { it.toImmutable() },
                applyToRootSpan,
                (applyToSpanNames ?: JsonMissing.of()).map { it.toImmutable() },
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

        private var validated: Boolean = false

        fun validate(): Scorer = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitFunction(function: Function) {
                        function.validate()
                    }

                    override fun visitGlobal(global: Global) {
                        global.validate()
                    }
                }
            )
            validated = true
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

        /** An interface that defines how to map each variant of [Scorer] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitFunction(function: Function): T

            fun visitGlobal(global: Global): T

            /**
             * Maps an unknown variant of [Scorer] to a value of type [T].
             *
             * An instance of [Scorer] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws BraintrustInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw BraintrustInvalidDataException("Unknown Scorer: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Scorer>(Scorer::class) {

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

        internal class Serializer : BaseSerializer<Scorer>(Scorer::class) {

            override fun serialize(
                value: Scorer,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.function != null -> generator.writeObject(value.function)
                    value.global != null -> generator.writeObject(value.global)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Scorer")
                }
            }
        }

        @NoAutoDetect
        class Function
        @JsonCreator
        private constructor(
            @JsonProperty("id")
            @ExcludeMissing
            private val id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type")
            @ExcludeMissing
            private val type: JsonField<Type> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun id(): String = id.getRequired("id")

            fun type(): Type = type.getRequired("type")

            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Function = apply {
                if (validated) {
                    return@apply
                }

                id()
                type()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Function]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var type: JsonField<Type>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(function: Function) = apply {
                    id = function.id
                    type = function.type
                    additionalProperties = function.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                fun id(id: JsonField<String>) = apply { this.id = id }

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

                fun build(): Function =
                    Function(
                        checkRequired("id", id),
                        checkRequired("type", type),
                        additionalProperties.toImmutable(),
                    )
            }

            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

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

                    @JvmField val FUNCTION = of("function")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    FUNCTION
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
                    FUNCTION,
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
                        FUNCTION -> Value.FUNCTION
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
                        FUNCTION -> Known.FUNCTION
                        else -> throw BraintrustInvalidDataException("Unknown Type: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws BraintrustInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        BraintrustInvalidDataException("Value is not a String")
                    }

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

                return /* spotless:off */ other is Function && id == other.id && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Function{id=$id, type=$type, additionalProperties=$additionalProperties}"
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

            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

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
                    GLOBAL
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

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws BraintrustInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        BraintrustInvalidDataException("Value is not a String")
                    }

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
