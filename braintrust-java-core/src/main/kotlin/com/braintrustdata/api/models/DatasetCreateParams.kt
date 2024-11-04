// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.toImmutable
import com.braintrustdata.api.models.*
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import java.util.Objects
import java.util.Optional

class DatasetCreateParams
constructor(
    private val name: String,
    private val projectId: String,
    private val description: String?,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun name(): String = name

    fun projectId(): String = projectId

    fun description(): Optional<String> = Optional.ofNullable(description)

    @JvmSynthetic
    internal fun getBody(): DatasetCreateBody {
        return DatasetCreateBody(
            name,
            projectId,
            description,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JsonDeserialize(builder = DatasetCreateBody.Builder::class)
    @NoAutoDetect
    class DatasetCreateBody
    internal constructor(
        private val name: String?,
        private val projectId: String?,
        private val description: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** Name of the dataset. Within a project, dataset names are unique */
        @JsonProperty("name") fun name(): String? = name

        /** Unique identifier for the project that the dataset belongs under */
        @JsonProperty("project_id") fun projectId(): String? = projectId

        /** Textual description of the dataset */
        @JsonProperty("description") fun description(): String? = description

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var name: String? = null
            private var projectId: String? = null
            private var description: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(datasetCreateBody: DatasetCreateBody) = apply {
                this.name = datasetCreateBody.name
                this.projectId = datasetCreateBody.projectId
                this.description = datasetCreateBody.description
                additionalProperties(datasetCreateBody.additionalProperties)
            }

            /** Name of the dataset. Within a project, dataset names are unique */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            /** Unique identifier for the project that the dataset belongs under */
            @JsonProperty("project_id")
            fun projectId(projectId: String) = apply { this.projectId = projectId }

            /** Textual description of the dataset */
            @JsonProperty("description")
            fun description(description: String) = apply { this.description = description }

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

            fun build(): DatasetCreateBody =
                DatasetCreateBody(
                    checkNotNull(name) { "`name` is required but was not set" },
                    checkNotNull(projectId) { "`projectId` is required but was not set" },
                    description,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is DatasetCreateBody && this.name == other.name && this.projectId == other.projectId && this.description == other.description && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(name, projectId, description, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "DatasetCreateBody{name=$name, projectId=$projectId, description=$description, additionalProperties=$additionalProperties}"
    }

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DatasetCreateParams && this.name == other.name && this.projectId == other.projectId && this.description == other.description && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(name, projectId, description, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "DatasetCreateParams{name=$name, projectId=$projectId, description=$description, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var name: String? = null
        private var projectId: String? = null
        private var description: String? = null
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(datasetCreateParams: DatasetCreateParams) = apply {
            this.name = datasetCreateParams.name
            this.projectId = datasetCreateParams.projectId
            this.description = datasetCreateParams.description
            additionalHeaders(datasetCreateParams.additionalHeaders)
            additionalQueryParams(datasetCreateParams.additionalQueryParams)
            additionalBodyProperties(datasetCreateParams.additionalBodyProperties)
        }

        /** Name of the dataset. Within a project, dataset names are unique */
        fun name(name: String) = apply { this.name = name }

        /** Unique identifier for the project that the dataset belongs under */
        fun projectId(projectId: String) = apply { this.projectId = projectId }

        /** Textual description of the dataset */
        fun description(description: String) = apply { this.description = description }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.putAll(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(::putAdditionalHeaders)
        }

        fun removeAdditionalHeader(name: String) = apply { additionalHeaders.removeAll(name) }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.putAll(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                additionalQueryParams.forEach(::putAdditionalQueryParams)
            }

        fun removeAdditionalQueryParam(key: String) = apply { additionalQueryParams.removeAll(key) }

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

        fun build(): DatasetCreateParams =
            DatasetCreateParams(
                checkNotNull(name) { "`name` is required but was not set" },
                checkNotNull(projectId) { "`projectId` is required but was not set" },
                description,
                additionalHeaders
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalQueryParams
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalBodyProperties.toImmutable(),
            )
    }
}
