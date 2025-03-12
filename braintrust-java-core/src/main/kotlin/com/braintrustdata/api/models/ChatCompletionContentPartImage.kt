// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.Enum
import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.checkRequired
import com.braintrustdata.api.core.immutableEmptyMap
import com.braintrustdata.api.core.toImmutable
import com.braintrustdata.api.errors.BraintrustInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class ChatCompletionContentPartImage @JsonCreator private constructor(
    @JsonProperty("image_url") @ExcludeMissing private val imageUrl: JsonField<ImageUrl> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),

) {

    fun imageUrl(): ImageUrl = imageUrl.getRequired("image_url")

    fun type(): Type = type.getRequired("type")

    @JsonProperty("image_url")
    @ExcludeMissing
    fun _imageUrl(): JsonField<ImageUrl> = imageUrl

    @JsonProperty("type")
    @ExcludeMissing
    fun _type(): JsonField<Type> = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): ChatCompletionContentPartImage =
        apply {
            if (validated) {
              return@apply
            }

            imageUrl().validate()
            type()
            validated = true
        }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [ChatCompletionContentPartImage].
         *
         * The following fields are required:
         *
         * ```java
         * .imageUrl()
         * .type()
         * ```
         */
        @JvmStatic
        fun builder() = Builder()
    }

    /** A builder for [ChatCompletionContentPartImage]. */
    class Builder internal constructor() {

        private var imageUrl: JsonField<ImageUrl>? = null
        private var type: JsonField<Type>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(chatCompletionContentPartImage: ChatCompletionContentPartImage) =
            apply {
                imageUrl = chatCompletionContentPartImage.imageUrl
                type = chatCompletionContentPartImage.type
                additionalProperties = chatCompletionContentPartImage.additionalProperties.toMutableMap()
            }

        fun imageUrl(imageUrl: ImageUrl) = imageUrl(JsonField.of(imageUrl))

        fun imageUrl(imageUrl: JsonField<ImageUrl>) =
            apply {
                this.imageUrl = imageUrl
            }

        fun type(type: Type) = type(JsonField.of(type))

        fun type(type: JsonField<Type>) =
            apply {
                this.type = type
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

        fun build(): ChatCompletionContentPartImage =
            ChatCompletionContentPartImage(
              checkRequired(
                "imageUrl", imageUrl
              ),
              checkRequired(
                "type", type
              ),
              additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class ImageUrl @JsonCreator private constructor(
        @JsonProperty("url") @ExcludeMissing private val url: JsonField<String> = JsonMissing.of(),
        @JsonProperty("detail") @ExcludeMissing private val detail: JsonField<Detail> = JsonMissing.of(),
        @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),

    ) {

        fun url(): String = url.getRequired("url")

        fun detail(): Optional<Detail> = Optional.ofNullable(detail.getNullable("detail"))

        @JsonProperty("url")
        @ExcludeMissing
        fun _url(): JsonField<String> = url

        @JsonProperty("detail")
        @ExcludeMissing
        fun _detail(): JsonField<Detail> = detail

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): ImageUrl =
            apply {
                if (validated) {
                  return@apply
                }

                url()
                detail()
                validated = true
            }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [ImageUrl].
             *
             * The following fields are required:
             *
             * ```java
             * .url()
             * ```
             */
            @JvmStatic
            fun builder() = Builder()
        }

        /** A builder for [ImageUrl]. */
        class Builder internal constructor() {

            private var url: JsonField<String>? = null
            private var detail: JsonField<Detail> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(imageUrl: ImageUrl) =
                apply {
                    url = imageUrl.url
                    detail = imageUrl.detail
                    additionalProperties = imageUrl.additionalProperties.toMutableMap()
                }

            fun url(url: String) = url(JsonField.of(url))

            fun url(url: JsonField<String>) =
                apply {
                    this.url = url
                }

            fun detail(detail: Detail) = detail(JsonField.of(detail))

            fun detail(detail: JsonField<Detail>) =
                apply {
                    this.detail = detail
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

            fun build(): ImageUrl =
                ImageUrl(
                  checkRequired(
                    "url", url
                  ),
                  detail,
                  additionalProperties.toImmutable(),
                )
        }

        class Detail @JsonCreator private constructor(
            private val value: JsonField<String>,

        ) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that
             * doesn't match any known member, and you want to know that value. For example, if
             * the SDK is on an older version than the API, then the API may respond with new
             * members that the SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue
            fun _value(): JsonField<String> = value

            companion object {

                @JvmField val AUTO = of("auto")

                @JvmField val LOW = of("low")

                @JvmField val HIGH = of("high")

                @JvmStatic fun of(value: String) = Detail(JsonField.of(value))
            }

            /** An enum containing [Detail]'s known values. */
            enum class Known {
                AUTO,
                LOW,
                HIGH,
            }

            /**
             * An enum containing [Detail]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Detail] can contain an unknown value in a couple of cases:
             *
             * - It was deserialized from data that doesn't match any known member. For
             *   example, if the SDK is on an older version than the API, then the API may
             *   respond with new members that the SDK is unaware of.
             *
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                AUTO,
                LOW,
                HIGH,
                /** An enum member indicating that [Detail] was instantiated with an unknown value. */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if
             * you want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    AUTO -> Value.AUTO
                    LOW -> Value.LOW
                    HIGH -> Value.HIGH
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws BraintrustInvalidDataException if this class instance's value is a not a
             * known member.
             */
            fun known(): Known =
                when (this) {
                    AUTO -> Known.AUTO
                    LOW -> Known.LOW
                    HIGH -> Known.HIGH
                    else -> throw BraintrustInvalidDataException("Unknown Detail: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws BraintrustInvalidDataException if this class instance's value does not
             * have the expected primitive type.
             */
            fun asString(): String = _value().asString().orElseThrow { BraintrustInvalidDataException("Value is not a String") }

            override fun equals(other: Any?): Boolean {
              if (this === other) {
                  return true
              }

              return /* spotless:off */ other is Detail && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return /* spotless:off */ other is ImageUrl && url == other.url && detail == other.detail && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(url, detail, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "ImageUrl{url=$url, detail=$detail, additionalProperties=$additionalProperties}"
    }

    class Type @JsonCreator private constructor(
        private val value: JsonField<String>,

    ) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that
         * doesn't match any known member, and you want to know that value. For example, if
         * the SDK is on an older version than the API, then the API may respond with new
         * members that the SDK is unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue
        fun _value(): JsonField<String> = value

        companion object {

            @JvmField val IMAGE_URL = of("image_url")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            IMAGE_URL,
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         *
         * - It was deserialized from data that doesn't match any known member. For
         *   example, if the SDK is on an older version than the API, then the API may
         *   respond with new members that the SDK is unaware of.
         *
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            IMAGE_URL,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or
         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if
         * you want to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                IMAGE_URL -> Value.IMAGE_URL
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and
         * don't want to throw for the unknown case.
         *
         * @throws BraintrustInvalidDataException if this class instance's value is a not a
         * known member.
         */
        fun known(): Known =
            when (this) {
                IMAGE_URL -> Known.IMAGE_URL
                else -> throw BraintrustInvalidDataException("Unknown Type: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for
         * debugging and generally doesn't throw.
         *
         * @throws BraintrustInvalidDataException if this class instance's value does not
         * have the expected primitive type.
         */
        fun asString(): String = _value().asString().orElseThrow { BraintrustInvalidDataException("Value is not a String") }

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return /* spotless:off */ other is Type && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return /* spotless:off */ other is ChatCompletionContentPartImage && imageUrl == other.imageUrl && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(imageUrl, type, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() = "ChatCompletionContentPartImage{imageUrl=$imageUrl, type=$type, additionalProperties=$additionalProperties}"
}
