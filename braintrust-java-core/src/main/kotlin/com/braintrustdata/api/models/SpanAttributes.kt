// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.immutableEmptyMap
import com.braintrustdata.api.core.toImmutable
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Human-identifying attributes of the span, such as name, type, etc. */
@NoAutoDetect
class SpanAttributes
@JsonCreator
private constructor(
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonField<SpanType> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** Name of the span, for display purposes only */
    fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

    /** Type of the span, for display purposes only */
    fun type(): Optional<SpanType> = Optional.ofNullable(type.getNullable("type"))

    /** Name of the span, for display purposes only */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /** Type of the span, for display purposes only */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<SpanType> = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): SpanAttributes = apply {
        if (validated) {
            return@apply
        }

        name()
        type()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /** Returns a mutable builder for constructing an instance of [SpanAttributes]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SpanAttributes]. */
    class Builder internal constructor() {

        private var name: JsonField<String> = JsonMissing.of()
        private var type: JsonField<SpanType> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(spanAttributes: SpanAttributes) = apply {
            name = spanAttributes.name
            type = spanAttributes.type
            additionalProperties = spanAttributes.additionalProperties.toMutableMap()
        }

        /** Name of the span, for display purposes only */
        fun name(name: String?) = name(JsonField.ofNullable(name))

        /** Name of the span, for display purposes only */
        fun name(name: Optional<String>) = name(name.getOrNull())

        /** Name of the span, for display purposes only */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Type of the span, for display purposes only */
        fun type(type: SpanType?) = type(JsonField.ofNullable(type))

        /** Type of the span, for display purposes only */
        fun type(type: Optional<SpanType>) = type(type.getOrNull())

        /** Type of the span, for display purposes only */
        fun type(type: JsonField<SpanType>) = apply { this.type = type }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        fun build(): SpanAttributes = SpanAttributes(name, type, additionalProperties.toImmutable())
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SpanAttributes && name == other.name && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(name, type, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SpanAttributes{name=$name, type=$type, additionalProperties=$additionalProperties}"
}
