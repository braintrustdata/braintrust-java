// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.checkKnown
import com.braintrustdata.api.core.immutableEmptyMap
import com.braintrustdata.api.core.toImmutable
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Objects
import java.util.Optional

/** Options for the view in the app */
@NoAutoDetect
class ViewOptions
@JsonCreator
private constructor(
    @JsonProperty("columnOrder")
    @ExcludeMissing
    private val columnOrder: JsonField<List<String>> = JsonMissing.of(),
    @JsonProperty("columnSizing")
    @ExcludeMissing
    private val columnSizing: JsonField<ColumnSizing> = JsonMissing.of(),
    @JsonProperty("columnVisibility")
    @ExcludeMissing
    private val columnVisibility: JsonField<ColumnVisibility> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun columnOrder(): Optional<List<String>> =
        Optional.ofNullable(columnOrder.getNullable("columnOrder"))

    fun columnSizing(): Optional<ColumnSizing> =
        Optional.ofNullable(columnSizing.getNullable("columnSizing"))

    fun columnVisibility(): Optional<ColumnVisibility> =
        Optional.ofNullable(columnVisibility.getNullable("columnVisibility"))

    @JsonProperty("columnOrder")
    @ExcludeMissing
    fun _columnOrder(): JsonField<List<String>> = columnOrder

    @JsonProperty("columnSizing")
    @ExcludeMissing
    fun _columnSizing(): JsonField<ColumnSizing> = columnSizing

    @JsonProperty("columnVisibility")
    @ExcludeMissing
    fun _columnVisibility(): JsonField<ColumnVisibility> = columnVisibility

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): ViewOptions = apply {
        if (validated) {
            return@apply
        }

        columnOrder()
        columnSizing().ifPresent { it.validate() }
        columnVisibility().ifPresent { it.validate() }
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ViewOptions]. */
    class Builder internal constructor() {

        private var columnOrder: JsonField<MutableList<String>>? = null
        private var columnSizing: JsonField<ColumnSizing> = JsonMissing.of()
        private var columnVisibility: JsonField<ColumnVisibility> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(viewOptions: ViewOptions) = apply {
            columnOrder = viewOptions.columnOrder.map { it.toMutableList() }
            columnSizing = viewOptions.columnSizing
            columnVisibility = viewOptions.columnVisibility
            additionalProperties = viewOptions.additionalProperties.toMutableMap()
        }

        fun columnOrder(columnOrder: List<String>?) = columnOrder(JsonField.ofNullable(columnOrder))

        fun columnOrder(columnOrder: Optional<List<String>>) = columnOrder(columnOrder.orElse(null))

        fun columnOrder(columnOrder: JsonField<List<String>>) = apply {
            this.columnOrder = columnOrder.map { it.toMutableList() }
        }

        fun addColumnOrder(columnOrder: String) = apply {
            this.columnOrder =
                (this.columnOrder ?: JsonField.of(mutableListOf())).also {
                    checkKnown("columnOrder", it).add(columnOrder)
                }
        }

        fun columnSizing(columnSizing: ColumnSizing?) =
            columnSizing(JsonField.ofNullable(columnSizing))

        fun columnSizing(columnSizing: Optional<ColumnSizing>) =
            columnSizing(columnSizing.orElse(null))

        fun columnSizing(columnSizing: JsonField<ColumnSizing>) = apply {
            this.columnSizing = columnSizing
        }

        fun columnVisibility(columnVisibility: ColumnVisibility?) =
            columnVisibility(JsonField.ofNullable(columnVisibility))

        fun columnVisibility(columnVisibility: Optional<ColumnVisibility>) =
            columnVisibility(columnVisibility.orElse(null))

        fun columnVisibility(columnVisibility: JsonField<ColumnVisibility>) = apply {
            this.columnVisibility = columnVisibility
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

        fun build(): ViewOptions =
            ViewOptions(
                (columnOrder ?: JsonMissing.of()).map { it.toImmutable() },
                columnSizing,
                columnVisibility,
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class ColumnSizing
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): ColumnSizing = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

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

            fun build(): ColumnSizing = ColumnSizing(additionalProperties.toImmutable())
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

    @NoAutoDetect
    class ColumnVisibility
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): ColumnVisibility = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

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

            fun build(): ColumnVisibility = ColumnVisibility(additionalProperties.toImmutable())
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

        return /* spotless:off */ other is ViewOptions && columnOrder == other.columnOrder && columnSizing == other.columnSizing && columnVisibility == other.columnVisibility && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(columnOrder, columnSizing, columnVisibility, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ViewOptions{columnOrder=$columnOrder, columnSizing=$columnSizing, columnVisibility=$columnVisibility, additionalProperties=$additionalProperties}"
}
