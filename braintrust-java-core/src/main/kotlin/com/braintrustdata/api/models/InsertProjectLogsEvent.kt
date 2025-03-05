// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.checkKnown
import com.braintrustdata.api.core.immutableEmptyMap
import com.braintrustdata.api.core.toImmutable
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

/** A project logs event */
@NoAutoDetect
class InsertProjectLogsEvent
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("_is_merge")
    @ExcludeMissing
    private val _isMerge: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("_merge_paths")
    @ExcludeMissing
    private val _mergePaths: JsonField<List<List<String>>> = JsonMissing.of(),
    @JsonProperty("_object_delete")
    @ExcludeMissing
    private val _objectDelete: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("_parent_id")
    @ExcludeMissing
    private val _parentId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("context")
    @ExcludeMissing
    private val context: JsonField<Context> = JsonMissing.of(),
    @JsonProperty("created")
    @ExcludeMissing
    private val created: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("error") @ExcludeMissing private val error: JsonValue = JsonMissing.of(),
    @JsonProperty("expected") @ExcludeMissing private val expected: JsonValue = JsonMissing.of(),
    @JsonProperty("input") @ExcludeMissing private val input: JsonValue = JsonMissing.of(),
    @JsonProperty("metadata")
    @ExcludeMissing
    private val metadata: JsonField<Metadata> = JsonMissing.of(),
    @JsonProperty("metrics")
    @ExcludeMissing
    private val metrics: JsonField<Metrics> = JsonMissing.of(),
    @JsonProperty("output") @ExcludeMissing private val output: JsonValue = JsonMissing.of(),
    @JsonProperty("root_span_id")
    @ExcludeMissing
    private val rootSpanId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("scores")
    @ExcludeMissing
    private val scores: JsonField<Scores> = JsonMissing.of(),
    @JsonProperty("span_attributes")
    @ExcludeMissing
    private val spanAttributes: JsonField<SpanAttributes> = JsonMissing.of(),
    @JsonProperty("span_id")
    @ExcludeMissing
    private val spanId: JsonField<String> = JsonMissing.of(),
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
    fun id(): Optional<String> = Optional.ofNullable(id.getNullable("id"))

    /**
     * The `_is_merge` field controls how the row is merged with any existing row with the same id
     * in the DB. By default (or when set to `false`), the existing row is completely replaced by
     * the new row. When set to `true`, the new row is deep-merged into the existing row, if one is
     * found. If no existing row is found, the new row is inserted as is.
     *
     * For example, say there is an existing row in the DB `{"id": "foo", "input": {"a": 5, "b":
     * 10}}`. If we merge a new row as `{"_is_merge": true, "id": "foo", "input": {"b": 11, "c":
     * 20}}`, the new row will be `{"id": "foo", "input": {"a": 5, "b": 11, "c": 20}}`. If we
     * replace the new row as `{"id": "foo", "input": {"b": 11, "c": 20}}`, the new row will be
     * `{"id": "foo", "input": {"b": 11, "c": 20}}`
     */
    fun _isMerge(): Optional<Boolean> = Optional.ofNullable(_isMerge.getNullable("_is_merge"))

    /**
     * The `_merge_paths` field allows controlling the depth of the merge, when `_is_merge=true`.
     * `_merge_paths` is a list of paths, where each path is a list of field names. The deep merge
     * will not descend below any of the specified merge paths.
     *
     * For example, say there is an existing row in the DB `{"id": "foo", "input": {"a": {"b": 10},
     * "c": {"d": 20}}, "output": {"a": 20}}`. If we merge a new row as `{"_is_merge": true,
     * "_merge_paths": [["input", "a"], ["output"]], "input": {"a": {"q": 30}, "c": {"e": 30},
     * "bar": "baz"}, "output": {"d": 40}}`, the new row will be `{"id": "foo": "input": {"a": {"q":
     * 30}, "c": {"d": 20, "e": 30}, "bar": "baz"}, "output": {"d": 40}}`. In this case, due to the
     * merge paths, we have replaced `input.a` and `output`, but have still deep-merged `input` and
     * `input.c`.
     */
    fun _mergePaths(): Optional<List<List<String>>> =
        Optional.ofNullable(_mergePaths.getNullable("_merge_paths"))

    /**
     * Pass `_object_delete=true` to mark the project logs event deleted. Deleted events will not
     * show up in subsequent fetches for this project logs
     */
    fun _objectDelete(): Optional<Boolean> =
        Optional.ofNullable(_objectDelete.getNullable("_object_delete"))

    /**
     * Use the `_parent_id` field to create this row as a subspan of an existing row. Tracking
     * hierarchical relationships are important for tracing (see the
     * [guide](https://www.braintrust.dev/docs/guides/tracing) for full details).
     *
     * For example, say we have logged a row `{"id": "abc", "input": "foo", "output": "bar",
     * "expected": "boo", "scores": {"correctness": 0.33}}`. We can create a sub-span of the parent
     * row by logging `{"_parent_id": "abc", "id": "llm_call", "input": {"prompt": "What comes after
     * foo?"}, "output": "bar", "metrics": {"tokens": 1}}`. In the webapp, only the root span row
     * `"abc"` will show up in the summary view. You can view the full trace hierarchy (in this
     * case, the `"llm_call"` row) by clicking on the "abc" row.
     *
     * If the row is being merged into an existing row, this field will be ignored.
     */
    fun _parentId(): Optional<String> = Optional.ofNullable(_parentId.getNullable("_parent_id"))

    /**
     * Context is additional information about the code that produced the project logs event. It is
     * essentially the textual counterpart to `metrics`. Use the `caller_*` attributes to track the
     * location in code which produced the project logs event
     */
    fun context(): Optional<Context> = Optional.ofNullable(context.getNullable("context"))

    /** The timestamp the project logs event was created */
    fun created(): Optional<OffsetDateTime> = Optional.ofNullable(created.getNullable("created"))

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

    /**
     * The output of your application, including post-processing (an arbitrary, JSON serializable
     * object), that allows you to determine whether the result is correct or not. For example, in
     * an app that generates SQL queries, the `output` should be the _result_ of the SQL query
     * generated by the model, not the query itself, because there may be multiple valid queries
     * that answer a single question.
     */
    @JsonProperty("output") @ExcludeMissing fun _output(): JsonValue = output

    /**
     * Use span_id, root_span_id, and span_parents as a more explicit alternative to \_parent_id.
     * The span_id is a unique identifier describing the row's place in the a trace, and the
     * root_span_id is a unique identifier for the whole trace. See the
     * [guide](https://www.braintrust.dev/docs/guides/tracing) for full details.
     *
     * For example, say we have logged a row `{"id": "abc", "span_id": "span0", "root_span_id":
     * "root_span0", "input": "foo", "output": "bar", "expected": "boo", "scores": {"correctness":
     * 0.33}}`. We can create a sub-span of the parent row by logging `{"id": "llm_call", "span_id":
     * "span1", "root_span_id": "root_span0", "span_parents": ["span0"], "input": {"prompt": "What
     * comes after foo?"}, "output": "bar", "metrics": {"tokens": 1}}`. In the webapp, only the root
     * span row `"abc"` will show up in the summary view. You can view the full trace hierarchy (in
     * this case, the `"llm_call"` row) by clicking on the "abc" row.
     *
     * If the row is being merged into an existing row, this field will be ignored.
     */
    fun rootSpanId(): Optional<String> = Optional.ofNullable(rootSpanId.getNullable("root_span_id"))

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
     * Use span_id, root_span_id, and span_parents as a more explicit alternative to \_parent_id.
     * The span_id is a unique identifier describing the row's place in the a trace, and the
     * root_span_id is a unique identifier for the whole trace. See the
     * [guide](https://www.braintrust.dev/docs/guides/tracing) for full details.
     *
     * For example, say we have logged a row `{"id": "abc", "span_id": "span0", "root_span_id":
     * "root_span0", "input": "foo", "output": "bar", "expected": "boo", "scores": {"correctness":
     * 0.33}}`. We can create a sub-span of the parent row by logging `{"id": "llm_call", "span_id":
     * "span1", "root_span_id": "root_span0", "span_parents": ["span0"], "input": {"prompt": "What
     * comes after foo?"}, "output": "bar", "metrics": {"tokens": 1}}`. In the webapp, only the root
     * span row `"abc"` will show up in the summary view. You can view the full trace hierarchy (in
     * this case, the `"llm_call"` row) by clicking on the "abc" row.
     *
     * If the row is being merged into an existing row, this field will be ignored.
     */
    fun spanId(): Optional<String> = Optional.ofNullable(spanId.getNullable("span_id"))

    /**
     * Use span_id, root_span_id, and span_parents as a more explicit alternative to \_parent_id.
     * The span_id is a unique identifier describing the row's place in the a trace, and the
     * root_span_id is a unique identifier for the whole trace. See the
     * [guide](https://www.braintrust.dev/docs/guides/tracing) for full details.
     *
     * For example, say we have logged a row `{"id": "abc", "span_id": "span0", "root_span_id":
     * "root_span0", "input": "foo", "output": "bar", "expected": "boo", "scores": {"correctness":
     * 0.33}}`. We can create a sub-span of the parent row by logging `{"id": "llm_call", "span_id":
     * "span1", "root_span_id": "root_span0", "span_parents": ["span0"], "input": {"prompt": "What
     * comes after foo?"}, "output": "bar", "metrics": {"tokens": 1}}`. In the webapp, only the root
     * span row `"abc"` will show up in the summary view. You can view the full trace hierarchy (in
     * this case, the `"llm_call"` row) by clicking on the "abc" row.
     *
     * If the row is being merged into an existing row, this field will be ignored.
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
     * The `_is_merge` field controls how the row is merged with any existing row with the same id
     * in the DB. By default (or when set to `false`), the existing row is completely replaced by
     * the new row. When set to `true`, the new row is deep-merged into the existing row, if one is
     * found. If no existing row is found, the new row is inserted as is.
     *
     * For example, say there is an existing row in the DB `{"id": "foo", "input": {"a": 5, "b":
     * 10}}`. If we merge a new row as `{"_is_merge": true, "id": "foo", "input": {"b": 11, "c":
     * 20}}`, the new row will be `{"id": "foo", "input": {"a": 5, "b": 11, "c": 20}}`. If we
     * replace the new row as `{"id": "foo", "input": {"b": 11, "c": 20}}`, the new row will be
     * `{"id": "foo", "input": {"b": 11, "c": 20}}`
     */
    @JsonProperty("_is_merge") @ExcludeMissing fun __isMerge(): JsonField<Boolean> = _isMerge

    /**
     * The `_merge_paths` field allows controlling the depth of the merge, when `_is_merge=true`.
     * `_merge_paths` is a list of paths, where each path is a list of field names. The deep merge
     * will not descend below any of the specified merge paths.
     *
     * For example, say there is an existing row in the DB `{"id": "foo", "input": {"a": {"b": 10},
     * "c": {"d": 20}}, "output": {"a": 20}}`. If we merge a new row as `{"_is_merge": true,
     * "_merge_paths": [["input", "a"], ["output"]], "input": {"a": {"q": 30}, "c": {"e": 30},
     * "bar": "baz"}, "output": {"d": 40}}`, the new row will be `{"id": "foo": "input": {"a": {"q":
     * 30}, "c": {"d": 20, "e": 30}, "bar": "baz"}, "output": {"d": 40}}`. In this case, due to the
     * merge paths, we have replaced `input.a` and `output`, but have still deep-merged `input` and
     * `input.c`.
     */
    @JsonProperty("_merge_paths")
    @ExcludeMissing
    fun __mergePaths(): JsonField<List<List<String>>> = _mergePaths

    /**
     * Pass `_object_delete=true` to mark the project logs event deleted. Deleted events will not
     * show up in subsequent fetches for this project logs
     */
    @JsonProperty("_object_delete")
    @ExcludeMissing
    fun __objectDelete(): JsonField<Boolean> = _objectDelete

    /**
     * Use the `_parent_id` field to create this row as a subspan of an existing row. Tracking
     * hierarchical relationships are important for tracing (see the
     * [guide](https://www.braintrust.dev/docs/guides/tracing) for full details).
     *
     * For example, say we have logged a row `{"id": "abc", "input": "foo", "output": "bar",
     * "expected": "boo", "scores": {"correctness": 0.33}}`. We can create a sub-span of the parent
     * row by logging `{"_parent_id": "abc", "id": "llm_call", "input": {"prompt": "What comes after
     * foo?"}, "output": "bar", "metrics": {"tokens": 1}}`. In the webapp, only the root span row
     * `"abc"` will show up in the summary view. You can view the full trace hierarchy (in this
     * case, the `"llm_call"` row) by clicking on the "abc" row.
     *
     * If the row is being merged into an existing row, this field will be ignored.
     */
    @JsonProperty("_parent_id") @ExcludeMissing fun __parentId(): JsonField<String> = _parentId

    /**
     * Context is additional information about the code that produced the project logs event. It is
     * essentially the textual counterpart to `metrics`. Use the `caller_*` attributes to track the
     * location in code which produced the project logs event
     */
    @JsonProperty("context") @ExcludeMissing fun _context(): JsonField<Context> = context

    /** The timestamp the project logs event was created */
    @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<OffsetDateTime> = created

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

    /**
     * Use span_id, root_span_id, and span_parents as a more explicit alternative to \_parent_id.
     * The span_id is a unique identifier describing the row's place in the a trace, and the
     * root_span_id is a unique identifier for the whole trace. See the
     * [guide](https://www.braintrust.dev/docs/guides/tracing) for full details.
     *
     * For example, say we have logged a row `{"id": "abc", "span_id": "span0", "root_span_id":
     * "root_span0", "input": "foo", "output": "bar", "expected": "boo", "scores": {"correctness":
     * 0.33}}`. We can create a sub-span of the parent row by logging `{"id": "llm_call", "span_id":
     * "span1", "root_span_id": "root_span0", "span_parents": ["span0"], "input": {"prompt": "What
     * comes after foo?"}, "output": "bar", "metrics": {"tokens": 1}}`. In the webapp, only the root
     * span row `"abc"` will show up in the summary view. You can view the full trace hierarchy (in
     * this case, the `"llm_call"` row) by clicking on the "abc" row.
     *
     * If the row is being merged into an existing row, this field will be ignored.
     */
    @JsonProperty("root_span_id") @ExcludeMissing fun _rootSpanId(): JsonField<String> = rootSpanId

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
     * Use span_id, root_span_id, and span_parents as a more explicit alternative to \_parent_id.
     * The span_id is a unique identifier describing the row's place in the a trace, and the
     * root_span_id is a unique identifier for the whole trace. See the
     * [guide](https://www.braintrust.dev/docs/guides/tracing) for full details.
     *
     * For example, say we have logged a row `{"id": "abc", "span_id": "span0", "root_span_id":
     * "root_span0", "input": "foo", "output": "bar", "expected": "boo", "scores": {"correctness":
     * 0.33}}`. We can create a sub-span of the parent row by logging `{"id": "llm_call", "span_id":
     * "span1", "root_span_id": "root_span0", "span_parents": ["span0"], "input": {"prompt": "What
     * comes after foo?"}, "output": "bar", "metrics": {"tokens": 1}}`. In the webapp, only the root
     * span row `"abc"` will show up in the summary view. You can view the full trace hierarchy (in
     * this case, the `"llm_call"` row) by clicking on the "abc" row.
     *
     * If the row is being merged into an existing row, this field will be ignored.
     */
    @JsonProperty("span_id") @ExcludeMissing fun _spanId(): JsonField<String> = spanId

    /**
     * Use span_id, root_span_id, and span_parents as a more explicit alternative to \_parent_id.
     * The span_id is a unique identifier describing the row's place in the a trace, and the
     * root_span_id is a unique identifier for the whole trace. See the
     * [guide](https://www.braintrust.dev/docs/guides/tracing) for full details.
     *
     * For example, say we have logged a row `{"id": "abc", "span_id": "span0", "root_span_id":
     * "root_span0", "input": "foo", "output": "bar", "expected": "boo", "scores": {"correctness":
     * 0.33}}`. We can create a sub-span of the parent row by logging `{"id": "llm_call", "span_id":
     * "span1", "root_span_id": "root_span0", "span_parents": ["span0"], "input": {"prompt": "What
     * comes after foo?"}, "output": "bar", "metrics": {"tokens": 1}}`. In the webapp, only the root
     * span row `"abc"` will show up in the summary view. You can view the full trace hierarchy (in
     * this case, the `"llm_call"` row) by clicking on the "abc" row.
     *
     * If the row is being merged into an existing row, this field will be ignored.
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

    fun validate(): InsertProjectLogsEvent = apply {
        if (validated) {
            return@apply
        }

        id()
        _isMerge()
        _mergePaths()
        _objectDelete()
        _parentId()
        context().ifPresent { it.validate() }
        created()
        metadata().ifPresent { it.validate() }
        metrics().ifPresent { it.validate() }
        rootSpanId()
        scores().ifPresent { it.validate() }
        spanAttributes().ifPresent { it.validate() }
        spanId()
        spanParents()
        tags()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /** Returns a mutable builder for constructing an instance of [InsertProjectLogsEvent]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InsertProjectLogsEvent]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var _isMerge: JsonField<Boolean> = JsonMissing.of()
        private var _mergePaths: JsonField<MutableList<List<String>>>? = null
        private var _objectDelete: JsonField<Boolean> = JsonMissing.of()
        private var _parentId: JsonField<String> = JsonMissing.of()
        private var context: JsonField<Context> = JsonMissing.of()
        private var created: JsonField<OffsetDateTime> = JsonMissing.of()
        private var error: JsonValue = JsonMissing.of()
        private var expected: JsonValue = JsonMissing.of()
        private var input: JsonValue = JsonMissing.of()
        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var metrics: JsonField<Metrics> = JsonMissing.of()
        private var output: JsonValue = JsonMissing.of()
        private var rootSpanId: JsonField<String> = JsonMissing.of()
        private var scores: JsonField<Scores> = JsonMissing.of()
        private var spanAttributes: JsonField<SpanAttributes> = JsonMissing.of()
        private var spanId: JsonField<String> = JsonMissing.of()
        private var spanParents: JsonField<MutableList<String>>? = null
        private var tags: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(insertProjectLogsEvent: InsertProjectLogsEvent) = apply {
            id = insertProjectLogsEvent.id
            _isMerge = insertProjectLogsEvent._isMerge
            _mergePaths = insertProjectLogsEvent._mergePaths.map { it.toMutableList() }
            _objectDelete = insertProjectLogsEvent._objectDelete
            _parentId = insertProjectLogsEvent._parentId
            context = insertProjectLogsEvent.context
            created = insertProjectLogsEvent.created
            error = insertProjectLogsEvent.error
            expected = insertProjectLogsEvent.expected
            input = insertProjectLogsEvent.input
            metadata = insertProjectLogsEvent.metadata
            metrics = insertProjectLogsEvent.metrics
            output = insertProjectLogsEvent.output
            rootSpanId = insertProjectLogsEvent.rootSpanId
            scores = insertProjectLogsEvent.scores
            spanAttributes = insertProjectLogsEvent.spanAttributes
            spanId = insertProjectLogsEvent.spanId
            spanParents = insertProjectLogsEvent.spanParents.map { it.toMutableList() }
            tags = insertProjectLogsEvent.tags.map { it.toMutableList() }
            additionalProperties = insertProjectLogsEvent.additionalProperties.toMutableMap()
        }

        /**
         * A unique identifier for the project logs event. If you don't provide one, BrainTrust will
         * generate one for you
         */
        fun id(id: String?) = id(JsonField.ofNullable(id))

        /**
         * A unique identifier for the project logs event. If you don't provide one, BrainTrust will
         * generate one for you
         */
        fun id(id: Optional<String>) = id(id.orElse(null))

        /**
         * A unique identifier for the project logs event. If you don't provide one, BrainTrust will
         * generate one for you
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * The `_is_merge` field controls how the row is merged with any existing row with the same
         * id in the DB. By default (or when set to `false`), the existing row is completely
         * replaced by the new row. When set to `true`, the new row is deep-merged into the existing
         * row, if one is found. If no existing row is found, the new row is inserted as is.
         *
         * For example, say there is an existing row in the DB `{"id": "foo", "input": {"a": 5, "b":
         * 10}}`. If we merge a new row as `{"_is_merge": true, "id": "foo", "input": {"b": 11, "c":
         * 20}}`, the new row will be `{"id": "foo", "input": {"a": 5, "b": 11, "c": 20}}`. If we
         * replace the new row as `{"id": "foo", "input": {"b": 11, "c": 20}}`, the new row will be
         * `{"id": "foo", "input": {"b": 11, "c": 20}}`
         */
        fun _isMerge(_isMerge: Boolean?) = _isMerge(JsonField.ofNullable(_isMerge))

        /**
         * The `_is_merge` field controls how the row is merged with any existing row with the same
         * id in the DB. By default (or when set to `false`), the existing row is completely
         * replaced by the new row. When set to `true`, the new row is deep-merged into the existing
         * row, if one is found. If no existing row is found, the new row is inserted as is.
         *
         * For example, say there is an existing row in the DB `{"id": "foo", "input": {"a": 5, "b":
         * 10}}`. If we merge a new row as `{"_is_merge": true, "id": "foo", "input": {"b": 11, "c":
         * 20}}`, the new row will be `{"id": "foo", "input": {"a": 5, "b": 11, "c": 20}}`. If we
         * replace the new row as `{"id": "foo", "input": {"b": 11, "c": 20}}`, the new row will be
         * `{"id": "foo", "input": {"b": 11, "c": 20}}`
         */
        fun _isMerge(_isMerge: Boolean) = _isMerge(_isMerge as Boolean?)

        /**
         * The `_is_merge` field controls how the row is merged with any existing row with the same
         * id in the DB. By default (or when set to `false`), the existing row is completely
         * replaced by the new row. When set to `true`, the new row is deep-merged into the existing
         * row, if one is found. If no existing row is found, the new row is inserted as is.
         *
         * For example, say there is an existing row in the DB `{"id": "foo", "input": {"a": 5, "b":
         * 10}}`. If we merge a new row as `{"_is_merge": true, "id": "foo", "input": {"b": 11, "c":
         * 20}}`, the new row will be `{"id": "foo", "input": {"a": 5, "b": 11, "c": 20}}`. If we
         * replace the new row as `{"id": "foo", "input": {"b": 11, "c": 20}}`, the new row will be
         * `{"id": "foo", "input": {"b": 11, "c": 20}}`
         */
        @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
        fun _isMerge(_isMerge: Optional<Boolean>) = _isMerge(_isMerge.orElse(null) as Boolean?)

        /**
         * The `_is_merge` field controls how the row is merged with any existing row with the same
         * id in the DB. By default (or when set to `false`), the existing row is completely
         * replaced by the new row. When set to `true`, the new row is deep-merged into the existing
         * row, if one is found. If no existing row is found, the new row is inserted as is.
         *
         * For example, say there is an existing row in the DB `{"id": "foo", "input": {"a": 5, "b":
         * 10}}`. If we merge a new row as `{"_is_merge": true, "id": "foo", "input": {"b": 11, "c":
         * 20}}`, the new row will be `{"id": "foo", "input": {"a": 5, "b": 11, "c": 20}}`. If we
         * replace the new row as `{"id": "foo", "input": {"b": 11, "c": 20}}`, the new row will be
         * `{"id": "foo", "input": {"b": 11, "c": 20}}`
         */
        fun _isMerge(_isMerge: JsonField<Boolean>) = apply { this._isMerge = _isMerge }

        /**
         * The `_merge_paths` field allows controlling the depth of the merge, when
         * `_is_merge=true`. `_merge_paths` is a list of paths, where each path is a list of field
         * names. The deep merge will not descend below any of the specified merge paths.
         *
         * For example, say there is an existing row in the DB `{"id": "foo", "input": {"a": {"b":
         * 10}, "c": {"d": 20}}, "output": {"a": 20}}`. If we merge a new row as `{"_is_merge":
         * true, "_merge_paths": [["input", "a"], ["output"]], "input": {"a": {"q": 30}, "c": {"e":
         * 30}, "bar": "baz"}, "output": {"d": 40}}`, the new row will be `{"id": "foo": "input":
         * {"a": {"q": 30}, "c": {"d": 20, "e": 30}, "bar": "baz"}, "output": {"d": 40}}`. In this
         * case, due to the merge paths, we have replaced `input.a` and `output`, but have still
         * deep-merged `input` and `input.c`.
         */
        fun _mergePaths(_mergePaths: List<List<String>>?) =
            _mergePaths(JsonField.ofNullable(_mergePaths))

        /**
         * The `_merge_paths` field allows controlling the depth of the merge, when
         * `_is_merge=true`. `_merge_paths` is a list of paths, where each path is a list of field
         * names. The deep merge will not descend below any of the specified merge paths.
         *
         * For example, say there is an existing row in the DB `{"id": "foo", "input": {"a": {"b":
         * 10}, "c": {"d": 20}}, "output": {"a": 20}}`. If we merge a new row as `{"_is_merge":
         * true, "_merge_paths": [["input", "a"], ["output"]], "input": {"a": {"q": 30}, "c": {"e":
         * 30}, "bar": "baz"}, "output": {"d": 40}}`, the new row will be `{"id": "foo": "input":
         * {"a": {"q": 30}, "c": {"d": 20, "e": 30}, "bar": "baz"}, "output": {"d": 40}}`. In this
         * case, due to the merge paths, we have replaced `input.a` and `output`, but have still
         * deep-merged `input` and `input.c`.
         */
        fun _mergePaths(_mergePaths: Optional<List<List<String>>>) =
            _mergePaths(_mergePaths.orElse(null))

        /**
         * The `_merge_paths` field allows controlling the depth of the merge, when
         * `_is_merge=true`. `_merge_paths` is a list of paths, where each path is a list of field
         * names. The deep merge will not descend below any of the specified merge paths.
         *
         * For example, say there is an existing row in the DB `{"id": "foo", "input": {"a": {"b":
         * 10}, "c": {"d": 20}}, "output": {"a": 20}}`. If we merge a new row as `{"_is_merge":
         * true, "_merge_paths": [["input", "a"], ["output"]], "input": {"a": {"q": 30}, "c": {"e":
         * 30}, "bar": "baz"}, "output": {"d": 40}}`, the new row will be `{"id": "foo": "input":
         * {"a": {"q": 30}, "c": {"d": 20, "e": 30}, "bar": "baz"}, "output": {"d": 40}}`. In this
         * case, due to the merge paths, we have replaced `input.a` and `output`, but have still
         * deep-merged `input` and `input.c`.
         */
        fun _mergePaths(_mergePaths: JsonField<List<List<String>>>) = apply {
            this._mergePaths = _mergePaths.map { it.toMutableList() }
        }

        /**
         * The `_merge_paths` field allows controlling the depth of the merge, when
         * `_is_merge=true`. `_merge_paths` is a list of paths, where each path is a list of field
         * names. The deep merge will not descend below any of the specified merge paths.
         *
         * For example, say there is an existing row in the DB `{"id": "foo", "input": {"a": {"b":
         * 10}, "c": {"d": 20}}, "output": {"a": 20}}`. If we merge a new row as `{"_is_merge":
         * true, "_merge_paths": [["input", "a"], ["output"]], "input": {"a": {"q": 30}, "c": {"e":
         * 30}, "bar": "baz"}, "output": {"d": 40}}`, the new row will be `{"id": "foo": "input":
         * {"a": {"q": 30}, "c": {"d": 20, "e": 30}, "bar": "baz"}, "output": {"d": 40}}`. In this
         * case, due to the merge paths, we have replaced `input.a` and `output`, but have still
         * deep-merged `input` and `input.c`.
         */
        fun addMergePath(mergePath: List<String>) = apply {
            _mergePaths =
                (_mergePaths ?: JsonField.of(mutableListOf())).also {
                    checkKnown("_mergePaths", it).add(mergePath)
                }
        }

        /**
         * Pass `_object_delete=true` to mark the project logs event deleted. Deleted events will
         * not show up in subsequent fetches for this project logs
         */
        fun _objectDelete(_objectDelete: Boolean?) =
            _objectDelete(JsonField.ofNullable(_objectDelete))

        /**
         * Pass `_object_delete=true` to mark the project logs event deleted. Deleted events will
         * not show up in subsequent fetches for this project logs
         */
        fun _objectDelete(_objectDelete: Boolean) = _objectDelete(_objectDelete as Boolean?)

        /**
         * Pass `_object_delete=true` to mark the project logs event deleted. Deleted events will
         * not show up in subsequent fetches for this project logs
         */
        @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
        fun _objectDelete(_objectDelete: Optional<Boolean>) =
            _objectDelete(_objectDelete.orElse(null) as Boolean?)

        /**
         * Pass `_object_delete=true` to mark the project logs event deleted. Deleted events will
         * not show up in subsequent fetches for this project logs
         */
        fun _objectDelete(_objectDelete: JsonField<Boolean>) = apply {
            this._objectDelete = _objectDelete
        }

        /**
         * Use the `_parent_id` field to create this row as a subspan of an existing row. Tracking
         * hierarchical relationships are important for tracing (see the
         * [guide](https://www.braintrust.dev/docs/guides/tracing) for full details).
         *
         * For example, say we have logged a row `{"id": "abc", "input": "foo", "output": "bar",
         * "expected": "boo", "scores": {"correctness": 0.33}}`. We can create a sub-span of the
         * parent row by logging `{"_parent_id": "abc", "id": "llm_call", "input": {"prompt": "What
         * comes after foo?"}, "output": "bar", "metrics": {"tokens": 1}}`. In the webapp, only the
         * root span row `"abc"` will show up in the summary view. You can view the full trace
         * hierarchy (in this case, the `"llm_call"` row) by clicking on the "abc" row.
         *
         * If the row is being merged into an existing row, this field will be ignored.
         */
        fun _parentId(_parentId: String?) = _parentId(JsonField.ofNullable(_parentId))

        /**
         * Use the `_parent_id` field to create this row as a subspan of an existing row. Tracking
         * hierarchical relationships are important for tracing (see the
         * [guide](https://www.braintrust.dev/docs/guides/tracing) for full details).
         *
         * For example, say we have logged a row `{"id": "abc", "input": "foo", "output": "bar",
         * "expected": "boo", "scores": {"correctness": 0.33}}`. We can create a sub-span of the
         * parent row by logging `{"_parent_id": "abc", "id": "llm_call", "input": {"prompt": "What
         * comes after foo?"}, "output": "bar", "metrics": {"tokens": 1}}`. In the webapp, only the
         * root span row `"abc"` will show up in the summary view. You can view the full trace
         * hierarchy (in this case, the `"llm_call"` row) by clicking on the "abc" row.
         *
         * If the row is being merged into an existing row, this field will be ignored.
         */
        fun _parentId(_parentId: Optional<String>) = _parentId(_parentId.orElse(null))

        /**
         * Use the `_parent_id` field to create this row as a subspan of an existing row. Tracking
         * hierarchical relationships are important for tracing (see the
         * [guide](https://www.braintrust.dev/docs/guides/tracing) for full details).
         *
         * For example, say we have logged a row `{"id": "abc", "input": "foo", "output": "bar",
         * "expected": "boo", "scores": {"correctness": 0.33}}`. We can create a sub-span of the
         * parent row by logging `{"_parent_id": "abc", "id": "llm_call", "input": {"prompt": "What
         * comes after foo?"}, "output": "bar", "metrics": {"tokens": 1}}`. In the webapp, only the
         * root span row `"abc"` will show up in the summary view. You can view the full trace
         * hierarchy (in this case, the `"llm_call"` row) by clicking on the "abc" row.
         *
         * If the row is being merged into an existing row, this field will be ignored.
         */
        fun _parentId(_parentId: JsonField<String>) = apply { this._parentId = _parentId }

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
        fun context(context: Optional<Context>) = context(context.orElse(null))

        /**
         * Context is additional information about the code that produced the project logs event. It
         * is essentially the textual counterpart to `metrics`. Use the `caller_*` attributes to
         * track the location in code which produced the project logs event
         */
        fun context(context: JsonField<Context>) = apply { this.context = context }

        /** The timestamp the project logs event was created */
        fun created(created: OffsetDateTime?) = created(JsonField.ofNullable(created))

        /** The timestamp the project logs event was created */
        fun created(created: Optional<OffsetDateTime>) = created(created.orElse(null))

        /** The timestamp the project logs event was created */
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

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
        fun metadata(metadata: Optional<Metadata>) = metadata(metadata.orElse(null))

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
        fun metrics(metrics: Optional<Metrics>) = metrics(metrics.orElse(null))

        /**
         * Metrics are numerical measurements tracking the execution of the code that produced the
         * project logs event. Use "start" and "end" to track the time span over which the project
         * logs event was produced
         */
        fun metrics(metrics: JsonField<Metrics>) = apply { this.metrics = metrics }

        /**
         * The output of your application, including post-processing (an arbitrary, JSON
         * serializable object), that allows you to determine whether the result is correct or not.
         * For example, in an app that generates SQL queries, the `output` should be the _result_ of
         * the SQL query generated by the model, not the query itself, because there may be multiple
         * valid queries that answer a single question.
         */
        fun output(output: JsonValue) = apply { this.output = output }

        /**
         * Use span_id, root_span_id, and span_parents as a more explicit alternative to
         * \_parent_id. The span_id is a unique identifier describing the row's place in the a
         * trace, and the root_span_id is a unique identifier for the whole trace. See the
         * [guide](https://www.braintrust.dev/docs/guides/tracing) for full details.
         *
         * For example, say we have logged a row `{"id": "abc", "span_id": "span0", "root_span_id":
         * "root_span0", "input": "foo", "output": "bar", "expected": "boo", "scores":
         * {"correctness": 0.33}}`. We can create a sub-span of the parent row by logging `{"id":
         * "llm_call", "span_id": "span1", "root_span_id": "root_span0", "span_parents": ["span0"],
         * "input": {"prompt": "What comes after foo?"}, "output": "bar", "metrics": {"tokens":
         * 1}}`. In the webapp, only the root span row `"abc"` will show up in the summary view. You
         * can view the full trace hierarchy (in this case, the `"llm_call"` row) by clicking on the
         * "abc" row.
         *
         * If the row is being merged into an existing row, this field will be ignored.
         */
        fun rootSpanId(rootSpanId: String?) = rootSpanId(JsonField.ofNullable(rootSpanId))

        /**
         * Use span_id, root_span_id, and span_parents as a more explicit alternative to
         * \_parent_id. The span_id is a unique identifier describing the row's place in the a
         * trace, and the root_span_id is a unique identifier for the whole trace. See the
         * [guide](https://www.braintrust.dev/docs/guides/tracing) for full details.
         *
         * For example, say we have logged a row `{"id": "abc", "span_id": "span0", "root_span_id":
         * "root_span0", "input": "foo", "output": "bar", "expected": "boo", "scores":
         * {"correctness": 0.33}}`. We can create a sub-span of the parent row by logging `{"id":
         * "llm_call", "span_id": "span1", "root_span_id": "root_span0", "span_parents": ["span0"],
         * "input": {"prompt": "What comes after foo?"}, "output": "bar", "metrics": {"tokens":
         * 1}}`. In the webapp, only the root span row `"abc"` will show up in the summary view. You
         * can view the full trace hierarchy (in this case, the `"llm_call"` row) by clicking on the
         * "abc" row.
         *
         * If the row is being merged into an existing row, this field will be ignored.
         */
        fun rootSpanId(rootSpanId: Optional<String>) = rootSpanId(rootSpanId.orElse(null))

        /**
         * Use span_id, root_span_id, and span_parents as a more explicit alternative to
         * \_parent_id. The span_id is a unique identifier describing the row's place in the a
         * trace, and the root_span_id is a unique identifier for the whole trace. See the
         * [guide](https://www.braintrust.dev/docs/guides/tracing) for full details.
         *
         * For example, say we have logged a row `{"id": "abc", "span_id": "span0", "root_span_id":
         * "root_span0", "input": "foo", "output": "bar", "expected": "boo", "scores":
         * {"correctness": 0.33}}`. We can create a sub-span of the parent row by logging `{"id":
         * "llm_call", "span_id": "span1", "root_span_id": "root_span0", "span_parents": ["span0"],
         * "input": {"prompt": "What comes after foo?"}, "output": "bar", "metrics": {"tokens":
         * 1}}`. In the webapp, only the root span row `"abc"` will show up in the summary view. You
         * can view the full trace hierarchy (in this case, the `"llm_call"` row) by clicking on the
         * "abc" row.
         *
         * If the row is being merged into an existing row, this field will be ignored.
         */
        fun rootSpanId(rootSpanId: JsonField<String>) = apply { this.rootSpanId = rootSpanId }

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
        fun scores(scores: Optional<Scores>) = scores(scores.orElse(null))

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
            spanAttributes(spanAttributes.orElse(null))

        /** Human-identifying attributes of the span, such as name, type, etc. */
        fun spanAttributes(spanAttributes: JsonField<SpanAttributes>) = apply {
            this.spanAttributes = spanAttributes
        }

        /**
         * Use span_id, root_span_id, and span_parents as a more explicit alternative to
         * \_parent_id. The span_id is a unique identifier describing the row's place in the a
         * trace, and the root_span_id is a unique identifier for the whole trace. See the
         * [guide](https://www.braintrust.dev/docs/guides/tracing) for full details.
         *
         * For example, say we have logged a row `{"id": "abc", "span_id": "span0", "root_span_id":
         * "root_span0", "input": "foo", "output": "bar", "expected": "boo", "scores":
         * {"correctness": 0.33}}`. We can create a sub-span of the parent row by logging `{"id":
         * "llm_call", "span_id": "span1", "root_span_id": "root_span0", "span_parents": ["span0"],
         * "input": {"prompt": "What comes after foo?"}, "output": "bar", "metrics": {"tokens":
         * 1}}`. In the webapp, only the root span row `"abc"` will show up in the summary view. You
         * can view the full trace hierarchy (in this case, the `"llm_call"` row) by clicking on the
         * "abc" row.
         *
         * If the row is being merged into an existing row, this field will be ignored.
         */
        fun spanId(spanId: String?) = spanId(JsonField.ofNullable(spanId))

        /**
         * Use span_id, root_span_id, and span_parents as a more explicit alternative to
         * \_parent_id. The span_id is a unique identifier describing the row's place in the a
         * trace, and the root_span_id is a unique identifier for the whole trace. See the
         * [guide](https://www.braintrust.dev/docs/guides/tracing) for full details.
         *
         * For example, say we have logged a row `{"id": "abc", "span_id": "span0", "root_span_id":
         * "root_span0", "input": "foo", "output": "bar", "expected": "boo", "scores":
         * {"correctness": 0.33}}`. We can create a sub-span of the parent row by logging `{"id":
         * "llm_call", "span_id": "span1", "root_span_id": "root_span0", "span_parents": ["span0"],
         * "input": {"prompt": "What comes after foo?"}, "output": "bar", "metrics": {"tokens":
         * 1}}`. In the webapp, only the root span row `"abc"` will show up in the summary view. You
         * can view the full trace hierarchy (in this case, the `"llm_call"` row) by clicking on the
         * "abc" row.
         *
         * If the row is being merged into an existing row, this field will be ignored.
         */
        fun spanId(spanId: Optional<String>) = spanId(spanId.orElse(null))

        /**
         * Use span_id, root_span_id, and span_parents as a more explicit alternative to
         * \_parent_id. The span_id is a unique identifier describing the row's place in the a
         * trace, and the root_span_id is a unique identifier for the whole trace. See the
         * [guide](https://www.braintrust.dev/docs/guides/tracing) for full details.
         *
         * For example, say we have logged a row `{"id": "abc", "span_id": "span0", "root_span_id":
         * "root_span0", "input": "foo", "output": "bar", "expected": "boo", "scores":
         * {"correctness": 0.33}}`. We can create a sub-span of the parent row by logging `{"id":
         * "llm_call", "span_id": "span1", "root_span_id": "root_span0", "span_parents": ["span0"],
         * "input": {"prompt": "What comes after foo?"}, "output": "bar", "metrics": {"tokens":
         * 1}}`. In the webapp, only the root span row `"abc"` will show up in the summary view. You
         * can view the full trace hierarchy (in this case, the `"llm_call"` row) by clicking on the
         * "abc" row.
         *
         * If the row is being merged into an existing row, this field will be ignored.
         */
        fun spanId(spanId: JsonField<String>) = apply { this.spanId = spanId }

        /**
         * Use span_id, root_span_id, and span_parents as a more explicit alternative to
         * \_parent_id. The span_id is a unique identifier describing the row's place in the a
         * trace, and the root_span_id is a unique identifier for the whole trace. See the
         * [guide](https://www.braintrust.dev/docs/guides/tracing) for full details.
         *
         * For example, say we have logged a row `{"id": "abc", "span_id": "span0", "root_span_id":
         * "root_span0", "input": "foo", "output": "bar", "expected": "boo", "scores":
         * {"correctness": 0.33}}`. We can create a sub-span of the parent row by logging `{"id":
         * "llm_call", "span_id": "span1", "root_span_id": "root_span0", "span_parents": ["span0"],
         * "input": {"prompt": "What comes after foo?"}, "output": "bar", "metrics": {"tokens":
         * 1}}`. In the webapp, only the root span row `"abc"` will show up in the summary view. You
         * can view the full trace hierarchy (in this case, the `"llm_call"` row) by clicking on the
         * "abc" row.
         *
         * If the row is being merged into an existing row, this field will be ignored.
         */
        fun spanParents(spanParents: List<String>?) = spanParents(JsonField.ofNullable(spanParents))

        /**
         * Use span_id, root_span_id, and span_parents as a more explicit alternative to
         * \_parent_id. The span_id is a unique identifier describing the row's place in the a
         * trace, and the root_span_id is a unique identifier for the whole trace. See the
         * [guide](https://www.braintrust.dev/docs/guides/tracing) for full details.
         *
         * For example, say we have logged a row `{"id": "abc", "span_id": "span0", "root_span_id":
         * "root_span0", "input": "foo", "output": "bar", "expected": "boo", "scores":
         * {"correctness": 0.33}}`. We can create a sub-span of the parent row by logging `{"id":
         * "llm_call", "span_id": "span1", "root_span_id": "root_span0", "span_parents": ["span0"],
         * "input": {"prompt": "What comes after foo?"}, "output": "bar", "metrics": {"tokens":
         * 1}}`. In the webapp, only the root span row `"abc"` will show up in the summary view. You
         * can view the full trace hierarchy (in this case, the `"llm_call"` row) by clicking on the
         * "abc" row.
         *
         * If the row is being merged into an existing row, this field will be ignored.
         */
        fun spanParents(spanParents: Optional<List<String>>) = spanParents(spanParents.orElse(null))

        /**
         * Use span_id, root_span_id, and span_parents as a more explicit alternative to
         * \_parent_id. The span_id is a unique identifier describing the row's place in the a
         * trace, and the root_span_id is a unique identifier for the whole trace. See the
         * [guide](https://www.braintrust.dev/docs/guides/tracing) for full details.
         *
         * For example, say we have logged a row `{"id": "abc", "span_id": "span0", "root_span_id":
         * "root_span0", "input": "foo", "output": "bar", "expected": "boo", "scores":
         * {"correctness": 0.33}}`. We can create a sub-span of the parent row by logging `{"id":
         * "llm_call", "span_id": "span1", "root_span_id": "root_span0", "span_parents": ["span0"],
         * "input": {"prompt": "What comes after foo?"}, "output": "bar", "metrics": {"tokens":
         * 1}}`. In the webapp, only the root span row `"abc"` will show up in the summary view. You
         * can view the full trace hierarchy (in this case, the `"llm_call"` row) by clicking on the
         * "abc" row.
         *
         * If the row is being merged into an existing row, this field will be ignored.
         */
        fun spanParents(spanParents: JsonField<List<String>>) = apply {
            this.spanParents = spanParents.map { it.toMutableList() }
        }

        /**
         * Use span_id, root_span_id, and span_parents as a more explicit alternative to
         * \_parent_id. The span_id is a unique identifier describing the row's place in the a
         * trace, and the root_span_id is a unique identifier for the whole trace. See the
         * [guide](https://www.braintrust.dev/docs/guides/tracing) for full details.
         *
         * For example, say we have logged a row `{"id": "abc", "span_id": "span0", "root_span_id":
         * "root_span0", "input": "foo", "output": "bar", "expected": "boo", "scores":
         * {"correctness": 0.33}}`. We can create a sub-span of the parent row by logging `{"id":
         * "llm_call", "span_id": "span1", "root_span_id": "root_span0", "span_parents": ["span0"],
         * "input": {"prompt": "What comes after foo?"}, "output": "bar", "metrics": {"tokens":
         * 1}}`. In the webapp, only the root span row `"abc"` will show up in the summary view. You
         * can view the full trace hierarchy (in this case, the `"llm_call"` row) by clicking on the
         * "abc" row.
         *
         * If the row is being merged into an existing row, this field will be ignored.
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
        fun tags(tags: Optional<List<String>>) = tags(tags.orElse(null))

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

        fun build(): InsertProjectLogsEvent =
            InsertProjectLogsEvent(
                id,
                _isMerge,
                (_mergePaths ?: JsonMissing.of()).map { it.toImmutable() },
                _objectDelete,
                _parentId,
                context,
                created,
                error,
                expected,
                input,
                metadata,
                metrics,
                output,
                rootSpanId,
                scores,
                spanAttributes,
                spanId,
                (spanParents ?: JsonMissing.of()).map { it.toImmutable() },
                (tags ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toImmutable(),
            )
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
                callerFilename(callerFilename.orElse(null))

            /** Name of the file in code where the project logs event was created */
            fun callerFilename(callerFilename: JsonField<String>) = apply {
                this.callerFilename = callerFilename
            }

            /** The function in code which created the project logs event */
            fun callerFunctionname(callerFunctionname: String?) =
                callerFunctionname(JsonField.ofNullable(callerFunctionname))

            /** The function in code which created the project logs event */
            fun callerFunctionname(callerFunctionname: Optional<String>) =
                callerFunctionname(callerFunctionname.orElse(null))

            /** The function in code which created the project logs event */
            fun callerFunctionname(callerFunctionname: JsonField<String>) = apply {
                this.callerFunctionname = callerFunctionname
            }

            /** Line of code where the project logs event was created */
            fun callerLineno(callerLineno: Long?) = callerLineno(JsonField.ofNullable(callerLineno))

            /** Line of code where the project logs event was created */
            fun callerLineno(callerLineno: Long) = callerLineno(callerLineno as Long?)

            /** Line of code where the project logs event was created */
            @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
            fun callerLineno(callerLineno: Optional<Long>) =
                callerLineno(callerLineno.orElse(null) as Long?)

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
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Metadata = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Metadata]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Metadata]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(metadata: Metadata) = apply {
                additionalProperties = metadata.additionalProperties.toMutableMap()
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

            fun build(): Metadata = Metadata(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Metadata && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
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
            @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
            fun completionTokens(completionTokens: Optional<Long>) =
                completionTokens(completionTokens.orElse(null) as Long?)

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
            @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
            fun end(end: Optional<Double>) = end(end.orElse(null) as Double?)

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
            @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
            fun promptTokens(promptTokens: Optional<Long>) =
                promptTokens(promptTokens.orElse(null) as Long?)

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
            @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
            fun start(start: Optional<Double>) = start(start.orElse(null) as Double?)

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
            @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
            fun tokens(tokens: Optional<Long>) = tokens(tokens.orElse(null) as Long?)

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

        return /* spotless:off */ other is InsertProjectLogsEvent && id == other.id && _isMerge == other._isMerge && _mergePaths == other._mergePaths && _objectDelete == other._objectDelete && _parentId == other._parentId && context == other.context && created == other.created && error == other.error && expected == other.expected && input == other.input && metadata == other.metadata && metrics == other.metrics && output == other.output && rootSpanId == other.rootSpanId && scores == other.scores && spanAttributes == other.spanAttributes && spanId == other.spanId && spanParents == other.spanParents && tags == other.tags && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, _isMerge, _mergePaths, _objectDelete, _parentId, context, created, error, expected, input, metadata, metrics, output, rootSpanId, scores, spanAttributes, spanId, spanParents, tags, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InsertProjectLogsEvent{id=$id, _isMerge=$_isMerge, _mergePaths=$_mergePaths, _objectDelete=$_objectDelete, _parentId=$_parentId, context=$context, created=$created, error=$error, expected=$expected, input=$input, metadata=$metadata, metrics=$metrics, output=$output, rootSpanId=$rootSpanId, scores=$scores, spanAttributes=$spanAttributes, spanId=$spanId, spanParents=$spanParents, tags=$tags, additionalProperties=$additionalProperties}"
}
