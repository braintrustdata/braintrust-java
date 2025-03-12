// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.Enum
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

@NoAutoDetect
class ProjectScoreConfig
@JsonCreator
private constructor(
    @JsonProperty("destination")
    @ExcludeMissing
    private val destination: JsonField<Destination> = JsonMissing.of(),
    @JsonProperty("multi_select")
    @ExcludeMissing
    private val multiSelect: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("online")
    @ExcludeMissing
    private val online: JsonField<OnlineScoreConfig> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun destination(): Optional<Destination> =
        Optional.ofNullable(destination.getNullable("destination"))

    fun multiSelect(): Optional<Boolean> =
        Optional.ofNullable(multiSelect.getNullable("multi_select"))

    fun online(): Optional<OnlineScoreConfig> = Optional.ofNullable(online.getNullable("online"))

    @JsonProperty("destination")
    @ExcludeMissing
    fun _destination(): JsonField<Destination> = destination

    @JsonProperty("multi_select")
    @ExcludeMissing
    fun _multiSelect(): JsonField<Boolean> = multiSelect

    @JsonProperty("online") @ExcludeMissing fun _online(): JsonField<OnlineScoreConfig> = online

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

    fun toBuilder() = Builder().from(this)

    companion object {

        /** Returns a mutable builder for constructing an instance of [ProjectScoreConfig]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ProjectScoreConfig]. */
    class Builder internal constructor() {

        private var destination: JsonField<Destination> = JsonMissing.of()
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

        fun destination(destination: Destination?) = destination(JsonField.ofNullable(destination))

        fun destination(destination: Optional<Destination>) = destination(destination.getOrNull())

        fun destination(destination: JsonField<Destination>) = apply {
            this.destination = destination
        }

        fun multiSelect(multiSelect: Boolean?) = multiSelect(JsonField.ofNullable(multiSelect))

        fun multiSelect(multiSelect: Boolean) = multiSelect(multiSelect as Boolean?)

        fun multiSelect(multiSelect: Optional<Boolean>) = multiSelect(multiSelect.getOrNull())

        fun multiSelect(multiSelect: JsonField<Boolean>) = apply { this.multiSelect = multiSelect }

        fun online(online: OnlineScoreConfig?) = online(JsonField.ofNullable(online))

        fun online(online: Optional<OnlineScoreConfig>) = online(online.getOrNull())

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

        fun build(): ProjectScoreConfig =
            ProjectScoreConfig(destination, multiSelect, online, additionalProperties.toImmutable())
    }

    class Destination @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val EXPECTED = of("expected")

            @JvmStatic fun of(value: String) = Destination(JsonField.of(value))
        }

        /** An enum containing [Destination]'s known values. */
        enum class Known {
            EXPECTED
        }

        /**
         * An enum containing [Destination]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Destination] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            EXPECTED,
            /**
             * An enum member indicating that [Destination] was instantiated with an unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                EXPECTED -> Value.EXPECTED
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws BraintrustInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                EXPECTED -> Known.EXPECTED
                else -> throw BraintrustInvalidDataException("Unknown Destination: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws BraintrustInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                BraintrustInvalidDataException("Value is not a String")
            }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Destination && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

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
