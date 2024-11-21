// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.http.Headers
import com.braintrustdata.api.core.http.QueryParams
import com.braintrustdata.api.core.toImmutable
import com.braintrustdata.api.models.*
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import java.util.Objects
import java.util.Optional

class SpanIframeReplaceParams
constructor(
    private val name: String,
    private val projectId: String,
    private val url: String,
    private val description: String?,
    private val postMessage: Boolean?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun name(): String = name

    fun projectId(): String = projectId

    fun url(): String = url

    fun description(): Optional<String> = Optional.ofNullable(description)

    fun postMessage(): Optional<Boolean> = Optional.ofNullable(postMessage)

    @JvmSynthetic
    internal fun getBody(): SpanIframeReplaceBody {
        return SpanIframeReplaceBody(
            name,
            projectId,
            url,
            description,
            postMessage,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @JsonDeserialize(builder = SpanIframeReplaceBody.Builder::class)
    @NoAutoDetect
    class SpanIframeReplaceBody
    internal constructor(
        private val name: String?,
        private val projectId: String?,
        private val url: String?,
        private val description: String?,
        private val postMessage: Boolean?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** Name of the span iframe */
        @JsonProperty("name") fun name(): String? = name

        /** Unique identifier for the project that the span iframe belongs under */
        @JsonProperty("project_id") fun projectId(): String? = projectId

        /** URL to embed the project viewer in an iframe */
        @JsonProperty("url") fun url(): String? = url

        /** Textual description of the span iframe */
        @JsonProperty("description") fun description(): String? = description

        /**
         * Whether to post messages to the iframe containing the span's data. This is useful when
         * you want to render more data than fits in the URL.
         */
        @JsonProperty("post_message") fun postMessage(): Boolean? = postMessage

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
            private var url: String? = null
            private var description: String? = null
            private var postMessage: Boolean? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(spanIframeReplaceBody: SpanIframeReplaceBody) = apply {
                this.name = spanIframeReplaceBody.name
                this.projectId = spanIframeReplaceBody.projectId
                this.url = spanIframeReplaceBody.url
                this.description = spanIframeReplaceBody.description
                this.postMessage = spanIframeReplaceBody.postMessage
                additionalProperties(spanIframeReplaceBody.additionalProperties)
            }

            /** Name of the span iframe */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            /** Unique identifier for the project that the span iframe belongs under */
            @JsonProperty("project_id")
            fun projectId(projectId: String) = apply { this.projectId = projectId }

            /** URL to embed the project viewer in an iframe */
            @JsonProperty("url") fun url(url: String) = apply { this.url = url }

            /** Textual description of the span iframe */
            @JsonProperty("description")
            fun description(description: String) = apply { this.description = description }

            /**
             * Whether to post messages to the iframe containing the span's data. This is useful
             * when you want to render more data than fits in the URL.
             */
            @JsonProperty("post_message")
            fun postMessage(postMessage: Boolean) = apply { this.postMessage = postMessage }

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

            fun build(): SpanIframeReplaceBody =
                SpanIframeReplaceBody(
                    checkNotNull(name) { "`name` is required but was not set" },
                    checkNotNull(projectId) { "`projectId` is required but was not set" },
                    checkNotNull(url) { "`url` is required but was not set" },
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

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SpanIframeReplaceParams && name == other.name && projectId == other.projectId && url == other.url && description == other.description && postMessage == other.postMessage && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(name, projectId, url, description, postMessage, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "SpanIframeReplaceParams{name=$name, projectId=$projectId, url=$url, description=$description, postMessage=$postMessage, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var name: String? = null
        private var projectId: String? = null
        private var url: String? = null
        private var description: String? = null
        private var postMessage: Boolean? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(spanIframeReplaceParams: SpanIframeReplaceParams) = apply {
            this.name = spanIframeReplaceParams.name
            this.projectId = spanIframeReplaceParams.projectId
            this.url = spanIframeReplaceParams.url
            this.description = spanIframeReplaceParams.description
            this.postMessage = spanIframeReplaceParams.postMessage
            additionalHeaders(spanIframeReplaceParams.additionalHeaders)
            additionalQueryParams(spanIframeReplaceParams.additionalQueryParams)
            additionalBodyProperties(spanIframeReplaceParams.additionalBodyProperties)
        }

        /** Name of the span iframe */
        fun name(name: String) = apply { this.name = name }

        /** Unique identifier for the project that the span iframe belongs under */
        fun projectId(projectId: String) = apply { this.projectId = projectId }

        /** URL to embed the project viewer in an iframe */
        fun url(url: String) = apply { this.url = url }

        /** Textual description of the span iframe */
        fun description(description: String) = apply { this.description = description }

        /**
         * Whether to post messages to the iframe containing the span's data. This is useful when
         * you want to render more data than fits in the URL.
         */
        fun postMessage(postMessage: Boolean) = apply { this.postMessage = postMessage }

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

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            putAllAdditionalBodyProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply {
            additionalBodyProperties.remove(key)
        }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalBodyProperty)
        }

        fun build(): SpanIframeReplaceParams =
            SpanIframeReplaceParams(
                checkNotNull(name) { "`name` is required but was not set" },
                checkNotNull(projectId) { "`projectId` is required but was not set" },
                checkNotNull(url) { "`url` is required but was not set" },
                description,
                postMessage,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }
}
