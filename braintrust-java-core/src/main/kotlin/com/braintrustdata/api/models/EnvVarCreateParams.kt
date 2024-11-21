// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.Enum
import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.http.Headers
import com.braintrustdata.api.core.http.QueryParams
import com.braintrustdata.api.core.toImmutable
import com.braintrustdata.api.errors.BraintrustInvalidDataException
import com.braintrustdata.api.models.*
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import java.util.Objects
import java.util.Optional

class EnvVarCreateParams
constructor(
    private val name: String,
    private val objectId: String,
    private val objectType: ObjectType,
    private val value: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun name(): String = name

    fun objectId(): String = objectId

    fun objectType(): ObjectType = objectType

    fun value(): Optional<String> = Optional.ofNullable(value)

    @JvmSynthetic
    internal fun getBody(): EnvVarCreateBody {
        return EnvVarCreateBody(
            name,
            objectId,
            objectType,
            value,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @JsonDeserialize(builder = EnvVarCreateBody.Builder::class)
    @NoAutoDetect
    class EnvVarCreateBody
    internal constructor(
        private val name: String?,
        private val objectId: String?,
        private val objectType: ObjectType?,
        private val value: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The name of the environment variable */
        @JsonProperty("name") fun name(): String? = name

        /** The id of the object the environment variable is scoped for */
        @JsonProperty("object_id") fun objectId(): String? = objectId

        /** The type of the object the environment variable is scoped for */
        @JsonProperty("object_type") fun objectType(): ObjectType? = objectType

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
            private var objectId: String? = null
            private var objectType: ObjectType? = null
            private var value: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(envVarCreateBody: EnvVarCreateBody) = apply {
                this.name = envVarCreateBody.name
                this.objectId = envVarCreateBody.objectId
                this.objectType = envVarCreateBody.objectType
                this.value = envVarCreateBody.value
                additionalProperties(envVarCreateBody.additionalProperties)
            }

            /** The name of the environment variable */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            /** The id of the object the environment variable is scoped for */
            @JsonProperty("object_id")
            fun objectId(objectId: String) = apply { this.objectId = objectId }

            /** The type of the object the environment variable is scoped for */
            @JsonProperty("object_type")
            fun objectType(objectType: ObjectType) = apply { this.objectType = objectType }

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

            fun build(): EnvVarCreateBody =
                EnvVarCreateBody(
                    checkNotNull(name) { "`name` is required but was not set" },
                    checkNotNull(objectId) { "`objectId` is required but was not set" },
                    checkNotNull(objectType) { "`objectType` is required but was not set" },
                    value,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is EnvVarCreateBody && name == other.name && objectId == other.objectId && objectType == other.objectType && value == other.value && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(name, objectId, objectType, value, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "EnvVarCreateBody{name=$name, objectId=$objectId, objectType=$objectType, value=$value, additionalProperties=$additionalProperties}"
    }

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is EnvVarCreateParams && name == other.name && objectId == other.objectId && objectType == other.objectType && value == other.value && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(name, objectId, objectType, value, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "EnvVarCreateParams{name=$name, objectId=$objectId, objectType=$objectType, value=$value, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var name: String? = null
        private var objectId: String? = null
        private var objectType: ObjectType? = null
        private var value: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(envVarCreateParams: EnvVarCreateParams) = apply {
            this.name = envVarCreateParams.name
            this.objectId = envVarCreateParams.objectId
            this.objectType = envVarCreateParams.objectType
            this.value = envVarCreateParams.value
            additionalHeaders(envVarCreateParams.additionalHeaders)
            additionalQueryParams(envVarCreateParams.additionalQueryParams)
            additionalBodyProperties(envVarCreateParams.additionalBodyProperties)
        }

        /** The name of the environment variable */
        fun name(name: String) = apply { this.name = name }

        /** The id of the object the environment variable is scoped for */
        fun objectId(objectId: String) = apply { this.objectId = objectId }

        /** The type of the object the environment variable is scoped for */
        fun objectType(objectType: ObjectType) = apply { this.objectType = objectType }

        /** The value of the environment variable. Will be encrypted at rest. */
        fun value(value: String) = apply { this.value = value }

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

        fun build(): EnvVarCreateParams =
            EnvVarCreateParams(
                checkNotNull(name) { "`name` is required but was not set" },
                checkNotNull(objectId) { "`objectId` is required but was not set" },
                checkNotNull(objectType) { "`objectType` is required but was not set" },
                value,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    class ObjectType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ObjectType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val ORGANIZATION = ObjectType(JsonField.of("organization"))

            @JvmField val PROJECT = ObjectType(JsonField.of("project"))

            @JvmField val FUNCTION = ObjectType(JsonField.of("function"))

            @JvmStatic fun of(value: String) = ObjectType(JsonField.of(value))
        }

        enum class Known {
            ORGANIZATION,
            PROJECT,
            FUNCTION,
        }

        enum class Value {
            ORGANIZATION,
            PROJECT,
            FUNCTION,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ORGANIZATION -> Value.ORGANIZATION
                PROJECT -> Value.PROJECT
                FUNCTION -> Value.FUNCTION
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ORGANIZATION -> Known.ORGANIZATION
                PROJECT -> Known.PROJECT
                FUNCTION -> Known.FUNCTION
                else -> throw BraintrustInvalidDataException("Unknown ObjectType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
