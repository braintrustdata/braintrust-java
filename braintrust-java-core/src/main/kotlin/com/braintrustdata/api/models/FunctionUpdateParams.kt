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

class FunctionUpdateParams constructor(
  private val functionId: String,
  private val description: String?,
  private val functionData: FunctionData?,
  private val name: String?,
  private val promptData: PromptData?,
  private val tags: List<String>?,
  private val additionalQueryParams: Map<String, List<String>>,
  private val additionalHeaders: Map<String, List<String>>,
  private val additionalBodyProperties: Map<String, JsonValue>,

) {

    fun functionId(): String = functionId

    fun description(): Optional<String> = Optional.ofNullable(description)

    fun functionData(): Optional<FunctionData> = Optional.ofNullable(functionData)

    fun name(): Optional<String> = Optional.ofNullable(name)

    fun promptData(): Optional<PromptData> = Optional.ofNullable(promptData)

    fun tags(): Optional<List<String>> = Optional.ofNullable(tags)

    @JvmSynthetic
    internal fun getBody(): FunctionUpdateBody {
      return FunctionUpdateBody(
          description,
          functionData,
          name,
          promptData,
          tags,
          additionalBodyProperties,
      )
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

    @JsonDeserialize(builder = FunctionUpdateBody.Builder::class)
    @NoAutoDetect
    class FunctionUpdateBody internal constructor(
      private val description: String?,
      private val functionData: FunctionData?,
      private val name: String?,
      private val promptData: PromptData?,
      private val tags: List<String>?,
      private val additionalProperties: Map<String, JsonValue>,

    ) {

        private var hashCode: Int = 0

        /** Textual description of the prompt */
        @JsonProperty("description")
        fun description(): String? = description

        @JsonProperty("function_data")
        fun functionData(): FunctionData? = functionData

        /** Name of the prompt */
        @JsonProperty("name")
        fun name(): String? = name

        /** The prompt, model, and its parameters */
        @JsonProperty("prompt_data")
        fun promptData(): PromptData? = promptData

        /** A list of tags for the prompt */
        @JsonProperty("tags")
        fun tags(): List<String>? = tags

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is FunctionUpdateBody &&
              this.description == other.description &&
              this.functionData == other.functionData &&
              this.name == other.name &&
              this.promptData == other.promptData &&
              this.tags == other.tags &&
              this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
          if (hashCode == 0) {
            hashCode = Objects.hash(
                description,
                functionData,
                name,
                promptData,
                tags,
                additionalProperties,
            )
          }
          return hashCode
        }

        override fun toString() = "FunctionUpdateBody{description=$description, functionData=$functionData, name=$name, promptData=$promptData, tags=$tags, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic
            fun builder() = Builder()
        }

        class Builder {

            private var description: String? = null
            private var functionData: FunctionData? = null
            private var name: String? = null
            private var promptData: PromptData? = null
            private var tags: List<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(functionUpdateBody: FunctionUpdateBody) = apply {
                this.description = functionUpdateBody.description
                this.functionData = functionUpdateBody.functionData
                this.name = functionUpdateBody.name
                this.promptData = functionUpdateBody.promptData
                this.tags = functionUpdateBody.tags
                additionalProperties(functionUpdateBody.additionalProperties)
            }

            /** Textual description of the prompt */
            @JsonProperty("description")
            fun description(description: String) = apply {
                this.description = description
            }

            @JsonProperty("function_data")
            fun functionData(functionData: FunctionData) = apply {
                this.functionData = functionData
            }

            /** Name of the prompt */
            @JsonProperty("name")
            fun name(name: String) = apply {
                this.name = name
            }

            /** The prompt, model, and its parameters */
            @JsonProperty("prompt_data")
            fun promptData(promptData: PromptData) = apply {
                this.promptData = promptData
            }

            /** A list of tags for the prompt */
            @JsonProperty("tags")
            fun tags(tags: List<String>) = apply {
                this.tags = tags
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

            fun build(): FunctionUpdateBody = FunctionUpdateBody(
                description,
                functionData,
                name,
                promptData,
                tags?.toUnmodifiable(),
                additionalProperties.toUnmodifiable(),
            )
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return other is FunctionUpdateParams &&
          this.functionId == other.functionId &&
          this.description == other.description &&
          this.functionData == other.functionData &&
          this.name == other.name &&
          this.promptData == other.promptData &&
          this.tags == other.tags &&
          this.additionalQueryParams == other.additionalQueryParams &&
          this.additionalHeaders == other.additionalHeaders &&
          this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
      return Objects.hash(
          functionId,
          description,
          functionData,
          name,
          promptData,
          tags,
          additionalQueryParams,
          additionalHeaders,
          additionalBodyProperties,
      )
    }

    override fun toString() = "FunctionUpdateParams{functionId=$functionId, description=$description, functionData=$functionData, name=$name, promptData=$promptData, tags=$tags, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic
        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var functionId: String? = null
        private var description: String? = null
        private var functionData: FunctionData? = null
        private var name: String? = null
        private var promptData: PromptData? = null
        private var tags: MutableList<String> = mutableListOf()
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(functionUpdateParams: FunctionUpdateParams) = apply {
            this.functionId = functionUpdateParams.functionId
            this.description = functionUpdateParams.description
            this.functionData = functionUpdateParams.functionData
            this.name = functionUpdateParams.name
            this.promptData = functionUpdateParams.promptData
            this.tags(functionUpdateParams.tags ?: listOf())
            additionalQueryParams(functionUpdateParams.additionalQueryParams)
            additionalHeaders(functionUpdateParams.additionalHeaders)
            additionalBodyProperties(functionUpdateParams.additionalBodyProperties)
        }

        /** Function id */
        fun functionId(functionId: String) = apply {
            this.functionId = functionId
        }

        /** Textual description of the prompt */
        fun description(description: String) = apply {
            this.description = description
        }

        fun functionData(functionData: FunctionData) = apply {
            this.functionData = functionData
        }

        fun functionData(type: FunctionData.Type) = apply {
            this.functionData = FunctionData.ofType(type)
        }

        fun functionData(unionMember1: FunctionData.UnionMember1) = apply {
            this.functionData = FunctionData.ofUnionMember1(unionMember1)
        }

        fun functionData(unionMember2: FunctionData.UnionMember2) = apply {
            this.functionData = FunctionData.ofUnionMember2(unionMember2)
        }

        fun functionData(unionMember3: UnionMember3) = apply {
            this.functionData = FunctionData.ofUnionMember3(unionMember3)
        }

        /** Name of the prompt */
        fun name(name: String) = apply {
            this.name = name
        }

        /** The prompt, model, and its parameters */
        fun promptData(promptData: PromptData) = apply {
            this.promptData = promptData
        }

        /** A list of tags for the prompt */
        fun tags(tags: List<String>) = apply {
            this.tags.clear()
            this.tags.addAll(tags)
        }

        /** A list of tags for the prompt */
        fun addTag(tag: String) = apply {
            this.tags.add(tag)
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

        fun build(): FunctionUpdateParams = FunctionUpdateParams(
            checkNotNull(functionId) {
                "`functionId` is required but was not set"
            },
            description,
            functionData,
            name,
            promptData,
            if(tags.size == 0) null else tags.toUnmodifiable(),
            additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            additionalBodyProperties.toUnmodifiable(),
        )
    }

    @JsonDeserialize(using = FunctionData.Deserializer::class)
    @JsonSerialize(using = FunctionData.Serializer::class)
    class FunctionData private constructor(
      private val type: Type? = null,
      private val unionMember1: UnionMember1? = null,
      private val unionMember2: UnionMember2? = null,
      private val unionMember3: UnionMember3? = null,
      private val _json: JsonValue? = null,

    ) {

        private var validated: Boolean = false

        fun type(): Optional<Type> = Optional.ofNullable(type)
        fun unionMember1(): Optional<UnionMember1> = Optional.ofNullable(unionMember1)
        fun unionMember2(): Optional<UnionMember2> = Optional.ofNullable(unionMember2)
        fun unionMember3(): Optional<UnionMember3> = Optional.ofNullable(unionMember3)

        fun isType(): Boolean = type != null
        fun isUnionMember1(): Boolean = unionMember1 != null
        fun isUnionMember2(): Boolean = unionMember2 != null
        fun isUnionMember3(): Boolean = unionMember3 != null

        fun asType(): Type = type.getOrThrow("type")
        fun asUnionMember1(): UnionMember1 = unionMember1.getOrThrow("unionMember1")
        fun asUnionMember2(): UnionMember2 = unionMember2.getOrThrow("unionMember2")
        fun asUnionMember3(): UnionMember3 = unionMember3.getOrThrow("unionMember3")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T {
          return when {
              type != null -> visitor.visitType(type)
              unionMember1 != null -> visitor.visitUnionMember1(unionMember1)
              unionMember2 != null -> visitor.visitUnionMember2(unionMember2)
              unionMember3 != null -> visitor.visitUnionMember3(unionMember3)
              else -> visitor.unknown(_json)
          }
        }

        fun validate(): FunctionData = apply {
            if (!validated) {
              if (type == null && unionMember1 == null && unionMember2 == null && unionMember3 == null) {
                throw BraintrustInvalidDataException("Unknown FunctionData: $_json")
              }
              type?.validate()
              unionMember1?.validate()
              unionMember2?.validate()
              unionMember3?.validate()
              validated = true
            }
        }

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is FunctionData &&
              this.type == other.type &&
              this.unionMember1 == other.unionMember1 &&
              this.unionMember2 == other.unionMember2 &&
              this.unionMember3 == other.unionMember3
        }

        override fun hashCode(): Int {
          return Objects.hash(
              type,
              unionMember1,
              unionMember2,
              unionMember3,
          )
        }

        override fun toString(): String {
          return when {
              type != null -> "FunctionData{type=$type}"
              unionMember1 != null -> "FunctionData{unionMember1=$unionMember1}"
              unionMember2 != null -> "FunctionData{unionMember2=$unionMember2}"
              unionMember3 != null -> "FunctionData{unionMember3=$unionMember3}"
              _json != null -> "FunctionData{_unknown=$_json}"
              else -> throw IllegalStateException("Invalid FunctionData")
          }
        }

        companion object {

            @JvmStatic
            fun ofType(type: Type) = FunctionData(type = type)

            @JvmStatic
            fun ofUnionMember1(unionMember1: UnionMember1) = FunctionData(unionMember1 = unionMember1)

            @JvmStatic
            fun ofUnionMember2(unionMember2: UnionMember2) = FunctionData(unionMember2 = unionMember2)

            @JvmStatic
            fun ofUnionMember3(unionMember3: UnionMember3) = FunctionData(unionMember3 = unionMember3)
        }

        interface Visitor<out T> {

            fun visitType(type: Type): T

            fun visitUnionMember1(unionMember1: UnionMember1): T

            fun visitUnionMember2(unionMember2: UnionMember2): T

            fun visitUnionMember3(unionMember3: UnionMember3): T

            fun unknown(json: JsonValue?): T {
              throw BraintrustInvalidDataException("Unknown FunctionData: $json")
            }
        }

        class Deserializer : BaseDeserializer<FunctionData>(FunctionData::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): FunctionData {
              val json = JsonValue.fromJsonNode(node)
              tryDeserialize(node, jacksonTypeRef<Type>()){ it.validate() }?.let {
                  return FunctionData(type = it, _json = json)
              }
              tryDeserialize(node, jacksonTypeRef<UnionMember1>()){ it.validate() }?.let {
                  return FunctionData(unionMember1 = it, _json = json)
              }
              tryDeserialize(node, jacksonTypeRef<UnionMember2>()){ it.validate() }?.let {
                  return FunctionData(unionMember2 = it, _json = json)
              }
              tryDeserialize(node, jacksonTypeRef<UnionMember3>()){ it.validate() }?.let {
                  return FunctionData(unionMember3 = it, _json = json)
              }

              return FunctionData(_json = json)
            }
        }

        class Serializer : BaseSerializer<FunctionData>(FunctionData::class) {

            override fun serialize(value: FunctionData, generator: JsonGenerator, provider: SerializerProvider) {
              when {
                  value.type != null -> generator.writeObject(value.type)
                  value.unionMember1 != null -> generator.writeObject(value.unionMember1)
                  value.unionMember2 != null -> generator.writeObject(value.unionMember2)
                  value.unionMember3 != null -> generator.writeObject(value.unionMember3)
                  value._json != null -> generator.writeObject(value._json)
                  else -> throw IllegalStateException("Invalid FunctionData")
              }
            }
        }

        @JsonDeserialize(builder = Type.Builder::class)
        @NoAutoDetect
        class Type private constructor(private val type: JsonField<Type>, private val additionalProperties: Map<String, JsonValue>, ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun type(): Type = type.getRequired("type")

            @JsonProperty("type")
            @ExcludeMissing
            fun _type() = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Type = apply {
                if (!validated) {
                  type()
                  validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
              if (this === other) {
                  return true
              }

              return other is Type &&
                  this.type == other.type &&
                  this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
              if (hashCode == 0) {
                hashCode = Objects.hash(type, additionalProperties)
              }
              return hashCode
            }

            override fun toString() = "Type{type=$type, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic
                fun builder() = Builder()
            }

            class Builder {

                private var type: JsonField<Type> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(type: Type) = apply {
                    this.type = type.type
                    additionalProperties(type.additionalProperties)
                }

                fun type(type: Type) = type(JsonField.of(type))

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

                fun build(): Type = Type(type, additionalProperties.toUnmodifiable())
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

                    @JvmField val PROMPT = Type(JsonField.of("prompt"))

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                enum class Known {
                    PROMPT,
                }

                enum class Value {
                    PROMPT,
                    _UNKNOWN,
                }

                fun value(): Value = when (this) {
                    PROMPT -> Value.PROMPT
                    else -> Value._UNKNOWN
                }

                fun known(): Known = when (this) {
                    PROMPT -> Known.PROMPT
                    else -> throw BraintrustInvalidDataException("Unknown Type: $value")
                }

                fun asString(): String = _value().asStringOrThrow()
            }
        }

        @JsonDeserialize(builder = UnionMember1.Builder::class)
        @NoAutoDetect
        class UnionMember1 private constructor(private val type: JsonField<Type>, private val data: JsonField<Data>, private val additionalProperties: Map<String, JsonValue>, ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun type(): Type = type.getRequired("type")

            fun data(): Data = data.getRequired("data")

            @JsonProperty("type")
            @ExcludeMissing
            fun _type() = type

            @JsonProperty("data")
            @ExcludeMissing
            fun _data() = data

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): UnionMember1 = apply {
                if (!validated) {
                  type()
                  data().validate()
                  validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
              if (this === other) {
                  return true
              }

              return other is UnionMember1 &&
                  this.type == other.type &&
                  this.data == other.data &&
                  this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
              if (hashCode == 0) {
                hashCode = Objects.hash(
                    type,
                    data,
                    additionalProperties,
                )
              }
              return hashCode
            }

            override fun toString() = "UnionMember1{type=$type, data=$data, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic
                fun builder() = Builder()
            }

            class Builder {

                private var type: JsonField<Type> = JsonMissing.of()
                private var data: JsonField<Data> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(unionMember1: UnionMember1) = apply {
                    this.type = unionMember1.type
                    this.data = unionMember1.data
                    additionalProperties(unionMember1.additionalProperties)
                }

                fun type(type: Type) = type(JsonField.of(type))

                @JsonProperty("type")
                @ExcludeMissing
                fun type(type: JsonField<Type>) = apply {
                    this.type = type
                }

                fun data(data: Data) = data(JsonField.of(data))

                @JsonProperty("data")
                @ExcludeMissing
                fun data(data: JsonField<Data>) = apply {
                    this.data = data
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

                fun build(): UnionMember1 = UnionMember1(
                    type,
                    data,
                    additionalProperties.toUnmodifiable(),
                )
            }

            @JsonDeserialize(builder = Data.Builder::class)
            @NoAutoDetect
            class Data private constructor(
              private val runtimeContext: JsonField<RuntimeContext>,
              private val location: JsonField<Location>,
              private val bundleId: JsonField<String>,
              private val additionalProperties: Map<String, JsonValue>,

            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                fun runtimeContext(): RuntimeContext = runtimeContext.getRequired("runtime_context")

                fun location(): Location = location.getRequired("location")

                fun bundleId(): String = bundleId.getRequired("bundle_id")

                @JsonProperty("runtime_context")
                @ExcludeMissing
                fun _runtimeContext() = runtimeContext

                @JsonProperty("location")
                @ExcludeMissing
                fun _location() = location

                @JsonProperty("bundle_id")
                @ExcludeMissing
                fun _bundleId() = bundleId

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): Data = apply {
                    if (!validated) {
                      runtimeContext().validate()
                      location().validate()
                      bundleId()
                      validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                  if (this === other) {
                      return true
                  }

                  return other is Data &&
                      this.runtimeContext == other.runtimeContext &&
                      this.location == other.location &&
                      this.bundleId == other.bundleId &&
                      this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                  if (hashCode == 0) {
                    hashCode = Objects.hash(
                        runtimeContext,
                        location,
                        bundleId,
                        additionalProperties,
                    )
                  }
                  return hashCode
                }

                override fun toString() = "Data{runtimeContext=$runtimeContext, location=$location, bundleId=$bundleId, additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic
                    fun builder() = Builder()
                }

                class Builder {

                    private var runtimeContext: JsonField<RuntimeContext> = JsonMissing.of()
                    private var location: JsonField<Location> = JsonMissing.of()
                    private var bundleId: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(data: Data) = apply {
                        this.runtimeContext = data.runtimeContext
                        this.location = data.location
                        this.bundleId = data.bundleId
                        additionalProperties(data.additionalProperties)
                    }

                    fun runtimeContext(runtimeContext: RuntimeContext) = runtimeContext(JsonField.of(runtimeContext))

                    @JsonProperty("runtime_context")
                    @ExcludeMissing
                    fun runtimeContext(runtimeContext: JsonField<RuntimeContext>) = apply {
                        this.runtimeContext = runtimeContext
                    }

                    fun location(location: Location) = location(JsonField.of(location))

                    @JsonProperty("location")
                    @ExcludeMissing
                    fun location(location: JsonField<Location>) = apply {
                        this.location = location
                    }

                    fun bundleId(bundleId: String) = bundleId(JsonField.of(bundleId))

                    @JsonProperty("bundle_id")
                    @ExcludeMissing
                    fun bundleId(bundleId: JsonField<String>) = apply {
                        this.bundleId = bundleId
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

                    fun build(): Data = Data(
                        runtimeContext,
                        location,
                        bundleId,
                        additionalProperties.toUnmodifiable(),
                    )
                }

                @JsonDeserialize(builder = Location.Builder::class)
                @NoAutoDetect
                class Location private constructor(
                  private val type: JsonField<Type>,
                  private val evalName: JsonField<String>,
                  private val position: JsonField<Position>,
                  private val additionalProperties: Map<String, JsonValue>,

                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    fun type(): Type = type.getRequired("type")

                    fun evalName(): String = evalName.getRequired("eval_name")

                    fun position(): Position = position.getRequired("position")

                    @JsonProperty("type")
                    @ExcludeMissing
                    fun _type() = type

                    @JsonProperty("eval_name")
                    @ExcludeMissing
                    fun _evalName() = evalName

                    @JsonProperty("position")
                    @ExcludeMissing
                    fun _position() = position

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): Location = apply {
                        if (!validated) {
                          type()
                          evalName()
                          position()
                          validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                      if (this === other) {
                          return true
                      }

                      return other is Location &&
                          this.type == other.type &&
                          this.evalName == other.evalName &&
                          this.position == other.position &&
                          this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                      if (hashCode == 0) {
                        hashCode = Objects.hash(
                            type,
                            evalName,
                            position,
                            additionalProperties,
                        )
                      }
                      return hashCode
                    }

                    override fun toString() = "Location{type=$type, evalName=$evalName, position=$position, additionalProperties=$additionalProperties}"

                    companion object {

                        @JvmStatic
                        fun builder() = Builder()
                    }

                    class Builder {

                        private var type: JsonField<Type> = JsonMissing.of()
                        private var evalName: JsonField<String> = JsonMissing.of()
                        private var position: JsonField<Position> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                        @JvmSynthetic
                        internal fun from(location: Location) = apply {
                            this.type = location.type
                            this.evalName = location.evalName
                            this.position = location.position
                            additionalProperties(location.additionalProperties)
                        }

                        fun type(type: Type) = type(JsonField.of(type))

                        @JsonProperty("type")
                        @ExcludeMissing
                        fun type(type: JsonField<Type>) = apply {
                            this.type = type
                        }

                        fun evalName(evalName: String) = evalName(JsonField.of(evalName))

                        @JsonProperty("eval_name")
                        @ExcludeMissing
                        fun evalName(evalName: JsonField<String>) = apply {
                            this.evalName = evalName
                        }

                        fun position(position: Position) = position(JsonField.of(position))

                        @JsonProperty("position")
                        @ExcludeMissing
                        fun position(position: JsonField<Position>) = apply {
                            this.position = position
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

                        fun build(): Location = Location(
                            type,
                            evalName,
                            position,
                            additionalProperties.toUnmodifiable(),
                        )
                    }

                    @JsonDeserialize(using = Position.Deserializer::class)
                    @JsonSerialize(using = Position.Serializer::class)
                    class Position private constructor(private val unionMember0: UnionMember0? = null, private val score: Score? = null, private val _json: JsonValue? = null, ) {

                        private var validated: Boolean = false

                        fun unionMember0(): Optional<UnionMember0> = Optional.ofNullable(unionMember0)
                        fun score(): Optional<Score> = Optional.ofNullable(score)

                        fun isUnionMember0(): Boolean = unionMember0 != null
                        fun isScore(): Boolean = score != null

                        fun asUnionMember0(): UnionMember0 = unionMember0.getOrThrow("unionMember0")
                        fun asScore(): Score = score.getOrThrow("score")

                        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                        fun <T> accept(visitor: Visitor<T>): T {
                          return when {
                              unionMember0 != null -> visitor.visitUnionMember0(unionMember0)
                              score != null -> visitor.visitScore(score)
                              else -> visitor.unknown(_json)
                          }
                        }

                        fun validate(): Position = apply {
                            if (!validated) {
                              if (unionMember0 == null && score == null) {
                                throw BraintrustInvalidDataException("Unknown Position: $_json")
                              }
                              score?.validate()
                              validated = true
                            }
                        }

                        override fun equals(other: Any?): Boolean {
                          if (this === other) {
                              return true
                          }

                          return other is Position &&
                              this.unionMember0 == other.unionMember0 &&
                              this.score == other.score
                        }

                        override fun hashCode(): Int {
                          return Objects.hash(unionMember0, score)
                        }

                        override fun toString(): String {
                          return when {
                              unionMember0 != null -> "Position{unionMember0=$unionMember0}"
                              score != null -> "Position{score=$score}"
                              _json != null -> "Position{_unknown=$_json}"
                              else -> throw IllegalStateException("Invalid Position")
                          }
                        }

                        companion object {

                            @JvmStatic
                            fun ofUnionMember0(unionMember0: UnionMember0) = Position(unionMember0 = unionMember0)

                            @JvmStatic
                            fun ofScore(score: Score) = Position(score = score)
                        }

                        interface Visitor<out T> {

                            fun visitUnionMember0(unionMember0: UnionMember0): T

                            fun visitScore(score: Score): T

                            fun unknown(json: JsonValue?): T {
                              throw BraintrustInvalidDataException("Unknown Position: $json")
                            }
                        }

                        class Deserializer : BaseDeserializer<Position>(Position::class) {

                            override fun ObjectCodec.deserialize(node: JsonNode): Position {
                              val json = JsonValue.fromJsonNode(node)
                              tryDeserialize(node, jacksonTypeRef<UnionMember0>())?.let {
                                  return Position(unionMember0 = it, _json = json)
                              }
                              tryDeserialize(node, jacksonTypeRef<Score>()){ it.validate() }?.let {
                                  return Position(score = it, _json = json)
                              }

                              return Position(_json = json)
                            }
                        }

                        class Serializer : BaseSerializer<Position>(Position::class) {

                            override fun serialize(value: Position, generator: JsonGenerator, provider: SerializerProvider) {
                              when {
                                  value.unionMember0 != null -> generator.writeObject(value.unionMember0)
                                  value.score != null -> generator.writeObject(value.score)
                                  value._json != null -> generator.writeObject(value._json)
                                  else -> throw IllegalStateException("Invalid Position")
                              }
                            }
                        }

                        class UnionMember0 @JsonCreator private constructor(private val value: JsonField<String>, ) : Enum {

                            @com.fasterxml.jackson.annotation.JsonValue
                            fun _value(): JsonField<String> = value

                            override fun equals(other: Any?): Boolean {
                              if (this === other) {
                                  return true
                              }

                              return other is UnionMember0 &&
                                  this.value == other.value
                            }

                            override fun hashCode() = value.hashCode()

                            override fun toString() = value.toString()

                            companion object {

                                @JvmField val TASK = UnionMember0(JsonField.of("task"))

                                @JvmStatic fun of(value: String) = UnionMember0(JsonField.of(value))
                            }

                            enum class Known {
                                TASK,
                            }

                            enum class Value {
                                TASK,
                                _UNKNOWN,
                            }

                            fun value(): Value = when (this) {
                                TASK -> Value.TASK
                                else -> Value._UNKNOWN
                            }

                            fun known(): Known = when (this) {
                                TASK -> Known.TASK
                                else -> throw BraintrustInvalidDataException("Unknown UnionMember0: $value")
                            }

                            fun asString(): String = _value().asStringOrThrow()
                        }

                        @JsonDeserialize(builder = Score.Builder::class)
                        @NoAutoDetect
                        class Score private constructor(private val score: JsonField<Double>, private val additionalProperties: Map<String, JsonValue>, ) {

                            private var validated: Boolean = false

                            private var hashCode: Int = 0

                            fun score(): Double = score.getRequired("score")

                            @JsonProperty("score")
                            @ExcludeMissing
                            fun _score() = score

                            @JsonAnyGetter
                            @ExcludeMissing
                            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                            fun validate(): Score = apply {
                                if (!validated) {
                                  score()
                                  validated = true
                                }
                            }

                            fun toBuilder() = Builder().from(this)

                            override fun equals(other: Any?): Boolean {
                              if (this === other) {
                                  return true
                              }

                              return other is Score &&
                                  this.score == other.score &&
                                  this.additionalProperties == other.additionalProperties
                            }

                            override fun hashCode(): Int {
                              if (hashCode == 0) {
                                hashCode = Objects.hash(score, additionalProperties)
                              }
                              return hashCode
                            }

                            override fun toString() = "Score{score=$score, additionalProperties=$additionalProperties}"

                            companion object {

                                @JvmStatic
                                fun builder() = Builder()
                            }

                            class Builder {

                                private var score: JsonField<Double> = JsonMissing.of()
                                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                                @JvmSynthetic
                                internal fun from(score: Score) = apply {
                                    this.score = score.score
                                    additionalProperties(score.additionalProperties)
                                }

                                fun score(score: Double) = score(JsonField.of(score))

                                @JsonProperty("score")
                                @ExcludeMissing
                                fun score(score: JsonField<Double>) = apply {
                                    this.score = score
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

                                fun build(): Score = Score(score, additionalProperties.toUnmodifiable())
                            }
                        }
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

                            @JvmField val EXPERIMENT = Type(JsonField.of("experiment"))

                            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                        }

                        enum class Known {
                            EXPERIMENT,
                        }

                        enum class Value {
                            EXPERIMENT,
                            _UNKNOWN,
                        }

                        fun value(): Value = when (this) {
                            EXPERIMENT -> Value.EXPERIMENT
                            else -> Value._UNKNOWN
                        }

                        fun known(): Known = when (this) {
                            EXPERIMENT -> Known.EXPERIMENT
                            else -> throw BraintrustInvalidDataException("Unknown Type: $value")
                        }

                        fun asString(): String = _value().asStringOrThrow()
                    }
                }

                @JsonDeserialize(builder = RuntimeContext.Builder::class)
                @NoAutoDetect
                class RuntimeContext private constructor(private val runtime: JsonField<Runtime>, private val version: JsonField<String>, private val additionalProperties: Map<String, JsonValue>, ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    fun runtime(): Runtime = runtime.getRequired("runtime")

                    fun version(): String = version.getRequired("version")

                    @JsonProperty("runtime")
                    @ExcludeMissing
                    fun _runtime() = runtime

                    @JsonProperty("version")
                    @ExcludeMissing
                    fun _version() = version

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): RuntimeContext = apply {
                        if (!validated) {
                          runtime()
                          version()
                          validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                      if (this === other) {
                          return true
                      }

                      return other is RuntimeContext &&
                          this.runtime == other.runtime &&
                          this.version == other.version &&
                          this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                      if (hashCode == 0) {
                        hashCode = Objects.hash(
                            runtime,
                            version,
                            additionalProperties,
                        )
                      }
                      return hashCode
                    }

                    override fun toString() = "RuntimeContext{runtime=$runtime, version=$version, additionalProperties=$additionalProperties}"

                    companion object {

                        @JvmStatic
                        fun builder() = Builder()
                    }

                    class Builder {

                        private var runtime: JsonField<Runtime> = JsonMissing.of()
                        private var version: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                        @JvmSynthetic
                        internal fun from(runtimeContext: RuntimeContext) = apply {
                            this.runtime = runtimeContext.runtime
                            this.version = runtimeContext.version
                            additionalProperties(runtimeContext.additionalProperties)
                        }

                        fun runtime(runtime: Runtime) = runtime(JsonField.of(runtime))

                        @JsonProperty("runtime")
                        @ExcludeMissing
                        fun runtime(runtime: JsonField<Runtime>) = apply {
                            this.runtime = runtime
                        }

                        fun version(version: String) = version(JsonField.of(version))

                        @JsonProperty("version")
                        @ExcludeMissing
                        fun version(version: JsonField<String>) = apply {
                            this.version = version
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

                        fun build(): RuntimeContext = RuntimeContext(
                            runtime,
                            version,
                            additionalProperties.toUnmodifiable(),
                        )
                    }

                    class Runtime @JsonCreator private constructor(private val value: JsonField<String>, ) : Enum {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        override fun equals(other: Any?): Boolean {
                          if (this === other) {
                              return true
                          }

                          return other is Runtime &&
                              this.value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()

                        companion object {

                            @JvmField val NODE = Runtime(JsonField.of("node"))

                            @JvmStatic fun of(value: String) = Runtime(JsonField.of(value))
                        }

                        enum class Known {
                            NODE,
                        }

                        enum class Value {
                            NODE,
                            _UNKNOWN,
                        }

                        fun value(): Value = when (this) {
                            NODE -> Value.NODE
                            else -> Value._UNKNOWN
                        }

                        fun known(): Known = when (this) {
                            NODE -> Known.NODE
                            else -> throw BraintrustInvalidDataException("Unknown Runtime: $value")
                        }

                        fun asString(): String = _value().asStringOrThrow()
                    }
                }
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

                    @JvmField val CODE = Type(JsonField.of("code"))

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                enum class Known {
                    CODE,
                }

                enum class Value {
                    CODE,
                    _UNKNOWN,
                }

                fun value(): Value = when (this) {
                    CODE -> Value.CODE
                    else -> Value._UNKNOWN
                }

                fun known(): Known = when (this) {
                    CODE -> Known.CODE
                    else -> throw BraintrustInvalidDataException("Unknown Type: $value")
                }

                fun asString(): String = _value().asStringOrThrow()
            }
        }

        @JsonDeserialize(builder = UnionMember2.Builder::class)
        @NoAutoDetect
        class UnionMember2 private constructor(private val type: JsonField<Type>, private val name: JsonField<String>, private val additionalProperties: Map<String, JsonValue>, ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun type(): Type = type.getRequired("type")

            fun name(): String = name.getRequired("name")

            @JsonProperty("type")
            @ExcludeMissing
            fun _type() = type

            @JsonProperty("name")
            @ExcludeMissing
            fun _name() = name

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): UnionMember2 = apply {
                if (!validated) {
                  type()
                  name()
                  validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
              if (this === other) {
                  return true
              }

              return other is UnionMember2 &&
                  this.type == other.type &&
                  this.name == other.name &&
                  this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
              if (hashCode == 0) {
                hashCode = Objects.hash(
                    type,
                    name,
                    additionalProperties,
                )
              }
              return hashCode
            }

            override fun toString() = "UnionMember2{type=$type, name=$name, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic
                fun builder() = Builder()
            }

            class Builder {

                private var type: JsonField<Type> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(unionMember2: UnionMember2) = apply {
                    this.type = unionMember2.type
                    this.name = unionMember2.name
                    additionalProperties(unionMember2.additionalProperties)
                }

                fun type(type: Type) = type(JsonField.of(type))

                @JsonProperty("type")
                @ExcludeMissing
                fun type(type: JsonField<Type>) = apply {
                    this.type = type
                }

                fun name(name: String) = name(JsonField.of(name))

                @JsonProperty("name")
                @ExcludeMissing
                fun name(name: JsonField<String>) = apply {
                    this.name = name
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

                fun build(): UnionMember2 = UnionMember2(
                    type,
                    name,
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

                    @JvmField val GLOBAL = Type(JsonField.of("global"))

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                enum class Known {
                    GLOBAL,
                }

                enum class Value {
                    GLOBAL,
                    _UNKNOWN,
                }

                fun value(): Value = when (this) {
                    GLOBAL -> Value.GLOBAL
                    else -> Value._UNKNOWN
                }

                fun known(): Known = when (this) {
                    GLOBAL -> Known.GLOBAL
                    else -> throw BraintrustInvalidDataException("Unknown Type: $value")
                }

                fun asString(): String = _value().asStringOrThrow()
            }
        }

        @JsonDeserialize(builder = UnionMember3.Builder::class)
        @NoAutoDetect
        class UnionMember3 private constructor(private val additionalProperties: Map<String, JsonValue>, ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): UnionMember3 = apply {
                if (!validated) {
                  validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
              if (this === other) {
                  return true
              }

              return other is UnionMember3 &&
                  this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
              if (hashCode == 0) {
                hashCode = Objects.hash(additionalProperties)
              }
              return hashCode
            }

            override fun toString() = "UnionMember3{additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic
                fun builder() = Builder()
            }

            class Builder {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(unionMember3: UnionMember3) = apply {
                    additionalProperties(unionMember3.additionalProperties)
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

                fun build(): UnionMember3 = UnionMember3(additionalProperties.toUnmodifiable())
            }
        }
    }

    /** The prompt, model, and its parameters */
    @JsonDeserialize(builder = PromptData.Builder::class)
    @NoAutoDetect
    class PromptData private constructor(
      private val prompt: Prompt?,
      private val options: Options?,
      private val origin: Origin?,
      private val additionalProperties: Map<String, JsonValue>,

    ) {

        private var hashCode: Int = 0

        @JsonProperty("prompt")
        fun prompt(): Prompt? = prompt

        @JsonProperty("options")
        fun options(): Options? = options

        @JsonProperty("origin")
        fun origin(): Origin? = origin

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is PromptData &&
              this.prompt == other.prompt &&
              this.options == other.options &&
              this.origin == other.origin &&
              this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
          if (hashCode == 0) {
            hashCode = Objects.hash(
                prompt,
                options,
                origin,
                additionalProperties,
            )
          }
          return hashCode
        }

        override fun toString() = "PromptData{prompt=$prompt, options=$options, origin=$origin, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic
            fun builder() = Builder()
        }

        class Builder {

            private var prompt: Prompt? = null
            private var options: Options? = null
            private var origin: Origin? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(promptData: PromptData) = apply {
                this.prompt = promptData.prompt
                this.options = promptData.options
                this.origin = promptData.origin
                additionalProperties(promptData.additionalProperties)
            }

            @JsonProperty("prompt")
            fun prompt(prompt: Prompt) = apply {
                this.prompt = prompt
            }

            @JsonProperty("options")
            fun options(options: Options) = apply {
                this.options = options
            }

            @JsonProperty("origin")
            fun origin(origin: Origin) = apply {
                this.origin = origin
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

            fun build(): PromptData = PromptData(
                prompt,
                options,
                origin,
                additionalProperties.toUnmodifiable(),
            )
        }

        @JsonDeserialize(builder = Options.Builder::class)
        @NoAutoDetect
        class Options private constructor(
          private val model: String?,
          private val params: Params?,
          private val position: String?,
          private val additionalProperties: Map<String, JsonValue>,

        ) {

            private var hashCode: Int = 0

            @JsonProperty("model")
            fun model(): String? = model

            @JsonProperty("params")
            fun params(): Params? = params

            @JsonProperty("position")
            fun position(): String? = position

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
              if (this === other) {
                  return true
              }

              return other is Options &&
                  this.model == other.model &&
                  this.params == other.params &&
                  this.position == other.position &&
                  this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
              if (hashCode == 0) {
                hashCode = Objects.hash(
                    model,
                    params,
                    position,
                    additionalProperties,
                )
              }
              return hashCode
            }

            override fun toString() = "Options{model=$model, params=$params, position=$position, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic
                fun builder() = Builder()
            }

            class Builder {

                private var model: String? = null
                private var params: Params? = null
                private var position: String? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(options: Options) = apply {
                    this.model = options.model
                    this.params = options.params
                    this.position = options.position
                    additionalProperties(options.additionalProperties)
                }

                @JsonProperty("model")
                fun model(model: String) = apply {
                    this.model = model
                }

                @JsonProperty("params")
                fun params(params: Params) = apply {
                    this.params = params
                }

                @JsonProperty("position")
                fun position(position: String) = apply {
                    this.position = position
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

                fun build(): Options = Options(
                    model,
                    params,
                    position,
                    additionalProperties.toUnmodifiable(),
                )
            }

            @JsonDeserialize(using = Params.Deserializer::class)
            @JsonSerialize(using = Params.Serializer::class)
            class Params private constructor(
              private val unionMember0: UnionMember0? = null,
              private val unionMember1: UnionMember1? = null,
              private val unionMember2: UnionMember2? = null,
              private val unionMember3: UnionMember3? = null,
              private val useCache: UseCache? = null,
              private val _json: JsonValue? = null,

            ) {

                private var validated: Boolean = false

                fun unionMember0(): Optional<UnionMember0> = Optional.ofNullable(unionMember0)
                fun unionMember1(): Optional<UnionMember1> = Optional.ofNullable(unionMember1)
                fun unionMember2(): Optional<UnionMember2> = Optional.ofNullable(unionMember2)
                fun unionMember3(): Optional<UnionMember3> = Optional.ofNullable(unionMember3)
                fun useCache(): Optional<UseCache> = Optional.ofNullable(useCache)

                fun isUnionMember0(): Boolean = unionMember0 != null
                fun isUnionMember1(): Boolean = unionMember1 != null
                fun isUnionMember2(): Boolean = unionMember2 != null
                fun isUnionMember3(): Boolean = unionMember3 != null
                fun isUseCache(): Boolean = useCache != null

                fun asUnionMember0(): UnionMember0 = unionMember0.getOrThrow("unionMember0")
                fun asUnionMember1(): UnionMember1 = unionMember1.getOrThrow("unionMember1")
                fun asUnionMember2(): UnionMember2 = unionMember2.getOrThrow("unionMember2")
                fun asUnionMember3(): UnionMember3 = unionMember3.getOrThrow("unionMember3")
                fun asUseCache(): UseCache = useCache.getOrThrow("useCache")

                fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                fun <T> accept(visitor: Visitor<T>): T {
                  return when {
                      unionMember0 != null -> visitor.visitUnionMember0(unionMember0)
                      unionMember1 != null -> visitor.visitUnionMember1(unionMember1)
                      unionMember2 != null -> visitor.visitUnionMember2(unionMember2)
                      unionMember3 != null -> visitor.visitUnionMember3(unionMember3)
                      useCache != null -> visitor.visitUseCache(useCache)
                      else -> visitor.unknown(_json)
                  }
                }

                fun validate(): Params = apply {
                    if (!validated) {
                      if (unionMember0 == null && unionMember1 == null && unionMember2 == null && unionMember3 == null && useCache == null) {
                        throw BraintrustInvalidDataException("Unknown Params: $_json")
                      }
                      unionMember0?.validate()
                      unionMember1?.validate()
                      unionMember2?.validate()
                      unionMember3?.validate()
                      useCache?.validate()
                      validated = true
                    }
                }

                override fun equals(other: Any?): Boolean {
                  if (this === other) {
                      return true
                  }

                  return other is Params &&
                      this.unionMember0 == other.unionMember0 &&
                      this.unionMember1 == other.unionMember1 &&
                      this.unionMember2 == other.unionMember2 &&
                      this.unionMember3 == other.unionMember3 &&
                      this.useCache == other.useCache
                }

                override fun hashCode(): Int {
                  return Objects.hash(
                      unionMember0,
                      unionMember1,
                      unionMember2,
                      unionMember3,
                      useCache,
                  )
                }

                override fun toString(): String {
                  return when {
                      unionMember0 != null -> "Params{unionMember0=$unionMember0}"
                      unionMember1 != null -> "Params{unionMember1=$unionMember1}"
                      unionMember2 != null -> "Params{unionMember2=$unionMember2}"
                      unionMember3 != null -> "Params{unionMember3=$unionMember3}"
                      useCache != null -> "Params{useCache=$useCache}"
                      _json != null -> "Params{_unknown=$_json}"
                      else -> throw IllegalStateException("Invalid Params")
                  }
                }

                companion object {

                    @JvmStatic
                    fun ofUnionMember0(unionMember0: UnionMember0) = Params(unionMember0 = unionMember0)

                    @JvmStatic
                    fun ofUnionMember1(unionMember1: UnionMember1) = Params(unionMember1 = unionMember1)

                    @JvmStatic
                    fun ofUnionMember2(unionMember2: UnionMember2) = Params(unionMember2 = unionMember2)

                    @JvmStatic
                    fun ofUnionMember3(unionMember3: UnionMember3) = Params(unionMember3 = unionMember3)

                    @JvmStatic
                    fun ofUseCache(useCache: UseCache) = Params(useCache = useCache)
                }

                interface Visitor<out T> {

                    fun visitUnionMember0(unionMember0: UnionMember0): T

                    fun visitUnionMember1(unionMember1: UnionMember1): T

                    fun visitUnionMember2(unionMember2: UnionMember2): T

                    fun visitUnionMember3(unionMember3: UnionMember3): T

                    fun visitUseCache(useCache: UseCache): T

                    fun unknown(json: JsonValue?): T {
                      throw BraintrustInvalidDataException("Unknown Params: $json")
                    }
                }

                class Deserializer : BaseDeserializer<Params>(Params::class) {

                    override fun ObjectCodec.deserialize(node: JsonNode): Params {
                      val json = JsonValue.fromJsonNode(node)
                      tryDeserialize(node, jacksonTypeRef<UnionMember0>()){ it.validate() }?.let {
                          return Params(unionMember0 = it, _json = json)
                      }
                      tryDeserialize(node, jacksonTypeRef<UnionMember1>()){ it.validate() }?.let {
                          return Params(unionMember1 = it, _json = json)
                      }
                      tryDeserialize(node, jacksonTypeRef<UnionMember2>()){ it.validate() }?.let {
                          return Params(unionMember2 = it, _json = json)
                      }
                      tryDeserialize(node, jacksonTypeRef<UnionMember3>()){ it.validate() }?.let {
                          return Params(unionMember3 = it, _json = json)
                      }
                      tryDeserialize(node, jacksonTypeRef<UseCache>()){ it.validate() }?.let {
                          return Params(useCache = it, _json = json)
                      }

                      return Params(_json = json)
                    }
                }

                class Serializer : BaseSerializer<Params>(Params::class) {

                    override fun serialize(value: Params, generator: JsonGenerator, provider: SerializerProvider) {
                      when {
                          value.unionMember0 != null -> generator.writeObject(value.unionMember0)
                          value.unionMember1 != null -> generator.writeObject(value.unionMember1)
                          value.unionMember2 != null -> generator.writeObject(value.unionMember2)
                          value.unionMember3 != null -> generator.writeObject(value.unionMember3)
                          value.useCache != null -> generator.writeObject(value.useCache)
                          value._json != null -> generator.writeObject(value._json)
                          else -> throw IllegalStateException("Invalid Params")
                      }
                    }
                }

                @JsonDeserialize(builder = UnionMember0.Builder::class)
                @NoAutoDetect
                class UnionMember0 private constructor(
                  private val useCache: JsonField<Boolean>,
                  private val temperature: JsonField<Double>,
                  private val topP: JsonField<Double>,
                  private val maxTokens: JsonField<Double>,
                  private val frequencyPenalty: JsonField<Double>,
                  private val presencePenalty: JsonField<Double>,
                  private val responseFormat: JsonField<ResponseFormat>,
                  private val toolChoice: JsonField<ToolChoice>,
                  private val functionCall: JsonField<FunctionCall>,
                  private val n: JsonField<Double>,
                  private val stop: JsonField<List<String>>,
                  private val additionalProperties: Map<String, JsonValue>,

                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    fun useCache(): Optional<Boolean> = Optional.ofNullable(useCache.getNullable("use_cache"))

                    fun temperature(): Optional<Double> = Optional.ofNullable(temperature.getNullable("temperature"))

                    fun topP(): Optional<Double> = Optional.ofNullable(topP.getNullable("top_p"))

                    fun maxTokens(): Optional<Double> = Optional.ofNullable(maxTokens.getNullable("max_tokens"))

                    fun frequencyPenalty(): Optional<Double> = Optional.ofNullable(frequencyPenalty.getNullable("frequency_penalty"))

                    fun presencePenalty(): Optional<Double> = Optional.ofNullable(presencePenalty.getNullable("presence_penalty"))

                    fun responseFormat(): Optional<ResponseFormat> = Optional.ofNullable(responseFormat.getNullable("response_format"))

                    fun toolChoice(): Optional<ToolChoice> = Optional.ofNullable(toolChoice.getNullable("tool_choice"))

                    fun functionCall(): Optional<FunctionCall> = Optional.ofNullable(functionCall.getNullable("function_call"))

                    fun n(): Optional<Double> = Optional.ofNullable(n.getNullable("n"))

                    fun stop(): Optional<List<String>> = Optional.ofNullable(stop.getNullable("stop"))

                    @JsonProperty("use_cache")
                    @ExcludeMissing
                    fun _useCache() = useCache

                    @JsonProperty("temperature")
                    @ExcludeMissing
                    fun _temperature() = temperature

                    @JsonProperty("top_p")
                    @ExcludeMissing
                    fun _topP() = topP

                    @JsonProperty("max_tokens")
                    @ExcludeMissing
                    fun _maxTokens() = maxTokens

                    @JsonProperty("frequency_penalty")
                    @ExcludeMissing
                    fun _frequencyPenalty() = frequencyPenalty

                    @JsonProperty("presence_penalty")
                    @ExcludeMissing
                    fun _presencePenalty() = presencePenalty

                    @JsonProperty("response_format")
                    @ExcludeMissing
                    fun _responseFormat() = responseFormat

                    @JsonProperty("tool_choice")
                    @ExcludeMissing
                    fun _toolChoice() = toolChoice

                    @JsonProperty("function_call")
                    @ExcludeMissing
                    fun _functionCall() = functionCall

                    @JsonProperty("n")
                    @ExcludeMissing
                    fun _n() = n

                    @JsonProperty("stop")
                    @ExcludeMissing
                    fun _stop() = stop

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): UnionMember0 = apply {
                        if (!validated) {
                          useCache()
                          temperature()
                          topP()
                          maxTokens()
                          frequencyPenalty()
                          presencePenalty()
                          responseFormat().map { it.validate() }
                          toolChoice()
                          functionCall()
                          n()
                          stop()
                          validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                      if (this === other) {
                          return true
                      }

                      return other is UnionMember0 &&
                          this.useCache == other.useCache &&
                          this.temperature == other.temperature &&
                          this.topP == other.topP &&
                          this.maxTokens == other.maxTokens &&
                          this.frequencyPenalty == other.frequencyPenalty &&
                          this.presencePenalty == other.presencePenalty &&
                          this.responseFormat == other.responseFormat &&
                          this.toolChoice == other.toolChoice &&
                          this.functionCall == other.functionCall &&
                          this.n == other.n &&
                          this.stop == other.stop &&
                          this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                      if (hashCode == 0) {
                        hashCode = Objects.hash(
                            useCache,
                            temperature,
                            topP,
                            maxTokens,
                            frequencyPenalty,
                            presencePenalty,
                            responseFormat,
                            toolChoice,
                            functionCall,
                            n,
                            stop,
                            additionalProperties,
                        )
                      }
                      return hashCode
                    }

                    override fun toString() = "UnionMember0{useCache=$useCache, temperature=$temperature, topP=$topP, maxTokens=$maxTokens, frequencyPenalty=$frequencyPenalty, presencePenalty=$presencePenalty, responseFormat=$responseFormat, toolChoice=$toolChoice, functionCall=$functionCall, n=$n, stop=$stop, additionalProperties=$additionalProperties}"

                    companion object {

                        @JvmStatic
                        fun builder() = Builder()
                    }

                    class Builder {

                        private var useCache: JsonField<Boolean> = JsonMissing.of()
                        private var temperature: JsonField<Double> = JsonMissing.of()
                        private var topP: JsonField<Double> = JsonMissing.of()
                        private var maxTokens: JsonField<Double> = JsonMissing.of()
                        private var frequencyPenalty: JsonField<Double> = JsonMissing.of()
                        private var presencePenalty: JsonField<Double> = JsonMissing.of()
                        private var responseFormat: JsonField<ResponseFormat> = JsonMissing.of()
                        private var toolChoice: JsonField<ToolChoice> = JsonMissing.of()
                        private var functionCall: JsonField<FunctionCall> = JsonMissing.of()
                        private var n: JsonField<Double> = JsonMissing.of()
                        private var stop: JsonField<List<String>> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                        @JvmSynthetic
                        internal fun from(unionMember0: UnionMember0) = apply {
                            this.useCache = unionMember0.useCache
                            this.temperature = unionMember0.temperature
                            this.topP = unionMember0.topP
                            this.maxTokens = unionMember0.maxTokens
                            this.frequencyPenalty = unionMember0.frequencyPenalty
                            this.presencePenalty = unionMember0.presencePenalty
                            this.responseFormat = unionMember0.responseFormat
                            this.toolChoice = unionMember0.toolChoice
                            this.functionCall = unionMember0.functionCall
                            this.n = unionMember0.n
                            this.stop = unionMember0.stop
                            additionalProperties(unionMember0.additionalProperties)
                        }

                        fun useCache(useCache: Boolean) = useCache(JsonField.of(useCache))

                        @JsonProperty("use_cache")
                        @ExcludeMissing
                        fun useCache(useCache: JsonField<Boolean>) = apply {
                            this.useCache = useCache
                        }

                        fun temperature(temperature: Double) = temperature(JsonField.of(temperature))

                        @JsonProperty("temperature")
                        @ExcludeMissing
                        fun temperature(temperature: JsonField<Double>) = apply {
                            this.temperature = temperature
                        }

                        fun topP(topP: Double) = topP(JsonField.of(topP))

                        @JsonProperty("top_p")
                        @ExcludeMissing
                        fun topP(topP: JsonField<Double>) = apply {
                            this.topP = topP
                        }

                        fun maxTokens(maxTokens: Double) = maxTokens(JsonField.of(maxTokens))

                        @JsonProperty("max_tokens")
                        @ExcludeMissing
                        fun maxTokens(maxTokens: JsonField<Double>) = apply {
                            this.maxTokens = maxTokens
                        }

                        fun frequencyPenalty(frequencyPenalty: Double) = frequencyPenalty(JsonField.of(frequencyPenalty))

                        @JsonProperty("frequency_penalty")
                        @ExcludeMissing
                        fun frequencyPenalty(frequencyPenalty: JsonField<Double>) = apply {
                            this.frequencyPenalty = frequencyPenalty
                        }

                        fun presencePenalty(presencePenalty: Double) = presencePenalty(JsonField.of(presencePenalty))

                        @JsonProperty("presence_penalty")
                        @ExcludeMissing
                        fun presencePenalty(presencePenalty: JsonField<Double>) = apply {
                            this.presencePenalty = presencePenalty
                        }

                        fun responseFormat(responseFormat: ResponseFormat) = responseFormat(JsonField.of(responseFormat))

                        @JsonProperty("response_format")
                        @ExcludeMissing
                        fun responseFormat(responseFormat: JsonField<ResponseFormat>) = apply {
                            this.responseFormat = responseFormat
                        }

                        fun toolChoice(toolChoice: ToolChoice) = toolChoice(JsonField.of(toolChoice))

                        @JsonProperty("tool_choice")
                        @ExcludeMissing
                        fun toolChoice(toolChoice: JsonField<ToolChoice>) = apply {
                            this.toolChoice = toolChoice
                        }

                        fun functionCall(functionCall: FunctionCall) = functionCall(JsonField.of(functionCall))

                        @JsonProperty("function_call")
                        @ExcludeMissing
                        fun functionCall(functionCall: JsonField<FunctionCall>) = apply {
                            this.functionCall = functionCall
                        }

                        fun n(n: Double) = n(JsonField.of(n))

                        @JsonProperty("n")
                        @ExcludeMissing
                        fun n(n: JsonField<Double>) = apply {
                            this.n = n
                        }

                        fun stop(stop: List<String>) = stop(JsonField.of(stop))

                        @JsonProperty("stop")
                        @ExcludeMissing
                        fun stop(stop: JsonField<List<String>>) = apply {
                            this.stop = stop
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

                        fun build(): UnionMember0 = UnionMember0(
                            useCache,
                            temperature,
                            topP,
                            maxTokens,
                            frequencyPenalty,
                            presencePenalty,
                            responseFormat,
                            toolChoice,
                            functionCall,
                            n,
                            stop.map { it.toUnmodifiable() },
                            additionalProperties.toUnmodifiable(),
                        )
                    }

                    @JsonDeserialize(using = FunctionCall.Deserializer::class)
                    @JsonSerialize(using = FunctionCall.Serializer::class)
                    class FunctionCall private constructor(
                      private val unionMember0: UnionMember0? = null,
                      private val unionMember1: UnionMember1? = null,
                      private val name: Name? = null,
                      private val _json: JsonValue? = null,

                    ) {

                        private var validated: Boolean = false

                        fun unionMember0(): Optional<UnionMember0> = Optional.ofNullable(unionMember0)
                        fun unionMember1(): Optional<UnionMember1> = Optional.ofNullable(unionMember1)
                        fun name(): Optional<Name> = Optional.ofNullable(name)

                        fun isUnionMember0(): Boolean = unionMember0 != null
                        fun isUnionMember1(): Boolean = unionMember1 != null
                        fun isName(): Boolean = name != null

                        fun asUnionMember0(): UnionMember0 = unionMember0.getOrThrow("unionMember0")
                        fun asUnionMember1(): UnionMember1 = unionMember1.getOrThrow("unionMember1")
                        fun asName(): Name = name.getOrThrow("name")

                        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                        fun <T> accept(visitor: Visitor<T>): T {
                          return when {
                              unionMember0 != null -> visitor.visitUnionMember0(unionMember0)
                              unionMember1 != null -> visitor.visitUnionMember1(unionMember1)
                              name != null -> visitor.visitName(name)
                              else -> visitor.unknown(_json)
                          }
                        }

                        fun validate(): FunctionCall = apply {
                            if (!validated) {
                              if (unionMember0 == null && unionMember1 == null && name == null) {
                                throw BraintrustInvalidDataException("Unknown FunctionCall: $_json")
                              }
                              name?.validate()
                              validated = true
                            }
                        }

                        override fun equals(other: Any?): Boolean {
                          if (this === other) {
                              return true
                          }

                          return other is FunctionCall &&
                              this.unionMember0 == other.unionMember0 &&
                              this.unionMember1 == other.unionMember1 &&
                              this.name == other.name
                        }

                        override fun hashCode(): Int {
                          return Objects.hash(
                              unionMember0,
                              unionMember1,
                              name,
                          )
                        }

                        override fun toString(): String {
                          return when {
                              unionMember0 != null -> "FunctionCall{unionMember0=$unionMember0}"
                              unionMember1 != null -> "FunctionCall{unionMember1=$unionMember1}"
                              name != null -> "FunctionCall{name=$name}"
                              _json != null -> "FunctionCall{_unknown=$_json}"
                              else -> throw IllegalStateException("Invalid FunctionCall")
                          }
                        }

                        companion object {

                            @JvmStatic
                            fun ofUnionMember0(unionMember0: UnionMember0) = FunctionCall(unionMember0 = unionMember0)

                            @JvmStatic
                            fun ofUnionMember1(unionMember1: UnionMember1) = FunctionCall(unionMember1 = unionMember1)

                            @JvmStatic
                            fun ofName(name: Name) = FunctionCall(name = name)
                        }

                        interface Visitor<out T> {

                            fun visitUnionMember0(unionMember0: UnionMember0): T

                            fun visitUnionMember1(unionMember1: UnionMember1): T

                            fun visitName(name: Name): T

                            fun unknown(json: JsonValue?): T {
                              throw BraintrustInvalidDataException("Unknown FunctionCall: $json")
                            }
                        }

                        class Deserializer : BaseDeserializer<FunctionCall>(FunctionCall::class) {

                            override fun ObjectCodec.deserialize(node: JsonNode): FunctionCall {
                              val json = JsonValue.fromJsonNode(node)
                              tryDeserialize(node, jacksonTypeRef<UnionMember0>())?.let {
                                  return FunctionCall(unionMember0 = it, _json = json)
                              }
                              tryDeserialize(node, jacksonTypeRef<UnionMember1>())?.let {
                                  return FunctionCall(unionMember1 = it, _json = json)
                              }
                              tryDeserialize(node, jacksonTypeRef<Name>()){ it.validate() }?.let {
                                  return FunctionCall(name = it, _json = json)
                              }

                              return FunctionCall(_json = json)
                            }
                        }

                        class Serializer : BaseSerializer<FunctionCall>(FunctionCall::class) {

                            override fun serialize(value: FunctionCall, generator: JsonGenerator, provider: SerializerProvider) {
                              when {
                                  value.unionMember0 != null -> generator.writeObject(value.unionMember0)
                                  value.unionMember1 != null -> generator.writeObject(value.unionMember1)
                                  value.name != null -> generator.writeObject(value.name)
                                  value._json != null -> generator.writeObject(value._json)
                                  else -> throw IllegalStateException("Invalid FunctionCall")
                              }
                            }
                        }

                        class UnionMember0 @JsonCreator private constructor(private val value: JsonField<String>, ) : Enum {

                            @com.fasterxml.jackson.annotation.JsonValue
                            fun _value(): JsonField<String> = value

                            override fun equals(other: Any?): Boolean {
                              if (this === other) {
                                  return true
                              }

                              return other is UnionMember0 &&
                                  this.value == other.value
                            }

                            override fun hashCode() = value.hashCode()

                            override fun toString() = value.toString()

                            companion object {

                                @JvmField val AUTO = UnionMember0(JsonField.of("auto"))

                                @JvmStatic fun of(value: String) = UnionMember0(JsonField.of(value))
                            }

                            enum class Known {
                                AUTO,
                            }

                            enum class Value {
                                AUTO,
                                _UNKNOWN,
                            }

                            fun value(): Value = when (this) {
                                AUTO -> Value.AUTO
                                else -> Value._UNKNOWN
                            }

                            fun known(): Known = when (this) {
                                AUTO -> Known.AUTO
                                else -> throw BraintrustInvalidDataException("Unknown UnionMember0: $value")
                            }

                            fun asString(): String = _value().asStringOrThrow()
                        }

                        class UnionMember1 @JsonCreator private constructor(private val value: JsonField<String>, ) : Enum {

                            @com.fasterxml.jackson.annotation.JsonValue
                            fun _value(): JsonField<String> = value

                            override fun equals(other: Any?): Boolean {
                              if (this === other) {
                                  return true
                              }

                              return other is UnionMember1 &&
                                  this.value == other.value
                            }

                            override fun hashCode() = value.hashCode()

                            override fun toString() = value.toString()

                            companion object {

                                @JvmField val NONE = UnionMember1(JsonField.of("none"))

                                @JvmStatic fun of(value: String) = UnionMember1(JsonField.of(value))
                            }

                            enum class Known {
                                NONE,
                            }

                            enum class Value {
                                NONE,
                                _UNKNOWN,
                            }

                            fun value(): Value = when (this) {
                                NONE -> Value.NONE
                                else -> Value._UNKNOWN
                            }

                            fun known(): Known = when (this) {
                                NONE -> Known.NONE
                                else -> throw BraintrustInvalidDataException("Unknown UnionMember1: $value")
                            }

                            fun asString(): String = _value().asStringOrThrow()
                        }

                        @JsonDeserialize(builder = Name.Builder::class)
                        @NoAutoDetect
                        class Name private constructor(private val name: JsonField<String>, private val additionalProperties: Map<String, JsonValue>, ) {

                            private var validated: Boolean = false

                            private var hashCode: Int = 0

                            fun name(): String = name.getRequired("name")

                            @JsonProperty("name")
                            @ExcludeMissing
                            fun _name() = name

                            @JsonAnyGetter
                            @ExcludeMissing
                            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                            fun validate(): Name = apply {
                                if (!validated) {
                                  name()
                                  validated = true
                                }
                            }

                            fun toBuilder() = Builder().from(this)

                            override fun equals(other: Any?): Boolean {
                              if (this === other) {
                                  return true
                              }

                              return other is Name &&
                                  this.name == other.name &&
                                  this.additionalProperties == other.additionalProperties
                            }

                            override fun hashCode(): Int {
                              if (hashCode == 0) {
                                hashCode = Objects.hash(name, additionalProperties)
                              }
                              return hashCode
                            }

                            override fun toString() = "Name{name=$name, additionalProperties=$additionalProperties}"

                            companion object {

                                @JvmStatic
                                fun builder() = Builder()
                            }

                            class Builder {

                                private var name: JsonField<String> = JsonMissing.of()
                                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                                @JvmSynthetic
                                internal fun from(name: Name) = apply {
                                    this.name = name.name
                                    additionalProperties(name.additionalProperties)
                                }

                                fun name(name: String) = name(JsonField.of(name))

                                @JsonProperty("name")
                                @ExcludeMissing
                                fun name(name: JsonField<String>) = apply {
                                    this.name = name
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

                                fun build(): Name = Name(name, additionalProperties.toUnmodifiable())
                            }
                        }
                    }

                    @JsonDeserialize(builder = ResponseFormat.Builder::class)
                    @NoAutoDetect
                    class ResponseFormat private constructor(private val type: JsonField<Type>, private val additionalProperties: Map<String, JsonValue>, ) {

                        private var validated: Boolean = false

                        private var hashCode: Int = 0

                        fun type(): Type = type.getRequired("type")

                        @JsonProperty("type")
                        @ExcludeMissing
                        fun _type() = type

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun validate(): ResponseFormat = apply {
                            if (!validated) {
                              type()
                              validated = true
                            }
                        }

                        fun toBuilder() = Builder().from(this)

                        override fun equals(other: Any?): Boolean {
                          if (this === other) {
                              return true
                          }

                          return other is ResponseFormat &&
                              this.type == other.type &&
                              this.additionalProperties == other.additionalProperties
                        }

                        override fun hashCode(): Int {
                          if (hashCode == 0) {
                            hashCode = Objects.hash(type, additionalProperties)
                          }
                          return hashCode
                        }

                        override fun toString() = "ResponseFormat{type=$type, additionalProperties=$additionalProperties}"

                        companion object {

                            @JvmStatic
                            fun builder() = Builder()
                        }

                        class Builder {

                            private var type: JsonField<Type> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                            @JvmSynthetic
                            internal fun from(responseFormat: ResponseFormat) = apply {
                                this.type = responseFormat.type
                                additionalProperties(responseFormat.additionalProperties)
                            }

                            fun type(type: Type) = type(JsonField.of(type))

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

                            fun build(): ResponseFormat = ResponseFormat(type, additionalProperties.toUnmodifiable())
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

                                @JvmField val JSON_OBJECT = Type(JsonField.of("json_object"))

                                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                            }

                            enum class Known {
                                JSON_OBJECT,
                            }

                            enum class Value {
                                JSON_OBJECT,
                                _UNKNOWN,
                            }

                            fun value(): Value = when (this) {
                                JSON_OBJECT -> Value.JSON_OBJECT
                                else -> Value._UNKNOWN
                            }

                            fun known(): Known = when (this) {
                                JSON_OBJECT -> Known.JSON_OBJECT
                                else -> throw BraintrustInvalidDataException("Unknown Type: $value")
                            }

                            fun asString(): String = _value().asStringOrThrow()
                        }
                    }

                    @JsonDeserialize(using = ToolChoice.Deserializer::class)
                    @JsonSerialize(using = ToolChoice.Serializer::class)
                    class ToolChoice private constructor(
                      private val unionMember0: UnionMember0? = null,
                      private val unionMember1: UnionMember1? = null,
                      private val unionMember2: UnionMember2? = null,
                      private val _json: JsonValue? = null,

                    ) {

                        private var validated: Boolean = false

                        fun unionMember0(): Optional<UnionMember0> = Optional.ofNullable(unionMember0)
                        fun unionMember1(): Optional<UnionMember1> = Optional.ofNullable(unionMember1)
                        fun unionMember2(): Optional<UnionMember2> = Optional.ofNullable(unionMember2)

                        fun isUnionMember0(): Boolean = unionMember0 != null
                        fun isUnionMember1(): Boolean = unionMember1 != null
                        fun isUnionMember2(): Boolean = unionMember2 != null

                        fun asUnionMember0(): UnionMember0 = unionMember0.getOrThrow("unionMember0")
                        fun asUnionMember1(): UnionMember1 = unionMember1.getOrThrow("unionMember1")
                        fun asUnionMember2(): UnionMember2 = unionMember2.getOrThrow("unionMember2")

                        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                        fun <T> accept(visitor: Visitor<T>): T {
                          return when {
                              unionMember0 != null -> visitor.visitUnionMember0(unionMember0)
                              unionMember1 != null -> visitor.visitUnionMember1(unionMember1)
                              unionMember2 != null -> visitor.visitUnionMember2(unionMember2)
                              else -> visitor.unknown(_json)
                          }
                        }

                        fun validate(): ToolChoice = apply {
                            if (!validated) {
                              if (unionMember0 == null && unionMember1 == null && unionMember2 == null) {
                                throw BraintrustInvalidDataException("Unknown ToolChoice: $_json")
                              }
                              unionMember2?.validate()
                              validated = true
                            }
                        }

                        override fun equals(other: Any?): Boolean {
                          if (this === other) {
                              return true
                          }

                          return other is ToolChoice &&
                              this.unionMember0 == other.unionMember0 &&
                              this.unionMember1 == other.unionMember1 &&
                              this.unionMember2 == other.unionMember2
                        }

                        override fun hashCode(): Int {
                          return Objects.hash(
                              unionMember0,
                              unionMember1,
                              unionMember2,
                          )
                        }

                        override fun toString(): String {
                          return when {
                              unionMember0 != null -> "ToolChoice{unionMember0=$unionMember0}"
                              unionMember1 != null -> "ToolChoice{unionMember1=$unionMember1}"
                              unionMember2 != null -> "ToolChoice{unionMember2=$unionMember2}"
                              _json != null -> "ToolChoice{_unknown=$_json}"
                              else -> throw IllegalStateException("Invalid ToolChoice")
                          }
                        }

                        companion object {

                            @JvmStatic
                            fun ofUnionMember0(unionMember0: UnionMember0) = ToolChoice(unionMember0 = unionMember0)

                            @JvmStatic
                            fun ofUnionMember1(unionMember1: UnionMember1) = ToolChoice(unionMember1 = unionMember1)

                            @JvmStatic
                            fun ofUnionMember2(unionMember2: UnionMember2) = ToolChoice(unionMember2 = unionMember2)
                        }

                        interface Visitor<out T> {

                            fun visitUnionMember0(unionMember0: UnionMember0): T

                            fun visitUnionMember1(unionMember1: UnionMember1): T

                            fun visitUnionMember2(unionMember2: UnionMember2): T

                            fun unknown(json: JsonValue?): T {
                              throw BraintrustInvalidDataException("Unknown ToolChoice: $json")
                            }
                        }

                        class Deserializer : BaseDeserializer<ToolChoice>(ToolChoice::class) {

                            override fun ObjectCodec.deserialize(node: JsonNode): ToolChoice {
                              val json = JsonValue.fromJsonNode(node)
                              tryDeserialize(node, jacksonTypeRef<UnionMember0>())?.let {
                                  return ToolChoice(unionMember0 = it, _json = json)
                              }
                              tryDeserialize(node, jacksonTypeRef<UnionMember1>())?.let {
                                  return ToolChoice(unionMember1 = it, _json = json)
                              }
                              tryDeserialize(node, jacksonTypeRef<UnionMember2>()){ it.validate() }?.let {
                                  return ToolChoice(unionMember2 = it, _json = json)
                              }

                              return ToolChoice(_json = json)
                            }
                        }

                        class Serializer : BaseSerializer<ToolChoice>(ToolChoice::class) {

                            override fun serialize(value: ToolChoice, generator: JsonGenerator, provider: SerializerProvider) {
                              when {
                                  value.unionMember0 != null -> generator.writeObject(value.unionMember0)
                                  value.unionMember1 != null -> generator.writeObject(value.unionMember1)
                                  value.unionMember2 != null -> generator.writeObject(value.unionMember2)
                                  value._json != null -> generator.writeObject(value._json)
                                  else -> throw IllegalStateException("Invalid ToolChoice")
                              }
                            }
                        }

                        class UnionMember0 @JsonCreator private constructor(private val value: JsonField<String>, ) : Enum {

                            @com.fasterxml.jackson.annotation.JsonValue
                            fun _value(): JsonField<String> = value

                            override fun equals(other: Any?): Boolean {
                              if (this === other) {
                                  return true
                              }

                              return other is UnionMember0 &&
                                  this.value == other.value
                            }

                            override fun hashCode() = value.hashCode()

                            override fun toString() = value.toString()

                            companion object {

                                @JvmField val AUTO = UnionMember0(JsonField.of("auto"))

                                @JvmStatic fun of(value: String) = UnionMember0(JsonField.of(value))
                            }

                            enum class Known {
                                AUTO,
                            }

                            enum class Value {
                                AUTO,
                                _UNKNOWN,
                            }

                            fun value(): Value = when (this) {
                                AUTO -> Value.AUTO
                                else -> Value._UNKNOWN
                            }

                            fun known(): Known = when (this) {
                                AUTO -> Known.AUTO
                                else -> throw BraintrustInvalidDataException("Unknown UnionMember0: $value")
                            }

                            fun asString(): String = _value().asStringOrThrow()
                        }

                        class UnionMember1 @JsonCreator private constructor(private val value: JsonField<String>, ) : Enum {

                            @com.fasterxml.jackson.annotation.JsonValue
                            fun _value(): JsonField<String> = value

                            override fun equals(other: Any?): Boolean {
                              if (this === other) {
                                  return true
                              }

                              return other is UnionMember1 &&
                                  this.value == other.value
                            }

                            override fun hashCode() = value.hashCode()

                            override fun toString() = value.toString()

                            companion object {

                                @JvmField val NONE = UnionMember1(JsonField.of("none"))

                                @JvmStatic fun of(value: String) = UnionMember1(JsonField.of(value))
                            }

                            enum class Known {
                                NONE,
                            }

                            enum class Value {
                                NONE,
                                _UNKNOWN,
                            }

                            fun value(): Value = when (this) {
                                NONE -> Value.NONE
                                else -> Value._UNKNOWN
                            }

                            fun known(): Known = when (this) {
                                NONE -> Known.NONE
                                else -> throw BraintrustInvalidDataException("Unknown UnionMember1: $value")
                            }

                            fun asString(): String = _value().asStringOrThrow()
                        }

                        @JsonDeserialize(builder = UnionMember2.Builder::class)
                        @NoAutoDetect
                        class UnionMember2 private constructor(private val type: JsonField<Type>, private val function: JsonField<Function>, private val additionalProperties: Map<String, JsonValue>, ) {

                            private var validated: Boolean = false

                            private var hashCode: Int = 0

                            fun type(): Type = type.getRequired("type")

                            fun function(): Function = function.getRequired("function")

                            @JsonProperty("type")
                            @ExcludeMissing
                            fun _type() = type

                            @JsonProperty("function")
                            @ExcludeMissing
                            fun _function() = function

                            @JsonAnyGetter
                            @ExcludeMissing
                            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                            fun validate(): UnionMember2 = apply {
                                if (!validated) {
                                  type()
                                  function().validate()
                                  validated = true
                                }
                            }

                            fun toBuilder() = Builder().from(this)

                            override fun equals(other: Any?): Boolean {
                              if (this === other) {
                                  return true
                              }

                              return other is UnionMember2 &&
                                  this.type == other.type &&
                                  this.function == other.function &&
                                  this.additionalProperties == other.additionalProperties
                            }

                            override fun hashCode(): Int {
                              if (hashCode == 0) {
                                hashCode = Objects.hash(
                                    type,
                                    function,
                                    additionalProperties,
                                )
                              }
                              return hashCode
                            }

                            override fun toString() = "UnionMember2{type=$type, function=$function, additionalProperties=$additionalProperties}"

                            companion object {

                                @JvmStatic
                                fun builder() = Builder()
                            }

                            class Builder {

                                private var type: JsonField<Type> = JsonMissing.of()
                                private var function: JsonField<Function> = JsonMissing.of()
                                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                                @JvmSynthetic
                                internal fun from(unionMember2: UnionMember2) = apply {
                                    this.type = unionMember2.type
                                    this.function = unionMember2.function
                                    additionalProperties(unionMember2.additionalProperties)
                                }

                                fun type(type: Type) = type(JsonField.of(type))

                                @JsonProperty("type")
                                @ExcludeMissing
                                fun type(type: JsonField<Type>) = apply {
                                    this.type = type
                                }

                                fun function(function: Function) = function(JsonField.of(function))

                                @JsonProperty("function")
                                @ExcludeMissing
                                fun function(function: JsonField<Function>) = apply {
                                    this.function = function
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

                                fun build(): UnionMember2 = UnionMember2(
                                    type,
                                    function,
                                    additionalProperties.toUnmodifiable(),
                                )
                            }

                            @JsonDeserialize(builder = Function.Builder::class)
                            @NoAutoDetect
                            class Function private constructor(private val name: JsonField<String>, private val additionalProperties: Map<String, JsonValue>, ) {

                                private var validated: Boolean = false

                                private var hashCode: Int = 0

                                fun name(): String = name.getRequired("name")

                                @JsonProperty("name")
                                @ExcludeMissing
                                fun _name() = name

                                @JsonAnyGetter
                                @ExcludeMissing
                                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                                fun validate(): Function = apply {
                                    if (!validated) {
                                      name()
                                      validated = true
                                    }
                                }

                                fun toBuilder() = Builder().from(this)

                                override fun equals(other: Any?): Boolean {
                                  if (this === other) {
                                      return true
                                  }

                                  return other is Function &&
                                      this.name == other.name &&
                                      this.additionalProperties == other.additionalProperties
                                }

                                override fun hashCode(): Int {
                                  if (hashCode == 0) {
                                    hashCode = Objects.hash(name, additionalProperties)
                                  }
                                  return hashCode
                                }

                                override fun toString() = "Function{name=$name, additionalProperties=$additionalProperties}"

                                companion object {

                                    @JvmStatic
                                    fun builder() = Builder()
                                }

                                class Builder {

                                    private var name: JsonField<String> = JsonMissing.of()
                                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                                    @JvmSynthetic
                                    internal fun from(function: Function) = apply {
                                        this.name = function.name
                                        additionalProperties(function.additionalProperties)
                                    }

                                    fun name(name: String) = name(JsonField.of(name))

                                    @JsonProperty("name")
                                    @ExcludeMissing
                                    fun name(name: JsonField<String>) = apply {
                                        this.name = name
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

                                    fun build(): Function = Function(name, additionalProperties.toUnmodifiable())
                                }
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

                                    @JvmField val FUNCTION = Type(JsonField.of("function"))

                                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                                }

                                enum class Known {
                                    FUNCTION,
                                }

                                enum class Value {
                                    FUNCTION,
                                    _UNKNOWN,
                                }

                                fun value(): Value = when (this) {
                                    FUNCTION -> Value.FUNCTION
                                    else -> Value._UNKNOWN
                                }

                                fun known(): Known = when (this) {
                                    FUNCTION -> Known.FUNCTION
                                    else -> throw BraintrustInvalidDataException("Unknown Type: $value")
                                }

                                fun asString(): String = _value().asStringOrThrow()
                            }
                        }
                    }
                }

                @JsonDeserialize(builder = UnionMember1.Builder::class)
                @NoAutoDetect
                class UnionMember1 private constructor(
                  private val useCache: JsonField<Boolean>,
                  private val maxTokens: JsonField<Double>,
                  private val temperature: JsonField<Double>,
                  private val topP: JsonField<Double>,
                  private val topK: JsonField<Double>,
                  private val stopSequences: JsonField<List<String>>,
                  private val maxTokensToSample: JsonField<Double>,
                  private val additionalProperties: Map<String, JsonValue>,

                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    fun useCache(): Optional<Boolean> = Optional.ofNullable(useCache.getNullable("use_cache"))

                    fun maxTokens(): Double = maxTokens.getRequired("max_tokens")

                    fun temperature(): Double = temperature.getRequired("temperature")

                    fun topP(): Optional<Double> = Optional.ofNullable(topP.getNullable("top_p"))

                    fun topK(): Optional<Double> = Optional.ofNullable(topK.getNullable("top_k"))

                    fun stopSequences(): Optional<List<String>> = Optional.ofNullable(stopSequences.getNullable("stop_sequences"))

                    /** This is a legacy parameter that should not be used. */
                    fun maxTokensToSample(): Optional<Double> = Optional.ofNullable(maxTokensToSample.getNullable("max_tokens_to_sample"))

                    @JsonProperty("use_cache")
                    @ExcludeMissing
                    fun _useCache() = useCache

                    @JsonProperty("max_tokens")
                    @ExcludeMissing
                    fun _maxTokens() = maxTokens

                    @JsonProperty("temperature")
                    @ExcludeMissing
                    fun _temperature() = temperature

                    @JsonProperty("top_p")
                    @ExcludeMissing
                    fun _topP() = topP

                    @JsonProperty("top_k")
                    @ExcludeMissing
                    fun _topK() = topK

                    @JsonProperty("stop_sequences")
                    @ExcludeMissing
                    fun _stopSequences() = stopSequences

                    /** This is a legacy parameter that should not be used. */
                    @JsonProperty("max_tokens_to_sample")
                    @ExcludeMissing
                    fun _maxTokensToSample() = maxTokensToSample

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): UnionMember1 = apply {
                        if (!validated) {
                          useCache()
                          maxTokens()
                          temperature()
                          topP()
                          topK()
                          stopSequences()
                          maxTokensToSample()
                          validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                      if (this === other) {
                          return true
                      }

                      return other is UnionMember1 &&
                          this.useCache == other.useCache &&
                          this.maxTokens == other.maxTokens &&
                          this.temperature == other.temperature &&
                          this.topP == other.topP &&
                          this.topK == other.topK &&
                          this.stopSequences == other.stopSequences &&
                          this.maxTokensToSample == other.maxTokensToSample &&
                          this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                      if (hashCode == 0) {
                        hashCode = Objects.hash(
                            useCache,
                            maxTokens,
                            temperature,
                            topP,
                            topK,
                            stopSequences,
                            maxTokensToSample,
                            additionalProperties,
                        )
                      }
                      return hashCode
                    }

                    override fun toString() = "UnionMember1{useCache=$useCache, maxTokens=$maxTokens, temperature=$temperature, topP=$topP, topK=$topK, stopSequences=$stopSequences, maxTokensToSample=$maxTokensToSample, additionalProperties=$additionalProperties}"

                    companion object {

                        @JvmStatic
                        fun builder() = Builder()
                    }

                    class Builder {

                        private var useCache: JsonField<Boolean> = JsonMissing.of()
                        private var maxTokens: JsonField<Double> = JsonMissing.of()
                        private var temperature: JsonField<Double> = JsonMissing.of()
                        private var topP: JsonField<Double> = JsonMissing.of()
                        private var topK: JsonField<Double> = JsonMissing.of()
                        private var stopSequences: JsonField<List<String>> = JsonMissing.of()
                        private var maxTokensToSample: JsonField<Double> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                        @JvmSynthetic
                        internal fun from(unionMember1: UnionMember1) = apply {
                            this.useCache = unionMember1.useCache
                            this.maxTokens = unionMember1.maxTokens
                            this.temperature = unionMember1.temperature
                            this.topP = unionMember1.topP
                            this.topK = unionMember1.topK
                            this.stopSequences = unionMember1.stopSequences
                            this.maxTokensToSample = unionMember1.maxTokensToSample
                            additionalProperties(unionMember1.additionalProperties)
                        }

                        fun useCache(useCache: Boolean) = useCache(JsonField.of(useCache))

                        @JsonProperty("use_cache")
                        @ExcludeMissing
                        fun useCache(useCache: JsonField<Boolean>) = apply {
                            this.useCache = useCache
                        }

                        fun maxTokens(maxTokens: Double) = maxTokens(JsonField.of(maxTokens))

                        @JsonProperty("max_tokens")
                        @ExcludeMissing
                        fun maxTokens(maxTokens: JsonField<Double>) = apply {
                            this.maxTokens = maxTokens
                        }

                        fun temperature(temperature: Double) = temperature(JsonField.of(temperature))

                        @JsonProperty("temperature")
                        @ExcludeMissing
                        fun temperature(temperature: JsonField<Double>) = apply {
                            this.temperature = temperature
                        }

                        fun topP(topP: Double) = topP(JsonField.of(topP))

                        @JsonProperty("top_p")
                        @ExcludeMissing
                        fun topP(topP: JsonField<Double>) = apply {
                            this.topP = topP
                        }

                        fun topK(topK: Double) = topK(JsonField.of(topK))

                        @JsonProperty("top_k")
                        @ExcludeMissing
                        fun topK(topK: JsonField<Double>) = apply {
                            this.topK = topK
                        }

                        fun stopSequences(stopSequences: List<String>) = stopSequences(JsonField.of(stopSequences))

                        @JsonProperty("stop_sequences")
                        @ExcludeMissing
                        fun stopSequences(stopSequences: JsonField<List<String>>) = apply {
                            this.stopSequences = stopSequences
                        }

                        /** This is a legacy parameter that should not be used. */
                        fun maxTokensToSample(maxTokensToSample: Double) = maxTokensToSample(JsonField.of(maxTokensToSample))

                        /** This is a legacy parameter that should not be used. */
                        @JsonProperty("max_tokens_to_sample")
                        @ExcludeMissing
                        fun maxTokensToSample(maxTokensToSample: JsonField<Double>) = apply {
                            this.maxTokensToSample = maxTokensToSample
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

                        fun build(): UnionMember1 = UnionMember1(
                            useCache,
                            maxTokens,
                            temperature,
                            topP,
                            topK,
                            stopSequences.map { it.toUnmodifiable() },
                            maxTokensToSample,
                            additionalProperties.toUnmodifiable(),
                        )
                    }
                }

                @JsonDeserialize(builder = UnionMember2.Builder::class)
                @NoAutoDetect
                class UnionMember2 private constructor(
                  private val useCache: JsonField<Boolean>,
                  private val temperature: JsonField<Double>,
                  private val maxOutputTokens: JsonField<Double>,
                  private val topP: JsonField<Double>,
                  private val topK: JsonField<Double>,
                  private val additionalProperties: Map<String, JsonValue>,

                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    fun useCache(): Optional<Boolean> = Optional.ofNullable(useCache.getNullable("use_cache"))

                    fun temperature(): Optional<Double> = Optional.ofNullable(temperature.getNullable("temperature"))

                    fun maxOutputTokens(): Optional<Double> = Optional.ofNullable(maxOutputTokens.getNullable("maxOutputTokens"))

                    fun topP(): Optional<Double> = Optional.ofNullable(topP.getNullable("topP"))

                    fun topK(): Optional<Double> = Optional.ofNullable(topK.getNullable("topK"))

                    @JsonProperty("use_cache")
                    @ExcludeMissing
                    fun _useCache() = useCache

                    @JsonProperty("temperature")
                    @ExcludeMissing
                    fun _temperature() = temperature

                    @JsonProperty("maxOutputTokens")
                    @ExcludeMissing
                    fun _maxOutputTokens() = maxOutputTokens

                    @JsonProperty("topP")
                    @ExcludeMissing
                    fun _topP() = topP

                    @JsonProperty("topK")
                    @ExcludeMissing
                    fun _topK() = topK

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): UnionMember2 = apply {
                        if (!validated) {
                          useCache()
                          temperature()
                          maxOutputTokens()
                          topP()
                          topK()
                          validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                      if (this === other) {
                          return true
                      }

                      return other is UnionMember2 &&
                          this.useCache == other.useCache &&
                          this.temperature == other.temperature &&
                          this.maxOutputTokens == other.maxOutputTokens &&
                          this.topP == other.topP &&
                          this.topK == other.topK &&
                          this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                      if (hashCode == 0) {
                        hashCode = Objects.hash(
                            useCache,
                            temperature,
                            maxOutputTokens,
                            topP,
                            topK,
                            additionalProperties,
                        )
                      }
                      return hashCode
                    }

                    override fun toString() = "UnionMember2{useCache=$useCache, temperature=$temperature, maxOutputTokens=$maxOutputTokens, topP=$topP, topK=$topK, additionalProperties=$additionalProperties}"

                    companion object {

                        @JvmStatic
                        fun builder() = Builder()
                    }

                    class Builder {

                        private var useCache: JsonField<Boolean> = JsonMissing.of()
                        private var temperature: JsonField<Double> = JsonMissing.of()
                        private var maxOutputTokens: JsonField<Double> = JsonMissing.of()
                        private var topP: JsonField<Double> = JsonMissing.of()
                        private var topK: JsonField<Double> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                        @JvmSynthetic
                        internal fun from(unionMember2: UnionMember2) = apply {
                            this.useCache = unionMember2.useCache
                            this.temperature = unionMember2.temperature
                            this.maxOutputTokens = unionMember2.maxOutputTokens
                            this.topP = unionMember2.topP
                            this.topK = unionMember2.topK
                            additionalProperties(unionMember2.additionalProperties)
                        }

                        fun useCache(useCache: Boolean) = useCache(JsonField.of(useCache))

                        @JsonProperty("use_cache")
                        @ExcludeMissing
                        fun useCache(useCache: JsonField<Boolean>) = apply {
                            this.useCache = useCache
                        }

                        fun temperature(temperature: Double) = temperature(JsonField.of(temperature))

                        @JsonProperty("temperature")
                        @ExcludeMissing
                        fun temperature(temperature: JsonField<Double>) = apply {
                            this.temperature = temperature
                        }

                        fun maxOutputTokens(maxOutputTokens: Double) = maxOutputTokens(JsonField.of(maxOutputTokens))

                        @JsonProperty("maxOutputTokens")
                        @ExcludeMissing
                        fun maxOutputTokens(maxOutputTokens: JsonField<Double>) = apply {
                            this.maxOutputTokens = maxOutputTokens
                        }

                        fun topP(topP: Double) = topP(JsonField.of(topP))

                        @JsonProperty("topP")
                        @ExcludeMissing
                        fun topP(topP: JsonField<Double>) = apply {
                            this.topP = topP
                        }

                        fun topK(topK: Double) = topK(JsonField.of(topK))

                        @JsonProperty("topK")
                        @ExcludeMissing
                        fun topK(topK: JsonField<Double>) = apply {
                            this.topK = topK
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

                        fun build(): UnionMember2 = UnionMember2(
                            useCache,
                            temperature,
                            maxOutputTokens,
                            topP,
                            topK,
                            additionalProperties.toUnmodifiable(),
                        )
                    }
                }

                @JsonDeserialize(builder = UnionMember3.Builder::class)
                @NoAutoDetect
                class UnionMember3 private constructor(
                  private val useCache: JsonField<Boolean>,
                  private val temperature: JsonField<Double>,
                  private val topK: JsonField<Double>,
                  private val additionalProperties: Map<String, JsonValue>,

                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    fun useCache(): Optional<Boolean> = Optional.ofNullable(useCache.getNullable("use_cache"))

                    fun temperature(): Optional<Double> = Optional.ofNullable(temperature.getNullable("temperature"))

                    fun topK(): Optional<Double> = Optional.ofNullable(topK.getNullable("topK"))

                    @JsonProperty("use_cache")
                    @ExcludeMissing
                    fun _useCache() = useCache

                    @JsonProperty("temperature")
                    @ExcludeMissing
                    fun _temperature() = temperature

                    @JsonProperty("topK")
                    @ExcludeMissing
                    fun _topK() = topK

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): UnionMember3 = apply {
                        if (!validated) {
                          useCache()
                          temperature()
                          topK()
                          validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                      if (this === other) {
                          return true
                      }

                      return other is UnionMember3 &&
                          this.useCache == other.useCache &&
                          this.temperature == other.temperature &&
                          this.topK == other.topK &&
                          this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                      if (hashCode == 0) {
                        hashCode = Objects.hash(
                            useCache,
                            temperature,
                            topK,
                            additionalProperties,
                        )
                      }
                      return hashCode
                    }

                    override fun toString() = "UnionMember3{useCache=$useCache, temperature=$temperature, topK=$topK, additionalProperties=$additionalProperties}"

                    companion object {

                        @JvmStatic
                        fun builder() = Builder()
                    }

                    class Builder {

                        private var useCache: JsonField<Boolean> = JsonMissing.of()
                        private var temperature: JsonField<Double> = JsonMissing.of()
                        private var topK: JsonField<Double> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                        @JvmSynthetic
                        internal fun from(unionMember3: UnionMember3) = apply {
                            this.useCache = unionMember3.useCache
                            this.temperature = unionMember3.temperature
                            this.topK = unionMember3.topK
                            additionalProperties(unionMember3.additionalProperties)
                        }

                        fun useCache(useCache: Boolean) = useCache(JsonField.of(useCache))

                        @JsonProperty("use_cache")
                        @ExcludeMissing
                        fun useCache(useCache: JsonField<Boolean>) = apply {
                            this.useCache = useCache
                        }

                        fun temperature(temperature: Double) = temperature(JsonField.of(temperature))

                        @JsonProperty("temperature")
                        @ExcludeMissing
                        fun temperature(temperature: JsonField<Double>) = apply {
                            this.temperature = temperature
                        }

                        fun topK(topK: Double) = topK(JsonField.of(topK))

                        @JsonProperty("topK")
                        @ExcludeMissing
                        fun topK(topK: JsonField<Double>) = apply {
                            this.topK = topK
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

                        fun build(): UnionMember3 = UnionMember3(
                            useCache,
                            temperature,
                            topK,
                            additionalProperties.toUnmodifiable(),
                        )
                    }
                }

                @JsonDeserialize(builder = UseCache.Builder::class)
                @NoAutoDetect
                class UseCache private constructor(private val useCache: JsonField<Boolean>, private val additionalProperties: Map<String, JsonValue>, ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    fun useCache(): Optional<Boolean> = Optional.ofNullable(useCache.getNullable("use_cache"))

                    @JsonProperty("use_cache")
                    @ExcludeMissing
                    fun _useCache() = useCache

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): UseCache = apply {
                        if (!validated) {
                          useCache()
                          validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                      if (this === other) {
                          return true
                      }

                      return other is UseCache &&
                          this.useCache == other.useCache &&
                          this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                      if (hashCode == 0) {
                        hashCode = Objects.hash(useCache, additionalProperties)
                      }
                      return hashCode
                    }

                    override fun toString() = "UseCache{useCache=$useCache, additionalProperties=$additionalProperties}"

                    companion object {

                        @JvmStatic
                        fun builder() = Builder()
                    }

                    class Builder {

                        private var useCache: JsonField<Boolean> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                        @JvmSynthetic
                        internal fun from(useCache: UseCache) = apply {
                            this.useCache = useCache.useCache
                            additionalProperties(useCache.additionalProperties)
                        }

                        fun useCache(useCache: Boolean) = useCache(JsonField.of(useCache))

                        @JsonProperty("use_cache")
                        @ExcludeMissing
                        fun useCache(useCache: JsonField<Boolean>) = apply {
                            this.useCache = useCache
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

                        fun build(): UseCache = UseCache(useCache, additionalProperties.toUnmodifiable())
                    }
                }
            }
        }

        @JsonDeserialize(builder = Origin.Builder::class)
        @NoAutoDetect
        class Origin private constructor(
          private val promptId: String?,
          private val projectId: String?,
          private val promptVersion: String?,
          private val additionalProperties: Map<String, JsonValue>,

        ) {

            private var hashCode: Int = 0

            @JsonProperty("prompt_id")
            fun promptId(): String? = promptId

            @JsonProperty("project_id")
            fun projectId(): String? = projectId

            @JsonProperty("prompt_version")
            fun promptVersion(): String? = promptVersion

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
              if (this === other) {
                  return true
              }

              return other is Origin &&
                  this.promptId == other.promptId &&
                  this.projectId == other.projectId &&
                  this.promptVersion == other.promptVersion &&
                  this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
              if (hashCode == 0) {
                hashCode = Objects.hash(
                    promptId,
                    projectId,
                    promptVersion,
                    additionalProperties,
                )
              }
              return hashCode
            }

            override fun toString() = "Origin{promptId=$promptId, projectId=$projectId, promptVersion=$promptVersion, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic
                fun builder() = Builder()
            }

            class Builder {

                private var promptId: String? = null
                private var projectId: String? = null
                private var promptVersion: String? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(origin: Origin) = apply {
                    this.promptId = origin.promptId
                    this.projectId = origin.projectId
                    this.promptVersion = origin.promptVersion
                    additionalProperties(origin.additionalProperties)
                }

                @JsonProperty("prompt_id")
                fun promptId(promptId: String) = apply {
                    this.promptId = promptId
                }

                @JsonProperty("project_id")
                fun projectId(projectId: String) = apply {
                    this.projectId = projectId
                }

                @JsonProperty("prompt_version")
                fun promptVersion(promptVersion: String) = apply {
                    this.promptVersion = promptVersion
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

                fun build(): Origin = Origin(
                    promptId,
                    projectId,
                    promptVersion,
                    additionalProperties.toUnmodifiable(),
                )
            }
        }

        @JsonDeserialize(using = Prompt.Deserializer::class)
        @JsonSerialize(using = Prompt.Serializer::class)
        class Prompt private constructor(
          private val unionMember0: UnionMember0? = null,
          private val unionMember1: UnionMember1? = null,
          private val unionMember2: UnionMember2? = null,
          private val _json: JsonValue? = null,

        ) {

            private var validated: Boolean = false

            fun unionMember0(): Optional<UnionMember0> = Optional.ofNullable(unionMember0)
            fun unionMember1(): Optional<UnionMember1> = Optional.ofNullable(unionMember1)
            fun unionMember2(): Optional<UnionMember2> = Optional.ofNullable(unionMember2)

            fun isUnionMember0(): Boolean = unionMember0 != null
            fun isUnionMember1(): Boolean = unionMember1 != null
            fun isUnionMember2(): Boolean = unionMember2 != null

            fun asUnionMember0(): UnionMember0 = unionMember0.getOrThrow("unionMember0")
            fun asUnionMember1(): UnionMember1 = unionMember1.getOrThrow("unionMember1")
            fun asUnionMember2(): UnionMember2 = unionMember2.getOrThrow("unionMember2")

            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

            fun <T> accept(visitor: Visitor<T>): T {
              return when {
                  unionMember0 != null -> visitor.visitUnionMember0(unionMember0)
                  unionMember1 != null -> visitor.visitUnionMember1(unionMember1)
                  unionMember2 != null -> visitor.visitUnionMember2(unionMember2)
                  else -> visitor.unknown(_json)
              }
            }

            fun validate(): Prompt = apply {
                if (!validated) {
                  if (unionMember0 == null && unionMember1 == null && unionMember2 == null) {
                    throw BraintrustInvalidDataException("Unknown Prompt: $_json")
                  }
                  unionMember0?.validate()
                  unionMember1?.validate()
                  unionMember2?.validate()
                  validated = true
                }
            }

            override fun equals(other: Any?): Boolean {
              if (this === other) {
                  return true
              }

              return other is Prompt &&
                  this.unionMember0 == other.unionMember0 &&
                  this.unionMember1 == other.unionMember1 &&
                  this.unionMember2 == other.unionMember2
            }

            override fun hashCode(): Int {
              return Objects.hash(
                  unionMember0,
                  unionMember1,
                  unionMember2,
              )
            }

            override fun toString(): String {
              return when {
                  unionMember0 != null -> "Prompt{unionMember0=$unionMember0}"
                  unionMember1 != null -> "Prompt{unionMember1=$unionMember1}"
                  unionMember2 != null -> "Prompt{unionMember2=$unionMember2}"
                  _json != null -> "Prompt{_unknown=$_json}"
                  else -> throw IllegalStateException("Invalid Prompt")
              }
            }

            companion object {

                @JvmStatic
                fun ofUnionMember0(unionMember0: UnionMember0) = Prompt(unionMember0 = unionMember0)

                @JvmStatic
                fun ofUnionMember1(unionMember1: UnionMember1) = Prompt(unionMember1 = unionMember1)

                @JvmStatic
                fun ofUnionMember2(unionMember2: UnionMember2) = Prompt(unionMember2 = unionMember2)
            }

            interface Visitor<out T> {

                fun visitUnionMember0(unionMember0: UnionMember0): T

                fun visitUnionMember1(unionMember1: UnionMember1): T

                fun visitUnionMember2(unionMember2: UnionMember2): T

                fun unknown(json: JsonValue?): T {
                  throw BraintrustInvalidDataException("Unknown Prompt: $json")
                }
            }

            class Deserializer : BaseDeserializer<Prompt>(Prompt::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): Prompt {
                  val json = JsonValue.fromJsonNode(node)
                  tryDeserialize(node, jacksonTypeRef<UnionMember0>()){ it.validate() }?.let {
                      return Prompt(unionMember0 = it, _json = json)
                  }
                  tryDeserialize(node, jacksonTypeRef<UnionMember1>()){ it.validate() }?.let {
                      return Prompt(unionMember1 = it, _json = json)
                  }
                  tryDeserialize(node, jacksonTypeRef<UnionMember2>()){ it.validate() }?.let {
                      return Prompt(unionMember2 = it, _json = json)
                  }

                  return Prompt(_json = json)
                }
            }

            class Serializer : BaseSerializer<Prompt>(Prompt::class) {

                override fun serialize(value: Prompt, generator: JsonGenerator, provider: SerializerProvider) {
                  when {
                      value.unionMember0 != null -> generator.writeObject(value.unionMember0)
                      value.unionMember1 != null -> generator.writeObject(value.unionMember1)
                      value.unionMember2 != null -> generator.writeObject(value.unionMember2)
                      value._json != null -> generator.writeObject(value._json)
                      else -> throw IllegalStateException("Invalid Prompt")
                  }
                }
            }

            @JsonDeserialize(builder = UnionMember0.Builder::class)
            @NoAutoDetect
            class UnionMember0 private constructor(private val type: JsonField<Type>, private val content: JsonField<String>, private val additionalProperties: Map<String, JsonValue>, ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                fun type(): Type = type.getRequired("type")

                fun content(): String = content.getRequired("content")

                @JsonProperty("type")
                @ExcludeMissing
                fun _type() = type

                @JsonProperty("content")
                @ExcludeMissing
                fun _content() = content

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): UnionMember0 = apply {
                    if (!validated) {
                      type()
                      content()
                      validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                  if (this === other) {
                      return true
                  }

                  return other is UnionMember0 &&
                      this.type == other.type &&
                      this.content == other.content &&
                      this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                  if (hashCode == 0) {
                    hashCode = Objects.hash(
                        type,
                        content,
                        additionalProperties,
                    )
                  }
                  return hashCode
                }

                override fun toString() = "UnionMember0{type=$type, content=$content, additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic
                    fun builder() = Builder()
                }

                class Builder {

                    private var type: JsonField<Type> = JsonMissing.of()
                    private var content: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(unionMember0: UnionMember0) = apply {
                        this.type = unionMember0.type
                        this.content = unionMember0.content
                        additionalProperties(unionMember0.additionalProperties)
                    }

                    fun type(type: Type) = type(JsonField.of(type))

                    @JsonProperty("type")
                    @ExcludeMissing
                    fun type(type: JsonField<Type>) = apply {
                        this.type = type
                    }

                    fun content(content: String) = content(JsonField.of(content))

                    @JsonProperty("content")
                    @ExcludeMissing
                    fun content(content: JsonField<String>) = apply {
                        this.content = content
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

                    fun build(): UnionMember0 = UnionMember0(
                        type,
                        content,
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

                        @JvmField val COMPLETION = Type(JsonField.of("completion"))

                        @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                    }

                    enum class Known {
                        COMPLETION,
                    }

                    enum class Value {
                        COMPLETION,
                        _UNKNOWN,
                    }

                    fun value(): Value = when (this) {
                        COMPLETION -> Value.COMPLETION
                        else -> Value._UNKNOWN
                    }

                    fun known(): Known = when (this) {
                        COMPLETION -> Known.COMPLETION
                        else -> throw BraintrustInvalidDataException("Unknown Type: $value")
                    }

                    fun asString(): String = _value().asStringOrThrow()
                }
            }

            @JsonDeserialize(builder = UnionMember1.Builder::class)
            @NoAutoDetect
            class UnionMember1 private constructor(
              private val type: JsonField<Type>,
              private val messages: JsonField<List<Message>>,
              private val tools: JsonField<String>,
              private val additionalProperties: Map<String, JsonValue>,

            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                fun type(): Type = type.getRequired("type")

                fun messages(): List<Message> = messages.getRequired("messages")

                fun tools(): Optional<String> = Optional.ofNullable(tools.getNullable("tools"))

                @JsonProperty("type")
                @ExcludeMissing
                fun _type() = type

                @JsonProperty("messages")
                @ExcludeMissing
                fun _messages() = messages

                @JsonProperty("tools")
                @ExcludeMissing
                fun _tools() = tools

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): UnionMember1 = apply {
                    if (!validated) {
                      type()
                      messages()
                      tools()
                      validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                  if (this === other) {
                      return true
                  }

                  return other is UnionMember1 &&
                      this.type == other.type &&
                      this.messages == other.messages &&
                      this.tools == other.tools &&
                      this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                  if (hashCode == 0) {
                    hashCode = Objects.hash(
                        type,
                        messages,
                        tools,
                        additionalProperties,
                    )
                  }
                  return hashCode
                }

                override fun toString() = "UnionMember1{type=$type, messages=$messages, tools=$tools, additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic
                    fun builder() = Builder()
                }

                class Builder {

                    private var type: JsonField<Type> = JsonMissing.of()
                    private var messages: JsonField<List<Message>> = JsonMissing.of()
                    private var tools: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(unionMember1: UnionMember1) = apply {
                        this.type = unionMember1.type
                        this.messages = unionMember1.messages
                        this.tools = unionMember1.tools
                        additionalProperties(unionMember1.additionalProperties)
                    }

                    fun type(type: Type) = type(JsonField.of(type))

                    @JsonProperty("type")
                    @ExcludeMissing
                    fun type(type: JsonField<Type>) = apply {
                        this.type = type
                    }

                    fun messages(messages: List<Message>) = messages(JsonField.of(messages))

                    @JsonProperty("messages")
                    @ExcludeMissing
                    fun messages(messages: JsonField<List<Message>>) = apply {
                        this.messages = messages
                    }

                    fun tools(tools: String) = tools(JsonField.of(tools))

                    @JsonProperty("tools")
                    @ExcludeMissing
                    fun tools(tools: JsonField<String>) = apply {
                        this.tools = tools
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

                    fun build(): UnionMember1 = UnionMember1(
                        type,
                        messages.map { it.toUnmodifiable() },
                        tools,
                        additionalProperties.toUnmodifiable(),
                    )
                }

                @JsonDeserialize(using = Message.Deserializer::class)
                @JsonSerialize(using = Message.Serializer::class)
                class Message private constructor(
                  private val unionMember0: UnionMember0? = null,
                  private val unionMember1: UnionMember1? = null,
                  private val unionMember2: UnionMember2? = null,
                  private val unionMember3: UnionMember3? = null,
                  private val unionMember4: UnionMember4? = null,
                  private val unionMember5: UnionMember5? = null,
                  private val _json: JsonValue? = null,

                ) {

                    private var validated: Boolean = false

                    fun unionMember0(): Optional<UnionMember0> = Optional.ofNullable(unionMember0)
                    fun unionMember1(): Optional<UnionMember1> = Optional.ofNullable(unionMember1)
                    fun unionMember2(): Optional<UnionMember2> = Optional.ofNullable(unionMember2)
                    fun unionMember3(): Optional<UnionMember3> = Optional.ofNullable(unionMember3)
                    fun unionMember4(): Optional<UnionMember4> = Optional.ofNullable(unionMember4)
                    fun unionMember5(): Optional<UnionMember5> = Optional.ofNullable(unionMember5)

                    fun isUnionMember0(): Boolean = unionMember0 != null
                    fun isUnionMember1(): Boolean = unionMember1 != null
                    fun isUnionMember2(): Boolean = unionMember2 != null
                    fun isUnionMember3(): Boolean = unionMember3 != null
                    fun isUnionMember4(): Boolean = unionMember4 != null
                    fun isUnionMember5(): Boolean = unionMember5 != null

                    fun asUnionMember0(): UnionMember0 = unionMember0.getOrThrow("unionMember0")
                    fun asUnionMember1(): UnionMember1 = unionMember1.getOrThrow("unionMember1")
                    fun asUnionMember2(): UnionMember2 = unionMember2.getOrThrow("unionMember2")
                    fun asUnionMember3(): UnionMember3 = unionMember3.getOrThrow("unionMember3")
                    fun asUnionMember4(): UnionMember4 = unionMember4.getOrThrow("unionMember4")
                    fun asUnionMember5(): UnionMember5 = unionMember5.getOrThrow("unionMember5")

                    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                    fun <T> accept(visitor: Visitor<T>): T {
                      return when {
                          unionMember0 != null -> visitor.visitUnionMember0(unionMember0)
                          unionMember1 != null -> visitor.visitUnionMember1(unionMember1)
                          unionMember2 != null -> visitor.visitUnionMember2(unionMember2)
                          unionMember3 != null -> visitor.visitUnionMember3(unionMember3)
                          unionMember4 != null -> visitor.visitUnionMember4(unionMember4)
                          unionMember5 != null -> visitor.visitUnionMember5(unionMember5)
                          else -> visitor.unknown(_json)
                      }
                    }

                    fun validate(): Message = apply {
                        if (!validated) {
                          if (unionMember0 == null && unionMember1 == null && unionMember2 == null && unionMember3 == null && unionMember4 == null && unionMember5 == null) {
                            throw BraintrustInvalidDataException("Unknown Message: $_json")
                          }
                          unionMember0?.validate()
                          unionMember1?.validate()
                          unionMember2?.validate()
                          unionMember3?.validate()
                          unionMember4?.validate()
                          unionMember5?.validate()
                          validated = true
                        }
                    }

                    override fun equals(other: Any?): Boolean {
                      if (this === other) {
                          return true
                      }

                      return other is Message &&
                          this.unionMember0 == other.unionMember0 &&
                          this.unionMember1 == other.unionMember1 &&
                          this.unionMember2 == other.unionMember2 &&
                          this.unionMember3 == other.unionMember3 &&
                          this.unionMember4 == other.unionMember4 &&
                          this.unionMember5 == other.unionMember5
                    }

                    override fun hashCode(): Int {
                      return Objects.hash(
                          unionMember0,
                          unionMember1,
                          unionMember2,
                          unionMember3,
                          unionMember4,
                          unionMember5,
                      )
                    }

                    override fun toString(): String {
                      return when {
                          unionMember0 != null -> "Message{unionMember0=$unionMember0}"
                          unionMember1 != null -> "Message{unionMember1=$unionMember1}"
                          unionMember2 != null -> "Message{unionMember2=$unionMember2}"
                          unionMember3 != null -> "Message{unionMember3=$unionMember3}"
                          unionMember4 != null -> "Message{unionMember4=$unionMember4}"
                          unionMember5 != null -> "Message{unionMember5=$unionMember5}"
                          _json != null -> "Message{_unknown=$_json}"
                          else -> throw IllegalStateException("Invalid Message")
                      }
                    }

                    companion object {

                        @JvmStatic
                        fun ofUnionMember0(unionMember0: UnionMember0) = Message(unionMember0 = unionMember0)

                        @JvmStatic
                        fun ofUnionMember1(unionMember1: UnionMember1) = Message(unionMember1 = unionMember1)

                        @JvmStatic
                        fun ofUnionMember2(unionMember2: UnionMember2) = Message(unionMember2 = unionMember2)

                        @JvmStatic
                        fun ofUnionMember3(unionMember3: UnionMember3) = Message(unionMember3 = unionMember3)

                        @JvmStatic
                        fun ofUnionMember4(unionMember4: UnionMember4) = Message(unionMember4 = unionMember4)

                        @JvmStatic
                        fun ofUnionMember5(unionMember5: UnionMember5) = Message(unionMember5 = unionMember5)
                    }

                    interface Visitor<out T> {

                        fun visitUnionMember0(unionMember0: UnionMember0): T

                        fun visitUnionMember1(unionMember1: UnionMember1): T

                        fun visitUnionMember2(unionMember2: UnionMember2): T

                        fun visitUnionMember3(unionMember3: UnionMember3): T

                        fun visitUnionMember4(unionMember4: UnionMember4): T

                        fun visitUnionMember5(unionMember5: UnionMember5): T

                        fun unknown(json: JsonValue?): T {
                          throw BraintrustInvalidDataException("Unknown Message: $json")
                        }
                    }

                    class Deserializer : BaseDeserializer<Message>(Message::class) {

                        override fun ObjectCodec.deserialize(node: JsonNode): Message {
                          val json = JsonValue.fromJsonNode(node)
                          tryDeserialize(node, jacksonTypeRef<UnionMember0>()){ it.validate() }?.let {
                              return Message(unionMember0 = it, _json = json)
                          }
                          tryDeserialize(node, jacksonTypeRef<UnionMember1>()){ it.validate() }?.let {
                              return Message(unionMember1 = it, _json = json)
                          }
                          tryDeserialize(node, jacksonTypeRef<UnionMember2>()){ it.validate() }?.let {
                              return Message(unionMember2 = it, _json = json)
                          }
                          tryDeserialize(node, jacksonTypeRef<UnionMember3>()){ it.validate() }?.let {
                              return Message(unionMember3 = it, _json = json)
                          }
                          tryDeserialize(node, jacksonTypeRef<UnionMember4>()){ it.validate() }?.let {
                              return Message(unionMember4 = it, _json = json)
                          }
                          tryDeserialize(node, jacksonTypeRef<UnionMember5>()){ it.validate() }?.let {
                              return Message(unionMember5 = it, _json = json)
                          }

                          return Message(_json = json)
                        }
                    }

                    class Serializer : BaseSerializer<Message>(Message::class) {

                        override fun serialize(value: Message, generator: JsonGenerator, provider: SerializerProvider) {
                          when {
                              value.unionMember0 != null -> generator.writeObject(value.unionMember0)
                              value.unionMember1 != null -> generator.writeObject(value.unionMember1)
                              value.unionMember2 != null -> generator.writeObject(value.unionMember2)
                              value.unionMember3 != null -> generator.writeObject(value.unionMember3)
                              value.unionMember4 != null -> generator.writeObject(value.unionMember4)
                              value.unionMember5 != null -> generator.writeObject(value.unionMember5)
                              value._json != null -> generator.writeObject(value._json)
                              else -> throw IllegalStateException("Invalid Message")
                          }
                        }
                    }

                    @JsonDeserialize(builder = UnionMember0.Builder::class)
                    @NoAutoDetect
                    class UnionMember0 private constructor(
                      private val content: JsonField<String>,
                      private val role: JsonField<Role>,
                      private val name: JsonField<String>,
                      private val additionalProperties: Map<String, JsonValue>,

                    ) {

                        private var validated: Boolean = false

                        private var hashCode: Int = 0

                        fun content(): Optional<String> = Optional.ofNullable(content.getNullable("content"))

                        fun role(): Role = role.getRequired("role")

                        fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

                        @JsonProperty("content")
                        @ExcludeMissing
                        fun _content() = content

                        @JsonProperty("role")
                        @ExcludeMissing
                        fun _role() = role

                        @JsonProperty("name")
                        @ExcludeMissing
                        fun _name() = name

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun validate(): UnionMember0 = apply {
                            if (!validated) {
                              content()
                              role()
                              name()
                              validated = true
                            }
                        }

                        fun toBuilder() = Builder().from(this)

                        override fun equals(other: Any?): Boolean {
                          if (this === other) {
                              return true
                          }

                          return other is UnionMember0 &&
                              this.content == other.content &&
                              this.role == other.role &&
                              this.name == other.name &&
                              this.additionalProperties == other.additionalProperties
                        }

                        override fun hashCode(): Int {
                          if (hashCode == 0) {
                            hashCode = Objects.hash(
                                content,
                                role,
                                name,
                                additionalProperties,
                            )
                          }
                          return hashCode
                        }

                        override fun toString() = "UnionMember0{content=$content, role=$role, name=$name, additionalProperties=$additionalProperties}"

                        companion object {

                            @JvmStatic
                            fun builder() = Builder()
                        }

                        class Builder {

                            private var content: JsonField<String> = JsonMissing.of()
                            private var role: JsonField<Role> = JsonMissing.of()
                            private var name: JsonField<String> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                            @JvmSynthetic
                            internal fun from(unionMember0: UnionMember0) = apply {
                                this.content = unionMember0.content
                                this.role = unionMember0.role
                                this.name = unionMember0.name
                                additionalProperties(unionMember0.additionalProperties)
                            }

                            fun content(content: String) = content(JsonField.of(content))

                            @JsonProperty("content")
                            @ExcludeMissing
                            fun content(content: JsonField<String>) = apply {
                                this.content = content
                            }

                            fun role(role: Role) = role(JsonField.of(role))

                            @JsonProperty("role")
                            @ExcludeMissing
                            fun role(role: JsonField<Role>) = apply {
                                this.role = role
                            }

                            fun name(name: String) = name(JsonField.of(name))

                            @JsonProperty("name")
                            @ExcludeMissing
                            fun name(name: JsonField<String>) = apply {
                                this.name = name
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

                            fun build(): UnionMember0 = UnionMember0(
                                content,
                                role,
                                name,
                                additionalProperties.toUnmodifiable(),
                            )
                        }

                        class Role @JsonCreator private constructor(private val value: JsonField<String>, ) : Enum {

                            @com.fasterxml.jackson.annotation.JsonValue
                            fun _value(): JsonField<String> = value

                            override fun equals(other: Any?): Boolean {
                              if (this === other) {
                                  return true
                              }

                              return other is Role &&
                                  this.value == other.value
                            }

                            override fun hashCode() = value.hashCode()

                            override fun toString() = value.toString()

                            companion object {

                                @JvmField val SYSTEM = Role(JsonField.of("system"))

                                @JvmStatic fun of(value: String) = Role(JsonField.of(value))
                            }

                            enum class Known {
                                SYSTEM,
                            }

                            enum class Value {
                                SYSTEM,
                                _UNKNOWN,
                            }

                            fun value(): Value = when (this) {
                                SYSTEM -> Value.SYSTEM
                                else -> Value._UNKNOWN
                            }

                            fun known(): Known = when (this) {
                                SYSTEM -> Known.SYSTEM
                                else -> throw BraintrustInvalidDataException("Unknown Role: $value")
                            }

                            fun asString(): String = _value().asStringOrThrow()
                        }
                    }

                    @JsonDeserialize(builder = UnionMember1.Builder::class)
                    @NoAutoDetect
                    class UnionMember1 private constructor(
                      private val content: JsonField<Content>,
                      private val role: JsonField<Role>,
                      private val name: JsonField<String>,
                      private val additionalProperties: Map<String, JsonValue>,

                    ) {

                        private var validated: Boolean = false

                        private var hashCode: Int = 0

                        fun content(): Optional<Content> = Optional.ofNullable(content.getNullable("content"))

                        fun role(): Role = role.getRequired("role")

                        fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

                        @JsonProperty("content")
                        @ExcludeMissing
                        fun _content() = content

                        @JsonProperty("role")
                        @ExcludeMissing
                        fun _role() = role

                        @JsonProperty("name")
                        @ExcludeMissing
                        fun _name() = name

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun validate(): UnionMember1 = apply {
                            if (!validated) {
                              content()
                              role()
                              name()
                              validated = true
                            }
                        }

                        fun toBuilder() = Builder().from(this)

                        override fun equals(other: Any?): Boolean {
                          if (this === other) {
                              return true
                          }

                          return other is UnionMember1 &&
                              this.content == other.content &&
                              this.role == other.role &&
                              this.name == other.name &&
                              this.additionalProperties == other.additionalProperties
                        }

                        override fun hashCode(): Int {
                          if (hashCode == 0) {
                            hashCode = Objects.hash(
                                content,
                                role,
                                name,
                                additionalProperties,
                            )
                          }
                          return hashCode
                        }

                        override fun toString() = "UnionMember1{content=$content, role=$role, name=$name, additionalProperties=$additionalProperties}"

                        companion object {

                            @JvmStatic
                            fun builder() = Builder()
                        }

                        class Builder {

                            private var content: JsonField<Content> = JsonMissing.of()
                            private var role: JsonField<Role> = JsonMissing.of()
                            private var name: JsonField<String> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                            @JvmSynthetic
                            internal fun from(unionMember1: UnionMember1) = apply {
                                this.content = unionMember1.content
                                this.role = unionMember1.role
                                this.name = unionMember1.name
                                additionalProperties(unionMember1.additionalProperties)
                            }

                            fun content(content: Content) = content(JsonField.of(content))

                            @JsonProperty("content")
                            @ExcludeMissing
                            fun content(content: JsonField<Content>) = apply {
                                this.content = content
                            }

                            fun role(role: Role) = role(JsonField.of(role))

                            @JsonProperty("role")
                            @ExcludeMissing
                            fun role(role: JsonField<Role>) = apply {
                                this.role = role
                            }

                            fun name(name: String) = name(JsonField.of(name))

                            @JsonProperty("name")
                            @ExcludeMissing
                            fun name(name: JsonField<String>) = apply {
                                this.name = name
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

                            fun build(): UnionMember1 = UnionMember1(
                                content,
                                role,
                                name,
                                additionalProperties.toUnmodifiable(),
                            )
                        }

                        class Role @JsonCreator private constructor(private val value: JsonField<String>, ) : Enum {

                            @com.fasterxml.jackson.annotation.JsonValue
                            fun _value(): JsonField<String> = value

                            override fun equals(other: Any?): Boolean {
                              if (this === other) {
                                  return true
                              }

                              return other is Role &&
                                  this.value == other.value
                            }

                            override fun hashCode() = value.hashCode()

                            override fun toString() = value.toString()

                            companion object {

                                @JvmField val USER = Role(JsonField.of("user"))

                                @JvmStatic fun of(value: String) = Role(JsonField.of(value))
                            }

                            enum class Known {
                                USER,
                            }

                            enum class Value {
                                USER,
                                _UNKNOWN,
                            }

                            fun value(): Value = when (this) {
                                USER -> Value.USER
                                else -> Value._UNKNOWN
                            }

                            fun known(): Known = when (this) {
                                USER -> Known.USER
                                else -> throw BraintrustInvalidDataException("Unknown Role: $value")
                            }

                            fun asString(): String = _value().asStringOrThrow()
                        }

                        @JsonDeserialize(using = Content.Deserializer::class)
                        @JsonSerialize(using = Content.Serializer::class)
                        class Content private constructor(private val string: String? = null, private val unnamedSchemaWithArrayParent4s: List<UnnamedSchemaWithArrayParent4>? = null, private val _json: JsonValue? = null, ) {

                            private var validated: Boolean = false

                            fun string(): Optional<String> = Optional.ofNullable(string)
                            fun unnamedSchemaWithArrayParent4s(): Optional<List<UnnamedSchemaWithArrayParent4>> = Optional.ofNullable(unnamedSchemaWithArrayParent4s)

                            fun isString(): Boolean = string != null
                            fun isUnnamedSchemaWithArrayParent4s(): Boolean = unnamedSchemaWithArrayParent4s != null

                            fun asString(): String = string.getOrThrow("string")
                            fun asUnnamedSchemaWithArrayParent4s(): List<UnnamedSchemaWithArrayParent4> = unnamedSchemaWithArrayParent4s.getOrThrow("unnamedSchemaWithArrayParent4s")

                            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                            fun <T> accept(visitor: Visitor<T>): T {
                              return when {
                                  string != null -> visitor.visitString(string)
                                  unnamedSchemaWithArrayParent4s != null -> visitor.visitUnnamedSchemaWithArrayParent4s(unnamedSchemaWithArrayParent4s)
                                  else -> visitor.unknown(_json)
                              }
                            }

                            fun validate(): Content = apply {
                                if (!validated) {
                                  if (string == null && unnamedSchemaWithArrayParent4s == null) {
                                    throw BraintrustInvalidDataException("Unknown Content: $_json")
                                  }
                                  validated = true
                                }
                            }

                            override fun equals(other: Any?): Boolean {
                              if (this === other) {
                                  return true
                              }

                              return other is Content &&
                                  this.string == other.string &&
                                  this.unnamedSchemaWithArrayParent4s == other.unnamedSchemaWithArrayParent4s
                            }

                            override fun hashCode(): Int {
                              return Objects.hash(string, unnamedSchemaWithArrayParent4s)
                            }

                            override fun toString(): String {
                              return when {
                                  string != null -> "Content{string=$string}"
                                  unnamedSchemaWithArrayParent4s != null -> "Content{unnamedSchemaWithArrayParent4s=$unnamedSchemaWithArrayParent4s}"
                                  _json != null -> "Content{_unknown=$_json}"
                                  else -> throw IllegalStateException("Invalid Content")
                              }
                            }

                            companion object {

                                @JvmStatic
                                fun ofString(string: String) = Content(string = string)

                                @JvmStatic
                                fun ofUnnamedSchemaWithArrayParent4s(unnamedSchemaWithArrayParent4s: List<UnnamedSchemaWithArrayParent4>) = Content(unnamedSchemaWithArrayParent4s = unnamedSchemaWithArrayParent4s)
                            }

                            interface Visitor<out T> {

                                fun visitString(string: String): T

                                fun visitUnnamedSchemaWithArrayParent4s(unnamedSchemaWithArrayParent4s: List<UnnamedSchemaWithArrayParent4>): T

                                fun unknown(json: JsonValue?): T {
                                  throw BraintrustInvalidDataException("Unknown Content: $json")
                                }
                            }

                            class Deserializer : BaseDeserializer<Content>(Content::class) {

                                override fun ObjectCodec.deserialize(node: JsonNode): Content {
                                  val json = JsonValue.fromJsonNode(node)
                                  tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                      return Content(string = it, _json = json)
                                  }
                                  tryDeserialize(node, jacksonTypeRef<List<UnnamedSchemaWithArrayParent4>>())?.let {
                                      return Content(unnamedSchemaWithArrayParent4s = it, _json = json)
                                  }

                                  return Content(_json = json)
                                }
                            }

                            class Serializer : BaseSerializer<Content>(Content::class) {

                                override fun serialize(value: Content, generator: JsonGenerator, provider: SerializerProvider) {
                                  when {
                                      value.string != null -> generator.writeObject(value.string)
                                      value.unnamedSchemaWithArrayParent4s != null -> generator.writeObject(value.unnamedSchemaWithArrayParent4s)
                                      value._json != null -> generator.writeObject(value._json)
                                      else -> throw IllegalStateException("Invalid Content")
                                  }
                                }
                            }

                            @JsonDeserialize(using = UnnamedSchemaWithArrayParent4.Deserializer::class)
                            @JsonSerialize(using = UnnamedSchemaWithArrayParent4.Serializer::class)
                            class UnnamedSchemaWithArrayParent4 private constructor(private val unionMember0: UnionMember0? = null, private val unionMember1: UnionMember1? = null, private val _json: JsonValue? = null, ) {

                                private var validated: Boolean = false

                                fun unionMember0(): Optional<UnionMember0> = Optional.ofNullable(unionMember0)
                                fun unionMember1(): Optional<UnionMember1> = Optional.ofNullable(unionMember1)

                                fun isUnionMember0(): Boolean = unionMember0 != null
                                fun isUnionMember1(): Boolean = unionMember1 != null

                                fun asUnionMember0(): UnionMember0 = unionMember0.getOrThrow("unionMember0")
                                fun asUnionMember1(): UnionMember1 = unionMember1.getOrThrow("unionMember1")

                                fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                                fun <T> accept(visitor: Visitor<T>): T {
                                  return when {
                                      unionMember0 != null -> visitor.visitUnionMember0(unionMember0)
                                      unionMember1 != null -> visitor.visitUnionMember1(unionMember1)
                                      else -> visitor.unknown(_json)
                                  }
                                }

                                fun validate(): UnnamedSchemaWithArrayParent4 = apply {
                                    if (!validated) {
                                      if (unionMember0 == null && unionMember1 == null) {
                                        throw BraintrustInvalidDataException("Unknown UnnamedSchemaWithArrayParent4: $_json")
                                      }
                                      unionMember0?.validate()
                                      unionMember1?.validate()
                                      validated = true
                                    }
                                }

                                override fun equals(other: Any?): Boolean {
                                  if (this === other) {
                                      return true
                                  }

                                  return other is UnnamedSchemaWithArrayParent4 &&
                                      this.unionMember0 == other.unionMember0 &&
                                      this.unionMember1 == other.unionMember1
                                }

                                override fun hashCode(): Int {
                                  return Objects.hash(unionMember0, unionMember1)
                                }

                                override fun toString(): String {
                                  return when {
                                      unionMember0 != null -> "UnnamedSchemaWithArrayParent4{unionMember0=$unionMember0}"
                                      unionMember1 != null -> "UnnamedSchemaWithArrayParent4{unionMember1=$unionMember1}"
                                      _json != null -> "UnnamedSchemaWithArrayParent4{_unknown=$_json}"
                                      else -> throw IllegalStateException("Invalid UnnamedSchemaWithArrayParent4")
                                  }
                                }

                                companion object {

                                    @JvmStatic
                                    fun ofUnionMember0(unionMember0: UnionMember0) = UnnamedSchemaWithArrayParent4(unionMember0 = unionMember0)

                                    @JvmStatic
                                    fun ofUnionMember1(unionMember1: UnionMember1) = UnnamedSchemaWithArrayParent4(unionMember1 = unionMember1)
                                }

                                interface Visitor<out T> {

                                    fun visitUnionMember0(unionMember0: UnionMember0): T

                                    fun visitUnionMember1(unionMember1: UnionMember1): T

                                    fun unknown(json: JsonValue?): T {
                                      throw BraintrustInvalidDataException("Unknown UnnamedSchemaWithArrayParent4: $json")
                                    }
                                }

                                class Deserializer : BaseDeserializer<UnnamedSchemaWithArrayParent4>(UnnamedSchemaWithArrayParent4::class) {

                                    override fun ObjectCodec.deserialize(node: JsonNode): UnnamedSchemaWithArrayParent4 {
                                      val json = JsonValue.fromJsonNode(node)
                                      tryDeserialize(node, jacksonTypeRef<UnionMember0>()){ it.validate() }?.let {
                                          return UnnamedSchemaWithArrayParent4(unionMember0 = it, _json = json)
                                      }
                                      tryDeserialize(node, jacksonTypeRef<UnionMember1>()){ it.validate() }?.let {
                                          return UnnamedSchemaWithArrayParent4(unionMember1 = it, _json = json)
                                      }

                                      return UnnamedSchemaWithArrayParent4(_json = json)
                                    }
                                }

                                class Serializer : BaseSerializer<UnnamedSchemaWithArrayParent4>(UnnamedSchemaWithArrayParent4::class) {

                                    override fun serialize(value: UnnamedSchemaWithArrayParent4, generator: JsonGenerator, provider: SerializerProvider) {
                                      when {
                                          value.unionMember0 != null -> generator.writeObject(value.unionMember0)
                                          value.unionMember1 != null -> generator.writeObject(value.unionMember1)
                                          value._json != null -> generator.writeObject(value._json)
                                          else -> throw IllegalStateException("Invalid UnnamedSchemaWithArrayParent4")
                                      }
                                    }
                                }

                                @JsonDeserialize(builder = UnionMember0.Builder::class)
                                @NoAutoDetect
                                class UnionMember0 private constructor(private val text: JsonField<String>, private val type: JsonField<Type>, private val additionalProperties: Map<String, JsonValue>, ) {

                                    private var validated: Boolean = false

                                    private var hashCode: Int = 0

                                    fun text(): Optional<String> = Optional.ofNullable(text.getNullable("text"))

                                    fun type(): Type = type.getRequired("type")

                                    @JsonProperty("text")
                                    @ExcludeMissing
                                    fun _text() = text

                                    @JsonProperty("type")
                                    @ExcludeMissing
                                    fun _type() = type

                                    @JsonAnyGetter
                                    @ExcludeMissing
                                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                                    fun validate(): UnionMember0 = apply {
                                        if (!validated) {
                                          text()
                                          type()
                                          validated = true
                                        }
                                    }

                                    fun toBuilder() = Builder().from(this)

                                    override fun equals(other: Any?): Boolean {
                                      if (this === other) {
                                          return true
                                      }

                                      return other is UnionMember0 &&
                                          this.text == other.text &&
                                          this.type == other.type &&
                                          this.additionalProperties == other.additionalProperties
                                    }

                                    override fun hashCode(): Int {
                                      if (hashCode == 0) {
                                        hashCode = Objects.hash(
                                            text,
                                            type,
                                            additionalProperties,
                                        )
                                      }
                                      return hashCode
                                    }

                                    override fun toString() = "UnionMember0{text=$text, type=$type, additionalProperties=$additionalProperties}"

                                    companion object {

                                        @JvmStatic
                                        fun builder() = Builder()
                                    }

                                    class Builder {

                                        private var text: JsonField<String> = JsonMissing.of()
                                        private var type: JsonField<Type> = JsonMissing.of()
                                        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                                        @JvmSynthetic
                                        internal fun from(unionMember0: UnionMember0) = apply {
                                            this.text = unionMember0.text
                                            this.type = unionMember0.type
                                            additionalProperties(unionMember0.additionalProperties)
                                        }

                                        fun text(text: String) = text(JsonField.of(text))

                                        @JsonProperty("text")
                                        @ExcludeMissing
                                        fun text(text: JsonField<String>) = apply {
                                            this.text = text
                                        }

                                        fun type(type: Type) = type(JsonField.of(type))

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

                                        fun build(): UnionMember0 = UnionMember0(
                                            text,
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

                                            @JvmField val TEXT = Type(JsonField.of("text"))

                                            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                                        }

                                        enum class Known {
                                            TEXT,
                                        }

                                        enum class Value {
                                            TEXT,
                                            _UNKNOWN,
                                        }

                                        fun value(): Value = when (this) {
                                            TEXT -> Value.TEXT
                                            else -> Value._UNKNOWN
                                        }

                                        fun known(): Known = when (this) {
                                            TEXT -> Known.TEXT
                                            else -> throw BraintrustInvalidDataException("Unknown Type: $value")
                                        }

                                        fun asString(): String = _value().asStringOrThrow()
                                    }
                                }

                                @JsonDeserialize(builder = UnionMember1.Builder::class)
                                @NoAutoDetect
                                class UnionMember1 private constructor(private val imageUrl: JsonField<ImageUrl>, private val type: JsonField<Type>, private val additionalProperties: Map<String, JsonValue>, ) {

                                    private var validated: Boolean = false

                                    private var hashCode: Int = 0

                                    fun imageUrl(): ImageUrl = imageUrl.getRequired("image_url")

                                    fun type(): Type = type.getRequired("type")

                                    @JsonProperty("image_url")
                                    @ExcludeMissing
                                    fun _imageUrl() = imageUrl

                                    @JsonProperty("type")
                                    @ExcludeMissing
                                    fun _type() = type

                                    @JsonAnyGetter
                                    @ExcludeMissing
                                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                                    fun validate(): UnionMember1 = apply {
                                        if (!validated) {
                                          imageUrl().validate()
                                          type()
                                          validated = true
                                        }
                                    }

                                    fun toBuilder() = Builder().from(this)

                                    override fun equals(other: Any?): Boolean {
                                      if (this === other) {
                                          return true
                                      }

                                      return other is UnionMember1 &&
                                          this.imageUrl == other.imageUrl &&
                                          this.type == other.type &&
                                          this.additionalProperties == other.additionalProperties
                                    }

                                    override fun hashCode(): Int {
                                      if (hashCode == 0) {
                                        hashCode = Objects.hash(
                                            imageUrl,
                                            type,
                                            additionalProperties,
                                        )
                                      }
                                      return hashCode
                                    }

                                    override fun toString() = "UnionMember1{imageUrl=$imageUrl, type=$type, additionalProperties=$additionalProperties}"

                                    companion object {

                                        @JvmStatic
                                        fun builder() = Builder()
                                    }

                                    class Builder {

                                        private var imageUrl: JsonField<ImageUrl> = JsonMissing.of()
                                        private var type: JsonField<Type> = JsonMissing.of()
                                        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                                        @JvmSynthetic
                                        internal fun from(unionMember1: UnionMember1) = apply {
                                            this.imageUrl = unionMember1.imageUrl
                                            this.type = unionMember1.type
                                            additionalProperties(unionMember1.additionalProperties)
                                        }

                                        fun imageUrl(imageUrl: ImageUrl) = imageUrl(JsonField.of(imageUrl))

                                        @JsonProperty("image_url")
                                        @ExcludeMissing
                                        fun imageUrl(imageUrl: JsonField<ImageUrl>) = apply {
                                            this.imageUrl = imageUrl
                                        }

                                        fun type(type: Type) = type(JsonField.of(type))

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

                                        fun build(): UnionMember1 = UnionMember1(
                                            imageUrl,
                                            type,
                                            additionalProperties.toUnmodifiable(),
                                        )
                                    }

                                    @JsonDeserialize(builder = ImageUrl.Builder::class)
                                    @NoAutoDetect
                                    class ImageUrl private constructor(private val url: JsonField<String>, private val detail: JsonField<Detail>, private val additionalProperties: Map<String, JsonValue>, ) {

                                        private var validated: Boolean = false

                                        private var hashCode: Int = 0

                                        fun url(): String = url.getRequired("url")

                                        fun detail(): Optional<Detail> = Optional.ofNullable(detail.getNullable("detail"))

                                        @JsonProperty("url")
                                        @ExcludeMissing
                                        fun _url() = url

                                        @JsonProperty("detail")
                                        @ExcludeMissing
                                        fun _detail() = detail

                                        @JsonAnyGetter
                                        @ExcludeMissing
                                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                                        fun validate(): ImageUrl = apply {
                                            if (!validated) {
                                              url()
                                              detail()
                                              validated = true
                                            }
                                        }

                                        fun toBuilder() = Builder().from(this)

                                        override fun equals(other: Any?): Boolean {
                                          if (this === other) {
                                              return true
                                          }

                                          return other is ImageUrl &&
                                              this.url == other.url &&
                                              this.detail == other.detail &&
                                              this.additionalProperties == other.additionalProperties
                                        }

                                        override fun hashCode(): Int {
                                          if (hashCode == 0) {
                                            hashCode = Objects.hash(
                                                url,
                                                detail,
                                                additionalProperties,
                                            )
                                          }
                                          return hashCode
                                        }

                                        override fun toString() = "ImageUrl{url=$url, detail=$detail, additionalProperties=$additionalProperties}"

                                        companion object {

                                            @JvmStatic
                                            fun builder() = Builder()
                                        }

                                        class Builder {

                                            private var url: JsonField<String> = JsonMissing.of()
                                            private var detail: JsonField<Detail> = JsonMissing.of()
                                            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                                            @JvmSynthetic
                                            internal fun from(imageUrl: ImageUrl) = apply {
                                                this.url = imageUrl.url
                                                this.detail = imageUrl.detail
                                                additionalProperties(imageUrl.additionalProperties)
                                            }

                                            fun url(url: String) = url(JsonField.of(url))

                                            @JsonProperty("url")
                                            @ExcludeMissing
                                            fun url(url: JsonField<String>) = apply {
                                                this.url = url
                                            }

                                            fun detail(detail: Detail) = detail(JsonField.of(detail))

                                            @JsonProperty("detail")
                                            @ExcludeMissing
                                            fun detail(detail: JsonField<Detail>) = apply {
                                                this.detail = detail
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

                                            fun build(): ImageUrl = ImageUrl(
                                                url,
                                                detail,
                                                additionalProperties.toUnmodifiable(),
                                            )
                                        }

                                        class Detail @JsonCreator private constructor(private val value: JsonField<String>, ) : Enum {

                                            @com.fasterxml.jackson.annotation.JsonValue
                                            fun _value(): JsonField<String> = value

                                            override fun equals(other: Any?): Boolean {
                                              if (this === other) {
                                                  return true
                                              }

                                              return other is Detail &&
                                                  this.value == other.value
                                            }

                                            override fun hashCode() = value.hashCode()

                                            override fun toString() = value.toString()

                                            companion object {

                                                @JvmField val AUTO = Detail(JsonField.of("auto"))

                                                @JvmField val LOW = Detail(JsonField.of("low"))

                                                @JvmField val HIGH = Detail(JsonField.of("high"))

                                                @JvmStatic fun of(value: String) = Detail(JsonField.of(value))
                                            }

                                            enum class Known {
                                                AUTO,
                                                LOW,
                                                HIGH,
                                            }

                                            enum class Value {
                                                AUTO,
                                                LOW,
                                                HIGH,
                                                _UNKNOWN,
                                            }

                                            fun value(): Value = when (this) {
                                                AUTO -> Value.AUTO
                                                LOW -> Value.LOW
                                                HIGH -> Value.HIGH
                                                else -> Value._UNKNOWN
                                            }

                                            fun known(): Known = when (this) {
                                                AUTO -> Known.AUTO
                                                LOW -> Known.LOW
                                                HIGH -> Known.HIGH
                                                else -> throw BraintrustInvalidDataException("Unknown Detail: $value")
                                            }

                                            fun asString(): String = _value().asStringOrThrow()
                                        }
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

                                            @JvmField val IMAGE_URL = Type(JsonField.of("image_url"))

                                            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                                        }

                                        enum class Known {
                                            IMAGE_URL,
                                        }

                                        enum class Value {
                                            IMAGE_URL,
                                            _UNKNOWN,
                                        }

                                        fun value(): Value = when (this) {
                                            IMAGE_URL -> Value.IMAGE_URL
                                            else -> Value._UNKNOWN
                                        }

                                        fun known(): Known = when (this) {
                                            IMAGE_URL -> Known.IMAGE_URL
                                            else -> throw BraintrustInvalidDataException("Unknown Type: $value")
                                        }

                                        fun asString(): String = _value().asStringOrThrow()
                                    }
                                }
                            }
                        }
                    }

                    @JsonDeserialize(builder = UnionMember2.Builder::class)
                    @NoAutoDetect
                    class UnionMember2 private constructor(
                      private val role: JsonField<Role>,
                      private val content: JsonField<String>,
                      private val functionCall: JsonField<FunctionCall>,
                      private val name: JsonField<String>,
                      private val toolCalls: JsonField<List<ToolCall>>,
                      private val additionalProperties: Map<String, JsonValue>,

                    ) {

                        private var validated: Boolean = false

                        private var hashCode: Int = 0

                        fun role(): Role = role.getRequired("role")

                        fun content(): Optional<String> = Optional.ofNullable(content.getNullable("content"))

                        fun functionCall(): Optional<FunctionCall> = Optional.ofNullable(functionCall.getNullable("function_call"))

                        fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

                        fun toolCalls(): Optional<List<ToolCall>> = Optional.ofNullable(toolCalls.getNullable("tool_calls"))

                        @JsonProperty("role")
                        @ExcludeMissing
                        fun _role() = role

                        @JsonProperty("content")
                        @ExcludeMissing
                        fun _content() = content

                        @JsonProperty("function_call")
                        @ExcludeMissing
                        fun _functionCall() = functionCall

                        @JsonProperty("name")
                        @ExcludeMissing
                        fun _name() = name

                        @JsonProperty("tool_calls")
                        @ExcludeMissing
                        fun _toolCalls() = toolCalls

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun validate(): UnionMember2 = apply {
                            if (!validated) {
                              role()
                              content()
                              functionCall().map { it.validate() }
                              name()
                              toolCalls().map { it.forEach { it.validate() } }
                              validated = true
                            }
                        }

                        fun toBuilder() = Builder().from(this)

                        override fun equals(other: Any?): Boolean {
                          if (this === other) {
                              return true
                          }

                          return other is UnionMember2 &&
                              this.role == other.role &&
                              this.content == other.content &&
                              this.functionCall == other.functionCall &&
                              this.name == other.name &&
                              this.toolCalls == other.toolCalls &&
                              this.additionalProperties == other.additionalProperties
                        }

                        override fun hashCode(): Int {
                          if (hashCode == 0) {
                            hashCode = Objects.hash(
                                role,
                                content,
                                functionCall,
                                name,
                                toolCalls,
                                additionalProperties,
                            )
                          }
                          return hashCode
                        }

                        override fun toString() = "UnionMember2{role=$role, content=$content, functionCall=$functionCall, name=$name, toolCalls=$toolCalls, additionalProperties=$additionalProperties}"

                        companion object {

                            @JvmStatic
                            fun builder() = Builder()
                        }

                        class Builder {

                            private var role: JsonField<Role> = JsonMissing.of()
                            private var content: JsonField<String> = JsonMissing.of()
                            private var functionCall: JsonField<FunctionCall> = JsonMissing.of()
                            private var name: JsonField<String> = JsonMissing.of()
                            private var toolCalls: JsonField<List<ToolCall>> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                            @JvmSynthetic
                            internal fun from(unionMember2: UnionMember2) = apply {
                                this.role = unionMember2.role
                                this.content = unionMember2.content
                                this.functionCall = unionMember2.functionCall
                                this.name = unionMember2.name
                                this.toolCalls = unionMember2.toolCalls
                                additionalProperties(unionMember2.additionalProperties)
                            }

                            fun role(role: Role) = role(JsonField.of(role))

                            @JsonProperty("role")
                            @ExcludeMissing
                            fun role(role: JsonField<Role>) = apply {
                                this.role = role
                            }

                            fun content(content: String) = content(JsonField.of(content))

                            @JsonProperty("content")
                            @ExcludeMissing
                            fun content(content: JsonField<String>) = apply {
                                this.content = content
                            }

                            fun functionCall(functionCall: FunctionCall) = functionCall(JsonField.of(functionCall))

                            @JsonProperty("function_call")
                            @ExcludeMissing
                            fun functionCall(functionCall: JsonField<FunctionCall>) = apply {
                                this.functionCall = functionCall
                            }

                            fun name(name: String) = name(JsonField.of(name))

                            @JsonProperty("name")
                            @ExcludeMissing
                            fun name(name: JsonField<String>) = apply {
                                this.name = name
                            }

                            fun toolCalls(toolCalls: List<ToolCall>) = toolCalls(JsonField.of(toolCalls))

                            @JsonProperty("tool_calls")
                            @ExcludeMissing
                            fun toolCalls(toolCalls: JsonField<List<ToolCall>>) = apply {
                                this.toolCalls = toolCalls
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

                            fun build(): UnionMember2 = UnionMember2(
                                role,
                                content,
                                functionCall,
                                name,
                                toolCalls.map { it.toUnmodifiable() },
                                additionalProperties.toUnmodifiable(),
                            )
                        }

                        class Role @JsonCreator private constructor(private val value: JsonField<String>, ) : Enum {

                            @com.fasterxml.jackson.annotation.JsonValue
                            fun _value(): JsonField<String> = value

                            override fun equals(other: Any?): Boolean {
                              if (this === other) {
                                  return true
                              }

                              return other is Role &&
                                  this.value == other.value
                            }

                            override fun hashCode() = value.hashCode()

                            override fun toString() = value.toString()

                            companion object {

                                @JvmField val ASSISTANT = Role(JsonField.of("assistant"))

                                @JvmStatic fun of(value: String) = Role(JsonField.of(value))
                            }

                            enum class Known {
                                ASSISTANT,
                            }

                            enum class Value {
                                ASSISTANT,
                                _UNKNOWN,
                            }

                            fun value(): Value = when (this) {
                                ASSISTANT -> Value.ASSISTANT
                                else -> Value._UNKNOWN
                            }

                            fun known(): Known = when (this) {
                                ASSISTANT -> Known.ASSISTANT
                                else -> throw BraintrustInvalidDataException("Unknown Role: $value")
                            }

                            fun asString(): String = _value().asStringOrThrow()
                        }

                        @JsonDeserialize(builder = FunctionCall.Builder::class)
                        @NoAutoDetect
                        class FunctionCall private constructor(private val arguments: JsonField<String>, private val name: JsonField<String>, private val additionalProperties: Map<String, JsonValue>, ) {

                            private var validated: Boolean = false

                            private var hashCode: Int = 0

                            fun arguments(): String = arguments.getRequired("arguments")

                            fun name(): String = name.getRequired("name")

                            @JsonProperty("arguments")
                            @ExcludeMissing
                            fun _arguments() = arguments

                            @JsonProperty("name")
                            @ExcludeMissing
                            fun _name() = name

                            @JsonAnyGetter
                            @ExcludeMissing
                            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                            fun validate(): FunctionCall = apply {
                                if (!validated) {
                                  arguments()
                                  name()
                                  validated = true
                                }
                            }

                            fun toBuilder() = Builder().from(this)

                            override fun equals(other: Any?): Boolean {
                              if (this === other) {
                                  return true
                              }

                              return other is FunctionCall &&
                                  this.arguments == other.arguments &&
                                  this.name == other.name &&
                                  this.additionalProperties == other.additionalProperties
                            }

                            override fun hashCode(): Int {
                              if (hashCode == 0) {
                                hashCode = Objects.hash(
                                    arguments,
                                    name,
                                    additionalProperties,
                                )
                              }
                              return hashCode
                            }

                            override fun toString() = "FunctionCall{arguments=$arguments, name=$name, additionalProperties=$additionalProperties}"

                            companion object {

                                @JvmStatic
                                fun builder() = Builder()
                            }

                            class Builder {

                                private var arguments: JsonField<String> = JsonMissing.of()
                                private var name: JsonField<String> = JsonMissing.of()
                                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                                @JvmSynthetic
                                internal fun from(functionCall: FunctionCall) = apply {
                                    this.arguments = functionCall.arguments
                                    this.name = functionCall.name
                                    additionalProperties(functionCall.additionalProperties)
                                }

                                fun arguments(arguments: String) = arguments(JsonField.of(arguments))

                                @JsonProperty("arguments")
                                @ExcludeMissing
                                fun arguments(arguments: JsonField<String>) = apply {
                                    this.arguments = arguments
                                }

                                fun name(name: String) = name(JsonField.of(name))

                                @JsonProperty("name")
                                @ExcludeMissing
                                fun name(name: JsonField<String>) = apply {
                                    this.name = name
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

                                fun build(): FunctionCall = FunctionCall(
                                    arguments,
                                    name,
                                    additionalProperties.toUnmodifiable(),
                                )
                            }
                        }

                        @JsonDeserialize(builder = ToolCall.Builder::class)
                        @NoAutoDetect
                        class ToolCall private constructor(
                          private val id: JsonField<String>,
                          private val function: JsonField<Function>,
                          private val type: JsonField<Type>,
                          private val additionalProperties: Map<String, JsonValue>,

                        ) {

                            private var validated: Boolean = false

                            private var hashCode: Int = 0

                            fun id(): String = id.getRequired("id")

                            fun function(): Function = function.getRequired("function")

                            fun type(): Type = type.getRequired("type")

                            @JsonProperty("id")
                            @ExcludeMissing
                            fun _id() = id

                            @JsonProperty("function")
                            @ExcludeMissing
                            fun _function() = function

                            @JsonProperty("type")
                            @ExcludeMissing
                            fun _type() = type

                            @JsonAnyGetter
                            @ExcludeMissing
                            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                            fun validate(): ToolCall = apply {
                                if (!validated) {
                                  id()
                                  function().validate()
                                  type()
                                  validated = true
                                }
                            }

                            fun toBuilder() = Builder().from(this)

                            override fun equals(other: Any?): Boolean {
                              if (this === other) {
                                  return true
                              }

                              return other is ToolCall &&
                                  this.id == other.id &&
                                  this.function == other.function &&
                                  this.type == other.type &&
                                  this.additionalProperties == other.additionalProperties
                            }

                            override fun hashCode(): Int {
                              if (hashCode == 0) {
                                hashCode = Objects.hash(
                                    id,
                                    function,
                                    type,
                                    additionalProperties,
                                )
                              }
                              return hashCode
                            }

                            override fun toString() = "ToolCall{id=$id, function=$function, type=$type, additionalProperties=$additionalProperties}"

                            companion object {

                                @JvmStatic
                                fun builder() = Builder()
                            }

                            class Builder {

                                private var id: JsonField<String> = JsonMissing.of()
                                private var function: JsonField<Function> = JsonMissing.of()
                                private var type: JsonField<Type> = JsonMissing.of()
                                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                                @JvmSynthetic
                                internal fun from(toolCall: ToolCall) = apply {
                                    this.id = toolCall.id
                                    this.function = toolCall.function
                                    this.type = toolCall.type
                                    additionalProperties(toolCall.additionalProperties)
                                }

                                fun id(id: String) = id(JsonField.of(id))

                                @JsonProperty("id")
                                @ExcludeMissing
                                fun id(id: JsonField<String>) = apply {
                                    this.id = id
                                }

                                fun function(function: Function) = function(JsonField.of(function))

                                @JsonProperty("function")
                                @ExcludeMissing
                                fun function(function: JsonField<Function>) = apply {
                                    this.function = function
                                }

                                fun type(type: Type) = type(JsonField.of(type))

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

                                fun build(): ToolCall = ToolCall(
                                    id,
                                    function,
                                    type,
                                    additionalProperties.toUnmodifiable(),
                                )
                            }

                            @JsonDeserialize(builder = Function.Builder::class)
                            @NoAutoDetect
                            class Function private constructor(private val arguments: JsonField<String>, private val name: JsonField<String>, private val additionalProperties: Map<String, JsonValue>, ) {

                                private var validated: Boolean = false

                                private var hashCode: Int = 0

                                fun arguments(): String = arguments.getRequired("arguments")

                                fun name(): String = name.getRequired("name")

                                @JsonProperty("arguments")
                                @ExcludeMissing
                                fun _arguments() = arguments

                                @JsonProperty("name")
                                @ExcludeMissing
                                fun _name() = name

                                @JsonAnyGetter
                                @ExcludeMissing
                                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                                fun validate(): Function = apply {
                                    if (!validated) {
                                      arguments()
                                      name()
                                      validated = true
                                    }
                                }

                                fun toBuilder() = Builder().from(this)

                                override fun equals(other: Any?): Boolean {
                                  if (this === other) {
                                      return true
                                  }

                                  return other is Function &&
                                      this.arguments == other.arguments &&
                                      this.name == other.name &&
                                      this.additionalProperties == other.additionalProperties
                                }

                                override fun hashCode(): Int {
                                  if (hashCode == 0) {
                                    hashCode = Objects.hash(
                                        arguments,
                                        name,
                                        additionalProperties,
                                    )
                                  }
                                  return hashCode
                                }

                                override fun toString() = "Function{arguments=$arguments, name=$name, additionalProperties=$additionalProperties}"

                                companion object {

                                    @JvmStatic
                                    fun builder() = Builder()
                                }

                                class Builder {

                                    private var arguments: JsonField<String> = JsonMissing.of()
                                    private var name: JsonField<String> = JsonMissing.of()
                                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                                    @JvmSynthetic
                                    internal fun from(function: Function) = apply {
                                        this.arguments = function.arguments
                                        this.name = function.name
                                        additionalProperties(function.additionalProperties)
                                    }

                                    fun arguments(arguments: String) = arguments(JsonField.of(arguments))

                                    @JsonProperty("arguments")
                                    @ExcludeMissing
                                    fun arguments(arguments: JsonField<String>) = apply {
                                        this.arguments = arguments
                                    }

                                    fun name(name: String) = name(JsonField.of(name))

                                    @JsonProperty("name")
                                    @ExcludeMissing
                                    fun name(name: JsonField<String>) = apply {
                                        this.name = name
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

                                    fun build(): Function = Function(
                                        arguments,
                                        name,
                                        additionalProperties.toUnmodifiable(),
                                    )
                                }
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

                                    @JvmField val FUNCTION = Type(JsonField.of("function"))

                                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                                }

                                enum class Known {
                                    FUNCTION,
                                }

                                enum class Value {
                                    FUNCTION,
                                    _UNKNOWN,
                                }

                                fun value(): Value = when (this) {
                                    FUNCTION -> Value.FUNCTION
                                    else -> Value._UNKNOWN
                                }

                                fun known(): Known = when (this) {
                                    FUNCTION -> Known.FUNCTION
                                    else -> throw BraintrustInvalidDataException("Unknown Type: $value")
                                }

                                fun asString(): String = _value().asStringOrThrow()
                            }
                        }
                    }

                    @JsonDeserialize(builder = UnionMember3.Builder::class)
                    @NoAutoDetect
                    class UnionMember3 private constructor(
                      private val content: JsonField<String>,
                      private val role: JsonField<Role>,
                      private val toolCallId: JsonField<String>,
                      private val additionalProperties: Map<String, JsonValue>,

                    ) {

                        private var validated: Boolean = false

                        private var hashCode: Int = 0

                        fun content(): Optional<String> = Optional.ofNullable(content.getNullable("content"))

                        fun role(): Role = role.getRequired("role")

                        fun toolCallId(): Optional<String> = Optional.ofNullable(toolCallId.getNullable("tool_call_id"))

                        @JsonProperty("content")
                        @ExcludeMissing
                        fun _content() = content

                        @JsonProperty("role")
                        @ExcludeMissing
                        fun _role() = role

                        @JsonProperty("tool_call_id")
                        @ExcludeMissing
                        fun _toolCallId() = toolCallId

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun validate(): UnionMember3 = apply {
                            if (!validated) {
                              content()
                              role()
                              toolCallId()
                              validated = true
                            }
                        }

                        fun toBuilder() = Builder().from(this)

                        override fun equals(other: Any?): Boolean {
                          if (this === other) {
                              return true
                          }

                          return other is UnionMember3 &&
                              this.content == other.content &&
                              this.role == other.role &&
                              this.toolCallId == other.toolCallId &&
                              this.additionalProperties == other.additionalProperties
                        }

                        override fun hashCode(): Int {
                          if (hashCode == 0) {
                            hashCode = Objects.hash(
                                content,
                                role,
                                toolCallId,
                                additionalProperties,
                            )
                          }
                          return hashCode
                        }

                        override fun toString() = "UnionMember3{content=$content, role=$role, toolCallId=$toolCallId, additionalProperties=$additionalProperties}"

                        companion object {

                            @JvmStatic
                            fun builder() = Builder()
                        }

                        class Builder {

                            private var content: JsonField<String> = JsonMissing.of()
                            private var role: JsonField<Role> = JsonMissing.of()
                            private var toolCallId: JsonField<String> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                            @JvmSynthetic
                            internal fun from(unionMember3: UnionMember3) = apply {
                                this.content = unionMember3.content
                                this.role = unionMember3.role
                                this.toolCallId = unionMember3.toolCallId
                                additionalProperties(unionMember3.additionalProperties)
                            }

                            fun content(content: String) = content(JsonField.of(content))

                            @JsonProperty("content")
                            @ExcludeMissing
                            fun content(content: JsonField<String>) = apply {
                                this.content = content
                            }

                            fun role(role: Role) = role(JsonField.of(role))

                            @JsonProperty("role")
                            @ExcludeMissing
                            fun role(role: JsonField<Role>) = apply {
                                this.role = role
                            }

                            fun toolCallId(toolCallId: String) = toolCallId(JsonField.of(toolCallId))

                            @JsonProperty("tool_call_id")
                            @ExcludeMissing
                            fun toolCallId(toolCallId: JsonField<String>) = apply {
                                this.toolCallId = toolCallId
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

                            fun build(): UnionMember3 = UnionMember3(
                                content,
                                role,
                                toolCallId,
                                additionalProperties.toUnmodifiable(),
                            )
                        }

                        class Role @JsonCreator private constructor(private val value: JsonField<String>, ) : Enum {

                            @com.fasterxml.jackson.annotation.JsonValue
                            fun _value(): JsonField<String> = value

                            override fun equals(other: Any?): Boolean {
                              if (this === other) {
                                  return true
                              }

                              return other is Role &&
                                  this.value == other.value
                            }

                            override fun hashCode() = value.hashCode()

                            override fun toString() = value.toString()

                            companion object {

                                @JvmField val TOOL = Role(JsonField.of("tool"))

                                @JvmStatic fun of(value: String) = Role(JsonField.of(value))
                            }

                            enum class Known {
                                TOOL,
                            }

                            enum class Value {
                                TOOL,
                                _UNKNOWN,
                            }

                            fun value(): Value = when (this) {
                                TOOL -> Value.TOOL
                                else -> Value._UNKNOWN
                            }

                            fun known(): Known = when (this) {
                                TOOL -> Known.TOOL
                                else -> throw BraintrustInvalidDataException("Unknown Role: $value")
                            }

                            fun asString(): String = _value().asStringOrThrow()
                        }
                    }

                    @JsonDeserialize(builder = UnionMember4.Builder::class)
                    @NoAutoDetect
                    class UnionMember4 private constructor(
                      private val content: JsonField<String>,
                      private val name: JsonField<String>,
                      private val role: JsonField<Role>,
                      private val additionalProperties: Map<String, JsonValue>,

                    ) {

                        private var validated: Boolean = false

                        private var hashCode: Int = 0

                        fun content(): Optional<String> = Optional.ofNullable(content.getNullable("content"))

                        fun name(): String = name.getRequired("name")

                        fun role(): Role = role.getRequired("role")

                        @JsonProperty("content")
                        @ExcludeMissing
                        fun _content() = content

                        @JsonProperty("name")
                        @ExcludeMissing
                        fun _name() = name

                        @JsonProperty("role")
                        @ExcludeMissing
                        fun _role() = role

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun validate(): UnionMember4 = apply {
                            if (!validated) {
                              content()
                              name()
                              role()
                              validated = true
                            }
                        }

                        fun toBuilder() = Builder().from(this)

                        override fun equals(other: Any?): Boolean {
                          if (this === other) {
                              return true
                          }

                          return other is UnionMember4 &&
                              this.content == other.content &&
                              this.name == other.name &&
                              this.role == other.role &&
                              this.additionalProperties == other.additionalProperties
                        }

                        override fun hashCode(): Int {
                          if (hashCode == 0) {
                            hashCode = Objects.hash(
                                content,
                                name,
                                role,
                                additionalProperties,
                            )
                          }
                          return hashCode
                        }

                        override fun toString() = "UnionMember4{content=$content, name=$name, role=$role, additionalProperties=$additionalProperties}"

                        companion object {

                            @JvmStatic
                            fun builder() = Builder()
                        }

                        class Builder {

                            private var content: JsonField<String> = JsonMissing.of()
                            private var name: JsonField<String> = JsonMissing.of()
                            private var role: JsonField<Role> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                            @JvmSynthetic
                            internal fun from(unionMember4: UnionMember4) = apply {
                                this.content = unionMember4.content
                                this.name = unionMember4.name
                                this.role = unionMember4.role
                                additionalProperties(unionMember4.additionalProperties)
                            }

                            fun content(content: String) = content(JsonField.of(content))

                            @JsonProperty("content")
                            @ExcludeMissing
                            fun content(content: JsonField<String>) = apply {
                                this.content = content
                            }

                            fun name(name: String) = name(JsonField.of(name))

                            @JsonProperty("name")
                            @ExcludeMissing
                            fun name(name: JsonField<String>) = apply {
                                this.name = name
                            }

                            fun role(role: Role) = role(JsonField.of(role))

                            @JsonProperty("role")
                            @ExcludeMissing
                            fun role(role: JsonField<Role>) = apply {
                                this.role = role
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

                            fun build(): UnionMember4 = UnionMember4(
                                content,
                                name,
                                role,
                                additionalProperties.toUnmodifiable(),
                            )
                        }

                        class Role @JsonCreator private constructor(private val value: JsonField<String>, ) : Enum {

                            @com.fasterxml.jackson.annotation.JsonValue
                            fun _value(): JsonField<String> = value

                            override fun equals(other: Any?): Boolean {
                              if (this === other) {
                                  return true
                              }

                              return other is Role &&
                                  this.value == other.value
                            }

                            override fun hashCode() = value.hashCode()

                            override fun toString() = value.toString()

                            companion object {

                                @JvmField val FUNCTION = Role(JsonField.of("function"))

                                @JvmStatic fun of(value: String) = Role(JsonField.of(value))
                            }

                            enum class Known {
                                FUNCTION,
                            }

                            enum class Value {
                                FUNCTION,
                                _UNKNOWN,
                            }

                            fun value(): Value = when (this) {
                                FUNCTION -> Value.FUNCTION
                                else -> Value._UNKNOWN
                            }

                            fun known(): Known = when (this) {
                                FUNCTION -> Known.FUNCTION
                                else -> throw BraintrustInvalidDataException("Unknown Role: $value")
                            }

                            fun asString(): String = _value().asStringOrThrow()
                        }
                    }

                    @JsonDeserialize(builder = UnionMember5.Builder::class)
                    @NoAutoDetect
                    class UnionMember5 private constructor(private val role: JsonField<Role>, private val content: JsonField<String>, private val additionalProperties: Map<String, JsonValue>, ) {

                        private var validated: Boolean = false

                        private var hashCode: Int = 0

                        fun role(): Role = role.getRequired("role")

                        fun content(): Optional<String> = Optional.ofNullable(content.getNullable("content"))

                        @JsonProperty("role")
                        @ExcludeMissing
                        fun _role() = role

                        @JsonProperty("content")
                        @ExcludeMissing
                        fun _content() = content

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun validate(): UnionMember5 = apply {
                            if (!validated) {
                              role()
                              content()
                              validated = true
                            }
                        }

                        fun toBuilder() = Builder().from(this)

                        override fun equals(other: Any?): Boolean {
                          if (this === other) {
                              return true
                          }

                          return other is UnionMember5 &&
                              this.role == other.role &&
                              this.content == other.content &&
                              this.additionalProperties == other.additionalProperties
                        }

                        override fun hashCode(): Int {
                          if (hashCode == 0) {
                            hashCode = Objects.hash(
                                role,
                                content,
                                additionalProperties,
                            )
                          }
                          return hashCode
                        }

                        override fun toString() = "UnionMember5{role=$role, content=$content, additionalProperties=$additionalProperties}"

                        companion object {

                            @JvmStatic
                            fun builder() = Builder()
                        }

                        class Builder {

                            private var role: JsonField<Role> = JsonMissing.of()
                            private var content: JsonField<String> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                            @JvmSynthetic
                            internal fun from(unionMember5: UnionMember5) = apply {
                                this.role = unionMember5.role
                                this.content = unionMember5.content
                                additionalProperties(unionMember5.additionalProperties)
                            }

                            fun role(role: Role) = role(JsonField.of(role))

                            @JsonProperty("role")
                            @ExcludeMissing
                            fun role(role: JsonField<Role>) = apply {
                                this.role = role
                            }

                            fun content(content: String) = content(JsonField.of(content))

                            @JsonProperty("content")
                            @ExcludeMissing
                            fun content(content: JsonField<String>) = apply {
                                this.content = content
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

                            fun build(): UnionMember5 = UnionMember5(
                                role,
                                content,
                                additionalProperties.toUnmodifiable(),
                            )
                        }

                        class Role @JsonCreator private constructor(private val value: JsonField<String>, ) : Enum {

                            @com.fasterxml.jackson.annotation.JsonValue
                            fun _value(): JsonField<String> = value

                            override fun equals(other: Any?): Boolean {
                              if (this === other) {
                                  return true
                              }

                              return other is Role &&
                                  this.value == other.value
                            }

                            override fun hashCode() = value.hashCode()

                            override fun toString() = value.toString()

                            companion object {

                                @JvmField val MODEL = Role(JsonField.of("model"))

                                @JvmStatic fun of(value: String) = Role(JsonField.of(value))
                            }

                            enum class Known {
                                MODEL,
                            }

                            enum class Value {
                                MODEL,
                                _UNKNOWN,
                            }

                            fun value(): Value = when (this) {
                                MODEL -> Value.MODEL
                                else -> Value._UNKNOWN
                            }

                            fun known(): Known = when (this) {
                                MODEL -> Known.MODEL
                                else -> throw BraintrustInvalidDataException("Unknown Role: $value")
                            }

                            fun asString(): String = _value().asStringOrThrow()
                        }
                    }
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

                        @JvmField val CHAT = Type(JsonField.of("chat"))

                        @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                    }

                    enum class Known {
                        CHAT,
                    }

                    enum class Value {
                        CHAT,
                        _UNKNOWN,
                    }

                    fun value(): Value = when (this) {
                        CHAT -> Value.CHAT
                        else -> Value._UNKNOWN
                    }

                    fun known(): Known = when (this) {
                        CHAT -> Known.CHAT
                        else -> throw BraintrustInvalidDataException("Unknown Type: $value")
                    }

                    fun asString(): String = _value().asStringOrThrow()
                }
            }

            @JsonDeserialize(builder = UnionMember2.Builder::class)
            @NoAutoDetect
            class UnionMember2 private constructor(private val additionalProperties: Map<String, JsonValue>, ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): UnionMember2 = apply {
                    if (!validated) {
                      validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                  if (this === other) {
                      return true
                  }

                  return other is UnionMember2 &&
                      this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                  if (hashCode == 0) {
                    hashCode = Objects.hash(additionalProperties)
                  }
                  return hashCode
                }

                override fun toString() = "UnionMember2{additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic
                    fun builder() = Builder()
                }

                class Builder {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(unionMember2: UnionMember2) = apply {
                        additionalProperties(unionMember2.additionalProperties)
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

                    fun build(): UnionMember2 = UnionMember2(additionalProperties.toUnmodifiable())
                }
            }
        }
    }
}
