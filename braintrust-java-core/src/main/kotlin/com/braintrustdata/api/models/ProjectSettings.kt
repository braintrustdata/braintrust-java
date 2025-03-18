// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.Enum
import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.checkKnown
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
import kotlin.jvm.optionals.getOrNull

@NoAutoDetect
class ProjectSettings
@JsonCreator
private constructor(
    @JsonProperty("baseline_experiment_id")
    @ExcludeMissing
    private val baselineExperimentId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("comparison_key")
    @ExcludeMissing
    private val comparisonKey: JsonField<String> = JsonMissing.of(),
    @JsonProperty("spanFieldOrder")
    @ExcludeMissing
    private val spanFieldOrder: JsonField<List<SpanFieldOrder>> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * The id of the experiment to use as the default baseline for comparisons
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun baselineExperimentId(): Optional<String> =
        Optional.ofNullable(baselineExperimentId.getNullable("baseline_experiment_id"))

    /**
     * The key used to join two experiments (defaults to `input`)
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun comparisonKey(): Optional<String> =
        Optional.ofNullable(comparisonKey.getNullable("comparison_key"))

    /**
     * The order of the fields to display in the trace view
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun spanFieldOrder(): Optional<List<SpanFieldOrder>> =
        Optional.ofNullable(spanFieldOrder.getNullable("spanFieldOrder"))

    /**
     * Returns the raw JSON value of [baselineExperimentId].
     *
     * Unlike [baselineExperimentId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("baseline_experiment_id")
    @ExcludeMissing
    fun _baselineExperimentId(): JsonField<String> = baselineExperimentId

    /**
     * Returns the raw JSON value of [comparisonKey].
     *
     * Unlike [comparisonKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("comparison_key")
    @ExcludeMissing
    fun _comparisonKey(): JsonField<String> = comparisonKey

    /**
     * Returns the raw JSON value of [spanFieldOrder].
     *
     * Unlike [spanFieldOrder], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("spanFieldOrder")
    @ExcludeMissing
    fun _spanFieldOrder(): JsonField<List<SpanFieldOrder>> = spanFieldOrder

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): ProjectSettings = apply {
        if (validated) {
            return@apply
        }

        baselineExperimentId()
        comparisonKey()
        spanFieldOrder().ifPresent { it.forEach { it.validate() } }
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /** Returns a mutable builder for constructing an instance of [ProjectSettings]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ProjectSettings]. */
    class Builder internal constructor() {

        private var baselineExperimentId: JsonField<String> = JsonMissing.of()
        private var comparisonKey: JsonField<String> = JsonMissing.of()
        private var spanFieldOrder: JsonField<MutableList<SpanFieldOrder>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(projectSettings: ProjectSettings) = apply {
            baselineExperimentId = projectSettings.baselineExperimentId
            comparisonKey = projectSettings.comparisonKey
            spanFieldOrder = projectSettings.spanFieldOrder.map { it.toMutableList() }
            additionalProperties = projectSettings.additionalProperties.toMutableMap()
        }

        /** The id of the experiment to use as the default baseline for comparisons */
        fun baselineExperimentId(baselineExperimentId: String?) =
            baselineExperimentId(JsonField.ofNullable(baselineExperimentId))

        /**
         * Alias for calling [Builder.baselineExperimentId] with
         * `baselineExperimentId.orElse(null)`.
         */
        fun baselineExperimentId(baselineExperimentId: Optional<String>) =
            baselineExperimentId(baselineExperimentId.getOrNull())

        /**
         * Sets [Builder.baselineExperimentId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.baselineExperimentId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun baselineExperimentId(baselineExperimentId: JsonField<String>) = apply {
            this.baselineExperimentId = baselineExperimentId
        }

        /** The key used to join two experiments (defaults to `input`) */
        fun comparisonKey(comparisonKey: String?) =
            comparisonKey(JsonField.ofNullable(comparisonKey))

        /** Alias for calling [Builder.comparisonKey] with `comparisonKey.orElse(null)`. */
        fun comparisonKey(comparisonKey: Optional<String>) =
            comparisonKey(comparisonKey.getOrNull())

        /**
         * Sets [Builder.comparisonKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.comparisonKey] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun comparisonKey(comparisonKey: JsonField<String>) = apply {
            this.comparisonKey = comparisonKey
        }

        /** The order of the fields to display in the trace view */
        fun spanFieldOrder(spanFieldOrder: List<SpanFieldOrder>?) =
            spanFieldOrder(JsonField.ofNullable(spanFieldOrder))

        /** Alias for calling [Builder.spanFieldOrder] with `spanFieldOrder.orElse(null)`. */
        fun spanFieldOrder(spanFieldOrder: Optional<List<SpanFieldOrder>>) =
            spanFieldOrder(spanFieldOrder.getOrNull())

        /**
         * Sets [Builder.spanFieldOrder] to an arbitrary JSON value.
         *
         * You should usually call [Builder.spanFieldOrder] with a well-typed `List<SpanFieldOrder>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun spanFieldOrder(spanFieldOrder: JsonField<List<SpanFieldOrder>>) = apply {
            this.spanFieldOrder = spanFieldOrder.map { it.toMutableList() }
        }

        /**
         * Adds a single [SpanFieldOrder] to [Builder.spanFieldOrder].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSpanFieldOrder(spanFieldOrder: SpanFieldOrder) = apply {
            this.spanFieldOrder =
                (this.spanFieldOrder ?: JsonField.of(mutableListOf())).also {
                    checkKnown("spanFieldOrder", it).add(spanFieldOrder)
                }
        }

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

        /**
         * Returns an immutable instance of [ProjectSettings].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ProjectSettings =
            ProjectSettings(
                baselineExperimentId,
                comparisonKey,
                (spanFieldOrder ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class SpanFieldOrder
    @JsonCreator
    private constructor(
        @JsonProperty("column_id")
        @ExcludeMissing
        private val columnId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("object_type")
        @ExcludeMissing
        private val objectType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("position")
        @ExcludeMissing
        private val position: JsonField<String> = JsonMissing.of(),
        @JsonProperty("layout")
        @ExcludeMissing
        private val layout: JsonField<Layout> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun columnId(): String = columnId.getRequired("column_id")

        /**
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun objectType(): String = objectType.getRequired("object_type")

        /**
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun position(): String = position.getRequired("position")

        /**
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun layout(): Optional<Layout> = Optional.ofNullable(layout.getNullable("layout"))

        /**
         * Returns the raw JSON value of [columnId].
         *
         * Unlike [columnId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("column_id") @ExcludeMissing fun _columnId(): JsonField<String> = columnId

        /**
         * Returns the raw JSON value of [objectType].
         *
         * Unlike [objectType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("object_type")
        @ExcludeMissing
        fun _objectType(): JsonField<String> = objectType

        /**
         * Returns the raw JSON value of [position].
         *
         * Unlike [position], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("position") @ExcludeMissing fun _position(): JsonField<String> = position

        /**
         * Returns the raw JSON value of [layout].
         *
         * Unlike [layout], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("layout") @ExcludeMissing fun _layout(): JsonField<Layout> = layout

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): SpanFieldOrder = apply {
            if (validated) {
                return@apply
            }

            columnId()
            objectType()
            position()
            layout()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [SpanFieldOrder].
             *
             * The following fields are required:
             * ```java
             * .columnId()
             * .objectType()
             * .position()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [SpanFieldOrder]. */
        class Builder internal constructor() {

            private var columnId: JsonField<String>? = null
            private var objectType: JsonField<String>? = null
            private var position: JsonField<String>? = null
            private var layout: JsonField<Layout> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(spanFieldOrder: SpanFieldOrder) = apply {
                columnId = spanFieldOrder.columnId
                objectType = spanFieldOrder.objectType
                position = spanFieldOrder.position
                layout = spanFieldOrder.layout
                additionalProperties = spanFieldOrder.additionalProperties.toMutableMap()
            }

            fun columnId(columnId: String) = columnId(JsonField.of(columnId))

            /**
             * Sets [Builder.columnId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.columnId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun columnId(columnId: JsonField<String>) = apply { this.columnId = columnId }

            fun objectType(objectType: String) = objectType(JsonField.of(objectType))

            /**
             * Sets [Builder.objectType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.objectType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun objectType(objectType: JsonField<String>) = apply { this.objectType = objectType }

            fun position(position: String) = position(JsonField.of(position))

            /**
             * Sets [Builder.position] to an arbitrary JSON value.
             *
             * You should usually call [Builder.position] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun position(position: JsonField<String>) = apply { this.position = position }

            fun layout(layout: Layout?) = layout(JsonField.ofNullable(layout))

            /** Alias for calling [Builder.layout] with `layout.orElse(null)`. */
            fun layout(layout: Optional<Layout>) = layout(layout.getOrNull())

            /**
             * Sets [Builder.layout] to an arbitrary JSON value.
             *
             * You should usually call [Builder.layout] with a well-typed [Layout] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun layout(layout: JsonField<Layout>) = apply { this.layout = layout }

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

            /**
             * Returns an immutable instance of [SpanFieldOrder].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .columnId()
             * .objectType()
             * .position()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): SpanFieldOrder =
                SpanFieldOrder(
                    checkRequired("columnId", columnId),
                    checkRequired("objectType", objectType),
                    checkRequired("position", position),
                    layout,
                    additionalProperties.toImmutable(),
                )
        }

        class Layout @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val FULL = of("full")

                @JvmField val TWO_COLUMN = of("two_column")

                @JvmStatic fun of(value: String) = Layout(JsonField.of(value))
            }

            /** An enum containing [Layout]'s known values. */
            enum class Known {
                FULL,
                TWO_COLUMN,
            }

            /**
             * An enum containing [Layout]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Layout] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                FULL,
                TWO_COLUMN,
                /**
                 * An enum member indicating that [Layout] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    FULL -> Value.FULL
                    TWO_COLUMN -> Value.TWO_COLUMN
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws BraintrustInvalidDataException if this class instance's value is a not a
             *   known member.
             */
            fun known(): Known =
                when (this) {
                    FULL -> Known.FULL
                    TWO_COLUMN -> Known.TWO_COLUMN
                    else -> throw BraintrustInvalidDataException("Unknown Layout: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws BraintrustInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    BraintrustInvalidDataException("Value is not a String")
                }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Layout && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is SpanFieldOrder && columnId == other.columnId && objectType == other.objectType && position == other.position && layout == other.layout && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(columnId, objectType, position, layout, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SpanFieldOrder{columnId=$columnId, objectType=$objectType, position=$position, layout=$layout, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ProjectSettings && baselineExperimentId == other.baselineExperimentId && comparisonKey == other.comparisonKey && spanFieldOrder == other.spanFieldOrder && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(baselineExperimentId, comparisonKey, spanFieldOrder, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ProjectSettings{baselineExperimentId=$baselineExperimentId, comparisonKey=$comparisonKey, spanFieldOrder=$spanFieldOrder, additionalProperties=$additionalProperties}"
}
