// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
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

    /**
     * Email of the author of the most recent commit
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun authorEmail(): Optional<String> =
        Optional.ofNullable(authorEmail.getNullable("author_email"))

    /**
     * Name of the author of the most recent commit
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun authorName(): Optional<String> = Optional.ofNullable(authorName.getNullable("author_name"))

    /**
     * Name of the branch the most recent commit belongs to
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun branch(): Optional<String> = Optional.ofNullable(branch.getNullable("branch"))

    /**
     * SHA of most recent commit
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun commit(): Optional<String> = Optional.ofNullable(commit.getNullable("commit"))

    /**
     * Most recent commit message
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun commitMessage(): Optional<String> =
        Optional.ofNullable(commitMessage.getNullable("commit_message"))

    /**
     * Time of the most recent commit
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun commitTime(): Optional<String> = Optional.ofNullable(commitTime.getNullable("commit_time"))

    /**
     * Whether or not the repo had uncommitted changes when snapshotted
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dirty(): Optional<Boolean> = Optional.ofNullable(dirty.getNullable("dirty"))

    /**
     * If the repo was dirty when run, this includes the diff between the current state of the repo
     * and the most recent commit.
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun gitDiff(): Optional<String> = Optional.ofNullable(gitDiff.getNullable("git_diff"))

    /**
     * Name of the tag on the most recent commit
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tag(): Optional<String> = Optional.ofNullable(tag.getNullable("tag"))

    /**
     * Returns the raw JSON value of [authorEmail].
     *
     * Unlike [authorEmail], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("author_email")
    @ExcludeMissing
    fun _authorEmail(): JsonField<String> = authorEmail

    /**
     * Returns the raw JSON value of [authorName].
     *
     * Unlike [authorName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("author_name") @ExcludeMissing fun _authorName(): JsonField<String> = authorName

    /**
     * Returns the raw JSON value of [branch].
     *
     * Unlike [branch], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("branch") @ExcludeMissing fun _branch(): JsonField<String> = branch

    /**
     * Returns the raw JSON value of [commit].
     *
     * Unlike [commit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("commit") @ExcludeMissing fun _commit(): JsonField<String> = commit

    /**
     * Returns the raw JSON value of [commitMessage].
     *
     * Unlike [commitMessage], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("commit_message")
    @ExcludeMissing
    fun _commitMessage(): JsonField<String> = commitMessage

    /**
     * Returns the raw JSON value of [commitTime].
     *
     * Unlike [commitTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("commit_time") @ExcludeMissing fun _commitTime(): JsonField<String> = commitTime

    /**
     * Returns the raw JSON value of [dirty].
     *
     * Unlike [dirty], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dirty") @ExcludeMissing fun _dirty(): JsonField<Boolean> = dirty

    /**
     * Returns the raw JSON value of [gitDiff].
     *
     * Unlike [gitDiff], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("git_diff") @ExcludeMissing fun _gitDiff(): JsonField<String> = gitDiff

    /**
     * Returns the raw JSON value of [tag].
     *
     * Unlike [tag], this method doesn't throw if the JSON field has an unexpected type.
     */
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

        /** Alias for calling [Builder.authorEmail] with `authorEmail.orElse(null)`. */
        fun authorEmail(authorEmail: Optional<String>) = authorEmail(authorEmail.getOrNull())

        /**
         * Sets [Builder.authorEmail] to an arbitrary JSON value.
         *
         * You should usually call [Builder.authorEmail] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun authorEmail(authorEmail: JsonField<String>) = apply { this.authorEmail = authorEmail }

        /** Name of the author of the most recent commit */
        fun authorName(authorName: String?) = authorName(JsonField.ofNullable(authorName))

        /** Alias for calling [Builder.authorName] with `authorName.orElse(null)`. */
        fun authorName(authorName: Optional<String>) = authorName(authorName.getOrNull())

        /**
         * Sets [Builder.authorName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.authorName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun authorName(authorName: JsonField<String>) = apply { this.authorName = authorName }

        /** Name of the branch the most recent commit belongs to */
        fun branch(branch: String?) = branch(JsonField.ofNullable(branch))

        /** Alias for calling [Builder.branch] with `branch.orElse(null)`. */
        fun branch(branch: Optional<String>) = branch(branch.getOrNull())

        /**
         * Sets [Builder.branch] to an arbitrary JSON value.
         *
         * You should usually call [Builder.branch] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun branch(branch: JsonField<String>) = apply { this.branch = branch }

        /** SHA of most recent commit */
        fun commit(commit: String?) = commit(JsonField.ofNullable(commit))

        /** Alias for calling [Builder.commit] with `commit.orElse(null)`. */
        fun commit(commit: Optional<String>) = commit(commit.getOrNull())

        /**
         * Sets [Builder.commit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.commit] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun commit(commit: JsonField<String>) = apply { this.commit = commit }

        /** Most recent commit message */
        fun commitMessage(commitMessage: String?) =
            commitMessage(JsonField.ofNullable(commitMessage))

        /** Alias for calling [Builder.commitMessage] with `commitMessage.orElse(null)`. */
        fun commitMessage(commitMessage: Optional<String>) =
            commitMessage(commitMessage.getOrNull())

        /**
         * Sets [Builder.commitMessage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.commitMessage] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun commitMessage(commitMessage: JsonField<String>) = apply {
            this.commitMessage = commitMessage
        }

        /** Time of the most recent commit */
        fun commitTime(commitTime: String?) = commitTime(JsonField.ofNullable(commitTime))

        /** Alias for calling [Builder.commitTime] with `commitTime.orElse(null)`. */
        fun commitTime(commitTime: Optional<String>) = commitTime(commitTime.getOrNull())

        /**
         * Sets [Builder.commitTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.commitTime] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun commitTime(commitTime: JsonField<String>) = apply { this.commitTime = commitTime }

        /** Whether or not the repo had uncommitted changes when snapshotted */
        fun dirty(dirty: Boolean?) = dirty(JsonField.ofNullable(dirty))

        /**
         * Alias for [Builder.dirty].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun dirty(dirty: Boolean) = dirty(dirty as Boolean?)

        /** Alias for calling [Builder.dirty] with `dirty.orElse(null)`. */
        fun dirty(dirty: Optional<Boolean>) = dirty(dirty.getOrNull())

        /**
         * Sets [Builder.dirty] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dirty] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun dirty(dirty: JsonField<Boolean>) = apply { this.dirty = dirty }

        /**
         * If the repo was dirty when run, this includes the diff between the current state of the
         * repo and the most recent commit.
         */
        fun gitDiff(gitDiff: String?) = gitDiff(JsonField.ofNullable(gitDiff))

        /** Alias for calling [Builder.gitDiff] with `gitDiff.orElse(null)`. */
        fun gitDiff(gitDiff: Optional<String>) = gitDiff(gitDiff.getOrNull())

        /**
         * Sets [Builder.gitDiff] to an arbitrary JSON value.
         *
         * You should usually call [Builder.gitDiff] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun gitDiff(gitDiff: JsonField<String>) = apply { this.gitDiff = gitDiff }

        /** Name of the tag on the most recent commit */
        fun tag(tag: String?) = tag(JsonField.ofNullable(tag))

        /** Alias for calling [Builder.tag] with `tag.orElse(null)`. */
        fun tag(tag: Optional<String>) = tag(tag.getOrNull())

        /**
         * Sets [Builder.tag] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tag] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
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

        /**
         * Returns an immutable instance of [RepoInfo].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
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
