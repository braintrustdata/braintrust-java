// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.checkKnown
import com.braintrustdata.api.core.checkRequired
import com.braintrustdata.api.core.immutableEmptyMap
import com.braintrustdata.api.core.toImmutable
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

@NoAutoDetect
class FetchDatasetEventsResponse
@JsonCreator
private constructor(
    @JsonProperty("events")
    @ExcludeMissing
    private val events: JsonField<List<DatasetEvent>> = JsonMissing.of(),
    @JsonProperty("cursor")
    @ExcludeMissing
    private val cursor: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

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
    @JsonProperty("events") @ExcludeMissing fun _events(): JsonField<List<DatasetEvent>> = events

    /**
     * Pagination cursor
     *
     * Pass this string directly as the `cursor` param to your next fetch request to get the next
     * page of results. Not provided if the returned result set is empty.
     */
    @JsonProperty("cursor") @ExcludeMissing fun _cursor(): JsonField<String> = cursor

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): FetchDatasetEventsResponse = apply {
        if (validated) {
            return@apply
        }

        events().forEach { it.validate() }
        cursor()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [FetchDatasetEventsResponse].
         *
         * The following fields are required:
         * ```java
         * .events()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FetchDatasetEventsResponse]. */
    class Builder internal constructor() {

        private var events: JsonField<MutableList<DatasetEvent>>? = null
        private var cursor: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(fetchDatasetEventsResponse: FetchDatasetEventsResponse) = apply {
            events = fetchDatasetEventsResponse.events.map { it.toMutableList() }
            cursor = fetchDatasetEventsResponse.cursor
            additionalProperties = fetchDatasetEventsResponse.additionalProperties.toMutableMap()
        }

        /** A list of fetched events */
        fun events(events: List<DatasetEvent>) = events(JsonField.of(events))

        /** A list of fetched events */
        fun events(events: JsonField<List<DatasetEvent>>) = apply {
            this.events = events.map { it.toMutableList() }
        }

        /** A list of fetched events */
        fun addEvent(event: DatasetEvent) = apply {
            events =
                (events ?: JsonField.of(mutableListOf())).also {
                    checkKnown("events", it).add(event)
                }
        }

        /**
         * Pagination cursor
         *
         * Pass this string directly as the `cursor` param to your next fetch request to get the
         * next page of results. Not provided if the returned result set is empty.
         */
        fun cursor(cursor: String?) = cursor(JsonField.ofNullable(cursor))

        /**
         * Pagination cursor
         *
         * Pass this string directly as the `cursor` param to your next fetch request to get the
         * next page of results. Not provided if the returned result set is empty.
         */
        fun cursor(cursor: Optional<String>) = cursor(cursor.getOrNull())

        /**
         * Pagination cursor
         *
         * Pass this string directly as the `cursor` param to your next fetch request to get the
         * next page of results. Not provided if the returned result set is empty.
         */
        fun cursor(cursor: JsonField<String>) = apply { this.cursor = cursor }

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

        fun build(): FetchDatasetEventsResponse =
            FetchDatasetEventsResponse(
                checkRequired("events", events).map { it.toImmutable() },
                cursor,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is FetchDatasetEventsResponse && events == other.events && cursor == other.cursor && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(events, cursor, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "FetchDatasetEventsResponse{events=$events, cursor=$cursor, additionalProperties=$additionalProperties}"
}
