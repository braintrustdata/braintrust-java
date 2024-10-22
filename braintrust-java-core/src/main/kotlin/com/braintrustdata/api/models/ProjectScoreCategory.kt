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

/** For categorical-type project scores, defines a single category */
@JsonDeserialize(builder = ProjectScoreCategory.Builder::class)
@NoAutoDetect
class ProjectScoreCategory
private constructor(
    private val name: JsonField<String>,
    private val value: JsonField<Double>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /** Name of the category */
    fun name(): String = name.getRequired("name")

    /** Numerical value of the category. Must be between 0 and 1, inclusive */
    fun value(): Double = value.getRequired("value")

    /** Name of the category */
    @JsonProperty("name") @ExcludeMissing fun _name() = name

    /** Numerical value of the category. Must be between 0 and 1, inclusive */
    @JsonProperty("value") @ExcludeMissing fun _value() = value

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): ProjectScoreCategory = apply {
        if (!validated) {
            name()
            value()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var name: JsonField<String> = JsonMissing.of()
        private var value: JsonField<Double> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(projectScoreCategory: ProjectScoreCategory) = apply {
            this.name = projectScoreCategory.name
            this.value = projectScoreCategory.value
            additionalProperties(projectScoreCategory.additionalProperties)
        }

        /** Name of the category */
        fun name(name: String) = name(JsonField.of(name))

        /** Name of the category */
        @JsonProperty("name")
        @ExcludeMissing
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Numerical value of the category. Must be between 0 and 1, inclusive */
        fun value(value: Double) = value(JsonField.of(value))

        /** Numerical value of the category. Must be between 0 and 1, inclusive */
        @JsonProperty("value")
        @ExcludeMissing
        fun value(value: JsonField<Double>) = apply { this.value = value }

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

        fun build(): ProjectScoreCategory =
            ProjectScoreCategory(
                name,
                value,
                additionalProperties.toUnmodifiable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ProjectScoreCategory && this.name == other.name && this.value == other.value && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(name, value, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() =
        "ProjectScoreCategory{name=$name, value=$value, additionalProperties=$additionalProperties}"
}
