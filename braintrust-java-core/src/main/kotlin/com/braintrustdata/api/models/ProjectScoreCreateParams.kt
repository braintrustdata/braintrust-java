// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.BaseDeserializer
import com.braintrustdata.api.core.BaseSerializer
import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.getOrThrow
import com.braintrustdata.api.core.toUnmodifiable
import com.braintrustdata.api.errors.BraintrustInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
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

class ProjectScoreCreateParams
constructor(
    private val name: String,
    private val projectId: String,
    private val scoreType: ProjectScoreType,
    private val categories: Categories?,
    private val config: ProjectScoreConfig?,
    private val description: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun name(): String = name

    fun projectId(): String = projectId

    fun scoreType(): ProjectScoreType = scoreType

    fun categories(): Optional<Categories> = Optional.ofNullable(categories)

    fun config(): Optional<ProjectScoreConfig> = Optional.ofNullable(config)

    fun description(): Optional<String> = Optional.ofNullable(description)

    @JvmSynthetic
    internal fun getBody(): ProjectScoreCreateBody {
        return ProjectScoreCreateBody(
            name,
            projectId,
            scoreType,
            categories,
            config,
            description,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    /** A project score is a user-configured score, which can be manually-labeled through the UI */
    @JsonDeserialize(builder = ProjectScoreCreateBody.Builder::class)
    @NoAutoDetect
    class ProjectScoreCreateBody
    internal constructor(
        private val name: String?,
        private val projectId: String?,
        private val scoreType: ProjectScoreType?,
        private val categories: Categories?,
        private val config: ProjectScoreConfig?,
        private val description: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** Name of the project score */
        @JsonProperty("name") fun name(): String? = name

        /** Unique identifier for the project that the project score belongs under */
        @JsonProperty("project_id") fun projectId(): String? = projectId

        /** The type of the configured score */
        @JsonProperty("score_type") fun scoreType(): ProjectScoreType? = scoreType

        @JsonProperty("categories") fun categories(): Categories? = categories

        @JsonProperty("config") fun config(): ProjectScoreConfig? = config

        /** Textual description of the project score */
        @JsonProperty("description") fun description(): String? = description

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
                this.config == other.config &&
                this.description == other.description &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        name,
                        projectId,
                        scoreType,
                        categories,
                        config,
                        description,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "ProjectScoreCreateBody{name=$name, projectId=$projectId, scoreType=$scoreType, categories=$categories, config=$config, description=$description, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var name: String? = null
            private var projectId: String? = null
            private var scoreType: ProjectScoreType? = null
            private var categories: Categories? = null
            private var config: ProjectScoreConfig? = null
            private var description: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(projectScoreCreateBody: ProjectScoreCreateBody) = apply {
                this.name = projectScoreCreateBody.name
                this.projectId = projectScoreCreateBody.projectId
                this.scoreType = projectScoreCreateBody.scoreType
                this.categories = projectScoreCreateBody.categories
                this.config = projectScoreCreateBody.config
                this.description = projectScoreCreateBody.description
                additionalProperties(projectScoreCreateBody.additionalProperties)
            }

            /** Name of the project score */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            /** Unique identifier for the project that the project score belongs under */
            @JsonProperty("project_id")
            fun projectId(projectId: String) = apply { this.projectId = projectId }

            /** The type of the configured score */
            @JsonProperty("score_type")
            fun scoreType(scoreType: ProjectScoreType) = apply { this.scoreType = scoreType }

            @JsonProperty("categories")
            fun categories(categories: Categories) = apply { this.categories = categories }

            @JsonProperty("config")
            fun config(config: ProjectScoreConfig) = apply { this.config = config }

            /** Textual description of the project score */
            @JsonProperty("description")
            fun description(description: String) = apply { this.description = description }

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

            fun build(): ProjectScoreCreateBody =
                ProjectScoreCreateBody(
                    checkNotNull(name) { "`name` is required but was not set" },
                    checkNotNull(projectId) { "`projectId` is required but was not set" },
                    checkNotNull(scoreType) { "`scoreType` is required but was not set" },
                    categories,
                    config,
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
            this.config == other.config &&
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
            config,
            description,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "ProjectScoreCreateParams{name=$name, projectId=$projectId, scoreType=$scoreType, categories=$categories, config=$config, description=$description, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var name: String? = null
        private var projectId: String? = null
        private var scoreType: ProjectScoreType? = null
        private var categories: Categories? = null
        private var config: ProjectScoreConfig? = null
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
            this.config = projectScoreCreateParams.config
            this.description = projectScoreCreateParams.description
            additionalQueryParams(projectScoreCreateParams.additionalQueryParams)
            additionalHeaders(projectScoreCreateParams.additionalHeaders)
            additionalBodyProperties(projectScoreCreateParams.additionalBodyProperties)
        }

        /** Name of the project score */
        fun name(name: String) = apply { this.name = name }

        /** Unique identifier for the project that the project score belongs under */
        fun projectId(projectId: String) = apply { this.projectId = projectId }

        /** The type of the configured score */
        fun scoreType(scoreType: ProjectScoreType) = apply { this.scoreType = scoreType }

        /** For categorical-type project scores, the list of all categories */
        fun categories(categories: Categories) = apply { this.categories = categories }

        /** For categorical-type project scores, the list of all categories */
        fun projectScoreCategories(projectScoreCategories: List<ProjectScoreCategory>) = apply {
            this.categories = Categories.ofProjectScoreCategories(projectScoreCategories)
        }

        /** For categorical-type project scores, the list of all categories */
        fun categories(weighted: Categories.Weighted) = apply {
            this.categories = Categories.ofWeighted(weighted)
        }

        /** For categorical-type project scores, the list of all categories */
        fun categories(strings: List<String>) = apply {
            this.categories = Categories.ofStrings(strings)
        }

        /** For categorical-type project scores, the list of all categories */
        fun categories(nullableVariant: Categories.NullableVariant) = apply {
            this.categories = Categories.ofNullableVariant(nullableVariant)
        }

        fun config(config: ProjectScoreConfig) = apply { this.config = config }

        /** Textual description of the project score */
        fun description(description: String) = apply { this.description = description }

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

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): ProjectScoreCreateParams =
            ProjectScoreCreateParams(
                checkNotNull(name) { "`name` is required but was not set" },
                checkNotNull(projectId) { "`projectId` is required but was not set" },
                checkNotNull(scoreType) { "`scoreType` is required but was not set" },
                categories,
                config,
                description,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(using = Categories.Deserializer::class)
    @JsonSerialize(using = Categories.Serializer::class)
    class Categories
    private constructor(
        private val projectScoreCategories: List<ProjectScoreCategory>? = null,
        private val weighted: Weighted? = null,
        private val strings: List<String>? = null,
        private val nullableVariant: NullableVariant? = null,
        private val _json: JsonValue? = null,
    ) {

        private var validated: Boolean = false

        /** For categorical-type project scores, the list of all categories */
        fun projectScoreCategories(): Optional<List<ProjectScoreCategory>> =
            Optional.ofNullable(projectScoreCategories)
        /** For weighted-type project scores, the weights of each score */
        fun weighted(): Optional<Weighted> = Optional.ofNullable(weighted)
        /** For minimum-type project scores, the list of included scores */
        fun strings(): Optional<List<String>> = Optional.ofNullable(strings)

        fun nullableVariant(): Optional<NullableVariant> = Optional.ofNullable(nullableVariant)

        fun isProjectScoreCategories(): Boolean = projectScoreCategories != null

        fun isWeighted(): Boolean = weighted != null

        fun isStrings(): Boolean = strings != null

        fun isNullableVariant(): Boolean = nullableVariant != null

        fun asProjectScoreCategories(): List<ProjectScoreCategory> =
            projectScoreCategories.getOrThrow("projectScoreCategories")

        fun asWeighted(): Weighted = weighted.getOrThrow("weighted")

        fun asStrings(): List<String> = strings.getOrThrow("strings")

        fun asNullableVariant(): NullableVariant = nullableVariant.getOrThrow("nullableVariant")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                projectScoreCategories != null ->
                    visitor.visitProjectScoreCategories(projectScoreCategories)
                weighted != null -> visitor.visitWeighted(weighted)
                strings != null -> visitor.visitStrings(strings)
                nullableVariant != null -> visitor.visitNullableVariant(nullableVariant)
                else -> visitor.unknown(_json)
            }
        }

        fun validate(): Categories = apply {
            if (!validated) {
                if (
                    projectScoreCategories == null &&
                        weighted == null &&
                        strings == null &&
                        nullableVariant == null
                ) {
                    throw BraintrustInvalidDataException("Unknown Categories: $_json")
                }
                projectScoreCategories?.forEach { it.validate() }
                weighted?.validate()
                nullableVariant?.validate()
                validated = true
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Categories &&
                this.projectScoreCategories == other.projectScoreCategories &&
                this.weighted == other.weighted &&
                this.strings == other.strings &&
                this.nullableVariant == other.nullableVariant
        }

        override fun hashCode(): Int {
            return Objects.hash(
                projectScoreCategories,
                weighted,
                strings,
                nullableVariant,
            )
        }

        override fun toString(): String {
            return when {
                projectScoreCategories != null ->
                    "Categories{projectScoreCategories=$projectScoreCategories}"
                weighted != null -> "Categories{weighted=$weighted}"
                strings != null -> "Categories{strings=$strings}"
                nullableVariant != null -> "Categories{nullableVariant=$nullableVariant}"
                _json != null -> "Categories{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Categories")
            }
        }

        companion object {

            @JvmStatic
            fun ofProjectScoreCategories(projectScoreCategories: List<ProjectScoreCategory>) =
                Categories(projectScoreCategories = projectScoreCategories)

            @JvmStatic fun ofWeighted(weighted: Weighted) = Categories(weighted = weighted)

            @JvmStatic fun ofStrings(strings: List<String>) = Categories(strings = strings)

            @JvmStatic
            fun ofNullableVariant(nullableVariant: NullableVariant) =
                Categories(nullableVariant = nullableVariant)
        }

        interface Visitor<out T> {

            fun visitProjectScoreCategories(projectScoreCategories: List<ProjectScoreCategory>): T

            fun visitWeighted(weighted: Weighted): T

            fun visitStrings(strings: List<String>): T

            fun visitNullableVariant(nullableVariant: NullableVariant): T

            fun unknown(json: JsonValue?): T {
                throw BraintrustInvalidDataException("Unknown Categories: $json")
            }
        }

        class Deserializer : BaseDeserializer<Categories>(Categories::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Categories {
                val json = JsonValue.fromJsonNode(node)
                tryDeserialize(node, jacksonTypeRef<List<ProjectScoreCategory>>()) {
                        it.forEach { it.validate() }
                    }
                    ?.let {
                        return Categories(projectScoreCategories = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<Weighted>()) { it.validate() }
                    ?.let {
                        return Categories(weighted = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<List<String>>())?.let {
                    return Categories(strings = it, _json = json)
                }
                tryDeserialize(node, jacksonTypeRef<NullableVariant>()) { it.validate() }
                    ?.let {
                        return Categories(nullableVariant = it, _json = json)
                    }

                return Categories(_json = json)
            }
        }

        class Serializer : BaseSerializer<Categories>(Categories::class) {

            override fun serialize(
                value: Categories,
                generator: JsonGenerator,
                provider: SerializerProvider
            ) {
                when {
                    value.projectScoreCategories != null ->
                        generator.writeObject(value.projectScoreCategories)
                    value.weighted != null -> generator.writeObject(value.weighted)
                    value.strings != null -> generator.writeObject(value.strings)
                    value.nullableVariant != null -> generator.writeObject(value.nullableVariant)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Categories")
                }
            }
        }

        /** For weighted-type project scores, the weights of each score */
        @JsonDeserialize(builder = Weighted.Builder::class)
        @NoAutoDetect
        class Weighted
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Weighted = apply {
                if (!validated) {
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Weighted && this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = Objects.hash(additionalProperties)
                }
                return hashCode
            }

            override fun toString() = "Weighted{additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(weighted: Weighted) = apply {
                    additionalProperties(weighted.additionalProperties)
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Weighted = Weighted(additionalProperties.toUnmodifiable())
            }
        }

        @JsonDeserialize(builder = NullableVariant.Builder::class)
        @NoAutoDetect
        class NullableVariant
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): NullableVariant = apply {
                if (!validated) {
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is NullableVariant &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = Objects.hash(additionalProperties)
                }
                return hashCode
            }

            override fun toString() = "NullableVariant{additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(nullableVariant: NullableVariant) = apply {
                    additionalProperties(nullableVariant.additionalProperties)
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): NullableVariant =
                    NullableVariant(additionalProperties.toUnmodifiable())
            }
        }
    }
}
