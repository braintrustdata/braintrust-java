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

@JsonDeserialize(builder = FetchDatasetEventsResponse.Builder::class)
@NoAutoDetect
class FetchDatasetEventsResponse
private constructor(
    private val events: JsonField<List<DatasetEvent>>,
    private val cursor: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /** A list of fetched events */
    fun events(): List<DatasetEvent> = events.getRequired("events")

    /**
     * Pagination cursor
     *
     * Pass this string directly as the `cursor` param to your next fetch request to get the next
     * page of results. Not provided if the returned result set is empty.
     */
    fun cursor(): Optional<String> = Optional.ofNullable(cursor.getNullable("cursor"))

    /** A list of fetched events */
    @JsonProperty("events") @ExcludeMissing fun _events() = events

    /**
     * Pagination cursor
     *
     * Pass this string directly as the `cursor` param to your next fetch request to get the next
     * page of results. Not provided if the returned result set is empty.
     */
    @JsonProperty("cursor") @ExcludeMissing fun _cursor() = cursor

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): FetchDatasetEventsResponse = apply {
        if (!validated) {
            events().forEach { it.validate() }
            cursor()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var events: JsonField<List<DatasetEvent>> = JsonMissing.of()
        private var cursor: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(fetchDatasetEventsResponse: FetchDatasetEventsResponse) = apply {
            this.events = fetchDatasetEventsResponse.events
            this.cursor = fetchDatasetEventsResponse.cursor
            additionalProperties(fetchDatasetEventsResponse.additionalProperties)
        }

        /** A list of fetched events */
        fun events(events: List<DatasetEvent>) = events(JsonField.of(events))

        /** A list of fetched events */
        @JsonProperty("events")
        @ExcludeMissing
        fun events(events: JsonField<List<DatasetEvent>>) = apply { this.events = events }

        /**
         * Pagination cursor
         *
         * Pass this string directly as the `cursor` param to your next fetch request to get the
         * next page of results. Not provided if the returned result set is empty.
         */
        fun cursor(cursor: String) = cursor(JsonField.of(cursor))

        /**
         * Pagination cursor
         *
         * Pass this string directly as the `cursor` param to your next fetch request to get the
         * next page of results. Not provided if the returned result set is empty.
         */
        @JsonProperty("cursor")
        @ExcludeMissing
        fun cursor(cursor: JsonField<String>) = apply { this.cursor = cursor }

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

        fun build(): FetchDatasetEventsResponse =
            FetchDatasetEventsResponse(
                events.map { it.toUnmodifiable() },
                cursor,
                additionalProperties.toUnmodifiable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is FetchDatasetEventsResponse && this.events == other.events && this.cursor == other.cursor && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(events, cursor, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() =
        "FetchDatasetEventsResponse{events=$events, cursor=$cursor, additionalProperties=$additionalProperties}"
}
