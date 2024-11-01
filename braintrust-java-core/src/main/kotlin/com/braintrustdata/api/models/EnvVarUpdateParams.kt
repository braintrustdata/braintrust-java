// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.toImmutable
import com.braintrustdata.api.models.*
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import java.util.Objects
import java.util.Optional

class EnvVarUpdateParams
constructor(
    private val envVarId: String,
    private val name: String,
    private val value: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun envVarId(): String = envVarId

    fun name(): String = name

    fun value(): Optional<String> = Optional.ofNullable(value)

    @JvmSynthetic
    internal fun getBody(): EnvVarUpdateBody {
        return EnvVarUpdateBody(
            name,
            value,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> envVarId
            else -> ""
        }
    }

    @JsonDeserialize(builder = EnvVarUpdateBody.Builder::class)
    @NoAutoDetect
    class EnvVarUpdateBody
    internal constructor(
        private val name: String?,
        private val value: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The name of the environment variable */
        @JsonProperty("name") fun name(): String? = name

        /** The value of the environment variable. Will be encrypted at rest. */
        @JsonProperty("value") fun value(): String? = value

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var name: String? = null
            private var value: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(envVarUpdateBody: EnvVarUpdateBody) = apply {
                this.name = envVarUpdateBody.name
                this.value = envVarUpdateBody.value
                additionalProperties(envVarUpdateBody.additionalProperties)
            }

            /** The name of the environment variable */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            /** The value of the environment variable. Will be encrypted at rest. */
            @JsonProperty("value") fun value(value: String) = apply { this.value = value }

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

            fun build(): EnvVarUpdateBody =
                EnvVarUpdateBody(
                    checkNotNull(name) { "`name` is required but was not set" },
                    value,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is EnvVarUpdateBody && this.name == other.name && this.value == other.value && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(name, value, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "EnvVarUpdateBody{name=$name, value=$value, additionalProperties=$additionalProperties}"
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is EnvVarUpdateParams && this.envVarId == other.envVarId && this.name == other.name && this.value == other.value && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(envVarId, name, value, additionalQueryParams, additionalHeaders, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "EnvVarUpdateParams{envVarId=$envVarId, name=$name, value=$value, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var envVarId: String? = null
        private var name: String? = null
        private var value: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(envVarUpdateParams: EnvVarUpdateParams) = apply {
            this.envVarId = envVarUpdateParams.envVarId
            this.name = envVarUpdateParams.name
            this.value = envVarUpdateParams.value
            additionalQueryParams(envVarUpdateParams.additionalQueryParams)
            additionalHeaders(envVarUpdateParams.additionalHeaders)
            additionalBodyProperties(envVarUpdateParams.additionalBodyProperties)
        }

        /** EnvVar id */
        fun envVarId(envVarId: String) = apply { this.envVarId = envVarId }

        /** The name of the environment variable */
        fun name(name: String) = apply { this.name = name }

        /** The value of the environment variable. Will be encrypted at rest. */
        fun value(value: String) = apply { this.value = value }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): EnvVarUpdateParams =
            EnvVarUpdateParams(
                checkNotNull(envVarId) { "`envVarId` is required but was not set" },
                checkNotNull(name) { "`name` is required but was not set" },
                value,
                additionalQueryParams.mapValues { it.value.toImmutable() }.toImmutable(),
                additionalHeaders.mapValues { it.value.toImmutable() }.toImmutable(),
                additionalBodyProperties.toImmutable(),
            )
    }
}
