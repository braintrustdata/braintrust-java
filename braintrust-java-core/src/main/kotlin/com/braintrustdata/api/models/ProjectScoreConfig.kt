// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.errors.BraintrustInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ProjectScoreConfig
private constructor(
    private val destination: JsonField<String>,
    private val multiSelect: JsonField<Boolean>,
    private val online: JsonField<OnlineScoreConfig>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("destination")
        @ExcludeMissing
        destination: JsonField<String> = JsonMissing.of(),
        @JsonProperty("multi_select")
        @ExcludeMissing
        multiSelect: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("online")
        @ExcludeMissing
        online: JsonField<OnlineScoreConfig> = JsonMissing.of(),
    ) : this(destination, multiSelect, online, mutableMapOf())

    /**
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun destination(): Optional<String> =
        Optional.ofNullable(destination.getNullable("destination"))

    /**
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun multiSelect(): Optional<Boolean> =
        Optional.ofNullable(multiSelect.getNullable("multi_select"))

    /**
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun online(): Optional<OnlineScoreConfig> = Optional.ofNullable(online.getNullable("online"))

    /**
     * Returns the raw JSON value of [destination].
     *
     * Unlike [destination], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("destination") @ExcludeMissing fun _destination(): JsonField<String> = destination

    /**
     * Returns the raw JSON value of [multiSelect].
     *
     * Unlike [multiSelect], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("multi_select")
    @ExcludeMissing
    fun _multiSelect(): JsonField<Boolean> = multiSelect

    /**
     * Returns the raw JSON value of [online].
     *
     * Unlike [online], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("online") @ExcludeMissing fun _online(): JsonField<OnlineScoreConfig> = online

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

        /** Returns a mutable builder for constructing an instance of [ProjectScoreConfig]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ProjectScoreConfig]. */
    class Builder internal constructor() {

        private var destination: JsonField<String> = JsonMissing.of()
        private var multiSelect: JsonField<Boolean> = JsonMissing.of()
        private var online: JsonField<OnlineScoreConfig> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(projectScoreConfig: ProjectScoreConfig) = apply {
            destination = projectScoreConfig.destination
            multiSelect = projectScoreConfig.multiSelect
            online = projectScoreConfig.online
            additionalProperties = projectScoreConfig.additionalProperties.toMutableMap()
        }

        fun destination(destination: String?) = destination(JsonField.ofNullable(destination))

        /** Alias for calling [Builder.destination] with `destination.orElse(null)`. */
        fun destination(destination: Optional<String>) = destination(destination.getOrNull())

        /**
         * Sets [Builder.destination] to an arbitrary JSON value.
         *
         * You should usually call [Builder.destination] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun destination(destination: JsonField<String>) = apply { this.destination = destination }

        fun multiSelect(multiSelect: Boolean?) = multiSelect(JsonField.ofNullable(multiSelect))

        /**
         * Alias for [Builder.multiSelect].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun multiSelect(multiSelect: Boolean) = multiSelect(multiSelect as Boolean?)

        /** Alias for calling [Builder.multiSelect] with `multiSelect.orElse(null)`. */
        fun multiSelect(multiSelect: Optional<Boolean>) = multiSelect(multiSelect.getOrNull())

        /**
         * Sets [Builder.multiSelect] to an arbitrary JSON value.
         *
         * You should usually call [Builder.multiSelect] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun multiSelect(multiSelect: JsonField<Boolean>) = apply { this.multiSelect = multiSelect }

        fun online(online: OnlineScoreConfig?) = online(JsonField.ofNullable(online))

        /** Alias for calling [Builder.online] with `online.orElse(null)`. */
        fun online(online: Optional<OnlineScoreConfig>) = online(online.getOrNull())

        /**
         * Sets [Builder.online] to an arbitrary JSON value.
         *
         * You should usually call [Builder.online] with a well-typed [OnlineScoreConfig] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun online(online: JsonField<OnlineScoreConfig>) = apply { this.online = online }

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
         * Returns an immutable instance of [ProjectScoreConfig].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ProjectScoreConfig =
            ProjectScoreConfig(
                destination,
                multiSelect,
                online,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ProjectScoreConfig = apply {
        if (validated) {
            return@apply
        }

        destination()
        multiSelect()
        online().ifPresent { it.validate() }
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
        (if (destination.asKnown().isPresent) 1 else 0) +
            (if (multiSelect.asKnown().isPresent) 1 else 0) +
            (online.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ProjectScoreConfig && destination == other.destination && multiSelect == other.multiSelect && online == other.online && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(destination, multiSelect, online, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ProjectScoreConfig{destination=$destination, multiSelect=$multiSelect, online=$online, additionalProperties=$additionalProperties}"
}
