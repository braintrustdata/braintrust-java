// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.BaseDeserializer
import com.braintrustdata.api.core.BaseSerializer
import com.braintrustdata.api.core.Enum
import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.Params
import com.braintrustdata.api.core.checkRequired
import com.braintrustdata.api.core.getOrThrow
import com.braintrustdata.api.core.http.Headers
import com.braintrustdata.api.core.http.QueryParams
import com.braintrustdata.api.core.immutableEmptyMap
import com.braintrustdata.api.core.toImmutable
import com.braintrustdata.api.errors.BraintrustInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Create or replace project_score. If there is an existing project_score in the
 * project with the same name as the one specified in the request, will replace the
 * existing project_score with the provided fields
 */
class ProjectScoreReplaceParams private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,

) : Params {

    /** Name of the project score */
    fun name(): String = body.name()

    /** Unique identifier for the project that the project score belongs under */
    fun projectId(): String = body.projectId()

    /** The type of the configured score */
    fun scoreType(): ScoreType = body.scoreType()

    /** For categorical-type project scores, the list of all categories */
    fun categories(): Optional<Categories> = body.categories()

    fun config(): Optional<ProjectScoreConfig> = body.config()

    /** Textual description of the project score */
    fun description(): Optional<String> = body.description()

    /** Name of the project score */
    fun _name(): JsonField<String> = body._name()

    /** Unique identifier for the project that the project score belongs under */
    fun _projectId(): JsonField<String> = body._projectId()

    /** The type of the configured score */
    fun _scoreType(): JsonField<ScoreType> = body._scoreType()

    /** For categorical-type project scores, the list of all categories */
    fun _categories(): JsonField<Categories> = body._categories()

    fun _config(): JsonField<ProjectScoreConfig> = body._config()

    /** Textual description of the project score */
    fun _description(): JsonField<String> = body._description()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic
    internal fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /**
     * A project score is a user-configured score, which can be manually-labeled
     * through the UI
     */
    @NoAutoDetect
    class Body @JsonCreator private constructor(
        @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("project_id") @ExcludeMissing private val projectId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("score_type") @ExcludeMissing private val scoreType: JsonField<ScoreType> = JsonMissing.of(),
        @JsonProperty("categories") @ExcludeMissing private val categories: JsonField<Categories> = JsonMissing.of(),
        @JsonProperty("config") @ExcludeMissing private val config: JsonField<ProjectScoreConfig> = JsonMissing.of(),
        @JsonProperty("description") @ExcludeMissing private val description: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),

    ) {

        /** Name of the project score */
        fun name(): String = name.getRequired("name")

        /** Unique identifier for the project that the project score belongs under */
        fun projectId(): String = projectId.getRequired("project_id")

        /** The type of the configured score */
        fun scoreType(): ScoreType = scoreType.getRequired("score_type")

        /** For categorical-type project scores, the list of all categories */
        fun categories(): Optional<Categories> = Optional.ofNullable(categories.getNullable("categories"))

        fun config(): Optional<ProjectScoreConfig> = Optional.ofNullable(config.getNullable("config"))

        /** Textual description of the project score */
        fun description(): Optional<String> = Optional.ofNullable(description.getNullable("description"))

        /** Name of the project score */
        @JsonProperty("name")
        @ExcludeMissing
        fun _name(): JsonField<String> = name

        /** Unique identifier for the project that the project score belongs under */
        @JsonProperty("project_id")
        @ExcludeMissing
        fun _projectId(): JsonField<String> = projectId

        /** The type of the configured score */
        @JsonProperty("score_type")
        @ExcludeMissing
        fun _scoreType(): JsonField<ScoreType> = scoreType

        /** For categorical-type project scores, the list of all categories */
        @JsonProperty("categories")
        @ExcludeMissing
        fun _categories(): JsonField<Categories> = categories

        @JsonProperty("config")
        @ExcludeMissing
        fun _config(): JsonField<ProjectScoreConfig> = config

        /** Textual description of the project score */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Body =
            apply {
                if (validated) {
                  return@apply
                }

                name()
                projectId()
                scoreType()
                categories().ifPresent { it.validate() }
                config().ifPresent { it.validate() }
                description()
                validated = true
            }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             *
             * ```java
             * .name()
             * .projectId()
             * .scoreType()
             * ```
             */
            @JvmStatic
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var name: JsonField<String>? = null
            private var projectId: JsonField<String>? = null
            private var scoreType: JsonField<ScoreType>? = null
            private var categories: JsonField<Categories> = JsonMissing.of()
            private var config: JsonField<ProjectScoreConfig> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) =
                apply {
                    name = body.name
                    projectId = body.projectId
                    scoreType = body.scoreType
                    categories = body.categories
                    config = body.config
                    description = body.description
                    additionalProperties = body.additionalProperties.toMutableMap()
                }

            /** Name of the project score */
            fun name(name: String) = name(JsonField.of(name))

            /** Name of the project score */
            fun name(name: JsonField<String>) =
                apply {
                    this.name = name
                }

            /** Unique identifier for the project that the project score belongs under */
            fun projectId(projectId: String) = projectId(JsonField.of(projectId))

            /** Unique identifier for the project that the project score belongs under */
            fun projectId(projectId: JsonField<String>) =
                apply {
                    this.projectId = projectId
                }

            /** The type of the configured score */
            fun scoreType(scoreType: ScoreType) = scoreType(JsonField.of(scoreType))

            /** The type of the configured score */
            fun scoreType(scoreType: JsonField<ScoreType>) =
                apply {
                    this.scoreType = scoreType
                }

            /** For categorical-type project scores, the list of all categories */
            fun categories(categories: Categories) = categories(JsonField.of(categories))

            /** For categorical-type project scores, the list of all categories */
            fun categories(categories: JsonField<Categories>) =
                apply {
                    this.categories = categories
                }

            /** For categorical-type project scores, the list of all categories */
            fun categoriesOfCategorical(categorical: List<ProjectScoreCategory>) = categories(Categories.ofCategorical(categorical))

            /** For weighted-type project scores, the weights of each score */
            fun categories(weighted: Categories.Weighted) = categories(Categories.ofWeighted(weighted))

            /** For minimum-type project scores, the list of included scores */
            fun categoriesOfMinimum(minimum: List<String>) = categories(Categories.ofMinimum(minimum))

            /** For categorical-type project scores, the list of all categories */
            fun categories(nullableVariant: Categories.NullableVariant) = categories(Categories.ofNullableVariant(nullableVariant))

            fun config(config: ProjectScoreConfig?) = config(JsonField.ofNullable(config))

            fun config(config: Optional<ProjectScoreConfig>) = config(config.getOrNull())

            fun config(config: JsonField<ProjectScoreConfig>) =
                apply {
                    this.config = config
                }

            /** Textual description of the project score */
            fun description(description: String?) = description(JsonField.ofNullable(description))

            /** Textual description of the project score */
            fun description(description: Optional<String>) = description(description.getOrNull())

            /** Textual description of the project score */
            fun description(description: JsonField<String>) =
                apply {
                    this.description = description
                }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

            fun putAdditionalProperty(key: String, value: JsonValue) =
                apply {
                    additionalProperties.put(key, value)
                }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun removeAdditionalProperty(key: String) =
                apply {
                    additionalProperties.remove(key)
                }

            fun removeAllAdditionalProperties(keys: Set<String>) =
                apply {
                    keys.forEach(::removeAdditionalProperty)
                }

            fun build(): Body =
                Body(
                  checkRequired(
                    "name", name
                  ),
                  checkRequired(
                    "projectId", projectId
                  ),
                  checkRequired(
                    "scoreType", scoreType
                  ),
                  categories,
                  config,
                  description,
                  additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return /* spotless:off */ other is Body && name == other.name && projectId == other.projectId && scoreType == other.scoreType && categories == other.categories && config == other.config && description == other.description && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(name, projectId, scoreType, categories, config, description, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Body{name=$name, projectId=$projectId, scoreType=$scoreType, categories=$categories, config=$config, description=$description, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [ProjectScoreReplaceParams].
         *
         * The following fields are required:
         *
         * ```java
         * .name()
         * .projectId()
         * .scoreType()
         * ```
         */
        @JvmStatic
        fun builder() = Builder()
    }

    /** A builder for [ProjectScoreReplaceParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(projectScoreReplaceParams: ProjectScoreReplaceParams) =
            apply {
                body = projectScoreReplaceParams.body.toBuilder()
                additionalHeaders = projectScoreReplaceParams.additionalHeaders.toBuilder()
                additionalQueryParams = projectScoreReplaceParams.additionalQueryParams.toBuilder()
            }

        /** Name of the project score */
        fun name(name: String) =
            apply {
                body.name(name)
            }

        /** Name of the project score */
        fun name(name: JsonField<String>) =
            apply {
                body.name(name)
            }

        /** Unique identifier for the project that the project score belongs under */
        fun projectId(projectId: String) =
            apply {
                body.projectId(projectId)
            }

        /** Unique identifier for the project that the project score belongs under */
        fun projectId(projectId: JsonField<String>) =
            apply {
                body.projectId(projectId)
            }

        /** The type of the configured score */
        fun scoreType(scoreType: ScoreType) =
            apply {
                body.scoreType(scoreType)
            }

        /** The type of the configured score */
        fun scoreType(scoreType: JsonField<ScoreType>) =
            apply {
                body.scoreType(scoreType)
            }

        /** For categorical-type project scores, the list of all categories */
        fun categories(categories: Categories) =
            apply {
                body.categories(categories)
            }

        /** For categorical-type project scores, the list of all categories */
        fun categories(categories: JsonField<Categories>) =
            apply {
                body.categories(categories)
            }

        /** For categorical-type project scores, the list of all categories */
        fun categoriesOfCategorical(categorical: List<ProjectScoreCategory>) =
            apply {
                body.categoriesOfCategorical(categorical)
            }

        /** For weighted-type project scores, the weights of each score */
        fun categories(weighted: Categories.Weighted) =
            apply {
                body.categories(weighted)
            }

        /** For minimum-type project scores, the list of included scores */
        fun categoriesOfMinimum(minimum: List<String>) =
            apply {
                body.categoriesOfMinimum(minimum)
            }

        /** For categorical-type project scores, the list of all categories */
        fun categories(nullableVariant: Categories.NullableVariant) =
            apply {
                body.categories(nullableVariant)
            }

        fun config(config: ProjectScoreConfig?) =
            apply {
                body.config(config)
            }

        fun config(config: Optional<ProjectScoreConfig>) = config(config.getOrNull())

        fun config(config: JsonField<ProjectScoreConfig>) =
            apply {
                body.config(config)
            }

        /** Textual description of the project score */
        fun description(description: String?) =
            apply {
                body.description(description)
            }

        /** Textual description of the project score */
        fun description(description: Optional<String>) = description(description.getOrNull())

        /** Textual description of the project score */
        fun description(description: JsonField<String>) =
            apply {
                body.description(description)
            }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.additionalProperties(additionalBodyProperties)
            }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) =
            apply {
                body.putAdditionalProperty(
                  key, value
                )
            }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) =
            apply {
                body.removeAdditionalProperty(key)
            }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) =
            apply {
                body.removeAllAdditionalProperties(keys)
            }

        fun additionalHeaders(additionalHeaders: Headers) =
            apply {
                this.additionalHeaders.clear()
                putAllAdditionalHeaders(additionalHeaders)
            }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) =
            apply {
                this.additionalHeaders.clear()
                putAllAdditionalHeaders(additionalHeaders)
            }

        fun putAdditionalHeader(name: String, value: String) =
            apply {
                additionalHeaders.put(name, value)
            }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) =
            apply {
                additionalHeaders.put(name, values)
            }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) =
            apply {
                this.additionalHeaders.putAll(additionalHeaders)
            }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) =
            apply {
                this.additionalHeaders.putAll(additionalHeaders)
            }

        fun replaceAdditionalHeaders(name: String, value: String) =
            apply {
                additionalHeaders.replace(name, value)
            }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) =
            apply {
                additionalHeaders.replace(name, values)
            }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) =
            apply {
                this.additionalHeaders.replaceAll(additionalHeaders)
            }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) =
            apply {
                this.additionalHeaders.replaceAll(additionalHeaders)
            }

        fun removeAdditionalHeaders(name: String) =
            apply {
                additionalHeaders.remove(name)
            }

        fun removeAllAdditionalHeaders(names: Set<String>) =
            apply {
                additionalHeaders.removeAll(names)
            }

        fun additionalQueryParams(additionalQueryParams: QueryParams) =
            apply {
                this.additionalQueryParams.clear()
                putAllAdditionalQueryParams(additionalQueryParams)
            }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.clear()
                putAllAdditionalQueryParams(additionalQueryParams)
            }

        fun putAdditionalQueryParam(key: String, value: String) =
            apply {
                additionalQueryParams.put(key, value)
            }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) =
            apply {
                additionalQueryParams.put(key, values)
            }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) =
            apply {
                additionalQueryParams.replace(key, value)
            }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) =
            apply {
                additionalQueryParams.replace(key, values)
            }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) =
            apply {
                additionalQueryParams.remove(key)
            }

        fun removeAllAdditionalQueryParams(keys: Set<String>) =
            apply {
                additionalQueryParams.removeAll(keys)
            }

        fun build(): ProjectScoreReplaceParams =
            ProjectScoreReplaceParams(
              body.build(),
              additionalHeaders.build(),
              additionalQueryParams.build(),
            )
    }

    /** The type of the configured score */
    class ScoreType @JsonCreator private constructor(
        private val value: JsonField<String>,

    ) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that
         * doesn't match any known member, and you want to know that value. For example, if
         * the SDK is on an older version than the API, then the API may respond with new
         * members that the SDK is unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue
        fun _value(): JsonField<String> = value

        companion object {

            @JvmField val SLIDER = of("slider")

            @JvmField val CATEGORICAL = of("categorical")

            @JvmField val WEIGHTED = of("weighted")

            @JvmField val MINIMUM = of("minimum")

            @JvmField val MAXIMUM = of("maximum")

            @JvmField val ONLINE = of("online")

            @JvmStatic fun of(value: String) = ScoreType(JsonField.of(value))
        }

        /** An enum containing [ScoreType]'s known values. */
        enum class Known {
            SLIDER,
            CATEGORICAL,
            WEIGHTED,
            MINIMUM,
            MAXIMUM,
            ONLINE,
        }

        /**
         * An enum containing [ScoreType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ScoreType] can contain an unknown value in a couple of cases:
         *
         * - It was deserialized from data that doesn't match any known member. For
         *   example, if the SDK is on an older version than the API, then the API may
         *   respond with new members that the SDK is unaware of.
         *
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            SLIDER,
            CATEGORICAL,
            WEIGHTED,
            MINIMUM,
            MAXIMUM,
            ONLINE,
            /**
             * An enum member indicating that [ScoreType] was instantiated with an unknown
             * value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or
         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if
         * you want to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                SLIDER -> Value.SLIDER
                CATEGORICAL -> Value.CATEGORICAL
                WEIGHTED -> Value.WEIGHTED
                MINIMUM -> Value.MINIMUM
                MAXIMUM -> Value.MAXIMUM
                ONLINE -> Value.ONLINE
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and
         * don't want to throw for the unknown case.
         *
         * @throws BraintrustInvalidDataException if this class instance's value is a not a
         * known member.
         */
        fun known(): Known =
            when (this) {
                SLIDER -> Known.SLIDER
                CATEGORICAL -> Known.CATEGORICAL
                WEIGHTED -> Known.WEIGHTED
                MINIMUM -> Known.MINIMUM
                MAXIMUM -> Known.MAXIMUM
                ONLINE -> Known.ONLINE
                else -> throw BraintrustInvalidDataException("Unknown ScoreType: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for
         * debugging and generally doesn't throw.
         *
         * @throws BraintrustInvalidDataException if this class instance's value does not
         * have the expected primitive type.
         */
        fun asString(): String = _value().asString().orElseThrow { BraintrustInvalidDataException("Value is not a String") }

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return /* spotless:off */ other is ScoreType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** For categorical-type project scores, the list of all categories */
    @JsonDeserialize(using = Categories.Deserializer::class)
    @JsonSerialize(using = Categories.Serializer::class)
    class Categories private constructor(
        private val categorical: List<ProjectScoreCategory>? = null,
        private val weighted: Weighted? = null,
        private val minimum: List<String>? = null,
        private val nullableVariant: NullableVariant? = null,
        private val _json: JsonValue? = null,

    ) {

        /** For categorical-type project scores, the list of all categories */
        fun categorical(): Optional<List<ProjectScoreCategory>> = Optional.ofNullable(categorical)

        /** For weighted-type project scores, the weights of each score */
        fun weighted(): Optional<Weighted> = Optional.ofNullable(weighted)

        /** For minimum-type project scores, the list of included scores */
        fun minimum(): Optional<List<String>> = Optional.ofNullable(minimum)

        fun nullableVariant(): Optional<NullableVariant> = Optional.ofNullable(nullableVariant)

        fun isCategorical(): Boolean = categorical != null

        fun isWeighted(): Boolean = weighted != null

        fun isMinimum(): Boolean = minimum != null

        fun isNullableVariant(): Boolean = nullableVariant != null

        /** For categorical-type project scores, the list of all categories */
        fun asCategorical(): List<ProjectScoreCategory> = categorical.getOrThrow("categorical")

        /** For weighted-type project scores, the weights of each score */
        fun asWeighted(): Weighted = weighted.getOrThrow("weighted")

        /** For minimum-type project scores, the list of included scores */
        fun asMinimum(): List<String> = minimum.getOrThrow("minimum")

        fun asNullableVariant(): NullableVariant = nullableVariant.getOrThrow("nullableVariant")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T {
          return when {
              categorical != null -> visitor.visitCategorical(categorical)
              weighted != null -> visitor.visitWeighted(weighted)
              minimum != null -> visitor.visitMinimum(minimum)
              nullableVariant != null -> visitor.visitNullableVariant(nullableVariant)
              else -> visitor.unknown(_json)
          }
        }

        private var validated: Boolean = false

        fun validate(): Categories =
            apply {
                if (validated) {
                  return@apply
                }

                accept(object : Visitor<Unit> {
                    override fun visitCategorical(categorical: List<ProjectScoreCategory>) {
                      categorical.forEach { it.validate() }
                    }

                    override fun visitWeighted(weighted: Weighted) {
                      weighted.validate()
                    }

                    override fun visitMinimum(minimum: List<String>) {

                    }

                    override fun visitNullableVariant(nullableVariant: NullableVariant) {
                      nullableVariant.validate()
                    }
                })
                validated = true
            }

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return /* spotless:off */ other is Categories && categorical == other.categorical && weighted == other.weighted && minimum == other.minimum && nullableVariant == other.nullableVariant /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(categorical, weighted, minimum, nullableVariant) /* spotless:on */

        override fun toString(): String =
            when {
                categorical != null -> "Categories{categorical=$categorical}"
                weighted != null -> "Categories{weighted=$weighted}"
                minimum != null -> "Categories{minimum=$minimum}"
                nullableVariant != null -> "Categories{nullableVariant=$nullableVariant}"
                _json != null -> "Categories{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Categories")
            }

        companion object {

            /** For categorical-type project scores, the list of all categories */
            @JvmStatic
            fun ofCategorical(categorical: List<ProjectScoreCategory>) = Categories(categorical = categorical)

            /** For weighted-type project scores, the weights of each score */
            @JvmStatic
            fun ofWeighted(weighted: Weighted) = Categories(weighted = weighted)

            /** For minimum-type project scores, the list of included scores */
            @JvmStatic
            fun ofMinimum(minimum: List<String>) = Categories(minimum = minimum)

            @JvmStatic
            fun ofNullableVariant(nullableVariant: NullableVariant) = Categories(nullableVariant = nullableVariant)
        }

        /**
         * An interface that defines how to map each variant of [Categories] to a value of
         * type [T].
         */
        interface Visitor<out T> {

            /** For categorical-type project scores, the list of all categories */
            fun visitCategorical(categorical: List<ProjectScoreCategory>): T

            /** For weighted-type project scores, the weights of each score */
            fun visitWeighted(weighted: Weighted): T

            /** For minimum-type project scores, the list of included scores */
            fun visitMinimum(minimum: List<String>): T

            fun visitNullableVariant(nullableVariant: NullableVariant): T

            /**
             * Maps an unknown variant of [Categories] to a value of type [T].
             *
             * An instance of [Categories] can contain an unknown variant if it was
             * deserialized from data that doesn't match any known variant. For example, if the
             * SDK is on an older version than the API, then the API may respond with new
             * variants that the SDK is unaware of.
             *
             * @throws BraintrustInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
              throw BraintrustInvalidDataException("Unknown Categories: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Categories>(Categories::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Categories {
              val json = JsonValue.fromJsonNode(node)

              tryDeserialize(node, jacksonTypeRef<List<ProjectScoreCategory>>()){ it.forEach { it.validate() } }?.let {
                  return Categories(categorical = it, _json = json)
              }
              tryDeserialize(node, jacksonTypeRef<Weighted>()){ it.validate() }?.let {
                  return Categories(weighted = it, _json = json)
              }
              tryDeserialize(node, jacksonTypeRef<List<String>>())?.let {
                  return Categories(minimum = it, _json = json)
              }
              tryDeserialize(node, jacksonTypeRef<NullableVariant>()){ it.validate() }?.let {
                  return Categories(nullableVariant = it, _json = json)
              }

              return Categories(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<Categories>(Categories::class) {

            override fun serialize(value: Categories, generator: JsonGenerator, provider: SerializerProvider) {
              when {
                  value.categorical != null -> generator.writeObject(value.categorical)
                  value.weighted != null -> generator.writeObject(value.weighted)
                  value.minimum != null -> generator.writeObject(value.minimum)
                  value.nullableVariant != null -> generator.writeObject(value.nullableVariant)
                  value._json != null -> generator.writeObject(value._json)
                  else -> throw IllegalStateException("Invalid Categories")
              }
            }
        }

        /** For weighted-type project scores, the weights of each score */
        @NoAutoDetect
        class Weighted @JsonCreator private constructor(
            @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),

        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Weighted =
                apply {
                    if (validated) {
                      return@apply
                    }

                    validated = true
                }

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [Weighted]. */
                @JvmStatic
                fun builder() = Builder()
            }

            /** A builder for [Weighted]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(weighted: Weighted) =
                    apply {
                        additionalProperties = weighted.additionalProperties.toMutableMap()
                    }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                fun putAdditionalProperty(key: String, value: JsonValue) =
                    apply {
                        additionalProperties.put(key, value)
                    }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) =
                    apply {
                        additionalProperties.remove(key)
                    }

                fun removeAllAdditionalProperties(keys: Set<String>) =
                    apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                fun build(): Weighted = Weighted(additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
              if (this === other) {
                  return true
              }

              return /* spotless:off */ other is Weighted && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "Weighted{additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class NullableVariant @JsonCreator private constructor(
            @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),

        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): NullableVariant =
                apply {
                    if (validated) {
                      return@apply
                    }

                    validated = true
                }

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [NullableVariant]. */
                @JvmStatic
                fun builder() = Builder()
            }

            /** A builder for [NullableVariant]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(nullableVariant: NullableVariant) =
                    apply {
                        additionalProperties = nullableVariant.additionalProperties.toMutableMap()
                    }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                fun putAdditionalProperty(key: String, value: JsonValue) =
                    apply {
                        additionalProperties.put(key, value)
                    }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) =
                    apply {
                        additionalProperties.remove(key)
                    }

                fun removeAllAdditionalProperties(keys: Set<String>) =
                    apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                fun build(): NullableVariant = NullableVariant(additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
              if (this === other) {
                  return true
              }

              return /* spotless:off */ other is NullableVariant && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "NullableVariant{additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return /* spotless:off */ other is ProjectScoreReplaceParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() = "ProjectScoreReplaceParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
