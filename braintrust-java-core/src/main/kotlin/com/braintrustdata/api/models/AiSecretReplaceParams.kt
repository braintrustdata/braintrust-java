// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.Params
import com.braintrustdata.api.core.checkRequired
import com.braintrustdata.api.core.http.Headers
import com.braintrustdata.api.core.http.QueryParams
import com.braintrustdata.api.core.immutableEmptyMap
import com.braintrustdata.api.core.toImmutable
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Objects
import java.util.Optional

/**
 * Create or replace ai_secret. If there is an existing ai_secret with the same name as the one
 * specified in the request, will replace the existing ai_secret with the provided fields
 */
class AiSecretReplaceParams
private constructor(
    private val body: AiSecretReplaceBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Name of the AI secret */
    fun name(): String = body.name()

    fun metadata(): Optional<Metadata> = body.metadata()

    /**
     * For nearly all users, this parameter should be unnecessary. But in the rare case that your
     * API key belongs to multiple organizations, you may specify the name of the organization the
     * AI Secret belongs in.
     */
    fun orgName(): Optional<String> = body.orgName()

    /**
     * Secret value. If omitted in a PUT request, the existing secret value will be left intact, not
     * replaced with null.
     */
    fun secret(): Optional<String> = body.secret()

    fun type(): Optional<String> = body.type()

    /** Name of the AI secret */
    fun _name(): JsonField<String> = body._name()

    fun _metadata(): JsonField<Metadata> = body._metadata()

    /**
     * For nearly all users, this parameter should be unnecessary. But in the rare case that your
     * API key belongs to multiple organizations, you may specify the name of the organization the
     * AI Secret belongs in.
     */
    fun _orgName(): JsonField<String> = body._orgName()

    /**
     * Secret value. If omitted in a PUT request, the existing secret value will be left intact, not
     * replaced with null.
     */
    fun _secret(): JsonField<String> = body._secret()

    fun _type(): JsonField<String> = body._type()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun _body(): AiSecretReplaceBody = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class AiSecretReplaceBody
    @JsonCreator
    internal constructor(
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("metadata")
        @ExcludeMissing
        private val metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("org_name")
        @ExcludeMissing
        private val orgName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("secret")
        @ExcludeMissing
        private val secret: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type")
        @ExcludeMissing
        private val type: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Name of the AI secret */
        fun name(): String = name.getRequired("name")

        fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata.getNullable("metadata"))

        /**
         * For nearly all users, this parameter should be unnecessary. But in the rare case that
         * your API key belongs to multiple organizations, you may specify the name of the
         * organization the AI Secret belongs in.
         */
        fun orgName(): Optional<String> = Optional.ofNullable(orgName.getNullable("org_name"))

        /**
         * Secret value. If omitted in a PUT request, the existing secret value will be left intact,
         * not replaced with null.
         */
        fun secret(): Optional<String> = Optional.ofNullable(secret.getNullable("secret"))

        fun type(): Optional<String> = Optional.ofNullable(type.getNullable("type"))

        /** Name of the AI secret */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        /**
         * For nearly all users, this parameter should be unnecessary. But in the rare case that
         * your API key belongs to multiple organizations, you may specify the name of the
         * organization the AI Secret belongs in.
         */
        @JsonProperty("org_name") @ExcludeMissing fun _orgName(): JsonField<String> = orgName

        /**
         * Secret value. If omitted in a PUT request, the existing secret value will be left intact,
         * not replaced with null.
         */
        @JsonProperty("secret") @ExcludeMissing fun _secret(): JsonField<String> = secret

        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): AiSecretReplaceBody = apply {
            if (validated) {
                return@apply
            }

            name()
            metadata().ifPresent { it.validate() }
            orgName()
            secret()
            type()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [AiSecretReplaceBody]. */
        class Builder internal constructor() {

            private var name: JsonField<String>? = null
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var orgName: JsonField<String> = JsonMissing.of()
            private var secret: JsonField<String> = JsonMissing.of()
            private var type: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(aiSecretReplaceBody: AiSecretReplaceBody) = apply {
                name = aiSecretReplaceBody.name
                metadata = aiSecretReplaceBody.metadata
                orgName = aiSecretReplaceBody.orgName
                secret = aiSecretReplaceBody.secret
                type = aiSecretReplaceBody.type
                additionalProperties = aiSecretReplaceBody.additionalProperties.toMutableMap()
            }

            /** Name of the AI secret */
            fun name(name: String) = name(JsonField.of(name))

            /** Name of the AI secret */
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun metadata(metadata: Metadata?) = metadata(JsonField.ofNullable(metadata))

            fun metadata(metadata: Optional<Metadata>) = metadata(metadata.orElse(null))

            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            /**
             * For nearly all users, this parameter should be unnecessary. But in the rare case that
             * your API key belongs to multiple organizations, you may specify the name of the
             * organization the AI Secret belongs in.
             */
            fun orgName(orgName: String?) = orgName(JsonField.ofNullable(orgName))

            /**
             * For nearly all users, this parameter should be unnecessary. But in the rare case that
             * your API key belongs to multiple organizations, you may specify the name of the
             * organization the AI Secret belongs in.
             */
            fun orgName(orgName: Optional<String>) = orgName(orgName.orElse(null))

            /**
             * For nearly all users, this parameter should be unnecessary. But in the rare case that
             * your API key belongs to multiple organizations, you may specify the name of the
             * organization the AI Secret belongs in.
             */
            fun orgName(orgName: JsonField<String>) = apply { this.orgName = orgName }

            /**
             * Secret value. If omitted in a PUT request, the existing secret value will be left
             * intact, not replaced with null.
             */
            fun secret(secret: String?) = secret(JsonField.ofNullable(secret))

            /**
             * Secret value. If omitted in a PUT request, the existing secret value will be left
             * intact, not replaced with null.
             */
            fun secret(secret: Optional<String>) = secret(secret.orElse(null))

            /**
             * Secret value. If omitted in a PUT request, the existing secret value will be left
             * intact, not replaced with null.
             */
            fun secret(secret: JsonField<String>) = apply { this.secret = secret }

            fun type(type: String?) = type(JsonField.ofNullable(type))

            fun type(type: Optional<String>) = type(type.orElse(null))

            fun type(type: JsonField<String>) = apply { this.type = type }

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

            fun build(): AiSecretReplaceBody =
                AiSecretReplaceBody(
                    checkRequired("name", name),
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

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AiSecretReplaceParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var body: AiSecretReplaceBody.Builder = AiSecretReplaceBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(aiSecretReplaceParams: AiSecretReplaceParams) = apply {
            body = aiSecretReplaceParams.body.toBuilder()
            additionalHeaders = aiSecretReplaceParams.additionalHeaders.toBuilder()
            additionalQueryParams = aiSecretReplaceParams.additionalQueryParams.toBuilder()
        }

        /** Name of the AI secret */
        fun name(name: String) = apply { body.name(name) }

        /** Name of the AI secret */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        fun metadata(metadata: Metadata?) = apply { body.metadata(metadata) }

        fun metadata(metadata: Optional<Metadata>) = metadata(metadata.orElse(null))

        fun metadata(metadata: JsonField<Metadata>) = apply { body.metadata(metadata) }

        /**
         * For nearly all users, this parameter should be unnecessary. But in the rare case that
         * your API key belongs to multiple organizations, you may specify the name of the
         * organization the AI Secret belongs in.
         */
        fun orgName(orgName: String?) = apply { body.orgName(orgName) }

        /**
         * For nearly all users, this parameter should be unnecessary. But in the rare case that
         * your API key belongs to multiple organizations, you may specify the name of the
         * organization the AI Secret belongs in.
         */
        fun orgName(orgName: Optional<String>) = orgName(orgName.orElse(null))

        /**
         * For nearly all users, this parameter should be unnecessary. But in the rare case that
         * your API key belongs to multiple organizations, you may specify the name of the
         * organization the AI Secret belongs in.
         */
        fun orgName(orgName: JsonField<String>) = apply { body.orgName(orgName) }

        /**
         * Secret value. If omitted in a PUT request, the existing secret value will be left intact,
         * not replaced with null.
         */
        fun secret(secret: String?) = apply { body.secret(secret) }

        /**
         * Secret value. If omitted in a PUT request, the existing secret value will be left intact,
         * not replaced with null.
         */
        fun secret(secret: Optional<String>) = secret(secret.orElse(null))

        /**
         * Secret value. If omitted in a PUT request, the existing secret value will be left intact,
         * not replaced with null.
         */
        fun secret(secret: JsonField<String>) = apply { body.secret(secret) }

        fun type(type: String?) = apply { body.type(type) }

        fun type(type: Optional<String>) = type(type.orElse(null))

        fun type(type: JsonField<String>) = apply { body.type(type) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

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

        fun build(): AiSecretReplaceParams =
            AiSecretReplaceParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    @NoAutoDetect
    class Metadata
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Metadata = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Metadata]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(metadata: Metadata) = apply {
                additionalProperties = metadata.additionalProperties.toMutableMap()
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AiSecretReplaceParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "AiSecretReplaceParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
