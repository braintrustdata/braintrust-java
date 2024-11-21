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

@JsonDeserialize(builder = CodeBundle.Builder::class)
@NoAutoDetect
class CodeBundle
private constructor(
    private val runtimeContext: JsonField<RuntimeContext>,
    private val location: JsonField<Location>,
    private val bundleId: JsonField<String>,
    private val preview: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    fun runtimeContext(): RuntimeContext = runtimeContext.getRequired("runtime_context")

    fun location(): Location = location.getRequired("location")

    fun bundleId(): String = bundleId.getRequired("bundle_id")

    /** A preview of the code */
    fun preview(): Optional<String> = Optional.ofNullable(preview.getNullable("preview"))

    @JsonProperty("runtime_context") @ExcludeMissing fun _runtimeContext() = runtimeContext

    @JsonProperty("location") @ExcludeMissing fun _location() = location

    @JsonProperty("bundle_id") @ExcludeMissing fun _bundleId() = bundleId

    /** A preview of the code */
    @JsonProperty("preview") @ExcludeMissing fun _preview() = preview

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): CodeBundle = apply {
        if (!validated) {
            runtimeContext().validate()
            location()
            bundleId()
            preview()
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
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(codeBundle: CodeBundle) = apply {
            this.runtimeContext = codeBundle.runtimeContext
            this.location = codeBundle.location
            this.bundleId = codeBundle.bundleId
            this.preview = codeBundle.preview
            additionalProperties(codeBundle.additionalProperties)
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
        fun location(location: JsonField<Location>) = apply { this.location = location }

        fun bundleId(bundleId: String) = bundleId(JsonField.of(bundleId))

        @JsonProperty("bundle_id")
        @ExcludeMissing
        fun bundleId(bundleId: JsonField<String>) = apply { this.bundleId = bundleId }

        /** A preview of the code */
        fun preview(preview: String) = preview(JsonField.of(preview))

        /** A preview of the code */
        @JsonProperty("preview")
        @ExcludeMissing
        fun preview(preview: JsonField<String>) = apply { this.preview = preview }

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

        fun build(): CodeBundle =
            CodeBundle(
                runtimeContext,
                location,
                bundleId,
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

        private var validated: Boolean = false

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

        fun validate(): Location = apply {
            if (!validated) {
                if (experiment == null && function == null) {
                    throw BraintrustInvalidDataException("Unknown Location: $_json")
                }
                experiment?.validate()
                function?.validate()
                validated = true
            }
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

        interface Visitor<out T> {

            fun visitExperiment(experiment: Experiment): T

            fun visitFunction(function: Function): T

            fun unknown(json: JsonValue?): T {
                throw BraintrustInvalidDataException("Unknown Location: $json")
            }
        }

        class Deserializer : BaseDeserializer<Location>(Location::class) {

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

        class Serializer : BaseSerializer<Location>(Location::class) {

            override fun serialize(
                value: Location,
                generator: JsonGenerator,
                provider: SerializerProvider
            ) {
                when {
                    value.experiment != null -> generator.writeObject(value.experiment)
                    value.function != null -> generator.writeObject(value.function)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Location")
                }
            }
        }

        @JsonDeserialize(builder = Experiment.Builder::class)
        @NoAutoDetect
        class Experiment
        private constructor(
            private val type: JsonField<Type>,
            private val evalName: JsonField<String>,
            private val position: JsonField<Position>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            fun type(): Type = type.getRequired("type")

            fun evalName(): String = evalName.getRequired("eval_name")

            fun position(): Position = position.getRequired("position")

            @JsonProperty("type") @ExcludeMissing fun _type() = type

            @JsonProperty("eval_name") @ExcludeMissing fun _evalName() = evalName

            @JsonProperty("position") @ExcludeMissing fun _position() = position

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Experiment = apply {
                if (!validated) {
                    type()
                    evalName()
                    position()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var type: JsonField<Type> = JsonMissing.of()
                private var evalName: JsonField<String> = JsonMissing.of()
                private var position: JsonField<Position> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(experiment: Experiment) = apply {
                    this.type = experiment.type
                    this.evalName = experiment.evalName
                    this.position = experiment.position
                    additionalProperties(experiment.additionalProperties)
                }

                fun type(type: Type) = type(JsonField.of(type))

                @JsonProperty("type")
                @ExcludeMissing
                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun evalName(evalName: String) = evalName(JsonField.of(evalName))

                @JsonProperty("eval_name")
                @ExcludeMissing
                fun evalName(evalName: JsonField<String>) = apply { this.evalName = evalName }

                fun position(position: Position) = position(JsonField.of(position))

                @JsonProperty("position")
                @ExcludeMissing
                fun position(position: JsonField<Position>) = apply { this.position = position }

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

                fun build(): Experiment =
                    Experiment(
                        type,
                        evalName,
                        position,
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

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var type: JsonField<Type> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(type: Type) = apply {
                            this.type = type.type
                            additionalProperties(type.additionalProperties)
                        }

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

                        fun build(): Type = Type(type, additionalProperties.toImmutable())
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

                            return /* spotless:off */ other is Type && value == other.value /* spotless:on */
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

                @JsonDeserialize(builder = Scorer.Builder::class)
                @NoAutoDetect
                class Scorer
                private constructor(
                    private val type: JsonField<Type>,
                    private val index: JsonField<Long>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

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

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var type: JsonField<Type> = JsonMissing.of()
                        private var index: JsonField<Long> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

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

                        fun build(): Scorer =
                            Scorer(
                                type,
                                index,
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

                            return /* spotless:off */ other is Type && value == other.value /* spotless:on */
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

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Scorer && type == other.type && index == other.index && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(type, index, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Scorer{type=$type, index=$index, additionalProperties=$additionalProperties}"
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

                    return /* spotless:off */ other is Type && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    @JvmField val EXPERIMENT = Type(JsonField.of("experiment"))

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                enum class Known {
                    EXPERIMENT,
                }

                enum class Value {
                    EXPERIMENT,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        EXPERIMENT -> Value.EXPERIMENT
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        EXPERIMENT -> Known.EXPERIMENT
                        else -> throw BraintrustInvalidDataException("Unknown Type: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Experiment && type == other.type && evalName == other.evalName && position == other.position && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(type, evalName, position, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Experiment{type=$type, evalName=$evalName, position=$position, additionalProperties=$additionalProperties}"
        }

        @JsonDeserialize(builder = Function.Builder::class)
        @NoAutoDetect
        class Function
        private constructor(
            private val type: JsonField<Type>,
            private val index: JsonField<Long>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            fun type(): Type = type.getRequired("type")

            fun index(): Long = index.getRequired("index")

            @JsonProperty("type") @ExcludeMissing fun _type() = type

            @JsonProperty("index") @ExcludeMissing fun _index() = index

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Function = apply {
                if (!validated) {
                    type()
                    index()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var type: JsonField<Type> = JsonMissing.of()
                private var index: JsonField<Long> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(function: Function) = apply {
                    this.type = function.type
                    this.index = function.index
                    additionalProperties(function.additionalProperties)
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

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Function =
                    Function(
                        type,
                        index,
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

                return /* spotless:off */ other is Function && type == other.type && index == other.index && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(type, index, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Function{type=$type, index=$index, additionalProperties=$additionalProperties}"
        }
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
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(runtimeContext: RuntimeContext) = apply {
                this.runtime = runtimeContext.runtime
                this.version = runtimeContext.version
                additionalProperties(runtimeContext.additionalProperties)
            }

            fun runtime(runtime: Runtime) = runtime(JsonField.of(runtime))

            @JsonProperty("runtime")
            @ExcludeMissing
            fun runtime(runtime: JsonField<Runtime>) = apply { this.runtime = runtime }

            fun version(version: String) = version(JsonField.of(version))

            @JsonProperty("version")
            @ExcludeMissing
            fun version(version: JsonField<String>) = apply { this.version = version }

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

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Runtime && value == other.value /* spotless:on */
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
                    else -> throw BraintrustInvalidDataException("Unknown Runtime: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
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

        return /* spotless:off */ other is CodeBundle && runtimeContext == other.runtimeContext && location == other.location && bundleId == other.bundleId && preview == other.preview && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(runtimeContext, location, bundleId, preview, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CodeBundle{runtimeContext=$runtimeContext, location=$location, bundleId=$bundleId, preview=$preview, additionalProperties=$additionalProperties}"
}
