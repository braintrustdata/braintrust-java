// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.BaseDeserializer
import com.braintrustdata.api.core.BaseSerializer
import com.braintrustdata.api.core.Enum
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.getOrThrow
import com.braintrustdata.api.core.http.Headers
import com.braintrustdata.api.core.http.QueryParams
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
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
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

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic
    internal fun getQueryParams(): QueryParams {
        val queryParams = QueryParams.builder()
        this.endingBefore?.let { queryParams.put("ending_before", listOf(it.toString())) }
        this.ids?.let { queryParams.put("ids", listOf(it.toString())) }
        this.limit?.let { queryParams.put("limit", listOf(it.toString())) }
        this.orgName?.let { queryParams.put("org_name", listOf(it.toString())) }
        this.projectId?.let { queryParams.put("project_id", listOf(it.toString())) }
        this.projectName?.let { queryParams.put("project_name", listOf(it.toString())) }
        this.projectScoreName?.let { queryParams.put("project_score_name", listOf(it.toString())) }
        this.scoreType?.let { queryParams.put("score_type", listOf(it.toString())) }
        this.startingAfter?.let { queryParams.put("starting_after", listOf(it.toString())) }
        queryParams.putAll(additionalQueryParams)
        return queryParams.build()
    }

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ProjectScoreListParams && this.endingBefore == other.endingBefore && this.ids == other.ids && this.limit == other.limit && this.orgName == other.orgName && this.projectId == other.projectId && this.projectName == other.projectName && this.projectScoreName == other.projectScoreName && this.scoreType == other.scoreType && this.startingAfter == other.startingAfter && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(endingBefore, ids, limit, orgName, projectId, projectName, projectScoreName, scoreType, startingAfter, additionalHeaders, additionalQueryParams) /* spotless:on */
    }

    override fun toString() =
        "ProjectScoreListParams{endingBefore=$endingBefore, ids=$ids, limit=$limit, orgName=$orgName, projectId=$projectId, projectName=$projectName, projectScoreName=$projectScoreName, scoreType=$scoreType, startingAfter=$startingAfter, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"

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
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

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
            additionalHeaders(projectScoreListParams.additionalHeaders)
            additionalQueryParams(projectScoreListParams.additionalQueryParams)
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
        fun idsOfStrings(strings: List<String>) = apply { this.ids = Ids.ofStrings(strings) }

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
        fun scoreType(projectScoreType: ScoreType.ProjectScoreType) = apply {
            this.scoreType = ScoreType.ofProjectScoreType(projectScoreType)
        }

        /** The type of the configured score */
        fun scoreTypeOfProjectScoreTypes(projectScoreTypes: List<ProjectScoreType>) = apply {
            this.scoreType = ScoreType.ofProjectScoreTypes(projectScoreTypes)
        }

        /**
         * Pagination cursor id.
         *
         * For example, if the final item in the last page you fetched had an id of `foo`, pass
         * `starting_after=foo` to fetch the next page. Note: you may only pass one of
         * `starting_after` and `ending_before`
         */
        fun startingAfter(startingAfter: String) = apply { this.startingAfter = startingAfter }

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
                additionalHeaders.build(),
                additionalQueryParams.build(),
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

            return /* spotless:off */ other is Ids && this.string == other.string && this.strings == other.strings /* spotless:on */
        }

        override fun hashCode(): Int {
            return /* spotless:off */ Objects.hash(string, strings) /* spotless:on */
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
        private val projectScoreType: ProjectScoreType? = null,
        private val projectScoreTypes: List<ProjectScoreType>? = null,
        private val _json: JsonValue? = null,
    ) {

        private var validated: Boolean = false

        /** The type of the configured score */
        fun projectScoreType(): Optional<ProjectScoreType> = Optional.ofNullable(projectScoreType)
        /** The type of the configured score */
        fun projectScoreTypes(): Optional<List<ProjectScoreType>> =
            Optional.ofNullable(projectScoreTypes)

        fun isProjectScoreType(): Boolean = projectScoreType != null

        fun isProjectScoreTypes(): Boolean = projectScoreTypes != null

        fun asProjectScoreType(): ProjectScoreType = projectScoreType.getOrThrow("projectScoreType")

        fun asProjectScoreTypes(): List<ProjectScoreType> =
            projectScoreTypes.getOrThrow("projectScoreTypes")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                projectScoreType != null -> visitor.visitProjectScoreType(projectScoreType)
                projectScoreTypes != null -> visitor.visitProjectScoreTypes(projectScoreTypes)
                else -> visitor.unknown(_json)
            }
        }

        fun validate(): ScoreType = apply {
            if (!validated) {
                if (projectScoreType == null && projectScoreTypes == null) {
                    throw BraintrustInvalidDataException("Unknown ScoreType: $_json")
                }
                validated = true
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ScoreType && this.projectScoreType == other.projectScoreType && this.projectScoreTypes == other.projectScoreTypes /* spotless:on */
        }

        override fun hashCode(): Int {
            return /* spotless:off */ Objects.hash(projectScoreType, projectScoreTypes) /* spotless:on */
        }

        override fun toString(): String {
            return when {
                projectScoreType != null -> "ScoreType{projectScoreType=$projectScoreType}"
                projectScoreTypes != null -> "ScoreType{projectScoreTypes=$projectScoreTypes}"
                _json != null -> "ScoreType{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid ScoreType")
            }
        }

        companion object {

            @JvmStatic
            fun ofProjectScoreType(projectScoreType: ProjectScoreType) =
                ScoreType(projectScoreType = projectScoreType)

            @JvmStatic
            fun ofProjectScoreTypes(projectScoreTypes: List<ProjectScoreType>) =
                ScoreType(projectScoreTypes = projectScoreTypes)
        }

        interface Visitor<out T> {

            fun visitProjectScoreType(projectScoreType: ProjectScoreType): T

            fun visitProjectScoreTypes(projectScoreTypes: List<ProjectScoreType>): T

            fun unknown(json: JsonValue?): T {
                throw BraintrustInvalidDataException("Unknown ScoreType: $json")
            }
        }

        class Deserializer : BaseDeserializer<ScoreType>(ScoreType::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): ScoreType {
                val json = JsonValue.fromJsonNode(node)

                tryDeserialize(node, jacksonTypeRef<ProjectScoreType>())?.let {
                    return ScoreType(projectScoreType = it, _json = json)
                }
                tryDeserialize(node, jacksonTypeRef<List<ProjectScoreType>>())?.let {
                    return ScoreType(projectScoreTypes = it, _json = json)
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
                    value.projectScoreType != null -> generator.writeObject(value.projectScoreType)
                    value.projectScoreTypes != null ->
                        generator.writeObject(value.projectScoreTypes)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid ScoreType")
                }
            }
        }

        class ProjectScoreType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ProjectScoreType && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val SLIDER = ProjectScoreType(JsonField.of("slider"))

                @JvmField val CATEGORICAL = ProjectScoreType(JsonField.of("categorical"))

                @JvmField val WEIGHTED = ProjectScoreType(JsonField.of("weighted"))

                @JvmField val MINIMUM = ProjectScoreType(JsonField.of("minimum"))

                @JvmField val MAXIMUM = ProjectScoreType(JsonField.of("maximum"))

                @JvmField val ONLINE = ProjectScoreType(JsonField.of("online"))

                @JvmStatic fun of(value: String) = ProjectScoreType(JsonField.of(value))
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
                    else -> throw BraintrustInvalidDataException("Unknown ProjectScoreType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        class ProjectScoreType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ProjectScoreType && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val SLIDER = ProjectScoreType(JsonField.of("slider"))

                @JvmField val CATEGORICAL = ProjectScoreType(JsonField.of("categorical"))

                @JvmField val WEIGHTED = ProjectScoreType(JsonField.of("weighted"))

                @JvmField val MINIMUM = ProjectScoreType(JsonField.of("minimum"))

                @JvmField val MAXIMUM = ProjectScoreType(JsonField.of("maximum"))

                @JvmField val ONLINE = ProjectScoreType(JsonField.of("online"))

                @JvmStatic fun of(value: String) = ProjectScoreType(JsonField.of(value))
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
                    else -> throw BraintrustInvalidDataException("Unknown ProjectScoreType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }
    }
}
