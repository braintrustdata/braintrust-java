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

/**
 * A project tag is a user-configured tag for tracking and filtering your
 * experiments, logs, and other data
 */
@NoAutoDetect
class ProjectTag @JsonCreator private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
    @JsonProperty("project_id") @ExcludeMissing private val projectId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("user_id") @ExcludeMissing private val userId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("color") @ExcludeMissing private val color: JsonField<String> = JsonMissing.of(),
    @JsonProperty("created") @ExcludeMissing private val created: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("description") @ExcludeMissing private val description: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),

) {

    /** Unique identifier for the project tag */
    fun id(): String = id.getRequired("id")

    /** Name of the project tag */
    fun name(): String = name.getRequired("name")

    /** Unique identifier for the project that the project tag belongs under */
    fun projectId(): String = projectId.getRequired("project_id")

    fun userId(): String = userId.getRequired("user_id")

    /** Color of the tag for the UI */
    fun color(): Optional<String> = Optional.ofNullable(color.getNullable("color"))

    /** Date of project tag creation */
    fun created(): Optional<OffsetDateTime> = Optional.ofNullable(created.getNullable("created"))

    /** Textual description of the project tag */
    fun description(): Optional<String> = Optional.ofNullable(description.getNullable("description"))

    /** Unique identifier for the project tag */
    @JsonProperty("id")
    @ExcludeMissing
    fun _id(): JsonField<String> = id

    /** Name of the project tag */
    @JsonProperty("name")
    @ExcludeMissing
    fun _name(): JsonField<String> = name

    /** Unique identifier for the project that the project tag belongs under */
    @JsonProperty("project_id")
    @ExcludeMissing
    fun _projectId(): JsonField<String> = projectId

    @JsonProperty("user_id")
    @ExcludeMissing
    fun _userId(): JsonField<String> = userId

    /** Color of the tag for the UI */
    @JsonProperty("color")
    @ExcludeMissing
    fun _color(): JsonField<String> = color

    /** Date of project tag creation */
    @JsonProperty("created")
    @ExcludeMissing
    fun _created(): JsonField<OffsetDateTime> = created

    /** Textual description of the project tag */
    @JsonProperty("description")
    @ExcludeMissing
    fun _description(): JsonField<String> = description

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): ProjectTag =
        apply {
            if (validated) {
              return@apply
            }

            id()
            name()
            projectId()
            userId()
            color()
            created()
            description()
            validated = true
        }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ProjectTag].
         *
         * The following fields are required:
         *
         * ```java
         * .id()
         * .name()
         * .projectId()
         * .userId()
         * ```
         */
        @JvmStatic
        fun builder() = Builder()
    }

    /** A builder for [ProjectTag]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var projectId: JsonField<String>? = null
        private var userId: JsonField<String>? = null
        private var color: JsonField<String> = JsonMissing.of()
        private var created: JsonField<OffsetDateTime> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(projectTag: ProjectTag) =
            apply {
                id = projectTag.id
                name = projectTag.name
                projectId = projectTag.projectId
                userId = projectTag.userId
                color = projectTag.color
                created = projectTag.created
                description = projectTag.description
                additionalProperties = projectTag.additionalProperties.toMutableMap()
            }

        /** Unique identifier for the project tag */
        fun id(id: String) = id(JsonField.of(id))

        /** Unique identifier for the project tag */
        fun id(id: JsonField<String>) =
            apply {
                this.id = id
            }

        /** Name of the project tag */
        fun name(name: String) = name(JsonField.of(name))

        /** Name of the project tag */
        fun name(name: JsonField<String>) =
            apply {
                this.name = name
            }

        /** Unique identifier for the project that the project tag belongs under */
        fun projectId(projectId: String) = projectId(JsonField.of(projectId))

        /** Unique identifier for the project that the project tag belongs under */
        fun projectId(projectId: JsonField<String>) =
            apply {
                this.projectId = projectId
            }

        fun userId(userId: String) = userId(JsonField.of(userId))

        fun userId(userId: JsonField<String>) =
            apply {
                this.userId = userId
            }

        /** Color of the tag for the UI */
        fun color(color: String?) = color(JsonField.ofNullable(color))

        /** Color of the tag for the UI */
        fun color(color: Optional<String>) = color(color.getOrNull())

        /** Color of the tag for the UI */
        fun color(color: JsonField<String>) =
            apply {
                this.color = color
            }

        /** Date of project tag creation */
        fun created(created: OffsetDateTime?) = created(JsonField.ofNullable(created))

        /** Date of project tag creation */
        fun created(created: Optional<OffsetDateTime>) = created(created.getOrNull())

        /** Date of project tag creation */
        fun created(created: JsonField<OffsetDateTime>) =
            apply {
                this.created = created
            }

        /** Textual description of the project tag */
        fun description(description: String?) = description(JsonField.ofNullable(description))

        /** Textual description of the project tag */
        fun description(description: Optional<String>) = description(description.getOrNull())

        /** Textual description of the project tag */
        fun description(description: JsonField<String>) =
            apply {
                this.description = description
            }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
            apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

        fun putAdditionalProperty(key: String, value: JsonValue) =
            apply {
                additionalProperties.put(key, value)
            }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
            apply {
                this.additionalProperties.putAll(additionalProperties)
            }

        fun removeAdditionalProperty(key: String) =
            apply {
                additionalProperties.remove(key)
            }

        fun removeAllAdditionalProperties(keys: Set<String>) =
            apply {
                keys.forEach(::removeAdditionalProperty)
            }

        fun build(): ProjectTag =
            ProjectTag(
              checkRequired(
                "id", id
              ),
              checkRequired(
                "name", name
              ),
              checkRequired(
                "projectId", projectId
              ),
              checkRequired(
                "userId", userId
              ),
              color,
              created,
              description,
              additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return /* spotless:off */ other is ProjectTag && id == other.id && name == other.name && projectId == other.projectId && userId == other.userId && color == other.color && created == other.created && description == other.description && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, name, projectId, userId, color, created, description, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() = "ProjectTag{id=$id, name=$name, projectId=$projectId, userId=$userId, color=$color, created=$created, description=$description, additionalProperties=$additionalProperties}"
}
