// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.apache.hc.core5.http.ContentType
import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import java.util.UUID
import com.braintrustdata.api.core.BaseDeserializer
import com.braintrustdata.api.core.BaseSerializer
import com.braintrustdata.api.core.getOrThrow
import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.MultipartFormValue
import com.braintrustdata.api.core.toUnmodifiable
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.Enum
import com.braintrustdata.api.core.ContentTypes
import com.braintrustdata.api.errors.BraintrustInvalidDataException
import com.braintrustdata.api.models.*

class ExperimentInsertParams constructor(
  private val experimentId: String,
  private val events: List<Event>,
  private val additionalQueryParams: Map<String, List<String>>,
  private val additionalHeaders: Map<String, List<String>>,
  private val additionalBodyProperties: Map<String, JsonValue>,

) {

    fun experimentId(): String = experimentId

    fun events(): List<Event> = events

    @JvmSynthetic
    internal fun getBody(): ExperimentInsertBody {
      return ExperimentInsertBody(events, additionalBodyProperties)
    }

    @JvmSynthetic
    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic
    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
      return when (index) {
          0 -> experimentId
          else -> ""
      }
    }

    @JsonDeserialize(builder = ExperimentInsertBody.Builder::class)
    @NoAutoDetect
    class ExperimentInsertBody internal constructor(private val events: List<Event>?, private val additionalProperties: Map<String, JsonValue>, ) {

        private var hashCode: Int = 0

        /** A list of experiment events to insert */
        @JsonProperty("events")
        fun events(): List<Event>? = events

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is ExperimentInsertBody &&
              this.events == other.events &&
              this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
          if (hashCode == 0) {
            hashCode = Objects.hash(events, additionalProperties)
          }
          return hashCode
        }

        override fun toString() = "ExperimentInsertBody{events=$events, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic
            fun builder() = Builder()
        }

        class Builder {

            private var events: List<Event>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(experimentInsertBody: ExperimentInsertBody) = apply {
                this.events = experimentInsertBody.events
                additionalProperties(experimentInsertBody.additionalProperties)
            }

            /** A list of experiment events to insert */
            @JsonProperty("events")
            fun events(events: List<Event>) = apply {
                this.events = events
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

            fun build(): ExperimentInsertBody = ExperimentInsertBody(checkNotNull(events) {
                "`events` is required but was not set"
            }.toUnmodifiable(), additionalProperties.toUnmodifiable())
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return other is ExperimentInsertParams &&
          this.experimentId == other.experimentId &&
          this.events == other.events &&
          this.additionalQueryParams == other.additionalQueryParams &&
          this.additionalHeaders == other.additionalHeaders &&
          this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
      return Objects.hash(
          experimentId,
          events,
          additionalQueryParams,
          additionalHeaders,
          additionalBodyProperties,
      )
    }

    override fun toString() = "ExperimentInsertParams{experimentId=$experimentId, events=$events, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic
        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var experimentId: String? = null
        private var events: MutableList<Event> = mutableListOf()
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(experimentInsertParams: ExperimentInsertParams) = apply {
            this.experimentId = experimentInsertParams.experimentId
            this.events(experimentInsertParams.events)
            additionalQueryParams(experimentInsertParams.additionalQueryParams)
            additionalHeaders(experimentInsertParams.additionalHeaders)
            additionalBodyProperties(experimentInsertParams.additionalBodyProperties)
        }

        /** Experiment id */
        fun experimentId(experimentId: String) = apply {
            this.experimentId = experimentId
        }

        /** A list of experiment events to insert */
        fun events(events: List<Event>) = apply {
            this.events.clear()
            this.events.addAll(events)
        }

        /** A list of experiment events to insert */
        fun addEvent(event: Event) = apply {
            this.events.add(event)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply {
            this.additionalHeaders.put(name, mutableListOf())
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun build(): ExperimentInsertParams = ExperimentInsertParams(
            checkNotNull(experimentId) {
                "`experimentId` is required but was not set"
            },
            checkNotNull(events) {
                "`events` is required but was not set"
            }.toUnmodifiable(),
            additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            additionalBodyProperties.toUnmodifiable(),
        )
    }

    @JsonDeserialize(using = Event.Deserializer::class)
    @JsonSerialize(using = Event.Serializer::class)
    class Event private constructor(private val insertExperimentEventReplace: InsertExperimentEventReplace? = null, private val insertExperimentEventMerge: InsertExperimentEventMerge? = null, private val _json: JsonValue? = null, ) {

        private var validated: Boolean = false

        fun insertExperimentEventReplace(): Optional<InsertExperimentEventReplace> = Optional.ofNullable(insertExperimentEventReplace)
        fun insertExperimentEventMerge(): Optional<InsertExperimentEventMerge> = Optional.ofNullable(insertExperimentEventMerge)

        fun isInsertExperimentEventReplace(): Boolean = insertExperimentEventReplace != null
        fun isInsertExperimentEventMerge(): Boolean = insertExperimentEventMerge != null

        fun asInsertExperimentEventReplace(): InsertExperimentEventReplace = insertExperimentEventReplace.getOrThrow("insertExperimentEventReplace")
        fun asInsertExperimentEventMerge(): InsertExperimentEventMerge = insertExperimentEventMerge.getOrThrow("insertExperimentEventMerge")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T {
          return when {
              insertExperimentEventReplace != null -> visitor.visitInsertExperimentEventReplace(insertExperimentEventReplace)
              insertExperimentEventMerge != null -> visitor.visitInsertExperimentEventMerge(insertExperimentEventMerge)
              else -> visitor.unknown(_json)
          }
        }

        fun validate(): Event = apply {
            if (!validated) {
              if (insertExperimentEventReplace == null && insertExperimentEventMerge == null) {
                throw BraintrustInvalidDataException("Unknown Event: $_json")
              }
              insertExperimentEventReplace?.validate()
              insertExperimentEventMerge?.validate()
              validated = true
            }
        }

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is Event &&
              this.insertExperimentEventReplace == other.insertExperimentEventReplace &&
              this.insertExperimentEventMerge == other.insertExperimentEventMerge
        }

        override fun hashCode(): Int {
          return Objects.hash(insertExperimentEventReplace, insertExperimentEventMerge)
        }

        override fun toString(): String {
          return when {
              insertExperimentEventReplace != null -> "Event{insertExperimentEventReplace=$insertExperimentEventReplace}"
              insertExperimentEventMerge != null -> "Event{insertExperimentEventMerge=$insertExperimentEventMerge}"
              _json != null -> "Event{_unknown=$_json}"
              else -> throw IllegalStateException("Invalid Event")
          }
        }

        companion object {

            @JvmStatic
            fun ofInsertExperimentEventReplace(insertExperimentEventReplace: InsertExperimentEventReplace) = Event(insertExperimentEventReplace = insertExperimentEventReplace)

            @JvmStatic
            fun ofInsertExperimentEventMerge(insertExperimentEventMerge: InsertExperimentEventMerge) = Event(insertExperimentEventMerge = insertExperimentEventMerge)
        }

        interface Visitor<out T> {

            fun visitInsertExperimentEventReplace(insertExperimentEventReplace: InsertExperimentEventReplace): T

            fun visitInsertExperimentEventMerge(insertExperimentEventMerge: InsertExperimentEventMerge): T

            fun unknown(json: JsonValue?): T {
              throw BraintrustInvalidDataException("Unknown Event: $json")
            }
        }

        class Deserializer : BaseDeserializer<Event>(Event::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Event {
              val json = JsonValue.fromJsonNode(node)
              tryDeserialize(node, jacksonTypeRef<InsertExperimentEventReplace>()){ it.validate() }?.let {
                  return Event(insertExperimentEventReplace = it, _json = json)
              }
              tryDeserialize(node, jacksonTypeRef<InsertExperimentEventMerge>()){ it.validate() }?.let {
                  return Event(insertExperimentEventMerge = it, _json = json)
              }

              return Event(_json = json)
            }
        }

        class Serializer : BaseSerializer<Event>(Event::class) {

            override fun serialize(value: Event, generator: JsonGenerator, provider: SerializerProvider) {
              when {
                  value.insertExperimentEventReplace != null -> generator.writeObject(value.insertExperimentEventReplace)
                  value.insertExperimentEventMerge != null -> generator.writeObject(value.insertExperimentEventMerge)
                  value._json != null -> generator.writeObject(value._json)
                  else -> throw IllegalStateException("Invalid Event")
              }
            }
        }

        @JsonDeserialize(builder = InsertExperimentEventReplace.Builder::class)
        @NoAutoDetect
        class InsertExperimentEventReplace private constructor(
          private val input: JsonValue,
          private val output: JsonValue,
          private val expected: JsonValue,
          private val scores: JsonField<Scores>,
          private val metadata: JsonField<Metadata>,
          private val tags: JsonField<List<String>>,
          private val metrics: JsonField<Metrics>,
          private val context: JsonField<Context>,
          private val spanAttributes: JsonField<SpanAttributes>,
          private val id: JsonField<String>,
          private val datasetRecordId: JsonField<String>,
          private val created: JsonField<OffsetDateTime>,
          private val _objectDelete: JsonField<Boolean>,
          private val _isMerge: JsonField<Boolean>,
          private val _parentId: JsonField<String>,
          private val additionalProperties: Map<String, JsonValue>,

        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /**
             * The arguments that uniquely define a test case (an arbitrary, JSON serializable
             * object). Later on, Braintrust will use the `input` to know whether two test
             * cases are the same between experiments, so they should not contain
             * experiment-specific state. A simple rule of thumb is that if you run the same
             * experiment twice, the `input` should be identical
             */
            fun input(): JsonValue = input

            /**
             * The output of your application, including post-processing (an arbitrary, JSON
             * serializable object), that allows you to determine whether the result is correct
             * or not. For example, in an app that generates SQL queries, the `output` should
             * be the _result_ of the SQL query generated by the model, not the query itself,
             * because there may be multiple valid queries that answer a single question
             */
            fun output(): JsonValue = output

            /**
             * The ground truth value (an arbitrary, JSON serializable object) that you'd
             * compare to `output` to determine if your `output` value is correct or not.
             * Braintrust currently does not compare `output` to `expected` for you, since
             * there are so many different ways to do that correctly. Instead, these values are
             * just used to help you navigate your experiments while digging into analyses.
             * However, we may later use these values to re-score outputs or fine-tune your
             * models
             */
            fun expected(): JsonValue = expected

            /**
             * A dictionary of numeric values (between 0 and 1) to log. The scores should give
             * you a variety of signals that help you determine how accurate the outputs are
             * compared to what you expect and diagnose failures. For example, a summarization
             * app might have one score that tells you how accurate the summary is, and another
             * that measures the word similarity between the generated and grouth truth
             * summary. The word similarity score could help you determine whether the
             * summarization was covering similar concepts or not. You can use these scores to
             * help you sort, filter, and compare experiments
             */
            fun scores(): Optional<Scores> = Optional.ofNullable(scores.getNullable("scores"))

            /**
             * A dictionary with additional data about the test example, model outputs, or just
             * about anything else that's relevant, that you can use to help find and analyze
             * examples later. For example, you could log the `prompt`, example's `id`, or
             * anything else that would be useful to slice/dice later. The values in `metadata`
             * can be any JSON-serializable type, but its keys must be strings
             */
            fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata.getNullable("metadata"))

            /** A list of tags to log */
            fun tags(): Optional<List<String>> = Optional.ofNullable(tags.getNullable("tags"))

            /**
             * Metrics are numerical measurements tracking the execution of the code that
             * produced the experiment event. Use "start" and "end" to track the time span over
             * which the experiment event was produced
             */
            fun metrics(): Optional<Metrics> = Optional.ofNullable(metrics.getNullable("metrics"))

            /**
             * Context is additional information about the code that produced the experiment
             * event. It is essentially the textual counterpart to `metrics`. Use the
             * `caller_*` attributes to track the location in code which produced the
             * experiment event
             */
            fun context(): Optional<Context> = Optional.ofNullable(context.getNullable("context"))

            /** Human-identifying attributes of the span, such as name, type, etc. */
            fun spanAttributes(): Optional<SpanAttributes> = Optional.ofNullable(spanAttributes.getNullable("span_attributes"))

            /**
             * A unique identifier for the experiment event. If you don't provide one,
             * BrainTrust will generate one for you
             */
            fun id(): Optional<String> = Optional.ofNullable(id.getNullable("id"))

            /**
             * If the experiment is associated to a dataset, this is the event-level dataset id
             * this experiment event is tied to
             */
            fun datasetRecordId(): Optional<String> = Optional.ofNullable(datasetRecordId.getNullable("dataset_record_id"))

            /** The timestamp the experiment event was created */
            fun created(): Optional<OffsetDateTime> = Optional.ofNullable(created.getNullable("created"))

            /**
             * Pass `_object_delete=true` to mark the experiment event deleted. Deleted events
             * will not show up in subsequent fetches for this experiment
             */
            fun _objectDelete(): Optional<Boolean> = Optional.ofNullable(_objectDelete.getNullable("_object_delete"))

            /**
             * The `_is_merge` field controls how the row is merged with any existing row with
             * the same id in the DB. By default (or when set to `false`), the existing row is
             * completely replaced by the new row. When set to `true`, the new row is
             * deep-merged into the existing row
             *
             * For example, say there is an existing row in the DB
             * `{"id": "foo", "input": {"a": 5, "b": 10}}`. If we merge a new row as
             * `{"_is_merge": true, "id": "foo", "input": {"b": 11, "c": 20}}`, the new row
             * will be `{"id": "foo", "input": {"a": 5, "b": 11, "c": 20}}`. If we replace the
             * new row as `{"id": "foo", "input": {"b": 11, "c": 20}}`, the new row will be
             * `{"id": "foo", "input": {"b": 11, "c": 20}}`
             */
            fun _isMerge(): Optional<Boolean> = Optional.ofNullable(_isMerge.getNullable("_is_merge"))

            /**
             * Use the `_parent_id` field to create this row as a subspan of an existing row.
             * It cannot be specified alongside `_is_merge=true`. Tracking hierarchical
             * relationships are important for tracing (see the
             * [guide](https://www.braintrust.dev/docs/guides/tracing) for full details).
             *
             * For example, say we have logged a row
             * `{"id": "abc", "input": "foo", "output": "bar", "expected": "boo", "scores": {"correctness": 0.33}}`.
             * We can create a sub-span of the parent row by logging
             * `{"_parent_id": "abc", "id": "llm_call", "input": {"prompt": "What comes after foo?"}, "output": "bar", "metrics": {"tokens": 1}}`.
             * In the webapp, only the root span row `"abc"` will show up in the summary view.
             * You can view the full trace hierarchy (in this case, the `"llm_call"` row) by
             * clicking on the "abc" row.
             */
            fun _parentId(): Optional<String> = Optional.ofNullable(_parentId.getNullable("_parent_id"))

            /**
             * The arguments that uniquely define a test case (an arbitrary, JSON serializable
             * object). Later on, Braintrust will use the `input` to know whether two test
             * cases are the same between experiments, so they should not contain
             * experiment-specific state. A simple rule of thumb is that if you run the same
             * experiment twice, the `input` should be identical
             */
            @JsonProperty("input")
            @ExcludeMissing
            fun _input() = input

            /**
             * The output of your application, including post-processing (an arbitrary, JSON
             * serializable object), that allows you to determine whether the result is correct
             * or not. For example, in an app that generates SQL queries, the `output` should
             * be the _result_ of the SQL query generated by the model, not the query itself,
             * because there may be multiple valid queries that answer a single question
             */
            @JsonProperty("output")
            @ExcludeMissing
            fun _output() = output

            /**
             * The ground truth value (an arbitrary, JSON serializable object) that you'd
             * compare to `output` to determine if your `output` value is correct or not.
             * Braintrust currently does not compare `output` to `expected` for you, since
             * there are so many different ways to do that correctly. Instead, these values are
             * just used to help you navigate your experiments while digging into analyses.
             * However, we may later use these values to re-score outputs or fine-tune your
             * models
             */
            @JsonProperty("expected")
            @ExcludeMissing
            fun _expected() = expected

            /**
             * A dictionary of numeric values (between 0 and 1) to log. The scores should give
             * you a variety of signals that help you determine how accurate the outputs are
             * compared to what you expect and diagnose failures. For example, a summarization
             * app might have one score that tells you how accurate the summary is, and another
             * that measures the word similarity between the generated and grouth truth
             * summary. The word similarity score could help you determine whether the
             * summarization was covering similar concepts or not. You can use these scores to
             * help you sort, filter, and compare experiments
             */
            @JsonProperty("scores")
            @ExcludeMissing
            fun _scores() = scores

            /**
             * A dictionary with additional data about the test example, model outputs, or just
             * about anything else that's relevant, that you can use to help find and analyze
             * examples later. For example, you could log the `prompt`, example's `id`, or
             * anything else that would be useful to slice/dice later. The values in `metadata`
             * can be any JSON-serializable type, but its keys must be strings
             */
            @JsonProperty("metadata")
            @ExcludeMissing
            fun _metadata() = metadata

            /** A list of tags to log */
            @JsonProperty("tags")
            @ExcludeMissing
            fun _tags() = tags

            /**
             * Metrics are numerical measurements tracking the execution of the code that
             * produced the experiment event. Use "start" and "end" to track the time span over
             * which the experiment event was produced
             */
            @JsonProperty("metrics")
            @ExcludeMissing
            fun _metrics() = metrics

            /**
             * Context is additional information about the code that produced the experiment
             * event. It is essentially the textual counterpart to `metrics`. Use the
             * `caller_*` attributes to track the location in code which produced the
             * experiment event
             */
            @JsonProperty("context")
            @ExcludeMissing
            fun _context() = context

            /** Human-identifying attributes of the span, such as name, type, etc. */
            @JsonProperty("span_attributes")
            @ExcludeMissing
            fun _spanAttributes() = spanAttributes

            /**
             * A unique identifier for the experiment event. If you don't provide one,
             * BrainTrust will generate one for you
             */
            @JsonProperty("id")
            @ExcludeMissing
            fun _id() = id

            /**
             * If the experiment is associated to a dataset, this is the event-level dataset id
             * this experiment event is tied to
             */
            @JsonProperty("dataset_record_id")
            @ExcludeMissing
            fun _datasetRecordId() = datasetRecordId

            /** The timestamp the experiment event was created */
            @JsonProperty("created")
            @ExcludeMissing
            fun _created() = created

            /**
             * Pass `_object_delete=true` to mark the experiment event deleted. Deleted events
             * will not show up in subsequent fetches for this experiment
             */
            @JsonProperty("_object_delete")
            @ExcludeMissing
            fun __objectDelete() = _objectDelete

            /**
             * The `_is_merge` field controls how the row is merged with any existing row with
             * the same id in the DB. By default (or when set to `false`), the existing row is
             * completely replaced by the new row. When set to `true`, the new row is
             * deep-merged into the existing row
             *
             * For example, say there is an existing row in the DB
             * `{"id": "foo", "input": {"a": 5, "b": 10}}`. If we merge a new row as
             * `{"_is_merge": true, "id": "foo", "input": {"b": 11, "c": 20}}`, the new row
             * will be `{"id": "foo", "input": {"a": 5, "b": 11, "c": 20}}`. If we replace the
             * new row as `{"id": "foo", "input": {"b": 11, "c": 20}}`, the new row will be
             * `{"id": "foo", "input": {"b": 11, "c": 20}}`
             */
            @JsonProperty("_is_merge")
            @ExcludeMissing
            fun __isMerge() = _isMerge

            /**
             * Use the `_parent_id` field to create this row as a subspan of an existing row.
             * It cannot be specified alongside `_is_merge=true`. Tracking hierarchical
             * relationships are important for tracing (see the
             * [guide](https://www.braintrust.dev/docs/guides/tracing) for full details).
             *
             * For example, say we have logged a row
             * `{"id": "abc", "input": "foo", "output": "bar", "expected": "boo", "scores": {"correctness": 0.33}}`.
             * We can create a sub-span of the parent row by logging
             * `{"_parent_id": "abc", "id": "llm_call", "input": {"prompt": "What comes after foo?"}, "output": "bar", "metrics": {"tokens": 1}}`.
             * In the webapp, only the root span row `"abc"` will show up in the summary view.
             * You can view the full trace hierarchy (in this case, the `"llm_call"` row) by
             * clicking on the "abc" row.
             */
            @JsonProperty("_parent_id")
            @ExcludeMissing
            fun __parentId() = _parentId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): InsertExperimentEventReplace = apply {
                if (!validated) {
                  input()
                  output()
                  expected()
                  scores().map { it.validate() }
                  metadata().map { it.validate() }
                  tags()
                  metrics().map { it.validate() }
                  context().map { it.validate() }
                  spanAttributes().map { it.validate() }
                  id()
                  datasetRecordId()
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

              return other is InsertExperimentEventReplace &&
                  this.input == other.input &&
                  this.output == other.output &&
                  this.expected == other.expected &&
                  this.scores == other.scores &&
                  this.metadata == other.metadata &&
                  this.tags == other.tags &&
                  this.metrics == other.metrics &&
                  this.context == other.context &&
                  this.spanAttributes == other.spanAttributes &&
                  this.id == other.id &&
                  this.datasetRecordId == other.datasetRecordId &&
                  this.created == other.created &&
                  this._objectDelete == other._objectDelete &&
                  this._isMerge == other._isMerge &&
                  this._parentId == other._parentId &&
                  this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
              if (hashCode == 0) {
                hashCode = Objects.hash(
                    input,
                    output,
                    expected,
                    scores,
                    metadata,
                    tags,
                    metrics,
                    context,
                    spanAttributes,
                    id,
                    datasetRecordId,
                    created,
                    _objectDelete,
                    _isMerge,
                    _parentId,
                    additionalProperties,
                )
              }
              return hashCode
            }

            override fun toString() = "InsertExperimentEventReplace{input=$input, output=$output, expected=$expected, scores=$scores, metadata=$metadata, tags=$tags, metrics=$metrics, context=$context, spanAttributes=$spanAttributes, id=$id, datasetRecordId=$datasetRecordId, created=$created, _objectDelete=$_objectDelete, _isMerge=$_isMerge, _parentId=$_parentId, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic
                fun builder() = Builder()
            }

            class Builder {

                private var input: JsonValue = JsonMissing.of()
                private var output: JsonValue = JsonMissing.of()
                private var expected: JsonValue = JsonMissing.of()
                private var scores: JsonField<Scores> = JsonMissing.of()
                private var metadata: JsonField<Metadata> = JsonMissing.of()
                private var tags: JsonField<List<String>> = JsonMissing.of()
                private var metrics: JsonField<Metrics> = JsonMissing.of()
                private var context: JsonField<Context> = JsonMissing.of()
                private var spanAttributes: JsonField<SpanAttributes> = JsonMissing.of()
                private var id: JsonField<String> = JsonMissing.of()
                private var datasetRecordId: JsonField<String> = JsonMissing.of()
                private var created: JsonField<OffsetDateTime> = JsonMissing.of()
                private var _objectDelete: JsonField<Boolean> = JsonMissing.of()
                private var _isMerge: JsonField<Boolean> = JsonMissing.of()
                private var _parentId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(insertExperimentEventReplace: InsertExperimentEventReplace) = apply {
                    this.input = insertExperimentEventReplace.input
                    this.output = insertExperimentEventReplace.output
                    this.expected = insertExperimentEventReplace.expected
                    this.scores = insertExperimentEventReplace.scores
                    this.metadata = insertExperimentEventReplace.metadata
                    this.tags = insertExperimentEventReplace.tags
                    this.metrics = insertExperimentEventReplace.metrics
                    this.context = insertExperimentEventReplace.context
                    this.spanAttributes = insertExperimentEventReplace.spanAttributes
                    this.id = insertExperimentEventReplace.id
                    this.datasetRecordId = insertExperimentEventReplace.datasetRecordId
                    this.created = insertExperimentEventReplace.created
                    this._objectDelete = insertExperimentEventReplace._objectDelete
                    this._isMerge = insertExperimentEventReplace._isMerge
                    this._parentId = insertExperimentEventReplace._parentId
                    additionalProperties(insertExperimentEventReplace.additionalProperties)
                }

                /**
                 * The arguments that uniquely define a test case (an arbitrary, JSON serializable
                 * object). Later on, Braintrust will use the `input` to know whether two test
                 * cases are the same between experiments, so they should not contain
                 * experiment-specific state. A simple rule of thumb is that if you run the same
                 * experiment twice, the `input` should be identical
                 */
                @JsonProperty("input")
                @ExcludeMissing
                fun input(input: JsonValue) = apply {
                    this.input = input
                }

                /**
                 * The output of your application, including post-processing (an arbitrary, JSON
                 * serializable object), that allows you to determine whether the result is correct
                 * or not. For example, in an app that generates SQL queries, the `output` should
                 * be the _result_ of the SQL query generated by the model, not the query itself,
                 * because there may be multiple valid queries that answer a single question
                 */
                @JsonProperty("output")
                @ExcludeMissing
                fun output(output: JsonValue) = apply {
                    this.output = output
                }

                /**
                 * The ground truth value (an arbitrary, JSON serializable object) that you'd
                 * compare to `output` to determine if your `output` value is correct or not.
                 * Braintrust currently does not compare `output` to `expected` for you, since
                 * there are so many different ways to do that correctly. Instead, these values are
                 * just used to help you navigate your experiments while digging into analyses.
                 * However, we may later use these values to re-score outputs or fine-tune your
                 * models
                 */
                @JsonProperty("expected")
                @ExcludeMissing
                fun expected(expected: JsonValue) = apply {
                    this.expected = expected
                }

                /**
                 * A dictionary of numeric values (between 0 and 1) to log. The scores should give
                 * you a variety of signals that help you determine how accurate the outputs are
                 * compared to what you expect and diagnose failures. For example, a summarization
                 * app might have one score that tells you how accurate the summary is, and another
                 * that measures the word similarity between the generated and grouth truth
                 * summary. The word similarity score could help you determine whether the
                 * summarization was covering similar concepts or not. You can use these scores to
                 * help you sort, filter, and compare experiments
                 */
                fun scores(scores: Scores) = scores(JsonField.of(scores))

                /**
                 * A dictionary of numeric values (between 0 and 1) to log. The scores should give
                 * you a variety of signals that help you determine how accurate the outputs are
                 * compared to what you expect and diagnose failures. For example, a summarization
                 * app might have one score that tells you how accurate the summary is, and another
                 * that measures the word similarity between the generated and grouth truth
                 * summary. The word similarity score could help you determine whether the
                 * summarization was covering similar concepts or not. You can use these scores to
                 * help you sort, filter, and compare experiments
                 */
                @JsonProperty("scores")
                @ExcludeMissing
                fun scores(scores: JsonField<Scores>) = apply {
                    this.scores = scores
                }

                /**
                 * A dictionary with additional data about the test example, model outputs, or just
                 * about anything else that's relevant, that you can use to help find and analyze
                 * examples later. For example, you could log the `prompt`, example's `id`, or
                 * anything else that would be useful to slice/dice later. The values in `metadata`
                 * can be any JSON-serializable type, but its keys must be strings
                 */
                fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

                /**
                 * A dictionary with additional data about the test example, model outputs, or just
                 * about anything else that's relevant, that you can use to help find and analyze
                 * examples later. For example, you could log the `prompt`, example's `id`, or
                 * anything else that would be useful to slice/dice later. The values in `metadata`
                 * can be any JSON-serializable type, but its keys must be strings
                 */
                @JsonProperty("metadata")
                @ExcludeMissing
                fun metadata(metadata: JsonField<Metadata>) = apply {
                    this.metadata = metadata
                }

                /** A list of tags to log */
                fun tags(tags: List<String>) = tags(JsonField.of(tags))

                /** A list of tags to log */
                @JsonProperty("tags")
                @ExcludeMissing
                fun tags(tags: JsonField<List<String>>) = apply {
                    this.tags = tags
                }

                /**
                 * Metrics are numerical measurements tracking the execution of the code that
                 * produced the experiment event. Use "start" and "end" to track the time span over
                 * which the experiment event was produced
                 */
                fun metrics(metrics: Metrics) = metrics(JsonField.of(metrics))

                /**
                 * Metrics are numerical measurements tracking the execution of the code that
                 * produced the experiment event. Use "start" and "end" to track the time span over
                 * which the experiment event was produced
                 */
                @JsonProperty("metrics")
                @ExcludeMissing
                fun metrics(metrics: JsonField<Metrics>) = apply {
                    this.metrics = metrics
                }

                /**
                 * Context is additional information about the code that produced the experiment
                 * event. It is essentially the textual counterpart to `metrics`. Use the
                 * `caller_*` attributes to track the location in code which produced the
                 * experiment event
                 */
                fun context(context: Context) = context(JsonField.of(context))

                /**
                 * Context is additional information about the code that produced the experiment
                 * event. It is essentially the textual counterpart to `metrics`. Use the
                 * `caller_*` attributes to track the location in code which produced the
                 * experiment event
                 */
                @JsonProperty("context")
                @ExcludeMissing
                fun context(context: JsonField<Context>) = apply {
                    this.context = context
                }

                /** Human-identifying attributes of the span, such as name, type, etc. */
                fun spanAttributes(spanAttributes: SpanAttributes) = spanAttributes(JsonField.of(spanAttributes))

                /** Human-identifying attributes of the span, such as name, type, etc. */
                @JsonProperty("span_attributes")
                @ExcludeMissing
                fun spanAttributes(spanAttributes: JsonField<SpanAttributes>) = apply {
                    this.spanAttributes = spanAttributes
                }

                /**
                 * A unique identifier for the experiment event. If you don't provide one,
                 * BrainTrust will generate one for you
                 */
                fun id(id: String) = id(JsonField.of(id))

                /**
                 * A unique identifier for the experiment event. If you don't provide one,
                 * BrainTrust will generate one for you
                 */
                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply {
                    this.id = id
                }

                /**
                 * If the experiment is associated to a dataset, this is the event-level dataset id
                 * this experiment event is tied to
                 */
                fun datasetRecordId(datasetRecordId: String) = datasetRecordId(JsonField.of(datasetRecordId))

                /**
                 * If the experiment is associated to a dataset, this is the event-level dataset id
                 * this experiment event is tied to
                 */
                @JsonProperty("dataset_record_id")
                @ExcludeMissing
                fun datasetRecordId(datasetRecordId: JsonField<String>) = apply {
                    this.datasetRecordId = datasetRecordId
                }

                /** The timestamp the experiment event was created */
                fun created(created: OffsetDateTime) = created(JsonField.of(created))

                /** The timestamp the experiment event was created */
                @JsonProperty("created")
                @ExcludeMissing
                fun created(created: JsonField<OffsetDateTime>) = apply {
                    this.created = created
                }

                /**
                 * Pass `_object_delete=true` to mark the experiment event deleted. Deleted events
                 * will not show up in subsequent fetches for this experiment
                 */
                fun _objectDelete(_objectDelete: Boolean) = _objectDelete(JsonField.of(_objectDelete))

                /**
                 * Pass `_object_delete=true` to mark the experiment event deleted. Deleted events
                 * will not show up in subsequent fetches for this experiment
                 */
                @JsonProperty("_object_delete")
                @ExcludeMissing
                fun _objectDelete(_objectDelete: JsonField<Boolean>) = apply {
                    this._objectDelete = _objectDelete
                }

                /**
                 * The `_is_merge` field controls how the row is merged with any existing row with
                 * the same id in the DB. By default (or when set to `false`), the existing row is
                 * completely replaced by the new row. When set to `true`, the new row is
                 * deep-merged into the existing row
                 *
                 * For example, say there is an existing row in the DB
                 * `{"id": "foo", "input": {"a": 5, "b": 10}}`. If we merge a new row as
                 * `{"_is_merge": true, "id": "foo", "input": {"b": 11, "c": 20}}`, the new row
                 * will be `{"id": "foo", "input": {"a": 5, "b": 11, "c": 20}}`. If we replace the
                 * new row as `{"id": "foo", "input": {"b": 11, "c": 20}}`, the new row will be
                 * `{"id": "foo", "input": {"b": 11, "c": 20}}`
                 */
                fun _isMerge(_isMerge: Boolean) = _isMerge(JsonField.of(_isMerge))

                /**
                 * The `_is_merge` field controls how the row is merged with any existing row with
                 * the same id in the DB. By default (or when set to `false`), the existing row is
                 * completely replaced by the new row. When set to `true`, the new row is
                 * deep-merged into the existing row
                 *
                 * For example, say there is an existing row in the DB
                 * `{"id": "foo", "input": {"a": 5, "b": 10}}`. If we merge a new row as
                 * `{"_is_merge": true, "id": "foo", "input": {"b": 11, "c": 20}}`, the new row
                 * will be `{"id": "foo", "input": {"a": 5, "b": 11, "c": 20}}`. If we replace the
                 * new row as `{"id": "foo", "input": {"b": 11, "c": 20}}`, the new row will be
                 * `{"id": "foo", "input": {"b": 11, "c": 20}}`
                 */
                @JsonProperty("_is_merge")
                @ExcludeMissing
                fun _isMerge(_isMerge: JsonField<Boolean>) = apply {
                    this._isMerge = _isMerge
                }

                /**
                 * Use the `_parent_id` field to create this row as a subspan of an existing row.
                 * It cannot be specified alongside `_is_merge=true`. Tracking hierarchical
                 * relationships are important for tracing (see the
                 * [guide](https://www.braintrust.dev/docs/guides/tracing) for full details).
                 *
                 * For example, say we have logged a row
                 * `{"id": "abc", "input": "foo", "output": "bar", "expected": "boo", "scores": {"correctness": 0.33}}`.
                 * We can create a sub-span of the parent row by logging
                 * `{"_parent_id": "abc", "id": "llm_call", "input": {"prompt": "What comes after foo?"}, "output": "bar", "metrics": {"tokens": 1}}`.
                 * In the webapp, only the root span row `"abc"` will show up in the summary view.
                 * You can view the full trace hierarchy (in this case, the `"llm_call"` row) by
                 * clicking on the "abc" row.
                 */
                fun _parentId(_parentId: String) = _parentId(JsonField.of(_parentId))

                /**
                 * Use the `_parent_id` field to create this row as a subspan of an existing row.
                 * It cannot be specified alongside `_is_merge=true`. Tracking hierarchical
                 * relationships are important for tracing (see the
                 * [guide](https://www.braintrust.dev/docs/guides/tracing) for full details).
                 *
                 * For example, say we have logged a row
                 * `{"id": "abc", "input": "foo", "output": "bar", "expected": "boo", "scores": {"correctness": 0.33}}`.
                 * We can create a sub-span of the parent row by logging
                 * `{"_parent_id": "abc", "id": "llm_call", "input": {"prompt": "What comes after foo?"}, "output": "bar", "metrics": {"tokens": 1}}`.
                 * In the webapp, only the root span row `"abc"` will show up in the summary view.
                 * You can view the full trace hierarchy (in this case, the `"llm_call"` row) by
                 * clicking on the "abc" row.
                 */
                @JsonProperty("_parent_id")
                @ExcludeMissing
                fun _parentId(_parentId: JsonField<String>) = apply {
                    this._parentId = _parentId
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

                fun build(): InsertExperimentEventReplace = InsertExperimentEventReplace(
                    input,
                    output,
                    expected,
                    scores,
                    metadata,
                    tags.map { it.toUnmodifiable() },
                    metrics,
                    context,
                    spanAttributes,
                    id,
                    datasetRecordId,
                    created,
                    _objectDelete,
                    _isMerge,
                    _parentId,
                    additionalProperties.toUnmodifiable(),
                )
            }

            /**
             * Context is additional information about the code that produced the experiment
             * event. It is essentially the textual counterpart to `metrics`. Use the
             * `caller_*` attributes to track the location in code which produced the
             * experiment event
             */
            @JsonDeserialize(builder = Context.Builder::class)
            @NoAutoDetect
            class Context private constructor(
              private val callerFunctionname: JsonField<String>,
              private val callerFilename: JsonField<String>,
              private val callerLineno: JsonField<Long>,
              private val additionalProperties: Map<String, JsonValue>,

            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /** The function in code which created the experiment event */
                fun callerFunctionname(): Optional<String> = Optional.ofNullable(callerFunctionname.getNullable("caller_functionname"))

                /** Name of the file in code where the experiment event was created */
                fun callerFilename(): Optional<String> = Optional.ofNullable(callerFilename.getNullable("caller_filename"))

                /** Line of code where the experiment event was created */
                fun callerLineno(): Optional<Long> = Optional.ofNullable(callerLineno.getNullable("caller_lineno"))

                /** The function in code which created the experiment event */
                @JsonProperty("caller_functionname")
                @ExcludeMissing
                fun _callerFunctionname() = callerFunctionname

                /** Name of the file in code where the experiment event was created */
                @JsonProperty("caller_filename")
                @ExcludeMissing
                fun _callerFilename() = callerFilename

                /** Line of code where the experiment event was created */
                @JsonProperty("caller_lineno")
                @ExcludeMissing
                fun _callerLineno() = callerLineno

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): Context = apply {
                    if (!validated) {
                      callerFunctionname()
                      callerFilename()
                      callerLineno()
                      validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                  if (this === other) {
                      return true
                  }

                  return other is Context &&
                      this.callerFunctionname == other.callerFunctionname &&
                      this.callerFilename == other.callerFilename &&
                      this.callerLineno == other.callerLineno &&
                      this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                  if (hashCode == 0) {
                    hashCode = Objects.hash(
                        callerFunctionname,
                        callerFilename,
                        callerLineno,
                        additionalProperties,
                    )
                  }
                  return hashCode
                }

                override fun toString() = "Context{callerFunctionname=$callerFunctionname, callerFilename=$callerFilename, callerLineno=$callerLineno, additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic
                    fun builder() = Builder()
                }

                class Builder {

                    private var callerFunctionname: JsonField<String> = JsonMissing.of()
                    private var callerFilename: JsonField<String> = JsonMissing.of()
                    private var callerLineno: JsonField<Long> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(context: Context) = apply {
                        this.callerFunctionname = context.callerFunctionname
                        this.callerFilename = context.callerFilename
                        this.callerLineno = context.callerLineno
                        additionalProperties(context.additionalProperties)
                    }

                    /** The function in code which created the experiment event */
                    fun callerFunctionname(callerFunctionname: String) = callerFunctionname(JsonField.of(callerFunctionname))

                    /** The function in code which created the experiment event */
                    @JsonProperty("caller_functionname")
                    @ExcludeMissing
                    fun callerFunctionname(callerFunctionname: JsonField<String>) = apply {
                        this.callerFunctionname = callerFunctionname
                    }

                    /** Name of the file in code where the experiment event was created */
                    fun callerFilename(callerFilename: String) = callerFilename(JsonField.of(callerFilename))

                    /** Name of the file in code where the experiment event was created */
                    @JsonProperty("caller_filename")
                    @ExcludeMissing
                    fun callerFilename(callerFilename: JsonField<String>) = apply {
                        this.callerFilename = callerFilename
                    }

                    /** Line of code where the experiment event was created */
                    fun callerLineno(callerLineno: Long) = callerLineno(JsonField.of(callerLineno))

                    /** Line of code where the experiment event was created */
                    @JsonProperty("caller_lineno")
                    @ExcludeMissing
                    fun callerLineno(callerLineno: JsonField<Long>) = apply {
                        this.callerLineno = callerLineno
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

                    fun build(): Context = Context(
                        callerFunctionname,
                        callerFilename,
                        callerLineno,
                        additionalProperties.toUnmodifiable(),
                    )
                }
            }

            /**
             * A dictionary with additional data about the test example, model outputs, or just
             * about anything else that's relevant, that you can use to help find and analyze
             * examples later. For example, you could log the `prompt`, example's `id`, or
             * anything else that would be useful to slice/dice later. The values in `metadata`
             * can be any JSON-serializable type, but its keys must be strings
             */
            @JsonDeserialize(builder = Metadata.Builder::class)
            @NoAutoDetect
            class Metadata private constructor(private val additionalProperties: Map<String, JsonValue>, ) {

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

                  return other is Metadata &&
                      this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                  if (hashCode == 0) {
                    hashCode = Objects.hash(additionalProperties)
                  }
                  return hashCode
                }

                override fun toString() = "Metadata{additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic
                    fun builder() = Builder()
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

            /**
             * Metrics are numerical measurements tracking the execution of the code that
             * produced the experiment event. Use "start" and "end" to track the time span over
             * which the experiment event was produced
             */
            @JsonDeserialize(builder = Metrics.Builder::class)
            @NoAutoDetect
            class Metrics private constructor(
              private val start: JsonField<Double>,
              private val end: JsonField<Double>,
              private val promptTokens: JsonField<Long>,
              private val completionTokens: JsonField<Long>,
              private val tokens: JsonField<Long>,
              private val additionalProperties: Map<String, JsonValue>,

            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /**
                 * A unix timestamp recording when the section of code which produced the
                 * experiment event started
                 */
                fun start(): Optional<Double> = Optional.ofNullable(start.getNullable("start"))

                /**
                 * A unix timestamp recording when the section of code which produced the
                 * experiment event finished
                 */
                fun end(): Optional<Double> = Optional.ofNullable(end.getNullable("end"))

                /**
                 * The number of tokens in the prompt used to generate the experiment event (only
                 * set if this is an LLM span)
                 */
                fun promptTokens(): Optional<Long> = Optional.ofNullable(promptTokens.getNullable("prompt_tokens"))

                /**
                 * The number of tokens in the completion generated by the model (only set if this
                 * is an LLM span)
                 */
                fun completionTokens(): Optional<Long> = Optional.ofNullable(completionTokens.getNullable("completion_tokens"))

                /** The total number of tokens in the input and output of the experiment event. */
                fun tokens(): Optional<Long> = Optional.ofNullable(tokens.getNullable("tokens"))

                /**
                 * A unix timestamp recording when the section of code which produced the
                 * experiment event started
                 */
                @JsonProperty("start")
                @ExcludeMissing
                fun _start() = start

                /**
                 * A unix timestamp recording when the section of code which produced the
                 * experiment event finished
                 */
                @JsonProperty("end")
                @ExcludeMissing
                fun _end() = end

                /**
                 * The number of tokens in the prompt used to generate the experiment event (only
                 * set if this is an LLM span)
                 */
                @JsonProperty("prompt_tokens")
                @ExcludeMissing
                fun _promptTokens() = promptTokens

                /**
                 * The number of tokens in the completion generated by the model (only set if this
                 * is an LLM span)
                 */
                @JsonProperty("completion_tokens")
                @ExcludeMissing
                fun _completionTokens() = completionTokens

                /** The total number of tokens in the input and output of the experiment event. */
                @JsonProperty("tokens")
                @ExcludeMissing
                fun _tokens() = tokens

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): Metrics = apply {
                    if (!validated) {
                      start()
                      end()
                      promptTokens()
                      completionTokens()
                      tokens()
                      validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                  if (this === other) {
                      return true
                  }

                  return other is Metrics &&
                      this.start == other.start &&
                      this.end == other.end &&
                      this.promptTokens == other.promptTokens &&
                      this.completionTokens == other.completionTokens &&
                      this.tokens == other.tokens &&
                      this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                  if (hashCode == 0) {
                    hashCode = Objects.hash(
                        start,
                        end,
                        promptTokens,
                        completionTokens,
                        tokens,
                        additionalProperties,
                    )
                  }
                  return hashCode
                }

                override fun toString() = "Metrics{start=$start, end=$end, promptTokens=$promptTokens, completionTokens=$completionTokens, tokens=$tokens, additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic
                    fun builder() = Builder()
                }

                class Builder {

                    private var start: JsonField<Double> = JsonMissing.of()
                    private var end: JsonField<Double> = JsonMissing.of()
                    private var promptTokens: JsonField<Long> = JsonMissing.of()
                    private var completionTokens: JsonField<Long> = JsonMissing.of()
                    private var tokens: JsonField<Long> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(metrics: Metrics) = apply {
                        this.start = metrics.start
                        this.end = metrics.end
                        this.promptTokens = metrics.promptTokens
                        this.completionTokens = metrics.completionTokens
                        this.tokens = metrics.tokens
                        additionalProperties(metrics.additionalProperties)
                    }

                    /**
                     * A unix timestamp recording when the section of code which produced the
                     * experiment event started
                     */
                    fun start(start: Double) = start(JsonField.of(start))

                    /**
                     * A unix timestamp recording when the section of code which produced the
                     * experiment event started
                     */
                    @JsonProperty("start")
                    @ExcludeMissing
                    fun start(start: JsonField<Double>) = apply {
                        this.start = start
                    }

                    /**
                     * A unix timestamp recording when the section of code which produced the
                     * experiment event finished
                     */
                    fun end(end: Double) = end(JsonField.of(end))

                    /**
                     * A unix timestamp recording when the section of code which produced the
                     * experiment event finished
                     */
                    @JsonProperty("end")
                    @ExcludeMissing
                    fun end(end: JsonField<Double>) = apply {
                        this.end = end
                    }

                    /**
                     * The number of tokens in the prompt used to generate the experiment event (only
                     * set if this is an LLM span)
                     */
                    fun promptTokens(promptTokens: Long) = promptTokens(JsonField.of(promptTokens))

                    /**
                     * The number of tokens in the prompt used to generate the experiment event (only
                     * set if this is an LLM span)
                     */
                    @JsonProperty("prompt_tokens")
                    @ExcludeMissing
                    fun promptTokens(promptTokens: JsonField<Long>) = apply {
                        this.promptTokens = promptTokens
                    }

                    /**
                     * The number of tokens in the completion generated by the model (only set if this
                     * is an LLM span)
                     */
                    fun completionTokens(completionTokens: Long) = completionTokens(JsonField.of(completionTokens))

                    /**
                     * The number of tokens in the completion generated by the model (only set if this
                     * is an LLM span)
                     */
                    @JsonProperty("completion_tokens")
                    @ExcludeMissing
                    fun completionTokens(completionTokens: JsonField<Long>) = apply {
                        this.completionTokens = completionTokens
                    }

                    /** The total number of tokens in the input and output of the experiment event. */
                    fun tokens(tokens: Long) = tokens(JsonField.of(tokens))

                    /** The total number of tokens in the input and output of the experiment event. */
                    @JsonProperty("tokens")
                    @ExcludeMissing
                    fun tokens(tokens: JsonField<Long>) = apply {
                        this.tokens = tokens
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

                    fun build(): Metrics = Metrics(
                        start,
                        end,
                        promptTokens,
                        completionTokens,
                        tokens,
                        additionalProperties.toUnmodifiable(),
                    )
                }
            }

            /**
             * A dictionary of numeric values (between 0 and 1) to log. The scores should give
             * you a variety of signals that help you determine how accurate the outputs are
             * compared to what you expect and diagnose failures. For example, a summarization
             * app might have one score that tells you how accurate the summary is, and another
             * that measures the word similarity between the generated and grouth truth
             * summary. The word similarity score could help you determine whether the
             * summarization was covering similar concepts or not. You can use these scores to
             * help you sort, filter, and compare experiments
             */
            @JsonDeserialize(builder = Scores.Builder::class)
            @NoAutoDetect
            class Scores private constructor(private val additionalProperties: Map<String, JsonValue>, ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): Scores = apply {
                    if (!validated) {
                      validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                  if (this === other) {
                      return true
                  }

                  return other is Scores &&
                      this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                  if (hashCode == 0) {
                    hashCode = Objects.hash(additionalProperties)
                  }
                  return hashCode
                }

                override fun toString() = "Scores{additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic
                    fun builder() = Builder()
                }

                class Builder {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(scores: Scores) = apply {
                        additionalProperties(scores.additionalProperties)
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

                    fun build(): Scores = Scores(additionalProperties.toUnmodifiable())
                }
            }

            /** Human-identifying attributes of the span, such as name, type, etc. */
            @JsonDeserialize(builder = SpanAttributes.Builder::class)
            @NoAutoDetect
            class SpanAttributes private constructor(private val name: JsonField<String>, private val type: JsonField<Type>, private val additionalProperties: Map<String, JsonValue>, ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /** Name of the span, for display purposes only */
                fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

                /** Type of the span, for display purposes only */
                fun type(): Optional<Type> = Optional.ofNullable(type.getNullable("type"))

                /** Name of the span, for display purposes only */
                @JsonProperty("name")
                @ExcludeMissing
                fun _name() = name

                /** Type of the span, for display purposes only */
                @JsonProperty("type")
                @ExcludeMissing
                fun _type() = type

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): SpanAttributes = apply {
                    if (!validated) {
                      name()
                      type()
                      validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                  if (this === other) {
                      return true
                  }

                  return other is SpanAttributes &&
                      this.name == other.name &&
                      this.type == other.type &&
                      this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                  if (hashCode == 0) {
                    hashCode = Objects.hash(
                        name,
                        type,
                        additionalProperties,
                    )
                  }
                  return hashCode
                }

                override fun toString() = "SpanAttributes{name=$name, type=$type, additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic
                    fun builder() = Builder()
                }

                class Builder {

                    private var name: JsonField<String> = JsonMissing.of()
                    private var type: JsonField<Type> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(spanAttributes: SpanAttributes) = apply {
                        this.name = spanAttributes.name
                        this.type = spanAttributes.type
                        additionalProperties(spanAttributes.additionalProperties)
                    }

                    /** Name of the span, for display purposes only */
                    fun name(name: String) = name(JsonField.of(name))

                    /** Name of the span, for display purposes only */
                    @JsonProperty("name")
                    @ExcludeMissing
                    fun name(name: JsonField<String>) = apply {
                        this.name = name
                    }

                    /** Type of the span, for display purposes only */
                    fun type(type: Type) = type(JsonField.of(type))

                    /** Type of the span, for display purposes only */
                    @JsonProperty("type")
                    @ExcludeMissing
                    fun type(type: JsonField<Type>) = apply {
                        this.type = type
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

                    fun build(): SpanAttributes = SpanAttributes(
                        name,
                        type,
                        additionalProperties.toUnmodifiable(),
                    )
                }

                class Type @JsonCreator private constructor(private val value: JsonField<String>, ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                      if (this === other) {
                          return true
                      }

                      return other is Type &&
                          this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        @JvmField val LLM = Type(JsonField.of("llm"))

                        @JvmField val SCORE = Type(JsonField.of("score"))

                        @JvmField val FUNCTION = Type(JsonField.of("function"))

                        @JvmField val EVAL = Type(JsonField.of("eval"))

                        @JvmField val TASK = Type(JsonField.of("task"))

                        @JvmField val TOOL = Type(JsonField.of("tool"))

                        @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                    }

                    enum class Known {
                        LLM,
                        SCORE,
                        FUNCTION,
                        EVAL,
                        TASK,
                        TOOL,
                    }

                    enum class Value {
                        LLM,
                        SCORE,
                        FUNCTION,
                        EVAL,
                        TASK,
                        TOOL,
                        _UNKNOWN,
                    }

                    fun value(): Value = when (this) {
                        LLM -> Value.LLM
                        SCORE -> Value.SCORE
                        FUNCTION -> Value.FUNCTION
                        EVAL -> Value.EVAL
                        TASK -> Value.TASK
                        TOOL -> Value.TOOL
                        else -> Value._UNKNOWN
                    }

                    fun known(): Known = when (this) {
                        LLM -> Known.LLM
                        SCORE -> Known.SCORE
                        FUNCTION -> Known.FUNCTION
                        EVAL -> Known.EVAL
                        TASK -> Known.TASK
                        TOOL -> Known.TOOL
                        else -> throw BraintrustInvalidDataException("Unknown Type: $value")
                    }

                    fun asString(): String = _value().asStringOrThrow()
                }
            }
        }

        @JsonDeserialize(builder = InsertExperimentEventMerge.Builder::class)
        @NoAutoDetect
        class InsertExperimentEventMerge private constructor(
          private val input: JsonValue,
          private val output: JsonValue,
          private val expected: JsonValue,
          private val scores: JsonField<Scores>,
          private val metadata: JsonField<Metadata>,
          private val tags: JsonField<List<String>>,
          private val metrics: JsonField<Metrics>,
          private val context: JsonField<Context>,
          private val spanAttributes: JsonField<SpanAttributes>,
          private val id: JsonField<String>,
          private val datasetRecordId: JsonField<String>,
          private val created: JsonField<OffsetDateTime>,
          private val _objectDelete: JsonField<Boolean>,
          private val _isMerge: JsonField<Boolean>,
          private val _mergePaths: JsonField<List<List<String>>>,
          private val additionalProperties: Map<String, JsonValue>,

        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /**
             * The arguments that uniquely define a test case (an arbitrary, JSON serializable
             * object). Later on, Braintrust will use the `input` to know whether two test
             * cases are the same between experiments, so they should not contain
             * experiment-specific state. A simple rule of thumb is that if you run the same
             * experiment twice, the `input` should be identical
             */
            fun input(): JsonValue = input

            /**
             * The output of your application, including post-processing (an arbitrary, JSON
             * serializable object), that allows you to determine whether the result is correct
             * or not. For example, in an app that generates SQL queries, the `output` should
             * be the _result_ of the SQL query generated by the model, not the query itself,
             * because there may be multiple valid queries that answer a single question
             */
            fun output(): JsonValue = output

            /**
             * The ground truth value (an arbitrary, JSON serializable object) that you'd
             * compare to `output` to determine if your `output` value is correct or not.
             * Braintrust currently does not compare `output` to `expected` for you, since
             * there are so many different ways to do that correctly. Instead, these values are
             * just used to help you navigate your experiments while digging into analyses.
             * However, we may later use these values to re-score outputs or fine-tune your
             * models
             */
            fun expected(): JsonValue = expected

            /**
             * A dictionary of numeric values (between 0 and 1) to log. The scores should give
             * you a variety of signals that help you determine how accurate the outputs are
             * compared to what you expect and diagnose failures. For example, a summarization
             * app might have one score that tells you how accurate the summary is, and another
             * that measures the word similarity between the generated and grouth truth
             * summary. The word similarity score could help you determine whether the
             * summarization was covering similar concepts or not. You can use these scores to
             * help you sort, filter, and compare experiments
             */
            fun scores(): Optional<Scores> = Optional.ofNullable(scores.getNullable("scores"))

            /**
             * A dictionary with additional data about the test example, model outputs, or just
             * about anything else that's relevant, that you can use to help find and analyze
             * examples later. For example, you could log the `prompt`, example's `id`, or
             * anything else that would be useful to slice/dice later. The values in `metadata`
             * can be any JSON-serializable type, but its keys must be strings
             */
            fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata.getNullable("metadata"))

            /** A list of tags to log */
            fun tags(): Optional<List<String>> = Optional.ofNullable(tags.getNullable("tags"))

            /**
             * Metrics are numerical measurements tracking the execution of the code that
             * produced the experiment event. Use "start" and "end" to track the time span over
             * which the experiment event was produced
             */
            fun metrics(): Optional<Metrics> = Optional.ofNullable(metrics.getNullable("metrics"))

            /**
             * Context is additional information about the code that produced the experiment
             * event. It is essentially the textual counterpart to `metrics`. Use the
             * `caller_*` attributes to track the location in code which produced the
             * experiment event
             */
            fun context(): Optional<Context> = Optional.ofNullable(context.getNullable("context"))

            /** Human-identifying attributes of the span, such as name, type, etc. */
            fun spanAttributes(): Optional<SpanAttributes> = Optional.ofNullable(spanAttributes.getNullable("span_attributes"))

            /**
             * A unique identifier for the experiment event. If you don't provide one,
             * BrainTrust will generate one for you
             */
            fun id(): Optional<String> = Optional.ofNullable(id.getNullable("id"))

            /**
             * If the experiment is associated to a dataset, this is the event-level dataset id
             * this experiment event is tied to
             */
            fun datasetRecordId(): Optional<String> = Optional.ofNullable(datasetRecordId.getNullable("dataset_record_id"))

            /** The timestamp the experiment event was created */
            fun created(): Optional<OffsetDateTime> = Optional.ofNullable(created.getNullable("created"))

            /**
             * Pass `_object_delete=true` to mark the experiment event deleted. Deleted events
             * will not show up in subsequent fetches for this experiment
             */
            fun _objectDelete(): Optional<Boolean> = Optional.ofNullable(_objectDelete.getNullable("_object_delete"))

            /**
             * The `_is_merge` field controls how the row is merged with any existing row with
             * the same id in the DB. By default (or when set to `false`), the existing row is
             * completely replaced by the new row. When set to `true`, the new row is
             * deep-merged into the existing row
             *
             * For example, say there is an existing row in the DB
             * `{"id": "foo", "input": {"a": 5, "b": 10}}`. If we merge a new row as
             * `{"_is_merge": true, "id": "foo", "input": {"b": 11, "c": 20}}`, the new row
             * will be `{"id": "foo", "input": {"a": 5, "b": 11, "c": 20}}`. If we replace the
             * new row as `{"id": "foo", "input": {"b": 11, "c": 20}}`, the new row will be
             * `{"id": "foo", "input": {"b": 11, "c": 20}}`
             */
            fun _isMerge(): Boolean = _isMerge.getRequired("_is_merge")

            /**
             * The `_merge_paths` field allows controlling the depth of the merge. It can only
             * be specified alongside `_is_merge=true`. `_merge_paths` is a list of paths,
             * where each path is a list of field names. The deep merge will not descend below
             * any of the specified merge paths.
             *
             * For example, say there is an existing row in the DB
             * `{"id": "foo", "input": {"a": {"b": 10}, "c": {"d": 20}}, "output": {"a": 20}}`.
             * If we merge a new row as
             * `{"_is_merge": true, "_merge_paths": [["input", "a"], ["output"]], "input": {"a": {"q": 30}, "c": {"e": 30}, "bar": "baz"}, "output": {"d": 40}}`,
             * the new row will be
             * `{"id": "foo": "input": {"a": {"q": 30}, "c": {"d": 20, "e": 30}, "bar": "baz"}, "output": {"d": 40}}`.
             * In this case, due to the merge paths, we have replaced `input.a` and `output`,
             * but have still deep-merged `input` and `input.c`.
             */
            fun _mergePaths(): Optional<List<List<String>>> = Optional.ofNullable(_mergePaths.getNullable("_merge_paths"))

            /**
             * The arguments that uniquely define a test case (an arbitrary, JSON serializable
             * object). Later on, Braintrust will use the `input` to know whether two test
             * cases are the same between experiments, so they should not contain
             * experiment-specific state. A simple rule of thumb is that if you run the same
             * experiment twice, the `input` should be identical
             */
            @JsonProperty("input")
            @ExcludeMissing
            fun _input() = input

            /**
             * The output of your application, including post-processing (an arbitrary, JSON
             * serializable object), that allows you to determine whether the result is correct
             * or not. For example, in an app that generates SQL queries, the `output` should
             * be the _result_ of the SQL query generated by the model, not the query itself,
             * because there may be multiple valid queries that answer a single question
             */
            @JsonProperty("output")
            @ExcludeMissing
            fun _output() = output

            /**
             * The ground truth value (an arbitrary, JSON serializable object) that you'd
             * compare to `output` to determine if your `output` value is correct or not.
             * Braintrust currently does not compare `output` to `expected` for you, since
             * there are so many different ways to do that correctly. Instead, these values are
             * just used to help you navigate your experiments while digging into analyses.
             * However, we may later use these values to re-score outputs or fine-tune your
             * models
             */
            @JsonProperty("expected")
            @ExcludeMissing
            fun _expected() = expected

            /**
             * A dictionary of numeric values (between 0 and 1) to log. The scores should give
             * you a variety of signals that help you determine how accurate the outputs are
             * compared to what you expect and diagnose failures. For example, a summarization
             * app might have one score that tells you how accurate the summary is, and another
             * that measures the word similarity between the generated and grouth truth
             * summary. The word similarity score could help you determine whether the
             * summarization was covering similar concepts or not. You can use these scores to
             * help you sort, filter, and compare experiments
             */
            @JsonProperty("scores")
            @ExcludeMissing
            fun _scores() = scores

            /**
             * A dictionary with additional data about the test example, model outputs, or just
             * about anything else that's relevant, that you can use to help find and analyze
             * examples later. For example, you could log the `prompt`, example's `id`, or
             * anything else that would be useful to slice/dice later. The values in `metadata`
             * can be any JSON-serializable type, but its keys must be strings
             */
            @JsonProperty("metadata")
            @ExcludeMissing
            fun _metadata() = metadata

            /** A list of tags to log */
            @JsonProperty("tags")
            @ExcludeMissing
            fun _tags() = tags

            /**
             * Metrics are numerical measurements tracking the execution of the code that
             * produced the experiment event. Use "start" and "end" to track the time span over
             * which the experiment event was produced
             */
            @JsonProperty("metrics")
            @ExcludeMissing
            fun _metrics() = metrics

            /**
             * Context is additional information about the code that produced the experiment
             * event. It is essentially the textual counterpart to `metrics`. Use the
             * `caller_*` attributes to track the location in code which produced the
             * experiment event
             */
            @JsonProperty("context")
            @ExcludeMissing
            fun _context() = context

            /** Human-identifying attributes of the span, such as name, type, etc. */
            @JsonProperty("span_attributes")
            @ExcludeMissing
            fun _spanAttributes() = spanAttributes

            /**
             * A unique identifier for the experiment event. If you don't provide one,
             * BrainTrust will generate one for you
             */
            @JsonProperty("id")
            @ExcludeMissing
            fun _id() = id

            /**
             * If the experiment is associated to a dataset, this is the event-level dataset id
             * this experiment event is tied to
             */
            @JsonProperty("dataset_record_id")
            @ExcludeMissing
            fun _datasetRecordId() = datasetRecordId

            /** The timestamp the experiment event was created */
            @JsonProperty("created")
            @ExcludeMissing
            fun _created() = created

            /**
             * Pass `_object_delete=true` to mark the experiment event deleted. Deleted events
             * will not show up in subsequent fetches for this experiment
             */
            @JsonProperty("_object_delete")
            @ExcludeMissing
            fun __objectDelete() = _objectDelete

            /**
             * The `_is_merge` field controls how the row is merged with any existing row with
             * the same id in the DB. By default (or when set to `false`), the existing row is
             * completely replaced by the new row. When set to `true`, the new row is
             * deep-merged into the existing row
             *
             * For example, say there is an existing row in the DB
             * `{"id": "foo", "input": {"a": 5, "b": 10}}`. If we merge a new row as
             * `{"_is_merge": true, "id": "foo", "input": {"b": 11, "c": 20}}`, the new row
             * will be `{"id": "foo", "input": {"a": 5, "b": 11, "c": 20}}`. If we replace the
             * new row as `{"id": "foo", "input": {"b": 11, "c": 20}}`, the new row will be
             * `{"id": "foo", "input": {"b": 11, "c": 20}}`
             */
            @JsonProperty("_is_merge")
            @ExcludeMissing
            fun __isMerge() = _isMerge

            /**
             * The `_merge_paths` field allows controlling the depth of the merge. It can only
             * be specified alongside `_is_merge=true`. `_merge_paths` is a list of paths,
             * where each path is a list of field names. The deep merge will not descend below
             * any of the specified merge paths.
             *
             * For example, say there is an existing row in the DB
             * `{"id": "foo", "input": {"a": {"b": 10}, "c": {"d": 20}}, "output": {"a": 20}}`.
             * If we merge a new row as
             * `{"_is_merge": true, "_merge_paths": [["input", "a"], ["output"]], "input": {"a": {"q": 30}, "c": {"e": 30}, "bar": "baz"}, "output": {"d": 40}}`,
             * the new row will be
             * `{"id": "foo": "input": {"a": {"q": 30}, "c": {"d": 20, "e": 30}, "bar": "baz"}, "output": {"d": 40}}`.
             * In this case, due to the merge paths, we have replaced `input.a` and `output`,
             * but have still deep-merged `input` and `input.c`.
             */
            @JsonProperty("_merge_paths")
            @ExcludeMissing
            fun __mergePaths() = _mergePaths

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): InsertExperimentEventMerge = apply {
                if (!validated) {
                  input()
                  output()
                  expected()
                  scores().map { it.validate() }
                  metadata().map { it.validate() }
                  tags()
                  metrics().map { it.validate() }
                  context().map { it.validate() }
                  spanAttributes().map { it.validate() }
                  id()
                  datasetRecordId()
                  created()
                  _objectDelete()
                  _isMerge()
                  _mergePaths()
                  validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
              if (this === other) {
                  return true
              }

              return other is InsertExperimentEventMerge &&
                  this.input == other.input &&
                  this.output == other.output &&
                  this.expected == other.expected &&
                  this.scores == other.scores &&
                  this.metadata == other.metadata &&
                  this.tags == other.tags &&
                  this.metrics == other.metrics &&
                  this.context == other.context &&
                  this.spanAttributes == other.spanAttributes &&
                  this.id == other.id &&
                  this.datasetRecordId == other.datasetRecordId &&
                  this.created == other.created &&
                  this._objectDelete == other._objectDelete &&
                  this._isMerge == other._isMerge &&
                  this._mergePaths == other._mergePaths &&
                  this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
              if (hashCode == 0) {
                hashCode = Objects.hash(
                    input,
                    output,
                    expected,
                    scores,
                    metadata,
                    tags,
                    metrics,
                    context,
                    spanAttributes,
                    id,
                    datasetRecordId,
                    created,
                    _objectDelete,
                    _isMerge,
                    _mergePaths,
                    additionalProperties,
                )
              }
              return hashCode
            }

            override fun toString() = "InsertExperimentEventMerge{input=$input, output=$output, expected=$expected, scores=$scores, metadata=$metadata, tags=$tags, metrics=$metrics, context=$context, spanAttributes=$spanAttributes, id=$id, datasetRecordId=$datasetRecordId, created=$created, _objectDelete=$_objectDelete, _isMerge=$_isMerge, _mergePaths=$_mergePaths, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic
                fun builder() = Builder()
            }

            class Builder {

                private var input: JsonValue = JsonMissing.of()
                private var output: JsonValue = JsonMissing.of()
                private var expected: JsonValue = JsonMissing.of()
                private var scores: JsonField<Scores> = JsonMissing.of()
                private var metadata: JsonField<Metadata> = JsonMissing.of()
                private var tags: JsonField<List<String>> = JsonMissing.of()
                private var metrics: JsonField<Metrics> = JsonMissing.of()
                private var context: JsonField<Context> = JsonMissing.of()
                private var spanAttributes: JsonField<SpanAttributes> = JsonMissing.of()
                private var id: JsonField<String> = JsonMissing.of()
                private var datasetRecordId: JsonField<String> = JsonMissing.of()
                private var created: JsonField<OffsetDateTime> = JsonMissing.of()
                private var _objectDelete: JsonField<Boolean> = JsonMissing.of()
                private var _isMerge: JsonField<Boolean> = JsonMissing.of()
                private var _mergePaths: JsonField<List<List<String>>> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(insertExperimentEventMerge: InsertExperimentEventMerge) = apply {
                    this.input = insertExperimentEventMerge.input
                    this.output = insertExperimentEventMerge.output
                    this.expected = insertExperimentEventMerge.expected
                    this.scores = insertExperimentEventMerge.scores
                    this.metadata = insertExperimentEventMerge.metadata
                    this.tags = insertExperimentEventMerge.tags
                    this.metrics = insertExperimentEventMerge.metrics
                    this.context = insertExperimentEventMerge.context
                    this.spanAttributes = insertExperimentEventMerge.spanAttributes
                    this.id = insertExperimentEventMerge.id
                    this.datasetRecordId = insertExperimentEventMerge.datasetRecordId
                    this.created = insertExperimentEventMerge.created
                    this._objectDelete = insertExperimentEventMerge._objectDelete
                    this._isMerge = insertExperimentEventMerge._isMerge
                    this._mergePaths = insertExperimentEventMerge._mergePaths
                    additionalProperties(insertExperimentEventMerge.additionalProperties)
                }

                /**
                 * The arguments that uniquely define a test case (an arbitrary, JSON serializable
                 * object). Later on, Braintrust will use the `input` to know whether two test
                 * cases are the same between experiments, so they should not contain
                 * experiment-specific state. A simple rule of thumb is that if you run the same
                 * experiment twice, the `input` should be identical
                 */
                @JsonProperty("input")
                @ExcludeMissing
                fun input(input: JsonValue) = apply {
                    this.input = input
                }

                /**
                 * The output of your application, including post-processing (an arbitrary, JSON
                 * serializable object), that allows you to determine whether the result is correct
                 * or not. For example, in an app that generates SQL queries, the `output` should
                 * be the _result_ of the SQL query generated by the model, not the query itself,
                 * because there may be multiple valid queries that answer a single question
                 */
                @JsonProperty("output")
                @ExcludeMissing
                fun output(output: JsonValue) = apply {
                    this.output = output
                }

                /**
                 * The ground truth value (an arbitrary, JSON serializable object) that you'd
                 * compare to `output` to determine if your `output` value is correct or not.
                 * Braintrust currently does not compare `output` to `expected` for you, since
                 * there are so many different ways to do that correctly. Instead, these values are
                 * just used to help you navigate your experiments while digging into analyses.
                 * However, we may later use these values to re-score outputs or fine-tune your
                 * models
                 */
                @JsonProperty("expected")
                @ExcludeMissing
                fun expected(expected: JsonValue) = apply {
                    this.expected = expected
                }

                /**
                 * A dictionary of numeric values (between 0 and 1) to log. The scores should give
                 * you a variety of signals that help you determine how accurate the outputs are
                 * compared to what you expect and diagnose failures. For example, a summarization
                 * app might have one score that tells you how accurate the summary is, and another
                 * that measures the word similarity between the generated and grouth truth
                 * summary. The word similarity score could help you determine whether the
                 * summarization was covering similar concepts or not. You can use these scores to
                 * help you sort, filter, and compare experiments
                 */
                fun scores(scores: Scores) = scores(JsonField.of(scores))

                /**
                 * A dictionary of numeric values (between 0 and 1) to log. The scores should give
                 * you a variety of signals that help you determine how accurate the outputs are
                 * compared to what you expect and diagnose failures. For example, a summarization
                 * app might have one score that tells you how accurate the summary is, and another
                 * that measures the word similarity between the generated and grouth truth
                 * summary. The word similarity score could help you determine whether the
                 * summarization was covering similar concepts or not. You can use these scores to
                 * help you sort, filter, and compare experiments
                 */
                @JsonProperty("scores")
                @ExcludeMissing
                fun scores(scores: JsonField<Scores>) = apply {
                    this.scores = scores
                }

                /**
                 * A dictionary with additional data about the test example, model outputs, or just
                 * about anything else that's relevant, that you can use to help find and analyze
                 * examples later. For example, you could log the `prompt`, example's `id`, or
                 * anything else that would be useful to slice/dice later. The values in `metadata`
                 * can be any JSON-serializable type, but its keys must be strings
                 */
                fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

                /**
                 * A dictionary with additional data about the test example, model outputs, or just
                 * about anything else that's relevant, that you can use to help find and analyze
                 * examples later. For example, you could log the `prompt`, example's `id`, or
                 * anything else that would be useful to slice/dice later. The values in `metadata`
                 * can be any JSON-serializable type, but its keys must be strings
                 */
                @JsonProperty("metadata")
                @ExcludeMissing
                fun metadata(metadata: JsonField<Metadata>) = apply {
                    this.metadata = metadata
                }

                /** A list of tags to log */
                fun tags(tags: List<String>) = tags(JsonField.of(tags))

                /** A list of tags to log */
                @JsonProperty("tags")
                @ExcludeMissing
                fun tags(tags: JsonField<List<String>>) = apply {
                    this.tags = tags
                }

                /**
                 * Metrics are numerical measurements tracking the execution of the code that
                 * produced the experiment event. Use "start" and "end" to track the time span over
                 * which the experiment event was produced
                 */
                fun metrics(metrics: Metrics) = metrics(JsonField.of(metrics))

                /**
                 * Metrics are numerical measurements tracking the execution of the code that
                 * produced the experiment event. Use "start" and "end" to track the time span over
                 * which the experiment event was produced
                 */
                @JsonProperty("metrics")
                @ExcludeMissing
                fun metrics(metrics: JsonField<Metrics>) = apply {
                    this.metrics = metrics
                }

                /**
                 * Context is additional information about the code that produced the experiment
                 * event. It is essentially the textual counterpart to `metrics`. Use the
                 * `caller_*` attributes to track the location in code which produced the
                 * experiment event
                 */
                fun context(context: Context) = context(JsonField.of(context))

                /**
                 * Context is additional information about the code that produced the experiment
                 * event. It is essentially the textual counterpart to `metrics`. Use the
                 * `caller_*` attributes to track the location in code which produced the
                 * experiment event
                 */
                @JsonProperty("context")
                @ExcludeMissing
                fun context(context: JsonField<Context>) = apply {
                    this.context = context
                }

                /** Human-identifying attributes of the span, such as name, type, etc. */
                fun spanAttributes(spanAttributes: SpanAttributes) = spanAttributes(JsonField.of(spanAttributes))

                /** Human-identifying attributes of the span, such as name, type, etc. */
                @JsonProperty("span_attributes")
                @ExcludeMissing
                fun spanAttributes(spanAttributes: JsonField<SpanAttributes>) = apply {
                    this.spanAttributes = spanAttributes
                }

                /**
                 * A unique identifier for the experiment event. If you don't provide one,
                 * BrainTrust will generate one for you
                 */
                fun id(id: String) = id(JsonField.of(id))

                /**
                 * A unique identifier for the experiment event. If you don't provide one,
                 * BrainTrust will generate one for you
                 */
                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply {
                    this.id = id
                }

                /**
                 * If the experiment is associated to a dataset, this is the event-level dataset id
                 * this experiment event is tied to
                 */
                fun datasetRecordId(datasetRecordId: String) = datasetRecordId(JsonField.of(datasetRecordId))

                /**
                 * If the experiment is associated to a dataset, this is the event-level dataset id
                 * this experiment event is tied to
                 */
                @JsonProperty("dataset_record_id")
                @ExcludeMissing
                fun datasetRecordId(datasetRecordId: JsonField<String>) = apply {
                    this.datasetRecordId = datasetRecordId
                }

                /** The timestamp the experiment event was created */
                fun created(created: OffsetDateTime) = created(JsonField.of(created))

                /** The timestamp the experiment event was created */
                @JsonProperty("created")
                @ExcludeMissing
                fun created(created: JsonField<OffsetDateTime>) = apply {
                    this.created = created
                }

                /**
                 * Pass `_object_delete=true` to mark the experiment event deleted. Deleted events
                 * will not show up in subsequent fetches for this experiment
                 */
                fun _objectDelete(_objectDelete: Boolean) = _objectDelete(JsonField.of(_objectDelete))

                /**
                 * Pass `_object_delete=true` to mark the experiment event deleted. Deleted events
                 * will not show up in subsequent fetches for this experiment
                 */
                @JsonProperty("_object_delete")
                @ExcludeMissing
                fun _objectDelete(_objectDelete: JsonField<Boolean>) = apply {
                    this._objectDelete = _objectDelete
                }

                /**
                 * The `_is_merge` field controls how the row is merged with any existing row with
                 * the same id in the DB. By default (or when set to `false`), the existing row is
                 * completely replaced by the new row. When set to `true`, the new row is
                 * deep-merged into the existing row
                 *
                 * For example, say there is an existing row in the DB
                 * `{"id": "foo", "input": {"a": 5, "b": 10}}`. If we merge a new row as
                 * `{"_is_merge": true, "id": "foo", "input": {"b": 11, "c": 20}}`, the new row
                 * will be `{"id": "foo", "input": {"a": 5, "b": 11, "c": 20}}`. If we replace the
                 * new row as `{"id": "foo", "input": {"b": 11, "c": 20}}`, the new row will be
                 * `{"id": "foo", "input": {"b": 11, "c": 20}}`
                 */
                fun _isMerge(_isMerge: Boolean) = _isMerge(JsonField.of(_isMerge))

                /**
                 * The `_is_merge` field controls how the row is merged with any existing row with
                 * the same id in the DB. By default (or when set to `false`), the existing row is
                 * completely replaced by the new row. When set to `true`, the new row is
                 * deep-merged into the existing row
                 *
                 * For example, say there is an existing row in the DB
                 * `{"id": "foo", "input": {"a": 5, "b": 10}}`. If we merge a new row as
                 * `{"_is_merge": true, "id": "foo", "input": {"b": 11, "c": 20}}`, the new row
                 * will be `{"id": "foo", "input": {"a": 5, "b": 11, "c": 20}}`. If we replace the
                 * new row as `{"id": "foo", "input": {"b": 11, "c": 20}}`, the new row will be
                 * `{"id": "foo", "input": {"b": 11, "c": 20}}`
                 */
                @JsonProperty("_is_merge")
                @ExcludeMissing
                fun _isMerge(_isMerge: JsonField<Boolean>) = apply {
                    this._isMerge = _isMerge
                }

                /**
                 * The `_merge_paths` field allows controlling the depth of the merge. It can only
                 * be specified alongside `_is_merge=true`. `_merge_paths` is a list of paths,
                 * where each path is a list of field names. The deep merge will not descend below
                 * any of the specified merge paths.
                 *
                 * For example, say there is an existing row in the DB
                 * `{"id": "foo", "input": {"a": {"b": 10}, "c": {"d": 20}}, "output": {"a": 20}}`.
                 * If we merge a new row as
                 * `{"_is_merge": true, "_merge_paths": [["input", "a"], ["output"]], "input": {"a": {"q": 30}, "c": {"e": 30}, "bar": "baz"}, "output": {"d": 40}}`,
                 * the new row will be
                 * `{"id": "foo": "input": {"a": {"q": 30}, "c": {"d": 20, "e": 30}, "bar": "baz"}, "output": {"d": 40}}`.
                 * In this case, due to the merge paths, we have replaced `input.a` and `output`,
                 * but have still deep-merged `input` and `input.c`.
                 */
                fun _mergePaths(_mergePaths: List<List<String>>) = _mergePaths(JsonField.of(_mergePaths))

                /**
                 * The `_merge_paths` field allows controlling the depth of the merge. It can only
                 * be specified alongside `_is_merge=true`. `_merge_paths` is a list of paths,
                 * where each path is a list of field names. The deep merge will not descend below
                 * any of the specified merge paths.
                 *
                 * For example, say there is an existing row in the DB
                 * `{"id": "foo", "input": {"a": {"b": 10}, "c": {"d": 20}}, "output": {"a": 20}}`.
                 * If we merge a new row as
                 * `{"_is_merge": true, "_merge_paths": [["input", "a"], ["output"]], "input": {"a": {"q": 30}, "c": {"e": 30}, "bar": "baz"}, "output": {"d": 40}}`,
                 * the new row will be
                 * `{"id": "foo": "input": {"a": {"q": 30}, "c": {"d": 20, "e": 30}, "bar": "baz"}, "output": {"d": 40}}`.
                 * In this case, due to the merge paths, we have replaced `input.a` and `output`,
                 * but have still deep-merged `input` and `input.c`.
                 */
                @JsonProperty("_merge_paths")
                @ExcludeMissing
                fun _mergePaths(_mergePaths: JsonField<List<List<String>>>) = apply {
                    this._mergePaths = _mergePaths
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

                fun build(): InsertExperimentEventMerge = InsertExperimentEventMerge(
                    input,
                    output,
                    expected,
                    scores,
                    metadata,
                    tags.map { it.toUnmodifiable() },
                    metrics,
                    context,
                    spanAttributes,
                    id,
                    datasetRecordId,
                    created,
                    _objectDelete,
                    _isMerge,
                    _mergePaths.map { it.toUnmodifiable() },
                    additionalProperties.toUnmodifiable(),
                )
            }

            /**
             * Context is additional information about the code that produced the experiment
             * event. It is essentially the textual counterpart to `metrics`. Use the
             * `caller_*` attributes to track the location in code which produced the
             * experiment event
             */
            @JsonDeserialize(builder = Context.Builder::class)
            @NoAutoDetect
            class Context private constructor(
              private val callerFunctionname: JsonField<String>,
              private val callerFilename: JsonField<String>,
              private val callerLineno: JsonField<Long>,
              private val additionalProperties: Map<String, JsonValue>,

            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /** The function in code which created the experiment event */
                fun callerFunctionname(): Optional<String> = Optional.ofNullable(callerFunctionname.getNullable("caller_functionname"))

                /** Name of the file in code where the experiment event was created */
                fun callerFilename(): Optional<String> = Optional.ofNullable(callerFilename.getNullable("caller_filename"))

                /** Line of code where the experiment event was created */
                fun callerLineno(): Optional<Long> = Optional.ofNullable(callerLineno.getNullable("caller_lineno"))

                /** The function in code which created the experiment event */
                @JsonProperty("caller_functionname")
                @ExcludeMissing
                fun _callerFunctionname() = callerFunctionname

                /** Name of the file in code where the experiment event was created */
                @JsonProperty("caller_filename")
                @ExcludeMissing
                fun _callerFilename() = callerFilename

                /** Line of code where the experiment event was created */
                @JsonProperty("caller_lineno")
                @ExcludeMissing
                fun _callerLineno() = callerLineno

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): Context = apply {
                    if (!validated) {
                      callerFunctionname()
                      callerFilename()
                      callerLineno()
                      validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                  if (this === other) {
                      return true
                  }

                  return other is Context &&
                      this.callerFunctionname == other.callerFunctionname &&
                      this.callerFilename == other.callerFilename &&
                      this.callerLineno == other.callerLineno &&
                      this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                  if (hashCode == 0) {
                    hashCode = Objects.hash(
                        callerFunctionname,
                        callerFilename,
                        callerLineno,
                        additionalProperties,
                    )
                  }
                  return hashCode
                }

                override fun toString() = "Context{callerFunctionname=$callerFunctionname, callerFilename=$callerFilename, callerLineno=$callerLineno, additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic
                    fun builder() = Builder()
                }

                class Builder {

                    private var callerFunctionname: JsonField<String> = JsonMissing.of()
                    private var callerFilename: JsonField<String> = JsonMissing.of()
                    private var callerLineno: JsonField<Long> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(context: Context) = apply {
                        this.callerFunctionname = context.callerFunctionname
                        this.callerFilename = context.callerFilename
                        this.callerLineno = context.callerLineno
                        additionalProperties(context.additionalProperties)
                    }

                    /** The function in code which created the experiment event */
                    fun callerFunctionname(callerFunctionname: String) = callerFunctionname(JsonField.of(callerFunctionname))

                    /** The function in code which created the experiment event */
                    @JsonProperty("caller_functionname")
                    @ExcludeMissing
                    fun callerFunctionname(callerFunctionname: JsonField<String>) = apply {
                        this.callerFunctionname = callerFunctionname
                    }

                    /** Name of the file in code where the experiment event was created */
                    fun callerFilename(callerFilename: String) = callerFilename(JsonField.of(callerFilename))

                    /** Name of the file in code where the experiment event was created */
                    @JsonProperty("caller_filename")
                    @ExcludeMissing
                    fun callerFilename(callerFilename: JsonField<String>) = apply {
                        this.callerFilename = callerFilename
                    }

                    /** Line of code where the experiment event was created */
                    fun callerLineno(callerLineno: Long) = callerLineno(JsonField.of(callerLineno))

                    /** Line of code where the experiment event was created */
                    @JsonProperty("caller_lineno")
                    @ExcludeMissing
                    fun callerLineno(callerLineno: JsonField<Long>) = apply {
                        this.callerLineno = callerLineno
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

                    fun build(): Context = Context(
                        callerFunctionname,
                        callerFilename,
                        callerLineno,
                        additionalProperties.toUnmodifiable(),
                    )
                }
            }

            /**
             * A dictionary with additional data about the test example, model outputs, or just
             * about anything else that's relevant, that you can use to help find and analyze
             * examples later. For example, you could log the `prompt`, example's `id`, or
             * anything else that would be useful to slice/dice later. The values in `metadata`
             * can be any JSON-serializable type, but its keys must be strings
             */
            @JsonDeserialize(builder = Metadata.Builder::class)
            @NoAutoDetect
            class Metadata private constructor(private val additionalProperties: Map<String, JsonValue>, ) {

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

                  return other is Metadata &&
                      this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                  if (hashCode == 0) {
                    hashCode = Objects.hash(additionalProperties)
                  }
                  return hashCode
                }

                override fun toString() = "Metadata{additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic
                    fun builder() = Builder()
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

            /**
             * Metrics are numerical measurements tracking the execution of the code that
             * produced the experiment event. Use "start" and "end" to track the time span over
             * which the experiment event was produced
             */
            @JsonDeserialize(builder = Metrics.Builder::class)
            @NoAutoDetect
            class Metrics private constructor(
              private val start: JsonField<Double>,
              private val end: JsonField<Double>,
              private val promptTokens: JsonField<Long>,
              private val completionTokens: JsonField<Long>,
              private val tokens: JsonField<Long>,
              private val additionalProperties: Map<String, JsonValue>,

            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /**
                 * A unix timestamp recording when the section of code which produced the
                 * experiment event started
                 */
                fun start(): Optional<Double> = Optional.ofNullable(start.getNullable("start"))

                /**
                 * A unix timestamp recording when the section of code which produced the
                 * experiment event finished
                 */
                fun end(): Optional<Double> = Optional.ofNullable(end.getNullable("end"))

                /**
                 * The number of tokens in the prompt used to generate the experiment event (only
                 * set if this is an LLM span)
                 */
                fun promptTokens(): Optional<Long> = Optional.ofNullable(promptTokens.getNullable("prompt_tokens"))

                /**
                 * The number of tokens in the completion generated by the model (only set if this
                 * is an LLM span)
                 */
                fun completionTokens(): Optional<Long> = Optional.ofNullable(completionTokens.getNullable("completion_tokens"))

                /** The total number of tokens in the input and output of the experiment event. */
                fun tokens(): Optional<Long> = Optional.ofNullable(tokens.getNullable("tokens"))

                /**
                 * A unix timestamp recording when the section of code which produced the
                 * experiment event started
                 */
                @JsonProperty("start")
                @ExcludeMissing
                fun _start() = start

                /**
                 * A unix timestamp recording when the section of code which produced the
                 * experiment event finished
                 */
                @JsonProperty("end")
                @ExcludeMissing
                fun _end() = end

                /**
                 * The number of tokens in the prompt used to generate the experiment event (only
                 * set if this is an LLM span)
                 */
                @JsonProperty("prompt_tokens")
                @ExcludeMissing
                fun _promptTokens() = promptTokens

                /**
                 * The number of tokens in the completion generated by the model (only set if this
                 * is an LLM span)
                 */
                @JsonProperty("completion_tokens")
                @ExcludeMissing
                fun _completionTokens() = completionTokens

                /** The total number of tokens in the input and output of the experiment event. */
                @JsonProperty("tokens")
                @ExcludeMissing
                fun _tokens() = tokens

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): Metrics = apply {
                    if (!validated) {
                      start()
                      end()
                      promptTokens()
                      completionTokens()
                      tokens()
                      validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                  if (this === other) {
                      return true
                  }

                  return other is Metrics &&
                      this.start == other.start &&
                      this.end == other.end &&
                      this.promptTokens == other.promptTokens &&
                      this.completionTokens == other.completionTokens &&
                      this.tokens == other.tokens &&
                      this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                  if (hashCode == 0) {
                    hashCode = Objects.hash(
                        start,
                        end,
                        promptTokens,
                        completionTokens,
                        tokens,
                        additionalProperties,
                    )
                  }
                  return hashCode
                }

                override fun toString() = "Metrics{start=$start, end=$end, promptTokens=$promptTokens, completionTokens=$completionTokens, tokens=$tokens, additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic
                    fun builder() = Builder()
                }

                class Builder {

                    private var start: JsonField<Double> = JsonMissing.of()
                    private var end: JsonField<Double> = JsonMissing.of()
                    private var promptTokens: JsonField<Long> = JsonMissing.of()
                    private var completionTokens: JsonField<Long> = JsonMissing.of()
                    private var tokens: JsonField<Long> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(metrics: Metrics) = apply {
                        this.start = metrics.start
                        this.end = metrics.end
                        this.promptTokens = metrics.promptTokens
                        this.completionTokens = metrics.completionTokens
                        this.tokens = metrics.tokens
                        additionalProperties(metrics.additionalProperties)
                    }

                    /**
                     * A unix timestamp recording when the section of code which produced the
                     * experiment event started
                     */
                    fun start(start: Double) = start(JsonField.of(start))

                    /**
                     * A unix timestamp recording when the section of code which produced the
                     * experiment event started
                     */
                    @JsonProperty("start")
                    @ExcludeMissing
                    fun start(start: JsonField<Double>) = apply {
                        this.start = start
                    }

                    /**
                     * A unix timestamp recording when the section of code which produced the
                     * experiment event finished
                     */
                    fun end(end: Double) = end(JsonField.of(end))

                    /**
                     * A unix timestamp recording when the section of code which produced the
                     * experiment event finished
                     */
                    @JsonProperty("end")
                    @ExcludeMissing
                    fun end(end: JsonField<Double>) = apply {
                        this.end = end
                    }

                    /**
                     * The number of tokens in the prompt used to generate the experiment event (only
                     * set if this is an LLM span)
                     */
                    fun promptTokens(promptTokens: Long) = promptTokens(JsonField.of(promptTokens))

                    /**
                     * The number of tokens in the prompt used to generate the experiment event (only
                     * set if this is an LLM span)
                     */
                    @JsonProperty("prompt_tokens")
                    @ExcludeMissing
                    fun promptTokens(promptTokens: JsonField<Long>) = apply {
                        this.promptTokens = promptTokens
                    }

                    /**
                     * The number of tokens in the completion generated by the model (only set if this
                     * is an LLM span)
                     */
                    fun completionTokens(completionTokens: Long) = completionTokens(JsonField.of(completionTokens))

                    /**
                     * The number of tokens in the completion generated by the model (only set if this
                     * is an LLM span)
                     */
                    @JsonProperty("completion_tokens")
                    @ExcludeMissing
                    fun completionTokens(completionTokens: JsonField<Long>) = apply {
                        this.completionTokens = completionTokens
                    }

                    /** The total number of tokens in the input and output of the experiment event. */
                    fun tokens(tokens: Long) = tokens(JsonField.of(tokens))

                    /** The total number of tokens in the input and output of the experiment event. */
                    @JsonProperty("tokens")
                    @ExcludeMissing
                    fun tokens(tokens: JsonField<Long>) = apply {
                        this.tokens = tokens
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

                    fun build(): Metrics = Metrics(
                        start,
                        end,
                        promptTokens,
                        completionTokens,
                        tokens,
                        additionalProperties.toUnmodifiable(),
                    )
                }
            }

            /**
             * A dictionary of numeric values (between 0 and 1) to log. The scores should give
             * you a variety of signals that help you determine how accurate the outputs are
             * compared to what you expect and diagnose failures. For example, a summarization
             * app might have one score that tells you how accurate the summary is, and another
             * that measures the word similarity between the generated and grouth truth
             * summary. The word similarity score could help you determine whether the
             * summarization was covering similar concepts or not. You can use these scores to
             * help you sort, filter, and compare experiments
             */
            @JsonDeserialize(builder = Scores.Builder::class)
            @NoAutoDetect
            class Scores private constructor(private val additionalProperties: Map<String, JsonValue>, ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): Scores = apply {
                    if (!validated) {
                      validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                  if (this === other) {
                      return true
                  }

                  return other is Scores &&
                      this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                  if (hashCode == 0) {
                    hashCode = Objects.hash(additionalProperties)
                  }
                  return hashCode
                }

                override fun toString() = "Scores{additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic
                    fun builder() = Builder()
                }

                class Builder {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(scores: Scores) = apply {
                        additionalProperties(scores.additionalProperties)
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

                    fun build(): Scores = Scores(additionalProperties.toUnmodifiable())
                }
            }

            /** Human-identifying attributes of the span, such as name, type, etc. */
            @JsonDeserialize(builder = SpanAttributes.Builder::class)
            @NoAutoDetect
            class SpanAttributes private constructor(private val name: JsonField<String>, private val type: JsonField<Type>, private val additionalProperties: Map<String, JsonValue>, ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /** Name of the span, for display purposes only */
                fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

                /** Type of the span, for display purposes only */
                fun type(): Optional<Type> = Optional.ofNullable(type.getNullable("type"))

                /** Name of the span, for display purposes only */
                @JsonProperty("name")
                @ExcludeMissing
                fun _name() = name

                /** Type of the span, for display purposes only */
                @JsonProperty("type")
                @ExcludeMissing
                fun _type() = type

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): SpanAttributes = apply {
                    if (!validated) {
                      name()
                      type()
                      validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                  if (this === other) {
                      return true
                  }

                  return other is SpanAttributes &&
                      this.name == other.name &&
                      this.type == other.type &&
                      this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                  if (hashCode == 0) {
                    hashCode = Objects.hash(
                        name,
                        type,
                        additionalProperties,
                    )
                  }
                  return hashCode
                }

                override fun toString() = "SpanAttributes{name=$name, type=$type, additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic
                    fun builder() = Builder()
                }

                class Builder {

                    private var name: JsonField<String> = JsonMissing.of()
                    private var type: JsonField<Type> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(spanAttributes: SpanAttributes) = apply {
                        this.name = spanAttributes.name
                        this.type = spanAttributes.type
                        additionalProperties(spanAttributes.additionalProperties)
                    }

                    /** Name of the span, for display purposes only */
                    fun name(name: String) = name(JsonField.of(name))

                    /** Name of the span, for display purposes only */
                    @JsonProperty("name")
                    @ExcludeMissing
                    fun name(name: JsonField<String>) = apply {
                        this.name = name
                    }

                    /** Type of the span, for display purposes only */
                    fun type(type: Type) = type(JsonField.of(type))

                    /** Type of the span, for display purposes only */
                    @JsonProperty("type")
                    @ExcludeMissing
                    fun type(type: JsonField<Type>) = apply {
                        this.type = type
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

                    fun build(): SpanAttributes = SpanAttributes(
                        name,
                        type,
                        additionalProperties.toUnmodifiable(),
                    )
                }

                class Type @JsonCreator private constructor(private val value: JsonField<String>, ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                      if (this === other) {
                          return true
                      }

                      return other is Type &&
                          this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        @JvmField val LLM = Type(JsonField.of("llm"))

                        @JvmField val SCORE = Type(JsonField.of("score"))

                        @JvmField val FUNCTION = Type(JsonField.of("function"))

                        @JvmField val EVAL = Type(JsonField.of("eval"))

                        @JvmField val TASK = Type(JsonField.of("task"))

                        @JvmField val TOOL = Type(JsonField.of("tool"))

                        @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                    }

                    enum class Known {
                        LLM,
                        SCORE,
                        FUNCTION,
                        EVAL,
                        TASK,
                        TOOL,
                    }

                    enum class Value {
                        LLM,
                        SCORE,
                        FUNCTION,
                        EVAL,
                        TASK,
                        TOOL,
                        _UNKNOWN,
                    }

                    fun value(): Value = when (this) {
                        LLM -> Value.LLM
                        SCORE -> Value.SCORE
                        FUNCTION -> Value.FUNCTION
                        EVAL -> Value.EVAL
                        TASK -> Value.TASK
                        TOOL -> Value.TOOL
                        else -> Value._UNKNOWN
                    }

                    fun known(): Known = when (this) {
                        LLM -> Known.LLM
                        SCORE -> Known.SCORE
                        FUNCTION -> Known.FUNCTION
                        EVAL -> Known.EVAL
                        TASK -> Known.TASK
                        TOOL -> Known.TOOL
                        else -> throw BraintrustInvalidDataException("Unknown Type: $value")
                    }

                    fun asString(): String = _value().asStringOrThrow()
                }
            }
        }
    }
}
