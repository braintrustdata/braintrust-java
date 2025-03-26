// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.checkKnown
import com.braintrustdata.api.core.toImmutable
import com.braintrustdata.api.errors.BraintrustInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** A dataset event */
class InsertDatasetEvent
private constructor(
    private val id: JsonField<String>,
    private val _isMerge: JsonField<Boolean>,
    private val _mergePaths: JsonField<List<List<String>>>,
    private val _objectDelete: JsonField<Boolean>,
    private val _parentId: JsonField<String>,
    private val created: JsonField<OffsetDateTime>,
    private val expected: JsonValue,
    private val input: JsonValue,
    private val metadata: JsonField<Metadata>,
    private val origin: JsonField<ObjectReference>,
    private val rootSpanId: JsonField<String>,
    private val spanId: JsonField<String>,
    private val spanParents: JsonField<List<String>>,
    private val tags: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("_is_merge") @ExcludeMissing _isMerge: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("_merge_paths")
        @ExcludeMissing
        _mergePaths: JsonField<List<List<String>>> = JsonMissing.of(),
        @JsonProperty("_object_delete")
        @ExcludeMissing
        _objectDelete: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("_parent_id") @ExcludeMissing _parentId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created")
        @ExcludeMissing
        created: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("expected") @ExcludeMissing expected: JsonValue = JsonMissing.of(),
        @JsonProperty("input") @ExcludeMissing input: JsonValue = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("origin")
        @ExcludeMissing
        origin: JsonField<ObjectReference> = JsonMissing.of(),
        @JsonProperty("root_span_id")
        @ExcludeMissing
        rootSpanId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("span_id") @ExcludeMissing spanId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("span_parents")
        @ExcludeMissing
        spanParents: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<String>> = JsonMissing.of(),
    ) : this(
        id,
        _isMerge,
        _mergePaths,
        _objectDelete,
        _parentId,
        created,
        expected,
        input,
        metadata,
        origin,
        rootSpanId,
        spanId,
        spanParents,
        tags,
        mutableMapOf(),
    )

    /**
     * A unique identifier for the dataset event. If you don't provide one, BrainTrust will generate
     * one for you
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
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
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
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
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun _mergePaths(): Optional<List<List<String>>> =
        Optional.ofNullable(_mergePaths.getNullable("_merge_paths"))

    /**
     * Pass `_object_delete=true` to mark the dataset event deleted. Deleted events will not show up
     * in subsequent fetches for this dataset
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun _objectDelete(): Optional<Boolean> =
        Optional.ofNullable(_objectDelete.getNullable("_object_delete"))

    /**
     * DEPRECATED: The `_parent_id` field is deprecated and should not be used. Support for
     * `_parent_id` will be dropped in a future version of Braintrust. Log `span_id`,
     * `root_span_id`, and `span_parents` explicitly instead.
     *
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
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun _parentId(): Optional<String> = Optional.ofNullable(_parentId.getNullable("_parent_id"))

    /**
     * The timestamp the dataset event was created
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
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
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata.getNullable("metadata"))

    /**
     * Indicates the event was copied from another object.
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun origin(): Optional<ObjectReference> = Optional.ofNullable(origin.getNullable("origin"))

    /**
     * Use `span_id`, `root_span_id`, and `span_parents` instead of `_parent_id`, which is now
     * deprecated. The span_id is a unique identifier describing the row's place in the a trace, and
     * the root_span_id is a unique identifier for the whole trace. See the
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
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rootSpanId(): Optional<String> = Optional.ofNullable(rootSpanId.getNullable("root_span_id"))

    /**
     * Use `span_id`, `root_span_id`, and `span_parents` instead of `_parent_id`, which is now
     * deprecated. The span_id is a unique identifier describing the row's place in the a trace, and
     * the root_span_id is a unique identifier for the whole trace. See the
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
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun spanId(): Optional<String> = Optional.ofNullable(spanId.getNullable("span_id"))

    /**
     * Use `span_id`, `root_span_id`, and `span_parents` instead of `_parent_id`, which is now
     * deprecated. The span_id is a unique identifier describing the row's place in the a trace, and
     * the root_span_id is a unique identifier for the whole trace. See the
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
     * Returns the raw JSON value of [_isMerge].
     *
     * Unlike [_isMerge], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("_is_merge") @ExcludeMissing fun __isMerge(): JsonField<Boolean> = _isMerge

    /**
     * Returns the raw JSON value of [_mergePaths].
     *
     * Unlike [_mergePaths], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("_merge_paths")
    @ExcludeMissing
    fun __mergePaths(): JsonField<List<List<String>>> = _mergePaths

    /**
     * Returns the raw JSON value of [_objectDelete].
     *
     * Unlike [_objectDelete], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("_object_delete")
    @ExcludeMissing
    fun __objectDelete(): JsonField<Boolean> = _objectDelete

    /**
     * Returns the raw JSON value of [_parentId].
     *
     * Unlike [_parentId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("_parent_id") @ExcludeMissing fun __parentId(): JsonField<String> = _parentId

    /**
     * Returns the raw JSON value of [created].
     *
     * Unlike [created], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<OffsetDateTime> = created

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    /**
     * Returns the raw JSON value of [origin].
     *
     * Unlike [origin], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("origin") @ExcludeMissing fun _origin(): JsonField<ObjectReference> = origin

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

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /** Returns a mutable builder for constructing an instance of [InsertDatasetEvent]. */
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
        private var origin: JsonField<ObjectReference> = JsonMissing.of()
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
            origin = insertDatasetEvent.origin
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

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<String>) = id(id.getOrNull())

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
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
         * Alias for [Builder._isMerge].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun _isMerge(_isMerge: Boolean) = _isMerge(_isMerge as Boolean?)

        /** Alias for calling [Builder._isMerge] with `_isMerge.orElse(null)`. */
        fun _isMerge(_isMerge: Optional<Boolean>) = _isMerge(_isMerge.getOrNull())

        /**
         * Sets [Builder._isMerge] to an arbitrary JSON value.
         *
         * You should usually call [Builder._isMerge] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
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

        /** Alias for calling [Builder._mergePaths] with `_mergePaths.orElse(null)`. */
        fun _mergePaths(_mergePaths: Optional<List<List<String>>>) =
            _mergePaths(_mergePaths.getOrNull())

        /**
         * Sets [Builder._mergePaths] to an arbitrary JSON value.
         *
         * You should usually call [Builder._mergePaths] with a well-typed `List<List<String>>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun _mergePaths(_mergePaths: JsonField<List<List<String>>>) = apply {
            this._mergePaths = _mergePaths.map { it.toMutableList() }
        }

        /**
         * Adds a single [List<String>] to [_mergePaths].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addMergePath(mergePath: List<String>) = apply {
            _mergePaths =
                (_mergePaths ?: JsonField.of(mutableListOf())).also {
                    checkKnown("_mergePaths", it).add(mergePath)
                }
        }

        /**
         * Pass `_object_delete=true` to mark the dataset event deleted. Deleted events will not
         * show up in subsequent fetches for this dataset
         */
        fun _objectDelete(_objectDelete: Boolean?) =
            _objectDelete(JsonField.ofNullable(_objectDelete))

        /**
         * Alias for [Builder._objectDelete].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun _objectDelete(_objectDelete: Boolean) = _objectDelete(_objectDelete as Boolean?)

        /** Alias for calling [Builder._objectDelete] with `_objectDelete.orElse(null)`. */
        fun _objectDelete(_objectDelete: Optional<Boolean>) =
            _objectDelete(_objectDelete.getOrNull())

        /**
         * Sets [Builder._objectDelete] to an arbitrary JSON value.
         *
         * You should usually call [Builder._objectDelete] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun _objectDelete(_objectDelete: JsonField<Boolean>) = apply {
            this._objectDelete = _objectDelete
        }

        /**
         * DEPRECATED: The `_parent_id` field is deprecated and should not be used. Support for
         * `_parent_id` will be dropped in a future version of Braintrust. Log `span_id`,
         * `root_span_id`, and `span_parents` explicitly instead.
         *
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

        /** Alias for calling [Builder._parentId] with `_parentId.orElse(null)`. */
        fun _parentId(_parentId: Optional<String>) = _parentId(_parentId.getOrNull())

        /**
         * Sets [Builder._parentId] to an arbitrary JSON value.
         *
         * You should usually call [Builder._parentId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun _parentId(_parentId: JsonField<String>) = apply { this._parentId = _parentId }

        /** The timestamp the dataset event was created */
        fun created(created: OffsetDateTime?) = created(JsonField.ofNullable(created))

        /** Alias for calling [Builder.created] with `created.orElse(null)`. */
        fun created(created: Optional<OffsetDateTime>) = created(created.getOrNull())

        /**
         * Sets [Builder.created] to an arbitrary JSON value.
         *
         * You should usually call [Builder.created] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
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
         * Use `span_id`, `root_span_id`, and `span_parents` instead of `_parent_id`, which is now
         * deprecated. The span_id is a unique identifier describing the row's place in the a trace,
         * and the root_span_id is a unique identifier for the whole trace. See the
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

        /** Alias for calling [Builder.rootSpanId] with `rootSpanId.orElse(null)`. */
        fun rootSpanId(rootSpanId: Optional<String>) = rootSpanId(rootSpanId.getOrNull())

        /**
         * Sets [Builder.rootSpanId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rootSpanId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun rootSpanId(rootSpanId: JsonField<String>) = apply { this.rootSpanId = rootSpanId }

        /**
         * Use `span_id`, `root_span_id`, and `span_parents` instead of `_parent_id`, which is now
         * deprecated. The span_id is a unique identifier describing the row's place in the a trace,
         * and the root_span_id is a unique identifier for the whole trace. See the
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

        /** Alias for calling [Builder.spanId] with `spanId.orElse(null)`. */
        fun spanId(spanId: Optional<String>) = spanId(spanId.getOrNull())

        /**
         * Sets [Builder.spanId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.spanId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun spanId(spanId: JsonField<String>) = apply { this.spanId = spanId }

        /**
         * Use `span_id`, `root_span_id`, and `span_parents` instead of `_parent_id`, which is now
         * deprecated. The span_id is a unique identifier describing the row's place in the a trace,
         * and the root_span_id is a unique identifier for the whole trace. See the
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
         * Returns an immutable instance of [InsertDatasetEvent].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
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
                origin,
                rootSpanId,
                spanId,
                (spanParents ?: JsonMissing.of()).map { it.toImmutable() },
                (tags ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

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
        origin().ifPresent { it.validate() }
        rootSpanId()
        spanId()
        spanParents()
        tags()
        validated = true
    }

    /**
     * A dictionary with additional data about the test example, model outputs, or just about
     * anything else that's relevant, that you can use to help find and analyze examples later. For
     * example, you could log the `prompt`, example's `id`, or anything else that would be useful to
     * slice/dice later. The values in `metadata` can be any JSON-serializable type, but its keys
     * must be strings
     */
    class Metadata
    private constructor(
        private val model: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("model") @ExcludeMissing model: JsonField<String> = JsonMissing.of()
        ) : this(model, mutableMapOf())

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

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

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
            fun build(): Metadata = Metadata(model, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Metadata = apply {
            if (validated) {
                return@apply
            }

            model()
            validated = true
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is InsertDatasetEvent && id == other.id && _isMerge == other._isMerge && _mergePaths == other._mergePaths && _objectDelete == other._objectDelete && _parentId == other._parentId && created == other.created && expected == other.expected && input == other.input && metadata == other.metadata && origin == other.origin && rootSpanId == other.rootSpanId && spanId == other.spanId && spanParents == other.spanParents && tags == other.tags && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, _isMerge, _mergePaths, _objectDelete, _parentId, created, expected, input, metadata, origin, rootSpanId, spanId, spanParents, tags, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InsertDatasetEvent{id=$id, _isMerge=$_isMerge, _mergePaths=$_mergePaths, _objectDelete=$_objectDelete, _parentId=$_parentId, created=$created, expected=$expected, input=$input, metadata=$metadata, origin=$origin, rootSpanId=$rootSpanId, spanId=$spanId, spanParents=$spanParents, tags=$tags, additionalProperties=$additionalProperties}"
}
