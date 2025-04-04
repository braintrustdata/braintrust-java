// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.checkRequired
import com.braintrustdata.api.errors.BraintrustInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional

/** Summary of a metric's performance */
class MetricSummary
private constructor(
    private val improvements: JsonField<Long>,
    private val metric: JsonField<Double>,
    private val name: JsonField<String>,
    private val regressions: JsonField<Long>,
    private val unit: JsonField<String>,
    private val diff: JsonField<Double>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("improvements")
        @ExcludeMissing
        improvements: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("metric") @ExcludeMissing metric: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("regressions")
        @ExcludeMissing
        regressions: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("unit") @ExcludeMissing unit: JsonField<String> = JsonMissing.of(),
        @JsonProperty("diff") @ExcludeMissing diff: JsonField<Double> = JsonMissing.of(),
    ) : this(improvements, metric, name, regressions, unit, diff, mutableMapOf())

    /**
     * Number of improvements in the metric
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun improvements(): Long = improvements.getRequired("improvements")

    /**
     * Average metric across all examples
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun metric(): Double = metric.getRequired("metric")

    /**
     * Name of the metric
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * Number of regressions in the metric
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun regressions(): Long = regressions.getRequired("regressions")

    /**
     * Unit label for the metric
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun unit(): String = unit.getRequired("unit")

    /**
     * Difference in metric between the current and comparison experiment
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun diff(): Optional<Double> = diff.getOptional("diff")

    /**
     * Returns the raw JSON value of [improvements].
     *
     * Unlike [improvements], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("improvements")
    @ExcludeMissing
    fun _improvements(): JsonField<Long> = improvements

    /**
     * Returns the raw JSON value of [metric].
     *
     * Unlike [metric], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("metric") @ExcludeMissing fun _metric(): JsonField<Double> = metric

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [regressions].
     *
     * Unlike [regressions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("regressions") @ExcludeMissing fun _regressions(): JsonField<Long> = regressions

    /**
     * Returns the raw JSON value of [unit].
     *
     * Unlike [unit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("unit") @ExcludeMissing fun _unit(): JsonField<String> = unit

    /**
     * Returns the raw JSON value of [diff].
     *
     * Unlike [diff], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("diff") @ExcludeMissing fun _diff(): JsonField<Double> = diff

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [MetricSummary].
         *
         * The following fields are required:
         * ```java
         * .improvements()
         * .metric()
         * .name()
         * .regressions()
         * .unit()
         * ```
         */
        @JvmStatic fun builder() = Builder()
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
        internal fun from(metricSummary: MetricSummary) = apply {
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

        /**
         * Sets [Builder.improvements] to an arbitrary JSON value.
         *
         * You should usually call [Builder.improvements] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun improvements(improvements: JsonField<Long>) = apply { this.improvements = improvements }

        /** Average metric across all examples */
        fun metric(metric: Double) = metric(JsonField.of(metric))

        /**
         * Sets [Builder.metric] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metric] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun metric(metric: JsonField<Double>) = apply { this.metric = metric }

        /** Name of the metric */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Number of regressions in the metric */
        fun regressions(regressions: Long) = regressions(JsonField.of(regressions))

        /**
         * Sets [Builder.regressions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.regressions] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun regressions(regressions: JsonField<Long>) = apply { this.regressions = regressions }

        /** Unit label for the metric */
        fun unit(unit: String) = unit(JsonField.of(unit))

        /**
         * Sets [Builder.unit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.unit] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun unit(unit: JsonField<String>) = apply { this.unit = unit }

        /** Difference in metric between the current and comparison experiment */
        fun diff(diff: Double) = diff(JsonField.of(diff))

        /**
         * Sets [Builder.diff] to an arbitrary JSON value.
         *
         * You should usually call [Builder.diff] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
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

        /**
         * Returns an immutable instance of [MetricSummary].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .improvements()
         * .metric()
         * .name()
         * .regressions()
         * .unit()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MetricSummary =
            MetricSummary(
                checkRequired("improvements", improvements),
                checkRequired("metric", metric),
                checkRequired("name", name),
                checkRequired("regressions", regressions),
                checkRequired("unit", unit),
                diff,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): MetricSummary = apply {
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
    @JvmSynthetic
    internal fun validity(): Int =
        (if (improvements.asKnown().isPresent) 1 else 0) +
            (if (metric.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (regressions.asKnown().isPresent) 1 else 0) +
            (if (unit.asKnown().isPresent) 1 else 0) +
            (if (diff.asKnown().isPresent) 1 else 0)

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

    override fun toString() =
        "MetricSummary{improvements=$improvements, metric=$metric, name=$name, regressions=$regressions, unit=$unit, diff=$diff, additionalProperties=$additionalProperties}"
}
