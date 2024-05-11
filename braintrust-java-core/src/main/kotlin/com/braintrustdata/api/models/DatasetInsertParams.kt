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

        @JsonDeserialize(builder = InsertDatasetEventReplace.Builder::class)
        @NoAutoDetect
        class InsertDatasetEventReplace
        private constructor(
            private val input: JsonValue,
            private val expected: JsonValue,
            private val metadata: JsonField<Metadata>,
            private val tags: JsonField<List<String>>,
            private val id: JsonField<String>,
            private val _objectDelete: JsonField<Boolean>,
            private val _isMerge: JsonField<Boolean>,
            private val _parentId: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /**
             * The argument that uniquely define an input case (an arbitrary, JSON serializable
             * object)
             */
            fun input(): JsonValue = input

            /**
             * The output of your application, including post-processing (an arbitrary, JSON
             * serializable object)
             */
            fun expected(): JsonValue = expected

            /**
             * A dictionary with additional data about the test example, model outputs, or just
             * about anything else that's relevant, that you can use to help find and analyze
             * examples later. For example, you could log the `prompt`, example's `id`, or anything
             * else that would be useful to slice/dice later. The values in `metadata` can be any
             * JSON-serializable type, but its keys must be strings
             */
            fun metadata(): Optional<Metadata> =
                Optional.ofNullable(metadata.getNullable("metadata"))

            /** A list of tags to log */
            fun tags(): Optional<List<String>> = Optional.ofNullable(tags.getNullable("tags"))

            /**
             * A unique identifier for the dataset event. If you don't provide one, BrainTrust will
             * generate one for you
             */
            fun id(): Optional<String> = Optional.ofNullable(id.getNullable("id"))

            /**
             * Pass `_object_delete=true` to mark the dataset event deleted. Deleted events will not
             * show up in subsequent fetches for this dataset
             */
            fun _objectDelete(): Optional<Boolean> =
                Optional.ofNullable(_objectDelete.getNullable("_object_delete"))

            /**
             * The `_is_merge` field controls how the row is merged with any existing row with the
             * same id in the DB. By default (or when set to `false`), the existing row is
             * completely replaced by the new row. When set to `true`, the new row is deep-merged
             * into the existing row
             *
             * For example, say there is an existing row in the DB `{"id": "foo", "input": {"a": 5,
             * "b": 10}}`. If we merge a new row as `{"_is_merge": true, "id": "foo", "input": {"b":
             * 11, "c": 20}}`, the new row will be `{"id": "foo", "input": {"a": 5, "b": 11, "c":
             * 20}}`. If we replace the new row as `{"id": "foo", "input": {"b": 11, "c": 20}}`, the
             * new row will be `{"id": "foo", "input": {"b": 11, "c": 20}}`
             */
            fun _isMerge(): Optional<Boolean> =
                Optional.ofNullable(_isMerge.getNullable("_is_merge"))

            /**
             * Use the `_parent_id` field to create this row as a subspan of an existing row. It
             * cannot be specified alongside `_is_merge=true`. Tracking hierarchical relationships
             * are important for tracing (see the
             * [guide](https://www.braintrustdata.com/docs/guides/tracing) for full details).
             *
             * For example, say we have logged a row `{"id": "abc", "input": "foo", "output": "bar",
             * "expected": "boo", "scores": {"correctness": 0.33}}`. We can create a sub-span of the
             * parent row by logging `{"_parent_id": "abc", "id": "llm_call", "input": {"prompt":
             * "What comes after foo?"}, "output": "bar", "metrics": {"tokens": 1}}`. In the webapp,
             * only the root span row `"abc"` will show up in the summary view. You can view the
             * full trace hierarchy (in this case, the `"llm_call"` row) by clicking on the "abc"
             * row.
             */
            fun _parentId(): Optional<String> =
                Optional.ofNullable(_parentId.getNullable("_parent_id"))

            /**
             * The argument that uniquely define an input case (an arbitrary, JSON serializable
             * object)
             */
            @JsonProperty("input") @ExcludeMissing fun _input() = input

            /**
             * The output of your application, including post-processing (an arbitrary, JSON
             * serializable object)
             */
            @JsonProperty("expected") @ExcludeMissing fun _expected() = expected

            /**
             * A dictionary with additional data about the test example, model outputs, or just
             * about anything else that's relevant, that you can use to help find and analyze
             * examples later. For example, you could log the `prompt`, example's `id`, or anything
             * else that would be useful to slice/dice later. The values in `metadata` can be any
             * JSON-serializable type, but its keys must be strings
             */
            @JsonProperty("metadata") @ExcludeMissing fun _metadata() = metadata

            /** A list of tags to log */
            @JsonProperty("tags") @ExcludeMissing fun _tags() = tags

            /**
             * A unique identifier for the dataset event. If you don't provide one, BrainTrust will
             * generate one for you
             */
            @JsonProperty("id") @ExcludeMissing fun _id() = id

            /**
             * Pass `_object_delete=true` to mark the dataset event deleted. Deleted events will not
             * show up in subsequent fetches for this dataset
             */
            @JsonProperty("_object_delete") @ExcludeMissing fun __objectDelete() = _objectDelete

            /**
             * The `_is_merge` field controls how the row is merged with any existing row with the
             * same id in the DB. By default (or when set to `false`), the existing row is
             * completely replaced by the new row. When set to `true`, the new row is deep-merged
             * into the existing row
             *
             * For example, say there is an existing row in the DB `{"id": "foo", "input": {"a": 5,
             * "b": 10}}`. If we merge a new row as `{"_is_merge": true, "id": "foo", "input": {"b":
             * 11, "c": 20}}`, the new row will be `{"id": "foo", "input": {"a": 5, "b": 11, "c":
             * 20}}`. If we replace the new row as `{"id": "foo", "input": {"b": 11, "c": 20}}`, the
             * new row will be `{"id": "foo", "input": {"b": 11, "c": 20}}`
             */
            @JsonProperty("_is_merge") @ExcludeMissing fun __isMerge() = _isMerge

            /**
             * Use the `_parent_id` field to create this row as a subspan of an existing row. It
             * cannot be specified alongside `_is_merge=true`. Tracking hierarchical relationships
             * are important for tracing (see the
             * [guide](https://www.braintrustdata.com/docs/guides/tracing) for full details).
             *
             * For example, say we have logged a row `{"id": "abc", "input": "foo", "output": "bar",
             * "expected": "boo", "scores": {"correctness": 0.33}}`. We can create a sub-span of the
             * parent row by logging `{"_parent_id": "abc", "id": "llm_call", "input": {"prompt":
             * "What comes after foo?"}, "output": "bar", "metrics": {"tokens": 1}}`. In the webapp,
             * only the root span row `"abc"` will show up in the summary view. You can view the
             * full trace hierarchy (in this case, the `"llm_call"` row) by clicking on the "abc"
             * row.
             */
            @JsonProperty("_parent_id") @ExcludeMissing fun __parentId() = _parentId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): InsertDatasetEventReplace = apply {
                if (!validated) {
                    input()
                    expected()
                    metadata().map { it.validate() }
                    tags()
                    id()
                    _objectDelete()
                    _isMerge()
                    _parentId()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is InsertDatasetEventReplace &&
                    this.input == other.input &&
                    this.expected == other.expected &&
                    this.metadata == other.metadata &&
                    this.tags == other.tags &&
                    this.id == other.id &&
                    this._objectDelete == other._objectDelete &&
                    this._isMerge == other._isMerge &&
                    this._parentId == other._parentId &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            input,
                            expected,
                            metadata,
                            tags,
                            id,
                            _objectDelete,
                            _isMerge,
                            _parentId,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "InsertDatasetEventReplace{input=$input, expected=$expected, metadata=$metadata, tags=$tags, id=$id, _objectDelete=$_objectDelete, _isMerge=$_isMerge, _parentId=$_parentId, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var input: JsonValue = JsonMissing.of()
                private var expected: JsonValue = JsonMissing.of()
                private var metadata: JsonField<Metadata> = JsonMissing.of()
                private var tags: JsonField<List<String>> = JsonMissing.of()
                private var id: JsonField<String> = JsonMissing.of()
                private var _objectDelete: JsonField<Boolean> = JsonMissing.of()
                private var _isMerge: JsonField<Boolean> = JsonMissing.of()
                private var _parentId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(insertDatasetEventReplace: InsertDatasetEventReplace) = apply {
                    this.input = insertDatasetEventReplace.input
                    this.expected = insertDatasetEventReplace.expected
                    this.metadata = insertDatasetEventReplace.metadata
                    this.tags = insertDatasetEventReplace.tags
                    this.id = insertDatasetEventReplace.id
                    this._objectDelete = insertDatasetEventReplace._objectDelete
                    this._isMerge = insertDatasetEventReplace._isMerge
                    this._parentId = insertDatasetEventReplace._parentId
                    additionalProperties(insertDatasetEventReplace.additionalProperties)
                }

                /**
                 * The argument that uniquely define an input case (an arbitrary, JSON serializable
                 * object)
                 */
                @JsonProperty("input")
                @ExcludeMissing
                fun input(input: JsonValue) = apply { this.input = input }

                /**
                 * The output of your application, including post-processing (an arbitrary, JSON
                 * serializable object)
                 */
                @JsonProperty("expected")
                @ExcludeMissing
                fun expected(expected: JsonValue) = apply { this.expected = expected }

                /**
                 * A dictionary with additional data about the test example, model outputs, or just
                 * about anything else that's relevant, that you can use to help find and analyze
                 * examples later. For example, you could log the `prompt`, example's `id`, or
                 * anything else that would be useful to slice/dice later. The values in `metadata`
                 * can be any JSON-serializable type, but its keys must be strings
                 */
                fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

                /**
                 * A dictionary with additional data about the test example, model outputs, or just
                 * about anything else that's relevant, that you can use to help find and analyze
                 * examples later. For example, you could log the `prompt`, example's `id`, or
                 * anything else that would be useful to slice/dice later. The values in `metadata`
                 * can be any JSON-serializable type, but its keys must be strings
                 */
                @JsonProperty("metadata")
                @ExcludeMissing
                fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

                /** A list of tags to log */
                fun tags(tags: List<String>) = tags(JsonField.of(tags))

                /** A list of tags to log */
                @JsonProperty("tags")
                @ExcludeMissing
                fun tags(tags: JsonField<List<String>>) = apply { this.tags = tags }

                /**
                 * A unique identifier for the dataset event. If you don't provide one, BrainTrust
                 * will generate one for you
                 */
                fun id(id: String) = id(JsonField.of(id))

                /**
                 * A unique identifier for the dataset event. If you don't provide one, BrainTrust
                 * will generate one for you
                 */
                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                /**
                 * Pass `_object_delete=true` to mark the dataset event deleted. Deleted events will
                 * not show up in subsequent fetches for this dataset
                 */
                fun _objectDelete(_objectDelete: Boolean) =
                    _objectDelete(JsonField.of(_objectDelete))

                /**
                 * Pass `_object_delete=true` to mark the dataset event deleted. Deleted events will
                 * not show up in subsequent fetches for this dataset
                 */
                @JsonProperty("_object_delete")
                @ExcludeMissing
                fun _objectDelete(_objectDelete: JsonField<Boolean>) = apply {
                    this._objectDelete = _objectDelete
                }

                /**
                 * The `_is_merge` field controls how the row is merged with any existing row with
                 * the same id in the DB. By default (or when set to `false`), the existing row is
                 * completely replaced by the new row. When set to `true`, the new row is
                 * deep-merged into the existing row
                 *
                 * For example, say there is an existing row in the DB `{"id": "foo", "input": {"a":
                 * 5, "b": 10}}`. If we merge a new row as `{"_is_merge": true, "id": "foo",
                 * "input": {"b": 11, "c": 20}}`, the new row will be `{"id": "foo", "input": {"a":
                 * 5, "b": 11, "c": 20}}`. If we replace the new row as `{"id": "foo", "input":
                 * {"b": 11, "c": 20}}`, the new row will be `{"id": "foo", "input": {"b": 11, "c":
                 * 20}}`
                 */
                fun _isMerge(_isMerge: Boolean) = _isMerge(JsonField.of(_isMerge))

                /**
                 * The `_is_merge` field controls how the row is merged with any existing row with
                 * the same id in the DB. By default (or when set to `false`), the existing row is
                 * completely replaced by the new row. When set to `true`, the new row is
                 * deep-merged into the existing row
                 *
                 * For example, say there is an existing row in the DB `{"id": "foo", "input": {"a":
                 * 5, "b": 10}}`. If we merge a new row as `{"_is_merge": true, "id": "foo",
                 * "input": {"b": 11, "c": 20}}`, the new row will be `{"id": "foo", "input": {"a":
                 * 5, "b": 11, "c": 20}}`. If we replace the new row as `{"id": "foo", "input":
                 * {"b": 11, "c": 20}}`, the new row will be `{"id": "foo", "input": {"b": 11, "c":
                 * 20}}`
                 */
                @JsonProperty("_is_merge")
                @ExcludeMissing
                fun _isMerge(_isMerge: JsonField<Boolean>) = apply { this._isMerge = _isMerge }

                /**
                 * Use the `_parent_id` field to create this row as a subspan of an existing row. It
                 * cannot be specified alongside `_is_merge=true`. Tracking hierarchical
                 * relationships are important for tracing (see the
                 * [guide](https://www.braintrustdata.com/docs/guides/tracing) for full details).
                 *
                 * For example, say we have logged a row `{"id": "abc", "input": "foo", "output":
                 * "bar", "expected": "boo", "scores": {"correctness": 0.33}}`. We can create a
                 * sub-span of the parent row by logging `{"_parent_id": "abc", "id": "llm_call",
                 * "input": {"prompt": "What comes after foo?"}, "output": "bar", "metrics":
                 * {"tokens": 1}}`. In the webapp, only the root span row `"abc"` will show up in
                 * the summary view. You can view the full trace hierarchy (in this case, the
                 * `"llm_call"` row) by clicking on the "abc" row.
                 */
                fun _parentId(_parentId: String) = _parentId(JsonField.of(_parentId))

                /**
                 * Use the `_parent_id` field to create this row as a subspan of an existing row. It
                 * cannot be specified alongside `_is_merge=true`. Tracking hierarchical
                 * relationships are important for tracing (see the
                 * [guide](https://www.braintrustdata.com/docs/guides/tracing) for full details).
                 *
                 * For example, say we have logged a row `{"id": "abc", "input": "foo", "output":
                 * "bar", "expected": "boo", "scores": {"correctness": 0.33}}`. We can create a
                 * sub-span of the parent row by logging `{"_parent_id": "abc", "id": "llm_call",
                 * "input": {"prompt": "What comes after foo?"}, "output": "bar", "metrics":
                 * {"tokens": 1}}`. In the webapp, only the root span row `"abc"` will show up in
                 * the summary view. You can view the full trace hierarchy (in this case, the
                 * `"llm_call"` row) by clicking on the "abc" row.
                 */
                @JsonProperty("_parent_id")
                @ExcludeMissing
                fun _parentId(_parentId: JsonField<String>) = apply { this._parentId = _parentId }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): InsertDatasetEventReplace =
                    InsertDatasetEventReplace(
                        input,
                        expected,
                        metadata,
                        tags.map { it.toUnmodifiable() },
                        id,
                        _objectDelete,
                        _isMerge,
                        _parentId,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            /**
             * A dictionary with additional data about the test example, model outputs, or just
             * about anything else that's relevant, that you can use to help find and analyze
             * examples later. For example, you could log the `prompt`, example's `id`, or anything
             * else that would be useful to slice/dice later. The values in `metadata` can be any
             * JSON-serializable type, but its keys must be strings
             */
            @JsonDeserialize(builder = Metadata.Builder::class)
            @NoAutoDetect
            class Metadata
            private constructor(
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): Metadata = apply {
                    if (!validated) {
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Metadata &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = Objects.hash(additionalProperties)
                    }
                    return hashCode
                }

                override fun toString() = "Metadata{additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(metadata: Metadata) = apply {
                        additionalProperties(metadata.additionalProperties)
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): Metadata = Metadata(additionalProperties.toUnmodifiable())
                }
            }
        }

        @JsonDeserialize(builder = InsertDatasetEventMerge.Builder::class)
        @NoAutoDetect
        class InsertDatasetEventMerge
        private constructor(
            private val input: JsonValue,
            private val expected: JsonValue,
            private val metadata: JsonField<Metadata>,
            private val tags: JsonField<List<String>>,
            private val id: JsonField<String>,
            private val _objectDelete: JsonField<Boolean>,
            private val _isMerge: JsonField<Boolean>,
            private val _mergePaths: JsonField<List<List<String>>>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /**
             * The argument that uniquely define an input case (an arbitrary, JSON serializable
             * object)
             */
            fun input(): JsonValue = input

            /**
             * The output of your application, including post-processing (an arbitrary, JSON
             * serializable object)
             */
            fun expected(): JsonValue = expected

            /**
             * A dictionary with additional data about the test example, model outputs, or just
             * about anything else that's relevant, that you can use to help find and analyze
             * examples later. For example, you could log the `prompt`, example's `id`, or anything
             * else that would be useful to slice/dice later. The values in `metadata` can be any
             * JSON-serializable type, but its keys must be strings
             */
            fun metadata(): Optional<Metadata> =
                Optional.ofNullable(metadata.getNullable("metadata"))

            /** A list of tags to log */
            fun tags(): Optional<List<String>> = Optional.ofNullable(tags.getNullable("tags"))

            /**
             * A unique identifier for the dataset event. If you don't provide one, BrainTrust will
             * generate one for you
             */
            fun id(): Optional<String> = Optional.ofNullable(id.getNullable("id"))

            /**
             * Pass `_object_delete=true` to mark the dataset event deleted. Deleted events will not
             * show up in subsequent fetches for this dataset
             */
            fun _objectDelete(): Optional<Boolean> =
                Optional.ofNullable(_objectDelete.getNullable("_object_delete"))

            /**
             * The `_is_merge` field controls how the row is merged with any existing row with the
             * same id in the DB. By default (or when set to `false`), the existing row is
             * completely replaced by the new row. When set to `true`, the new row is deep-merged
             * into the existing row
             *
             * For example, say there is an existing row in the DB `{"id": "foo", "input": {"a": 5,
             * "b": 10}}`. If we merge a new row as `{"_is_merge": true, "id": "foo", "input": {"b":
             * 11, "c": 20}}`, the new row will be `{"id": "foo", "input": {"a": 5, "b": 11, "c":
             * 20}}`. If we replace the new row as `{"id": "foo", "input": {"b": 11, "c": 20}}`, the
             * new row will be `{"id": "foo", "input": {"b": 11, "c": 20}}`
             */
            fun _isMerge(): Boolean = _isMerge.getRequired("_is_merge")

            /**
             * The `_merge_paths` field allows controlling the depth of the merge. It can only be
             * specified alongside `_is_merge=true`. `_merge_paths` is a list of paths, where each
             * path is a list of field names. The deep merge will not descend below any of the
             * specified merge paths.
             *
             * For example, say there is an existing row in the DB `{"id": "foo", "input": {"a":
             * {"b": 10}, "c": {"d": 20}}, "output": {"a": 20}}`. If we merge a new row as
             * `{"_is_merge": true, "_merge_paths": [["input", "a"], ["output"]], "input": {"a":
             * {"q": 30}, "c": {"e": 30}, "bar": "baz"}, "output": {"d": 40}}`, the new row will be
             * `{"id": "foo": "input": {"a": {"q": 30}, "c": {"d": 20, "e": 30}, "bar": "baz"},
             * "output": {"d": 40}}`. In this case, due to the merge paths, we have replaced
             * `input.a` and `output`, but have still deep-merged `input` and `input.c`.
             */
            fun _mergePaths(): Optional<List<List<String>>> =
                Optional.ofNullable(_mergePaths.getNullable("_merge_paths"))

            /**
             * The argument that uniquely define an input case (an arbitrary, JSON serializable
             * object)
             */
            @JsonProperty("input") @ExcludeMissing fun _input() = input

            /**
             * The output of your application, including post-processing (an arbitrary, JSON
             * serializable object)
             */
            @JsonProperty("expected") @ExcludeMissing fun _expected() = expected

            /**
             * A dictionary with additional data about the test example, model outputs, or just
             * about anything else that's relevant, that you can use to help find and analyze
             * examples later. For example, you could log the `prompt`, example's `id`, or anything
             * else that would be useful to slice/dice later. The values in `metadata` can be any
             * JSON-serializable type, but its keys must be strings
             */
            @JsonProperty("metadata") @ExcludeMissing fun _metadata() = metadata

            /** A list of tags to log */
            @JsonProperty("tags") @ExcludeMissing fun _tags() = tags

            /**
             * A unique identifier for the dataset event. If you don't provide one, BrainTrust will
             * generate one for you
             */
            @JsonProperty("id") @ExcludeMissing fun _id() = id

            /**
             * Pass `_object_delete=true` to mark the dataset event deleted. Deleted events will not
             * show up in subsequent fetches for this dataset
             */
            @JsonProperty("_object_delete") @ExcludeMissing fun __objectDelete() = _objectDelete

            /**
             * The `_is_merge` field controls how the row is merged with any existing row with the
             * same id in the DB. By default (or when set to `false`), the existing row is
             * completely replaced by the new row. When set to `true`, the new row is deep-merged
             * into the existing row
             *
             * For example, say there is an existing row in the DB `{"id": "foo", "input": {"a": 5,
             * "b": 10}}`. If we merge a new row as `{"_is_merge": true, "id": "foo", "input": {"b":
             * 11, "c": 20}}`, the new row will be `{"id": "foo", "input": {"a": 5, "b": 11, "c":
             * 20}}`. If we replace the new row as `{"id": "foo", "input": {"b": 11, "c": 20}}`, the
             * new row will be `{"id": "foo", "input": {"b": 11, "c": 20}}`
             */
            @JsonProperty("_is_merge") @ExcludeMissing fun __isMerge() = _isMerge

            /**
             * The `_merge_paths` field allows controlling the depth of the merge. It can only be
             * specified alongside `_is_merge=true`. `_merge_paths` is a list of paths, where each
             * path is a list of field names. The deep merge will not descend below any of the
             * specified merge paths.
             *
             * For example, say there is an existing row in the DB `{"id": "foo", "input": {"a":
             * {"b": 10}, "c": {"d": 20}}, "output": {"a": 20}}`. If we merge a new row as
             * `{"_is_merge": true, "_merge_paths": [["input", "a"], ["output"]], "input": {"a":
             * {"q": 30}, "c": {"e": 30}, "bar": "baz"}, "output": {"d": 40}}`, the new row will be
             * `{"id": "foo": "input": {"a": {"q": 30}, "c": {"d": 20, "e": 30}, "bar": "baz"},
             * "output": {"d": 40}}`. In this case, due to the merge paths, we have replaced
             * `input.a` and `output`, but have still deep-merged `input` and `input.c`.
             */
            @JsonProperty("_merge_paths") @ExcludeMissing fun __mergePaths() = _mergePaths

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): InsertDatasetEventMerge = apply {
                if (!validated) {
                    input()
                    expected()
                    metadata().map { it.validate() }
                    tags()
                    id()
                    _objectDelete()
                    _isMerge()
                    _mergePaths()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is InsertDatasetEventMerge &&
                    this.input == other.input &&
                    this.expected == other.expected &&
                    this.metadata == other.metadata &&
                    this.tags == other.tags &&
                    this.id == other.id &&
                    this._objectDelete == other._objectDelete &&
                    this._isMerge == other._isMerge &&
                    this._mergePaths == other._mergePaths &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            input,
                            expected,
                            metadata,
                            tags,
                            id,
                            _objectDelete,
                            _isMerge,
                            _mergePaths,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "InsertDatasetEventMerge{input=$input, expected=$expected, metadata=$metadata, tags=$tags, id=$id, _objectDelete=$_objectDelete, _isMerge=$_isMerge, _mergePaths=$_mergePaths, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var input: JsonValue = JsonMissing.of()
                private var expected: JsonValue = JsonMissing.of()
                private var metadata: JsonField<Metadata> = JsonMissing.of()
                private var tags: JsonField<List<String>> = JsonMissing.of()
                private var id: JsonField<String> = JsonMissing.of()
                private var _objectDelete: JsonField<Boolean> = JsonMissing.of()
                private var _isMerge: JsonField<Boolean> = JsonMissing.of()
                private var _mergePaths: JsonField<List<List<String>>> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(insertDatasetEventMerge: InsertDatasetEventMerge) = apply {
                    this.input = insertDatasetEventMerge.input
                    this.expected = insertDatasetEventMerge.expected
                    this.metadata = insertDatasetEventMerge.metadata
                    this.tags = insertDatasetEventMerge.tags
                    this.id = insertDatasetEventMerge.id
                    this._objectDelete = insertDatasetEventMerge._objectDelete
                    this._isMerge = insertDatasetEventMerge._isMerge
                    this._mergePaths = insertDatasetEventMerge._mergePaths
                    additionalProperties(insertDatasetEventMerge.additionalProperties)
                }

                /**
                 * The argument that uniquely define an input case (an arbitrary, JSON serializable
                 * object)
                 */
                @JsonProperty("input")
                @ExcludeMissing
                fun input(input: JsonValue) = apply { this.input = input }

                /**
                 * The output of your application, including post-processing (an arbitrary, JSON
                 * serializable object)
                 */
                @JsonProperty("expected")
                @ExcludeMissing
                fun expected(expected: JsonValue) = apply { this.expected = expected }

                /**
                 * A dictionary with additional data about the test example, model outputs, or just
                 * about anything else that's relevant, that you can use to help find and analyze
                 * examples later. For example, you could log the `prompt`, example's `id`, or
                 * anything else that would be useful to slice/dice later. The values in `metadata`
                 * can be any JSON-serializable type, but its keys must be strings
                 */
                fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

                /**
                 * A dictionary with additional data about the test example, model outputs, or just
                 * about anything else that's relevant, that you can use to help find and analyze
                 * examples later. For example, you could log the `prompt`, example's `id`, or
                 * anything else that would be useful to slice/dice later. The values in `metadata`
                 * can be any JSON-serializable type, but its keys must be strings
                 */
                @JsonProperty("metadata")
                @ExcludeMissing
                fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

                /** A list of tags to log */
                fun tags(tags: List<String>) = tags(JsonField.of(tags))

                /** A list of tags to log */
                @JsonProperty("tags")
                @ExcludeMissing
                fun tags(tags: JsonField<List<String>>) = apply { this.tags = tags }

                /**
                 * A unique identifier for the dataset event. If you don't provide one, BrainTrust
                 * will generate one for you
                 */
                fun id(id: String) = id(JsonField.of(id))

                /**
                 * A unique identifier for the dataset event. If you don't provide one, BrainTrust
                 * will generate one for you
                 */
                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                /**
                 * Pass `_object_delete=true` to mark the dataset event deleted. Deleted events will
                 * not show up in subsequent fetches for this dataset
                 */
                fun _objectDelete(_objectDelete: Boolean) =
                    _objectDelete(JsonField.of(_objectDelete))

                /**
                 * Pass `_object_delete=true` to mark the dataset event deleted. Deleted events will
                 * not show up in subsequent fetches for this dataset
                 */
                @JsonProperty("_object_delete")
                @ExcludeMissing
                fun _objectDelete(_objectDelete: JsonField<Boolean>) = apply {
                    this._objectDelete = _objectDelete
                }

                /**
                 * The `_is_merge` field controls how the row is merged with any existing row with
                 * the same id in the DB. By default (or when set to `false`), the existing row is
                 * completely replaced by the new row. When set to `true`, the new row is
                 * deep-merged into the existing row
                 *
                 * For example, say there is an existing row in the DB `{"id": "foo", "input": {"a":
                 * 5, "b": 10}}`. If we merge a new row as `{"_is_merge": true, "id": "foo",
                 * "input": {"b": 11, "c": 20}}`, the new row will be `{"id": "foo", "input": {"a":
                 * 5, "b": 11, "c": 20}}`. If we replace the new row as `{"id": "foo", "input":
                 * {"b": 11, "c": 20}}`, the new row will be `{"id": "foo", "input": {"b": 11, "c":
                 * 20}}`
                 */
                fun _isMerge(_isMerge: Boolean) = _isMerge(JsonField.of(_isMerge))

                /**
                 * The `_is_merge` field controls how the row is merged with any existing row with
                 * the same id in the DB. By default (or when set to `false`), the existing row is
                 * completely replaced by the new row. When set to `true`, the new row is
                 * deep-merged into the existing row
                 *
                 * For example, say there is an existing row in the DB `{"id": "foo", "input": {"a":
                 * 5, "b": 10}}`. If we merge a new row as `{"_is_merge": true, "id": "foo",
                 * "input": {"b": 11, "c": 20}}`, the new row will be `{"id": "foo", "input": {"a":
                 * 5, "b": 11, "c": 20}}`. If we replace the new row as `{"id": "foo", "input":
                 * {"b": 11, "c": 20}}`, the new row will be `{"id": "foo", "input": {"b": 11, "c":
                 * 20}}`
                 */
                @JsonProperty("_is_merge")
                @ExcludeMissing
                fun _isMerge(_isMerge: JsonField<Boolean>) = apply { this._isMerge = _isMerge }

                /**
                 * The `_merge_paths` field allows controlling the depth of the merge. It can only
                 * be specified alongside `_is_merge=true`. `_merge_paths` is a list of paths, where
                 * each path is a list of field names. The deep merge will not descend below any of
                 * the specified merge paths.
                 *
                 * For example, say there is an existing row in the DB `{"id": "foo", "input": {"a":
                 * {"b": 10}, "c": {"d": 20}}, "output": {"a": 20}}`. If we merge a new row as
                 * `{"_is_merge": true, "_merge_paths": [["input", "a"], ["output"]], "input": {"a":
                 * {"q": 30}, "c": {"e": 30}, "bar": "baz"}, "output": {"d": 40}}`, the new row will
                 * be `{"id": "foo": "input": {"a": {"q": 30}, "c": {"d": 20, "e": 30}, "bar":
                 * "baz"}, "output": {"d": 40}}`. In this case, due to the merge paths, we have
                 * replaced `input.a` and `output`, but have still deep-merged `input` and
                 * `input.c`.
                 */
                fun _mergePaths(_mergePaths: List<List<String>>) =
                    _mergePaths(JsonField.of(_mergePaths))

                /**
                 * The `_merge_paths` field allows controlling the depth of the merge. It can only
                 * be specified alongside `_is_merge=true`. `_merge_paths` is a list of paths, where
                 * each path is a list of field names. The deep merge will not descend below any of
                 * the specified merge paths.
                 *
                 * For example, say there is an existing row in the DB `{"id": "foo", "input": {"a":
                 * {"b": 10}, "c": {"d": 20}}, "output": {"a": 20}}`. If we merge a new row as
                 * `{"_is_merge": true, "_merge_paths": [["input", "a"], ["output"]], "input": {"a":
                 * {"q": 30}, "c": {"e": 30}, "bar": "baz"}, "output": {"d": 40}}`, the new row will
                 * be `{"id": "foo": "input": {"a": {"q": 30}, "c": {"d": 20, "e": 30}, "bar":
                 * "baz"}, "output": {"d": 40}}`. In this case, due to the merge paths, we have
                 * replaced `input.a` and `output`, but have still deep-merged `input` and
                 * `input.c`.
                 */
                @JsonProperty("_merge_paths")
                @ExcludeMissing
                fun _mergePaths(_mergePaths: JsonField<List<List<String>>>) = apply {
                    this._mergePaths = _mergePaths
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): InsertDatasetEventMerge =
                    InsertDatasetEventMerge(
                        input,
                        expected,
                        metadata,
                        tags.map { it.toUnmodifiable() },
                        id,
                        _objectDelete,
                        _isMerge,
                        _mergePaths.map { it.toUnmodifiable() },
                        additionalProperties.toUnmodifiable(),
                    )
            }

            /**
             * A dictionary with additional data about the test example, model outputs, or just
             * about anything else that's relevant, that you can use to help find and analyze
             * examples later. For example, you could log the `prompt`, example's `id`, or anything
             * else that would be useful to slice/dice later. The values in `metadata` can be any
             * JSON-serializable type, but its keys must be strings
             */
            @JsonDeserialize(builder = Metadata.Builder::class)
            @NoAutoDetect
            class Metadata
            private constructor(
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): Metadata = apply {
                    if (!validated) {
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Metadata &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = Objects.hash(additionalProperties)
                    }
                    return hashCode
                }

                override fun toString() = "Metadata{additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(metadata: Metadata) = apply {
                        additionalProperties(metadata.additionalProperties)
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): Metadata = Metadata(additionalProperties.toUnmodifiable())
                }
            }
        }
    }
}
