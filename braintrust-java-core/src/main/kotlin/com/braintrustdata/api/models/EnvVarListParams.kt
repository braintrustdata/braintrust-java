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
 * List out all env_vars. The env_vars are sorted by creation date, with the most recently-created
 * env_vars coming first
 */
class EnvVarListParams
private constructor(
    private val envVarName: String?,
    private val ids: Ids?,
    private val limit: Long?,
    private val objectId: String?,
    private val objectType: EnvVarObjectType?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Name of the env_var to search for */
    fun envVarName(): Optional<String> = Optional.ofNullable(envVarName)

    /**
     * Filter search results to a particular set of object IDs. To specify a list of IDs, include
     * the query param multiple times
     */
    fun ids(): Optional<Ids> = Optional.ofNullable(ids)

    /** Limit the number of objects to return */
    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    /** The id of the object the environment variable is scoped for */
    fun objectId(): Optional<String> = Optional.ofNullable(objectId)

    /** The type of the object the environment variable is scoped for */
    fun objectType(): Optional<EnvVarObjectType> = Optional.ofNullable(objectType)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): EnvVarListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [EnvVarListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EnvVarListParams]. */
    class Builder internal constructor() {

        private var envVarName: String? = null
        private var ids: Ids? = null
        private var limit: Long? = null
        private var objectId: String? = null
        private var objectType: EnvVarObjectType? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(envVarListParams: EnvVarListParams) = apply {
            envVarName = envVarListParams.envVarName
            ids = envVarListParams.ids
            limit = envVarListParams.limit
            objectId = envVarListParams.objectId
            objectType = envVarListParams.objectType
            additionalHeaders = envVarListParams.additionalHeaders.toBuilder()
            additionalQueryParams = envVarListParams.additionalQueryParams.toBuilder()
        }

        /** Name of the env_var to search for */
        fun envVarName(envVarName: String?) = apply { this.envVarName = envVarName }

        /** Alias for calling [Builder.envVarName] with `envVarName.orElse(null)`. */
        fun envVarName(envVarName: Optional<String>) = envVarName(envVarName.getOrNull())

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

        /** The id of the object the environment variable is scoped for */
        fun objectId(objectId: String?) = apply { this.objectId = objectId }

        /** Alias for calling [Builder.objectId] with `objectId.orElse(null)`. */
        fun objectId(objectId: Optional<String>) = objectId(objectId.getOrNull())

        /** The type of the object the environment variable is scoped for */
        fun objectType(objectType: EnvVarObjectType?) = apply { this.objectType = objectType }

        /** Alias for calling [Builder.objectType] with `objectType.orElse(null)`. */
        fun objectType(objectType: Optional<EnvVarObjectType>) = objectType(objectType.getOrNull())

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
         * Returns an immutable instance of [EnvVarListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): EnvVarListParams =
            EnvVarListParams(
                envVarName,
                ids,
                limit,
                objectId,
                objectType,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                envVarName?.let { put("env_var_name", it) }
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
                objectId?.let { put("object_id", it) }
                objectType?.let { put("object_type", it.toString()) }
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

        return /* spotless:off */ other is EnvVarListParams && envVarName == other.envVarName && ids == other.ids && limit == other.limit && objectId == other.objectId && objectType == other.objectType && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(envVarName, ids, limit, objectId, objectType, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "EnvVarListParams{envVarName=$envVarName, ids=$ids, limit=$limit, objectId=$objectId, objectType=$objectType, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
