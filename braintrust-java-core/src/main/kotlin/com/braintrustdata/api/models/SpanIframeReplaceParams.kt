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
 * Create or replace span_iframe. If there is an existing span_iframe with the same name as the one
 * specified in the request, will replace the existing span_iframe with the provided fields
 */
class SpanIframeReplaceParams
private constructor(
    private val body: SpanIframeReplaceBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Name of the span iframe */
    fun name(): String = body.name()

    /** Unique identifier for the project that the span iframe belongs under */
    fun projectId(): String = body.projectId()

    /** URL to embed the project viewer in an iframe */
    fun url(): String = body.url()

    /** Textual description of the span iframe */
    fun description(): Optional<String> = body.description()

    /**
     * Whether to post messages to the iframe containing the span's data. This is useful when you
     * want to render more data than fits in the URL.
     */
    fun postMessage(): Optional<Boolean> = body.postMessage()

    /** Name of the span iframe */
    fun _name(): JsonField<String> = body._name()

    /** Unique identifier for the project that the span iframe belongs under */
    fun _projectId(): JsonField<String> = body._projectId()

    /** URL to embed the project viewer in an iframe */
    fun _url(): JsonField<String> = body._url()

    /** Textual description of the span iframe */
    fun _description(): JsonField<String> = body._description()

    /**
     * Whether to post messages to the iframe containing the span's data. This is useful when you
     * want to render more data than fits in the URL.
     */
    fun _postMessage(): JsonField<Boolean> = body._postMessage()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun _body(): SpanIframeReplaceBody = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class SpanIframeReplaceBody
    @JsonCreator
    internal constructor(
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("project_id")
        @ExcludeMissing
        private val projectId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("url") @ExcludeMissing private val url: JsonField<String> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        private val description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("post_message")
        @ExcludeMissing
        private val postMessage: JsonField<Boolean> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Name of the span iframe */
        fun name(): String = name.getRequired("name")

        /** Unique identifier for the project that the span iframe belongs under */
        fun projectId(): String = projectId.getRequired("project_id")

        /** URL to embed the project viewer in an iframe */
        fun url(): String = url.getRequired("url")

        /** Textual description of the span iframe */
        fun description(): Optional<String> =
            Optional.ofNullable(description.getNullable("description"))

        /**
         * Whether to post messages to the iframe containing the span's data. This is useful when
         * you want to render more data than fits in the URL.
         */
        fun postMessage(): Optional<Boolean> =
            Optional.ofNullable(postMessage.getNullable("post_message"))

        /** Name of the span iframe */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /** Unique identifier for the project that the span iframe belongs under */
        @JsonProperty("project_id") @ExcludeMissing fun _projectId(): JsonField<String> = projectId

        /** URL to embed the project viewer in an iframe */
        @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

        /** Textual description of the span iframe */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Whether to post messages to the iframe containing the span's data. This is useful when
         * you want to render more data than fits in the URL.
         */
        @JsonProperty("post_message")
        @ExcludeMissing
        fun _postMessage(): JsonField<Boolean> = postMessage

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): SpanIframeReplaceBody = apply {
            if (validated) {
                return@apply
            }

            name()
            projectId()
            url()
            description()
            postMessage()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [SpanIframeReplaceBody]. */
        class Builder internal constructor() {

            private var name: JsonField<String>? = null
            private var projectId: JsonField<String>? = null
            private var url: JsonField<String>? = null
            private var description: JsonField<String> = JsonMissing.of()
            private var postMessage: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(spanIframeReplaceBody: SpanIframeReplaceBody) = apply {
                name = spanIframeReplaceBody.name
                projectId = spanIframeReplaceBody.projectId
                url = spanIframeReplaceBody.url
                description = spanIframeReplaceBody.description
                postMessage = spanIframeReplaceBody.postMessage
                additionalProperties = spanIframeReplaceBody.additionalProperties.toMutableMap()
            }

            /** Name of the span iframe */
            fun name(name: String) = name(JsonField.of(name))

            /** Name of the span iframe */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** Unique identifier for the project that the span iframe belongs under */
            fun projectId(projectId: String) = projectId(JsonField.of(projectId))

            /** Unique identifier for the project that the span iframe belongs under */
            fun projectId(projectId: JsonField<String>) = apply { this.projectId = projectId }

            /** URL to embed the project viewer in an iframe */
            fun url(url: String) = url(JsonField.of(url))

            /** URL to embed the project viewer in an iframe */
            fun url(url: JsonField<String>) = apply { this.url = url }

            /** Textual description of the span iframe */
            fun description(description: String?) = description(JsonField.ofNullable(description))

            /** Textual description of the span iframe */
            fun description(description: Optional<String>) = description(description.orElse(null))

            /** Textual description of the span iframe */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /**
             * Whether to post messages to the iframe containing the span's data. This is useful
             * when you want to render more data than fits in the URL.
             */
            fun postMessage(postMessage: Boolean?) = postMessage(JsonField.ofNullable(postMessage))

            /**
             * Whether to post messages to the iframe containing the span's data. This is useful
             * when you want to render more data than fits in the URL.
             */
            fun postMessage(postMessage: Boolean) = postMessage(postMessage as Boolean?)

            /**
             * Whether to post messages to the iframe containing the span's data. This is useful
             * when you want to render more data than fits in the URL.
             */
            @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
            fun postMessage(postMessage: Optional<Boolean>) =
                postMessage(postMessage.orElse(null) as Boolean?)

            /**
             * Whether to post messages to the iframe containing the span's data. This is useful
             * when you want to render more data than fits in the URL.
             */
            fun postMessage(postMessage: JsonField<Boolean>) = apply {
                this.postMessage = postMessage
            }

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

            fun build(): SpanIframeReplaceBody =
                SpanIframeReplaceBody(
                    checkRequired("name", name),
                    checkRequired("projectId", projectId),
                    checkRequired("url", url),
                    description,
                    postMessage,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is SpanIframeReplaceBody && name == other.name && projectId == other.projectId && url == other.url && description == other.description && postMessage == other.postMessage && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(name, projectId, url, description, postMessage, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SpanIframeReplaceBody{name=$name, projectId=$projectId, url=$url, description=$description, postMessage=$postMessage, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SpanIframeReplaceParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var body: SpanIframeReplaceBody.Builder = SpanIframeReplaceBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(spanIframeReplaceParams: SpanIframeReplaceParams) = apply {
            body = spanIframeReplaceParams.body.toBuilder()
            additionalHeaders = spanIframeReplaceParams.additionalHeaders.toBuilder()
            additionalQueryParams = spanIframeReplaceParams.additionalQueryParams.toBuilder()
        }

        /** Name of the span iframe */
        fun name(name: String) = apply { body.name(name) }

        /** Name of the span iframe */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /** Unique identifier for the project that the span iframe belongs under */
        fun projectId(projectId: String) = apply { body.projectId(projectId) }

        /** Unique identifier for the project that the span iframe belongs under */
        fun projectId(projectId: JsonField<String>) = apply { body.projectId(projectId) }

        /** URL to embed the project viewer in an iframe */
        fun url(url: String) = apply { body.url(url) }

        /** URL to embed the project viewer in an iframe */
        fun url(url: JsonField<String>) = apply { body.url(url) }

        /** Textual description of the span iframe */
        fun description(description: String?) = apply { body.description(description) }

        /** Textual description of the span iframe */
        fun description(description: Optional<String>) = description(description.orElse(null))

        /** Textual description of the span iframe */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        /**
         * Whether to post messages to the iframe containing the span's data. This is useful when
         * you want to render more data than fits in the URL.
         */
        fun postMessage(postMessage: Boolean?) = apply { body.postMessage(postMessage) }

        /**
         * Whether to post messages to the iframe containing the span's data. This is useful when
         * you want to render more data than fits in the URL.
         */
        fun postMessage(postMessage: Boolean) = postMessage(postMessage as Boolean?)

        /**
         * Whether to post messages to the iframe containing the span's data. This is useful when
         * you want to render more data than fits in the URL.
         */
        @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
        fun postMessage(postMessage: Optional<Boolean>) =
            postMessage(postMessage.orElse(null) as Boolean?)

        /**
         * Whether to post messages to the iframe containing the span's data. This is useful when
         * you want to render more data than fits in the URL.
         */
        fun postMessage(postMessage: JsonField<Boolean>) = apply { body.postMessage(postMessage) }

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

        fun build(): SpanIframeReplaceParams =
            SpanIframeReplaceParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SpanIframeReplaceParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "SpanIframeReplaceParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
