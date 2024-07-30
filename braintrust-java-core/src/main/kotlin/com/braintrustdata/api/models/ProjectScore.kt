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
import com.braintrustdata.api.core.getOrThrow
import com.braintrustdata.api.core.toUnmodifiable
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
    private val scoreType: JsonField<ScoreType>,
    private val categories: JsonField<Categories>,
    private val config: JsonField<Config>,
    private val position: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

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
    fun scoreType(): Optional<ScoreType> = Optional.ofNullable(scoreType.getNullable("score_type"))

    fun categories(): Optional<Categories> =
        Optional.ofNullable(categories.getNullable("categories"))

    fun config(): Optional<Config> = Optional.ofNullable(config.getNullable("config"))

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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ProjectScore &&
            this.id == other.id &&
            this.projectId == other.projectId &&
            this.userId == other.userId &&
            this.created == other.created &&
            this.name == other.name &&
            this.description == other.description &&
            this.scoreType == other.scoreType &&
            this.categories == other.categories &&
            this.config == other.config &&
            this.position == other.position &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
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
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "ProjectScore{id=$id, projectId=$projectId, userId=$userId, created=$created, name=$name, description=$description, scoreType=$scoreType, categories=$categories, config=$config, position=$position, additionalProperties=$additionalProperties}"

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
        private var scoreType: JsonField<ScoreType> = JsonMissing.of()
        private var categories: JsonField<Categories> = JsonMissing.of()
        private var config: JsonField<Config> = JsonMissing.of()
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
        fun scoreType(scoreType: ScoreType) = scoreType(JsonField.of(scoreType))

        /** The type of the configured score */
        @JsonProperty("score_type")
        @ExcludeMissing
        fun scoreType(scoreType: JsonField<ScoreType>) = apply { this.scoreType = scoreType }

        fun categories(categories: Categories) = categories(JsonField.of(categories))

        @JsonProperty("categories")
        @ExcludeMissing
        fun categories(categories: JsonField<Categories>) = apply { this.categories = categories }

        fun config(config: Config) = config(JsonField.of(config))

        @JsonProperty("config")
        @ExcludeMissing
        fun config(config: JsonField<Config>) = apply { this.config = config }

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

            return other is ScoreType && this.value == other.value
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

        fun value(): Value =
            when (this) {
                SLIDER -> Value.SLIDER
                CATEGORICAL -> Value.CATEGORICAL
                WEIGHTED -> Value.WEIGHTED
                MINIMUM -> Value.MINIMUM
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
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

        /** For categorical-type project scores, defines a single category */
        @JsonDeserialize(builder = ProjectScoreCategory.Builder::class)
        @NoAutoDetect
        class ProjectScoreCategory
        private constructor(
            private val name: JsonField<String>,
            private val value: JsonField<Double>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** Name of the category */
            fun name(): String = name.getRequired("name")

            /** Numerical value of the category. Must be between 0 and 1, inclusive */
            fun value(): Double = value.getRequired("value")

            /** Name of the category */
            @JsonProperty("name") @ExcludeMissing fun _name() = name

            /** Numerical value of the category. Must be between 0 and 1, inclusive */
            @JsonProperty("value") @ExcludeMissing fun _value() = value

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
                    hashCode =
                        Objects.hash(
                            name,
                            value,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "ProjectScoreCategory{name=$name, value=$value, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
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
                fun name(name: JsonField<String>) = apply { this.name = name }

                /** Numerical value of the category. Must be between 0 and 1, inclusive */
                fun value(value: Double) = value(JsonField.of(value))

                /** Numerical value of the category. Must be between 0 and 1, inclusive */
                @JsonProperty("value")
                @ExcludeMissing
                fun value(value: JsonField<Double>) = apply { this.value = value }

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

                fun build(): ProjectScoreCategory =
                    ProjectScoreCategory(
                        name,
                        value,
                        additionalProperties.toUnmodifiable(),
                    )
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

    @JsonDeserialize(builder = Config.Builder::class)
    @NoAutoDetect
    class Config
    private constructor(
        private val multiSelect: JsonField<Boolean>,
        private val destination: JsonField<Destination>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        fun multiSelect(): Optional<Boolean> =
            Optional.ofNullable(multiSelect.getNullable("multi_select"))

        fun destination(): Optional<Destination> =
            Optional.ofNullable(destination.getNullable("destination"))

        @JsonProperty("multi_select") @ExcludeMissing fun _multiSelect() = multiSelect

        @JsonProperty("destination") @ExcludeMissing fun _destination() = destination

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Config = apply {
            if (!validated) {
                multiSelect()
                destination()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Config &&
                this.multiSelect == other.multiSelect &&
                this.destination == other.destination &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        multiSelect,
                        destination,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Config{multiSelect=$multiSelect, destination=$destination, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var multiSelect: JsonField<Boolean> = JsonMissing.of()
            private var destination: JsonField<Destination> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(config: Config) = apply {
                this.multiSelect = config.multiSelect
                this.destination = config.destination
                additionalProperties(config.additionalProperties)
            }

            fun multiSelect(multiSelect: Boolean) = multiSelect(JsonField.of(multiSelect))

            @JsonProperty("multi_select")
            @ExcludeMissing
            fun multiSelect(multiSelect: JsonField<Boolean>) = apply {
                this.multiSelect = multiSelect
            }

            fun destination(destination: Destination) = destination(JsonField.of(destination))

            @JsonProperty("destination")
            @ExcludeMissing
            fun destination(destination: JsonField<Destination>) = apply {
                this.destination = destination
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

            fun build(): Config =
                Config(
                    multiSelect,
                    destination,
                    additionalProperties.toUnmodifiable(),
                )
        }

        class Destination
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Destination && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val EXPECTED = Destination(JsonField.of("expected"))

                @JvmStatic fun of(value: String) = Destination(JsonField.of(value))
            }

            enum class Known {
                EXPECTED,
            }

            enum class Value {
                EXPECTED,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    EXPECTED -> Value.EXPECTED
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    EXPECTED -> Known.EXPECTED
                    else -> throw BraintrustInvalidDataException("Unknown Destination: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }
    }
}
