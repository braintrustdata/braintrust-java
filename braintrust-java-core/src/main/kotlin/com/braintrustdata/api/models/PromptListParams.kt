// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.BaseDeserializer
import com.braintrustdata.api.core.BaseSerializer
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.getOrThrow
import com.braintrustdata.api.core.http.Headers
import com.braintrustdata.api.core.http.QueryParams
import com.braintrustdata.api.errors.BraintrustInvalidDataException
import com.braintrustdata.api.models.*
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.util.Objects
import java.util.Optional

class PromptListParams
constructor(
    private val endingBefore: String?,
    private val ids: Ids?,
    private val limit: Long?,
    private val orgName: String?,
    private val projectId: String?,
    private val projectName: String?,
    private val promptName: String?,
    private val slug: String?,
    private val startingAfter: String?,
    private val version: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun endingBefore(): Optional<String> = Optional.ofNullable(endingBefore)

    fun ids(): Optional<Ids> = Optional.ofNullable(ids)

    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    fun orgName(): Optional<String> = Optional.ofNullable(orgName)

    fun projectId(): Optional<String> = Optional.ofNullable(projectId)

    fun projectName(): Optional<String> = Optional.ofNullable(projectName)

    fun promptName(): Optional<String> = Optional.ofNullable(promptName)

    fun slug(): Optional<String> = Optional.ofNullable(slug)

    fun startingAfter(): Optional<String> = Optional.ofNullable(startingAfter)

    fun version(): Optional<String> = Optional.ofNullable(version)

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic
    internal fun getQueryParams(): QueryParams {
        val queryParams = QueryParams.builder()
        this.endingBefore?.let { queryParams.put("ending_before", listOf(it.toString())) }
        this.ids?.let { queryParams.put("ids", listOf(it.toString())) }
        this.limit?.let { queryParams.put("limit", listOf(it.toString())) }
        this.orgName?.let { queryParams.put("org_name", listOf(it.toString())) }
        this.projectId?.let { queryParams.put("project_id", listOf(it.toString())) }
        this.projectName?.let { queryParams.put("project_name", listOf(it.toString())) }
        this.promptName?.let { queryParams.put("prompt_name", listOf(it.toString())) }
        this.slug?.let { queryParams.put("slug", listOf(it.toString())) }
        this.startingAfter?.let { queryParams.put("starting_after", listOf(it.toString())) }
        this.version?.let { queryParams.put("version", listOf(it.toString())) }
        queryParams.putAll(additionalQueryParams)
        return queryParams.build()
    }

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PromptListParams && endingBefore == other.endingBefore && ids == other.ids && limit == other.limit && orgName == other.orgName && projectId == other.projectId && projectName == other.projectName && promptName == other.promptName && slug == other.slug && startingAfter == other.startingAfter && version == other.version && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(endingBefore, ids, limit, orgName, projectId, projectName, promptName, slug, startingAfter, version, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "PromptListParams{endingBefore=$endingBefore, ids=$ids, limit=$limit, orgName=$orgName, projectId=$projectId, projectName=$projectName, promptName=$promptName, slug=$slug, startingAfter=$startingAfter, version=$version, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"

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
        private var projectId: String? = null
        private var projectName: String? = null
        private var promptName: String? = null
        private var slug: String? = null
        private var startingAfter: String? = null
        private var version: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(promptListParams: PromptListParams) = apply {
            this.endingBefore = promptListParams.endingBefore
            this.ids = promptListParams.ids
            this.limit = promptListParams.limit
            this.orgName = promptListParams.orgName
            this.projectId = promptListParams.projectId
            this.projectName = promptListParams.projectName
            this.promptName = promptListParams.promptName
            this.slug = promptListParams.slug
            this.startingAfter = promptListParams.startingAfter
            this.version = promptListParams.version
            additionalHeaders(promptListParams.additionalHeaders)
            additionalQueryParams(promptListParams.additionalQueryParams)
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
        fun idsOfStrings(strings: List<String>) = apply { this.ids = Ids.ofStrings(strings) }

        /** Limit the number of objects to return */
        fun limit(limit: Long) = apply { this.limit = limit }

        /** Filter search results to within a particular organization */
        fun orgName(orgName: String) = apply { this.orgName = orgName }

        /** Project id */
        fun projectId(projectId: String) = apply { this.projectId = projectId }

        /** Name of the project to search for */
        fun projectName(projectName: String) = apply { this.projectName = projectName }

        /** Name of the prompt to search for */
        fun promptName(promptName: String) = apply { this.promptName = promptName }

        /** Retrieve prompt with a specific slug */
        fun slug(slug: String) = apply { this.slug = slug }

        /**
         * Pagination cursor id.
         *
         * For example, if the final item in the last page you fetched had an id of `foo`, pass
         * `starting_after=foo` to fetch the next page. Note: you may only pass one of
         * `starting_after` and `ending_before`
         */
        fun startingAfter(startingAfter: String) = apply { this.startingAfter = startingAfter }

        /**
         * Retrieve prompt at a specific version.
         *
         * The version id can either be a transaction id (e.g. '1000192656880881099') or a version
         * identifier (e.g. '81cd05ee665fdfb3').
         */
        fun version(version: String) = apply { this.version = version }

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

        fun build(): PromptListParams =
            PromptListParams(
                endingBefore,
                ids,
                limit,
                orgName,
                projectId,
                projectName,
                promptName,
                slug,
                startingAfter,
                version,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    @JsonDeserialize(using = Ids.Deserializer::class)
    @JsonSerialize(using = Ids.Serializer::class)
    class Ids
    private constructor(
        private val string: String? = null,
        private val strings: List<String>? = null,
        private val _json: JsonValue? = null,
    ) {

        private var validated: Boolean = false

        fun string(): Optional<String> = Optional.ofNullable(string)

        fun strings(): Optional<List<String>> = Optional.ofNullable(strings)

        fun isString(): Boolean = string != null

        fun isStrings(): Boolean = strings != null

        fun asString(): String = string.getOrThrow("string")

        fun asStrings(): List<String> = strings.getOrThrow("strings")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                string != null -> visitor.visitString(string)
                strings != null -> visitor.visitStrings(strings)
                else -> visitor.unknown(_json)
            }
        }

        fun validate(): Ids = apply {
            if (!validated) {
                if (string == null && strings == null) {
                    throw BraintrustInvalidDataException("Unknown Ids: $_json")
                }
                validated = true
            }
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
                _json != null -> "Ids{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Ids")
            }

        companion object {

            @JvmStatic fun ofString(string: String) = Ids(string = string)

            @JvmStatic fun ofStrings(strings: List<String>) = Ids(strings = strings)
        }

        interface Visitor<out T> {

            fun visitString(string: String): T

            fun visitStrings(strings: List<String>): T

            fun unknown(json: JsonValue?): T {
                throw BraintrustInvalidDataException("Unknown Ids: $json")
            }
        }

        class Deserializer : BaseDeserializer<Ids>(Ids::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Ids {
                val json = JsonValue.fromJsonNode(node)

                tryDeserialize(node, jacksonTypeRef<String>())?.let {
                    return Ids(string = it, _json = json)
                }
                tryDeserialize(node, jacksonTypeRef<List<String>>())?.let {
                    return Ids(strings = it, _json = json)
                }

                return Ids(_json = json)
            }
        }

        class Serializer : BaseSerializer<Ids>(Ids::class) {

            override fun serialize(
                value: Ids,
                generator: JsonGenerator,
                provider: SerializerProvider
            ) {
                when {
                    value.string != null -> generator.writeObject(value.string)
                    value.strings != null -> generator.writeObject(value.strings)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Ids")
                }
            }
        }
    }
}
