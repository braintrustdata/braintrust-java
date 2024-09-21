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

class OrgSecretUpdateParams
constructor(
    private val orgSecretId: String,
    private val metadata: Metadata?,
    private val name: String?,
    private val secret: String?,
    private val type: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun orgSecretId(): String = orgSecretId

    fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata)

    fun name(): Optional<String> = Optional.ofNullable(name)

    fun secret(): Optional<String> = Optional.ofNullable(secret)

    fun type(): Optional<String> = Optional.ofNullable(type)

    @JvmSynthetic
    internal fun getBody(): OrgSecretUpdateBody {
        return OrgSecretUpdateBody(
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
            0 -> orgSecretId
            else -> ""
        }
    }

    @JsonDeserialize(builder = OrgSecretUpdateBody.Builder::class)
    @NoAutoDetect
    class OrgSecretUpdateBody
    internal constructor(
        private val metadata: Metadata?,
        private val name: String?,
        private val secret: String?,
        private val type: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

        /** Name of the org secret */
        @JsonProperty("name") fun name(): String? = name

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

            return other is OrgSecretUpdateBody &&
                this.metadata == other.metadata &&
                this.name == other.name &&
                this.secret == other.secret &&
                this.type == other.type &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        metadata,
                        name,
                        secret,
                        type,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "OrgSecretUpdateBody{metadata=$metadata, name=$name, secret=$secret, type=$type, additionalProperties=$additionalProperties}"

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
            internal fun from(orgSecretUpdateBody: OrgSecretUpdateBody) = apply {
                this.metadata = orgSecretUpdateBody.metadata
                this.name = orgSecretUpdateBody.name
                this.secret = orgSecretUpdateBody.secret
                this.type = orgSecretUpdateBody.type
                additionalProperties(orgSecretUpdateBody.additionalProperties)
            }

            @JsonProperty("metadata")
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

            /** Name of the org secret */
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

            fun build(): OrgSecretUpdateBody =
                OrgSecretUpdateBody(
                    metadata,
                    name,
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

        return other is OrgSecretUpdateParams &&
            this.orgSecretId == other.orgSecretId &&
            this.metadata == other.metadata &&
            this.name == other.name &&
            this.secret == other.secret &&
            this.type == other.type &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            orgSecretId,
            metadata,
            name,
            secret,
            type,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "OrgSecretUpdateParams{orgSecretId=$orgSecretId, metadata=$metadata, name=$name, secret=$secret, type=$type, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var orgSecretId: String? = null
        private var metadata: Metadata? = null
        private var name: String? = null
        private var secret: String? = null
        private var type: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(orgSecretUpdateParams: OrgSecretUpdateParams) = apply {
            this.orgSecretId = orgSecretUpdateParams.orgSecretId
            this.metadata = orgSecretUpdateParams.metadata
            this.name = orgSecretUpdateParams.name
            this.secret = orgSecretUpdateParams.secret
            this.type = orgSecretUpdateParams.type
            additionalQueryParams(orgSecretUpdateParams.additionalQueryParams)
            additionalHeaders(orgSecretUpdateParams.additionalHeaders)
            additionalBodyProperties(orgSecretUpdateParams.additionalBodyProperties)
        }

        /** OrgSecret id */
        fun orgSecretId(orgSecretId: String) = apply { this.orgSecretId = orgSecretId }

        fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

        /** Name of the org secret */
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

        fun build(): OrgSecretUpdateParams =
            OrgSecretUpdateParams(
                checkNotNull(orgSecretId) { "`orgSecretId` is required but was not set" },
                metadata,
                name,
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
