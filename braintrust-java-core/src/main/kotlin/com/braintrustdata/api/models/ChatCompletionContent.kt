// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.BaseDeserializer
import com.braintrustdata.api.core.BaseSerializer
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.getOrThrow
import com.braintrustdata.api.errors.BraintrustInvalidDataException
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.util.Objects
import java.util.Optional

@JsonDeserialize(using = ChatCompletionContent.Deserializer::class)
@JsonSerialize(using = ChatCompletionContent.Serializer::class)
class ChatCompletionContent
private constructor(
    private val text: String? = null,
    private val array: List<ChatCompletionContentPart>? = null,
    private val _json: JsonValue? = null,
) {

    private var validated: Boolean = false

    fun text(): Optional<String> = Optional.ofNullable(text)

    fun array(): Optional<List<ChatCompletionContentPart>> = Optional.ofNullable(array)

    fun isText(): Boolean = text != null

    fun isArray(): Boolean = array != null

    fun asText(): String = text.getOrThrow("text")

    fun asArray(): List<ChatCompletionContentPart> = array.getOrThrow("array")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    fun <T> accept(visitor: Visitor<T>): T {
        return when {
            text != null -> visitor.visitText(text)
            array != null -> visitor.visitArray(array)
            else -> visitor.unknown(_json)
        }
    }

    fun validate(): ChatCompletionContent = apply {
        if (!validated) {
            if (text == null && array == null) {
                throw BraintrustInvalidDataException("Unknown ChatCompletionContent: $_json")
            }
            validated = true
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ChatCompletionContent && this.text == other.text && this.array == other.array /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(text, array) /* spotless:on */
    }

    override fun toString(): String {
        return when {
            text != null -> "ChatCompletionContent{text=$text}"
            array != null -> "ChatCompletionContent{array=$array}"
            _json != null -> "ChatCompletionContent{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid ChatCompletionContent")
        }
    }

    companion object {

        @JvmStatic fun ofText(text: String) = ChatCompletionContent(text = text)

        @JvmStatic
        fun ofArray(array: List<ChatCompletionContentPart>) = ChatCompletionContent(array = array)
    }

    interface Visitor<out T> {

        fun visitText(text: String): T

        fun visitArray(array: List<ChatCompletionContentPart>): T

        fun unknown(json: JsonValue?): T {
            throw BraintrustInvalidDataException("Unknown ChatCompletionContent: $json")
        }
    }

    class Deserializer : BaseDeserializer<ChatCompletionContent>(ChatCompletionContent::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): ChatCompletionContent {
            val json = JsonValue.fromJsonNode(node)

            tryDeserialize(node, jacksonTypeRef<String>())?.let {
                return ChatCompletionContent(text = it, _json = json)
            }
            tryDeserialize(node, jacksonTypeRef<List<ChatCompletionContentPart>>())?.let {
                return ChatCompletionContent(array = it, _json = json)
            }

            return ChatCompletionContent(_json = json)
        }
    }

    class Serializer : BaseSerializer<ChatCompletionContent>(ChatCompletionContent::class) {

        override fun serialize(
            value: ChatCompletionContent,
            generator: JsonGenerator,
            provider: SerializerProvider
        ) {
            when {
                value.text != null -> generator.writeObject(value.text)
                value.array != null -> generator.writeObject(value.array)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid ChatCompletionContent")
            }
        }
    }

    @JsonDeserialize(using = ChatCompletionContentPart.Deserializer::class)
    @JsonSerialize(using = ChatCompletionContentPart.Serializer::class)
    class ChatCompletionContentPart
    private constructor(
        private val chatCompletionContentPartText: ChatCompletionContentPartText? = null,
        private val chatCompletionContentPartImage: ChatCompletionContentPartImage? = null,
        private val _json: JsonValue? = null,
    ) {

        private var validated: Boolean = false

        fun chatCompletionContentPartText(): Optional<ChatCompletionContentPartText> =
            Optional.ofNullable(chatCompletionContentPartText)

        fun chatCompletionContentPartImage(): Optional<ChatCompletionContentPartImage> =
            Optional.ofNullable(chatCompletionContentPartImage)

        fun isChatCompletionContentPartText(): Boolean = chatCompletionContentPartText != null

        fun isChatCompletionContentPartImage(): Boolean = chatCompletionContentPartImage != null

        fun asChatCompletionContentPartText(): ChatCompletionContentPartText =
            chatCompletionContentPartText.getOrThrow("chatCompletionContentPartText")

        fun asChatCompletionContentPartImage(): ChatCompletionContentPartImage =
            chatCompletionContentPartImage.getOrThrow("chatCompletionContentPartImage")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                chatCompletionContentPartText != null ->
                    visitor.visitChatCompletionContentPartText(chatCompletionContentPartText)
                chatCompletionContentPartImage != null ->
                    visitor.visitChatCompletionContentPartImage(chatCompletionContentPartImage)
                else -> visitor.unknown(_json)
            }
        }

        fun validate(): ChatCompletionContentPart = apply {
            if (!validated) {
                if (
                    chatCompletionContentPartText == null && chatCompletionContentPartImage == null
                ) {
                    throw BraintrustInvalidDataException(
                        "Unknown ChatCompletionContentPart: $_json"
                    )
                }
                chatCompletionContentPartText?.validate()
                chatCompletionContentPartImage?.validate()
                validated = true
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ChatCompletionContentPart && this.chatCompletionContentPartText == other.chatCompletionContentPartText && this.chatCompletionContentPartImage == other.chatCompletionContentPartImage /* spotless:on */
        }

        override fun hashCode(): Int {
            return /* spotless:off */ Objects.hash(chatCompletionContentPartText, chatCompletionContentPartImage) /* spotless:on */
        }

        override fun toString(): String {
            return when {
                chatCompletionContentPartText != null ->
                    "ChatCompletionContentPart{chatCompletionContentPartText=$chatCompletionContentPartText}"
                chatCompletionContentPartImage != null ->
                    "ChatCompletionContentPart{chatCompletionContentPartImage=$chatCompletionContentPartImage}"
                _json != null -> "ChatCompletionContentPart{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid ChatCompletionContentPart")
            }
        }

        companion object {

            @JvmStatic
            fun ofChatCompletionContentPartText(
                chatCompletionContentPartText: ChatCompletionContentPartText
            ) =
                ChatCompletionContentPart(
                    chatCompletionContentPartText = chatCompletionContentPartText
                )

            @JvmStatic
            fun ofChatCompletionContentPartImage(
                chatCompletionContentPartImage: ChatCompletionContentPartImage
            ) =
                ChatCompletionContentPart(
                    chatCompletionContentPartImage = chatCompletionContentPartImage
                )
        }

        interface Visitor<out T> {

            fun visitChatCompletionContentPartText(
                chatCompletionContentPartText: ChatCompletionContentPartText
            ): T

            fun visitChatCompletionContentPartImage(
                chatCompletionContentPartImage: ChatCompletionContentPartImage
            ): T

            fun unknown(json: JsonValue?): T {
                throw BraintrustInvalidDataException("Unknown ChatCompletionContentPart: $json")
            }
        }

        class Deserializer :
            BaseDeserializer<ChatCompletionContentPart>(ChatCompletionContentPart::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): ChatCompletionContentPart {
                val json = JsonValue.fromJsonNode(node)

                tryDeserialize(node, jacksonTypeRef<ChatCompletionContentPartText>()) {
                        it.validate()
                    }
                    ?.let {
                        return ChatCompletionContentPart(
                            chatCompletionContentPartText = it,
                            _json = json
                        )
                    }
                tryDeserialize(node, jacksonTypeRef<ChatCompletionContentPartImage>()) {
                        it.validate()
                    }
                    ?.let {
                        return ChatCompletionContentPart(
                            chatCompletionContentPartImage = it,
                            _json = json
                        )
                    }

                return ChatCompletionContentPart(_json = json)
            }
        }

        class Serializer :
            BaseSerializer<ChatCompletionContentPart>(ChatCompletionContentPart::class) {

            override fun serialize(
                value: ChatCompletionContentPart,
                generator: JsonGenerator,
                provider: SerializerProvider
            ) {
                when {
                    value.chatCompletionContentPartText != null ->
                        generator.writeObject(value.chatCompletionContentPartText)
                    value.chatCompletionContentPartImage != null ->
                        generator.writeObject(value.chatCompletionContentPartImage)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid ChatCompletionContentPart")
                }
            }
        }
    }
}
