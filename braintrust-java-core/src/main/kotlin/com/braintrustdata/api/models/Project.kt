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

@JsonDeserialize(builder = Project.Builder::class)
@NoAutoDetect
class Project
private constructor(
    private val id: JsonField<String>,
    private val orgId: JsonField<String>,
    private val name: JsonField<String>,
    private val created: JsonField<OffsetDateTime>,
    private val deletedAt: JsonField<OffsetDateTime>,
    private val userId: JsonField<String>,
    private val settings: JsonField<ProjectSettings>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /** Unique identifier for the project */
    fun id(): String = id.getRequired("id")

    /** Unique id for the organization that the project belongs under */
    fun orgId(): String = orgId.getRequired("org_id")

    /** Name of the project */
    fun name(): String = name.getRequired("name")

    /** Date of project creation */
    fun created(): Optional<OffsetDateTime> = Optional.ofNullable(created.getNullable("created"))

    /** Date of project deletion, or null if the project is still active */
    fun deletedAt(): Optional<OffsetDateTime> =
        Optional.ofNullable(deletedAt.getNullable("deleted_at"))

    /** Identifies the user who created the project */
    fun userId(): Optional<String> = Optional.ofNullable(userId.getNullable("user_id"))

    fun settings(): Optional<ProjectSettings> =
        Optional.ofNullable(settings.getNullable("settings"))

    /** Unique identifier for the project */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /** Unique id for the organization that the project belongs under */
    @JsonProperty("org_id") @ExcludeMissing fun _orgId() = orgId

    /** Name of the project */
    @JsonProperty("name") @ExcludeMissing fun _name() = name

    /** Date of project creation */
    @JsonProperty("created") @ExcludeMissing fun _created() = created

    /** Date of project deletion, or null if the project is still active */
    @JsonProperty("deleted_at") @ExcludeMissing fun _deletedAt() = deletedAt

    /** Identifies the user who created the project */
    @JsonProperty("user_id") @ExcludeMissing fun _userId() = userId

    @JsonProperty("settings") @ExcludeMissing fun _settings() = settings

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): Project = apply {
        if (!validated) {
            id()
            orgId()
            name()
            created()
            deletedAt()
            userId()
            settings().map { it.validate() }
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var orgId: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var created: JsonField<OffsetDateTime> = JsonMissing.of()
        private var deletedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var userId: JsonField<String> = JsonMissing.of()
        private var settings: JsonField<ProjectSettings> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(project: Project) = apply {
            this.id = project.id
            this.orgId = project.orgId
            this.name = project.name
            this.created = project.created
            this.deletedAt = project.deletedAt
            this.userId = project.userId
            this.settings = project.settings
            additionalProperties(project.additionalProperties)
        }

        /** Unique identifier for the project */
        fun id(id: String) = id(JsonField.of(id))

        /** Unique identifier for the project */
        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        /** Unique id for the organization that the project belongs under */
        fun orgId(orgId: String) = orgId(JsonField.of(orgId))

        /** Unique id for the organization that the project belongs under */
        @JsonProperty("org_id")
        @ExcludeMissing
        fun orgId(orgId: JsonField<String>) = apply { this.orgId = orgId }

        /** Name of the project */
        fun name(name: String) = name(JsonField.of(name))

        /** Name of the project */
        @JsonProperty("name")
        @ExcludeMissing
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Date of project creation */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /** Date of project creation */
        @JsonProperty("created")
        @ExcludeMissing
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /** Date of project deletion, or null if the project is still active */
        fun deletedAt(deletedAt: OffsetDateTime) = deletedAt(JsonField.of(deletedAt))

        /** Date of project deletion, or null if the project is still active */
        @JsonProperty("deleted_at")
        @ExcludeMissing
        fun deletedAt(deletedAt: JsonField<OffsetDateTime>) = apply { this.deletedAt = deletedAt }

        /** Identifies the user who created the project */
        fun userId(userId: String) = userId(JsonField.of(userId))

        /** Identifies the user who created the project */
        @JsonProperty("user_id")
        @ExcludeMissing
        fun userId(userId: JsonField<String>) = apply { this.userId = userId }

        fun settings(settings: ProjectSettings) = settings(JsonField.of(settings))

        @JsonProperty("settings")
        @ExcludeMissing
        fun settings(settings: JsonField<ProjectSettings>) = apply { this.settings = settings }

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

        fun build(): Project =
            Project(
                id,
                orgId,
                name,
                created,
                deletedAt,
                userId,
                settings,
                additionalProperties.toUnmodifiable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Project && this.id == other.id && this.orgId == other.orgId && this.name == other.name && this.created == other.created && this.deletedAt == other.deletedAt && this.userId == other.userId && this.settings == other.settings && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(id, orgId, name, created, deletedAt, userId, settings, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() =
        "Project{id=$id, orgId=$orgId, name=$name, created=$created, deletedAt=$deletedAt, userId=$userId, settings=$settings, additionalProperties=$additionalProperties}"
}
