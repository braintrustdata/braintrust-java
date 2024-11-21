// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.BaseDeserializer
import com.braintrustdata.api.core.BaseSerializer
import com.braintrustdata.api.core.Enum
import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.getOrThrow
import com.braintrustdata.api.core.http.Headers
import com.braintrustdata.api.core.http.QueryParams
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

class ProjectScoreUpdateParams
constructor(
    private val projectScoreId: String,
    private val categories: Categories?,
    private val config: ProjectScoreConfig?,
    private val description: String?,
    private val name: String?,
    private val scoreType: ScoreType?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun projectScoreId(): String = projectScoreId

    fun categories(): Optional<Categories> = Optional.ofNullable(categories)

    fun config(): Optional<ProjectScoreConfig> = Optional.ofNullable(config)

    fun description(): Optional<String> = Optional.ofNullable(description)

    fun name(): Optional<String> = Optional.ofNullable(name)

    fun scoreType(): Optional<ScoreType> = Optional.ofNullable(scoreType)

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

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

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
        private val scoreType: ScoreType?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** For categorical-type project scores, the list of all categories */
        @JsonProperty("categories") fun categories(): Categories? = categories

        @JsonProperty("config") fun config(): ProjectScoreConfig? = config

        /** Textual description of the project score */
        @JsonProperty("description") fun description(): String? = description

        /** Name of the project score */
        @JsonProperty("name") fun name(): String? = name

        /** The type of the configured score */
        @JsonProperty("score_type") fun scoreType(): ScoreType? = scoreType

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
            private var scoreType: ScoreType? = null
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

            /** For categorical-type project scores, the list of all categories */
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
            fun scoreType(scoreType: ScoreType) = apply { this.scoreType = scoreType }

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
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ProjectScoreUpdateBody && categories == other.categories && config == other.config && description == other.description && name == other.name && scoreType == other.scoreType && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(categories, config, description, name, scoreType, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ProjectScoreUpdateBody{categories=$categories, config=$config, description=$description, name=$name, scoreType=$scoreType, additionalProperties=$additionalProperties}"
    }

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ProjectScoreUpdateParams && projectScoreId == other.projectScoreId && categories == other.categories && config == other.config && description == other.description && name == other.name && scoreType == other.scoreType && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(projectScoreId, categories, config, description, name, scoreType, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "ProjectScoreUpdateParams{projectScoreId=$projectScoreId, categories=$categories, config=$config, description=$description, name=$name, scoreType=$scoreType, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

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
        private var scoreType: ScoreType? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(projectScoreUpdateParams: ProjectScoreUpdateParams) = apply {
            this.projectScoreId = projectScoreUpdateParams.projectScoreId
            this.categories = projectScoreUpdateParams.categories
            this.config = projectScoreUpdateParams.config
            this.description = projectScoreUpdateParams.description
            this.name = projectScoreUpdateParams.name
            this.scoreType = projectScoreUpdateParams.scoreType
            additionalHeaders(projectScoreUpdateParams.additionalHeaders)
            additionalQueryParams(projectScoreUpdateParams.additionalQueryParams)
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
        fun scoreType(scoreType: ScoreType) = apply { this.scoreType = scoreType }

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

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            putAllAdditionalBodyProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply {
            additionalBodyProperties.remove(key)
        }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalBodyProperty)
        }

        fun build(): ProjectScoreUpdateParams =
            ProjectScoreUpdateParams(
                checkNotNull(projectScoreId) { "`projectScoreId` is required but was not set" },
                categories,
                config,
                description,
                name,
                scoreType,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
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

    class ScoreType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ScoreType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val SLIDER = ScoreType(JsonField.of("slider"))

            @JvmField val CATEGORICAL = ScoreType(JsonField.of("categorical"))

            @JvmField val WEIGHTED = ScoreType(JsonField.of("weighted"))

            @JvmField val MINIMUM = ScoreType(JsonField.of("minimum"))

            @JvmField val MAXIMUM = ScoreType(JsonField.of("maximum"))

            @JvmField val ONLINE = ScoreType(JsonField.of("online"))

            @JvmStatic fun of(value: String) = ScoreType(JsonField.of(value))
        }

        enum class Known {
            SLIDER,
            CATEGORICAL,
            WEIGHTED,
            MINIMUM,
            MAXIMUM,
            ONLINE,
        }

        enum class Value {
            SLIDER,
            CATEGORICAL,
            WEIGHTED,
            MINIMUM,
            MAXIMUM,
            ONLINE,
            _UNKNOWN,
        }

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

        fun asString(): String = _value().asStringOrThrow()
    }
}
