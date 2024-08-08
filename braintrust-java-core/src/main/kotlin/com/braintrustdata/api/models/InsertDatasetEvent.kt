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

@JsonDeserialize(using = InsertDatasetEvent.Deserializer::class)
@JsonSerialize(using = InsertDatasetEvent.Serializer::class)
class InsertDatasetEvent
private constructor(
    private val insertDatasetEventReplace: InsertDatasetEventReplace? = null,
    private val insertDatasetEventMerge: InsertDatasetEventMerge? = null,
    private val _json: JsonValue? = null,
) {

    private var validated: Boolean = false

    fun insertDatasetEventReplace(): Optional<InsertDatasetEventReplace> =
        Optional.ofNullable(insertDatasetEventReplace)

    fun insertDatasetEventMerge(): Optional<InsertDatasetEventMerge> =
        Optional.ofNullable(insertDatasetEventMerge)

    fun isInsertDatasetEventReplace(): Boolean = insertDatasetEventReplace != null

    fun isInsertDatasetEventMerge(): Boolean = insertDatasetEventMerge != null

    fun asInsertDatasetEventReplace(): InsertDatasetEventReplace =
        insertDatasetEventReplace.getOrThrow("insertDatasetEventReplace")

    fun asInsertDatasetEventMerge(): InsertDatasetEventMerge =
        insertDatasetEventMerge.getOrThrow("insertDatasetEventMerge")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    fun <T> accept(visitor: Visitor<T>): T {
        return when {
            insertDatasetEventReplace != null ->
                visitor.visitInsertDatasetEventReplace(insertDatasetEventReplace)
            insertDatasetEventMerge != null ->
                visitor.visitInsertDatasetEventMerge(insertDatasetEventMerge)
            else -> visitor.unknown(_json)
        }
    }

    fun validate(): InsertDatasetEvent = apply {
        if (!validated) {
            if (insertDatasetEventReplace == null && insertDatasetEventMerge == null) {
                throw BraintrustInvalidDataException("Unknown InsertDatasetEvent: $_json")
            }
            insertDatasetEventReplace?.validate()
            insertDatasetEventMerge?.validate()
            validated = true
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InsertDatasetEvent &&
            this.insertDatasetEventReplace == other.insertDatasetEventReplace &&
            this.insertDatasetEventMerge == other.insertDatasetEventMerge
    }

    override fun hashCode(): Int {
        return Objects.hash(insertDatasetEventReplace, insertDatasetEventMerge)
    }

    override fun toString(): String {
        return when {
            insertDatasetEventReplace != null ->
                "InsertDatasetEvent{insertDatasetEventReplace=$insertDatasetEventReplace}"
            insertDatasetEventMerge != null ->
                "InsertDatasetEvent{insertDatasetEventMerge=$insertDatasetEventMerge}"
            _json != null -> "InsertDatasetEvent{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid InsertDatasetEvent")
        }
    }

    companion object {

        @JvmStatic
        fun ofInsertDatasetEventReplace(insertDatasetEventReplace: InsertDatasetEventReplace) =
            InsertDatasetEvent(insertDatasetEventReplace = insertDatasetEventReplace)

        @JvmStatic
        fun ofInsertDatasetEventMerge(insertDatasetEventMerge: InsertDatasetEventMerge) =
            InsertDatasetEvent(insertDatasetEventMerge = insertDatasetEventMerge)
    }

    interface Visitor<out T> {

        fun visitInsertDatasetEventReplace(insertDatasetEventReplace: InsertDatasetEventReplace): T

        fun visitInsertDatasetEventMerge(insertDatasetEventMerge: InsertDatasetEventMerge): T

        fun unknown(json: JsonValue?): T {
            throw BraintrustInvalidDataException("Unknown InsertDatasetEvent: $json")
        }
    }

    class Deserializer : BaseDeserializer<InsertDatasetEvent>(InsertDatasetEvent::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): InsertDatasetEvent {
            val json = JsonValue.fromJsonNode(node)
            tryDeserialize(node, jacksonTypeRef<InsertDatasetEventReplace>()) { it.validate() }
                ?.let {
                    return InsertDatasetEvent(insertDatasetEventReplace = it, _json = json)
                }
            tryDeserialize(node, jacksonTypeRef<InsertDatasetEventMerge>()) { it.validate() }
                ?.let {
                    return InsertDatasetEvent(insertDatasetEventMerge = it, _json = json)
                }

            return InsertDatasetEvent(_json = json)
        }
    }

    class Serializer : BaseSerializer<InsertDatasetEvent>(InsertDatasetEvent::class) {

        override fun serialize(
            value: InsertDatasetEvent,
            generator: JsonGenerator,
            provider: SerializerProvider
        ) {
            when {
                value.insertDatasetEventReplace != null ->
                    generator.writeObject(value.insertDatasetEventReplace)
                value.insertDatasetEventMerge != null ->
                    generator.writeObject(value.insertDatasetEventMerge)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid InsertDatasetEvent")
            }
        }
    }
}
