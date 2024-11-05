// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.toImmutable
import com.braintrustdata.api.models.*
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import java.util.Objects
import java.util.Optional

class ProjectTagReplaceParams
constructor(
    private val name: String,
    private val projectId: String,
    private val color: String?,
    private val description: String?,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun name(): String = name

    fun projectId(): String = projectId

    fun color(): Optional<String> = Optional.ofNullable(color)

    fun description(): Optional<String> = Optional.ofNullable(description)

    @JvmSynthetic
    internal fun getBody(): ProjectTagReplaceBody {
        return ProjectTagReplaceBody(
            name,
            projectId,
            color,
            description,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JsonDeserialize(builder = ProjectTagReplaceBody.Builder::class)
    @NoAutoDetect
    class ProjectTagReplaceBody
    internal constructor(
        private val name: String?,
        private val projectId: String?,
        private val color: String?,
        private val description: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** Name of the project tag */
        @JsonProperty("name") fun name(): String? = name

        /** Unique identifier for the project that the project tag belongs under */
        @JsonProperty("project_id") fun projectId(): String? = projectId

        /** Color of the tag for the UI */
        @JsonProperty("color") fun color(): String? = color

        /** Textual description of the project tag */
        @JsonProperty("description") fun description(): String? = description

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var name: String? = null
            private var projectId: String? = null
            private var color: String? = null
            private var description: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(projectTagReplaceBody: ProjectTagReplaceBody) = apply {
                this.name = projectTagReplaceBody.name
                this.projectId = projectTagReplaceBody.projectId
                this.color = projectTagReplaceBody.color
                this.description = projectTagReplaceBody.description
                additionalProperties(projectTagReplaceBody.additionalProperties)
            }

            /** Name of the project tag */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            /** Unique identifier for the project that the project tag belongs under */
            @JsonProperty("project_id")
            fun projectId(projectId: String) = apply { this.projectId = projectId }

            /** Color of the tag for the UI */
            @JsonProperty("color") fun color(color: String) = apply { this.color = color }

            /** Textual description of the project tag */
            @JsonProperty("description")
            fun description(description: String) = apply { this.description = description }

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

            fun build(): ProjectTagReplaceBody =
                ProjectTagReplaceBody(
                    checkNotNull(name) { "`name` is required but was not set" },
                    checkNotNull(projectId) { "`projectId` is required but was not set" },
                    color,
                    description,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ProjectTagReplaceBody && this.name == other.name && this.projectId == other.projectId && this.color == other.color && this.description == other.description && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(name, projectId, color, description, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "ProjectTagReplaceBody{name=$name, projectId=$projectId, color=$color, description=$description, additionalProperties=$additionalProperties}"
    }

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ProjectTagReplaceParams && this.name == other.name && this.projectId == other.projectId && this.color == other.color && this.description == other.description && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(name, projectId, color, description, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "ProjectTagReplaceParams{name=$name, projectId=$projectId, color=$color, description=$description, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var name: String? = null
        private var projectId: String? = null
        private var color: String? = null
        private var description: String? = null
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(projectTagReplaceParams: ProjectTagReplaceParams) = apply {
            this.name = projectTagReplaceParams.name
            this.projectId = projectTagReplaceParams.projectId
            this.color = projectTagReplaceParams.color
            this.description = projectTagReplaceParams.description
            additionalHeaders(projectTagReplaceParams.additionalHeaders)
            additionalQueryParams(projectTagReplaceParams.additionalQueryParams)
            additionalBodyProperties(projectTagReplaceParams.additionalBodyProperties)
        }

        /** Name of the project tag */
        fun name(name: String) = apply { this.name = name }

        /** Unique identifier for the project that the project tag belongs under */
        fun projectId(projectId: String) = apply { this.projectId = projectId }

        /** Color of the tag for the UI */
        fun color(color: String) = apply { this.color = color }

        /** Textual description of the project tag */
        fun description(description: String) = apply { this.description = description }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.putAll(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(::putAdditionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replaceValues(name, listOf(value))
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replaceValues(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(::replaceAdditionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.removeAll(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            names.forEach(::removeAdditionalHeaders)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.putAll(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                additionalQueryParams.forEach(::putAdditionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replaceValues(key, listOf(value))
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replaceValues(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                additionalQueryParams.forEach(::replaceAdditionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply {
            additionalQueryParams.removeAll(key)
        }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalQueryParams)
        }

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

        fun build(): ProjectTagReplaceParams =
            ProjectTagReplaceParams(
                checkNotNull(name) { "`name` is required but was not set" },
                checkNotNull(projectId) { "`projectId` is required but was not set" },
                color,
                description,
                additionalHeaders
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalQueryParams
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalBodyProperties.toImmutable(),
            )
    }
}
