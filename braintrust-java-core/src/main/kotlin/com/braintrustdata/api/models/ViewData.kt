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

/** The view definition */
@JsonDeserialize(builder = ViewData.Builder::class)
@NoAutoDetect
class ViewData
private constructor(
    private val search: JsonField<ViewDataSearch>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    fun search(): Optional<ViewDataSearch> = Optional.ofNullable(search.getNullable("search"))

    @JsonProperty("search") @ExcludeMissing fun _search() = search

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): ViewData = apply {
        if (!validated) {
            search().map { it.validate() }
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var search: JsonField<ViewDataSearch> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(viewData: ViewData) = apply {
            this.search = viewData.search
            additionalProperties(viewData.additionalProperties)
        }

        fun search(search: ViewDataSearch) = search(JsonField.of(search))

        @JsonProperty("search")
        @ExcludeMissing
        fun search(search: JsonField<ViewDataSearch>) = apply { this.search = search }

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

        fun build(): ViewData = ViewData(search, additionalProperties.toUnmodifiable())
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ViewData && this.search == other.search && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(search, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() = "ViewData{search=$search, additionalProperties=$additionalProperties}"
}
