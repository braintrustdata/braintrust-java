// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.immutableEmptyMap
import com.braintrustdata.api.core.toImmutable
import com.braintrustdata.api.errors.BraintrustInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** The view definition */
@NoAutoDetect
class ViewData
@JsonCreator
private constructor(
    @JsonProperty("search")
    @ExcludeMissing
    private val search: JsonField<ViewDataSearch> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun search(): Optional<ViewDataSearch> = Optional.ofNullable(search.getNullable("search"))

    /**
     * Returns the raw JSON value of [search].
     *
     * Unlike [search], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("search") @ExcludeMissing fun _search(): JsonField<ViewDataSearch> = search

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): ViewData = apply {
        if (validated) {
            return@apply
        }

        search().ifPresent { it.validate() }
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /** Returns a mutable builder for constructing an instance of [ViewData]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ViewData]. */
    class Builder internal constructor() {

        private var search: JsonField<ViewDataSearch> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(viewData: ViewData) = apply {
            search = viewData.search
            additionalProperties = viewData.additionalProperties.toMutableMap()
        }

        fun search(search: ViewDataSearch?) = search(JsonField.ofNullable(search))

        /** Alias for calling [Builder.search] with `search.orElse(null)`. */
        fun search(search: Optional<ViewDataSearch>) = search(search.getOrNull())

        /**
         * Sets [Builder.search] to an arbitrary JSON value.
         *
         * You should usually call [Builder.search] with a well-typed [ViewDataSearch] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun search(search: JsonField<ViewDataSearch>) = apply { this.search = search }

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
         * Returns an immutable instance of [ViewData].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ViewData = ViewData(search, additionalProperties.toImmutable())
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ViewData && search == other.search && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(search, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() = "ViewData{search=$search, additionalProperties=$additionalProperties}"
}
