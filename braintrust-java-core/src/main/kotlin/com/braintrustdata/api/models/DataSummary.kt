// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.checkRequired
import com.braintrustdata.api.errors.BraintrustInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects

/** Summary of a dataset's data */
class DataSummary
private constructor(
    private val totalRecords: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("total_records")
        @ExcludeMissing
        totalRecords: JsonField<Long> = JsonMissing.of()
    ) : this(totalRecords, mutableMapOf())

    /**
     * Total number of records in the dataset
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun totalRecords(): Long = totalRecords.getRequired("total_records")

    /**
     * Returns the raw JSON value of [totalRecords].
     *
     * Unlike [totalRecords], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("total_records")
    @ExcludeMissing
    fun _totalRecords(): JsonField<Long> = totalRecords

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

        /**
         * Sets [Builder.totalRecords] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalRecords] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
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

        /**
         * Returns an immutable instance of [DataSummary].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .totalRecords()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DataSummary =
            DataSummary(
                checkRequired("totalRecords", totalRecords),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): DataSummary = apply {
        if (validated) {
            return@apply
        }

        totalRecords()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: BraintrustInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic internal fun validity(): Int = (if (totalRecords.asKnown().isPresent) 1 else 0)

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
