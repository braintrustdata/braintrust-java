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

@JsonDeserialize(using = InsertExperimentEvent.Deserializer::class)
@JsonSerialize(using = InsertExperimentEvent.Serializer::class)
class InsertExperimentEvent
private constructor(
    private val insertExperimentEventReplace: InsertExperimentEventReplace? = null,
    private val insertExperimentEventMerge: InsertExperimentEventMerge? = null,
    private val _json: JsonValue? = null,
) {

    private var validated: Boolean = false

    fun insertExperimentEventReplace(): Optional<InsertExperimentEventReplace> =
        Optional.ofNullable(insertExperimentEventReplace)

    fun insertExperimentEventMerge(): Optional<InsertExperimentEventMerge> =
        Optional.ofNullable(insertExperimentEventMerge)

    fun isInsertExperimentEventReplace(): Boolean = insertExperimentEventReplace != null

    fun isInsertExperimentEventMerge(): Boolean = insertExperimentEventMerge != null

    fun asInsertExperimentEventReplace(): InsertExperimentEventReplace =
        insertExperimentEventReplace.getOrThrow("insertExperimentEventReplace")

    fun asInsertExperimentEventMerge(): InsertExperimentEventMerge =
        insertExperimentEventMerge.getOrThrow("insertExperimentEventMerge")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    fun <T> accept(visitor: Visitor<T>): T {
        return when {
            insertExperimentEventReplace != null ->
                visitor.visitInsertExperimentEventReplace(insertExperimentEventReplace)
            insertExperimentEventMerge != null ->
                visitor.visitInsertExperimentEventMerge(insertExperimentEventMerge)
            else -> visitor.unknown(_json)
        }
    }

    fun validate(): InsertExperimentEvent = apply {
        if (!validated) {
            if (insertExperimentEventReplace == null && insertExperimentEventMerge == null) {
                throw BraintrustInvalidDataException("Unknown InsertExperimentEvent: $_json")
            }
            insertExperimentEventReplace?.validate()
            insertExperimentEventMerge?.validate()
            validated = true
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InsertExperimentEvent &&
            this.insertExperimentEventReplace == other.insertExperimentEventReplace &&
            this.insertExperimentEventMerge == other.insertExperimentEventMerge
    }

    override fun hashCode(): Int {
        return Objects.hash(insertExperimentEventReplace, insertExperimentEventMerge)
    }

    override fun toString(): String {
        return when {
            insertExperimentEventReplace != null ->
                "InsertExperimentEvent{insertExperimentEventReplace=$insertExperimentEventReplace}"
            insertExperimentEventMerge != null ->
                "InsertExperimentEvent{insertExperimentEventMerge=$insertExperimentEventMerge}"
            _json != null -> "InsertExperimentEvent{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid InsertExperimentEvent")
        }
    }

    companion object {

        @JvmStatic
        fun ofInsertExperimentEventReplace(
            insertExperimentEventReplace: InsertExperimentEventReplace
        ) = InsertExperimentEvent(insertExperimentEventReplace = insertExperimentEventReplace)

        @JvmStatic
        fun ofInsertExperimentEventMerge(insertExperimentEventMerge: InsertExperimentEventMerge) =
            InsertExperimentEvent(insertExperimentEventMerge = insertExperimentEventMerge)
    }

    interface Visitor<out T> {

        fun visitInsertExperimentEventReplace(
            insertExperimentEventReplace: InsertExperimentEventReplace
        ): T

        fun visitInsertExperimentEventMerge(
            insertExperimentEventMerge: InsertExperimentEventMerge
        ): T

        fun unknown(json: JsonValue?): T {
            throw BraintrustInvalidDataException("Unknown InsertExperimentEvent: $json")
        }
    }

    class Deserializer : BaseDeserializer<InsertExperimentEvent>(InsertExperimentEvent::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): InsertExperimentEvent {
            val json = JsonValue.fromJsonNode(node)
            tryDeserialize(node, jacksonTypeRef<InsertExperimentEventReplace>()) { it.validate() }
                ?.let {
                    return InsertExperimentEvent(insertExperimentEventReplace = it, _json = json)
                }
            tryDeserialize(node, jacksonTypeRef<InsertExperimentEventMerge>()) { it.validate() }
                ?.let {
                    return InsertExperimentEvent(insertExperimentEventMerge = it, _json = json)
                }

            return InsertExperimentEvent(_json = json)
        }
    }

    class Serializer : BaseSerializer<InsertExperimentEvent>(InsertExperimentEvent::class) {

        override fun serialize(
            value: InsertExperimentEvent,
            generator: JsonGenerator,
            provider: SerializerProvider
        ) {
            when {
                value.insertExperimentEventReplace != null ->
                    generator.writeObject(value.insertExperimentEventReplace)
                value.insertExperimentEventMerge != null ->
                    generator.writeObject(value.insertExperimentEventMerge)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid InsertExperimentEvent")
            }
        }
    }
}
