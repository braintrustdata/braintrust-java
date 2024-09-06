// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.BaseDeserializer
import com.braintrustdata.api.core.BaseSerializer
import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.getOrThrow
import com.braintrustdata.api.core.toUnmodifiable
import com.braintrustdata.api.errors.BraintrustInvalidDataException
import com.braintrustdata.api.models.*
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

class DatasetInsertParams
constructor(
    private val datasetId: String,
    private val events: List<Event>,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun datasetId(): String = datasetId

    fun events(): List<Event> = events

    @JvmSynthetic
    internal fun getBody(): DatasetInsertBody {
        return DatasetInsertBody(events, additionalBodyProperties)
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> datasetId
            else -> ""
        }
    }

    @JsonDeserialize(builder = DatasetInsertBody.Builder::class)
    @NoAutoDetect
    class DatasetInsertBody
    internal constructor(
        private val events: List<Event>?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** A list of dataset events to insert */
        @JsonProperty("events") fun events(): List<Event>? = events

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is DatasetInsertBody &&
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
            "DatasetInsertBody{events=$events, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var events: List<Event>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(datasetInsertBody: DatasetInsertBody) = apply {
                this.events = datasetInsertBody.events
                additionalProperties(datasetInsertBody.additionalProperties)
            }

            /** A list of dataset events to insert */
            @JsonProperty("events") fun events(events: List<Event>) = apply { this.events = events }

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

            fun build(): DatasetInsertBody =
                DatasetInsertBody(
                    checkNotNull(events) { "`events` is required but was not set" }
                        .toUnmodifiable(),
                    additionalProperties.toUnmodifiable()
                )
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DatasetInsertParams &&
            this.datasetId == other.datasetId &&
            this.events == other.events &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            datasetId,
            events,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "DatasetInsertParams{datasetId=$datasetId, events=$events, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var datasetId: String? = null
        private var events: MutableList<Event> = mutableListOf()
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(datasetInsertParams: DatasetInsertParams) = apply {
            this.datasetId = datasetInsertParams.datasetId
            this.events(datasetInsertParams.events)
            additionalQueryParams(datasetInsertParams.additionalQueryParams)
            additionalHeaders(datasetInsertParams.additionalHeaders)
            additionalBodyProperties(datasetInsertParams.additionalBodyProperties)
        }

        /** Dataset id */
        fun datasetId(datasetId: String) = apply { this.datasetId = datasetId }

        /** A list of dataset events to insert */
        fun events(events: List<Event>) = apply {
            this.events.clear()
            this.events.addAll(events)
        }

        /** A list of dataset events to insert */
        fun addEvent(event: Event) = apply { this.events.add(event) }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): DatasetInsertParams =
            DatasetInsertParams(
                checkNotNull(datasetId) { "`datasetId` is required but was not set" },
                checkNotNull(events) { "`events` is required but was not set" }.toUnmodifiable(),
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
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
