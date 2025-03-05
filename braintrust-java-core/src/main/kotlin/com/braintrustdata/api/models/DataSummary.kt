// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.checkRequired
import com.braintrustdata.api.core.immutableEmptyMap
import com.braintrustdata.api.core.toImmutable
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Objects

/** Summary of a dataset's data */
@NoAutoDetect
class DataSummary
@JsonCreator
private constructor(
    @JsonProperty("total_records")
    @ExcludeMissing
    private val totalRecords: JsonField<Long> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** Total number of records in the dataset */
    fun totalRecords(): Long = totalRecords.getRequired("total_records")

    /** Total number of records in the dataset */
    @JsonProperty("total_records")
    @ExcludeMissing
    fun _totalRecords(): JsonField<Long> = totalRecords

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): DataSummary = apply {
        if (validated) {
            return@apply
        }

        totalRecords()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DataSummary].
         *
         * The following fields are required:
         * ```java
         * .totalRecords()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DataSummary]. */
    class Builder internal constructor() {

        private var totalRecords: JsonField<Long>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(dataSummary: DataSummary) = apply {
            totalRecords = dataSummary.totalRecords
            additionalProperties = dataSummary.additionalProperties.toMutableMap()
        }

        /** Total number of records in the dataset */
        fun totalRecords(totalRecords: Long) = totalRecords(JsonField.of(totalRecords))

        /** Total number of records in the dataset */
        fun totalRecords(totalRecords: JsonField<Long>) = apply { this.totalRecords = totalRecords }

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

        fun build(): DataSummary =
            DataSummary(
                checkRequired("totalRecords", totalRecords),
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DataSummary && totalRecords == other.totalRecords && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(totalRecords, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DataSummary{totalRecords=$totalRecords, additionalProperties=$additionalProperties}"
}
