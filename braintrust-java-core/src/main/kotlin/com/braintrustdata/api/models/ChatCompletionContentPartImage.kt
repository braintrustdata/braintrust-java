// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.Enum
import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.toUnmodifiable
import com.braintrustdata.api.errors.BraintrustInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = ChatCompletionContentPartImage.Builder::class)
@NoAutoDetect
class ChatCompletionContentPartImage
private constructor(
    private val imageUrl: JsonField<ImageUrl>,
    private val type: JsonField<Type>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    fun imageUrl(): ImageUrl = imageUrl.getRequired("image_url")

    fun type(): Type = type.getRequired("type")

    @JsonProperty("image_url") @ExcludeMissing fun _imageUrl() = imageUrl

    @JsonProperty("type") @ExcludeMissing fun _type() = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): ChatCompletionContentPartImage = apply {
        if (!validated) {
            imageUrl().validate()
            type()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var imageUrl: JsonField<ImageUrl> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(chatCompletionContentPartImage: ChatCompletionContentPartImage) = apply {
            this.imageUrl = chatCompletionContentPartImage.imageUrl
            this.type = chatCompletionContentPartImage.type
            additionalProperties(chatCompletionContentPartImage.additionalProperties)
        }

        fun imageUrl(imageUrl: ImageUrl) = imageUrl(JsonField.of(imageUrl))

        @JsonProperty("image_url")
        @ExcludeMissing
        fun imageUrl(imageUrl: JsonField<ImageUrl>) = apply { this.imageUrl = imageUrl }

        fun type(type: Type) = type(JsonField.of(type))

        @JsonProperty("type")
        @ExcludeMissing
        fun type(type: JsonField<Type>) = apply { this.type = type }

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

        fun build(): ChatCompletionContentPartImage =
            ChatCompletionContentPartImage(
                imageUrl,
                type,
                additionalProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(builder = ImageUrl.Builder::class)
    @NoAutoDetect
    class ImageUrl
    private constructor(
        private val url: JsonField<String>,
        private val detail: JsonField<Detail>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun url(): String = url.getRequired("url")

        fun detail(): Optional<Detail> = Optional.ofNullable(detail.getNullable("detail"))

        @JsonProperty("url") @ExcludeMissing fun _url() = url

        @JsonProperty("detail") @ExcludeMissing fun _detail() = detail

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): ImageUrl = apply {
            if (!validated) {
                url()
                detail()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var url: JsonField<String> = JsonMissing.of()
            private var detail: JsonField<Detail> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(imageUrl: ImageUrl) = apply {
                this.url = imageUrl.url
                this.detail = imageUrl.detail
                additionalProperties(imageUrl.additionalProperties)
            }

            fun url(url: String) = url(JsonField.of(url))

            @JsonProperty("url")
            @ExcludeMissing
            fun url(url: JsonField<String>) = apply { this.url = url }

            fun detail(detail: Detail) = detail(JsonField.of(detail))

            @JsonProperty("detail")
            @ExcludeMissing
            fun detail(detail: JsonField<Detail>) = apply { this.detail = detail }

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

            fun build(): ImageUrl =
                ImageUrl(
                    url,
                    detail,
                    additionalProperties.toUnmodifiable(),
                )
        }

        class Detail
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Detail && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val AUTO = Detail(JsonField.of("auto"))

                @JvmField val LOW = Detail(JsonField.of("low"))

                @JvmField val HIGH = Detail(JsonField.of("high"))

                @JvmStatic fun of(value: String) = Detail(JsonField.of(value))
            }

            enum class Known {
                AUTO,
                LOW,
                HIGH,
            }

            enum class Value {
                AUTO,
                LOW,
                HIGH,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    AUTO -> Value.AUTO
                    LOW -> Value.LOW
                    HIGH -> Value.HIGH
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    AUTO -> Known.AUTO
                    LOW -> Known.LOW
                    HIGH -> Known.HIGH
                    else -> throw BraintrustInvalidDataException("Unknown Detail: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ImageUrl && this.url == other.url && this.detail == other.detail && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(url, detail, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "ImageUrl{url=$url, detail=$detail, additionalProperties=$additionalProperties}"
    }

    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Type && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val IMAGE_URL = Type(JsonField.of("image_url"))

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            IMAGE_URL,
        }

        enum class Value {
            IMAGE_URL,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                IMAGE_URL -> Value.IMAGE_URL
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                IMAGE_URL -> Known.IMAGE_URL
                else -> throw BraintrustInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ChatCompletionContentPartImage && this.imageUrl == other.imageUrl && this.type == other.type && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(imageUrl, type, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() =
        "ChatCompletionContentPartImage{imageUrl=$imageUrl, type=$type, additionalProperties=$additionalProperties}"
}
