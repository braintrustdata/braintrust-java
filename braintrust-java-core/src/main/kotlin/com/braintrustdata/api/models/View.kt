// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.Enum
import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
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

@NoAutoDetect
class View
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
    @JsonProperty("object_id")
    @ExcludeMissing
    private val objectId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("object_type")
    @ExcludeMissing
    private val objectType: JsonField<ObjectType> = JsonMissing.of(),
    @JsonProperty("view_type")
    @ExcludeMissing
    private val viewType: JsonField<ViewType> = JsonMissing.of(),
    @JsonProperty("created")
    @ExcludeMissing
    private val created: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("deleted_at")
    @ExcludeMissing
    private val deletedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("options")
    @ExcludeMissing
    private val options: JsonField<ViewOptions> = JsonMissing.of(),
    @JsonProperty("user_id")
    @ExcludeMissing
    private val userId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("view_data")
    @ExcludeMissing
    private val viewData: JsonField<ViewData> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** Unique identifier for the view */
    fun id(): String = id.getRequired("id")

    /** Name of the view */
    fun name(): String = name.getRequired("name")

    /** The id of the object the view applies to */
    fun objectId(): String = objectId.getRequired("object_id")

    /** The object type that the ACL applies to */
    fun objectType(): ObjectType = objectType.getRequired("object_type")

    /** Type of table that the view corresponds to. */
    fun viewType(): Optional<ViewType> = Optional.ofNullable(viewType.getNullable("view_type"))

    /** Date of view creation */
    fun created(): Optional<OffsetDateTime> = Optional.ofNullable(created.getNullable("created"))

    /** Date of role deletion, or null if the role is still active */
    fun deletedAt(): Optional<OffsetDateTime> =
        Optional.ofNullable(deletedAt.getNullable("deleted_at"))

    /** Options for the view in the app */
    fun options(): Optional<ViewOptions> = Optional.ofNullable(options.getNullable("options"))

    /** Identifies the user who created the view */
    fun userId(): Optional<String> = Optional.ofNullable(userId.getNullable("user_id"))

    /** The view definition */
    fun viewData(): Optional<ViewData> = Optional.ofNullable(viewData.getNullable("view_data"))

    /** Unique identifier for the view */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /** Name of the view */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /** The id of the object the view applies to */
    @JsonProperty("object_id") @ExcludeMissing fun _objectId(): JsonField<String> = objectId

    /** The object type that the ACL applies to */
    @JsonProperty("object_type")
    @ExcludeMissing
    fun _objectType(): JsonField<ObjectType> = objectType

    /** Type of table that the view corresponds to. */
    @JsonProperty("view_type") @ExcludeMissing fun _viewType(): JsonField<ViewType> = viewType

    /** Date of view creation */
    @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<OffsetDateTime> = created

    /** Date of role deletion, or null if the role is still active */
    @JsonProperty("deleted_at")
    @ExcludeMissing
    fun _deletedAt(): JsonField<OffsetDateTime> = deletedAt

    /** Options for the view in the app */
    @JsonProperty("options") @ExcludeMissing fun _options(): JsonField<ViewOptions> = options

    /** Identifies the user who created the view */
    @JsonProperty("user_id") @ExcludeMissing fun _userId(): JsonField<String> = userId

    /** The view definition */
    @JsonProperty("view_data") @ExcludeMissing fun _viewData(): JsonField<ViewData> = viewData

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): View = apply {
        if (validated) {
            return@apply
        }

        id()
        name()
        objectId()
        objectType()
        viewType()
        created()
        deletedAt()
        options().ifPresent { it.validate() }
        userId()
        viewData().ifPresent { it.validate() }
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [View]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var objectId: JsonField<String>? = null
        private var objectType: JsonField<ObjectType>? = null
        private var viewType: JsonField<ViewType>? = null
        private var created: JsonField<OffsetDateTime> = JsonMissing.of()
        private var deletedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var options: JsonField<ViewOptions> = JsonMissing.of()
        private var userId: JsonField<String> = JsonMissing.of()
        private var viewData: JsonField<ViewData> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(view: View) = apply {
            id = view.id
            name = view.name
            objectId = view.objectId
            objectType = view.objectType
            viewType = view.viewType
            created = view.created
            deletedAt = view.deletedAt
            options = view.options
            userId = view.userId
            viewData = view.viewData
            additionalProperties = view.additionalProperties.toMutableMap()
        }

        /** Unique identifier for the view */
        fun id(id: String) = id(JsonField.of(id))

        /** Unique identifier for the view */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Name of the view */
        fun name(name: String) = name(JsonField.of(name))

        /** Name of the view */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** The id of the object the view applies to */
        fun objectId(objectId: String) = objectId(JsonField.of(objectId))

        /** The id of the object the view applies to */
        fun objectId(objectId: JsonField<String>) = apply { this.objectId = objectId }

        /** The object type that the ACL applies to */
        fun objectType(objectType: ObjectType) = objectType(JsonField.of(objectType))

        /** The object type that the ACL applies to */
        fun objectType(objectType: JsonField<ObjectType>) = apply { this.objectType = objectType }

        /** Type of table that the view corresponds to. */
        fun viewType(viewType: ViewType?) = viewType(JsonField.ofNullable(viewType))

        /** Type of table that the view corresponds to. */
        fun viewType(viewType: Optional<ViewType>) = viewType(viewType.orElse(null))

        /** Type of table that the view corresponds to. */
        fun viewType(viewType: JsonField<ViewType>) = apply { this.viewType = viewType }

        /** Date of view creation */
        fun created(created: OffsetDateTime?) = created(JsonField.ofNullable(created))

        /** Date of view creation */
        fun created(created: Optional<OffsetDateTime>) = created(created.orElse(null))

        /** Date of view creation */
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /** Date of role deletion, or null if the role is still active */
        fun deletedAt(deletedAt: OffsetDateTime?) = deletedAt(JsonField.ofNullable(deletedAt))

        /** Date of role deletion, or null if the role is still active */
        fun deletedAt(deletedAt: Optional<OffsetDateTime>) = deletedAt(deletedAt.orElse(null))

        /** Date of role deletion, or null if the role is still active */
        fun deletedAt(deletedAt: JsonField<OffsetDateTime>) = apply { this.deletedAt = deletedAt }

        /** Options for the view in the app */
        fun options(options: ViewOptions?) = options(JsonField.ofNullable(options))

        /** Options for the view in the app */
        fun options(options: Optional<ViewOptions>) = options(options.orElse(null))

        /** Options for the view in the app */
        fun options(options: JsonField<ViewOptions>) = apply { this.options = options }

        /** Identifies the user who created the view */
        fun userId(userId: String?) = userId(JsonField.ofNullable(userId))

        /** Identifies the user who created the view */
        fun userId(userId: Optional<String>) = userId(userId.orElse(null))

        /** Identifies the user who created the view */
        fun userId(userId: JsonField<String>) = apply { this.userId = userId }

        /** The view definition */
        fun viewData(viewData: ViewData?) = viewData(JsonField.ofNullable(viewData))

        /** The view definition */
        fun viewData(viewData: Optional<ViewData>) = viewData(viewData.orElse(null))

        /** The view definition */
        fun viewData(viewData: JsonField<ViewData>) = apply { this.viewData = viewData }

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

        fun build(): View =
            View(
                checkRequired("id", id),
                checkRequired("name", name),
                checkRequired("objectId", objectId),
                checkRequired("objectType", objectType),
                checkRequired("viewType", viewType),
                created,
                deletedAt,
                options,
                userId,
                viewData,
                additionalProperties.toImmutable(),
            )
    }

    /** The object type that the ACL applies to */
    class ObjectType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

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
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
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
             * An enum member indicating that [ObjectType] was instantiated with an unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
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
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws BraintrustInvalidDataException if this class instance's value is a not a known
         *   member.
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
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws BraintrustInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                BraintrustInvalidDataException("Value is not a String")
            }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ObjectType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Type of table that the view corresponds to. */
    class ViewType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val PROJECTS = of("projects")

            @JvmField val LOGS = of("logs")

            @JvmField val EXPERIMENTS = of("experiments")

            @JvmField val DATASETS = of("datasets")

            @JvmField val PROMPTS = of("prompts")

            @JvmField val PLAYGROUNDS = of("playgrounds")

            @JvmField val EXPERIMENT = of("experiment")

            @JvmField val DATASET = of("dataset")

            @JvmStatic fun of(value: String) = ViewType(JsonField.of(value))
        }

        /** An enum containing [ViewType]'s known values. */
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

        /**
         * An enum containing [ViewType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ViewType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PROJECTS,
            LOGS,
            EXPERIMENTS,
            DATASETS,
            PROMPTS,
            PLAYGROUNDS,
            EXPERIMENT,
            DATASET,
            /** An enum member indicating that [ViewType] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
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

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws BraintrustInvalidDataException if this class instance's value is a not a known
         *   member.
         */
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

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws BraintrustInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                BraintrustInvalidDataException("Value is not a String")
            }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ViewType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is View && id == other.id && name == other.name && objectId == other.objectId && objectType == other.objectType && viewType == other.viewType && created == other.created && deletedAt == other.deletedAt && options == other.options && userId == other.userId && viewData == other.viewData && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, name, objectId, objectType, viewType, created, deletedAt, options, userId, viewData, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "View{id=$id, name=$name, objectId=$objectId, objectType=$objectType, viewType=$viewType, created=$created, deletedAt=$deletedAt, options=$options, userId=$userId, viewData=$viewData, additionalProperties=$additionalProperties}"
}
