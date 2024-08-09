// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.BaseDeserializer
import com.braintrustdata.api.core.BaseSerializer
import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.getOrThrow
import com.braintrustdata.api.core.toUnmodifiable
import com.braintrustdata.api.errors.BraintrustInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = InsertDatasetEventRequest.Builder::class)
@NoAutoDetect
class InsertDatasetEventRequest
private constructor(
    private val events: JsonField<List<Event>>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** A list of dataset events to insert */
    fun events(): List<Event> = events.getRequired("events")

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

        private var events: JsonField<List<Event>> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(insertDatasetEventRequest: InsertDatasetEventRequest) = apply {
            this.events = insertDatasetEventRequest.events
            additionalProperties(insertDatasetEventRequest.additionalProperties)
        }

        /** A list of dataset events to insert */
        fun events(events: List<Event>) = events(JsonField.of(events))

        /** A list of dataset events to insert */
        @JsonProperty("events")
        @ExcludeMissing
        fun events(events: JsonField<List<Event>>) = apply { this.events = events }

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

    @JsonDeserialize(using = Event.Deserializer::class)
    @JsonSerialize(using = Event.Serializer::class)
    class Event
    private constructor(
        private val insertDatasetEventReplace: InsertDatasetEventReplace? = null,
        private val insertDatasetEventMerge: InsertDatasetEventMerge? = null,
        private val _json: JsonValue? = null,
    ) {

        private var validated: Boolean = false

        fun insertDatasetEventReplace(): Optional<InsertDatasetEventReplace> =
            Optional.ofNullable(insertDatasetEventReplace)

        fun insertDatasetEventMerge(): Optional<InsertDatasetEventMerge> =
            Optional.ofNullable(insertDatasetEventMerge)

        fun isInsertDatasetEventReplace(): Boolean = insertDatasetEventReplace != null

        fun isInsertDatasetEventMerge(): Boolean = insertDatasetEventMerge != null

        fun asInsertDatasetEventReplace(): InsertDatasetEventReplace =
            insertDatasetEventReplace.getOrThrow("insertDatasetEventReplace")

        fun asInsertDatasetEventMerge(): InsertDatasetEventMerge =
            insertDatasetEventMerge.getOrThrow("insertDatasetEventMerge")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                insertDatasetEventReplace != null ->
                    visitor.visitInsertDatasetEventReplace(insertDatasetEventReplace)
                insertDatasetEventMerge != null ->
                    visitor.visitInsertDatasetEventMerge(insertDatasetEventMerge)
                else -> visitor.unknown(_json)
            }
        }

        fun validate(): Event = apply {
            if (!validated) {
                if (insertDatasetEventReplace == null && insertDatasetEventMerge == null) {
                    throw BraintrustInvalidDataException("Unknown Event: $_json")
                }
                insertDatasetEventReplace?.validate()
                insertDatasetEventMerge?.validate()
                validated = true
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Event &&
                this.insertDatasetEventReplace == other.insertDatasetEventReplace &&
                this.insertDatasetEventMerge == other.insertDatasetEventMerge
        }

        override fun hashCode(): Int {
            return Objects.hash(insertDatasetEventReplace, insertDatasetEventMerge)
        }

        override fun toString(): String {
            return when {
                insertDatasetEventReplace != null ->
                    "Event{insertDatasetEventReplace=$insertDatasetEventReplace}"
                insertDatasetEventMerge != null ->
                    "Event{insertDatasetEventMerge=$insertDatasetEventMerge}"
                _json != null -> "Event{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Event")
            }
        }

        companion object {

            @JvmStatic
            fun ofInsertDatasetEventReplace(insertDatasetEventReplace: InsertDatasetEventReplace) =
                Event(insertDatasetEventReplace = insertDatasetEventReplace)

            @JvmStatic
            fun ofInsertDatasetEventMerge(insertDatasetEventMerge: InsertDatasetEventMerge) =
                Event(insertDatasetEventMerge = insertDatasetEventMerge)
        }

        interface Visitor<out T> {

            fun visitInsertDatasetEventReplace(
                insertDatasetEventReplace: InsertDatasetEventReplace
            ): T

            fun visitInsertDatasetEventMerge(insertDatasetEventMerge: InsertDatasetEventMerge): T

            fun unknown(json: JsonValue?): T {
                throw BraintrustInvalidDataException("Unknown Event: $json")
            }
        }

        class Deserializer : BaseDeserializer<Event>(Event::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Event {
                val json = JsonValue.fromJsonNode(node)
                tryDeserialize(node, jacksonTypeRef<InsertDatasetEventReplace>()) { it.validate() }
                    ?.let {
                        return Event(insertDatasetEventReplace = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<InsertDatasetEventMerge>()) { it.validate() }
                    ?.let {
                        return Event(insertDatasetEventMerge = it, _json = json)
                    }

                return Event(_json = json)
            }
        }

        class Serializer : BaseSerializer<Event>(Event::class) {

            override fun serialize(
                value: Event,
                generator: JsonGenerator,
                provider: SerializerProvider
            ) {
                when {
                    value.insertDatasetEventReplace != null ->
                        generator.writeObject(value.insertDatasetEventReplace)
                    value.insertDatasetEventMerge != null ->
                        generator.writeObject(value.insertDatasetEventMerge)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Event")
                }
            }
        }
    }
}
