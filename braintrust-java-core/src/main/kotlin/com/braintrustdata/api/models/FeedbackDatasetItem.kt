// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.Enum
import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.checkRequired
import com.braintrustdata.api.core.immutableEmptyMap
import com.braintrustdata.api.core.toImmutable
import com.braintrustdata.api.errors.BraintrustInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class FeedbackDatasetItem
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("comment")
    @ExcludeMissing
    private val comment: JsonField<String> = JsonMissing.of(),
    @JsonProperty("metadata")
    @ExcludeMissing
    private val metadata: JsonField<Metadata> = JsonMissing.of(),
    @JsonProperty("source")
    @ExcludeMissing
    private val source: JsonField<Source> = JsonMissing.of(),
    @JsonProperty("tags")
    @ExcludeMissing
    private val tags: JsonField<List<String>> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * The id of the dataset event to log feedback for. This is the row `id` returned by `POST
     * /v1/dataset/{dataset_id}/insert`
     */
    fun id(): String = id.getRequired("id")

    /** An optional comment string to log about the dataset event */
    fun comment(): Optional<String> = Optional.ofNullable(comment.getNullable("comment"))

    /**
     * A dictionary with additional data about the feedback. If you have a `user_id`, you can log it
     * here and access it in the Braintrust UI. Note, this metadata does not correspond to the main
     * event itself, but rather the audit log attached to the event.
     */
    fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata.getNullable("metadata"))

    /** The source of the feedback. Must be one of "external" (default), "app", or "api" */
    fun source(): Optional<Source> = Optional.ofNullable(source.getNullable("source"))

    /** A list of tags to log */
    fun tags(): Optional<List<String>> = Optional.ofNullable(tags.getNullable("tags"))

    /**
     * The id of the dataset event to log feedback for. This is the row `id` returned by `POST
     * /v1/dataset/{dataset_id}/insert`
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /** An optional comment string to log about the dataset event */
    @JsonProperty("comment") @ExcludeMissing fun _comment(): JsonField<String> = comment

    /**
     * A dictionary with additional data about the feedback. If you have a `user_id`, you can log it
     * here and access it in the Braintrust UI. Note, this metadata does not correspond to the main
     * event itself, but rather the audit log attached to the event.
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    /** The source of the feedback. Must be one of "external" (default), "app", or "api" */
    @JsonProperty("source") @ExcludeMissing fun _source(): JsonField<Source> = source

    /** A list of tags to log */
    @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<String>> = tags

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): FeedbackDatasetItem = apply {
        if (validated) {
            return@apply
        }

        id()
        comment()
        metadata().ifPresent { it.validate() }
        source()
        tags()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FeedbackDatasetItem]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var comment: JsonField<String> = JsonMissing.of()
        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var source: JsonField<Source> = JsonMissing.of()
        private var tags: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(feedbackDatasetItem: FeedbackDatasetItem) = apply {
            id = feedbackDatasetItem.id
            comment = feedbackDatasetItem.comment
            metadata = feedbackDatasetItem.metadata
            source = feedbackDatasetItem.source
            tags = feedbackDatasetItem.tags.map { it.toMutableList() }
            additionalProperties = feedbackDatasetItem.additionalProperties.toMutableMap()
        }

        /**
         * The id of the dataset event to log feedback for. This is the row `id` returned by `POST
         * /v1/dataset/{dataset_id}/insert`
         */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * The id of the dataset event to log feedback for. This is the row `id` returned by `POST
         * /v1/dataset/{dataset_id}/insert`
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** An optional comment string to log about the dataset event */
        fun comment(comment: String?) = comment(JsonField.ofNullable(comment))

        /** An optional comment string to log about the dataset event */
        fun comment(comment: Optional<String>) = comment(comment.orElse(null))

        /** An optional comment string to log about the dataset event */
        fun comment(comment: JsonField<String>) = apply { this.comment = comment }

        /**
         * A dictionary with additional data about the feedback. If you have a `user_id`, you can
         * log it here and access it in the Braintrust UI. Note, this metadata does not correspond
         * to the main event itself, but rather the audit log attached to the event.
         */
        fun metadata(metadata: Metadata?) = metadata(JsonField.ofNullable(metadata))

        /**
         * A dictionary with additional data about the feedback. If you have a `user_id`, you can
         * log it here and access it in the Braintrust UI. Note, this metadata does not correspond
         * to the main event itself, but rather the audit log attached to the event.
         */
        fun metadata(metadata: Optional<Metadata>) = metadata(metadata.orElse(null))

        /**
         * A dictionary with additional data about the feedback. If you have a `user_id`, you can
         * log it here and access it in the Braintrust UI. Note, this metadata does not correspond
         * to the main event itself, but rather the audit log attached to the event.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        /** The source of the feedback. Must be one of "external" (default), "app", or "api" */
        fun source(source: Source?) = source(JsonField.ofNullable(source))

        /** The source of the feedback. Must be one of "external" (default), "app", or "api" */
        fun source(source: Optional<Source>) = source(source.orElse(null))

        /** The source of the feedback. Must be one of "external" (default), "app", or "api" */
        fun source(source: JsonField<Source>) = apply { this.source = source }

        /** A list of tags to log */
        fun tags(tags: List<String>?) = tags(JsonField.ofNullable(tags))

        /** A list of tags to log */
        fun tags(tags: Optional<List<String>>) = tags(tags.orElse(null))

        /** A list of tags to log */
        fun tags(tags: JsonField<List<String>>) = apply {
            this.tags = tags.map { it.toMutableList() }
        }

        /** A list of tags to log */
        fun addTag(tag: String) = apply {
            tags =
                (tags ?: JsonField.of(mutableListOf())).apply {
                    asKnown()
                        .orElseThrow {
                            IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            )
                        }
                        .add(tag)
                }
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

        fun build(): FeedbackDatasetItem =
            FeedbackDatasetItem(
                checkRequired("id", id),
                comment,
                metadata,
                source,
                (tags ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toImmutable(),
            )
    }

    /**
     * A dictionary with additional data about the feedback. If you have a `user_id`, you can log it
     * here and access it in the Braintrust UI. Note, this metadata does not correspond to the main
     * event itself, but rather the audit log attached to the event.
     */
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

        return /* spotless:off */ other is FeedbackDatasetItem && id == other.id && comment == other.comment && metadata == other.metadata && source == other.source && tags == other.tags && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, comment, metadata, source, tags, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "FeedbackDatasetItem{id=$id, comment=$comment, metadata=$metadata, source=$source, tags=$tags, additionalProperties=$additionalProperties}"
}
