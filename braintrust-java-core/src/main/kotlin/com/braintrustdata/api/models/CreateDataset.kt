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
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = CreateDataset.Builder::class)
@NoAutoDetect
class CreateDataset
private constructor(
    private val projectId: JsonField<String>,
    private val name: JsonField<String>,
    private val description: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** Unique identifier for the project that the dataset belongs under */
    fun projectId(): Optional<String> = Optional.ofNullable(projectId.getNullable("project_id"))

    /** Name of the dataset. Within a project, dataset names are unique */
    fun name(): String = name.getRequired("name")

    /** Textual description of the dataset */
    fun description(): Optional<String> =
        Optional.ofNullable(description.getNullable("description"))

    /** Unique identifier for the project that the dataset belongs under */
    @JsonProperty("project_id") @ExcludeMissing fun _projectId() = projectId

    /** Name of the dataset. Within a project, dataset names are unique */
    @JsonProperty("name") @ExcludeMissing fun _name() = name

    /** Textual description of the dataset */
    @JsonProperty("description") @ExcludeMissing fun _description() = description

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): CreateDataset = apply {
        if (!validated) {
            projectId()
            name()
            description()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CreateDataset &&
            this.projectId == other.projectId &&
            this.name == other.name &&
            this.description == other.description &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    projectId,
                    name,
                    description,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "CreateDataset{projectId=$projectId, name=$name, description=$description, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var projectId: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(createDataset: CreateDataset) = apply {
            this.projectId = createDataset.projectId
            this.name = createDataset.name
            this.description = createDataset.description
            additionalProperties(createDataset.additionalProperties)
        }

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

        fun build(): CreateDataset =
            CreateDataset(
                projectId,
                name,
                description,
                additionalProperties.toUnmodifiable(),
            )
    }
}
