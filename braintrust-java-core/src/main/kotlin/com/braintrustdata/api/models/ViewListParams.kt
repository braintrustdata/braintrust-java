// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.Params
import com.braintrustdata.api.core.checkRequired
import com.braintrustdata.api.core.getOrThrow
import com.braintrustdata.api.core.http.Headers
import com.braintrustdata.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * List out all views. The views are sorted by creation date, with the most recently-created views
 * coming first
 */
class ViewListParams
private constructor(
    private val objectId: String,
    private val objectType: AclObjectType,
    private val endingBefore: String?,
    private val ids: Ids?,
    private val limit: Long?,
    private val startingAfter: String?,
    private val viewName: String?,
    private val viewType: ViewType?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** The id of the object the ACL applies to */
    fun objectId(): String = objectId

    /** The object type that the ACL applies to */
    fun objectType(): AclObjectType = objectType

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

    /**
     * Pagination cursor id.
     *
     * For example, if the final item in the last page you fetched had an id of `foo`, pass
     * `starting_after=foo` to fetch the next page. Note: you may only pass one of `starting_after`
     * and `ending_before`
     */
    fun startingAfter(): Optional<String> = Optional.ofNullable(startingAfter)

    /** Name of the view to search for */
    fun viewName(): Optional<String> = Optional.ofNullable(viewName)

    /** Type of table that the view corresponds to. */
    fun viewType(): Optional<ViewType> = Optional.ofNullable(viewType)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ViewListParams].
         *
         * The following fields are required:
         * ```java
         * .objectId()
         * .objectType()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ViewListParams]. */
    class Builder internal constructor() {

        private var objectId: String? = null
        private var objectType: AclObjectType? = null
        private var endingBefore: String? = null
        private var ids: Ids? = null
        private var limit: Long? = null
        private var startingAfter: String? = null
        private var viewName: String? = null
        private var viewType: ViewType? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(viewListParams: ViewListParams) = apply {
            objectId = viewListParams.objectId
            objectType = viewListParams.objectType
            endingBefore = viewListParams.endingBefore
            ids = viewListParams.ids
            limit = viewListParams.limit
            startingAfter = viewListParams.startingAfter
            viewName = viewListParams.viewName
            viewType = viewListParams.viewType
            additionalHeaders = viewListParams.additionalHeaders.toBuilder()
            additionalQueryParams = viewListParams.additionalQueryParams.toBuilder()
        }

        /** The id of the object the ACL applies to */
        fun objectId(objectId: String) = apply { this.objectId = objectId }

        /** The object type that the ACL applies to */
        fun objectType(objectType: AclObjectType) = apply { this.objectType = objectType }

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

        /** Name of the view to search for */
        fun viewName(viewName: String?) = apply { this.viewName = viewName }

        /** Alias for calling [Builder.viewName] with `viewName.orElse(null)`. */
        fun viewName(viewName: Optional<String>) = viewName(viewName.getOrNull())

        /** Type of table that the view corresponds to. */
        fun viewType(viewType: ViewType?) = apply { this.viewType = viewType }

        /** Alias for calling [Builder.viewType] with `viewType.orElse(null)`. */
        fun viewType(viewType: Optional<ViewType>) = viewType(viewType.getOrNull())

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
         * Returns an immutable instance of [ViewListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .objectId()
         * .objectType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ViewListParams =
            ViewListParams(
                checkRequired("objectId", objectId),
                checkRequired("objectType", objectType),
                endingBefore,
                ids,
                limit,
                startingAfter,
                viewName,
                viewType,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                put("object_id", objectId)
                put("object_type", objectType.toString())
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
                startingAfter?.let { put("starting_after", it) }
                viewName?.let { put("view_name", it) }
                viewType?.let { put("view_type", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

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

        return /* spotless:off */ other is ViewListParams && objectId == other.objectId && objectType == other.objectType && endingBefore == other.endingBefore && ids == other.ids && limit == other.limit && startingAfter == other.startingAfter && viewName == other.viewName && viewType == other.viewType && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(objectId, objectType, endingBefore, ids, limit, startingAfter, viewName, viewType, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ViewListParams{objectId=$objectId, objectType=$objectType, endingBefore=$endingBefore, ids=$ids, limit=$limit, startingAfter=$startingAfter, viewName=$viewName, viewType=$viewType, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
