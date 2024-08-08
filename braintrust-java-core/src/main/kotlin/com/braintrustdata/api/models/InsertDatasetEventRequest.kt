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

@JsonDeserialize(builder = InsertDatasetEventRequest.Builder::class)
@NoAutoDetect
class InsertDatasetEventRequest
private constructor(
    private val events: JsonField<List<InsertDatasetEvent>>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** A list of dataset events to insert */
    fun events(): List<InsertDatasetEvent> = events.getRequired("events")

    /** A list of dataset events to insert */
    @JsonProperty("events") @ExcludeMissing fun _events() = events

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): InsertDatasetEventRequest = apply {
        if (!validated) {
            events()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InsertDatasetEventRequest &&
            this.events == other.events &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = Objects.hash(events, additionalProperties)
        }
        return hashCode
    }

    override fun toString() =
        "InsertDatasetEventRequest{events=$events, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var events: JsonField<List<InsertDatasetEvent>> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(insertDatasetEventRequest: InsertDatasetEventRequest) = apply {
            this.events = insertDatasetEventRequest.events
            additionalProperties(insertDatasetEventRequest.additionalProperties)
        }

        /** A list of dataset events to insert */
        fun events(events: List<InsertDatasetEvent>) = events(JsonField.of(events))

        /** A list of dataset events to insert */
        @JsonProperty("events")
        @ExcludeMissing
        fun events(events: JsonField<List<InsertDatasetEvent>>) = apply { this.events = events }

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

        fun build(): InsertDatasetEventRequest =
            InsertDatasetEventRequest(
                events.map { it.toUnmodifiable() },
                additionalProperties.toUnmodifiable()
            )
    }
}
