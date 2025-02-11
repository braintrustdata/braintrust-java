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

@NoAutoDetect
class EnvVarListResponse
@JsonCreator
private constructor(
    @JsonProperty("objects")
    @ExcludeMissing
    private val objects: JsonField<List<EnvVar>> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** A list of env_var objects */
    fun objects(): List<EnvVar> = objects.getRequired("objects")

    /** A list of env_var objects */
    @JsonProperty("objects") @ExcludeMissing fun _objects(): JsonField<List<EnvVar>> = objects

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): EnvVarListResponse = apply {
        if (validated) {
            return@apply
        }

        objects().forEach { it.validate() }
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EnvVarListResponse]. */
    class Builder internal constructor() {

        private var objects: JsonField<MutableList<EnvVar>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(envVarListResponse: EnvVarListResponse) = apply {
            objects = envVarListResponse.objects.map { it.toMutableList() }
            additionalProperties = envVarListResponse.additionalProperties.toMutableMap()
        }

        /** A list of env_var objects */
        fun objects(objects: List<EnvVar>) = objects(JsonField.of(objects))

        /** A list of env_var objects */
        fun objects(objects: JsonField<List<EnvVar>>) = apply {
            this.objects = objects.map { it.toMutableList() }
        }

        /** A list of env_var objects */
        fun addObject(object_: EnvVar) = apply {
            objects =
                (objects ?: JsonField.of(mutableListOf())).apply {
                    asKnown()
                        .orElseThrow {
                            IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            )
                        }
                        .add(object_)
                }
        }

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

        fun build(): EnvVarListResponse =
            EnvVarListResponse(
                checkRequired("objects", objects).map { it.toImmutable() },
                additionalProperties.toImmutable()
            )
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
