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
class EnvVar
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
    @JsonProperty("created")
    @ExcludeMissing
    private val created: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("used")
    @ExcludeMissing
    private val used: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** Unique identifier for the environment variable */
    fun id(): String = id.getRequired("id")

    /** The name of the environment variable */
    fun name(): String = name.getRequired("name")

    /** The id of the object the environment variable is scoped for */
    fun objectId(): String = objectId.getRequired("object_id")

    /** The type of the object the environment variable is scoped for */
    fun objectType(): ObjectType = objectType.getRequired("object_type")

    /** Date of environment variable creation */
    fun created(): Optional<OffsetDateTime> = Optional.ofNullable(created.getNullable("created"))

    /** Date the environment variable was last used */
    fun used(): Optional<OffsetDateTime> = Optional.ofNullable(used.getNullable("used"))

    /** Unique identifier for the environment variable */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /** The name of the environment variable */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /** The id of the object the environment variable is scoped for */
    @JsonProperty("object_id") @ExcludeMissing fun _objectId(): JsonField<String> = objectId

    /** The type of the object the environment variable is scoped for */
    @JsonProperty("object_type")
    @ExcludeMissing
    fun _objectType(): JsonField<ObjectType> = objectType

    /** Date of environment variable creation */
    @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<OffsetDateTime> = created

    /** Date the environment variable was last used */
    @JsonProperty("used") @ExcludeMissing fun _used(): JsonField<OffsetDateTime> = used

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): EnvVar = apply {
        if (validated) {
            return@apply
        }

        id()
        name()
        objectId()
        objectType()
        created()
        used()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EnvVar]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var objectId: JsonField<String>? = null
        private var objectType: JsonField<ObjectType>? = null
        private var created: JsonField<OffsetDateTime> = JsonMissing.of()
        private var used: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(envVar: EnvVar) = apply {
            id = envVar.id
            name = envVar.name
            objectId = envVar.objectId
            objectType = envVar.objectType
            created = envVar.created
            used = envVar.used
            additionalProperties = envVar.additionalProperties.toMutableMap()
        }

        /** Unique identifier for the environment variable */
        fun id(id: String) = id(JsonField.of(id))

        /** Unique identifier for the environment variable */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The name of the environment variable */
        fun name(name: String) = name(JsonField.of(name))

        /** The name of the environment variable */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** The id of the object the environment variable is scoped for */
        fun objectId(objectId: String) = objectId(JsonField.of(objectId))

        /** The id of the object the environment variable is scoped for */
        fun objectId(objectId: JsonField<String>) = apply { this.objectId = objectId }

        /** The type of the object the environment variable is scoped for */
        fun objectType(objectType: ObjectType) = objectType(JsonField.of(objectType))

        /** The type of the object the environment variable is scoped for */
        fun objectType(objectType: JsonField<ObjectType>) = apply { this.objectType = objectType }

        /** Date of environment variable creation */
        fun created(created: OffsetDateTime?) = created(JsonField.ofNullable(created))

        /** Date of environment variable creation */
        fun created(created: Optional<OffsetDateTime>) = created(created.orElse(null))

        /** Date of environment variable creation */
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /** Date the environment variable was last used */
        fun used(used: OffsetDateTime?) = used(JsonField.ofNullable(used))

        /** Date the environment variable was last used */
        fun used(used: Optional<OffsetDateTime>) = used(used.orElse(null))

        /** Date the environment variable was last used */
        fun used(used: JsonField<OffsetDateTime>) = apply { this.used = used }

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

        fun build(): EnvVar =
            EnvVar(
                checkRequired("id", id),
                checkRequired("name", name),
                checkRequired("objectId", objectId),
                checkRequired("objectType", objectType),
                created,
                used,
                additionalProperties.toImmutable(),
            )
    }

    /** The type of the object the environment variable is scoped for */
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

            @JvmField val FUNCTION = of("function")

            @JvmStatic fun of(value: String) = ObjectType(JsonField.of(value))
        }

        /** An enum containing [ObjectType]'s known values. */
        enum class Known {
            ORGANIZATION,
            PROJECT,
            FUNCTION,
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
            FUNCTION,
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
                FUNCTION -> Value.FUNCTION
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
                FUNCTION -> Known.FUNCTION
                else -> throw BraintrustInvalidDataException("Unknown ObjectType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

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

        return /* spotless:off */ other is EnvVar && id == other.id && name == other.name && objectId == other.objectId && objectType == other.objectType && created == other.created && used == other.used && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, name, objectId, objectType, created, used, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EnvVar{id=$id, name=$name, objectId=$objectId, objectType=$objectType, created=$created, used=$used, additionalProperties=$additionalProperties}"
}
