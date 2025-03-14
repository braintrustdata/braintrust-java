// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.Enum
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.errors.BraintrustInvalidDataException
import com.fasterxml.jackson.annotation.JsonCreator

/** The object type that the ACL applies to */
class AclObjectType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
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

        @JvmStatic fun of(value: String) = AclObjectType(JsonField.of(value))
    }

    /** An enum containing [AclObjectType]'s known values. */
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
     * An enum containing [AclObjectType]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [AclObjectType] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
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
         * An enum member indicating that [AclObjectType] was instantiated with an unknown value.
         */
        _UNKNOWN,
    }

    /**
     * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN] if
     * the class was instantiated with an unknown value.
     *
     * Use the [known] method instead if you're certain the value is always known or if you want to
     * throw for the unknown case.
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
     * Use the [value] method instead if you're uncertain the value is always known and don't want
     * to throw for the unknown case.
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
            else -> throw BraintrustInvalidDataException("Unknown AclObjectType: $value")
        }

    /**
     * Returns this class instance's primitive wire representation.
     *
     * This differs from the [toString] method because that method is primarily for debugging and
     * generally doesn't throw.
     *
     * @throws BraintrustInvalidDataException if this class instance's value does not have the
     *   expected primitive type.
     */
    fun asString(): String =
        _value().asString().orElseThrow { BraintrustInvalidDataException("Value is not a String") }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AclObjectType && value == other.value /* spotless:on */
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
