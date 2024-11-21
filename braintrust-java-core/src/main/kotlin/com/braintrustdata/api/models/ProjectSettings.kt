// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.toImmutable
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = ProjectSettings.Builder::class)
@NoAutoDetect
class ProjectSettings
private constructor(
    private val comparisonKey: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /** The key used to join two experiments (defaults to `input`). */
    fun comparisonKey(): Optional<String> =
        Optional.ofNullable(comparisonKey.getNullable("comparison_key"))

    /** The key used to join two experiments (defaults to `input`). */
    @JsonProperty("comparison_key") @ExcludeMissing fun _comparisonKey() = comparisonKey

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): ProjectSettings = apply {
        if (!validated) {
            comparisonKey()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var comparisonKey: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(projectSettings: ProjectSettings) = apply {
            this.comparisonKey = projectSettings.comparisonKey
            additionalProperties(projectSettings.additionalProperties)
        }

        /** The key used to join two experiments (defaults to `input`). */
        fun comparisonKey(comparisonKey: String) = comparisonKey(JsonField.of(comparisonKey))

        /** The key used to join two experiments (defaults to `input`). */
        @JsonProperty("comparison_key")
        @ExcludeMissing
        fun comparisonKey(comparisonKey: JsonField<String>) = apply {
            this.comparisonKey = comparisonKey
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

        fun build(): ProjectSettings =
            ProjectSettings(comparisonKey, additionalProperties.toImmutable())
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ProjectSettings && comparisonKey == other.comparisonKey && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(comparisonKey, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ProjectSettings{comparisonKey=$comparisonKey, additionalProperties=$additionalProperties}"
}
