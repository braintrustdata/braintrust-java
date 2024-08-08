// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.toUnmodifiable
import com.braintrustdata.api.models.*
import java.util.Objects
import java.util.Optional

class UserListParams
constructor(
    private val email: UserEmail?,
    private val endingBefore: String?,
    private val familyName: UserFamilyName?,
    private val givenName: UserGivenName?,
    private val ids: Ids?,
    private val limit: Long?,
    private val orgName: String?,
    private val startingAfter: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun email(): Optional<UserEmail> = Optional.ofNullable(email)

    fun endingBefore(): Optional<String> = Optional.ofNullable(endingBefore)

    fun familyName(): Optional<UserFamilyName> = Optional.ofNullable(familyName)

    fun givenName(): Optional<UserGivenName> = Optional.ofNullable(givenName)

    fun ids(): Optional<Ids> = Optional.ofNullable(ids)

    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    fun orgName(): Optional<String> = Optional.ofNullable(orgName)

    fun startingAfter(): Optional<String> = Optional.ofNullable(startingAfter)

    @JvmSynthetic
    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.email?.let { params.put("email", listOf(it.toString())) }
        this.endingBefore?.let { params.put("ending_before", listOf(it.toString())) }
        this.familyName?.let { params.put("family_name", listOf(it.toString())) }
        this.givenName?.let { params.put("given_name", listOf(it.toString())) }
        this.ids?.let { params.put("ids", listOf(it.toString())) }
        this.limit?.let { params.put("limit", listOf(it.toString())) }
        this.orgName?.let { params.put("org_name", listOf(it.toString())) }
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

        return other is UserListParams &&
            this.email == other.email &&
            this.endingBefore == other.endingBefore &&
            this.familyName == other.familyName &&
            this.givenName == other.givenName &&
            this.ids == other.ids &&
            this.limit == other.limit &&
            this.orgName == other.orgName &&
            this.startingAfter == other.startingAfter &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            email,
            endingBefore,
            familyName,
            givenName,
            ids,
            limit,
            orgName,
            startingAfter,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "UserListParams{email=$email, endingBefore=$endingBefore, familyName=$familyName, givenName=$givenName, ids=$ids, limit=$limit, orgName=$orgName, startingAfter=$startingAfter, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var email: UserEmail? = null
        private var endingBefore: String? = null
        private var familyName: UserFamilyName? = null
        private var givenName: UserGivenName? = null
        private var ids: Ids? = null
        private var limit: Long? = null
        private var orgName: String? = null
        private var startingAfter: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(userListParams: UserListParams) = apply {
            this.email = userListParams.email
            this.endingBefore = userListParams.endingBefore
            this.familyName = userListParams.familyName
            this.givenName = userListParams.givenName
            this.ids = userListParams.ids
            this.limit = userListParams.limit
            this.orgName = userListParams.orgName
            this.startingAfter = userListParams.startingAfter
            additionalQueryParams(userListParams.additionalQueryParams)
            additionalHeaders(userListParams.additionalHeaders)
            additionalBodyProperties(userListParams.additionalBodyProperties)
        }

        /**
         * Email of the user to search for. You may pass the param multiple times to filter for more
         * than one email
         */
        fun email(email: UserEmail) = apply { this.email = email }

        /**
         * Email of the user to search for. You may pass the param multiple times to filter for more
         * than one email
         */
        fun email(string: String) = apply { this.email = UserEmail.ofString(string) }

        /**
         * Email of the user to search for. You may pass the param multiple times to filter for more
         * than one email
         */
        fun email(strings: List<String>) = apply { this.email = UserEmail.ofStrings(strings) }

        /**
         * Pagination cursor id.
         *
         * For example, if the initial item in the last page you fetched had an id of `foo`, pass
         * `ending_before=foo` to fetch the previous page. Note: you may only pass one of
         * `starting_after` and `ending_before`
         */
        fun endingBefore(endingBefore: String) = apply { this.endingBefore = endingBefore }

        /**
         * Family name of the user to search for. You may pass the param multiple times to filter
         * for more than one family name
         */
        fun familyName(familyName: UserFamilyName) = apply { this.familyName = familyName }

        /**
         * Family name of the user to search for. You may pass the param multiple times to filter
         * for more than one family name
         */
        fun familyName(string: String) = apply { this.familyName = UserFamilyName.ofString(string) }

        /**
         * Family name of the user to search for. You may pass the param multiple times to filter
         * for more than one family name
         */
        fun familyName(strings: List<String>) = apply {
            this.familyName = UserFamilyName.ofStrings(strings)
        }

        /**
         * Given name of the user to search for. You may pass the param multiple times to filter for
         * more than one given name
         */
        fun givenName(givenName: UserGivenName) = apply { this.givenName = givenName }

        /**
         * Given name of the user to search for. You may pass the param multiple times to filter for
         * more than one given name
         */
        fun givenName(string: String) = apply { this.givenName = UserGivenName.ofString(string) }

        /**
         * Given name of the user to search for. You may pass the param multiple times to filter for
         * more than one given name
         */
        fun givenName(strings: List<String>) = apply {
            this.givenName = UserGivenName.ofStrings(strings)
        }

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

        fun build(): UserListParams =
            UserListParams(
                email,
                endingBefore,
                familyName,
                givenName,
                ids,
                limit,
                orgName,
                startingAfter,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }
}
