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
import kotlin.jvm.optionals.getOrNull

class PromptListPageResponse
private constructor(
    private val objects: JsonField<List<Prompt>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("objects") @ExcludeMissing objects: JsonField<List<Prompt>> = JsonMissing.of()
    ) : this(objects, mutableMapOf())

    /**
     * A list of prompt objects
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun objects(): List<Prompt> = objects.getRequired("objects")

    /**
     * Returns the raw JSON value of [objects].
     *
     * Unlike [objects], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("objects") @ExcludeMissing fun _objects(): JsonField<List<Prompt>> = objects

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
         * Returns a mutable builder for constructing an instance of [PromptListPageResponse].
         *
         * The following fields are required:
         * ```java
         * .objects()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PromptListPageResponse]. */
    class Builder internal constructor() {

        private var objects: JsonField<MutableList<Prompt>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(promptListPageResponse: PromptListPageResponse) = apply {
            objects = promptListPageResponse.objects.map { it.toMutableList() }
            additionalProperties = promptListPageResponse.additionalProperties.toMutableMap()
        }

        /** A list of prompt objects */
        fun objects(objects: List<Prompt>) = objects(JsonField.of(objects))

        /**
         * Sets [Builder.objects] to an arbitrary JSON value.
         *
         * You should usually call [Builder.objects] with a well-typed `List<Prompt>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun objects(objects: JsonField<List<Prompt>>) = apply {
            this.objects = objects.map { it.toMutableList() }
        }

        /**
         * Adds a single [Prompt] to [objects].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addObject(object_: Prompt) = apply {
            objects =
                (objects ?: JsonField.of(mutableListOf())).also {
                    checkKnown("objects", it).add(object_)
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
         * Returns an immutable instance of [PromptListPageResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .objects()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PromptListPageResponse =
            PromptListPageResponse(
                checkRequired("objects", objects).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PromptListPageResponse = apply {
        if (validated) {
            return@apply
        }

        objects().forEach { it.validate() }
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
    @JvmSynthetic
    internal fun validity(): Int =
        (objects.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PromptListPageResponse && objects == other.objects && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(objects, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PromptListPageResponse{objects=$objects, additionalProperties=$additionalProperties}"
}
