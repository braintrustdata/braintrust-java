// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.http.Headers
import com.braintrustdata.api.core.http.QueryParams
import com.braintrustdata.api.core.toImmutable
import com.braintrustdata.api.models.*
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import java.util.Objects
import java.util.Optional

class AiSecretReplaceParams
constructor(
    private val name: String,
    private val metadata: Metadata?,
    private val orgName: String?,
    private val secret: String?,
    private val type: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun name(): String = name

    fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata)

    fun orgName(): Optional<String> = Optional.ofNullable(orgName)

    fun secret(): Optional<String> = Optional.ofNullable(secret)

    fun type(): Optional<String> = Optional.ofNullable(type)

    @JvmSynthetic
    internal fun getBody(): AiSecretReplaceBody {
        return AiSecretReplaceBody(
            name,
            metadata,
            orgName,
            secret,
            type,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @JsonDeserialize(builder = AiSecretReplaceBody.Builder::class)
    @NoAutoDetect
    class AiSecretReplaceBody
    internal constructor(
        private val name: String?,
        private val metadata: Metadata?,
        private val orgName: String?,
        private val secret: String?,
        private val type: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

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
            internal fun from(aiSecretReplaceBody: AiSecretReplaceBody) = apply {
                this.name = aiSecretReplaceBody.name
                this.metadata = aiSecretReplaceBody.metadata
                this.orgName = aiSecretReplaceBody.orgName
                this.secret = aiSecretReplaceBody.secret
                this.type = aiSecretReplaceBody.type
                additionalProperties(aiSecretReplaceBody.additionalProperties)
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

            fun build(): AiSecretReplaceBody =
                AiSecretReplaceBody(
                    checkNotNull(name) { "`name` is required but was not set" },
                    metadata,
                    orgName,
                    secret,
                    type,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AiSecretReplaceBody && name == other.name && metadata == other.metadata && orgName == other.orgName && secret == other.secret && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(name, metadata, orgName, secret, type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AiSecretReplaceBody{name=$name, metadata=$metadata, orgName=$orgName, secret=$secret, type=$type, additionalProperties=$additionalProperties}"
    }

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AiSecretReplaceParams && name == other.name && metadata == other.metadata && orgName == other.orgName && secret == other.secret && type == other.type && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(name, metadata, orgName, secret, type, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "AiSecretReplaceParams{name=$name, metadata=$metadata, orgName=$orgName, secret=$secret, type=$type, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

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
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(aiSecretReplaceParams: AiSecretReplaceParams) = apply {
            this.name = aiSecretReplaceParams.name
            this.metadata = aiSecretReplaceParams.metadata
            this.orgName = aiSecretReplaceParams.orgName
            this.secret = aiSecretReplaceParams.secret
            this.type = aiSecretReplaceParams.type
            additionalHeaders(aiSecretReplaceParams.additionalHeaders)
            additionalQueryParams(aiSecretReplaceParams.additionalQueryParams)
            additionalBodyProperties(aiSecretReplaceParams.additionalBodyProperties)
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

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            putAllAdditionalBodyProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply {
            additionalBodyProperties.remove(key)
        }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalBodyProperty)
        }

        fun build(): AiSecretReplaceParams =
            AiSecretReplaceParams(
                checkNotNull(name) { "`name` is required but was not set" },
                metadata,
                orgName,
                secret,
                type,
                additionalHeaders.build(),
                additionalQueryParams.build(),
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

            return /* spotless:off */ other is Metadata && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
    }
}
