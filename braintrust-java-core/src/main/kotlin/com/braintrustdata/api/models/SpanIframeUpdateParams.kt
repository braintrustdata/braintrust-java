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
import kotlin.jvm.optionals.getOrNull

/**
 * Partially update a span_iframe object. Specify the fields to update in the
 * payload. Any object-type fields will be deep-merged with existing content.
 * Currently we do not support removing fields or setting them to null.
 */
class SpanIframeUpdateParams private constructor(
    private val spanIframeId: String,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,

) : Params {

    /** SpanIframe id */
    fun spanIframeId(): String = spanIframeId

    /** Name of the span iframe */
    fun name(): Optional<String> = body.name()

    /**
     * Whether to post messages to the iframe containing the span's data. This is
     * useful when you want to render more data than fits in the URL.
     */
    fun postMessage(): Optional<Boolean> = body.postMessage()

    /** URL to embed the project viewer in an iframe */
    fun url(): Optional<String> = body.url()

    /** Name of the span iframe */
    fun _name(): JsonField<String> = body._name()

    /**
     * Whether to post messages to the iframe containing the span's data. This is
     * useful when you want to render more data than fits in the URL.
     */
    fun _postMessage(): JsonField<Boolean> = body._postMessage()

    /** URL to embed the project viewer in an iframe */
    fun _url(): JsonField<String> = body._url()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic
    internal fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
      return when (index) {
          0 -> spanIframeId
          else -> ""
      }
    }

    @NoAutoDetect
    class Body @JsonCreator private constructor(
        @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("post_message") @ExcludeMissing private val postMessage: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("url") @ExcludeMissing private val url: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),

    ) {

        /** Name of the span iframe */
        fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

        /**
         * Whether to post messages to the iframe containing the span's data. This is
         * useful when you want to render more data than fits in the URL.
         */
        fun postMessage(): Optional<Boolean> = Optional.ofNullable(postMessage.getNullable("post_message"))

        /** URL to embed the project viewer in an iframe */
        fun url(): Optional<String> = Optional.ofNullable(url.getNullable("url"))

        /** Name of the span iframe */
        @JsonProperty("name")
        @ExcludeMissing
        fun _name(): JsonField<String> = name

        /**
         * Whether to post messages to the iframe containing the span's data. This is
         * useful when you want to render more data than fits in the URL.
         */
        @JsonProperty("post_message")
        @ExcludeMissing
        fun _postMessage(): JsonField<Boolean> = postMessage

        /** URL to embed the project viewer in an iframe */
        @JsonProperty("url")
        @ExcludeMissing
        fun _url(): JsonField<String> = url

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Body =
            apply {
                if (validated) {
                  return@apply
                }

                name()
                postMessage()
                url()
                validated = true
            }

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var name: JsonField<String> = JsonMissing.of()
            private var postMessage: JsonField<Boolean> = JsonMissing.of()
            private var url: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) =
                apply {
                    name = body.name
                    postMessage = body.postMessage
                    url = body.url
                    additionalProperties = body.additionalProperties.toMutableMap()
                }

            /** Name of the span iframe */
            fun name(name: String?) = name(JsonField.ofNullable(name))

            /** Name of the span iframe */
            fun name(name: Optional<String>) = name(name.getOrNull())

            /** Name of the span iframe */
            fun name(name: JsonField<String>) =
                apply {
                    this.name = name
                }

            /**
             * Whether to post messages to the iframe containing the span's data. This is
             * useful when you want to render more data than fits in the URL.
             */
            fun postMessage(postMessage: Boolean?) = postMessage(JsonField.ofNullable(postMessage))

            /**
             * Whether to post messages to the iframe containing the span's data. This is
             * useful when you want to render more data than fits in the URL.
             */
            fun postMessage(postMessage: Boolean) = postMessage(postMessage as Boolean?)

            /**
             * Whether to post messages to the iframe containing the span's data. This is
             * useful when you want to render more data than fits in the URL.
             */
            fun postMessage(postMessage: Optional<Boolean>) = postMessage(postMessage.getOrNull())

            /**
             * Whether to post messages to the iframe containing the span's data. This is
             * useful when you want to render more data than fits in the URL.
             */
            fun postMessage(postMessage: JsonField<Boolean>) =
                apply {
                    this.postMessage = postMessage
                }

            /** URL to embed the project viewer in an iframe */
            fun url(url: String?) = url(JsonField.ofNullable(url))

            /** URL to embed the project viewer in an iframe */
            fun url(url: Optional<String>) = url(url.getOrNull())

            /** URL to embed the project viewer in an iframe */
            fun url(url: JsonField<String>) =
                apply {
                    this.url = url
                }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

            fun putAdditionalProperty(key: String, value: JsonValue) =
                apply {
                    additionalProperties.put(key, value)
                }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun removeAdditionalProperty(key: String) =
                apply {
                    additionalProperties.remove(key)
                }

            fun removeAllAdditionalProperties(keys: Set<String>) =
                apply {
                    keys.forEach(::removeAdditionalProperty)
                }

            fun build(): Body =
                Body(
                  name,
                  postMessage,
                  url,
                  additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return /* spotless:off */ other is Body && name == other.name && postMessage == other.postMessage && url == other.url && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(name, postMessage, url, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Body{name=$name, postMessage=$postMessage, url=$url, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [SpanIframeUpdateParams].
         *
         * The following fields are required:
         *
         * ```java
         * .spanIframeId()
         * ```
         */
        @JvmStatic
        fun builder() = Builder()
    }

    /** A builder for [SpanIframeUpdateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var spanIframeId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(spanIframeUpdateParams: SpanIframeUpdateParams) =
            apply {
                spanIframeId = spanIframeUpdateParams.spanIframeId
                body = spanIframeUpdateParams.body.toBuilder()
                additionalHeaders = spanIframeUpdateParams.additionalHeaders.toBuilder()
                additionalQueryParams = spanIframeUpdateParams.additionalQueryParams.toBuilder()
            }

        /** SpanIframe id */
        fun spanIframeId(spanIframeId: String) =
            apply {
                this.spanIframeId = spanIframeId
            }

        /** Name of the span iframe */
        fun name(name: String?) =
            apply {
                body.name(name)
            }

        /** Name of the span iframe */
        fun name(name: Optional<String>) = name(name.getOrNull())

        /** Name of the span iframe */
        fun name(name: JsonField<String>) =
            apply {
                body.name(name)
            }

        /**
         * Whether to post messages to the iframe containing the span's data. This is
         * useful when you want to render more data than fits in the URL.
         */
        fun postMessage(postMessage: Boolean?) =
            apply {
                body.postMessage(postMessage)
            }

        /**
         * Whether to post messages to the iframe containing the span's data. This is
         * useful when you want to render more data than fits in the URL.
         */
        fun postMessage(postMessage: Boolean) = postMessage(postMessage as Boolean?)

        /**
         * Whether to post messages to the iframe containing the span's data. This is
         * useful when you want to render more data than fits in the URL.
         */
        fun postMessage(postMessage: Optional<Boolean>) = postMessage(postMessage.getOrNull())

        /**
         * Whether to post messages to the iframe containing the span's data. This is
         * useful when you want to render more data than fits in the URL.
         */
        fun postMessage(postMessage: JsonField<Boolean>) =
            apply {
                body.postMessage(postMessage)
            }

        /** URL to embed the project viewer in an iframe */
        fun url(url: String?) =
            apply {
                body.url(url)
            }

        /** URL to embed the project viewer in an iframe */
        fun url(url: Optional<String>) = url(url.getOrNull())

        /** URL to embed the project viewer in an iframe */
        fun url(url: JsonField<String>) =
            apply {
                body.url(url)
            }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.additionalProperties(additionalBodyProperties)
            }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) =
            apply {
                body.putAdditionalProperty(
                  key, value
                )
            }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) =
            apply {
                body.removeAdditionalProperty(key)
            }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) =
            apply {
                body.removeAllAdditionalProperties(keys)
            }

        fun additionalHeaders(additionalHeaders: Headers) =
            apply {
                this.additionalHeaders.clear()
                putAllAdditionalHeaders(additionalHeaders)
            }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) =
            apply {
                this.additionalHeaders.clear()
                putAllAdditionalHeaders(additionalHeaders)
            }

        fun putAdditionalHeader(name: String, value: String) =
            apply {
                additionalHeaders.put(name, value)
            }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) =
            apply {
                additionalHeaders.put(name, values)
            }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) =
            apply {
                this.additionalHeaders.putAll(additionalHeaders)
            }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) =
            apply {
                this.additionalHeaders.putAll(additionalHeaders)
            }

        fun replaceAdditionalHeaders(name: String, value: String) =
            apply {
                additionalHeaders.replace(name, value)
            }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) =
            apply {
                additionalHeaders.replace(name, values)
            }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) =
            apply {
                this.additionalHeaders.replaceAll(additionalHeaders)
            }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) =
            apply {
                this.additionalHeaders.replaceAll(additionalHeaders)
            }

        fun removeAdditionalHeaders(name: String) =
            apply {
                additionalHeaders.remove(name)
            }

        fun removeAllAdditionalHeaders(names: Set<String>) =
            apply {
                additionalHeaders.removeAll(names)
            }

        fun additionalQueryParams(additionalQueryParams: QueryParams) =
            apply {
                this.additionalQueryParams.clear()
                putAllAdditionalQueryParams(additionalQueryParams)
            }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.clear()
                putAllAdditionalQueryParams(additionalQueryParams)
            }

        fun putAdditionalQueryParam(key: String, value: String) =
            apply {
                additionalQueryParams.put(key, value)
            }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) =
            apply {
                additionalQueryParams.put(key, values)
            }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) =
            apply {
                additionalQueryParams.replace(key, value)
            }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) =
            apply {
                additionalQueryParams.replace(key, values)
            }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) =
            apply {
                additionalQueryParams.remove(key)
            }

        fun removeAllAdditionalQueryParams(keys: Set<String>) =
            apply {
                additionalQueryParams.removeAll(keys)
            }

        fun build(): SpanIframeUpdateParams =
            SpanIframeUpdateParams(
              checkRequired(
                "spanIframeId", spanIframeId
              ),
              body.build(),
              additionalHeaders.build(),
              additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return /* spotless:off */ other is SpanIframeUpdateParams && spanIframeId == other.spanIframeId && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(spanIframeId, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() = "SpanIframeUpdateParams{spanIframeId=$spanIframeId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
