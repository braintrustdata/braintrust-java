// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.checkRequired
import com.braintrustdata.api.core.immutableEmptyMap
import com.braintrustdata.api.core.toImmutable
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Objects
import java.util.Optional

/** Summary of a score's performance */
@NoAutoDetect
class ScoreSummary
@JsonCreator
private constructor(
    @JsonProperty("improvements")
    @ExcludeMissing
    private val improvements: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
    @JsonProperty("regressions")
    @ExcludeMissing
    private val regressions: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("score") @ExcludeMissing private val score: JsonField<Double> = JsonMissing.of(),
    @JsonProperty("diff") @ExcludeMissing private val diff: JsonField<Double> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** Number of improvements in the score */
    fun improvements(): Long = improvements.getRequired("improvements")

    /** Name of the score */
    fun name(): String = name.getRequired("name")

    /** Number of regressions in the score */
    fun regressions(): Long = regressions.getRequired("regressions")

    /** Average score across all examples */
    fun score(): Double = score.getRequired("score")

    /** Difference in score between the current and comparison experiment */
    fun diff(): Optional<Double> = Optional.ofNullable(diff.getNullable("diff"))

    /** Number of improvements in the score */
    @JsonProperty("improvements")
    @ExcludeMissing
    fun _improvements(): JsonField<Long> = improvements

    /** Name of the score */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /** Number of regressions in the score */
    @JsonProperty("regressions") @ExcludeMissing fun _regressions(): JsonField<Long> = regressions

    /** Average score across all examples */
    @JsonProperty("score") @ExcludeMissing fun _score(): JsonField<Double> = score

    /** Difference in score between the current and comparison experiment */
    @JsonProperty("diff") @ExcludeMissing fun _diff(): JsonField<Double> = diff

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): ScoreSummary = apply {
        if (validated) {
            return@apply
        }

        improvements()
        name()
        regressions()
        score()
        diff()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ScoreSummary]. */
    class Builder internal constructor() {

        private var improvements: JsonField<Long>? = null
        private var name: JsonField<String>? = null
        private var regressions: JsonField<Long>? = null
        private var score: JsonField<Double>? = null
        private var diff: JsonField<Double> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(scoreSummary: ScoreSummary) = apply {
            improvements = scoreSummary.improvements
            name = scoreSummary.name
            regressions = scoreSummary.regressions
            score = scoreSummary.score
            diff = scoreSummary.diff
            additionalProperties = scoreSummary.additionalProperties.toMutableMap()
        }

        /** Number of improvements in the score */
        fun improvements(improvements: Long) = improvements(JsonField.of(improvements))

        /** Number of improvements in the score */
        fun improvements(improvements: JsonField<Long>) = apply { this.improvements = improvements }

        /** Name of the score */
        fun name(name: String) = name(JsonField.of(name))

        /** Name of the score */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Number of regressions in the score */
        fun regressions(regressions: Long) = regressions(JsonField.of(regressions))

        /** Number of regressions in the score */
        fun regressions(regressions: JsonField<Long>) = apply { this.regressions = regressions }

        /** Average score across all examples */
        fun score(score: Double) = score(JsonField.of(score))

        /** Average score across all examples */
        fun score(score: JsonField<Double>) = apply { this.score = score }

        /** Difference in score between the current and comparison experiment */
        fun diff(diff: Double) = diff(JsonField.of(diff))

        /** Difference in score between the current and comparison experiment */
        fun diff(diff: JsonField<Double>) = apply { this.diff = diff }

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

        fun build(): ScoreSummary =
            ScoreSummary(
                checkRequired("improvements", improvements),
                checkRequired("name", name),
                checkRequired("regressions", regressions),
                checkRequired("score", score),
                diff,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ScoreSummary && improvements == other.improvements && name == other.name && regressions == other.regressions && score == other.score && diff == other.diff && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(improvements, name, regressions, score, diff, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ScoreSummary{improvements=$improvements, name=$name, regressions=$regressions, score=$score, diff=$diff, additionalProperties=$additionalProperties}"
}
