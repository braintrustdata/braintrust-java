// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.toUnmodifiable
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = CreateExperiment.Builder::class)
@NoAutoDetect
class CreateExperiment
private constructor(
    private val projectId: JsonField<String>,
    private val name: JsonField<String>,
    private val description: JsonField<String>,
    private val repoInfo: JsonField<RepoInfo>,
    private val baseExpId: JsonField<String>,
    private val datasetId: JsonField<String>,
    private val datasetVersion: JsonField<String>,
    private val public_: JsonField<Boolean>,
    private val metadata: JsonField<Metadata>,
    private val ensureNew: JsonField<Boolean>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** Unique identifier for the project that the experiment belongs under */
    fun projectId(): String = projectId.getRequired("project_id")

    /** Name of the experiment. Within a project, experiment names are unique */
    fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

    /** Textual description of the experiment */
    fun description(): Optional<String> =
        Optional.ofNullable(description.getNullable("description"))

    /** Metadata about the state of the repo when the experiment was created */
    fun repoInfo(): Optional<RepoInfo> = Optional.ofNullable(repoInfo.getNullable("repo_info"))

    /** Id of default base experiment to compare against when viewing this experiment */
    fun baseExpId(): Optional<String> = Optional.ofNullable(baseExpId.getNullable("base_exp_id"))

    /** Identifier of the linked dataset, or null if the experiment is not linked to a dataset */
    fun datasetId(): Optional<String> = Optional.ofNullable(datasetId.getNullable("dataset_id"))

    /**
     * Version number of the linked dataset the experiment was run against. This can be used to
     * reproduce the experiment after the dataset has been modified.
     */
    fun datasetVersion(): Optional<String> =
        Optional.ofNullable(datasetVersion.getNullable("dataset_version"))

    /**
     * Whether or not the experiment is public. Public experiments can be viewed by anybody inside
     * or outside the organization
     */
    fun public_(): Optional<Boolean> = Optional.ofNullable(public_.getNullable("public"))

    /** User-controlled metadata about the experiment */
    fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata.getNullable("metadata"))

    /**
     * Normally, creating an experiment with the same name as an existing experiment will return the
     * existing one un-modified. But if `ensure_new` is true, registration will generate a new
     * experiment with a unique name in case of a conflict.
     */
    fun ensureNew(): Optional<Boolean> = Optional.ofNullable(ensureNew.getNullable("ensure_new"))

    /** Unique identifier for the project that the experiment belongs under */
    @JsonProperty("project_id") @ExcludeMissing fun _projectId() = projectId

    /** Name of the experiment. Within a project, experiment names are unique */
    @JsonProperty("name") @ExcludeMissing fun _name() = name

    /** Textual description of the experiment */
    @JsonProperty("description") @ExcludeMissing fun _description() = description

    /** Metadata about the state of the repo when the experiment was created */
    @JsonProperty("repo_info") @ExcludeMissing fun _repoInfo() = repoInfo

    /** Id of default base experiment to compare against when viewing this experiment */
    @JsonProperty("base_exp_id") @ExcludeMissing fun _baseExpId() = baseExpId

    /** Identifier of the linked dataset, or null if the experiment is not linked to a dataset */
    @JsonProperty("dataset_id") @ExcludeMissing fun _datasetId() = datasetId

    /**
     * Version number of the linked dataset the experiment was run against. This can be used to
     * reproduce the experiment after the dataset has been modified.
     */
    @JsonProperty("dataset_version") @ExcludeMissing fun _datasetVersion() = datasetVersion

    /**
     * Whether or not the experiment is public. Public experiments can be viewed by anybody inside
     * or outside the organization
     */
    @JsonProperty("public") @ExcludeMissing fun _public_() = public_

    /** User-controlled metadata about the experiment */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata() = metadata

    /**
     * Normally, creating an experiment with the same name as an existing experiment will return the
     * existing one un-modified. But if `ensure_new` is true, registration will generate a new
     * experiment with a unique name in case of a conflict.
     */
    @JsonProperty("ensure_new") @ExcludeMissing fun _ensureNew() = ensureNew

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): CreateExperiment = apply {
        if (!validated) {
            projectId()
            name()
            description()
            repoInfo().map { it.validate() }
            baseExpId()
            datasetId()
            datasetVersion()
            public_()
            metadata().map { it.validate() }
            ensureNew()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CreateExperiment &&
            this.projectId == other.projectId &&
            this.name == other.name &&
            this.description == other.description &&
            this.repoInfo == other.repoInfo &&
            this.baseExpId == other.baseExpId &&
            this.datasetId == other.datasetId &&
            this.datasetVersion == other.datasetVersion &&
            this.public_ == other.public_ &&
            this.metadata == other.metadata &&
            this.ensureNew == other.ensureNew &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    projectId,
                    name,
                    description,
                    repoInfo,
                    baseExpId,
                    datasetId,
                    datasetVersion,
                    public_,
                    metadata,
                    ensureNew,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "CreateExperiment{projectId=$projectId, name=$name, description=$description, repoInfo=$repoInfo, baseExpId=$baseExpId, datasetId=$datasetId, datasetVersion=$datasetVersion, public_=$public_, metadata=$metadata, ensureNew=$ensureNew, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var projectId: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var repoInfo: JsonField<RepoInfo> = JsonMissing.of()
        private var baseExpId: JsonField<String> = JsonMissing.of()
        private var datasetId: JsonField<String> = JsonMissing.of()
        private var datasetVersion: JsonField<String> = JsonMissing.of()
        private var public_: JsonField<Boolean> = JsonMissing.of()
        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var ensureNew: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(createExperiment: CreateExperiment) = apply {
            this.projectId = createExperiment.projectId
            this.name = createExperiment.name
            this.description = createExperiment.description
            this.repoInfo = createExperiment.repoInfo
            this.baseExpId = createExperiment.baseExpId
            this.datasetId = createExperiment.datasetId
            this.datasetVersion = createExperiment.datasetVersion
            this.public_ = createExperiment.public_
            this.metadata = createExperiment.metadata
            this.ensureNew = createExperiment.ensureNew
            additionalProperties(createExperiment.additionalProperties)
        }

        /** Unique identifier for the project that the experiment belongs under */
        fun projectId(projectId: String) = projectId(JsonField.of(projectId))

        /** Unique identifier for the project that the experiment belongs under */
        @JsonProperty("project_id")
        @ExcludeMissing
        fun projectId(projectId: JsonField<String>) = apply { this.projectId = projectId }

        /** Name of the experiment. Within a project, experiment names are unique */
        fun name(name: String) = name(JsonField.of(name))

        /** Name of the experiment. Within a project, experiment names are unique */
        @JsonProperty("name")
        @ExcludeMissing
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Textual description of the experiment */
        fun description(description: String) = description(JsonField.of(description))

        /** Textual description of the experiment */
        @JsonProperty("description")
        @ExcludeMissing
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** Metadata about the state of the repo when the experiment was created */
        fun repoInfo(repoInfo: RepoInfo) = repoInfo(JsonField.of(repoInfo))

        /** Metadata about the state of the repo when the experiment was created */
        @JsonProperty("repo_info")
        @ExcludeMissing
        fun repoInfo(repoInfo: JsonField<RepoInfo>) = apply { this.repoInfo = repoInfo }

        /** Id of default base experiment to compare against when viewing this experiment */
        fun baseExpId(baseExpId: String) = baseExpId(JsonField.of(baseExpId))

        /** Id of default base experiment to compare against when viewing this experiment */
        @JsonProperty("base_exp_id")
        @ExcludeMissing
        fun baseExpId(baseExpId: JsonField<String>) = apply { this.baseExpId = baseExpId }

        /**
         * Identifier of the linked dataset, or null if the experiment is not linked to a dataset
         */
        fun datasetId(datasetId: String) = datasetId(JsonField.of(datasetId))

        /**
         * Identifier of the linked dataset, or null if the experiment is not linked to a dataset
         */
        @JsonProperty("dataset_id")
        @ExcludeMissing
        fun datasetId(datasetId: JsonField<String>) = apply { this.datasetId = datasetId }

        /**
         * Version number of the linked dataset the experiment was run against. This can be used to
         * reproduce the experiment after the dataset has been modified.
         */
        fun datasetVersion(datasetVersion: String) = datasetVersion(JsonField.of(datasetVersion))

        /**
         * Version number of the linked dataset the experiment was run against. This can be used to
         * reproduce the experiment after the dataset has been modified.
         */
        @JsonProperty("dataset_version")
        @ExcludeMissing
        fun datasetVersion(datasetVersion: JsonField<String>) = apply {
            this.datasetVersion = datasetVersion
        }

        /**
         * Whether or not the experiment is public. Public experiments can be viewed by anybody
         * inside or outside the organization
         */
        fun public_(public_: Boolean) = public_(JsonField.of(public_))

        /**
         * Whether or not the experiment is public. Public experiments can be viewed by anybody
         * inside or outside the organization
         */
        @JsonProperty("public")
        @ExcludeMissing
        fun public_(public_: JsonField<Boolean>) = apply { this.public_ = public_ }

        /** User-controlled metadata about the experiment */
        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

        /** User-controlled metadata about the experiment */
        @JsonProperty("metadata")
        @ExcludeMissing
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        /**
         * Normally, creating an experiment with the same name as an existing experiment will return
         * the existing one un-modified. But if `ensure_new` is true, registration will generate a
         * new experiment with a unique name in case of a conflict.
         */
        fun ensureNew(ensureNew: Boolean) = ensureNew(JsonField.of(ensureNew))

        /**
         * Normally, creating an experiment with the same name as an existing experiment will return
         * the existing one un-modified. But if `ensure_new` is true, registration will generate a
         * new experiment with a unique name in case of a conflict.
         */
        @JsonProperty("ensure_new")
        @ExcludeMissing
        fun ensureNew(ensureNew: JsonField<Boolean>) = apply { this.ensureNew = ensureNew }

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

        fun build(): CreateExperiment =
            CreateExperiment(
                projectId,
                name,
                description,
                repoInfo,
                baseExpId,
                datasetId,
                datasetVersion,
                public_,
                metadata,
                ensureNew,
                additionalProperties.toUnmodifiable(),
            )
    }

    /** User-controlled metadata about the experiment */
    @JsonDeserialize(builder = Metadata.Builder::class)
    @NoAutoDetect
    class Metadata
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Metadata = apply {
            if (!validated) {
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Metadata && this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(additionalProperties)
            }
            return hashCode
        }

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"

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
    }
}
