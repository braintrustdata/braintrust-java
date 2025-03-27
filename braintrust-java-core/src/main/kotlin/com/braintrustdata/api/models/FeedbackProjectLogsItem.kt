// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.Enum
import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.checkKnown
import com.braintrustdata.api.core.checkRequired
import com.braintrustdata.api.core.toImmutable
import com.braintrustdata.api.errors.BraintrustInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class FeedbackProjectLogsItem
private constructor(
    private val id: JsonField<String>,
    private val comment: JsonField<String>,
    private val expected: JsonValue,
    private val metadata: JsonField<Metadata>,
    private val scores: JsonField<Scores>,
    private val source: JsonField<Source>,
    private val tags: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("comment") @ExcludeMissing comment: JsonField<String> = JsonMissing.of(),
        @JsonProperty("expected") @ExcludeMissing expected: JsonValue = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("scores") @ExcludeMissing scores: JsonField<Scores> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<Source> = JsonMissing.of(),
        @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<String>> = JsonMissing.of(),
    ) : this(id, comment, expected, metadata, scores, source, tags, mutableMapOf())

    /**
     * The id of the project logs event to log feedback for. This is the row `id` returned by `POST
     * /v1/project_logs/{project_id}/insert`
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * An optional comment string to log about the project logs event
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun comment(): Optional<String> = Optional.ofNullable(comment.getNullable("comment"))

    /**
     * The ground truth value (an arbitrary, JSON serializable object) that you'd compare to
     * `output` to determine if your `output` value is correct or not
     */
    @JsonProperty("expected") @ExcludeMissing fun _expected(): JsonValue = expected

    /**
     * A dictionary with additional data about the feedback. If you have a `user_id`, you can log it
     * here and access it in the Braintrust UI. Note, this metadata does not correspond to the main
     * event itself, but rather the audit log attached to the event.
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata.getNullable("metadata"))

    /**
     * A dictionary of numeric values (between 0 and 1) to log. These scores will be merged into the
     * existing scores for the project logs event
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun scores(): Optional<Scores> = Optional.ofNullable(scores.getNullable("scores"))

    /**
     * The source of the feedback. Must be one of "external" (default), "app", or "api"
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun source(): Optional<Source> = Optional.ofNullable(source.getNullable("source"))

    /**
     * A list of tags to log
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tags(): Optional<List<String>> = Optional.ofNullable(tags.getNullable("tags"))

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [comment].
     *
     * Unlike [comment], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("comment") @ExcludeMissing fun _comment(): JsonField<String> = comment

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    /**
     * Returns the raw JSON value of [scores].
     *
     * Unlike [scores], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("scores") @ExcludeMissing fun _scores(): JsonField<Scores> = scores

    /**
     * Returns the raw JSON value of [source].
     *
     * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("source") @ExcludeMissing fun _source(): JsonField<Source> = source

    /**
     * Returns the raw JSON value of [tags].
     *
     * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<String>> = tags

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [FeedbackProjectLogsItem].
         *
         * The following fields are required:
         * ```java
         * .id()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FeedbackProjectLogsItem]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var comment: JsonField<String> = JsonMissing.of()
        private var expected: JsonValue = JsonMissing.of()
        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var scores: JsonField<Scores> = JsonMissing.of()
        private var source: JsonField<Source> = JsonMissing.of()
        private var tags: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(feedbackProjectLogsItem: FeedbackProjectLogsItem) = apply {
            id = feedbackProjectLogsItem.id
            comment = feedbackProjectLogsItem.comment
            expected = feedbackProjectLogsItem.expected
            metadata = feedbackProjectLogsItem.metadata
            scores = feedbackProjectLogsItem.scores
            source = feedbackProjectLogsItem.source
            tags = feedbackProjectLogsItem.tags.map { it.toMutableList() }
            additionalProperties = feedbackProjectLogsItem.additionalProperties.toMutableMap()
        }

        /**
         * The id of the project logs event to log feedback for. This is the row `id` returned by
         * `POST /v1/project_logs/{project_id}/insert`
         */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** An optional comment string to log about the project logs event */
        fun comment(comment: String?) = comment(JsonField.ofNullable(comment))

        /** Alias for calling [Builder.comment] with `comment.orElse(null)`. */
        fun comment(comment: Optional<String>) = comment(comment.getOrNull())

        /**
         * Sets [Builder.comment] to an arbitrary JSON value.
         *
         * You should usually call [Builder.comment] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun comment(comment: JsonField<String>) = apply { this.comment = comment }

        /**
         * The ground truth value (an arbitrary, JSON serializable object) that you'd compare to
         * `output` to determine if your `output` value is correct or not
         */
        fun expected(expected: JsonValue) = apply { this.expected = expected }

        /**
         * A dictionary with additional data about the feedback. If you have a `user_id`, you can
         * log it here and access it in the Braintrust UI. Note, this metadata does not correspond
         * to the main event itself, but rather the audit log attached to the event.
         */
        fun metadata(metadata: Metadata?) = metadata(JsonField.ofNullable(metadata))

        /** Alias for calling [Builder.metadata] with `metadata.orElse(null)`. */
        fun metadata(metadata: Optional<Metadata>) = metadata(metadata.getOrNull())

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        /**
         * A dictionary of numeric values (between 0 and 1) to log. These scores will be merged into
         * the existing scores for the project logs event
         */
        fun scores(scores: Scores?) = scores(JsonField.ofNullable(scores))

        /** Alias for calling [Builder.scores] with `scores.orElse(null)`. */
        fun scores(scores: Optional<Scores>) = scores(scores.getOrNull())

        /**
         * Sets [Builder.scores] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scores] with a well-typed [Scores] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun scores(scores: JsonField<Scores>) = apply { this.scores = scores }

        /** The source of the feedback. Must be one of "external" (default), "app", or "api" */
        fun source(source: Source?) = source(JsonField.ofNullable(source))

        /** Alias for calling [Builder.source] with `source.orElse(null)`. */
        fun source(source: Optional<Source>) = source(source.getOrNull())

        /**
         * Sets [Builder.source] to an arbitrary JSON value.
         *
         * You should usually call [Builder.source] with a well-typed [Source] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun source(source: JsonField<Source>) = apply { this.source = source }

        /** A list of tags to log */
        fun tags(tags: List<String>?) = tags(JsonField.ofNullable(tags))

        /** Alias for calling [Builder.tags] with `tags.orElse(null)`. */
        fun tags(tags: Optional<List<String>>) = tags(tags.getOrNull())

        /**
         * Sets [Builder.tags] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tags] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tags(tags: JsonField<List<String>>) = apply {
            this.tags = tags.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [tags].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTag(tag: String) = apply {
            tags = (tags ?: JsonField.of(mutableListOf())).also { checkKnown("tags", it).add(tag) }
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
         * Returns an immutable instance of [FeedbackProjectLogsItem].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): FeedbackProjectLogsItem =
            FeedbackProjectLogsItem(
                checkRequired("id", id),
                comment,
                expected,
                metadata,
                scores,
                source,
                (tags ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): FeedbackProjectLogsItem = apply {
        if (validated) {
            return@apply
        }

        id()
        comment()
        metadata().ifPresent { it.validate() }
        scores().ifPresent { it.validate() }
        source()
        tags()
        validated = true
    }

    /**
     * A dictionary with additional data about the feedback. If you have a `user_id`, you can log it
     * here and access it in the Braintrust UI. Note, this metadata does not correspond to the main
     * event itself, but rather the audit log attached to the event.
     */
    class Metadata
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

        private var validated: Boolean = false

        fun validate(): Metadata = apply {
            if (validated) {
                return@apply
            }

            validated = true
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

    /**
     * A dictionary of numeric values (between 0 and 1) to log. These scores will be merged into the
     * existing scores for the project logs event
     */
    class Scores
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Scores]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Scores]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(scores: Scores) = apply {
                additionalProperties = scores.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Scores].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Scores = Scores(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Scores = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Scores && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Scores{additionalProperties=$additionalProperties}"
    }

    /** The source of the feedback. Must be one of "external" (default), "app", or "api" */
    class Source @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val APP = of("app")

            @JvmField val API = of("api")

            @JvmField val EXTERNAL = of("external")

            @JvmStatic fun of(value: String) = Source(JsonField.of(value))
        }

        /** An enum containing [Source]'s known values. */
        enum class Known {
            APP,
            API,
            EXTERNAL,
        }

        /**
         * An enum containing [Source]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Source] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            APP,
            API,
            EXTERNAL,
            /** An enum member indicating that [Source] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                APP -> Value.APP
                API -> Value.API
                EXTERNAL -> Value.EXTERNAL
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws BraintrustInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                APP -> Known.APP
                API -> Known.API
                EXTERNAL -> Known.EXTERNAL
                else -> throw BraintrustInvalidDataException("Unknown Source: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws BraintrustInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                BraintrustInvalidDataException("Value is not a String")
            }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Source && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is FeedbackProjectLogsItem && id == other.id && comment == other.comment && expected == other.expected && metadata == other.metadata && scores == other.scores && source == other.source && tags == other.tags && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, comment, expected, metadata, scores, source, tags, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "FeedbackProjectLogsItem{id=$id, comment=$comment, expected=$expected, metadata=$metadata, scores=$scores, source=$source, tags=$tags, additionalProperties=$additionalProperties}"
}
