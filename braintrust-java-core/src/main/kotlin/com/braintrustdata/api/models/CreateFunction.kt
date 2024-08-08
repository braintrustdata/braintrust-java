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

@JsonDeserialize(builder = CreateFunction.Builder::class)
@NoAutoDetect
class CreateFunction
private constructor(
    private val projectId: JsonField<String>,
    private val name: JsonField<String>,
    private val slug: JsonField<String>,
    private val description: JsonField<String>,
    private val promptData: JsonField<PromptData>,
    private val tags: JsonField<List<String>>,
    private val functionData: JsonField<FunctionData>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** Unique identifier for the project that the prompt belongs under */
    fun projectId(): String = projectId.getRequired("project_id")

    /** Name of the prompt */
    fun name(): String = name.getRequired("name")

    /** Unique identifier for the prompt */
    fun slug(): String = slug.getRequired("slug")

    /** Textual description of the prompt */
    fun description(): Optional<String> =
        Optional.ofNullable(description.getNullable("description"))

    /** The prompt, model, and its parameters */
    fun promptData(): Optional<PromptData> =
        Optional.ofNullable(promptData.getNullable("prompt_data"))

    /** A list of tags for the prompt */
    fun tags(): Optional<List<String>> = Optional.ofNullable(tags.getNullable("tags"))

    fun functionData(): FunctionData = functionData.getRequired("function_data")

    /** Unique identifier for the project that the prompt belongs under */
    @JsonProperty("project_id") @ExcludeMissing fun _projectId() = projectId

    /** Name of the prompt */
    @JsonProperty("name") @ExcludeMissing fun _name() = name

    /** Unique identifier for the prompt */
    @JsonProperty("slug") @ExcludeMissing fun _slug() = slug

    /** Textual description of the prompt */
    @JsonProperty("description") @ExcludeMissing fun _description() = description

    /** The prompt, model, and its parameters */
    @JsonProperty("prompt_data") @ExcludeMissing fun _promptData() = promptData

    /** A list of tags for the prompt */
    @JsonProperty("tags") @ExcludeMissing fun _tags() = tags

    @JsonProperty("function_data") @ExcludeMissing fun _functionData() = functionData

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): CreateFunction = apply {
        if (!validated) {
            projectId()
            name()
            slug()
            description()
            promptData().map { it.validate() }
            tags()
            functionData()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CreateFunction &&
            this.projectId == other.projectId &&
            this.name == other.name &&
            this.slug == other.slug &&
            this.description == other.description &&
            this.promptData == other.promptData &&
            this.tags == other.tags &&
            this.functionData == other.functionData &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    projectId,
                    name,
                    slug,
                    description,
                    promptData,
                    tags,
                    functionData,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "CreateFunction{projectId=$projectId, name=$name, slug=$slug, description=$description, promptData=$promptData, tags=$tags, functionData=$functionData, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var projectId: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var slug: JsonField<String> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var promptData: JsonField<PromptData> = JsonMissing.of()
        private var tags: JsonField<List<String>> = JsonMissing.of()
        private var functionData: JsonField<FunctionData> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(createFunction: CreateFunction) = apply {
            this.projectId = createFunction.projectId
            this.name = createFunction.name
            this.slug = createFunction.slug
            this.description = createFunction.description
            this.promptData = createFunction.promptData
            this.tags = createFunction.tags
            this.functionData = createFunction.functionData
            additionalProperties(createFunction.additionalProperties)
        }

        /** Unique identifier for the project that the prompt belongs under */
        fun projectId(projectId: String) = projectId(JsonField.of(projectId))

        /** Unique identifier for the project that the prompt belongs under */
        @JsonProperty("project_id")
        @ExcludeMissing
        fun projectId(projectId: JsonField<String>) = apply { this.projectId = projectId }

        /** Name of the prompt */
        fun name(name: String) = name(JsonField.of(name))

        /** Name of the prompt */
        @JsonProperty("name")
        @ExcludeMissing
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Unique identifier for the prompt */
        fun slug(slug: String) = slug(JsonField.of(slug))

        /** Unique identifier for the prompt */
        @JsonProperty("slug")
        @ExcludeMissing
        fun slug(slug: JsonField<String>) = apply { this.slug = slug }

        /** Textual description of the prompt */
        fun description(description: String) = description(JsonField.of(description))

        /** Textual description of the prompt */
        @JsonProperty("description")
        @ExcludeMissing
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** The prompt, model, and its parameters */
        fun promptData(promptData: PromptData) = promptData(JsonField.of(promptData))

        /** The prompt, model, and its parameters */
        @JsonProperty("prompt_data")
        @ExcludeMissing
        fun promptData(promptData: JsonField<PromptData>) = apply { this.promptData = promptData }

        /** A list of tags for the prompt */
        fun tags(tags: List<String>) = tags(JsonField.of(tags))

        /** A list of tags for the prompt */
        @JsonProperty("tags")
        @ExcludeMissing
        fun tags(tags: JsonField<List<String>>) = apply { this.tags = tags }

        fun functionData(functionData: FunctionData) = functionData(JsonField.of(functionData))

        @JsonProperty("function_data")
        @ExcludeMissing
        fun functionData(functionData: JsonField<FunctionData>) = apply {
            this.functionData = functionData
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

        fun build(): CreateFunction =
            CreateFunction(
                projectId,
                name,
                slug,
                description,
                promptData,
                tags.map { it.toUnmodifiable() },
                functionData,
                additionalProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(using = FunctionData.Deserializer::class)
    @JsonSerialize(using = FunctionData.Serializer::class)
    class FunctionData
    private constructor(
        private val prompt: Prompt? = null,
        private val code: Code? = null,
        private val global: Global? = null,
        private val _json: JsonValue? = null,
    ) {

        private var validated: Boolean = false

        fun prompt(): Optional<Prompt> = Optional.ofNullable(prompt)

        fun code(): Optional<Code> = Optional.ofNullable(code)

        fun global(): Optional<Global> = Optional.ofNullable(global)

        fun isPrompt(): Boolean = prompt != null

        fun isCode(): Boolean = code != null

        fun isGlobal(): Boolean = global != null

        fun asPrompt(): Prompt = prompt.getOrThrow("prompt")

        fun asCode(): Code = code.getOrThrow("code")

        fun asGlobal(): Global = global.getOrThrow("global")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                prompt != null -> visitor.visitPrompt(prompt)
                code != null -> visitor.visitCode(code)
                global != null -> visitor.visitGlobal(global)
                else -> visitor.unknown(_json)
            }
        }

        fun validate(): FunctionData = apply {
            if (!validated) {
                if (prompt == null && code == null && global == null) {
                    throw BraintrustInvalidDataException("Unknown FunctionData: $_json")
                }
                prompt?.validate()
                code?.validate()
                global?.validate()
                validated = true
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is FunctionData &&
                this.prompt == other.prompt &&
                this.code == other.code &&
                this.global == other.global
        }

        override fun hashCode(): Int {
            return Objects.hash(
                prompt,
                code,
                global,
            )
        }

        override fun toString(): String {
            return when {
                prompt != null -> "FunctionData{prompt=$prompt}"
                code != null -> "FunctionData{code=$code}"
                global != null -> "FunctionData{global=$global}"
                _json != null -> "FunctionData{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid FunctionData")
            }
        }

        companion object {

            @JvmStatic fun ofPrompt(prompt: Prompt) = FunctionData(prompt = prompt)

            @JvmStatic fun ofCode(code: Code) = FunctionData(code = code)

            @JvmStatic fun ofGlobal(global: Global) = FunctionData(global = global)
        }

        interface Visitor<out T> {

            fun visitPrompt(prompt: Prompt): T

            fun visitCode(code: Code): T

            fun visitGlobal(global: Global): T

            fun unknown(json: JsonValue?): T {
                throw BraintrustInvalidDataException("Unknown FunctionData: $json")
            }
        }

        class Deserializer : BaseDeserializer<FunctionData>(FunctionData::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): FunctionData {
                val json = JsonValue.fromJsonNode(node)
                tryDeserialize(node, jacksonTypeRef<Prompt>()) { it.validate() }
                    ?.let {
                        return FunctionData(prompt = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<Code>()) { it.validate() }
                    ?.let {
                        return FunctionData(code = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<Global>()) { it.validate() }
                    ?.let {
                        return FunctionData(global = it, _json = json)
                    }

                return FunctionData(_json = json)
            }
        }

        class Serializer : BaseSerializer<FunctionData>(FunctionData::class) {

            override fun serialize(
                value: FunctionData,
                generator: JsonGenerator,
                provider: SerializerProvider
            ) {
                when {
                    value.prompt != null -> generator.writeObject(value.prompt)
                    value.code != null -> generator.writeObject(value.code)
                    value.global != null -> generator.writeObject(value.global)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid FunctionData")
                }
            }
        }

        @JsonDeserialize(builder = Prompt.Builder::class)
        @NoAutoDetect
        class Prompt
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

            fun validate(): Prompt = apply {
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

                return other is Prompt &&
                    this.type == other.type &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = Objects.hash(type, additionalProperties)
                }
                return hashCode
            }

            override fun toString() =
                "Prompt{type=$type, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var type: JsonField<Type> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(prompt: Prompt) = apply {
                    this.type = prompt.type
                    additionalProperties(prompt.additionalProperties)
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

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Prompt = Prompt(type, additionalProperties.toUnmodifiable())
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

                    @JvmField val PROMPT = Type(JsonField.of("prompt"))

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                enum class Known {
                    PROMPT,
                }

                enum class Value {
                    PROMPT,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        PROMPT -> Value.PROMPT
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        PROMPT -> Known.PROMPT
                        else -> throw BraintrustInvalidDataException("Unknown Type: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }
        }

        @JsonDeserialize(builder = Code.Builder::class)
        @NoAutoDetect
        class Code
        private constructor(
            private val type: JsonField<Type>,
            private val data: JsonField<Data>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun type(): Type = type.getRequired("type")

            fun data(): Data = data.getRequired("data")

            @JsonProperty("type") @ExcludeMissing fun _type() = type

            @JsonProperty("data") @ExcludeMissing fun _data() = data

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Code = apply {
                if (!validated) {
                    type()
                    data().validate()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Code &&
                    this.type == other.type &&
                    this.data == other.data &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            type,
                            data,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Code{type=$type, data=$data, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var type: JsonField<Type> = JsonMissing.of()
                private var data: JsonField<Data> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(code: Code) = apply {
                    this.type = code.type
                    this.data = code.data
                    additionalProperties(code.additionalProperties)
                }

                fun type(type: Type) = type(JsonField.of(type))

                @JsonProperty("type")
                @ExcludeMissing
                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun data(data: Data) = data(JsonField.of(data))

                @JsonProperty("data")
                @ExcludeMissing
                fun data(data: JsonField<Data>) = apply { this.data = data }

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

                fun build(): Code =
                    Code(
                        type,
                        data,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            @JsonDeserialize(builder = Data.Builder::class)
            @NoAutoDetect
            class Data
            private constructor(
                private val runtimeContext: JsonField<RuntimeContext>,
                private val location: JsonField<Location>,
                private val bundleId: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                fun runtimeContext(): RuntimeContext = runtimeContext.getRequired("runtime_context")

                fun location(): Location = location.getRequired("location")

                fun bundleId(): String = bundleId.getRequired("bundle_id")

                @JsonProperty("runtime_context")
                @ExcludeMissing
                fun _runtimeContext() = runtimeContext

                @JsonProperty("location") @ExcludeMissing fun _location() = location

                @JsonProperty("bundle_id") @ExcludeMissing fun _bundleId() = bundleId

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): Data = apply {
                    if (!validated) {
                        runtimeContext().validate()
                        location().validate()
                        bundleId()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Data &&
                        this.runtimeContext == other.runtimeContext &&
                        this.location == other.location &&
                        this.bundleId == other.bundleId &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                runtimeContext,
                                location,
                                bundleId,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "Data{runtimeContext=$runtimeContext, location=$location, bundleId=$bundleId, additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var runtimeContext: JsonField<RuntimeContext> = JsonMissing.of()
                    private var location: JsonField<Location> = JsonMissing.of()
                    private var bundleId: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(data: Data) = apply {
                        this.runtimeContext = data.runtimeContext
                        this.location = data.location
                        this.bundleId = data.bundleId
                        additionalProperties(data.additionalProperties)
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

                    fun build(): Data =
                        Data(
                            runtimeContext,
                            location,
                            bundleId,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                @JsonDeserialize(builder = Location.Builder::class)
                @NoAutoDetect
                class Location
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

                    fun validate(): Location = apply {
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

                        return other is Location &&
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
                        "Location{type=$type, evalName=$evalName, position=$position, additionalProperties=$additionalProperties}"

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var type: JsonField<Type> = JsonMissing.of()
                        private var evalName: JsonField<String> = JsonMissing.of()
                        private var position: JsonField<Position> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(location: Location) = apply {
                            this.type = location.type
                            this.evalName = location.evalName
                            this.position = location.position
                            additionalProperties(location.additionalProperties)
                        }

                        fun type(type: Type) = type(JsonField.of(type))

                        @JsonProperty("type")
                        @ExcludeMissing
                        fun type(type: JsonField<Type>) = apply { this.type = type }

                        fun evalName(evalName: String) = evalName(JsonField.of(evalName))

                        @JsonProperty("eval_name")
                        @ExcludeMissing
                        fun evalName(evalName: JsonField<String>) = apply {
                            this.evalName = evalName
                        }

                        fun position(position: Position) = position(JsonField.of(position))

                        @JsonProperty("position")
                        @ExcludeMissing
                        fun position(position: JsonField<Position>) = apply {
                            this.position = position
                        }

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

                        fun build(): Location =
                            Location(
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
                        private val score: Score? = null,
                        private val _json: JsonValue? = null,
                    ) {

                        private var validated: Boolean = false

                        fun task(): Optional<Task> = Optional.ofNullable(task)

                        fun score(): Optional<Score> = Optional.ofNullable(score)

                        fun isTask(): Boolean = task != null

                        fun isScore(): Boolean = score != null

                        fun asTask(): Task = task.getOrThrow("task")

                        fun asScore(): Score = score.getOrThrow("score")

                        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                        fun <T> accept(visitor: Visitor<T>): T {
                            return when {
                                task != null -> visitor.visitTask(task)
                                score != null -> visitor.visitScore(score)
                                else -> visitor.unknown(_json)
                            }
                        }

                        fun validate(): Position = apply {
                            if (!validated) {
                                if (task == null && score == null) {
                                    throw BraintrustInvalidDataException("Unknown Position: $_json")
                                }
                                score?.validate()
                                validated = true
                            }
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Position &&
                                this.task == other.task &&
                                this.score == other.score
                        }

                        override fun hashCode(): Int {
                            return Objects.hash(task, score)
                        }

                        override fun toString(): String {
                            return when {
                                task != null -> "Position{task=$task}"
                                score != null -> "Position{score=$score}"
                                _json != null -> "Position{_unknown=$_json}"
                                else -> throw IllegalStateException("Invalid Position")
                            }
                        }

                        companion object {

                            @JvmStatic fun ofTask(task: Task) = Position(task = task)

                            @JvmStatic fun ofScore(score: Score) = Position(score = score)
                        }

                        interface Visitor<out T> {

                            fun visitTask(task: Task): T

                            fun visitScore(score: Score): T

                            fun unknown(json: JsonValue?): T {
                                throw BraintrustInvalidDataException("Unknown Position: $json")
                            }
                        }

                        class Deserializer : BaseDeserializer<Position>(Position::class) {

                            override fun ObjectCodec.deserialize(node: JsonNode): Position {
                                val json = JsonValue.fromJsonNode(node)
                                tryDeserialize(node, jacksonTypeRef<Task>())?.let {
                                    return Position(task = it, _json = json)
                                }
                                tryDeserialize(node, jacksonTypeRef<Score>()) { it.validate() }
                                    ?.let {
                                        return Position(score = it, _json = json)
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
                                    value.score != null -> generator.writeObject(value.score)
                                    value._json != null -> generator.writeObject(value._json)
                                    else -> throw IllegalStateException("Invalid Position")
                                }
                            }
                        }

                        class Task
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

                                return other is Task && this.value == other.value
                            }

                            override fun hashCode() = value.hashCode()

                            override fun toString() = value.toString()

                            companion object {

                                @JvmField val TASK = Task(JsonField.of("task"))

                                @JvmStatic fun of(value: String) = Task(JsonField.of(value))
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
                                    else ->
                                        throw BraintrustInvalidDataException("Unknown Task: $value")
                                }

                            fun asString(): String = _value().asStringOrThrow()
                        }

                        @JsonDeserialize(builder = Score.Builder::class)
                        @NoAutoDetect
                        class Score
                        private constructor(
                            private val score: JsonField<Double>,
                            private val additionalProperties: Map<String, JsonValue>,
                        ) {

                            private var validated: Boolean = false

                            private var hashCode: Int = 0

                            fun score(): Double = score.getRequired("score")

                            @JsonProperty("score") @ExcludeMissing fun _score() = score

                            @JsonAnyGetter
                            @ExcludeMissing
                            fun _additionalProperties(): Map<String, JsonValue> =
                                additionalProperties

                            fun validate(): Score = apply {
                                if (!validated) {
                                    score()
                                    validated = true
                                }
                            }

                            fun toBuilder() = Builder().from(this)

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return other is Score &&
                                    this.score == other.score &&
                                    this.additionalProperties == other.additionalProperties
                            }

                            override fun hashCode(): Int {
                                if (hashCode == 0) {
                                    hashCode = Objects.hash(score, additionalProperties)
                                }
                                return hashCode
                            }

                            override fun toString() =
                                "Score{score=$score, additionalProperties=$additionalProperties}"

                            companion object {

                                @JvmStatic fun builder() = Builder()
                            }

                            class Builder {

                                private var score: JsonField<Double> = JsonMissing.of()
                                private var additionalProperties: MutableMap<String, JsonValue> =
                                    mutableMapOf()

                                @JvmSynthetic
                                internal fun from(score: Score) = apply {
                                    this.score = score.score
                                    additionalProperties(score.additionalProperties)
                                }

                                fun score(score: Double) = score(JsonField.of(score))

                                @JsonProperty("score")
                                @ExcludeMissing
                                fun score(score: JsonField<Double>) = apply { this.score = score }

                                fun additionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply {
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

                                fun build(): Score =
                                    Score(score, additionalProperties.toUnmodifiable())
                            }
                        }
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
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

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

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

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

                            @JvmStatic fun of(value: String) = Runtime(JsonField.of(value))
                        }

                        enum class Known {
                            NODE,
                        }

                        enum class Value {
                            NODE,
                            _UNKNOWN,
                        }

                        fun value(): Value =
                            when (this) {
                                NODE -> Value.NODE
                                else -> Value._UNKNOWN
                            }

                        fun known(): Known =
                            when (this) {
                                NODE -> Known.NODE
                                else ->
                                    throw BraintrustInvalidDataException("Unknown Runtime: $value")
                            }

                        fun asString(): String = _value().asStringOrThrow()
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

                    @JvmField val CODE = Type(JsonField.of("code"))

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                enum class Known {
                    CODE,
                }

                enum class Value {
                    CODE,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        CODE -> Value.CODE
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        CODE -> Known.CODE
                        else -> throw BraintrustInvalidDataException("Unknown Type: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }
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

            private var hashCode: Int = 0

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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Global &&
                    this.type == other.type &&
                    this.name == other.name &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            type,
                            name,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Global{type=$type, name=$name, additionalProperties=$additionalProperties}"

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
        }
    }
}
