// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.toUnmodifiable
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import java.util.Objects
import java.util.Optional

/** Summary of a metric's performance */
@JsonDeserialize(builder = MetricSummary.Builder::class)
@NoAutoDetect
class MetricSummary
private constructor(
    private val name: JsonField<String>,
    private val metric: JsonField<Double>,
    private val unit: JsonField<String>,
    private val diff: JsonField<Double>,
    private val improvements: JsonField<Long>,
    private val regressions: JsonField<Long>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /** Name of the metric */
    fun name(): String = name.getRequired("name")

    /** Average metric across all examples */
    fun metric(): Double = metric.getRequired("metric")

    /** Unit label for the metric */
    fun unit(): String = unit.getRequired("unit")

    /** Difference in metric between the current and comparison experiment */
    fun diff(): Optional<Double> = Optional.ofNullable(diff.getNullable("diff"))

    /** Number of improvements in the metric */
    fun improvements(): Long = improvements.getRequired("improvements")

    /** Number of regressions in the metric */
    fun regressions(): Long = regressions.getRequired("regressions")

    /** Name of the metric */
    @JsonProperty("name") @ExcludeMissing fun _name() = name

    /** Average metric across all examples */
    @JsonProperty("metric") @ExcludeMissing fun _metric() = metric

    /** Unit label for the metric */
    @JsonProperty("unit") @ExcludeMissing fun _unit() = unit

    /** Difference in metric between the current and comparison experiment */
    @JsonProperty("diff") @ExcludeMissing fun _diff() = diff

    /** Number of improvements in the metric */
    @JsonProperty("improvements") @ExcludeMissing fun _improvements() = improvements

    /** Number of regressions in the metric */
    @JsonProperty("regressions") @ExcludeMissing fun _regressions() = regressions

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): MetricSummary = apply {
        if (!validated) {
            name()
            metric()
            unit()
            diff()
            improvements()
            regressions()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var name: JsonField<String> = JsonMissing.of()
        private var metric: JsonField<Double> = JsonMissing.of()
        private var unit: JsonField<String> = JsonMissing.of()
        private var diff: JsonField<Double> = JsonMissing.of()
        private var improvements: JsonField<Long> = JsonMissing.of()
        private var regressions: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(metricSummary: MetricSummary) = apply {
            this.name = metricSummary.name
            this.metric = metricSummary.metric
            this.unit = metricSummary.unit
            this.diff = metricSummary.diff
            this.improvements = metricSummary.improvements
            this.regressions = metricSummary.regressions
            additionalProperties(metricSummary.additionalProperties)
        }

        /** Name of the metric */
        fun name(name: String) = name(JsonField.of(name))

        /** Name of the metric */
        @JsonProperty("name")
        @ExcludeMissing
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Average metric across all examples */
        fun metric(metric: Double) = metric(JsonField.of(metric))

        /** Average metric across all examples */
        @JsonProperty("metric")
        @ExcludeMissing
        fun metric(metric: JsonField<Double>) = apply { this.metric = metric }

        /** Unit label for the metric */
        fun unit(unit: String) = unit(JsonField.of(unit))

        /** Unit label for the metric */
        @JsonProperty("unit")
        @ExcludeMissing
        fun unit(unit: JsonField<String>) = apply { this.unit = unit }

        /** Difference in metric between the current and comparison experiment */
        fun diff(diff: Double) = diff(JsonField.of(diff))

        /** Difference in metric between the current and comparison experiment */
        @JsonProperty("diff")
        @ExcludeMissing
        fun diff(diff: JsonField<Double>) = apply { this.diff = diff }

        /** Number of improvements in the metric */
        fun improvements(improvements: Long) = improvements(JsonField.of(improvements))

        /** Number of improvements in the metric */
        @JsonProperty("improvements")
        @ExcludeMissing
        fun improvements(improvements: JsonField<Long>) = apply { this.improvements = improvements }

        /** Number of regressions in the metric */
        fun regressions(regressions: Long) = regressions(JsonField.of(regressions))

        /** Number of regressions in the metric */
        @JsonProperty("regressions")
        @ExcludeMissing
        fun regressions(regressions: JsonField<Long>) = apply { this.regressions = regressions }

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

        fun build(): MetricSummary =
            MetricSummary(
                name,
                metric,
                unit,
                diff,
                improvements,
                regressions,
                additionalProperties.toUnmodifiable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is MetricSummary && this.name == other.name && this.metric == other.metric && this.unit == other.unit && this.diff == other.diff && this.improvements == other.improvements && this.regressions == other.regressions && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(name, metric, unit, diff, improvements, regressions, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() =
        "MetricSummary{name=$name, metric=$metric, unit=$unit, diff=$diff, improvements=$improvements, regressions=$regressions, additionalProperties=$additionalProperties}"
}
