// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.toUnmodifiable
import com.braintrustdata.api.models.*
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import java.util.Objects
import java.util.Optional

class AiSecretCreateParams
constructor(
    private val name: String,
    private val metadata: Metadata?,
    private val orgName: String?,
    private val secret: String?,
    private val type: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun name(): String = name

    fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata)

    fun orgName(): Optional<String> = Optional.ofNullable(orgName)

    fun secret(): Optional<String> = Optional.ofNullable(secret)

    fun type(): Optional<String> = Optional.ofNullable(type)

    @JvmSynthetic
    internal fun getBody(): AiSecretCreateBody {
        return AiSecretCreateBody(
            name,
            metadata,
            orgName,
            secret,
            type,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = AiSecretCreateBody.Builder::class)
    @NoAutoDetect
    class AiSecretCreateBody
    internal constructor(
        private val name: String?,
        private val metadata: Metadata?,
        private val orgName: String?,
        private val secret: String?,
        private val type: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** Name of the AI secret */
        @JsonProperty("name") fun name(): String? = name

        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

        /**
         * For nearly all users, this parameter should be unnecessary. But in the rare case that
         * your API key belongs to multiple organizations, you may specify the name of the
         * organization the AI Secret belongs in.
         */
        @JsonProperty("org_name") fun orgName(): String? = orgName

        /**
         * Secret value. If omitted in a PUT request, the existing secret value will be left intact,
         * not replaced with null.
         */
        @JsonProperty("secret") fun secret(): String? = secret

        @JsonProperty("type") fun type(): String? = type

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AiSecretCreateBody &&
                this.name == other.name &&
                this.metadata == other.metadata &&
                this.orgName == other.orgName &&
                this.secret == other.secret &&
                this.type == other.type &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        name,
                        metadata,
                        orgName,
                        secret,
                        type,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "AiSecretCreateBody{name=$name, metadata=$metadata, orgName=$orgName, secret=$secret, type=$type, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var name: String? = null
            private var metadata: Metadata? = null
            private var orgName: String? = null
            private var secret: String? = null
            private var type: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(aiSecretCreateBody: AiSecretCreateBody) = apply {
                this.name = aiSecretCreateBody.name
                this.metadata = aiSecretCreateBody.metadata
                this.orgName = aiSecretCreateBody.orgName
                this.secret = aiSecretCreateBody.secret
                this.type = aiSecretCreateBody.type
                additionalProperties(aiSecretCreateBody.additionalProperties)
            }

            /** Name of the AI secret */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            @JsonProperty("metadata")
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

            /**
             * For nearly all users, this parameter should be unnecessary. But in the rare case that
             * your API key belongs to multiple organizations, you may specify the name of the
             * organization the AI Secret belongs in.
             */
            @JsonProperty("org_name")
            fun orgName(orgName: String) = apply { this.orgName = orgName }

            /**
             * Secret value. If omitted in a PUT request, the existing secret value will be left
             * intact, not replaced with null.
             */
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

            fun build(): AiSecretCreateBody =
                AiSecretCreateBody(
                    checkNotNull(name) { "`name` is required but was not set" },
                    metadata,
                    orgName,
                    secret,
                    type,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AiSecretCreateParams &&
            this.name == other.name &&
            this.metadata == other.metadata &&
            this.orgName == other.orgName &&
            this.secret == other.secret &&
            this.type == other.type &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            name,
            metadata,
            orgName,
            secret,
            type,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "AiSecretCreateParams{name=$name, metadata=$metadata, orgName=$orgName, secret=$secret, type=$type, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var name: String? = null
        private var metadata: Metadata? = null
        private var orgName: String? = null
        private var secret: String? = null
        private var type: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(aiSecretCreateParams: AiSecretCreateParams) = apply {
            this.name = aiSecretCreateParams.name
            this.metadata = aiSecretCreateParams.metadata
            this.orgName = aiSecretCreateParams.orgName
            this.secret = aiSecretCreateParams.secret
            this.type = aiSecretCreateParams.type
            additionalQueryParams(aiSecretCreateParams.additionalQueryParams)
            additionalHeaders(aiSecretCreateParams.additionalHeaders)
            additionalBodyProperties(aiSecretCreateParams.additionalBodyProperties)
        }

        /** Name of the AI secret */
        fun name(name: String) = apply { this.name = name }

        fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

        /**
         * For nearly all users, this parameter should be unnecessary. But in the rare case that
         * your API key belongs to multiple organizations, you may specify the name of the
         * organization the AI Secret belongs in.
         */
        fun orgName(orgName: String) = apply { this.orgName = orgName }

        /**
         * Secret value. If omitted in a PUT request, the existing secret value will be left intact,
         * not replaced with null.
         */
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

        fun build(): AiSecretCreateParams =
            AiSecretCreateParams(
                checkNotNull(name) { "`name` is required but was not set" },
                metadata,
                orgName,
                secret,
                type,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(builder = Metadata.Builder::class)
    @NoAutoDetect
    class Metadata
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Metadata && this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(additionalProperties)
            }
            return hashCode
        }

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"

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

            fun build(): Metadata = Metadata(additionalProperties.toUnmodifiable())
        }
    }
}
