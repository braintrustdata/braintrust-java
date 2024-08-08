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

@JsonDeserialize(builder = InsertDatasetEventReplace.Builder::class)
@NoAutoDetect
class InsertDatasetEventReplace
private constructor(
    private val input: JsonValue,
    private val expected: JsonValue,
    private val metadata: JsonField<Metadata>,
    private val tags: JsonField<List<String>>,
    private val id: JsonField<String>,
    private val created: JsonField<OffsetDateTime>,
    private val _objectDelete: JsonField<Boolean>,
    private val _isMerge: JsonField<Boolean>,
    private val _parentId: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

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
     * the new row. When set to `true`, the new row is deep-merged into the existing row
     *
     * For example, say there is an existing row in the DB `{"id": "foo", "input": {"a": 5, "b":
     * 10}}`. If we merge a new row as `{"_is_merge": true, "id": "foo", "input": {"b": 11, "c":
     * 20}}`, the new row will be `{"id": "foo", "input": {"a": 5, "b": 11, "c": 20}}`. If we
     * replace the new row as `{"id": "foo", "input": {"b": 11, "c": 20}}`, the new row will be
     * `{"id": "foo", "input": {"b": 11, "c": 20}}`
     */
    fun _isMerge(): Optional<Boolean> = Optional.ofNullable(_isMerge.getNullable("_is_merge"))

    /**
     * Use the `_parent_id` field to create this row as a subspan of an existing row. It cannot be
     * specified alongside `_is_merge=true`. Tracking hierarchical relationships are important for
     * tracing (see the [guide](https://www.braintrust.dev/docs/guides/tracing) for full details).
     *
     * For example, say we have logged a row `{"id": "abc", "input": "foo", "output": "bar",
     * "expected": "boo", "scores": {"correctness": 0.33}}`. We can create a sub-span of the parent
     * row by logging `{"_parent_id": "abc", "id": "llm_call", "input": {"prompt": "What comes after
     * foo?"}, "output": "bar", "metrics": {"tokens": 1}}`. In the webapp, only the root span row
     * `"abc"` will show up in the summary view. You can view the full trace hierarchy (in this
     * case, the `"llm_call"` row) by clicking on the "abc" row.
     */
    fun _parentId(): Optional<String> = Optional.ofNullable(_parentId.getNullable("_parent_id"))

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
     * the new row. When set to `true`, the new row is deep-merged into the existing row
     *
     * For example, say there is an existing row in the DB `{"id": "foo", "input": {"a": 5, "b":
     * 10}}`. If we merge a new row as `{"_is_merge": true, "id": "foo", "input": {"b": 11, "c":
     * 20}}`, the new row will be `{"id": "foo", "input": {"a": 5, "b": 11, "c": 20}}`. If we
     * replace the new row as `{"id": "foo", "input": {"b": 11, "c": 20}}`, the new row will be
     * `{"id": "foo", "input": {"b": 11, "c": 20}}`
     */
    @JsonProperty("_is_merge") @ExcludeMissing fun __isMerge() = _isMerge

    /**
     * Use the `_parent_id` field to create this row as a subspan of an existing row. It cannot be
     * specified alongside `_is_merge=true`. Tracking hierarchical relationships are important for
     * tracing (see the [guide](https://www.braintrust.dev/docs/guides/tracing) for full details).
     *
     * For example, say we have logged a row `{"id": "abc", "input": "foo", "output": "bar",
     * "expected": "boo", "scores": {"correctness": 0.33}}`. We can create a sub-span of the parent
     * row by logging `{"_parent_id": "abc", "id": "llm_call", "input": {"prompt": "What comes after
     * foo?"}, "output": "bar", "metrics": {"tokens": 1}}`. In the webapp, only the root span row
     * `"abc"` will show up in the summary view. You can view the full trace hierarchy (in this
     * case, the `"llm_call"` row) by clicking on the "abc" row.
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
            created()
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
            this.created == other.created &&
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
                    created,
                    _objectDelete,
                    _isMerge,
                    _parentId,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "InsertDatasetEventReplace{input=$input, expected=$expected, metadata=$metadata, tags=$tags, id=$id, created=$created, _objectDelete=$_objectDelete, _isMerge=$_isMerge, _parentId=$_parentId, additionalProperties=$additionalProperties}"

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
        private var _parentId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(insertDatasetEventReplace: InsertDatasetEventReplace) = apply {
            this.input = insertDatasetEventReplace.input
            this.expected = insertDatasetEventReplace.expected
            this.metadata = insertDatasetEventReplace.metadata
            this.tags = insertDatasetEventReplace.tags
            this.id = insertDatasetEventReplace.id
            this.created = insertDatasetEventReplace.created
            this._objectDelete = insertDatasetEventReplace._objectDelete
            this._isMerge = insertDatasetEventReplace._isMerge
            this._parentId = insertDatasetEventReplace._parentId
            additionalProperties(insertDatasetEventReplace.additionalProperties)
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
         * row
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
         * row
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
         * Use the `_parent_id` field to create this row as a subspan of an existing row. It cannot
         * be specified alongside `_is_merge=true`. Tracking hierarchical relationships are
         * important for tracing (see the [guide](https://www.braintrust.dev/docs/guides/tracing)
         * for full details).
         *
         * For example, say we have logged a row `{"id": "abc", "input": "foo", "output": "bar",
         * "expected": "boo", "scores": {"correctness": 0.33}}`. We can create a sub-span of the
         * parent row by logging `{"_parent_id": "abc", "id": "llm_call", "input": {"prompt": "What
         * comes after foo?"}, "output": "bar", "metrics": {"tokens": 1}}`. In the webapp, only the
         * root span row `"abc"` will show up in the summary view. You can view the full trace
         * hierarchy (in this case, the `"llm_call"` row) by clicking on the "abc" row.
         */
        fun _parentId(_parentId: String) = _parentId(JsonField.of(_parentId))

        /**
         * Use the `_parent_id` field to create this row as a subspan of an existing row. It cannot
         * be specified alongside `_is_merge=true`. Tracking hierarchical relationships are
         * important for tracing (see the [guide](https://www.braintrust.dev/docs/guides/tracing)
         * for full details).
         *
         * For example, say we have logged a row `{"id": "abc", "input": "foo", "output": "bar",
         * "expected": "boo", "scores": {"correctness": 0.33}}`. We can create a sub-span of the
         * parent row by logging `{"_parent_id": "abc", "id": "llm_call", "input": {"prompt": "What
         * comes after foo?"}, "output": "bar", "metrics": {"tokens": 1}}`. In the webapp, only the
         * root span row `"abc"` will show up in the summary view. You can view the full trace
         * hierarchy (in this case, the `"llm_call"` row) by clicking on the "abc" row.
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

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun build(): InsertDatasetEventReplace =
            InsertDatasetEventReplace(
                input,
                expected,
                metadata,
                tags.map { it.toUnmodifiable() },
                id,
                created,
                _objectDelete,
                _isMerge,
                _parentId,
                additionalProperties.toUnmodifiable(),
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

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): Metadata = Metadata(additionalProperties.toUnmodifiable())
        }
    }
}
