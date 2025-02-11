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

@NoAutoDetect
class InsertEventsResponse
@JsonCreator
private constructor(
    @JsonProperty("row_ids")
    @ExcludeMissing
    private val rowIds: JsonField<List<String>> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * The ids of all rows that were inserted, aligning one-to-one with the rows provided as input
     */
    fun rowIds(): List<String> = rowIds.getRequired("row_ids")

    /**
     * The ids of all rows that were inserted, aligning one-to-one with the rows provided as input
     */
    @JsonProperty("row_ids") @ExcludeMissing fun _rowIds(): JsonField<List<String>> = rowIds

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): InsertEventsResponse = apply {
        if (validated) {
            return@apply
        }

        rowIds()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InsertEventsResponse]. */
    class Builder internal constructor() {

        private var rowIds: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(insertEventsResponse: InsertEventsResponse) = apply {
            rowIds = insertEventsResponse.rowIds.map { it.toMutableList() }
            additionalProperties = insertEventsResponse.additionalProperties.toMutableMap()
        }

        /**
         * The ids of all rows that were inserted, aligning one-to-one with the rows provided as
         * input
         */
        fun rowIds(rowIds: List<String>) = rowIds(JsonField.of(rowIds))

        /**
         * The ids of all rows that were inserted, aligning one-to-one with the rows provided as
         * input
         */
        fun rowIds(rowIds: JsonField<List<String>>) = apply {
            this.rowIds = rowIds.map { it.toMutableList() }
        }

        /**
         * The ids of all rows that were inserted, aligning one-to-one with the rows provided as
         * input
         */
        fun addRowId(rowId: String) = apply {
            rowIds =
                (rowIds ?: JsonField.of(mutableListOf())).apply {
                    asKnown()
                        .orElseThrow {
                            IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            )
                        }
                        .add(rowId)
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

        fun build(): InsertEventsResponse =
            InsertEventsResponse(
                checkRequired("rowIds", rowIds).map { it.toImmutable() },
                additionalProperties.toImmutable()
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is InsertEventsResponse && rowIds == other.rowIds && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(rowIds, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InsertEventsResponse{rowIds=$rowIds, additionalProperties=$additionalProperties}"
}
