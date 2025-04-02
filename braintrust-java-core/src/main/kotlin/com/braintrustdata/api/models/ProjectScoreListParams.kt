// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.Params
import com.braintrustdata.api.core.getOrThrow
import com.braintrustdata.api.core.http.Headers
import com.braintrustdata.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * List out all project_scores. The project_scores are sorted by creation date, with the most
 * recently-created project_scores coming first
 */
class ProjectScoreListParams
private constructor(
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
) : Params {

    /**
     * Pagination cursor id.
     *
     * For example, if the initial item in the last page you fetched had an id of `foo`, pass
     * `ending_before=foo` to fetch the previous page. Note: you may only pass one of
     * `starting_after` and `ending_before`
     */
    fun endingBefore(): Optional<String> = Optional.ofNullable(endingBefore)

    /**
     * Filter search results to a particular set of object IDs. To specify a list of IDs, include
     * the query param multiple times
     */
    fun ids(): Optional<Ids> = Optional.ofNullable(ids)

    /** Limit the number of objects to return */
    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    /** Filter search results to within a particular organization */
    fun orgName(): Optional<String> = Optional.ofNullable(orgName)

    /** Project id */
    fun projectId(): Optional<String> = Optional.ofNullable(projectId)

    /** Name of the project to search for */
    fun projectName(): Optional<String> = Optional.ofNullable(projectName)

    /** Name of the project_score to search for */
    fun projectScoreName(): Optional<String> = Optional.ofNullable(projectScoreName)

    /** The type of the configured score */
    fun scoreType(): Optional<ScoreType> = Optional.ofNullable(scoreType)

    /**
     * Pagination cursor id.
     *
     * For example, if the final item in the last page you fetched had an id of `foo`, pass
     * `starting_after=foo` to fetch the next page. Note: you may only pass one of `starting_after`
     * and `ending_before`
     */
    fun startingAfter(): Optional<String> = Optional.ofNullable(startingAfter)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): ProjectScoreListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [ProjectScoreListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ProjectScoreListParams]. */
    class Builder internal constructor() {

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
            endingBefore = projectScoreListParams.endingBefore
            ids = projectScoreListParams.ids
            limit = projectScoreListParams.limit
            orgName = projectScoreListParams.orgName
            projectId = projectScoreListParams.projectId
            projectName = projectScoreListParams.projectName
            projectScoreName = projectScoreListParams.projectScoreName
            scoreType = projectScoreListParams.scoreType
            startingAfter = projectScoreListParams.startingAfter
            additionalHeaders = projectScoreListParams.additionalHeaders.toBuilder()
            additionalQueryParams = projectScoreListParams.additionalQueryParams.toBuilder()
        }

        /**
         * Pagination cursor id.
         *
         * For example, if the initial item in the last page you fetched had an id of `foo`, pass
         * `ending_before=foo` to fetch the previous page. Note: you may only pass one of
         * `starting_after` and `ending_before`
         */
        fun endingBefore(endingBefore: String?) = apply { this.endingBefore = endingBefore }

        /** Alias for calling [Builder.endingBefore] with `endingBefore.orElse(null)`. */
        fun endingBefore(endingBefore: Optional<String>) = endingBefore(endingBefore.getOrNull())

        /**
         * Filter search results to a particular set of object IDs. To specify a list of IDs,
         * include the query param multiple times
         */
        fun ids(ids: Ids?) = apply { this.ids = ids }

        /** Alias for calling [Builder.ids] with `ids.orElse(null)`. */
        fun ids(ids: Optional<Ids>) = ids(ids.getOrNull())

        /** Alias for calling [ids] with `Ids.ofString(string)`. */
        fun ids(string: String) = ids(Ids.ofString(string))

        /** Alias for calling [ids] with `Ids.ofStrings(strings)`. */
        fun idsOfStrings(strings: List<String>) = ids(Ids.ofStrings(strings))

        /** Limit the number of objects to return */
        fun limit(limit: Long?) = apply { this.limit = limit }

        /**
         * Alias for [Builder.limit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun limit(limit: Long) = limit(limit as Long?)

        /** Alias for calling [Builder.limit] with `limit.orElse(null)`. */
        fun limit(limit: Optional<Long>) = limit(limit.getOrNull())

        /** Filter search results to within a particular organization */
        fun orgName(orgName: String?) = apply { this.orgName = orgName }

        /** Alias for calling [Builder.orgName] with `orgName.orElse(null)`. */
        fun orgName(orgName: Optional<String>) = orgName(orgName.getOrNull())

        /** Project id */
        fun projectId(projectId: String?) = apply { this.projectId = projectId }

        /** Alias for calling [Builder.projectId] with `projectId.orElse(null)`. */
        fun projectId(projectId: Optional<String>) = projectId(projectId.getOrNull())

        /** Name of the project to search for */
        fun projectName(projectName: String?) = apply { this.projectName = projectName }

        /** Alias for calling [Builder.projectName] with `projectName.orElse(null)`. */
        fun projectName(projectName: Optional<String>) = projectName(projectName.getOrNull())

        /** Name of the project_score to search for */
        fun projectScoreName(projectScoreName: String?) = apply {
            this.projectScoreName = projectScoreName
        }

        /** Alias for calling [Builder.projectScoreName] with `projectScoreName.orElse(null)`. */
        fun projectScoreName(projectScoreName: Optional<String>) =
            projectScoreName(projectScoreName.getOrNull())

        /** The type of the configured score */
        fun scoreType(scoreType: ScoreType?) = apply { this.scoreType = scoreType }

        /** Alias for calling [Builder.scoreType] with `scoreType.orElse(null)`. */
        fun scoreType(scoreType: Optional<ScoreType>) = scoreType(scoreType.getOrNull())

        /** Alias for calling [scoreType] with `ScoreType.ofProject(project)`. */
        fun scoreType(project: ProjectScoreType) = scoreType(ScoreType.ofProject(project))

        /**
         * Alias for calling [scoreType] with `ScoreType.ofProjectScoreTypes(projectScoreTypes)`.
         */
        fun scoreTypeOfProjectScoreTypes(projectScoreTypes: List<ProjectScoreType>) =
            scoreType(ScoreType.ofProjectScoreTypes(projectScoreTypes))

        /**
         * Pagination cursor id.
         *
         * For example, if the final item in the last page you fetched had an id of `foo`, pass
         * `starting_after=foo` to fetch the next page. Note: you may only pass one of
         * `starting_after` and `ending_before`
         */
        fun startingAfter(startingAfter: String?) = apply { this.startingAfter = startingAfter }

        /** Alias for calling [Builder.startingAfter] with `startingAfter.orElse(null)`. */
        fun startingAfter(startingAfter: Optional<String>) =
            startingAfter(startingAfter.getOrNull())

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
         * Returns an immutable instance of [ProjectScoreListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
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

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                endingBefore?.let { put("ending_before", it) }
                ids?.accept(
                    object : Ids.Visitor<Unit> {
                        override fun visitString(string: String) {
                            put("ids", string)
                        }

                        override fun visitStrings(strings: List<String>) {
                            put("ids", strings.joinToString(","))
                        }
                    }
                )
                limit?.let { put("limit", it.toString()) }
                orgName?.let { put("org_name", it) }
                projectId?.let { put("project_id", it) }
                projectName?.let { put("project_name", it) }
                projectScoreName?.let { put("project_score_name", it) }
                scoreType?.accept(
                    object : ScoreType.Visitor<Unit> {
                        override fun visitProject(project: ProjectScoreType) {
                            put("score_type", project.toString())
                        }

                        override fun visitProjectScoreTypes(
                            projectScoreTypes: List<ProjectScoreType>
                        ) {
                            put("score_type", projectScoreTypes.joinToString(",") { it.toString() })
                        }
                    }
                )
                startingAfter?.let { put("starting_after", it) }
                putAll(additionalQueryParams)
            }
            .build()

    /**
     * Filter search results to a particular set of object IDs. To specify a list of IDs, include
     * the query param multiple times
     */
    class Ids
    private constructor(
        private val string: String? = null,
        private val strings: List<String>? = null,
    ) {

        fun string(): Optional<String> = Optional.ofNullable(string)

        fun strings(): Optional<List<String>> = Optional.ofNullable(strings)

        fun isString(): Boolean = string != null

        fun isStrings(): Boolean = strings != null

        fun asString(): String = string.getOrThrow("string")

        fun asStrings(): List<String> = strings.getOrThrow("strings")

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                string != null -> visitor.visitString(string)
                strings != null -> visitor.visitStrings(strings)
                else -> throw IllegalStateException("Invalid Ids")
            }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Ids && string == other.string && strings == other.strings /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(string, strings) /* spotless:on */

        override fun toString(): String =
            when {
                string != null -> "Ids{string=$string}"
                strings != null -> "Ids{strings=$strings}"
                else -> throw IllegalStateException("Invalid Ids")
            }

        companion object {

            @JvmStatic fun ofString(string: String) = Ids(string = string)

            @JvmStatic fun ofStrings(strings: List<String>) = Ids(strings = strings)
        }

        /** An interface that defines how to map each variant of [Ids] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitString(string: String): T

            fun visitStrings(strings: List<String>): T
        }
    }

    /** The type of the configured score */
    class ScoreType
    private constructor(
        private val project: ProjectScoreType? = null,
        private val projectScoreTypes: List<ProjectScoreType>? = null,
    ) {

        /** The type of the configured score */
        fun project(): Optional<ProjectScoreType> = Optional.ofNullable(project)

        /** The type of the configured score */
        fun projectScoreTypes(): Optional<List<ProjectScoreType>> =
            Optional.ofNullable(projectScoreTypes)

        fun isProject(): Boolean = project != null

        fun isProjectScoreTypes(): Boolean = projectScoreTypes != null

        /** The type of the configured score */
        fun asProject(): ProjectScoreType = project.getOrThrow("project")

        /** The type of the configured score */
        fun asProjectScoreTypes(): List<ProjectScoreType> =
            projectScoreTypes.getOrThrow("projectScoreTypes")

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                project != null -> visitor.visitProject(project)
                projectScoreTypes != null -> visitor.visitProjectScoreTypes(projectScoreTypes)
                else -> throw IllegalStateException("Invalid ScoreType")
            }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ScoreType && project == other.project && projectScoreTypes == other.projectScoreTypes /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(project, projectScoreTypes) /* spotless:on */

        override fun toString(): String =
            when {
                project != null -> "ScoreType{project=$project}"
                projectScoreTypes != null -> "ScoreType{projectScoreTypes=$projectScoreTypes}"
                else -> throw IllegalStateException("Invalid ScoreType")
            }

        companion object {

            /** The type of the configured score */
            @JvmStatic fun ofProject(project: ProjectScoreType) = ScoreType(project = project)

            /** The type of the configured score */
            @JvmStatic
            fun ofProjectScoreTypes(projectScoreTypes: List<ProjectScoreType>) =
                ScoreType(projectScoreTypes = projectScoreTypes)
        }

        /**
         * An interface that defines how to map each variant of [ScoreType] to a value of type [T].
         */
        interface Visitor<out T> {

            /** The type of the configured score */
            fun visitProject(project: ProjectScoreType): T

            /** The type of the configured score */
            fun visitProjectScoreTypes(projectScoreTypes: List<ProjectScoreType>): T
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ProjectScoreListParams && endingBefore == other.endingBefore && ids == other.ids && limit == other.limit && orgName == other.orgName && projectId == other.projectId && projectName == other.projectName && projectScoreName == other.projectScoreName && scoreType == other.scoreType && startingAfter == other.startingAfter && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(endingBefore, ids, limit, orgName, projectId, projectName, projectScoreName, scoreType, startingAfter, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ProjectScoreListParams{endingBefore=$endingBefore, ids=$ids, limit=$limit, orgName=$orgName, projectId=$projectId, projectName=$projectName, projectScoreName=$projectScoreName, scoreType=$scoreType, startingAfter=$startingAfter, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
