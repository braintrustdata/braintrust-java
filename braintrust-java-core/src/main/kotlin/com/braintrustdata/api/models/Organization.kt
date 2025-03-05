// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.checkRequired
import com.braintrustdata.api.core.immutableEmptyMap
import com.braintrustdata.api.core.toImmutable
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class Organization
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
    @JsonProperty("api_url")
    @ExcludeMissing
    private val apiUrl: JsonField<String> = JsonMissing.of(),
    @JsonProperty("created")
    @ExcludeMissing
    private val created: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("is_universal_api")
    @ExcludeMissing
    private val isUniversalApi: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("proxy_url")
    @ExcludeMissing
    private val proxyUrl: JsonField<String> = JsonMissing.of(),
    @JsonProperty("realtime_url")
    @ExcludeMissing
    private val realtimeUrl: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** Unique identifier for the organization */
    fun id(): String = id.getRequired("id")

    /** Name of the organization */
    fun name(): String = name.getRequired("name")

    fun apiUrl(): Optional<String> = Optional.ofNullable(apiUrl.getNullable("api_url"))

    /** Date of organization creation */
    fun created(): Optional<OffsetDateTime> = Optional.ofNullable(created.getNullable("created"))

    fun isUniversalApi(): Optional<Boolean> =
        Optional.ofNullable(isUniversalApi.getNullable("is_universal_api"))

    fun proxyUrl(): Optional<String> = Optional.ofNullable(proxyUrl.getNullable("proxy_url"))

    fun realtimeUrl(): Optional<String> =
        Optional.ofNullable(realtimeUrl.getNullable("realtime_url"))

    /** Unique identifier for the organization */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /** Name of the organization */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    @JsonProperty("api_url") @ExcludeMissing fun _apiUrl(): JsonField<String> = apiUrl

    /** Date of organization creation */
    @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<OffsetDateTime> = created

    @JsonProperty("is_universal_api")
    @ExcludeMissing
    fun _isUniversalApi(): JsonField<Boolean> = isUniversalApi

    @JsonProperty("proxy_url") @ExcludeMissing fun _proxyUrl(): JsonField<String> = proxyUrl

    @JsonProperty("realtime_url")
    @ExcludeMissing
    fun _realtimeUrl(): JsonField<String> = realtimeUrl

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): Organization = apply {
        if (validated) {
            return@apply
        }

        id()
        name()
        apiUrl()
        created()
        isUniversalApi()
        proxyUrl()
        realtimeUrl()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [Organization].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .name()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Organization]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var apiUrl: JsonField<String> = JsonMissing.of()
        private var created: JsonField<OffsetDateTime> = JsonMissing.of()
        private var isUniversalApi: JsonField<Boolean> = JsonMissing.of()
        private var proxyUrl: JsonField<String> = JsonMissing.of()
        private var realtimeUrl: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(organization: Organization) = apply {
            id = organization.id
            name = organization.name
            apiUrl = organization.apiUrl
            created = organization.created
            isUniversalApi = organization.isUniversalApi
            proxyUrl = organization.proxyUrl
            realtimeUrl = organization.realtimeUrl
            additionalProperties = organization.additionalProperties.toMutableMap()
        }

        /** Unique identifier for the organization */
        fun id(id: String) = id(JsonField.of(id))

        /** Unique identifier for the organization */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Name of the organization */
        fun name(name: String) = name(JsonField.of(name))

        /** Name of the organization */
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun apiUrl(apiUrl: String?) = apiUrl(JsonField.ofNullable(apiUrl))

        fun apiUrl(apiUrl: Optional<String>) = apiUrl(apiUrl.orElse(null))

        fun apiUrl(apiUrl: JsonField<String>) = apply { this.apiUrl = apiUrl }

        /** Date of organization creation */
        fun created(created: OffsetDateTime?) = created(JsonField.ofNullable(created))

        /** Date of organization creation */
        fun created(created: Optional<OffsetDateTime>) = created(created.orElse(null))

        /** Date of organization creation */
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        fun isUniversalApi(isUniversalApi: Boolean?) =
            isUniversalApi(JsonField.ofNullable(isUniversalApi))

        fun isUniversalApi(isUniversalApi: Boolean) = isUniversalApi(isUniversalApi as Boolean?)

        @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
        fun isUniversalApi(isUniversalApi: Optional<Boolean>) =
            isUniversalApi(isUniversalApi.orElse(null) as Boolean?)

        fun isUniversalApi(isUniversalApi: JsonField<Boolean>) = apply {
            this.isUniversalApi = isUniversalApi
        }

        fun proxyUrl(proxyUrl: String?) = proxyUrl(JsonField.ofNullable(proxyUrl))

        fun proxyUrl(proxyUrl: Optional<String>) = proxyUrl(proxyUrl.orElse(null))

        fun proxyUrl(proxyUrl: JsonField<String>) = apply { this.proxyUrl = proxyUrl }

        fun realtimeUrl(realtimeUrl: String?) = realtimeUrl(JsonField.ofNullable(realtimeUrl))

        fun realtimeUrl(realtimeUrl: Optional<String>) = realtimeUrl(realtimeUrl.orElse(null))

        fun realtimeUrl(realtimeUrl: JsonField<String>) = apply { this.realtimeUrl = realtimeUrl }

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

        fun build(): Organization =
            Organization(
                checkRequired("id", id),
                checkRequired("name", name),
                apiUrl,
                created,
                isUniversalApi,
                proxyUrl,
                realtimeUrl,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Organization && id == other.id && name == other.name && apiUrl == other.apiUrl && created == other.created && isUniversalApi == other.isUniversalApi && proxyUrl == other.proxyUrl && realtimeUrl == other.realtimeUrl && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, name, apiUrl, created, isUniversalApi, proxyUrl, realtimeUrl, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Organization{id=$id, name=$name, apiUrl=$apiUrl, created=$created, isUniversalApi=$isUniversalApi, proxyUrl=$proxyUrl, realtimeUrl=$realtimeUrl, additionalProperties=$additionalProperties}"
}
