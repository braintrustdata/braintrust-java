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

class AiSecretUpdateParams
constructor(
    private val aiSecretId: String,
    private val metadata: Metadata?,
    private val name: String?,
    private val secret: String?,
    private val type: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun aiSecretId(): String = aiSecretId

    fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata)

    fun name(): Optional<String> = Optional.ofNullable(name)

    fun secret(): Optional<String> = Optional.ofNullable(secret)

    fun type(): Optional<String> = Optional.ofNullable(type)

    @JvmSynthetic
    internal fun getBody(): AiSecretUpdateBody {
        return AiSecretUpdateBody(
            metadata,
            name,
            secret,
            type,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> aiSecretId
            else -> ""
        }
    }

    @JsonDeserialize(builder = AiSecretUpdateBody.Builder::class)
    @NoAutoDetect
    class AiSecretUpdateBody
    internal constructor(
        private val metadata: Metadata?,
        private val name: String?,
        private val secret: String?,
        private val type: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

        /** Name of the AI secret */
        @JsonProperty("name") fun name(): String? = name

        @JsonProperty("secret") fun secret(): String? = secret

        @JsonProperty("type") fun type(): String? = type

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var metadata: Metadata? = null
            private var name: String? = null
            private var secret: String? = null
            private var type: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(aiSecretUpdateBody: AiSecretUpdateBody) = apply {
                this.metadata = aiSecretUpdateBody.metadata
                this.name = aiSecretUpdateBody.name
                this.secret = aiSecretUpdateBody.secret
                this.type = aiSecretUpdateBody.type
                additionalProperties(aiSecretUpdateBody.additionalProperties)
            }

            @JsonProperty("metadata")
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

            /** Name of the AI secret */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            @JsonProperty("secret") fun secret(secret: String) = apply { this.secret = secret }

            @JsonProperty("type") fun type(type: String) = apply { this.type = type }

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

            fun build(): AiSecretUpdateBody =
                AiSecretUpdateBody(
                    metadata,
                    name,
                    secret,
                    type,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AiSecretUpdateBody && this.metadata == other.metadata && this.name == other.name && this.secret == other.secret && this.type == other.type && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(metadata, name, secret, type, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "AiSecretUpdateBody{metadata=$metadata, name=$name, secret=$secret, type=$type, additionalProperties=$additionalProperties}"
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AiSecretUpdateParams && this.aiSecretId == other.aiSecretId && this.metadata == other.metadata && this.name == other.name && this.secret == other.secret && this.type == other.type && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(aiSecretId, metadata, name, secret, type, additionalQueryParams, additionalHeaders, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "AiSecretUpdateParams{aiSecretId=$aiSecretId, metadata=$metadata, name=$name, secret=$secret, type=$type, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var aiSecretId: String? = null
        private var metadata: Metadata? = null
        private var name: String? = null
        private var secret: String? = null
        private var type: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(aiSecretUpdateParams: AiSecretUpdateParams) = apply {
            this.aiSecretId = aiSecretUpdateParams.aiSecretId
            this.metadata = aiSecretUpdateParams.metadata
            this.name = aiSecretUpdateParams.name
            this.secret = aiSecretUpdateParams.secret
            this.type = aiSecretUpdateParams.type
            additionalQueryParams(aiSecretUpdateParams.additionalQueryParams)
            additionalHeaders(aiSecretUpdateParams.additionalHeaders)
            additionalBodyProperties(aiSecretUpdateParams.additionalBodyProperties)
        }

        /** AiSecret id */
        fun aiSecretId(aiSecretId: String) = apply { this.aiSecretId = aiSecretId }

        fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

        /** Name of the AI secret */
        fun name(name: String) = apply { this.name = name }

        fun secret(secret: String) = apply { this.secret = secret }

        fun type(type: String) = apply { this.type = type }

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

        fun build(): AiSecretUpdateParams =
            AiSecretUpdateParams(
                checkNotNull(aiSecretId) { "`aiSecretId` is required but was not set" },
                metadata,
                name,
                secret,
                type,
                additionalQueryParams.mapValues { it.value.toImmutable() }.toImmutable(),
                additionalHeaders.mapValues { it.value.toImmutable() }.toImmutable(),
                additionalBodyProperties.toImmutable(),
            )
    }

    @JsonDeserialize(builder = Metadata.Builder::class)
    @NoAutoDetect
    class Metadata
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(metadata: Metadata) = apply {
                additionalProperties(metadata.additionalProperties)
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

            fun build(): Metadata = Metadata(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Metadata && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
    }
}
