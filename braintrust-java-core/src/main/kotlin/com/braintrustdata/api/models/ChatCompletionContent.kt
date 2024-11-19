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
}
