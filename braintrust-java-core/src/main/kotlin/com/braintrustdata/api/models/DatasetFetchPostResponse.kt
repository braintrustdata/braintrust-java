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
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = DatasetFetchPostResponse.Builder::class)
@NoAutoDetect
class DatasetFetchPostResponse
private constructor(
    private val events: JsonField<List<Event>>,
    private val cursor: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** A list of fetched events */
    fun events(): List<Event> = events.getRequired("events")

    /**
     * Pagination cursor
     *
     * Pass this string directly as the `cursor` param to your next fetch request to get the next
     * page of results. Not provided if the returned result set is empty.
     */
    fun cursor(): Optional<String> = Optional.ofNullable(cursor.getNullable("cursor"))

    /** A list of fetched events */
    @JsonProperty("events") @ExcludeMissing fun _events() = events

    /**
     * Pagination cursor
     *
     * Pass this string directly as the `cursor` param to your next fetch request to get the next
     * page of results. Not provided if the returned result set is empty.
     */
    @JsonProperty("cursor") @ExcludeMissing fun _cursor() = cursor

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): DatasetFetchPostResponse = apply {
        if (!validated) {
            events().forEach { it.validate() }
            cursor()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DatasetFetchPostResponse &&
            this.events == other.events &&
            this.cursor == other.cursor &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    events,
                    cursor,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "DatasetFetchPostResponse{events=$events, cursor=$cursor, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var events: JsonField<List<Event>> = JsonMissing.of()
        private var cursor: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(datasetFetchPostResponse: DatasetFetchPostResponse) = apply {
            this.events = datasetFetchPostResponse.events
            this.cursor = datasetFetchPostResponse.cursor
            additionalProperties(datasetFetchPostResponse.additionalProperties)
        }

        /** A list of fetched events */
        fun events(events: List<Event>) = events(JsonField.of(events))

        /** A list of fetched events */
        @JsonProperty("events")
        @ExcludeMissing
        fun events(events: JsonField<List<Event>>) = apply { this.events = events }

        /**
         * Pagination cursor
         *
         * Pass this string directly as the `cursor` param to your next fetch request to get the
         * next page of results. Not provided if the returned result set is empty.
         */
        fun cursor(cursor: String) = cursor(JsonField.of(cursor))

        /**
         * Pagination cursor
         *
         * Pass this string directly as the `cursor` param to your next fetch request to get the
         * next page of results. Not provided if the returned result set is empty.
         */
        @JsonProperty("cursor")
        @ExcludeMissing
        fun cursor(cursor: JsonField<String>) = apply { this.cursor = cursor }

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

        fun build(): DatasetFetchPostResponse =
            DatasetFetchPostResponse(
                events.map { it.toUnmodifiable() },
                cursor,
                additionalProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(builder = Event.Builder::class)
    @NoAutoDetect
    class Event
    private constructor(
        private val id: JsonField<String>,
        private val _xactId: JsonField<String>,
        private val created: JsonField<OffsetDateTime>,
        private val projectId: JsonField<String>,
        private val datasetId: JsonField<String>,
        private val input: JsonValue,
        private val expected: JsonValue,
        private val metadata: JsonField<Metadata>,
        private val tags: JsonField<List<String>>,
        private val spanId: JsonField<String>,
        private val rootSpanId: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /**
         * A unique identifier for the dataset event. If you don't provide one, BrainTrust will
         * generate one for you
         */
        fun id(): String = id.getRequired("id")

        /**
         * The transaction id of an event is unique to the network operation that processed the
         * event insertion. Transaction ids are monotonically increasing over time and can be used
         * to retrieve a versioned snapshot of the dataset (see the `version` parameter)
         */
        fun _xactId(): String = _xactId.getRequired("_xact_id")

        /** The timestamp the dataset event was created */
        fun created(): OffsetDateTime = created.getRequired("created")

        /** Unique identifier for the project that the dataset belongs under */
        fun projectId(): Optional<String> = Optional.ofNullable(projectId.getNullable("project_id"))

        /** Unique identifier for the dataset */
        fun datasetId(): String = datasetId.getRequired("dataset_id")

        /**
         * The argument that uniquely define an input case (an arbitrary, JSON serializable object)
         */
        fun input(): JsonValue = input

        /**
         * The output of your application, including post-processing (an arbitrary, JSON
         * serializable object)
         */
        fun expected(): JsonValue = expected

        /**
         * A dictionary with additional data about the test example, model outputs, or just about
         * anything else that's relevant, that you can use to help find and analyze examples later.
         * For example, you could log the `prompt`, example's `id`, or anything else that would be
         * useful to slice/dice later. The values in `metadata` can be any JSON-serializable type,
         * but its keys must be strings
         */
        fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata.getNullable("metadata"))

        /** A list of tags to log */
        fun tags(): Optional<List<String>> = Optional.ofNullable(tags.getNullable("tags"))

        /**
         * A unique identifier used to link different dataset events together as part of a full
         * trace. See the [tracing guide](https://www.braintrust.dev/docs/guides/tracing) for full
         * details on tracing
         */
        fun spanId(): String = spanId.getRequired("span_id")

        /** The `span_id` of the root of the trace this dataset event belongs to */
        fun rootSpanId(): String = rootSpanId.getRequired("root_span_id")

        /**
         * A unique identifier for the dataset event. If you don't provide one, BrainTrust will
         * generate one for you
         */
        @JsonProperty("id") @ExcludeMissing fun _id() = id

        /**
         * The transaction id of an event is unique to the network operation that processed the
         * event insertion. Transaction ids are monotonically increasing over time and can be used
         * to retrieve a versioned snapshot of the dataset (see the `version` parameter)
         */
        @JsonProperty("_xact_id") @ExcludeMissing fun __xactId() = _xactId

        /** The timestamp the dataset event was created */
        @JsonProperty("created") @ExcludeMissing fun _created() = created

        /** Unique identifier for the project that the dataset belongs under */
        @JsonProperty("project_id") @ExcludeMissing fun _projectId() = projectId

        /** Unique identifier for the dataset */
        @JsonProperty("dataset_id") @ExcludeMissing fun _datasetId() = datasetId

        /**
         * The argument that uniquely define an input case (an arbitrary, JSON serializable object)
         */
        @JsonProperty("input") @ExcludeMissing fun _input() = input

        /**
         * The output of your application, including post-processing (an arbitrary, JSON
         * serializable object)
         */
        @JsonProperty("expected") @ExcludeMissing fun _expected() = expected

        /**
         * A dictionary with additional data about the test example, model outputs, or just about
         * anything else that's relevant, that you can use to help find and analyze examples later.
         * For example, you could log the `prompt`, example's `id`, or anything else that would be
         * useful to slice/dice later. The values in `metadata` can be any JSON-serializable type,
         * but its keys must be strings
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata() = metadata

        /** A list of tags to log */
        @JsonProperty("tags") @ExcludeMissing fun _tags() = tags

        /**
         * A unique identifier used to link different dataset events together as part of a full
         * trace. See the [tracing guide](https://www.braintrust.dev/docs/guides/tracing) for full
         * details on tracing
         */
        @JsonProperty("span_id") @ExcludeMissing fun _spanId() = spanId

        /** The `span_id` of the root of the trace this dataset event belongs to */
        @JsonProperty("root_span_id") @ExcludeMissing fun _rootSpanId() = rootSpanId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Event = apply {
            if (!validated) {
                id()
                _xactId()
                created()
                projectId()
                datasetId()
                input()
                expected()
                metadata().map { it.validate() }
                tags()
                spanId()
                rootSpanId()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Event &&
                this.id == other.id &&
                this._xactId == other._xactId &&
                this.created == other.created &&
                this.projectId == other.projectId &&
                this.datasetId == other.datasetId &&
                this.input == other.input &&
                this.expected == other.expected &&
                this.metadata == other.metadata &&
                this.tags == other.tags &&
                this.spanId == other.spanId &&
                this.rootSpanId == other.rootSpanId &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        id,
                        _xactId,
                        created,
                        projectId,
                        datasetId,
                        input,
                        expected,
                        metadata,
                        tags,
                        spanId,
                        rootSpanId,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Event{id=$id, _xactId=$_xactId, created=$created, projectId=$projectId, datasetId=$datasetId, input=$input, expected=$expected, metadata=$metadata, tags=$tags, spanId=$spanId, rootSpanId=$rootSpanId, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var id: JsonField<String> = JsonMissing.of()
            private var _xactId: JsonField<String> = JsonMissing.of()
            private var created: JsonField<OffsetDateTime> = JsonMissing.of()
            private var projectId: JsonField<String> = JsonMissing.of()
            private var datasetId: JsonField<String> = JsonMissing.of()
            private var input: JsonValue = JsonMissing.of()
            private var expected: JsonValue = JsonMissing.of()
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var tags: JsonField<List<String>> = JsonMissing.of()
            private var spanId: JsonField<String> = JsonMissing.of()
            private var rootSpanId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(event: Event) = apply {
                this.id = event.id
                this._xactId = event._xactId
                this.created = event.created
                this.projectId = event.projectId
                this.datasetId = event.datasetId
                this.input = event.input
                this.expected = event.expected
                this.metadata = event.metadata
                this.tags = event.tags
                this.spanId = event.spanId
                this.rootSpanId = event.rootSpanId
                additionalProperties(event.additionalProperties)
            }

            /**
             * A unique identifier for the dataset event. If you don't provide one, BrainTrust will
             * generate one for you
             */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * A unique identifier for the dataset event. If you don't provide one, BrainTrust will
             * generate one for you
             */
            @JsonProperty("id")
            @ExcludeMissing
            fun id(id: JsonField<String>) = apply { this.id = id }

            /**
             * The transaction id of an event is unique to the network operation that processed the
             * event insertion. Transaction ids are monotonically increasing over time and can be
             * used to retrieve a versioned snapshot of the dataset (see the `version` parameter)
             */
            fun _xactId(_xactId: String) = _xactId(JsonField.of(_xactId))

            /**
             * The transaction id of an event is unique to the network operation that processed the
             * event insertion. Transaction ids are monotonically increasing over time and can be
             * used to retrieve a versioned snapshot of the dataset (see the `version` parameter)
             */
            @JsonProperty("_xact_id")
            @ExcludeMissing
            fun _xactId(_xactId: JsonField<String>) = apply { this._xactId = _xactId }

            /** The timestamp the dataset event was created */
            fun created(created: OffsetDateTime) = created(JsonField.of(created))

            /** The timestamp the dataset event was created */
            @JsonProperty("created")
            @ExcludeMissing
            fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

            /** Unique identifier for the project that the dataset belongs under */
            fun projectId(projectId: String) = projectId(JsonField.of(projectId))

            /** Unique identifier for the project that the dataset belongs under */
            @JsonProperty("project_id")
            @ExcludeMissing
            fun projectId(projectId: JsonField<String>) = apply { this.projectId = projectId }

            /** Unique identifier for the dataset */
            fun datasetId(datasetId: String) = datasetId(JsonField.of(datasetId))

            /** Unique identifier for the dataset */
            @JsonProperty("dataset_id")
            @ExcludeMissing
            fun datasetId(datasetId: JsonField<String>) = apply { this.datasetId = datasetId }

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
             * examples later. For example, you could log the `prompt`, example's `id`, or anything
             * else that would be useful to slice/dice later. The values in `metadata` can be any
             * JSON-serializable type, but its keys must be strings
             */
            fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

            /**
             * A dictionary with additional data about the test example, model outputs, or just
             * about anything else that's relevant, that you can use to help find and analyze
             * examples later. For example, you could log the `prompt`, example's `id`, or anything
             * else that would be useful to slice/dice later. The values in `metadata` can be any
             * JSON-serializable type, but its keys must be strings
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
             * A unique identifier used to link different dataset events together as part of a full
             * trace. See the [tracing guide](https://www.braintrust.dev/docs/guides/tracing) for
             * full details on tracing
             */
            fun spanId(spanId: String) = spanId(JsonField.of(spanId))

            /**
             * A unique identifier used to link different dataset events together as part of a full
             * trace. See the [tracing guide](https://www.braintrust.dev/docs/guides/tracing) for
             * full details on tracing
             */
            @JsonProperty("span_id")
            @ExcludeMissing
            fun spanId(spanId: JsonField<String>) = apply { this.spanId = spanId }

            /** The `span_id` of the root of the trace this dataset event belongs to */
            fun rootSpanId(rootSpanId: String) = rootSpanId(JsonField.of(rootSpanId))

            /** The `span_id` of the root of the trace this dataset event belongs to */
            @JsonProperty("root_span_id")
            @ExcludeMissing
            fun rootSpanId(rootSpanId: JsonField<String>) = apply { this.rootSpanId = rootSpanId }

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

            fun build(): Event =
                Event(
                    id,
                    _xactId,
                    created,
                    projectId,
                    datasetId,
                    input,
                    expected,
                    metadata,
                    tags.map { it.toUnmodifiable() },
                    spanId,
                    rootSpanId,
                    additionalProperties.toUnmodifiable(),
                )
        }

        /**
         * A dictionary with additional data about the test example, model outputs, or just about
         * anything else that's relevant, that you can use to help find and analyze examples later.
         * For example, you could log the `prompt`, example's `id`, or anything else that would be
         * useful to slice/dice later. The values in `metadata` can be any JSON-serializable type,
         * but its keys must be strings
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

                return other is Metadata && this.additionalProperties == other.additionalProperties
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
