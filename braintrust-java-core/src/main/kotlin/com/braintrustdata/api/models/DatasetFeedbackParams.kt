// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.toUnmodifiable
import com.braintrustdata.api.models.*
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import java.util.Objects

class DatasetFeedbackParams
constructor(
    private val datasetId: String,
    private val feedback: List<FeedbackDatasetItem>,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun datasetId(): String = datasetId

    fun feedback(): List<FeedbackDatasetItem> = feedback

    @JvmSynthetic
    internal fun getBody(): DatasetFeedbackBody {
        return DatasetFeedbackBody(feedback, additionalBodyProperties)
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> datasetId
            else -> ""
        }
    }

    @JsonDeserialize(builder = DatasetFeedbackBody.Builder::class)
    @NoAutoDetect
    class DatasetFeedbackBody
    internal constructor(
        private val feedback: List<FeedbackDatasetItem>?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** A list of dataset feedback items */
        @JsonProperty("feedback") fun feedback(): List<FeedbackDatasetItem>? = feedback

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var feedback: List<FeedbackDatasetItem>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(datasetFeedbackBody: DatasetFeedbackBody) = apply {
                this.feedback = datasetFeedbackBody.feedback
                additionalProperties(datasetFeedbackBody.additionalProperties)
            }

            /** A list of dataset feedback items */
            @JsonProperty("feedback")
            fun feedback(feedback: List<FeedbackDatasetItem>) = apply { this.feedback = feedback }

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

            fun build(): DatasetFeedbackBody =
                DatasetFeedbackBody(
                    checkNotNull(feedback) { "`feedback` is required but was not set" }
                        .toUnmodifiable(),
                    additionalProperties.toUnmodifiable()
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is DatasetFeedbackBody && this.feedback == other.feedback && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(feedback, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "DatasetFeedbackBody{feedback=$feedback, additionalProperties=$additionalProperties}"
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DatasetFeedbackParams && this.datasetId == other.datasetId && this.feedback == other.feedback && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(datasetId, feedback, additionalQueryParams, additionalHeaders, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "DatasetFeedbackParams{datasetId=$datasetId, feedback=$feedback, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var datasetId: String? = null
        private var feedback: MutableList<FeedbackDatasetItem> = mutableListOf()
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(datasetFeedbackParams: DatasetFeedbackParams) = apply {
            this.datasetId = datasetFeedbackParams.datasetId
            this.feedback(datasetFeedbackParams.feedback)
            additionalQueryParams(datasetFeedbackParams.additionalQueryParams)
            additionalHeaders(datasetFeedbackParams.additionalHeaders)
            additionalBodyProperties(datasetFeedbackParams.additionalBodyProperties)
        }

        /** Dataset id */
        fun datasetId(datasetId: String) = apply { this.datasetId = datasetId }

        /** A list of dataset feedback items */
        fun feedback(feedback: List<FeedbackDatasetItem>) = apply {
            this.feedback.clear()
            this.feedback.addAll(feedback)
        }

        /** A list of dataset feedback items */
        fun addFeedback(feedback: FeedbackDatasetItem) = apply { this.feedback.add(feedback) }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): DatasetFeedbackParams =
            DatasetFeedbackParams(
                checkNotNull(datasetId) { "`datasetId` is required but was not set" },
                checkNotNull(feedback) { "`feedback` is required but was not set" }
                    .toUnmodifiable(),
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }
}
