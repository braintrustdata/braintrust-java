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
 * Partially update an ai_secret object. Specify the fields to update in the payload. Any
 * object-type fields will be deep-merged with existing content. Currently we do not support
 * removing fields or setting them to null.
 */
class AiSecretUpdateParams
private constructor(
    private val aiSecretId: String,
    private val body: AiSecretUpdateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** AiSecret id */
    fun aiSecretId(): String = aiSecretId

    fun metadata(): Optional<Metadata> = body.metadata()

    /** Name of the AI secret */
    fun name(): Optional<String> = body.name()

    fun secret(): Optional<String> = body.secret()

    fun type(): Optional<String> = body.type()

    fun _metadata(): JsonField<Metadata> = body._metadata()

    /** Name of the AI secret */
    fun _name(): JsonField<String> = body._name()

    fun _secret(): JsonField<String> = body._secret()

    fun _type(): JsonField<String> = body._type()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun _body(): AiSecretUpdateBody = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> aiSecretId
            else -> ""
        }
    }

    @NoAutoDetect
    class AiSecretUpdateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("metadata")
        @ExcludeMissing
        private val metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("secret")
        @ExcludeMissing
        private val secret: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type")
        @ExcludeMissing
        private val type: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata.getNullable("metadata"))

        /** Name of the AI secret */
        fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

        fun secret(): Optional<String> = Optional.ofNullable(secret.getNullable("secret"))

        fun type(): Optional<String> = Optional.ofNullable(type.getNullable("type"))

        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        /** Name of the AI secret */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        @JsonProperty("secret") @ExcludeMissing fun _secret(): JsonField<String> = secret

        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): AiSecretUpdateBody = apply {
            if (validated) {
                return@apply
            }

            metadata().ifPresent { it.validate() }
            name()
            secret()
            type()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [AiSecretUpdateBody]. */
        class Builder internal constructor() {

            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var secret: JsonField<String> = JsonMissing.of()
            private var type: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(aiSecretUpdateBody: AiSecretUpdateBody) = apply {
                metadata = aiSecretUpdateBody.metadata
                name = aiSecretUpdateBody.name
                secret = aiSecretUpdateBody.secret
                type = aiSecretUpdateBody.type
                additionalProperties = aiSecretUpdateBody.additionalProperties.toMutableMap()
            }

            fun metadata(metadata: Metadata?) = metadata(JsonField.ofNullable(metadata))

            fun metadata(metadata: Optional<Metadata>) = metadata(metadata.orElse(null))

            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            /** Name of the AI secret */
            fun name(name: String?) = name(JsonField.ofNullable(name))

            /** Name of the AI secret */
            fun name(name: Optional<String>) = name(name.orElse(null))

            /** Name of the AI secret */
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun secret(secret: String?) = secret(JsonField.ofNullable(secret))

            fun secret(secret: Optional<String>) = secret(secret.orElse(null))

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

            fun build(): AiSecretUpdateBody =
                AiSecretUpdateBody(metadata, name, secret, type, additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AiSecretUpdateBody && metadata == other.metadata && name == other.name && secret == other.secret && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(metadata, name, secret, type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AiSecretUpdateBody{metadata=$metadata, name=$name, secret=$secret, type=$type, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AiSecretUpdateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var aiSecretId: String? = null
        private var body: AiSecretUpdateBody.Builder = AiSecretUpdateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(aiSecretUpdateParams: AiSecretUpdateParams) = apply {
            aiSecretId = aiSecretUpdateParams.aiSecretId
            body = aiSecretUpdateParams.body.toBuilder()
            additionalHeaders = aiSecretUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = aiSecretUpdateParams.additionalQueryParams.toBuilder()
        }

        /** AiSecret id */
        fun aiSecretId(aiSecretId: String) = apply { this.aiSecretId = aiSecretId }

        fun metadata(metadata: Metadata?) = apply { body.metadata(metadata) }

        fun metadata(metadata: Optional<Metadata>) = metadata(metadata.orElse(null))

        fun metadata(metadata: JsonField<Metadata>) = apply { body.metadata(metadata) }

        /** Name of the AI secret */
        fun name(name: String?) = apply { body.name(name) }

        /** Name of the AI secret */
        fun name(name: Optional<String>) = name(name.orElse(null))

        /** Name of the AI secret */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        fun secret(secret: String?) = apply { body.secret(secret) }

        fun secret(secret: Optional<String>) = secret(secret.orElse(null))

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

        fun build(): AiSecretUpdateParams =
            AiSecretUpdateParams(
                checkRequired("aiSecretId", aiSecretId),
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
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
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

        return /* spotless:off */ other is AiSecretUpdateParams && aiSecretId == other.aiSecretId && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(aiSecretId, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "AiSecretUpdateParams{aiSecretId=$aiSecretId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
