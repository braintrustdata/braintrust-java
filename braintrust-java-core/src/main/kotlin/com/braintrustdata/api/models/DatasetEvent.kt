// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.Enum
import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.toImmutable
import com.braintrustdata.api.errors.BraintrustInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = DatasetEvent.Builder::class)
@NoAutoDetect
class DatasetEvent
private constructor(
    private val id: JsonField<String>,
    private val _xactId: JsonField<String>,
    private val created: JsonField<OffsetDateTime>,
    private val projectId: JsonField<String>,
    private val datasetId: JsonField<String>,
    private val input: JsonValue,
    private val expected: JsonValue,
    private val metadata: JsonField<Metadata>,
    private val tags: JsonField<List<String>>,
    private val spanId: JsonField<String>,
    private val rootSpanId: JsonField<String>,
    private val isRoot: JsonField<Boolean>,
    private val origin: JsonField<Origin>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

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

    /** Unique identifier for the project that the dataset belongs under */
    fun projectId(): String = projectId.getRequired("project_id")

    /** Unique identifier for the dataset */
    fun datasetId(): String = datasetId.getRequired("dataset_id")

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
     * A unique identifier used to link different dataset events together as part of a full trace.
     * See the [tracing guide](https://www.braintrust.dev/docs/guides/tracing) for full details on
     * tracing
     */
    fun spanId(): String = spanId.getRequired("span_id")

    /** The `span_id` of the root of the trace this dataset event belongs to */
    fun rootSpanId(): String = rootSpanId.getRequired("root_span_id")

    /** Whether this span is a root span */
    fun isRoot(): Optional<Boolean> = Optional.ofNullable(isRoot.getNullable("is_root"))

    /** Indicates the event was copied from another object. */
    fun origin(): Optional<Origin> = Optional.ofNullable(origin.getNullable("origin"))

    /**
     * A unique identifier for the dataset event. If you don't provide one, BrainTrust will generate
     * one for you
     */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /**
     * The transaction id of an event is unique to the network operation that processed the event
     * insertion. Transaction ids are monotonically increasing over time and can be used to retrieve
     * a versioned snapshot of the dataset (see the `version` parameter)
     */
    @JsonProperty("_xact_id") @ExcludeMissing fun __xactId() = _xactId

    /** The timestamp the dataset event was created */
    @JsonProperty("created") @ExcludeMissing fun _created() = created

    /** Unique identifier for the project that the dataset belongs under */
    @JsonProperty("project_id") @ExcludeMissing fun _projectId() = projectId

    /** Unique identifier for the dataset */
    @JsonProperty("dataset_id") @ExcludeMissing fun _datasetId() = datasetId

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
     * A unique identifier used to link different dataset events together as part of a full trace.
     * See the [tracing guide](https://www.braintrust.dev/docs/guides/tracing) for full details on
     * tracing
     */
    @JsonProperty("span_id") @ExcludeMissing fun _spanId() = spanId

    /** The `span_id` of the root of the trace this dataset event belongs to */
    @JsonProperty("root_span_id") @ExcludeMissing fun _rootSpanId() = rootSpanId

    /** Whether this span is a root span */
    @JsonProperty("is_root") @ExcludeMissing fun _isRoot() = isRoot

    /** Indicates the event was copied from another object. */
    @JsonProperty("origin") @ExcludeMissing fun _origin() = origin

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): DatasetEvent = apply {
        if (!validated) {
            id()
            _xactId()
            created()
            projectId()
            datasetId()
            input()
            expected()
            metadata().map { it.validate() }
            tags()
            spanId()
            rootSpanId()
            isRoot()
            origin().map { it.validate() }
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var _xactId: JsonField<String> = JsonMissing.of()
        private var created: JsonField<OffsetDateTime> = JsonMissing.of()
        private var projectId: JsonField<String> = JsonMissing.of()
        private var datasetId: JsonField<String> = JsonMissing.of()
        private var input: JsonValue = JsonMissing.of()
        private var expected: JsonValue = JsonMissing.of()
        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var tags: JsonField<List<String>> = JsonMissing.of()
        private var spanId: JsonField<String> = JsonMissing.of()
        private var rootSpanId: JsonField<String> = JsonMissing.of()
        private var isRoot: JsonField<Boolean> = JsonMissing.of()
        private var origin: JsonField<Origin> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(datasetEvent: DatasetEvent) = apply {
            this.id = datasetEvent.id
            this._xactId = datasetEvent._xactId
            this.created = datasetEvent.created
            this.projectId = datasetEvent.projectId
            this.datasetId = datasetEvent.datasetId
            this.input = datasetEvent.input
            this.expected = datasetEvent.expected
            this.metadata = datasetEvent.metadata
            this.tags = datasetEvent.tags
            this.spanId = datasetEvent.spanId
            this.rootSpanId = datasetEvent.rootSpanId
            this.isRoot = datasetEvent.isRoot
            this.origin = datasetEvent.origin
            additionalProperties(datasetEvent.additionalProperties)
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
        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

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
        @JsonProperty("_xact_id")
        @ExcludeMissing
        fun _xactId(_xactId: JsonField<String>) = apply { this._xactId = _xactId }

        /** The timestamp the dataset event was created */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /** The timestamp the dataset event was created */
        @JsonProperty("created")
        @ExcludeMissing
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /** Unique identifier for the project that the dataset belongs under */
        fun projectId(projectId: String) = projectId(JsonField.of(projectId))

        /** Unique identifier for the project that the dataset belongs under */
        @JsonProperty("project_id")
        @ExcludeMissing
        fun projectId(projectId: JsonField<String>) = apply { this.projectId = projectId }

        /** Unique identifier for the dataset */
        fun datasetId(datasetId: String) = datasetId(JsonField.of(datasetId))

        /** Unique identifier for the dataset */
        @JsonProperty("dataset_id")
        @ExcludeMissing
        fun datasetId(datasetId: JsonField<String>) = apply { this.datasetId = datasetId }

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
        @JsonProperty("span_id")
        @ExcludeMissing
        fun spanId(spanId: JsonField<String>) = apply { this.spanId = spanId }

        /** The `span_id` of the root of the trace this dataset event belongs to */
        fun rootSpanId(rootSpanId: String) = rootSpanId(JsonField.of(rootSpanId))

        /** The `span_id` of the root of the trace this dataset event belongs to */
        @JsonProperty("root_span_id")
        @ExcludeMissing
        fun rootSpanId(rootSpanId: JsonField<String>) = apply { this.rootSpanId = rootSpanId }

        /** Whether this span is a root span */
        fun isRoot(isRoot: Boolean) = isRoot(JsonField.of(isRoot))

        /** Whether this span is a root span */
        @JsonProperty("is_root")
        @ExcludeMissing
        fun isRoot(isRoot: JsonField<Boolean>) = apply { this.isRoot = isRoot }

        /** Indicates the event was copied from another object. */
        fun origin(origin: Origin) = origin(JsonField.of(origin))

        /** Indicates the event was copied from another object. */
        @JsonProperty("origin")
        @ExcludeMissing
        fun origin(origin: JsonField<Origin>) = apply { this.origin = origin }

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

        fun build(): DatasetEvent =
            DatasetEvent(
                id,
                _xactId,
                created,
                projectId,
                datasetId,
                input,
                expected,
                metadata,
                tags.map { it.toImmutable() },
                spanId,
                rootSpanId,
                isRoot,
                origin,
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

            return /* spotless:off */ other is Metadata && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
    }

    /** Indicates the event was copied from another object. */
    @JsonDeserialize(builder = Origin.Builder::class)
    @NoAutoDetect
    class Origin
    private constructor(
        private val objectType: JsonField<ObjectType>,
        private val objectId: JsonField<String>,
        private val id: JsonField<String>,
        private val _xactId: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        /** Type of the object the event is originating from. */
        fun objectType(): ObjectType = objectType.getRequired("object_type")

        /** ID of the object the event is originating from. */
        fun objectId(): String = objectId.getRequired("object_id")

        /** ID of the original event. */
        fun id(): String = id.getRequired("id")

        /** Transaction ID of the original event. */
        fun _xactId(): String = _xactId.getRequired("_xact_id")

        /** Type of the object the event is originating from. */
        @JsonProperty("object_type") @ExcludeMissing fun _objectType() = objectType

        /** ID of the object the event is originating from. */
        @JsonProperty("object_id") @ExcludeMissing fun _objectId() = objectId

        /** ID of the original event. */
        @JsonProperty("id") @ExcludeMissing fun _id() = id

        /** Transaction ID of the original event. */
        @JsonProperty("_xact_id") @ExcludeMissing fun __xactId() = _xactId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Origin = apply {
            if (!validated) {
                objectType()
                objectId()
                id()
                _xactId()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var objectType: JsonField<ObjectType> = JsonMissing.of()
            private var objectId: JsonField<String> = JsonMissing.of()
            private var id: JsonField<String> = JsonMissing.of()
            private var _xactId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(origin: Origin) = apply {
                this.objectType = origin.objectType
                this.objectId = origin.objectId
                this.id = origin.id
                this._xactId = origin._xactId
                additionalProperties(origin.additionalProperties)
            }

            /** Type of the object the event is originating from. */
            fun objectType(objectType: ObjectType) = objectType(JsonField.of(objectType))

            /** Type of the object the event is originating from. */
            @JsonProperty("object_type")
            @ExcludeMissing
            fun objectType(objectType: JsonField<ObjectType>) = apply {
                this.objectType = objectType
            }

            /** ID of the object the event is originating from. */
            fun objectId(objectId: String) = objectId(JsonField.of(objectId))

            /** ID of the object the event is originating from. */
            @JsonProperty("object_id")
            @ExcludeMissing
            fun objectId(objectId: JsonField<String>) = apply { this.objectId = objectId }

            /** ID of the original event. */
            fun id(id: String) = id(JsonField.of(id))

            /** ID of the original event. */
            @JsonProperty("id")
            @ExcludeMissing
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** Transaction ID of the original event. */
            fun _xactId(_xactId: String) = _xactId(JsonField.of(_xactId))

            /** Transaction ID of the original event. */
            @JsonProperty("_xact_id")
            @ExcludeMissing
            fun _xactId(_xactId: JsonField<String>) = apply { this._xactId = _xactId }

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

            fun build(): Origin =
                Origin(
                    objectType,
                    objectId,
                    id,
                    _xactId,
                    additionalProperties.toImmutable(),
                )
        }

        class ObjectType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ObjectType && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val EXPERIMENT = ObjectType(JsonField.of("experiment"))

                @JvmField val DATASET = ObjectType(JsonField.of("dataset"))

                @JvmField val PROMPT = ObjectType(JsonField.of("prompt"))

                @JvmField val FUNCTION = ObjectType(JsonField.of("function"))

                @JvmField val PROMPT_SESSION = ObjectType(JsonField.of("prompt_session"))

                @JvmField val PROJECT_LOGS = ObjectType(JsonField.of("project_logs"))

                @JvmStatic fun of(value: String) = ObjectType(JsonField.of(value))
            }

            enum class Known {
                EXPERIMENT,
                DATASET,
                PROMPT,
                FUNCTION,
                PROMPT_SESSION,
                PROJECT_LOGS,
            }

            enum class Value {
                EXPERIMENT,
                DATASET,
                PROMPT,
                FUNCTION,
                PROMPT_SESSION,
                PROJECT_LOGS,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    EXPERIMENT -> Value.EXPERIMENT
                    DATASET -> Value.DATASET
                    PROMPT -> Value.PROMPT
                    FUNCTION -> Value.FUNCTION
                    PROMPT_SESSION -> Value.PROMPT_SESSION
                    PROJECT_LOGS -> Value.PROJECT_LOGS
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    EXPERIMENT -> Known.EXPERIMENT
                    DATASET -> Known.DATASET
                    PROMPT -> Known.PROMPT
                    FUNCTION -> Known.FUNCTION
                    PROMPT_SESSION -> Known.PROMPT_SESSION
                    PROJECT_LOGS -> Known.PROJECT_LOGS
                    else -> throw BraintrustInvalidDataException("Unknown ObjectType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Origin && this.objectType == other.objectType && this.objectId == other.objectId && this.id == other.id && this._xactId == other._xactId && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(objectType, objectId, id, _xactId, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "Origin{objectType=$objectType, objectId=$objectId, id=$id, _xactId=$_xactId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DatasetEvent && this.id == other.id && this._xactId == other._xactId && this.created == other.created && this.projectId == other.projectId && this.datasetId == other.datasetId && this.input == other.input && this.expected == other.expected && this.metadata == other.metadata && this.tags == other.tags && this.spanId == other.spanId && this.rootSpanId == other.rootSpanId && this.isRoot == other.isRoot && this.origin == other.origin && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(id, _xactId, created, projectId, datasetId, input, expected, metadata, tags, spanId, rootSpanId, isRoot, origin, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() =
        "DatasetEvent{id=$id, _xactId=$_xactId, created=$created, projectId=$projectId, datasetId=$datasetId, input=$input, expected=$expected, metadata=$metadata, tags=$tags, spanId=$spanId, rootSpanId=$rootSpanId, isRoot=$isRoot, origin=$origin, additionalProperties=$additionalProperties}"
}
