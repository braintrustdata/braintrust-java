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
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Indicates the event was copied from another object. */
@NoAutoDetect
class ObjectReference
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("_xact_id")
    @ExcludeMissing
    private val _xactId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("object_id")
    @ExcludeMissing
    private val objectId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("object_type")
    @ExcludeMissing
    private val objectType: JsonField<ObjectType> = JsonMissing.of(),
    @JsonProperty("created")
    @ExcludeMissing
    private val created: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** ID of the original event. */
    fun id(): String = id.getRequired("id")

    /** Transaction ID of the original event. */
    fun _xactId(): String = _xactId.getRequired("_xact_id")

    /** ID of the object the event is originating from. */
    fun objectId(): String = objectId.getRequired("object_id")

    /** Type of the object the event is originating from. */
    fun objectType(): ObjectType = objectType.getRequired("object_type")

    /** Created timestamp of the original event. Used to help sort in the UI */
    fun created(): Optional<String> = Optional.ofNullable(created.getNullable("created"))

    /** ID of the original event. */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /** Transaction ID of the original event. */
    @JsonProperty("_xact_id") @ExcludeMissing fun __xactId(): JsonField<String> = _xactId

    /** ID of the object the event is originating from. */
    @JsonProperty("object_id") @ExcludeMissing fun _objectId(): JsonField<String> = objectId

    /** Type of the object the event is originating from. */
    @JsonProperty("object_type")
    @ExcludeMissing
    fun _objectType(): JsonField<ObjectType> = objectType

    /** Created timestamp of the original event. Used to help sort in the UI */
    @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<String> = created

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): ObjectReference = apply {
        if (validated) {
            return@apply
        }

        id()
        _xactId()
        objectId()
        objectType()
        created()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ObjectReference].
         *
         * The following fields are required:
         * ```java
         * .id()
         * ._xactId()
         * .objectId()
         * .objectType()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ObjectReference]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var _xactId: JsonField<String>? = null
        private var objectId: JsonField<String>? = null
        private var objectType: JsonField<ObjectType>? = null
        private var created: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(objectReference: ObjectReference) = apply {
            id = objectReference.id
            _xactId = objectReference._xactId
            objectId = objectReference.objectId
            objectType = objectReference.objectType
            created = objectReference.created
            additionalProperties = objectReference.additionalProperties.toMutableMap()
        }

        /** ID of the original event. */
        fun id(id: String) = id(JsonField.of(id))

        /** ID of the original event. */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Transaction ID of the original event. */
        fun _xactId(_xactId: String) = _xactId(JsonField.of(_xactId))

        /** Transaction ID of the original event. */
        fun _xactId(_xactId: JsonField<String>) = apply { this._xactId = _xactId }

        /** ID of the object the event is originating from. */
        fun objectId(objectId: String) = objectId(JsonField.of(objectId))

        /** ID of the object the event is originating from. */
        fun objectId(objectId: JsonField<String>) = apply { this.objectId = objectId }

        /** Type of the object the event is originating from. */
        fun objectType(objectType: ObjectType) = objectType(JsonField.of(objectType))

        /** Type of the object the event is originating from. */
        fun objectType(objectType: JsonField<ObjectType>) = apply { this.objectType = objectType }

        /** Created timestamp of the original event. Used to help sort in the UI */
        fun created(created: String?) = created(JsonField.ofNullable(created))

        /** Created timestamp of the original event. Used to help sort in the UI */
        fun created(created: Optional<String>) = created(created.getOrNull())

        /** Created timestamp of the original event. Used to help sort in the UI */
        fun created(created: JsonField<String>) = apply { this.created = created }

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

        fun build(): ObjectReference =
            ObjectReference(
                checkRequired("id", id),
                checkRequired("_xactId", _xactId),
                checkRequired("objectId", objectId),
                checkRequired("objectType", objectType),
                created,
                additionalProperties.toImmutable(),
            )
    }

    /** Type of the object the event is originating from. */
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

            @JvmField val EXPERIMENT = of("experiment")

            @JvmField val DATASET = of("dataset")

            @JvmField val PROMPT = of("prompt")

            @JvmField val FUNCTION = of("function")

            @JvmField val PROMPT_SESSION = of("prompt_session")

            @JvmField val PROJECT_LOGS = of("project_logs")

            @JvmStatic fun of(value: String) = ObjectType(JsonField.of(value))
        }

        /** An enum containing [ObjectType]'s known values. */
        enum class Known {
            EXPERIMENT,
            DATASET,
            PROMPT,
            FUNCTION,
            PROMPT_SESSION,
            PROJECT_LOGS,
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
            EXPERIMENT,
            DATASET,
            PROMPT,
            FUNCTION,
            PROMPT_SESSION,
            PROJECT_LOGS,
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
                EXPERIMENT -> Value.EXPERIMENT
                DATASET -> Value.DATASET
                PROMPT -> Value.PROMPT
                FUNCTION -> Value.FUNCTION
                PROMPT_SESSION -> Value.PROMPT_SESSION
                PROJECT_LOGS -> Value.PROJECT_LOGS
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
                EXPERIMENT -> Known.EXPERIMENT
                DATASET -> Known.DATASET
                PROMPT -> Known.PROMPT
                FUNCTION -> Known.FUNCTION
                PROMPT_SESSION -> Known.PROMPT_SESSION
                PROJECT_LOGS -> Known.PROJECT_LOGS
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ObjectReference && id == other.id && _xactId == other._xactId && objectId == other.objectId && objectType == other.objectType && created == other.created && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, _xactId, objectId, objectType, created, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ObjectReference{id=$id, _xactId=$_xactId, objectId=$objectId, objectType=$objectType, created=$created, additionalProperties=$additionalProperties}"
}
