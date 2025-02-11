// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.Params
import com.braintrustdata.api.core.checkRequired
import com.braintrustdata.api.core.http.Headers
import com.braintrustdata.api.core.http.QueryParams
import com.braintrustdata.api.core.immutableEmptyMap
import com.braintrustdata.api.core.toImmutable
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Objects
import java.util.Optional

/**
 * Partially update a project object. Specify the fields to update in the payload. Any object-type
 * fields will be deep-merged with existing content. Currently we do not support removing fields or
 * setting them to null.
 */
class ProjectUpdateParams
private constructor(
    private val projectId: String,
    private val body: ProjectUpdateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Project id */
    fun projectId(): String = projectId

    /** Name of the project */
    fun name(): Optional<String> = body.name()

    /**
     * Project settings. Patch operations replace all settings, so make sure you include all
     * settings you want to keep.
     */
    fun settings(): Optional<ProjectSettings> = body.settings()

    /** Name of the project */
    fun _name(): JsonField<String> = body._name()

    /**
     * Project settings. Patch operations replace all settings, so make sure you include all
     * settings you want to keep.
     */
    fun _settings(): JsonField<ProjectSettings> = body._settings()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun _body(): ProjectUpdateBody = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> projectId
            else -> ""
        }
    }

    @NoAutoDetect
    class ProjectUpdateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("settings")
        @ExcludeMissing
        private val settings: JsonField<ProjectSettings> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Name of the project */
        fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

        /**
         * Project settings. Patch operations replace all settings, so make sure you include all
         * settings you want to keep.
         */
        fun settings(): Optional<ProjectSettings> =
            Optional.ofNullable(settings.getNullable("settings"))

        /** Name of the project */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Project settings. Patch operations replace all settings, so make sure you include all
         * settings you want to keep.
         */
        @JsonProperty("settings")
        @ExcludeMissing
        fun _settings(): JsonField<ProjectSettings> = settings

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): ProjectUpdateBody = apply {
            if (validated) {
                return@apply
            }

            name()
            settings().ifPresent { it.validate() }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ProjectUpdateBody]. */
        class Builder internal constructor() {

            private var name: JsonField<String> = JsonMissing.of()
            private var settings: JsonField<ProjectSettings> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(projectUpdateBody: ProjectUpdateBody) = apply {
                name = projectUpdateBody.name
                settings = projectUpdateBody.settings
                additionalProperties = projectUpdateBody.additionalProperties.toMutableMap()
            }

            /** Name of the project */
            fun name(name: String?) = name(JsonField.ofNullable(name))

            /** Name of the project */
            fun name(name: Optional<String>) = name(name.orElse(null))

            /** Name of the project */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /**
             * Project settings. Patch operations replace all settings, so make sure you include all
             * settings you want to keep.
             */
            fun settings(settings: ProjectSettings?) = settings(JsonField.ofNullable(settings))

            /**
             * Project settings. Patch operations replace all settings, so make sure you include all
             * settings you want to keep.
             */
            fun settings(settings: Optional<ProjectSettings>) = settings(settings.orElse(null))

            /**
             * Project settings. Patch operations replace all settings, so make sure you include all
             * settings you want to keep.
             */
            fun settings(settings: JsonField<ProjectSettings>) = apply { this.settings = settings }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            fun build(): ProjectUpdateBody =
                ProjectUpdateBody(
                    name,
                    settings,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ProjectUpdateBody && name == other.name && settings == other.settings && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(name, settings, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ProjectUpdateBody{name=$name, settings=$settings, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ProjectUpdateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var projectId: String? = null
        private var body: ProjectUpdateBody.Builder = ProjectUpdateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(projectUpdateParams: ProjectUpdateParams) = apply {
            projectId = projectUpdateParams.projectId
            body = projectUpdateParams.body.toBuilder()
            additionalHeaders = projectUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = projectUpdateParams.additionalQueryParams.toBuilder()
        }

        /** Project id */
        fun projectId(projectId: String) = apply { this.projectId = projectId }

        /** Name of the project */
        fun name(name: String?) = apply { body.name(name) }

        /** Name of the project */
        fun name(name: Optional<String>) = name(name.orElse(null))

        /** Name of the project */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /**
         * Project settings. Patch operations replace all settings, so make sure you include all
         * settings you want to keep.
         */
        fun settings(settings: ProjectSettings?) = apply { body.settings(settings) }

        /**
         * Project settings. Patch operations replace all settings, so make sure you include all
         * settings you want to keep.
         */
        fun settings(settings: Optional<ProjectSettings>) = settings(settings.orElse(null))

        /**
         * Project settings. Patch operations replace all settings, so make sure you include all
         * settings you want to keep.
         */
        fun settings(settings: JsonField<ProjectSettings>) = apply { body.settings(settings) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

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

        fun build(): ProjectUpdateParams =
            ProjectUpdateParams(
                checkRequired("projectId", projectId),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ProjectUpdateParams && projectId == other.projectId && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(projectId, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ProjectUpdateParams{projectId=$projectId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
