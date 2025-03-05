// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.immutableEmptyMap
import com.braintrustdata.api.core.toImmutable
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Objects
import java.util.Optional

/** Metadata about the state of the repo when the experiment was created */
@NoAutoDetect
class RepoInfo
@JsonCreator
private constructor(
    @JsonProperty("author_email")
    @ExcludeMissing
    private val authorEmail: JsonField<String> = JsonMissing.of(),
    @JsonProperty("author_name")
    @ExcludeMissing
    private val authorName: JsonField<String> = JsonMissing.of(),
    @JsonProperty("branch")
    @ExcludeMissing
    private val branch: JsonField<String> = JsonMissing.of(),
    @JsonProperty("commit")
    @ExcludeMissing
    private val commit: JsonField<String> = JsonMissing.of(),
    @JsonProperty("commit_message")
    @ExcludeMissing
    private val commitMessage: JsonField<String> = JsonMissing.of(),
    @JsonProperty("commit_time")
    @ExcludeMissing
    private val commitTime: JsonField<String> = JsonMissing.of(),
    @JsonProperty("dirty") @ExcludeMissing private val dirty: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("git_diff")
    @ExcludeMissing
    private val gitDiff: JsonField<String> = JsonMissing.of(),
    @JsonProperty("tag") @ExcludeMissing private val tag: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** Email of the author of the most recent commit */
    fun authorEmail(): Optional<String> =
        Optional.ofNullable(authorEmail.getNullable("author_email"))

    /** Name of the author of the most recent commit */
    fun authorName(): Optional<String> = Optional.ofNullable(authorName.getNullable("author_name"))

    /** Name of the branch the most recent commit belongs to */
    fun branch(): Optional<String> = Optional.ofNullable(branch.getNullable("branch"))

    /** SHA of most recent commit */
    fun commit(): Optional<String> = Optional.ofNullable(commit.getNullable("commit"))

    /** Most recent commit message */
    fun commitMessage(): Optional<String> =
        Optional.ofNullable(commitMessage.getNullable("commit_message"))

    /** Time of the most recent commit */
    fun commitTime(): Optional<String> = Optional.ofNullable(commitTime.getNullable("commit_time"))

    /** Whether or not the repo had uncommitted changes when snapshotted */
    fun dirty(): Optional<Boolean> = Optional.ofNullable(dirty.getNullable("dirty"))

    /**
     * If the repo was dirty when run, this includes the diff between the current state of the repo
     * and the most recent commit.
     */
    fun gitDiff(): Optional<String> = Optional.ofNullable(gitDiff.getNullable("git_diff"))

    /** Name of the tag on the most recent commit */
    fun tag(): Optional<String> = Optional.ofNullable(tag.getNullable("tag"))

    /** Email of the author of the most recent commit */
    @JsonProperty("author_email")
    @ExcludeMissing
    fun _authorEmail(): JsonField<String> = authorEmail

    /** Name of the author of the most recent commit */
    @JsonProperty("author_name") @ExcludeMissing fun _authorName(): JsonField<String> = authorName

    /** Name of the branch the most recent commit belongs to */
    @JsonProperty("branch") @ExcludeMissing fun _branch(): JsonField<String> = branch

    /** SHA of most recent commit */
    @JsonProperty("commit") @ExcludeMissing fun _commit(): JsonField<String> = commit

    /** Most recent commit message */
    @JsonProperty("commit_message")
    @ExcludeMissing
    fun _commitMessage(): JsonField<String> = commitMessage

    /** Time of the most recent commit */
    @JsonProperty("commit_time") @ExcludeMissing fun _commitTime(): JsonField<String> = commitTime

    /** Whether or not the repo had uncommitted changes when snapshotted */
    @JsonProperty("dirty") @ExcludeMissing fun _dirty(): JsonField<Boolean> = dirty

    /**
     * If the repo was dirty when run, this includes the diff between the current state of the repo
     * and the most recent commit.
     */
    @JsonProperty("git_diff") @ExcludeMissing fun _gitDiff(): JsonField<String> = gitDiff

    /** Name of the tag on the most recent commit */
    @JsonProperty("tag") @ExcludeMissing fun _tag(): JsonField<String> = tag

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): RepoInfo = apply {
        if (validated) {
            return@apply
        }

        authorEmail()
        authorName()
        branch()
        commit()
        commitMessage()
        commitTime()
        dirty()
        gitDiff()
        tag()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /** Returns a mutable builder for constructing an instance of [RepoInfo]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RepoInfo]. */
    class Builder internal constructor() {

        private var authorEmail: JsonField<String> = JsonMissing.of()
        private var authorName: JsonField<String> = JsonMissing.of()
        private var branch: JsonField<String> = JsonMissing.of()
        private var commit: JsonField<String> = JsonMissing.of()
        private var commitMessage: JsonField<String> = JsonMissing.of()
        private var commitTime: JsonField<String> = JsonMissing.of()
        private var dirty: JsonField<Boolean> = JsonMissing.of()
        private var gitDiff: JsonField<String> = JsonMissing.of()
        private var tag: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(repoInfo: RepoInfo) = apply {
            authorEmail = repoInfo.authorEmail
            authorName = repoInfo.authorName
            branch = repoInfo.branch
            commit = repoInfo.commit
            commitMessage = repoInfo.commitMessage
            commitTime = repoInfo.commitTime
            dirty = repoInfo.dirty
            gitDiff = repoInfo.gitDiff
            tag = repoInfo.tag
            additionalProperties = repoInfo.additionalProperties.toMutableMap()
        }

        /** Email of the author of the most recent commit */
        fun authorEmail(authorEmail: String?) = authorEmail(JsonField.ofNullable(authorEmail))

        /** Email of the author of the most recent commit */
        fun authorEmail(authorEmail: Optional<String>) = authorEmail(authorEmail.orElse(null))

        /** Email of the author of the most recent commit */
        fun authorEmail(authorEmail: JsonField<String>) = apply { this.authorEmail = authorEmail }

        /** Name of the author of the most recent commit */
        fun authorName(authorName: String?) = authorName(JsonField.ofNullable(authorName))

        /** Name of the author of the most recent commit */
        fun authorName(authorName: Optional<String>) = authorName(authorName.orElse(null))

        /** Name of the author of the most recent commit */
        fun authorName(authorName: JsonField<String>) = apply { this.authorName = authorName }

        /** Name of the branch the most recent commit belongs to */
        fun branch(branch: String?) = branch(JsonField.ofNullable(branch))

        /** Name of the branch the most recent commit belongs to */
        fun branch(branch: Optional<String>) = branch(branch.orElse(null))

        /** Name of the branch the most recent commit belongs to */
        fun branch(branch: JsonField<String>) = apply { this.branch = branch }

        /** SHA of most recent commit */
        fun commit(commit: String?) = commit(JsonField.ofNullable(commit))

        /** SHA of most recent commit */
        fun commit(commit: Optional<String>) = commit(commit.orElse(null))

        /** SHA of most recent commit */
        fun commit(commit: JsonField<String>) = apply { this.commit = commit }

        /** Most recent commit message */
        fun commitMessage(commitMessage: String?) =
            commitMessage(JsonField.ofNullable(commitMessage))

        /** Most recent commit message */
        fun commitMessage(commitMessage: Optional<String>) =
            commitMessage(commitMessage.orElse(null))

        /** Most recent commit message */
        fun commitMessage(commitMessage: JsonField<String>) = apply {
            this.commitMessage = commitMessage
        }

        /** Time of the most recent commit */
        fun commitTime(commitTime: String?) = commitTime(JsonField.ofNullable(commitTime))

        /** Time of the most recent commit */
        fun commitTime(commitTime: Optional<String>) = commitTime(commitTime.orElse(null))

        /** Time of the most recent commit */
        fun commitTime(commitTime: JsonField<String>) = apply { this.commitTime = commitTime }

        /** Whether or not the repo had uncommitted changes when snapshotted */
        fun dirty(dirty: Boolean?) = dirty(JsonField.ofNullable(dirty))

        /** Whether or not the repo had uncommitted changes when snapshotted */
        fun dirty(dirty: Boolean) = dirty(dirty as Boolean?)

        /** Whether or not the repo had uncommitted changes when snapshotted */
        @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
        fun dirty(dirty: Optional<Boolean>) = dirty(dirty.orElse(null) as Boolean?)

        /** Whether or not the repo had uncommitted changes when snapshotted */
        fun dirty(dirty: JsonField<Boolean>) = apply { this.dirty = dirty }

        /**
         * If the repo was dirty when run, this includes the diff between the current state of the
         * repo and the most recent commit.
         */
        fun gitDiff(gitDiff: String?) = gitDiff(JsonField.ofNullable(gitDiff))

        /**
         * If the repo was dirty when run, this includes the diff between the current state of the
         * repo and the most recent commit.
         */
        fun gitDiff(gitDiff: Optional<String>) = gitDiff(gitDiff.orElse(null))

        /**
         * If the repo was dirty when run, this includes the diff between the current state of the
         * repo and the most recent commit.
         */
        fun gitDiff(gitDiff: JsonField<String>) = apply { this.gitDiff = gitDiff }

        /** Name of the tag on the most recent commit */
        fun tag(tag: String?) = tag(JsonField.ofNullable(tag))

        /** Name of the tag on the most recent commit */
        fun tag(tag: Optional<String>) = tag(tag.orElse(null))

        /** Name of the tag on the most recent commit */
        fun tag(tag: JsonField<String>) = apply { this.tag = tag }

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

        fun build(): RepoInfo =
            RepoInfo(
                authorEmail,
                authorName,
                branch,
                commit,
                commitMessage,
                commitTime,
                dirty,
                gitDiff,
                tag,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is RepoInfo && authorEmail == other.authorEmail && authorName == other.authorName && branch == other.branch && commit == other.commit && commitMessage == other.commitMessage && commitTime == other.commitTime && dirty == other.dirty && gitDiff == other.gitDiff && tag == other.tag && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(authorEmail, authorName, branch, commit, commitMessage, commitTime, dirty, gitDiff, tag, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RepoInfo{authorEmail=$authorEmail, authorName=$authorName, branch=$branch, commit=$commit, commitMessage=$commitMessage, commitTime=$commitTime, dirty=$dirty, gitDiff=$gitDiff, tag=$tag, additionalProperties=$additionalProperties}"
}
