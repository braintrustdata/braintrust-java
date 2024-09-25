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

@JsonDeserialize(builder = ImageUrl.Builder::class)
@NoAutoDetect
class ImageUrl
private constructor(
    private val url: JsonField<String>,
    private val detail: JsonField<Detail>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ImageUrl &&
            this.url == other.url &&
            this.detail == other.detail &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    url,
                    detail,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "ImageUrl{url=$url, detail=$detail, additionalProperties=$additionalProperties}"

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

            return other is Detail && this.value == other.value
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
}
