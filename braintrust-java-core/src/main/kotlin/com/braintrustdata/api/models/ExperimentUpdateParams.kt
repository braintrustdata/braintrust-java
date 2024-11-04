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

class ExperimentUpdateParams
constructor(
    private val experimentId: String,
    private val baseExpId: String?,
    private val datasetId: String?,
    private val datasetVersion: String?,
    private val description: String?,
    private val metadata: Metadata?,
    private val name: String?,
    private val public_: Boolean?,
    private val repoInfo: RepoInfo?,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun experimentId(): String = experimentId

    fun baseExpId(): Optional<String> = Optional.ofNullable(baseExpId)

    fun datasetId(): Optional<String> = Optional.ofNullable(datasetId)

    fun datasetVersion(): Optional<String> = Optional.ofNullable(datasetVersion)

    fun description(): Optional<String> = Optional.ofNullable(description)

    fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata)

    fun name(): Optional<String> = Optional.ofNullable(name)

    fun public_(): Optional<Boolean> = Optional.ofNullable(public_)

    fun repoInfo(): Optional<RepoInfo> = Optional.ofNullable(repoInfo)

    @JvmSynthetic
    internal fun getBody(): ExperimentUpdateBody {
        return ExperimentUpdateBody(
            baseExpId,
            datasetId,
            datasetVersion,
            description,
            metadata,
            name,
            public_,
            repoInfo,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> experimentId
            else -> ""
        }
    }

    @JsonDeserialize(builder = ExperimentUpdateBody.Builder::class)
    @NoAutoDetect
    class ExperimentUpdateBody
    internal constructor(
        private val baseExpId: String?,
        private val datasetId: String?,
        private val datasetVersion: String?,
        private val description: String?,
        private val metadata: Metadata?,
        private val name: String?,
        private val public_: Boolean?,
        private val repoInfo: RepoInfo?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** Id of default base experiment to compare against when viewing this experiment */
        @JsonProperty("base_exp_id") fun baseExpId(): String? = baseExpId

        /**
         * Identifier of the linked dataset, or null if the experiment is not linked to a dataset
         */
        @JsonProperty("dataset_id") fun datasetId(): String? = datasetId

        /**
         * Version number of the linked dataset the experiment was run against. This can be used to
         * reproduce the experiment after the dataset has been modified.
         */
        @JsonProperty("dataset_version") fun datasetVersion(): String? = datasetVersion

        /** Textual description of the experiment */
        @JsonProperty("description") fun description(): String? = description

        /** User-controlled metadata about the experiment */
        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

        /** Name of the experiment. Within a project, experiment names are unique */
        @JsonProperty("name") fun name(): String? = name

        /**
         * Whether or not the experiment is public. Public experiments can be viewed by anybody
         * inside or outside the organization
         */
        @JsonProperty("public") fun public_(): Boolean? = public_

        /** Metadata about the state of the repo when the experiment was created */
        @JsonProperty("repo_info") fun repoInfo(): RepoInfo? = repoInfo

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var baseExpId: String? = null
            private var datasetId: String? = null
            private var datasetVersion: String? = null
            private var description: String? = null
            private var metadata: Metadata? = null
            private var name: String? = null
            private var public_: Boolean? = null
            private var repoInfo: RepoInfo? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(experimentUpdateBody: ExperimentUpdateBody) = apply {
                this.baseExpId = experimentUpdateBody.baseExpId
                this.datasetId = experimentUpdateBody.datasetId
                this.datasetVersion = experimentUpdateBody.datasetVersion
                this.description = experimentUpdateBody.description
                this.metadata = experimentUpdateBody.metadata
                this.name = experimentUpdateBody.name
                this.public_ = experimentUpdateBody.public_
                this.repoInfo = experimentUpdateBody.repoInfo
                additionalProperties(experimentUpdateBody.additionalProperties)
            }

            /** Id of default base experiment to compare against when viewing this experiment */
            @JsonProperty("base_exp_id")
            fun baseExpId(baseExpId: String) = apply { this.baseExpId = baseExpId }

            /**
             * Identifier of the linked dataset, or null if the experiment is not linked to a
             * dataset
             */
            @JsonProperty("dataset_id")
            fun datasetId(datasetId: String) = apply { this.datasetId = datasetId }

            /**
             * Version number of the linked dataset the experiment was run against. This can be used
             * to reproduce the experiment after the dataset has been modified.
             */
            @JsonProperty("dataset_version")
            fun datasetVersion(datasetVersion: String) = apply {
                this.datasetVersion = datasetVersion
            }

            /** Textual description of the experiment */
            @JsonProperty("description")
            fun description(description: String) = apply { this.description = description }

            /** User-controlled metadata about the experiment */
            @JsonProperty("metadata")
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

            /** Name of the experiment. Within a project, experiment names are unique */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            /**
             * Whether or not the experiment is public. Public experiments can be viewed by anybody
             * inside or outside the organization
             */
            @JsonProperty("public") fun public_(public_: Boolean) = apply { this.public_ = public_ }

            /** Metadata about the state of the repo when the experiment was created */
            @JsonProperty("repo_info")
            fun repoInfo(repoInfo: RepoInfo) = apply { this.repoInfo = repoInfo }

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

            fun build(): ExperimentUpdateBody =
                ExperimentUpdateBody(
                    baseExpId,
                    datasetId,
                    datasetVersion,
                    description,
                    metadata,
                    name,
                    public_,
                    repoInfo,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ExperimentUpdateBody && this.baseExpId == other.baseExpId && this.datasetId == other.datasetId && this.datasetVersion == other.datasetVersion && this.description == other.description && this.metadata == other.metadata && this.name == other.name && this.public_ == other.public_ && this.repoInfo == other.repoInfo && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(baseExpId, datasetId, datasetVersion, description, metadata, name, public_, repoInfo, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "ExperimentUpdateBody{baseExpId=$baseExpId, datasetId=$datasetId, datasetVersion=$datasetVersion, description=$description, metadata=$metadata, name=$name, public_=$public_, repoInfo=$repoInfo, additionalProperties=$additionalProperties}"
    }

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ExperimentUpdateParams && this.experimentId == other.experimentId && this.baseExpId == other.baseExpId && this.datasetId == other.datasetId && this.datasetVersion == other.datasetVersion && this.description == other.description && this.metadata == other.metadata && this.name == other.name && this.public_ == other.public_ && this.repoInfo == other.repoInfo && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(experimentId, baseExpId, datasetId, datasetVersion, description, metadata, name, public_, repoInfo, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "ExperimentUpdateParams{experimentId=$experimentId, baseExpId=$baseExpId, datasetId=$datasetId, datasetVersion=$datasetVersion, description=$description, metadata=$metadata, name=$name, public_=$public_, repoInfo=$repoInfo, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var experimentId: String? = null
        private var baseExpId: String? = null
        private var datasetId: String? = null
        private var datasetVersion: String? = null
        private var description: String? = null
        private var metadata: Metadata? = null
        private var name: String? = null
        private var public_: Boolean? = null
        private var repoInfo: RepoInfo? = null
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(experimentUpdateParams: ExperimentUpdateParams) = apply {
            this.experimentId = experimentUpdateParams.experimentId
            this.baseExpId = experimentUpdateParams.baseExpId
            this.datasetId = experimentUpdateParams.datasetId
            this.datasetVersion = experimentUpdateParams.datasetVersion
            this.description = experimentUpdateParams.description
            this.metadata = experimentUpdateParams.metadata
            this.name = experimentUpdateParams.name
            this.public_ = experimentUpdateParams.public_
            this.repoInfo = experimentUpdateParams.repoInfo
            additionalHeaders(experimentUpdateParams.additionalHeaders)
            additionalQueryParams(experimentUpdateParams.additionalQueryParams)
            additionalBodyProperties(experimentUpdateParams.additionalBodyProperties)
        }

        /** Experiment id */
        fun experimentId(experimentId: String) = apply { this.experimentId = experimentId }

        /** Id of default base experiment to compare against when viewing this experiment */
        fun baseExpId(baseExpId: String) = apply { this.baseExpId = baseExpId }

        /**
         * Identifier of the linked dataset, or null if the experiment is not linked to a dataset
         */
        fun datasetId(datasetId: String) = apply { this.datasetId = datasetId }

        /**
         * Version number of the linked dataset the experiment was run against. This can be used to
         * reproduce the experiment after the dataset has been modified.
         */
        fun datasetVersion(datasetVersion: String) = apply { this.datasetVersion = datasetVersion }

        /** Textual description of the experiment */
        fun description(description: String) = apply { this.description = description }

        /** User-controlled metadata about the experiment */
        fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

        /** Name of the experiment. Within a project, experiment names are unique */
        fun name(name: String) = apply { this.name = name }

        /**
         * Whether or not the experiment is public. Public experiments can be viewed by anybody
         * inside or outside the organization
         */
        fun public_(public_: Boolean) = apply { this.public_ = public_ }

        /** Metadata about the state of the repo when the experiment was created */
        fun repoInfo(repoInfo: RepoInfo) = apply { this.repoInfo = repoInfo }

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

        fun build(): ExperimentUpdateParams =
            ExperimentUpdateParams(
                checkNotNull(experimentId) { "`experimentId` is required but was not set" },
                baseExpId,
                datasetId,
                datasetVersion,
                description,
                metadata,
                name,
                public_,
                repoInfo,
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

    /** User-controlled metadata about the experiment */
    @JsonDeserialize(builder = Metadata.Builder::class)
    @NoAutoDetect
    class Metadata
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(metadata: Metadata) = apply {
                additionalProperties(metadata.additionalProperties)
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

            fun build(): Metadata = Metadata(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Metadata && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
    }
}
