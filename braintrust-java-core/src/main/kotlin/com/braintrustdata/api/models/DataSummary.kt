// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.toImmutable
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import java.util.Objects

/** Summary of a dataset's data */
@JsonDeserialize(builder = DataSummary.Builder::class)
@NoAutoDetect
class DataSummary
private constructor(
    private val totalRecords: JsonField<Long>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /** Total number of records in the dataset */
    fun totalRecords(): Long = totalRecords.getRequired("total_records")

    /** Total number of records in the dataset */
    @JsonProperty("total_records") @ExcludeMissing fun _totalRecords() = totalRecords

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): DataSummary = apply {
        if (!validated) {
            totalRecords()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var totalRecords: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(dataSummary: DataSummary) = apply {
            this.totalRecords = dataSummary.totalRecords
            additionalProperties(dataSummary.additionalProperties)
        }

        /** Total number of records in the dataset */
        fun totalRecords(totalRecords: Long) = totalRecords(JsonField.of(totalRecords))

        /** Total number of records in the dataset */
        @JsonProperty("total_records")
        @ExcludeMissing
        fun totalRecords(totalRecords: JsonField<Long>) = apply { this.totalRecords = totalRecords }

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

        fun build(): DataSummary = DataSummary(totalRecords, additionalProperties.toImmutable())
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DataSummary && this.totalRecords == other.totalRecords && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(totalRecords, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() =
        "DataSummary{totalRecords=$totalRecords, additionalProperties=$additionalProperties}"
}
