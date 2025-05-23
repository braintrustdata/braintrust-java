// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.BaseDeserializer
import com.braintrustdata.api.core.BaseSerializer
import com.braintrustdata.api.core.Enum
import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.allMaxBy
import com.braintrustdata.api.core.checkKnown
import com.braintrustdata.api.core.checkRequired
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
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class OnlineScoreConfig
private constructor(
    private val samplingRate: JsonField<Double>,
    private val scorers: JsonField<List<Scorer>>,
    private val applyToRootSpan: JsonField<Boolean>,
    private val applyToSpanNames: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("sampling_rate")
        @ExcludeMissing
        samplingRate: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("scorers")
        @ExcludeMissing
        scorers: JsonField<List<Scorer>> = JsonMissing.of(),
        @JsonProperty("apply_to_root_span")
        @ExcludeMissing
        applyToRootSpan: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("apply_to_span_names")
        @ExcludeMissing
        applyToSpanNames: JsonField<List<String>> = JsonMissing.of(),
    ) : this(samplingRate, scorers, applyToRootSpan, applyToSpanNames, mutableMapOf())

    /**
     * The sampling rate for online scoring
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun samplingRate(): Double = samplingRate.getRequired("sampling_rate")

    /**
     * The list of scorers to use for online scoring
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun scorers(): List<Scorer> = scorers.getRequired("scorers")

    /**
     * Whether to trigger online scoring on the root span of each trace
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun applyToRootSpan(): Optional<Boolean> = applyToRootSpan.getOptional("apply_to_root_span")

    /**
     * Trigger online scoring on any spans with a name in this list
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun applyToSpanNames(): Optional<List<String>> =
        applyToSpanNames.getOptional("apply_to_span_names")

    /**
     * Returns the raw JSON value of [samplingRate].
     *
     * Unlike [samplingRate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sampling_rate")
    @ExcludeMissing
    fun _samplingRate(): JsonField<Double> = samplingRate

    /**
     * Returns the raw JSON value of [scorers].
     *
     * Unlike [scorers], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("scorers") @ExcludeMissing fun _scorers(): JsonField<List<Scorer>> = scorers

    /**
     * Returns the raw JSON value of [applyToRootSpan].
     *
     * Unlike [applyToRootSpan], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("apply_to_root_span")
    @ExcludeMissing
    fun _applyToRootSpan(): JsonField<Boolean> = applyToRootSpan

    /**
     * Returns the raw JSON value of [applyToSpanNames].
     *
     * Unlike [applyToSpanNames], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("apply_to_span_names")
    @ExcludeMissing
    fun _applyToSpanNames(): JsonField<List<String>> = applyToSpanNames

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [OnlineScoreConfig].
         *
         * The following fields are required:
         * ```java
         * .samplingRate()
         * .scorers()
         * ```
         */
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

        /**
         * Sets [Builder.samplingRate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.samplingRate] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun samplingRate(samplingRate: JsonField<Double>) = apply {
            this.samplingRate = samplingRate
        }

        /** The list of scorers to use for online scoring */
        fun scorers(scorers: List<Scorer>) = scorers(JsonField.of(scorers))

        /**
         * Sets [Builder.scorers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scorers] with a well-typed `List<Scorer>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun scorers(scorers: JsonField<List<Scorer>>) = apply {
            this.scorers = scorers.map { it.toMutableList() }
        }

        /**
         * Adds a single [Scorer] to [scorers].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addScorer(scorer: Scorer) = apply {
            scorers =
                (scorers ?: JsonField.of(mutableListOf())).also {
                    checkKnown("scorers", it).add(scorer)
                }
        }

        /** Alias for calling [addScorer] with `Scorer.ofFunction(function)`. */
        fun addScorer(function: Scorer.Function) = addScorer(Scorer.ofFunction(function))

        /** Alias for calling [addScorer] with `Scorer.ofGlobal(global)`. */
        fun addScorer(global: Scorer.Global) = addScorer(Scorer.ofGlobal(global))

        /** Whether to trigger online scoring on the root span of each trace */
        fun applyToRootSpan(applyToRootSpan: Boolean?) =
            applyToRootSpan(JsonField.ofNullable(applyToRootSpan))

        /**
         * Alias for [Builder.applyToRootSpan].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun applyToRootSpan(applyToRootSpan: Boolean) = applyToRootSpan(applyToRootSpan as Boolean?)

        /** Alias for calling [Builder.applyToRootSpan] with `applyToRootSpan.orElse(null)`. */
        fun applyToRootSpan(applyToRootSpan: Optional<Boolean>) =
            applyToRootSpan(applyToRootSpan.getOrNull())

        /**
         * Sets [Builder.applyToRootSpan] to an arbitrary JSON value.
         *
         * You should usually call [Builder.applyToRootSpan] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun applyToRootSpan(applyToRootSpan: JsonField<Boolean>) = apply {
            this.applyToRootSpan = applyToRootSpan
        }

        /** Trigger online scoring on any spans with a name in this list */
        fun applyToSpanNames(applyToSpanNames: List<String>?) =
            applyToSpanNames(JsonField.ofNullable(applyToSpanNames))

        /** Alias for calling [Builder.applyToSpanNames] with `applyToSpanNames.orElse(null)`. */
        fun applyToSpanNames(applyToSpanNames: Optional<List<String>>) =
            applyToSpanNames(applyToSpanNames.getOrNull())

        /**
         * Sets [Builder.applyToSpanNames] to an arbitrary JSON value.
         *
         * You should usually call [Builder.applyToSpanNames] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun applyToSpanNames(applyToSpanNames: JsonField<List<String>>) = apply {
            this.applyToSpanNames = applyToSpanNames.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [applyToSpanNames].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addApplyToSpanName(applyToSpanName: String) = apply {
            applyToSpanNames =
                (applyToSpanNames ?: JsonField.of(mutableListOf())).also {
                    checkKnown("applyToSpanNames", it).add(applyToSpanName)
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

        /**
         * Returns an immutable instance of [OnlineScoreConfig].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .samplingRate()
         * .scorers()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): OnlineScoreConfig =
            OnlineScoreConfig(
                checkRequired("samplingRate", samplingRate),
                checkRequired("scorers", scorers).map { it.toImmutable() },
                applyToRootSpan,
                (applyToSpanNames ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

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

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: BraintrustInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (samplingRate.asKnown().isPresent) 1 else 0) +
            (scorers.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (applyToRootSpan.asKnown().isPresent) 1 else 0) +
            (applyToSpanNames.asKnown().getOrNull()?.size ?: 0)

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

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                function != null -> visitor.visitFunction(function)
                global != null -> visitor.visitGlobal(global)
                else -> visitor.unknown(_json)
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

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: BraintrustInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            accept(
                object : Visitor<Int> {
                    override fun visitFunction(function: Function) = function.validity()

                    override fun visitGlobal(global: Global) = global.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

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

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<Function>())?.let {
                                Scorer(function = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<Global>())?.let {
                                Scorer(global = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Scorer(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
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

        class Function
        private constructor(
            private val id: JsonField<String>,
            private val type: JsonField<Type>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            ) : this(id, type, mutableMapOf())

            /**
             * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun type(): Type = type.getRequired("type")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [Function].
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .type()
                 * ```
                 */
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

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
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

                /**
                 * Returns an immutable instance of [Function].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .type()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Function =
                    Function(
                        checkRequired("id", id),
                        checkRequired("type", type),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Function = apply {
                if (validated) {
                    return@apply
                }

                id()
                type().validate()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: BraintrustInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (id.asKnown().isPresent) 1 else 0) +
                    (type.asKnown().getOrNull()?.validity() ?: 0)

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

                private var validated: Boolean = false

                fun validate(): Type = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: BraintrustInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

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

        class Global
        private constructor(
            private val name: JsonField<String>,
            private val type: JsonField<Type>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            ) : this(name, type, mutableMapOf())

            /**
             * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun name(): String = name.getRequired("name")

            /**
             * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun type(): Type = type.getRequired("type")

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [Global].
                 *
                 * The following fields are required:
                 * ```java
                 * .name()
                 * .type()
                 * ```
                 */
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

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
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

                /**
                 * Returns an immutable instance of [Global].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .name()
                 * .type()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Global =
                    Global(
                        checkRequired("name", name),
                        checkRequired("type", type),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Global = apply {
                if (validated) {
                    return@apply
                }

                name()
                type().validate()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: BraintrustInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (name.asKnown().isPresent) 1 else 0) +
                    (type.asKnown().getOrNull()?.validity() ?: 0)

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

                private var validated: Boolean = false

                fun validate(): Type = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: BraintrustInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

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
