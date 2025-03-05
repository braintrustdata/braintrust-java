// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.Params
import com.braintrustdata.api.core.checkRequired
import com.braintrustdata.api.core.http.Headers
import com.braintrustdata.api.core.http.QueryParams
import com.braintrustdata.api.core.immutableEmptyMap
import com.braintrustdata.api.core.toImmutable
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Objects
import java.util.Optional

/**
 * Create a new experiment. If there is an existing experiment in the project with the same name as
 * the one specified in the request, will return the existing experiment unmodified
 */
class ExperimentCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Unique identifier for the project that the experiment belongs under */
    fun projectId(): String = body.projectId()

    /** Id of default base experiment to compare against when viewing this experiment */
    fun baseExpId(): Optional<String> = body.baseExpId()

    /** Identifier of the linked dataset, or null if the experiment is not linked to a dataset */
    fun datasetId(): Optional<String> = body.datasetId()

    /**
     * Version number of the linked dataset the experiment was run against. This can be used to
     * reproduce the experiment after the dataset has been modified.
     */
    fun datasetVersion(): Optional<String> = body.datasetVersion()

    /** Textual description of the experiment */
    fun description(): Optional<String> = body.description()

    /**
     * Normally, creating an experiment with the same name as an existing experiment will return the
     * existing one un-modified. But if `ensure_new` is true, registration will generate a new
     * experiment with a unique name in case of a conflict.
     */
    fun ensureNew(): Optional<Boolean> = body.ensureNew()

    /** User-controlled metadata about the experiment */
    fun metadata(): Optional<Metadata> = body.metadata()

    /** Name of the experiment. Within a project, experiment names are unique */
    fun name(): Optional<String> = body.name()

    /**
     * Whether or not the experiment is public. Public experiments can be viewed by anybody inside
     * or outside the organization
     */
    fun public_(): Optional<Boolean> = body.public_()

    /** Metadata about the state of the repo when the experiment was created */
    fun repoInfo(): Optional<RepoInfo> = body.repoInfo()

    /** Unique identifier for the project that the experiment belongs under */
    fun _projectId(): JsonField<String> = body._projectId()

    /** Id of default base experiment to compare against when viewing this experiment */
    fun _baseExpId(): JsonField<String> = body._baseExpId()

    /** Identifier of the linked dataset, or null if the experiment is not linked to a dataset */
    fun _datasetId(): JsonField<String> = body._datasetId()

    /**
     * Version number of the linked dataset the experiment was run against. This can be used to
     * reproduce the experiment after the dataset has been modified.
     */
    fun _datasetVersion(): JsonField<String> = body._datasetVersion()

    /** Textual description of the experiment */
    fun _description(): JsonField<String> = body._description()

    /**
     * Normally, creating an experiment with the same name as an existing experiment will return the
     * existing one un-modified. But if `ensure_new` is true, registration will generate a new
     * experiment with a unique name in case of a conflict.
     */
    fun _ensureNew(): JsonField<Boolean> = body._ensureNew()

    /** User-controlled metadata about the experiment */
    fun _metadata(): JsonField<Metadata> = body._metadata()

    /** Name of the experiment. Within a project, experiment names are unique */
    fun _name(): JsonField<String> = body._name()

    /**
     * Whether or not the experiment is public. Public experiments can be viewed by anybody inside
     * or outside the organization
     */
    fun _public_(): JsonField<Boolean> = body._public_()

    /** Metadata about the state of the repo when the experiment was created */
    fun _repoInfo(): JsonField<RepoInfo> = body._repoInfo()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class Body
    @JsonCreator
    private constructor(
        @JsonProperty("project_id")
        @ExcludeMissing
        private val projectId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("base_exp_id")
        @ExcludeMissing
        private val baseExpId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dataset_id")
        @ExcludeMissing
        private val datasetId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dataset_version")
        @ExcludeMissing
        private val datasetVersion: JsonField<String> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        private val description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ensure_new")
        @ExcludeMissing
        private val ensureNew: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("metadata")
        @ExcludeMissing
        private val metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("public")
        @ExcludeMissing
        private val public_: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("repo_info")
        @ExcludeMissing
        private val repoInfo: JsonField<RepoInfo> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Unique identifier for the project that the experiment belongs under */
        fun projectId(): String = projectId.getRequired("project_id")

        /** Id of default base experiment to compare against when viewing this experiment */
        fun baseExpId(): Optional<String> =
            Optional.ofNullable(baseExpId.getNullable("base_exp_id"))

        /**
         * Identifier of the linked dataset, or null if the experiment is not linked to a dataset
         */
        fun datasetId(): Optional<String> = Optional.ofNullable(datasetId.getNullable("dataset_id"))

        /**
         * Version number of the linked dataset the experiment was run against. This can be used to
         * reproduce the experiment after the dataset has been modified.
         */
        fun datasetVersion(): Optional<String> =
            Optional.ofNullable(datasetVersion.getNullable("dataset_version"))

        /** Textual description of the experiment */
        fun description(): Optional<String> =
            Optional.ofNullable(description.getNullable("description"))

        /**
         * Normally, creating an experiment with the same name as an existing experiment will return
         * the existing one un-modified. But if `ensure_new` is true, registration will generate a
         * new experiment with a unique name in case of a conflict.
         */
        fun ensureNew(): Optional<Boolean> =
            Optional.ofNullable(ensureNew.getNullable("ensure_new"))

        /** User-controlled metadata about the experiment */
        fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata.getNullable("metadata"))

        /** Name of the experiment. Within a project, experiment names are unique */
        fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

        /**
         * Whether or not the experiment is public. Public experiments can be viewed by anybody
         * inside or outside the organization
         */
        fun public_(): Optional<Boolean> = Optional.ofNullable(public_.getNullable("public"))

        /** Metadata about the state of the repo when the experiment was created */
        fun repoInfo(): Optional<RepoInfo> = Optional.ofNullable(repoInfo.getNullable("repo_info"))

        /** Unique identifier for the project that the experiment belongs under */
        @JsonProperty("project_id") @ExcludeMissing fun _projectId(): JsonField<String> = projectId

        /** Id of default base experiment to compare against when viewing this experiment */
        @JsonProperty("base_exp_id") @ExcludeMissing fun _baseExpId(): JsonField<String> = baseExpId

        /**
         * Identifier of the linked dataset, or null if the experiment is not linked to a dataset
         */
        @JsonProperty("dataset_id") @ExcludeMissing fun _datasetId(): JsonField<String> = datasetId

        /**
         * Version number of the linked dataset the experiment was run against. This can be used to
         * reproduce the experiment after the dataset has been modified.
         */
        @JsonProperty("dataset_version")
        @ExcludeMissing
        fun _datasetVersion(): JsonField<String> = datasetVersion

        /** Textual description of the experiment */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Normally, creating an experiment with the same name as an existing experiment will return
         * the existing one un-modified. But if `ensure_new` is true, registration will generate a
         * new experiment with a unique name in case of a conflict.
         */
        @JsonProperty("ensure_new") @ExcludeMissing fun _ensureNew(): JsonField<Boolean> = ensureNew

        /** User-controlled metadata about the experiment */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        /** Name of the experiment. Within a project, experiment names are unique */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Whether or not the experiment is public. Public experiments can be viewed by anybody
         * inside or outside the organization
         */
        @JsonProperty("public") @ExcludeMissing fun _public_(): JsonField<Boolean> = public_

        /** Metadata about the state of the repo when the experiment was created */
        @JsonProperty("repo_info") @ExcludeMissing fun _repoInfo(): JsonField<RepoInfo> = repoInfo

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            projectId()
            baseExpId()
            datasetId()
            datasetVersion()
            description()
            ensureNew()
            metadata().ifPresent { it.validate() }
            name()
            public_()
            repoInfo().ifPresent { it.validate() }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .projectId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var projectId: JsonField<String>? = null
            private var baseExpId: JsonField<String> = JsonMissing.of()
            private var datasetId: JsonField<String> = JsonMissing.of()
            private var datasetVersion: JsonField<String> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var ensureNew: JsonField<Boolean> = JsonMissing.of()
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var public_: JsonField<Boolean> = JsonMissing.of()
            private var repoInfo: JsonField<RepoInfo> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                projectId = body.projectId
                baseExpId = body.baseExpId
                datasetId = body.datasetId
                datasetVersion = body.datasetVersion
                description = body.description
                ensureNew = body.ensureNew
                metadata = body.metadata
                name = body.name
                public_ = body.public_
                repoInfo = body.repoInfo
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Unique identifier for the project that the experiment belongs under */
            fun projectId(projectId: String) = projectId(JsonField.of(projectId))

            /** Unique identifier for the project that the experiment belongs under */
            fun projectId(projectId: JsonField<String>) = apply { this.projectId = projectId }

            /** Id of default base experiment to compare against when viewing this experiment */
            fun baseExpId(baseExpId: String?) = baseExpId(JsonField.ofNullable(baseExpId))

            /** Id of default base experiment to compare against when viewing this experiment */
            fun baseExpId(baseExpId: Optional<String>) = baseExpId(baseExpId.orElse(null))

            /** Id of default base experiment to compare against when viewing this experiment */
            fun baseExpId(baseExpId: JsonField<String>) = apply { this.baseExpId = baseExpId }

            /**
             * Identifier of the linked dataset, or null if the experiment is not linked to a
             * dataset
             */
            fun datasetId(datasetId: String?) = datasetId(JsonField.ofNullable(datasetId))

            /**
             * Identifier of the linked dataset, or null if the experiment is not linked to a
             * dataset
             */
            fun datasetId(datasetId: Optional<String>) = datasetId(datasetId.orElse(null))

            /**
             * Identifier of the linked dataset, or null if the experiment is not linked to a
             * dataset
             */
            fun datasetId(datasetId: JsonField<String>) = apply { this.datasetId = datasetId }

            /**
             * Version number of the linked dataset the experiment was run against. This can be used
             * to reproduce the experiment after the dataset has been modified.
             */
            fun datasetVersion(datasetVersion: String?) =
                datasetVersion(JsonField.ofNullable(datasetVersion))

            /**
             * Version number of the linked dataset the experiment was run against. This can be used
             * to reproduce the experiment after the dataset has been modified.
             */
            fun datasetVersion(datasetVersion: Optional<String>) =
                datasetVersion(datasetVersion.orElse(null))

            /**
             * Version number of the linked dataset the experiment was run against. This can be used
             * to reproduce the experiment after the dataset has been modified.
             */
            fun datasetVersion(datasetVersion: JsonField<String>) = apply {
                this.datasetVersion = datasetVersion
            }

            /** Textual description of the experiment */
            fun description(description: String?) = description(JsonField.ofNullable(description))

            /** Textual description of the experiment */
            fun description(description: Optional<String>) = description(description.orElse(null))

            /** Textual description of the experiment */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /**
             * Normally, creating an experiment with the same name as an existing experiment will
             * return the existing one un-modified. But if `ensure_new` is true, registration will
             * generate a new experiment with a unique name in case of a conflict.
             */
            fun ensureNew(ensureNew: Boolean?) = ensureNew(JsonField.ofNullable(ensureNew))

            /**
             * Normally, creating an experiment with the same name as an existing experiment will
             * return the existing one un-modified. But if `ensure_new` is true, registration will
             * generate a new experiment with a unique name in case of a conflict.
             */
            fun ensureNew(ensureNew: Boolean) = ensureNew(ensureNew as Boolean?)

            /**
             * Normally, creating an experiment with the same name as an existing experiment will
             * return the existing one un-modified. But if `ensure_new` is true, registration will
             * generate a new experiment with a unique name in case of a conflict.
             */
            @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
            fun ensureNew(ensureNew: Optional<Boolean>) =
                ensureNew(ensureNew.orElse(null) as Boolean?)

            /**
             * Normally, creating an experiment with the same name as an existing experiment will
             * return the existing one un-modified. But if `ensure_new` is true, registration will
             * generate a new experiment with a unique name in case of a conflict.
             */
            fun ensureNew(ensureNew: JsonField<Boolean>) = apply { this.ensureNew = ensureNew }

            /** User-controlled metadata about the experiment */
            fun metadata(metadata: Metadata?) = metadata(JsonField.ofNullable(metadata))

            /** User-controlled metadata about the experiment */
            fun metadata(metadata: Optional<Metadata>) = metadata(metadata.orElse(null))

            /** User-controlled metadata about the experiment */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            /** Name of the experiment. Within a project, experiment names are unique */
            fun name(name: String?) = name(JsonField.ofNullable(name))

            /** Name of the experiment. Within a project, experiment names are unique */
            fun name(name: Optional<String>) = name(name.orElse(null))

            /** Name of the experiment. Within a project, experiment names are unique */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /**
             * Whether or not the experiment is public. Public experiments can be viewed by anybody
             * inside or outside the organization
             */
            fun public_(public_: Boolean?) = public_(JsonField.ofNullable(public_))

            /**
             * Whether or not the experiment is public. Public experiments can be viewed by anybody
             * inside or outside the organization
             */
            fun public_(public_: Boolean) = public_(public_ as Boolean?)

            /**
             * Whether or not the experiment is public. Public experiments can be viewed by anybody
             * inside or outside the organization
             */
            @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
            fun public_(public_: Optional<Boolean>) = public_(public_.orElse(null) as Boolean?)

            /**
             * Whether or not the experiment is public. Public experiments can be viewed by anybody
             * inside or outside the organization
             */
            fun public_(public_: JsonField<Boolean>) = apply { this.public_ = public_ }

            /** Metadata about the state of the repo when the experiment was created */
            fun repoInfo(repoInfo: RepoInfo?) = repoInfo(JsonField.ofNullable(repoInfo))

            /** Metadata about the state of the repo when the experiment was created */
            fun repoInfo(repoInfo: Optional<RepoInfo>) = repoInfo(repoInfo.orElse(null))

            /** Metadata about the state of the repo when the experiment was created */
            fun repoInfo(repoInfo: JsonField<RepoInfo>) = apply { this.repoInfo = repoInfo }

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

            fun build(): Body =
                Body(
                    checkRequired("projectId", projectId),
                    baseExpId,
                    datasetId,
                    datasetVersion,
                    description,
                    ensureNew,
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

            return /* spotless:off */ other is Body && projectId == other.projectId && baseExpId == other.baseExpId && datasetId == other.datasetId && datasetVersion == other.datasetVersion && description == other.description && ensureNew == other.ensureNew && metadata == other.metadata && name == other.name && public_ == other.public_ && repoInfo == other.repoInfo && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(projectId, baseExpId, datasetId, datasetVersion, description, ensureNew, metadata, name, public_, repoInfo, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{projectId=$projectId, baseExpId=$baseExpId, datasetId=$datasetId, datasetVersion=$datasetVersion, description=$description, ensureNew=$ensureNew, metadata=$metadata, name=$name, public_=$public_, repoInfo=$repoInfo, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ExperimentCreateParams].
         *
         * The following fields are required:
         * ```java
         * .projectId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExperimentCreateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(experimentCreateParams: ExperimentCreateParams) = apply {
            body = experimentCreateParams.body.toBuilder()
            additionalHeaders = experimentCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = experimentCreateParams.additionalQueryParams.toBuilder()
        }

        /** Unique identifier for the project that the experiment belongs under */
        fun projectId(projectId: String) = apply { body.projectId(projectId) }

        /** Unique identifier for the project that the experiment belongs under */
        fun projectId(projectId: JsonField<String>) = apply { body.projectId(projectId) }

        /** Id of default base experiment to compare against when viewing this experiment */
        fun baseExpId(baseExpId: String?) = apply { body.baseExpId(baseExpId) }

        /** Id of default base experiment to compare against when viewing this experiment */
        fun baseExpId(baseExpId: Optional<String>) = baseExpId(baseExpId.orElse(null))

        /** Id of default base experiment to compare against when viewing this experiment */
        fun baseExpId(baseExpId: JsonField<String>) = apply { body.baseExpId(baseExpId) }

        /**
         * Identifier of the linked dataset, or null if the experiment is not linked to a dataset
         */
        fun datasetId(datasetId: String?) = apply { body.datasetId(datasetId) }

        /**
         * Identifier of the linked dataset, or null if the experiment is not linked to a dataset
         */
        fun datasetId(datasetId: Optional<String>) = datasetId(datasetId.orElse(null))

        /**
         * Identifier of the linked dataset, or null if the experiment is not linked to a dataset
         */
        fun datasetId(datasetId: JsonField<String>) = apply { body.datasetId(datasetId) }

        /**
         * Version number of the linked dataset the experiment was run against. This can be used to
         * reproduce the experiment after the dataset has been modified.
         */
        fun datasetVersion(datasetVersion: String?) = apply { body.datasetVersion(datasetVersion) }

        /**
         * Version number of the linked dataset the experiment was run against. This can be used to
         * reproduce the experiment after the dataset has been modified.
         */
        fun datasetVersion(datasetVersion: Optional<String>) =
            datasetVersion(datasetVersion.orElse(null))

        /**
         * Version number of the linked dataset the experiment was run against. This can be used to
         * reproduce the experiment after the dataset has been modified.
         */
        fun datasetVersion(datasetVersion: JsonField<String>) = apply {
            body.datasetVersion(datasetVersion)
        }

        /** Textual description of the experiment */
        fun description(description: String?) = apply { body.description(description) }

        /** Textual description of the experiment */
        fun description(description: Optional<String>) = description(description.orElse(null))

        /** Textual description of the experiment */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        /**
         * Normally, creating an experiment with the same name as an existing experiment will return
         * the existing one un-modified. But if `ensure_new` is true, registration will generate a
         * new experiment with a unique name in case of a conflict.
         */
        fun ensureNew(ensureNew: Boolean?) = apply { body.ensureNew(ensureNew) }

        /**
         * Normally, creating an experiment with the same name as an existing experiment will return
         * the existing one un-modified. But if `ensure_new` is true, registration will generate a
         * new experiment with a unique name in case of a conflict.
         */
        fun ensureNew(ensureNew: Boolean) = ensureNew(ensureNew as Boolean?)

        /**
         * Normally, creating an experiment with the same name as an existing experiment will return
         * the existing one un-modified. But if `ensure_new` is true, registration will generate a
         * new experiment with a unique name in case of a conflict.
         */
        @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
        fun ensureNew(ensureNew: Optional<Boolean>) = ensureNew(ensureNew.orElse(null) as Boolean?)

        /**
         * Normally, creating an experiment with the same name as an existing experiment will return
         * the existing one un-modified. But if `ensure_new` is true, registration will generate a
         * new experiment with a unique name in case of a conflict.
         */
        fun ensureNew(ensureNew: JsonField<Boolean>) = apply { body.ensureNew(ensureNew) }

        /** User-controlled metadata about the experiment */
        fun metadata(metadata: Metadata?) = apply { body.metadata(metadata) }

        /** User-controlled metadata about the experiment */
        fun metadata(metadata: Optional<Metadata>) = metadata(metadata.orElse(null))

        /** User-controlled metadata about the experiment */
        fun metadata(metadata: JsonField<Metadata>) = apply { body.metadata(metadata) }

        /** Name of the experiment. Within a project, experiment names are unique */
        fun name(name: String?) = apply { body.name(name) }

        /** Name of the experiment. Within a project, experiment names are unique */
        fun name(name: Optional<String>) = name(name.orElse(null))

        /** Name of the experiment. Within a project, experiment names are unique */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /**
         * Whether or not the experiment is public. Public experiments can be viewed by anybody
         * inside or outside the organization
         */
        fun public_(public_: Boolean?) = apply { body.public_(public_) }

        /**
         * Whether or not the experiment is public. Public experiments can be viewed by anybody
         * inside or outside the organization
         */
        fun public_(public_: Boolean) = public_(public_ as Boolean?)

        /**
         * Whether or not the experiment is public. Public experiments can be viewed by anybody
         * inside or outside the organization
         */
        @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
        fun public_(public_: Optional<Boolean>) = public_(public_.orElse(null) as Boolean?)

        /**
         * Whether or not the experiment is public. Public experiments can be viewed by anybody
         * inside or outside the organization
         */
        fun public_(public_: JsonField<Boolean>) = apply { body.public_(public_) }

        /** Metadata about the state of the repo when the experiment was created */
        fun repoInfo(repoInfo: RepoInfo?) = apply { body.repoInfo(repoInfo) }

        /** Metadata about the state of the repo when the experiment was created */
        fun repoInfo(repoInfo: Optional<RepoInfo>) = repoInfo(repoInfo.orElse(null))

        /** Metadata about the state of the repo when the experiment was created */
        fun repoInfo(repoInfo: JsonField<RepoInfo>) = apply { body.repoInfo(repoInfo) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        fun build(): ExperimentCreateParams =
            ExperimentCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    /** User-controlled metadata about the experiment */
    @NoAutoDetect
    class Metadata
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Metadata = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Metadata]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Metadata]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(metadata: Metadata) = apply {
                additionalProperties = metadata.additionalProperties.toMutableMap()
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

            fun build(): Metadata = Metadata(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Metadata && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ExperimentCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ExperimentCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
