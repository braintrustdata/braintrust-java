// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.Enum
import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.checkKnown
import com.braintrustdata.api.core.checkRequired
import com.braintrustdata.api.core.immutableEmptyMap
import com.braintrustdata.api.core.toImmutable
import com.braintrustdata.api.errors.BraintrustInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

@NoAutoDetect
class Prompt @JsonCreator private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("_xact_id") @ExcludeMissing private val _xactId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("log_id") @ExcludeMissing private val logId: JsonField<LogId> = JsonMissing.of(),
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
    @JsonProperty("org_id") @ExcludeMissing private val orgId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("project_id") @ExcludeMissing private val projectId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("slug") @ExcludeMissing private val slug: JsonField<String> = JsonMissing.of(),
    @JsonProperty("created") @ExcludeMissing private val created: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("description") @ExcludeMissing private val description: JsonField<String> = JsonMissing.of(),
    @JsonProperty("function_type") @ExcludeMissing private val functionType: JsonField<FunctionType> = JsonMissing.of(),
    @JsonProperty("metadata") @ExcludeMissing private val metadata: JsonField<Metadata> = JsonMissing.of(),
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

    fun functionType(): Optional<FunctionType> = Optional.ofNullable(functionType.getNullable("function_type"))

    /** User-controlled metadata about the prompt */
    fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata.getNullable("metadata"))

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

    @JsonProperty("function_type")
    @ExcludeMissing
    fun _functionType(): JsonField<FunctionType> = functionType

    /** User-controlled metadata about the prompt */
    @JsonProperty("metadata")
    @ExcludeMissing
    fun _metadata(): JsonField<Metadata> = metadata

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

    fun validate(): Prompt =
        apply {
            if (validated) {
              return@apply
            }

            id()
            _xactId()
            logId()
            name()
            orgId()
            projectId()
            slug()
            created()
            description()
            functionType()
            metadata().ifPresent { it.validate() }
            promptData().ifPresent { it.validate() }
            tags()
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
         * .id()
         * ._xactId()
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

    /** A builder for [Prompt]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var _xactId: JsonField<String>? = null
        private var logId: JsonField<LogId>? = null
        private var name: JsonField<String>? = null
        private var orgId: JsonField<String>? = null
        private var projectId: JsonField<String>? = null
        private var slug: JsonField<String>? = null
        private var created: JsonField<OffsetDateTime> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var functionType: JsonField<FunctionType> = JsonMissing.of()
        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var promptData: JsonField<PromptData> = JsonMissing.of()
        private var tags: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(prompt: Prompt) =
            apply {
                id = prompt.id
                _xactId = prompt._xactId
                logId = prompt.logId
                name = prompt.name
                orgId = prompt.orgId
                projectId = prompt.projectId
                slug = prompt.slug
                created = prompt.created
                description = prompt.description
                functionType = prompt.functionType
                metadata = prompt.metadata
                promptData = prompt.promptData
                tags = prompt.tags.map { it.toMutableList() }
                additionalProperties = prompt.additionalProperties.toMutableMap()
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

        fun build(): Prompt =
            Prompt(
              checkRequired(
                "id", id
              ),
              checkRequired(
                "_xactId", _xactId
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
              functionType,
              metadata,
              promptData,
              (tags ?: JsonMissing.of()).map { it.toImmutable() },
              additionalProperties.toImmutable(),
            )
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

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return /* spotless:off */ other is Prompt && id == other.id && _xactId == other._xactId && logId == other.logId && name == other.name && orgId == other.orgId && projectId == other.projectId && slug == other.slug && created == other.created && description == other.description && functionType == other.functionType && metadata == other.metadata && promptData == other.promptData && tags == other.tags && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, _xactId, logId, name, orgId, projectId, slug, created, description, functionType, metadata, promptData, tags, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() = "Prompt{id=$id, _xactId=$_xactId, logId=$logId, name=$name, orgId=$orgId, projectId=$projectId, slug=$slug, created=$created, description=$description, functionType=$functionType, metadata=$metadata, promptData=$promptData, tags=$tags, additionalProperties=$additionalProperties}"
}
