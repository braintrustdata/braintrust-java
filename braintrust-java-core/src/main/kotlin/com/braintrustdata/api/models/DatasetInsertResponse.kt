// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import java.util.UUID
import com.braintrustdata.api.core.BaseDeserializer
import com.braintrustdata.api.core.BaseSerializer
import com.braintrustdata.api.core.getOrThrow
import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.JsonNull
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.Enum
import com.braintrustdata.api.core.toUnmodifiable
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.errors.BraintrustInvalidDataException

@JsonDeserialize(builder = DatasetInsertResponse.Builder::class)
@NoAutoDetect
class DatasetInsertResponse private constructor(private val rowIds: JsonField<List<String>>, private val additionalProperties: Map<String, JsonValue>, ) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /**
     * The ids of all rows that were inserted, aligning one-to-one with the rows
     * provided as input
     */
    fun rowIds(): List<String> = rowIds.getRequired("row_ids")

    /**
     * The ids of all rows that were inserted, aligning one-to-one with the rows
     * provided as input
     */
    @JsonProperty("row_ids")
    @ExcludeMissing
    fun _rowIds() = rowIds

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): DatasetInsertResponse = apply {
        if (!validated) {
          rowIds()
          validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return other is DatasetInsertResponse &&
          this.rowIds == other.rowIds &&
          this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
      if (hashCode == 0) {
        hashCode = Objects.hash(rowIds, additionalProperties)
      }
      return hashCode
    }

    override fun toString() = "DatasetInsertResponse{rowIds=$rowIds, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic
        fun builder() = Builder()
    }

    class Builder {

        private var rowIds: JsonField<List<String>> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(datasetInsertResponse: DatasetInsertResponse) = apply {
            this.rowIds = datasetInsertResponse.rowIds
            additionalProperties(datasetInsertResponse.additionalProperties)
        }

        /**
         * The ids of all rows that were inserted, aligning one-to-one with the rows
         * provided as input
         */
        fun rowIds(rowIds: List<String>) = rowIds(JsonField.of(rowIds))

        /**
         * The ids of all rows that were inserted, aligning one-to-one with the rows
         * provided as input
         */
        @JsonProperty("row_ids")
        @ExcludeMissing
        fun rowIds(rowIds: JsonField<List<String>>) = apply {
            this.rowIds = rowIds
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

        fun build(): DatasetInsertResponse = DatasetInsertResponse(rowIds.map { it.toUnmodifiable() }, additionalProperties.toUnmodifiable())
    }
}
