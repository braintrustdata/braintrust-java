// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.BaseDeserializer
import com.braintrustdata.api.core.BaseSerializer
import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonMissing
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
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

/** A project score is a user-configured score, which can be manually-labeled through the UI */
@JsonDeserialize(builder = ProjectScore.Builder::class)
@NoAutoDetect
class ProjectScore
private constructor(
    private val id: JsonField<String>,
    private val projectId: JsonField<String>,
    private val userId: JsonField<String>,
    private val created: JsonField<OffsetDateTime>,
    private val name: JsonField<String>,
    private val description: JsonField<String>,
    private val scoreType: JsonField<ProjectScoreType>,
    private val categories: JsonField<Categories>,
    private val config: JsonField<ProjectScoreConfig>,
    private val position: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /** Unique identifier for the project score */
    fun id(): String = id.getRequired("id")

    /** Unique identifier for the project that the project score belongs under */
    fun projectId(): String = projectId.getRequired("project_id")

    fun userId(): String = userId.getRequired("user_id")

    /** Date of project score creation */
    fun created(): Optional<OffsetDateTime> = Optional.ofNullable(created.getNullable("created"))

    /** Name of the project score */
    fun name(): String = name.getRequired("name")

    /** Textual description of the project score */
    fun description(): Optional<String> =
        Optional.ofNullable(description.getNullable("description"))

    /** The type of the configured score */
    fun scoreType(): ProjectScoreType = scoreType.getRequired("score_type")

    /** For categorical-type project scores, the list of all categories */
    fun categories(): Optional<Categories> =
        Optional.ofNullable(categories.getNullable("categories"))

    fun config(): Optional<ProjectScoreConfig> = Optional.ofNullable(config.getNullable("config"))

    /** An optional LexoRank-based string that sets the sort position for the score in the UI */
    fun position(): Optional<String> = Optional.ofNullable(position.getNullable("position"))

    /** Unique identifier for the project score */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /** Unique identifier for the project that the project score belongs under */
    @JsonProperty("project_id") @ExcludeMissing fun _projectId() = projectId

    @JsonProperty("user_id") @ExcludeMissing fun _userId() = userId

    /** Date of project score creation */
    @JsonProperty("created") @ExcludeMissing fun _created() = created

    /** Name of the project score */
    @JsonProperty("name") @ExcludeMissing fun _name() = name

    /** Textual description of the project score */
    @JsonProperty("description") @ExcludeMissing fun _description() = description

    /** The type of the configured score */
    @JsonProperty("score_type") @ExcludeMissing fun _scoreType() = scoreType

    /** For categorical-type project scores, the list of all categories */
    @JsonProperty("categories") @ExcludeMissing fun _categories() = categories

    @JsonProperty("config") @ExcludeMissing fun _config() = config

    /** An optional LexoRank-based string that sets the sort position for the score in the UI */
    @JsonProperty("position") @ExcludeMissing fun _position() = position

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): ProjectScore = apply {
        if (!validated) {
            id()
            projectId()
            userId()
            created()
            name()
            description()
            scoreType()
            categories()
            config().map { it.validate() }
            position()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var projectId: JsonField<String> = JsonMissing.of()
        private var userId: JsonField<String> = JsonMissing.of()
        private var created: JsonField<OffsetDateTime> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var scoreType: JsonField<ProjectScoreType> = JsonMissing.of()
        private var categories: JsonField<Categories> = JsonMissing.of()
        private var config: JsonField<ProjectScoreConfig> = JsonMissing.of()
        private var position: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(projectScore: ProjectScore) = apply {
            this.id = projectScore.id
            this.projectId = projectScore.projectId
            this.userId = projectScore.userId
            this.created = projectScore.created
            this.name = projectScore.name
            this.description = projectScore.description
            this.scoreType = projectScore.scoreType
            this.categories = projectScore.categories
            this.config = projectScore.config
            this.position = projectScore.position
            additionalProperties(projectScore.additionalProperties)
        }

        /** Unique identifier for the project score */
        fun id(id: String) = id(JsonField.of(id))

        /** Unique identifier for the project score */
        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        /** Unique identifier for the project that the project score belongs under */
        fun projectId(projectId: String) = projectId(JsonField.of(projectId))

        /** Unique identifier for the project that the project score belongs under */
        @JsonProperty("project_id")
        @ExcludeMissing
        fun projectId(projectId: JsonField<String>) = apply { this.projectId = projectId }

        fun userId(userId: String) = userId(JsonField.of(userId))

        @JsonProperty("user_id")
        @ExcludeMissing
        fun userId(userId: JsonField<String>) = apply { this.userId = userId }

        /** Date of project score creation */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /** Date of project score creation */
        @JsonProperty("created")
        @ExcludeMissing
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /** Name of the project score */
        fun name(name: String) = name(JsonField.of(name))

        /** Name of the project score */
        @JsonProperty("name")
        @ExcludeMissing
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Textual description of the project score */
        fun description(description: String) = description(JsonField.of(description))

        /** Textual description of the project score */
        @JsonProperty("description")
        @ExcludeMissing
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** The type of the configured score */
        fun scoreType(scoreType: ProjectScoreType) = scoreType(JsonField.of(scoreType))

        /** The type of the configured score */
        @JsonProperty("score_type")
        @ExcludeMissing
        fun scoreType(scoreType: JsonField<ProjectScoreType>) = apply { this.scoreType = scoreType }

        /** For categorical-type project scores, the list of all categories */
        fun categories(categories: Categories) = categories(JsonField.of(categories))

        /** For categorical-type project scores, the list of all categories */
        @JsonProperty("categories")
        @ExcludeMissing
        fun categories(categories: JsonField<Categories>) = apply { this.categories = categories }

        fun config(config: ProjectScoreConfig) = config(JsonField.of(config))

        @JsonProperty("config")
        @ExcludeMissing
        fun config(config: JsonField<ProjectScoreConfig>) = apply { this.config = config }

        /** An optional LexoRank-based string that sets the sort position for the score in the UI */
        fun position(position: String) = position(JsonField.of(position))

        /** An optional LexoRank-based string that sets the sort position for the score in the UI */
        @JsonProperty("position")
        @ExcludeMissing
        fun position(position: JsonField<String>) = apply { this.position = position }

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

        fun build(): ProjectScore =
            ProjectScore(
                id,
                projectId,
                userId,
                created,
                name,
                description,
                scoreType,
                categories,
                config,
                position,
                additionalProperties.toUnmodifiable(),
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ProjectScore && this.id == other.id && this.projectId == other.projectId && this.userId == other.userId && this.created == other.created && this.name == other.name && this.description == other.description && this.scoreType == other.scoreType && this.categories == other.categories && this.config == other.config && this.position == other.position && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(id, projectId, userId, created, name, description, scoreType, categories, config, position, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() =
        "ProjectScore{id=$id, projectId=$projectId, userId=$userId, created=$created, name=$name, description=$description, scoreType=$scoreType, categories=$categories, config=$config, position=$position, additionalProperties=$additionalProperties}"
}
