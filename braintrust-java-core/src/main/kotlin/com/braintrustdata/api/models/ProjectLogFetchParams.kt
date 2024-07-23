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

class ProjectLogFetchParams constructor(
  private val projectId: String,
  private val limit: Long?,
  private val maxRootSpanId: String?,
  private val maxXactId: String?,
  private val version: String?,
  private val additionalQueryParams: Map<String, List<String>>,
  private val additionalHeaders: Map<String, List<String>>,
  private val additionalBodyProperties: Map<String, JsonValue>,

) {

    fun projectId(): String = projectId

    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    fun maxRootSpanId(): Optional<String> = Optional.ofNullable(maxRootSpanId)

    fun maxXactId(): Optional<String> = Optional.ofNullable(maxXactId)

    fun version(): Optional<String> = Optional.ofNullable(version)

    @JvmSynthetic
    internal fun getQueryParams(): Map<String, List<String>> {
      val params = mutableMapOf<String, List<String>>()
      this.limit?.let {
          params.put("limit", listOf(it.toString()))
      }
      this.maxRootSpanId?.let {
          params.put("max_root_span_id", listOf(it.toString()))
      }
      this.maxXactId?.let {
          params.put("max_xact_id", listOf(it.toString()))
      }
      this.version?.let {
          params.put("version", listOf(it.toString()))
      }
      params.putAll(additionalQueryParams)
      return params.toUnmodifiable()
    }

    @JvmSynthetic
    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
      return when (index) {
          0 -> projectId
          else -> ""
      }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return other is ProjectLogFetchParams &&
          this.projectId == other.projectId &&
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
          limit,
          maxRootSpanId,
          maxXactId,
          version,
          additionalQueryParams,
          additionalHeaders,
          additionalBodyProperties,
      )
    }

    override fun toString() = "ProjectLogFetchParams{projectId=$projectId, limit=$limit, maxRootSpanId=$maxRootSpanId, maxXactId=$maxXactId, version=$version, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic
        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var projectId: String? = null
        private var limit: Long? = null
        private var maxRootSpanId: String? = null
        private var maxXactId: String? = null
        private var version: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(projectLogFetchParams: ProjectLogFetchParams) = apply {
            this.projectId = projectLogFetchParams.projectId
            this.limit = projectLogFetchParams.limit
            this.maxRootSpanId = projectLogFetchParams.maxRootSpanId
            this.maxXactId = projectLogFetchParams.maxXactId
            this.version = projectLogFetchParams.version
            additionalQueryParams(projectLogFetchParams.additionalQueryParams)
            additionalHeaders(projectLogFetchParams.additionalHeaders)
            additionalBodyProperties(projectLogFetchParams.additionalBodyProperties)
        }

        /** Project id */
        fun projectId(projectId: String) = apply {
            this.projectId = projectId
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

        fun build(): ProjectLogFetchParams = ProjectLogFetchParams(
            checkNotNull(projectId) {
                "`projectId` is required but was not set"
            },
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
