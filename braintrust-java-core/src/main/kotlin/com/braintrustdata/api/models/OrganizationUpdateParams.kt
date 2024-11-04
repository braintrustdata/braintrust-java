// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.toImmutable
import com.braintrustdata.api.models.*
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import java.util.Objects
import java.util.Optional

class OrganizationUpdateParams
constructor(
    private val organizationId: String,
    private val apiUrl: String?,
    private val isUniversalApi: Boolean?,
    private val name: String?,
    private val proxyUrl: String?,
    private val realtimeUrl: String?,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun organizationId(): String = organizationId

    fun apiUrl(): Optional<String> = Optional.ofNullable(apiUrl)

    fun isUniversalApi(): Optional<Boolean> = Optional.ofNullable(isUniversalApi)

    fun name(): Optional<String> = Optional.ofNullable(name)

    fun proxyUrl(): Optional<String> = Optional.ofNullable(proxyUrl)

    fun realtimeUrl(): Optional<String> = Optional.ofNullable(realtimeUrl)

    @JvmSynthetic
    internal fun getBody(): OrganizationUpdateBody {
        return OrganizationUpdateBody(
            apiUrl,
            isUniversalApi,
            name,
            proxyUrl,
            realtimeUrl,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> organizationId
            else -> ""
        }
    }

    @JsonDeserialize(builder = OrganizationUpdateBody.Builder::class)
    @NoAutoDetect
    class OrganizationUpdateBody
    internal constructor(
        private val apiUrl: String?,
        private val isUniversalApi: Boolean?,
        private val name: String?,
        private val proxyUrl: String?,
        private val realtimeUrl: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonProperty("api_url") fun apiUrl(): String? = apiUrl

        @JsonProperty("is_universal_api") fun isUniversalApi(): Boolean? = isUniversalApi

        /** Name of the organization */
        @JsonProperty("name") fun name(): String? = name

        @JsonProperty("proxy_url") fun proxyUrl(): String? = proxyUrl

        @JsonProperty("realtime_url") fun realtimeUrl(): String? = realtimeUrl

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var apiUrl: String? = null
            private var isUniversalApi: Boolean? = null
            private var name: String? = null
            private var proxyUrl: String? = null
            private var realtimeUrl: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(organizationUpdateBody: OrganizationUpdateBody) = apply {
                this.apiUrl = organizationUpdateBody.apiUrl
                this.isUniversalApi = organizationUpdateBody.isUniversalApi
                this.name = organizationUpdateBody.name
                this.proxyUrl = organizationUpdateBody.proxyUrl
                this.realtimeUrl = organizationUpdateBody.realtimeUrl
                additionalProperties(organizationUpdateBody.additionalProperties)
            }

            @JsonProperty("api_url") fun apiUrl(apiUrl: String) = apply { this.apiUrl = apiUrl }

            @JsonProperty("is_universal_api")
            fun isUniversalApi(isUniversalApi: Boolean) = apply {
                this.isUniversalApi = isUniversalApi
            }

            /** Name of the organization */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            @JsonProperty("proxy_url")
            fun proxyUrl(proxyUrl: String) = apply { this.proxyUrl = proxyUrl }

            @JsonProperty("realtime_url")
            fun realtimeUrl(realtimeUrl: String) = apply { this.realtimeUrl = realtimeUrl }

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

            fun build(): OrganizationUpdateBody =
                OrganizationUpdateBody(
                    apiUrl,
                    isUniversalApi,
                    name,
                    proxyUrl,
                    realtimeUrl,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is OrganizationUpdateBody && this.apiUrl == other.apiUrl && this.isUniversalApi == other.isUniversalApi && this.name == other.name && this.proxyUrl == other.proxyUrl && this.realtimeUrl == other.realtimeUrl && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(apiUrl, isUniversalApi, name, proxyUrl, realtimeUrl, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "OrganizationUpdateBody{apiUrl=$apiUrl, isUniversalApi=$isUniversalApi, name=$name, proxyUrl=$proxyUrl, realtimeUrl=$realtimeUrl, additionalProperties=$additionalProperties}"
    }

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is OrganizationUpdateParams && this.organizationId == other.organizationId && this.apiUrl == other.apiUrl && this.isUniversalApi == other.isUniversalApi && this.name == other.name && this.proxyUrl == other.proxyUrl && this.realtimeUrl == other.realtimeUrl && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(organizationId, apiUrl, isUniversalApi, name, proxyUrl, realtimeUrl, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "OrganizationUpdateParams{organizationId=$organizationId, apiUrl=$apiUrl, isUniversalApi=$isUniversalApi, name=$name, proxyUrl=$proxyUrl, realtimeUrl=$realtimeUrl, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var organizationId: String? = null
        private var apiUrl: String? = null
        private var isUniversalApi: Boolean? = null
        private var name: String? = null
        private var proxyUrl: String? = null
        private var realtimeUrl: String? = null
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(organizationUpdateParams: OrganizationUpdateParams) = apply {
            this.organizationId = organizationUpdateParams.organizationId
            this.apiUrl = organizationUpdateParams.apiUrl
            this.isUniversalApi = organizationUpdateParams.isUniversalApi
            this.name = organizationUpdateParams.name
            this.proxyUrl = organizationUpdateParams.proxyUrl
            this.realtimeUrl = organizationUpdateParams.realtimeUrl
            additionalHeaders(organizationUpdateParams.additionalHeaders)
            additionalQueryParams(organizationUpdateParams.additionalQueryParams)
            additionalBodyProperties(organizationUpdateParams.additionalBodyProperties)
        }

        /** Organization id */
        fun organizationId(organizationId: String) = apply { this.organizationId = organizationId }

        fun apiUrl(apiUrl: String) = apply { this.apiUrl = apiUrl }

        fun isUniversalApi(isUniversalApi: Boolean) = apply { this.isUniversalApi = isUniversalApi }

        /** Name of the organization */
        fun name(name: String) = apply { this.name = name }

        fun proxyUrl(proxyUrl: String) = apply { this.proxyUrl = proxyUrl }

        fun realtimeUrl(realtimeUrl: String) = apply { this.realtimeUrl = realtimeUrl }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.putAll(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(::putAdditionalHeaders)
        }

        fun removeAdditionalHeader(name: String) = apply { additionalHeaders.removeAll(name) }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.putAll(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                additionalQueryParams.forEach(::putAdditionalQueryParams)
            }

        fun removeAdditionalQueryParam(key: String) = apply { additionalQueryParams.removeAll(key) }

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

        fun build(): OrganizationUpdateParams =
            OrganizationUpdateParams(
                checkNotNull(organizationId) { "`organizationId` is required but was not set" },
                apiUrl,
                isUniversalApi,
                name,
                proxyUrl,
                realtimeUrl,
                additionalHeaders
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalQueryParams
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalBodyProperties.toImmutable(),
            )
    }
}
