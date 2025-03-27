// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.checkRequired
import com.braintrustdata.api.core.toImmutable
import com.braintrustdata.api.errors.BraintrustInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Summary of an experiment */
class SummarizeExperimentResponse
private constructor(
    private val experimentName: JsonField<String>,
    private val experimentUrl: JsonField<String>,
    private val projectName: JsonField<String>,
    private val projectUrl: JsonField<String>,
    private val comparisonExperimentName: JsonField<String>,
    private val metrics: JsonField<Metrics>,
    private val scores: JsonField<Scores>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("experiment_name")
        @ExcludeMissing
        experimentName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("experiment_url")
        @ExcludeMissing
        experimentUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("project_name")
        @ExcludeMissing
        projectName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("project_url")
        @ExcludeMissing
        projectUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("comparison_experiment_name")
        @ExcludeMissing
        comparisonExperimentName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("metrics") @ExcludeMissing metrics: JsonField<Metrics> = JsonMissing.of(),
        @JsonProperty("scores") @ExcludeMissing scores: JsonField<Scores> = JsonMissing.of(),
    ) : this(
        experimentName,
        experimentUrl,
        projectName,
        projectUrl,
        comparisonExperimentName,
        metrics,
        scores,
        mutableMapOf(),
    )

    /**
     * Name of the experiment
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun experimentName(): String = experimentName.getRequired("experiment_name")

    /**
     * URL to the experiment's page in the Braintrust app
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun experimentUrl(): String = experimentUrl.getRequired("experiment_url")

    /**
     * Name of the project that the experiment belongs to
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun projectName(): String = projectName.getRequired("project_name")

    /**
     * URL to the project's page in the Braintrust app
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun projectUrl(): String = projectUrl.getRequired("project_url")

    /**
     * The experiment which scores are baselined against
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun comparisonExperimentName(): Optional<String> =
        Optional.ofNullable(comparisonExperimentName.getNullable("comparison_experiment_name"))

    /**
     * Summary of the experiment's metrics
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun metrics(): Optional<Metrics> = Optional.ofNullable(metrics.getNullable("metrics"))

    /**
     * Summary of the experiment's scores
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun scores(): Optional<Scores> = Optional.ofNullable(scores.getNullable("scores"))

    /**
     * Returns the raw JSON value of [experimentName].
     *
     * Unlike [experimentName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("experiment_name")
    @ExcludeMissing
    fun _experimentName(): JsonField<String> = experimentName

    /**
     * Returns the raw JSON value of [experimentUrl].
     *
     * Unlike [experimentUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("experiment_url")
    @ExcludeMissing
    fun _experimentUrl(): JsonField<String> = experimentUrl

    /**
     * Returns the raw JSON value of [projectName].
     *
     * Unlike [projectName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("project_name")
    @ExcludeMissing
    fun _projectName(): JsonField<String> = projectName

    /**
     * Returns the raw JSON value of [projectUrl].
     *
     * Unlike [projectUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("project_url") @ExcludeMissing fun _projectUrl(): JsonField<String> = projectUrl

    /**
     * Returns the raw JSON value of [comparisonExperimentName].
     *
     * Unlike [comparisonExperimentName], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("comparison_experiment_name")
    @ExcludeMissing
    fun _comparisonExperimentName(): JsonField<String> = comparisonExperimentName

    /**
     * Returns the raw JSON value of [metrics].
     *
     * Unlike [metrics], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("metrics") @ExcludeMissing fun _metrics(): JsonField<Metrics> = metrics

    /**
     * Returns the raw JSON value of [scores].
     *
     * Unlike [scores], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("scores") @ExcludeMissing fun _scores(): JsonField<Scores> = scores

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
         * Returns a mutable builder for constructing an instance of [SummarizeExperimentResponse].
         *
         * The following fields are required:
         * ```java
         * .experimentName()
         * .experimentUrl()
         * .projectName()
         * .projectUrl()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SummarizeExperimentResponse]. */
    class Builder internal constructor() {

        private var experimentName: JsonField<String>? = null
        private var experimentUrl: JsonField<String>? = null
        private var projectName: JsonField<String>? = null
        private var projectUrl: JsonField<String>? = null
        private var comparisonExperimentName: JsonField<String> = JsonMissing.of()
        private var metrics: JsonField<Metrics> = JsonMissing.of()
        private var scores: JsonField<Scores> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(summarizeExperimentResponse: SummarizeExperimentResponse) = apply {
            experimentName = summarizeExperimentResponse.experimentName
            experimentUrl = summarizeExperimentResponse.experimentUrl
            projectName = summarizeExperimentResponse.projectName
            projectUrl = summarizeExperimentResponse.projectUrl
            comparisonExperimentName = summarizeExperimentResponse.comparisonExperimentName
            metrics = summarizeExperimentResponse.metrics
            scores = summarizeExperimentResponse.scores
            additionalProperties = summarizeExperimentResponse.additionalProperties.toMutableMap()
        }

        /** Name of the experiment */
        fun experimentName(experimentName: String) = experimentName(JsonField.of(experimentName))

        /**
         * Sets [Builder.experimentName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.experimentName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun experimentName(experimentName: JsonField<String>) = apply {
            this.experimentName = experimentName
        }

        /** URL to the experiment's page in the Braintrust app */
        fun experimentUrl(experimentUrl: String) = experimentUrl(JsonField.of(experimentUrl))

        /**
         * Sets [Builder.experimentUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.experimentUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun experimentUrl(experimentUrl: JsonField<String>) = apply {
            this.experimentUrl = experimentUrl
        }

        /** Name of the project that the experiment belongs to */
        fun projectName(projectName: String) = projectName(JsonField.of(projectName))

        /**
         * Sets [Builder.projectName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.projectName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun projectName(projectName: JsonField<String>) = apply { this.projectName = projectName }

        /** URL to the project's page in the Braintrust app */
        fun projectUrl(projectUrl: String) = projectUrl(JsonField.of(projectUrl))

        /**
         * Sets [Builder.projectUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.projectUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun projectUrl(projectUrl: JsonField<String>) = apply { this.projectUrl = projectUrl }

        /** The experiment which scores are baselined against */
        fun comparisonExperimentName(comparisonExperimentName: String?) =
            comparisonExperimentName(JsonField.ofNullable(comparisonExperimentName))

        /**
         * Alias for calling [Builder.comparisonExperimentName] with
         * `comparisonExperimentName.orElse(null)`.
         */
        fun comparisonExperimentName(comparisonExperimentName: Optional<String>) =
            comparisonExperimentName(comparisonExperimentName.getOrNull())

        /**
         * Sets [Builder.comparisonExperimentName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.comparisonExperimentName] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun comparisonExperimentName(comparisonExperimentName: JsonField<String>) = apply {
            this.comparisonExperimentName = comparisonExperimentName
        }

        /** Summary of the experiment's metrics */
        fun metrics(metrics: Metrics?) = metrics(JsonField.ofNullable(metrics))

        /** Alias for calling [Builder.metrics] with `metrics.orElse(null)`. */
        fun metrics(metrics: Optional<Metrics>) = metrics(metrics.getOrNull())

        /**
         * Sets [Builder.metrics] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metrics] with a well-typed [Metrics] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun metrics(metrics: JsonField<Metrics>) = apply { this.metrics = metrics }

        /** Summary of the experiment's scores */
        fun scores(scores: Scores?) = scores(JsonField.ofNullable(scores))

        /** Alias for calling [Builder.scores] with `scores.orElse(null)`. */
        fun scores(scores: Optional<Scores>) = scores(scores.getOrNull())

        /**
         * Sets [Builder.scores] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scores] with a well-typed [Scores] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun scores(scores: JsonField<Scores>) = apply { this.scores = scores }

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
         * Returns an immutable instance of [SummarizeExperimentResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .experimentName()
         * .experimentUrl()
         * .projectName()
         * .projectUrl()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SummarizeExperimentResponse =
            SummarizeExperimentResponse(
                checkRequired("experimentName", experimentName),
                checkRequired("experimentUrl", experimentUrl),
                checkRequired("projectName", projectName),
                checkRequired("projectUrl", projectUrl),
                comparisonExperimentName,
                metrics,
                scores,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SummarizeExperimentResponse = apply {
        if (validated) {
            return@apply
        }

        experimentName()
        experimentUrl()
        projectName()
        projectUrl()
        comparisonExperimentName()
        metrics().ifPresent { it.validate() }
        scores().ifPresent { it.validate() }
        validated = true
    }

    /** Summary of the experiment's metrics */
    class Metrics
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Metrics]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Metrics]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(metrics: Metrics) = apply {
                additionalProperties = metrics.additionalProperties.toMutableMap()
            }

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
             * Returns an immutable instance of [Metrics].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Metrics = Metrics(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Metrics = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Metrics && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Metrics{additionalProperties=$additionalProperties}"
    }

    /** Summary of the experiment's scores */
    class Scores
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Scores]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Scores]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(scores: Scores) = apply {
                additionalProperties = scores.additionalProperties.toMutableMap()
            }

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
             * Returns an immutable instance of [Scores].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Scores = Scores(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Scores = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Scores && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Scores{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SummarizeExperimentResponse && experimentName == other.experimentName && experimentUrl == other.experimentUrl && projectName == other.projectName && projectUrl == other.projectUrl && comparisonExperimentName == other.comparisonExperimentName && metrics == other.metrics && scores == other.scores && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(experimentName, experimentUrl, projectName, projectUrl, comparisonExperimentName, metrics, scores, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SummarizeExperimentResponse{experimentName=$experimentName, experimentUrl=$experimentUrl, projectName=$projectName, projectUrl=$projectUrl, comparisonExperimentName=$comparisonExperimentName, metrics=$metrics, scores=$scores, additionalProperties=$additionalProperties}"
}
