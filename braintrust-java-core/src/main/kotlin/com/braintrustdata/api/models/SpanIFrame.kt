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
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = SpanIFrame.Builder::class)
@NoAutoDetect
class SpanIFrame
private constructor(
    private val id: JsonField<String>,
    private val projectId: JsonField<String>,
    private val userId: JsonField<String>,
    private val created: JsonField<OffsetDateTime>,
    private val deletedAt: JsonField<OffsetDateTime>,
    private val name: JsonField<String>,
    private val description: JsonField<String>,
    private val url: JsonField<String>,
    private val postMessage: JsonField<Boolean>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /** Unique identifier for the span iframe */
    fun id(): String = id.getRequired("id")

    /** Unique identifier for the project that the span iframe belongs under */
    fun projectId(): String = projectId.getRequired("project_id")

    /** Identifies the user who created the span iframe */
    fun userId(): Optional<String> = Optional.ofNullable(userId.getNullable("user_id"))

    /** Date of span iframe creation */
    fun created(): Optional<OffsetDateTime> = Optional.ofNullable(created.getNullable("created"))

    /** Date of span iframe deletion, or null if the span iframe is still active */
    fun deletedAt(): Optional<OffsetDateTime> =
        Optional.ofNullable(deletedAt.getNullable("deleted_at"))

    /** Name of the span iframe */
    fun name(): String = name.getRequired("name")

    /** Textual description of the span iframe */
    fun description(): Optional<String> =
        Optional.ofNullable(description.getNullable("description"))

    /** URL to embed the project viewer in an iframe */
    fun url(): String = url.getRequired("url")

    /**
     * Whether to post messages to the iframe containing the span's data. This is useful when you
     * want to render more data than fits in the URL.
     */
    fun postMessage(): Optional<Boolean> =
        Optional.ofNullable(postMessage.getNullable("post_message"))

    /** Unique identifier for the span iframe */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /** Unique identifier for the project that the span iframe belongs under */
    @JsonProperty("project_id") @ExcludeMissing fun _projectId() = projectId

    /** Identifies the user who created the span iframe */
    @JsonProperty("user_id") @ExcludeMissing fun _userId() = userId

    /** Date of span iframe creation */
    @JsonProperty("created") @ExcludeMissing fun _created() = created

    /** Date of span iframe deletion, or null if the span iframe is still active */
    @JsonProperty("deleted_at") @ExcludeMissing fun _deletedAt() = deletedAt

    /** Name of the span iframe */
    @JsonProperty("name") @ExcludeMissing fun _name() = name

    /** Textual description of the span iframe */
    @JsonProperty("description") @ExcludeMissing fun _description() = description

    /** URL to embed the project viewer in an iframe */
    @JsonProperty("url") @ExcludeMissing fun _url() = url

    /**
     * Whether to post messages to the iframe containing the span's data. This is useful when you
     * want to render more data than fits in the URL.
     */
    @JsonProperty("post_message") @ExcludeMissing fun _postMessage() = postMessage

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): SpanIFrame = apply {
        if (!validated) {
            id()
            projectId()
            userId()
            created()
            deletedAt()
            name()
            description()
            url()
            postMessage()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var projectId: JsonField<String> = JsonMissing.of()
        private var userId: JsonField<String> = JsonMissing.of()
        private var created: JsonField<OffsetDateTime> = JsonMissing.of()
        private var deletedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var url: JsonField<String> = JsonMissing.of()
        private var postMessage: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(spanIFrame: SpanIFrame) = apply {
            this.id = spanIFrame.id
            this.projectId = spanIFrame.projectId
            this.userId = spanIFrame.userId
            this.created = spanIFrame.created
            this.deletedAt = spanIFrame.deletedAt
            this.name = spanIFrame.name
            this.description = spanIFrame.description
            this.url = spanIFrame.url
            this.postMessage = spanIFrame.postMessage
            additionalProperties(spanIFrame.additionalProperties)
        }

        /** Unique identifier for the span iframe */
        fun id(id: String) = id(JsonField.of(id))

        /** Unique identifier for the span iframe */
        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        /** Unique identifier for the project that the span iframe belongs under */
        fun projectId(projectId: String) = projectId(JsonField.of(projectId))

        /** Unique identifier for the project that the span iframe belongs under */
        @JsonProperty("project_id")
        @ExcludeMissing
        fun projectId(projectId: JsonField<String>) = apply { this.projectId = projectId }

        /** Identifies the user who created the span iframe */
        fun userId(userId: String) = userId(JsonField.of(userId))

        /** Identifies the user who created the span iframe */
        @JsonProperty("user_id")
        @ExcludeMissing
        fun userId(userId: JsonField<String>) = apply { this.userId = userId }

        /** Date of span iframe creation */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /** Date of span iframe creation */
        @JsonProperty("created")
        @ExcludeMissing
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /** Date of span iframe deletion, or null if the span iframe is still active */
        fun deletedAt(deletedAt: OffsetDateTime) = deletedAt(JsonField.of(deletedAt))

        /** Date of span iframe deletion, or null if the span iframe is still active */
        @JsonProperty("deleted_at")
        @ExcludeMissing
        fun deletedAt(deletedAt: JsonField<OffsetDateTime>) = apply { this.deletedAt = deletedAt }

        /** Name of the span iframe */
        fun name(name: String) = name(JsonField.of(name))

        /** Name of the span iframe */
        @JsonProperty("name")
        @ExcludeMissing
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Textual description of the span iframe */
        fun description(description: String) = description(JsonField.of(description))

        /** Textual description of the span iframe */
        @JsonProperty("description")
        @ExcludeMissing
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** URL to embed the project viewer in an iframe */
        fun url(url: String) = url(JsonField.of(url))

        /** URL to embed the project viewer in an iframe */
        @JsonProperty("url")
        @ExcludeMissing
        fun url(url: JsonField<String>) = apply { this.url = url }

        /**
         * Whether to post messages to the iframe containing the span's data. This is useful when
         * you want to render more data than fits in the URL.
         */
        fun postMessage(postMessage: Boolean) = postMessage(JsonField.of(postMessage))

        /**
         * Whether to post messages to the iframe containing the span's data. This is useful when
         * you want to render more data than fits in the URL.
         */
        @JsonProperty("post_message")
        @ExcludeMissing
        fun postMessage(postMessage: JsonField<Boolean>) = apply { this.postMessage = postMessage }

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

        fun build(): SpanIFrame =
            SpanIFrame(
                id,
                projectId,
                userId,
                created,
                deletedAt,
                name,
                description,
                url,
                postMessage,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SpanIFrame && id == other.id && projectId == other.projectId && userId == other.userId && created == other.created && deletedAt == other.deletedAt && name == other.name && description == other.description && url == other.url && postMessage == other.postMessage && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, projectId, userId, created, deletedAt, name, description, url, postMessage, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SpanIFrame{id=$id, projectId=$projectId, userId=$userId, created=$created, deletedAt=$deletedAt, name=$name, description=$description, url=$url, postMessage=$postMessage, additionalProperties=$additionalProperties}"
}
