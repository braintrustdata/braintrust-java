// File generated from our OpenAPI spec by Stainless.

package com.braintrust.api.models

import com.braintrust.api.core.ExcludeMissing
import com.braintrust.api.core.JsonField
import com.braintrust.api.core.JsonMissing
import com.braintrust.api.core.JsonValue
import com.braintrust.api.core.NoAutoDetect
import com.braintrust.api.core.toUnmodifiable
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import java.util.Objects
import java.util.Optional

/** Summary of a dataset */
@JsonDeserialize(builder = DatasetSummarizeResponse.Builder::class)
@NoAutoDetect
class DatasetSummarizeResponse
private constructor(
    private val projectName: JsonField<String>,
    private val datasetName: JsonField<String>,
    private val projectUrl: JsonField<String>,
    private val datasetUrl: JsonField<String>,
    private val dataSummary: JsonField<DataSummary>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

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

    fun validate(): DatasetSummarizeResponse = apply {
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DatasetSummarizeResponse &&
            this.projectName == other.projectName &&
            this.datasetName == other.datasetName &&
            this.projectUrl == other.projectUrl &&
            this.datasetUrl == other.datasetUrl &&
            this.dataSummary == other.dataSummary &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    projectName,
                    datasetName,
                    projectUrl,
                    datasetUrl,
                    dataSummary,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "DatasetSummarizeResponse{projectName=$projectName, datasetName=$datasetName, projectUrl=$projectUrl, datasetUrl=$datasetUrl, dataSummary=$dataSummary, additionalProperties=$additionalProperties}"

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
        internal fun from(datasetSummarizeResponse: DatasetSummarizeResponse) = apply {
            this.projectName = datasetSummarizeResponse.projectName
            this.datasetName = datasetSummarizeResponse.datasetName
            this.projectUrl = datasetSummarizeResponse.projectUrl
            this.datasetUrl = datasetSummarizeResponse.datasetUrl
            this.dataSummary = datasetSummarizeResponse.dataSummary
            additionalProperties(datasetSummarizeResponse.additionalProperties)
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

        fun build(): DatasetSummarizeResponse =
            DatasetSummarizeResponse(
                projectName,
                datasetName,
                projectUrl,
                datasetUrl,
                dataSummary,
                additionalProperties.toUnmodifiable(),
            )
    }

    /** Summary of a dataset's data */
    @JsonDeserialize(builder = DataSummary.Builder::class)
    @NoAutoDetect
    class DataSummary
    private constructor(
        private val totalRecords: JsonField<Long>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /** Total number of records in the dataset */
        fun totalRecords(): Long = totalRecords.getRequired("total_records")

        /** Total number of records in the dataset */
        @JsonProperty("total_records") @ExcludeMissing fun _totalRecords() = totalRecords

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): DataSummary = apply {
            if (!validated) {
                totalRecords()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is DataSummary &&
                this.totalRecords == other.totalRecords &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(totalRecords, additionalProperties)
            }
            return hashCode
        }

        override fun toString() =
            "DataSummary{totalRecords=$totalRecords, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var totalRecords: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(dataSummary: DataSummary) = apply {
                this.totalRecords = dataSummary.totalRecords
                additionalProperties(dataSummary.additionalProperties)
            }

            /** Total number of records in the dataset */
            fun totalRecords(totalRecords: Long) = totalRecords(JsonField.of(totalRecords))

            /** Total number of records in the dataset */
            @JsonProperty("total_records")
            @ExcludeMissing
            fun totalRecords(totalRecords: JsonField<Long>) = apply {
                this.totalRecords = totalRecords
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

            fun build(): DataSummary =
                DataSummary(totalRecords, additionalProperties.toUnmodifiable())
        }
    }
}
