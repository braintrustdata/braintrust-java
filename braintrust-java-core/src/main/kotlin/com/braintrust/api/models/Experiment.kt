// File generated from our OpenAPI spec by Stainless.

package com.braintrust.api.models

import com.braintrust.api.core.ExcludeMissing
import com.braintrust.api.core.JsonField
import com.braintrust.api.core.JsonMissing
import com.braintrust.api.core.JsonValue
import com.braintrust.api.core.NoAutoDetect
import com.braintrust.api.core.toUnmodifiable
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = Experiment.Builder::class)
@NoAutoDetect
class Experiment
private constructor(
    private val id: JsonField<String>,
    private val projectId: JsonField<String>,
    private val name: JsonField<String>,
    private val description: JsonField<String>,
    private val created: JsonField<OffsetDateTime>,
    private val repoInfo: JsonField<RepoInfo>,
    private val commit: JsonField<String>,
    private val baseExpId: JsonField<String>,
    private val deletedAt: JsonField<OffsetDateTime>,
    private val datasetId: JsonField<String>,
    private val datasetVersion: JsonField<String>,
    private val public_: JsonField<Boolean>,
    private val userId: JsonField<String>,
    private val metadata: JsonField<Metadata>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** Unique identifier for the experiment */
    fun id(): String = id.getRequired("id")

    /** Unique identifier for the project that the experiment belongs under */
    fun projectId(): String = projectId.getRequired("project_id")

    /** Name of the experiment. Within a project, experiment names are unique */
    fun name(): String = name.getRequired("name")

    /** Textual description of the experiment */
    fun description(): Optional<String> =
        Optional.ofNullable(description.getNullable("description"))

    /** Date of experiment creation */
    fun created(): Optional<OffsetDateTime> = Optional.ofNullable(created.getNullable("created"))

    /** Metadata about the state of the repo when the experiment was created */
    fun repoInfo(): Optional<RepoInfo> = Optional.ofNullable(repoInfo.getNullable("repo_info"))

    /** Commit, taken directly from `repo_info.commit` */
    fun commit(): Optional<String> = Optional.ofNullable(commit.getNullable("commit"))

    /** Id of default base experiment to compare against when viewing this experiment */
    fun baseExpId(): Optional<String> = Optional.ofNullable(baseExpId.getNullable("base_exp_id"))

    /** Date of experiment deletion, or null if the experiment is still active */
    fun deletedAt(): Optional<OffsetDateTime> =
        Optional.ofNullable(deletedAt.getNullable("deleted_at"))

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
    fun public_(): Boolean = public_.getRequired("public")

    /** Identifies the user who created the experiment */
    fun userId(): Optional<String> = Optional.ofNullable(userId.getNullable("user_id"))

    /** User-controlled metadata about the experiment */
    fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata.getNullable("metadata"))

    /** Unique identifier for the experiment */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /** Unique identifier for the project that the experiment belongs under */
    @JsonProperty("project_id") @ExcludeMissing fun _projectId() = projectId

    /** Name of the experiment. Within a project, experiment names are unique */
    @JsonProperty("name") @ExcludeMissing fun _name() = name

    /** Textual description of the experiment */
    @JsonProperty("description") @ExcludeMissing fun _description() = description

    /** Date of experiment creation */
    @JsonProperty("created") @ExcludeMissing fun _created() = created

    /** Metadata about the state of the repo when the experiment was created */
    @JsonProperty("repo_info") @ExcludeMissing fun _repoInfo() = repoInfo

    /** Commit, taken directly from `repo_info.commit` */
    @JsonProperty("commit") @ExcludeMissing fun _commit() = commit

    /** Id of default base experiment to compare against when viewing this experiment */
    @JsonProperty("base_exp_id") @ExcludeMissing fun _baseExpId() = baseExpId

    /** Date of experiment deletion, or null if the experiment is still active */
    @JsonProperty("deleted_at") @ExcludeMissing fun _deletedAt() = deletedAt

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

    /** Identifies the user who created the experiment */
    @JsonProperty("user_id") @ExcludeMissing fun _userId() = userId

    /** User-controlled metadata about the experiment */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata() = metadata

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): Experiment = apply {
        if (!validated) {
            id()
            projectId()
            name()
            description()
            created()
            repoInfo().map { it.validate() }
            commit()
            baseExpId()
            deletedAt()
            datasetId()
            datasetVersion()
            public_()
            userId()
            metadata().map { it.validate() }
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Experiment &&
            this.id == other.id &&
            this.projectId == other.projectId &&
            this.name == other.name &&
            this.description == other.description &&
            this.created == other.created &&
            this.repoInfo == other.repoInfo &&
            this.commit == other.commit &&
            this.baseExpId == other.baseExpId &&
            this.deletedAt == other.deletedAt &&
            this.datasetId == other.datasetId &&
            this.datasetVersion == other.datasetVersion &&
            this.public_ == other.public_ &&
            this.userId == other.userId &&
            this.metadata == other.metadata &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    id,
                    projectId,
                    name,
                    description,
                    created,
                    repoInfo,
                    commit,
                    baseExpId,
                    deletedAt,
                    datasetId,
                    datasetVersion,
                    public_,
                    userId,
                    metadata,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "Experiment{id=$id, projectId=$projectId, name=$name, description=$description, created=$created, repoInfo=$repoInfo, commit=$commit, baseExpId=$baseExpId, deletedAt=$deletedAt, datasetId=$datasetId, datasetVersion=$datasetVersion, public_=$public_, userId=$userId, metadata=$metadata, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var projectId: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var created: JsonField<OffsetDateTime> = JsonMissing.of()
        private var repoInfo: JsonField<RepoInfo> = JsonMissing.of()
        private var commit: JsonField<String> = JsonMissing.of()
        private var baseExpId: JsonField<String> = JsonMissing.of()
        private var deletedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var datasetId: JsonField<String> = JsonMissing.of()
        private var datasetVersion: JsonField<String> = JsonMissing.of()
        private var public_: JsonField<Boolean> = JsonMissing.of()
        private var userId: JsonField<String> = JsonMissing.of()
        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(experiment: Experiment) = apply {
            this.id = experiment.id
            this.projectId = experiment.projectId
            this.name = experiment.name
            this.description = experiment.description
            this.created = experiment.created
            this.repoInfo = experiment.repoInfo
            this.commit = experiment.commit
            this.baseExpId = experiment.baseExpId
            this.deletedAt = experiment.deletedAt
            this.datasetId = experiment.datasetId
            this.datasetVersion = experiment.datasetVersion
            this.public_ = experiment.public_
            this.userId = experiment.userId
            this.metadata = experiment.metadata
            additionalProperties(experiment.additionalProperties)
        }

        /** Unique identifier for the experiment */
        fun id(id: String) = id(JsonField.of(id))

        /** Unique identifier for the experiment */
        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

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

        /** Date of experiment creation */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /** Date of experiment creation */
        @JsonProperty("created")
        @ExcludeMissing
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /** Metadata about the state of the repo when the experiment was created */
        fun repoInfo(repoInfo: RepoInfo) = repoInfo(JsonField.of(repoInfo))

        /** Metadata about the state of the repo when the experiment was created */
        @JsonProperty("repo_info")
        @ExcludeMissing
        fun repoInfo(repoInfo: JsonField<RepoInfo>) = apply { this.repoInfo = repoInfo }

        /** Commit, taken directly from `repo_info.commit` */
        fun commit(commit: String) = commit(JsonField.of(commit))

        /** Commit, taken directly from `repo_info.commit` */
        @JsonProperty("commit")
        @ExcludeMissing
        fun commit(commit: JsonField<String>) = apply { this.commit = commit }

        /** Id of default base experiment to compare against when viewing this experiment */
        fun baseExpId(baseExpId: String) = baseExpId(JsonField.of(baseExpId))

        /** Id of default base experiment to compare against when viewing this experiment */
        @JsonProperty("base_exp_id")
        @ExcludeMissing
        fun baseExpId(baseExpId: JsonField<String>) = apply { this.baseExpId = baseExpId }

        /** Date of experiment deletion, or null if the experiment is still active */
        fun deletedAt(deletedAt: OffsetDateTime) = deletedAt(JsonField.of(deletedAt))

        /** Date of experiment deletion, or null if the experiment is still active */
        @JsonProperty("deleted_at")
        @ExcludeMissing
        fun deletedAt(deletedAt: JsonField<OffsetDateTime>) = apply { this.deletedAt = deletedAt }

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

        /** Identifies the user who created the experiment */
        fun userId(userId: String) = userId(JsonField.of(userId))

        /** Identifies the user who created the experiment */
        @JsonProperty("user_id")
        @ExcludeMissing
        fun userId(userId: JsonField<String>) = apply { this.userId = userId }

        /** User-controlled metadata about the experiment */
        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

        /** User-controlled metadata about the experiment */
        @JsonProperty("metadata")
        @ExcludeMissing
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

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

        fun build(): Experiment =
            Experiment(
                id,
                projectId,
                name,
                description,
                created,
                repoInfo,
                commit,
                baseExpId,
                deletedAt,
                datasetId,
                datasetVersion,
                public_,
                userId,
                metadata,
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

    /** Metadata about the state of the repo when the experiment was created */
    @JsonDeserialize(builder = RepoInfo.Builder::class)
    @NoAutoDetect
    class RepoInfo
    private constructor(
        private val commit: JsonField<String>,
        private val branch: JsonField<String>,
        private val tag: JsonField<String>,
        private val dirty: JsonField<Boolean>,
        private val authorName: JsonField<String>,
        private val authorEmail: JsonField<String>,
        private val commitMessage: JsonField<String>,
        private val commitTime: JsonField<String>,
        private val gitDiff: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /** SHA of most recent commit */
        fun commit(): Optional<String> = Optional.ofNullable(commit.getNullable("commit"))

        /** Name of the branch the most recent commit belongs to */
        fun branch(): Optional<String> = Optional.ofNullable(branch.getNullable("branch"))

        /** Name of the tag on the most recent commit */
        fun tag(): Optional<String> = Optional.ofNullable(tag.getNullable("tag"))

        /** Whether or not the repo had uncommitted changes when snapshotted */
        fun dirty(): Optional<Boolean> = Optional.ofNullable(dirty.getNullable("dirty"))

        /** Name of the author of the most recent commit */
        fun authorName(): Optional<String> =
            Optional.ofNullable(authorName.getNullable("author_name"))

        /** Email of the author of the most recent commit */
        fun authorEmail(): Optional<String> =
            Optional.ofNullable(authorEmail.getNullable("author_email"))

        /** Most recent commit message */
        fun commitMessage(): Optional<String> =
            Optional.ofNullable(commitMessage.getNullable("commit_message"))

        /** Time of the most recent commit */
        fun commitTime(): Optional<String> =
            Optional.ofNullable(commitTime.getNullable("commit_time"))

        /**
         * If the repo was dirty when run, this includes the diff between the current state of the
         * repo and the most recent commit.
         */
        fun gitDiff(): Optional<String> = Optional.ofNullable(gitDiff.getNullable("git_diff"))

        /** SHA of most recent commit */
        @JsonProperty("commit") @ExcludeMissing fun _commit() = commit

        /** Name of the branch the most recent commit belongs to */
        @JsonProperty("branch") @ExcludeMissing fun _branch() = branch

        /** Name of the tag on the most recent commit */
        @JsonProperty("tag") @ExcludeMissing fun _tag() = tag

        /** Whether or not the repo had uncommitted changes when snapshotted */
        @JsonProperty("dirty") @ExcludeMissing fun _dirty() = dirty

        /** Name of the author of the most recent commit */
        @JsonProperty("author_name") @ExcludeMissing fun _authorName() = authorName

        /** Email of the author of the most recent commit */
        @JsonProperty("author_email") @ExcludeMissing fun _authorEmail() = authorEmail

        /** Most recent commit message */
        @JsonProperty("commit_message") @ExcludeMissing fun _commitMessage() = commitMessage

        /** Time of the most recent commit */
        @JsonProperty("commit_time") @ExcludeMissing fun _commitTime() = commitTime

        /**
         * If the repo was dirty when run, this includes the diff between the current state of the
         * repo and the most recent commit.
         */
        @JsonProperty("git_diff") @ExcludeMissing fun _gitDiff() = gitDiff

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): RepoInfo = apply {
            if (!validated) {
                commit()
                branch()
                tag()
                dirty()
                authorName()
                authorEmail()
                commitMessage()
                commitTime()
                gitDiff()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is RepoInfo &&
                this.commit == other.commit &&
                this.branch == other.branch &&
                this.tag == other.tag &&
                this.dirty == other.dirty &&
                this.authorName == other.authorName &&
                this.authorEmail == other.authorEmail &&
                this.commitMessage == other.commitMessage &&
                this.commitTime == other.commitTime &&
                this.gitDiff == other.gitDiff &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        commit,
                        branch,
                        tag,
                        dirty,
                        authorName,
                        authorEmail,
                        commitMessage,
                        commitTime,
                        gitDiff,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "RepoInfo{commit=$commit, branch=$branch, tag=$tag, dirty=$dirty, authorName=$authorName, authorEmail=$authorEmail, commitMessage=$commitMessage, commitTime=$commitTime, gitDiff=$gitDiff, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var commit: JsonField<String> = JsonMissing.of()
            private var branch: JsonField<String> = JsonMissing.of()
            private var tag: JsonField<String> = JsonMissing.of()
            private var dirty: JsonField<Boolean> = JsonMissing.of()
            private var authorName: JsonField<String> = JsonMissing.of()
            private var authorEmail: JsonField<String> = JsonMissing.of()
            private var commitMessage: JsonField<String> = JsonMissing.of()
            private var commitTime: JsonField<String> = JsonMissing.of()
            private var gitDiff: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(repoInfo: RepoInfo) = apply {
                this.commit = repoInfo.commit
                this.branch = repoInfo.branch
                this.tag = repoInfo.tag
                this.dirty = repoInfo.dirty
                this.authorName = repoInfo.authorName
                this.authorEmail = repoInfo.authorEmail
                this.commitMessage = repoInfo.commitMessage
                this.commitTime = repoInfo.commitTime
                this.gitDiff = repoInfo.gitDiff
                additionalProperties(repoInfo.additionalProperties)
            }

            /** SHA of most recent commit */
            fun commit(commit: String) = commit(JsonField.of(commit))

            /** SHA of most recent commit */
            @JsonProperty("commit")
            @ExcludeMissing
            fun commit(commit: JsonField<String>) = apply { this.commit = commit }

            /** Name of the branch the most recent commit belongs to */
            fun branch(branch: String) = branch(JsonField.of(branch))

            /** Name of the branch the most recent commit belongs to */
            @JsonProperty("branch")
            @ExcludeMissing
            fun branch(branch: JsonField<String>) = apply { this.branch = branch }

            /** Name of the tag on the most recent commit */
            fun tag(tag: String) = tag(JsonField.of(tag))

            /** Name of the tag on the most recent commit */
            @JsonProperty("tag")
            @ExcludeMissing
            fun tag(tag: JsonField<String>) = apply { this.tag = tag }

            /** Whether or not the repo had uncommitted changes when snapshotted */
            fun dirty(dirty: Boolean) = dirty(JsonField.of(dirty))

            /** Whether or not the repo had uncommitted changes when snapshotted */
            @JsonProperty("dirty")
            @ExcludeMissing
            fun dirty(dirty: JsonField<Boolean>) = apply { this.dirty = dirty }

            /** Name of the author of the most recent commit */
            fun authorName(authorName: String) = authorName(JsonField.of(authorName))

            /** Name of the author of the most recent commit */
            @JsonProperty("author_name")
            @ExcludeMissing
            fun authorName(authorName: JsonField<String>) = apply { this.authorName = authorName }

            /** Email of the author of the most recent commit */
            fun authorEmail(authorEmail: String) = authorEmail(JsonField.of(authorEmail))

            /** Email of the author of the most recent commit */
            @JsonProperty("author_email")
            @ExcludeMissing
            fun authorEmail(authorEmail: JsonField<String>) = apply {
                this.authorEmail = authorEmail
            }

            /** Most recent commit message */
            fun commitMessage(commitMessage: String) = commitMessage(JsonField.of(commitMessage))

            /** Most recent commit message */
            @JsonProperty("commit_message")
            @ExcludeMissing
            fun commitMessage(commitMessage: JsonField<String>) = apply {
                this.commitMessage = commitMessage
            }

            /** Time of the most recent commit */
            fun commitTime(commitTime: String) = commitTime(JsonField.of(commitTime))

            /** Time of the most recent commit */
            @JsonProperty("commit_time")
            @ExcludeMissing
            fun commitTime(commitTime: JsonField<String>) = apply { this.commitTime = commitTime }

            /**
             * If the repo was dirty when run, this includes the diff between the current state of
             * the repo and the most recent commit.
             */
            fun gitDiff(gitDiff: String) = gitDiff(JsonField.of(gitDiff))

            /**
             * If the repo was dirty when run, this includes the diff between the current state of
             * the repo and the most recent commit.
             */
            @JsonProperty("git_diff")
            @ExcludeMissing
            fun gitDiff(gitDiff: JsonField<String>) = apply { this.gitDiff = gitDiff }

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

            fun build(): RepoInfo =
                RepoInfo(
                    commit,
                    branch,
                    tag,
                    dirty,
                    authorName,
                    authorEmail,
                    commitMessage,
                    commitTime,
                    gitDiff,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }
}
