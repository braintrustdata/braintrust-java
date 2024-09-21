// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.Enum
import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.toUnmodifiable
import com.braintrustdata.api.errors.BraintrustInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = ExperimentFetchPostResponse.Builder::class)
@NoAutoDetect
class ExperimentFetchPostResponse
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

    fun validate(): ExperimentFetchPostResponse = apply {
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

        return other is ExperimentFetchPostResponse &&
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
        "ExperimentFetchPostResponse{events=$events, cursor=$cursor, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var events: JsonField<List<Event>> = JsonMissing.of()
        private var cursor: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(experimentFetchPostResponse: ExperimentFetchPostResponse) = apply {
            this.events = experimentFetchPostResponse.events
            this.cursor = experimentFetchPostResponse.cursor
            additionalProperties(experimentFetchPostResponse.additionalProperties)
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

        fun build(): ExperimentFetchPostResponse =
            ExperimentFetchPostResponse(
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
        private val datasetRecordId: JsonField<String>,
        private val _xactId: JsonField<String>,
        private val created: JsonField<OffsetDateTime>,
        private val projectId: JsonField<String>,
        private val experimentId: JsonField<String>,
        private val input: JsonValue,
        private val output: JsonValue,
        private val expected: JsonValue,
        private val scores: JsonField<Scores>,
        private val metadata: JsonField<Metadata>,
        private val tags: JsonField<List<String>>,
        private val metrics: JsonField<Metrics>,
        private val context: JsonField<Context>,
        private val spanId: JsonField<String>,
        private val spanParents: JsonField<List<String>>,
        private val rootSpanId: JsonField<String>,
        private val spanAttributes: JsonField<SpanAttributes>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /**
         * A unique identifier for the experiment event. If you don't provide one, BrainTrust will
         * generate one for you
         */
        fun id(): String = id.getRequired("id")

        /**
         * If the experiment is associated to a dataset, this is the event-level dataset id this
         * experiment event is tied to
         */
        fun datasetRecordId(): Optional<String> =
            Optional.ofNullable(datasetRecordId.getNullable("dataset_record_id"))

        /**
         * The transaction id of an event is unique to the network operation that processed the
         * event insertion. Transaction ids are monotonically increasing over time and can be used
         * to retrieve a versioned snapshot of the experiment (see the `version` parameter)
         */
        fun _xactId(): String = _xactId.getRequired("_xact_id")

        /** The timestamp the experiment event was created */
        fun created(): OffsetDateTime = created.getRequired("created")

        /** Unique identifier for the project that the experiment belongs under */
        fun projectId(): String = projectId.getRequired("project_id")

        /** Unique identifier for the experiment */
        fun experimentId(): String = experimentId.getRequired("experiment_id")

        /**
         * The arguments that uniquely define a test case (an arbitrary, JSON serializable object).
         * Later on, Braintrust will use the `input` to know whether two test cases are the same
         * between experiments, so they should not contain experiment-specific state. A simple rule
         * of thumb is that if you run the same experiment twice, the `input` should be identical
         */
        fun input(): JsonValue = input

        /**
         * The output of your application, including post-processing (an arbitrary, JSON
         * serializable object), that allows you to determine whether the result is correct or not.
         * For example, in an app that generates SQL queries, the `output` should be the _result_ of
         * the SQL query generated by the model, not the query itself, because there may be multiple
         * valid queries that answer a single question
         */
        fun output(): JsonValue = output

        /**
         * The ground truth value (an arbitrary, JSON serializable object) that you'd compare to
         * `output` to determine if your `output` value is correct or not. Braintrust currently does
         * not compare `output` to `expected` for you, since there are so many different ways to do
         * that correctly. Instead, these values are just used to help you navigate your experiments
         * while digging into analyses. However, we may later use these values to re-score outputs
         * or fine-tune your models
         */
        fun expected(): JsonValue = expected

        /**
         * A dictionary of numeric values (between 0 and 1) to log. The scores should give you a
         * variety of signals that help you determine how accurate the outputs are compared to what
         * you expect and diagnose failures. For example, a summarization app might have one score
         * that tells you how accurate the summary is, and another that measures the word similarity
         * between the generated and grouth truth summary. The word similarity score could help you
         * determine whether the summarization was covering similar concepts or not. You can use
         * these scores to help you sort, filter, and compare experiments
         */
        fun scores(): Optional<Scores> = Optional.ofNullable(scores.getNullable("scores"))

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
         * Metrics are numerical measurements tracking the execution of the code that produced the
         * experiment event. Use "start" and "end" to track the time span over which the experiment
         * event was produced
         */
        fun metrics(): Optional<Metrics> = Optional.ofNullable(metrics.getNullable("metrics"))

        /**
         * Context is additional information about the code that produced the experiment event. It
         * is essentially the textual counterpart to `metrics`. Use the `caller_*` attributes to
         * track the location in code which produced the experiment event
         */
        fun context(): Optional<Context> = Optional.ofNullable(context.getNullable("context"))

        /**
         * A unique identifier used to link different experiment events together as part of a full
         * trace. See the [tracing guide](https://www.braintrust.dev/docs/guides/tracing) for full
         * details on tracing
         */
        fun spanId(): String = spanId.getRequired("span_id")

        /**
         * An array of the parent `span_ids` of this experiment event. This should be empty for the
         * root span of a trace, and should most often contain just one parent element for subspans
         */
        fun spanParents(): Optional<List<String>> =
            Optional.ofNullable(spanParents.getNullable("span_parents"))

        /** The `span_id` of the root of the trace this experiment event belongs to */
        fun rootSpanId(): String = rootSpanId.getRequired("root_span_id")

        /** Human-identifying attributes of the span, such as name, type, etc. */
        fun spanAttributes(): Optional<SpanAttributes> =
            Optional.ofNullable(spanAttributes.getNullable("span_attributes"))

        /**
         * A unique identifier for the experiment event. If you don't provide one, BrainTrust will
         * generate one for you
         */
        @JsonProperty("id") @ExcludeMissing fun _id() = id

        /**
         * If the experiment is associated to a dataset, this is the event-level dataset id this
         * experiment event is tied to
         */
        @JsonProperty("dataset_record_id") @ExcludeMissing fun _datasetRecordId() = datasetRecordId

        /**
         * The transaction id of an event is unique to the network operation that processed the
         * event insertion. Transaction ids are monotonically increasing over time and can be used
         * to retrieve a versioned snapshot of the experiment (see the `version` parameter)
         */
        @JsonProperty("_xact_id") @ExcludeMissing fun __xactId() = _xactId

        /** The timestamp the experiment event was created */
        @JsonProperty("created") @ExcludeMissing fun _created() = created

        /** Unique identifier for the project that the experiment belongs under */
        @JsonProperty("project_id") @ExcludeMissing fun _projectId() = projectId

        /** Unique identifier for the experiment */
        @JsonProperty("experiment_id") @ExcludeMissing fun _experimentId() = experimentId

        /**
         * The arguments that uniquely define a test case (an arbitrary, JSON serializable object).
         * Later on, Braintrust will use the `input` to know whether two test cases are the same
         * between experiments, so they should not contain experiment-specific state. A simple rule
         * of thumb is that if you run the same experiment twice, the `input` should be identical
         */
        @JsonProperty("input") @ExcludeMissing fun _input() = input

        /**
         * The output of your application, including post-processing (an arbitrary, JSON
         * serializable object), that allows you to determine whether the result is correct or not.
         * For example, in an app that generates SQL queries, the `output` should be the _result_ of
         * the SQL query generated by the model, not the query itself, because there may be multiple
         * valid queries that answer a single question
         */
        @JsonProperty("output") @ExcludeMissing fun _output() = output

        /**
         * The ground truth value (an arbitrary, JSON serializable object) that you'd compare to
         * `output` to determine if your `output` value is correct or not. Braintrust currently does
         * not compare `output` to `expected` for you, since there are so many different ways to do
         * that correctly. Instead, these values are just used to help you navigate your experiments
         * while digging into analyses. However, we may later use these values to re-score outputs
         * or fine-tune your models
         */
        @JsonProperty("expected") @ExcludeMissing fun _expected() = expected

        /**
         * A dictionary of numeric values (between 0 and 1) to log. The scores should give you a
         * variety of signals that help you determine how accurate the outputs are compared to what
         * you expect and diagnose failures. For example, a summarization app might have one score
         * that tells you how accurate the summary is, and another that measures the word similarity
         * between the generated and grouth truth summary. The word similarity score could help you
         * determine whether the summarization was covering similar concepts or not. You can use
         * these scores to help you sort, filter, and compare experiments
         */
        @JsonProperty("scores") @ExcludeMissing fun _scores() = scores

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
         * Metrics are numerical measurements tracking the execution of the code that produced the
         * experiment event. Use "start" and "end" to track the time span over which the experiment
         * event was produced
         */
        @JsonProperty("metrics") @ExcludeMissing fun _metrics() = metrics

        /**
         * Context is additional information about the code that produced the experiment event. It
         * is essentially the textual counterpart to `metrics`. Use the `caller_*` attributes to
         * track the location in code which produced the experiment event
         */
        @JsonProperty("context") @ExcludeMissing fun _context() = context

        /**
         * A unique identifier used to link different experiment events together as part of a full
         * trace. See the [tracing guide](https://www.braintrust.dev/docs/guides/tracing) for full
         * details on tracing
         */
        @JsonProperty("span_id") @ExcludeMissing fun _spanId() = spanId

        /**
         * An array of the parent `span_ids` of this experiment event. This should be empty for the
         * root span of a trace, and should most often contain just one parent element for subspans
         */
        @JsonProperty("span_parents") @ExcludeMissing fun _spanParents() = spanParents

        /** The `span_id` of the root of the trace this experiment event belongs to */
        @JsonProperty("root_span_id") @ExcludeMissing fun _rootSpanId() = rootSpanId

        /** Human-identifying attributes of the span, such as name, type, etc. */
        @JsonProperty("span_attributes") @ExcludeMissing fun _spanAttributes() = spanAttributes

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Event = apply {
            if (!validated) {
                id()
                datasetRecordId()
                _xactId()
                created()
                projectId()
                experimentId()
                input()
                output()
                expected()
                scores().map { it.validate() }
                metadata().map { it.validate() }
                tags()
                metrics().map { it.validate() }
                context().map { it.validate() }
                spanId()
                spanParents()
                rootSpanId()
                spanAttributes().map { it.validate() }
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
                this.datasetRecordId == other.datasetRecordId &&
                this._xactId == other._xactId &&
                this.created == other.created &&
                this.projectId == other.projectId &&
                this.experimentId == other.experimentId &&
                this.input == other.input &&
                this.output == other.output &&
                this.expected == other.expected &&
                this.scores == other.scores &&
                this.metadata == other.metadata &&
                this.tags == other.tags &&
                this.metrics == other.metrics &&
                this.context == other.context &&
                this.spanId == other.spanId &&
                this.spanParents == other.spanParents &&
                this.rootSpanId == other.rootSpanId &&
                this.spanAttributes == other.spanAttributes &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        id,
                        datasetRecordId,
                        _xactId,
                        created,
                        projectId,
                        experimentId,
                        input,
                        output,
                        expected,
                        scores,
                        metadata,
                        tags,
                        metrics,
                        context,
                        spanId,
                        spanParents,
                        rootSpanId,
                        spanAttributes,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Event{id=$id, datasetRecordId=$datasetRecordId, _xactId=$_xactId, created=$created, projectId=$projectId, experimentId=$experimentId, input=$input, output=$output, expected=$expected, scores=$scores, metadata=$metadata, tags=$tags, metrics=$metrics, context=$context, spanId=$spanId, spanParents=$spanParents, rootSpanId=$rootSpanId, spanAttributes=$spanAttributes, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var id: JsonField<String> = JsonMissing.of()
            private var datasetRecordId: JsonField<String> = JsonMissing.of()
            private var _xactId: JsonField<String> = JsonMissing.of()
            private var created: JsonField<OffsetDateTime> = JsonMissing.of()
            private var projectId: JsonField<String> = JsonMissing.of()
            private var experimentId: JsonField<String> = JsonMissing.of()
            private var input: JsonValue = JsonMissing.of()
            private var output: JsonValue = JsonMissing.of()
            private var expected: JsonValue = JsonMissing.of()
            private var scores: JsonField<Scores> = JsonMissing.of()
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var tags: JsonField<List<String>> = JsonMissing.of()
            private var metrics: JsonField<Metrics> = JsonMissing.of()
            private var context: JsonField<Context> = JsonMissing.of()
            private var spanId: JsonField<String> = JsonMissing.of()
            private var spanParents: JsonField<List<String>> = JsonMissing.of()
            private var rootSpanId: JsonField<String> = JsonMissing.of()
            private var spanAttributes: JsonField<SpanAttributes> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(event: Event) = apply {
                this.id = event.id
                this.datasetRecordId = event.datasetRecordId
                this._xactId = event._xactId
                this.created = event.created
                this.projectId = event.projectId
                this.experimentId = event.experimentId
                this.input = event.input
                this.output = event.output
                this.expected = event.expected
                this.scores = event.scores
                this.metadata = event.metadata
                this.tags = event.tags
                this.metrics = event.metrics
                this.context = event.context
                this.spanId = event.spanId
                this.spanParents = event.spanParents
                this.rootSpanId = event.rootSpanId
                this.spanAttributes = event.spanAttributes
                additionalProperties(event.additionalProperties)
            }

            /**
             * A unique identifier for the experiment event. If you don't provide one, BrainTrust
             * will generate one for you
             */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * A unique identifier for the experiment event. If you don't provide one, BrainTrust
             * will generate one for you
             */
            @JsonProperty("id")
            @ExcludeMissing
            fun id(id: JsonField<String>) = apply { this.id = id }

            /**
             * If the experiment is associated to a dataset, this is the event-level dataset id this
             * experiment event is tied to
             */
            fun datasetRecordId(datasetRecordId: String) =
                datasetRecordId(JsonField.of(datasetRecordId))

            /**
             * If the experiment is associated to a dataset, this is the event-level dataset id this
             * experiment event is tied to
             */
            @JsonProperty("dataset_record_id")
            @ExcludeMissing
            fun datasetRecordId(datasetRecordId: JsonField<String>) = apply {
                this.datasetRecordId = datasetRecordId
            }

            /**
             * The transaction id of an event is unique to the network operation that processed the
             * event insertion. Transaction ids are monotonically increasing over time and can be
             * used to retrieve a versioned snapshot of the experiment (see the `version` parameter)
             */
            fun _xactId(_xactId: String) = _xactId(JsonField.of(_xactId))

            /**
             * The transaction id of an event is unique to the network operation that processed the
             * event insertion. Transaction ids are monotonically increasing over time and can be
             * used to retrieve a versioned snapshot of the experiment (see the `version` parameter)
             */
            @JsonProperty("_xact_id")
            @ExcludeMissing
            fun _xactId(_xactId: JsonField<String>) = apply { this._xactId = _xactId }

            /** The timestamp the experiment event was created */
            fun created(created: OffsetDateTime) = created(JsonField.of(created))

            /** The timestamp the experiment event was created */
            @JsonProperty("created")
            @ExcludeMissing
            fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

            /** Unique identifier for the project that the experiment belongs under */
            fun projectId(projectId: String) = projectId(JsonField.of(projectId))

            /** Unique identifier for the project that the experiment belongs under */
            @JsonProperty("project_id")
            @ExcludeMissing
            fun projectId(projectId: JsonField<String>) = apply { this.projectId = projectId }

            /** Unique identifier for the experiment */
            fun experimentId(experimentId: String) = experimentId(JsonField.of(experimentId))

            /** Unique identifier for the experiment */
            @JsonProperty("experiment_id")
            @ExcludeMissing
            fun experimentId(experimentId: JsonField<String>) = apply {
                this.experimentId = experimentId
            }

            /**
             * The arguments that uniquely define a test case (an arbitrary, JSON serializable
             * object). Later on, Braintrust will use the `input` to know whether two test cases are
             * the same between experiments, so they should not contain experiment-specific state. A
             * simple rule of thumb is that if you run the same experiment twice, the `input` should
             * be identical
             */
            @JsonProperty("input")
            @ExcludeMissing
            fun input(input: JsonValue) = apply { this.input = input }

            /**
             * The output of your application, including post-processing (an arbitrary, JSON
             * serializable object), that allows you to determine whether the result is correct or
             * not. For example, in an app that generates SQL queries, the `output` should be the
             * _result_ of the SQL query generated by the model, not the query itself, because there
             * may be multiple valid queries that answer a single question
             */
            @JsonProperty("output")
            @ExcludeMissing
            fun output(output: JsonValue) = apply { this.output = output }

            /**
             * The ground truth value (an arbitrary, JSON serializable object) that you'd compare to
             * `output` to determine if your `output` value is correct or not. Braintrust currently
             * does not compare `output` to `expected` for you, since there are so many different
             * ways to do that correctly. Instead, these values are just used to help you navigate
             * your experiments while digging into analyses. However, we may later use these values
             * to re-score outputs or fine-tune your models
             */
            @JsonProperty("expected")
            @ExcludeMissing
            fun expected(expected: JsonValue) = apply { this.expected = expected }

            /**
             * A dictionary of numeric values (between 0 and 1) to log. The scores should give you a
             * variety of signals that help you determine how accurate the outputs are compared to
             * what you expect and diagnose failures. For example, a summarization app might have
             * one score that tells you how accurate the summary is, and another that measures the
             * word similarity between the generated and grouth truth summary. The word similarity
             * score could help you determine whether the summarization was covering similar
             * concepts or not. You can use these scores to help you sort, filter, and compare
             * experiments
             */
            fun scores(scores: Scores) = scores(JsonField.of(scores))

            /**
             * A dictionary of numeric values (between 0 and 1) to log. The scores should give you a
             * variety of signals that help you determine how accurate the outputs are compared to
             * what you expect and diagnose failures. For example, a summarization app might have
             * one score that tells you how accurate the summary is, and another that measures the
             * word similarity between the generated and grouth truth summary. The word similarity
             * score could help you determine whether the summarization was covering similar
             * concepts or not. You can use these scores to help you sort, filter, and compare
             * experiments
             */
            @JsonProperty("scores")
            @ExcludeMissing
            fun scores(scores: JsonField<Scores>) = apply { this.scores = scores }

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
             * Metrics are numerical measurements tracking the execution of the code that produced
             * the experiment event. Use "start" and "end" to track the time span over which the
             * experiment event was produced
             */
            fun metrics(metrics: Metrics) = metrics(JsonField.of(metrics))

            /**
             * Metrics are numerical measurements tracking the execution of the code that produced
             * the experiment event. Use "start" and "end" to track the time span over which the
             * experiment event was produced
             */
            @JsonProperty("metrics")
            @ExcludeMissing
            fun metrics(metrics: JsonField<Metrics>) = apply { this.metrics = metrics }

            /**
             * Context is additional information about the code that produced the experiment event.
             * It is essentially the textual counterpart to `metrics`. Use the `caller_*` attributes
             * to track the location in code which produced the experiment event
             */
            fun context(context: Context) = context(JsonField.of(context))

            /**
             * Context is additional information about the code that produced the experiment event.
             * It is essentially the textual counterpart to `metrics`. Use the `caller_*` attributes
             * to track the location in code which produced the experiment event
             */
            @JsonProperty("context")
            @ExcludeMissing
            fun context(context: JsonField<Context>) = apply { this.context = context }

            /**
             * A unique identifier used to link different experiment events together as part of a
             * full trace. See the [tracing guide](https://www.braintrust.dev/docs/guides/tracing)
             * for full details on tracing
             */
            fun spanId(spanId: String) = spanId(JsonField.of(spanId))

            /**
             * A unique identifier used to link different experiment events together as part of a
             * full trace. See the [tracing guide](https://www.braintrust.dev/docs/guides/tracing)
             * for full details on tracing
             */
            @JsonProperty("span_id")
            @ExcludeMissing
            fun spanId(spanId: JsonField<String>) = apply { this.spanId = spanId }

            /**
             * An array of the parent `span_ids` of this experiment event. This should be empty for
             * the root span of a trace, and should most often contain just one parent element for
             * subspans
             */
            fun spanParents(spanParents: List<String>) = spanParents(JsonField.of(spanParents))

            /**
             * An array of the parent `span_ids` of this experiment event. This should be empty for
             * the root span of a trace, and should most often contain just one parent element for
             * subspans
             */
            @JsonProperty("span_parents")
            @ExcludeMissing
            fun spanParents(spanParents: JsonField<List<String>>) = apply {
                this.spanParents = spanParents
            }

            /** The `span_id` of the root of the trace this experiment event belongs to */
            fun rootSpanId(rootSpanId: String) = rootSpanId(JsonField.of(rootSpanId))

            /** The `span_id` of the root of the trace this experiment event belongs to */
            @JsonProperty("root_span_id")
            @ExcludeMissing
            fun rootSpanId(rootSpanId: JsonField<String>) = apply { this.rootSpanId = rootSpanId }

            /** Human-identifying attributes of the span, such as name, type, etc. */
            fun spanAttributes(spanAttributes: SpanAttributes) =
                spanAttributes(JsonField.of(spanAttributes))

            /** Human-identifying attributes of the span, such as name, type, etc. */
            @JsonProperty("span_attributes")
            @ExcludeMissing
            fun spanAttributes(spanAttributes: JsonField<SpanAttributes>) = apply {
                this.spanAttributes = spanAttributes
            }

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
                    datasetRecordId,
                    _xactId,
                    created,
                    projectId,
                    experimentId,
                    input,
                    output,
                    expected,
                    scores,
                    metadata,
                    tags.map { it.toUnmodifiable() },
                    metrics,
                    context,
                    spanId,
                    spanParents.map { it.toUnmodifiable() },
                    rootSpanId,
                    spanAttributes,
                    additionalProperties.toUnmodifiable(),
                )
        }

        /**
         * Context is additional information about the code that produced the experiment event. It
         * is essentially the textual counterpart to `metrics`. Use the `caller_*` attributes to
         * track the location in code which produced the experiment event
         */
        @JsonDeserialize(builder = Context.Builder::class)
        @NoAutoDetect
        class Context
        private constructor(
            private val callerFunctionname: JsonField<String>,
            private val callerFilename: JsonField<String>,
            private val callerLineno: JsonField<Long>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** The function in code which created the experiment event */
            fun callerFunctionname(): Optional<String> =
                Optional.ofNullable(callerFunctionname.getNullable("caller_functionname"))

            /** Name of the file in code where the experiment event was created */
            fun callerFilename(): Optional<String> =
                Optional.ofNullable(callerFilename.getNullable("caller_filename"))

            /** Line of code where the experiment event was created */
            fun callerLineno(): Optional<Long> =
                Optional.ofNullable(callerLineno.getNullable("caller_lineno"))

            /** The function in code which created the experiment event */
            @JsonProperty("caller_functionname")
            @ExcludeMissing
            fun _callerFunctionname() = callerFunctionname

            /** Name of the file in code where the experiment event was created */
            @JsonProperty("caller_filename") @ExcludeMissing fun _callerFilename() = callerFilename

            /** Line of code where the experiment event was created */
            @JsonProperty("caller_lineno") @ExcludeMissing fun _callerLineno() = callerLineno

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Context = apply {
                if (!validated) {
                    callerFunctionname()
                    callerFilename()
                    callerLineno()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Context &&
                    this.callerFunctionname == other.callerFunctionname &&
                    this.callerFilename == other.callerFilename &&
                    this.callerLineno == other.callerLineno &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            callerFunctionname,
                            callerFilename,
                            callerLineno,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Context{callerFunctionname=$callerFunctionname, callerFilename=$callerFilename, callerLineno=$callerLineno, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var callerFunctionname: JsonField<String> = JsonMissing.of()
                private var callerFilename: JsonField<String> = JsonMissing.of()
                private var callerLineno: JsonField<Long> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(context: Context) = apply {
                    this.callerFunctionname = context.callerFunctionname
                    this.callerFilename = context.callerFilename
                    this.callerLineno = context.callerLineno
                    additionalProperties(context.additionalProperties)
                }

                /** The function in code which created the experiment event */
                fun callerFunctionname(callerFunctionname: String) =
                    callerFunctionname(JsonField.of(callerFunctionname))

                /** The function in code which created the experiment event */
                @JsonProperty("caller_functionname")
                @ExcludeMissing
                fun callerFunctionname(callerFunctionname: JsonField<String>) = apply {
                    this.callerFunctionname = callerFunctionname
                }

                /** Name of the file in code where the experiment event was created */
                fun callerFilename(callerFilename: String) =
                    callerFilename(JsonField.of(callerFilename))

                /** Name of the file in code where the experiment event was created */
                @JsonProperty("caller_filename")
                @ExcludeMissing
                fun callerFilename(callerFilename: JsonField<String>) = apply {
                    this.callerFilename = callerFilename
                }

                /** Line of code where the experiment event was created */
                fun callerLineno(callerLineno: Long) = callerLineno(JsonField.of(callerLineno))

                /** Line of code where the experiment event was created */
                @JsonProperty("caller_lineno")
                @ExcludeMissing
                fun callerLineno(callerLineno: JsonField<Long>) = apply {
                    this.callerLineno = callerLineno
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

                fun build(): Context =
                    Context(
                        callerFunctionname,
                        callerFilename,
                        callerLineno,
                        additionalProperties.toUnmodifiable(),
                    )
            }
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

        /**
         * Metrics are numerical measurements tracking the execution of the code that produced the
         * experiment event. Use "start" and "end" to track the time span over which the experiment
         * event was produced
         */
        @JsonDeserialize(builder = Metrics.Builder::class)
        @NoAutoDetect
        class Metrics
        private constructor(
            private val start: JsonField<Double>,
            private val end: JsonField<Double>,
            private val promptTokens: JsonField<Long>,
            private val completionTokens: JsonField<Long>,
            private val tokens: JsonField<Long>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /**
             * A unix timestamp recording when the section of code which produced the experiment
             * event started
             */
            fun start(): Optional<Double> = Optional.ofNullable(start.getNullable("start"))

            /**
             * A unix timestamp recording when the section of code which produced the experiment
             * event finished
             */
            fun end(): Optional<Double> = Optional.ofNullable(end.getNullable("end"))

            /**
             * The number of tokens in the prompt used to generate the experiment event (only set if
             * this is an LLM span)
             */
            fun promptTokens(): Optional<Long> =
                Optional.ofNullable(promptTokens.getNullable("prompt_tokens"))

            /**
             * The number of tokens in the completion generated by the model (only set if this is an
             * LLM span)
             */
            fun completionTokens(): Optional<Long> =
                Optional.ofNullable(completionTokens.getNullable("completion_tokens"))

            /** The total number of tokens in the input and output of the experiment event. */
            fun tokens(): Optional<Long> = Optional.ofNullable(tokens.getNullable("tokens"))

            /**
             * A unix timestamp recording when the section of code which produced the experiment
             * event started
             */
            @JsonProperty("start") @ExcludeMissing fun _start() = start

            /**
             * A unix timestamp recording when the section of code which produced the experiment
             * event finished
             */
            @JsonProperty("end") @ExcludeMissing fun _end() = end

            /**
             * The number of tokens in the prompt used to generate the experiment event (only set if
             * this is an LLM span)
             */
            @JsonProperty("prompt_tokens") @ExcludeMissing fun _promptTokens() = promptTokens

            /**
             * The number of tokens in the completion generated by the model (only set if this is an
             * LLM span)
             */
            @JsonProperty("completion_tokens")
            @ExcludeMissing
            fun _completionTokens() = completionTokens

            /** The total number of tokens in the input and output of the experiment event. */
            @JsonProperty("tokens") @ExcludeMissing fun _tokens() = tokens

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Metrics = apply {
                if (!validated) {
                    start()
                    end()
                    promptTokens()
                    completionTokens()
                    tokens()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Metrics &&
                    this.start == other.start &&
                    this.end == other.end &&
                    this.promptTokens == other.promptTokens &&
                    this.completionTokens == other.completionTokens &&
                    this.tokens == other.tokens &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            start,
                            end,
                            promptTokens,
                            completionTokens,
                            tokens,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Metrics{start=$start, end=$end, promptTokens=$promptTokens, completionTokens=$completionTokens, tokens=$tokens, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var start: JsonField<Double> = JsonMissing.of()
                private var end: JsonField<Double> = JsonMissing.of()
                private var promptTokens: JsonField<Long> = JsonMissing.of()
                private var completionTokens: JsonField<Long> = JsonMissing.of()
                private var tokens: JsonField<Long> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(metrics: Metrics) = apply {
                    this.start = metrics.start
                    this.end = metrics.end
                    this.promptTokens = metrics.promptTokens
                    this.completionTokens = metrics.completionTokens
                    this.tokens = metrics.tokens
                    additionalProperties(metrics.additionalProperties)
                }

                /**
                 * A unix timestamp recording when the section of code which produced the experiment
                 * event started
                 */
                fun start(start: Double) = start(JsonField.of(start))

                /**
                 * A unix timestamp recording when the section of code which produced the experiment
                 * event started
                 */
                @JsonProperty("start")
                @ExcludeMissing
                fun start(start: JsonField<Double>) = apply { this.start = start }

                /**
                 * A unix timestamp recording when the section of code which produced the experiment
                 * event finished
                 */
                fun end(end: Double) = end(JsonField.of(end))

                /**
                 * A unix timestamp recording when the section of code which produced the experiment
                 * event finished
                 */
                @JsonProperty("end")
                @ExcludeMissing
                fun end(end: JsonField<Double>) = apply { this.end = end }

                /**
                 * The number of tokens in the prompt used to generate the experiment event (only
                 * set if this is an LLM span)
                 */
                fun promptTokens(promptTokens: Long) = promptTokens(JsonField.of(promptTokens))

                /**
                 * The number of tokens in the prompt used to generate the experiment event (only
                 * set if this is an LLM span)
                 */
                @JsonProperty("prompt_tokens")
                @ExcludeMissing
                fun promptTokens(promptTokens: JsonField<Long>) = apply {
                    this.promptTokens = promptTokens
                }

                /**
                 * The number of tokens in the completion generated by the model (only set if this
                 * is an LLM span)
                 */
                fun completionTokens(completionTokens: Long) =
                    completionTokens(JsonField.of(completionTokens))

                /**
                 * The number of tokens in the completion generated by the model (only set if this
                 * is an LLM span)
                 */
                @JsonProperty("completion_tokens")
                @ExcludeMissing
                fun completionTokens(completionTokens: JsonField<Long>) = apply {
                    this.completionTokens = completionTokens
                }

                /** The total number of tokens in the input and output of the experiment event. */
                fun tokens(tokens: Long) = tokens(JsonField.of(tokens))

                /** The total number of tokens in the input and output of the experiment event. */
                @JsonProperty("tokens")
                @ExcludeMissing
                fun tokens(tokens: JsonField<Long>) = apply { this.tokens = tokens }

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

                fun build(): Metrics =
                    Metrics(
                        start,
                        end,
                        promptTokens,
                        completionTokens,
                        tokens,
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        /**
         * A dictionary of numeric values (between 0 and 1) to log. The scores should give you a
         * variety of signals that help you determine how accurate the outputs are compared to what
         * you expect and diagnose failures. For example, a summarization app might have one score
         * that tells you how accurate the summary is, and another that measures the word similarity
         * between the generated and grouth truth summary. The word similarity score could help you
         * determine whether the summarization was covering similar concepts or not. You can use
         * these scores to help you sort, filter, and compare experiments
         */
        @JsonDeserialize(builder = Scores.Builder::class)
        @NoAutoDetect
        class Scores
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Scores = apply {
                if (!validated) {
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Scores && this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = Objects.hash(additionalProperties)
                }
                return hashCode
            }

            override fun toString() = "Scores{additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(scores: Scores) = apply {
                    additionalProperties(scores.additionalProperties)
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

                fun build(): Scores = Scores(additionalProperties.toUnmodifiable())
            }
        }

        /** Human-identifying attributes of the span, such as name, type, etc. */
        @JsonDeserialize(builder = SpanAttributes.Builder::class)
        @NoAutoDetect
        class SpanAttributes
        private constructor(
            private val name: JsonField<String>,
            private val type: JsonField<Type>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** Name of the span, for display purposes only */
            fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

            /** Type of the span, for display purposes only */
            fun type(): Optional<Type> = Optional.ofNullable(type.getNullable("type"))

            /** Name of the span, for display purposes only */
            @JsonProperty("name") @ExcludeMissing fun _name() = name

            /** Type of the span, for display purposes only */
            @JsonProperty("type") @ExcludeMissing fun _type() = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): SpanAttributes = apply {
                if (!validated) {
                    name()
                    type()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is SpanAttributes &&
                    this.name == other.name &&
                    this.type == other.type &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            name,
                            type,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "SpanAttributes{name=$name, type=$type, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var name: JsonField<String> = JsonMissing.of()
                private var type: JsonField<Type> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(spanAttributes: SpanAttributes) = apply {
                    this.name = spanAttributes.name
                    this.type = spanAttributes.type
                    additionalProperties(spanAttributes.additionalProperties)
                }

                /** Name of the span, for display purposes only */
                fun name(name: String) = name(JsonField.of(name))

                /** Name of the span, for display purposes only */
                @JsonProperty("name")
                @ExcludeMissing
                fun name(name: JsonField<String>) = apply { this.name = name }

                /** Type of the span, for display purposes only */
                fun type(type: Type) = type(JsonField.of(type))

                /** Type of the span, for display purposes only */
                @JsonProperty("type")
                @ExcludeMissing
                fun type(type: JsonField<Type>) = apply { this.type = type }

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

                fun build(): SpanAttributes =
                    SpanAttributes(
                        name,
                        type,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class Type
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Type && this.value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    @JvmField val LLM = Type(JsonField.of("llm"))

                    @JvmField val SCORE = Type(JsonField.of("score"))

                    @JvmField val FUNCTION = Type(JsonField.of("function"))

                    @JvmField val EVAL = Type(JsonField.of("eval"))

                    @JvmField val TASK = Type(JsonField.of("task"))

                    @JvmField val TOOL = Type(JsonField.of("tool"))

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                enum class Known {
                    LLM,
                    SCORE,
                    FUNCTION,
                    EVAL,
                    TASK,
                    TOOL,
                }

                enum class Value {
                    LLM,
                    SCORE,
                    FUNCTION,
                    EVAL,
                    TASK,
                    TOOL,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        LLM -> Value.LLM
                        SCORE -> Value.SCORE
                        FUNCTION -> Value.FUNCTION
                        EVAL -> Value.EVAL
                        TASK -> Value.TASK
                        TOOL -> Value.TOOL
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        LLM -> Known.LLM
                        SCORE -> Known.SCORE
                        FUNCTION -> Known.FUNCTION
                        EVAL -> Known.EVAL
                        TASK -> Known.TASK
                        TOOL -> Known.TOOL
                        else -> throw BraintrustInvalidDataException("Unknown Type: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }
        }
    }
}
