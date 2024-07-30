// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.toUnmodifiable
import com.braintrustdata.api.models.*
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
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
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
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

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

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

        private var hashCode: Int = 0

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is OrganizationUpdateBody &&
                this.apiUrl == other.apiUrl &&
                this.isUniversalApi == other.isUniversalApi &&
                this.name == other.name &&
                this.proxyUrl == other.proxyUrl &&
                this.realtimeUrl == other.realtimeUrl &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        apiUrl,
                        isUniversalApi,
                        name,
                        proxyUrl,
                        realtimeUrl,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "OrganizationUpdateBody{apiUrl=$apiUrl, isUniversalApi=$isUniversalApi, name=$name, proxyUrl=$proxyUrl, realtimeUrl=$realtimeUrl, additionalProperties=$additionalProperties}"

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

        return other is OrganizationUpdateParams &&
            this.organizationId == other.organizationId &&
            this.apiUrl == other.apiUrl &&
            this.isUniversalApi == other.isUniversalApi &&
            this.name == other.name &&
            this.proxyUrl == other.proxyUrl &&
            this.realtimeUrl == other.realtimeUrl &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            organizationId,
            apiUrl,
            isUniversalApi,
            name,
            proxyUrl,
            realtimeUrl,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "OrganizationUpdateParams{organizationId=$organizationId, apiUrl=$apiUrl, isUniversalApi=$isUniversalApi, name=$name, proxyUrl=$proxyUrl, realtimeUrl=$realtimeUrl, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

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
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(organizationUpdateParams: OrganizationUpdateParams) = apply {
            this.organizationId = organizationUpdateParams.organizationId
            this.apiUrl = organizationUpdateParams.apiUrl
            this.isUniversalApi = organizationUpdateParams.isUniversalApi
            this.name = organizationUpdateParams.name
            this.proxyUrl = organizationUpdateParams.proxyUrl
            this.realtimeUrl = organizationUpdateParams.realtimeUrl
            additionalQueryParams(organizationUpdateParams.additionalQueryParams)
            additionalHeaders(organizationUpdateParams.additionalHeaders)
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

        fun build(): OrganizationUpdateParams =
            OrganizationUpdateParams(
                checkNotNull(organizationId) { "`organizationId` is required but was not set" },
                apiUrl,
                isUniversalApi,
                name,
                proxyUrl,
                realtimeUrl,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }
}
