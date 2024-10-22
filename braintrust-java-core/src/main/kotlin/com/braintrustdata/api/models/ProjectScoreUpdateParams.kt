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
import com.braintrustdata.api.models.*
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

class ProjectScoreUpdateParams
constructor(
    private val projectScoreId: String,
    private val categories: Categories?,
    private val config: ProjectScoreConfig?,
    private val description: String?,
    private val name: String?,
    private val scoreType: ProjectScoreType?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun projectScoreId(): String = projectScoreId

    fun categories(): Optional<Categories> = Optional.ofNullable(categories)

    fun config(): Optional<ProjectScoreConfig> = Optional.ofNullable(config)

    fun description(): Optional<String> = Optional.ofNullable(description)

    fun name(): Optional<String> = Optional.ofNullable(name)

    fun scoreType(): Optional<ProjectScoreType> = Optional.ofNullable(scoreType)

    @JvmSynthetic
    internal fun getBody(): ProjectScoreUpdateBody {
        return ProjectScoreUpdateBody(
            categories,
            config,
            description,
            name,
            scoreType,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> projectScoreId
            else -> ""
        }
    }

    /** A project score is a user-configured score, which can be manually-labeled through the UI */
    @JsonDeserialize(builder = ProjectScoreUpdateBody.Builder::class)
    @NoAutoDetect
    class ProjectScoreUpdateBody
    internal constructor(
        private val categories: Categories?,
        private val config: ProjectScoreConfig?,
        private val description: String?,
        private val name: String?,
        private val scoreType: ProjectScoreType?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonProperty("categories") fun categories(): Categories? = categories

        @JsonProperty("config") fun config(): ProjectScoreConfig? = config

        /** Textual description of the project score */
        @JsonProperty("description") fun description(): String? = description

        /** Name of the project score */
        @JsonProperty("name") fun name(): String? = name

        /** The type of the configured score */
        @JsonProperty("score_type") fun scoreType(): ProjectScoreType? = scoreType

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var categories: Categories? = null
            private var config: ProjectScoreConfig? = null
            private var description: String? = null
            private var name: String? = null
            private var scoreType: ProjectScoreType? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(projectScoreUpdateBody: ProjectScoreUpdateBody) = apply {
                this.categories = projectScoreUpdateBody.categories
                this.config = projectScoreUpdateBody.config
                this.description = projectScoreUpdateBody.description
                this.name = projectScoreUpdateBody.name
                this.scoreType = projectScoreUpdateBody.scoreType
                additionalProperties(projectScoreUpdateBody.additionalProperties)
            }

            @JsonProperty("categories")
            fun categories(categories: Categories) = apply { this.categories = categories }

            @JsonProperty("config")
            fun config(config: ProjectScoreConfig) = apply { this.config = config }

            /** Textual description of the project score */
            @JsonProperty("description")
            fun description(description: String) = apply { this.description = description }

            /** Name of the project score */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            /** The type of the configured score */
            @JsonProperty("score_type")
            fun scoreType(scoreType: ProjectScoreType) = apply { this.scoreType = scoreType }

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

            fun build(): ProjectScoreUpdateBody =
                ProjectScoreUpdateBody(
                    categories,
                    config,
                    description,
                    name,
                    scoreType,
                    additionalProperties.toUnmodifiable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ProjectScoreUpdateBody && this.categories == other.categories && this.config == other.config && this.description == other.description && this.name == other.name && this.scoreType == other.scoreType && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(categories, config, description, name, scoreType, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "ProjectScoreUpdateBody{categories=$categories, config=$config, description=$description, name=$name, scoreType=$scoreType, additionalProperties=$additionalProperties}"
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ProjectScoreUpdateParams && this.projectScoreId == other.projectScoreId && this.categories == other.categories && this.config == other.config && this.description == other.description && this.name == other.name && this.scoreType == other.scoreType && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(projectScoreId, categories, config, description, name, scoreType, additionalQueryParams, additionalHeaders, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "ProjectScoreUpdateParams{projectScoreId=$projectScoreId, categories=$categories, config=$config, description=$description, name=$name, scoreType=$scoreType, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var projectScoreId: String? = null
        private var categories: Categories? = null
        private var config: ProjectScoreConfig? = null
        private var description: String? = null
        private var name: String? = null
        private var scoreType: ProjectScoreType? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(projectScoreUpdateParams: ProjectScoreUpdateParams) = apply {
            this.projectScoreId = projectScoreUpdateParams.projectScoreId
            this.categories = projectScoreUpdateParams.categories
            this.config = projectScoreUpdateParams.config
            this.description = projectScoreUpdateParams.description
            this.name = projectScoreUpdateParams.name
            this.scoreType = projectScoreUpdateParams.scoreType
            additionalQueryParams(projectScoreUpdateParams.additionalQueryParams)
            additionalHeaders(projectScoreUpdateParams.additionalHeaders)
            additionalBodyProperties(projectScoreUpdateParams.additionalBodyProperties)
        }

        /** ProjectScore id */
        fun projectScoreId(projectScoreId: String) = apply { this.projectScoreId = projectScoreId }

        /** For categorical-type project scores, the list of all categories */
        fun categories(categories: Categories) = apply { this.categories = categories }

        /** For categorical-type project scores, the list of all categories */
        fun categoriesOfCategorical(categorical: List<ProjectScoreCategory>) = apply {
            this.categories = Categories.ofCategorical(categorical)
        }

        /** For categorical-type project scores, the list of all categories */
        fun categories(weighted: Categories.Weighted) = apply {
            this.categories = Categories.ofWeighted(weighted)
        }

        /** For categorical-type project scores, the list of all categories */
        fun categoriesOfMinimum(minimum: List<String>) = apply {
            this.categories = Categories.ofMinimum(minimum)
        }

        /** For categorical-type project scores, the list of all categories */
        fun categories(nullableVariant: Categories.NullableVariant) = apply {
            this.categories = Categories.ofNullableVariant(nullableVariant)
        }

        fun config(config: ProjectScoreConfig) = apply { this.config = config }

        /** Textual description of the project score */
        fun description(description: String) = apply { this.description = description }

        /** Name of the project score */
        fun name(name: String) = apply { this.name = name }

        /** The type of the configured score */
        fun scoreType(scoreType: ProjectScoreType) = apply { this.scoreType = scoreType }

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

        fun build(): ProjectScoreUpdateParams =
            ProjectScoreUpdateParams(
                checkNotNull(projectScoreId) { "`projectScoreId` is required but was not set" },
                categories,
                config,
                description,
                name,
                scoreType,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(using = Categories.Deserializer::class)
    @JsonSerialize(using = Categories.Serializer::class)
    class Categories
    private constructor(
        private val categorical: List<ProjectScoreCategory>? = null,
        private val weighted: Weighted? = null,
        private val minimum: List<String>? = null,
        private val nullableVariant: NullableVariant? = null,
        private val _json: JsonValue? = null,
    ) {

        private var validated: Boolean = false

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

        fun asCategorical(): List<ProjectScoreCategory> = categorical.getOrThrow("categorical")

        fun asWeighted(): Weighted = weighted.getOrThrow("weighted")

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

        fun validate(): Categories = apply {
            if (!validated) {
                if (
                    categorical == null &&
                        weighted == null &&
                        minimum == null &&
                        nullableVariant == null
                ) {
                    throw BraintrustInvalidDataException("Unknown Categories: $_json")
                }
                categorical?.forEach { it.validate() }
                weighted?.validate()
                nullableVariant?.validate()
                validated = true
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Categories && this.categorical == other.categorical && this.weighted == other.weighted && this.minimum == other.minimum && this.nullableVariant == other.nullableVariant /* spotless:on */
        }

        override fun hashCode(): Int {
            return /* spotless:off */ Objects.hash(categorical, weighted, minimum, nullableVariant) /* spotless:on */
        }

        override fun toString(): String {
            return when {
                categorical != null -> "Categories{categorical=$categorical}"
                weighted != null -> "Categories{weighted=$weighted}"
                minimum != null -> "Categories{minimum=$minimum}"
                nullableVariant != null -> "Categories{nullableVariant=$nullableVariant}"
                _json != null -> "Categories{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Categories")
            }
        }

        companion object {

            @JvmStatic
            fun ofCategorical(categorical: List<ProjectScoreCategory>) =
                Categories(categorical = categorical)

            @JvmStatic fun ofWeighted(weighted: Weighted) = Categories(weighted = weighted)

            @JvmStatic fun ofMinimum(minimum: List<String>) = Categories(minimum = minimum)

            @JvmStatic
            fun ofNullableVariant(nullableVariant: NullableVariant) =
                Categories(nullableVariant = nullableVariant)
        }

        interface Visitor<out T> {

            fun visitCategorical(categorical: List<ProjectScoreCategory>): T

            fun visitWeighted(weighted: Weighted): T

            fun visitMinimum(minimum: List<String>): T

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
                        return Categories(categorical = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<Weighted>()) { it.validate() }
                    ?.let {
                        return Categories(weighted = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<List<String>>())?.let {
                    return Categories(minimum = it, _json = json)
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
        @JsonDeserialize(builder = Weighted.Builder::class)
        @NoAutoDetect
        class Weighted
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Weighted = apply {
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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Weighted && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() = "Weighted{additionalProperties=$additionalProperties}"
        }

        @JsonDeserialize(builder = NullableVariant.Builder::class)
        @NoAutoDetect
        class NullableVariant
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): NullableVariant = apply {
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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is NullableVariant && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() = "NullableVariant{additionalProperties=$additionalProperties}"
        }
    }
}
