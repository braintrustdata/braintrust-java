// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.BaseDeserializer
import com.braintrustdata.api.core.BaseSerializer
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
 * Partially update a project_score object. Specify the fields to update in the payload. Any
 * object-type fields will be deep-merged with existing content. Currently we do not support
 * removing fields or setting them to null.
 */
class ProjectScoreUpdateParams
private constructor(
    private val projectScoreId: String,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** ProjectScore id */
    fun projectScoreId(): String = projectScoreId

    /**
     * For categorical-type project scores, the list of all categories
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun categories(): Optional<Categories> = body.categories()

    /**
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun config(): Optional<ProjectScoreConfig> = body.config()

    /**
     * Textual description of the project score
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = body.description()

    /**
     * Name of the project score
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = body.name()

    /**
     * The type of the configured score
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun scoreType(): Optional<ProjectScoreType> = body.scoreType()

    /**
     * Returns the raw JSON value of [categories].
     *
     * Unlike [categories], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _categories(): JsonField<Categories> = body._categories()

    /**
     * Returns the raw JSON value of [config].
     *
     * Unlike [config], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _config(): JsonField<ProjectScoreConfig> = body._config()

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _description(): JsonField<String> = body._description()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [scoreType].
     *
     * Unlike [scoreType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _scoreType(): JsonField<ProjectScoreType> = body._scoreType()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> projectScoreId
            else -> ""
        }
    }

    /** A project score is a user-configured score, which can be manually-labeled through the UI */
    @NoAutoDetect
    class Body
    @JsonCreator
    private constructor(
        @JsonProperty("categories")
        @ExcludeMissing
        private val categories: JsonField<Categories> = JsonMissing.of(),
        @JsonProperty("config")
        @ExcludeMissing
        private val config: JsonField<ProjectScoreConfig> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        private val description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("score_type")
        @ExcludeMissing
        private val scoreType: JsonField<ProjectScoreType> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * For categorical-type project scores, the list of all categories
         *
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun categories(): Optional<Categories> =
            Optional.ofNullable(categories.getNullable("categories"))

        /**
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun config(): Optional<ProjectScoreConfig> =
            Optional.ofNullable(config.getNullable("config"))

        /**
         * Textual description of the project score
         *
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun description(): Optional<String> =
            Optional.ofNullable(description.getNullable("description"))

        /**
         * Name of the project score
         *
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

        /**
         * The type of the configured score
         *
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun scoreType(): Optional<ProjectScoreType> =
            Optional.ofNullable(scoreType.getNullable("score_type"))

        /**
         * Returns the raw JSON value of [categories].
         *
         * Unlike [categories], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("categories")
        @ExcludeMissing
        fun _categories(): JsonField<Categories> = categories

        /**
         * Returns the raw JSON value of [config].
         *
         * Unlike [config], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("config")
        @ExcludeMissing
        fun _config(): JsonField<ProjectScoreConfig> = config

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [scoreType].
         *
         * Unlike [scoreType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("score_type")
        @ExcludeMissing
        fun _scoreType(): JsonField<ProjectScoreType> = scoreType

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            categories().ifPresent { it.validate() }
            config().ifPresent { it.validate() }
            description()
            name()
            scoreType()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var categories: JsonField<Categories> = JsonMissing.of()
            private var config: JsonField<ProjectScoreConfig> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var scoreType: JsonField<ProjectScoreType> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                categories = body.categories
                config = body.config
                description = body.description
                name = body.name
                scoreType = body.scoreType
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** For categorical-type project scores, the list of all categories */
            fun categories(categories: Categories?) = categories(JsonField.ofNullable(categories))

            /** Alias for calling [Builder.categories] with `categories.orElse(null)`. */
            fun categories(categories: Optional<Categories>) = categories(categories.getOrNull())

            /**
             * Sets [Builder.categories] to an arbitrary JSON value.
             *
             * You should usually call [Builder.categories] with a well-typed [Categories] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun categories(categories: JsonField<Categories>) = apply {
                this.categories = categories
            }

            /** Alias for calling [categories] with `Categories.ofCategorical(categorical)`. */
            fun categoriesOfCategorical(categorical: List<ProjectScoreCategory>) =
                categories(Categories.ofCategorical(categorical))

            /** Alias for calling [categories] with `Categories.ofWeighted(weighted)`. */
            fun categories(weighted: Categories.Weighted) =
                categories(Categories.ofWeighted(weighted))

            /** Alias for calling [categories] with `Categories.ofMinimum(minimum)`. */
            fun categoriesOfMinimum(minimum: List<String>) =
                categories(Categories.ofMinimum(minimum))

            fun config(config: ProjectScoreConfig?) = config(JsonField.ofNullable(config))

            /** Alias for calling [Builder.config] with `config.orElse(null)`. */
            fun config(config: Optional<ProjectScoreConfig>) = config(config.getOrNull())

            /**
             * Sets [Builder.config] to an arbitrary JSON value.
             *
             * You should usually call [Builder.config] with a well-typed [ProjectScoreConfig] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun config(config: JsonField<ProjectScoreConfig>) = apply { this.config = config }

            /** Textual description of the project score */
            fun description(description: String?) = description(JsonField.ofNullable(description))

            /** Alias for calling [Builder.description] with `description.orElse(null)`. */
            fun description(description: Optional<String>) = description(description.getOrNull())

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /** Name of the project score */
            fun name(name: String?) = name(JsonField.ofNullable(name))

            /** Alias for calling [Builder.name] with `name.orElse(null)`. */
            fun name(name: Optional<String>) = name(name.getOrNull())

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** The type of the configured score */
            fun scoreType(scoreType: ProjectScoreType?) = scoreType(JsonField.ofNullable(scoreType))

            /** Alias for calling [Builder.scoreType] with `scoreType.orElse(null)`. */
            fun scoreType(scoreType: Optional<ProjectScoreType>) = scoreType(scoreType.getOrNull())

            /**
             * Sets [Builder.scoreType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.scoreType] with a well-typed [ProjectScoreType]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun scoreType(scoreType: JsonField<ProjectScoreType>) = apply {
                this.scoreType = scoreType
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

            fun build(): Body =
                Body(
                    categories,
                    config,
                    description,
                    name,
                    scoreType,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && categories == other.categories && config == other.config && description == other.description && name == other.name && scoreType == other.scoreType && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(categories, config, description, name, scoreType, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{categories=$categories, config=$config, description=$description, name=$name, scoreType=$scoreType, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ProjectScoreUpdateParams].
         *
         * The following fields are required:
         * ```java
         * .projectScoreId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ProjectScoreUpdateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var projectScoreId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(projectScoreUpdateParams: ProjectScoreUpdateParams) = apply {
            projectScoreId = projectScoreUpdateParams.projectScoreId
            body = projectScoreUpdateParams.body.toBuilder()
            additionalHeaders = projectScoreUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = projectScoreUpdateParams.additionalQueryParams.toBuilder()
        }

        /** ProjectScore id */
        fun projectScoreId(projectScoreId: String) = apply { this.projectScoreId = projectScoreId }

        /** For categorical-type project scores, the list of all categories */
        fun categories(categories: Categories?) = apply { body.categories(categories) }

        /** Alias for calling [Builder.categories] with `categories.orElse(null)`. */
        fun categories(categories: Optional<Categories>) = categories(categories.getOrNull())

        /**
         * Sets [Builder.categories] to an arbitrary JSON value.
         *
         * You should usually call [Builder.categories] with a well-typed [Categories] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun categories(categories: JsonField<Categories>) = apply { body.categories(categories) }

        /** Alias for calling [categories] with `Categories.ofCategorical(categorical)`. */
        fun categoriesOfCategorical(categorical: List<ProjectScoreCategory>) = apply {
            body.categoriesOfCategorical(categorical)
        }

        /** Alias for calling [categories] with `Categories.ofWeighted(weighted)`. */
        fun categories(weighted: Categories.Weighted) = apply { body.categories(weighted) }

        /** Alias for calling [categories] with `Categories.ofMinimum(minimum)`. */
        fun categoriesOfMinimum(minimum: List<String>) = apply { body.categoriesOfMinimum(minimum) }

        fun config(config: ProjectScoreConfig?) = apply { body.config(config) }

        /** Alias for calling [Builder.config] with `config.orElse(null)`. */
        fun config(config: Optional<ProjectScoreConfig>) = config(config.getOrNull())

        /**
         * Sets [Builder.config] to an arbitrary JSON value.
         *
         * You should usually call [Builder.config] with a well-typed [ProjectScoreConfig] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun config(config: JsonField<ProjectScoreConfig>) = apply { body.config(config) }

        /** Textual description of the project score */
        fun description(description: String?) = apply { body.description(description) }

        /** Alias for calling [Builder.description] with `description.orElse(null)`. */
        fun description(description: Optional<String>) = description(description.getOrNull())

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        /** Name of the project score */
        fun name(name: String?) = apply { body.name(name) }

        /** Alias for calling [Builder.name] with `name.orElse(null)`. */
        fun name(name: Optional<String>) = name(name.getOrNull())

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /** The type of the configured score */
        fun scoreType(scoreType: ProjectScoreType?) = apply { body.scoreType(scoreType) }

        /** Alias for calling [Builder.scoreType] with `scoreType.orElse(null)`. */
        fun scoreType(scoreType: Optional<ProjectScoreType>) = scoreType(scoreType.getOrNull())

        /**
         * Sets [Builder.scoreType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scoreType] with a well-typed [ProjectScoreType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun scoreType(scoreType: JsonField<ProjectScoreType>) = apply { body.scoreType(scoreType) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        fun build(): ProjectScoreUpdateParams =
            ProjectScoreUpdateParams(
                checkRequired("projectScoreId", projectScoreId),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    /** For categorical-type project scores, the list of all categories */
    @JsonDeserialize(using = Categories.Deserializer::class)
    @JsonSerialize(using = Categories.Serializer::class)
    class Categories
    private constructor(
        private val categorical: List<ProjectScoreCategory>? = null,
        private val weighted: Weighted? = null,
        private val minimum: List<String>? = null,
        private val _json: JsonValue? = null,
    ) {

        /** For categorical-type project scores, the list of all categories */
        fun categorical(): Optional<List<ProjectScoreCategory>> = Optional.ofNullable(categorical)

        /** For weighted-type project scores, the weights of each score */
        fun weighted(): Optional<Weighted> = Optional.ofNullable(weighted)

        /** For minimum-type project scores, the list of included scores */
        fun minimum(): Optional<List<String>> = Optional.ofNullable(minimum)

        fun isCategorical(): Boolean = categorical != null

        fun isWeighted(): Boolean = weighted != null

        fun isMinimum(): Boolean = minimum != null

        /** For categorical-type project scores, the list of all categories */
        fun asCategorical(): List<ProjectScoreCategory> = categorical.getOrThrow("categorical")

        /** For weighted-type project scores, the weights of each score */
        fun asWeighted(): Weighted = weighted.getOrThrow("weighted")

        /** For minimum-type project scores, the list of included scores */
        fun asMinimum(): List<String> = minimum.getOrThrow("minimum")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                categorical != null -> visitor.visitCategorical(categorical)
                weighted != null -> visitor.visitWeighted(weighted)
                minimum != null -> visitor.visitMinimum(minimum)
                else -> visitor.unknown(_json)
            }
        }

        private var validated: Boolean = false

        fun validate(): Categories = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitCategorical(categorical: List<ProjectScoreCategory>) {
                        categorical.forEach { it.validate() }
                    }

                    override fun visitWeighted(weighted: Weighted) {
                        weighted.validate()
                    }

                    override fun visitMinimum(minimum: List<String>) {}
                }
            )
            validated = true
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Categories && categorical == other.categorical && weighted == other.weighted && minimum == other.minimum /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(categorical, weighted, minimum) /* spotless:on */

        override fun toString(): String =
            when {
                categorical != null -> "Categories{categorical=$categorical}"
                weighted != null -> "Categories{weighted=$weighted}"
                minimum != null -> "Categories{minimum=$minimum}"
                _json != null -> "Categories{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Categories")
            }

        companion object {

            /** For categorical-type project scores, the list of all categories */
            @JvmStatic
            fun ofCategorical(categorical: List<ProjectScoreCategory>) =
                Categories(categorical = categorical)

            /** For weighted-type project scores, the weights of each score */
            @JvmStatic fun ofWeighted(weighted: Weighted) = Categories(weighted = weighted)

            /** For minimum-type project scores, the list of included scores */
            @JvmStatic fun ofMinimum(minimum: List<String>) = Categories(minimum = minimum)
        }

        /**
         * An interface that defines how to map each variant of [Categories] to a value of type [T].
         */
        interface Visitor<out T> {

            /** For categorical-type project scores, the list of all categories */
            fun visitCategorical(categorical: List<ProjectScoreCategory>): T

            /** For weighted-type project scores, the weights of each score */
            fun visitWeighted(weighted: Weighted): T

            /** For minimum-type project scores, the list of included scores */
            fun visitMinimum(minimum: List<String>): T

            /**
             * Maps an unknown variant of [Categories] to a value of type [T].
             *
             * An instance of [Categories] can contain an unknown variant if it was deserialized
             * from data that doesn't match any known variant. For example, if the SDK is on an
             * older version than the API, then the API may respond with new variants that the SDK
             * is unaware of.
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

                tryDeserialize(node, jacksonTypeRef<List<ProjectScoreCategory>>()) {
                        it.forEach { it.validate() }
                    }
                    ?.let {
                        return Categories(categorical = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<Weighted>()) { it.validate() }
                    ?.let {
                        return Categories(weighted = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<List<String>>())?.let {
                    return Categories(minimum = it, _json = json)
                }

                return Categories(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<Categories>(Categories::class) {

            override fun serialize(
                value: Categories,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.categorical != null -> generator.writeObject(value.categorical)
                    value.weighted != null -> generator.writeObject(value.weighted)
                    value.minimum != null -> generator.writeObject(value.minimum)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Categories")
                }
            }
        }

        /** For weighted-type project scores, the weights of each score */
        @NoAutoDetect
        class Weighted
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Weighted = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [Weighted]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Weighted]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(weighted: Weighted) = apply {
                    additionalProperties = weighted.additionalProperties.toMutableMap()
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
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
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ProjectScoreUpdateParams && projectScoreId == other.projectScoreId && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(projectScoreId, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ProjectScoreUpdateParams{projectScoreId=$projectScoreId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
