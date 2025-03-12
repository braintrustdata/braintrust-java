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
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

@NoAutoDetect
class Experiment
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
    @JsonProperty("project_id")
    @ExcludeMissing
    private val projectId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("public")
    @ExcludeMissing
    private val public_: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("base_exp_id")
    @ExcludeMissing
    private val baseExpId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("commit")
    @ExcludeMissing
    private val commit: JsonField<String> = JsonMissing.of(),
    @JsonProperty("created")
    @ExcludeMissing
    private val created: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("dataset_id")
    @ExcludeMissing
    private val datasetId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("dataset_version")
    @ExcludeMissing
    private val datasetVersion: JsonField<String> = JsonMissing.of(),
    @JsonProperty("deleted_at")
    @ExcludeMissing
    private val deletedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("description")
    @ExcludeMissing
    private val description: JsonField<String> = JsonMissing.of(),
    @JsonProperty("metadata")
    @ExcludeMissing
    private val metadata: JsonField<Metadata> = JsonMissing.of(),
    @JsonProperty("repo_info")
    @ExcludeMissing
    private val repoInfo: JsonField<RepoInfo> = JsonMissing.of(),
    @JsonProperty("user_id")
    @ExcludeMissing
    private val userId: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** Unique identifier for the experiment */
    fun id(): String = id.getRequired("id")

    /** Name of the experiment. Within a project, experiment names are unique */
    fun name(): String = name.getRequired("name")

    /** Unique identifier for the project that the experiment belongs under */
    fun projectId(): String = projectId.getRequired("project_id")

    /**
     * Whether or not the experiment is public. Public experiments can be viewed by anybody inside
     * or outside the organization
     */
    fun public_(): Boolean = public_.getRequired("public")

    /** Id of default base experiment to compare against when viewing this experiment */
    fun baseExpId(): Optional<String> = Optional.ofNullable(baseExpId.getNullable("base_exp_id"))

    /** Commit, taken directly from `repo_info.commit` */
    fun commit(): Optional<String> = Optional.ofNullable(commit.getNullable("commit"))

    /** Date of experiment creation */
    fun created(): Optional<OffsetDateTime> = Optional.ofNullable(created.getNullable("created"))

    /** Identifier of the linked dataset, or null if the experiment is not linked to a dataset */
    fun datasetId(): Optional<String> = Optional.ofNullable(datasetId.getNullable("dataset_id"))

    /**
     * Version number of the linked dataset the experiment was run against. This can be used to
     * reproduce the experiment after the dataset has been modified.
     */
    fun datasetVersion(): Optional<String> =
        Optional.ofNullable(datasetVersion.getNullable("dataset_version"))

    /** Date of experiment deletion, or null if the experiment is still active */
    fun deletedAt(): Optional<OffsetDateTime> =
        Optional.ofNullable(deletedAt.getNullable("deleted_at"))

    /** Textual description of the experiment */
    fun description(): Optional<String> =
        Optional.ofNullable(description.getNullable("description"))

    /** User-controlled metadata about the experiment */
    fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata.getNullable("metadata"))

    /** Metadata about the state of the repo when the experiment was created */
    fun repoInfo(): Optional<RepoInfo> = Optional.ofNullable(repoInfo.getNullable("repo_info"))

    /** Identifies the user who created the experiment */
    fun userId(): Optional<String> = Optional.ofNullable(userId.getNullable("user_id"))

    /** Unique identifier for the experiment */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /** Name of the experiment. Within a project, experiment names are unique */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /** Unique identifier for the project that the experiment belongs under */
    @JsonProperty("project_id") @ExcludeMissing fun _projectId(): JsonField<String> = projectId

    /**
     * Whether or not the experiment is public. Public experiments can be viewed by anybody inside
     * or outside the organization
     */
    @JsonProperty("public") @ExcludeMissing fun _public_(): JsonField<Boolean> = public_

    /** Id of default base experiment to compare against when viewing this experiment */
    @JsonProperty("base_exp_id") @ExcludeMissing fun _baseExpId(): JsonField<String> = baseExpId

    /** Commit, taken directly from `repo_info.commit` */
    @JsonProperty("commit") @ExcludeMissing fun _commit(): JsonField<String> = commit

    /** Date of experiment creation */
    @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<OffsetDateTime> = created

    /** Identifier of the linked dataset, or null if the experiment is not linked to a dataset */
    @JsonProperty("dataset_id") @ExcludeMissing fun _datasetId(): JsonField<String> = datasetId

    /**
     * Version number of the linked dataset the experiment was run against. This can be used to
     * reproduce the experiment after the dataset has been modified.
     */
    @JsonProperty("dataset_version")
    @ExcludeMissing
    fun _datasetVersion(): JsonField<String> = datasetVersion

    /** Date of experiment deletion, or null if the experiment is still active */
    @JsonProperty("deleted_at")
    @ExcludeMissing
    fun _deletedAt(): JsonField<OffsetDateTime> = deletedAt

    /** Textual description of the experiment */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /** User-controlled metadata about the experiment */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    /** Metadata about the state of the repo when the experiment was created */
    @JsonProperty("repo_info") @ExcludeMissing fun _repoInfo(): JsonField<RepoInfo> = repoInfo

    /** Identifies the user who created the experiment */
    @JsonProperty("user_id") @ExcludeMissing fun _userId(): JsonField<String> = userId

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): Experiment = apply {
        if (validated) {
            return@apply
        }

        id()
        name()
        projectId()
        public_()
        baseExpId()
        commit()
        created()
        datasetId()
        datasetVersion()
        deletedAt()
        description()
        metadata().ifPresent { it.validate() }
        repoInfo().ifPresent { it.validate() }
        userId()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [Experiment].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .name()
         * .projectId()
         * .public_()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Experiment]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var projectId: JsonField<String>? = null
        private var public_: JsonField<Boolean>? = null
        private var baseExpId: JsonField<String> = JsonMissing.of()
        private var commit: JsonField<String> = JsonMissing.of()
        private var created: JsonField<OffsetDateTime> = JsonMissing.of()
        private var datasetId: JsonField<String> = JsonMissing.of()
        private var datasetVersion: JsonField<String> = JsonMissing.of()
        private var deletedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var repoInfo: JsonField<RepoInfo> = JsonMissing.of()
        private var userId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(experiment: Experiment) = apply {
            id = experiment.id
            name = experiment.name
            projectId = experiment.projectId
            public_ = experiment.public_
            baseExpId = experiment.baseExpId
            commit = experiment.commit
            created = experiment.created
            datasetId = experiment.datasetId
            datasetVersion = experiment.datasetVersion
            deletedAt = experiment.deletedAt
            description = experiment.description
            metadata = experiment.metadata
            repoInfo = experiment.repoInfo
            userId = experiment.userId
            additionalProperties = experiment.additionalProperties.toMutableMap()
        }

        /** Unique identifier for the experiment */
        fun id(id: String) = id(JsonField.of(id))

        /** Unique identifier for the experiment */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Name of the experiment. Within a project, experiment names are unique */
        fun name(name: String) = name(JsonField.of(name))

        /** Name of the experiment. Within a project, experiment names are unique */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Unique identifier for the project that the experiment belongs under */
        fun projectId(projectId: String) = projectId(JsonField.of(projectId))

        /** Unique identifier for the project that the experiment belongs under */
        fun projectId(projectId: JsonField<String>) = apply { this.projectId = projectId }

        /**
         * Whether or not the experiment is public. Public experiments can be viewed by anybody
         * inside or outside the organization
         */
        fun public_(public_: Boolean) = public_(JsonField.of(public_))

        /**
         * Whether or not the experiment is public. Public experiments can be viewed by anybody
         * inside or outside the organization
         */
        fun public_(public_: JsonField<Boolean>) = apply { this.public_ = public_ }

        /** Id of default base experiment to compare against when viewing this experiment */
        fun baseExpId(baseExpId: String?) = baseExpId(JsonField.ofNullable(baseExpId))

        /** Id of default base experiment to compare against when viewing this experiment */
        fun baseExpId(baseExpId: Optional<String>) = baseExpId(baseExpId.getOrNull())

        /** Id of default base experiment to compare against when viewing this experiment */
        fun baseExpId(baseExpId: JsonField<String>) = apply { this.baseExpId = baseExpId }

        /** Commit, taken directly from `repo_info.commit` */
        fun commit(commit: String?) = commit(JsonField.ofNullable(commit))

        /** Commit, taken directly from `repo_info.commit` */
        fun commit(commit: Optional<String>) = commit(commit.getOrNull())

        /** Commit, taken directly from `repo_info.commit` */
        fun commit(commit: JsonField<String>) = apply { this.commit = commit }

        /** Date of experiment creation */
        fun created(created: OffsetDateTime?) = created(JsonField.ofNullable(created))

        /** Date of experiment creation */
        fun created(created: Optional<OffsetDateTime>) = created(created.getOrNull())

        /** Date of experiment creation */
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /**
         * Identifier of the linked dataset, or null if the experiment is not linked to a dataset
         */
        fun datasetId(datasetId: String?) = datasetId(JsonField.ofNullable(datasetId))

        /**
         * Identifier of the linked dataset, or null if the experiment is not linked to a dataset
         */
        fun datasetId(datasetId: Optional<String>) = datasetId(datasetId.getOrNull())

        /**
         * Identifier of the linked dataset, or null if the experiment is not linked to a dataset
         */
        fun datasetId(datasetId: JsonField<String>) = apply { this.datasetId = datasetId }

        /**
         * Version number of the linked dataset the experiment was run against. This can be used to
         * reproduce the experiment after the dataset has been modified.
         */
        fun datasetVersion(datasetVersion: String?) =
            datasetVersion(JsonField.ofNullable(datasetVersion))

        /**
         * Version number of the linked dataset the experiment was run against. This can be used to
         * reproduce the experiment after the dataset has been modified.
         */
        fun datasetVersion(datasetVersion: Optional<String>) =
            datasetVersion(datasetVersion.getOrNull())

        /**
         * Version number of the linked dataset the experiment was run against. This can be used to
         * reproduce the experiment after the dataset has been modified.
         */
        fun datasetVersion(datasetVersion: JsonField<String>) = apply {
            this.datasetVersion = datasetVersion
        }

        /** Date of experiment deletion, or null if the experiment is still active */
        fun deletedAt(deletedAt: OffsetDateTime?) = deletedAt(JsonField.ofNullable(deletedAt))

        /** Date of experiment deletion, or null if the experiment is still active */
        fun deletedAt(deletedAt: Optional<OffsetDateTime>) = deletedAt(deletedAt.getOrNull())

        /** Date of experiment deletion, or null if the experiment is still active */
        fun deletedAt(deletedAt: JsonField<OffsetDateTime>) = apply { this.deletedAt = deletedAt }

        /** Textual description of the experiment */
        fun description(description: String?) = description(JsonField.ofNullable(description))

        /** Textual description of the experiment */
        fun description(description: Optional<String>) = description(description.getOrNull())

        /** Textual description of the experiment */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** User-controlled metadata about the experiment */
        fun metadata(metadata: Metadata?) = metadata(JsonField.ofNullable(metadata))

        /** User-controlled metadata about the experiment */
        fun metadata(metadata: Optional<Metadata>) = metadata(metadata.getOrNull())

        /** User-controlled metadata about the experiment */
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        /** Metadata about the state of the repo when the experiment was created */
        fun repoInfo(repoInfo: RepoInfo?) = repoInfo(JsonField.ofNullable(repoInfo))

        /** Metadata about the state of the repo when the experiment was created */
        fun repoInfo(repoInfo: Optional<RepoInfo>) = repoInfo(repoInfo.getOrNull())

        /** Metadata about the state of the repo when the experiment was created */
        fun repoInfo(repoInfo: JsonField<RepoInfo>) = apply { this.repoInfo = repoInfo }

        /** Identifies the user who created the experiment */
        fun userId(userId: String?) = userId(JsonField.ofNullable(userId))

        /** Identifies the user who created the experiment */
        fun userId(userId: Optional<String>) = userId(userId.getOrNull())

        /** Identifies the user who created the experiment */
        fun userId(userId: JsonField<String>) = apply { this.userId = userId }

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

        fun build(): Experiment =
            Experiment(
                checkRequired("id", id),
                checkRequired("name", name),
                checkRequired("projectId", projectId),
                checkRequired("public_", public_),
                baseExpId,
                commit,
                created,
                datasetId,
                datasetVersion,
                deletedAt,
                description,
                metadata,
                repoInfo,
                userId,
                additionalProperties.toImmutable(),
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

        return /* spotless:off */ other is Experiment && id == other.id && name == other.name && projectId == other.projectId && public_ == other.public_ && baseExpId == other.baseExpId && commit == other.commit && created == other.created && datasetId == other.datasetId && datasetVersion == other.datasetVersion && deletedAt == other.deletedAt && description == other.description && metadata == other.metadata && repoInfo == other.repoInfo && userId == other.userId && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, name, projectId, public_, baseExpId, commit, created, datasetId, datasetVersion, deletedAt, description, metadata, repoInfo, userId, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Experiment{id=$id, name=$name, projectId=$projectId, public_=$public_, baseExpId=$baseExpId, commit=$commit, created=$created, datasetId=$datasetId, datasetVersion=$datasetVersion, deletedAt=$deletedAt, description=$description, metadata=$metadata, repoInfo=$repoInfo, userId=$userId, additionalProperties=$additionalProperties}"
}
