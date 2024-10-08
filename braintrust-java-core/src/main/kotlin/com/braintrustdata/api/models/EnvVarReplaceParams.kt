// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.Enum
import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.toUnmodifiable
import com.braintrustdata.api.errors.BraintrustInvalidDataException
import com.braintrustdata.api.models.*
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import java.util.Objects
import java.util.Optional

class EnvVarReplaceParams
constructor(
    private val name: String,
    private val objectId: String,
    private val objectType: ObjectType,
    private val value: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun name(): String = name

    fun objectId(): String = objectId

    fun objectType(): ObjectType = objectType

    fun value(): Optional<String> = Optional.ofNullable(value)

    @JvmSynthetic
    internal fun getBody(): EnvVarReplaceBody {
        return EnvVarReplaceBody(
            name,
            objectId,
            objectType,
            value,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = EnvVarReplaceBody.Builder::class)
    @NoAutoDetect
    class EnvVarReplaceBody
    internal constructor(
        private val name: String?,
        private val objectId: String?,
        private val objectType: ObjectType?,
        private val value: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is EnvVarReplaceBody &&
                this.name == other.name &&
                this.objectId == other.objectId &&
                this.objectType == other.objectType &&
                this.value == other.value &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        name,
                        objectId,
                        objectType,
                        value,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "EnvVarReplaceBody{name=$name, objectId=$objectId, objectType=$objectType, value=$value, additionalProperties=$additionalProperties}"

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
            internal fun from(envVarReplaceBody: EnvVarReplaceBody) = apply {
                this.name = envVarReplaceBody.name
                this.objectId = envVarReplaceBody.objectId
                this.objectType = envVarReplaceBody.objectType
                this.value = envVarReplaceBody.value
                additionalProperties(envVarReplaceBody.additionalProperties)
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

            fun build(): EnvVarReplaceBody =
                EnvVarReplaceBody(
                    checkNotNull(name) { "`name` is required but was not set" },
                    checkNotNull(objectId) { "`objectId` is required but was not set" },
                    checkNotNull(objectType) { "`objectType` is required but was not set" },
                    value,
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

        return other is EnvVarReplaceParams &&
            this.name == other.name &&
            this.objectId == other.objectId &&
            this.objectType == other.objectType &&
            this.value == other.value &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            name,
            objectId,
            objectType,
            value,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "EnvVarReplaceParams{name=$name, objectId=$objectId, objectType=$objectType, value=$value, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

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
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(envVarReplaceParams: EnvVarReplaceParams) = apply {
            this.name = envVarReplaceParams.name
            this.objectId = envVarReplaceParams.objectId
            this.objectType = envVarReplaceParams.objectType
            this.value = envVarReplaceParams.value
            additionalQueryParams(envVarReplaceParams.additionalQueryParams)
            additionalHeaders(envVarReplaceParams.additionalHeaders)
            additionalBodyProperties(envVarReplaceParams.additionalBodyProperties)
        }

        /** The name of the environment variable */
        fun name(name: String) = apply { this.name = name }

        /** The id of the object the environment variable is scoped for */
        fun objectId(objectId: String) = apply { this.objectId = objectId }

        /** The type of the object the environment variable is scoped for */
        fun objectType(objectType: ObjectType) = apply { this.objectType = objectType }

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

        fun build(): EnvVarReplaceParams =
            EnvVarReplaceParams(
                checkNotNull(name) { "`name` is required but was not set" },
                checkNotNull(objectId) { "`objectId` is required but was not set" },
                checkNotNull(objectType) { "`objectType` is required but was not set" },
                value,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
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

            return other is ObjectType && this.value == other.value
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
