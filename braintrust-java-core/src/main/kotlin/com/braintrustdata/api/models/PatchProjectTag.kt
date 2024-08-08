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

@JsonDeserialize(builder = PatchProjectTag.Builder::class)
@NoAutoDetect
class PatchProjectTag
private constructor(
    private val name: JsonField<String>,
    private val description: JsonField<String>,
    private val color: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** Name of the project tag */
    fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

    /** Textual description of the project tag */
    fun description(): Optional<String> =
        Optional.ofNullable(description.getNullable("description"))

    /** Color of the tag for the UI */
    fun color(): Optional<String> = Optional.ofNullable(color.getNullable("color"))

    /** Name of the project tag */
    @JsonProperty("name") @ExcludeMissing fun _name() = name

    /** Textual description of the project tag */
    @JsonProperty("description") @ExcludeMissing fun _description() = description

    /** Color of the tag for the UI */
    @JsonProperty("color") @ExcludeMissing fun _color() = color

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): PatchProjectTag = apply {
        if (!validated) {
            name()
            description()
            color()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PatchProjectTag &&
            this.name == other.name &&
            this.description == other.description &&
            this.color == other.color &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    name,
                    description,
                    color,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "PatchProjectTag{name=$name, description=$description, color=$color, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var name: JsonField<String> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var color: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(patchProjectTag: PatchProjectTag) = apply {
            this.name = patchProjectTag.name
            this.description = patchProjectTag.description
            this.color = patchProjectTag.color
            additionalProperties(patchProjectTag.additionalProperties)
        }

        /** Name of the project tag */
        fun name(name: String) = name(JsonField.of(name))

        /** Name of the project tag */
        @JsonProperty("name")
        @ExcludeMissing
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Textual description of the project tag */
        fun description(description: String) = description(JsonField.of(description))

        /** Textual description of the project tag */
        @JsonProperty("description")
        @ExcludeMissing
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** Color of the tag for the UI */
        fun color(color: String) = color(JsonField.of(color))

        /** Color of the tag for the UI */
        @JsonProperty("color")
        @ExcludeMissing
        fun color(color: JsonField<String>) = apply { this.color = color }

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

        fun build(): PatchProjectTag =
            PatchProjectTag(
                name,
                description,
                color,
                additionalProperties.toUnmodifiable(),
            )
    }
}
