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
import java.util.Objects

/** For categorical-type project scores, defines a single category */
@NoAutoDetect
class ProjectScoreCategory
@JsonCreator
private constructor(
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
    @JsonProperty("value") @ExcludeMissing private val value: JsonField<Double> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** Name of the category */
    fun name(): String = name.getRequired("name")

    /** Numerical value of the category. Must be between 0 and 1, inclusive */
    fun value(): Double = value.getRequired("value")

    /** Name of the category */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /** Numerical value of the category. Must be between 0 and 1, inclusive */
    @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Double> = value

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): ProjectScoreCategory = apply {
        if (validated) {
            return@apply
        }

        name()
        value()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ProjectScoreCategory].
         *
         * The following fields are required:
         * ```java
         * .name()
         * .value()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ProjectScoreCategory]. */
    class Builder internal constructor() {

        private var name: JsonField<String>? = null
        private var value: JsonField<Double>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(projectScoreCategory: ProjectScoreCategory) = apply {
            name = projectScoreCategory.name
            value = projectScoreCategory.value
            additionalProperties = projectScoreCategory.additionalProperties.toMutableMap()
        }

        /** Name of the category */
        fun name(name: String) = name(JsonField.of(name))

        /** Name of the category */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Numerical value of the category. Must be between 0 and 1, inclusive */
        fun value(value: Double) = value(JsonField.of(value))

        /** Numerical value of the category. Must be between 0 and 1, inclusive */
        fun value(value: JsonField<Double>) = apply { this.value = value }

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

        fun build(): ProjectScoreCategory =
            ProjectScoreCategory(
                checkRequired("name", name),
                checkRequired("value", value),
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ProjectScoreCategory && name == other.name && value == other.value && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(name, value, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ProjectScoreCategory{name=$name, value=$value, additionalProperties=$additionalProperties}"
}
