// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.Params
import com.braintrustdata.api.core.checkRequired
import com.braintrustdata.api.core.http.Headers
import com.braintrustdata.api.core.http.QueryParams
import com.braintrustdata.api.errors.BraintrustInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Partially update an organization object. Specify the fields to update in the payload. Any
 * object-type fields will be deep-merged with existing content. Currently we do not support
 * removing fields or setting them to null.
 */
class OrganizationUpdateParams
private constructor(
    private val organizationId: String,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Organization id */
    fun organizationId(): String = organizationId

    /**
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun apiUrl(): Optional<String> = body.apiUrl()

    /**
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isUniversalApi(): Optional<Boolean> = body.isUniversalApi()

    /**
     * Name of the organization
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = body.name()

    /**
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun proxyUrl(): Optional<String> = body.proxyUrl()

    /**
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun realtimeUrl(): Optional<String> = body.realtimeUrl()

    /**
     * Returns the raw JSON value of [apiUrl].
     *
     * Unlike [apiUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _apiUrl(): JsonField<String> = body._apiUrl()

    /**
     * Returns the raw JSON value of [isUniversalApi].
     *
     * Unlike [isUniversalApi], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _isUniversalApi(): JsonField<Boolean> = body._isUniversalApi()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [proxyUrl].
     *
     * Unlike [proxyUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _proxyUrl(): JsonField<String> = body._proxyUrl()

    /**
     * Returns the raw JSON value of [realtimeUrl].
     *
     * Unlike [realtimeUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _realtimeUrl(): JsonField<String> = body._realtimeUrl()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [OrganizationUpdateParams].
         *
         * The following fields are required:
         * ```java
         * .organizationId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [OrganizationUpdateParams]. */
    class Builder internal constructor() {

        private var organizationId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(organizationUpdateParams: OrganizationUpdateParams) = apply {
            organizationId = organizationUpdateParams.organizationId
            body = organizationUpdateParams.body.toBuilder()
            additionalHeaders = organizationUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = organizationUpdateParams.additionalQueryParams.toBuilder()
        }

        /** Organization id */
        fun organizationId(organizationId: String) = apply { this.organizationId = organizationId }

        fun apiUrl(apiUrl: String?) = apply { body.apiUrl(apiUrl) }

        /** Alias for calling [Builder.apiUrl] with `apiUrl.orElse(null)`. */
        fun apiUrl(apiUrl: Optional<String>) = apiUrl(apiUrl.getOrNull())

        /**
         * Sets [Builder.apiUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.apiUrl] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun apiUrl(apiUrl: JsonField<String>) = apply { body.apiUrl(apiUrl) }

        fun isUniversalApi(isUniversalApi: Boolean?) = apply { body.isUniversalApi(isUniversalApi) }

        /**
         * Alias for [Builder.isUniversalApi].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun isUniversalApi(isUniversalApi: Boolean) = isUniversalApi(isUniversalApi as Boolean?)

        /** Alias for calling [Builder.isUniversalApi] with `isUniversalApi.orElse(null)`. */
        fun isUniversalApi(isUniversalApi: Optional<Boolean>) =
            isUniversalApi(isUniversalApi.getOrNull())

        /**
         * Sets [Builder.isUniversalApi] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isUniversalApi] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun isUniversalApi(isUniversalApi: JsonField<Boolean>) = apply {
            body.isUniversalApi(isUniversalApi)
        }

        /** Name of the organization */
        fun name(name: String?) = apply { body.name(name) }

        /** Alias for calling [Builder.name] with `name.orElse(null)`. */
        fun name(name: Optional<String>) = name(name.getOrNull())

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        fun proxyUrl(proxyUrl: String?) = apply { body.proxyUrl(proxyUrl) }

        /** Alias for calling [Builder.proxyUrl] with `proxyUrl.orElse(null)`. */
        fun proxyUrl(proxyUrl: Optional<String>) = proxyUrl(proxyUrl.getOrNull())

        /**
         * Sets [Builder.proxyUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.proxyUrl] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun proxyUrl(proxyUrl: JsonField<String>) = apply { body.proxyUrl(proxyUrl) }

        fun realtimeUrl(realtimeUrl: String?) = apply { body.realtimeUrl(realtimeUrl) }

        /** Alias for calling [Builder.realtimeUrl] with `realtimeUrl.orElse(null)`. */
        fun realtimeUrl(realtimeUrl: Optional<String>) = realtimeUrl(realtimeUrl.getOrNull())

        /**
         * Sets [Builder.realtimeUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.realtimeUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun realtimeUrl(realtimeUrl: JsonField<String>) = apply { body.realtimeUrl(realtimeUrl) }

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

        /**
         * Returns an immutable instance of [OrganizationUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .organizationId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): OrganizationUpdateParams =
            OrganizationUpdateParams(
                checkRequired("organizationId", organizationId),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    @JvmSynthetic internal fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> organizationId
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    private constructor(
        private val apiUrl: JsonField<String>,
        private val isUniversalApi: JsonField<Boolean>,
        private val name: JsonField<String>,
        private val proxyUrl: JsonField<String>,
        private val realtimeUrl: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("api_url") @ExcludeMissing apiUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("is_universal_api")
            @ExcludeMissing
            isUniversalApi: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("proxy_url")
            @ExcludeMissing
            proxyUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("realtime_url")
            @ExcludeMissing
            realtimeUrl: JsonField<String> = JsonMissing.of(),
        ) : this(apiUrl, isUniversalApi, name, proxyUrl, realtimeUrl, mutableMapOf())

        /**
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun apiUrl(): Optional<String> = Optional.ofNullable(apiUrl.getNullable("api_url"))

        /**
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun isUniversalApi(): Optional<Boolean> =
            Optional.ofNullable(isUniversalApi.getNullable("is_universal_api"))

        /**
         * Name of the organization
         *
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

        /**
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun proxyUrl(): Optional<String> = Optional.ofNullable(proxyUrl.getNullable("proxy_url"))

        /**
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun realtimeUrl(): Optional<String> =
            Optional.ofNullable(realtimeUrl.getNullable("realtime_url"))

        /**
         * Returns the raw JSON value of [apiUrl].
         *
         * Unlike [apiUrl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("api_url") @ExcludeMissing fun _apiUrl(): JsonField<String> = apiUrl

        /**
         * Returns the raw JSON value of [isUniversalApi].
         *
         * Unlike [isUniversalApi], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("is_universal_api")
        @ExcludeMissing
        fun _isUniversalApi(): JsonField<Boolean> = isUniversalApi

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [proxyUrl].
         *
         * Unlike [proxyUrl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("proxy_url") @ExcludeMissing fun _proxyUrl(): JsonField<String> = proxyUrl

        /**
         * Returns the raw JSON value of [realtimeUrl].
         *
         * Unlike [realtimeUrl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("realtime_url")
        @ExcludeMissing
        fun _realtimeUrl(): JsonField<String> = realtimeUrl

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var apiUrl: JsonField<String> = JsonMissing.of()
            private var isUniversalApi: JsonField<Boolean> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var proxyUrl: JsonField<String> = JsonMissing.of()
            private var realtimeUrl: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                apiUrl = body.apiUrl
                isUniversalApi = body.isUniversalApi
                name = body.name
                proxyUrl = body.proxyUrl
                realtimeUrl = body.realtimeUrl
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun apiUrl(apiUrl: String?) = apiUrl(JsonField.ofNullable(apiUrl))

            /** Alias for calling [Builder.apiUrl] with `apiUrl.orElse(null)`. */
            fun apiUrl(apiUrl: Optional<String>) = apiUrl(apiUrl.getOrNull())

            /**
             * Sets [Builder.apiUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.apiUrl] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun apiUrl(apiUrl: JsonField<String>) = apply { this.apiUrl = apiUrl }

            fun isUniversalApi(isUniversalApi: Boolean?) =
                isUniversalApi(JsonField.ofNullable(isUniversalApi))

            /**
             * Alias for [Builder.isUniversalApi].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun isUniversalApi(isUniversalApi: Boolean) = isUniversalApi(isUniversalApi as Boolean?)

            /** Alias for calling [Builder.isUniversalApi] with `isUniversalApi.orElse(null)`. */
            fun isUniversalApi(isUniversalApi: Optional<Boolean>) =
                isUniversalApi(isUniversalApi.getOrNull())

            /**
             * Sets [Builder.isUniversalApi] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isUniversalApi] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun isUniversalApi(isUniversalApi: JsonField<Boolean>) = apply {
                this.isUniversalApi = isUniversalApi
            }

            /** Name of the organization */
            fun name(name: String?) = name(JsonField.ofNullable(name))

            /** Alias for calling [Builder.name] with `name.orElse(null)`. */
            fun name(name: Optional<String>) = name(name.getOrNull())

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun proxyUrl(proxyUrl: String?) = proxyUrl(JsonField.ofNullable(proxyUrl))

            /** Alias for calling [Builder.proxyUrl] with `proxyUrl.orElse(null)`. */
            fun proxyUrl(proxyUrl: Optional<String>) = proxyUrl(proxyUrl.getOrNull())

            /**
             * Sets [Builder.proxyUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.proxyUrl] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun proxyUrl(proxyUrl: JsonField<String>) = apply { this.proxyUrl = proxyUrl }

            fun realtimeUrl(realtimeUrl: String?) = realtimeUrl(JsonField.ofNullable(realtimeUrl))

            /** Alias for calling [Builder.realtimeUrl] with `realtimeUrl.orElse(null)`. */
            fun realtimeUrl(realtimeUrl: Optional<String>) = realtimeUrl(realtimeUrl.getOrNull())

            /**
             * Sets [Builder.realtimeUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.realtimeUrl] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun realtimeUrl(realtimeUrl: JsonField<String>) = apply {
                this.realtimeUrl = realtimeUrl
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

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body =
                Body(
                    apiUrl,
                    isUniversalApi,
                    name,
                    proxyUrl,
                    realtimeUrl,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            apiUrl()
            isUniversalApi()
            name()
            proxyUrl()
            realtimeUrl()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: BraintrustInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (apiUrl.asKnown().isPresent) 1 else 0) +
                (if (isUniversalApi.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (proxyUrl.asKnown().isPresent) 1 else 0) +
                (if (realtimeUrl.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && apiUrl == other.apiUrl && isUniversalApi == other.isUniversalApi && name == other.name && proxyUrl == other.proxyUrl && realtimeUrl == other.realtimeUrl && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(apiUrl, isUniversalApi, name, proxyUrl, realtimeUrl, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{apiUrl=$apiUrl, isUniversalApi=$isUniversalApi, name=$name, proxyUrl=$proxyUrl, realtimeUrl=$realtimeUrl, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is OrganizationUpdateParams && organizationId == other.organizationId && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(organizationId, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "OrganizationUpdateParams{organizationId=$organizationId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
