// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.toUnmodifiable
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = Dataset.Builder::class)
@NoAutoDetect
class Dataset
private constructor(
    private val id: JsonField<String>,
    private val projectId: JsonField<String>,
    private val name: JsonField<String>,
    private val description: JsonField<String>,
    private val created: JsonField<OffsetDateTime>,
    private val deletedAt: JsonField<OffsetDateTime>,
    private val userId: JsonField<String>,
    private val metadata: JsonField<Metadata>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** Unique identifier for the dataset */
    fun id(): String = id.getRequired("id")

    /** Unique identifier for the project that the dataset belongs under */
    fun projectId(): Optional<String> = Optional.ofNullable(projectId.getNullable("project_id"))

    /** Name of the dataset. Within a project, dataset names are unique */
    fun name(): String = name.getRequired("name")

    /** Textual description of the dataset */
    fun description(): Optional<String> =
        Optional.ofNullable(description.getNullable("description"))

    /** Date of dataset creation */
    fun created(): Optional<OffsetDateTime> = Optional.ofNullable(created.getNullable("created"))

    /** Date of dataset deletion, or null if the dataset is still active */
    fun deletedAt(): Optional<OffsetDateTime> =
        Optional.ofNullable(deletedAt.getNullable("deleted_at"))

    /** Identifies the user who created the dataset */
    fun userId(): Optional<String> = Optional.ofNullable(userId.getNullable("user_id"))

    /** User-controlled metadata about the dataset */
    fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata.getNullable("metadata"))

    /** Unique identifier for the dataset */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /** Unique identifier for the project that the dataset belongs under */
    @JsonProperty("project_id") @ExcludeMissing fun _projectId() = projectId

    /** Name of the dataset. Within a project, dataset names are unique */
    @JsonProperty("name") @ExcludeMissing fun _name() = name

    /** Textual description of the dataset */
    @JsonProperty("description") @ExcludeMissing fun _description() = description

    /** Date of dataset creation */
    @JsonProperty("created") @ExcludeMissing fun _created() = created

    /** Date of dataset deletion, or null if the dataset is still active */
    @JsonProperty("deleted_at") @ExcludeMissing fun _deletedAt() = deletedAt

    /** Identifies the user who created the dataset */
    @JsonProperty("user_id") @ExcludeMissing fun _userId() = userId

    /** User-controlled metadata about the dataset */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata() = metadata

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): Dataset = apply {
        if (!validated) {
            id()
            projectId()
            name()
            description()
            created()
            deletedAt()
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

        return other is Dataset &&
            this.id == other.id &&
            this.projectId == other.projectId &&
            this.name == other.name &&
            this.description == other.description &&
            this.created == other.created &&
            this.deletedAt == other.deletedAt &&
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
                    deletedAt,
                    userId,
                    metadata,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "Dataset{id=$id, projectId=$projectId, name=$name, description=$description, created=$created, deletedAt=$deletedAt, userId=$userId, metadata=$metadata, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var projectId: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var created: JsonField<OffsetDateTime> = JsonMissing.of()
        private var deletedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var userId: JsonField<String> = JsonMissing.of()
        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(dataset: Dataset) = apply {
            this.id = dataset.id
            this.projectId = dataset.projectId
            this.name = dataset.name
            this.description = dataset.description
            this.created = dataset.created
            this.deletedAt = dataset.deletedAt
            this.userId = dataset.userId
            this.metadata = dataset.metadata
            additionalProperties(dataset.additionalProperties)
        }

        /** Unique identifier for the dataset */
        fun id(id: String) = id(JsonField.of(id))

        /** Unique identifier for the dataset */
        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        /** Unique identifier for the project that the dataset belongs under */
        fun projectId(projectId: String) = projectId(JsonField.of(projectId))

        /** Unique identifier for the project that the dataset belongs under */
        @JsonProperty("project_id")
        @ExcludeMissing
        fun projectId(projectId: JsonField<String>) = apply { this.projectId = projectId }

        /** Name of the dataset. Within a project, dataset names are unique */
        fun name(name: String) = name(JsonField.of(name))

        /** Name of the dataset. Within a project, dataset names are unique */
        @JsonProperty("name")
        @ExcludeMissing
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Textual description of the dataset */
        fun description(description: String) = description(JsonField.of(description))

        /** Textual description of the dataset */
        @JsonProperty("description")
        @ExcludeMissing
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** Date of dataset creation */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /** Date of dataset creation */
        @JsonProperty("created")
        @ExcludeMissing
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /** Date of dataset deletion, or null if the dataset is still active */
        fun deletedAt(deletedAt: OffsetDateTime) = deletedAt(JsonField.of(deletedAt))

        /** Date of dataset deletion, or null if the dataset is still active */
        @JsonProperty("deleted_at")
        @ExcludeMissing
        fun deletedAt(deletedAt: JsonField<OffsetDateTime>) = apply { this.deletedAt = deletedAt }

        /** Identifies the user who created the dataset */
        fun userId(userId: String) = userId(JsonField.of(userId))

        /** Identifies the user who created the dataset */
        @JsonProperty("user_id")
        @ExcludeMissing
        fun userId(userId: JsonField<String>) = apply { this.userId = userId }

        /** User-controlled metadata about the dataset */
        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

        /** User-controlled metadata about the dataset */
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

        fun build(): Dataset =
            Dataset(
                id,
                projectId,
                name,
                description,
                created,
                deletedAt,
                userId,
                metadata,
                additionalProperties.toUnmodifiable(),
            )
    }

    /** User-controlled metadata about the dataset */
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
}
