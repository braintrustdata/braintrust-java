// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.toUnmodifiable
import com.braintrustdata.api.models.*
import java.util.Objects
import java.util.Optional

class ProjectListParams
constructor(
    private val endingBefore: String?,
    private val limit: Long?,
    private val orgName: String?,
    private val projectName: String?,
    private val startingAfter: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
) {

    fun endingBefore(): Optional<String> = Optional.ofNullable(endingBefore)

    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    fun orgName(): Optional<String> = Optional.ofNullable(orgName)

    fun projectName(): Optional<String> = Optional.ofNullable(projectName)

    fun startingAfter(): Optional<String> = Optional.ofNullable(startingAfter)

    @JvmSynthetic
    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.endingBefore?.let { params.put("ending_before", listOf(it.toString())) }
        this.limit?.let { params.put("limit", listOf(it.toString())) }
        this.orgName?.let { params.put("org_name", listOf(it.toString())) }
        this.projectName?.let { params.put("project_name", listOf(it.toString())) }
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

        return other is ProjectListParams &&
            this.endingBefore == other.endingBefore &&
            this.limit == other.limit &&
            this.orgName == other.orgName &&
            this.projectName == other.projectName &&
            this.startingAfter == other.startingAfter &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders
    }

    override fun hashCode(): Int {
        return Objects.hash(
            endingBefore,
            limit,
            orgName,
            projectName,
            startingAfter,
            additionalQueryParams,
            additionalHeaders,
        )
    }

    override fun toString() =
        "ProjectListParams{endingBefore=$endingBefore, limit=$limit, orgName=$orgName, projectName=$projectName, startingAfter=$startingAfter, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var endingBefore: String? = null
        private var limit: Long? = null
        private var orgName: String? = null
        private var projectName: String? = null
        private var startingAfter: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

        @JvmSynthetic
        internal fun from(projectListParams: ProjectListParams) = apply {
            this.endingBefore = projectListParams.endingBefore
            this.limit = projectListParams.limit
            this.orgName = projectListParams.orgName
            this.projectName = projectListParams.projectName
            this.startingAfter = projectListParams.startingAfter
            additionalQueryParams(projectListParams.additionalQueryParams)
            additionalHeaders(projectListParams.additionalHeaders)
        }

        /**
         * A cursor for pagination. For example, if the initial item in the last page you fetched
         * had an id of `foo`, pass `ending_before=foo` to fetch the previous page. Note: you may
         * only pass one of `starting_after` and `ending_before`
         */
        fun endingBefore(endingBefore: String) = apply { this.endingBefore = endingBefore }

        /** Limit the number of objects to return */
        fun limit(limit: Long) = apply { this.limit = limit }

        /** Filter search results to within a particular organization */
        fun orgName(orgName: String) = apply { this.orgName = orgName }

        /** Name of the project to search for */
        fun projectName(projectName: String) = apply { this.projectName = projectName }

        /**
         * A cursor for pagination. For example, if the final item in the last page you fetched had
         * an id of `foo`, pass `starting_after=foo` to fetch the next page. Note: you may only pass
         * one of `starting_after` and `ending_before`
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

        fun build(): ProjectListParams =
            ProjectListParams(
                endingBefore,
                limit,
                orgName,
                projectName,
                startingAfter,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            )
    }
}
