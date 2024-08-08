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

@JsonDeserialize(builder = InsertExperimentEventRequest.Builder::class)
@NoAutoDetect
class InsertExperimentEventRequest
private constructor(
    private val events: JsonField<List<InsertExperimentEvent>>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** A list of experiment events to insert */
    fun events(): List<InsertExperimentEvent> = events.getRequired("events")

    /** A list of experiment events to insert */
    @JsonProperty("events") @ExcludeMissing fun _events() = events

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): InsertExperimentEventRequest = apply {
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

        return other is InsertExperimentEventRequest &&
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
        "InsertExperimentEventRequest{events=$events, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var events: JsonField<List<InsertExperimentEvent>> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(insertExperimentEventRequest: InsertExperimentEventRequest) = apply {
            this.events = insertExperimentEventRequest.events
            additionalProperties(insertExperimentEventRequest.additionalProperties)
        }

        /** A list of experiment events to insert */
        fun events(events: List<InsertExperimentEvent>) = events(JsonField.of(events))

        /** A list of experiment events to insert */
        @JsonProperty("events")
        @ExcludeMissing
        fun events(events: JsonField<List<InsertExperimentEvent>>) = apply { this.events = events }

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

        fun build(): InsertExperimentEventRequest =
            InsertExperimentEventRequest(
                events.map { it.toUnmodifiable() },
                additionalProperties.toUnmodifiable()
            )
    }
}
