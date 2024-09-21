// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.toUnmodifiable
import com.braintrustdata.api.models.*
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import java.util.Objects
import java.util.Optional

class DatasetFetchPostParams
constructor(
    private val datasetId: String,
    private val cursor: String?,
    private val filters: List<PathLookupFilter>?,
    private val limit: Long?,
    private val maxRootSpanId: String?,
    private val maxXactId: String?,
    private val version: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun datasetId(): String = datasetId

    fun cursor(): Optional<String> = Optional.ofNullable(cursor)

    fun filters(): Optional<List<PathLookupFilter>> = Optional.ofNullable(filters)

    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    fun maxRootSpanId(): Optional<String> = Optional.ofNullable(maxRootSpanId)

    fun maxXactId(): Optional<String> = Optional.ofNullable(maxXactId)

    fun version(): Optional<String> = Optional.ofNullable(version)

    @JvmSynthetic
    internal fun getBody(): DatasetFetchPostBody {
        return DatasetFetchPostBody(
            cursor,
            filters,
            limit,
            maxRootSpanId,
            maxXactId,
            version,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> datasetId
            else -> ""
        }
    }

    @JsonDeserialize(builder = DatasetFetchPostBody.Builder::class)
    @NoAutoDetect
    class DatasetFetchPostBody
    internal constructor(
        private val cursor: String?,
        private val filters: List<PathLookupFilter>?,
        private val limit: Long?,
        private val maxRootSpanId: String?,
        private val maxXactId: String?,
        private val version: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /**
         * An opaque string to be used as a cursor for the next page of results, in order from
         * latest to earliest.
         *
         * The string can be obtained directly from the `cursor` property of the previous fetch
         * query
         */
        @JsonProperty("cursor") fun cursor(): String? = cursor

        /**
         * NOTE: This parameter is deprecated and will be removed in a future revision. Consider
         * using the `/btql` endpoint (https://www.braintrust.dev/docs/reference/btql) for more
         * advanced filtering.
         *
         * A list of filters on the events to fetch. Currently, only path-lookup type filters are
         * supported.
         */
        @JsonProperty("filters") fun filters(): List<PathLookupFilter>? = filters

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
        @JsonProperty("limit") fun limit(): Long? = limit

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
        @JsonProperty("max_root_span_id") fun maxRootSpanId(): String? = maxRootSpanId

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
        @JsonProperty("max_xact_id") fun maxXactId(): String? = maxXactId

        /**
         * Retrieve a snapshot of events from a past time
         *
         * The version id is essentially a filter on the latest event transaction id. You can use
         * the `max_xact_id` returned by a past fetch as the version to reproduce that exact fetch.
         */
        @JsonProperty("version") fun version(): String? = version

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is DatasetFetchPostBody &&
                this.cursor == other.cursor &&
                this.filters == other.filters &&
                this.limit == other.limit &&
                this.maxRootSpanId == other.maxRootSpanId &&
                this.maxXactId == other.maxXactId &&
                this.version == other.version &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        cursor,
                        filters,
                        limit,
                        maxRootSpanId,
                        maxXactId,
                        version,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "DatasetFetchPostBody{cursor=$cursor, filters=$filters, limit=$limit, maxRootSpanId=$maxRootSpanId, maxXactId=$maxXactId, version=$version, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var cursor: String? = null
            private var filters: List<PathLookupFilter>? = null
            private var limit: Long? = null
            private var maxRootSpanId: String? = null
            private var maxXactId: String? = null
            private var version: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(datasetFetchPostBody: DatasetFetchPostBody) = apply {
                this.cursor = datasetFetchPostBody.cursor
                this.filters = datasetFetchPostBody.filters
                this.limit = datasetFetchPostBody.limit
                this.maxRootSpanId = datasetFetchPostBody.maxRootSpanId
                this.maxXactId = datasetFetchPostBody.maxXactId
                this.version = datasetFetchPostBody.version
                additionalProperties(datasetFetchPostBody.additionalProperties)
            }

            /**
             * An opaque string to be used as a cursor for the next page of results, in order from
             * latest to earliest.
             *
             * The string can be obtained directly from the `cursor` property of the previous fetch
             * query
             */
            @JsonProperty("cursor") fun cursor(cursor: String) = apply { this.cursor = cursor }

            /**
             * NOTE: This parameter is deprecated and will be removed in a future revision. Consider
             * using the `/btql` endpoint (https://www.braintrust.dev/docs/reference/btql) for more
             * advanced filtering.
             *
             * A list of filters on the events to fetch. Currently, only path-lookup type filters
             * are supported.
             */
            @JsonProperty("filters")
            fun filters(filters: List<PathLookupFilter>) = apply { this.filters = filters }

            /**
             * limit the number of traces fetched
             *
             * Fetch queries may be paginated if the total result size is expected to be large (e.g.
             * project_logs which accumulate over a long time). Note that fetch queries only support
             * pagination in descending time order (from latest to earliest `_xact_id`. Furthermore,
             * later pages may return rows which showed up in earlier pages, except with an earlier
             * `_xact_id`. This happens because pagination occurs over the whole version history of
             * the event log. You will most likely want to exclude any such duplicate, outdated rows
             * (by `id`) from your combined result set.
             *
             * The `limit` parameter controls the number of full traces to return. So you may end up
             * with more individual rows than the specified limit if you are fetching events
             * containing traces.
             */
            @JsonProperty("limit") fun limit(limit: Long) = apply { this.limit = limit }

            /**
             * DEPRECATION NOTICE: The manually-constructed pagination cursor is deprecated in favor
             * of the explicit 'cursor' returned by object fetch requests. Please prefer the
             * 'cursor' argument going forwards.
             *
             * Together, `max_xact_id` and `max_root_span_id` form a pagination cursor
             *
             * Since a paginated fetch query returns results in order from latest to earliest, the
             * cursor for the next page can be found as the row with the minimum (earliest) value of
             * the tuple `(_xact_id, root_span_id)`. See the documentation of `limit` for an
             * overview of paginating fetch queries.
             */
            @JsonProperty("max_root_span_id")
            fun maxRootSpanId(maxRootSpanId: String) = apply { this.maxRootSpanId = maxRootSpanId }

            /**
             * DEPRECATION NOTICE: The manually-constructed pagination cursor is deprecated in favor
             * of the explicit 'cursor' returned by object fetch requests. Please prefer the
             * 'cursor' argument going forwards.
             *
             * Together, `max_xact_id` and `max_root_span_id` form a pagination cursor
             *
             * Since a paginated fetch query returns results in order from latest to earliest, the
             * cursor for the next page can be found as the row with the minimum (earliest) value of
             * the tuple `(_xact_id, root_span_id)`. See the documentation of `limit` for an
             * overview of paginating fetch queries.
             */
            @JsonProperty("max_xact_id")
            fun maxXactId(maxXactId: String) = apply { this.maxXactId = maxXactId }

            /**
             * Retrieve a snapshot of events from a past time
             *
             * The version id is essentially a filter on the latest event transaction id. You can
             * use the `max_xact_id` returned by a past fetch as the version to reproduce that exact
             * fetch.
             */
            @JsonProperty("version") fun version(version: String) = apply { this.version = version }

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

            fun build(): DatasetFetchPostBody =
                DatasetFetchPostBody(
                    cursor,
                    filters?.toUnmodifiable(),
                    limit,
                    maxRootSpanId,
                    maxXactId,
                    version,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DatasetFetchPostParams &&
            this.datasetId == other.datasetId &&
            this.cursor == other.cursor &&
            this.filters == other.filters &&
            this.limit == other.limit &&
            this.maxRootSpanId == other.maxRootSpanId &&
            this.maxXactId == other.maxXactId &&
            this.version == other.version &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            datasetId,
            cursor,
            filters,
            limit,
            maxRootSpanId,
            maxXactId,
            version,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "DatasetFetchPostParams{datasetId=$datasetId, cursor=$cursor, filters=$filters, limit=$limit, maxRootSpanId=$maxRootSpanId, maxXactId=$maxXactId, version=$version, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var datasetId: String? = null
        private var cursor: String? = null
        private var filters: MutableList<PathLookupFilter> = mutableListOf()
        private var limit: Long? = null
        private var maxRootSpanId: String? = null
        private var maxXactId: String? = null
        private var version: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(datasetFetchPostParams: DatasetFetchPostParams) = apply {
            this.datasetId = datasetFetchPostParams.datasetId
            this.cursor = datasetFetchPostParams.cursor
            this.filters(datasetFetchPostParams.filters ?: listOf())
            this.limit = datasetFetchPostParams.limit
            this.maxRootSpanId = datasetFetchPostParams.maxRootSpanId
            this.maxXactId = datasetFetchPostParams.maxXactId
            this.version = datasetFetchPostParams.version
            additionalQueryParams(datasetFetchPostParams.additionalQueryParams)
            additionalHeaders(datasetFetchPostParams.additionalHeaders)
            additionalBodyProperties(datasetFetchPostParams.additionalBodyProperties)
        }

        /** Dataset id */
        fun datasetId(datasetId: String) = apply { this.datasetId = datasetId }

        /**
         * An opaque string to be used as a cursor for the next page of results, in order from
         * latest to earliest.
         *
         * The string can be obtained directly from the `cursor` property of the previous fetch
         * query
         */
        fun cursor(cursor: String) = apply { this.cursor = cursor }

        /**
         * NOTE: This parameter is deprecated and will be removed in a future revision. Consider
         * using the `/btql` endpoint (https://www.braintrust.dev/docs/reference/btql) for more
         * advanced filtering.
         *
         * A list of filters on the events to fetch. Currently, only path-lookup type filters are
         * supported.
         */
        fun filters(filters: List<PathLookupFilter>) = apply {
            this.filters.clear()
            this.filters.addAll(filters)
        }

        /**
         * NOTE: This parameter is deprecated and will be removed in a future revision. Consider
         * using the `/btql` endpoint (https://www.braintrust.dev/docs/reference/btql) for more
         * advanced filtering.
         *
         * A list of filters on the events to fetch. Currently, only path-lookup type filters are
         * supported.
         */
        fun addFilter(filter: PathLookupFilter) = apply { this.filters.add(filter) }

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
        fun limit(limit: Long) = apply { this.limit = limit }

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
        fun maxRootSpanId(maxRootSpanId: String) = apply { this.maxRootSpanId = maxRootSpanId }

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
        fun maxXactId(maxXactId: String) = apply { this.maxXactId = maxXactId }

        /**
         * Retrieve a snapshot of events from a past time
         *
         * The version id is essentially a filter on the latest event transaction id. You can use
         * the `max_xact_id` returned by a past fetch as the version to reproduce that exact fetch.
         */
        fun version(version: String) = apply { this.version = version }

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

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): DatasetFetchPostParams =
            DatasetFetchPostParams(
                checkNotNull(datasetId) { "`datasetId` is required but was not set" },
                cursor,
                if (filters.size == 0) null else filters.toUnmodifiable(),
                limit,
                maxRootSpanId,
                maxXactId,
                version,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }
}
