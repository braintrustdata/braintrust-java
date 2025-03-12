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
class SpanIFrame
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
    @JsonProperty("project_id")
    @ExcludeMissing
    private val projectId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("url") @ExcludeMissing private val url: JsonField<String> = JsonMissing.of(),
    @JsonProperty("created")
    @ExcludeMissing
    private val created: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("deleted_at")
    @ExcludeMissing
    private val deletedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("description")
    @ExcludeMissing
    private val description: JsonField<String> = JsonMissing.of(),
    @JsonProperty("post_message")
    @ExcludeMissing
    private val postMessage: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("user_id")
    @ExcludeMissing
    private val userId: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** Unique identifier for the span iframe */
    fun id(): String = id.getRequired("id")

    /** Name of the span iframe */
    fun name(): String = name.getRequired("name")

    /** Unique identifier for the project that the span iframe belongs under */
    fun projectId(): String = projectId.getRequired("project_id")

    /** URL to embed the project viewer in an iframe */
    fun url(): String = url.getRequired("url")

    /** Date of span iframe creation */
    fun created(): Optional<OffsetDateTime> = Optional.ofNullable(created.getNullable("created"))

    /** Date of span iframe deletion, or null if the span iframe is still active */
    fun deletedAt(): Optional<OffsetDateTime> =
        Optional.ofNullable(deletedAt.getNullable("deleted_at"))

    /** Textual description of the span iframe */
    fun description(): Optional<String> =
        Optional.ofNullable(description.getNullable("description"))

    /**
     * Whether to post messages to the iframe containing the span's data. This is useful when you
     * want to render more data than fits in the URL.
     */
    fun postMessage(): Optional<Boolean> =
        Optional.ofNullable(postMessage.getNullable("post_message"))

    /** Identifies the user who created the span iframe */
    fun userId(): Optional<String> = Optional.ofNullable(userId.getNullable("user_id"))

    /** Unique identifier for the span iframe */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /** Name of the span iframe */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /** Unique identifier for the project that the span iframe belongs under */
    @JsonProperty("project_id") @ExcludeMissing fun _projectId(): JsonField<String> = projectId

    /** URL to embed the project viewer in an iframe */
    @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

    /** Date of span iframe creation */
    @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<OffsetDateTime> = created

    /** Date of span iframe deletion, or null if the span iframe is still active */
    @JsonProperty("deleted_at")
    @ExcludeMissing
    fun _deletedAt(): JsonField<OffsetDateTime> = deletedAt

    /** Textual description of the span iframe */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Whether to post messages to the iframe containing the span's data. This is useful when you
     * want to render more data than fits in the URL.
     */
    @JsonProperty("post_message")
    @ExcludeMissing
    fun _postMessage(): JsonField<Boolean> = postMessage

    /** Identifies the user who created the span iframe */
    @JsonProperty("user_id") @ExcludeMissing fun _userId(): JsonField<String> = userId

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): SpanIFrame = apply {
        if (validated) {
            return@apply
        }

        id()
        name()
        projectId()
        url()
        created()
        deletedAt()
        description()
        postMessage()
        userId()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SpanIFrame].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .name()
         * .projectId()
         * .url()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SpanIFrame]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var projectId: JsonField<String>? = null
        private var url: JsonField<String>? = null
        private var created: JsonField<OffsetDateTime> = JsonMissing.of()
        private var deletedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var postMessage: JsonField<Boolean> = JsonMissing.of()
        private var userId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(spanIFrame: SpanIFrame) = apply {
            id = spanIFrame.id
            name = spanIFrame.name
            projectId = spanIFrame.projectId
            url = spanIFrame.url
            created = spanIFrame.created
            deletedAt = spanIFrame.deletedAt
            description = spanIFrame.description
            postMessage = spanIFrame.postMessage
            userId = spanIFrame.userId
            additionalProperties = spanIFrame.additionalProperties.toMutableMap()
        }

        /** Unique identifier for the span iframe */
        fun id(id: String) = id(JsonField.of(id))

        /** Unique identifier for the span iframe */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Name of the span iframe */
        fun name(name: String) = name(JsonField.of(name))

        /** Name of the span iframe */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Unique identifier for the project that the span iframe belongs under */
        fun projectId(projectId: String) = projectId(JsonField.of(projectId))

        /** Unique identifier for the project that the span iframe belongs under */
        fun projectId(projectId: JsonField<String>) = apply { this.projectId = projectId }

        /** URL to embed the project viewer in an iframe */
        fun url(url: String) = url(JsonField.of(url))

        /** URL to embed the project viewer in an iframe */
        fun url(url: JsonField<String>) = apply { this.url = url }

        /** Date of span iframe creation */
        fun created(created: OffsetDateTime?) = created(JsonField.ofNullable(created))

        /** Date of span iframe creation */
        fun created(created: Optional<OffsetDateTime>) = created(created.getOrNull())

        /** Date of span iframe creation */
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /** Date of span iframe deletion, or null if the span iframe is still active */
        fun deletedAt(deletedAt: OffsetDateTime?) = deletedAt(JsonField.ofNullable(deletedAt))

        /** Date of span iframe deletion, or null if the span iframe is still active */
        fun deletedAt(deletedAt: Optional<OffsetDateTime>) = deletedAt(deletedAt.getOrNull())

        /** Date of span iframe deletion, or null if the span iframe is still active */
        fun deletedAt(deletedAt: JsonField<OffsetDateTime>) = apply { this.deletedAt = deletedAt }

        /** Textual description of the span iframe */
        fun description(description: String?) = description(JsonField.ofNullable(description))

        /** Textual description of the span iframe */
        fun description(description: Optional<String>) = description(description.getOrNull())

        /** Textual description of the span iframe */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /**
         * Whether to post messages to the iframe containing the span's data. This is useful when
         * you want to render more data than fits in the URL.
         */
        fun postMessage(postMessage: Boolean?) = postMessage(JsonField.ofNullable(postMessage))

        /**
         * Whether to post messages to the iframe containing the span's data. This is useful when
         * you want to render more data than fits in the URL.
         */
        fun postMessage(postMessage: Boolean) = postMessage(postMessage as Boolean?)

        /**
         * Whether to post messages to the iframe containing the span's data. This is useful when
         * you want to render more data than fits in the URL.
         */
        fun postMessage(postMessage: Optional<Boolean>) = postMessage(postMessage.getOrNull())

        /**
         * Whether to post messages to the iframe containing the span's data. This is useful when
         * you want to render more data than fits in the URL.
         */
        fun postMessage(postMessage: JsonField<Boolean>) = apply { this.postMessage = postMessage }

        /** Identifies the user who created the span iframe */
        fun userId(userId: String?) = userId(JsonField.ofNullable(userId))

        /** Identifies the user who created the span iframe */
        fun userId(userId: Optional<String>) = userId(userId.getOrNull())

        /** Identifies the user who created the span iframe */
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

        fun build(): SpanIFrame =
            SpanIFrame(
                checkRequired("id", id),
                checkRequired("name", name),
                checkRequired("projectId", projectId),
                checkRequired("url", url),
                created,
                deletedAt,
                description,
                postMessage,
                userId,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SpanIFrame && id == other.id && name == other.name && projectId == other.projectId && url == other.url && created == other.created && deletedAt == other.deletedAt && description == other.description && postMessage == other.postMessage && userId == other.userId && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, name, projectId, url, created, deletedAt, description, postMessage, userId, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SpanIFrame{id=$id, name=$name, projectId=$projectId, url=$url, created=$created, deletedAt=$deletedAt, description=$description, postMessage=$postMessage, userId=$userId, additionalProperties=$additionalProperties}"
}
