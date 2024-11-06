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
import java.util.Optional

class ExperimentCreateParams
constructor(
    private val projectId: String,
    private val baseExpId: String?,
    private val datasetId: String?,
    private val datasetVersion: String?,
    private val description: String?,
    private val ensureNew: Boolean?,
    private val metadata: Metadata?,
    private val name: String?,
    private val public_: Boolean?,
    private val repoInfo: RepoInfo?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun projectId(): String = projectId

    fun baseExpId(): Optional<String> = Optional.ofNullable(baseExpId)

    fun datasetId(): Optional<String> = Optional.ofNullable(datasetId)

    fun datasetVersion(): Optional<String> = Optional.ofNullable(datasetVersion)

    fun description(): Optional<String> = Optional.ofNullable(description)

    fun ensureNew(): Optional<Boolean> = Optional.ofNullable(ensureNew)

    fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata)

    fun name(): Optional<String> = Optional.ofNullable(name)

    fun public_(): Optional<Boolean> = Optional.ofNullable(public_)

    fun repoInfo(): Optional<RepoInfo> = Optional.ofNullable(repoInfo)

    @JvmSynthetic
    internal fun getBody(): ExperimentCreateBody {
        return ExperimentCreateBody(
            projectId,
            baseExpId,
            datasetId,
            datasetVersion,
            description,
            ensureNew,
            metadata,
            name,
            public_,
            repoInfo,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = ExperimentCreateBody.Builder::class)
    @NoAutoDetect
    class ExperimentCreateBody
    internal constructor(
        private val projectId: String?,
        private val baseExpId: String?,
        private val datasetId: String?,
        private val datasetVersion: String?,
        private val description: String?,
        private val ensureNew: Boolean?,
        private val metadata: Metadata?,
        private val name: String?,
        private val public_: Boolean?,
        private val repoInfo: RepoInfo?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** Unique identifier for the project that the experiment belongs under */
        @JsonProperty("project_id") fun projectId(): String? = projectId

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

        /**
         * Normally, creating an experiment with the same name as an existing experiment will return
         * the existing one un-modified. But if `ensure_new` is true, registration will generate a
         * new experiment with a unique name in case of a conflict.
         */
        @JsonProperty("ensure_new") fun ensureNew(): Boolean? = ensureNew

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

            private var projectId: String? = null
            private var baseExpId: String? = null
            private var datasetId: String? = null
            private var datasetVersion: String? = null
            private var description: String? = null
            private var ensureNew: Boolean? = null
            private var metadata: Metadata? = null
            private var name: String? = null
            private var public_: Boolean? = null
            private var repoInfo: RepoInfo? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(experimentCreateBody: ExperimentCreateBody) = apply {
                this.projectId = experimentCreateBody.projectId
                this.baseExpId = experimentCreateBody.baseExpId
                this.datasetId = experimentCreateBody.datasetId
                this.datasetVersion = experimentCreateBody.datasetVersion
                this.description = experimentCreateBody.description
                this.ensureNew = experimentCreateBody.ensureNew
                this.metadata = experimentCreateBody.metadata
                this.name = experimentCreateBody.name
                this.public_ = experimentCreateBody.public_
                this.repoInfo = experimentCreateBody.repoInfo
                additionalProperties(experimentCreateBody.additionalProperties)
            }

            /** Unique identifier for the project that the experiment belongs under */
            @JsonProperty("project_id")
            fun projectId(projectId: String) = apply { this.projectId = projectId }

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

            /**
             * Normally, creating an experiment with the same name as an existing experiment will
             * return the existing one un-modified. But if `ensure_new` is true, registration will
             * generate a new experiment with a unique name in case of a conflict.
             */
            @JsonProperty("ensure_new")
            fun ensureNew(ensureNew: Boolean) = apply { this.ensureNew = ensureNew }

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

            fun build(): ExperimentCreateBody =
                ExperimentCreateBody(
                    checkNotNull(projectId) { "`projectId` is required but was not set" },
                    baseExpId,
                    datasetId,
                    datasetVersion,
                    description,
                    ensureNew,
                    metadata,
                    name,
                    public_,
                    repoInfo,
                    additionalProperties.toUnmodifiable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ExperimentCreateBody && this.projectId == other.projectId && this.baseExpId == other.baseExpId && this.datasetId == other.datasetId && this.datasetVersion == other.datasetVersion && this.description == other.description && this.ensureNew == other.ensureNew && this.metadata == other.metadata && this.name == other.name && this.public_ == other.public_ && this.repoInfo == other.repoInfo && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(projectId, baseExpId, datasetId, datasetVersion, description, ensureNew, metadata, name, public_, repoInfo, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "ExperimentCreateBody{projectId=$projectId, baseExpId=$baseExpId, datasetId=$datasetId, datasetVersion=$datasetVersion, description=$description, ensureNew=$ensureNew, metadata=$metadata, name=$name, public_=$public_, repoInfo=$repoInfo, additionalProperties=$additionalProperties}"
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ExperimentCreateParams && this.projectId == other.projectId && this.baseExpId == other.baseExpId && this.datasetId == other.datasetId && this.datasetVersion == other.datasetVersion && this.description == other.description && this.ensureNew == other.ensureNew && this.metadata == other.metadata && this.name == other.name && this.public_ == other.public_ && this.repoInfo == other.repoInfo && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(projectId, baseExpId, datasetId, datasetVersion, description, ensureNew, metadata, name, public_, repoInfo, additionalQueryParams, additionalHeaders, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "ExperimentCreateParams{projectId=$projectId, baseExpId=$baseExpId, datasetId=$datasetId, datasetVersion=$datasetVersion, description=$description, ensureNew=$ensureNew, metadata=$metadata, name=$name, public_=$public_, repoInfo=$repoInfo, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var projectId: String? = null
        private var baseExpId: String? = null
        private var datasetId: String? = null
        private var datasetVersion: String? = null
        private var description: String? = null
        private var ensureNew: Boolean? = null
        private var metadata: Metadata? = null
        private var name: String? = null
        private var public_: Boolean? = null
        private var repoInfo: RepoInfo? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(experimentCreateParams: ExperimentCreateParams) = apply {
            this.projectId = experimentCreateParams.projectId
            this.baseExpId = experimentCreateParams.baseExpId
            this.datasetId = experimentCreateParams.datasetId
            this.datasetVersion = experimentCreateParams.datasetVersion
            this.description = experimentCreateParams.description
            this.ensureNew = experimentCreateParams.ensureNew
            this.metadata = experimentCreateParams.metadata
            this.name = experimentCreateParams.name
            this.public_ = experimentCreateParams.public_
            this.repoInfo = experimentCreateParams.repoInfo
            additionalQueryParams(experimentCreateParams.additionalQueryParams)
            additionalHeaders(experimentCreateParams.additionalHeaders)
            additionalBodyProperties(experimentCreateParams.additionalBodyProperties)
        }

        /** Unique identifier for the project that the experiment belongs under */
        fun projectId(projectId: String) = apply { this.projectId = projectId }

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

        /**
         * Normally, creating an experiment with the same name as an existing experiment will return
         * the existing one un-modified. But if `ensure_new` is true, registration will generate a
         * new experiment with a unique name in case of a conflict.
         */
        fun ensureNew(ensureNew: Boolean) = apply { this.ensureNew = ensureNew }

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

        fun build(): ExperimentCreateParams =
            ExperimentCreateParams(
                checkNotNull(projectId) { "`projectId` is required but was not set" },
                baseExpId,
                datasetId,
                datasetVersion,
                description,
                ensureNew,
                metadata,
                name,
                public_,
                repoInfo,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
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

            fun build(): Metadata = Metadata(additionalProperties.toUnmodifiable())
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
