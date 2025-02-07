// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.Params
import com.braintrustdata.api.core.checkRequired
import com.braintrustdata.api.core.http.Headers
import com.braintrustdata.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional

/**
 * Fetch the events in a project logs. Equivalent to the POST form of the same path, but with the
 * parameters in the URL query rather than in the request body. For more complex queries, use the
 * `POST /btql` endpoint.
 */
class ProjectLogFetchParams
private constructor(
    private val projectId: String,
    private val limit: Long?,
    private val maxRootSpanId: String?,
    private val maxXactId: String?,
    private val version: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Project id */
    fun projectId(): String = projectId

    /**
     * limit the number of traces fetched
     *
     * Fetch queries may be paginated if the total result size is expected to be large (e.g.
     * project_logs which accumulate over a long time). Note that fetch queries only support
     * pagination in descending time order (from latest to earliest `_xact_id`. Furthermore, later
     * pages may return rows which showed up in earlier pages, except with an earlier `_xact_id`.
     * This happens because pagination occurs over the whole version history of the event log. You
     * will most likely want to exclude any such duplicate, outdated rows (by `id`) from your
     * combined result set.
     *
     * The `limit` parameter controls the number of full traces to return. So you may end up with
     * more individual rows than the specified limit if you are fetching events containing traces.
     */
    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    /**
     * DEPRECATION NOTICE: The manually-constructed pagination cursor is deprecated in favor of the
     * explicit 'cursor' returned by object fetch requests. Please prefer the 'cursor' argument
     * going forwards.
     *
     * Together, `max_xact_id` and `max_root_span_id` form a pagination cursor
     *
     * Since a paginated fetch query returns results in order from latest to earliest, the cursor
     * for the next page can be found as the row with the minimum (earliest) value of the tuple
     * `(_xact_id, root_span_id)`. See the documentation of `limit` for an overview of paginating
     * fetch queries.
     */
    fun maxRootSpanId(): Optional<String> = Optional.ofNullable(maxRootSpanId)

    /**
     * DEPRECATION NOTICE: The manually-constructed pagination cursor is deprecated in favor of the
     * explicit 'cursor' returned by object fetch requests. Please prefer the 'cursor' argument
     * going forwards.
     *
     * Together, `max_xact_id` and `max_root_span_id` form a pagination cursor
     *
     * Since a paginated fetch query returns results in order from latest to earliest, the cursor
     * for the next page can be found as the row with the minimum (earliest) value of the tuple
     * `(_xact_id, root_span_id)`. See the documentation of `limit` for an overview of paginating
     * fetch queries.
     */
    fun maxXactId(): Optional<String> = Optional.ofNullable(maxXactId)

    /**
     * Retrieve a snapshot of events from a past time
     *
     * The version id is essentially a filter on the latest event transaction id. You can use the
     * `max_xact_id` returned by a past fetch as the version to reproduce that exact fetch.
     */
    fun version(): Optional<String> = Optional.ofNullable(version)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams {
        val queryParams = QueryParams.builder()
        this.limit?.let { queryParams.put("limit", listOf(it.toString())) }
        this.maxRootSpanId?.let { queryParams.put("max_root_span_id", listOf(it.toString())) }
        this.maxXactId?.let { queryParams.put("max_xact_id", listOf(it.toString())) }
        this.version?.let { queryParams.put("version", listOf(it.toString())) }
        queryParams.putAll(additionalQueryParams)
        return queryParams.build()
    }

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> projectId
            else -> ""
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ProjectLogFetchParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var projectId: String? = null
        private var limit: Long? = null
        private var maxRootSpanId: String? = null
        private var maxXactId: String? = null
        private var version: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(projectLogFetchParams: ProjectLogFetchParams) = apply {
            projectId = projectLogFetchParams.projectId
            limit = projectLogFetchParams.limit
            maxRootSpanId = projectLogFetchParams.maxRootSpanId
            maxXactId = projectLogFetchParams.maxXactId
            version = projectLogFetchParams.version
            additionalHeaders = projectLogFetchParams.additionalHeaders.toBuilder()
            additionalQueryParams = projectLogFetchParams.additionalQueryParams.toBuilder()
        }

        /** Project id */
        fun projectId(projectId: String) = apply { this.projectId = projectId }

        /**
         * limit the number of traces fetched
         *
         * Fetch queries may be paginated if the total result size is expected to be large (e.g.
         * project_logs which accumulate over a long time). Note that fetch queries only support
         * pagination in descending time order (from latest to earliest `_xact_id`. Furthermore,
         * later pages may return rows which showed up in earlier pages, except with an earlier
         * `_xact_id`. This happens because pagination occurs over the whole version history of the
         * event log. You will most likely want to exclude any such duplicate, outdated rows (by
         * `id`) from your combined result set.
         *
         * The `limit` parameter controls the number of full traces to return. So you may end up
         * with more individual rows than the specified limit if you are fetching events containing
         * traces.
         */
        fun limit(limit: Long?) = apply { this.limit = limit }

        /**
         * limit the number of traces fetched
         *
         * Fetch queries may be paginated if the total result size is expected to be large (e.g.
         * project_logs which accumulate over a long time). Note that fetch queries only support
         * pagination in descending time order (from latest to earliest `_xact_id`. Furthermore,
         * later pages may return rows which showed up in earlier pages, except with an earlier
         * `_xact_id`. This happens because pagination occurs over the whole version history of the
         * event log. You will most likely want to exclude any such duplicate, outdated rows (by
         * `id`) from your combined result set.
         *
         * The `limit` parameter controls the number of full traces to return. So you may end up
         * with more individual rows than the specified limit if you are fetching events containing
         * traces.
         */
        fun limit(limit: Long) = limit(limit as Long?)

        /**
         * limit the number of traces fetched
         *
         * Fetch queries may be paginated if the total result size is expected to be large (e.g.
         * project_logs which accumulate over a long time). Note that fetch queries only support
         * pagination in descending time order (from latest to earliest `_xact_id`. Furthermore,
         * later pages may return rows which showed up in earlier pages, except with an earlier
         * `_xact_id`. This happens because pagination occurs over the whole version history of the
         * event log. You will most likely want to exclude any such duplicate, outdated rows (by
         * `id`) from your combined result set.
         *
         * The `limit` parameter controls the number of full traces to return. So you may end up
         * with more individual rows than the specified limit if you are fetching events containing
         * traces.
         */
        @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
        fun limit(limit: Optional<Long>) = limit(limit.orElse(null) as Long?)

        /**
         * DEPRECATION NOTICE: The manually-constructed pagination cursor is deprecated in favor of
         * the explicit 'cursor' returned by object fetch requests. Please prefer the 'cursor'
         * argument going forwards.
         *
         * Together, `max_xact_id` and `max_root_span_id` form a pagination cursor
         *
         * Since a paginated fetch query returns results in order from latest to earliest, the
         * cursor for the next page can be found as the row with the minimum (earliest) value of the
         * tuple `(_xact_id, root_span_id)`. See the documentation of `limit` for an overview of
         * paginating fetch queries.
         */
        fun maxRootSpanId(maxRootSpanId: String?) = apply { this.maxRootSpanId = maxRootSpanId }

        /**
         * DEPRECATION NOTICE: The manually-constructed pagination cursor is deprecated in favor of
         * the explicit 'cursor' returned by object fetch requests. Please prefer the 'cursor'
         * argument going forwards.
         *
         * Together, `max_xact_id` and `max_root_span_id` form a pagination cursor
         *
         * Since a paginated fetch query returns results in order from latest to earliest, the
         * cursor for the next page can be found as the row with the minimum (earliest) value of the
         * tuple `(_xact_id, root_span_id)`. See the documentation of `limit` for an overview of
         * paginating fetch queries.
         */
        fun maxRootSpanId(maxRootSpanId: Optional<String>) =
            maxRootSpanId(maxRootSpanId.orElse(null))

        /**
         * DEPRECATION NOTICE: The manually-constructed pagination cursor is deprecated in favor of
         * the explicit 'cursor' returned by object fetch requests. Please prefer the 'cursor'
         * argument going forwards.
         *
         * Together, `max_xact_id` and `max_root_span_id` form a pagination cursor
         *
         * Since a paginated fetch query returns results in order from latest to earliest, the
         * cursor for the next page can be found as the row with the minimum (earliest) value of the
         * tuple `(_xact_id, root_span_id)`. See the documentation of `limit` for an overview of
         * paginating fetch queries.
         */
        fun maxXactId(maxXactId: String?) = apply { this.maxXactId = maxXactId }

        /**
         * DEPRECATION NOTICE: The manually-constructed pagination cursor is deprecated in favor of
         * the explicit 'cursor' returned by object fetch requests. Please prefer the 'cursor'
         * argument going forwards.
         *
         * Together, `max_xact_id` and `max_root_span_id` form a pagination cursor
         *
         * Since a paginated fetch query returns results in order from latest to earliest, the
         * cursor for the next page can be found as the row with the minimum (earliest) value of the
         * tuple `(_xact_id, root_span_id)`. See the documentation of `limit` for an overview of
         * paginating fetch queries.
         */
        fun maxXactId(maxXactId: Optional<String>) = maxXactId(maxXactId.orElse(null))

        /**
         * Retrieve a snapshot of events from a past time
         *
         * The version id is essentially a filter on the latest event transaction id. You can use
         * the `max_xact_id` returned by a past fetch as the version to reproduce that exact fetch.
         */
        fun version(version: String?) = apply { this.version = version }

        /**
         * Retrieve a snapshot of events from a past time
         *
         * The version id is essentially a filter on the latest event transaction id. You can use
         * the `max_xact_id` returned by a past fetch as the version to reproduce that exact fetch.
         */
        fun version(version: Optional<String>) = version(version.orElse(null))

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

        fun build(): ProjectLogFetchParams =
            ProjectLogFetchParams(
                checkRequired("projectId", projectId),
                limit,
                maxRootSpanId,
                maxXactId,
                version,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ProjectLogFetchParams && projectId == other.projectId && limit == other.limit && maxRootSpanId == other.maxRootSpanId && maxXactId == other.maxXactId && version == other.version && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(projectId, limit, maxRootSpanId, maxXactId, version, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ProjectLogFetchParams{projectId=$projectId, limit=$limit, maxRootSpanId=$maxRootSpanId, maxXactId=$maxXactId, version=$version, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
