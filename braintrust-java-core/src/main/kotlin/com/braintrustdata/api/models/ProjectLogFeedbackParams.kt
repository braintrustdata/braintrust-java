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

class ProjectLogFeedbackParams
constructor(
    private val projectId: String,
    private val feedback: List<FeedbackProjectLogsItem>,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun projectId(): String = projectId

    fun feedback(): List<FeedbackProjectLogsItem> = feedback

    @JvmSynthetic
    internal fun getBody(): ProjectLogFeedbackBody {
        return ProjectLogFeedbackBody(feedback, additionalBodyProperties)
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> projectId
            else -> ""
        }
    }

    @JsonDeserialize(builder = ProjectLogFeedbackBody.Builder::class)
    @NoAutoDetect
    class ProjectLogFeedbackBody
    internal constructor(
        private val feedback: List<FeedbackProjectLogsItem>?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** A list of project logs feedback items */
        @JsonProperty("feedback") fun feedback(): List<FeedbackProjectLogsItem>? = feedback

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ProjectLogFeedbackBody &&
                this.feedback == other.feedback &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(feedback, additionalProperties)
            }
            return hashCode
        }

        override fun toString() =
            "ProjectLogFeedbackBody{feedback=$feedback, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var feedback: List<FeedbackProjectLogsItem>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(projectLogFeedbackBody: ProjectLogFeedbackBody) = apply {
                this.feedback = projectLogFeedbackBody.feedback
                additionalProperties(projectLogFeedbackBody.additionalProperties)
            }

            /** A list of project logs feedback items */
            @JsonProperty("feedback")
            fun feedback(feedback: List<FeedbackProjectLogsItem>) = apply {
                this.feedback = feedback
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

            fun build(): ProjectLogFeedbackBody =
                ProjectLogFeedbackBody(
                    checkNotNull(feedback) { "`feedback` is required but was not set" }
                        .toUnmodifiable(),
                    additionalProperties.toUnmodifiable()
                )
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ProjectLogFeedbackParams &&
            this.projectId == other.projectId &&
            this.feedback == other.feedback &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            projectId,
            feedback,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "ProjectLogFeedbackParams{projectId=$projectId, feedback=$feedback, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var projectId: String? = null
        private var feedback: MutableList<FeedbackProjectLogsItem> = mutableListOf()
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(projectLogFeedbackParams: ProjectLogFeedbackParams) = apply {
            this.projectId = projectLogFeedbackParams.projectId
            this.feedback(projectLogFeedbackParams.feedback)
            additionalQueryParams(projectLogFeedbackParams.additionalQueryParams)
            additionalHeaders(projectLogFeedbackParams.additionalHeaders)
            additionalBodyProperties(projectLogFeedbackParams.additionalBodyProperties)
        }

        /** Project id */
        fun projectId(projectId: String) = apply { this.projectId = projectId }

        /** A list of project logs feedback items */
        fun feedback(feedback: List<FeedbackProjectLogsItem>) = apply {
            this.feedback.clear()
            this.feedback.addAll(feedback)
        }

        /** A list of project logs feedback items */
        fun addFeedback(feedback: FeedbackProjectLogsItem) = apply { this.feedback.add(feedback) }

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

        fun build(): ProjectLogFeedbackParams =
            ProjectLogFeedbackParams(
                checkNotNull(projectId) { "`projectId` is required but was not set" },
                checkNotNull(feedback) { "`feedback` is required but was not set" }
                    .toUnmodifiable(),
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }
}
