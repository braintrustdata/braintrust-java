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

/** Summary of a dataset */
@JsonDeserialize(builder = SummarizeDatasetResponse.Builder::class)
@NoAutoDetect
class SummarizeDatasetResponse
private constructor(
    private val projectName: JsonField<String>,
    private val datasetName: JsonField<String>,
    private val projectUrl: JsonField<String>,
    private val datasetUrl: JsonField<String>,
    private val dataSummary: JsonField<DataSummary>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /** Name of the project that the dataset belongs to */
    fun projectName(): String = projectName.getRequired("project_name")

    /** Name of the dataset */
    fun datasetName(): String = datasetName.getRequired("dataset_name")

    /** URL to the project's page in the Braintrust app */
    fun projectUrl(): String = projectUrl.getRequired("project_url")

    /** URL to the dataset's page in the Braintrust app */
    fun datasetUrl(): String = datasetUrl.getRequired("dataset_url")

    /** Summary of a dataset's data */
    fun dataSummary(): Optional<DataSummary> =
        Optional.ofNullable(dataSummary.getNullable("data_summary"))

    /** Name of the project that the dataset belongs to */
    @JsonProperty("project_name") @ExcludeMissing fun _projectName() = projectName

    /** Name of the dataset */
    @JsonProperty("dataset_name") @ExcludeMissing fun _datasetName() = datasetName

    /** URL to the project's page in the Braintrust app */
    @JsonProperty("project_url") @ExcludeMissing fun _projectUrl() = projectUrl

    /** URL to the dataset's page in the Braintrust app */
    @JsonProperty("dataset_url") @ExcludeMissing fun _datasetUrl() = datasetUrl

    /** Summary of a dataset's data */
    @JsonProperty("data_summary") @ExcludeMissing fun _dataSummary() = dataSummary

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): SummarizeDatasetResponse = apply {
        if (!validated) {
            projectName()
            datasetName()
            projectUrl()
            datasetUrl()
            dataSummary().map { it.validate() }
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var projectName: JsonField<String> = JsonMissing.of()
        private var datasetName: JsonField<String> = JsonMissing.of()
        private var projectUrl: JsonField<String> = JsonMissing.of()
        private var datasetUrl: JsonField<String> = JsonMissing.of()
        private var dataSummary: JsonField<DataSummary> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(summarizeDatasetResponse: SummarizeDatasetResponse) = apply {
            this.projectName = summarizeDatasetResponse.projectName
            this.datasetName = summarizeDatasetResponse.datasetName
            this.projectUrl = summarizeDatasetResponse.projectUrl
            this.datasetUrl = summarizeDatasetResponse.datasetUrl
            this.dataSummary = summarizeDatasetResponse.dataSummary
            additionalProperties(summarizeDatasetResponse.additionalProperties)
        }

        /** Name of the project that the dataset belongs to */
        fun projectName(projectName: String) = projectName(JsonField.of(projectName))

        /** Name of the project that the dataset belongs to */
        @JsonProperty("project_name")
        @ExcludeMissing
        fun projectName(projectName: JsonField<String>) = apply { this.projectName = projectName }

        /** Name of the dataset */
        fun datasetName(datasetName: String) = datasetName(JsonField.of(datasetName))

        /** Name of the dataset */
        @JsonProperty("dataset_name")
        @ExcludeMissing
        fun datasetName(datasetName: JsonField<String>) = apply { this.datasetName = datasetName }

        /** URL to the project's page in the Braintrust app */
        fun projectUrl(projectUrl: String) = projectUrl(JsonField.of(projectUrl))

        /** URL to the project's page in the Braintrust app */
        @JsonProperty("project_url")
        @ExcludeMissing
        fun projectUrl(projectUrl: JsonField<String>) = apply { this.projectUrl = projectUrl }

        /** URL to the dataset's page in the Braintrust app */
        fun datasetUrl(datasetUrl: String) = datasetUrl(JsonField.of(datasetUrl))

        /** URL to the dataset's page in the Braintrust app */
        @JsonProperty("dataset_url")
        @ExcludeMissing
        fun datasetUrl(datasetUrl: JsonField<String>) = apply { this.datasetUrl = datasetUrl }

        /** Summary of a dataset's data */
        fun dataSummary(dataSummary: DataSummary) = dataSummary(JsonField.of(dataSummary))

        /** Summary of a dataset's data */
        @JsonProperty("data_summary")
        @ExcludeMissing
        fun dataSummary(dataSummary: JsonField<DataSummary>) = apply {
            this.dataSummary = dataSummary
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

        fun build(): SummarizeDatasetResponse =
            SummarizeDatasetResponse(
                projectName,
                datasetName,
                projectUrl,
                datasetUrl,
                dataSummary,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SummarizeDatasetResponse && this.projectName == other.projectName && this.datasetName == other.datasetName && this.projectUrl == other.projectUrl && this.datasetUrl == other.datasetUrl && this.dataSummary == other.dataSummary && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(projectName, datasetName, projectUrl, datasetUrl, dataSummary, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() =
        "SummarizeDatasetResponse{projectName=$projectName, datasetName=$datasetName, projectUrl=$projectUrl, datasetUrl=$datasetUrl, dataSummary=$dataSummary, additionalProperties=$additionalProperties}"
}
