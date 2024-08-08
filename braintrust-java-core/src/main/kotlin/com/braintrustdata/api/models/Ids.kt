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

@JsonDeserialize(using = Ids.Deserializer::class)
@JsonSerialize(using = Ids.Serializer::class)
class Ids
private constructor(
    private val string: String? = null,
    private val strings: List<String>? = null,
    private val _json: JsonValue? = null,
) {

    private var validated: Boolean = false

    fun string(): Optional<String> = Optional.ofNullable(string)

    fun strings(): Optional<List<String>> = Optional.ofNullable(strings)

    fun isString(): Boolean = string != null

    fun isStrings(): Boolean = strings != null

    fun asString(): String = string.getOrThrow("string")

    fun asStrings(): List<String> = strings.getOrThrow("strings")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    fun <T> accept(visitor: Visitor<T>): T {
        return when {
            string != null -> visitor.visitString(string)
            strings != null -> visitor.visitStrings(strings)
            else -> visitor.unknown(_json)
        }
    }

    fun validate(): Ids = apply {
        if (!validated) {
            if (string == null && strings == null) {
                throw BraintrustInvalidDataException("Unknown Ids: $_json")
            }
            validated = true
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Ids && this.string == other.string && this.strings == other.strings
    }

    override fun hashCode(): Int {
        return Objects.hash(string, strings)
    }

    override fun toString(): String {
        return when {
            string != null -> "Ids{string=$string}"
            strings != null -> "Ids{strings=$strings}"
            _json != null -> "Ids{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid Ids")
        }
    }

    companion object {

        @JvmStatic fun ofString(string: String) = Ids(string = string)

        @JvmStatic fun ofStrings(strings: List<String>) = Ids(strings = strings)
    }

    interface Visitor<out T> {

        fun visitString(string: String): T

        fun visitStrings(strings: List<String>): T

        fun unknown(json: JsonValue?): T {
            throw BraintrustInvalidDataException("Unknown Ids: $json")
        }
    }

    class Deserializer : BaseDeserializer<Ids>(Ids::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): Ids {
            val json = JsonValue.fromJsonNode(node)
            tryDeserialize(node, jacksonTypeRef<String>())?.let {
                return Ids(string = it, _json = json)
            }
            tryDeserialize(node, jacksonTypeRef<List<String>>())?.let {
                return Ids(strings = it, _json = json)
            }

            return Ids(_json = json)
        }
    }

    class Serializer : BaseSerializer<Ids>(Ids::class) {

        override fun serialize(value: Ids, generator: JsonGenerator, provider: SerializerProvider) {
            when {
                value.string != null -> generator.writeObject(value.string)
                value.strings != null -> generator.writeObject(value.strings)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid Ids")
            }
        }
    }
}
