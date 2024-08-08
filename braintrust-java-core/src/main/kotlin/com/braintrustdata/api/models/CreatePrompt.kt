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

@JsonDeserialize(builder = CreatePrompt.Builder::class)
@NoAutoDetect
class CreatePrompt
private constructor(
    private val projectId: JsonField<String>,
    private val name: JsonField<String>,
    private val slug: JsonField<String>,
    private val description: JsonField<String>,
    private val promptData: JsonField<PromptData>,
    private val tags: JsonField<List<String>>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** Unique identifier for the project that the prompt belongs under */
    fun projectId(): String = projectId.getRequired("project_id")

    /** Name of the prompt */
    fun name(): String = name.getRequired("name")

    /** Unique identifier for the prompt */
    fun slug(): String = slug.getRequired("slug")

    /** Textual description of the prompt */
    fun description(): Optional<String> =
        Optional.ofNullable(description.getNullable("description"))

    /** The prompt, model, and its parameters */
    fun promptData(): Optional<PromptData> =
        Optional.ofNullable(promptData.getNullable("prompt_data"))

    /** A list of tags for the prompt */
    fun tags(): Optional<List<String>> = Optional.ofNullable(tags.getNullable("tags"))

    /** Unique identifier for the project that the prompt belongs under */
    @JsonProperty("project_id") @ExcludeMissing fun _projectId() = projectId

    /** Name of the prompt */
    @JsonProperty("name") @ExcludeMissing fun _name() = name

    /** Unique identifier for the prompt */
    @JsonProperty("slug") @ExcludeMissing fun _slug() = slug

    /** Textual description of the prompt */
    @JsonProperty("description") @ExcludeMissing fun _description() = description

    /** The prompt, model, and its parameters */
    @JsonProperty("prompt_data") @ExcludeMissing fun _promptData() = promptData

    /** A list of tags for the prompt */
    @JsonProperty("tags") @ExcludeMissing fun _tags() = tags

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): CreatePrompt = apply {
        if (!validated) {
            projectId()
            name()
            slug()
            description()
            promptData().map { it.validate() }
            tags()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CreatePrompt &&
            this.projectId == other.projectId &&
            this.name == other.name &&
            this.slug == other.slug &&
            this.description == other.description &&
            this.promptData == other.promptData &&
            this.tags == other.tags &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    projectId,
                    name,
                    slug,
                    description,
                    promptData,
                    tags,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "CreatePrompt{projectId=$projectId, name=$name, slug=$slug, description=$description, promptData=$promptData, tags=$tags, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var projectId: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var slug: JsonField<String> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var promptData: JsonField<PromptData> = JsonMissing.of()
        private var tags: JsonField<List<String>> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(createPrompt: CreatePrompt) = apply {
            this.projectId = createPrompt.projectId
            this.name = createPrompt.name
            this.slug = createPrompt.slug
            this.description = createPrompt.description
            this.promptData = createPrompt.promptData
            this.tags = createPrompt.tags
            additionalProperties(createPrompt.additionalProperties)
        }

        /** Unique identifier for the project that the prompt belongs under */
        fun projectId(projectId: String) = projectId(JsonField.of(projectId))

        /** Unique identifier for the project that the prompt belongs under */
        @JsonProperty("project_id")
        @ExcludeMissing
        fun projectId(projectId: JsonField<String>) = apply { this.projectId = projectId }

        /** Name of the prompt */
        fun name(name: String) = name(JsonField.of(name))

        /** Name of the prompt */
        @JsonProperty("name")
        @ExcludeMissing
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Unique identifier for the prompt */
        fun slug(slug: String) = slug(JsonField.of(slug))

        /** Unique identifier for the prompt */
        @JsonProperty("slug")
        @ExcludeMissing
        fun slug(slug: JsonField<String>) = apply { this.slug = slug }

        /** Textual description of the prompt */
        fun description(description: String) = description(JsonField.of(description))

        /** Textual description of the prompt */
        @JsonProperty("description")
        @ExcludeMissing
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** The prompt, model, and its parameters */
        fun promptData(promptData: PromptData) = promptData(JsonField.of(promptData))

        /** The prompt, model, and its parameters */
        @JsonProperty("prompt_data")
        @ExcludeMissing
        fun promptData(promptData: JsonField<PromptData>) = apply { this.promptData = promptData }

        /** A list of tags for the prompt */
        fun tags(tags: List<String>) = tags(JsonField.of(tags))

        /** A list of tags for the prompt */
        @JsonProperty("tags")
        @ExcludeMissing
        fun tags(tags: JsonField<List<String>>) = apply { this.tags = tags }

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

        fun build(): CreatePrompt =
            CreatePrompt(
                projectId,
                name,
                slug,
                description,
                promptData,
                tags.map { it.toUnmodifiable() },
                additionalProperties.toUnmodifiable(),
            )
    }
}
