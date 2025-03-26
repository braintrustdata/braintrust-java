// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.checkKnown
import com.braintrustdata.api.core.toImmutable
import com.braintrustdata.api.errors.BraintrustInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Options for the view in the app */
class ViewOptions
private constructor(
    private val columnOrder: JsonField<List<String>>,
    private val columnSizing: JsonField<ColumnSizing>,
    private val columnVisibility: JsonField<ColumnVisibility>,
    private val grouping: JsonField<String>,
    private val layout: JsonField<String>,
    private val rowHeight: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("columnOrder")
        @ExcludeMissing
        columnOrder: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("columnSizing")
        @ExcludeMissing
        columnSizing: JsonField<ColumnSizing> = JsonMissing.of(),
        @JsonProperty("columnVisibility")
        @ExcludeMissing
        columnVisibility: JsonField<ColumnVisibility> = JsonMissing.of(),
        @JsonProperty("grouping") @ExcludeMissing grouping: JsonField<String> = JsonMissing.of(),
        @JsonProperty("layout") @ExcludeMissing layout: JsonField<String> = JsonMissing.of(),
        @JsonProperty("rowHeight") @ExcludeMissing rowHeight: JsonField<String> = JsonMissing.of(),
    ) : this(
        columnOrder,
        columnSizing,
        columnVisibility,
        grouping,
        layout,
        rowHeight,
        mutableMapOf(),
    )

    /**
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun columnOrder(): Optional<List<String>> =
        Optional.ofNullable(columnOrder.getNullable("columnOrder"))

    /**
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun columnSizing(): Optional<ColumnSizing> =
        Optional.ofNullable(columnSizing.getNullable("columnSizing"))

    /**
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun columnVisibility(): Optional<ColumnVisibility> =
        Optional.ofNullable(columnVisibility.getNullable("columnVisibility"))

    /**
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun grouping(): Optional<String> = Optional.ofNullable(grouping.getNullable("grouping"))

    /**
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun layout(): Optional<String> = Optional.ofNullable(layout.getNullable("layout"))

    /**
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rowHeight(): Optional<String> = Optional.ofNullable(rowHeight.getNullable("rowHeight"))

    /**
     * Returns the raw JSON value of [columnOrder].
     *
     * Unlike [columnOrder], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("columnOrder")
    @ExcludeMissing
    fun _columnOrder(): JsonField<List<String>> = columnOrder

    /**
     * Returns the raw JSON value of [columnSizing].
     *
     * Unlike [columnSizing], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("columnSizing")
    @ExcludeMissing
    fun _columnSizing(): JsonField<ColumnSizing> = columnSizing

    /**
     * Returns the raw JSON value of [columnVisibility].
     *
     * Unlike [columnVisibility], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("columnVisibility")
    @ExcludeMissing
    fun _columnVisibility(): JsonField<ColumnVisibility> = columnVisibility

    /**
     * Returns the raw JSON value of [grouping].
     *
     * Unlike [grouping], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("grouping") @ExcludeMissing fun _grouping(): JsonField<String> = grouping

    /**
     * Returns the raw JSON value of [layout].
     *
     * Unlike [layout], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("layout") @ExcludeMissing fun _layout(): JsonField<String> = layout

    /**
     * Returns the raw JSON value of [rowHeight].
     *
     * Unlike [rowHeight], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rowHeight") @ExcludeMissing fun _rowHeight(): JsonField<String> = rowHeight

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /** Returns a mutable builder for constructing an instance of [ViewOptions]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ViewOptions]. */
    class Builder internal constructor() {

        private var columnOrder: JsonField<MutableList<String>>? = null
        private var columnSizing: JsonField<ColumnSizing> = JsonMissing.of()
        private var columnVisibility: JsonField<ColumnVisibility> = JsonMissing.of()
        private var grouping: JsonField<String> = JsonMissing.of()
        private var layout: JsonField<String> = JsonMissing.of()
        private var rowHeight: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(viewOptions: ViewOptions) = apply {
            columnOrder = viewOptions.columnOrder.map { it.toMutableList() }
            columnSizing = viewOptions.columnSizing
            columnVisibility = viewOptions.columnVisibility
            grouping = viewOptions.grouping
            layout = viewOptions.layout
            rowHeight = viewOptions.rowHeight
            additionalProperties = viewOptions.additionalProperties.toMutableMap()
        }

        fun columnOrder(columnOrder: List<String>?) = columnOrder(JsonField.ofNullable(columnOrder))

        /** Alias for calling [Builder.columnOrder] with `columnOrder.orElse(null)`. */
        fun columnOrder(columnOrder: Optional<List<String>>) = columnOrder(columnOrder.getOrNull())

        /**
         * Sets [Builder.columnOrder] to an arbitrary JSON value.
         *
         * You should usually call [Builder.columnOrder] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun columnOrder(columnOrder: JsonField<List<String>>) = apply {
            this.columnOrder = columnOrder.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.columnOrder].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addColumnOrder(columnOrder: String) = apply {
            this.columnOrder =
                (this.columnOrder ?: JsonField.of(mutableListOf())).also {
                    checkKnown("columnOrder", it).add(columnOrder)
                }
        }

        fun columnSizing(columnSizing: ColumnSizing?) =
            columnSizing(JsonField.ofNullable(columnSizing))

        /** Alias for calling [Builder.columnSizing] with `columnSizing.orElse(null)`. */
        fun columnSizing(columnSizing: Optional<ColumnSizing>) =
            columnSizing(columnSizing.getOrNull())

        /**
         * Sets [Builder.columnSizing] to an arbitrary JSON value.
         *
         * You should usually call [Builder.columnSizing] with a well-typed [ColumnSizing] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun columnSizing(columnSizing: JsonField<ColumnSizing>) = apply {
            this.columnSizing = columnSizing
        }

        fun columnVisibility(columnVisibility: ColumnVisibility?) =
            columnVisibility(JsonField.ofNullable(columnVisibility))

        /** Alias for calling [Builder.columnVisibility] with `columnVisibility.orElse(null)`. */
        fun columnVisibility(columnVisibility: Optional<ColumnVisibility>) =
            columnVisibility(columnVisibility.getOrNull())

        /**
         * Sets [Builder.columnVisibility] to an arbitrary JSON value.
         *
         * You should usually call [Builder.columnVisibility] with a well-typed [ColumnVisibility]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun columnVisibility(columnVisibility: JsonField<ColumnVisibility>) = apply {
            this.columnVisibility = columnVisibility
        }

        fun grouping(grouping: String?) = grouping(JsonField.ofNullable(grouping))

        /** Alias for calling [Builder.grouping] with `grouping.orElse(null)`. */
        fun grouping(grouping: Optional<String>) = grouping(grouping.getOrNull())

        /**
         * Sets [Builder.grouping] to an arbitrary JSON value.
         *
         * You should usually call [Builder.grouping] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun grouping(grouping: JsonField<String>) = apply { this.grouping = grouping }

        fun layout(layout: String?) = layout(JsonField.ofNullable(layout))

        /** Alias for calling [Builder.layout] with `layout.orElse(null)`. */
        fun layout(layout: Optional<String>) = layout(layout.getOrNull())

        /**
         * Sets [Builder.layout] to an arbitrary JSON value.
         *
         * You should usually call [Builder.layout] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun layout(layout: JsonField<String>) = apply { this.layout = layout }

        fun rowHeight(rowHeight: String?) = rowHeight(JsonField.ofNullable(rowHeight))

        /** Alias for calling [Builder.rowHeight] with `rowHeight.orElse(null)`. */
        fun rowHeight(rowHeight: Optional<String>) = rowHeight(rowHeight.getOrNull())

        /**
         * Sets [Builder.rowHeight] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rowHeight] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun rowHeight(rowHeight: JsonField<String>) = apply { this.rowHeight = rowHeight }

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
         * Returns an immutable instance of [ViewOptions].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ViewOptions =
            ViewOptions(
                (columnOrder ?: JsonMissing.of()).map { it.toImmutable() },
                columnSizing,
                columnVisibility,
                grouping,
                layout,
                rowHeight,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ViewOptions = apply {
        if (validated) {
            return@apply
        }

        columnOrder()
        columnSizing().ifPresent { it.validate() }
        columnVisibility().ifPresent { it.validate() }
        grouping()
        layout()
        rowHeight()
        validated = true
    }

    class ColumnSizing
    private constructor(private val additionalProperties: MutableMap<String, JsonValue>) {

        @JsonCreator private constructor() : this(mutableMapOf())

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [ColumnSizing]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ColumnSizing]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(columnSizing: ColumnSizing) = apply {
                additionalProperties = columnSizing.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [ColumnSizing].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ColumnSizing = ColumnSizing(additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): ColumnSizing = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ColumnSizing && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "ColumnSizing{additionalProperties=$additionalProperties}"
    }

    class ColumnVisibility
    private constructor(private val additionalProperties: MutableMap<String, JsonValue>) {

        @JsonCreator private constructor() : this(mutableMapOf())

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [ColumnVisibility]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ColumnVisibility]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(columnVisibility: ColumnVisibility) = apply {
                additionalProperties = columnVisibility.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [ColumnVisibility].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ColumnVisibility = ColumnVisibility(additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): ColumnVisibility = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ColumnVisibility && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "ColumnVisibility{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ViewOptions && columnOrder == other.columnOrder && columnSizing == other.columnSizing && columnVisibility == other.columnVisibility && grouping == other.grouping && layout == other.layout && rowHeight == other.rowHeight && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(columnOrder, columnSizing, columnVisibility, grouping, layout, rowHeight, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ViewOptions{columnOrder=$columnOrder, columnSizing=$columnSizing, columnVisibility=$columnVisibility, grouping=$grouping, layout=$layout, rowHeight=$rowHeight, additionalProperties=$additionalProperties}"
}
