// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.Enum
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.errors.BraintrustInvalidDataException
import com.fasterxml.jackson.annotation.JsonCreator

class AclObjectType
@JsonCreator
private constructor(
    private val value: JsonField<String>,
) : Enum {

    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AclObjectType && this.value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()

    companion object {

        @JvmField val ORGANIZATION = AclObjectType(JsonField.of("organization"))

        @JvmField val PROJECT = AclObjectType(JsonField.of("project"))

        @JvmField val EXPERIMENT = AclObjectType(JsonField.of("experiment"))

        @JvmField val DATASET = AclObjectType(JsonField.of("dataset"))

        @JvmField val PROMPT = AclObjectType(JsonField.of("prompt"))

        @JvmField val PROMPT_SESSION = AclObjectType(JsonField.of("prompt_session"))

        @JvmField val GROUP = AclObjectType(JsonField.of("group"))

        @JvmField val ROLE = AclObjectType(JsonField.of("role"))

        @JvmField val ORG_MEMBER = AclObjectType(JsonField.of("org_member"))

        @JvmField val PROJECT_LOG = AclObjectType(JsonField.of("project_log"))

        @JvmField val ORG_PROJECT = AclObjectType(JsonField.of("org_project"))

        @JvmStatic fun of(value: String) = AclObjectType(JsonField.of(value))
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
            else -> throw BraintrustInvalidDataException("Unknown AclObjectType: $value")
        }

    fun asString(): String = _value().asStringOrThrow()
}
