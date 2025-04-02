// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.Enum
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.errors.BraintrustInvalidDataException
import com.fasterxml.jackson.annotation.JsonCreator

/** The type of the configured score */
class ProjectScoreType @JsonCreator private constructor(private val value: JsonField<String>) :
    Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        @JvmField val SLIDER = of("slider")

        @JvmField val CATEGORICAL = of("categorical")

        @JvmField val WEIGHTED = of("weighted")

        @JvmField val MINIMUM = of("minimum")

        @JvmField val MAXIMUM = of("maximum")

        @JvmField val ONLINE = of("online")

        @JvmField val FREE_FORM = of("free-form")

        @JvmStatic fun of(value: String) = ProjectScoreType(JsonField.of(value))
    }

    /** An enum containing [ProjectScoreType]'s known values. */
    enum class Known {
        SLIDER,
        CATEGORICAL,
        WEIGHTED,
        MINIMUM,
        MAXIMUM,
        ONLINE,
        FREE_FORM,
    }

    /**
     * An enum containing [ProjectScoreType]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [ProjectScoreType] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        SLIDER,
        CATEGORICAL,
        WEIGHTED,
        MINIMUM,
        MAXIMUM,
        ONLINE,
        FREE_FORM,
        /**
         * An enum member indicating that [ProjectScoreType] was instantiated with an unknown value.
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
            SLIDER -> Value.SLIDER
            CATEGORICAL -> Value.CATEGORICAL
            WEIGHTED -> Value.WEIGHTED
            MINIMUM -> Value.MINIMUM
            MAXIMUM -> Value.MAXIMUM
            ONLINE -> Value.ONLINE
            FREE_FORM -> Value.FREE_FORM
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
            SLIDER -> Known.SLIDER
            CATEGORICAL -> Known.CATEGORICAL
            WEIGHTED -> Known.WEIGHTED
            MINIMUM -> Known.MINIMUM
            MAXIMUM -> Known.MAXIMUM
            ONLINE -> Known.ONLINE
            FREE_FORM -> Known.FREE_FORM
            else -> throw BraintrustInvalidDataException("Unknown ProjectScoreType: $value")
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

    private var validated: Boolean = false

    fun validate(): ProjectScoreType = apply {
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ProjectScoreType && value == other.value /* spotless:on */
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
