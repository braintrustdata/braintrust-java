// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.Enum
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.errors.BraintrustInvalidDataException
import com.fasterxml.jackson.annotation.JsonCreator

/**
 * Each permission permits a certain type of operation on an object in the system
 *
 * Permissions can be assigned to to objects on an individual basis, or grouped into roles
 */
class Permission @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        @JvmField val CREATE = of("create")

        @JvmField val READ = of("read")

        @JvmField val UPDATE = of("update")

        @JvmField val DELETE = of("delete")

        @JvmField val CREATE_ACLS = of("create_acls")

        @JvmField val READ_ACLS = of("read_acls")

        @JvmField val UPDATE_ACLS = of("update_acls")

        @JvmField val DELETE_ACLS = of("delete_acls")

        @JvmStatic fun of(value: String) = Permission(JsonField.of(value))
    }

    /** An enum containing [Permission]'s known values. */
    enum class Known {
        CREATE,
        READ,
        UPDATE,
        DELETE,
        CREATE_ACLS,
        READ_ACLS,
        UPDATE_ACLS,
        DELETE_ACLS,
    }

    /**
     * An enum containing [Permission]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [Permission] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        CREATE,
        READ,
        UPDATE,
        DELETE,
        CREATE_ACLS,
        READ_ACLS,
        UPDATE_ACLS,
        DELETE_ACLS,
        /** An enum member indicating that [Permission] was instantiated with an unknown value. */
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
            CREATE -> Value.CREATE
            READ -> Value.READ
            UPDATE -> Value.UPDATE
            DELETE -> Value.DELETE
            CREATE_ACLS -> Value.CREATE_ACLS
            READ_ACLS -> Value.READ_ACLS
            UPDATE_ACLS -> Value.UPDATE_ACLS
            DELETE_ACLS -> Value.DELETE_ACLS
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
            CREATE -> Known.CREATE
            READ -> Known.READ
            UPDATE -> Known.UPDATE
            DELETE -> Known.DELETE
            CREATE_ACLS -> Known.CREATE_ACLS
            READ_ACLS -> Known.READ_ACLS
            UPDATE_ACLS -> Known.UPDATE_ACLS
            DELETE_ACLS -> Known.DELETE_ACLS
            else -> throw BraintrustInvalidDataException("Unknown Permission: $value")
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

        return /* spotless:off */ other is Permission && value == other.value /* spotless:on */
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
