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
import com.braintrustdata.api.errors.BraintrustInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

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

    /**
     * Unique identifier for the project that the experiment belongs under
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun projectId(): String = body.projectId()

    /**
     * Id of default base experiment to compare against when viewing this experiment
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun baseExpId(): Optional<String> = body.baseExpId()

    /**
     * Identifier of the linked dataset, or null if the experiment is not linked to a dataset
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun datasetId(): Optional<String> = body.datasetId()

    /**
     * Version number of the linked dataset the experiment was run against. This can be used to
     * reproduce the experiment after the dataset has been modified.
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun datasetVersion(): Optional<String> = body.datasetVersion()

    /**
     * Textual description of the experiment
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = body.description()

    /**
     * Normally, creating an experiment with the same name as an existing experiment will return the
     * existing one un-modified. But if `ensure_new` is true, registration will generate a new
     * experiment with a unique name in case of a conflict.
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun ensureNew(): Optional<Boolean> = body.ensureNew()

    /**
     * User-controlled metadata about the experiment
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun metadata(): Optional<Metadata> = body.metadata()

    /**
     * Name of the experiment. Within a project, experiment names are unique
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = body.name()

    /**
     * Whether or not the experiment is public. Public experiments can be viewed by anybody inside
     * or outside the organization
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun public_(): Optional<Boolean> = body.public_()

    /**
     * Metadata about the state of the repo when the experiment was created
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun repoInfo(): Optional<RepoInfo> = body.repoInfo()

    /**
     * Returns the raw JSON value of [projectId].
     *
     * Unlike [projectId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _projectId(): JsonField<String> = body._projectId()

    /**
     * Returns the raw JSON value of [baseExpId].
     *
     * Unlike [baseExpId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _baseExpId(): JsonField<String> = body._baseExpId()

    /**
     * Returns the raw JSON value of [datasetId].
     *
     * Unlike [datasetId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _datasetId(): JsonField<String> = body._datasetId()

    /**
     * Returns the raw JSON value of [datasetVersion].
     *
     * Unlike [datasetVersion], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _datasetVersion(): JsonField<String> = body._datasetVersion()

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _description(): JsonField<String> = body._description()

    /**
     * Returns the raw JSON value of [ensureNew].
     *
     * Unlike [ensureNew], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _ensureNew(): JsonField<Boolean> = body._ensureNew()

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _metadata(): JsonField<Metadata> = body._metadata()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [public_].
     *
     * Unlike [public_], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _public_(): JsonField<Boolean> = body._public_()

    /**
     * Returns the raw JSON value of [repoInfo].
     *
     * Unlike [repoInfo], this method doesn't throw if the JSON field has an unexpected type.
     */
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

        /**
         * Unique identifier for the project that the experiment belongs under
         *
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun projectId(): String = projectId.getRequired("project_id")

        /**
         * Id of default base experiment to compare against when viewing this experiment
         *
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun baseExpId(): Optional<String> =
            Optional.ofNullable(baseExpId.getNullable("base_exp_id"))

        /**
         * Identifier of the linked dataset, or null if the experiment is not linked to a dataset
         *
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun datasetId(): Optional<String> = Optional.ofNullable(datasetId.getNullable("dataset_id"))

        /**
         * Version number of the linked dataset the experiment was run against. This can be used to
         * reproduce the experiment after the dataset has been modified.
         *
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun datasetVersion(): Optional<String> =
            Optional.ofNullable(datasetVersion.getNullable("dataset_version"))

        /**
         * Textual description of the experiment
         *
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun description(): Optional<String> =
            Optional.ofNullable(description.getNullable("description"))

        /**
         * Normally, creating an experiment with the same name as an existing experiment will return
         * the existing one un-modified. But if `ensure_new` is true, registration will generate a
         * new experiment with a unique name in case of a conflict.
         *
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun ensureNew(): Optional<Boolean> =
            Optional.ofNullable(ensureNew.getNullable("ensure_new"))

        /**
         * User-controlled metadata about the experiment
         *
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata.getNullable("metadata"))

        /**
         * Name of the experiment. Within a project, experiment names are unique
         *
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

        /**
         * Whether or not the experiment is public. Public experiments can be viewed by anybody
         * inside or outside the organization
         *
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun public_(): Optional<Boolean> = Optional.ofNullable(public_.getNullable("public"))

        /**
         * Metadata about the state of the repo when the experiment was created
         *
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun repoInfo(): Optional<RepoInfo> = Optional.ofNullable(repoInfo.getNullable("repo_info"))

        /**
         * Returns the raw JSON value of [projectId].
         *
         * Unlike [projectId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("project_id") @ExcludeMissing fun _projectId(): JsonField<String> = projectId

        /**
         * Returns the raw JSON value of [baseExpId].
         *
         * Unlike [baseExpId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("base_exp_id") @ExcludeMissing fun _baseExpId(): JsonField<String> = baseExpId

        /**
         * Returns the raw JSON value of [datasetId].
         *
         * Unlike [datasetId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("dataset_id") @ExcludeMissing fun _datasetId(): JsonField<String> = datasetId

        /**
         * Returns the raw JSON value of [datasetVersion].
         *
         * Unlike [datasetVersion], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("dataset_version")
        @ExcludeMissing
        fun _datasetVersion(): JsonField<String> = datasetVersion

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [ensureNew].
         *
         * Unlike [ensureNew], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("ensure_new") @ExcludeMissing fun _ensureNew(): JsonField<Boolean> = ensureNew

        /**
         * Returns the raw JSON value of [metadata].
         *
         * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [public_].
         *
         * Unlike [public_], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("public") @ExcludeMissing fun _public_(): JsonField<Boolean> = public_

        /**
         * Returns the raw JSON value of [repoInfo].
         *
         * Unlike [repoInfo], this method doesn't throw if the JSON field has an unexpected type.
         */
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

            /**
             * Sets [Builder.projectId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.projectId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun projectId(projectId: JsonField<String>) = apply { this.projectId = projectId }

            /** Id of default base experiment to compare against when viewing this experiment */
            fun baseExpId(baseExpId: String?) = baseExpId(JsonField.ofNullable(baseExpId))

            /** Alias for calling [Builder.baseExpId] with `baseExpId.orElse(null)`. */
            fun baseExpId(baseExpId: Optional<String>) = baseExpId(baseExpId.getOrNull())

            /**
             * Sets [Builder.baseExpId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.baseExpId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun baseExpId(baseExpId: JsonField<String>) = apply { this.baseExpId = baseExpId }

            /**
             * Identifier of the linked dataset, or null if the experiment is not linked to a
             * dataset
             */
            fun datasetId(datasetId: String?) = datasetId(JsonField.ofNullable(datasetId))

            /** Alias for calling [Builder.datasetId] with `datasetId.orElse(null)`. */
            fun datasetId(datasetId: Optional<String>) = datasetId(datasetId.getOrNull())

            /**
             * Sets [Builder.datasetId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.datasetId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun datasetId(datasetId: JsonField<String>) = apply { this.datasetId = datasetId }

            /**
             * Version number of the linked dataset the experiment was run against. This can be used
             * to reproduce the experiment after the dataset has been modified.
             */
            fun datasetVersion(datasetVersion: String?) =
                datasetVersion(JsonField.ofNullable(datasetVersion))

            /** Alias for calling [Builder.datasetVersion] with `datasetVersion.orElse(null)`. */
            fun datasetVersion(datasetVersion: Optional<String>) =
                datasetVersion(datasetVersion.getOrNull())

            /**
             * Sets [Builder.datasetVersion] to an arbitrary JSON value.
             *
             * You should usually call [Builder.datasetVersion] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun datasetVersion(datasetVersion: JsonField<String>) = apply {
                this.datasetVersion = datasetVersion
            }

            /** Textual description of the experiment */
            fun description(description: String?) = description(JsonField.ofNullable(description))

            /** Alias for calling [Builder.description] with `description.orElse(null)`. */
            fun description(description: Optional<String>) = description(description.getOrNull())

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
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
             * Alias for [Builder.ensureNew].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun ensureNew(ensureNew: Boolean) = ensureNew(ensureNew as Boolean?)

            /** Alias for calling [Builder.ensureNew] with `ensureNew.orElse(null)`. */
            fun ensureNew(ensureNew: Optional<Boolean>) = ensureNew(ensureNew.getOrNull())

            /**
             * Sets [Builder.ensureNew] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ensureNew] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ensureNew(ensureNew: JsonField<Boolean>) = apply { this.ensureNew = ensureNew }

            /** User-controlled metadata about the experiment */
            fun metadata(metadata: Metadata?) = metadata(JsonField.ofNullable(metadata))

            /** Alias for calling [Builder.metadata] with `metadata.orElse(null)`. */
            fun metadata(metadata: Optional<Metadata>) = metadata(metadata.getOrNull())

            /**
             * Sets [Builder.metadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metadata] with a well-typed [Metadata] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            /** Name of the experiment. Within a project, experiment names are unique */
            fun name(name: String?) = name(JsonField.ofNullable(name))

            /** Alias for calling [Builder.name] with `name.orElse(null)`. */
            fun name(name: Optional<String>) = name(name.getOrNull())

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /**
             * Whether or not the experiment is public. Public experiments can be viewed by anybody
             * inside or outside the organization
             */
            fun public_(public_: Boolean?) = public_(JsonField.ofNullable(public_))

            /**
             * Alias for [Builder.public_].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun public_(public_: Boolean) = public_(public_ as Boolean?)

            /** Alias for calling [Builder.public_] with `public_.orElse(null)`. */
            fun public_(public_: Optional<Boolean>) = public_(public_.getOrNull())

            /**
             * Sets [Builder.public_] to an arbitrary JSON value.
             *
             * You should usually call [Builder.public_] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun public_(public_: JsonField<Boolean>) = apply { this.public_ = public_ }

            /** Metadata about the state of the repo when the experiment was created */
            fun repoInfo(repoInfo: RepoInfo?) = repoInfo(JsonField.ofNullable(repoInfo))

            /** Alias for calling [Builder.repoInfo] with `repoInfo.orElse(null)`. */
            fun repoInfo(repoInfo: Optional<RepoInfo>) = repoInfo(repoInfo.getOrNull())

            /**
             * Sets [Builder.repoInfo] to an arbitrary JSON value.
             *
             * You should usually call [Builder.repoInfo] with a well-typed [RepoInfo] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
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

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .projectId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
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

        /**
         * Sets [Builder.projectId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.projectId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun projectId(projectId: JsonField<String>) = apply { body.projectId(projectId) }

        /** Id of default base experiment to compare against when viewing this experiment */
        fun baseExpId(baseExpId: String?) = apply { body.baseExpId(baseExpId) }

        /** Alias for calling [Builder.baseExpId] with `baseExpId.orElse(null)`. */
        fun baseExpId(baseExpId: Optional<String>) = baseExpId(baseExpId.getOrNull())

        /**
         * Sets [Builder.baseExpId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.baseExpId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun baseExpId(baseExpId: JsonField<String>) = apply { body.baseExpId(baseExpId) }

        /**
         * Identifier of the linked dataset, or null if the experiment is not linked to a dataset
         */
        fun datasetId(datasetId: String?) = apply { body.datasetId(datasetId) }

        /** Alias for calling [Builder.datasetId] with `datasetId.orElse(null)`. */
        fun datasetId(datasetId: Optional<String>) = datasetId(datasetId.getOrNull())

        /**
         * Sets [Builder.datasetId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.datasetId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun datasetId(datasetId: JsonField<String>) = apply { body.datasetId(datasetId) }

        /**
         * Version number of the linked dataset the experiment was run against. This can be used to
         * reproduce the experiment after the dataset has been modified.
         */
        fun datasetVersion(datasetVersion: String?) = apply { body.datasetVersion(datasetVersion) }

        /** Alias for calling [Builder.datasetVersion] with `datasetVersion.orElse(null)`. */
        fun datasetVersion(datasetVersion: Optional<String>) =
            datasetVersion(datasetVersion.getOrNull())

        /**
         * Sets [Builder.datasetVersion] to an arbitrary JSON value.
         *
         * You should usually call [Builder.datasetVersion] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun datasetVersion(datasetVersion: JsonField<String>) = apply {
            body.datasetVersion(datasetVersion)
        }

        /** Textual description of the experiment */
        fun description(description: String?) = apply { body.description(description) }

        /** Alias for calling [Builder.description] with `description.orElse(null)`. */
        fun description(description: Optional<String>) = description(description.getOrNull())

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        /**
         * Normally, creating an experiment with the same name as an existing experiment will return
         * the existing one un-modified. But if `ensure_new` is true, registration will generate a
         * new experiment with a unique name in case of a conflict.
         */
        fun ensureNew(ensureNew: Boolean?) = apply { body.ensureNew(ensureNew) }

        /**
         * Alias for [Builder.ensureNew].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun ensureNew(ensureNew: Boolean) = ensureNew(ensureNew as Boolean?)

        /** Alias for calling [Builder.ensureNew] with `ensureNew.orElse(null)`. */
        fun ensureNew(ensureNew: Optional<Boolean>) = ensureNew(ensureNew.getOrNull())

        /**
         * Sets [Builder.ensureNew] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ensureNew] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun ensureNew(ensureNew: JsonField<Boolean>) = apply { body.ensureNew(ensureNew) }

        /** User-controlled metadata about the experiment */
        fun metadata(metadata: Metadata?) = apply { body.metadata(metadata) }

        /** Alias for calling [Builder.metadata] with `metadata.orElse(null)`. */
        fun metadata(metadata: Optional<Metadata>) = metadata(metadata.getOrNull())

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { body.metadata(metadata) }

        /** Name of the experiment. Within a project, experiment names are unique */
        fun name(name: String?) = apply { body.name(name) }

        /** Alias for calling [Builder.name] with `name.orElse(null)`. */
        fun name(name: Optional<String>) = name(name.getOrNull())

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /**
         * Whether or not the experiment is public. Public experiments can be viewed by anybody
         * inside or outside the organization
         */
        fun public_(public_: Boolean?) = apply { body.public_(public_) }

        /**
         * Alias for [Builder.public_].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun public_(public_: Boolean) = public_(public_ as Boolean?)

        /** Alias for calling [Builder.public_] with `public_.orElse(null)`. */
        fun public_(public_: Optional<Boolean>) = public_(public_.getOrNull())

        /**
         * Sets [Builder.public_] to an arbitrary JSON value.
         *
         * You should usually call [Builder.public_] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun public_(public_: JsonField<Boolean>) = apply { body.public_(public_) }

        /** Metadata about the state of the repo when the experiment was created */
        fun repoInfo(repoInfo: RepoInfo?) = apply { body.repoInfo(repoInfo) }

        /** Alias for calling [Builder.repoInfo] with `repoInfo.orElse(null)`. */
        fun repoInfo(repoInfo: Optional<RepoInfo>) = repoInfo(repoInfo.getOrNull())

        /**
         * Sets [Builder.repoInfo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.repoInfo] with a well-typed [RepoInfo] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
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

        /**
         * Returns an immutable instance of [ExperimentCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .projectId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
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

            /**
             * Returns an immutable instance of [Metadata].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
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
