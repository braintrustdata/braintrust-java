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
import kotlin.jvm.optionals.getOrNull

@NoAutoDetect
class CodeBundle
@JsonCreator
private constructor(
    @JsonProperty("bundle_id")
    @ExcludeMissing
    private val bundleId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("location")
    @ExcludeMissing
    private val location: JsonField<Location> = JsonMissing.of(),
    @JsonProperty("runtime_context")
    @ExcludeMissing
    private val runtimeContext: JsonField<RuntimeContext> = JsonMissing.of(),
    @JsonProperty("preview")
    @ExcludeMissing
    private val preview: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun bundleId(): String = bundleId.getRequired("bundle_id")

    /**
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun location(): Location = location.getRequired("location")

    /**
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun runtimeContext(): RuntimeContext = runtimeContext.getRequired("runtime_context")

    /**
     * A preview of the code
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun preview(): Optional<String> = Optional.ofNullable(preview.getNullable("preview"))

    /**
     * Returns the raw JSON value of [bundleId].
     *
     * Unlike [bundleId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("bundle_id") @ExcludeMissing fun _bundleId(): JsonField<String> = bundleId

    /**
     * Returns the raw JSON value of [location].
     *
     * Unlike [location], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("location") @ExcludeMissing fun _location(): JsonField<Location> = location

    /**
     * Returns the raw JSON value of [runtimeContext].
     *
     * Unlike [runtimeContext], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("runtime_context")
    @ExcludeMissing
    fun _runtimeContext(): JsonField<RuntimeContext> = runtimeContext

    /**
     * Returns the raw JSON value of [preview].
     *
     * Unlike [preview], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("preview") @ExcludeMissing fun _preview(): JsonField<String> = preview

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): CodeBundle = apply {
        if (validated) {
            return@apply
        }

        bundleId()
        location().validate()
        runtimeContext().validate()
        preview()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CodeBundle].
         *
         * The following fields are required:
         * ```java
         * .bundleId()
         * .location()
         * .runtimeContext()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CodeBundle]. */
    class Builder internal constructor() {

        private var bundleId: JsonField<String>? = null
        private var location: JsonField<Location>? = null
        private var runtimeContext: JsonField<RuntimeContext>? = null
        private var preview: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(codeBundle: CodeBundle) = apply {
            bundleId = codeBundle.bundleId
            location = codeBundle.location
            runtimeContext = codeBundle.runtimeContext
            preview = codeBundle.preview
            additionalProperties = codeBundle.additionalProperties.toMutableMap()
        }

        fun bundleId(bundleId: String) = bundleId(JsonField.of(bundleId))

        /**
         * Sets [Builder.bundleId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bundleId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun bundleId(bundleId: JsonField<String>) = apply { this.bundleId = bundleId }

        fun location(location: Location) = location(JsonField.of(location))

        /**
         * Sets [Builder.location] to an arbitrary JSON value.
         *
         * You should usually call [Builder.location] with a well-typed [Location] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun location(location: JsonField<Location>) = apply { this.location = location }

        /** Alias for calling [location] with `Location.ofExperiment(experiment)`. */
        fun location(experiment: Location.Experiment) = location(Location.ofExperiment(experiment))

        /** Alias for calling [location] with `Location.ofFunction(function)`. */
        fun location(function: Location.Function) = location(Location.ofFunction(function))

        fun runtimeContext(runtimeContext: RuntimeContext) =
            runtimeContext(JsonField.of(runtimeContext))

        /**
         * Sets [Builder.runtimeContext] to an arbitrary JSON value.
         *
         * You should usually call [Builder.runtimeContext] with a well-typed [RuntimeContext] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun runtimeContext(runtimeContext: JsonField<RuntimeContext>) = apply {
            this.runtimeContext = runtimeContext
        }

        /** A preview of the code */
        fun preview(preview: String?) = preview(JsonField.ofNullable(preview))

        /** Alias for calling [Builder.preview] with `preview.orElse(null)`. */
        fun preview(preview: Optional<String>) = preview(preview.getOrNull())

        /**
         * Sets [Builder.preview] to an arbitrary JSON value.
         *
         * You should usually call [Builder.preview] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun preview(preview: JsonField<String>) = apply { this.preview = preview }

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
         * Returns an immutable instance of [CodeBundle].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .bundleId()
         * .location()
         * .runtimeContext()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CodeBundle =
            CodeBundle(
                checkRequired("bundleId", bundleId),
                checkRequired("location", location),
                checkRequired("runtimeContext", runtimeContext),
                preview,
                additionalProperties.toImmutable(),
            )
    }

    @JsonDeserialize(using = Location.Deserializer::class)
    @JsonSerialize(using = Location.Serializer::class)
    class Location
    private constructor(
        private val experiment: Experiment? = null,
        private val function: Function? = null,
        private val _json: JsonValue? = null,
    ) {

        fun experiment(): Optional<Experiment> = Optional.ofNullable(experiment)

        fun function(): Optional<Function> = Optional.ofNullable(function)

        fun isExperiment(): Boolean = experiment != null

        fun isFunction(): Boolean = function != null

        fun asExperiment(): Experiment = experiment.getOrThrow("experiment")

        fun asFunction(): Function = function.getOrThrow("function")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                experiment != null -> visitor.visitExperiment(experiment)
                function != null -> visitor.visitFunction(function)
                else -> visitor.unknown(_json)
            }
        }

        private var validated: Boolean = false

        fun validate(): Location = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitExperiment(experiment: Experiment) {
                        experiment.validate()
                    }

                    override fun visitFunction(function: Function) {
                        function.validate()
                    }
                }
            )
            validated = true
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Location && experiment == other.experiment && function == other.function /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(experiment, function) /* spotless:on */

        override fun toString(): String =
            when {
                experiment != null -> "Location{experiment=$experiment}"
                function != null -> "Location{function=$function}"
                _json != null -> "Location{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Location")
            }

        companion object {

            @JvmStatic fun ofExperiment(experiment: Experiment) = Location(experiment = experiment)

            @JvmStatic fun ofFunction(function: Function) = Location(function = function)
        }

        /**
         * An interface that defines how to map each variant of [Location] to a value of type [T].
         */
        interface Visitor<out T> {

            fun visitExperiment(experiment: Experiment): T

            fun visitFunction(function: Function): T

            /**
             * Maps an unknown variant of [Location] to a value of type [T].
             *
             * An instance of [Location] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws BraintrustInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw BraintrustInvalidDataException("Unknown Location: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Location>(Location::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Location {
                val json = JsonValue.fromJsonNode(node)

                tryDeserialize(node, jacksonTypeRef<Experiment>()) { it.validate() }
                    ?.let {
                        return Location(experiment = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<Function>()) { it.validate() }
                    ?.let {
                        return Location(function = it, _json = json)
                    }

                return Location(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<Location>(Location::class) {

            override fun serialize(
                value: Location,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.experiment != null -> generator.writeObject(value.experiment)
                    value.function != null -> generator.writeObject(value.function)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Location")
                }
            }
        }

        @NoAutoDetect
        class Experiment
        @JsonCreator
        private constructor(
            @JsonProperty("eval_name")
            @ExcludeMissing
            private val evalName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("position")
            @ExcludeMissing
            private val position: JsonField<Position> = JsonMissing.of(),
            @JsonProperty("type")
            @ExcludeMissing
            private val type: JsonField<Type> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /**
             * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun evalName(): String = evalName.getRequired("eval_name")

            /**
             * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun position(): Position = position.getRequired("position")

            /**
             * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun type(): Type = type.getRequired("type")

            /**
             * Returns the raw JSON value of [evalName].
             *
             * Unlike [evalName], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("eval_name") @ExcludeMissing fun _evalName(): JsonField<String> = evalName

            /**
             * Returns the raw JSON value of [position].
             *
             * Unlike [position], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("position")
            @ExcludeMissing
            fun _position(): JsonField<Position> = position

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Experiment = apply {
                if (validated) {
                    return@apply
                }

                evalName()
                position().validate()
                type()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [Experiment].
                 *
                 * The following fields are required:
                 * ```java
                 * .evalName()
                 * .position()
                 * .type()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Experiment]. */
            class Builder internal constructor() {

                private var evalName: JsonField<String>? = null
                private var position: JsonField<Position>? = null
                private var type: JsonField<Type>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(experiment: Experiment) = apply {
                    evalName = experiment.evalName
                    position = experiment.position
                    type = experiment.type
                    additionalProperties = experiment.additionalProperties.toMutableMap()
                }

                fun evalName(evalName: String) = evalName(JsonField.of(evalName))

                /**
                 * Sets [Builder.evalName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.evalName] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun evalName(evalName: JsonField<String>) = apply { this.evalName = evalName }

                fun position(position: Position) = position(JsonField.of(position))

                /**
                 * Sets [Builder.position] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.position] with a well-typed [Position] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun position(position: JsonField<Position>) = apply { this.position = position }

                /** Alias for calling [position] with `Position.ofType(type)`. */
                fun position(type: Position.Type) = position(Position.ofType(type))

                /** Alias for calling [position] with `Position.ofScorer(scorer)`. */
                fun position(scorer: Position.Scorer) = position(Position.ofScorer(scorer))

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
                 * Returns an immutable instance of [Experiment].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .evalName()
                 * .position()
                 * .type()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Experiment =
                    Experiment(
                        checkRequired("evalName", evalName),
                        checkRequired("position", position),
                        checkRequired("type", type),
                        additionalProperties.toImmutable(),
                    )
            }

            @JsonDeserialize(using = Position.Deserializer::class)
            @JsonSerialize(using = Position.Serializer::class)
            class Position
            private constructor(
                private val type: Type? = null,
                private val scorer: Scorer? = null,
                private val _json: JsonValue? = null,
            ) {

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

                private var validated: Boolean = false

                fun validate(): Position = apply {
                    if (validated) {
                        return@apply
                    }

                    accept(
                        object : Visitor<Unit> {
                            override fun visitType(type: Type) {
                                type.validate()
                            }

                            override fun visitScorer(scorer: Scorer) {
                                scorer.validate()
                            }
                        }
                    )
                    validated = true
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Position && type == other.type && scorer == other.scorer /* spotless:on */
                }

                override fun hashCode(): Int = /* spotless:off */ Objects.hash(type, scorer) /* spotless:on */

                override fun toString(): String =
                    when {
                        type != null -> "Position{type=$type}"
                        scorer != null -> "Position{scorer=$scorer}"
                        _json != null -> "Position{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid Position")
                    }

                companion object {

                    @JvmStatic fun ofType(type: Type) = Position(type = type)

                    @JvmStatic fun ofScorer(scorer: Scorer) = Position(scorer = scorer)
                }

                /**
                 * An interface that defines how to map each variant of [Position] to a value of
                 * type [T].
                 */
                interface Visitor<out T> {

                    fun visitType(type: Type): T

                    fun visitScorer(scorer: Scorer): T

                    /**
                     * Maps an unknown variant of [Position] to a value of type [T].
                     *
                     * An instance of [Position] can contain an unknown variant if it was
                     * deserialized from data that doesn't match any known variant. For example, if
                     * the SDK is on an older version than the API, then the API may respond with
                     * new variants that the SDK is unaware of.
                     *
                     * @throws BraintrustInvalidDataException in the default implementation.
                     */
                    fun unknown(json: JsonValue?): T {
                        throw BraintrustInvalidDataException("Unknown Position: $json")
                    }
                }

                internal class Deserializer : BaseDeserializer<Position>(Position::class) {

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

                internal class Serializer : BaseSerializer<Position>(Position::class) {

                    override fun serialize(
                        value: Position,
                        generator: JsonGenerator,
                        provider: SerializerProvider,
                    ) {
                        when {
                            value.type != null -> generator.writeObject(value.type)
                            value.scorer != null -> generator.writeObject(value.scorer)
                            value._json != null -> generator.writeObject(value._json)
                            else -> throw IllegalStateException("Invalid Position")
                        }
                    }
                }

                @NoAutoDetect
                class Type
                @JsonCreator
                private constructor(
                    @JsonProperty("type")
                    @ExcludeMissing
                    private val type: JsonField<InnerType> = JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    /**
                     * @throws BraintrustInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun type(): InnerType = type.getRequired("type")

                    /**
                     * Returns the raw JSON value of [type].
                     *
                     * Unlike [type], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<InnerType> = type

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): Type = apply {
                        if (validated) {
                            return@apply
                        }

                        type()
                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        /**
                         * Returns a mutable builder for constructing an instance of [Type].
                         *
                         * The following fields are required:
                         * ```java
                         * .type()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Type]. */
                    class Builder internal constructor() {

                        private var type: JsonField<InnerType>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(type: Type) = apply {
                            this.type = type.type
                            additionalProperties = type.additionalProperties.toMutableMap()
                        }

                        fun type(type: InnerType) = type(JsonField.of(type))

                        /**
                         * Sets [Builder.type] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.type] with a well-typed [InnerType]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun type(type: JsonField<InnerType>) = apply { this.type = type }

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

                        /**
                         * Returns an immutable instance of [Type].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .type()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): Type =
                            Type(checkRequired("type", type), additionalProperties.toImmutable())
                    }

                    class InnerType
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

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

                            @JvmField val TASK = of("task")

                            @JvmStatic fun of(value: String) = InnerType(JsonField.of(value))
                        }

                        /** An enum containing [InnerType]'s known values. */
                        enum class Known {
                            TASK
                        }

                        /**
                         * An enum containing [InnerType]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [InnerType] can contain an unknown value in a couple of
                         * cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            TASK,
                            /**
                             * An enum member indicating that [InnerType] was instantiated with an
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
                                TASK -> Value.TASK
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
                                TASK -> Known.TASK
                                else ->
                                    throw BraintrustInvalidDataException(
                                        "Unknown InnerType: $value"
                                    )
                            }

                        /**
                         * Returns this class instance's primitive wire representation.
                         *
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
                         *
                         * @throws BraintrustInvalidDataException if this class instance's value
                         *   does not have the expected primitive type.
                         */
                        fun asString(): String =
                            _value().asString().orElseThrow {
                                BraintrustInvalidDataException("Value is not a String")
                            }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is InnerType && value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Type && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(type, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Type{type=$type, additionalProperties=$additionalProperties}"
                }

                @NoAutoDetect
                class Scorer
                @JsonCreator
                private constructor(
                    @JsonProperty("index")
                    @ExcludeMissing
                    private val index: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("type")
                    @ExcludeMissing
                    private val type: JsonField<Type> = JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    /**
                     * @throws BraintrustInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun index(): Long = index.getRequired("index")

                    /**
                     * @throws BraintrustInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun type(): Type = type.getRequired("type")

                    /**
                     * Returns the raw JSON value of [index].
                     *
                     * Unlike [index], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("index") @ExcludeMissing fun _index(): JsonField<Long> = index

                    /**
                     * Returns the raw JSON value of [type].
                     *
                     * Unlike [type], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): Scorer = apply {
                        if (validated) {
                            return@apply
                        }

                        index()
                        type()
                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        /**
                         * Returns a mutable builder for constructing an instance of [Scorer].
                         *
                         * The following fields are required:
                         * ```java
                         * .index()
                         * .type()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Scorer]. */
                    class Builder internal constructor() {

                        private var index: JsonField<Long>? = null
                        private var type: JsonField<Type>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(scorer: Scorer) = apply {
                            index = scorer.index
                            type = scorer.type
                            additionalProperties = scorer.additionalProperties.toMutableMap()
                        }

                        fun index(index: Long) = index(JsonField.of(index))

                        /**
                         * Sets [Builder.index] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.index] with a well-typed [Long] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun index(index: JsonField<Long>) = apply { this.index = index }

                        fun type(type: Type) = type(JsonField.of(type))

                        /**
                         * Sets [Builder.type] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.type] with a well-typed [Type] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
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

                        /**
                         * Returns an immutable instance of [Scorer].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .index()
                         * .type()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): Scorer =
                            Scorer(
                                checkRequired("index", index),
                                checkRequired("type", type),
                                additionalProperties.toImmutable(),
                            )
                    }

                    class Type
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

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

                            @JvmField val SCORER = of("scorer")

                            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                        }

                        /** An enum containing [Type]'s known values. */
                        enum class Known {
                            SCORER
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
                            SCORER,
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
                                SCORER -> Value.SCORER
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
                                SCORER -> Known.SCORER
                                else -> throw BraintrustInvalidDataException("Unknown Type: $value")
                            }

                        /**
                         * Returns this class instance's primitive wire representation.
                         *
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
                         *
                         * @throws BraintrustInvalidDataException if this class instance's value
                         *   does not have the expected primitive type.
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

                        return /* spotless:off */ other is Scorer && index == other.index && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(index, type, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Scorer{index=$index, type=$type, additionalProperties=$additionalProperties}"
                }
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

                    @JvmField val EXPERIMENT = of("experiment")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    EXPERIMENT
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
                    EXPERIMENT,
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
                        EXPERIMENT -> Value.EXPERIMENT
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
                        EXPERIMENT -> Known.EXPERIMENT
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

                return /* spotless:off */ other is Experiment && evalName == other.evalName && position == other.position && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(evalName, position, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Experiment{evalName=$evalName, position=$position, type=$type, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class Function
        @JsonCreator
        private constructor(
            @JsonProperty("index")
            @ExcludeMissing
            private val index: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("type")
            @ExcludeMissing
            private val type: JsonField<Type> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /**
             * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun index(): Long = index.getRequired("index")

            /**
             * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun type(): Type = type.getRequired("type")

            /**
             * Returns the raw JSON value of [index].
             *
             * Unlike [index], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("index") @ExcludeMissing fun _index(): JsonField<Long> = index

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Function = apply {
                if (validated) {
                    return@apply
                }

                index()
                type()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [Function].
                 *
                 * The following fields are required:
                 * ```java
                 * .index()
                 * .type()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Function]. */
            class Builder internal constructor() {

                private var index: JsonField<Long>? = null
                private var type: JsonField<Type>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(function: Function) = apply {
                    index = function.index
                    type = function.type
                    additionalProperties = function.additionalProperties.toMutableMap()
                }

                fun index(index: Long) = index(JsonField.of(index))

                /**
                 * Sets [Builder.index] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.index] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun index(index: JsonField<Long>) = apply { this.index = index }

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
                 * .index()
                 * .type()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Function =
                    Function(
                        checkRequired("index", index),
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

                return /* spotless:off */ other is Function && index == other.index && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(index, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Function{index=$index, type=$type, additionalProperties=$additionalProperties}"
        }
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
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun runtime(): Runtime = runtime.getRequired("runtime")

        /**
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun version(): String = version.getRequired("version")

        /**
         * Returns the raw JSON value of [runtime].
         *
         * Unlike [runtime], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("runtime") @ExcludeMissing fun _runtime(): JsonField<Runtime> = runtime

        /**
         * Returns the raw JSON value of [version].
         *
         * Unlike [version], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<String> = version

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

            /**
             * Returns a mutable builder for constructing an instance of [RuntimeContext].
             *
             * The following fields are required:
             * ```java
             * .runtime()
             * .version()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [RuntimeContext]. */
        class Builder internal constructor() {

            private var runtime: JsonField<Runtime>? = null
            private var version: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(runtimeContext: RuntimeContext) = apply {
                runtime = runtimeContext.runtime
                version = runtimeContext.version
                additionalProperties = runtimeContext.additionalProperties.toMutableMap()
            }

            fun runtime(runtime: Runtime) = runtime(JsonField.of(runtime))

            /**
             * Sets [Builder.runtime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.runtime] with a well-typed [Runtime] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun runtime(runtime: JsonField<Runtime>) = apply { this.runtime = runtime }

            fun version(version: String) = version(JsonField.of(version))

            /**
             * Sets [Builder.version] to an arbitrary JSON value.
             *
             * You should usually call [Builder.version] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun version(version: JsonField<String>) = apply { this.version = version }

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
             * Returns an immutable instance of [RuntimeContext].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .runtime()
             * .version()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): RuntimeContext =
                RuntimeContext(
                    checkRequired("runtime", runtime),
                    checkRequired("version", version),
                    additionalProperties.toImmutable(),
                )
        }

        class Runtime @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

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
             * An enum containing [Runtime]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Runtime] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                NODE,
                PYTHON,
                /**
                 * An enum member indicating that [Runtime] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
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
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws BraintrustInvalidDataException if this class instance's value is a not a
             *   known member.
             */
            fun known(): Known =
                when (this) {
                    NODE -> Known.NODE
                    PYTHON -> Known.PYTHON
                    else -> throw BraintrustInvalidDataException("Unknown Runtime: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws BraintrustInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    BraintrustInvalidDataException("Value is not a String")
                }

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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CodeBundle && bundleId == other.bundleId && location == other.location && runtimeContext == other.runtimeContext && preview == other.preview && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(bundleId, location, runtimeContext, preview, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CodeBundle{bundleId=$bundleId, location=$location, runtimeContext=$runtimeContext, preview=$preview, additionalProperties=$additionalProperties}"
}
