// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.Params
import com.braintrustdata.api.core.checkRequired
import com.braintrustdata.api.core.http.Headers
import com.braintrustdata.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Fetch the events in a dataset. Equivalent to the POST form of the same path, but with the
 * parameters in the URL query rather than in the request body. For more complex queries, use the
 * `POST /btql` endpoint.
 */
class DatasetFetchParams
private constructor(
    private val datasetId: String,
    private val limit: Long?,
    private val maxRootSpanId: String?,
    private val maxXactId: String?,
    private val version: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Dataset id */
    fun datasetId(): String = datasetId

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

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DatasetFetchParams].
         *
         * The following fields are required:
         * ```java
         * .datasetId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DatasetFetchParams]. */
    class Builder internal constructor() {

        private var datasetId: String? = null
        private var limit: Long? = null
        private var maxRootSpanId: String? = null
        private var maxXactId: String? = null
        private var version: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(datasetFetchParams: DatasetFetchParams) = apply {
            datasetId = datasetFetchParams.datasetId
            limit = datasetFetchParams.limit
            maxRootSpanId = datasetFetchParams.maxRootSpanId
            maxXactId = datasetFetchParams.maxXactId
            version = datasetFetchParams.version
            additionalHeaders = datasetFetchParams.additionalHeaders.toBuilder()
            additionalQueryParams = datasetFetchParams.additionalQueryParams.toBuilder()
        }

        /** Dataset id */
        fun datasetId(datasetId: String) = apply { this.datasetId = datasetId }

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
         * Alias for [Builder.limit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun limit(limit: Long) = limit(limit as Long?)

        /** Alias for calling [Builder.limit] with `limit.orElse(null)`. */
        fun limit(limit: Optional<Long>) = limit(limit.getOrNull())

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

        /** Alias for calling [Builder.maxRootSpanId] with `maxRootSpanId.orElse(null)`. */
        fun maxRootSpanId(maxRootSpanId: Optional<String>) =
            maxRootSpanId(maxRootSpanId.getOrNull())

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

        /** Alias for calling [Builder.maxXactId] with `maxXactId.orElse(null)`. */
        fun maxXactId(maxXactId: Optional<String>) = maxXactId(maxXactId.getOrNull())

        /**
         * Retrieve a snapshot of events from a past time
         *
         * The version id is essentially a filter on the latest event transaction id. You can use
         * the `max_xact_id` returned by a past fetch as the version to reproduce that exact fetch.
         */
        fun version(version: String?) = apply { this.version = version }

        /** Alias for calling [Builder.version] with `version.orElse(null)`. */
        fun version(version: Optional<String>) = version(version.getOrNull())

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
         * Returns an immutable instance of [DatasetFetchParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .datasetId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DatasetFetchParams =
            DatasetFetchParams(
                checkRequired("datasetId", datasetId),
                limit,
                maxRootSpanId,
                maxXactId,
                version,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> datasetId
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                limit?.let { put("limit", it.toString()) }
                maxRootSpanId?.let { put("max_root_span_id", it) }
                maxXactId?.let { put("max_xact_id", it) }
                version?.let { put("version", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DatasetFetchParams && datasetId == other.datasetId && limit == other.limit && maxRootSpanId == other.maxRootSpanId && maxXactId == other.maxXactId && version == other.version && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(datasetId, limit, maxRootSpanId, maxXactId, version, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "DatasetFetchParams{datasetId=$datasetId, limit=$limit, maxRootSpanId=$maxRootSpanId, maxXactId=$maxXactId, version=$version, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
