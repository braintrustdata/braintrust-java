// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.toImmutable
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import java.util.Objects
import java.util.Optional

/** Summary of an experiment */
@JsonDeserialize(builder = SummarizeExperimentResponse.Builder::class)
@NoAutoDetect
class SummarizeExperimentResponse
private constructor(
    private val projectName: JsonField<String>,
    private val experimentName: JsonField<String>,
    private val projectUrl: JsonField<String>,
    private val experimentUrl: JsonField<String>,
    private val comparisonExperimentName: JsonField<String>,
    private val scores: JsonField<Scores>,
    private val metrics: JsonField<Metrics>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /** Name of the project that the experiment belongs to */
    fun projectName(): String = projectName.getRequired("project_name")

    /** Name of the experiment */
    fun experimentName(): String = experimentName.getRequired("experiment_name")

    /** URL to the project's page in the Braintrust app */
    fun projectUrl(): String = projectUrl.getRequired("project_url")

    /** URL to the experiment's page in the Braintrust app */
    fun experimentUrl(): String = experimentUrl.getRequired("experiment_url")

    /** The experiment which scores are baselined against */
    fun comparisonExperimentName(): Optional<String> =
        Optional.ofNullable(comparisonExperimentName.getNullable("comparison_experiment_name"))

    /** Summary of the experiment's scores */
    fun scores(): Optional<Scores> = Optional.ofNullable(scores.getNullable("scores"))

    /** Summary of the experiment's metrics */
    fun metrics(): Optional<Metrics> = Optional.ofNullable(metrics.getNullable("metrics"))

    /** Name of the project that the experiment belongs to */
    @JsonProperty("project_name") @ExcludeMissing fun _projectName() = projectName

    /** Name of the experiment */
    @JsonProperty("experiment_name") @ExcludeMissing fun _experimentName() = experimentName

    /** URL to the project's page in the Braintrust app */
    @JsonProperty("project_url") @ExcludeMissing fun _projectUrl() = projectUrl

    /** URL to the experiment's page in the Braintrust app */
    @JsonProperty("experiment_url") @ExcludeMissing fun _experimentUrl() = experimentUrl

    /** The experiment which scores are baselined against */
    @JsonProperty("comparison_experiment_name")
    @ExcludeMissing
    fun _comparisonExperimentName() = comparisonExperimentName

    /** Summary of the experiment's scores */
    @JsonProperty("scores") @ExcludeMissing fun _scores() = scores

    /** Summary of the experiment's metrics */
    @JsonProperty("metrics") @ExcludeMissing fun _metrics() = metrics

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): SummarizeExperimentResponse = apply {
        if (!validated) {
            projectName()
            experimentName()
            projectUrl()
            experimentUrl()
            comparisonExperimentName()
            scores().map { it.validate() }
            metrics().map { it.validate() }
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var projectName: JsonField<String> = JsonMissing.of()
        private var experimentName: JsonField<String> = JsonMissing.of()
        private var projectUrl: JsonField<String> = JsonMissing.of()
        private var experimentUrl: JsonField<String> = JsonMissing.of()
        private var comparisonExperimentName: JsonField<String> = JsonMissing.of()
        private var scores: JsonField<Scores> = JsonMissing.of()
        private var metrics: JsonField<Metrics> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(summarizeExperimentResponse: SummarizeExperimentResponse) = apply {
            this.projectName = summarizeExperimentResponse.projectName
            this.experimentName = summarizeExperimentResponse.experimentName
            this.projectUrl = summarizeExperimentResponse.projectUrl
            this.experimentUrl = summarizeExperimentResponse.experimentUrl
            this.comparisonExperimentName = summarizeExperimentResponse.comparisonExperimentName
            this.scores = summarizeExperimentResponse.scores
            this.metrics = summarizeExperimentResponse.metrics
            additionalProperties(summarizeExperimentResponse.additionalProperties)
        }

        /** Name of the project that the experiment belongs to */
        fun projectName(projectName: String) = projectName(JsonField.of(projectName))

        /** Name of the project that the experiment belongs to */
        @JsonProperty("project_name")
        @ExcludeMissing
        fun projectName(projectName: JsonField<String>) = apply { this.projectName = projectName }

        /** Name of the experiment */
        fun experimentName(experimentName: String) = experimentName(JsonField.of(experimentName))

        /** Name of the experiment */
        @JsonProperty("experiment_name")
        @ExcludeMissing
        fun experimentName(experimentName: JsonField<String>) = apply {
            this.experimentName = experimentName
        }

        /** URL to the project's page in the Braintrust app */
        fun projectUrl(projectUrl: String) = projectUrl(JsonField.of(projectUrl))

        /** URL to the project's page in the Braintrust app */
        @JsonProperty("project_url")
        @ExcludeMissing
        fun projectUrl(projectUrl: JsonField<String>) = apply { this.projectUrl = projectUrl }

        /** URL to the experiment's page in the Braintrust app */
        fun experimentUrl(experimentUrl: String) = experimentUrl(JsonField.of(experimentUrl))

        /** URL to the experiment's page in the Braintrust app */
        @JsonProperty("experiment_url")
        @ExcludeMissing
        fun experimentUrl(experimentUrl: JsonField<String>) = apply {
            this.experimentUrl = experimentUrl
        }

        /** The experiment which scores are baselined against */
        fun comparisonExperimentName(comparisonExperimentName: String) =
            comparisonExperimentName(JsonField.of(comparisonExperimentName))

        /** The experiment which scores are baselined against */
        @JsonProperty("comparison_experiment_name")
        @ExcludeMissing
        fun comparisonExperimentName(comparisonExperimentName: JsonField<String>) = apply {
            this.comparisonExperimentName = comparisonExperimentName
        }

        /** Summary of the experiment's scores */
        fun scores(scores: Scores) = scores(JsonField.of(scores))

        /** Summary of the experiment's scores */
        @JsonProperty("scores")
        @ExcludeMissing
        fun scores(scores: JsonField<Scores>) = apply { this.scores = scores }

        /** Summary of the experiment's metrics */
        fun metrics(metrics: Metrics) = metrics(JsonField.of(metrics))

        /** Summary of the experiment's metrics */
        @JsonProperty("metrics")
        @ExcludeMissing
        fun metrics(metrics: JsonField<Metrics>) = apply { this.metrics = metrics }

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

        fun build(): SummarizeExperimentResponse =
            SummarizeExperimentResponse(
                projectName,
                experimentName,
                projectUrl,
                experimentUrl,
                comparisonExperimentName,
                scores,
                metrics,
                additionalProperties.toImmutable(),
            )
    }

    /** Summary of the experiment's metrics */
    @JsonDeserialize(builder = Metrics.Builder::class)
    @NoAutoDetect
    class Metrics
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Metrics = apply {
            if (!validated) {
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(metrics: Metrics) = apply {
                additionalProperties(metrics.additionalProperties)
            }

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

            fun build(): Metrics = Metrics(additionalProperties.toImmutable())
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
    @JsonDeserialize(builder = Scores.Builder::class)
    @NoAutoDetect
    class Scores
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Scores = apply {
            if (!validated) {
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(scores: Scores) = apply {
                additionalProperties(scores.additionalProperties)
            }

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

            fun build(): Scores = Scores(additionalProperties.toImmutable())
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

        return /* spotless:off */ other is SummarizeExperimentResponse && projectName == other.projectName && experimentName == other.experimentName && projectUrl == other.projectUrl && experimentUrl == other.experimentUrl && comparisonExperimentName == other.comparisonExperimentName && scores == other.scores && metrics == other.metrics && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(projectName, experimentName, projectUrl, experimentUrl, comparisonExperimentName, scores, metrics, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SummarizeExperimentResponse{projectName=$projectName, experimentName=$experimentName, projectUrl=$projectUrl, experimentUrl=$experimentUrl, comparisonExperimentName=$comparisonExperimentName, scores=$scores, metrics=$metrics, additionalProperties=$additionalProperties}"
}
