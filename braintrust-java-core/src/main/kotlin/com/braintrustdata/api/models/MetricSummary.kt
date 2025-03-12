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

/** Summary of a metric's performance */
@NoAutoDetect
class MetricSummary @JsonCreator private constructor(
    @JsonProperty("improvements") @ExcludeMissing private val improvements: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("metric") @ExcludeMissing private val metric: JsonField<Double> = JsonMissing.of(),
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
    @JsonProperty("regressions") @ExcludeMissing private val regressions: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("unit") @ExcludeMissing private val unit: JsonField<String> = JsonMissing.of(),
    @JsonProperty("diff") @ExcludeMissing private val diff: JsonField<Double> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),

) {

    /** Number of improvements in the metric */
    fun improvements(): Long = improvements.getRequired("improvements")

    /** Average metric across all examples */
    fun metric(): Double = metric.getRequired("metric")

    /** Name of the metric */
    fun name(): String = name.getRequired("name")

    /** Number of regressions in the metric */
    fun regressions(): Long = regressions.getRequired("regressions")

    /** Unit label for the metric */
    fun unit(): String = unit.getRequired("unit")

    /** Difference in metric between the current and comparison experiment */
    fun diff(): Optional<Double> = Optional.ofNullable(diff.getNullable("diff"))

    /** Number of improvements in the metric */
    @JsonProperty("improvements")
    @ExcludeMissing
    fun _improvements(): JsonField<Long> = improvements

    /** Average metric across all examples */
    @JsonProperty("metric")
    @ExcludeMissing
    fun _metric(): JsonField<Double> = metric

    /** Name of the metric */
    @JsonProperty("name")
    @ExcludeMissing
    fun _name(): JsonField<String> = name

    /** Number of regressions in the metric */
    @JsonProperty("regressions")
    @ExcludeMissing
    fun _regressions(): JsonField<Long> = regressions

    /** Unit label for the metric */
    @JsonProperty("unit")
    @ExcludeMissing
    fun _unit(): JsonField<String> = unit

    /** Difference in metric between the current and comparison experiment */
    @JsonProperty("diff")
    @ExcludeMissing
    fun _diff(): JsonField<Double> = diff

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): MetricSummary =
        apply {
            if (validated) {
              return@apply
            }

            improvements()
            metric()
            name()
            regressions()
            unit()
            diff()
            validated = true
        }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [MetricSummary].
         *
         * The following fields are required:
         *
         * ```java
         * .improvements()
         * .metric()
         * .name()
         * .regressions()
         * .unit()
         * ```
         */
        @JvmStatic
        fun builder() = Builder()
    }

    /** A builder for [MetricSummary]. */
    class Builder internal constructor() {

        private var improvements: JsonField<Long>? = null
        private var metric: JsonField<Double>? = null
        private var name: JsonField<String>? = null
        private var regressions: JsonField<Long>? = null
        private var unit: JsonField<String>? = null
        private var diff: JsonField<Double> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(metricSummary: MetricSummary) =
            apply {
                improvements = metricSummary.improvements
                metric = metricSummary.metric
                name = metricSummary.name
                regressions = metricSummary.regressions
                unit = metricSummary.unit
                diff = metricSummary.diff
                additionalProperties = metricSummary.additionalProperties.toMutableMap()
            }

        /** Number of improvements in the metric */
        fun improvements(improvements: Long) = improvements(JsonField.of(improvements))

        /** Number of improvements in the metric */
        fun improvements(improvements: JsonField<Long>) =
            apply {
                this.improvements = improvements
            }

        /** Average metric across all examples */
        fun metric(metric: Double) = metric(JsonField.of(metric))

        /** Average metric across all examples */
        fun metric(metric: JsonField<Double>) =
            apply {
                this.metric = metric
            }

        /** Name of the metric */
        fun name(name: String) = name(JsonField.of(name))

        /** Name of the metric */
        fun name(name: JsonField<String>) =
            apply {
                this.name = name
            }

        /** Number of regressions in the metric */
        fun regressions(regressions: Long) = regressions(JsonField.of(regressions))

        /** Number of regressions in the metric */
        fun regressions(regressions: JsonField<Long>) =
            apply {
                this.regressions = regressions
            }

        /** Unit label for the metric */
        fun unit(unit: String) = unit(JsonField.of(unit))

        /** Unit label for the metric */
        fun unit(unit: JsonField<String>) =
            apply {
                this.unit = unit
            }

        /** Difference in metric between the current and comparison experiment */
        fun diff(diff: Double) = diff(JsonField.of(diff))

        /** Difference in metric between the current and comparison experiment */
        fun diff(diff: JsonField<Double>) =
            apply {
                this.diff = diff
            }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
            apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

        fun putAdditionalProperty(key: String, value: JsonValue) =
            apply {
                additionalProperties.put(key, value)
            }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
            apply {
                this.additionalProperties.putAll(additionalProperties)
            }

        fun removeAdditionalProperty(key: String) =
            apply {
                additionalProperties.remove(key)
            }

        fun removeAllAdditionalProperties(keys: Set<String>) =
            apply {
                keys.forEach(::removeAdditionalProperty)
            }

        fun build(): MetricSummary =
            MetricSummary(
              checkRequired(
                "improvements", improvements
              ),
              checkRequired(
                "metric", metric
              ),
              checkRequired(
                "name", name
              ),
              checkRequired(
                "regressions", regressions
              ),
              checkRequired(
                "unit", unit
              ),
              diff,
              additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return /* spotless:off */ other is MetricSummary && improvements == other.improvements && metric == other.metric && name == other.name && regressions == other.regressions && unit == other.unit && diff == other.diff && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(improvements, metric, name, regressions, unit, diff, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() = "MetricSummary{improvements=$improvements, metric=$metric, name=$name, regressions=$regressions, unit=$unit, diff=$diff, additionalProperties=$additionalProperties}"
}
