// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.Enum
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.errors.BraintrustInvalidDataException
import com.fasterxml.jackson.annotation.JsonCreator

class ViewType
@JsonCreator
private constructor(
    private val value: JsonField<String>,
) : Enum {

    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ViewType && this.value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()

    companion object {

        @JvmField val PROJECTS = ViewType(JsonField.of("projects"))

        @JvmField val LOGS = ViewType(JsonField.of("logs"))

        @JvmField val EXPERIMENTS = ViewType(JsonField.of("experiments"))

        @JvmField val DATASETS = ViewType(JsonField.of("datasets"))

        @JvmField val PROMPTS = ViewType(JsonField.of("prompts"))

        @JvmField val PLAYGROUNDS = ViewType(JsonField.of("playgrounds"))

        @JvmField val EXPERIMENT = ViewType(JsonField.of("experiment"))

        @JvmField val DATASET = ViewType(JsonField.of("dataset"))

        @JvmStatic fun of(value: String) = ViewType(JsonField.of(value))
    }

    enum class Known {
        PROJECTS,
        LOGS,
        EXPERIMENTS,
        DATASETS,
        PROMPTS,
        PLAYGROUNDS,
        EXPERIMENT,
        DATASET,
    }

    enum class Value {
        PROJECTS,
        LOGS,
        EXPERIMENTS,
        DATASETS,
        PROMPTS,
        PLAYGROUNDS,
        EXPERIMENT,
        DATASET,
        _UNKNOWN,
    }

    fun value(): Value =
        when (this) {
            PROJECTS -> Value.PROJECTS
            LOGS -> Value.LOGS
            EXPERIMENTS -> Value.EXPERIMENTS
            DATASETS -> Value.DATASETS
            PROMPTS -> Value.PROMPTS
            PLAYGROUNDS -> Value.PLAYGROUNDS
            EXPERIMENT -> Value.EXPERIMENT
            DATASET -> Value.DATASET
            else -> Value._UNKNOWN
        }

    fun known(): Known =
        when (this) {
            PROJECTS -> Known.PROJECTS
            LOGS -> Known.LOGS
            EXPERIMENTS -> Known.EXPERIMENTS
            DATASETS -> Known.DATASETS
            PROMPTS -> Known.PROMPTS
            PLAYGROUNDS -> Known.PLAYGROUNDS
            EXPERIMENT -> Known.EXPERIMENT
            DATASET -> Known.DATASET
            else -> throw BraintrustInvalidDataException("Unknown ViewType: $value")
        }

    fun asString(): String = _value().asStringOrThrow()
}
