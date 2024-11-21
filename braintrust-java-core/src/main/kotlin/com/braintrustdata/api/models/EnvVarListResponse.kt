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

@JsonDeserialize(builder = EnvVarListResponse.Builder::class)
@NoAutoDetect
class EnvVarListResponse
private constructor(
    private val objects: JsonField<List<EnvVar>>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /** A list of env_var objects */
    fun objects(): List<EnvVar> = objects.getRequired("objects")

    /** A list of env_var objects */
    @JsonProperty("objects") @ExcludeMissing fun _objects() = objects

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): EnvVarListResponse = apply {
        if (!validated) {
            objects().forEach { it.validate() }
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var objects: JsonField<List<EnvVar>> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(envVarListResponse: EnvVarListResponse) = apply {
            this.objects = envVarListResponse.objects
            additionalProperties(envVarListResponse.additionalProperties)
        }

        /** A list of env_var objects */
        fun objects(objects: List<EnvVar>) = objects(JsonField.of(objects))

        /** A list of env_var objects */
        @JsonProperty("objects")
        @ExcludeMissing
        fun objects(objects: JsonField<List<EnvVar>>) = apply { this.objects = objects }

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

        fun build(): EnvVarListResponse =
            EnvVarListResponse(objects.map { it.toImmutable() }, additionalProperties.toImmutable())
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is EnvVarListResponse && objects == other.objects && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(objects, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EnvVarListResponse{objects=$objects, additionalProperties=$additionalProperties}"
}
