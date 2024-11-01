// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.Enum
import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.toImmutable
import com.braintrustdata.api.errors.BraintrustInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = EnvVar.Builder::class)
@NoAutoDetect
class EnvVar
private constructor(
    private val id: JsonField<String>,
    private val objectType: JsonField<ObjectType>,
    private val objectId: JsonField<String>,
    private val name: JsonField<String>,
    private val created: JsonField<OffsetDateTime>,
    private val used: JsonField<OffsetDateTime>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /** Unique identifier for the environment variable */
    fun id(): String = id.getRequired("id")

    /** The type of the object the environment variable is scoped for */
    fun objectType(): ObjectType = objectType.getRequired("object_type")

    /** The id of the object the environment variable is scoped for */
    fun objectId(): String = objectId.getRequired("object_id")

    /** The name of the environment variable */
    fun name(): String = name.getRequired("name")

    /** Date of environment variable creation */
    fun created(): Optional<OffsetDateTime> = Optional.ofNullable(created.getNullable("created"))

    /** Date the environment variable was last used */
    fun used(): Optional<OffsetDateTime> = Optional.ofNullable(used.getNullable("used"))

    /** Unique identifier for the environment variable */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /** The type of the object the environment variable is scoped for */
    @JsonProperty("object_type") @ExcludeMissing fun _objectType() = objectType

    /** The id of the object the environment variable is scoped for */
    @JsonProperty("object_id") @ExcludeMissing fun _objectId() = objectId

    /** The name of the environment variable */
    @JsonProperty("name") @ExcludeMissing fun _name() = name

    /** Date of environment variable creation */
    @JsonProperty("created") @ExcludeMissing fun _created() = created

    /** Date the environment variable was last used */
    @JsonProperty("used") @ExcludeMissing fun _used() = used

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): EnvVar = apply {
        if (!validated) {
            id()
            objectType()
            objectId()
            name()
            created()
            used()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var objectType: JsonField<ObjectType> = JsonMissing.of()
        private var objectId: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var created: JsonField<OffsetDateTime> = JsonMissing.of()
        private var used: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(envVar: EnvVar) = apply {
            this.id = envVar.id
            this.objectType = envVar.objectType
            this.objectId = envVar.objectId
            this.name = envVar.name
            this.created = envVar.created
            this.used = envVar.used
            additionalProperties(envVar.additionalProperties)
        }

        /** Unique identifier for the environment variable */
        fun id(id: String) = id(JsonField.of(id))

        /** Unique identifier for the environment variable */
        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        /** The type of the object the environment variable is scoped for */
        fun objectType(objectType: ObjectType) = objectType(JsonField.of(objectType))

        /** The type of the object the environment variable is scoped for */
        @JsonProperty("object_type")
        @ExcludeMissing
        fun objectType(objectType: JsonField<ObjectType>) = apply { this.objectType = objectType }

        /** The id of the object the environment variable is scoped for */
        fun objectId(objectId: String) = objectId(JsonField.of(objectId))

        /** The id of the object the environment variable is scoped for */
        @JsonProperty("object_id")
        @ExcludeMissing
        fun objectId(objectId: JsonField<String>) = apply { this.objectId = objectId }

        /** The name of the environment variable */
        fun name(name: String) = name(JsonField.of(name))

        /** The name of the environment variable */
        @JsonProperty("name")
        @ExcludeMissing
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Date of environment variable creation */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /** Date of environment variable creation */
        @JsonProperty("created")
        @ExcludeMissing
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /** Date the environment variable was last used */
        fun used(used: OffsetDateTime) = used(JsonField.of(used))

        /** Date the environment variable was last used */
        @JsonProperty("used")
        @ExcludeMissing
        fun used(used: JsonField<OffsetDateTime>) = apply { this.used = used }

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

        fun build(): EnvVar =
            EnvVar(
                id,
                objectType,
                objectId,
                name,
                created,
                used,
                additionalProperties.toImmutable(),
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

            return /* spotless:off */ other is ObjectType && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val ORGANIZATION = ObjectType(JsonField.of("organization"))

            @JvmField val PROJECT = ObjectType(JsonField.of("project"))

            @JvmField val FUNCTION = ObjectType(JsonField.of("function"))

            @JvmStatic fun of(value: String) = ObjectType(JsonField.of(value))
        }

        enum class Known {
            ORGANIZATION,
            PROJECT,
            FUNCTION,
        }

        enum class Value {
            ORGANIZATION,
            PROJECT,
            FUNCTION,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ORGANIZATION -> Value.ORGANIZATION
                PROJECT -> Value.PROJECT
                FUNCTION -> Value.FUNCTION
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ORGANIZATION -> Known.ORGANIZATION
                PROJECT -> Known.PROJECT
                FUNCTION -> Known.FUNCTION
                else -> throw BraintrustInvalidDataException("Unknown ObjectType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is EnvVar && this.id == other.id && this.objectType == other.objectType && this.objectId == other.objectId && this.name == other.name && this.created == other.created && this.used == other.used && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(id, objectType, objectId, name, created, used, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() =
        "EnvVar{id=$id, objectType=$objectType, objectId=$objectId, name=$name, created=$created, used=$used, additionalProperties=$additionalProperties}"
}
