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

class ProjectScoreCreateParams constructor(
  private val name: String,
  private val projectId: String,
  private val scoreType: ScoreType?,
  private val categories: Categories?,
  private val description: String?,
  private val additionalQueryParams: Map<String, List<String>>,
  private val additionalHeaders: Map<String, List<String>>,
  private val additionalBodyProperties: Map<String, JsonValue>,

) {

    fun name(): String = name

    fun projectId(): String = projectId

    fun scoreType(): Optional<ScoreType> = Optional.ofNullable(scoreType)

    fun categories(): Optional<Categories> = Optional.ofNullable(categories)

    fun description(): Optional<String> = Optional.ofNullable(description)

    @JvmSynthetic
    internal fun getBody(): ProjectScoreCreateBody {
      return ProjectScoreCreateBody(
          name,
          projectId,
          scoreType,
          categories,
          description,
          additionalBodyProperties,
      )
    }

    @JvmSynthetic
    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic
    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = ProjectScoreCreateBody.Builder::class)
    @NoAutoDetect
    class ProjectScoreCreateBody internal constructor(
      private val name: String?,
      private val projectId: String?,
      private val scoreType: ScoreType?,
      private val categories: Categories?,
      private val description: String?,
      private val additionalProperties: Map<String, JsonValue>,

    ) {

        private var hashCode: Int = 0

        /** Name of the project score */
        @JsonProperty("name")
        fun name(): String? = name

        /** Unique identifier for the project that the project score belongs under */
        @JsonProperty("project_id")
        fun projectId(): String? = projectId

        /** The type of the configured score */
        @JsonProperty("score_type")
        fun scoreType(): ScoreType? = scoreType

        @JsonProperty("categories")
        fun categories(): Categories? = categories

        /** Textual description of the project score */
        @JsonProperty("description")
        fun description(): String? = description

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is ProjectScoreCreateBody &&
              this.name == other.name &&
              this.projectId == other.projectId &&
              this.scoreType == other.scoreType &&
              this.categories == other.categories &&
              this.description == other.description &&
              this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
          if (hashCode == 0) {
            hashCode = Objects.hash(
                name,
                projectId,
                scoreType,
                categories,
                description,
                additionalProperties,
            )
          }
          return hashCode
        }

        override fun toString() = "ProjectScoreCreateBody{name=$name, projectId=$projectId, scoreType=$scoreType, categories=$categories, description=$description, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic
            fun builder() = Builder()
        }

        class Builder {

            private var name: String? = null
            private var projectId: String? = null
            private var scoreType: ScoreType? = null
            private var categories: Categories? = null
            private var description: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(projectScoreCreateBody: ProjectScoreCreateBody) = apply {
                this.name = projectScoreCreateBody.name
                this.projectId = projectScoreCreateBody.projectId
                this.scoreType = projectScoreCreateBody.scoreType
                this.categories = projectScoreCreateBody.categories
                this.description = projectScoreCreateBody.description
                additionalProperties(projectScoreCreateBody.additionalProperties)
            }

            /** Name of the project score */
            @JsonProperty("name")
            fun name(name: String) = apply {
                this.name = name
            }

            /** Unique identifier for the project that the project score belongs under */
            @JsonProperty("project_id")
            fun projectId(projectId: String) = apply {
                this.projectId = projectId
            }

            /** The type of the configured score */
            @JsonProperty("score_type")
            fun scoreType(scoreType: ScoreType) = apply {
                this.scoreType = scoreType
            }

            @JsonProperty("categories")
            fun categories(categories: Categories) = apply {
                this.categories = categories
            }

            /** Textual description of the project score */
            @JsonProperty("description")
            fun description(description: String) = apply {
                this.description = description
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

            fun build(): ProjectScoreCreateBody = ProjectScoreCreateBody(
                checkNotNull(name) {
                    "`name` is required but was not set"
                },
                checkNotNull(projectId) {
                    "`projectId` is required but was not set"
                },
                scoreType,
                categories,
                description,
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

      return other is ProjectScoreCreateParams &&
          this.name == other.name &&
          this.projectId == other.projectId &&
          this.scoreType == other.scoreType &&
          this.categories == other.categories &&
          this.description == other.description &&
          this.additionalQueryParams == other.additionalQueryParams &&
          this.additionalHeaders == other.additionalHeaders &&
          this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
      return Objects.hash(
          name,
          projectId,
          scoreType,
          categories,
          description,
          additionalQueryParams,
          additionalHeaders,
          additionalBodyProperties,
      )
    }

    override fun toString() = "ProjectScoreCreateParams{name=$name, projectId=$projectId, scoreType=$scoreType, categories=$categories, description=$description, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic
        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var name: String? = null
        private var projectId: String? = null
        private var scoreType: ScoreType? = null
        private var categories: Categories? = null
        private var description: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(projectScoreCreateParams: ProjectScoreCreateParams) = apply {
            this.name = projectScoreCreateParams.name
            this.projectId = projectScoreCreateParams.projectId
            this.scoreType = projectScoreCreateParams.scoreType
            this.categories = projectScoreCreateParams.categories
            this.description = projectScoreCreateParams.description
            additionalQueryParams(projectScoreCreateParams.additionalQueryParams)
            additionalHeaders(projectScoreCreateParams.additionalHeaders)
            additionalBodyProperties(projectScoreCreateParams.additionalBodyProperties)
        }

        /** Name of the project score */
        fun name(name: String) = apply {
            this.name = name
        }

        /** Unique identifier for the project that the project score belongs under */
        fun projectId(projectId: String) = apply {
            this.projectId = projectId
        }

        /** The type of the configured score */
        fun scoreType(scoreType: ScoreType) = apply {
            this.scoreType = scoreType
        }

        /** For categorical-type project scores, the list of all categories */
        fun categories(categories: Categories) = apply {
            this.categories = categories
        }

        /** For categorical-type project scores, the list of all categories */
        fun categories(projectScoreCategories: List<ProjectScoreCategory>) = apply {
            this.categories = Categories.ofProjectScoreCategories(projectScoreCategories)
        }

        /** For categorical-type project scores, the list of all categories */
        fun categories(unionMember1: Categories.UnionMember1) = apply {
            this.categories = Categories.ofUnionMember1(unionMember1)
        }

        /** For categorical-type project scores, the list of all categories */
        fun categories(strings: List<String>) = apply {
            this.categories = Categories.ofStrings(strings)
        }

        /** For categorical-type project scores, the list of all categories */
        fun categories(unionMember3: UnionMember3) = apply {
            this.categories = Categories.ofUnionMember3(unionMember3)
        }

        /** Textual description of the project score */
        fun description(description: String) = apply {
            this.description = description
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

        fun build(): ProjectScoreCreateParams = ProjectScoreCreateParams(
            checkNotNull(name) {
                "`name` is required but was not set"
            },
            checkNotNull(projectId) {
                "`projectId` is required but was not set"
            },
            scoreType,
            categories,
            description,
            additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            additionalBodyProperties.toUnmodifiable(),
        )
    }

    class ScoreType @JsonCreator private constructor(private val value: JsonField<String>, ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue
        fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is ScoreType &&
              this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val SLIDER = ScoreType(JsonField.of("slider"))

            @JvmField val CATEGORICAL = ScoreType(JsonField.of("categorical"))

            @JvmField val WEIGHTED = ScoreType(JsonField.of("weighted"))

            @JvmField val MINIMUM = ScoreType(JsonField.of("minimum"))

            @JvmStatic fun of(value: String) = ScoreType(JsonField.of(value))
        }

        enum class Known {
            SLIDER,
            CATEGORICAL,
            WEIGHTED,
            MINIMUM,
        }

        enum class Value {
            SLIDER,
            CATEGORICAL,
            WEIGHTED,
            MINIMUM,
            _UNKNOWN,
        }

        fun value(): Value = when (this) {
            SLIDER -> Value.SLIDER
            CATEGORICAL -> Value.CATEGORICAL
            WEIGHTED -> Value.WEIGHTED
            MINIMUM -> Value.MINIMUM
            else -> Value._UNKNOWN
        }

        fun known(): Known = when (this) {
            SLIDER -> Known.SLIDER
            CATEGORICAL -> Known.CATEGORICAL
            WEIGHTED -> Known.WEIGHTED
            MINIMUM -> Known.MINIMUM
            else -> throw BraintrustInvalidDataException("Unknown ScoreType: $value")
        }

        fun asString(): String = _value().asStringOrThrow()
    }

    @JsonDeserialize(using = Categories.Deserializer::class)
    @JsonSerialize(using = Categories.Serializer::class)
    class Categories private constructor(
      private val projectScoreCategories: List<ProjectScoreCategory>? = null,
      private val unionMember1: UnionMember1? = null,
      private val strings: List<String>? = null,
      private val unionMember3: UnionMember3? = null,
      private val _json: JsonValue? = null,

    ) {

        private var validated: Boolean = false

        /** For categorical-type project scores, the list of all categories */
        fun projectScoreCategories(): Optional<List<ProjectScoreCategory>> = Optional.ofNullable(projectScoreCategories)
        /** For weighted-type project scores, the weights of each score */
        fun unionMember1(): Optional<UnionMember1> = Optional.ofNullable(unionMember1)
        /** For minimum-type project scores, the list of included scores */
        fun strings(): Optional<List<String>> = Optional.ofNullable(strings)
        fun unionMember3(): Optional<UnionMember3> = Optional.ofNullable(unionMember3)

        fun isProjectScoreCategories(): Boolean = projectScoreCategories != null
        fun isUnionMember1(): Boolean = unionMember1 != null
        fun isStrings(): Boolean = strings != null
        fun isUnionMember3(): Boolean = unionMember3 != null

        fun asProjectScoreCategories(): List<ProjectScoreCategory> = projectScoreCategories.getOrThrow("projectScoreCategories")
        fun asUnionMember1(): UnionMember1 = unionMember1.getOrThrow("unionMember1")
        fun asStrings(): List<String> = strings.getOrThrow("strings")
        fun asUnionMember3(): UnionMember3 = unionMember3.getOrThrow("unionMember3")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T {
          return when {
              projectScoreCategories != null -> visitor.visitProjectScoreCategories(projectScoreCategories)
              unionMember1 != null -> visitor.visitUnionMember1(unionMember1)
              strings != null -> visitor.visitStrings(strings)
              unionMember3 != null -> visitor.visitUnionMember3(unionMember3)
              else -> visitor.unknown(_json)
          }
        }

        fun validate(): Categories = apply {
            if (!validated) {
              if (projectScoreCategories == null && unionMember1 == null && strings == null && unionMember3 == null) {
                throw BraintrustInvalidDataException("Unknown Categories: $_json")
              }
              projectScoreCategories?.forEach { it.validate() }
              unionMember1?.validate()
              unionMember3?.validate()
              validated = true
            }
        }

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is Categories &&
              this.projectScoreCategories == other.projectScoreCategories &&
              this.unionMember1 == other.unionMember1 &&
              this.strings == other.strings &&
              this.unionMember3 == other.unionMember3
        }

        override fun hashCode(): Int {
          return Objects.hash(
              projectScoreCategories,
              unionMember1,
              strings,
              unionMember3,
          )
        }

        override fun toString(): String {
          return when {
              projectScoreCategories != null -> "Categories{projectScoreCategories=$projectScoreCategories}"
              unionMember1 != null -> "Categories{unionMember1=$unionMember1}"
              strings != null -> "Categories{strings=$strings}"
              unionMember3 != null -> "Categories{unionMember3=$unionMember3}"
              _json != null -> "Categories{_unknown=$_json}"
              else -> throw IllegalStateException("Invalid Categories")
          }
        }

        companion object {

            @JvmStatic
            fun ofProjectScoreCategories(projectScoreCategories: List<ProjectScoreCategory>) = Categories(projectScoreCategories = projectScoreCategories)

            @JvmStatic
            fun ofUnionMember1(unionMember1: UnionMember1) = Categories(unionMember1 = unionMember1)

            @JvmStatic
            fun ofStrings(strings: List<String>) = Categories(strings = strings)

            @JvmStatic
            fun ofUnionMember3(unionMember3: UnionMember3) = Categories(unionMember3 = unionMember3)
        }

        interface Visitor<out T> {

            fun visitProjectScoreCategories(projectScoreCategories: List<ProjectScoreCategory>): T

            fun visitUnionMember1(unionMember1: UnionMember1): T

            fun visitStrings(strings: List<String>): T

            fun visitUnionMember3(unionMember3: UnionMember3): T

            fun unknown(json: JsonValue?): T {
              throw BraintrustInvalidDataException("Unknown Categories: $json")
            }
        }

        class Deserializer : BaseDeserializer<Categories>(Categories::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Categories {
              val json = JsonValue.fromJsonNode(node)
              tryDeserialize(node, jacksonTypeRef<List<ProjectScoreCategory>>()){ it.forEach { it.validate() } }?.let {
                  return Categories(projectScoreCategories = it, _json = json)
              }
              tryDeserialize(node, jacksonTypeRef<UnionMember1>()){ it.validate() }?.let {
                  return Categories(unionMember1 = it, _json = json)
              }
              tryDeserialize(node, jacksonTypeRef<List<String>>())?.let {
                  return Categories(strings = it, _json = json)
              }
              tryDeserialize(node, jacksonTypeRef<UnionMember3>()){ it.validate() }?.let {
                  return Categories(unionMember3 = it, _json = json)
              }

              return Categories(_json = json)
            }
        }

        class Serializer : BaseSerializer<Categories>(Categories::class) {

            override fun serialize(value: Categories, generator: JsonGenerator, provider: SerializerProvider) {
              when {
                  value.projectScoreCategories != null -> generator.writeObject(value.projectScoreCategories)
                  value.unionMember1 != null -> generator.writeObject(value.unionMember1)
                  value.strings != null -> generator.writeObject(value.strings)
                  value.unionMember3 != null -> generator.writeObject(value.unionMember3)
                  value._json != null -> generator.writeObject(value._json)
                  else -> throw IllegalStateException("Invalid Categories")
              }
            }
        }

        /** For categorical-type project scores, defines a single category */
        @JsonDeserialize(builder = ProjectScoreCategory.Builder::class)
        @NoAutoDetect
        class ProjectScoreCategory private constructor(private val name: JsonField<String>, private val value: JsonField<Double>, private val additionalProperties: Map<String, JsonValue>, ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** Name of the category */
            fun name(): String = name.getRequired("name")

            /** Numerical value of the category. Must be between 0 and 1, inclusive */
            fun value(): Double = value.getRequired("value")

            /** Name of the category */
            @JsonProperty("name")
            @ExcludeMissing
            fun _name() = name

            /** Numerical value of the category. Must be between 0 and 1, inclusive */
            @JsonProperty("value")
            @ExcludeMissing
            fun _value() = value

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): ProjectScoreCategory = apply {
                if (!validated) {
                  name()
                  value()
                  validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
              if (this === other) {
                  return true
              }

              return other is ProjectScoreCategory &&
                  this.name == other.name &&
                  this.value == other.value &&
                  this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
              if (hashCode == 0) {
                hashCode = Objects.hash(
                    name,
                    value,
                    additionalProperties,
                )
              }
              return hashCode
            }

            override fun toString() = "ProjectScoreCategory{name=$name, value=$value, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic
                fun builder() = Builder()
            }

            class Builder {

                private var name: JsonField<String> = JsonMissing.of()
                private var value: JsonField<Double> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(projectScoreCategory: ProjectScoreCategory) = apply {
                    this.name = projectScoreCategory.name
                    this.value = projectScoreCategory.value
                    additionalProperties(projectScoreCategory.additionalProperties)
                }

                /** Name of the category */
                fun name(name: String) = name(JsonField.of(name))

                /** Name of the category */
                @JsonProperty("name")
                @ExcludeMissing
                fun name(name: JsonField<String>) = apply {
                    this.name = name
                }

                /** Numerical value of the category. Must be between 0 and 1, inclusive */
                fun value(value: Double) = value(JsonField.of(value))

                /** Numerical value of the category. Must be between 0 and 1, inclusive */
                @JsonProperty("value")
                @ExcludeMissing
                fun value(value: JsonField<Double>) = apply {
                    this.value = value
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

                fun build(): ProjectScoreCategory = ProjectScoreCategory(
                    name,
                    value,
                    additionalProperties.toUnmodifiable(),
                )
            }
        }

        /** For weighted-type project scores, the weights of each score */
        @JsonDeserialize(builder = UnionMember1.Builder::class)
        @NoAutoDetect
        class UnionMember1 private constructor(private val additionalProperties: Map<String, JsonValue>, ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): UnionMember1 = apply {
                if (!validated) {
                  validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
              if (this === other) {
                  return true
              }

              return other is UnionMember1 &&
                  this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
              if (hashCode == 0) {
                hashCode = Objects.hash(additionalProperties)
              }
              return hashCode
            }

            override fun toString() = "UnionMember1{additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic
                fun builder() = Builder()
            }

            class Builder {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(unionMember1: UnionMember1) = apply {
                    additionalProperties(unionMember1.additionalProperties)
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

                fun build(): UnionMember1 = UnionMember1(additionalProperties.toUnmodifiable())
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
}
