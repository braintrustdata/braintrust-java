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

@JsonDeserialize(builder = InsertProjectLogsEventRequest.Builder::class)
@NoAutoDetect
class InsertProjectLogsEventRequest
private constructor(
    private val events: JsonField<List<Event>>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** A list of project logs events to insert */
    fun events(): List<Event> = events.getRequired("events")

    /** A list of project logs events to insert */
    @JsonProperty("events") @ExcludeMissing fun _events() = events

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): InsertProjectLogsEventRequest = apply {
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

        return other is InsertProjectLogsEventRequest &&
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
        "InsertProjectLogsEventRequest{events=$events, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var events: JsonField<List<Event>> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(insertProjectLogsEventRequest: InsertProjectLogsEventRequest) = apply {
            this.events = insertProjectLogsEventRequest.events
            additionalProperties(insertProjectLogsEventRequest.additionalProperties)
        }

        /** A list of project logs events to insert */
        fun events(events: List<Event>) = events(JsonField.of(events))

        /** A list of project logs events to insert */
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

        fun build(): InsertProjectLogsEventRequest =
            InsertProjectLogsEventRequest(
                events.map { it.toUnmodifiable() },
                additionalProperties.toUnmodifiable()
            )
    }

    @JsonDeserialize(using = Event.Deserializer::class)
    @JsonSerialize(using = Event.Serializer::class)
    class Event
    private constructor(
        private val insertProjectLogsEventReplace: InsertProjectLogsEventReplace? = null,
        private val insertProjectLogsEventMerge: InsertProjectLogsEventMerge? = null,
        private val _json: JsonValue? = null,
    ) {

        private var validated: Boolean = false

        fun insertProjectLogsEventReplace(): Optional<InsertProjectLogsEventReplace> =
            Optional.ofNullable(insertProjectLogsEventReplace)

        fun insertProjectLogsEventMerge(): Optional<InsertProjectLogsEventMerge> =
            Optional.ofNullable(insertProjectLogsEventMerge)

        fun isInsertProjectLogsEventReplace(): Boolean = insertProjectLogsEventReplace != null

        fun isInsertProjectLogsEventMerge(): Boolean = insertProjectLogsEventMerge != null

        fun asInsertProjectLogsEventReplace(): InsertProjectLogsEventReplace =
            insertProjectLogsEventReplace.getOrThrow("insertProjectLogsEventReplace")

        fun asInsertProjectLogsEventMerge(): InsertProjectLogsEventMerge =
            insertProjectLogsEventMerge.getOrThrow("insertProjectLogsEventMerge")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                insertProjectLogsEventReplace != null ->
                    visitor.visitInsertProjectLogsEventReplace(insertProjectLogsEventReplace)
                insertProjectLogsEventMerge != null ->
                    visitor.visitInsertProjectLogsEventMerge(insertProjectLogsEventMerge)
                else -> visitor.unknown(_json)
            }
        }

        fun validate(): Event = apply {
            if (!validated) {
                if (insertProjectLogsEventReplace == null && insertProjectLogsEventMerge == null) {
                    throw BraintrustInvalidDataException("Unknown Event: $_json")
                }
                insertProjectLogsEventReplace?.validate()
                insertProjectLogsEventMerge?.validate()
                validated = true
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Event &&
                this.insertProjectLogsEventReplace == other.insertProjectLogsEventReplace &&
                this.insertProjectLogsEventMerge == other.insertProjectLogsEventMerge
        }

        override fun hashCode(): Int {
            return Objects.hash(insertProjectLogsEventReplace, insertProjectLogsEventMerge)
        }

        override fun toString(): String {
            return when {
                insertProjectLogsEventReplace != null ->
                    "Event{insertProjectLogsEventReplace=$insertProjectLogsEventReplace}"
                insertProjectLogsEventMerge != null ->
                    "Event{insertProjectLogsEventMerge=$insertProjectLogsEventMerge}"
                _json != null -> "Event{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Event")
            }
        }

        companion object {

            @JvmStatic
            fun ofInsertProjectLogsEventReplace(
                insertProjectLogsEventReplace: InsertProjectLogsEventReplace
            ) = Event(insertProjectLogsEventReplace = insertProjectLogsEventReplace)

            @JvmStatic
            fun ofInsertProjectLogsEventMerge(
                insertProjectLogsEventMerge: InsertProjectLogsEventMerge
            ) = Event(insertProjectLogsEventMerge = insertProjectLogsEventMerge)
        }

        interface Visitor<out T> {

            fun visitInsertProjectLogsEventReplace(
                insertProjectLogsEventReplace: InsertProjectLogsEventReplace
            ): T

            fun visitInsertProjectLogsEventMerge(
                insertProjectLogsEventMerge: InsertProjectLogsEventMerge
            ): T

            fun unknown(json: JsonValue?): T {
                throw BraintrustInvalidDataException("Unknown Event: $json")
            }
        }

        class Deserializer : BaseDeserializer<Event>(Event::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Event {
                val json = JsonValue.fromJsonNode(node)
                tryDeserialize(node, jacksonTypeRef<InsertProjectLogsEventReplace>()) {
                        it.validate()
                    }
                    ?.let {
                        return Event(insertProjectLogsEventReplace = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<InsertProjectLogsEventMerge>()) {
                        it.validate()
                    }
                    ?.let {
                        return Event(insertProjectLogsEventMerge = it, _json = json)
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
                    value.insertProjectLogsEventReplace != null ->
                        generator.writeObject(value.insertProjectLogsEventReplace)
                    value.insertProjectLogsEventMerge != null ->
                        generator.writeObject(value.insertProjectLogsEventMerge)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Event")
                }
            }
        }
    }
}
