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

/**
 * A path-lookup filter describes an equality comparison against a specific sub-field in the event
 * row. For instance, if you wish to filter on the value of `c` in `{"input": {"a": {"b": {"c":
 * "hello"}}}}`, pass `path=["input", "a", "b", "c"]` and `value="hello"`
 */
@JsonDeserialize(builder = PathLookupFilter.Builder::class)
@NoAutoDetect
class PathLookupFilter
private constructor(
    private val type: JsonField<Type>,
    private val path: JsonField<List<String>>,
    private val value: JsonValue,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** Denotes the type of filter as a path-lookup filter */
    fun type(): Type = type.getRequired("type")

    /**
     * List of fields describing the path to the value to be checked against. For instance, if you
     * wish to filter on the value of `c` in `{"input": {"a": {"b": {"c": "hello"}}}}`, pass
     * `path=["input", "a", "b", "c"]`
     */
    fun path(): List<String> = path.getRequired("path")

    /**
     * The value to compare equality-wise against the event value at the specified `path`. The value
     * must be a "primitive", that is, any JSON-serializable object except for objects and arrays.
     * For instance, if you wish to filter on the value of "input.a.b.c" in the object `{"input":
     * {"a": {"b": {"c": "hello"}}}}`, pass `value="hello"`
     */
    fun value(): JsonValue = value

    /** Denotes the type of filter as a path-lookup filter */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    /**
     * List of fields describing the path to the value to be checked against. For instance, if you
     * wish to filter on the value of `c` in `{"input": {"a": {"b": {"c": "hello"}}}}`, pass
     * `path=["input", "a", "b", "c"]`
     */
    @JsonProperty("path") @ExcludeMissing fun _path() = path

    /**
     * The value to compare equality-wise against the event value at the specified `path`. The value
     * must be a "primitive", that is, any JSON-serializable object except for objects and arrays.
     * For instance, if you wish to filter on the value of "input.a.b.c" in the object `{"input":
     * {"a": {"b": {"c": "hello"}}}}`, pass `value="hello"`
     */
    @JsonProperty("value") @ExcludeMissing fun _value() = value

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): PathLookupFilter = apply {
        if (!validated) {
            type()
            path()
            value()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PathLookupFilter &&
            this.type == other.type &&
            this.path == other.path &&
            this.value == other.value &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    type,
                    path,
                    value,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "PathLookupFilter{type=$type, path=$path, value=$value, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var type: JsonField<Type> = JsonMissing.of()
        private var path: JsonField<List<String>> = JsonMissing.of()
        private var value: JsonValue = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(pathLookupFilter: PathLookupFilter) = apply {
            this.type = pathLookupFilter.type
            this.path = pathLookupFilter.path
            this.value = pathLookupFilter.value
            additionalProperties(pathLookupFilter.additionalProperties)
        }

        /** Denotes the type of filter as a path-lookup filter */
        fun type(type: Type) = type(JsonField.of(type))

        /** Denotes the type of filter as a path-lookup filter */
        @JsonProperty("type")
        @ExcludeMissing
        fun type(type: JsonField<Type>) = apply { this.type = type }

        /**
         * List of fields describing the path to the value to be checked against. For instance, if
         * you wish to filter on the value of `c` in `{"input": {"a": {"b": {"c": "hello"}}}}`, pass
         * `path=["input", "a", "b", "c"]`
         */
        fun path(path: List<String>) = path(JsonField.of(path))

        /**
         * List of fields describing the path to the value to be checked against. For instance, if
         * you wish to filter on the value of `c` in `{"input": {"a": {"b": {"c": "hello"}}}}`, pass
         * `path=["input", "a", "b", "c"]`
         */
        @JsonProperty("path")
        @ExcludeMissing
        fun path(path: JsonField<List<String>>) = apply { this.path = path }

        /**
         * The value to compare equality-wise against the event value at the specified `path`. The
         * value must be a "primitive", that is, any JSON-serializable object except for objects and
         * arrays. For instance, if you wish to filter on the value of "input.a.b.c" in the object
         * `{"input": {"a": {"b": {"c": "hello"}}}}`, pass `value="hello"`
         */
        @JsonProperty("value")
        @ExcludeMissing
        fun value(value: JsonValue) = apply { this.value = value }

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

        fun build(): PathLookupFilter =
            PathLookupFilter(
                type,
                path.map { it.toUnmodifiable() },
                value,
                additionalProperties.toUnmodifiable(),
            )
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

            return other is Type && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val PATH_LOOKUP = Type(JsonField.of("path_lookup"))

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            PATH_LOOKUP,
        }

        enum class Value {
            PATH_LOOKUP,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                PATH_LOOKUP -> Value.PATH_LOOKUP
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                PATH_LOOKUP -> Known.PATH_LOOKUP
                else -> throw BraintrustInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
