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

@JsonDeserialize(builder = DeleteView.Builder::class)
@NoAutoDetect
class DeleteView
private constructor(
    private val objectType: JsonField<ObjectType>,
    private val objectId: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** The object type that the ACL applies to */
    fun objectType(): Optional<ObjectType> =
        Optional.ofNullable(objectType.getNullable("object_type"))

    /** The id of the object the view applies to */
    fun objectId(): String = objectId.getRequired("object_id")

    /** The object type that the ACL applies to */
    @JsonProperty("object_type") @ExcludeMissing fun _objectType() = objectType

    /** The id of the object the view applies to */
    @JsonProperty("object_id") @ExcludeMissing fun _objectId() = objectId

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): DeleteView = apply {
        if (!validated) {
            objectType()
            objectId()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DeleteView &&
            this.objectType == other.objectType &&
            this.objectId == other.objectId &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    objectType,
                    objectId,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "DeleteView{objectType=$objectType, objectId=$objectId, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var objectType: JsonField<ObjectType> = JsonMissing.of()
        private var objectId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(deleteView: DeleteView) = apply {
            this.objectType = deleteView.objectType
            this.objectId = deleteView.objectId
            additionalProperties(deleteView.additionalProperties)
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

        fun build(): DeleteView =
            DeleteView(
                objectType,
                objectId,
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
}
