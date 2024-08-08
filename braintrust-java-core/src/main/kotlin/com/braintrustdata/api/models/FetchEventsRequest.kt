// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.toUnmodifiable
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = FetchEventsRequest.Builder::class)
@NoAutoDetect
class FetchEventsRequest
private constructor(
    private val limit: JsonField<Long>,
    private val cursor: JsonField<String>,
    private val maxXactId: JsonField<String>,
    private val maxRootSpanId: JsonField<String>,
    private val filters: JsonField<List<PathLookupFilter>>,
    private val version: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

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
    fun limit(): Optional<Long> = Optional.ofNullable(limit.getNullable("limit"))

    /**
     * An opaque string to be used as a cursor for the next page of results, in order from latest to
     * earliest.
     *
     * The string can be obtained directly from the `cursor` property of the previous fetch query
     */
    fun cursor(): Optional<String> = Optional.ofNullable(cursor.getNullable("cursor"))

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
    fun maxXactId(): Optional<String> = Optional.ofNullable(maxXactId.getNullable("max_xact_id"))

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
    fun maxRootSpanId(): Optional<String> =
        Optional.ofNullable(maxRootSpanId.getNullable("max_root_span_id"))

    /**
     * A list of filters on the events to fetch. Currently, only path-lookup type filters are
     * supported, but we may add more in the future
     */
    fun filters(): Optional<List<PathLookupFilter>> =
        Optional.ofNullable(filters.getNullable("filters"))

    /**
     * Retrieve a snapshot of events from a past time
     *
     * The version id is essentially a filter on the latest event transaction id. You can use the
     * `max_xact_id` returned by a past fetch as the version to reproduce that exact fetch.
     */
    fun version(): Optional<String> = Optional.ofNullable(version.getNullable("version"))

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
    @JsonProperty("limit") @ExcludeMissing fun _limit() = limit

    /**
     * An opaque string to be used as a cursor for the next page of results, in order from latest to
     * earliest.
     *
     * The string can be obtained directly from the `cursor` property of the previous fetch query
     */
    @JsonProperty("cursor") @ExcludeMissing fun _cursor() = cursor

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
    @JsonProperty("max_xact_id") @ExcludeMissing fun _maxXactId() = maxXactId

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
    @JsonProperty("max_root_span_id") @ExcludeMissing fun _maxRootSpanId() = maxRootSpanId

    /**
     * A list of filters on the events to fetch. Currently, only path-lookup type filters are
     * supported, but we may add more in the future
     */
    @JsonProperty("filters") @ExcludeMissing fun _filters() = filters

    /**
     * Retrieve a snapshot of events from a past time
     *
     * The version id is essentially a filter on the latest event transaction id. You can use the
     * `max_xact_id` returned by a past fetch as the version to reproduce that exact fetch.
     */
    @JsonProperty("version") @ExcludeMissing fun _version() = version

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): FetchEventsRequest = apply {
        if (!validated) {
            limit()
            cursor()
            maxXactId()
            maxRootSpanId()
            filters().map { it.forEach { it.validate() } }
            version()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FetchEventsRequest &&
            this.limit == other.limit &&
            this.cursor == other.cursor &&
            this.maxXactId == other.maxXactId &&
            this.maxRootSpanId == other.maxRootSpanId &&
            this.filters == other.filters &&
            this.version == other.version &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    limit,
                    cursor,
                    maxXactId,
                    maxRootSpanId,
                    filters,
                    version,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "FetchEventsRequest{limit=$limit, cursor=$cursor, maxXactId=$maxXactId, maxRootSpanId=$maxRootSpanId, filters=$filters, version=$version, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var limit: JsonField<Long> = JsonMissing.of()
        private var cursor: JsonField<String> = JsonMissing.of()
        private var maxXactId: JsonField<String> = JsonMissing.of()
        private var maxRootSpanId: JsonField<String> = JsonMissing.of()
        private var filters: JsonField<List<PathLookupFilter>> = JsonMissing.of()
        private var version: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(fetchEventsRequest: FetchEventsRequest) = apply {
            this.limit = fetchEventsRequest.limit
            this.cursor = fetchEventsRequest.cursor
            this.maxXactId = fetchEventsRequest.maxXactId
            this.maxRootSpanId = fetchEventsRequest.maxRootSpanId
            this.filters = fetchEventsRequest.filters
            this.version = fetchEventsRequest.version
            additionalProperties(fetchEventsRequest.additionalProperties)
        }

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
        fun limit(limit: Long) = limit(JsonField.of(limit))

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
        @JsonProperty("limit")
        @ExcludeMissing
        fun limit(limit: JsonField<Long>) = apply { this.limit = limit }

        /**
         * An opaque string to be used as a cursor for the next page of results, in order from
         * latest to earliest.
         *
         * The string can be obtained directly from the `cursor` property of the previous fetch
         * query
         */
        fun cursor(cursor: String) = cursor(JsonField.of(cursor))

        /**
         * An opaque string to be used as a cursor for the next page of results, in order from
         * latest to earliest.
         *
         * The string can be obtained directly from the `cursor` property of the previous fetch
         * query
         */
        @JsonProperty("cursor")
        @ExcludeMissing
        fun cursor(cursor: JsonField<String>) = apply { this.cursor = cursor }

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
        fun maxXactId(maxXactId: String) = maxXactId(JsonField.of(maxXactId))

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
        @JsonProperty("max_xact_id")
        @ExcludeMissing
        fun maxXactId(maxXactId: JsonField<String>) = apply { this.maxXactId = maxXactId }

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
        fun maxRootSpanId(maxRootSpanId: String) = maxRootSpanId(JsonField.of(maxRootSpanId))

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
        fun maxRootSpanId(maxRootSpanId: JsonField<String>) = apply {
            this.maxRootSpanId = maxRootSpanId
        }

        /**
         * A list of filters on the events to fetch. Currently, only path-lookup type filters are
         * supported, but we may add more in the future
         */
        fun filters(filters: List<PathLookupFilter>) = filters(JsonField.of(filters))

        /**
         * A list of filters on the events to fetch. Currently, only path-lookup type filters are
         * supported, but we may add more in the future
         */
        @JsonProperty("filters")
        @ExcludeMissing
        fun filters(filters: JsonField<List<PathLookupFilter>>) = apply { this.filters = filters }

        /**
         * Retrieve a snapshot of events from a past time
         *
         * The version id is essentially a filter on the latest event transaction id. You can use
         * the `max_xact_id` returned by a past fetch as the version to reproduce that exact fetch.
         */
        fun version(version: String) = version(JsonField.of(version))

        /**
         * Retrieve a snapshot of events from a past time
         *
         * The version id is essentially a filter on the latest event transaction id. You can use
         * the `max_xact_id` returned by a past fetch as the version to reproduce that exact fetch.
         */
        @JsonProperty("version")
        @ExcludeMissing
        fun version(version: JsonField<String>) = apply { this.version = version }

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

        fun build(): FetchEventsRequest =
            FetchEventsRequest(
                limit,
                cursor,
                maxXactId,
                maxRootSpanId,
                filters.map { it.toUnmodifiable() },
                version,
                additionalProperties.toUnmodifiable(),
            )
    }
}
