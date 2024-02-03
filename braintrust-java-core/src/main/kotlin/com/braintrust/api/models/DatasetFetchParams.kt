// File generated from our OpenAPI spec by Stainless.

package com.braintrust.api.models

import com.braintrust.api.core.NoAutoDetect
import com.braintrust.api.core.toUnmodifiable
import com.braintrust.api.models.*
import java.util.Objects
import java.util.Optional

class DatasetFetchParams
constructor(
    private val datasetId: String,
    private val limit: Long?,
    private val maxRootSpanId: String?,
    private val maxXactId: Long?,
    private val version: Long?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
) {

    fun datasetId(): String = datasetId

    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    fun maxRootSpanId(): Optional<String> = Optional.ofNullable(maxRootSpanId)

    fun maxXactId(): Optional<Long> = Optional.ofNullable(maxXactId)

    fun version(): Optional<Long> = Optional.ofNullable(version)

    @JvmSynthetic
    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.limit?.let { params.put("limit", listOf(it.toString())) }
        this.maxRootSpanId?.let { params.put("max_root_span_id", listOf(it.toString())) }
        this.maxXactId?.let { params.put("max_xact_id", listOf(it.toString())) }
        this.version?.let { params.put("version", listOf(it.toString())) }
        params.putAll(additionalQueryParams)
        return params.toUnmodifiable()
    }

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> datasetId
            else -> ""
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DatasetFetchParams &&
            this.datasetId == other.datasetId &&
            this.limit == other.limit &&
            this.maxRootSpanId == other.maxRootSpanId &&
            this.maxXactId == other.maxXactId &&
            this.version == other.version &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders
    }

    override fun hashCode(): Int {
        return Objects.hash(
            datasetId,
            limit,
            maxRootSpanId,
            maxXactId,
            version,
            additionalQueryParams,
            additionalHeaders,
        )
    }

    override fun toString() =
        "DatasetFetchParams{datasetId=$datasetId, limit=$limit, maxRootSpanId=$maxRootSpanId, maxXactId=$maxXactId, version=$version, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var datasetId: String? = null
        private var limit: Long? = null
        private var maxRootSpanId: String? = null
        private var maxXactId: Long? = null
        private var version: Long? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

        @JvmSynthetic
        internal fun from(datasetFetchParams: DatasetFetchParams) = apply {
            this.datasetId = datasetFetchParams.datasetId
            this.limit = datasetFetchParams.limit
            this.maxRootSpanId = datasetFetchParams.maxRootSpanId
            this.maxXactId = datasetFetchParams.maxXactId
            this.version = datasetFetchParams.version
            additionalQueryParams(datasetFetchParams.additionalQueryParams)
            additionalHeaders(datasetFetchParams.additionalHeaders)
        }

        /** Dataset id */
        fun datasetId(datasetId: String) = apply { this.datasetId = datasetId }

        /**
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
        fun limit(limit: Long) = apply { this.limit = limit }

        /**
         * Together, `max_xact_id` and `max_root_span_id` form a cursor for paginating event
         * fetches. Given a previous fetch with a list of rows, you can determine `max_root_span_id`
         * as the maximum of the `root_span_id` field over all rows. See the documentation for
         * `limit` for an overview of paginating fetch queries.
         */
        fun maxRootSpanId(maxRootSpanId: String) = apply { this.maxRootSpanId = maxRootSpanId }

        /**
         * Together, `max_xact_id` and `max_root_span_id` form a cursor for paginating event
         * fetches. Given a previous fetch with a list of rows, you can determine `max_xact_id` as
         * the maximum of the `_xact_id` field over all rows. See the documentation for `limit` for
         * an overview of paginating fetch queries.
         */
        fun maxXactId(maxXactId: Long) = apply { this.maxXactId = maxXactId }

        /**
         * You may specify a version id to retrieve a snapshot of the events from a past time. The
         * version id is essentially a filter on the latest event transaction id. You can use the
         * `max_xact_id` returned by a past fetch as the version to reproduce that exact fetch.
         */
        fun version(version: Long) = apply { this.version = version }

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

        fun build(): DatasetFetchParams =
            DatasetFetchParams(
                checkNotNull(datasetId) { "`datasetId` is required but was not set" },
                limit,
                maxRootSpanId,
                maxXactId,
                version,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            )
    }
}
