// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.Enum
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.errors.BraintrustInvalidDataException
import com.fasterxml.jackson.annotation.JsonCreator

class ProjectScoreType
@JsonCreator
private constructor(
    private val value: JsonField<String>,
) : Enum {

    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ProjectScoreType && this.value == other.value /* spotless:on */
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()

    companion object {

        @JvmField val SLIDER = ProjectScoreType(JsonField.of("slider"))

        @JvmField val CATEGORICAL = ProjectScoreType(JsonField.of("categorical"))

        @JvmField val WEIGHTED = ProjectScoreType(JsonField.of("weighted"))

        @JvmField val MINIMUM = ProjectScoreType(JsonField.of("minimum"))

        @JvmField val ONLINE = ProjectScoreType(JsonField.of("online"))

        @JvmStatic fun of(value: String) = ProjectScoreType(JsonField.of(value))
    }

    enum class Known {
        SLIDER,
        CATEGORICAL,
        WEIGHTED,
        MINIMUM,
        ONLINE,
    }

    enum class Value {
        SLIDER,
        CATEGORICAL,
        WEIGHTED,
        MINIMUM,
        ONLINE,
        _UNKNOWN,
    }

    fun value(): Value =
        when (this) {
            SLIDER -> Value.SLIDER
            CATEGORICAL -> Value.CATEGORICAL
            WEIGHTED -> Value.WEIGHTED
            MINIMUM -> Value.MINIMUM
            ONLINE -> Value.ONLINE
            else -> Value._UNKNOWN
        }

    fun known(): Known =
        when (this) {
            SLIDER -> Known.SLIDER
            CATEGORICAL -> Known.CATEGORICAL
            WEIGHTED -> Known.WEIGHTED
            MINIMUM -> Known.MINIMUM
            ONLINE -> Known.ONLINE
            else -> throw BraintrustInvalidDataException("Unknown ProjectScoreType: $value")
        }

    fun asString(): String = _value().asStringOrThrow()
}
