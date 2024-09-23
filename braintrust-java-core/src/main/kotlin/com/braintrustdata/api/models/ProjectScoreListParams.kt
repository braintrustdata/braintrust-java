// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.BaseDeserializer
import com.braintrustdata.api.core.BaseSerializer
import com.braintrustdata.api.core.Enum
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.getOrThrow
import com.braintrustdata.api.core.toUnmodifiable
import com.braintrustdata.api.errors.BraintrustInvalidDataException
import com.braintrustdata.api.models.*
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.util.Objects
import java.util.Optional

class ProjectScoreListParams
constructor(
    private val endingBefore: String?,
    private val ids: Ids?,
    private val limit: Long?,
    private val orgName: String?,
    private val projectId: String?,
    private val projectName: String?,
    private val projectScoreName: String?,
    private val scoreType: ScoreType?,
    private val startingAfter: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
) {

    fun endingBefore(): Optional<String> = Optional.ofNullable(endingBefore)

    fun ids(): Optional<Ids> = Optional.ofNullable(ids)

    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    fun orgName(): Optional<String> = Optional.ofNullable(orgName)

    fun projectId(): Optional<String> = Optional.ofNullable(projectId)

    fun projectName(): Optional<String> = Optional.ofNullable(projectName)

    fun projectScoreName(): Optional<String> = Optional.ofNullable(projectScoreName)

    fun scoreType(): Optional<ScoreType> = Optional.ofNullable(scoreType)

    fun startingAfter(): Optional<String> = Optional.ofNullable(startingAfter)

    @JvmSynthetic
    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.endingBefore?.let { params.put("ending_before", listOf(it.toString())) }
        this.ids?.let { params.put("ids", listOf(it.toString())) }
        this.limit?.let { params.put("limit", listOf(it.toString())) }
        this.orgName?.let { params.put("org_name", listOf(it.toString())) }
        this.projectId?.let { params.put("project_id", listOf(it.toString())) }
        this.projectName?.let { params.put("project_name", listOf(it.toString())) }
        this.projectScoreName?.let { params.put("project_score_name", listOf(it.toString())) }
        this.scoreType?.let { params.put("score_type", listOf(it.toString())) }
        this.startingAfter?.let { params.put("starting_after", listOf(it.toString())) }
        params.putAll(additionalQueryParams)
        return params.toUnmodifiable()
    }

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ProjectScoreListParams &&
            this.endingBefore == other.endingBefore &&
            this.ids == other.ids &&
            this.limit == other.limit &&
            this.orgName == other.orgName &&
            this.projectId == other.projectId &&
            this.projectName == other.projectName &&
            this.projectScoreName == other.projectScoreName &&
            this.scoreType == other.scoreType &&
            this.startingAfter == other.startingAfter &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders
    }

    override fun hashCode(): Int {
        return Objects.hash(
            endingBefore,
            ids,
            limit,
            orgName,
            projectId,
            projectName,
            projectScoreName,
            scoreType,
            startingAfter,
            additionalQueryParams,
            additionalHeaders,
        )
    }

    override fun toString() =
        "ProjectScoreListParams{endingBefore=$endingBefore, ids=$ids, limit=$limit, orgName=$orgName, projectId=$projectId, projectName=$projectName, projectScoreName=$projectScoreName, scoreType=$scoreType, startingAfter=$startingAfter, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var endingBefore: String? = null
        private var ids: Ids? = null
        private var limit: Long? = null
        private var orgName: String? = null
        private var projectId: String? = null
        private var projectName: String? = null
        private var projectScoreName: String? = null
        private var scoreType: ScoreType? = null
        private var startingAfter: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

        @JvmSynthetic
        internal fun from(projectScoreListParams: ProjectScoreListParams) = apply {
            this.endingBefore = projectScoreListParams.endingBefore
            this.ids = projectScoreListParams.ids
            this.limit = projectScoreListParams.limit
            this.orgName = projectScoreListParams.orgName
            this.projectId = projectScoreListParams.projectId
            this.projectName = projectScoreListParams.projectName
            this.projectScoreName = projectScoreListParams.projectScoreName
            this.scoreType = projectScoreListParams.scoreType
            this.startingAfter = projectScoreListParams.startingAfter
            additionalQueryParams(projectScoreListParams.additionalQueryParams)
            additionalHeaders(projectScoreListParams.additionalHeaders)
        }

        /**
         * Pagination cursor id.
         *
         * For example, if the initial item in the last page you fetched had an id of `foo`, pass
         * `ending_before=foo` to fetch the previous page. Note: you may only pass one of
         * `starting_after` and `ending_before`
         */
        fun endingBefore(endingBefore: String) = apply { this.endingBefore = endingBefore }

        /**
         * Filter search results to a particular set of object IDs. To specify a list of IDs,
         * include the query param multiple times
         */
        fun ids(ids: Ids) = apply { this.ids = ids }

        /**
         * Filter search results to a particular set of object IDs. To specify a list of IDs,
         * include the query param multiple times
         */
        fun ids(string: String) = apply { this.ids = Ids.ofString(string) }

        /**
         * Filter search results to a particular set of object IDs. To specify a list of IDs,
         * include the query param multiple times
         */
        fun ids(strings: List<String>) = apply { this.ids = Ids.ofStrings(strings) }

        /** Limit the number of objects to return */
        fun limit(limit: Long) = apply { this.limit = limit }

        /** Filter search results to within a particular organization */
        fun orgName(orgName: String) = apply { this.orgName = orgName }

        /** Project id */
        fun projectId(projectId: String) = apply { this.projectId = projectId }

        /** Name of the project to search for */
        fun projectName(projectName: String) = apply { this.projectName = projectName }

        /** Name of the project_score to search for */
        fun projectScoreName(projectScoreName: String) = apply {
            this.projectScoreName = projectScoreName
        }

        /** The type of the configured score */
        fun scoreType(scoreType: ScoreType) = apply { this.scoreType = scoreType }

        /** The type of the configured score */
        fun scoreType(projectScoreSingle: ScoreType.ProjectScoreSingle) = apply {
            this.scoreType = ScoreType.ofProjectScoreSingle(projectScoreSingle)
        }

        /** The type of the configured score */
        fun scoreType(unnamedSchemaWithArrayParent0s: List<UnnamedSchemaWithArrayParent0?>) =
            apply {
                this.scoreType =
                    ScoreType.ofUnnamedSchemaWithArrayParent0s(unnamedSchemaWithArrayParent0s)
            }

        /**
         * Pagination cursor id.
         *
         * For example, if the final item in the last page you fetched had an id of `foo`, pass
         * `starting_after=foo` to fetch the next page. Note: you may only pass one of
         * `starting_after` and `ending_before`
         */
        fun startingAfter(startingAfter: String) = apply { this.startingAfter = startingAfter }

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

        fun build(): ProjectScoreListParams =
            ProjectScoreListParams(
                endingBefore,
                ids,
                limit,
                orgName,
                projectId,
                projectName,
                projectScoreName,
                scoreType,
                startingAfter,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            )
    }

    @JsonDeserialize(using = Ids.Deserializer::class)
    @JsonSerialize(using = Ids.Serializer::class)
    class Ids
    private constructor(
        private val string: String? = null,
        private val strings: List<String>? = null,
        private val _json: JsonValue? = null,
    ) {

        private var validated: Boolean = false

        fun string(): Optional<String> = Optional.ofNullable(string)

        fun strings(): Optional<List<String>> = Optional.ofNullable(strings)

        fun isString(): Boolean = string != null

        fun isStrings(): Boolean = strings != null

        fun asString(): String = string.getOrThrow("string")

        fun asStrings(): List<String> = strings.getOrThrow("strings")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                string != null -> visitor.visitString(string)
                strings != null -> visitor.visitStrings(strings)
                else -> visitor.unknown(_json)
            }
        }

        fun validate(): Ids = apply {
            if (!validated) {
                if (string == null && strings == null) {
                    throw BraintrustInvalidDataException("Unknown Ids: $_json")
                }
                validated = true
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Ids && this.string == other.string && this.strings == other.strings
        }

        override fun hashCode(): Int {
            return Objects.hash(string, strings)
        }

        override fun toString(): String {
            return when {
                string != null -> "Ids{string=$string}"
                strings != null -> "Ids{strings=$strings}"
                _json != null -> "Ids{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Ids")
            }
        }

        companion object {

            @JvmStatic fun ofString(string: String) = Ids(string = string)

            @JvmStatic fun ofStrings(strings: List<String>) = Ids(strings = strings)
        }

        interface Visitor<out T> {

            fun visitString(string: String): T

            fun visitStrings(strings: List<String>): T

            fun unknown(json: JsonValue?): T {
                throw BraintrustInvalidDataException("Unknown Ids: $json")
            }
        }

        class Deserializer : BaseDeserializer<Ids>(Ids::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Ids {
                val json = JsonValue.fromJsonNode(node)
                tryDeserialize(node, jacksonTypeRef<String>())?.let {
                    return Ids(string = it, _json = json)
                }
                tryDeserialize(node, jacksonTypeRef<List<String>>())?.let {
                    return Ids(strings = it, _json = json)
                }

                return Ids(_json = json)
            }
        }

        class Serializer : BaseSerializer<Ids>(Ids::class) {

            override fun serialize(
                value: Ids,
                generator: JsonGenerator,
                provider: SerializerProvider
            ) {
                when {
                    value.string != null -> generator.writeObject(value.string)
                    value.strings != null -> generator.writeObject(value.strings)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Ids")
                }
            }
        }
    }

    @JsonDeserialize(using = ScoreType.Deserializer::class)
    @JsonSerialize(using = ScoreType.Serializer::class)
    class ScoreType
    private constructor(
        private val projectScoreSingle: ProjectScoreSingle? = null,
        private val unnamedSchemaWithArrayParent1s: List<UnnamedSchemaWithArrayParent1?>? = null,
        private val _json: JsonValue? = null,
    ) {

        private var validated: Boolean = false

        /** The type of the configured score */
        fun projectScoreSingle(): Optional<ProjectScoreSingle> =
            Optional.ofNullable(projectScoreSingle)
        /** The type of the configured score */
        fun unnamedSchemaWithArrayParent1s(): Optional<List<UnnamedSchemaWithArrayParent1?>> =
            Optional.ofNullable(unnamedSchemaWithArrayParent1s)

        fun isProjectScoreSingle(): Boolean = projectScoreSingle != null

        fun isUnnamedSchemaWithArrayParent1s(): Boolean = unnamedSchemaWithArrayParent1s != null

        fun asProjectScoreSingle(): ProjectScoreSingle =
            projectScoreSingle.getOrThrow("projectScoreSingle")

        fun asUnnamedSchemaWithArrayParent1s(): List<UnnamedSchemaWithArrayParent1?> =
            unnamedSchemaWithArrayParent1s.getOrThrow("unnamedSchemaWithArrayParent1s")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                projectScoreSingle != null -> visitor.visitProjectScoreSingle(projectScoreSingle)
                unnamedSchemaWithArrayParent1s != null ->
                    visitor.visitUnnamedSchemaWithArrayParent1s(unnamedSchemaWithArrayParent1s)
                else -> visitor.unknown(_json)
            }
        }

        fun validate(): ScoreType = apply {
            if (!validated) {
                if (projectScoreSingle == null && unnamedSchemaWithArrayParent1s == null) {
                    throw BraintrustInvalidDataException("Unknown ScoreType: $_json")
                }
                validated = true
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ScoreType &&
                this.projectScoreSingle == other.projectScoreSingle &&
                this.unnamedSchemaWithArrayParent1s == other.unnamedSchemaWithArrayParent1s
        }

        override fun hashCode(): Int {
            return Objects.hash(projectScoreSingle, unnamedSchemaWithArrayParent1s)
        }

        override fun toString(): String {
            return when {
                projectScoreSingle != null -> "ScoreType{projectScoreSingle=$projectScoreSingle}"
                unnamedSchemaWithArrayParent1s != null ->
                    "ScoreType{unnamedSchemaWithArrayParent1s=$unnamedSchemaWithArrayParent1s}"
                _json != null -> "ScoreType{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid ScoreType")
            }
        }

        companion object {

            @JvmStatic
            fun ofProjectScoreSingle(projectScoreSingle: ProjectScoreSingle) =
                ScoreType(projectScoreSingle = projectScoreSingle)

            @JvmStatic
            fun ofUnnamedSchemaWithArrayParent1s(
                unnamedSchemaWithArrayParent1s: List<UnnamedSchemaWithArrayParent1?>
            ) = ScoreType(unnamedSchemaWithArrayParent1s = unnamedSchemaWithArrayParent1s)
        }

        interface Visitor<out T> {

            fun visitProjectScoreSingle(projectScoreSingle: ProjectScoreSingle): T

            fun visitUnnamedSchemaWithArrayParent1s(
                unnamedSchemaWithArrayParent1s: List<UnnamedSchemaWithArrayParent1?>
            ): T

            fun unknown(json: JsonValue?): T {
                throw BraintrustInvalidDataException("Unknown ScoreType: $json")
            }
        }

        class Deserializer : BaseDeserializer<ScoreType>(ScoreType::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): ScoreType {
                val json = JsonValue.fromJsonNode(node)
                tryDeserialize(node, jacksonTypeRef<ProjectScoreSingle>())?.let {
                    return ScoreType(projectScoreSingle = it, _json = json)
                }
                tryDeserialize(node, jacksonTypeRef<List<UnnamedSchemaWithArrayParent1?>>())?.let {
                    return ScoreType(unnamedSchemaWithArrayParent1s = it, _json = json)
                }

                return ScoreType(_json = json)
            }
        }

        class Serializer : BaseSerializer<ScoreType>(ScoreType::class) {

            override fun serialize(
                value: ScoreType,
                generator: JsonGenerator,
                provider: SerializerProvider
            ) {
                when {
                    value.projectScoreSingle != null ->
                        generator.writeObject(value.projectScoreSingle)
                    value.unnamedSchemaWithArrayParent1s != null ->
                        generator.writeObject(value.unnamedSchemaWithArrayParent1s)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid ScoreType")
                }
            }
        }

        class ProjectScoreSingle
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ProjectScoreSingle && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val SLIDER = ProjectScoreSingle(JsonField.of("slider"))

                @JvmField val CATEGORICAL = ProjectScoreSingle(JsonField.of("categorical"))

                @JvmField val WEIGHTED = ProjectScoreSingle(JsonField.of("weighted"))

                @JvmField val MINIMUM = ProjectScoreSingle(JsonField.of("minimum"))

                @JvmField val ONLINE = ProjectScoreSingle(JsonField.of("online"))

                @JvmStatic fun of(value: String) = ProjectScoreSingle(JsonField.of(value))
            }

            enum class Known {
                SLIDER,
                CATEGORICAL,
                WEIGHTED,
                MINIMUM,
                ONLINE,
            }

            enum class Value {
                SLIDER,
                CATEGORICAL,
                WEIGHTED,
                MINIMUM,
                ONLINE,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    SLIDER -> Value.SLIDER
                    CATEGORICAL -> Value.CATEGORICAL
                    WEIGHTED -> Value.WEIGHTED
                    MINIMUM -> Value.MINIMUM
                    ONLINE -> Value.ONLINE
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    SLIDER -> Known.SLIDER
                    CATEGORICAL -> Known.CATEGORICAL
                    WEIGHTED -> Known.WEIGHTED
                    MINIMUM -> Known.MINIMUM
                    ONLINE -> Known.ONLINE
                    else ->
                        throw BraintrustInvalidDataException("Unknown ProjectScoreSingle: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        class UnnamedSchemaWithArrayParent1
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is UnnamedSchemaWithArrayParent1 && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val SLIDER = UnnamedSchemaWithArrayParent1(JsonField.of("slider"))

                @JvmField
                val CATEGORICAL = UnnamedSchemaWithArrayParent1(JsonField.of("categorical"))

                @JvmField val WEIGHTED = UnnamedSchemaWithArrayParent1(JsonField.of("weighted"))

                @JvmField val MINIMUM = UnnamedSchemaWithArrayParent1(JsonField.of("minimum"))

                @JvmField val ONLINE = UnnamedSchemaWithArrayParent1(JsonField.of("online"))

                @JvmStatic
                fun of(value: String) = UnnamedSchemaWithArrayParent1(JsonField.of(value))
            }

            enum class Known {
                SLIDER,
                CATEGORICAL,
                WEIGHTED,
                MINIMUM,
                ONLINE,
            }

            enum class Value {
                SLIDER,
                CATEGORICAL,
                WEIGHTED,
                MINIMUM,
                ONLINE,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    SLIDER -> Value.SLIDER
                    CATEGORICAL -> Value.CATEGORICAL
                    WEIGHTED -> Value.WEIGHTED
                    MINIMUM -> Value.MINIMUM
                    ONLINE -> Value.ONLINE
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    SLIDER -> Known.SLIDER
                    CATEGORICAL -> Known.CATEGORICAL
                    WEIGHTED -> Known.WEIGHTED
                    MINIMUM -> Known.MINIMUM
                    ONLINE -> Known.ONLINE
                    else ->
                        throw BraintrustInvalidDataException(
                            "Unknown UnnamedSchemaWithArrayParent1: $value"
                        )
                }

            fun asString(): String = _value().asStringOrThrow()
        }
    }
}
