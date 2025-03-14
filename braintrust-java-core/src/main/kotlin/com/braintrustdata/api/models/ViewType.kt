// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.Enum
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.errors.BraintrustInvalidDataException
import com.fasterxml.jackson.annotation.JsonCreator

/** Type of table that the view corresponds to. */
class ViewType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
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
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
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
     * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN] if
     * the class was instantiated with an unknown value.
     *
     * Use the [known] method instead if you're certain the value is always known or if you want to
     * throw for the unknown case.
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
     * Use the [value] method instead if you're uncertain the value is always known and don't want
     * to throw for the unknown case.
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

        return /* spotless:off */ other is ViewType && value == other.value /* spotless:on */
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
