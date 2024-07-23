// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.apache.hc.core5.http.ContentType
import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import java.util.UUID
import com.braintrustdata.api.core.BaseDeserializer
import com.braintrustdata.api.core.BaseSerializer
import com.braintrustdata.api.core.getOrThrow
import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.MultipartFormValue
import com.braintrustdata.api.core.toUnmodifiable
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.Enum
import com.braintrustdata.api.core.ContentTypes
import com.braintrustdata.api.errors.BraintrustInvalidDataException
import com.braintrustdata.api.models.*

class OrganizationListParams constructor(
  private val endingBefore: String?,
  private val ids: Ids?,
  private val limit: Long?,
  private val orgName: String?,
  private val organizationName: String?,
  private val startingAfter: String?,
  private val additionalQueryParams: Map<String, List<String>>,
  private val additionalHeaders: Map<String, List<String>>,
  private val additionalBodyProperties: Map<String, JsonValue>,

) {

    fun endingBefore(): Optional<String> = Optional.ofNullable(endingBefore)

    fun ids(): Optional<Ids> = Optional.ofNullable(ids)

    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    fun orgName(): Optional<String> = Optional.ofNullable(orgName)

    fun organizationName(): Optional<String> = Optional.ofNullable(organizationName)

    fun startingAfter(): Optional<String> = Optional.ofNullable(startingAfter)

    @JvmSynthetic
    internal fun getQueryParams(): Map<String, List<String>> {
      val params = mutableMapOf<String, List<String>>()
      this.endingBefore?.let {
          params.put("ending_before", listOf(it.toString()))
      }
      this.ids?.let {
          params.put("ids", listOf(it.toString()))
      }
      this.limit?.let {
          params.put("limit", listOf(it.toString()))
      }
      this.orgName?.let {
          params.put("org_name", listOf(it.toString()))
      }
      this.organizationName?.let {
          params.put("organization_name", listOf(it.toString()))
      }
      this.startingAfter?.let {
          params.put("starting_after", listOf(it.toString()))
      }
      params.putAll(additionalQueryParams)
      return params.toUnmodifiable()
    }

    @JvmSynthetic
    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return other is OrganizationListParams &&
          this.endingBefore == other.endingBefore &&
          this.ids == other.ids &&
          this.limit == other.limit &&
          this.orgName == other.orgName &&
          this.organizationName == other.organizationName &&
          this.startingAfter == other.startingAfter &&
          this.additionalQueryParams == other.additionalQueryParams &&
          this.additionalHeaders == other.additionalHeaders &&
          this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
      return Objects.hash(
          endingBefore,
          ids,
          limit,
          orgName,
          organizationName,
          startingAfter,
          additionalQueryParams,
          additionalHeaders,
          additionalBodyProperties,
      )
    }

    override fun toString() = "OrganizationListParams{endingBefore=$endingBefore, ids=$ids, limit=$limit, orgName=$orgName, organizationName=$organizationName, startingAfter=$startingAfter, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic
        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var endingBefore: String? = null
        private var ids: Ids? = null
        private var limit: Long? = null
        private var orgName: String? = null
        private var organizationName: String? = null
        private var startingAfter: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(organizationListParams: OrganizationListParams) = apply {
            this.endingBefore = organizationListParams.endingBefore
            this.ids = organizationListParams.ids
            this.limit = organizationListParams.limit
            this.orgName = organizationListParams.orgName
            this.organizationName = organizationListParams.organizationName
            this.startingAfter = organizationListParams.startingAfter
            additionalQueryParams(organizationListParams.additionalQueryParams)
            additionalHeaders(organizationListParams.additionalHeaders)
            additionalBodyProperties(organizationListParams.additionalBodyProperties)
        }

        /**
         * Pagination cursor id.
         *
         * For example, if the initial item in the last page you fetched had an id of
         * `foo`, pass `ending_before=foo` to fetch the previous page. Note: you may only
         * pass one of `starting_after` and `ending_before`
         */
        fun endingBefore(endingBefore: String) = apply {
            this.endingBefore = endingBefore
        }

        /**
         * Filter search results to a particular set of object IDs. To specify a list of
         * IDs, include the query param multiple times
         */
        fun ids(ids: Ids) = apply {
            this.ids = ids
        }

        /**
         * Filter search results to a particular set of object IDs. To specify a list of
         * IDs, include the query param multiple times
         */
        fun ids(string: String) = apply {
            this.ids = Ids.ofString(string)
        }

        /**
         * Filter search results to a particular set of object IDs. To specify a list of
         * IDs, include the query param multiple times
         */
        fun ids(strings: List<String>) = apply {
            this.ids = Ids.ofStrings(strings)
        }

        /** Limit the number of objects to return */
        fun limit(limit: Long) = apply {
            this.limit = limit
        }

        /** Filter search results to within a particular organization */
        fun orgName(orgName: String) = apply {
            this.orgName = orgName
        }

        /** Name of the organization to search for */
        fun organizationName(organizationName: String) = apply {
            this.organizationName = organizationName
        }

        /**
         * Pagination cursor id.
         *
         * For example, if the final item in the last page you fetched had an id of `foo`,
         * pass `starting_after=foo` to fetch the next page. Note: you may only pass one of
         * `starting_after` and `ending_before`
         */
        fun startingAfter(startingAfter: String) = apply {
            this.startingAfter = startingAfter
        }

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

        fun removeHeader(name: String) = apply {
            this.additionalHeaders.put(name, mutableListOf())
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun build(): OrganizationListParams = OrganizationListParams(
            endingBefore,
            ids,
            limit,
            orgName,
            organizationName,
            startingAfter,
            additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            additionalBodyProperties.toUnmodifiable(),
        )
    }

    @JsonDeserialize(using = Ids.Deserializer::class)
    @JsonSerialize(using = Ids.Serializer::class)
    class Ids private constructor(private val string: String? = null, private val strings: List<String>? = null, private val _json: JsonValue? = null, ) {

        private var validated: Boolean = false

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

        fun validate(): Ids = apply {
            if (!validated) {
              if (string == null && strings == null) {
                throw BraintrustInvalidDataException("Unknown Ids: $_json")
              }
              validated = true
            }
        }

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is Ids &&
              this.string == other.string &&
              this.strings == other.strings
        }

        override fun hashCode(): Int {
          return Objects.hash(string, strings)
        }

        override fun toString(): String {
          return when {
              string != null -> "Ids{string=$string}"
              strings != null -> "Ids{strings=$strings}"
              _json != null -> "Ids{_unknown=$_json}"
              else -> throw IllegalStateException("Invalid Ids")
          }
        }

        companion object {

            @JvmStatic
            fun ofString(string: String) = Ids(string = string)

            @JvmStatic
            fun ofStrings(strings: List<String>) = Ids(strings = strings)
        }

        interface Visitor<out T> {

            fun visitString(string: String): T

            fun visitStrings(strings: List<String>): T

            fun unknown(json: JsonValue?): T {
              throw BraintrustInvalidDataException("Unknown Ids: $json")
            }
        }

        class Deserializer : BaseDeserializer<Ids>(Ids::class) {

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

        class Serializer : BaseSerializer<Ids>(Ids::class) {

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
}