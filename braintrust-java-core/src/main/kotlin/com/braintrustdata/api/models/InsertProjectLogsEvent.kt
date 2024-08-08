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

@JsonDeserialize(using = InsertProjectLogsEvent.Deserializer::class)
@JsonSerialize(using = InsertProjectLogsEvent.Serializer::class)
class InsertProjectLogsEvent
private constructor(
    private val insertProjectLogsEventReplace: InsertProjectLogsEventReplace? = null,
    private val insertProjectLogsEventMerge: InsertProjectLogsEventMerge? = null,
    private val _json: JsonValue? = null,
) {

    private var validated: Boolean = false

    fun insertProjectLogsEventReplace(): Optional<InsertProjectLogsEventReplace> =
        Optional.ofNullable(insertProjectLogsEventReplace)

    fun insertProjectLogsEventMerge(): Optional<InsertProjectLogsEventMerge> =
        Optional.ofNullable(insertProjectLogsEventMerge)

    fun isInsertProjectLogsEventReplace(): Boolean = insertProjectLogsEventReplace != null

    fun isInsertProjectLogsEventMerge(): Boolean = insertProjectLogsEventMerge != null

    fun asInsertProjectLogsEventReplace(): InsertProjectLogsEventReplace =
        insertProjectLogsEventReplace.getOrThrow("insertProjectLogsEventReplace")

    fun asInsertProjectLogsEventMerge(): InsertProjectLogsEventMerge =
        insertProjectLogsEventMerge.getOrThrow("insertProjectLogsEventMerge")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    fun <T> accept(visitor: Visitor<T>): T {
        return when {
            insertProjectLogsEventReplace != null ->
                visitor.visitInsertProjectLogsEventReplace(insertProjectLogsEventReplace)
            insertProjectLogsEventMerge != null ->
                visitor.visitInsertProjectLogsEventMerge(insertProjectLogsEventMerge)
            else -> visitor.unknown(_json)
        }
    }

    fun validate(): InsertProjectLogsEvent = apply {
        if (!validated) {
            if (insertProjectLogsEventReplace == null && insertProjectLogsEventMerge == null) {
                throw BraintrustInvalidDataException("Unknown InsertProjectLogsEvent: $_json")
            }
            insertProjectLogsEventReplace?.validate()
            insertProjectLogsEventMerge?.validate()
            validated = true
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InsertProjectLogsEvent &&
            this.insertProjectLogsEventReplace == other.insertProjectLogsEventReplace &&
            this.insertProjectLogsEventMerge == other.insertProjectLogsEventMerge
    }

    override fun hashCode(): Int {
        return Objects.hash(insertProjectLogsEventReplace, insertProjectLogsEventMerge)
    }

    override fun toString(): String {
        return when {
            insertProjectLogsEventReplace != null ->
                "InsertProjectLogsEvent{insertProjectLogsEventReplace=$insertProjectLogsEventReplace}"
            insertProjectLogsEventMerge != null ->
                "InsertProjectLogsEvent{insertProjectLogsEventMerge=$insertProjectLogsEventMerge}"
            _json != null -> "InsertProjectLogsEvent{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid InsertProjectLogsEvent")
        }
    }

    companion object {

        @JvmStatic
        fun ofInsertProjectLogsEventReplace(
            insertProjectLogsEventReplace: InsertProjectLogsEventReplace
        ) = InsertProjectLogsEvent(insertProjectLogsEventReplace = insertProjectLogsEventReplace)

        @JvmStatic
        fun ofInsertProjectLogsEventMerge(
            insertProjectLogsEventMerge: InsertProjectLogsEventMerge
        ) = InsertProjectLogsEvent(insertProjectLogsEventMerge = insertProjectLogsEventMerge)
    }

    interface Visitor<out T> {

        fun visitInsertProjectLogsEventReplace(
            insertProjectLogsEventReplace: InsertProjectLogsEventReplace
        ): T

        fun visitInsertProjectLogsEventMerge(
            insertProjectLogsEventMerge: InsertProjectLogsEventMerge
        ): T

        fun unknown(json: JsonValue?): T {
            throw BraintrustInvalidDataException("Unknown InsertProjectLogsEvent: $json")
        }
    }

    class Deserializer : BaseDeserializer<InsertProjectLogsEvent>(InsertProjectLogsEvent::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): InsertProjectLogsEvent {
            val json = JsonValue.fromJsonNode(node)
            tryDeserialize(node, jacksonTypeRef<InsertProjectLogsEventReplace>()) { it.validate() }
                ?.let {
                    return InsertProjectLogsEvent(insertProjectLogsEventReplace = it, _json = json)
                }
            tryDeserialize(node, jacksonTypeRef<InsertProjectLogsEventMerge>()) { it.validate() }
                ?.let {
                    return InsertProjectLogsEvent(insertProjectLogsEventMerge = it, _json = json)
                }

            return InsertProjectLogsEvent(_json = json)
        }
    }

    class Serializer : BaseSerializer<InsertProjectLogsEvent>(InsertProjectLogsEvent::class) {

        override fun serialize(
            value: InsertProjectLogsEvent,
            generator: JsonGenerator,
            provider: SerializerProvider
        ) {
            when {
                value.insertProjectLogsEventReplace != null ->
                    generator.writeObject(value.insertProjectLogsEventReplace)
                value.insertProjectLogsEventMerge != null ->
                    generator.writeObject(value.insertProjectLogsEventMerge)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid InsertProjectLogsEvent")
            }
        }
    }
}
