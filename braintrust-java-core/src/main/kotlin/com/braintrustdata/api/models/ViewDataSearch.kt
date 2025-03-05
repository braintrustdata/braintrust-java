// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.checkKnown
import com.braintrustdata.api.core.immutableEmptyMap
import com.braintrustdata.api.core.toImmutable
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class ViewDataSearch
@JsonCreator
private constructor(
    @JsonProperty("filter")
    @ExcludeMissing
    private val filter: JsonField<List<JsonValue?>> = JsonMissing.of(),
    @JsonProperty("match")
    @ExcludeMissing
    private val match: JsonField<List<JsonValue?>> = JsonMissing.of(),
    @JsonProperty("sort")
    @ExcludeMissing
    private val sort: JsonField<List<JsonValue?>> = JsonMissing.of(),
    @JsonProperty("tag")
    @ExcludeMissing
    private val tag: JsonField<List<JsonValue?>> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun filter(): Optional<List<JsonValue?>> = Optional.ofNullable(filter.getNullable("filter"))

    fun match(): Optional<List<JsonValue?>> = Optional.ofNullable(match.getNullable("match"))

    fun sort(): Optional<List<JsonValue?>> = Optional.ofNullable(sort.getNullable("sort"))

    fun tag(): Optional<List<JsonValue?>> = Optional.ofNullable(tag.getNullable("tag"))

    @JsonProperty("filter") @ExcludeMissing fun _filter(): JsonField<List<JsonValue?>> = filter

    @JsonProperty("match") @ExcludeMissing fun _match(): JsonField<List<JsonValue?>> = match

    @JsonProperty("sort") @ExcludeMissing fun _sort(): JsonField<List<JsonValue?>> = sort

    @JsonProperty("tag") @ExcludeMissing fun _tag(): JsonField<List<JsonValue?>> = tag

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): ViewDataSearch = apply {
        if (validated) {
            return@apply
        }

        filter()
        match()
        sort()
        tag()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ViewDataSearch]. */
    class Builder internal constructor() {

        private var filter: JsonField<MutableList<JsonValue?>>? = null
        private var match: JsonField<MutableList<JsonValue?>>? = null
        private var sort: JsonField<MutableList<JsonValue?>>? = null
        private var tag: JsonField<MutableList<JsonValue?>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(viewDataSearch: ViewDataSearch) = apply {
            filter = viewDataSearch.filter.map { it.toMutableList() }
            match = viewDataSearch.match.map { it.toMutableList() }
            sort = viewDataSearch.sort.map { it.toMutableList() }
            tag = viewDataSearch.tag.map { it.toMutableList() }
            additionalProperties = viewDataSearch.additionalProperties.toMutableMap()
        }

        fun filter(filter: List<JsonValue?>?) = filter(JsonField.ofNullable(filter))

        fun filter(filter: Optional<List<JsonValue?>>) = filter(filter.orElse(null))

        fun filter(filter: JsonField<List<JsonValue?>>) = apply {
            this.filter = filter.map { it.toMutableList() }
        }

        fun addFilter(filter: JsonValue) = apply {
            this.filter =
                (this.filter ?: JsonField.of(mutableListOf())).also {
                    checkKnown("filter", it).add(filter)
                }
        }

        fun match(match: List<JsonValue?>?) = match(JsonField.ofNullable(match))

        fun match(match: Optional<List<JsonValue?>>) = match(match.orElse(null))

        fun match(match: JsonField<List<JsonValue?>>) = apply {
            this.match = match.map { it.toMutableList() }
        }

        fun addMatch(match: JsonValue) = apply {
            this.match =
                (this.match ?: JsonField.of(mutableListOf())).also {
                    checkKnown("match", it).add(match)
                }
        }

        fun sort(sort: List<JsonValue?>?) = sort(JsonField.ofNullable(sort))

        fun sort(sort: Optional<List<JsonValue?>>) = sort(sort.orElse(null))

        fun sort(sort: JsonField<List<JsonValue?>>) = apply {
            this.sort = sort.map { it.toMutableList() }
        }

        fun addSort(sort: JsonValue) = apply {
            this.sort =
                (this.sort ?: JsonField.of(mutableListOf())).also {
                    checkKnown("sort", it).add(sort)
                }
        }

        fun tag(tag: List<JsonValue?>?) = tag(JsonField.ofNullable(tag))

        fun tag(tag: Optional<List<JsonValue?>>) = tag(tag.orElse(null))

        fun tag(tag: JsonField<List<JsonValue?>>) = apply {
            this.tag = tag.map { it.toMutableList() }
        }

        fun addTag(tag: JsonValue) = apply {
            this.tag =
                (this.tag ?: JsonField.of(mutableListOf())).also { checkKnown("tag", it).add(tag) }
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

        fun build(): ViewDataSearch =
            ViewDataSearch(
                (filter ?: JsonMissing.of()).map { it.toImmutable() },
                (match ?: JsonMissing.of()).map { it.toImmutable() },
                (sort ?: JsonMissing.of()).map { it.toImmutable() },
                (tag ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ViewDataSearch && filter == other.filter && match == other.match && sort == other.sort && tag == other.tag && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(filter, match, sort, tag, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ViewDataSearch{filter=$filter, match=$match, sort=$sort, tag=$tag, additionalProperties=$additionalProperties}"
}
