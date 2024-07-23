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
import com.braintrustdata.api.core.JsonMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.JsonNull
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.Enum
import com.braintrustdata.api.core.toUnmodifiable
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.errors.BraintrustInvalidDataException

@JsonDeserialize(builder = Organization.Builder::class)
@NoAutoDetect
class Organization private constructor(
  private val id: JsonField<String>,
  private val name: JsonField<String>,
  private val apiUrl: JsonField<String>,
  private val proxyUrl: JsonField<String>,
  private val realtimeUrl: JsonField<String>,
  private val created: JsonField<OffsetDateTime>,
  private val additionalProperties: Map<String, JsonValue>,

) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** Unique identifier for the organization */
    fun id(): String = id.getRequired("id")

    /** Name of the organization */
    fun name(): String = name.getRequired("name")

    fun apiUrl(): Optional<String> = Optional.ofNullable(apiUrl.getNullable("api_url"))

    fun proxyUrl(): Optional<String> = Optional.ofNullable(proxyUrl.getNullable("proxy_url"))

    fun realtimeUrl(): Optional<String> = Optional.ofNullable(realtimeUrl.getNullable("realtime_url"))

    /** Date of organization creation */
    fun created(): Optional<OffsetDateTime> = Optional.ofNullable(created.getNullable("created"))

    /** Unique identifier for the organization */
    @JsonProperty("id")
    @ExcludeMissing
    fun _id() = id

    /** Name of the organization */
    @JsonProperty("name")
    @ExcludeMissing
    fun _name() = name

    @JsonProperty("api_url")
    @ExcludeMissing
    fun _apiUrl() = apiUrl

    @JsonProperty("proxy_url")
    @ExcludeMissing
    fun _proxyUrl() = proxyUrl

    @JsonProperty("realtime_url")
    @ExcludeMissing
    fun _realtimeUrl() = realtimeUrl

    /** Date of organization creation */
    @JsonProperty("created")
    @ExcludeMissing
    fun _created() = created

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): Organization = apply {
        if (!validated) {
          id()
          name()
          apiUrl()
          proxyUrl()
          realtimeUrl()
          created()
          validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return other is Organization &&
          this.id == other.id &&
          this.name == other.name &&
          this.apiUrl == other.apiUrl &&
          this.proxyUrl == other.proxyUrl &&
          this.realtimeUrl == other.realtimeUrl &&
          this.created == other.created &&
          this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
      if (hashCode == 0) {
        hashCode = Objects.hash(
            id,
            name,
            apiUrl,
            proxyUrl,
            realtimeUrl,
            created,
            additionalProperties,
        )
      }
      return hashCode
    }

    override fun toString() = "Organization{id=$id, name=$name, apiUrl=$apiUrl, proxyUrl=$proxyUrl, realtimeUrl=$realtimeUrl, created=$created, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic
        fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var apiUrl: JsonField<String> = JsonMissing.of()
        private var proxyUrl: JsonField<String> = JsonMissing.of()
        private var realtimeUrl: JsonField<String> = JsonMissing.of()
        private var created: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(organization: Organization) = apply {
            this.id = organization.id
            this.name = organization.name
            this.apiUrl = organization.apiUrl
            this.proxyUrl = organization.proxyUrl
            this.realtimeUrl = organization.realtimeUrl
            this.created = organization.created
            additionalProperties(organization.additionalProperties)
        }

        /** Unique identifier for the organization */
        fun id(id: String) = id(JsonField.of(id))

        /** Unique identifier for the organization */
        @JsonProperty("id")
        @ExcludeMissing
        fun id(id: JsonField<String>) = apply {
            this.id = id
        }

        /** Name of the organization */
        fun name(name: String) = name(JsonField.of(name))

        /** Name of the organization */
        @JsonProperty("name")
        @ExcludeMissing
        fun name(name: JsonField<String>) = apply {
            this.name = name
        }

        fun apiUrl(apiUrl: String) = apiUrl(JsonField.of(apiUrl))

        @JsonProperty("api_url")
        @ExcludeMissing
        fun apiUrl(apiUrl: JsonField<String>) = apply {
            this.apiUrl = apiUrl
        }

        fun proxyUrl(proxyUrl: String) = proxyUrl(JsonField.of(proxyUrl))

        @JsonProperty("proxy_url")
        @ExcludeMissing
        fun proxyUrl(proxyUrl: JsonField<String>) = apply {
            this.proxyUrl = proxyUrl
        }

        fun realtimeUrl(realtimeUrl: String) = realtimeUrl(JsonField.of(realtimeUrl))

        @JsonProperty("realtime_url")
        @ExcludeMissing
        fun realtimeUrl(realtimeUrl: JsonField<String>) = apply {
            this.realtimeUrl = realtimeUrl
        }

        /** Date of organization creation */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /** Date of organization creation */
        @JsonProperty("created")
        @ExcludeMissing
        fun created(created: JsonField<OffsetDateTime>) = apply {
            this.created = created
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

        fun build(): Organization = Organization(
            id,
            name,
            apiUrl,
            proxyUrl,
            realtimeUrl,
            created,
            additionalProperties.toUnmodifiable(),
        )
    }
}
