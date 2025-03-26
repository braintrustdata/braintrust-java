// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.checkKnown
import com.braintrustdata.api.core.checkRequired
import com.braintrustdata.api.core.toImmutable
import com.braintrustdata.api.errors.BraintrustInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects

class InsertEventsResponse
private constructor(
    private val rowIds: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("row_ids") @ExcludeMissing rowIds: JsonField<List<String>> = JsonMissing.of()
    ) : this(rowIds, mutableMapOf())

    /**
     * The ids of all rows that were inserted, aligning one-to-one with the rows provided as input
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun rowIds(): List<String> = rowIds.getRequired("row_ids")

    /**
     * Returns the raw JSON value of [rowIds].
     *
     * Unlike [rowIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("row_ids") @ExcludeMissing fun _rowIds(): JsonField<List<String>> = rowIds

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

        /**
         * Returns a mutable builder for constructing an instance of [InsertEventsResponse].
         *
         * The following fields are required:
         * ```java
         * .rowIds()
         * ```
         */
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
         * Sets [Builder.rowIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rowIds] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun rowIds(rowIds: JsonField<List<String>>) = apply {
            this.rowIds = rowIds.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [rowIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRowId(rowId: String) = apply {
            rowIds =
                (rowIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("rowIds", it).add(rowId)
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
         * Returns an immutable instance of [InsertEventsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .rowIds()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): InsertEventsResponse =
            InsertEventsResponse(
                checkRequired("rowIds", rowIds).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): InsertEventsResponse = apply {
        if (validated) {
            return@apply
        }

        rowIds()
        validated = true
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
