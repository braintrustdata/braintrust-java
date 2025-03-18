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
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The transaction id of an event is unique to the network operation that processed the event
     * insertion. Transaction ids are monotonically increasing over time and can be used to retrieve
     * a versioned snapshot of the project logs (see the `version` parameter)
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun _xactId(): String = _xactId.getRequired("_xact_id")

    /**
     * The timestamp the project logs event was created
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun created(): OffsetDateTime = created.getRequired("created")

    /**
     * A literal 'g' which identifies the log as a project log
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun logId(): LogId = logId.getRequired("log_id")

    /**
     * Unique id for the organization that the project belongs under
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun orgId(): String = orgId.getRequired("org_id")

    /**
     * Unique identifier for the project
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun projectId(): String = projectId.getRequired("project_id")

    /**
     * A unique identifier for the trace this project logs event belongs to
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun rootSpanId(): String = rootSpanId.getRequired("root_span_id")

    /**
     * A unique identifier used to link different project logs events together as part of a full
     * trace. See the [tracing guide](https://www.braintrust.dev/docs/guides/tracing) for full
     * details on tracing
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun spanId(): String = spanId.getRequired("span_id")

    /**
     * Context is additional information about the code that produced the project logs event. It is
     * essentially the textual counterpart to `metrics`. Use the `caller_*` attributes to track the
     * location in code which produced the project logs event
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
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

    /**
     * Whether this span is a root span
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isRoot(): Optional<Boolean> = Optional.ofNullable(isRoot.getNullable("is_root"))

    /**
     * A dictionary with additional data about the test example, model outputs, or just about
     * anything else that's relevant, that you can use to help find and analyze examples later. For
     * example, you could log the `prompt`, example's `id`, or anything else that would be useful to
     * slice/dice later. The values in `metadata` can be any JSON-serializable type, but its keys
     * must be strings
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata.getNullable("metadata"))

    /**
     * Metrics are numerical measurements tracking the execution of the code that produced the
     * project logs event. Use "start" and "end" to track the time span over which the project logs
     * event was produced
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun metrics(): Optional<Metrics> = Optional.ofNullable(metrics.getNullable("metrics"))

    /**
     * Indicates the event was copied from another object.
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
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
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun scores(): Optional<Scores> = Optional.ofNullable(scores.getNullable("scores"))

    /**
     * Human-identifying attributes of the span, such as name, type, etc.
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun spanAttributes(): Optional<SpanAttributes> =
        Optional.ofNullable(spanAttributes.getNullable("span_attributes"))

    /**
     * An array of the parent `span_ids` of this project logs event. This should be empty for the
     * root span of a trace, and should most often contain just one parent element for subspans
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun spanParents(): Optional<List<String>> =
        Optional.ofNullable(spanParents.getNullable("span_parents"))

    /**
     * A list of tags to log
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tags(): Optional<List<String>> = Optional.ofNullable(tags.getNullable("tags"))

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [_xactId].
     *
     * Unlike [_xactId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("_xact_id") @ExcludeMissing fun __xactId(): JsonField<String> = _xactId

    /**
     * Returns the raw JSON value of [created].
     *
     * Unlike [created], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<OffsetDateTime> = created

    /**
     * Returns the raw JSON value of [logId].
     *
     * Unlike [logId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("log_id") @ExcludeMissing fun _logId(): JsonField<LogId> = logId

    /**
     * Returns the raw JSON value of [orgId].
     *
     * Unlike [orgId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("org_id") @ExcludeMissing fun _orgId(): JsonField<String> = orgId

    /**
     * Returns the raw JSON value of [projectId].
     *
     * Unlike [projectId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("project_id") @ExcludeMissing fun _projectId(): JsonField<String> = projectId

    /**
     * Returns the raw JSON value of [rootSpanId].
     *
     * Unlike [rootSpanId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("root_span_id") @ExcludeMissing fun _rootSpanId(): JsonField<String> = rootSpanId

    /**
     * Returns the raw JSON value of [spanId].
     *
     * Unlike [spanId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("span_id") @ExcludeMissing fun _spanId(): JsonField<String> = spanId

    /**
     * Returns the raw JSON value of [context].
     *
     * Unlike [context], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("context") @ExcludeMissing fun _context(): JsonField<Context> = context

    /**
     * Returns the raw JSON value of [isRoot].
     *
     * Unlike [isRoot], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("is_root") @ExcludeMissing fun _isRoot(): JsonField<Boolean> = isRoot

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    /**
     * Returns the raw JSON value of [metrics].
     *
     * Unlike [metrics], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("metrics") @ExcludeMissing fun _metrics(): JsonField<Metrics> = metrics

    /**
     * Returns the raw JSON value of [origin].
     *
     * Unlike [origin], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("origin") @ExcludeMissing fun _origin(): JsonField<ObjectReference> = origin

    /**
     * Returns the raw JSON value of [scores].
     *
     * Unlike [scores], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("scores") @ExcludeMissing fun _scores(): JsonField<Scores> = scores

    /**
     * Returns the raw JSON value of [spanAttributes].
     *
     * Unlike [spanAttributes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("span_attributes")
    @ExcludeMissing
    fun _spanAttributes(): JsonField<SpanAttributes> = spanAttributes

    /**
     * Returns the raw JSON value of [spanParents].
     *
     * Unlike [spanParents], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("span_parents")
    @ExcludeMissing
    fun _spanParents(): JsonField<List<String>> = spanParents

    /**
     * Returns the raw JSON value of [tags].
     *
     * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
     */
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
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * The transaction id of an event is unique to the network operation that processed the
         * event insertion. Transaction ids are monotonically increasing over time and can be used
         * to retrieve a versioned snapshot of the project logs (see the `version` parameter)
         */
        fun _xactId(_xactId: String) = _xactId(JsonField.of(_xactId))

        /**
         * Sets [Builder._xactId] to an arbitrary JSON value.
         *
         * You should usually call [Builder._xactId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun _xactId(_xactId: JsonField<String>) = apply { this._xactId = _xactId }

        /** The timestamp the project logs event was created */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /**
         * Sets [Builder.created] to an arbitrary JSON value.
         *
         * You should usually call [Builder.created] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /** A literal 'g' which identifies the log as a project log */
        fun logId(logId: LogId) = logId(JsonField.of(logId))

        /**
         * Sets [Builder.logId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.logId] with a well-typed [LogId] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun logId(logId: JsonField<LogId>) = apply { this.logId = logId }

        /** Unique id for the organization that the project belongs under */
        fun orgId(orgId: String) = orgId(JsonField.of(orgId))

        /**
         * Sets [Builder.orgId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.orgId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun orgId(orgId: JsonField<String>) = apply { this.orgId = orgId }

        /** Unique identifier for the project */
        fun projectId(projectId: String) = projectId(JsonField.of(projectId))

        /**
         * Sets [Builder.projectId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.projectId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun projectId(projectId: JsonField<String>) = apply { this.projectId = projectId }

        /** A unique identifier for the trace this project logs event belongs to */
        fun rootSpanId(rootSpanId: String) = rootSpanId(JsonField.of(rootSpanId))

        /**
         * Sets [Builder.rootSpanId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rootSpanId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun rootSpanId(rootSpanId: JsonField<String>) = apply { this.rootSpanId = rootSpanId }

        /**
         * A unique identifier used to link different project logs events together as part of a full
         * trace. See the [tracing guide](https://www.braintrust.dev/docs/guides/tracing) for full
         * details on tracing
         */
        fun spanId(spanId: String) = spanId(JsonField.of(spanId))

        /**
         * Sets [Builder.spanId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.spanId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun spanId(spanId: JsonField<String>) = apply { this.spanId = spanId }

        /**
         * Context is additional information about the code that produced the project logs event. It
         * is essentially the textual counterpart to `metrics`. Use the `caller_*` attributes to
         * track the location in code which produced the project logs event
         */
        fun context(context: Context?) = context(JsonField.ofNullable(context))

        /** Alias for calling [Builder.context] with `context.orElse(null)`. */
        fun context(context: Optional<Context>) = context(context.getOrNull())

        /**
         * Sets [Builder.context] to an arbitrary JSON value.
         *
         * You should usually call [Builder.context] with a well-typed [Context] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
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

        /**
         * Alias for [Builder.isRoot].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun isRoot(isRoot: Boolean) = isRoot(isRoot as Boolean?)

        /** Alias for calling [Builder.isRoot] with `isRoot.orElse(null)`. */
        fun isRoot(isRoot: Optional<Boolean>) = isRoot(isRoot.getOrNull())

        /**
         * Sets [Builder.isRoot] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isRoot] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun isRoot(isRoot: JsonField<Boolean>) = apply { this.isRoot = isRoot }

        /**
         * A dictionary with additional data about the test example, model outputs, or just about
         * anything else that's relevant, that you can use to help find and analyze examples later.
         * For example, you could log the `prompt`, example's `id`, or anything else that would be
         * useful to slice/dice later. The values in `metadata` can be any JSON-serializable type,
         * but its keys must be strings
         */
        fun metadata(metadata: Metadata?) = metadata(JsonField.ofNullable(metadata))

        /** Alias for calling [Builder.metadata] with `metadata.orElse(null)`. */
        fun metadata(metadata: Optional<Metadata>) = metadata(metadata.getOrNull())

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        /**
         * Metrics are numerical measurements tracking the execution of the code that produced the
         * project logs event. Use "start" and "end" to track the time span over which the project
         * logs event was produced
         */
        fun metrics(metrics: Metrics?) = metrics(JsonField.ofNullable(metrics))

        /** Alias for calling [Builder.metrics] with `metrics.orElse(null)`. */
        fun metrics(metrics: Optional<Metrics>) = metrics(metrics.getOrNull())

        /**
         * Sets [Builder.metrics] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metrics] with a well-typed [Metrics] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun metrics(metrics: JsonField<Metrics>) = apply { this.metrics = metrics }

        /** Indicates the event was copied from another object. */
        fun origin(origin: ObjectReference?) = origin(JsonField.ofNullable(origin))

        /** Alias for calling [Builder.origin] with `origin.orElse(null)`. */
        fun origin(origin: Optional<ObjectReference>) = origin(origin.getOrNull())

        /**
         * Sets [Builder.origin] to an arbitrary JSON value.
         *
         * You should usually call [Builder.origin] with a well-typed [ObjectReference] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
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

        /** Alias for calling [Builder.scores] with `scores.orElse(null)`. */
        fun scores(scores: Optional<Scores>) = scores(scores.getOrNull())

        /**
         * Sets [Builder.scores] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scores] with a well-typed [Scores] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun scores(scores: JsonField<Scores>) = apply { this.scores = scores }

        /** Human-identifying attributes of the span, such as name, type, etc. */
        fun spanAttributes(spanAttributes: SpanAttributes?) =
            spanAttributes(JsonField.ofNullable(spanAttributes))

        /** Alias for calling [Builder.spanAttributes] with `spanAttributes.orElse(null)`. */
        fun spanAttributes(spanAttributes: Optional<SpanAttributes>) =
            spanAttributes(spanAttributes.getOrNull())

        /**
         * Sets [Builder.spanAttributes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.spanAttributes] with a well-typed [SpanAttributes] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun spanAttributes(spanAttributes: JsonField<SpanAttributes>) = apply {
            this.spanAttributes = spanAttributes
        }

        /**
         * An array of the parent `span_ids` of this project logs event. This should be empty for
         * the root span of a trace, and should most often contain just one parent element for
         * subspans
         */
        fun spanParents(spanParents: List<String>?) = spanParents(JsonField.ofNullable(spanParents))

        /** Alias for calling [Builder.spanParents] with `spanParents.orElse(null)`. */
        fun spanParents(spanParents: Optional<List<String>>) = spanParents(spanParents.getOrNull())

        /**
         * Sets [Builder.spanParents] to an arbitrary JSON value.
         *
         * You should usually call [Builder.spanParents] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun spanParents(spanParents: JsonField<List<String>>) = apply {
            this.spanParents = spanParents.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [spanParents].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSpanParent(spanParent: String) = apply {
            spanParents =
                (spanParents ?: JsonField.of(mutableListOf())).also {
                    checkKnown("spanParents", it).add(spanParent)
                }
        }

        /** A list of tags to log */
        fun tags(tags: List<String>?) = tags(JsonField.ofNullable(tags))

        /** Alias for calling [Builder.tags] with `tags.orElse(null)`. */
        fun tags(tags: Optional<List<String>>) = tags(tags.getOrNull())

        /**
         * Sets [Builder.tags] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tags] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tags(tags: JsonField<List<String>>) = apply {
            this.tags = tags.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [tags].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
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

        /**
         * Returns an immutable instance of [ProjectLogsEvent].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
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
         *
         * @throws IllegalStateException if any required field is unset.
         */
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

        /**
         * Name of the file in code where the project logs event was created
         *
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun callerFilename(): Optional<String> =
            Optional.ofNullable(callerFilename.getNullable("caller_filename"))

        /**
         * The function in code which created the project logs event
         *
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun callerFunctionname(): Optional<String> =
            Optional.ofNullable(callerFunctionname.getNullable("caller_functionname"))

        /**
         * Line of code where the project logs event was created
         *
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun callerLineno(): Optional<Long> =
            Optional.ofNullable(callerLineno.getNullable("caller_lineno"))

        /**
         * Returns the raw JSON value of [callerFilename].
         *
         * Unlike [callerFilename], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("caller_filename")
        @ExcludeMissing
        fun _callerFilename(): JsonField<String> = callerFilename

        /**
         * Returns the raw JSON value of [callerFunctionname].
         *
         * Unlike [callerFunctionname], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("caller_functionname")
        @ExcludeMissing
        fun _callerFunctionname(): JsonField<String> = callerFunctionname

        /**
         * Returns the raw JSON value of [callerLineno].
         *
         * Unlike [callerLineno], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
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

            /** Alias for calling [Builder.callerFilename] with `callerFilename.orElse(null)`. */
            fun callerFilename(callerFilename: Optional<String>) =
                callerFilename(callerFilename.getOrNull())

            /**
             * Sets [Builder.callerFilename] to an arbitrary JSON value.
             *
             * You should usually call [Builder.callerFilename] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun callerFilename(callerFilename: JsonField<String>) = apply {
                this.callerFilename = callerFilename
            }

            /** The function in code which created the project logs event */
            fun callerFunctionname(callerFunctionname: String?) =
                callerFunctionname(JsonField.ofNullable(callerFunctionname))

            /**
             * Alias for calling [Builder.callerFunctionname] with
             * `callerFunctionname.orElse(null)`.
             */
            fun callerFunctionname(callerFunctionname: Optional<String>) =
                callerFunctionname(callerFunctionname.getOrNull())

            /**
             * Sets [Builder.callerFunctionname] to an arbitrary JSON value.
             *
             * You should usually call [Builder.callerFunctionname] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun callerFunctionname(callerFunctionname: JsonField<String>) = apply {
                this.callerFunctionname = callerFunctionname
            }

            /** Line of code where the project logs event was created */
            fun callerLineno(callerLineno: Long?) = callerLineno(JsonField.ofNullable(callerLineno))

            /**
             * Alias for [Builder.callerLineno].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun callerLineno(callerLineno: Long) = callerLineno(callerLineno as Long?)

            /** Alias for calling [Builder.callerLineno] with `callerLineno.orElse(null)`. */
            fun callerLineno(callerLineno: Optional<Long>) = callerLineno(callerLineno.getOrNull())

            /**
             * Sets [Builder.callerLineno] to an arbitrary JSON value.
             *
             * You should usually call [Builder.callerLineno] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
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

            /**
             * Returns an immutable instance of [Context].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
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

        /**
         * The model used for this example
         *
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun model(): Optional<String> = Optional.ofNullable(model.getNullable("model"))

        /**
         * Returns the raw JSON value of [model].
         *
         * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
         */
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

            /** Alias for calling [Builder.model] with `model.orElse(null)`. */
            fun model(model: Optional<String>) = model(model.getOrNull())

            /**
             * Sets [Builder.model] to an arbitrary JSON value.
             *
             * You should usually call [Builder.model] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
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

            /**
             * Returns an immutable instance of [Metadata].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
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
         *
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun completionTokens(): Optional<Long> =
            Optional.ofNullable(completionTokens.getNullable("completion_tokens"))

        /**
         * A unix timestamp recording when the section of code which produced the project logs event
         * finished
         *
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun end(): Optional<Double> = Optional.ofNullable(end.getNullable("end"))

        /**
         * The number of tokens in the prompt used to generate the project logs event (only set if
         * this is an LLM span)
         *
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun promptTokens(): Optional<Long> =
            Optional.ofNullable(promptTokens.getNullable("prompt_tokens"))

        /**
         * A unix timestamp recording when the section of code which produced the project logs event
         * started
         *
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun start(): Optional<Double> = Optional.ofNullable(start.getNullable("start"))

        /**
         * The total number of tokens in the input and output of the project logs event.
         *
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun tokens(): Optional<Long> = Optional.ofNullable(tokens.getNullable("tokens"))

        /**
         * Returns the raw JSON value of [completionTokens].
         *
         * Unlike [completionTokens], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("completion_tokens")
        @ExcludeMissing
        fun _completionTokens(): JsonField<Long> = completionTokens

        /**
         * Returns the raw JSON value of [end].
         *
         * Unlike [end], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("end") @ExcludeMissing fun _end(): JsonField<Double> = end

        /**
         * Returns the raw JSON value of [promptTokens].
         *
         * Unlike [promptTokens], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("prompt_tokens")
        @ExcludeMissing
        fun _promptTokens(): JsonField<Long> = promptTokens

        /**
         * Returns the raw JSON value of [start].
         *
         * Unlike [start], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("start") @ExcludeMissing fun _start(): JsonField<Double> = start

        /**
         * Returns the raw JSON value of [tokens].
         *
         * Unlike [tokens], this method doesn't throw if the JSON field has an unexpected type.
         */
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
             * Alias for [Builder.completionTokens].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun completionTokens(completionTokens: Long) =
                completionTokens(completionTokens as Long?)

            /**
             * Alias for calling [Builder.completionTokens] with `completionTokens.orElse(null)`.
             */
            fun completionTokens(completionTokens: Optional<Long>) =
                completionTokens(completionTokens.getOrNull())

            /**
             * Sets [Builder.completionTokens] to an arbitrary JSON value.
             *
             * You should usually call [Builder.completionTokens] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * Alias for [Builder.end].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun end(end: Double) = end(end as Double?)

            /** Alias for calling [Builder.end] with `end.orElse(null)`. */
            fun end(end: Optional<Double>) = end(end.getOrNull())

            /**
             * Sets [Builder.end] to an arbitrary JSON value.
             *
             * You should usually call [Builder.end] with a well-typed [Double] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun end(end: JsonField<Double>) = apply { this.end = end }

            /**
             * The number of tokens in the prompt used to generate the project logs event (only set
             * if this is an LLM span)
             */
            fun promptTokens(promptTokens: Long?) = promptTokens(JsonField.ofNullable(promptTokens))

            /**
             * Alias for [Builder.promptTokens].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun promptTokens(promptTokens: Long) = promptTokens(promptTokens as Long?)

            /** Alias for calling [Builder.promptTokens] with `promptTokens.orElse(null)`. */
            fun promptTokens(promptTokens: Optional<Long>) = promptTokens(promptTokens.getOrNull())

            /**
             * Sets [Builder.promptTokens] to an arbitrary JSON value.
             *
             * You should usually call [Builder.promptTokens] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * Alias for [Builder.start].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun start(start: Double) = start(start as Double?)

            /** Alias for calling [Builder.start] with `start.orElse(null)`. */
            fun start(start: Optional<Double>) = start(start.getOrNull())

            /**
             * Sets [Builder.start] to an arbitrary JSON value.
             *
             * You should usually call [Builder.start] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun start(start: JsonField<Double>) = apply { this.start = start }

            /** The total number of tokens in the input and output of the project logs event. */
            fun tokens(tokens: Long?) = tokens(JsonField.ofNullable(tokens))

            /**
             * Alias for [Builder.tokens].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun tokens(tokens: Long) = tokens(tokens as Long?)

            /** Alias for calling [Builder.tokens] with `tokens.orElse(null)`. */
            fun tokens(tokens: Optional<Long>) = tokens(tokens.getOrNull())

            /**
             * Sets [Builder.tokens] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tokens] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
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

            /**
             * Returns an immutable instance of [Metrics].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
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

            /**
             * Returns an immutable instance of [Scores].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
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
