// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.BaseDeserializer
import com.braintrustdata.api.core.BaseSerializer
import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.Params
import com.braintrustdata.api.core.checkRequired
import com.braintrustdata.api.core.getOrThrow
import com.braintrustdata.api.core.http.Headers
import com.braintrustdata.api.core.http.QueryParams
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
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Create a new project_score. If there is an existing project_score in the project with the same
 * name as the one specified in the request, will return the existing project_score unmodified
 */
class ProjectScoreCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Name of the project score
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = body.name()

    /**
     * Unique identifier for the project that the project score belongs under
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun projectId(): String = body.projectId()

    /**
     * The type of the configured score
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun scoreType(): ProjectScoreType = body.scoreType()

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
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [projectId].
     *
     * Unlike [projectId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _projectId(): JsonField<String> = body._projectId()

    /**
     * Returns the raw JSON value of [scoreType].
     *
     * Unlike [scoreType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _scoreType(): JsonField<ProjectScoreType> = body._scoreType()

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

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ProjectScoreCreateParams].
         *
         * The following fields are required:
         * ```java
         * .name()
         * .projectId()
         * .scoreType()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ProjectScoreCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(projectScoreCreateParams: ProjectScoreCreateParams) = apply {
            body = projectScoreCreateParams.body.toBuilder()
            additionalHeaders = projectScoreCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = projectScoreCreateParams.additionalQueryParams.toBuilder()
        }

        /** Name of the project score */
        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /** Unique identifier for the project that the project score belongs under */
        fun projectId(projectId: String) = apply { body.projectId(projectId) }

        /**
         * Sets [Builder.projectId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.projectId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun projectId(projectId: JsonField<String>) = apply { body.projectId(projectId) }

        /** The type of the configured score */
        fun scoreType(scoreType: ProjectScoreType) = apply { body.scoreType(scoreType) }

        /**
         * Sets [Builder.scoreType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scoreType] with a well-typed [ProjectScoreType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun scoreType(scoreType: JsonField<ProjectScoreType>) = apply { body.scoreType(scoreType) }

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

        /**
         * Returns an immutable instance of [ProjectScoreCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .name()
         * .projectId()
         * .scoreType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ProjectScoreCreateParams =
            ProjectScoreCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    @JvmSynthetic internal fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** A project score is a user-configured score, which can be manually-labeled through the UI */
    class Body
    private constructor(
        private val name: JsonField<String>,
        private val projectId: JsonField<String>,
        private val scoreType: JsonField<ProjectScoreType>,
        private val categories: JsonField<Categories>,
        private val config: JsonField<ProjectScoreConfig>,
        private val description: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("project_id")
            @ExcludeMissing
            projectId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("score_type")
            @ExcludeMissing
            scoreType: JsonField<ProjectScoreType> = JsonMissing.of(),
            @JsonProperty("categories")
            @ExcludeMissing
            categories: JsonField<Categories> = JsonMissing.of(),
            @JsonProperty("config")
            @ExcludeMissing
            config: JsonField<ProjectScoreConfig> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
        ) : this(name, projectId, scoreType, categories, config, description, mutableMapOf())

        /**
         * Name of the project score
         *
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * Unique identifier for the project that the project score belongs under
         *
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun projectId(): String = projectId.getRequired("project_id")

        /**
         * The type of the configured score
         *
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun scoreType(): ProjectScoreType = scoreType.getRequired("score_type")

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
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [projectId].
         *
         * Unlike [projectId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("project_id") @ExcludeMissing fun _projectId(): JsonField<String> = projectId

        /**
         * Returns the raw JSON value of [scoreType].
         *
         * Unlike [scoreType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("score_type")
        @ExcludeMissing
        fun _scoreType(): JsonField<ProjectScoreType> = scoreType

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .name()
             * .projectId()
             * .scoreType()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var name: JsonField<String>? = null
            private var projectId: JsonField<String>? = null
            private var scoreType: JsonField<ProjectScoreType>? = null
            private var categories: JsonField<Categories> = JsonMissing.of()
            private var config: JsonField<ProjectScoreConfig> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
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

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** Unique identifier for the project that the project score belongs under */
            fun projectId(projectId: String) = projectId(JsonField.of(projectId))

            /**
             * Sets [Builder.projectId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.projectId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun projectId(projectId: JsonField<String>) = apply { this.projectId = projectId }

            /** The type of the configured score */
            fun scoreType(scoreType: ProjectScoreType) = scoreType(JsonField.of(scoreType))

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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .name()
             * .projectId()
             * .scoreType()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("name", name),
                    checkRequired("projectId", projectId),
                    checkRequired("scoreType", scoreType),
                    categories,
                    config,
                    description,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
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

        override fun toString() =
            "Body{name=$name, projectId=$projectId, scoreType=$scoreType, categories=$categories, config=$config, description=$description, additionalProperties=$additionalProperties}"
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
        class Weighted
        private constructor(private val additionalProperties: MutableMap<String, JsonValue>) {

            @JsonCreator private constructor() : this(mutableMapOf())

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

                /**
                 * Returns an immutable instance of [Weighted].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Weighted = Weighted(additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Weighted = apply {
                if (validated) {
                    return@apply
                }

                validated = true
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

        return /* spotless:off */ other is ProjectScoreCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ProjectScoreCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
