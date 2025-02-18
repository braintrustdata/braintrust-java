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

/** Summary of an experiment */
@NoAutoDetect
class SummarizeExperimentResponse
@JsonCreator
private constructor(
    @JsonProperty("experiment_name")
    @ExcludeMissing
    private val experimentName: JsonField<String> = JsonMissing.of(),
    @JsonProperty("experiment_url")
    @ExcludeMissing
    private val experimentUrl: JsonField<String> = JsonMissing.of(),
    @JsonProperty("project_name")
    @ExcludeMissing
    private val projectName: JsonField<String> = JsonMissing.of(),
    @JsonProperty("project_url")
    @ExcludeMissing
    private val projectUrl: JsonField<String> = JsonMissing.of(),
    @JsonProperty("comparison_experiment_name")
    @ExcludeMissing
    private val comparisonExperimentName: JsonField<String> = JsonMissing.of(),
    @JsonProperty("metrics")
    @ExcludeMissing
    private val metrics: JsonField<Metrics> = JsonMissing.of(),
    @JsonProperty("scores")
    @ExcludeMissing
    private val scores: JsonField<Scores> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** Name of the experiment */
    fun experimentName(): String = experimentName.getRequired("experiment_name")

    /** URL to the experiment's page in the Braintrust app */
    fun experimentUrl(): String = experimentUrl.getRequired("experiment_url")

    /** Name of the project that the experiment belongs to */
    fun projectName(): String = projectName.getRequired("project_name")

    /** URL to the project's page in the Braintrust app */
    fun projectUrl(): String = projectUrl.getRequired("project_url")

    /** The experiment which scores are baselined against */
    fun comparisonExperimentName(): Optional<String> =
        Optional.ofNullable(comparisonExperimentName.getNullable("comparison_experiment_name"))

    /** Summary of the experiment's metrics */
    fun metrics(): Optional<Metrics> = Optional.ofNullable(metrics.getNullable("metrics"))

    /** Summary of the experiment's scores */
    fun scores(): Optional<Scores> = Optional.ofNullable(scores.getNullable("scores"))

    /** Name of the experiment */
    @JsonProperty("experiment_name")
    @ExcludeMissing
    fun _experimentName(): JsonField<String> = experimentName

    /** URL to the experiment's page in the Braintrust app */
    @JsonProperty("experiment_url")
    @ExcludeMissing
    fun _experimentUrl(): JsonField<String> = experimentUrl

    /** Name of the project that the experiment belongs to */
    @JsonProperty("project_name")
    @ExcludeMissing
    fun _projectName(): JsonField<String> = projectName

    /** URL to the project's page in the Braintrust app */
    @JsonProperty("project_url") @ExcludeMissing fun _projectUrl(): JsonField<String> = projectUrl

    /** The experiment which scores are baselined against */
    @JsonProperty("comparison_experiment_name")
    @ExcludeMissing
    fun _comparisonExperimentName(): JsonField<String> = comparisonExperimentName

    /** Summary of the experiment's metrics */
    @JsonProperty("metrics") @ExcludeMissing fun _metrics(): JsonField<Metrics> = metrics

    /** Summary of the experiment's scores */
    @JsonProperty("scores") @ExcludeMissing fun _scores(): JsonField<Scores> = scores

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

    fun toBuilder() = Builder().from(this)

    companion object {

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

        /** Name of the experiment */
        fun experimentName(experimentName: JsonField<String>) = apply {
            this.experimentName = experimentName
        }

        /** URL to the experiment's page in the Braintrust app */
        fun experimentUrl(experimentUrl: String) = experimentUrl(JsonField.of(experimentUrl))

        /** URL to the experiment's page in the Braintrust app */
        fun experimentUrl(experimentUrl: JsonField<String>) = apply {
            this.experimentUrl = experimentUrl
        }

        /** Name of the project that the experiment belongs to */
        fun projectName(projectName: String) = projectName(JsonField.of(projectName))

        /** Name of the project that the experiment belongs to */
        fun projectName(projectName: JsonField<String>) = apply { this.projectName = projectName }

        /** URL to the project's page in the Braintrust app */
        fun projectUrl(projectUrl: String) = projectUrl(JsonField.of(projectUrl))

        /** URL to the project's page in the Braintrust app */
        fun projectUrl(projectUrl: JsonField<String>) = apply { this.projectUrl = projectUrl }

        /** The experiment which scores are baselined against */
        fun comparisonExperimentName(comparisonExperimentName: String?) =
            comparisonExperimentName(JsonField.ofNullable(comparisonExperimentName))

        /** The experiment which scores are baselined against */
        fun comparisonExperimentName(comparisonExperimentName: Optional<String>) =
            comparisonExperimentName(comparisonExperimentName.orElse(null))

        /** The experiment which scores are baselined against */
        fun comparisonExperimentName(comparisonExperimentName: JsonField<String>) = apply {
            this.comparisonExperimentName = comparisonExperimentName
        }

        /** Summary of the experiment's metrics */
        fun metrics(metrics: Metrics?) = metrics(JsonField.ofNullable(metrics))

        /** Summary of the experiment's metrics */
        fun metrics(metrics: Optional<Metrics>) = metrics(metrics.orElse(null))

        /** Summary of the experiment's metrics */
        fun metrics(metrics: JsonField<Metrics>) = apply { this.metrics = metrics }

        /** Summary of the experiment's scores */
        fun scores(scores: Scores?) = scores(JsonField.ofNullable(scores))

        /** Summary of the experiment's scores */
        fun scores(scores: Optional<Scores>) = scores(scores.orElse(null))

        /** Summary of the experiment's scores */
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

        fun build(): SummarizeExperimentResponse =
            SummarizeExperimentResponse(
                checkRequired("experimentName", experimentName),
                checkRequired("experimentUrl", experimentUrl),
                checkRequired("projectName", projectName),
                checkRequired("projectUrl", projectUrl),
                comparisonExperimentName,
                metrics,
                scores,
                additionalProperties.toImmutable(),
            )
    }

    /** Summary of the experiment's metrics */
    @NoAutoDetect
    class Metrics
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Metrics = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

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
    @NoAutoDetect
    class Scores
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Scores = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

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

        return /* spotless:off */ other is SummarizeExperimentResponse && experimentName == other.experimentName && experimentUrl == other.experimentUrl && projectName == other.projectName && projectUrl == other.projectUrl && comparisonExperimentName == other.comparisonExperimentName && metrics == other.metrics && scores == other.scores && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(experimentName, experimentUrl, projectName, projectUrl, comparisonExperimentName, metrics, scores, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SummarizeExperimentResponse{experimentName=$experimentName, experimentUrl=$experimentUrl, projectName=$projectName, projectUrl=$projectUrl, comparisonExperimentName=$comparisonExperimentName, metrics=$metrics, scores=$scores, additionalProperties=$additionalProperties}"
}
