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

class FunctionFeedbackParams constructor(
  private val functionId: String,
  private val feedback: List<Feedback>,
  private val additionalQueryParams: Map<String, List<String>>,
  private val additionalHeaders: Map<String, List<String>>,
  private val additionalBodyProperties: Map<String, JsonValue>,

) {

    fun functionId(): String = functionId

    fun feedback(): List<Feedback> = feedback

    @JvmSynthetic
    internal fun getBody(): FunctionFeedbackBody {
      return FunctionFeedbackBody(feedback, additionalBodyProperties)
    }

    @JvmSynthetic
    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic
    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
      return when (index) {
          0 -> functionId
          else -> ""
      }
    }

    @JsonDeserialize(builder = FunctionFeedbackBody.Builder::class)
    @NoAutoDetect
    class FunctionFeedbackBody internal constructor(private val feedback: List<Feedback>?, private val additionalProperties: Map<String, JsonValue>, ) {

        private var hashCode: Int = 0

        /** A list of function feedback items */
        @JsonProperty("feedback")
        fun feedback(): List<Feedback>? = feedback

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is FunctionFeedbackBody &&
              this.feedback == other.feedback &&
              this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
          if (hashCode == 0) {
            hashCode = Objects.hash(feedback, additionalProperties)
          }
          return hashCode
        }

        override fun toString() = "FunctionFeedbackBody{feedback=$feedback, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic
            fun builder() = Builder()
        }

        class Builder {

            private var feedback: List<Feedback>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(functionFeedbackBody: FunctionFeedbackBody) = apply {
                this.feedback = functionFeedbackBody.feedback
                additionalProperties(functionFeedbackBody.additionalProperties)
            }

            /** A list of function feedback items */
            @JsonProperty("feedback")
            fun feedback(feedback: List<Feedback>) = apply {
                this.feedback = feedback
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

            fun build(): FunctionFeedbackBody = FunctionFeedbackBody(checkNotNull(feedback) {
                "`feedback` is required but was not set"
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

      return other is FunctionFeedbackParams &&
          this.functionId == other.functionId &&
          this.feedback == other.feedback &&
          this.additionalQueryParams == other.additionalQueryParams &&
          this.additionalHeaders == other.additionalHeaders &&
          this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
      return Objects.hash(
          functionId,
          feedback,
          additionalQueryParams,
          additionalHeaders,
          additionalBodyProperties,
      )
    }

    override fun toString() = "FunctionFeedbackParams{functionId=$functionId, feedback=$feedback, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic
        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var functionId: String? = null
        private var feedback: MutableList<Feedback> = mutableListOf()
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(functionFeedbackParams: FunctionFeedbackParams) = apply {
            this.functionId = functionFeedbackParams.functionId
            this.feedback(functionFeedbackParams.feedback)
            additionalQueryParams(functionFeedbackParams.additionalQueryParams)
            additionalHeaders(functionFeedbackParams.additionalHeaders)
            additionalBodyProperties(functionFeedbackParams.additionalBodyProperties)
        }

        /** Function id */
        fun functionId(functionId: String) = apply {
            this.functionId = functionId
        }

        /** A list of function feedback items */
        fun feedback(feedback: List<Feedback>) = apply {
            this.feedback.clear()
            this.feedback.addAll(feedback)
        }

        /** A list of function feedback items */
        fun addFeedback(feedback: Feedback) = apply {
            this.feedback.add(feedback)
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

        fun build(): FunctionFeedbackParams = FunctionFeedbackParams(
            checkNotNull(functionId) {
                "`functionId` is required but was not set"
            },
            checkNotNull(feedback) {
                "`feedback` is required but was not set"
            }.toUnmodifiable(),
            additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            additionalBodyProperties.toUnmodifiable(),
        )
    }

    @JsonDeserialize(builder = Feedback.Builder::class)
    @NoAutoDetect
    class Feedback private constructor(
      private val id: String?,
      private val comment: String?,
      private val metadata: Metadata?,
      private val source: Source?,
      private val additionalProperties: Map<String, JsonValue>,

    ) {

        private var hashCode: Int = 0

        /**
         * The id of the function event to log feedback for. This is the row `id` returned
         * by `POST /v1/function/{function_id}/insert`
         */
        @JsonProperty("id")
        fun id(): String? = id

        /** An optional comment string to log about the function event */
        @JsonProperty("comment")
        fun comment(): String? = comment

        /**
         * A dictionary with additional data about the feedback. If you have a `user_id`,
         * you can log it here and access it in the Braintrust UI.
         */
        @JsonProperty("metadata")
        fun metadata(): Metadata? = metadata

        /** The source of the feedback. Must be one of "external" (default), "app", or "api" */
        @JsonProperty("source")
        fun source(): Source? = source

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is Feedback &&
              this.id == other.id &&
              this.comment == other.comment &&
              this.metadata == other.metadata &&
              this.source == other.source &&
              this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
          if (hashCode == 0) {
            hashCode = Objects.hash(
                id,
                comment,
                metadata,
                source,
                additionalProperties,
            )
          }
          return hashCode
        }

        override fun toString() = "Feedback{id=$id, comment=$comment, metadata=$metadata, source=$source, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic
            fun builder() = Builder()
        }

        class Builder {

            private var id: String? = null
            private var comment: String? = null
            private var metadata: Metadata? = null
            private var source: Source? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(feedback: Feedback) = apply {
                this.id = feedback.id
                this.comment = feedback.comment
                this.metadata = feedback.metadata
                this.source = feedback.source
                additionalProperties(feedback.additionalProperties)
            }

            /**
             * The id of the function event to log feedback for. This is the row `id` returned
             * by `POST /v1/function/{function_id}/insert`
             */
            @JsonProperty("id")
            fun id(id: String) = apply {
                this.id = id
            }

            /** An optional comment string to log about the function event */
            @JsonProperty("comment")
            fun comment(comment: String) = apply {
                this.comment = comment
            }

            /**
             * A dictionary with additional data about the feedback. If you have a `user_id`,
             * you can log it here and access it in the Braintrust UI.
             */
            @JsonProperty("metadata")
            fun metadata(metadata: Metadata) = apply {
                this.metadata = metadata
            }

            /** The source of the feedback. Must be one of "external" (default), "app", or "api" */
            @JsonProperty("source")
            fun source(source: Source) = apply {
                this.source = source
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

            fun build(): Feedback = Feedback(
                checkNotNull(id) {
                    "`id` is required but was not set"
                },
                comment,
                metadata,
                source,
                additionalProperties.toUnmodifiable(),
            )
        }

        /**
         * A dictionary with additional data about the feedback. If you have a `user_id`,
         * you can log it here and access it in the Braintrust UI.
         */
        @JsonDeserialize(builder = Metadata.Builder::class)
        @NoAutoDetect
        class Metadata private constructor(private val additionalProperties: Map<String, JsonValue>, ) {

            private var hashCode: Int = 0

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

        class Source @JsonCreator private constructor(private val value: JsonField<String>, ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue
            fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
              if (this === other) {
                  return true
              }

              return other is Source &&
                  this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val APP = Source(JsonField.of("app"))

                @JvmField val API = Source(JsonField.of("api"))

                @JvmField val EXTERNAL = Source(JsonField.of("external"))

                @JvmStatic fun of(value: String) = Source(JsonField.of(value))
            }

            enum class Known {
                APP,
                API,
                EXTERNAL,
            }

            enum class Value {
                APP,
                API,
                EXTERNAL,
                _UNKNOWN,
            }

            fun value(): Value = when (this) {
                APP -> Value.APP
                API -> Value.API
                EXTERNAL -> Value.EXTERNAL
                else -> Value._UNKNOWN
            }

            fun known(): Known = when (this) {
                APP -> Known.APP
                API -> Known.API
                EXTERNAL -> Known.EXTERNAL
                else -> throw BraintrustInvalidDataException("Unknown Source: $value")
            }

            fun asString(): String = _value().asStringOrThrow()
        }
    }
}
