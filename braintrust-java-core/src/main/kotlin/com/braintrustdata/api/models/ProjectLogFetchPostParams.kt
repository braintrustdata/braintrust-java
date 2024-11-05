// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.toImmutable
import com.braintrustdata.api.models.*
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import java.util.Objects
import java.util.Optional

class ProjectLogFetchPostParams
constructor(
    private val projectId: String,
    private val cursor: String?,
    private val filters: List<PathLookupFilter>?,
    private val limit: Long?,
    private val maxRootSpanId: String?,
    private val maxXactId: String?,
    private val version: String?,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun projectId(): String = projectId

    fun cursor(): Optional<String> = Optional.ofNullable(cursor)

    fun filters(): Optional<List<PathLookupFilter>> = Optional.ofNullable(filters)

    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    fun maxRootSpanId(): Optional<String> = Optional.ofNullable(maxRootSpanId)

    fun maxXactId(): Optional<String> = Optional.ofNullable(maxXactId)

    fun version(): Optional<String> = Optional.ofNullable(version)

    @JvmSynthetic
    internal fun getBody(): ProjectLogFetchPostBody {
        return ProjectLogFetchPostBody(
            cursor,
            filters,
            limit,
            maxRootSpanId,
            maxXactId,
            version,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> projectId
            else -> ""
        }
    }

    @JsonDeserialize(builder = ProjectLogFetchPostBody.Builder::class)
    @NoAutoDetect
    class ProjectLogFetchPostBody
    internal constructor(
        private val cursor: String?,
        private val filters: List<PathLookupFilter>?,
        private val limit: Long?,
        private val maxRootSpanId: String?,
        private val maxXactId: String?,
        private val version: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

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
            internal fun from(projectLogFetchPostBody: ProjectLogFetchPostBody) = apply {
                this.cursor = projectLogFetchPostBody.cursor
                this.filters = projectLogFetchPostBody.filters
                this.limit = projectLogFetchPostBody.limit
                this.maxRootSpanId = projectLogFetchPostBody.maxRootSpanId
                this.maxXactId = projectLogFetchPostBody.maxXactId
                this.version = projectLogFetchPostBody.version
                additionalProperties(projectLogFetchPostBody.additionalProperties)
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

            fun build(): ProjectLogFetchPostBody =
                ProjectLogFetchPostBody(
                    cursor,
                    filters?.toImmutable(),
                    limit,
                    maxRootSpanId,
                    maxXactId,
                    version,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ProjectLogFetchPostBody && this.cursor == other.cursor && this.filters == other.filters && this.limit == other.limit && this.maxRootSpanId == other.maxRootSpanId && this.maxXactId == other.maxXactId && this.version == other.version && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(cursor, filters, limit, maxRootSpanId, maxXactId, version, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "ProjectLogFetchPostBody{cursor=$cursor, filters=$filters, limit=$limit, maxRootSpanId=$maxRootSpanId, maxXactId=$maxXactId, version=$version, additionalProperties=$additionalProperties}"
    }

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ProjectLogFetchPostParams && this.projectId == other.projectId && this.cursor == other.cursor && this.filters == other.filters && this.limit == other.limit && this.maxRootSpanId == other.maxRootSpanId && this.maxXactId == other.maxXactId && this.version == other.version && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(projectId, cursor, filters, limit, maxRootSpanId, maxXactId, version, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "ProjectLogFetchPostParams{projectId=$projectId, cursor=$cursor, filters=$filters, limit=$limit, maxRootSpanId=$maxRootSpanId, maxXactId=$maxXactId, version=$version, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var projectId: String? = null
        private var cursor: String? = null
        private var filters: MutableList<PathLookupFilter> = mutableListOf()
        private var limit: Long? = null
        private var maxRootSpanId: String? = null
        private var maxXactId: String? = null
        private var version: String? = null
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(projectLogFetchPostParams: ProjectLogFetchPostParams) = apply {
            this.projectId = projectLogFetchPostParams.projectId
            this.cursor = projectLogFetchPostParams.cursor
            this.filters(projectLogFetchPostParams.filters ?: listOf())
            this.limit = projectLogFetchPostParams.limit
            this.maxRootSpanId = projectLogFetchPostParams.maxRootSpanId
            this.maxXactId = projectLogFetchPostParams.maxXactId
            this.version = projectLogFetchPostParams.version
            additionalHeaders(projectLogFetchPostParams.additionalHeaders)
            additionalQueryParams(projectLogFetchPostParams.additionalQueryParams)
            additionalBodyProperties(projectLogFetchPostParams.additionalBodyProperties)
        }

        /** Project id */
        fun projectId(projectId: String) = apply { this.projectId = projectId }

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

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.putAll(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(::putAdditionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replaceValues(name, listOf(value))
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replaceValues(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(::replaceAdditionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.removeAll(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            names.forEach(::removeAdditionalHeaders)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.putAll(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                additionalQueryParams.forEach(::putAdditionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replaceValues(key, listOf(value))
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replaceValues(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                additionalQueryParams.forEach(::replaceAdditionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply {
            additionalQueryParams.removeAll(key)
        }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalQueryParams)
        }

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

        fun build(): ProjectLogFetchPostParams =
            ProjectLogFetchPostParams(
                checkNotNull(projectId) { "`projectId` is required but was not set" },
                cursor,
                if (filters.size == 0) null else filters.toImmutable(),
                limit,
                maxRootSpanId,
                maxXactId,
                version,
                additionalHeaders
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalQueryParams
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalBodyProperties.toImmutable(),
            )
    }
}
