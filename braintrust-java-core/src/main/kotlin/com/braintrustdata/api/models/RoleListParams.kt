// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.toUnmodifiable
import com.braintrustdata.api.models.*
import java.util.Objects
import java.util.Optional

class RoleListParams
constructor(
    private val endingBefore: String?,
    private val ids: Ids?,
    private val limit: Long?,
    private val orgName: String?,
    private val roleName: String?,
    private val startingAfter: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun endingBefore(): Optional<String> = Optional.ofNullable(endingBefore)

    fun ids(): Optional<Ids> = Optional.ofNullable(ids)

    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    fun orgName(): Optional<String> = Optional.ofNullable(orgName)

    fun roleName(): Optional<String> = Optional.ofNullable(roleName)

    fun startingAfter(): Optional<String> = Optional.ofNullable(startingAfter)

    @JvmSynthetic
    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.endingBefore?.let { params.put("ending_before", listOf(it.toString())) }
        this.ids?.let { params.put("ids", listOf(it.toString())) }
        this.limit?.let { params.put("limit", listOf(it.toString())) }
        this.orgName?.let { params.put("org_name", listOf(it.toString())) }
        this.roleName?.let { params.put("role_name", listOf(it.toString())) }
        this.startingAfter?.let { params.put("starting_after", listOf(it.toString())) }
        params.putAll(additionalQueryParams)
        return params.toUnmodifiable()
    }

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RoleListParams &&
            this.endingBefore == other.endingBefore &&
            this.ids == other.ids &&
            this.limit == other.limit &&
            this.orgName == other.orgName &&
            this.roleName == other.roleName &&
            this.startingAfter == other.startingAfter &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            endingBefore,
            ids,
            limit,
            orgName,
            roleName,
            startingAfter,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "RoleListParams{endingBefore=$endingBefore, ids=$ids, limit=$limit, orgName=$orgName, roleName=$roleName, startingAfter=$startingAfter, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var endingBefore: String? = null
        private var ids: Ids? = null
        private var limit: Long? = null
        private var orgName: String? = null
        private var roleName: String? = null
        private var startingAfter: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(roleListParams: RoleListParams) = apply {
            this.endingBefore = roleListParams.endingBefore
            this.ids = roleListParams.ids
            this.limit = roleListParams.limit
            this.orgName = roleListParams.orgName
            this.roleName = roleListParams.roleName
            this.startingAfter = roleListParams.startingAfter
            additionalQueryParams(roleListParams.additionalQueryParams)
            additionalHeaders(roleListParams.additionalHeaders)
            additionalBodyProperties(roleListParams.additionalBodyProperties)
        }

        /**
         * Pagination cursor id.
         *
         * For example, if the initial item in the last page you fetched had an id of `foo`, pass
         * `ending_before=foo` to fetch the previous page. Note: you may only pass one of
         * `starting_after` and `ending_before`
         */
        fun endingBefore(endingBefore: String) = apply { this.endingBefore = endingBefore }

        /**
         * Filter search results to a particular set of object IDs. To specify a list of IDs,
         * include the query param multiple times
         */
        fun ids(ids: Ids) = apply { this.ids = ids }

        /**
         * Filter search results to a particular set of object IDs. To specify a list of IDs,
         * include the query param multiple times
         */
        fun ids(string: String) = apply { this.ids = Ids.ofString(string) }

        /**
         * Filter search results to a particular set of object IDs. To specify a list of IDs,
         * include the query param multiple times
         */
        fun ids(strings: List<String>) = apply { this.ids = Ids.ofStrings(strings) }

        /** Limit the number of objects to return */
        fun limit(limit: Long) = apply { this.limit = limit }

        /** Filter search results to within a particular organization */
        fun orgName(orgName: String) = apply { this.orgName = orgName }

        /** Name of the role to search for */
        fun roleName(roleName: String) = apply { this.roleName = roleName }

        /**
         * Pagination cursor id.
         *
         * For example, if the final item in the last page you fetched had an id of `foo`, pass
         * `starting_after=foo` to fetch the next page. Note: you may only pass one of
         * `starting_after` and `ending_before`
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

        fun build(): RoleListParams =
            RoleListParams(
                endingBefore,
                ids,
                limit,
                orgName,
                roleName,
                startingAfter,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }
}
