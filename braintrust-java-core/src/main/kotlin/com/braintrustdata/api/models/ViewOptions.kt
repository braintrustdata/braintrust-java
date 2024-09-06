// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.toUnmodifiable
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import java.util.Objects
import java.util.Optional

/** Options for the view in the app */
@JsonDeserialize(builder = ViewOptions.Builder::class)
@NoAutoDetect
class ViewOptions
private constructor(
    private val columnVisibility: JsonField<ColumnVisibility>,
    private val columnOrder: JsonField<List<String>>,
    private val columnSizing: JsonField<ColumnSizing>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun columnVisibility(): Optional<ColumnVisibility> =
        Optional.ofNullable(columnVisibility.getNullable("columnVisibility"))

    fun columnOrder(): Optional<List<String>> =
        Optional.ofNullable(columnOrder.getNullable("columnOrder"))

    fun columnSizing(): Optional<ColumnSizing> =
        Optional.ofNullable(columnSizing.getNullable("columnSizing"))

    @JsonProperty("columnVisibility") @ExcludeMissing fun _columnVisibility() = columnVisibility

    @JsonProperty("columnOrder") @ExcludeMissing fun _columnOrder() = columnOrder

    @JsonProperty("columnSizing") @ExcludeMissing fun _columnSizing() = columnSizing

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): ViewOptions = apply {
        if (!validated) {
            columnVisibility().map { it.validate() }
            columnOrder()
            columnSizing().map { it.validate() }
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ViewOptions &&
            this.columnVisibility == other.columnVisibility &&
            this.columnOrder == other.columnOrder &&
            this.columnSizing == other.columnSizing &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    columnVisibility,
                    columnOrder,
                    columnSizing,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "ViewOptions{columnVisibility=$columnVisibility, columnOrder=$columnOrder, columnSizing=$columnSizing, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var columnVisibility: JsonField<ColumnVisibility> = JsonMissing.of()
        private var columnOrder: JsonField<List<String>> = JsonMissing.of()
        private var columnSizing: JsonField<ColumnSizing> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(viewOptions: ViewOptions) = apply {
            this.columnVisibility = viewOptions.columnVisibility
            this.columnOrder = viewOptions.columnOrder
            this.columnSizing = viewOptions.columnSizing
            additionalProperties(viewOptions.additionalProperties)
        }

        fun columnVisibility(columnVisibility: ColumnVisibility) =
            columnVisibility(JsonField.of(columnVisibility))

        @JsonProperty("columnVisibility")
        @ExcludeMissing
        fun columnVisibility(columnVisibility: JsonField<ColumnVisibility>) = apply {
            this.columnVisibility = columnVisibility
        }

        fun columnOrder(columnOrder: List<String>) = columnOrder(JsonField.of(columnOrder))

        @JsonProperty("columnOrder")
        @ExcludeMissing
        fun columnOrder(columnOrder: JsonField<List<String>>) = apply {
            this.columnOrder = columnOrder
        }

        fun columnSizing(columnSizing: ColumnSizing) = columnSizing(JsonField.of(columnSizing))

        @JsonProperty("columnSizing")
        @ExcludeMissing
        fun columnSizing(columnSizing: JsonField<ColumnSizing>) = apply {
            this.columnSizing = columnSizing
        }

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

        fun build(): ViewOptions =
            ViewOptions(
                columnVisibility,
                columnOrder.map { it.toUnmodifiable() },
                columnSizing,
                additionalProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(builder = ColumnSizing.Builder::class)
    @NoAutoDetect
    class ColumnSizing
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): ColumnSizing = apply {
            if (!validated) {
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ColumnSizing && this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(additionalProperties)
            }
            return hashCode
        }

        override fun toString() = "ColumnSizing{additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(columnSizing: ColumnSizing) = apply {
                additionalProperties(columnSizing.additionalProperties)
            }

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

            fun build(): ColumnSizing = ColumnSizing(additionalProperties.toUnmodifiable())
        }
    }

    @JsonDeserialize(builder = ColumnVisibility.Builder::class)
    @NoAutoDetect
    class ColumnVisibility
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): ColumnVisibility = apply {
            if (!validated) {
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ColumnVisibility &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(additionalProperties)
            }
            return hashCode
        }

        override fun toString() = "ColumnVisibility{additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(columnVisibility: ColumnVisibility) = apply {
                additionalProperties(columnVisibility.additionalProperties)
            }

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

            fun build(): ColumnVisibility = ColumnVisibility(additionalProperties.toUnmodifiable())
        }
    }
}
