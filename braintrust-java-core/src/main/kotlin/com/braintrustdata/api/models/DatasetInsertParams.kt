// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.BaseDeserializer
import com.braintrustdata.api.core.BaseSerializer
import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.getOrThrow
import com.braintrustdata.api.core.http.Headers
import com.braintrustdata.api.core.http.QueryParams
import com.braintrustdata.api.core.toImmutable
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
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun datasetId(): String = datasetId

    fun events(): List<Event> = events

    @JvmSynthetic
    internal fun getBody(): DatasetInsertBody {
        return DatasetInsertBody(events, additionalBodyProperties)
    }

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

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

        /** A list of dataset events to insert */
        @JsonProperty("events") fun events(): List<Event>? = events

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

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
                    checkNotNull(events) { "`events` is required but was not set" }.toImmutable(),
                    additionalProperties.toImmutable()
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is DatasetInsertBody && this.events == other.events && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(events, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "DatasetInsertBody{events=$events, additionalProperties=$additionalProperties}"
    }

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DatasetInsertParams && this.datasetId == other.datasetId && this.events == other.events && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(datasetId, events, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "DatasetInsertParams{datasetId=$datasetId, events=$events, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var datasetId: String? = null
        private var events: MutableList<Event> = mutableListOf()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(datasetInsertParams: DatasetInsertParams) = apply {
            this.datasetId = datasetInsertParams.datasetId
            this.events(datasetInsertParams.events)
            additionalHeaders(datasetInsertParams.additionalHeaders)
            additionalQueryParams(datasetInsertParams.additionalQueryParams)
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

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            putAllAdditionalBodyProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply {
            additionalBodyProperties.remove(key)
        }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalBodyProperty)
        }

        fun build(): DatasetInsertParams =
            DatasetInsertParams(
                checkNotNull(datasetId) { "`datasetId` is required but was not set" },
                checkNotNull(events) { "`events` is required but was not set" }.toImmutable(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
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

            return /* spotless:off */ other is Event && this.insertDatasetEventReplace == other.insertDatasetEventReplace && this.insertDatasetEventMerge == other.insertDatasetEventMerge /* spotless:on */
        }

        override fun hashCode(): Int {
            return /* spotless:off */ Objects.hash(insertDatasetEventReplace, insertDatasetEventMerge) /* spotless:on */
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
