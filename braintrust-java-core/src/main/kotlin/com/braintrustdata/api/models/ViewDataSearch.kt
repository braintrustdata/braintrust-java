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
import java.util.Optional

@JsonDeserialize(builder = ViewDataSearch.Builder::class)
@NoAutoDetect
class ViewDataSearch
private constructor(
    private val filter: JsonField<List<JsonValue?>>,
    private val tag: JsonField<List<JsonValue?>>,
    private val match: JsonField<List<JsonValue?>>,
    private val sort: JsonField<List<JsonValue?>>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    fun filter(): Optional<List<JsonValue?>> = Optional.ofNullable(filter.getNullable("filter"))

    fun tag(): Optional<List<JsonValue?>> = Optional.ofNullable(tag.getNullable("tag"))

    fun match(): Optional<List<JsonValue?>> = Optional.ofNullable(match.getNullable("match"))

    fun sort(): Optional<List<JsonValue?>> = Optional.ofNullable(sort.getNullable("sort"))

    @JsonProperty("filter") @ExcludeMissing fun _filter() = filter

    @JsonProperty("tag") @ExcludeMissing fun _tag() = tag

    @JsonProperty("match") @ExcludeMissing fun _match() = match

    @JsonProperty("sort") @ExcludeMissing fun _sort() = sort

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): ViewDataSearch = apply {
        if (!validated) {
            filter()
            tag()
            match()
            sort()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var filter: JsonField<List<JsonValue?>> = JsonMissing.of()
        private var tag: JsonField<List<JsonValue?>> = JsonMissing.of()
        private var match: JsonField<List<JsonValue?>> = JsonMissing.of()
        private var sort: JsonField<List<JsonValue?>> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(viewDataSearch: ViewDataSearch) = apply {
            this.filter = viewDataSearch.filter
            this.tag = viewDataSearch.tag
            this.match = viewDataSearch.match
            this.sort = viewDataSearch.sort
            additionalProperties(viewDataSearch.additionalProperties)
        }

        fun filter(filter: List<JsonValue?>) = filter(JsonField.of(filter))

        @JsonProperty("filter")
        @ExcludeMissing
        fun filter(filter: JsonField<List<JsonValue?>>) = apply { this.filter = filter }

        fun tag(tag: List<JsonValue?>) = tag(JsonField.of(tag))

        @JsonProperty("tag")
        @ExcludeMissing
        fun tag(tag: JsonField<List<JsonValue?>>) = apply { this.tag = tag }

        fun match(match: List<JsonValue?>) = match(JsonField.of(match))

        @JsonProperty("match")
        @ExcludeMissing
        fun match(match: JsonField<List<JsonValue?>>) = apply { this.match = match }

        fun sort(sort: List<JsonValue?>) = sort(JsonField.of(sort))

        @JsonProperty("sort")
        @ExcludeMissing
        fun sort(sort: JsonField<List<JsonValue?>>) = apply { this.sort = sort }

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

        fun build(): ViewDataSearch =
            ViewDataSearch(
                filter.map { it.toImmutable() },
                tag.map { it.toImmutable() },
                match.map { it.toImmutable() },
                sort.map { it.toImmutable() },
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ViewDataSearch && this.filter == other.filter && this.tag == other.tag && this.match == other.match && this.sort == other.sort && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(filter, tag, match, sort, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() =
        "ViewDataSearch{filter=$filter, tag=$tag, match=$match, sort=$sort, additionalProperties=$additionalProperties}"
}
