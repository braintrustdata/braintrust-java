// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.Enum
import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.toUnmodifiable
import com.braintrustdata.api.errors.BraintrustInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = PatchView.Builder::class)
@NoAutoDetect
class PatchView
private constructor(
    private val objectType: JsonField<ObjectType>,
    private val objectId: JsonField<String>,
    private val viewType: JsonField<ViewType>,
    private val name: JsonField<String>,
    private val viewData: JsonField<ViewData>,
    private val options: JsonField<ViewOptions>,
    private val userId: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** The object type that the ACL applies to */
    fun objectType(): Optional<ObjectType> =
        Optional.ofNullable(objectType.getNullable("object_type"))

    /** The id of the object the view applies to */
    fun objectId(): String = objectId.getRequired("object_id")

    /** Type of table that the view corresponds to. */
    fun viewType(): Optional<ViewType> = Optional.ofNullable(viewType.getNullable("view_type"))

    /** Name of the view */
    fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

    /** The view definition */
    fun viewData(): Optional<ViewData> = Optional.ofNullable(viewData.getNullable("view_data"))

    /** Options for the view in the app */
    fun options(): Optional<ViewOptions> = Optional.ofNullable(options.getNullable("options"))

    /** Identifies the user who created the view */
    fun userId(): Optional<String> = Optional.ofNullable(userId.getNullable("user_id"))

    /** The object type that the ACL applies to */
    @JsonProperty("object_type") @ExcludeMissing fun _objectType() = objectType

    /** The id of the object the view applies to */
    @JsonProperty("object_id") @ExcludeMissing fun _objectId() = objectId

    /** Type of table that the view corresponds to. */
    @JsonProperty("view_type") @ExcludeMissing fun _viewType() = viewType

    /** Name of the view */
    @JsonProperty("name") @ExcludeMissing fun _name() = name

    /** The view definition */
    @JsonProperty("view_data") @ExcludeMissing fun _viewData() = viewData

    /** Options for the view in the app */
    @JsonProperty("options") @ExcludeMissing fun _options() = options

    /** Identifies the user who created the view */
    @JsonProperty("user_id") @ExcludeMissing fun _userId() = userId

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): PatchView = apply {
        if (!validated) {
            objectType()
            objectId()
            viewType()
            name()
            viewData().map { it.validate() }
            options().map { it.validate() }
            userId()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PatchView &&
            this.objectType == other.objectType &&
            this.objectId == other.objectId &&
            this.viewType == other.viewType &&
            this.name == other.name &&
            this.viewData == other.viewData &&
            this.options == other.options &&
            this.userId == other.userId &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    objectType,
                    objectId,
                    viewType,
                    name,
                    viewData,
                    options,
                    userId,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "PatchView{objectType=$objectType, objectId=$objectId, viewType=$viewType, name=$name, viewData=$viewData, options=$options, userId=$userId, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var objectType: JsonField<ObjectType> = JsonMissing.of()
        private var objectId: JsonField<String> = JsonMissing.of()
        private var viewType: JsonField<ViewType> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var viewData: JsonField<ViewData> = JsonMissing.of()
        private var options: JsonField<ViewOptions> = JsonMissing.of()
        private var userId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(patchView: PatchView) = apply {
            this.objectType = patchView.objectType
            this.objectId = patchView.objectId
            this.viewType = patchView.viewType
            this.name = patchView.name
            this.viewData = patchView.viewData
            this.options = patchView.options
            this.userId = patchView.userId
            additionalProperties(patchView.additionalProperties)
        }

        /** The object type that the ACL applies to */
        fun objectType(objectType: ObjectType) = objectType(JsonField.of(objectType))

        /** The object type that the ACL applies to */
        @JsonProperty("object_type")
        @ExcludeMissing
        fun objectType(objectType: JsonField<ObjectType>) = apply { this.objectType = objectType }

        /** The id of the object the view applies to */
        fun objectId(objectId: String) = objectId(JsonField.of(objectId))

        /** The id of the object the view applies to */
        @JsonProperty("object_id")
        @ExcludeMissing
        fun objectId(objectId: JsonField<String>) = apply { this.objectId = objectId }

        /** Type of table that the view corresponds to. */
        fun viewType(viewType: ViewType) = viewType(JsonField.of(viewType))

        /** Type of table that the view corresponds to. */
        @JsonProperty("view_type")
        @ExcludeMissing
        fun viewType(viewType: JsonField<ViewType>) = apply { this.viewType = viewType }

        /** Name of the view */
        fun name(name: String) = name(JsonField.of(name))

        /** Name of the view */
        @JsonProperty("name")
        @ExcludeMissing
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** The view definition */
        fun viewData(viewData: ViewData) = viewData(JsonField.of(viewData))

        /** The view definition */
        @JsonProperty("view_data")
        @ExcludeMissing
        fun viewData(viewData: JsonField<ViewData>) = apply { this.viewData = viewData }

        /** Options for the view in the app */
        fun options(options: ViewOptions) = options(JsonField.of(options))

        /** Options for the view in the app */
        @JsonProperty("options")
        @ExcludeMissing
        fun options(options: JsonField<ViewOptions>) = apply { this.options = options }

        /** Identifies the user who created the view */
        fun userId(userId: String) = userId(JsonField.of(userId))

        /** Identifies the user who created the view */
        @JsonProperty("user_id")
        @ExcludeMissing
        fun userId(userId: JsonField<String>) = apply { this.userId = userId }

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

        fun build(): PatchView =
            PatchView(
                objectType,
                objectId,
                viewType,
                name,
                viewData,
                options,
                userId,
                additionalProperties.toUnmodifiable(),
            )
    }

    class ObjectType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ObjectType && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val ORGANIZATION = ObjectType(JsonField.of("organization"))

            @JvmField val PROJECT = ObjectType(JsonField.of("project"))

            @JvmField val EXPERIMENT = ObjectType(JsonField.of("experiment"))

            @JvmField val DATASET = ObjectType(JsonField.of("dataset"))

            @JvmField val PROMPT = ObjectType(JsonField.of("prompt"))

            @JvmField val PROMPT_SESSION = ObjectType(JsonField.of("prompt_session"))

            @JvmField val GROUP = ObjectType(JsonField.of("group"))

            @JvmField val ROLE = ObjectType(JsonField.of("role"))

            @JvmField val ORG_MEMBER = ObjectType(JsonField.of("org_member"))

            @JvmField val PROJECT_LOG = ObjectType(JsonField.of("project_log"))

            @JvmField val ORG_PROJECT = ObjectType(JsonField.of("org_project"))

            @JvmStatic fun of(value: String) = ObjectType(JsonField.of(value))
        }

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
            _UNKNOWN,
        }

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

        fun asString(): String = _value().asStringOrThrow()
    }

    class ViewType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ViewType && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val PROJECTS = ViewType(JsonField.of("projects"))

            @JvmField val LOGS = ViewType(JsonField.of("logs"))

            @JvmField val EXPERIMENTS = ViewType(JsonField.of("experiments"))

            @JvmField val DATASETS = ViewType(JsonField.of("datasets"))

            @JvmField val PROMPTS = ViewType(JsonField.of("prompts"))

            @JvmField val PLAYGROUNDS = ViewType(JsonField.of("playgrounds"))

            @JvmField val EXPERIMENT = ViewType(JsonField.of("experiment"))

            @JvmField val DATASET = ViewType(JsonField.of("dataset"))

            @JvmStatic fun of(value: String) = ViewType(JsonField.of(value))
        }

        enum class Known {
            PROJECTS,
            LOGS,
            EXPERIMENTS,
            DATASETS,
            PROMPTS,
            PLAYGROUNDS,
            EXPERIMENT,
            DATASET,
        }

        enum class Value {
            PROJECTS,
            LOGS,
            EXPERIMENTS,
            DATASETS,
            PROMPTS,
            PLAYGROUNDS,
            EXPERIMENT,
            DATASET,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                PROJECTS -> Value.PROJECTS
                LOGS -> Value.LOGS
                EXPERIMENTS -> Value.EXPERIMENTS
                DATASETS -> Value.DATASETS
                PROMPTS -> Value.PROMPTS
                PLAYGROUNDS -> Value.PLAYGROUNDS
                EXPERIMENT -> Value.EXPERIMENT
                DATASET -> Value.DATASET
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                PROJECTS -> Known.PROJECTS
                LOGS -> Known.LOGS
                EXPERIMENTS -> Known.EXPERIMENTS
                DATASETS -> Known.DATASETS
                PROMPTS -> Known.PROMPTS
                PLAYGROUNDS -> Known.PLAYGROUNDS
                EXPERIMENT -> Known.EXPERIMENT
                DATASET -> Known.DATASET
                else -> throw BraintrustInvalidDataException("Unknown ViewType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
