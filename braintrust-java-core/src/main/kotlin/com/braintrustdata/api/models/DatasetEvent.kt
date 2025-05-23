// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.checkKnown
import com.braintrustdata.api.core.checkRequired
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

class DatasetEvent
private constructor(
    private val id: JsonField<String>,
    private val _xactId: JsonField<String>,
    private val created: JsonField<OffsetDateTime>,
    private val datasetId: JsonField<String>,
    private val projectId: JsonField<String>,
    private val rootSpanId: JsonField<String>,
    private val spanId: JsonField<String>,
    private val expected: JsonValue,
    private val input: JsonValue,
    private val isRoot: JsonField<Boolean>,
    private val metadata: JsonField<Metadata>,
    private val origin: JsonField<ObjectReference>,
    private val tags: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("_xact_id") @ExcludeMissing _xactId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created")
        @ExcludeMissing
        created: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("dataset_id") @ExcludeMissing datasetId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("project_id") @ExcludeMissing projectId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("root_span_id")
        @ExcludeMissing
        rootSpanId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("span_id") @ExcludeMissing spanId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("expected") @ExcludeMissing expected: JsonValue = JsonMissing.of(),
        @JsonProperty("input") @ExcludeMissing input: JsonValue = JsonMissing.of(),
        @JsonProperty("is_root") @ExcludeMissing isRoot: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("origin")
        @ExcludeMissing
        origin: JsonField<ObjectReference> = JsonMissing.of(),
        @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<String>> = JsonMissing.of(),
    ) : this(
        id,
        _xactId,
        created,
        datasetId,
        projectId,
        rootSpanId,
        spanId,
        expected,
        input,
        isRoot,
        metadata,
        origin,
        tags,
        mutableMapOf(),
    )

    /**
     * A unique identifier for the dataset event. If you don't provide one, BrainTrust will generate
     * one for you
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The transaction id of an event is unique to the network operation that processed the event
     * insertion. Transaction ids are monotonically increasing over time and can be used to retrieve
     * a versioned snapshot of the dataset (see the `version` parameter)
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun _xactId(): String = _xactId.getRequired("_xact_id")

    /**
     * The timestamp the dataset event was created
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun created(): OffsetDateTime = created.getRequired("created")

    /**
     * Unique identifier for the dataset
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun datasetId(): String = datasetId.getRequired("dataset_id")

    /**
     * Unique identifier for the project that the dataset belongs under
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun projectId(): String = projectId.getRequired("project_id")

    /**
     * A unique identifier for the trace this dataset event belongs to
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun rootSpanId(): String = rootSpanId.getRequired("root_span_id")

    /**
     * A unique identifier used to link different dataset events together as part of a full trace.
     * See the [tracing guide](https://www.braintrust.dev/docs/guides/tracing) for full details on
     * tracing
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun spanId(): String = spanId.getRequired("span_id")

    /**
     * The output of your application, including post-processing (an arbitrary, JSON serializable
     * object)
     */
    @JsonProperty("expected") @ExcludeMissing fun _expected(): JsonValue = expected

    /** The argument that uniquely define an input case (an arbitrary, JSON serializable object) */
    @JsonProperty("input") @ExcludeMissing fun _input(): JsonValue = input

    /**
     * Whether this span is a root span
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isRoot(): Optional<Boolean> = isRoot.getOptional("is_root")

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
    fun metadata(): Optional<Metadata> = metadata.getOptional("metadata")

    /**
     * Indicates the event was copied from another object.
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun origin(): Optional<ObjectReference> = origin.getOptional("origin")

    /**
     * A list of tags to log
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tags(): Optional<List<String>> = tags.getOptional("tags")

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
     * Returns the raw JSON value of [datasetId].
     *
     * Unlike [datasetId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dataset_id") @ExcludeMissing fun _datasetId(): JsonField<String> = datasetId

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
     * Returns the raw JSON value of [origin].
     *
     * Unlike [origin], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("origin") @ExcludeMissing fun _origin(): JsonField<ObjectReference> = origin

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

        /**
         * Returns a mutable builder for constructing an instance of [DatasetEvent].
         *
         * The following fields are required:
         * ```java
         * .id()
         * ._xactId()
         * .created()
         * .datasetId()
         * .projectId()
         * .rootSpanId()
         * .spanId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DatasetEvent]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var _xactId: JsonField<String>? = null
        private var created: JsonField<OffsetDateTime>? = null
        private var datasetId: JsonField<String>? = null
        private var projectId: JsonField<String>? = null
        private var rootSpanId: JsonField<String>? = null
        private var spanId: JsonField<String>? = null
        private var expected: JsonValue = JsonMissing.of()
        private var input: JsonValue = JsonMissing.of()
        private var isRoot: JsonField<Boolean> = JsonMissing.of()
        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var origin: JsonField<ObjectReference> = JsonMissing.of()
        private var tags: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(datasetEvent: DatasetEvent) = apply {
            id = datasetEvent.id
            _xactId = datasetEvent._xactId
            created = datasetEvent.created
            datasetId = datasetEvent.datasetId
            projectId = datasetEvent.projectId
            rootSpanId = datasetEvent.rootSpanId
            spanId = datasetEvent.spanId
            expected = datasetEvent.expected
            input = datasetEvent.input
            isRoot = datasetEvent.isRoot
            metadata = datasetEvent.metadata
            origin = datasetEvent.origin
            tags = datasetEvent.tags.map { it.toMutableList() }
            additionalProperties = datasetEvent.additionalProperties.toMutableMap()
        }

        /**
         * A unique identifier for the dataset event. If you don't provide one, BrainTrust will
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
         * to retrieve a versioned snapshot of the dataset (see the `version` parameter)
         */
        fun _xactId(_xactId: String) = _xactId(JsonField.of(_xactId))

        /**
         * Sets [Builder._xactId] to an arbitrary JSON value.
         *
         * You should usually call [Builder._xactId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun _xactId(_xactId: JsonField<String>) = apply { this._xactId = _xactId }

        /** The timestamp the dataset event was created */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /**
         * Sets [Builder.created] to an arbitrary JSON value.
         *
         * You should usually call [Builder.created] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /** Unique identifier for the dataset */
        fun datasetId(datasetId: String) = datasetId(JsonField.of(datasetId))

        /**
         * Sets [Builder.datasetId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.datasetId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun datasetId(datasetId: JsonField<String>) = apply { this.datasetId = datasetId }

        /** Unique identifier for the project that the dataset belongs under */
        fun projectId(projectId: String) = projectId(JsonField.of(projectId))

        /**
         * Sets [Builder.projectId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.projectId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun projectId(projectId: JsonField<String>) = apply { this.projectId = projectId }

        /** A unique identifier for the trace this dataset event belongs to */
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
         * A unique identifier used to link different dataset events together as part of a full
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
         * The output of your application, including post-processing (an arbitrary, JSON
         * serializable object)
         */
        fun expected(expected: JsonValue) = apply { this.expected = expected }

        /**
         * The argument that uniquely define an input case (an arbitrary, JSON serializable object)
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
         * Returns an immutable instance of [DatasetEvent].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * ._xactId()
         * .created()
         * .datasetId()
         * .projectId()
         * .rootSpanId()
         * .spanId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DatasetEvent =
            DatasetEvent(
                checkRequired("id", id),
                checkRequired("_xactId", _xactId),
                checkRequired("created", created),
                checkRequired("datasetId", datasetId),
                checkRequired("projectId", projectId),
                checkRequired("rootSpanId", rootSpanId),
                checkRequired("spanId", spanId),
                expected,
                input,
                isRoot,
                metadata,
                origin,
                (tags ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): DatasetEvent = apply {
        if (validated) {
            return@apply
        }

        id()
        _xactId()
        created()
        datasetId()
        projectId()
        rootSpanId()
        spanId()
        isRoot()
        metadata().ifPresent { it.validate() }
        origin().ifPresent { it.validate() }
        tags()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: BraintrustInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (_xactId.asKnown().isPresent) 1 else 0) +
            (if (created.asKnown().isPresent) 1 else 0) +
            (if (datasetId.asKnown().isPresent) 1 else 0) +
            (if (projectId.asKnown().isPresent) 1 else 0) +
            (if (rootSpanId.asKnown().isPresent) 1 else 0) +
            (if (spanId.asKnown().isPresent) 1 else 0) +
            (if (isRoot.asKnown().isPresent) 1 else 0) +
            (metadata.asKnown().getOrNull()?.validity() ?: 0) +
            (origin.asKnown().getOrNull()?.validity() ?: 0) +
            (tags.asKnown().getOrNull()?.size ?: 0)

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
        fun model(): Optional<String> = model.getOptional("model")

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

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: BraintrustInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = (if (model.asKnown().isPresent) 1 else 0)

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

        return /* spotless:off */ other is DatasetEvent && id == other.id && _xactId == other._xactId && created == other.created && datasetId == other.datasetId && projectId == other.projectId && rootSpanId == other.rootSpanId && spanId == other.spanId && expected == other.expected && input == other.input && isRoot == other.isRoot && metadata == other.metadata && origin == other.origin && tags == other.tags && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, _xactId, created, datasetId, projectId, rootSpanId, spanId, expected, input, isRoot, metadata, origin, tags, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DatasetEvent{id=$id, _xactId=$_xactId, created=$created, datasetId=$datasetId, projectId=$projectId, rootSpanId=$rootSpanId, spanId=$spanId, expected=$expected, input=$input, isRoot=$isRoot, metadata=$metadata, origin=$origin, tags=$tags, additionalProperties=$additionalProperties}"
}
