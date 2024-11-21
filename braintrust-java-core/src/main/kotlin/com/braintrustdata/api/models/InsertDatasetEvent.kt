// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.toImmutable
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

/** A dataset event */
@JsonDeserialize(builder = InsertDatasetEvent.Builder::class)
@NoAutoDetect
class InsertDatasetEvent
private constructor(
    private val input: JsonValue,
    private val expected: JsonValue,
    private val metadata: JsonField<Metadata>,
    private val tags: JsonField<List<String>>,
    private val id: JsonField<String>,
    private val created: JsonField<OffsetDateTime>,
    private val _objectDelete: JsonField<Boolean>,
    private val _isMerge: JsonField<Boolean>,
    private val _mergePaths: JsonField<List<List<String>>>,
    private val _parentId: JsonField<String>,
    private val spanId: JsonField<String>,
    private val rootSpanId: JsonField<String>,
    private val spanParents: JsonField<List<String>>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /** The argument that uniquely define an input case (an arbitrary, JSON serializable object) */
    fun input(): JsonValue = input

    /**
     * The output of your application, including post-processing (an arbitrary, JSON serializable
     * object)
     */
    fun expected(): JsonValue = expected

    /**
     * A dictionary with additional data about the test example, model outputs, or just about
     * anything else that's relevant, that you can use to help find and analyze examples later. For
     * example, you could log the `prompt`, example's `id`, or anything else that would be useful to
     * slice/dice later. The values in `metadata` can be any JSON-serializable type, but its keys
     * must be strings
     */
    fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata.getNullable("metadata"))

    /** A list of tags to log */
    fun tags(): Optional<List<String>> = Optional.ofNullable(tags.getNullable("tags"))

    /**
     * A unique identifier for the dataset event. If you don't provide one, BrainTrust will generate
     * one for you
     */
    fun id(): Optional<String> = Optional.ofNullable(id.getNullable("id"))

    /** The timestamp the dataset event was created */
    fun created(): Optional<OffsetDateTime> = Optional.ofNullable(created.getNullable("created"))

    /**
     * Pass `_object_delete=true` to mark the dataset event deleted. Deleted events will not show up
     * in subsequent fetches for this dataset
     */
    fun _objectDelete(): Optional<Boolean> =
        Optional.ofNullable(_objectDelete.getNullable("_object_delete"))

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
    fun rootSpanId(): Optional<String> = Optional.ofNullable(rootSpanId.getNullable("root_span_id"))

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

    /** The argument that uniquely define an input case (an arbitrary, JSON serializable object) */
    @JsonProperty("input") @ExcludeMissing fun _input() = input

    /**
     * The output of your application, including post-processing (an arbitrary, JSON serializable
     * object)
     */
    @JsonProperty("expected") @ExcludeMissing fun _expected() = expected

    /**
     * A dictionary with additional data about the test example, model outputs, or just about
     * anything else that's relevant, that you can use to help find and analyze examples later. For
     * example, you could log the `prompt`, example's `id`, or anything else that would be useful to
     * slice/dice later. The values in `metadata` can be any JSON-serializable type, but its keys
     * must be strings
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata() = metadata

    /** A list of tags to log */
    @JsonProperty("tags") @ExcludeMissing fun _tags() = tags

    /**
     * A unique identifier for the dataset event. If you don't provide one, BrainTrust will generate
     * one for you
     */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /** The timestamp the dataset event was created */
    @JsonProperty("created") @ExcludeMissing fun _created() = created

    /**
     * Pass `_object_delete=true` to mark the dataset event deleted. Deleted events will not show up
     * in subsequent fetches for this dataset
     */
    @JsonProperty("_object_delete") @ExcludeMissing fun __objectDelete() = _objectDelete

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
    @JsonProperty("_is_merge") @ExcludeMissing fun __isMerge() = _isMerge

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
    @JsonProperty("_merge_paths") @ExcludeMissing fun __mergePaths() = _mergePaths

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
    @JsonProperty("_parent_id") @ExcludeMissing fun __parentId() = _parentId

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
    @JsonProperty("span_id") @ExcludeMissing fun _spanId() = spanId

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
    @JsonProperty("root_span_id") @ExcludeMissing fun _rootSpanId() = rootSpanId

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
    @JsonProperty("span_parents") @ExcludeMissing fun _spanParents() = spanParents

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): InsertDatasetEvent = apply {
        if (!validated) {
            input()
            expected()
            metadata().map { it.validate() }
            tags()
            id()
            created()
            _objectDelete()
            _isMerge()
            _mergePaths()
            _parentId()
            spanId()
            rootSpanId()
            spanParents()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var input: JsonValue = JsonMissing.of()
        private var expected: JsonValue = JsonMissing.of()
        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var tags: JsonField<List<String>> = JsonMissing.of()
        private var id: JsonField<String> = JsonMissing.of()
        private var created: JsonField<OffsetDateTime> = JsonMissing.of()
        private var _objectDelete: JsonField<Boolean> = JsonMissing.of()
        private var _isMerge: JsonField<Boolean> = JsonMissing.of()
        private var _mergePaths: JsonField<List<List<String>>> = JsonMissing.of()
        private var _parentId: JsonField<String> = JsonMissing.of()
        private var spanId: JsonField<String> = JsonMissing.of()
        private var rootSpanId: JsonField<String> = JsonMissing.of()
        private var spanParents: JsonField<List<String>> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(insertDatasetEvent: InsertDatasetEvent) = apply {
            this.input = insertDatasetEvent.input
            this.expected = insertDatasetEvent.expected
            this.metadata = insertDatasetEvent.metadata
            this.tags = insertDatasetEvent.tags
            this.id = insertDatasetEvent.id
            this.created = insertDatasetEvent.created
            this._objectDelete = insertDatasetEvent._objectDelete
            this._isMerge = insertDatasetEvent._isMerge
            this._mergePaths = insertDatasetEvent._mergePaths
            this._parentId = insertDatasetEvent._parentId
            this.spanId = insertDatasetEvent.spanId
            this.rootSpanId = insertDatasetEvent.rootSpanId
            this.spanParents = insertDatasetEvent.spanParents
            additionalProperties(insertDatasetEvent.additionalProperties)
        }

        /**
         * The argument that uniquely define an input case (an arbitrary, JSON serializable object)
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
         * A dictionary with additional data about the test example, model outputs, or just about
         * anything else that's relevant, that you can use to help find and analyze examples later.
         * For example, you could log the `prompt`, example's `id`, or anything else that would be
         * useful to slice/dice later. The values in `metadata` can be any JSON-serializable type,
         * but its keys must be strings
         */
        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

        /**
         * A dictionary with additional data about the test example, model outputs, or just about
         * anything else that's relevant, that you can use to help find and analyze examples later.
         * For example, you could log the `prompt`, example's `id`, or anything else that would be
         * useful to slice/dice later. The values in `metadata` can be any JSON-serializable type,
         * but its keys must be strings
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
         * A unique identifier for the dataset event. If you don't provide one, BrainTrust will
         * generate one for you
         */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * A unique identifier for the dataset event. If you don't provide one, BrainTrust will
         * generate one for you
         */
        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        /** The timestamp the dataset event was created */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /** The timestamp the dataset event was created */
        @JsonProperty("created")
        @ExcludeMissing
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /**
         * Pass `_object_delete=true` to mark the dataset event deleted. Deleted events will not
         * show up in subsequent fetches for this dataset
         */
        fun _objectDelete(_objectDelete: Boolean) = _objectDelete(JsonField.of(_objectDelete))

        /**
         * Pass `_object_delete=true` to mark the dataset event deleted. Deleted events will not
         * show up in subsequent fetches for this dataset
         */
        @JsonProperty("_object_delete")
        @ExcludeMissing
        fun _objectDelete(_objectDelete: JsonField<Boolean>) = apply {
            this._objectDelete = _objectDelete
        }

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
        fun _isMerge(_isMerge: Boolean) = _isMerge(JsonField.of(_isMerge))

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
        @JsonProperty("_is_merge")
        @ExcludeMissing
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
        fun _mergePaths(_mergePaths: List<List<String>>) = _mergePaths(JsonField.of(_mergePaths))

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
        @JsonProperty("_merge_paths")
        @ExcludeMissing
        fun _mergePaths(_mergePaths: JsonField<List<List<String>>>) = apply {
            this._mergePaths = _mergePaths
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
        fun _parentId(_parentId: String) = _parentId(JsonField.of(_parentId))

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
        @JsonProperty("_parent_id")
        @ExcludeMissing
        fun _parentId(_parentId: JsonField<String>) = apply { this._parentId = _parentId }

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
        fun spanId(spanId: String) = spanId(JsonField.of(spanId))

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
        @JsonProperty("span_id")
        @ExcludeMissing
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
        fun rootSpanId(rootSpanId: String) = rootSpanId(JsonField.of(rootSpanId))

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
        @JsonProperty("root_span_id")
        @ExcludeMissing
        fun rootSpanId(rootSpanId: JsonField<String>) = apply { this.rootSpanId = rootSpanId }

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
        fun spanParents(spanParents: List<String>) = spanParents(JsonField.of(spanParents))

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
        @JsonProperty("span_parents")
        @ExcludeMissing
        fun spanParents(spanParents: JsonField<List<String>>) = apply {
            this.spanParents = spanParents
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

        fun build(): InsertDatasetEvent =
            InsertDatasetEvent(
                input,
                expected,
                metadata,
                tags.map { it.toImmutable() },
                id,
                created,
                _objectDelete,
                _isMerge,
                _mergePaths.map { it.toImmutable() },
                _parentId,
                spanId,
                rootSpanId,
                spanParents.map { it.toImmutable() },
                additionalProperties.toImmutable(),
            )
    }

    /**
     * A dictionary with additional data about the test example, model outputs, or just about
     * anything else that's relevant, that you can use to help find and analyze examples later. For
     * example, you could log the `prompt`, example's `id`, or anything else that would be useful to
     * slice/dice later. The values in `metadata` can be any JSON-serializable type, but its keys
     * must be strings
     */
    @JsonDeserialize(builder = Metadata.Builder::class)
    @NoAutoDetect
    class Metadata
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Metadata = apply {
            if (!validated) {
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

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

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is InsertDatasetEvent && input == other.input && expected == other.expected && metadata == other.metadata && tags == other.tags && id == other.id && created == other.created && _objectDelete == other._objectDelete && _isMerge == other._isMerge && _mergePaths == other._mergePaths && _parentId == other._parentId && spanId == other.spanId && rootSpanId == other.rootSpanId && spanParents == other.spanParents && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(input, expected, metadata, tags, id, created, _objectDelete, _isMerge, _mergePaths, _parentId, spanId, rootSpanId, spanParents, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InsertDatasetEvent{input=$input, expected=$expected, metadata=$metadata, tags=$tags, id=$id, created=$created, _objectDelete=$_objectDelete, _isMerge=$_isMerge, _mergePaths=$_mergePaths, _parentId=$_parentId, spanId=$spanId, rootSpanId=$rootSpanId, spanParents=$spanParents, additionalProperties=$additionalProperties}"
}
