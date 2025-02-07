// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.Params
import com.braintrustdata.api.core.checkRequired
import com.braintrustdata.api.core.http.Headers
import com.braintrustdata.api.core.http.QueryParams
import com.braintrustdata.api.core.immutableEmptyMap
import com.braintrustdata.api.core.toImmutable
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Objects
import java.util.Optional

/**
 * Fetch the events in an experiment. Equivalent to the GET form of the same path, but with the
 * parameters in the request body rather than in the URL query. For more complex queries, use the
 * `POST /btql` endpoint.
 */
class ExperimentFetchPostParams
private constructor(
    private val experimentId: String,
    private val body: ExperimentFetchPostBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Experiment id */
    fun experimentId(): String = experimentId

    /**
     * An opaque string to be used as a cursor for the next page of results, in order from latest to
     * earliest.
     *
     * The string can be obtained directly from the `cursor` property of the previous fetch query
     */
    fun cursor(): Optional<String> = body.cursor()

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
    fun limit(): Optional<Long> = body.limit()

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
    fun maxRootSpanId(): Optional<String> = body.maxRootSpanId()

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
    fun maxXactId(): Optional<String> = body.maxXactId()

    /**
     * Retrieve a snapshot of events from a past time
     *
     * The version id is essentially a filter on the latest event transaction id. You can use the
     * `max_xact_id` returned by a past fetch as the version to reproduce that exact fetch.
     */
    fun version(): Optional<String> = body.version()

    /**
     * An opaque string to be used as a cursor for the next page of results, in order from latest to
     * earliest.
     *
     * The string can be obtained directly from the `cursor` property of the previous fetch query
     */
    fun _cursor(): JsonField<String> = body._cursor()

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
    fun _limit(): JsonField<Long> = body._limit()

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
    fun _maxRootSpanId(): JsonField<String> = body._maxRootSpanId()

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
    fun _maxXactId(): JsonField<String> = body._maxXactId()

    /**
     * Retrieve a snapshot of events from a past time
     *
     * The version id is essentially a filter on the latest event transaction id. You can use the
     * `max_xact_id` returned by a past fetch as the version to reproduce that exact fetch.
     */
    fun _version(): JsonField<String> = body._version()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun _body(): ExperimentFetchPostBody = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> experimentId
            else -> ""
        }
    }

    @NoAutoDetect
    class ExperimentFetchPostBody
    @JsonCreator
    internal constructor(
        @JsonProperty("cursor")
        @ExcludeMissing
        private val cursor: JsonField<String> = JsonMissing.of(),
        @JsonProperty("limit")
        @ExcludeMissing
        private val limit: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("max_root_span_id")
        @ExcludeMissing
        private val maxRootSpanId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("max_xact_id")
        @ExcludeMissing
        private val maxXactId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("version")
        @ExcludeMissing
        private val version: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * An opaque string to be used as a cursor for the next page of results, in order from
         * latest to earliest.
         *
         * The string can be obtained directly from the `cursor` property of the previous fetch
         * query
         */
        fun cursor(): Optional<String> = Optional.ofNullable(cursor.getNullable("cursor"))

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
        fun limit(): Optional<Long> = Optional.ofNullable(limit.getNullable("limit"))

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
        fun maxRootSpanId(): Optional<String> =
            Optional.ofNullable(maxRootSpanId.getNullable("max_root_span_id"))

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
        fun maxXactId(): Optional<String> =
            Optional.ofNullable(maxXactId.getNullable("max_xact_id"))

        /**
         * Retrieve a snapshot of events from a past time
         *
         * The version id is essentially a filter on the latest event transaction id. You can use
         * the `max_xact_id` returned by a past fetch as the version to reproduce that exact fetch.
         */
        fun version(): Optional<String> = Optional.ofNullable(version.getNullable("version"))

        /**
         * An opaque string to be used as a cursor for the next page of results, in order from
         * latest to earliest.
         *
         * The string can be obtained directly from the `cursor` property of the previous fetch
         * query
         */
        @JsonProperty("cursor") @ExcludeMissing fun _cursor(): JsonField<String> = cursor

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
        @JsonProperty("limit") @ExcludeMissing fun _limit(): JsonField<Long> = limit

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
        @JsonProperty("max_root_span_id")
        @ExcludeMissing
        fun _maxRootSpanId(): JsonField<String> = maxRootSpanId

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
        @JsonProperty("max_xact_id") @ExcludeMissing fun _maxXactId(): JsonField<String> = maxXactId

        /**
         * Retrieve a snapshot of events from a past time
         *
         * The version id is essentially a filter on the latest event transaction id. You can use
         * the `max_xact_id` returned by a past fetch as the version to reproduce that exact fetch.
         */
        @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<String> = version

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): ExperimentFetchPostBody = apply {
            if (validated) {
                return@apply
            }

            cursor()
            limit()
            maxRootSpanId()
            maxXactId()
            version()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ExperimentFetchPostBody]. */
        class Builder internal constructor() {

            private var cursor: JsonField<String> = JsonMissing.of()
            private var limit: JsonField<Long> = JsonMissing.of()
            private var maxRootSpanId: JsonField<String> = JsonMissing.of()
            private var maxXactId: JsonField<String> = JsonMissing.of()
            private var version: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(experimentFetchPostBody: ExperimentFetchPostBody) = apply {
                cursor = experimentFetchPostBody.cursor
                limit = experimentFetchPostBody.limit
                maxRootSpanId = experimentFetchPostBody.maxRootSpanId
                maxXactId = experimentFetchPostBody.maxXactId
                version = experimentFetchPostBody.version
                additionalProperties = experimentFetchPostBody.additionalProperties.toMutableMap()
            }

            /**
             * An opaque string to be used as a cursor for the next page of results, in order from
             * latest to earliest.
             *
             * The string can be obtained directly from the `cursor` property of the previous fetch
             * query
             */
            fun cursor(cursor: String?) = cursor(JsonField.ofNullable(cursor))

            /**
             * An opaque string to be used as a cursor for the next page of results, in order from
             * latest to earliest.
             *
             * The string can be obtained directly from the `cursor` property of the previous fetch
             * query
             */
            fun cursor(cursor: Optional<String>) = cursor(cursor.orElse(null))

            /**
             * An opaque string to be used as a cursor for the next page of results, in order from
             * latest to earliest.
             *
             * The string can be obtained directly from the `cursor` property of the previous fetch
             * query
             */
            fun cursor(cursor: JsonField<String>) = apply { this.cursor = cursor }

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
            fun limit(limit: Long?) = limit(JsonField.ofNullable(limit))

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
            fun limit(limit: Long) = limit(limit as Long?)

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
            @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
            fun limit(limit: Optional<Long>) = limit(limit.orElse(null) as Long?)

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
            fun limit(limit: JsonField<Long>) = apply { this.limit = limit }

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
            fun maxRootSpanId(maxRootSpanId: String?) =
                maxRootSpanId(JsonField.ofNullable(maxRootSpanId))

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
            fun maxRootSpanId(maxRootSpanId: Optional<String>) =
                maxRootSpanId(maxRootSpanId.orElse(null))

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
            fun maxRootSpanId(maxRootSpanId: JsonField<String>) = apply {
                this.maxRootSpanId = maxRootSpanId
            }

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
            fun maxXactId(maxXactId: String?) = maxXactId(JsonField.ofNullable(maxXactId))

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
            fun maxXactId(maxXactId: Optional<String>) = maxXactId(maxXactId.orElse(null))

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
            fun maxXactId(maxXactId: JsonField<String>) = apply { this.maxXactId = maxXactId }

            /**
             * Retrieve a snapshot of events from a past time
             *
             * The version id is essentially a filter on the latest event transaction id. You can
             * use the `max_xact_id` returned by a past fetch as the version to reproduce that exact
             * fetch.
             */
            fun version(version: String?) = version(JsonField.ofNullable(version))

            /**
             * Retrieve a snapshot of events from a past time
             *
             * The version id is essentially a filter on the latest event transaction id. You can
             * use the `max_xact_id` returned by a past fetch as the version to reproduce that exact
             * fetch.
             */
            fun version(version: Optional<String>) = version(version.orElse(null))

            /**
             * Retrieve a snapshot of events from a past time
             *
             * The version id is essentially a filter on the latest event transaction id. You can
             * use the `max_xact_id` returned by a past fetch as the version to reproduce that exact
             * fetch.
             */
            fun version(version: JsonField<String>) = apply { this.version = version }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            fun build(): ExperimentFetchPostBody =
                ExperimentFetchPostBody(
                    cursor,
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

            return /* spotless:off */ other is ExperimentFetchPostBody && cursor == other.cursor && limit == other.limit && maxRootSpanId == other.maxRootSpanId && maxXactId == other.maxXactId && version == other.version && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(cursor, limit, maxRootSpanId, maxXactId, version, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ExperimentFetchPostBody{cursor=$cursor, limit=$limit, maxRootSpanId=$maxRootSpanId, maxXactId=$maxXactId, version=$version, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExperimentFetchPostParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var experimentId: String? = null
        private var body: ExperimentFetchPostBody.Builder = ExperimentFetchPostBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(experimentFetchPostParams: ExperimentFetchPostParams) = apply {
            experimentId = experimentFetchPostParams.experimentId
            body = experimentFetchPostParams.body.toBuilder()
            additionalHeaders = experimentFetchPostParams.additionalHeaders.toBuilder()
            additionalQueryParams = experimentFetchPostParams.additionalQueryParams.toBuilder()
        }

        /** Experiment id */
        fun experimentId(experimentId: String) = apply { this.experimentId = experimentId }

        /**
         * An opaque string to be used as a cursor for the next page of results, in order from
         * latest to earliest.
         *
         * The string can be obtained directly from the `cursor` property of the previous fetch
         * query
         */
        fun cursor(cursor: String?) = apply { body.cursor(cursor) }

        /**
         * An opaque string to be used as a cursor for the next page of results, in order from
         * latest to earliest.
         *
         * The string can be obtained directly from the `cursor` property of the previous fetch
         * query
         */
        fun cursor(cursor: Optional<String>) = cursor(cursor.orElse(null))

        /**
         * An opaque string to be used as a cursor for the next page of results, in order from
         * latest to earliest.
         *
         * The string can be obtained directly from the `cursor` property of the previous fetch
         * query
         */
        fun cursor(cursor: JsonField<String>) = apply { body.cursor(cursor) }

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
        fun limit(limit: Long?) = apply { body.limit(limit) }

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
        fun limit(limit: JsonField<Long>) = apply { body.limit(limit) }

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
        fun maxRootSpanId(maxRootSpanId: String?) = apply { body.maxRootSpanId(maxRootSpanId) }

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
        fun maxRootSpanId(maxRootSpanId: JsonField<String>) = apply {
            body.maxRootSpanId(maxRootSpanId)
        }

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
        fun maxXactId(maxXactId: String?) = apply { body.maxXactId(maxXactId) }

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
        fun maxXactId(maxXactId: JsonField<String>) = apply { body.maxXactId(maxXactId) }

        /**
         * Retrieve a snapshot of events from a past time
         *
         * The version id is essentially a filter on the latest event transaction id. You can use
         * the `max_xact_id` returned by a past fetch as the version to reproduce that exact fetch.
         */
        fun version(version: String?) = apply { body.version(version) }

        /**
         * Retrieve a snapshot of events from a past time
         *
         * The version id is essentially a filter on the latest event transaction id. You can use
         * the `max_xact_id` returned by a past fetch as the version to reproduce that exact fetch.
         */
        fun version(version: Optional<String>) = version(version.orElse(null))

        /**
         * Retrieve a snapshot of events from a past time
         *
         * The version id is essentially a filter on the latest event transaction id. You can use
         * the `max_xact_id` returned by a past fetch as the version to reproduce that exact fetch.
         */
        fun version(version: JsonField<String>) = apply { body.version(version) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

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

        fun build(): ExperimentFetchPostParams =
            ExperimentFetchPostParams(
                checkRequired("experimentId", experimentId),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ExperimentFetchPostParams && experimentId == other.experimentId && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(experimentId, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ExperimentFetchPostParams{experimentId=$experimentId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
