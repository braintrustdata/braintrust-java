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
 * Partially update a project_tag object. Specify the fields to update in the payload. Any
 * object-type fields will be deep-merged with existing content. Currently we do not support
 * removing fields or setting them to null.
 */
class ProjectTagUpdateParams
private constructor(
    private val projectTagId: String,
    private val body: ProjectTagUpdateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** ProjectTag id */
    fun projectTagId(): String = projectTagId

    /** Color of the tag for the UI */
    fun color(): Optional<String> = body.color()

    /** Textual description of the project tag */
    fun description(): Optional<String> = body.description()

    /** Name of the project tag */
    fun name(): Optional<String> = body.name()

    /** Color of the tag for the UI */
    fun _color(): JsonField<String> = body._color()

    /** Textual description of the project tag */
    fun _description(): JsonField<String> = body._description()

    /** Name of the project tag */
    fun _name(): JsonField<String> = body._name()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun _body(): ProjectTagUpdateBody = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> projectTagId
            else -> ""
        }
    }

    @NoAutoDetect
    class ProjectTagUpdateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("color")
        @ExcludeMissing
        private val color: JsonField<String> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        private val description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Color of the tag for the UI */
        fun color(): Optional<String> = Optional.ofNullable(color.getNullable("color"))

        /** Textual description of the project tag */
        fun description(): Optional<String> =
            Optional.ofNullable(description.getNullable("description"))

        /** Name of the project tag */
        fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

        /** Color of the tag for the UI */
        @JsonProperty("color") @ExcludeMissing fun _color(): JsonField<String> = color

        /** Textual description of the project tag */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /** Name of the project tag */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): ProjectTagUpdateBody = apply {
            if (validated) {
                return@apply
            }

            color()
            description()
            name()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ProjectTagUpdateBody]. */
        class Builder internal constructor() {

            private var color: JsonField<String> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(projectTagUpdateBody: ProjectTagUpdateBody) = apply {
                color = projectTagUpdateBody.color
                description = projectTagUpdateBody.description
                name = projectTagUpdateBody.name
                additionalProperties = projectTagUpdateBody.additionalProperties.toMutableMap()
            }

            /** Color of the tag for the UI */
            fun color(color: String?) = color(JsonField.ofNullable(color))

            /** Color of the tag for the UI */
            fun color(color: Optional<String>) = color(color.orElse(null))

            /** Color of the tag for the UI */
            fun color(color: JsonField<String>) = apply { this.color = color }

            /** Textual description of the project tag */
            fun description(description: String?) = description(JsonField.ofNullable(description))

            /** Textual description of the project tag */
            fun description(description: Optional<String>) = description(description.orElse(null))

            /** Textual description of the project tag */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /** Name of the project tag */
            fun name(name: String?) = name(JsonField.ofNullable(name))

            /** Name of the project tag */
            fun name(name: Optional<String>) = name(name.orElse(null))

            /** Name of the project tag */
            fun name(name: JsonField<String>) = apply { this.name = name }

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

            fun build(): ProjectTagUpdateBody =
                ProjectTagUpdateBody(color, description, name, additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ProjectTagUpdateBody && color == other.color && description == other.description && name == other.name && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(color, description, name, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ProjectTagUpdateBody{color=$color, description=$description, name=$name, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ProjectTagUpdateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var projectTagId: String? = null
        private var body: ProjectTagUpdateBody.Builder = ProjectTagUpdateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(projectTagUpdateParams: ProjectTagUpdateParams) = apply {
            projectTagId = projectTagUpdateParams.projectTagId
            body = projectTagUpdateParams.body.toBuilder()
            additionalHeaders = projectTagUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = projectTagUpdateParams.additionalQueryParams.toBuilder()
        }

        /** ProjectTag id */
        fun projectTagId(projectTagId: String) = apply { this.projectTagId = projectTagId }

        /** Color of the tag for the UI */
        fun color(color: String?) = apply { body.color(color) }

        /** Color of the tag for the UI */
        fun color(color: Optional<String>) = color(color.orElse(null))

        /** Color of the tag for the UI */
        fun color(color: JsonField<String>) = apply { body.color(color) }

        /** Textual description of the project tag */
        fun description(description: String?) = apply { body.description(description) }

        /** Textual description of the project tag */
        fun description(description: Optional<String>) = description(description.orElse(null))

        /** Textual description of the project tag */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        /** Name of the project tag */
        fun name(name: String?) = apply { body.name(name) }

        /** Name of the project tag */
        fun name(name: Optional<String>) = name(name.orElse(null))

        /** Name of the project tag */
        fun name(name: JsonField<String>) = apply { body.name(name) }

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

        fun build(): ProjectTagUpdateParams =
            ProjectTagUpdateParams(
                checkRequired("projectTagId", projectTagId),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ProjectTagUpdateParams && projectTagId == other.projectTagId && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(projectTagId, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ProjectTagUpdateParams{projectTagId=$projectTagId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
