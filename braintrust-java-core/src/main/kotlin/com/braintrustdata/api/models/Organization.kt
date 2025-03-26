// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.checkRequired
import com.braintrustdata.api.errors.BraintrustInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class Organization
private constructor(
    private val id: JsonField<String>,
    private val name: JsonField<String>,
    private val apiUrl: JsonField<String>,
    private val created: JsonField<OffsetDateTime>,
    private val isUniversalApi: JsonField<Boolean>,
    private val proxyUrl: JsonField<String>,
    private val realtimeUrl: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("api_url") @ExcludeMissing apiUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created")
        @ExcludeMissing
        created: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("is_universal_api")
        @ExcludeMissing
        isUniversalApi: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("proxy_url") @ExcludeMissing proxyUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("realtime_url")
        @ExcludeMissing
        realtimeUrl: JsonField<String> = JsonMissing.of(),
    ) : this(id, name, apiUrl, created, isUniversalApi, proxyUrl, realtimeUrl, mutableMapOf())

    /**
     * Unique identifier for the organization
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Name of the organization
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun apiUrl(): Optional<String> = Optional.ofNullable(apiUrl.getNullable("api_url"))

    /**
     * Date of organization creation
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun created(): Optional<OffsetDateTime> = Optional.ofNullable(created.getNullable("created"))

    /**
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isUniversalApi(): Optional<Boolean> =
        Optional.ofNullable(isUniversalApi.getNullable("is_universal_api"))

    /**
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun proxyUrl(): Optional<String> = Optional.ofNullable(proxyUrl.getNullable("proxy_url"))

    /**
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun realtimeUrl(): Optional<String> =
        Optional.ofNullable(realtimeUrl.getNullable("realtime_url"))

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [apiUrl].
     *
     * Unlike [apiUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("api_url") @ExcludeMissing fun _apiUrl(): JsonField<String> = apiUrl

    /**
     * Returns the raw JSON value of [created].
     *
     * Unlike [created], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<OffsetDateTime> = created

    /**
     * Returns the raw JSON value of [isUniversalApi].
     *
     * Unlike [isUniversalApi], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("is_universal_api")
    @ExcludeMissing
    fun _isUniversalApi(): JsonField<Boolean> = isUniversalApi

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

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Name of the organization */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun apiUrl(apiUrl: String?) = apiUrl(JsonField.ofNullable(apiUrl))

        /** Alias for calling [Builder.apiUrl] with `apiUrl.orElse(null)`. */
        fun apiUrl(apiUrl: Optional<String>) = apiUrl(apiUrl.getOrNull())

        /**
         * Sets [Builder.apiUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.apiUrl] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun apiUrl(apiUrl: JsonField<String>) = apply { this.apiUrl = apiUrl }

        /** Date of organization creation */
        fun created(created: OffsetDateTime?) = created(JsonField.ofNullable(created))

        /** Alias for calling [Builder.created] with `created.orElse(null)`. */
        fun created(created: Optional<OffsetDateTime>) = created(created.getOrNull())

        /**
         * Sets [Builder.created] to an arbitrary JSON value.
         *
         * You should usually call [Builder.created] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

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

        fun proxyUrl(proxyUrl: String?) = proxyUrl(JsonField.ofNullable(proxyUrl))

        /** Alias for calling [Builder.proxyUrl] with `proxyUrl.orElse(null)`. */
        fun proxyUrl(proxyUrl: Optional<String>) = proxyUrl(proxyUrl.getOrNull())

        /**
         * Sets [Builder.proxyUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.proxyUrl] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun proxyUrl(proxyUrl: JsonField<String>) = apply { this.proxyUrl = proxyUrl }

        fun realtimeUrl(realtimeUrl: String?) = realtimeUrl(JsonField.ofNullable(realtimeUrl))

        /** Alias for calling [Builder.realtimeUrl] with `realtimeUrl.orElse(null)`. */
        fun realtimeUrl(realtimeUrl: Optional<String>) = realtimeUrl(realtimeUrl.getOrNull())

        /**
         * Sets [Builder.realtimeUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.realtimeUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
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

        /**
         * Returns an immutable instance of [Organization].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .name()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Organization =
            Organization(
                checkRequired("id", id),
                checkRequired("name", name),
                apiUrl,
                created,
                isUniversalApi,
                proxyUrl,
                realtimeUrl,
                additionalProperties.toMutableMap(),
            )
    }

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
