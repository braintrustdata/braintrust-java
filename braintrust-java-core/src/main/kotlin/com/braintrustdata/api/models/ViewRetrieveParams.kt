// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.Params
import com.braintrustdata.api.core.checkRequired
import com.braintrustdata.api.core.http.Headers
import com.braintrustdata.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Get a view object by its id */
class ViewRetrieveParams
private constructor(
    private val viewId: String?,
    private val objectId: String,
    private val objectType: AclObjectType,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** View id */
    fun viewId(): Optional<String> = Optional.ofNullable(viewId)

    /** The id of the object the ACL applies to */
    fun objectId(): String = objectId

    /** The object type that the ACL applies to */
    fun objectType(): AclObjectType = objectType

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ViewRetrieveParams].
         *
         * The following fields are required:
         * ```java
         * .objectId()
         * .objectType()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ViewRetrieveParams]. */
    class Builder internal constructor() {

        private var viewId: String? = null
        private var objectId: String? = null
        private var objectType: AclObjectType? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(viewRetrieveParams: ViewRetrieveParams) = apply {
            viewId = viewRetrieveParams.viewId
            objectId = viewRetrieveParams.objectId
            objectType = viewRetrieveParams.objectType
            additionalHeaders = viewRetrieveParams.additionalHeaders.toBuilder()
            additionalQueryParams = viewRetrieveParams.additionalQueryParams.toBuilder()
        }

        /** View id */
        fun viewId(viewId: String?) = apply { this.viewId = viewId }

        /** Alias for calling [Builder.viewId] with `viewId.orElse(null)`. */
        fun viewId(viewId: Optional<String>) = viewId(viewId.getOrNull())

        /** The id of the object the ACL applies to */
        fun objectId(objectId: String) = apply { this.objectId = objectId }

        /** The object type that the ACL applies to */
        fun objectType(objectType: AclObjectType) = apply { this.objectType = objectType }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAlladditional_headers(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAlladditional_headers(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putadditional_headers(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAlladditional_headers(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAlladditional_headers(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceadditional_headers(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceadditional_headers(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAlladditional_headers(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAlladditional_headers(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeadditional_headers(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAlladditional_headers(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAlladditional_query_params(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAlladditional_query_params(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putadditional_query_params(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAlladditional_query_params(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAlladditional_query_params(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceadditional_query_params(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceadditional_query_params(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAlladditional_query_params(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAlladditional_query_params(
            additionalQueryParams: Map<String, Iterable<String>>
        ) = apply { this.additionalQueryParams.replaceAll(additionalQueryParams) }

        fun removeadditional_query_params(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAlladditional_query_params(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [ViewRetrieveParams].
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
        fun build(): ViewRetrieveParams =
            ViewRetrieveParams(
                viewId,
                checkRequired("objectId", objectId),
                checkRequired("objectType", objectType),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> viewId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                put("object_id", objectId)
                put("object_type", objectType.toString())
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ViewRetrieveParams &&
            viewId == other.viewId &&
            objectId == other.objectId &&
            objectType == other.objectType &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(viewId, objectId, objectType, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ViewRetrieveParams{viewId=$viewId, objectId=$objectId, objectType=$objectType, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
