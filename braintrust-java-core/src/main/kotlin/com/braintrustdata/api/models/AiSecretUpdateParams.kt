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
import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import java.util.Objects
import java.util.Optional

class AiSecretUpdateParams
constructor(
    private val aiSecretId: String,
    private val metadata: Metadata?,
    private val name: String?,
    private val secret: String?,
    private val type: String?,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalQueryParams: Map<String, List<String>>,
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

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

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

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AiSecretUpdateParams && this.aiSecretId == other.aiSecretId && this.metadata == other.metadata && this.name == other.name && this.secret == other.secret && this.type == other.type && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(aiSecretId, metadata, name, secret, type, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "AiSecretUpdateParams{aiSecretId=$aiSecretId, metadata=$metadata, name=$name, secret=$secret, type=$type, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

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
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(aiSecretUpdateParams: AiSecretUpdateParams) = apply {
            this.aiSecretId = aiSecretUpdateParams.aiSecretId
            this.metadata = aiSecretUpdateParams.metadata
            this.name = aiSecretUpdateParams.name
            this.secret = aiSecretUpdateParams.secret
            this.type = aiSecretUpdateParams.type
            additionalHeaders(aiSecretUpdateParams.additionalHeaders)
            additionalQueryParams(aiSecretUpdateParams.additionalQueryParams)
            additionalBodyProperties(aiSecretUpdateParams.additionalBodyProperties)
        }

        /** AiSecret id */
        fun aiSecretId(aiSecretId: String) = apply { this.aiSecretId = aiSecretId }

        fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

        /** Name of the AI secret */
        fun name(name: String) = apply { this.name = name }

        fun secret(secret: String) = apply { this.secret = secret }

        fun type(type: String) = apply { this.type = type }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.putAll(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(::putAdditionalHeaders)
        }

        fun removeAdditionalHeader(name: String) = apply { additionalHeaders.removeAll(name) }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.putAll(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                additionalQueryParams.forEach(::putAdditionalQueryParams)
            }

        fun removeAdditionalQueryParam(key: String) = apply { additionalQueryParams.removeAll(key) }

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
                additionalHeaders
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalQueryParams
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
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
