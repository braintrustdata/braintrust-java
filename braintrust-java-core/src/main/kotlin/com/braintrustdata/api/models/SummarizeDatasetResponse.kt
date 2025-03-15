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
import com.braintrustdata.api.errors.BraintrustInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Summary of a dataset */
@NoAutoDetect
class SummarizeDatasetResponse
@JsonCreator
private constructor(
    @JsonProperty("dataset_name")
    @ExcludeMissing
    private val datasetName: JsonField<String> = JsonMissing.of(),
    @JsonProperty("dataset_url")
    @ExcludeMissing
    private val datasetUrl: JsonField<String> = JsonMissing.of(),
    @JsonProperty("project_name")
    @ExcludeMissing
    private val projectName: JsonField<String> = JsonMissing.of(),
    @JsonProperty("project_url")
    @ExcludeMissing
    private val projectUrl: JsonField<String> = JsonMissing.of(),
    @JsonProperty("data_summary")
    @ExcludeMissing
    private val dataSummary: JsonField<DataSummary> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * Name of the dataset
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun datasetName(): String = datasetName.getRequired("dataset_name")

    /**
     * URL to the dataset's page in the Braintrust app
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun datasetUrl(): String = datasetUrl.getRequired("dataset_url")

    /**
     * Name of the project that the dataset belongs to
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
     * Summary of a dataset's data
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dataSummary(): Optional<DataSummary> =
        Optional.ofNullable(dataSummary.getNullable("data_summary"))

    /**
     * Returns the raw JSON value of [datasetName].
     *
     * Unlike [datasetName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dataset_name")
    @ExcludeMissing
    fun _datasetName(): JsonField<String> = datasetName

    /**
     * Returns the raw JSON value of [datasetUrl].
     *
     * Unlike [datasetUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dataset_url") @ExcludeMissing fun _datasetUrl(): JsonField<String> = datasetUrl

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
     * Returns the raw JSON value of [dataSummary].
     *
     * Unlike [dataSummary], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data_summary")
    @ExcludeMissing
    fun _dataSummary(): JsonField<DataSummary> = dataSummary

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): SummarizeDatasetResponse = apply {
        if (validated) {
            return@apply
        }

        datasetName()
        datasetUrl()
        projectName()
        projectUrl()
        dataSummary().ifPresent { it.validate() }
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SummarizeDatasetResponse].
         *
         * The following fields are required:
         * ```java
         * .datasetName()
         * .datasetUrl()
         * .projectName()
         * .projectUrl()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SummarizeDatasetResponse]. */
    class Builder internal constructor() {

        private var datasetName: JsonField<String>? = null
        private var datasetUrl: JsonField<String>? = null
        private var projectName: JsonField<String>? = null
        private var projectUrl: JsonField<String>? = null
        private var dataSummary: JsonField<DataSummary> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(summarizeDatasetResponse: SummarizeDatasetResponse) = apply {
            datasetName = summarizeDatasetResponse.datasetName
            datasetUrl = summarizeDatasetResponse.datasetUrl
            projectName = summarizeDatasetResponse.projectName
            projectUrl = summarizeDatasetResponse.projectUrl
            dataSummary = summarizeDatasetResponse.dataSummary
            additionalProperties = summarizeDatasetResponse.additionalProperties.toMutableMap()
        }

        /** Name of the dataset */
        fun datasetName(datasetName: String) = datasetName(JsonField.of(datasetName))

        /**
         * Sets [Builder.datasetName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.datasetName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun datasetName(datasetName: JsonField<String>) = apply { this.datasetName = datasetName }

        /** URL to the dataset's page in the Braintrust app */
        fun datasetUrl(datasetUrl: String) = datasetUrl(JsonField.of(datasetUrl))

        /**
         * Sets [Builder.datasetUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.datasetUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun datasetUrl(datasetUrl: JsonField<String>) = apply { this.datasetUrl = datasetUrl }

        /** Name of the project that the dataset belongs to */
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

        /** Summary of a dataset's data */
        fun dataSummary(dataSummary: DataSummary?) = dataSummary(JsonField.ofNullable(dataSummary))

        /** Alias for calling [Builder.dataSummary] with `dataSummary.orElse(null)`. */
        fun dataSummary(dataSummary: Optional<DataSummary>) = dataSummary(dataSummary.getOrNull())

        /**
         * Sets [Builder.dataSummary] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dataSummary] with a well-typed [DataSummary] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dataSummary(dataSummary: JsonField<DataSummary>) = apply {
            this.dataSummary = dataSummary
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

        fun build(): SummarizeDatasetResponse =
            SummarizeDatasetResponse(
                checkRequired("datasetName", datasetName),
                checkRequired("datasetUrl", datasetUrl),
                checkRequired("projectName", projectName),
                checkRequired("projectUrl", projectUrl),
                dataSummary,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SummarizeDatasetResponse && datasetName == other.datasetName && datasetUrl == other.datasetUrl && projectName == other.projectName && projectUrl == other.projectUrl && dataSummary == other.dataSummary && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(datasetName, datasetUrl, projectName, projectUrl, dataSummary, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SummarizeDatasetResponse{datasetName=$datasetName, datasetUrl=$datasetUrl, projectName=$projectName, projectUrl=$projectUrl, dataSummary=$dataSummary, additionalProperties=$additionalProperties}"
}
