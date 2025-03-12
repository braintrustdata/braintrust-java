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
import com.braintrustdata.api.core.checkKnown
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
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

@NoAutoDetect
class Function @JsonCreator private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("_xact_id") @ExcludeMissing private val _xactId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("function_data") @ExcludeMissing private val functionData: JsonField<FunctionData> = JsonMissing.of(),
    @JsonProperty("log_id") @ExcludeMissing private val logId: JsonField<LogId> = JsonMissing.of(),
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
    @JsonProperty("org_id") @ExcludeMissing private val orgId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("project_id") @ExcludeMissing private val projectId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("slug") @ExcludeMissing private val slug: JsonField<String> = JsonMissing.of(),
    @JsonProperty("created") @ExcludeMissing private val created: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("description") @ExcludeMissing private val description: JsonField<String> = JsonMissing.of(),
    @JsonProperty("function_schema") @ExcludeMissing private val functionSchema: JsonField<FunctionSchema> = JsonMissing.of(),
    @JsonProperty("function_type") @ExcludeMissing private val functionType: JsonField<FunctionType> = JsonMissing.of(),
    @JsonProperty("metadata") @ExcludeMissing private val metadata: JsonField<Metadata> = JsonMissing.of(),
    @JsonProperty("origin") @ExcludeMissing private val origin: JsonField<Origin> = JsonMissing.of(),
    @JsonProperty("prompt_data") @ExcludeMissing private val promptData: JsonField<PromptData> = JsonMissing.of(),
    @JsonProperty("tags") @ExcludeMissing private val tags: JsonField<List<String>> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),

) {

    /** Unique identifier for the prompt */
    fun id(): String = id.getRequired("id")

    /**
     * The transaction id of an event is unique to the network operation that processed
     * the event insertion. Transaction ids are monotonically increasing over time and
     * can be used to retrieve a versioned snapshot of the prompt (see the `version`
     * parameter)
     */
    fun _xactId(): String = _xactId.getRequired("_xact_id")

    fun functionData(): FunctionData = functionData.getRequired("function_data")

    /** A literal 'p' which identifies the object as a project prompt */
    fun logId(): LogId = logId.getRequired("log_id")

    /** Name of the prompt */
    fun name(): String = name.getRequired("name")

    /** Unique identifier for the organization */
    fun orgId(): String = orgId.getRequired("org_id")

    /** Unique identifier for the project that the prompt belongs under */
    fun projectId(): String = projectId.getRequired("project_id")

    /** Unique identifier for the prompt */
    fun slug(): String = slug.getRequired("slug")

    /** Date of prompt creation */
    fun created(): Optional<OffsetDateTime> = Optional.ofNullable(created.getNullable("created"))

    /** Textual description of the prompt */
    fun description(): Optional<String> = Optional.ofNullable(description.getNullable("description"))

    /** JSON schema for the function's parameters and return type */
    fun functionSchema(): Optional<FunctionSchema> = Optional.ofNullable(functionSchema.getNullable("function_schema"))

    fun functionType(): Optional<FunctionType> = Optional.ofNullable(functionType.getNullable("function_type"))

    /** User-controlled metadata about the prompt */
    fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata.getNullable("metadata"))

    fun origin(): Optional<Origin> = Optional.ofNullable(origin.getNullable("origin"))

    /** The prompt, model, and its parameters */
    fun promptData(): Optional<PromptData> = Optional.ofNullable(promptData.getNullable("prompt_data"))

    /** A list of tags for the prompt */
    fun tags(): Optional<List<String>> = Optional.ofNullable(tags.getNullable("tags"))

    /** Unique identifier for the prompt */
    @JsonProperty("id")
    @ExcludeMissing
    fun _id(): JsonField<String> = id

    /**
     * The transaction id of an event is unique to the network operation that processed
     * the event insertion. Transaction ids are monotonically increasing over time and
     * can be used to retrieve a versioned snapshot of the prompt (see the `version`
     * parameter)
     */
    @JsonProperty("_xact_id")
    @ExcludeMissing
    fun __xactId(): JsonField<String> = _xactId

    @JsonProperty("function_data")
    @ExcludeMissing
    fun _functionData(): JsonField<FunctionData> = functionData

    /** A literal 'p' which identifies the object as a project prompt */
    @JsonProperty("log_id")
    @ExcludeMissing
    fun _logId(): JsonField<LogId> = logId

    /** Name of the prompt */
    @JsonProperty("name")
    @ExcludeMissing
    fun _name(): JsonField<String> = name

    /** Unique identifier for the organization */
    @JsonProperty("org_id")
    @ExcludeMissing
    fun _orgId(): JsonField<String> = orgId

    /** Unique identifier for the project that the prompt belongs under */
    @JsonProperty("project_id")
    @ExcludeMissing
    fun _projectId(): JsonField<String> = projectId

    /** Unique identifier for the prompt */
    @JsonProperty("slug")
    @ExcludeMissing
    fun _slug(): JsonField<String> = slug

    /** Date of prompt creation */
    @JsonProperty("created")
    @ExcludeMissing
    fun _created(): JsonField<OffsetDateTime> = created

    /** Textual description of the prompt */
    @JsonProperty("description")
    @ExcludeMissing
    fun _description(): JsonField<String> = description

    /** JSON schema for the function's parameters and return type */
    @JsonProperty("function_schema")
    @ExcludeMissing
    fun _functionSchema(): JsonField<FunctionSchema> = functionSchema

    @JsonProperty("function_type")
    @ExcludeMissing
    fun _functionType(): JsonField<FunctionType> = functionType

    /** User-controlled metadata about the prompt */
    @JsonProperty("metadata")
    @ExcludeMissing
    fun _metadata(): JsonField<Metadata> = metadata

    @JsonProperty("origin")
    @ExcludeMissing
    fun _origin(): JsonField<Origin> = origin

    /** The prompt, model, and its parameters */
    @JsonProperty("prompt_data")
    @ExcludeMissing
    fun _promptData(): JsonField<PromptData> = promptData

    /** A list of tags for the prompt */
    @JsonProperty("tags")
    @ExcludeMissing
    fun _tags(): JsonField<List<String>> = tags

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): Function =
        apply {
            if (validated) {
              return@apply
            }

            id()
            _xactId()
            functionData().validate()
            logId()
            name()
            orgId()
            projectId()
            slug()
            created()
            description()
            functionSchema().ifPresent { it.validate() }
            functionType()
            metadata().ifPresent { it.validate() }
            origin().ifPresent { it.validate() }
            promptData().ifPresent { it.validate() }
            tags()
            validated = true
        }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [Function].
         *
         * The following fields are required:
         *
         * ```java
         * .id()
         * ._xactId()
         * .functionData()
         * .logId()
         * .name()
         * .orgId()
         * .projectId()
         * .slug()
         * ```
         */
        @JvmStatic
        fun builder() = Builder()
    }

    /** A builder for [Function]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var _xactId: JsonField<String>? = null
        private var functionData: JsonField<FunctionData>? = null
        private var logId: JsonField<LogId>? = null
        private var name: JsonField<String>? = null
        private var orgId: JsonField<String>? = null
        private var projectId: JsonField<String>? = null
        private var slug: JsonField<String>? = null
        private var created: JsonField<OffsetDateTime> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var functionSchema: JsonField<FunctionSchema> = JsonMissing.of()
        private var functionType: JsonField<FunctionType> = JsonMissing.of()
        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var origin: JsonField<Origin> = JsonMissing.of()
        private var promptData: JsonField<PromptData> = JsonMissing.of()
        private var tags: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(function: Function) =
            apply {
                id = function.id
                _xactId = function._xactId
                functionData = function.functionData
                logId = function.logId
                name = function.name
                orgId = function.orgId
                projectId = function.projectId
                slug = function.slug
                created = function.created
                description = function.description
                functionSchema = function.functionSchema
                functionType = function.functionType
                metadata = function.metadata
                origin = function.origin
                promptData = function.promptData
                tags = function.tags.map { it.toMutableList() }
                additionalProperties = function.additionalProperties.toMutableMap()
            }

        /** Unique identifier for the prompt */
        fun id(id: String) = id(JsonField.of(id))

        /** Unique identifier for the prompt */
        fun id(id: JsonField<String>) =
            apply {
                this.id = id
            }

        /**
         * The transaction id of an event is unique to the network operation that processed
         * the event insertion. Transaction ids are monotonically increasing over time and
         * can be used to retrieve a versioned snapshot of the prompt (see the `version`
         * parameter)
         */
        fun _xactId(_xactId: String) = _xactId(JsonField.of(_xactId))

        /**
         * The transaction id of an event is unique to the network operation that processed
         * the event insertion. Transaction ids are monotonically increasing over time and
         * can be used to retrieve a versioned snapshot of the prompt (see the `version`
         * parameter)
         */
        fun _xactId(_xactId: JsonField<String>) =
            apply {
                this._xactId = _xactId
            }

        fun functionData(functionData: FunctionData) = functionData(JsonField.of(functionData))

        fun functionData(functionData: JsonField<FunctionData>) =
            apply {
                this.functionData = functionData
            }

        fun functionData(prompt: FunctionData.Prompt) = functionData(FunctionData.ofPrompt(prompt))

        fun functionData(code: FunctionData.Code) = functionData(FunctionData.ofCode(code))

        fun functionData(global: FunctionData.Global) = functionData(FunctionData.ofGlobal(global))

        /** A literal 'p' which identifies the object as a project prompt */
        fun logId(logId: LogId) = logId(JsonField.of(logId))

        /** A literal 'p' which identifies the object as a project prompt */
        fun logId(logId: JsonField<LogId>) =
            apply {
                this.logId = logId
            }

        /** Name of the prompt */
        fun name(name: String) = name(JsonField.of(name))

        /** Name of the prompt */
        fun name(name: JsonField<String>) =
            apply {
                this.name = name
            }

        /** Unique identifier for the organization */
        fun orgId(orgId: String) = orgId(JsonField.of(orgId))

        /** Unique identifier for the organization */
        fun orgId(orgId: JsonField<String>) =
            apply {
                this.orgId = orgId
            }

        /** Unique identifier for the project that the prompt belongs under */
        fun projectId(projectId: String) = projectId(JsonField.of(projectId))

        /** Unique identifier for the project that the prompt belongs under */
        fun projectId(projectId: JsonField<String>) =
            apply {
                this.projectId = projectId
            }

        /** Unique identifier for the prompt */
        fun slug(slug: String) = slug(JsonField.of(slug))

        /** Unique identifier for the prompt */
        fun slug(slug: JsonField<String>) =
            apply {
                this.slug = slug
            }

        /** Date of prompt creation */
        fun created(created: OffsetDateTime?) = created(JsonField.ofNullable(created))

        /** Date of prompt creation */
        fun created(created: Optional<OffsetDateTime>) = created(created.getOrNull())

        /** Date of prompt creation */
        fun created(created: JsonField<OffsetDateTime>) =
            apply {
                this.created = created
            }

        /** Textual description of the prompt */
        fun description(description: String?) = description(JsonField.ofNullable(description))

        /** Textual description of the prompt */
        fun description(description: Optional<String>) = description(description.getOrNull())

        /** Textual description of the prompt */
        fun description(description: JsonField<String>) =
            apply {
                this.description = description
            }

        /** JSON schema for the function's parameters and return type */
        fun functionSchema(functionSchema: FunctionSchema?) = functionSchema(JsonField.ofNullable(functionSchema))

        /** JSON schema for the function's parameters and return type */
        fun functionSchema(functionSchema: Optional<FunctionSchema>) = functionSchema(functionSchema.getOrNull())

        /** JSON schema for the function's parameters and return type */
        fun functionSchema(functionSchema: JsonField<FunctionSchema>) =
            apply {
                this.functionSchema = functionSchema
            }

        fun functionType(functionType: FunctionType?) = functionType(JsonField.ofNullable(functionType))

        fun functionType(functionType: Optional<FunctionType>) = functionType(functionType.getOrNull())

        fun functionType(functionType: JsonField<FunctionType>) =
            apply {
                this.functionType = functionType
            }

        /** User-controlled metadata about the prompt */
        fun metadata(metadata: Metadata?) = metadata(JsonField.ofNullable(metadata))

        /** User-controlled metadata about the prompt */
        fun metadata(metadata: Optional<Metadata>) = metadata(metadata.getOrNull())

        /** User-controlled metadata about the prompt */
        fun metadata(metadata: JsonField<Metadata>) =
            apply {
                this.metadata = metadata
            }

        fun origin(origin: Origin?) = origin(JsonField.ofNullable(origin))

        fun origin(origin: Optional<Origin>) = origin(origin.getOrNull())

        fun origin(origin: JsonField<Origin>) =
            apply {
                this.origin = origin
            }

        /** The prompt, model, and its parameters */
        fun promptData(promptData: PromptData?) = promptData(JsonField.ofNullable(promptData))

        /** The prompt, model, and its parameters */
        fun promptData(promptData: Optional<PromptData>) = promptData(promptData.getOrNull())

        /** The prompt, model, and its parameters */
        fun promptData(promptData: JsonField<PromptData>) =
            apply {
                this.promptData = promptData
            }

        /** A list of tags for the prompt */
        fun tags(tags: List<String>?) = tags(JsonField.ofNullable(tags))

        /** A list of tags for the prompt */
        fun tags(tags: Optional<List<String>>) = tags(tags.getOrNull())

        /** A list of tags for the prompt */
        fun tags(tags: JsonField<List<String>>) =
            apply {
                this.tags = tags.map { it.toMutableList() }
            }

        /** A list of tags for the prompt */
        fun addTag(tag: String) =
            apply {
                tags = (tags ?: JsonField.of(mutableListOf())).also {
                    checkKnown("tags", it).add(tag)
                }
            }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
            apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

        fun putAdditionalProperty(key: String, value: JsonValue) =
            apply {
                additionalProperties.put(key, value)
            }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
            apply {
                this.additionalProperties.putAll(additionalProperties)
            }

        fun removeAdditionalProperty(key: String) =
            apply {
                additionalProperties.remove(key)
            }

        fun removeAllAdditionalProperties(keys: Set<String>) =
            apply {
                keys.forEach(::removeAdditionalProperty)
            }

        fun build(): Function =
            Function(
              checkRequired(
                "id", id
              ),
              checkRequired(
                "_xactId", _xactId
              ),
              checkRequired(
                "functionData", functionData
              ),
              checkRequired(
                "logId", logId
              ),
              checkRequired(
                "name", name
              ),
              checkRequired(
                "orgId", orgId
              ),
              checkRequired(
                "projectId", projectId
              ),
              checkRequired(
                "slug", slug
              ),
              created,
              description,
              functionSchema,
              functionType,
              metadata,
              origin,
              promptData,
              (tags ?: JsonMissing.of()).map { it.toImmutable() },
              additionalProperties.toImmutable(),
            )
    }

    @JsonDeserialize(using = FunctionData.Deserializer::class)
    @JsonSerialize(using = FunctionData.Serializer::class)
    class FunctionData private constructor(
        private val prompt: Prompt? = null,
        private val code: Code? = null,
        private val global: Global? = null,
        private val _json: JsonValue? = null,

    ) {

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

        private var validated: Boolean = false

        fun validate(): FunctionData =
            apply {
                if (validated) {
                  return@apply
                }

                accept(object : Visitor<Unit> {
                    override fun visitPrompt(prompt: Prompt) {
                      prompt.validate()
                    }

                    override fun visitCode(code: Code) {
                      code.validate()
                    }

                    override fun visitGlobal(global: Global) {
                      global.validate()
                    }
                })
                validated = true
            }

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return /* spotless:off */ other is FunctionData && prompt == other.prompt && code == other.code && global == other.global /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(prompt, code, global) /* spotless:on */

        override fun toString(): String =
            when {
                prompt != null -> "FunctionData{prompt=$prompt}"
                code != null -> "FunctionData{code=$code}"
                global != null -> "FunctionData{global=$global}"
                _json != null -> "FunctionData{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid FunctionData")
            }

        companion object {

            @JvmStatic
            fun ofPrompt(prompt: Prompt) = FunctionData(prompt = prompt)

            @JvmStatic
            fun ofCode(code: Code) = FunctionData(code = code)

            @JvmStatic
            fun ofGlobal(global: Global) = FunctionData(global = global)
        }

        /**
         * An interface that defines how to map each variant of [FunctionData] to a value
         * of type [T].
         */
        interface Visitor<out T> {

            fun visitPrompt(prompt: Prompt): T

            fun visitCode(code: Code): T

            fun visitGlobal(global: Global): T

            /**
             * Maps an unknown variant of [FunctionData] to a value of type [T].
             *
             * An instance of [FunctionData] can contain an unknown variant if it was
             * deserialized from data that doesn't match any known variant. For example, if the
             * SDK is on an older version than the API, then the API may respond with new
             * variants that the SDK is unaware of.
             *
             * @throws BraintrustInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
              throw BraintrustInvalidDataException("Unknown FunctionData: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<FunctionData>(FunctionData::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): FunctionData {
              val json = JsonValue.fromJsonNode(node)

              tryDeserialize(node, jacksonTypeRef<Prompt>()){ it.validate() }?.let {
                  return FunctionData(prompt = it, _json = json)
              }
              tryDeserialize(node, jacksonTypeRef<Code>()){ it.validate() }?.let {
                  return FunctionData(code = it, _json = json)
              }
              tryDeserialize(node, jacksonTypeRef<Global>()){ it.validate() }?.let {
                  return FunctionData(global = it, _json = json)
              }

              return FunctionData(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<FunctionData>(FunctionData::class) {

            override fun serialize(value: FunctionData, generator: JsonGenerator, provider: SerializerProvider) {
              when {
                  value.prompt != null -> generator.writeObject(value.prompt)
                  value.code != null -> generator.writeObject(value.code)
                  value.global != null -> generator.writeObject(value.global)
                  value._json != null -> generator.writeObject(value._json)
                  else -> throw IllegalStateException("Invalid FunctionData")
              }
            }
        }

        @NoAutoDetect
        class Prompt @JsonCreator private constructor(
            @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
            @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),

        ) {

            fun type(): Type = type.getRequired("type")

            @JsonProperty("type")
            @ExcludeMissing
            fun _type(): JsonField<Type> = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Prompt =
                apply {
                    if (validated) {
                      return@apply
                    }

                    type()
                    validated = true
                }

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [Prompt].
                 *
                 * The following fields are required:
                 *
                 * ```java
                 * .type()
                 * ```
                 */
                @JvmStatic
                fun builder() = Builder()
            }

            /** A builder for [Prompt]. */
            class Builder internal constructor() {

                private var type: JsonField<Type>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(prompt: Prompt) =
                    apply {
                        type = prompt.type
                        additionalProperties = prompt.additionalProperties.toMutableMap()
                    }

                fun type(type: Type) = type(JsonField.of(type))

                fun type(type: JsonField<Type>) =
                    apply {
                        this.type = type
                    }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                fun putAdditionalProperty(key: String, value: JsonValue) =
                    apply {
                        additionalProperties.put(key, value)
                    }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) =
                    apply {
                        additionalProperties.remove(key)
                    }

                fun removeAllAdditionalProperties(keys: Set<String>) =
                    apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                fun build(): Prompt =
                    Prompt(
                      checkRequired(
                        "type", type
                      ), additionalProperties.toImmutable()
                    )
            }

            class Type @JsonCreator private constructor(
                private val value: JsonField<String>,

            ) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue
                fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val PROMPT = of("prompt")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    PROMPT,
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 *
                 * - It was deserialized from data that doesn't match any known member. For
                 *   example, if the SDK is on an older version than the API, then the API may
                 *   respond with new members that the SDK is unaware of.
                 *
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    PROMPT,
                    /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                        PROMPT -> Value.PROMPT
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws BraintrustInvalidDataException if this class instance's value is a not a
                 * known member.
                 */
                fun known(): Known =
                    when (this) {
                        PROMPT -> Known.PROMPT
                        else -> throw BraintrustInvalidDataException("Unknown Type: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws BraintrustInvalidDataException if this class instance's value does not
                 * have the expected primitive type.
                 */
                fun asString(): String = _value().asString().orElseThrow { BraintrustInvalidDataException("Value is not a String") }

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

              return /* spotless:off */ other is Prompt && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "Prompt{type=$type, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class Code @JsonCreator private constructor(
            @JsonProperty("data") @ExcludeMissing private val data: JsonField<Data> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
            @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),

        ) {

            fun data(): Data = data.getRequired("data")

            fun type(): Type = type.getRequired("type")

            @JsonProperty("data")
            @ExcludeMissing
            fun _data(): JsonField<Data> = data

            @JsonProperty("type")
            @ExcludeMissing
            fun _type(): JsonField<Type> = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Code =
                apply {
                    if (validated) {
                      return@apply
                    }

                    data().validate()
                    type()
                    validated = true
                }

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [Code].
                 *
                 * The following fields are required:
                 *
                 * ```java
                 * .data()
                 * .type()
                 * ```
                 */
                @JvmStatic
                fun builder() = Builder()
            }

            /** A builder for [Code]. */
            class Builder internal constructor() {

                private var data: JsonField<Data>? = null
                private var type: JsonField<Type>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(code: Code) =
                    apply {
                        data = code.data
                        type = code.type
                        additionalProperties = code.additionalProperties.toMutableMap()
                    }

                fun data(data: Data) = data(JsonField.of(data))

                fun data(data: JsonField<Data>) =
                    apply {
                        this.data = data
                    }

                fun data(bundle: Data.Bundle) = data(Data.ofBundle(bundle))

                fun data(inline: Data.Inline) = data(Data.ofInline(inline))

                fun type(type: Type) = type(JsonField.of(type))

                fun type(type: JsonField<Type>) =
                    apply {
                        this.type = type
                    }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                fun putAdditionalProperty(key: String, value: JsonValue) =
                    apply {
                        additionalProperties.put(key, value)
                    }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) =
                    apply {
                        additionalProperties.remove(key)
                    }

                fun removeAllAdditionalProperties(keys: Set<String>) =
                    apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                fun build(): Code =
                    Code(
                      checkRequired(
                        "data", data
                      ),
                      checkRequired(
                        "type", type
                      ),
                      additionalProperties.toImmutable(),
                    )
            }

            @JsonDeserialize(using = Data.Deserializer::class)
            @JsonSerialize(using = Data.Serializer::class)
            class Data private constructor(
                private val bundle: Bundle? = null,
                private val inline: Inline? = null,
                private val _json: JsonValue? = null,

            ) {

                fun bundle(): Optional<Bundle> = Optional.ofNullable(bundle)

                fun inline(): Optional<Inline> = Optional.ofNullable(inline)

                fun isBundle(): Boolean = bundle != null

                fun isInline(): Boolean = inline != null

                fun asBundle(): Bundle = bundle.getOrThrow("bundle")

                fun asInline(): Inline = inline.getOrThrow("inline")

                fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                fun <T> accept(visitor: Visitor<T>): T {
                  return when {
                      bundle != null -> visitor.visitBundle(bundle)
                      inline != null -> visitor.visitInline(inline)
                      else -> visitor.unknown(_json)
                  }
                }

                private var validated: Boolean = false

                fun validate(): Data =
                    apply {
                        if (validated) {
                          return@apply
                        }

                        accept(object : Visitor<Unit> {
                            override fun visitBundle(bundle: Bundle) {
                              bundle.validate()
                            }

                            override fun visitInline(inline: Inline) {
                              inline.validate()
                            }
                        })
                        validated = true
                    }

                override fun equals(other: Any?): Boolean {
                  if (this === other) {
                      return true
                  }

                  return /* spotless:off */ other is Data && bundle == other.bundle && inline == other.inline /* spotless:on */
                }

                override fun hashCode(): Int = /* spotless:off */ Objects.hash(bundle, inline) /* spotless:on */

                override fun toString(): String =
                    when {
                        bundle != null -> "Data{bundle=$bundle}"
                        inline != null -> "Data{inline=$inline}"
                        _json != null -> "Data{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid Data")
                    }

                companion object {

                    @JvmStatic
                    fun ofBundle(bundle: Bundle) = Data(bundle = bundle)

                    @JvmStatic
                    fun ofInline(inline: Inline) = Data(inline = inline)
                }

                /**
                 * An interface that defines how to map each variant of [Data] to a value of type
                 * [T].
                 */
                interface Visitor<out T> {

                    fun visitBundle(bundle: Bundle): T

                    fun visitInline(inline: Inline): T

                    /**
                     * Maps an unknown variant of [Data] to a value of type [T].
                     *
                     * An instance of [Data] can contain an unknown variant if it was deserialized from
                     * data that doesn't match any known variant. For example, if the SDK is on an
                     * older version than the API, then the API may respond with new variants that the
                     * SDK is unaware of.
                     *
                     * @throws BraintrustInvalidDataException in the default implementation.
                     */
                    fun unknown(json: JsonValue?): T {
                      throw BraintrustInvalidDataException("Unknown Data: $json")
                    }
                }

                internal class Deserializer : BaseDeserializer<Data>(Data::class) {

                    override fun ObjectCodec.deserialize(node: JsonNode): Data {
                      val json = JsonValue.fromJsonNode(node)

                      tryDeserialize(node, jacksonTypeRef<Bundle>()){ it.validate() }?.let {
                          return Data(bundle = it, _json = json)
                      }
                      tryDeserialize(node, jacksonTypeRef<Inline>()){ it.validate() }?.let {
                          return Data(inline = it, _json = json)
                      }

                      return Data(_json = json)
                    }
                }

                internal class Serializer : BaseSerializer<Data>(Data::class) {

                    override fun serialize(value: Data, generator: JsonGenerator, provider: SerializerProvider) {
                      when {
                          value.bundle != null -> generator.writeObject(value.bundle)
                          value.inline != null -> generator.writeObject(value.inline)
                          value._json != null -> generator.writeObject(value._json)
                          else -> throw IllegalStateException("Invalid Data")
                      }
                    }
                }

                @NoAutoDetect
                class Bundle @JsonCreator private constructor(
                    @JsonProperty("bundle_id") @ExcludeMissing private val bundleId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("location") @ExcludeMissing private val location: JsonField<CodeBundle.Location> = JsonMissing.of(),
                    @JsonProperty("runtime_context") @ExcludeMissing private val runtimeContext: JsonField<CodeBundle.RuntimeContext> = JsonMissing.of(),
                    @JsonProperty("preview") @ExcludeMissing private val preview: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
                    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),

                ) {

                    fun bundleId(): String = bundleId.getRequired("bundle_id")

                    fun location(): CodeBundle.Location = location.getRequired("location")

                    fun runtimeContext(): CodeBundle.RuntimeContext = runtimeContext.getRequired("runtime_context")

                    /** A preview of the code */
                    fun preview(): Optional<String> = Optional.ofNullable(preview.getNullable("preview"))

                    fun type(): Type = type.getRequired("type")

                    @JsonProperty("bundle_id")
                    @ExcludeMissing
                    fun _bundleId(): JsonField<String> = bundleId

                    @JsonProperty("location")
                    @ExcludeMissing
                    fun _location(): JsonField<CodeBundle.Location> = location

                    @JsonProperty("runtime_context")
                    @ExcludeMissing
                    fun _runtimeContext(): JsonField<CodeBundle.RuntimeContext> = runtimeContext

                    /** A preview of the code */
                    @JsonProperty("preview")
                    @ExcludeMissing
                    fun _preview(): JsonField<String> = preview

                    @JsonProperty("type")
                    @ExcludeMissing
                    fun _type(): JsonField<Type> = type

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toCodeBundle(): CodeBundle =
                        CodeBundle.builder()
                            .bundleId(bundleId)
                            .location(location)
                            .runtimeContext(runtimeContext)
                            .preview(preview)
                            .build()

                    private var validated: Boolean = false

                    fun validate(): Bundle =
                        apply {
                            if (validated) {
                              return@apply
                            }

                            bundleId()
                            location().validate()
                            runtimeContext().validate()
                            preview()
                            type()
                            validated = true
                        }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        /**
                         * Returns a mutable builder for constructing an instance of [Bundle].
                         *
                         * The following fields are required:
                         *
                         * ```java
                         * .bundleId()
                         * .location()
                         * .runtimeContext()
                         * .type()
                         * ```
                         */
                        @JvmStatic
                        fun builder() = Builder()
                    }

                    /** A builder for [Bundle]. */
                    class Builder internal constructor() {

                        private var bundleId: JsonField<String>? = null
                        private var location: JsonField<CodeBundle.Location>? = null
                        private var runtimeContext: JsonField<CodeBundle.RuntimeContext>? = null
                        private var preview: JsonField<String> = JsonMissing.of()
                        private var type: JsonField<Type>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                        @JvmSynthetic
                        internal fun from(bundle: Bundle) =
                            apply {
                                bundleId = bundle.bundleId
                                location = bundle.location
                                runtimeContext = bundle.runtimeContext
                                preview = bundle.preview
                                type = bundle.type
                                additionalProperties = bundle.additionalProperties.toMutableMap()
                            }

                        fun bundleId(bundleId: String) = bundleId(JsonField.of(bundleId))

                        fun bundleId(bundleId: JsonField<String>) =
                            apply {
                                this.bundleId = bundleId
                            }

                        fun location(location: CodeBundle.Location) = location(JsonField.of(location))

                        fun location(location: JsonField<CodeBundle.Location>) =
                            apply {
                                this.location = location
                            }

                        fun location(experiment: CodeBundle.Location.Experiment) = location(CodeBundle.Location.ofExperiment(experiment))

                        fun location(function: CodeBundle.Location.Function) = location(CodeBundle.Location.ofFunction(function))

                        fun runtimeContext(runtimeContext: CodeBundle.RuntimeContext) = runtimeContext(JsonField.of(runtimeContext))

                        fun runtimeContext(runtimeContext: JsonField<CodeBundle.RuntimeContext>) =
                            apply {
                                this.runtimeContext = runtimeContext
                            }

                        /** A preview of the code */
                        fun preview(preview: String?) = preview(JsonField.ofNullable(preview))

                        /** A preview of the code */
                        fun preview(preview: Optional<String>) = preview(preview.getOrNull())

                        /** A preview of the code */
                        fun preview(preview: JsonField<String>) =
                            apply {
                                this.preview = preview
                            }

                        fun type(type: Type) = type(JsonField.of(type))

                        fun type(type: JsonField<Type>) =
                            apply {
                                this.type = type
                            }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) =
                            apply {
                                additionalProperties.put(key, value)
                            }

                        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        fun removeAdditionalProperty(key: String) =
                            apply {
                                additionalProperties.remove(key)
                            }

                        fun removeAllAdditionalProperties(keys: Set<String>) =
                            apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

                        fun build(): Bundle =
                            Bundle(
                              checkRequired(
                                "bundleId", bundleId
                              ),
                              checkRequired(
                                "location", location
                              ),
                              checkRequired(
                                "runtimeContext", runtimeContext
                              ),
                              preview,
                              checkRequired(
                                "type", type
                              ),
                              additionalProperties.toImmutable(),
                            )
                    }

                    class Type @JsonCreator private constructor(
                        private val value: JsonField<String>,

                    ) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data that
                         * doesn't match any known member, and you want to know that value. For example, if
                         * the SDK is on an older version than the API, then the API may respond with new
                         * members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val BUNDLE = of("bundle")

                            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                        }

                        /** An enum containing [Type]'s known values. */
                        enum class Known {
                            BUNDLE,
                        }

                        /**
                         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                         *
                         * An instance of [Type] can contain an unknown value in a couple of cases:
                         *
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API may
                         *   respond with new members that the SDK is unaware of.
                         *
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            BUNDLE,
                            /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                                BUNDLE -> Value.BUNDLE
                                else -> Value._UNKNOWN
                            }

                        /**
                         * Returns an enum member corresponding to this class instance's value.
                         *
                         * Use the [value] method instead if you're uncertain the value is always known and
                         * don't want to throw for the unknown case.
                         *
                         * @throws BraintrustInvalidDataException if this class instance's value is a not a
                         * known member.
                         */
                        fun known(): Known =
                            when (this) {
                                BUNDLE -> Known.BUNDLE
                                else -> throw BraintrustInvalidDataException("Unknown Type: $value")
                            }

                        /**
                         * Returns this class instance's primitive wire representation.
                         *
                         * This differs from the [toString] method because that method is primarily for
                         * debugging and generally doesn't throw.
                         *
                         * @throws BraintrustInvalidDataException if this class instance's value does not
                         * have the expected primitive type.
                         */
                        fun asString(): String = _value().asString().orElseThrow { BraintrustInvalidDataException("Value is not a String") }

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

                      return /* spotless:off */ other is Bundle && bundleId == other.bundleId && location == other.location && runtimeContext == other.runtimeContext && preview == other.preview && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(bundleId, location, runtimeContext, preview, type, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() = "Bundle{bundleId=$bundleId, location=$location, runtimeContext=$runtimeContext, preview=$preview, type=$type, additionalProperties=$additionalProperties}"
                }

                @NoAutoDetect
                class Inline @JsonCreator private constructor(
                    @JsonProperty("code") @ExcludeMissing private val code: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("runtime_context") @ExcludeMissing private val runtimeContext: JsonField<RuntimeContext> = JsonMissing.of(),
                    @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
                    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),

                ) {

                    fun code(): String = code.getRequired("code")

                    fun runtimeContext(): RuntimeContext = runtimeContext.getRequired("runtime_context")

                    fun type(): Type = type.getRequired("type")

                    @JsonProperty("code")
                    @ExcludeMissing
                    fun _code(): JsonField<String> = code

                    @JsonProperty("runtime_context")
                    @ExcludeMissing
                    fun _runtimeContext(): JsonField<RuntimeContext> = runtimeContext

                    @JsonProperty("type")
                    @ExcludeMissing
                    fun _type(): JsonField<Type> = type

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): Inline =
                        apply {
                            if (validated) {
                              return@apply
                            }

                            code()
                            runtimeContext().validate()
                            type()
                            validated = true
                        }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        /**
                         * Returns a mutable builder for constructing an instance of [Inline].
                         *
                         * The following fields are required:
                         *
                         * ```java
                         * .code()
                         * .runtimeContext()
                         * .type()
                         * ```
                         */
                        @JvmStatic
                        fun builder() = Builder()
                    }

                    /** A builder for [Inline]. */
                    class Builder internal constructor() {

                        private var code: JsonField<String>? = null
                        private var runtimeContext: JsonField<RuntimeContext>? = null
                        private var type: JsonField<Type>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                        @JvmSynthetic
                        internal fun from(inline: Inline) =
                            apply {
                                code = inline.code
                                runtimeContext = inline.runtimeContext
                                type = inline.type
                                additionalProperties = inline.additionalProperties.toMutableMap()
                            }

                        fun code(code: String) = code(JsonField.of(code))

                        fun code(code: JsonField<String>) =
                            apply {
                                this.code = code
                            }

                        fun runtimeContext(runtimeContext: RuntimeContext) = runtimeContext(JsonField.of(runtimeContext))

                        fun runtimeContext(runtimeContext: JsonField<RuntimeContext>) =
                            apply {
                                this.runtimeContext = runtimeContext
                            }

                        fun type(type: Type) = type(JsonField.of(type))

                        fun type(type: JsonField<Type>) =
                            apply {
                                this.type = type
                            }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) =
                            apply {
                                additionalProperties.put(key, value)
                            }

                        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        fun removeAdditionalProperty(key: String) =
                            apply {
                                additionalProperties.remove(key)
                            }

                        fun removeAllAdditionalProperties(keys: Set<String>) =
                            apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

                        fun build(): Inline =
                            Inline(
                              checkRequired(
                                "code", code
                              ),
                              checkRequired(
                                "runtimeContext", runtimeContext
                              ),
                              checkRequired(
                                "type", type
                              ),
                              additionalProperties.toImmutable(),
                            )
                    }

                    @NoAutoDetect
                    class RuntimeContext @JsonCreator private constructor(
                        @JsonProperty("runtime") @ExcludeMissing private val runtime: JsonField<Runtime> = JsonMissing.of(),
                        @JsonProperty("version") @ExcludeMissing private val version: JsonField<String> = JsonMissing.of(),
                        @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),

                    ) {

                        fun runtime(): Runtime = runtime.getRequired("runtime")

                        fun version(): String = version.getRequired("version")

                        @JsonProperty("runtime")
                        @ExcludeMissing
                        fun _runtime(): JsonField<Runtime> = runtime

                        @JsonProperty("version")
                        @ExcludeMissing
                        fun _version(): JsonField<String> = version

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        private var validated: Boolean = false

                        fun validate(): RuntimeContext =
                            apply {
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
                             *
                             * ```java
                             * .runtime()
                             * .version()
                             * ```
                             */
                            @JvmStatic
                            fun builder() = Builder()
                        }

                        /** A builder for [RuntimeContext]. */
                        class Builder internal constructor() {

                            private var runtime: JsonField<Runtime>? = null
                            private var version: JsonField<String>? = null
                            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                            @JvmSynthetic
                            internal fun from(runtimeContext: RuntimeContext) =
                                apply {
                                    runtime = runtimeContext.runtime
                                    version = runtimeContext.version
                                    additionalProperties = runtimeContext.additionalProperties.toMutableMap()
                                }

                            fun runtime(runtime: Runtime) = runtime(JsonField.of(runtime))

                            fun runtime(runtime: JsonField<Runtime>) =
                                apply {
                                    this.runtime = runtime
                                }

                            fun version(version: String) = version(JsonField.of(version))

                            fun version(version: JsonField<String>) =
                                apply {
                                    this.version = version
                                }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) =
                                apply {
                                    additionalProperties.put(key, value)
                                }

                            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.putAll(additionalProperties)
                                }

                            fun removeAdditionalProperty(key: String) =
                                apply {
                                    additionalProperties.remove(key)
                                }

                            fun removeAllAdditionalProperties(keys: Set<String>) =
                                apply {
                                    keys.forEach(::removeAdditionalProperty)
                                }

                            fun build(): RuntimeContext =
                                RuntimeContext(
                                  checkRequired(
                                    "runtime", runtime
                                  ),
                                  checkRequired(
                                    "version", version
                                  ),
                                  additionalProperties.toImmutable(),
                                )
                        }

                        class Runtime @JsonCreator private constructor(
                            private val value: JsonField<String>,

                        ) : Enum {

                            /**
                             * Returns this class instance's raw value.
                             *
                             * This is usually only useful if this instance was deserialized from data that
                             * doesn't match any known member, and you want to know that value. For example, if
                             * the SDK is on an older version than the API, then the API may respond with new
                             * members that the SDK is unaware of.
                             */
                            @com.fasterxml.jackson.annotation.JsonValue
                            fun _value(): JsonField<String> = value

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
                             *
                             * - It was deserialized from data that doesn't match any known member. For
                             *   example, if the SDK is on an older version than the API, then the API may
                             *   respond with new members that the SDK is unaware of.
                             *
                             * - It was constructed with an arbitrary value using the [of] method.
                             */
                            enum class Value {
                                NODE,
                                PYTHON,
                                /** An enum member indicating that [Runtime] was instantiated with an unknown value. */
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
                             * known member.
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
                             * @throws BraintrustInvalidDataException if this class instance's value does not
                             * have the expected primitive type.
                             */
                            fun asString(): String = _value().asString().orElseThrow { BraintrustInvalidDataException("Value is not a String") }

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

                        override fun toString() = "RuntimeContext{runtime=$runtime, version=$version, additionalProperties=$additionalProperties}"
                    }

                    class Type @JsonCreator private constructor(
                        private val value: JsonField<String>,

                    ) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data that
                         * doesn't match any known member, and you want to know that value. For example, if
                         * the SDK is on an older version than the API, then the API may respond with new
                         * members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val INLINE = of("inline")

                            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                        }

                        /** An enum containing [Type]'s known values. */
                        enum class Known {
                            INLINE,
                        }

                        /**
                         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                         *
                         * An instance of [Type] can contain an unknown value in a couple of cases:
                         *
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API may
                         *   respond with new members that the SDK is unaware of.
                         *
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            INLINE,
                            /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                                INLINE -> Value.INLINE
                                else -> Value._UNKNOWN
                            }

                        /**
                         * Returns an enum member corresponding to this class instance's value.
                         *
                         * Use the [value] method instead if you're uncertain the value is always known and
                         * don't want to throw for the unknown case.
                         *
                         * @throws BraintrustInvalidDataException if this class instance's value is a not a
                         * known member.
                         */
                        fun known(): Known =
                            when (this) {
                                INLINE -> Known.INLINE
                                else -> throw BraintrustInvalidDataException("Unknown Type: $value")
                            }

                        /**
                         * Returns this class instance's primitive wire representation.
                         *
                         * This differs from the [toString] method because that method is primarily for
                         * debugging and generally doesn't throw.
                         *
                         * @throws BraintrustInvalidDataException if this class instance's value does not
                         * have the expected primitive type.
                         */
                        fun asString(): String = _value().asString().orElseThrow { BraintrustInvalidDataException("Value is not a String") }

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

                      return /* spotless:off */ other is Inline && code == other.code && runtimeContext == other.runtimeContext && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(code, runtimeContext, type, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() = "Inline{code=$code, runtimeContext=$runtimeContext, type=$type, additionalProperties=$additionalProperties}"
                }
            }

            class Type @JsonCreator private constructor(
                private val value: JsonField<String>,

            ) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue
                fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val CODE = of("code")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    CODE,
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 *
                 * - It was deserialized from data that doesn't match any known member. For
                 *   example, if the SDK is on an older version than the API, then the API may
                 *   respond with new members that the SDK is unaware of.
                 *
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    CODE,
                    /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                        CODE -> Value.CODE
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws BraintrustInvalidDataException if this class instance's value is a not a
                 * known member.
                 */
                fun known(): Known =
                    when (this) {
                        CODE -> Known.CODE
                        else -> throw BraintrustInvalidDataException("Unknown Type: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws BraintrustInvalidDataException if this class instance's value does not
                 * have the expected primitive type.
                 */
                fun asString(): String = _value().asString().orElseThrow { BraintrustInvalidDataException("Value is not a String") }

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

              return /* spotless:off */ other is Code && data == other.data && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(data, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "Code{data=$data, type=$type, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class Global @JsonCreator private constructor(
            @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
            @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),

        ) {

            fun name(): String = name.getRequired("name")

            fun type(): Type = type.getRequired("type")

            @JsonProperty("name")
            @ExcludeMissing
            fun _name(): JsonField<String> = name

            @JsonProperty("type")
            @ExcludeMissing
            fun _type(): JsonField<Type> = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Global =
                apply {
                    if (validated) {
                      return@apply
                    }

                    name()
                    type()
                    validated = true
                }

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [Global].
                 *
                 * The following fields are required:
                 *
                 * ```java
                 * .name()
                 * .type()
                 * ```
                 */
                @JvmStatic
                fun builder() = Builder()
            }

            /** A builder for [Global]. */
            class Builder internal constructor() {

                private var name: JsonField<String>? = null
                private var type: JsonField<Type>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(global: Global) =
                    apply {
                        name = global.name
                        type = global.type
                        additionalProperties = global.additionalProperties.toMutableMap()
                    }

                fun name(name: String) = name(JsonField.of(name))

                fun name(name: JsonField<String>) =
                    apply {
                        this.name = name
                    }

                fun type(type: Type) = type(JsonField.of(type))

                fun type(type: JsonField<Type>) =
                    apply {
                        this.type = type
                    }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                fun putAdditionalProperty(key: String, value: JsonValue) =
                    apply {
                        additionalProperties.put(key, value)
                    }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) =
                    apply {
                        additionalProperties.remove(key)
                    }

                fun removeAllAdditionalProperties(keys: Set<String>) =
                    apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                fun build(): Global =
                    Global(
                      checkRequired(
                        "name", name
                      ),
                      checkRequired(
                        "type", type
                      ),
                      additionalProperties.toImmutable(),
                    )
            }

            class Type @JsonCreator private constructor(
                private val value: JsonField<String>,

            ) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue
                fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val GLOBAL = of("global")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    GLOBAL,
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 *
                 * - It was deserialized from data that doesn't match any known member. For
                 *   example, if the SDK is on an older version than the API, then the API may
                 *   respond with new members that the SDK is unaware of.
                 *
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    GLOBAL,
                    /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                 * known member.
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
                 * have the expected primitive type.
                 */
                fun asString(): String = _value().asString().orElseThrow { BraintrustInvalidDataException("Value is not a String") }

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

            override fun toString() = "Global{name=$name, type=$type, additionalProperties=$additionalProperties}"
        }
    }

    /** A literal 'p' which identifies the object as a project prompt */
    class LogId @JsonCreator private constructor(
        private val value: JsonField<String>,

    ) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that
         * doesn't match any known member, and you want to know that value. For example, if
         * the SDK is on an older version than the API, then the API may respond with new
         * members that the SDK is unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue
        fun _value(): JsonField<String> = value

        companion object {

            @JvmField val P = of("p")

            @JvmStatic fun of(value: String) = LogId(JsonField.of(value))
        }

        /** An enum containing [LogId]'s known values. */
        enum class Known {
            P,
        }

        /**
         * An enum containing [LogId]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [LogId] can contain an unknown value in a couple of cases:
         *
         * - It was deserialized from data that doesn't match any known member. For
         *   example, if the SDK is on an older version than the API, then the API may
         *   respond with new members that the SDK is unaware of.
         *
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            P,
            /** An enum member indicating that [LogId] was instantiated with an unknown value. */
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
                P -> Value.P
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and
         * don't want to throw for the unknown case.
         *
         * @throws BraintrustInvalidDataException if this class instance's value is a not a
         * known member.
         */
        fun known(): Known =
            when (this) {
                P -> Known.P
                else -> throw BraintrustInvalidDataException("Unknown LogId: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for
         * debugging and generally doesn't throw.
         *
         * @throws BraintrustInvalidDataException if this class instance's value does not
         * have the expected primitive type.
         */
        fun asString(): String = _value().asString().orElseThrow { BraintrustInvalidDataException("Value is not a String") }

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return /* spotless:off */ other is LogId && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** JSON schema for the function's parameters and return type */
    @NoAutoDetect
    class FunctionSchema @JsonCreator private constructor(
        @JsonProperty("parameters") @ExcludeMissing private val parameters: JsonValue = JsonMissing.of(),
        @JsonProperty("returns") @ExcludeMissing private val returns: JsonValue = JsonMissing.of(),
        @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),

    ) {

        @JsonProperty("parameters")
        @ExcludeMissing
        fun _parameters(): JsonValue = parameters

        @JsonProperty("returns")
        @ExcludeMissing
        fun _returns(): JsonValue = returns

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): FunctionSchema =
            apply {
                if (validated) {
                  return@apply
                }

                validated = true
            }

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [FunctionSchema]. */
            @JvmStatic
            fun builder() = Builder()
        }

        /** A builder for [FunctionSchema]. */
        class Builder internal constructor() {

            private var parameters: JsonValue = JsonMissing.of()
            private var returns: JsonValue = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(functionSchema: FunctionSchema) =
                apply {
                    parameters = functionSchema.parameters
                    returns = functionSchema.returns
                    additionalProperties = functionSchema.additionalProperties.toMutableMap()
                }

            fun parameters(parameters: JsonValue) =
                apply {
                    this.parameters = parameters
                }

            fun returns(returns: JsonValue) =
                apply {
                    this.returns = returns
                }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

            fun putAdditionalProperty(key: String, value: JsonValue) =
                apply {
                    additionalProperties.put(key, value)
                }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun removeAdditionalProperty(key: String) =
                apply {
                    additionalProperties.remove(key)
                }

            fun removeAllAdditionalProperties(keys: Set<String>) =
                apply {
                    keys.forEach(::removeAdditionalProperty)
                }

            fun build(): FunctionSchema =
                FunctionSchema(
                  parameters,
                  returns,
                  additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return /* spotless:off */ other is FunctionSchema && parameters == other.parameters && returns == other.returns && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(parameters, returns, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "FunctionSchema{parameters=$parameters, returns=$returns, additionalProperties=$additionalProperties}"
    }

    class FunctionType @JsonCreator private constructor(
        private val value: JsonField<String>,

    ) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that
         * doesn't match any known member, and you want to know that value. For example, if
         * the SDK is on an older version than the API, then the API may respond with new
         * members that the SDK is unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue
        fun _value(): JsonField<String> = value

        companion object {

            @JvmField val LLM = of("llm")

            @JvmField val SCORER = of("scorer")

            @JvmField val TASK = of("task")

            @JvmField val TOOL = of("tool")

            @JvmStatic fun of(value: String) = FunctionType(JsonField.of(value))
        }

        /** An enum containing [FunctionType]'s known values. */
        enum class Known {
            LLM,
            SCORER,
            TASK,
            TOOL,
        }

        /**
         * An enum containing [FunctionType]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [FunctionType] can contain an unknown value in a couple of cases:
         *
         * - It was deserialized from data that doesn't match any known member. For
         *   example, if the SDK is on an older version than the API, then the API may
         *   respond with new members that the SDK is unaware of.
         *
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            LLM,
            SCORER,
            TASK,
            TOOL,
            /**
             * An enum member indicating that [FunctionType] was instantiated with an unknown
             * value.
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
                LLM -> Value.LLM
                SCORER -> Value.SCORER
                TASK -> Value.TASK
                TOOL -> Value.TOOL
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and
         * don't want to throw for the unknown case.
         *
         * @throws BraintrustInvalidDataException if this class instance's value is a not a
         * known member.
         */
        fun known(): Known =
            when (this) {
                LLM -> Known.LLM
                SCORER -> Known.SCORER
                TASK -> Known.TASK
                TOOL -> Known.TOOL
                else -> throw BraintrustInvalidDataException("Unknown FunctionType: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for
         * debugging and generally doesn't throw.
         *
         * @throws BraintrustInvalidDataException if this class instance's value does not
         * have the expected primitive type.
         */
        fun asString(): String = _value().asString().orElseThrow { BraintrustInvalidDataException("Value is not a String") }

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return /* spotless:off */ other is FunctionType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** User-controlled metadata about the prompt */
    @NoAutoDetect
    class Metadata @JsonCreator private constructor(
        @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),

    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Metadata =
            apply {
                if (validated) {
                  return@apply
                }

                validated = true
            }

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Metadata]. */
            @JvmStatic
            fun builder() = Builder()
        }

        /** A builder for [Metadata]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(metadata: Metadata) =
                apply {
                    additionalProperties = metadata.additionalProperties.toMutableMap()
                }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

            fun putAdditionalProperty(key: String, value: JsonValue) =
                apply {
                    additionalProperties.put(key, value)
                }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun removeAdditionalProperty(key: String) =
                apply {
                    additionalProperties.remove(key)
                }

            fun removeAllAdditionalProperties(keys: Set<String>) =
                apply {
                    keys.forEach(::removeAdditionalProperty)
                }

            fun build(): Metadata = Metadata(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return /* spotless:off */ other is Metadata && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class Origin @JsonCreator private constructor(
        @JsonProperty("object_id") @ExcludeMissing private val objectId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("object_type") @ExcludeMissing private val objectType: JsonField<ObjectType> = JsonMissing.of(),
        @JsonProperty("internal") @ExcludeMissing private val internal_: JsonField<Boolean> = JsonMissing.of(),
        @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),

    ) {

        /** Id of the object the function is originating from */
        fun objectId(): String = objectId.getRequired("object_id")

        /** The object type that the ACL applies to */
        fun objectType(): ObjectType = objectType.getRequired("object_type")

        /**
         * The function exists for internal purposes and should not be displayed in the
         * list of functions.
         */
        fun internal_(): Optional<Boolean> = Optional.ofNullable(internal_.getNullable("internal"))

        /** Id of the object the function is originating from */
        @JsonProperty("object_id")
        @ExcludeMissing
        fun _objectId(): JsonField<String> = objectId

        /** The object type that the ACL applies to */
        @JsonProperty("object_type")
        @ExcludeMissing
        fun _objectType(): JsonField<ObjectType> = objectType

        /**
         * The function exists for internal purposes and should not be displayed in the
         * list of functions.
         */
        @JsonProperty("internal")
        @ExcludeMissing
        fun _internal_(): JsonField<Boolean> = internal_

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Origin =
            apply {
                if (validated) {
                  return@apply
                }

                objectId()
                objectType()
                internal_()
                validated = true
            }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Origin].
             *
             * The following fields are required:
             *
             * ```java
             * .objectId()
             * .objectType()
             * ```
             */
            @JvmStatic
            fun builder() = Builder()
        }

        /** A builder for [Origin]. */
        class Builder internal constructor() {

            private var objectId: JsonField<String>? = null
            private var objectType: JsonField<ObjectType>? = null
            private var internal_: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(origin: Origin) =
                apply {
                    objectId = origin.objectId
                    objectType = origin.objectType
                    internal_ = origin.internal_
                    additionalProperties = origin.additionalProperties.toMutableMap()
                }

            /** Id of the object the function is originating from */
            fun objectId(objectId: String) = objectId(JsonField.of(objectId))

            /** Id of the object the function is originating from */
            fun objectId(objectId: JsonField<String>) =
                apply {
                    this.objectId = objectId
                }

            /** The object type that the ACL applies to */
            fun objectType(objectType: ObjectType) = objectType(JsonField.of(objectType))

            /** The object type that the ACL applies to */
            fun objectType(objectType: JsonField<ObjectType>) =
                apply {
                    this.objectType = objectType
                }

            /**
             * The function exists for internal purposes and should not be displayed in the
             * list of functions.
             */
            fun internal_(internal_: Boolean?) = internal_(JsonField.ofNullable(internal_))

            /**
             * The function exists for internal purposes and should not be displayed in the
             * list of functions.
             */
            fun internal_(internal_: Boolean) = internal_(internal_ as Boolean?)

            /**
             * The function exists for internal purposes and should not be displayed in the
             * list of functions.
             */
            fun internal_(internal_: Optional<Boolean>) = internal_(internal_.getOrNull())

            /**
             * The function exists for internal purposes and should not be displayed in the
             * list of functions.
             */
            fun internal_(internal_: JsonField<Boolean>) =
                apply {
                    this.internal_ = internal_
                }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

            fun putAdditionalProperty(key: String, value: JsonValue) =
                apply {
                    additionalProperties.put(key, value)
                }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun removeAdditionalProperty(key: String) =
                apply {
                    additionalProperties.remove(key)
                }

            fun removeAllAdditionalProperties(keys: Set<String>) =
                apply {
                    keys.forEach(::removeAdditionalProperty)
                }

            fun build(): Origin =
                Origin(
                  checkRequired(
                    "objectId", objectId
                  ),
                  checkRequired(
                    "objectType", objectType
                  ),
                  internal_,
                  additionalProperties.toImmutable(),
                )
        }

        /** The object type that the ACL applies to */
        class ObjectType @JsonCreator private constructor(
            private val value: JsonField<String>,

        ) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that
             * doesn't match any known member, and you want to know that value. For example, if
             * the SDK is on an older version than the API, then the API may respond with new
             * members that the SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue
            fun _value(): JsonField<String> = value

            companion object {

                @JvmField val ORGANIZATION = of("organization")

                @JvmField val PROJECT = of("project")

                @JvmField val EXPERIMENT = of("experiment")

                @JvmField val DATASET = of("dataset")

                @JvmField val PROMPT = of("prompt")

                @JvmField val PROMPT_SESSION = of("prompt_session")

                @JvmField val GROUP = of("group")

                @JvmField val ROLE = of("role")

                @JvmField val ORG_MEMBER = of("org_member")

                @JvmField val PROJECT_LOG = of("project_log")

                @JvmField val ORG_PROJECT = of("org_project")

                @JvmStatic fun of(value: String) = ObjectType(JsonField.of(value))
            }

            /** An enum containing [ObjectType]'s known values. */
            enum class Known {
                ORGANIZATION,
                PROJECT,
                EXPERIMENT,
                DATASET,
                PROMPT,
                PROMPT_SESSION,
                GROUP,
                ROLE,
                ORG_MEMBER,
                PROJECT_LOG,
                ORG_PROJECT,
            }

            /**
             * An enum containing [ObjectType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [ObjectType] can contain an unknown value in a couple of cases:
             *
             * - It was deserialized from data that doesn't match any known member. For
             *   example, if the SDK is on an older version than the API, then the API may
             *   respond with new members that the SDK is unaware of.
             *
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ORGANIZATION,
                PROJECT,
                EXPERIMENT,
                DATASET,
                PROMPT,
                PROMPT_SESSION,
                GROUP,
                ROLE,
                ORG_MEMBER,
                PROJECT_LOG,
                ORG_PROJECT,
                /**
                 * An enum member indicating that [ObjectType] was instantiated with an unknown
                 * value.
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
                    ORGANIZATION -> Value.ORGANIZATION
                    PROJECT -> Value.PROJECT
                    EXPERIMENT -> Value.EXPERIMENT
                    DATASET -> Value.DATASET
                    PROMPT -> Value.PROMPT
                    PROMPT_SESSION -> Value.PROMPT_SESSION
                    GROUP -> Value.GROUP
                    ROLE -> Value.ROLE
                    ORG_MEMBER -> Value.ORG_MEMBER
                    PROJECT_LOG -> Value.PROJECT_LOG
                    ORG_PROJECT -> Value.ORG_PROJECT
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws BraintrustInvalidDataException if this class instance's value is a not a
             * known member.
             */
            fun known(): Known =
                when (this) {
                    ORGANIZATION -> Known.ORGANIZATION
                    PROJECT -> Known.PROJECT
                    EXPERIMENT -> Known.EXPERIMENT
                    DATASET -> Known.DATASET
                    PROMPT -> Known.PROMPT
                    PROMPT_SESSION -> Known.PROMPT_SESSION
                    GROUP -> Known.GROUP
                    ROLE -> Known.ROLE
                    ORG_MEMBER -> Known.ORG_MEMBER
                    PROJECT_LOG -> Known.PROJECT_LOG
                    ORG_PROJECT -> Known.ORG_PROJECT
                    else -> throw BraintrustInvalidDataException("Unknown ObjectType: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws BraintrustInvalidDataException if this class instance's value does not
             * have the expected primitive type.
             */
            fun asString(): String = _value().asString().orElseThrow { BraintrustInvalidDataException("Value is not a String") }

            override fun equals(other: Any?): Boolean {
              if (this === other) {
                  return true
              }

              return /* spotless:off */ other is ObjectType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return /* spotless:off */ other is Origin && objectId == other.objectId && objectType == other.objectType && internal_ == other.internal_ && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(objectId, objectType, internal_, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Origin{objectId=$objectId, objectType=$objectType, internal_=$internal_, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return /* spotless:off */ other is Function && id == other.id && _xactId == other._xactId && functionData == other.functionData && logId == other.logId && name == other.name && orgId == other.orgId && projectId == other.projectId && slug == other.slug && created == other.created && description == other.description && functionSchema == other.functionSchema && functionType == other.functionType && metadata == other.metadata && origin == other.origin && promptData == other.promptData && tags == other.tags && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, _xactId, functionData, logId, name, orgId, projectId, slug, created, description, functionSchema, functionType, metadata, origin, promptData, tags, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() = "Function{id=$id, _xactId=$_xactId, functionData=$functionData, logId=$logId, name=$name, orgId=$orgId, projectId=$projectId, slug=$slug, created=$created, description=$description, functionSchema=$functionSchema, functionType=$functionType, metadata=$metadata, origin=$origin, promptData=$promptData, tags=$tags, additionalProperties=$additionalProperties}"
}
