// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.toUnmodifiable
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = PatchOrganization.Builder::class)
@NoAutoDetect
class PatchOrganization
private constructor(
    private val name: JsonField<String>,
    private val apiUrl: JsonField<String>,
    private val isUniversalApi: JsonField<Boolean>,
    private val proxyUrl: JsonField<String>,
    private val realtimeUrl: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** Name of the organization */
    fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

    fun apiUrl(): Optional<String> = Optional.ofNullable(apiUrl.getNullable("api_url"))

    fun isUniversalApi(): Optional<Boolean> =
        Optional.ofNullable(isUniversalApi.getNullable("is_universal_api"))

    fun proxyUrl(): Optional<String> = Optional.ofNullable(proxyUrl.getNullable("proxy_url"))

    fun realtimeUrl(): Optional<String> =
        Optional.ofNullable(realtimeUrl.getNullable("realtime_url"))

    /** Name of the organization */
    @JsonProperty("name") @ExcludeMissing fun _name() = name

    @JsonProperty("api_url") @ExcludeMissing fun _apiUrl() = apiUrl

    @JsonProperty("is_universal_api") @ExcludeMissing fun _isUniversalApi() = isUniversalApi

    @JsonProperty("proxy_url") @ExcludeMissing fun _proxyUrl() = proxyUrl

    @JsonProperty("realtime_url") @ExcludeMissing fun _realtimeUrl() = realtimeUrl

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): PatchOrganization = apply {
        if (!validated) {
            name()
            apiUrl()
            isUniversalApi()
            proxyUrl()
            realtimeUrl()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PatchOrganization &&
            this.name == other.name &&
            this.apiUrl == other.apiUrl &&
            this.isUniversalApi == other.isUniversalApi &&
            this.proxyUrl == other.proxyUrl &&
            this.realtimeUrl == other.realtimeUrl &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    name,
                    apiUrl,
                    isUniversalApi,
                    proxyUrl,
                    realtimeUrl,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "PatchOrganization{name=$name, apiUrl=$apiUrl, isUniversalApi=$isUniversalApi, proxyUrl=$proxyUrl, realtimeUrl=$realtimeUrl, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var name: JsonField<String> = JsonMissing.of()
        private var apiUrl: JsonField<String> = JsonMissing.of()
        private var isUniversalApi: JsonField<Boolean> = JsonMissing.of()
        private var proxyUrl: JsonField<String> = JsonMissing.of()
        private var realtimeUrl: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(patchOrganization: PatchOrganization) = apply {
            this.name = patchOrganization.name
            this.apiUrl = patchOrganization.apiUrl
            this.isUniversalApi = patchOrganization.isUniversalApi
            this.proxyUrl = patchOrganization.proxyUrl
            this.realtimeUrl = patchOrganization.realtimeUrl
            additionalProperties(patchOrganization.additionalProperties)
        }

        /** Name of the organization */
        fun name(name: String) = name(JsonField.of(name))

        /** Name of the organization */
        @JsonProperty("name")
        @ExcludeMissing
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun apiUrl(apiUrl: String) = apiUrl(JsonField.of(apiUrl))

        @JsonProperty("api_url")
        @ExcludeMissing
        fun apiUrl(apiUrl: JsonField<String>) = apply { this.apiUrl = apiUrl }

        fun isUniversalApi(isUniversalApi: Boolean) = isUniversalApi(JsonField.of(isUniversalApi))

        @JsonProperty("is_universal_api")
        @ExcludeMissing
        fun isUniversalApi(isUniversalApi: JsonField<Boolean>) = apply {
            this.isUniversalApi = isUniversalApi
        }

        fun proxyUrl(proxyUrl: String) = proxyUrl(JsonField.of(proxyUrl))

        @JsonProperty("proxy_url")
        @ExcludeMissing
        fun proxyUrl(proxyUrl: JsonField<String>) = apply { this.proxyUrl = proxyUrl }

        fun realtimeUrl(realtimeUrl: String) = realtimeUrl(JsonField.of(realtimeUrl))

        @JsonProperty("realtime_url")
        @ExcludeMissing
        fun realtimeUrl(realtimeUrl: JsonField<String>) = apply { this.realtimeUrl = realtimeUrl }

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

        fun build(): PatchOrganization =
            PatchOrganization(
                name,
                apiUrl,
                isUniversalApi,
                proxyUrl,
                realtimeUrl,
                additionalProperties.toUnmodifiable(),
            )
    }
}