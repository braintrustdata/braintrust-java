// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.checkKnown
import com.braintrustdata.api.core.checkRequired
import com.braintrustdata.api.core.immutableEmptyMap
import com.braintrustdata.api.core.toImmutable
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

@NoAutoDetect
class DatasetEvent
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("_xact_id")
    @ExcludeMissing
    private val _xactId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("created")
    @ExcludeMissing
    private val created: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("dataset_id")
    @ExcludeMissing
    private val datasetId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("project_id")
    @ExcludeMissing
    private val projectId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("root_span_id")
    @ExcludeMissing
    private val rootSpanId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("span_id")
    @ExcludeMissing
    private val spanId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("expected") @ExcludeMissing private val expected: JsonValue = JsonMissing.of(),
    @JsonProperty("input") @ExcludeMissing private val input: JsonValue = JsonMissing.of(),
    @JsonProperty("is_root")
    @ExcludeMissing
    private val isRoot: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("metadata")
    @ExcludeMissing
    private val metadata: JsonField<Metadata> = JsonMissing.of(),
    @JsonProperty("origin")
    @ExcludeMissing
    private val origin: JsonField<ObjectReference> = JsonMissing.of(),
    @JsonProperty("tags")
    @ExcludeMissing
    private val tags: JsonField<List<String>> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * A unique identifier for the dataset event. If you don't provide one, BrainTrust will generate
     * one for you
     */
    fun id(): String = id.getRequired("id")

    /**
     * The transaction id of an event is unique to the network operation that processed the event
     * insertion. Transaction ids are monotonically increasing over time and can be used to retrieve
     * a versioned snapshot of the dataset (see the `version` parameter)
     */
    fun _xactId(): String = _xactId.getRequired("_xact_id")

    /** The timestamp the dataset event was created */
    fun created(): OffsetDateTime = created.getRequired("created")

    /** Unique identifier for the dataset */
    fun datasetId(): String = datasetId.getRequired("dataset_id")

    /** Unique identifier for the project that the dataset belongs under */
    fun projectId(): String = projectId.getRequired("project_id")

    /** A unique identifier for the trace this dataset event belongs to */
    fun rootSpanId(): String = rootSpanId.getRequired("root_span_id")

    /**
     * A unique identifier used to link different dataset events together as part of a full trace.
     * See the [tracing guide](https://www.braintrust.dev/docs/guides/tracing) for full details on
     * tracing
     */
    fun spanId(): String = spanId.getRequired("span_id")

    /**
     * The output of your application, including post-processing (an arbitrary, JSON serializable
     * object)
     */
    @JsonProperty("expected") @ExcludeMissing fun _expected(): JsonValue = expected

    /** The argument that uniquely define an input case (an arbitrary, JSON serializable object) */
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

    /** Indicates the event was copied from another object. */
    fun origin(): Optional<ObjectReference> = Optional.ofNullable(origin.getNullable("origin"))

    /** A list of tags to log */
    fun tags(): Optional<List<String>> = Optional.ofNullable(tags.getNullable("tags"))

    /**
     * A unique identifier for the dataset event. If you don't provide one, BrainTrust will generate
     * one for you
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * The transaction id of an event is unique to the network operation that processed the event
     * insertion. Transaction ids are monotonically increasing over time and can be used to retrieve
     * a versioned snapshot of the dataset (see the `version` parameter)
     */
    @JsonProperty("_xact_id") @ExcludeMissing fun __xactId(): JsonField<String> = _xactId

    /** The timestamp the dataset event was created */
    @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<OffsetDateTime> = created

    /** Unique identifier for the dataset */
    @JsonProperty("dataset_id") @ExcludeMissing fun _datasetId(): JsonField<String> = datasetId

    /** Unique identifier for the project that the dataset belongs under */
    @JsonProperty("project_id") @ExcludeMissing fun _projectId(): JsonField<String> = projectId

    /** A unique identifier for the trace this dataset event belongs to */
    @JsonProperty("root_span_id") @ExcludeMissing fun _rootSpanId(): JsonField<String> = rootSpanId

    /**
     * A unique identifier used to link different dataset events together as part of a full trace.
     * See the [tracing guide](https://www.braintrust.dev/docs/guides/tracing) for full details on
     * tracing
     */
    @JsonProperty("span_id") @ExcludeMissing fun _spanId(): JsonField<String> = spanId

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

    /** Indicates the event was copied from another object. */
    @JsonProperty("origin") @ExcludeMissing fun _origin(): JsonField<ObjectReference> = origin

    /** A list of tags to log */
    @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<String>> = tags

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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
         * A unique identifier for the dataset event. If you don't provide one, BrainTrust will
         * generate one for you
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * The transaction id of an event is unique to the network operation that processed the
         * event insertion. Transaction ids are monotonically increasing over time and can be used
         * to retrieve a versioned snapshot of the dataset (see the `version` parameter)
         */
        fun _xactId(_xactId: String) = _xactId(JsonField.of(_xactId))

        /**
         * The transaction id of an event is unique to the network operation that processed the
         * event insertion. Transaction ids are monotonically increasing over time and can be used
         * to retrieve a versioned snapshot of the dataset (see the `version` parameter)
         */
        fun _xactId(_xactId: JsonField<String>) = apply { this._xactId = _xactId }

        /** The timestamp the dataset event was created */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /** The timestamp the dataset event was created */
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /** Unique identifier for the dataset */
        fun datasetId(datasetId: String) = datasetId(JsonField.of(datasetId))

        /** Unique identifier for the dataset */
        fun datasetId(datasetId: JsonField<String>) = apply { this.datasetId = datasetId }

        /** Unique identifier for the project that the dataset belongs under */
        fun projectId(projectId: String) = projectId(JsonField.of(projectId))

        /** Unique identifier for the project that the dataset belongs under */
        fun projectId(projectId: JsonField<String>) = apply { this.projectId = projectId }

        /** A unique identifier for the trace this dataset event belongs to */
        fun rootSpanId(rootSpanId: String) = rootSpanId(JsonField.of(rootSpanId))

        /** A unique identifier for the trace this dataset event belongs to */
        fun rootSpanId(rootSpanId: JsonField<String>) = apply { this.rootSpanId = rootSpanId }

        /**
         * A unique identifier used to link different dataset events together as part of a full
         * trace. See the [tracing guide](https://www.braintrust.dev/docs/guides/tracing) for full
         * details on tracing
         */
        fun spanId(spanId: String) = spanId(JsonField.of(spanId))

        /**
         * A unique identifier used to link different dataset events together as part of a full
         * trace. See the [tracing guide](https://www.braintrust.dev/docs/guides/tracing) for full
         * details on tracing
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

        /** Indicates the event was copied from another object. */
        fun origin(origin: ObjectReference?) = origin(JsonField.ofNullable(origin))

        /** Indicates the event was copied from another object. */
        fun origin(origin: Optional<ObjectReference>) = origin(origin.getOrNull())

        /** Indicates the event was copied from another object. */
        fun origin(origin: JsonField<ObjectReference>) = apply { this.origin = origin }

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
