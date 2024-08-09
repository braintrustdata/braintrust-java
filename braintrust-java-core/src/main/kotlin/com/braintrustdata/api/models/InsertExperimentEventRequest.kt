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

@JsonDeserialize(builder = InsertExperimentEventRequest.Builder::class)
@NoAutoDetect
class InsertExperimentEventRequest
private constructor(
    private val events: JsonField<List<Event>>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** A list of experiment events to insert */
    fun events(): List<Event> = events.getRequired("events")

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

        private var events: JsonField<List<Event>> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(insertExperimentEventRequest: InsertExperimentEventRequest) = apply {
            this.events = insertExperimentEventRequest.events
            additionalProperties(insertExperimentEventRequest.additionalProperties)
        }

        /** A list of experiment events to insert */
        fun events(events: List<Event>) = events(JsonField.of(events))

        /** A list of experiment events to insert */
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

        fun build(): InsertExperimentEventRequest =
            InsertExperimentEventRequest(
                events.map { it.toUnmodifiable() },
                additionalProperties.toUnmodifiable()
            )
    }

    @JsonDeserialize(using = Event.Deserializer::class)
    @JsonSerialize(using = Event.Serializer::class)
    class Event
    private constructor(
        private val insertExperimentEventReplace: InsertExperimentEventReplace? = null,
        private val insertExperimentEventMerge: InsertExperimentEventMerge? = null,
        private val _json: JsonValue? = null,
    ) {

        private var validated: Boolean = false

        fun insertExperimentEventReplace(): Optional<InsertExperimentEventReplace> =
            Optional.ofNullable(insertExperimentEventReplace)

        fun insertExperimentEventMerge(): Optional<InsertExperimentEventMerge> =
            Optional.ofNullable(insertExperimentEventMerge)

        fun isInsertExperimentEventReplace(): Boolean = insertExperimentEventReplace != null

        fun isInsertExperimentEventMerge(): Boolean = insertExperimentEventMerge != null

        fun asInsertExperimentEventReplace(): InsertExperimentEventReplace =
            insertExperimentEventReplace.getOrThrow("insertExperimentEventReplace")

        fun asInsertExperimentEventMerge(): InsertExperimentEventMerge =
            insertExperimentEventMerge.getOrThrow("insertExperimentEventMerge")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                insertExperimentEventReplace != null ->
                    visitor.visitInsertExperimentEventReplace(insertExperimentEventReplace)
                insertExperimentEventMerge != null ->
                    visitor.visitInsertExperimentEventMerge(insertExperimentEventMerge)
                else -> visitor.unknown(_json)
            }
        }

        fun validate(): Event = apply {
            if (!validated) {
                if (insertExperimentEventReplace == null && insertExperimentEventMerge == null) {
                    throw BraintrustInvalidDataException("Unknown Event: $_json")
                }
                insertExperimentEventReplace?.validate()
                insertExperimentEventMerge?.validate()
                validated = true
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Event &&
                this.insertExperimentEventReplace == other.insertExperimentEventReplace &&
                this.insertExperimentEventMerge == other.insertExperimentEventMerge
        }

        override fun hashCode(): Int {
            return Objects.hash(insertExperimentEventReplace, insertExperimentEventMerge)
        }

        override fun toString(): String {
            return when {
                insertExperimentEventReplace != null ->
                    "Event{insertExperimentEventReplace=$insertExperimentEventReplace}"
                insertExperimentEventMerge != null ->
                    "Event{insertExperimentEventMerge=$insertExperimentEventMerge}"
                _json != null -> "Event{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Event")
            }
        }

        companion object {

            @JvmStatic
            fun ofInsertExperimentEventReplace(
                insertExperimentEventReplace: InsertExperimentEventReplace
            ) = Event(insertExperimentEventReplace = insertExperimentEventReplace)

            @JvmStatic
            fun ofInsertExperimentEventMerge(
                insertExperimentEventMerge: InsertExperimentEventMerge
            ) = Event(insertExperimentEventMerge = insertExperimentEventMerge)
        }

        interface Visitor<out T> {

            fun visitInsertExperimentEventReplace(
                insertExperimentEventReplace: InsertExperimentEventReplace
            ): T

            fun visitInsertExperimentEventMerge(
                insertExperimentEventMerge: InsertExperimentEventMerge
            ): T

            fun unknown(json: JsonValue?): T {
                throw BraintrustInvalidDataException("Unknown Event: $json")
            }
        }

        class Deserializer : BaseDeserializer<Event>(Event::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Event {
                val json = JsonValue.fromJsonNode(node)
                tryDeserialize(node, jacksonTypeRef<InsertExperimentEventReplace>()) {
                        it.validate()
                    }
                    ?.let {
                        return Event(insertExperimentEventReplace = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<InsertExperimentEventMerge>()) { it.validate() }
                    ?.let {
                        return Event(insertExperimentEventMerge = it, _json = json)
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
                    value.insertExperimentEventReplace != null ->
                        generator.writeObject(value.insertExperimentEventReplace)
                    value.insertExperimentEventMerge != null ->
                        generator.writeObject(value.insertExperimentEventMerge)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Event")
                }
            }
        }
    }
}
