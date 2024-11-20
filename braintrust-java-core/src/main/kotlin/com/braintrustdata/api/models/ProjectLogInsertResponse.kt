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

@JsonDeserialize(builder = ProjectLogInsertResponse.Builder::class)
@NoAutoDetect
class ProjectLogInsertResponse
private constructor(
    private val rowIds: JsonField<List<String>>,
    private val serializedSpanSlugs: JsonField<List<String>>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /**
     * The ids of all rows that were inserted, aligning one-to-one with the rows provided as input
     */
    fun rowIds(): List<String> = rowIds.getRequired("row_ids")

    /**
     * String slugs which line up 1-1 with the row_ids. These slugs can be used as the 'parent'
     * specifier to attach spans underneath the row
     */
    fun serializedSpanSlugs(): List<String> =
        serializedSpanSlugs.getRequired("serialized_span_slugs")

    fun toInsertEventsResponse(): InsertEventsResponse =
        InsertEventsResponse.builder().rowIds(rowIds).build()

    /**
     * The ids of all rows that were inserted, aligning one-to-one with the rows provided as input
     */
    @JsonProperty("row_ids") @ExcludeMissing fun _rowIds() = rowIds

    /**
     * String slugs which line up 1-1 with the row_ids. These slugs can be used as the 'parent'
     * specifier to attach spans underneath the row
     */
    @JsonProperty("serialized_span_slugs")
    @ExcludeMissing
    fun _serializedSpanSlugs() = serializedSpanSlugs

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): ProjectLogInsertResponse = apply {
        if (!validated) {
            rowIds()
            serializedSpanSlugs()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var rowIds: JsonField<List<String>> = JsonMissing.of()
        private var serializedSpanSlugs: JsonField<List<String>> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(projectLogInsertResponse: ProjectLogInsertResponse) = apply {
            this.rowIds = projectLogInsertResponse.rowIds
            this.serializedSpanSlugs = projectLogInsertResponse.serializedSpanSlugs
            additionalProperties(projectLogInsertResponse.additionalProperties)
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
        @JsonProperty("row_ids")
        @ExcludeMissing
        fun rowIds(rowIds: JsonField<List<String>>) = apply { this.rowIds = rowIds }

        /**
         * String slugs which line up 1-1 with the row_ids. These slugs can be used as the 'parent'
         * specifier to attach spans underneath the row
         */
        fun serializedSpanSlugs(serializedSpanSlugs: List<String>) =
            serializedSpanSlugs(JsonField.of(serializedSpanSlugs))

        /**
         * String slugs which line up 1-1 with the row_ids. These slugs can be used as the 'parent'
         * specifier to attach spans underneath the row
         */
        @JsonProperty("serialized_span_slugs")
        @ExcludeMissing
        fun serializedSpanSlugs(serializedSpanSlugs: JsonField<List<String>>) = apply {
            this.serializedSpanSlugs = serializedSpanSlugs
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

        fun build(): ProjectLogInsertResponse =
            ProjectLogInsertResponse(
                rowIds.map { it.toImmutable() },
                serializedSpanSlugs.map { it.toImmutable() },
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ProjectLogInsertResponse && this.rowIds == other.rowIds && this.serializedSpanSlugs == other.serializedSpanSlugs && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(rowIds, serializedSpanSlugs, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() =
        "ProjectLogInsertResponse{rowIds=$rowIds, serializedSpanSlugs=$serializedSpanSlugs, additionalProperties=$additionalProperties}"
}
