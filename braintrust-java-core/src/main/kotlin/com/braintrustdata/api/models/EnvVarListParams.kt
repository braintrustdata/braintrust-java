// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.BaseDeserializer
import com.braintrustdata.api.core.BaseSerializer
import com.braintrustdata.api.core.Enum
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.Params
import com.braintrustdata.api.core.getOrThrow
import com.braintrustdata.api.core.http.Headers
import com.braintrustdata.api.core.http.QueryParams
import com.braintrustdata.api.errors.BraintrustInvalidDataException
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * List out all env_vars. The env_vars are sorted by creation date, with the most
 * recently-created env_vars coming first
 */
class EnvVarListParams private constructor(
    private val envVarName: String?,
    private val ids: Ids?,
    private val limit: Long?,
    private val objectId: String?,
    private val objectType: ObjectType?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,

) : Params {

    /** Name of the env_var to search for */
    fun envVarName(): Optional<String> = Optional.ofNullable(envVarName)

    /**
     * Filter search results to a particular set of object IDs. To specify a list of
     * IDs, include the query param multiple times
     */
    fun ids(): Optional<Ids> = Optional.ofNullable(ids)

    /** Limit the number of objects to return */
    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    /** The id of the object the environment variable is scoped for */
    fun objectId(): Optional<String> = Optional.ofNullable(objectId)

    /** The type of the object the environment variable is scoped for */
    fun objectType(): Optional<ObjectType> = Optional.ofNullable(objectType)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams {
      val queryParams = QueryParams.builder()
      this.envVarName?.let {
          queryParams.put(
            "env_var_name", listOf(it.toString())
          )
      }
      this.ids?.let {
          queryParams.put(
            "ids", listOf(it.toString())
          )
      }
      this.limit?.let {
          queryParams.put(
            "limit", listOf(it.toString())
          )
      }
      this.objectId?.let {
          queryParams.put(
            "object_id", listOf(it.toString())
          )
      }
      this.objectType?.let {
          queryParams.put(
            "object_type", listOf(it.toString())
          )
      }
      queryParams.putAll(additionalQueryParams)
      return queryParams.build()
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic
        fun none(): EnvVarListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [EnvVarListParams]. */
        @JvmStatic
        fun builder() = Builder()
    }

    /** A builder for [EnvVarListParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var envVarName: String? = null
        private var ids: Ids? = null
        private var limit: Long? = null
        private var objectId: String? = null
        private var objectType: ObjectType? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(envVarListParams: EnvVarListParams) =
            apply {
                envVarName = envVarListParams.envVarName
                ids = envVarListParams.ids
                limit = envVarListParams.limit
                objectId = envVarListParams.objectId
                objectType = envVarListParams.objectType
                additionalHeaders = envVarListParams.additionalHeaders.toBuilder()
                additionalQueryParams = envVarListParams.additionalQueryParams.toBuilder()
            }

        /** Name of the env_var to search for */
        fun envVarName(envVarName: String?) =
            apply {
                this.envVarName = envVarName
            }

        /** Name of the env_var to search for */
        fun envVarName(envVarName: Optional<String>) = envVarName(envVarName.getOrNull())

        /**
         * Filter search results to a particular set of object IDs. To specify a list of
         * IDs, include the query param multiple times
         */
        fun ids(ids: Ids?) =
            apply {
                this.ids = ids
            }

        /**
         * Filter search results to a particular set of object IDs. To specify a list of
         * IDs, include the query param multiple times
         */
        fun ids(ids: Optional<Ids>) = ids(ids.getOrNull())

        /**
         * Filter search results to a particular set of object IDs. To specify a list of
         * IDs, include the query param multiple times
         */
        fun ids(string: String) = ids(Ids.ofString(string))

        /**
         * Filter search results to a particular set of object IDs. To specify a list of
         * IDs, include the query param multiple times
         */
        fun idsOfStrings(strings: List<String>) = ids(Ids.ofStrings(strings))

        /** Limit the number of objects to return */
        fun limit(limit: Long?) =
            apply {
                this.limit = limit
            }

        /** Limit the number of objects to return */
        fun limit(limit: Long) = limit(limit as Long?)

        /** Limit the number of objects to return */
        fun limit(limit: Optional<Long>) = limit(limit.getOrNull())

        /** The id of the object the environment variable is scoped for */
        fun objectId(objectId: String?) =
            apply {
                this.objectId = objectId
            }

        /** The id of the object the environment variable is scoped for */
        fun objectId(objectId: Optional<String>) = objectId(objectId.getOrNull())

        /** The type of the object the environment variable is scoped for */
        fun objectType(objectType: ObjectType?) =
            apply {
                this.objectType = objectType
            }

        /** The type of the object the environment variable is scoped for */
        fun objectType(objectType: Optional<ObjectType>) = objectType(objectType.getOrNull())

        fun additionalHeaders(additionalHeaders: Headers) =
            apply {
                this.additionalHeaders.clear()
                putAllAdditionalHeaders(additionalHeaders)
            }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) =
            apply {
                this.additionalHeaders.clear()
                putAllAdditionalHeaders(additionalHeaders)
            }

        fun putAdditionalHeader(name: String, value: String) =
            apply {
                additionalHeaders.put(name, value)
            }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) =
            apply {
                additionalHeaders.put(name, values)
            }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) =
            apply {
                this.additionalHeaders.putAll(additionalHeaders)
            }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) =
            apply {
                this.additionalHeaders.putAll(additionalHeaders)
            }

        fun replaceAdditionalHeaders(name: String, value: String) =
            apply {
                additionalHeaders.replace(name, value)
            }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) =
            apply {
                additionalHeaders.replace(name, values)
            }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) =
            apply {
                this.additionalHeaders.replaceAll(additionalHeaders)
            }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) =
            apply {
                this.additionalHeaders.replaceAll(additionalHeaders)
            }

        fun removeAdditionalHeaders(name: String) =
            apply {
                additionalHeaders.remove(name)
            }

        fun removeAllAdditionalHeaders(names: Set<String>) =
            apply {
                additionalHeaders.removeAll(names)
            }

        fun additionalQueryParams(additionalQueryParams: QueryParams) =
            apply {
                this.additionalQueryParams.clear()
                putAllAdditionalQueryParams(additionalQueryParams)
            }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.clear()
                putAllAdditionalQueryParams(additionalQueryParams)
            }

        fun putAdditionalQueryParam(key: String, value: String) =
            apply {
                additionalQueryParams.put(key, value)
            }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) =
            apply {
                additionalQueryParams.put(key, values)
            }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) =
            apply {
                additionalQueryParams.replace(key, value)
            }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) =
            apply {
                additionalQueryParams.replace(key, values)
            }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) =
            apply {
                additionalQueryParams.remove(key)
            }

        fun removeAllAdditionalQueryParams(keys: Set<String>) =
            apply {
                additionalQueryParams.removeAll(keys)
            }

        fun build(): EnvVarListParams =
            EnvVarListParams(
              envVarName,
              ids,
              limit,
              objectId,
              objectType,
              additionalHeaders.build(),
              additionalQueryParams.build(),
            )
    }

    /**
     * Filter search results to a particular set of object IDs. To specify a list of
     * IDs, include the query param multiple times
     */
    @JsonDeserialize(using = Ids.Deserializer::class)
    @JsonSerialize(using = Ids.Serializer::class)
    class Ids private constructor(
        private val string: String? = null,
        private val strings: List<String>? = null,
        private val _json: JsonValue? = null,

    ) {

        fun string(): Optional<String> = Optional.ofNullable(string)

        fun strings(): Optional<List<String>> = Optional.ofNullable(strings)

        fun isString(): Boolean = string != null

        fun isStrings(): Boolean = strings != null

        fun asString(): String = string.getOrThrow("string")

        fun asStrings(): List<String> = strings.getOrThrow("strings")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T {
          return when {
              string != null -> visitor.visitString(string)
              strings != null -> visitor.visitStrings(strings)
              else -> visitor.unknown(_json)
          }
        }

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return /* spotless:off */ other is Ids && string == other.string && strings == other.strings /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(string, strings) /* spotless:on */

        override fun toString(): String =
            when {
                string != null -> "Ids{string=$string}"
                strings != null -> "Ids{strings=$strings}"
                _json != null -> "Ids{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Ids")
            }

        companion object {

            @JvmStatic
            fun ofString(string: String) = Ids(string = string)

            @JvmStatic
            fun ofStrings(strings: List<String>) = Ids(strings = strings)
        }

        /**
         * An interface that defines how to map each variant of [Ids] to a value of type
         * [T].
         */
        interface Visitor<out T> {

            fun visitString(string: String): T

            fun visitStrings(strings: List<String>): T

            /**
             * Maps an unknown variant of [Ids] to a value of type [T].
             *
             * An instance of [Ids] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an
             * older version than the API, then the API may respond with new variants that the
             * SDK is unaware of.
             *
             * @throws BraintrustInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
              throw BraintrustInvalidDataException("Unknown Ids: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Ids>(Ids::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Ids {
              val json = JsonValue.fromJsonNode(node)

              tryDeserialize(node, jacksonTypeRef<String>())?.let {
                  return Ids(string = it, _json = json)
              }
              tryDeserialize(node, jacksonTypeRef<List<String>>())?.let {
                  return Ids(strings = it, _json = json)
              }

              return Ids(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<Ids>(Ids::class) {

            override fun serialize(value: Ids, generator: JsonGenerator, provider: SerializerProvider) {
              when {
                  value.string != null -> generator.writeObject(value.string)
                  value.strings != null -> generator.writeObject(value.strings)
                  value._json != null -> generator.writeObject(value._json)
                  else -> throw IllegalStateException("Invalid Ids")
              }
            }
        }
    }

    /** The type of the object the environment variable is scoped for */
    class ObjectType @JsonCreator private constructor(
        private val value: JsonField<String>,

    ) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that
         * doesn't match any known member, and you want to know that value. For example, if
         * the SDK is on an older version than the API, then the API may respond with new
         * members that the SDK is unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue
        fun _value(): JsonField<String> = value

        companion object {

            @JvmField val ORGANIZATION = of("organization")

            @JvmField val PROJECT = of("project")

            @JvmField val FUNCTION = of("function")

            @JvmStatic fun of(value: String) = ObjectType(JsonField.of(value))
        }

        /** An enum containing [ObjectType]'s known values. */
        enum class Known {
            ORGANIZATION,
            PROJECT,
            FUNCTION,
        }

        /**
         * An enum containing [ObjectType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ObjectType] can contain an unknown value in a couple of cases:
         *
         * - It was deserialized from data that doesn't match any known member. For
         *   example, if the SDK is on an older version than the API, then the API may
         *   respond with new members that the SDK is unaware of.
         *
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ORGANIZATION,
            PROJECT,
            FUNCTION,
            /**
             * An enum member indicating that [ObjectType] was instantiated with an unknown
             * value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or
         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if
         * you want to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                ORGANIZATION -> Value.ORGANIZATION
                PROJECT -> Value.PROJECT
                FUNCTION -> Value.FUNCTION
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and
         * don't want to throw for the unknown case.
         *
         * @throws BraintrustInvalidDataException if this class instance's value is a not a
         * known member.
         */
        fun known(): Known =
            when (this) {
                ORGANIZATION -> Known.ORGANIZATION
                PROJECT -> Known.PROJECT
                FUNCTION -> Known.FUNCTION
                else -> throw BraintrustInvalidDataException("Unknown ObjectType: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for
         * debugging and generally doesn't throw.
         *
         * @throws BraintrustInvalidDataException if this class instance's value does not
         * have the expected primitive type.
         */
        fun asString(): String = _value().asString().orElseThrow { BraintrustInvalidDataException("Value is not a String") }

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return /* spotless:off */ other is ObjectType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return /* spotless:off */ other is EnvVarListParams && envVarName == other.envVarName && ids == other.ids && limit == other.limit && objectId == other.objectId && objectType == other.objectType && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(envVarName, ids, limit, objectId, objectType, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() = "EnvVarListParams{envVarName=$envVarName, ids=$ids, limit=$limit, objectId=$objectId, objectType=$objectType, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
