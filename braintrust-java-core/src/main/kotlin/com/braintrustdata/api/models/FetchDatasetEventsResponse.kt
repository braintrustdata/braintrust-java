// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.checkKnown
import com.braintrustdata.api.core.checkRequired
import com.braintrustdata.api.core.toImmutable
import com.braintrustdata.api.errors.BraintrustInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class FetchDatasetEventsResponse
private constructor(
    private val events: JsonField<List<DatasetEvent>>,
    private val cursor: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("events")
        @ExcludeMissing
        events: JsonField<List<DatasetEvent>> = JsonMissing.of(),
        @JsonProperty("cursor") @ExcludeMissing cursor: JsonField<String> = JsonMissing.of(),
    ) : this(events, cursor, mutableMapOf())

    /**
     * A list of fetched events
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun events(): List<DatasetEvent> = events.getRequired("events")

    /**
     * Pagination cursor
     *
     * Pass this string directly as the `cursor` param to your next fetch request to get the next
     * page of results. Not provided if the returned result set is empty.
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cursor(): Optional<String> = cursor.getOptional("cursor")

    /**
     * Returns the raw JSON value of [events].
     *
     * Unlike [events], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("events") @ExcludeMissing fun _events(): JsonField<List<DatasetEvent>> = events

    /**
     * Returns the raw JSON value of [cursor].
     *
     * Unlike [cursor], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cursor") @ExcludeMissing fun _cursor(): JsonField<String> = cursor

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

        /**
         * Sets [Builder.events] to an arbitrary JSON value.
         *
         * You should usually call [Builder.events] with a well-typed `List<DatasetEvent>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun events(events: JsonField<List<DatasetEvent>>) = apply {
            this.events = events.map { it.toMutableList() }
        }

        /**
         * Adds a single [DatasetEvent] to [events].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
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

        /** Alias for calling [Builder.cursor] with `cursor.orElse(null)`. */
        fun cursor(cursor: Optional<String>) = cursor(cursor.getOrNull())

        /**
         * Sets [Builder.cursor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cursor] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
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

        /**
         * Returns an immutable instance of [FetchDatasetEventsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .events()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): FetchDatasetEventsResponse =
            FetchDatasetEventsResponse(
                checkRequired("events", events).map { it.toImmutable() },
                cursor,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): FetchDatasetEventsResponse = apply {
        if (validated) {
            return@apply
        }

        events().forEach { it.validate() }
        cursor()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (events.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (cursor.asKnown().isPresent) 1 else 0)

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
