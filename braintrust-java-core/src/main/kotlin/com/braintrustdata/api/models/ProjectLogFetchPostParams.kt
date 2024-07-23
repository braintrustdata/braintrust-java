// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.apache.hc.core5.http.ContentType
import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import java.util.UUID
import com.braintrustdata.api.core.BaseDeserializer
import com.braintrustdata.api.core.BaseSerializer
import com.braintrustdata.api.core.getOrThrow
import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.MultipartFormValue
import com.braintrustdata.api.core.toUnmodifiable
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.Enum
import com.braintrustdata.api.core.ContentTypes
import com.braintrustdata.api.errors.BraintrustInvalidDataException
import com.braintrustdata.api.models.*

class ProjectLogFetchPostParams constructor(
  private val projectId: String,
  private val cursor: String?,
  private val filters: List<Filter>?,
  private val limit: Long?,
  private val maxRootSpanId: String?,
  private val maxXactId: String?,
  private val version: String?,
  private val additionalQueryParams: Map<String, List<String>>,
  private val additionalHeaders: Map<String, List<String>>,
  private val additionalBodyProperties: Map<String, JsonValue>,

) {

    fun projectId(): String = projectId

    fun cursor(): Optional<String> = Optional.ofNullable(cursor)

    fun filters(): Optional<List<Filter>> = Optional.ofNullable(filters)

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

    @JvmSynthetic
    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic
    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
      return when (index) {
          0 -> projectId
          else -> ""
      }
    }

    @JsonDeserialize(builder = ProjectLogFetchPostBody.Builder::class)
    @NoAutoDetect
    class ProjectLogFetchPostBody internal constructor(
      private val cursor: String?,
      private val filters: List<Filter>?,
      private val limit: Long?,
      private val maxRootSpanId: String?,
      private val maxXactId: String?,
      private val version: String?,
      private val additionalProperties: Map<String, JsonValue>,

    ) {

        private var hashCode: Int = 0

        /**
         * An opaque string to be used as a cursor for the next page of results, in order
         * from latest to earliest.
         *
         * The string can be obtained directly from the `cursor` property of the previous
         * fetch query
         */
        @JsonProperty("cursor")
        fun cursor(): String? = cursor

        /**
         * A list of filters on the events to fetch. Currently, only path-lookup type
         * filters are supported, but we may add more in the future
         */
        @JsonProperty("filters")
        fun filters(): List<Filter>? = filters

        /**
         * limit the number of traces fetched
         *
         * Fetch queries may be paginated if the total result size is expected to be large
         * (e.g. project_logs which accumulate over a long time). Note that fetch queries
         * only support pagination in descending time order (from latest to earliest
         * `_xact_id`. Furthermore, later pages may return rows which showed up in earlier
         * pages, except with an earlier `_xact_id`. This happens because pagination occurs
         * over the whole version history of the event log. You will most likely want to
         * exclude any such duplicate, outdated rows (by `id`) from your combined result
         * set.
         *
         * The `limit` parameter controls the number of full traces to return. So you may
         * end up with more individual rows than the specified limit if you are fetching
         * events containing traces.
         */
        @JsonProperty("limit")
        fun limit(): Long? = limit

        /**
         * DEPRECATION NOTICE: The manually-constructed pagination cursor is deprecated in
         * favor of the explicit 'cursor' returned by object fetch requests. Please prefer
         * the 'cursor' argument going forwards.
         *
         * Together, `max_xact_id` and `max_root_span_id` form a pagination cursor
         *
         * Since a paginated fetch query returns results in order from latest to earliest,
         * the cursor for the next page can be found as the row with the minimum (earliest)
         * value of the tuple `(_xact_id, root_span_id)`. See the documentation of `limit`
         * for an overview of paginating fetch queries.
         */
        @JsonProperty("max_root_span_id")
        fun maxRootSpanId(): String? = maxRootSpanId

        /**
         * DEPRECATION NOTICE: The manually-constructed pagination cursor is deprecated in
         * favor of the explicit 'cursor' returned by object fetch requests. Please prefer
         * the 'cursor' argument going forwards.
         *
         * Together, `max_xact_id` and `max_root_span_id` form a pagination cursor
         *
         * Since a paginated fetch query returns results in order from latest to earliest,
         * the cursor for the next page can be found as the row with the minimum (earliest)
         * value of the tuple `(_xact_id, root_span_id)`. See the documentation of `limit`
         * for an overview of paginating fetch queries.
         */
        @JsonProperty("max_xact_id")
        fun maxXactId(): String? = maxXactId

        /**
         * Retrieve a snapshot of events from a past time
         *
         * The version id is essentially a filter on the latest event transaction id. You
         * can use the `max_xact_id` returned by a past fetch as the version to reproduce
         * that exact fetch.
         */
        @JsonProperty("version")
        fun version(): String? = version

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is ProjectLogFetchPostBody &&
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
            hashCode = Objects.hash(
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

        override fun toString() = "ProjectLogFetchPostBody{cursor=$cursor, filters=$filters, limit=$limit, maxRootSpanId=$maxRootSpanId, maxXactId=$maxXactId, version=$version, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic
            fun builder() = Builder()
        }

        class Builder {

            private var cursor: String? = null
            private var filters: List<Filter>? = null
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
             * An opaque string to be used as a cursor for the next page of results, in order
             * from latest to earliest.
             *
             * The string can be obtained directly from the `cursor` property of the previous
             * fetch query
             */
            @JsonProperty("cursor")
            fun cursor(cursor: String) = apply {
                this.cursor = cursor
            }

            /**
             * A list of filters on the events to fetch. Currently, only path-lookup type
             * filters are supported, but we may add more in the future
             */
            @JsonProperty("filters")
            fun filters(filters: List<Filter>) = apply {
                this.filters = filters
            }

            /**
             * limit the number of traces fetched
             *
             * Fetch queries may be paginated if the total result size is expected to be large
             * (e.g. project_logs which accumulate over a long time). Note that fetch queries
             * only support pagination in descending time order (from latest to earliest
             * `_xact_id`. Furthermore, later pages may return rows which showed up in earlier
             * pages, except with an earlier `_xact_id`. This happens because pagination occurs
             * over the whole version history of the event log. You will most likely want to
             * exclude any such duplicate, outdated rows (by `id`) from your combined result
             * set.
             *
             * The `limit` parameter controls the number of full traces to return. So you may
             * end up with more individual rows than the specified limit if you are fetching
             * events containing traces.
             */
            @JsonProperty("limit")
            fun limit(limit: Long) = apply {
                this.limit = limit
            }

            /**
             * DEPRECATION NOTICE: The manually-constructed pagination cursor is deprecated in
             * favor of the explicit 'cursor' returned by object fetch requests. Please prefer
             * the 'cursor' argument going forwards.
             *
             * Together, `max_xact_id` and `max_root_span_id` form a pagination cursor
             *
             * Since a paginated fetch query returns results in order from latest to earliest,
             * the cursor for the next page can be found as the row with the minimum (earliest)
             * value of the tuple `(_xact_id, root_span_id)`. See the documentation of `limit`
             * for an overview of paginating fetch queries.
             */
            @JsonProperty("max_root_span_id")
            fun maxRootSpanId(maxRootSpanId: String) = apply {
                this.maxRootSpanId = maxRootSpanId
            }

            /**
             * DEPRECATION NOTICE: The manually-constructed pagination cursor is deprecated in
             * favor of the explicit 'cursor' returned by object fetch requests. Please prefer
             * the 'cursor' argument going forwards.
             *
             * Together, `max_xact_id` and `max_root_span_id` form a pagination cursor
             *
             * Since a paginated fetch query returns results in order from latest to earliest,
             * the cursor for the next page can be found as the row with the minimum (earliest)
             * value of the tuple `(_xact_id, root_span_id)`. See the documentation of `limit`
             * for an overview of paginating fetch queries.
             */
            @JsonProperty("max_xact_id")
            fun maxXactId(maxXactId: String) = apply {
                this.maxXactId = maxXactId
            }

            /**
             * Retrieve a snapshot of events from a past time
             *
             * The version id is essentially a filter on the latest event transaction id. You
             * can use the `max_xact_id` returned by a past fetch as the version to reproduce
             * that exact fetch.
             */
            @JsonProperty("version")
            fun version(version: String) = apply {
                this.version = version
            }

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

            fun build(): ProjectLogFetchPostBody = ProjectLogFetchPostBody(
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

      return other is ProjectLogFetchPostParams &&
          this.projectId == other.projectId &&
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
          projectId,
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

    override fun toString() = "ProjectLogFetchPostParams{projectId=$projectId, cursor=$cursor, filters=$filters, limit=$limit, maxRootSpanId=$maxRootSpanId, maxXactId=$maxXactId, version=$version, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic
        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var projectId: String? = null
        private var cursor: String? = null
        private var filters: MutableList<Filter> = mutableListOf()
        private var limit: Long? = null
        private var maxRootSpanId: String? = null
        private var maxXactId: String? = null
        private var version: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
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
            additionalQueryParams(projectLogFetchPostParams.additionalQueryParams)
            additionalHeaders(projectLogFetchPostParams.additionalHeaders)
            additionalBodyProperties(projectLogFetchPostParams.additionalBodyProperties)
        }

        /** Project id */
        fun projectId(projectId: String) = apply {
            this.projectId = projectId
        }

        /**
         * An opaque string to be used as a cursor for the next page of results, in order
         * from latest to earliest.
         *
         * The string can be obtained directly from the `cursor` property of the previous
         * fetch query
         */
        fun cursor(cursor: String) = apply {
            this.cursor = cursor
        }

        /**
         * A list of filters on the events to fetch. Currently, only path-lookup type
         * filters are supported, but we may add more in the future
         */
        fun filters(filters: List<Filter>) = apply {
            this.filters.clear()
            this.filters.addAll(filters)
        }

        /**
         * A list of filters on the events to fetch. Currently, only path-lookup type
         * filters are supported, but we may add more in the future
         */
        fun addFilter(filter: Filter) = apply {
            this.filters.add(filter)
        }

        /**
         * limit the number of traces fetched
         *
         * Fetch queries may be paginated if the total result size is expected to be large
         * (e.g. project_logs which accumulate over a long time). Note that fetch queries
         * only support pagination in descending time order (from latest to earliest
         * `_xact_id`. Furthermore, later pages may return rows which showed up in earlier
         * pages, except with an earlier `_xact_id`. This happens because pagination occurs
         * over the whole version history of the event log. You will most likely want to
         * exclude any such duplicate, outdated rows (by `id`) from your combined result
         * set.
         *
         * The `limit` parameter controls the number of full traces to return. So you may
         * end up with more individual rows than the specified limit if you are fetching
         * events containing traces.
         */
        fun limit(limit: Long) = apply {
            this.limit = limit
        }

        /**
         * DEPRECATION NOTICE: The manually-constructed pagination cursor is deprecated in
         * favor of the explicit 'cursor' returned by object fetch requests. Please prefer
         * the 'cursor' argument going forwards.
         *
         * Together, `max_xact_id` and `max_root_span_id` form a pagination cursor
         *
         * Since a paginated fetch query returns results in order from latest to earliest,
         * the cursor for the next page can be found as the row with the minimum (earliest)
         * value of the tuple `(_xact_id, root_span_id)`. See the documentation of `limit`
         * for an overview of paginating fetch queries.
         */
        fun maxRootSpanId(maxRootSpanId: String) = apply {
            this.maxRootSpanId = maxRootSpanId
        }

        /**
         * DEPRECATION NOTICE: The manually-constructed pagination cursor is deprecated in
         * favor of the explicit 'cursor' returned by object fetch requests. Please prefer
         * the 'cursor' argument going forwards.
         *
         * Together, `max_xact_id` and `max_root_span_id` form a pagination cursor
         *
         * Since a paginated fetch query returns results in order from latest to earliest,
         * the cursor for the next page can be found as the row with the minimum (earliest)
         * value of the tuple `(_xact_id, root_span_id)`. See the documentation of `limit`
         * for an overview of paginating fetch queries.
         */
        fun maxXactId(maxXactId: String) = apply {
            this.maxXactId = maxXactId
        }

        /**
         * Retrieve a snapshot of events from a past time
         *
         * The version id is essentially a filter on the latest event transaction id. You
         * can use the `max_xact_id` returned by a past fetch as the version to reproduce
         * that exact fetch.
         */
        fun version(version: String) = apply {
            this.version = version
        }

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

        fun removeHeader(name: String) = apply {
            this.additionalHeaders.put(name, mutableListOf())
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun build(): ProjectLogFetchPostParams = ProjectLogFetchPostParams(
            checkNotNull(projectId) {
                "`projectId` is required but was not set"
            },
            cursor,
            if(filters.size == 0) null else filters.toUnmodifiable(),
            limit,
            maxRootSpanId,
            maxXactId,
            version,
            additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            additionalBodyProperties.toUnmodifiable(),
        )
    }

    /**
     * A path-lookup filter describes an equality comparison against a specific
     * sub-field in the event row. For instance, if you wish to filter on the value of
     * `c` in `{"input": {"a": {"b": {"c": "hello"}}}}`, pass
     * `path=["input", "a", "b", "c"]` and `value="hello"`
     */
    @JsonDeserialize(builder = Filter.Builder::class)
    @NoAutoDetect
    class Filter private constructor(
      private val type: Type?,
      private val path: List<String>?,
      private val value: JsonValue?,
      private val additionalProperties: Map<String, JsonValue>,

    ) {

        private var hashCode: Int = 0

        /** Denotes the type of filter as a path-lookup filter */
        @JsonProperty("type")
        fun type(): Type? = type

        /**
         * List of fields describing the path to the value to be checked against. For
         * instance, if you wish to filter on the value of `c` in
         * `{"input": {"a": {"b": {"c": "hello"}}}}`, pass `path=["input", "a", "b", "c"]`
         */
        @JsonProperty("path")
        fun path(): List<String>? = path

        /**
         * The value to compare equality-wise against the event value at the specified
         * `path`. The value must be a "primitive", that is, any JSON-serializable object
         * except for objects and arrays. For instance, if you wish to filter on the value
         * of "input.a.b.c" in the object `{"input": {"a": {"b": {"c": "hello"}}}}`, pass
         * `value="hello"`
         */
        @JsonProperty("value")
        fun value(): JsonValue? = value

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is Filter &&
              this.type == other.type &&
              this.path == other.path &&
              this.value == other.value &&
              this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
          if (hashCode == 0) {
            hashCode = Objects.hash(
                type,
                path,
                value,
                additionalProperties,
            )
          }
          return hashCode
        }

        override fun toString() = "Filter{type=$type, path=$path, value=$value, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic
            fun builder() = Builder()
        }

        class Builder {

            private var type: Type? = null
            private var path: List<String>? = null
            private var value: JsonValue? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(filter: Filter) = apply {
                this.type = filter.type
                this.path = filter.path
                this.value = filter.value
                additionalProperties(filter.additionalProperties)
            }

            /** Denotes the type of filter as a path-lookup filter */
            @JsonProperty("type")
            fun type(type: Type) = apply {
                this.type = type
            }

            /**
             * List of fields describing the path to the value to be checked against. For
             * instance, if you wish to filter on the value of `c` in
             * `{"input": {"a": {"b": {"c": "hello"}}}}`, pass `path=["input", "a", "b", "c"]`
             */
            @JsonProperty("path")
            fun path(path: List<String>) = apply {
                this.path = path
            }

            /**
             * The value to compare equality-wise against the event value at the specified
             * `path`. The value must be a "primitive", that is, any JSON-serializable object
             * except for objects and arrays. For instance, if you wish to filter on the value
             * of "input.a.b.c" in the object `{"input": {"a": {"b": {"c": "hello"}}}}`, pass
             * `value="hello"`
             */
            @JsonProperty("value")
            fun value(value: JsonValue) = apply {
                this.value = value
            }

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

            fun build(): Filter = Filter(
                checkNotNull(type) {
                    "`type` is required but was not set"
                },
                checkNotNull(path) {
                    "`path` is required but was not set"
                }.toUnmodifiable(),
                value,
                additionalProperties.toUnmodifiable(),
            )
        }

        class Type @JsonCreator private constructor(private val value: JsonField<String>, ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue
            fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
              if (this === other) {
                  return true
              }

              return other is Type &&
                  this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val PATH_LOOKUP = Type(JsonField.of("path_lookup"))

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            enum class Known {
                PATH_LOOKUP,
            }

            enum class Value {
                PATH_LOOKUP,
                _UNKNOWN,
            }

            fun value(): Value = when (this) {
                PATH_LOOKUP -> Value.PATH_LOOKUP
                else -> Value._UNKNOWN
            }

            fun known(): Known = when (this) {
                PATH_LOOKUP -> Known.PATH_LOOKUP
                else -> throw BraintrustInvalidDataException("Unknown Type: $value")
            }

            fun asString(): String = _value().asStringOrThrow()
        }
    }
}
