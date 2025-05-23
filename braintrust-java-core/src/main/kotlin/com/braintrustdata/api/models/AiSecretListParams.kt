// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.Params
import com.braintrustdata.api.core.getOrThrow
import com.braintrustdata.api.core.http.Headers
import com.braintrustdata.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * List out all ai_secrets. The ai_secrets are sorted by creation date, with the most
 * recently-created ai_secrets coming first
 */
class AiSecretListParams
private constructor(
    private val aiSecretName: String?,
    private val aiSecretType: AiSecretType?,
    private val endingBefore: String?,
    private val ids: Ids?,
    private val limit: Long?,
    private val orgName: String?,
    private val startingAfter: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Name of the ai_secret to search for */
    fun aiSecretName(): Optional<String> = Optional.ofNullable(aiSecretName)

    fun aiSecretType(): Optional<AiSecretType> = Optional.ofNullable(aiSecretType)

    /**
     * Pagination cursor id.
     *
     * For example, if the initial item in the last page you fetched had an id of `foo`, pass
     * `ending_before=foo` to fetch the previous page. Note: you may only pass one of
     * `starting_after` and `ending_before`
     */
    fun endingBefore(): Optional<String> = Optional.ofNullable(endingBefore)

    /**
     * Filter search results to a particular set of object IDs. To specify a list of IDs, include
     * the query param multiple times
     */
    fun ids(): Optional<Ids> = Optional.ofNullable(ids)

    /** Limit the number of objects to return */
    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    /** Filter search results to within a particular organization */
    fun orgName(): Optional<String> = Optional.ofNullable(orgName)

    /**
     * Pagination cursor id.
     *
     * For example, if the final item in the last page you fetched had an id of `foo`, pass
     * `starting_after=foo` to fetch the next page. Note: you may only pass one of `starting_after`
     * and `ending_before`
     */
    fun startingAfter(): Optional<String> = Optional.ofNullable(startingAfter)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): AiSecretListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [AiSecretListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AiSecretListParams]. */
    class Builder internal constructor() {

        private var aiSecretName: String? = null
        private var aiSecretType: AiSecretType? = null
        private var endingBefore: String? = null
        private var ids: Ids? = null
        private var limit: Long? = null
        private var orgName: String? = null
        private var startingAfter: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(aiSecretListParams: AiSecretListParams) = apply {
            aiSecretName = aiSecretListParams.aiSecretName
            aiSecretType = aiSecretListParams.aiSecretType
            endingBefore = aiSecretListParams.endingBefore
            ids = aiSecretListParams.ids
            limit = aiSecretListParams.limit
            orgName = aiSecretListParams.orgName
            startingAfter = aiSecretListParams.startingAfter
            additionalHeaders = aiSecretListParams.additionalHeaders.toBuilder()
            additionalQueryParams = aiSecretListParams.additionalQueryParams.toBuilder()
        }

        /** Name of the ai_secret to search for */
        fun aiSecretName(aiSecretName: String?) = apply { this.aiSecretName = aiSecretName }

        /** Alias for calling [Builder.aiSecretName] with `aiSecretName.orElse(null)`. */
        fun aiSecretName(aiSecretName: Optional<String>) = aiSecretName(aiSecretName.getOrNull())

        fun aiSecretType(aiSecretType: AiSecretType?) = apply { this.aiSecretType = aiSecretType }

        /** Alias for calling [Builder.aiSecretType] with `aiSecretType.orElse(null)`. */
        fun aiSecretType(aiSecretType: Optional<AiSecretType>) =
            aiSecretType(aiSecretType.getOrNull())

        /** Alias for calling [aiSecretType] with `AiSecretType.ofString(string)`. */
        fun aiSecretType(string: String) = aiSecretType(AiSecretType.ofString(string))

        /** Alias for calling [aiSecretType] with `AiSecretType.ofStrings(strings)`. */
        fun aiSecretTypeOfStrings(strings: List<String>) =
            aiSecretType(AiSecretType.ofStrings(strings))

        /**
         * Pagination cursor id.
         *
         * For example, if the initial item in the last page you fetched had an id of `foo`, pass
         * `ending_before=foo` to fetch the previous page. Note: you may only pass one of
         * `starting_after` and `ending_before`
         */
        fun endingBefore(endingBefore: String?) = apply { this.endingBefore = endingBefore }

        /** Alias for calling [Builder.endingBefore] with `endingBefore.orElse(null)`. */
        fun endingBefore(endingBefore: Optional<String>) = endingBefore(endingBefore.getOrNull())

        /**
         * Filter search results to a particular set of object IDs. To specify a list of IDs,
         * include the query param multiple times
         */
        fun ids(ids: Ids?) = apply { this.ids = ids }

        /** Alias for calling [Builder.ids] with `ids.orElse(null)`. */
        fun ids(ids: Optional<Ids>) = ids(ids.getOrNull())

        /** Alias for calling [ids] with `Ids.ofString(string)`. */
        fun ids(string: String) = ids(Ids.ofString(string))

        /** Alias for calling [ids] with `Ids.ofStrings(strings)`. */
        fun idsOfStrings(strings: List<String>) = ids(Ids.ofStrings(strings))

        /** Limit the number of objects to return */
        fun limit(limit: Long?) = apply { this.limit = limit }

        /**
         * Alias for [Builder.limit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun limit(limit: Long) = limit(limit as Long?)

        /** Alias for calling [Builder.limit] with `limit.orElse(null)`. */
        fun limit(limit: Optional<Long>) = limit(limit.getOrNull())

        /** Filter search results to within a particular organization */
        fun orgName(orgName: String?) = apply { this.orgName = orgName }

        /** Alias for calling [Builder.orgName] with `orgName.orElse(null)`. */
        fun orgName(orgName: Optional<String>) = orgName(orgName.getOrNull())

        /**
         * Pagination cursor id.
         *
         * For example, if the final item in the last page you fetched had an id of `foo`, pass
         * `starting_after=foo` to fetch the next page. Note: you may only pass one of
         * `starting_after` and `ending_before`
         */
        fun startingAfter(startingAfter: String?) = apply { this.startingAfter = startingAfter }

        /** Alias for calling [Builder.startingAfter] with `startingAfter.orElse(null)`. */
        fun startingAfter(startingAfter: Optional<String>) =
            startingAfter(startingAfter.getOrNull())

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
         * Returns an immutable instance of [AiSecretListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): AiSecretListParams =
            AiSecretListParams(
                aiSecretName,
                aiSecretType,
                endingBefore,
                ids,
                limit,
                orgName,
                startingAfter,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                aiSecretName?.let { put("ai_secret_name", it) }
                aiSecretType?.accept(
                    object : AiSecretType.Visitor<Unit> {
                        override fun visitString(string: String) {
                            put("ai_secret_type", string)
                        }

                        override fun visitStrings(strings: List<String>) {
                            put("ai_secret_type", strings.joinToString(","))
                        }
                    }
                )
                endingBefore?.let { put("ending_before", it) }
                ids?.accept(
                    object : Ids.Visitor<Unit> {
                        override fun visitString(string: String) {
                            put("ids", string)
                        }

                        override fun visitStrings(strings: List<String>) {
                            put("ids", strings.joinToString(","))
                        }
                    }
                )
                limit?.let { put("limit", it.toString()) }
                orgName?.let { put("org_name", it) }
                startingAfter?.let { put("starting_after", it) }
                putAll(additionalQueryParams)
            }
            .build()

    class AiSecretType
    private constructor(
        private val string: String? = null,
        private val strings: List<String>? = null,
    ) {

        fun string(): Optional<String> = Optional.ofNullable(string)

        fun strings(): Optional<List<String>> = Optional.ofNullable(strings)

        fun isString(): Boolean = string != null

        fun isStrings(): Boolean = strings != null

        fun asString(): String = string.getOrThrow("string")

        fun asStrings(): List<String> = strings.getOrThrow("strings")

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                string != null -> visitor.visitString(string)
                strings != null -> visitor.visitStrings(strings)
                else -> throw IllegalStateException("Invalid AiSecretType")
            }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AiSecretType && string == other.string && strings == other.strings /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(string, strings) /* spotless:on */

        override fun toString(): String =
            when {
                string != null -> "AiSecretType{string=$string}"
                strings != null -> "AiSecretType{strings=$strings}"
                else -> throw IllegalStateException("Invalid AiSecretType")
            }

        companion object {

            @JvmStatic fun ofString(string: String) = AiSecretType(string = string)

            @JvmStatic fun ofStrings(strings: List<String>) = AiSecretType(strings = strings)
        }

        /**
         * An interface that defines how to map each variant of [AiSecretType] to a value of type
         * [T].
         */
        interface Visitor<out T> {

            fun visitString(string: String): T

            fun visitStrings(strings: List<String>): T
        }
    }

    /**
     * Filter search results to a particular set of object IDs. To specify a list of IDs, include
     * the query param multiple times
     */
    class Ids
    private constructor(
        private val string: String? = null,
        private val strings: List<String>? = null,
    ) {

        fun string(): Optional<String> = Optional.ofNullable(string)

        fun strings(): Optional<List<String>> = Optional.ofNullable(strings)

        fun isString(): Boolean = string != null

        fun isStrings(): Boolean = strings != null

        fun asString(): String = string.getOrThrow("string")

        fun asStrings(): List<String> = strings.getOrThrow("strings")

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                string != null -> visitor.visitString(string)
                strings != null -> visitor.visitStrings(strings)
                else -> throw IllegalStateException("Invalid Ids")
            }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Ids && string == other.string && strings == other.strings /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(string, strings) /* spotless:on */

        override fun toString(): String =
            when {
                string != null -> "Ids{string=$string}"
                strings != null -> "Ids{strings=$strings}"
                else -> throw IllegalStateException("Invalid Ids")
            }

        companion object {

            @JvmStatic fun ofString(string: String) = Ids(string = string)

            @JvmStatic fun ofStrings(strings: List<String>) = Ids(strings = strings)
        }

        /** An interface that defines how to map each variant of [Ids] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitString(string: String): T

            fun visitStrings(strings: List<String>): T
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AiSecretListParams && aiSecretName == other.aiSecretName && aiSecretType == other.aiSecretType && endingBefore == other.endingBefore && ids == other.ids && limit == other.limit && orgName == other.orgName && startingAfter == other.startingAfter && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(aiSecretName, aiSecretType, endingBefore, ids, limit, orgName, startingAfter, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "AiSecretListParams{aiSecretName=$aiSecretName, aiSecretType=$aiSecretType, endingBefore=$endingBefore, ids=$ids, limit=$limit, orgName=$orgName, startingAfter=$startingAfter, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
