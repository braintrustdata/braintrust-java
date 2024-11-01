// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.BaseDeserializer
import com.braintrustdata.api.core.BaseSerializer
import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.getOrThrow
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

class ExperimentInsertParams
constructor(
    private val experimentId: String,
    private val events: List<Event>,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun experimentId(): String = experimentId

    fun events(): List<Event> = events

    @JvmSynthetic
    internal fun getBody(): ExperimentInsertBody {
        return ExperimentInsertBody(events, additionalBodyProperties)
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> experimentId
            else -> ""
        }
    }

    @JsonDeserialize(builder = ExperimentInsertBody.Builder::class)
    @NoAutoDetect
    class ExperimentInsertBody
    internal constructor(
        private val events: List<Event>?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** A list of experiment events to insert */
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
            internal fun from(experimentInsertBody: ExperimentInsertBody) = apply {
                this.events = experimentInsertBody.events
                additionalProperties(experimentInsertBody.additionalProperties)
            }

            /** A list of experiment events to insert */
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

            fun build(): ExperimentInsertBody =
                ExperimentInsertBody(
                    checkNotNull(events) { "`events` is required but was not set" }.toImmutable(),
                    additionalProperties.toImmutable()
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ExperimentInsertBody && this.events == other.events && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(events, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "ExperimentInsertBody{events=$events, additionalProperties=$additionalProperties}"
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ExperimentInsertParams && this.experimentId == other.experimentId && this.events == other.events && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(experimentId, events, additionalQueryParams, additionalHeaders, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "ExperimentInsertParams{experimentId=$experimentId, events=$events, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var experimentId: String? = null
        private var events: MutableList<Event> = mutableListOf()
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(experimentInsertParams: ExperimentInsertParams) = apply {
            this.experimentId = experimentInsertParams.experimentId
            this.events(experimentInsertParams.events)
            additionalQueryParams(experimentInsertParams.additionalQueryParams)
            additionalHeaders(experimentInsertParams.additionalHeaders)
            additionalBodyProperties(experimentInsertParams.additionalBodyProperties)
        }

        /** Experiment id */
        fun experimentId(experimentId: String) = apply { this.experimentId = experimentId }

        /** A list of experiment events to insert */
        fun events(events: List<Event>) = apply {
            this.events.clear()
            this.events.addAll(events)
        }

        /** A list of experiment events to insert */
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

        fun build(): ExperimentInsertParams =
            ExperimentInsertParams(
                checkNotNull(experimentId) { "`experimentId` is required but was not set" },
                checkNotNull(events) { "`events` is required but was not set" }.toImmutable(),
                additionalQueryParams.mapValues { it.value.toImmutable() }.toImmutable(),
                additionalHeaders.mapValues { it.value.toImmutable() }.toImmutable(),
                additionalBodyProperties.toImmutable(),
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

            return /* spotless:off */ other is Event && this.insertExperimentEventReplace == other.insertExperimentEventReplace && this.insertExperimentEventMerge == other.insertExperimentEventMerge /* spotless:on */
        }

        override fun hashCode(): Int {
            return /* spotless:off */ Objects.hash(insertExperimentEventReplace, insertExperimentEventMerge) /* spotless:on */
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
