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
class Dataset
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
    @JsonProperty("project_id")
    @ExcludeMissing
    private val projectId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("created")
    @ExcludeMissing
    private val created: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("deleted_at")
    @ExcludeMissing
    private val deletedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("description")
    @ExcludeMissing
    private val description: JsonField<String> = JsonMissing.of(),
    @JsonProperty("metadata")
    @ExcludeMissing
    private val metadata: JsonField<Metadata> = JsonMissing.of(),
    @JsonProperty("user_id")
    @ExcludeMissing
    private val userId: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** Unique identifier for the dataset */
    fun id(): String = id.getRequired("id")

    /** Name of the dataset. Within a project, dataset names are unique */
    fun name(): String = name.getRequired("name")

    /** Unique identifier for the project that the dataset belongs under */
    fun projectId(): String = projectId.getRequired("project_id")

    /** Date of dataset creation */
    fun created(): Optional<OffsetDateTime> = Optional.ofNullable(created.getNullable("created"))

    /** Date of dataset deletion, or null if the dataset is still active */
    fun deletedAt(): Optional<OffsetDateTime> =
        Optional.ofNullable(deletedAt.getNullable("deleted_at"))

    /** Textual description of the dataset */
    fun description(): Optional<String> =
        Optional.ofNullable(description.getNullable("description"))

    /** User-controlled metadata about the dataset */
    fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata.getNullable("metadata"))

    /** Identifies the user who created the dataset */
    fun userId(): Optional<String> = Optional.ofNullable(userId.getNullable("user_id"))

    /** Unique identifier for the dataset */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /** Name of the dataset. Within a project, dataset names are unique */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /** Unique identifier for the project that the dataset belongs under */
    @JsonProperty("project_id") @ExcludeMissing fun _projectId(): JsonField<String> = projectId

    /** Date of dataset creation */
    @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<OffsetDateTime> = created

    /** Date of dataset deletion, or null if the dataset is still active */
    @JsonProperty("deleted_at")
    @ExcludeMissing
    fun _deletedAt(): JsonField<OffsetDateTime> = deletedAt

    /** Textual description of the dataset */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /** User-controlled metadata about the dataset */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    /** Identifies the user who created the dataset */
    @JsonProperty("user_id") @ExcludeMissing fun _userId(): JsonField<String> = userId

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): Dataset = apply {
        if (validated) {
            return@apply
        }

        id()
        name()
        projectId()
        created()
        deletedAt()
        description()
        metadata().ifPresent { it.validate() }
        userId()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [Dataset].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .name()
         * .projectId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Dataset]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var projectId: JsonField<String>? = null
        private var created: JsonField<OffsetDateTime> = JsonMissing.of()
        private var deletedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var userId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(dataset: Dataset) = apply {
            id = dataset.id
            name = dataset.name
            projectId = dataset.projectId
            created = dataset.created
            deletedAt = dataset.deletedAt
            description = dataset.description
            metadata = dataset.metadata
            userId = dataset.userId
            additionalProperties = dataset.additionalProperties.toMutableMap()
        }

        /** Unique identifier for the dataset */
        fun id(id: String) = id(JsonField.of(id))

        /** Unique identifier for the dataset */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Name of the dataset. Within a project, dataset names are unique */
        fun name(name: String) = name(JsonField.of(name))

        /** Name of the dataset. Within a project, dataset names are unique */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Unique identifier for the project that the dataset belongs under */
        fun projectId(projectId: String) = projectId(JsonField.of(projectId))

        /** Unique identifier for the project that the dataset belongs under */
        fun projectId(projectId: JsonField<String>) = apply { this.projectId = projectId }

        /** Date of dataset creation */
        fun created(created: OffsetDateTime?) = created(JsonField.ofNullable(created))

        /** Date of dataset creation */
        fun created(created: Optional<OffsetDateTime>) = created(created.getOrNull())

        /** Date of dataset creation */
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /** Date of dataset deletion, or null if the dataset is still active */
        fun deletedAt(deletedAt: OffsetDateTime?) = deletedAt(JsonField.ofNullable(deletedAt))

        /** Date of dataset deletion, or null if the dataset is still active */
        fun deletedAt(deletedAt: Optional<OffsetDateTime>) = deletedAt(deletedAt.getOrNull())

        /** Date of dataset deletion, or null if the dataset is still active */
        fun deletedAt(deletedAt: JsonField<OffsetDateTime>) = apply { this.deletedAt = deletedAt }

        /** Textual description of the dataset */
        fun description(description: String?) = description(JsonField.ofNullable(description))

        /** Textual description of the dataset */
        fun description(description: Optional<String>) = description(description.getOrNull())

        /** Textual description of the dataset */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** User-controlled metadata about the dataset */
        fun metadata(metadata: Metadata?) = metadata(JsonField.ofNullable(metadata))

        /** User-controlled metadata about the dataset */
        fun metadata(metadata: Optional<Metadata>) = metadata(metadata.getOrNull())

        /** User-controlled metadata about the dataset */
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        /** Identifies the user who created the dataset */
        fun userId(userId: String?) = userId(JsonField.ofNullable(userId))

        /** Identifies the user who created the dataset */
        fun userId(userId: Optional<String>) = userId(userId.getOrNull())

        /** Identifies the user who created the dataset */
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

        fun build(): Dataset =
            Dataset(
                checkRequired("id", id),
                checkRequired("name", name),
                checkRequired("projectId", projectId),
                created,
                deletedAt,
                description,
                metadata,
                userId,
                additionalProperties.toImmutable(),
            )
    }

    /** User-controlled metadata about the dataset */
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

        return /* spotless:off */ other is Dataset && id == other.id && name == other.name && projectId == other.projectId && created == other.created && deletedAt == other.deletedAt && description == other.description && metadata == other.metadata && userId == other.userId && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, name, projectId, created, deletedAt, description, metadata, userId, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Dataset{id=$id, name=$name, projectId=$projectId, created=$created, deletedAt=$deletedAt, description=$description, metadata=$metadata, userId=$userId, additionalProperties=$additionalProperties}"
}
