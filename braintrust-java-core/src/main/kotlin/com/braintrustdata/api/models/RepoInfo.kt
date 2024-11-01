// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.toImmutable
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import java.util.Objects
import java.util.Optional

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

    /** SHA of most recent commit */
    fun commit(): Optional<String> = Optional.ofNullable(commit.getNullable("commit"))

    /** Name of the branch the most recent commit belongs to */
    fun branch(): Optional<String> = Optional.ofNullable(branch.getNullable("branch"))

    /** Name of the tag on the most recent commit */
    fun tag(): Optional<String> = Optional.ofNullable(tag.getNullable("tag"))

    /** Whether or not the repo had uncommitted changes when snapshotted */
    fun dirty(): Optional<Boolean> = Optional.ofNullable(dirty.getNullable("dirty"))

    /** Name of the author of the most recent commit */
    fun authorName(): Optional<String> = Optional.ofNullable(authorName.getNullable("author_name"))

    /** Email of the author of the most recent commit */
    fun authorEmail(): Optional<String> =
        Optional.ofNullable(authorEmail.getNullable("author_email"))

    /** Most recent commit message */
    fun commitMessage(): Optional<String> =
        Optional.ofNullable(commitMessage.getNullable("commit_message"))

    /** Time of the most recent commit */
    fun commitTime(): Optional<String> = Optional.ofNullable(commitTime.getNullable("commit_time"))

    /**
     * If the repo was dirty when run, this includes the diff between the current state of the repo
     * and the most recent commit.
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
     * If the repo was dirty when run, this includes the diff between the current state of the repo
     * and the most recent commit.
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
        fun authorEmail(authorEmail: JsonField<String>) = apply { this.authorEmail = authorEmail }

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
         * If the repo was dirty when run, this includes the diff between the current state of the
         * repo and the most recent commit.
         */
        fun gitDiff(gitDiff: String) = gitDiff(JsonField.of(gitDiff))

        /**
         * If the repo was dirty when run, this includes the diff between the current state of the
         * repo and the most recent commit.
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
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is RepoInfo && this.commit == other.commit && this.branch == other.branch && this.tag == other.tag && this.dirty == other.dirty && this.authorName == other.authorName && this.authorEmail == other.authorEmail && this.commitMessage == other.commitMessage && this.commitTime == other.commitTime && this.gitDiff == other.gitDiff && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(commit, branch, tag, dirty, authorName, authorEmail, commitMessage, commitTime, gitDiff, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() =
        "RepoInfo{commit=$commit, branch=$branch, tag=$tag, dirty=$dirty, authorName=$authorName, authorEmail=$authorEmail, commitMessage=$commitMessage, commitTime=$commitTime, gitDiff=$gitDiff, additionalProperties=$additionalProperties}"
}
