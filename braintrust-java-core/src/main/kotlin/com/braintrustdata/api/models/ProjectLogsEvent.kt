// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.Enum
import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.checkKnown
import com.braintrustdata.api.core.checkRequired
import com.braintrustdata.api.core.immutableEmptyMap
import com.braintrustdata.api.core.toImmutable
import com.braintrustdata.api.errors.BraintrustInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

@NoAutoDetect
class ProjectLogsEvent
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("_xact_id")
    @ExcludeMissing
    private val _xactId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("created")
    @ExcludeMissing
    private val created: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("log_id") @ExcludeMissing private val logId: JsonField<LogId> = JsonMissing.of(),
    @JsonProperty("org_id") @ExcludeMissing private val orgId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("project_id")
    @ExcludeMissing
    private val projectId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("root_span_id")
    @ExcludeMissing
    private val rootSpanId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("span_id")
    @ExcludeMissing
    private val spanId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("context")
    @ExcludeMissing
    private val context: JsonField<Context> = JsonMissing.of(),
    @JsonProperty("error") @ExcludeMissing private val error: JsonValue = JsonMissing.of(),
    @JsonProperty("expected") @ExcludeMissing private val expected: JsonValue = JsonMissing.of(),
    @JsonProperty("input") @ExcludeMissing private val input: JsonValue = JsonMissing.of(),
    @JsonProperty("is_root")
    @ExcludeMissing
    private val isRoot: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("metadata")
    @ExcludeMissing
    private val metadata: JsonField<Metadata> = JsonMissing.of(),
    @JsonProperty("metrics")
    @ExcludeMissing
    private val metrics: JsonField<Metrics> = JsonMissing.of(),
    @JsonProperty("origin")
    @ExcludeMissing
    private val origin: JsonField<ObjectReference> = JsonMissing.of(),
    @JsonProperty("output") @ExcludeMissing private val output: JsonValue = JsonMissing.of(),
    @JsonProperty("scores")
    @ExcludeMissing
    private val scores: JsonField<Scores> = JsonMissing.of(),
    @JsonProperty("span_attributes")
    @ExcludeMissing
    private val spanAttributes: JsonField<SpanAttributes> = JsonMissing.of(),
    @JsonProperty("span_parents")
    @ExcludeMissing
    private val spanParents: JsonField<List<String>> = JsonMissing.of(),
    @JsonProperty("tags")
    @ExcludeMissing
    private val tags: JsonField<List<String>> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * A unique identifier for the project logs event. If you don't provide one, BrainTrust will
     * generate one for you
     */
    fun id(): String = id.getRequired("id")

    /**
     * The transaction id of an event is unique to the network operation that processed the event
     * insertion. Transaction ids are monotonically increasing over time and can be used to retrieve
     * a versioned snapshot of the project logs (see the `version` parameter)
     */
    fun _xactId(): String = _xactId.getRequired("_xact_id")

    /** The timestamp the project logs event was created */
    fun created(): OffsetDateTime = created.getRequired("created")

    /** A literal 'g' which identifies the log as a project log */
    fun logId(): LogId = logId.getRequired("log_id")

    /** Unique id for the organization that the project belongs under */
    fun orgId(): String = orgId.getRequired("org_id")

    /** Unique identifier for the project */
    fun projectId(): String = projectId.getRequired("project_id")

    /** A unique identifier for the trace this project logs event belongs to */
    fun rootSpanId(): String = rootSpanId.getRequired("root_span_id")

    /**
     * A unique identifier used to link different project logs events together as part of a full
     * trace. See the [tracing guide](https://www.braintrust.dev/docs/guides/tracing) for full
     * details on tracing
     */
    fun spanId(): String = spanId.getRequired("span_id")

    /**
     * Context is additional information about the code that produced the project logs event. It is
     * essentially the textual counterpart to `metrics`. Use the `caller_*` attributes to track the
     * location in code which produced the project logs event
     */
    fun context(): Optional<Context> = Optional.ofNullable(context.getNullable("context"))

    /** The error that occurred, if any. */
    @JsonProperty("error") @ExcludeMissing fun _error(): JsonValue = error

    /**
     * The ground truth value (an arbitrary, JSON serializable object) that you'd compare to
     * `output` to determine if your `output` value is correct or not. Braintrust currently does not
     * compare `output` to `expected` for you, since there are so many different ways to do that
     * correctly. Instead, these values are just used to help you navigate while digging into
     * analyses. However, we may later use these values to re-score outputs or fine-tune your
     * models.
     */
    @JsonProperty("expected") @ExcludeMissing fun _expected(): JsonValue = expected

    /** The arguments that uniquely define a user input (an arbitrary, JSON serializable object). */
    @JsonProperty("input") @ExcludeMissing fun _input(): JsonValue = input

    /** Whether this span is a root span */
    fun isRoot(): Optional<Boolean> = Optional.ofNullable(isRoot.getNullable("is_root"))

    /**
     * A dictionary with additional data about the test example, model outputs, or just about
     * anything else that's relevant, that you can use to help find and analyze examples later. For
     * example, you could log the `prompt`, example's `id`, or anything else that would be useful to
     * slice/dice later. The values in `metadata` can be any JSON-serializable type, but its keys
     * must be strings
     */
    fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata.getNullable("metadata"))

    /**
     * Metrics are numerical measurements tracking the execution of the code that produced the
     * project logs event. Use "start" and "end" to track the time span over which the project logs
     * event was produced
     */
    fun metrics(): Optional<Metrics> = Optional.ofNullable(metrics.getNullable("metrics"))

    /** Indicates the event was copied from another object. */
    fun origin(): Optional<ObjectReference> = Optional.ofNullable(origin.getNullable("origin"))

    /**
     * The output of your application, including post-processing (an arbitrary, JSON serializable
     * object), that allows you to determine whether the result is correct or not. For example, in
     * an app that generates SQL queries, the `output` should be the _result_ of the SQL query
     * generated by the model, not the query itself, because there may be multiple valid queries
     * that answer a single question.
     */
    @JsonProperty("output") @ExcludeMissing fun _output(): JsonValue = output

    /**
     * A dictionary of numeric values (between 0 and 1) to log. The scores should give you a variety
     * of signals that help you determine how accurate the outputs are compared to what you expect
     * and diagnose failures. For example, a summarization app might have one score that tells you
     * how accurate the summary is, and another that measures the word similarity between the
     * generated and grouth truth summary. The word similarity score could help you determine
     * whether the summarization was covering similar concepts or not. You can use these scores to
     * help you sort, filter, and compare logs.
     */
    fun scores(): Optional<Scores> = Optional.ofNullable(scores.getNullable("scores"))

    /** Human-identifying attributes of the span, such as name, type, etc. */
    fun spanAttributes(): Optional<SpanAttributes> =
        Optional.ofNullable(spanAttributes.getNullable("span_attributes"))

    /**
     * An array of the parent `span_ids` of this project logs event. This should be empty for the
     * root span of a trace, and should most often contain just one parent element for subspans
     */
    fun spanParents(): Optional<List<String>> =
        Optional.ofNullable(spanParents.getNullable("span_parents"))

    /** A list of tags to log */
    fun tags(): Optional<List<String>> = Optional.ofNullable(tags.getNullable("tags"))

    /**
     * A unique identifier for the project logs event. If you don't provide one, BrainTrust will
     * generate one for you
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * The transaction id of an event is unique to the network operation that processed the event
     * insertion. Transaction ids are monotonically increasing over time and can be used to retrieve
     * a versioned snapshot of the project logs (see the `version` parameter)
     */
    @JsonProperty("_xact_id") @ExcludeMissing fun __xactId(): JsonField<String> = _xactId

    /** The timestamp the project logs event was created */
    @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<OffsetDateTime> = created

    /** A literal 'g' which identifies the log as a project log */
    @JsonProperty("log_id") @ExcludeMissing fun _logId(): JsonField<LogId> = logId

    /** Unique id for the organization that the project belongs under */
    @JsonProperty("org_id") @ExcludeMissing fun _orgId(): JsonField<String> = orgId

    /** Unique identifier for the project */
    @JsonProperty("project_id") @ExcludeMissing fun _projectId(): JsonField<String> = projectId

    /** A unique identifier for the trace this project logs event belongs to */
    @JsonProperty("root_span_id") @ExcludeMissing fun _rootSpanId(): JsonField<String> = rootSpanId

    /**
     * A unique identifier used to link different project logs events together as part of a full
     * trace. See the [tracing guide](https://www.braintrust.dev/docs/guides/tracing) for full
     * details on tracing
     */
    @JsonProperty("span_id") @ExcludeMissing fun _spanId(): JsonField<String> = spanId

    /**
     * Context is additional information about the code that produced the project logs event. It is
     * essentially the textual counterpart to `metrics`. Use the `caller_*` attributes to track the
     * location in code which produced the project logs event
     */
    @JsonProperty("context") @ExcludeMissing fun _context(): JsonField<Context> = context

    /** Whether this span is a root span */
    @JsonProperty("is_root") @ExcludeMissing fun _isRoot(): JsonField<Boolean> = isRoot

    /**
     * A dictionary with additional data about the test example, model outputs, or just about
     * anything else that's relevant, that you can use to help find and analyze examples later. For
     * example, you could log the `prompt`, example's `id`, or anything else that would be useful to
     * slice/dice later. The values in `metadata` can be any JSON-serializable type, but its keys
     * must be strings
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    /**
     * Metrics are numerical measurements tracking the execution of the code that produced the
     * project logs event. Use "start" and "end" to track the time span over which the project logs
     * event was produced
     */
    @JsonProperty("metrics") @ExcludeMissing fun _metrics(): JsonField<Metrics> = metrics

    /** Indicates the event was copied from another object. */
    @JsonProperty("origin") @ExcludeMissing fun _origin(): JsonField<ObjectReference> = origin

    /**
     * A dictionary of numeric values (between 0 and 1) to log. The scores should give you a variety
     * of signals that help you determine how accurate the outputs are compared to what you expect
     * and diagnose failures. For example, a summarization app might have one score that tells you
     * how accurate the summary is, and another that measures the word similarity between the
     * generated and grouth truth summary. The word similarity score could help you determine
     * whether the summarization was covering similar concepts or not. You can use these scores to
     * help you sort, filter, and compare logs.
     */
    @JsonProperty("scores") @ExcludeMissing fun _scores(): JsonField<Scores> = scores

    /** Human-identifying attributes of the span, such as name, type, etc. */
    @JsonProperty("span_attributes")
    @ExcludeMissing
    fun _spanAttributes(): JsonField<SpanAttributes> = spanAttributes

    /**
     * An array of the parent `span_ids` of this project logs event. This should be empty for the
     * root span of a trace, and should most often contain just one parent element for subspans
     */
    @JsonProperty("span_parents")
    @ExcludeMissing
    fun _spanParents(): JsonField<List<String>> = spanParents

    /** A list of tags to log */
    @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<String>> = tags

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): ProjectLogsEvent = apply {
        if (validated) {
            return@apply
        }

        id()
        _xactId()
        created()
        logId()
        orgId()
        projectId()
        rootSpanId()
        spanId()
        context().ifPresent { it.validate() }
        isRoot()
        metadata().ifPresent { it.validate() }
        metrics().ifPresent { it.validate() }
        origin().ifPresent { it.validate() }
        scores().ifPresent { it.validate() }
        spanAttributes().ifPresent { it.validate() }
        spanParents()
        tags()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ProjectLogsEvent].
         *
         * The following fields are required:
         * ```java
         * .id()
         * ._xactId()
         * .created()
         * .logId()
         * .orgId()
         * .projectId()
         * .rootSpanId()
         * .spanId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ProjectLogsEvent]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var _xactId: JsonField<String>? = null
        private var created: JsonField<OffsetDateTime>? = null
        private var logId: JsonField<LogId>? = null
        private var orgId: JsonField<String>? = null
        private var projectId: JsonField<String>? = null
        private var rootSpanId: JsonField<String>? = null
        private var spanId: JsonField<String>? = null
        private var context: JsonField<Context> = JsonMissing.of()
        private var error: JsonValue = JsonMissing.of()
        private var expected: JsonValue = JsonMissing.of()
        private var input: JsonValue = JsonMissing.of()
        private var isRoot: JsonField<Boolean> = JsonMissing.of()
        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var metrics: JsonField<Metrics> = JsonMissing.of()
        private var origin: JsonField<ObjectReference> = JsonMissing.of()
        private var output: JsonValue = JsonMissing.of()
        private var scores: JsonField<Scores> = JsonMissing.of()
        private var spanAttributes: JsonField<SpanAttributes> = JsonMissing.of()
        private var spanParents: JsonField<MutableList<String>>? = null
        private var tags: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(projectLogsEvent: ProjectLogsEvent) = apply {
            id = projectLogsEvent.id
            _xactId = projectLogsEvent._xactId
            created = projectLogsEvent.created
            logId = projectLogsEvent.logId
            orgId = projectLogsEvent.orgId
            projectId = projectLogsEvent.projectId
            rootSpanId = projectLogsEvent.rootSpanId
            spanId = projectLogsEvent.spanId
            context = projectLogsEvent.context
            error = projectLogsEvent.error
            expected = projectLogsEvent.expected
            input = projectLogsEvent.input
            isRoot = projectLogsEvent.isRoot
            metadata = projectLogsEvent.metadata
            metrics = projectLogsEvent.metrics
            origin = projectLogsEvent.origin
            output = projectLogsEvent.output
            scores = projectLogsEvent.scores
            spanAttributes = projectLogsEvent.spanAttributes
            spanParents = projectLogsEvent.spanParents.map { it.toMutableList() }
            tags = projectLogsEvent.tags.map { it.toMutableList() }
            additionalProperties = projectLogsEvent.additionalProperties.toMutableMap()
        }

        /**
         * A unique identifier for the project logs event. If you don't provide one, BrainTrust will
         * generate one for you
         */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * A unique identifier for the project logs event. If you don't provide one, BrainTrust will
         * generate one for you
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * The transaction id of an event is unique to the network operation that processed the
         * event insertion. Transaction ids are monotonically increasing over time and can be used
         * to retrieve a versioned snapshot of the project logs (see the `version` parameter)
         */
        fun _xactId(_xactId: String) = _xactId(JsonField.of(_xactId))

        /**
         * The transaction id of an event is unique to the network operation that processed the
         * event insertion. Transaction ids are monotonically increasing over time and can be used
         * to retrieve a versioned snapshot of the project logs (see the `version` parameter)
         */
        fun _xactId(_xactId: JsonField<String>) = apply { this._xactId = _xactId }

        /** The timestamp the project logs event was created */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /** The timestamp the project logs event was created */
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /** A literal 'g' which identifies the log as a project log */
        fun logId(logId: LogId) = logId(JsonField.of(logId))

        /** A literal 'g' which identifies the log as a project log */
        fun logId(logId: JsonField<LogId>) = apply { this.logId = logId }

        /** Unique id for the organization that the project belongs under */
        fun orgId(orgId: String) = orgId(JsonField.of(orgId))

        /** Unique id for the organization that the project belongs under */
        fun orgId(orgId: JsonField<String>) = apply { this.orgId = orgId }

        /** Unique identifier for the project */
        fun projectId(projectId: String) = projectId(JsonField.of(projectId))

        /** Unique identifier for the project */
        fun projectId(projectId: JsonField<String>) = apply { this.projectId = projectId }

        /** A unique identifier for the trace this project logs event belongs to */
        fun rootSpanId(rootSpanId: String) = rootSpanId(JsonField.of(rootSpanId))

        /** A unique identifier for the trace this project logs event belongs to */
        fun rootSpanId(rootSpanId: JsonField<String>) = apply { this.rootSpanId = rootSpanId }

        /**
         * A unique identifier used to link different project logs events together as part of a full
         * trace. See the [tracing guide](https://www.braintrust.dev/docs/guides/tracing) for full
         * details on tracing
         */
        fun spanId(spanId: String) = spanId(JsonField.of(spanId))

        /**
         * A unique identifier used to link different project logs events together as part of a full
         * trace. See the [tracing guide](https://www.braintrust.dev/docs/guides/tracing) for full
         * details on tracing
         */
        fun spanId(spanId: JsonField<String>) = apply { this.spanId = spanId }

        /**
         * Context is additional information about the code that produced the project logs event. It
         * is essentially the textual counterpart to `metrics`. Use the `caller_*` attributes to
         * track the location in code which produced the project logs event
         */
        fun context(context: Context?) = context(JsonField.ofNullable(context))

        /**
         * Context is additional information about the code that produced the project logs event. It
         * is essentially the textual counterpart to `metrics`. Use the `caller_*` attributes to
         * track the location in code which produced the project logs event
         */
        fun context(context: Optional<Context>) = context(context.getOrNull())

        /**
         * Context is additional information about the code that produced the project logs event. It
         * is essentially the textual counterpart to `metrics`. Use the `caller_*` attributes to
         * track the location in code which produced the project logs event
         */
        fun context(context: JsonField<Context>) = apply { this.context = context }

        /** The error that occurred, if any. */
        fun error(error: JsonValue) = apply { this.error = error }

        /**
         * The ground truth value (an arbitrary, JSON serializable object) that you'd compare to
         * `output` to determine if your `output` value is correct or not. Braintrust currently does
         * not compare `output` to `expected` for you, since there are so many different ways to do
         * that correctly. Instead, these values are just used to help you navigate while digging
         * into analyses. However, we may later use these values to re-score outputs or fine-tune
         * your models.
         */
        fun expected(expected: JsonValue) = apply { this.expected = expected }

        /**
         * The arguments that uniquely define a user input (an arbitrary, JSON serializable object).
         */
        fun input(input: JsonValue) = apply { this.input = input }

        /** Whether this span is a root span */
        fun isRoot(isRoot: Boolean?) = isRoot(JsonField.ofNullable(isRoot))

        /** Whether this span is a root span */
        fun isRoot(isRoot: Boolean) = isRoot(isRoot as Boolean?)

        /** Whether this span is a root span */
        fun isRoot(isRoot: Optional<Boolean>) = isRoot(isRoot.getOrNull())

        /** Whether this span is a root span */
        fun isRoot(isRoot: JsonField<Boolean>) = apply { this.isRoot = isRoot }

        /**
         * A dictionary with additional data about the test example, model outputs, or just about
         * anything else that's relevant, that you can use to help find and analyze examples later.
         * For example, you could log the `prompt`, example's `id`, or anything else that would be
         * useful to slice/dice later. The values in `metadata` can be any JSON-serializable type,
         * but its keys must be strings
         */
        fun metadata(metadata: Metadata?) = metadata(JsonField.ofNullable(metadata))

        /**
         * A dictionary with additional data about the test example, model outputs, or just about
         * anything else that's relevant, that you can use to help find and analyze examples later.
         * For example, you could log the `prompt`, example's `id`, or anything else that would be
         * useful to slice/dice later. The values in `metadata` can be any JSON-serializable type,
         * but its keys must be strings
         */
        fun metadata(metadata: Optional<Metadata>) = metadata(metadata.getOrNull())

        /**
         * A dictionary with additional data about the test example, model outputs, or just about
         * anything else that's relevant, that you can use to help find and analyze examples later.
         * For example, you could log the `prompt`, example's `id`, or anything else that would be
         * useful to slice/dice later. The values in `metadata` can be any JSON-serializable type,
         * but its keys must be strings
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        /**
         * Metrics are numerical measurements tracking the execution of the code that produced the
         * project logs event. Use "start" and "end" to track the time span over which the project
         * logs event was produced
         */
        fun metrics(metrics: Metrics?) = metrics(JsonField.ofNullable(metrics))

        /**
         * Metrics are numerical measurements tracking the execution of the code that produced the
         * project logs event. Use "start" and "end" to track the time span over which the project
         * logs event was produced
         */
        fun metrics(metrics: Optional<Metrics>) = metrics(metrics.getOrNull())

        /**
         * Metrics are numerical measurements tracking the execution of the code that produced the
         * project logs event. Use "start" and "end" to track the time span over which the project
         * logs event was produced
         */
        fun metrics(metrics: JsonField<Metrics>) = apply { this.metrics = metrics }

        /** Indicates the event was copied from another object. */
        fun origin(origin: ObjectReference?) = origin(JsonField.ofNullable(origin))

        /** Indicates the event was copied from another object. */
        fun origin(origin: Optional<ObjectReference>) = origin(origin.getOrNull())

        /** Indicates the event was copied from another object. */
        fun origin(origin: JsonField<ObjectReference>) = apply { this.origin = origin }

        /**
         * The output of your application, including post-processing (an arbitrary, JSON
         * serializable object), that allows you to determine whether the result is correct or not.
         * For example, in an app that generates SQL queries, the `output` should be the _result_ of
         * the SQL query generated by the model, not the query itself, because there may be multiple
         * valid queries that answer a single question.
         */
        fun output(output: JsonValue) = apply { this.output = output }

        /**
         * A dictionary of numeric values (between 0 and 1) to log. The scores should give you a
         * variety of signals that help you determine how accurate the outputs are compared to what
         * you expect and diagnose failures. For example, a summarization app might have one score
         * that tells you how accurate the summary is, and another that measures the word similarity
         * between the generated and grouth truth summary. The word similarity score could help you
         * determine whether the summarization was covering similar concepts or not. You can use
         * these scores to help you sort, filter, and compare logs.
         */
        fun scores(scores: Scores?) = scores(JsonField.ofNullable(scores))

        /**
         * A dictionary of numeric values (between 0 and 1) to log. The scores should give you a
         * variety of signals that help you determine how accurate the outputs are compared to what
         * you expect and diagnose failures. For example, a summarization app might have one score
         * that tells you how accurate the summary is, and another that measures the word similarity
         * between the generated and grouth truth summary. The word similarity score could help you
         * determine whether the summarization was covering similar concepts or not. You can use
         * these scores to help you sort, filter, and compare logs.
         */
        fun scores(scores: Optional<Scores>) = scores(scores.getOrNull())

        /**
         * A dictionary of numeric values (between 0 and 1) to log. The scores should give you a
         * variety of signals that help you determine how accurate the outputs are compared to what
         * you expect and diagnose failures. For example, a summarization app might have one score
         * that tells you how accurate the summary is, and another that measures the word similarity
         * between the generated and grouth truth summary. The word similarity score could help you
         * determine whether the summarization was covering similar concepts or not. You can use
         * these scores to help you sort, filter, and compare logs.
         */
        fun scores(scores: JsonField<Scores>) = apply { this.scores = scores }

        /** Human-identifying attributes of the span, such as name, type, etc. */
        fun spanAttributes(spanAttributes: SpanAttributes?) =
            spanAttributes(JsonField.ofNullable(spanAttributes))

        /** Human-identifying attributes of the span, such as name, type, etc. */
        fun spanAttributes(spanAttributes: Optional<SpanAttributes>) =
            spanAttributes(spanAttributes.getOrNull())

        /** Human-identifying attributes of the span, such as name, type, etc. */
        fun spanAttributes(spanAttributes: JsonField<SpanAttributes>) = apply {
            this.spanAttributes = spanAttributes
        }

        /**
         * An array of the parent `span_ids` of this project logs event. This should be empty for
         * the root span of a trace, and should most often contain just one parent element for
         * subspans
         */
        fun spanParents(spanParents: List<String>?) = spanParents(JsonField.ofNullable(spanParents))

        /**
         * An array of the parent `span_ids` of this project logs event. This should be empty for
         * the root span of a trace, and should most often contain just one parent element for
         * subspans
         */
        fun spanParents(spanParents: Optional<List<String>>) = spanParents(spanParents.getOrNull())

        /**
         * An array of the parent `span_ids` of this project logs event. This should be empty for
         * the root span of a trace, and should most often contain just one parent element for
         * subspans
         */
        fun spanParents(spanParents: JsonField<List<String>>) = apply {
            this.spanParents = spanParents.map { it.toMutableList() }
        }

        /**
         * An array of the parent `span_ids` of this project logs event. This should be empty for
         * the root span of a trace, and should most often contain just one parent element for
         * subspans
         */
        fun addSpanParent(spanParent: String) = apply {
            spanParents =
                (spanParents ?: JsonField.of(mutableListOf())).also {
                    checkKnown("spanParents", it).add(spanParent)
                }
        }

        /** A list of tags to log */
        fun tags(tags: List<String>?) = tags(JsonField.ofNullable(tags))

        /** A list of tags to log */
        fun tags(tags: Optional<List<String>>) = tags(tags.getOrNull())

        /** A list of tags to log */
        fun tags(tags: JsonField<List<String>>) = apply {
            this.tags = tags.map { it.toMutableList() }
        }

        /** A list of tags to log */
        fun addTag(tag: String) = apply {
            tags = (tags ?: JsonField.of(mutableListOf())).also { checkKnown("tags", it).add(tag) }
        }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        fun build(): ProjectLogsEvent =
            ProjectLogsEvent(
                checkRequired("id", id),
                checkRequired("_xactId", _xactId),
                checkRequired("created", created),
                checkRequired("logId", logId),
                checkRequired("orgId", orgId),
                checkRequired("projectId", projectId),
                checkRequired("rootSpanId", rootSpanId),
                checkRequired("spanId", spanId),
                context,
                error,
                expected,
                input,
                isRoot,
                metadata,
                metrics,
                origin,
                output,
                scores,
                spanAttributes,
                (spanParents ?: JsonMissing.of()).map { it.toImmutable() },
                (tags ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toImmutable(),
            )
    }

    /** A literal 'g' which identifies the log as a project log */
    class LogId @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val G = of("g")

            @JvmStatic fun of(value: String) = LogId(JsonField.of(value))
        }

        /** An enum containing [LogId]'s known values. */
        enum class Known {
            G
        }

        /**
         * An enum containing [LogId]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [LogId] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            G,
            /** An enum member indicating that [LogId] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                G -> Value.G
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws BraintrustInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                G -> Known.G
                else -> throw BraintrustInvalidDataException("Unknown LogId: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws BraintrustInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                BraintrustInvalidDataException("Value is not a String")
            }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is LogId && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Context is additional information about the code that produced the project logs event. It is
     * essentially the textual counterpart to `metrics`. Use the `caller_*` attributes to track the
     * location in code which produced the project logs event
     */
    @NoAutoDetect
    class Context
    @JsonCreator
    private constructor(
        @JsonProperty("caller_filename")
        @ExcludeMissing
        private val callerFilename: JsonField<String> = JsonMissing.of(),
        @JsonProperty("caller_functionname")
        @ExcludeMissing
        private val callerFunctionname: JsonField<String> = JsonMissing.of(),
        @JsonProperty("caller_lineno")
        @ExcludeMissing
        private val callerLineno: JsonField<Long> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Name of the file in code where the project logs event was created */
        fun callerFilename(): Optional<String> =
            Optional.ofNullable(callerFilename.getNullable("caller_filename"))

        /** The function in code which created the project logs event */
        fun callerFunctionname(): Optional<String> =
            Optional.ofNullable(callerFunctionname.getNullable("caller_functionname"))

        /** Line of code where the project logs event was created */
        fun callerLineno(): Optional<Long> =
            Optional.ofNullable(callerLineno.getNullable("caller_lineno"))

        /** Name of the file in code where the project logs event was created */
        @JsonProperty("caller_filename")
        @ExcludeMissing
        fun _callerFilename(): JsonField<String> = callerFilename

        /** The function in code which created the project logs event */
        @JsonProperty("caller_functionname")
        @ExcludeMissing
        fun _callerFunctionname(): JsonField<String> = callerFunctionname

        /** Line of code where the project logs event was created */
        @JsonProperty("caller_lineno")
        @ExcludeMissing
        fun _callerLineno(): JsonField<Long> = callerLineno

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Context = apply {
            if (validated) {
                return@apply
            }

            callerFilename()
            callerFunctionname()
            callerLineno()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Context]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Context]. */
        class Builder internal constructor() {

            private var callerFilename: JsonField<String> = JsonMissing.of()
            private var callerFunctionname: JsonField<String> = JsonMissing.of()
            private var callerLineno: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(context: Context) = apply {
                callerFilename = context.callerFilename
                callerFunctionname = context.callerFunctionname
                callerLineno = context.callerLineno
                additionalProperties = context.additionalProperties.toMutableMap()
            }

            /** Name of the file in code where the project logs event was created */
            fun callerFilename(callerFilename: String?) =
                callerFilename(JsonField.ofNullable(callerFilename))

            /** Name of the file in code where the project logs event was created */
            fun callerFilename(callerFilename: Optional<String>) =
                callerFilename(callerFilename.getOrNull())

            /** Name of the file in code where the project logs event was created */
            fun callerFilename(callerFilename: JsonField<String>) = apply {
                this.callerFilename = callerFilename
            }

            /** The function in code which created the project logs event */
            fun callerFunctionname(callerFunctionname: String?) =
                callerFunctionname(JsonField.ofNullable(callerFunctionname))

            /** The function in code which created the project logs event */
            fun callerFunctionname(callerFunctionname: Optional<String>) =
                callerFunctionname(callerFunctionname.getOrNull())

            /** The function in code which created the project logs event */
            fun callerFunctionname(callerFunctionname: JsonField<String>) = apply {
                this.callerFunctionname = callerFunctionname
            }

            /** Line of code where the project logs event was created */
            fun callerLineno(callerLineno: Long?) = callerLineno(JsonField.ofNullable(callerLineno))

            /** Line of code where the project logs event was created */
            fun callerLineno(callerLineno: Long) = callerLineno(callerLineno as Long?)

            /** Line of code where the project logs event was created */
            fun callerLineno(callerLineno: Optional<Long>) = callerLineno(callerLineno.getOrNull())

            /** Line of code where the project logs event was created */
            fun callerLineno(callerLineno: JsonField<Long>) = apply {
                this.callerLineno = callerLineno
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            fun build(): Context =
                Context(
                    callerFilename,
                    callerFunctionname,
                    callerLineno,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Context && callerFilename == other.callerFilename && callerFunctionname == other.callerFunctionname && callerLineno == other.callerLineno && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(callerFilename, callerFunctionname, callerLineno, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Context{callerFilename=$callerFilename, callerFunctionname=$callerFunctionname, callerLineno=$callerLineno, additionalProperties=$additionalProperties}"
    }

    /**
     * A dictionary with additional data about the test example, model outputs, or just about
     * anything else that's relevant, that you can use to help find and analyze examples later. For
     * example, you could log the `prompt`, example's `id`, or anything else that would be useful to
     * slice/dice later. The values in `metadata` can be any JSON-serializable type, but its keys
     * must be strings
     */
    @NoAutoDetect
    class Metadata
    @JsonCreator
    private constructor(
        @JsonProperty("model")
        @ExcludeMissing
        private val model: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The model used for this example */
        fun model(): Optional<String> = Optional.ofNullable(model.getNullable("model"))

        /** The model used for this example */
        @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<String> = model

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Metadata = apply {
            if (validated) {
                return@apply
            }

            model()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Metadata]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Metadata]. */
        class Builder internal constructor() {

            private var model: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(metadata: Metadata) = apply {
                model = metadata.model
                additionalProperties = metadata.additionalProperties.toMutableMap()
            }

            /** The model used for this example */
            fun model(model: String?) = model(JsonField.ofNullable(model))

            /** The model used for this example */
            fun model(model: Optional<String>) = model(model.getOrNull())

            /** The model used for this example */
            fun model(model: JsonField<String>) = apply { this.model = model }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            fun build(): Metadata = Metadata(model, additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Metadata && model == other.model && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(model, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Metadata{model=$model, additionalProperties=$additionalProperties}"
    }

    /**
     * Metrics are numerical measurements tracking the execution of the code that produced the
     * project logs event. Use "start" and "end" to track the time span over which the project logs
     * event was produced
     */
    @NoAutoDetect
    class Metrics
    @JsonCreator
    private constructor(
        @JsonProperty("caller_filename")
        @ExcludeMissing
        private val callerFilename: JsonValue = JsonMissing.of(),
        @JsonProperty("caller_functionname")
        @ExcludeMissing
        private val callerFunctionname: JsonValue = JsonMissing.of(),
        @JsonProperty("caller_lineno")
        @ExcludeMissing
        private val callerLineno: JsonValue = JsonMissing.of(),
        @JsonProperty("completion_tokens")
        @ExcludeMissing
        private val completionTokens: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("end") @ExcludeMissing private val end: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("prompt_tokens")
        @ExcludeMissing
        private val promptTokens: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("start")
        @ExcludeMissing
        private val start: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("tokens")
        @ExcludeMissing
        private val tokens: JsonField<Long> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** This metric is deprecated */
        @JsonProperty("caller_filename")
        @ExcludeMissing
        fun _callerFilename(): JsonValue = callerFilename

        /** This metric is deprecated */
        @JsonProperty("caller_functionname")
        @ExcludeMissing
        fun _callerFunctionname(): JsonValue = callerFunctionname

        /** This metric is deprecated */
        @JsonProperty("caller_lineno") @ExcludeMissing fun _callerLineno(): JsonValue = callerLineno

        /**
         * The number of tokens in the completion generated by the model (only set if this is an LLM
         * span)
         */
        fun completionTokens(): Optional<Long> =
            Optional.ofNullable(completionTokens.getNullable("completion_tokens"))

        /**
         * A unix timestamp recording when the section of code which produced the project logs event
         * finished
         */
        fun end(): Optional<Double> = Optional.ofNullable(end.getNullable("end"))

        /**
         * The number of tokens in the prompt used to generate the project logs event (only set if
         * this is an LLM span)
         */
        fun promptTokens(): Optional<Long> =
            Optional.ofNullable(promptTokens.getNullable("prompt_tokens"))

        /**
         * A unix timestamp recording when the section of code which produced the project logs event
         * started
         */
        fun start(): Optional<Double> = Optional.ofNullable(start.getNullable("start"))

        /** The total number of tokens in the input and output of the project logs event. */
        fun tokens(): Optional<Long> = Optional.ofNullable(tokens.getNullable("tokens"))

        /**
         * The number of tokens in the completion generated by the model (only set if this is an LLM
         * span)
         */
        @JsonProperty("completion_tokens")
        @ExcludeMissing
        fun _completionTokens(): JsonField<Long> = completionTokens

        /**
         * A unix timestamp recording when the section of code which produced the project logs event
         * finished
         */
        @JsonProperty("end") @ExcludeMissing fun _end(): JsonField<Double> = end

        /**
         * The number of tokens in the prompt used to generate the project logs event (only set if
         * this is an LLM span)
         */
        @JsonProperty("prompt_tokens")
        @ExcludeMissing
        fun _promptTokens(): JsonField<Long> = promptTokens

        /**
         * A unix timestamp recording when the section of code which produced the project logs event
         * started
         */
        @JsonProperty("start") @ExcludeMissing fun _start(): JsonField<Double> = start

        /** The total number of tokens in the input and output of the project logs event. */
        @JsonProperty("tokens") @ExcludeMissing fun _tokens(): JsonField<Long> = tokens

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Metrics = apply {
            if (validated) {
                return@apply
            }

            completionTokens()
            end()
            promptTokens()
            start()
            tokens()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Metrics]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Metrics]. */
        class Builder internal constructor() {

            private var callerFilename: JsonValue = JsonMissing.of()
            private var callerFunctionname: JsonValue = JsonMissing.of()
            private var callerLineno: JsonValue = JsonMissing.of()
            private var completionTokens: JsonField<Long> = JsonMissing.of()
            private var end: JsonField<Double> = JsonMissing.of()
            private var promptTokens: JsonField<Long> = JsonMissing.of()
            private var start: JsonField<Double> = JsonMissing.of()
            private var tokens: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(metrics: Metrics) = apply {
                callerFilename = metrics.callerFilename
                callerFunctionname = metrics.callerFunctionname
                callerLineno = metrics.callerLineno
                completionTokens = metrics.completionTokens
                end = metrics.end
                promptTokens = metrics.promptTokens
                start = metrics.start
                tokens = metrics.tokens
                additionalProperties = metrics.additionalProperties.toMutableMap()
            }

            /** This metric is deprecated */
            fun callerFilename(callerFilename: JsonValue) = apply {
                this.callerFilename = callerFilename
            }

            /** This metric is deprecated */
            fun callerFunctionname(callerFunctionname: JsonValue) = apply {
                this.callerFunctionname = callerFunctionname
            }

            /** This metric is deprecated */
            fun callerLineno(callerLineno: JsonValue) = apply { this.callerLineno = callerLineno }

            /**
             * The number of tokens in the completion generated by the model (only set if this is an
             * LLM span)
             */
            fun completionTokens(completionTokens: Long?) =
                completionTokens(JsonField.ofNullable(completionTokens))

            /**
             * The number of tokens in the completion generated by the model (only set if this is an
             * LLM span)
             */
            fun completionTokens(completionTokens: Long) =
                completionTokens(completionTokens as Long?)

            /**
             * The number of tokens in the completion generated by the model (only set if this is an
             * LLM span)
             */
            fun completionTokens(completionTokens: Optional<Long>) =
                completionTokens(completionTokens.getOrNull())

            /**
             * The number of tokens in the completion generated by the model (only set if this is an
             * LLM span)
             */
            fun completionTokens(completionTokens: JsonField<Long>) = apply {
                this.completionTokens = completionTokens
            }

            /**
             * A unix timestamp recording when the section of code which produced the project logs
             * event finished
             */
            fun end(end: Double?) = end(JsonField.ofNullable(end))

            /**
             * A unix timestamp recording when the section of code which produced the project logs
             * event finished
             */
            fun end(end: Double) = end(end as Double?)

            /**
             * A unix timestamp recording when the section of code which produced the project logs
             * event finished
             */
            fun end(end: Optional<Double>) = end(end.getOrNull())

            /**
             * A unix timestamp recording when the section of code which produced the project logs
             * event finished
             */
            fun end(end: JsonField<Double>) = apply { this.end = end }

            /**
             * The number of tokens in the prompt used to generate the project logs event (only set
             * if this is an LLM span)
             */
            fun promptTokens(promptTokens: Long?) = promptTokens(JsonField.ofNullable(promptTokens))

            /**
             * The number of tokens in the prompt used to generate the project logs event (only set
             * if this is an LLM span)
             */
            fun promptTokens(promptTokens: Long) = promptTokens(promptTokens as Long?)

            /**
             * The number of tokens in the prompt used to generate the project logs event (only set
             * if this is an LLM span)
             */
            fun promptTokens(promptTokens: Optional<Long>) = promptTokens(promptTokens.getOrNull())

            /**
             * The number of tokens in the prompt used to generate the project logs event (only set
             * if this is an LLM span)
             */
            fun promptTokens(promptTokens: JsonField<Long>) = apply {
                this.promptTokens = promptTokens
            }

            /**
             * A unix timestamp recording when the section of code which produced the project logs
             * event started
             */
            fun start(start: Double?) = start(JsonField.ofNullable(start))

            /**
             * A unix timestamp recording when the section of code which produced the project logs
             * event started
             */
            fun start(start: Double) = start(start as Double?)

            /**
             * A unix timestamp recording when the section of code which produced the project logs
             * event started
             */
            fun start(start: Optional<Double>) = start(start.getOrNull())

            /**
             * A unix timestamp recording when the section of code which produced the project logs
             * event started
             */
            fun start(start: JsonField<Double>) = apply { this.start = start }

            /** The total number of tokens in the input and output of the project logs event. */
            fun tokens(tokens: Long?) = tokens(JsonField.ofNullable(tokens))

            /** The total number of tokens in the input and output of the project logs event. */
            fun tokens(tokens: Long) = tokens(tokens as Long?)

            /** The total number of tokens in the input and output of the project logs event. */
            fun tokens(tokens: Optional<Long>) = tokens(tokens.getOrNull())

            /** The total number of tokens in the input and output of the project logs event. */
            fun tokens(tokens: JsonField<Long>) = apply { this.tokens = tokens }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            fun build(): Metrics =
                Metrics(
                    callerFilename,
                    callerFunctionname,
                    callerLineno,
                    completionTokens,
                    end,
                    promptTokens,
                    start,
                    tokens,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Metrics && callerFilename == other.callerFilename && callerFunctionname == other.callerFunctionname && callerLineno == other.callerLineno && completionTokens == other.completionTokens && end == other.end && promptTokens == other.promptTokens && start == other.start && tokens == other.tokens && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(callerFilename, callerFunctionname, callerLineno, completionTokens, end, promptTokens, start, tokens, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Metrics{callerFilename=$callerFilename, callerFunctionname=$callerFunctionname, callerLineno=$callerLineno, completionTokens=$completionTokens, end=$end, promptTokens=$promptTokens, start=$start, tokens=$tokens, additionalProperties=$additionalProperties}"
    }

    /**
     * A dictionary of numeric values (between 0 and 1) to log. The scores should give you a variety
     * of signals that help you determine how accurate the outputs are compared to what you expect
     * and diagnose failures. For example, a summarization app might have one score that tells you
     * how accurate the summary is, and another that measures the word similarity between the
     * generated and grouth truth summary. The word similarity score could help you determine
     * whether the summarization was covering similar concepts or not. You can use these scores to
     * help you sort, filter, and compare logs.
     */
    @NoAutoDetect
    class Scores
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Scores = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Scores]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Scores]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(scores: Scores) = apply {
                additionalProperties = scores.additionalProperties.toMutableMap()
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            fun build(): Scores = Scores(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Scores && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Scores{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ProjectLogsEvent && id == other.id && _xactId == other._xactId && created == other.created && logId == other.logId && orgId == other.orgId && projectId == other.projectId && rootSpanId == other.rootSpanId && spanId == other.spanId && context == other.context && error == other.error && expected == other.expected && input == other.input && isRoot == other.isRoot && metadata == other.metadata && metrics == other.metrics && origin == other.origin && output == other.output && scores == other.scores && spanAttributes == other.spanAttributes && spanParents == other.spanParents && tags == other.tags && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, _xactId, created, logId, orgId, projectId, rootSpanId, spanId, context, error, expected, input, isRoot, metadata, metrics, origin, output, scores, spanAttributes, spanParents, tags, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ProjectLogsEvent{id=$id, _xactId=$_xactId, created=$created, logId=$logId, orgId=$orgId, projectId=$projectId, rootSpanId=$rootSpanId, spanId=$spanId, context=$context, error=$error, expected=$expected, input=$input, isRoot=$isRoot, metadata=$metadata, metrics=$metrics, origin=$origin, output=$output, scores=$scores, spanAttributes=$spanAttributes, spanParents=$spanParents, tags=$tags, additionalProperties=$additionalProperties}"
}
