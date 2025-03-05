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

@NoAutoDetect
class Project
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
    @JsonProperty("org_id") @ExcludeMissing private val orgId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("created")
    @ExcludeMissing
    private val created: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("deleted_at")
    @ExcludeMissing
    private val deletedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("settings")
    @ExcludeMissing
    private val settings: JsonField<ProjectSettings> = JsonMissing.of(),
    @JsonProperty("user_id")
    @ExcludeMissing
    private val userId: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** Unique identifier for the project */
    fun id(): String = id.getRequired("id")

    /** Name of the project */
    fun name(): String = name.getRequired("name")

    /** Unique id for the organization that the project belongs under */
    fun orgId(): String = orgId.getRequired("org_id")

    /** Date of project creation */
    fun created(): Optional<OffsetDateTime> = Optional.ofNullable(created.getNullable("created"))

    /** Date of project deletion, or null if the project is still active */
    fun deletedAt(): Optional<OffsetDateTime> =
        Optional.ofNullable(deletedAt.getNullable("deleted_at"))

    fun settings(): Optional<ProjectSettings> =
        Optional.ofNullable(settings.getNullable("settings"))

    /** Identifies the user who created the project */
    fun userId(): Optional<String> = Optional.ofNullable(userId.getNullable("user_id"))

    /** Unique identifier for the project */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /** Name of the project */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /** Unique id for the organization that the project belongs under */
    @JsonProperty("org_id") @ExcludeMissing fun _orgId(): JsonField<String> = orgId

    /** Date of project creation */
    @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<OffsetDateTime> = created

    /** Date of project deletion, or null if the project is still active */
    @JsonProperty("deleted_at")
    @ExcludeMissing
    fun _deletedAt(): JsonField<OffsetDateTime> = deletedAt

    @JsonProperty("settings") @ExcludeMissing fun _settings(): JsonField<ProjectSettings> = settings

    /** Identifies the user who created the project */
    @JsonProperty("user_id") @ExcludeMissing fun _userId(): JsonField<String> = userId

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): Project = apply {
        if (validated) {
            return@apply
        }

        id()
        name()
        orgId()
        created()
        deletedAt()
        settings().ifPresent { it.validate() }
        userId()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [Project].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .name()
         * .orgId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Project]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var orgId: JsonField<String>? = null
        private var created: JsonField<OffsetDateTime> = JsonMissing.of()
        private var deletedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var settings: JsonField<ProjectSettings> = JsonMissing.of()
        private var userId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(project: Project) = apply {
            id = project.id
            name = project.name
            orgId = project.orgId
            created = project.created
            deletedAt = project.deletedAt
            settings = project.settings
            userId = project.userId
            additionalProperties = project.additionalProperties.toMutableMap()
        }

        /** Unique identifier for the project */
        fun id(id: String) = id(JsonField.of(id))

        /** Unique identifier for the project */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Name of the project */
        fun name(name: String) = name(JsonField.of(name))

        /** Name of the project */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Unique id for the organization that the project belongs under */
        fun orgId(orgId: String) = orgId(JsonField.of(orgId))

        /** Unique id for the organization that the project belongs under */
        fun orgId(orgId: JsonField<String>) = apply { this.orgId = orgId }

        /** Date of project creation */
        fun created(created: OffsetDateTime?) = created(JsonField.ofNullable(created))

        /** Date of project creation */
        fun created(created: Optional<OffsetDateTime>) = created(created.orElse(null))

        /** Date of project creation */
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /** Date of project deletion, or null if the project is still active */
        fun deletedAt(deletedAt: OffsetDateTime?) = deletedAt(JsonField.ofNullable(deletedAt))

        /** Date of project deletion, or null if the project is still active */
        fun deletedAt(deletedAt: Optional<OffsetDateTime>) = deletedAt(deletedAt.orElse(null))

        /** Date of project deletion, or null if the project is still active */
        fun deletedAt(deletedAt: JsonField<OffsetDateTime>) = apply { this.deletedAt = deletedAt }

        fun settings(settings: ProjectSettings?) = settings(JsonField.ofNullable(settings))

        fun settings(settings: Optional<ProjectSettings>) = settings(settings.orElse(null))

        fun settings(settings: JsonField<ProjectSettings>) = apply { this.settings = settings }

        /** Identifies the user who created the project */
        fun userId(userId: String?) = userId(JsonField.ofNullable(userId))

        /** Identifies the user who created the project */
        fun userId(userId: Optional<String>) = userId(userId.orElse(null))

        /** Identifies the user who created the project */
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

        fun build(): Project =
            Project(
                checkRequired("id", id),
                checkRequired("name", name),
                checkRequired("orgId", orgId),
                created,
                deletedAt,
                settings,
                userId,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Project && id == other.id && name == other.name && orgId == other.orgId && created == other.created && deletedAt == other.deletedAt && settings == other.settings && userId == other.userId && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, name, orgId, created, deletedAt, settings, userId, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Project{id=$id, name=$name, orgId=$orgId, created=$created, deletedAt=$deletedAt, settings=$settings, userId=$userId, additionalProperties=$additionalProperties}"
}
