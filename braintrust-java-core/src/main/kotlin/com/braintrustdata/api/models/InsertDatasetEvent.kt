// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.immutableEmptyMap
import com.braintrustdata.api.core.toImmutable
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

/** A dataset event */
@NoAutoDetect
class InsertDatasetEvent
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
    @JsonProperty("created")
    @ExcludeMissing
    private val created: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("expected") @ExcludeMissing private val expected: JsonValue = JsonMissing.of(),
    @JsonProperty("input") @ExcludeMissing private val input: JsonValue = JsonMissing.of(),
    @JsonProperty("metadata")
    @ExcludeMissing
    private val metadata: JsonField<Metadata> = JsonMissing.of(),
    @JsonProperty("root_span_id")
    @ExcludeMissing
    private val rootSpanId: JsonField<String> = JsonMissing.of(),
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
     * A unique identifier for the dataset event. If you don't provide one, BrainTrust will generate
     * one for you
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
     * Pass `_object_delete=true` to mark the dataset event deleted. Deleted events will not show up
     * in subsequent fetches for this dataset
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

    /** The timestamp the dataset event was created */
    fun created(): Optional<OffsetDateTime> = Optional.ofNullable(created.getNullable("created"))

    /**
     * The output of your application, including post-processing (an arbitrary, JSON serializable
     * object)
     */
    @JsonProperty("expected") @ExcludeMissing fun _expected(): JsonValue = expected

    /** The argument that uniquely define an input case (an arbitrary, JSON serializable object) */
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
     * A unique identifier for the dataset event. If you don't provide one, BrainTrust will generate
     * one for you
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
     * Pass `_object_delete=true` to mark the dataset event deleted. Deleted events will not show up
     * in subsequent fetches for this dataset
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

    /** The timestamp the dataset event was created */
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

    fun validate(): InsertDatasetEvent = apply {
        if (validated) {
            return@apply
        }

        id()
        _isMerge()
        _mergePaths()
        _objectDelete()
        _parentId()
        created()
        metadata().ifPresent { it.validate() }
        rootSpanId()
        spanId()
        spanParents()
        tags()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InsertDatasetEvent]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var _isMerge: JsonField<Boolean> = JsonMissing.of()
        private var _mergePaths: JsonField<MutableList<List<String>>>? = null
        private var _objectDelete: JsonField<Boolean> = JsonMissing.of()
        private var _parentId: JsonField<String> = JsonMissing.of()
        private var created: JsonField<OffsetDateTime> = JsonMissing.of()
        private var expected: JsonValue = JsonMissing.of()
        private var input: JsonValue = JsonMissing.of()
        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var rootSpanId: JsonField<String> = JsonMissing.of()
        private var spanId: JsonField<String> = JsonMissing.of()
        private var spanParents: JsonField<MutableList<String>>? = null
        private var tags: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(insertDatasetEvent: InsertDatasetEvent) = apply {
            id = insertDatasetEvent.id
            _isMerge = insertDatasetEvent._isMerge
            _mergePaths = insertDatasetEvent._mergePaths.map { it.toMutableList() }
            _objectDelete = insertDatasetEvent._objectDelete
            _parentId = insertDatasetEvent._parentId
            created = insertDatasetEvent.created
            expected = insertDatasetEvent.expected
            input = insertDatasetEvent.input
            metadata = insertDatasetEvent.metadata
            rootSpanId = insertDatasetEvent.rootSpanId
            spanId = insertDatasetEvent.spanId
            spanParents = insertDatasetEvent.spanParents.map { it.toMutableList() }
            tags = insertDatasetEvent.tags.map { it.toMutableList() }
            additionalProperties = insertDatasetEvent.additionalProperties.toMutableMap()
        }

        /**
         * A unique identifier for the dataset event. If you don't provide one, BrainTrust will
         * generate one for you
         */
        fun id(id: String?) = id(JsonField.ofNullable(id))

        /**
         * A unique identifier for the dataset event. If you don't provide one, BrainTrust will
         * generate one for you
         */
        fun id(id: Optional<String>) = id(id.orElse(null))

        /**
         * A unique identifier for the dataset event. If you don't provide one, BrainTrust will
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
                (_mergePaths ?: JsonField.of(mutableListOf())).apply {
                    asKnown()
                        .orElseThrow {
                            IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            )
                        }
                        .add(mergePath)
                }
        }

        /**
         * Pass `_object_delete=true` to mark the dataset event deleted. Deleted events will not
         * show up in subsequent fetches for this dataset
         */
        fun _objectDelete(_objectDelete: Boolean?) =
            _objectDelete(JsonField.ofNullable(_objectDelete))

        /**
         * Pass `_object_delete=true` to mark the dataset event deleted. Deleted events will not
         * show up in subsequent fetches for this dataset
         */
        fun _objectDelete(_objectDelete: Boolean) = _objectDelete(_objectDelete as Boolean?)

        /**
         * Pass `_object_delete=true` to mark the dataset event deleted. Deleted events will not
         * show up in subsequent fetches for this dataset
         */
        @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
        fun _objectDelete(_objectDelete: Optional<Boolean>) =
            _objectDelete(_objectDelete.orElse(null) as Boolean?)

        /**
         * Pass `_object_delete=true` to mark the dataset event deleted. Deleted events will not
         * show up in subsequent fetches for this dataset
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

        /** The timestamp the dataset event was created */
        fun created(created: OffsetDateTime?) = created(JsonField.ofNullable(created))

        /** The timestamp the dataset event was created */
        fun created(created: Optional<OffsetDateTime>) = created(created.orElse(null))

        /** The timestamp the dataset event was created */
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /**
         * The output of your application, including post-processing (an arbitrary, JSON
         * serializable object)
         */
        fun expected(expected: JsonValue) = apply { this.expected = expected }

        /**
         * The argument that uniquely define an input case (an arbitrary, JSON serializable object)
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
                (spanParents ?: JsonField.of(mutableListOf())).apply {
                    asKnown()
                        .orElseThrow {
                            IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            )
                        }
                        .add(spanParent)
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
            tags =
                (tags ?: JsonField.of(mutableListOf())).apply {
                    asKnown()
                        .orElseThrow {
                            IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            )
                        }
                        .add(tag)
                }
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

        fun build(): InsertDatasetEvent =
            InsertDatasetEvent(
                id,
                _isMerge,
                (_mergePaths ?: JsonMissing.of()).map { it.toImmutable() },
                _objectDelete,
                _parentId,
                created,
                expected,
                input,
                metadata,
                rootSpanId,
                spanId,
                (spanParents ?: JsonMissing.of()).map { it.toImmutable() },
                (tags ?: JsonMissing.of()).map { it.toImmutable() },
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is InsertDatasetEvent && id == other.id && _isMerge == other._isMerge && _mergePaths == other._mergePaths && _objectDelete == other._objectDelete && _parentId == other._parentId && created == other.created && expected == other.expected && input == other.input && metadata == other.metadata && rootSpanId == other.rootSpanId && spanId == other.spanId && spanParents == other.spanParents && tags == other.tags && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, _isMerge, _mergePaths, _objectDelete, _parentId, created, expected, input, metadata, rootSpanId, spanId, spanParents, tags, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InsertDatasetEvent{id=$id, _isMerge=$_isMerge, _mergePaths=$_mergePaths, _objectDelete=$_objectDelete, _parentId=$_parentId, created=$created, expected=$expected, input=$input, metadata=$metadata, rootSpanId=$rootSpanId, spanId=$spanId, spanParents=$spanParents, tags=$tags, additionalProperties=$additionalProperties}"
}
