// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.checkKnown
import com.braintrustdata.api.core.toImmutable
import com.braintrustdata.api.errors.BraintrustInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ViewDataSearch
private constructor(
    private val filter: JsonField<List<JsonValue?>>,
    private val match: JsonField<List<JsonValue?>>,
    private val sort: JsonField<List<JsonValue?>>,
    private val tag: JsonField<List<JsonValue?>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("filter")
        @ExcludeMissing
        filter: JsonField<List<JsonValue?>> = JsonMissing.of(),
        @JsonProperty("match")
        @ExcludeMissing
        match: JsonField<List<JsonValue?>> = JsonMissing.of(),
        @JsonProperty("sort") @ExcludeMissing sort: JsonField<List<JsonValue?>> = JsonMissing.of(),
        @JsonProperty("tag") @ExcludeMissing tag: JsonField<List<JsonValue?>> = JsonMissing.of(),
    ) : this(filter, match, sort, tag, mutableMapOf())

    /**
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun filter(): Optional<List<JsonValue?>> = filter.getOptional("filter")

    /**
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun match(): Optional<List<JsonValue?>> = match.getOptional("match")

    /**
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sort(): Optional<List<JsonValue?>> = sort.getOptional("sort")

    /**
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tag(): Optional<List<JsonValue?>> = tag.getOptional("tag")

    /**
     * Returns the raw JSON value of [filter].
     *
     * Unlike [filter], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("filter") @ExcludeMissing fun _filter(): JsonField<List<JsonValue?>> = filter

    /**
     * Returns the raw JSON value of [match].
     *
     * Unlike [match], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("match") @ExcludeMissing fun _match(): JsonField<List<JsonValue?>> = match

    /**
     * Returns the raw JSON value of [sort].
     *
     * Unlike [sort], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sort") @ExcludeMissing fun _sort(): JsonField<List<JsonValue?>> = sort

    /**
     * Returns the raw JSON value of [tag].
     *
     * Unlike [tag], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tag") @ExcludeMissing fun _tag(): JsonField<List<JsonValue?>> = tag

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

        /** Returns a mutable builder for constructing an instance of [ViewDataSearch]. */
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

        /** Alias for calling [Builder.filter] with `filter.orElse(null)`. */
        fun filter(filter: Optional<List<JsonValue?>>) = filter(filter.getOrNull())

        /**
         * Sets [Builder.filter] to an arbitrary JSON value.
         *
         * You should usually call [Builder.filter] with a well-typed `List<JsonValue?>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun filter(filter: JsonField<List<JsonValue?>>) = apply {
            this.filter = filter.map { it.toMutableList() }
        }

        /**
         * Adds a single [JsonValue] to [Builder.filter].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addFilter(filter: JsonValue) = apply {
            this.filter =
                (this.filter ?: JsonField.of(mutableListOf())).also {
                    checkKnown("filter", it).add(filter)
                }
        }

        fun match(match: List<JsonValue?>?) = match(JsonField.ofNullable(match))

        /** Alias for calling [Builder.match] with `match.orElse(null)`. */
        fun match(match: Optional<List<JsonValue?>>) = match(match.getOrNull())

        /**
         * Sets [Builder.match] to an arbitrary JSON value.
         *
         * You should usually call [Builder.match] with a well-typed `List<JsonValue?>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun match(match: JsonField<List<JsonValue?>>) = apply {
            this.match = match.map { it.toMutableList() }
        }

        /**
         * Adds a single [JsonValue] to [Builder.match].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addMatch(match: JsonValue) = apply {
            this.match =
                (this.match ?: JsonField.of(mutableListOf())).also {
                    checkKnown("match", it).add(match)
                }
        }

        fun sort(sort: List<JsonValue?>?) = sort(JsonField.ofNullable(sort))

        /** Alias for calling [Builder.sort] with `sort.orElse(null)`. */
        fun sort(sort: Optional<List<JsonValue?>>) = sort(sort.getOrNull())

        /**
         * Sets [Builder.sort] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sort] with a well-typed `List<JsonValue?>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sort(sort: JsonField<List<JsonValue?>>) = apply {
            this.sort = sort.map { it.toMutableList() }
        }

        /**
         * Adds a single [JsonValue] to [Builder.sort].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSort(sort: JsonValue) = apply {
            this.sort =
                (this.sort ?: JsonField.of(mutableListOf())).also {
                    checkKnown("sort", it).add(sort)
                }
        }

        fun tag(tag: List<JsonValue?>?) = tag(JsonField.ofNullable(tag))

        /** Alias for calling [Builder.tag] with `tag.orElse(null)`. */
        fun tag(tag: Optional<List<JsonValue?>>) = tag(tag.getOrNull())

        /**
         * Sets [Builder.tag] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tag] with a well-typed `List<JsonValue?>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tag(tag: JsonField<List<JsonValue?>>) = apply {
            this.tag = tag.map { it.toMutableList() }
        }

        /**
         * Adds a single [JsonValue] to [Builder.tag].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
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

        /**
         * Returns an immutable instance of [ViewDataSearch].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ViewDataSearch =
            ViewDataSearch(
                (filter ?: JsonMissing.of()).map { it.toImmutable() },
                (match ?: JsonMissing.of()).map { it.toImmutable() },
                (sort ?: JsonMissing.of()).map { it.toImmutable() },
                (tag ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

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
        (filter.asKnown().getOrNull()?.sumOf { (if (it == null) 0 else 1).toInt() } ?: 0) +
            (match.asKnown().getOrNull()?.sumOf { (if (it == null) 0 else 1).toInt() } ?: 0) +
            (sort.asKnown().getOrNull()?.sumOf { (if (it == null) 0 else 1).toInt() } ?: 0) +
            (tag.asKnown().getOrNull()?.sumOf { (if (it == null) 0 else 1).toInt() } ?: 0)

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
