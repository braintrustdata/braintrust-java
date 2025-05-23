// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.Enum
import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.checkRequired
import com.braintrustdata.api.errors.BraintrustInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class View
private constructor(
    private val id: JsonField<String>,
    private val name: JsonField<String>,
    private val objectId: JsonField<String>,
    private val objectType: JsonField<AclObjectType>,
    private val viewType: JsonField<ViewType>,
    private val created: JsonField<OffsetDateTime>,
    private val deletedAt: JsonField<OffsetDateTime>,
    private val options: JsonField<ViewOptions>,
    private val userId: JsonField<String>,
    private val viewData: JsonField<ViewData>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("object_id") @ExcludeMissing objectId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("object_type")
        @ExcludeMissing
        objectType: JsonField<AclObjectType> = JsonMissing.of(),
        @JsonProperty("view_type") @ExcludeMissing viewType: JsonField<ViewType> = JsonMissing.of(),
        @JsonProperty("created")
        @ExcludeMissing
        created: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("deleted_at")
        @ExcludeMissing
        deletedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("options") @ExcludeMissing options: JsonField<ViewOptions> = JsonMissing.of(),
        @JsonProperty("user_id") @ExcludeMissing userId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("view_data") @ExcludeMissing viewData: JsonField<ViewData> = JsonMissing.of(),
    ) : this(
        id,
        name,
        objectId,
        objectType,
        viewType,
        created,
        deletedAt,
        options,
        userId,
        viewData,
        mutableMapOf(),
    )

    /**
     * Unique identifier for the view
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Name of the view
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * The id of the object the view applies to
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun objectId(): String = objectId.getRequired("object_id")

    /**
     * The object type that the ACL applies to
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun objectType(): AclObjectType = objectType.getRequired("object_type")

    /**
     * Type of table that the view corresponds to.
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun viewType(): Optional<ViewType> = viewType.getOptional("view_type")

    /**
     * Date of view creation
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun created(): Optional<OffsetDateTime> = created.getOptional("created")

    /**
     * Date of role deletion, or null if the role is still active
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun deletedAt(): Optional<OffsetDateTime> = deletedAt.getOptional("deleted_at")

    /**
     * Options for the view in the app
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun options(): Optional<ViewOptions> = options.getOptional("options")

    /**
     * Identifies the user who created the view
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun userId(): Optional<String> = userId.getOptional("user_id")

    /**
     * The view definition
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun viewData(): Optional<ViewData> = viewData.getOptional("view_data")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [objectId].
     *
     * Unlike [objectId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("object_id") @ExcludeMissing fun _objectId(): JsonField<String> = objectId

    /**
     * Returns the raw JSON value of [objectType].
     *
     * Unlike [objectType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("object_type")
    @ExcludeMissing
    fun _objectType(): JsonField<AclObjectType> = objectType

    /**
     * Returns the raw JSON value of [viewType].
     *
     * Unlike [viewType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("view_type") @ExcludeMissing fun _viewType(): JsonField<ViewType> = viewType

    /**
     * Returns the raw JSON value of [created].
     *
     * Unlike [created], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<OffsetDateTime> = created

    /**
     * Returns the raw JSON value of [deletedAt].
     *
     * Unlike [deletedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("deleted_at")
    @ExcludeMissing
    fun _deletedAt(): JsonField<OffsetDateTime> = deletedAt

    /**
     * Returns the raw JSON value of [options].
     *
     * Unlike [options], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("options") @ExcludeMissing fun _options(): JsonField<ViewOptions> = options

    /**
     * Returns the raw JSON value of [userId].
     *
     * Unlike [userId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("user_id") @ExcludeMissing fun _userId(): JsonField<String> = userId

    /**
     * Returns the raw JSON value of [viewData].
     *
     * Unlike [viewData], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("view_data") @ExcludeMissing fun _viewData(): JsonField<ViewData> = viewData

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
         * Returns a mutable builder for constructing an instance of [View].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .name()
         * .objectId()
         * .objectType()
         * .viewType()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [View]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var objectId: JsonField<String>? = null
        private var objectType: JsonField<AclObjectType>? = null
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

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Name of the view */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** The id of the object the view applies to */
        fun objectId(objectId: String) = objectId(JsonField.of(objectId))

        /**
         * Sets [Builder.objectId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.objectId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun objectId(objectId: JsonField<String>) = apply { this.objectId = objectId }

        /** The object type that the ACL applies to */
        fun objectType(objectType: AclObjectType) = objectType(JsonField.of(objectType))

        /**
         * Sets [Builder.objectType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.objectType] with a well-typed [AclObjectType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun objectType(objectType: JsonField<AclObjectType>) = apply {
            this.objectType = objectType
        }

        /** Type of table that the view corresponds to. */
        fun viewType(viewType: ViewType?) = viewType(JsonField.ofNullable(viewType))

        /** Alias for calling [Builder.viewType] with `viewType.orElse(null)`. */
        fun viewType(viewType: Optional<ViewType>) = viewType(viewType.getOrNull())

        /**
         * Sets [Builder.viewType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.viewType] with a well-typed [ViewType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun viewType(viewType: JsonField<ViewType>) = apply { this.viewType = viewType }

        /** Date of view creation */
        fun created(created: OffsetDateTime?) = created(JsonField.ofNullable(created))

        /** Alias for calling [Builder.created] with `created.orElse(null)`. */
        fun created(created: Optional<OffsetDateTime>) = created(created.getOrNull())

        /**
         * Sets [Builder.created] to an arbitrary JSON value.
         *
         * You should usually call [Builder.created] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /** Date of role deletion, or null if the role is still active */
        fun deletedAt(deletedAt: OffsetDateTime?) = deletedAt(JsonField.ofNullable(deletedAt))

        /** Alias for calling [Builder.deletedAt] with `deletedAt.orElse(null)`. */
        fun deletedAt(deletedAt: Optional<OffsetDateTime>) = deletedAt(deletedAt.getOrNull())

        /**
         * Sets [Builder.deletedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.deletedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun deletedAt(deletedAt: JsonField<OffsetDateTime>) = apply { this.deletedAt = deletedAt }

        /** Options for the view in the app */
        fun options(options: ViewOptions?) = options(JsonField.ofNullable(options))

        /** Alias for calling [Builder.options] with `options.orElse(null)`. */
        fun options(options: Optional<ViewOptions>) = options(options.getOrNull())

        /**
         * Sets [Builder.options] to an arbitrary JSON value.
         *
         * You should usually call [Builder.options] with a well-typed [ViewOptions] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun options(options: JsonField<ViewOptions>) = apply { this.options = options }

        /** Identifies the user who created the view */
        fun userId(userId: String?) = userId(JsonField.ofNullable(userId))

        /** Alias for calling [Builder.userId] with `userId.orElse(null)`. */
        fun userId(userId: Optional<String>) = userId(userId.getOrNull())

        /**
         * Sets [Builder.userId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun userId(userId: JsonField<String>) = apply { this.userId = userId }

        /** The view definition */
        fun viewData(viewData: ViewData?) = viewData(JsonField.ofNullable(viewData))

        /** Alias for calling [Builder.viewData] with `viewData.orElse(null)`. */
        fun viewData(viewData: Optional<ViewData>) = viewData(viewData.getOrNull())

        /**
         * Sets [Builder.viewData] to an arbitrary JSON value.
         *
         * You should usually call [Builder.viewData] with a well-typed [ViewData] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
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

        /**
         * Returns an immutable instance of [View].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .name()
         * .objectId()
         * .objectType()
         * .viewType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
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
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): View = apply {
        if (validated) {
            return@apply
        }

        id()
        name()
        objectId()
        objectType().validate()
        viewType().ifPresent { it.validate() }
        created()
        deletedAt()
        options().ifPresent { it.validate() }
        userId()
        viewData().ifPresent { it.validate() }
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (objectId.asKnown().isPresent) 1 else 0) +
            (objectType.asKnown().getOrNull()?.validity() ?: 0) +
            (viewType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (created.asKnown().isPresent) 1 else 0) +
            (if (deletedAt.asKnown().isPresent) 1 else 0) +
            (options.asKnown().getOrNull()?.validity() ?: 0) +
            (if (userId.asKnown().isPresent) 1 else 0) +
            (viewData.asKnown().getOrNull()?.validity() ?: 0)

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

            @JvmField val EXPERIMENTS = of("experiments")

            @JvmField val EXPERIMENT = of("experiment")

            @JvmField val PLAYGROUNDS = of("playgrounds")

            @JvmField val PLAYGROUND = of("playground")

            @JvmField val DATASETS = of("datasets")

            @JvmField val DATASET = of("dataset")

            @JvmField val PROMPTS = of("prompts")

            @JvmField val TOOLS = of("tools")

            @JvmField val SCORERS = of("scorers")

            @JvmField val LOGS = of("logs")

            @JvmStatic fun of(value: String) = ViewType(JsonField.of(value))
        }

        /** An enum containing [ViewType]'s known values. */
        enum class Known {
            PROJECTS,
            EXPERIMENTS,
            EXPERIMENT,
            PLAYGROUNDS,
            PLAYGROUND,
            DATASETS,
            DATASET,
            PROMPTS,
            TOOLS,
            SCORERS,
            LOGS,
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
            EXPERIMENTS,
            EXPERIMENT,
            PLAYGROUNDS,
            PLAYGROUND,
            DATASETS,
            DATASET,
            PROMPTS,
            TOOLS,
            SCORERS,
            LOGS,
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
                EXPERIMENTS -> Value.EXPERIMENTS
                EXPERIMENT -> Value.EXPERIMENT
                PLAYGROUNDS -> Value.PLAYGROUNDS
                PLAYGROUND -> Value.PLAYGROUND
                DATASETS -> Value.DATASETS
                DATASET -> Value.DATASET
                PROMPTS -> Value.PROMPTS
                TOOLS -> Value.TOOLS
                SCORERS -> Value.SCORERS
                LOGS -> Value.LOGS
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
                EXPERIMENTS -> Known.EXPERIMENTS
                EXPERIMENT -> Known.EXPERIMENT
                PLAYGROUNDS -> Known.PLAYGROUNDS
                PLAYGROUND -> Known.PLAYGROUND
                DATASETS -> Known.DATASETS
                DATASET -> Known.DATASET
                PROMPTS -> Known.PROMPTS
                TOOLS -> Known.TOOLS
                SCORERS -> Known.SCORERS
                LOGS -> Known.LOGS
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

        private var validated: Boolean = false

        fun validate(): ViewType = apply {
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
