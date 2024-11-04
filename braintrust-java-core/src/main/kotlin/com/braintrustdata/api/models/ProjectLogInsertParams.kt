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
import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import java.util.Objects
import java.util.Optional

class ProjectLogInsertParams
constructor(
    private val projectId: String,
    private val events: List<Event>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun projectId(): String = projectId

    fun events(): List<Event> = events

    @JvmSynthetic
    internal fun getBody(): ProjectLogInsertBody {
        return ProjectLogInsertBody(events, additionalBodyProperties)
    }

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> projectId
            else -> ""
        }
    }

    @JsonDeserialize(builder = ProjectLogInsertBody.Builder::class)
    @NoAutoDetect
    class ProjectLogInsertBody
    internal constructor(
        private val events: List<Event>?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** A list of project logs events to insert */
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
            internal fun from(projectLogInsertBody: ProjectLogInsertBody) = apply {
                this.events = projectLogInsertBody.events
                additionalProperties(projectLogInsertBody.additionalProperties)
            }

            /** A list of project logs events to insert */
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

            fun build(): ProjectLogInsertBody =
                ProjectLogInsertBody(
                    checkNotNull(events) { "`events` is required but was not set" }.toImmutable(),
                    additionalProperties.toImmutable()
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ProjectLogInsertBody && this.events == other.events && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(events, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "ProjectLogInsertBody{events=$events, additionalProperties=$additionalProperties}"
    }

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ProjectLogInsertParams && this.projectId == other.projectId && this.events == other.events && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(projectId, events, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "ProjectLogInsertParams{projectId=$projectId, events=$events, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var projectId: String? = null
        private var events: MutableList<Event> = mutableListOf()
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(projectLogInsertParams: ProjectLogInsertParams) = apply {
            this.projectId = projectLogInsertParams.projectId
            this.events(projectLogInsertParams.events)
            additionalHeaders(projectLogInsertParams.additionalHeaders)
            additionalQueryParams(projectLogInsertParams.additionalQueryParams)
            additionalBodyProperties(projectLogInsertParams.additionalBodyProperties)
        }

        /** Project id */
        fun projectId(projectId: String) = apply { this.projectId = projectId }

        /** A list of project logs events to insert */
        fun events(events: List<Event>) = apply {
            this.events.clear()
            this.events.addAll(events)
        }

        /** A list of project logs events to insert */
        fun addEvent(event: Event) = apply { this.events.add(event) }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.putAll(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(::putAdditionalHeaders)
        }

        fun removeAdditionalHeader(name: String) = apply { additionalHeaders.removeAll(name) }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.putAll(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                additionalQueryParams.forEach(::putAdditionalQueryParams)
            }

        fun removeAdditionalQueryParam(key: String) = apply { additionalQueryParams.removeAll(key) }

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

        fun build(): ProjectLogInsertParams =
            ProjectLogInsertParams(
                checkNotNull(projectId) { "`projectId` is required but was not set" },
                checkNotNull(events) { "`events` is required but was not set" }.toImmutable(),
                additionalHeaders
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalQueryParams
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalBodyProperties.toImmutable(),
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

            return /* spotless:off */ other is Event && this.insertProjectLogsEventReplace == other.insertProjectLogsEventReplace && this.insertProjectLogsEventMerge == other.insertProjectLogsEventMerge /* spotless:on */
        }

        override fun hashCode(): Int {
            return /* spotless:off */ Objects.hash(insertProjectLogsEventReplace, insertProjectLogsEventMerge) /* spotless:on */
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
