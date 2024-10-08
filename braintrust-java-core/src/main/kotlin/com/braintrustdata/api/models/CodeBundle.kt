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

    private var hashCode: Int = 0

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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CodeBundle &&
            this.runtimeContext == other.runtimeContext &&
            this.location == other.location &&
            this.bundleId == other.bundleId &&
            this.preview == other.preview &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    runtimeContext,
                    location,
                    bundleId,
                    preview,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "CodeBundle{runtimeContext=$runtimeContext, location=$location, bundleId=$bundleId, preview=$preview, additionalProperties=$additionalProperties}"

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
                additionalProperties.toUnmodifiable(),
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

            return other is Location &&
                this.experiment == other.experiment &&
                this.function == other.function
        }

        override fun hashCode(): Int {
            return Objects.hash(experiment, function)
        }

        override fun toString(): String {
            return when {
                experiment != null -> "Location{experiment=$experiment}"
                function != null -> "Location{function=$function}"
                _json != null -> "Location{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Location")
            }
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

            private var hashCode: Int = 0

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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Experiment &&
                    this.type == other.type &&
                    this.evalName == other.evalName &&
                    this.position == other.position &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            type,
                            evalName,
                            position,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Experiment{type=$type, evalName=$evalName, position=$position, additionalProperties=$additionalProperties}"

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
                        additionalProperties.toUnmodifiable(),
                    )
            }

            @JsonDeserialize(using = Position.Deserializer::class)
            @JsonSerialize(using = Position.Serializer::class)
            class Position
            private constructor(
                private val task: Task? = null,
                private val scorer: Scorer? = null,
                private val _json: JsonValue? = null,
            ) {

                private var validated: Boolean = false

                fun task(): Optional<Task> = Optional.ofNullable(task)

                fun scorer(): Optional<Scorer> = Optional.ofNullable(scorer)

                fun isTask(): Boolean = task != null

                fun isScorer(): Boolean = scorer != null

                fun asTask(): Task = task.getOrThrow("task")

                fun asScorer(): Scorer = scorer.getOrThrow("scorer")

                fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                fun <T> accept(visitor: Visitor<T>): T {
                    return when {
                        task != null -> visitor.visitTask(task)
                        scorer != null -> visitor.visitScorer(scorer)
                        else -> visitor.unknown(_json)
                    }
                }

                fun validate(): Position = apply {
                    if (!validated) {
                        if (task == null && scorer == null) {
                            throw BraintrustInvalidDataException("Unknown Position: $_json")
                        }
                        task?.validate()
                        scorer?.validate()
                        validated = true
                    }
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Position &&
                        this.task == other.task &&
                        this.scorer == other.scorer
                }

                override fun hashCode(): Int {
                    return Objects.hash(task, scorer)
                }

                override fun toString(): String {
                    return when {
                        task != null -> "Position{task=$task}"
                        scorer != null -> "Position{scorer=$scorer}"
                        _json != null -> "Position{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid Position")
                    }
                }

                companion object {

                    @JvmStatic fun ofTask(task: Task) = Position(task = task)

                    @JvmStatic fun ofScorer(scorer: Scorer) = Position(scorer = scorer)
                }

                interface Visitor<out T> {

                    fun visitTask(task: Task): T

                    fun visitScorer(scorer: Scorer): T

                    fun unknown(json: JsonValue?): T {
                        throw BraintrustInvalidDataException("Unknown Position: $json")
                    }
                }

                class Deserializer : BaseDeserializer<Position>(Position::class) {

                    override fun ObjectCodec.deserialize(node: JsonNode): Position {
                        val json = JsonValue.fromJsonNode(node)
                        tryDeserialize(node, jacksonTypeRef<Task>()) { it.validate() }
                            ?.let {
                                return Position(task = it, _json = json)
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
                            value.task != null -> generator.writeObject(value.task)
                            value.scorer != null -> generator.writeObject(value.scorer)
                            value._json != null -> generator.writeObject(value._json)
                            else -> throw IllegalStateException("Invalid Position")
                        }
                    }
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

                    return other is Type && this.value == other.value
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

            private var hashCode: Int = 0

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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Function &&
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
                "Function{type=$type, index=$index, additionalProperties=$additionalProperties}"

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

        private var hashCode: Int = 0

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is RuntimeContext &&
                this.runtime == other.runtime &&
                this.version == other.version &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        runtime,
                        version,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "RuntimeContext{runtime=$runtime, version=$version, additionalProperties=$additionalProperties}"

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
                    additionalProperties.toUnmodifiable(),
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

                return other is Runtime && this.value == other.value
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
    }
}
