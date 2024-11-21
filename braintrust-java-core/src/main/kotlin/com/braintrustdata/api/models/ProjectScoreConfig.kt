// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.Enum
import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.toImmutable
import com.braintrustdata.api.errors.BraintrustInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = ProjectScoreConfig.Builder::class)
@NoAutoDetect
class ProjectScoreConfig
private constructor(
    private val multiSelect: JsonField<Boolean>,
    private val destination: JsonField<Destination>,
    private val online: JsonField<OnlineScoreConfig>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    fun multiSelect(): Optional<Boolean> =
        Optional.ofNullable(multiSelect.getNullable("multi_select"))

    fun destination(): Optional<Destination> =
        Optional.ofNullable(destination.getNullable("destination"))

    fun online(): Optional<OnlineScoreConfig> = Optional.ofNullable(online.getNullable("online"))

    @JsonProperty("multi_select") @ExcludeMissing fun _multiSelect() = multiSelect

    @JsonProperty("destination") @ExcludeMissing fun _destination() = destination

    @JsonProperty("online") @ExcludeMissing fun _online() = online

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): ProjectScoreConfig = apply {
        if (!validated) {
            multiSelect()
            destination()
            online().map { it.validate() }
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var multiSelect: JsonField<Boolean> = JsonMissing.of()
        private var destination: JsonField<Destination> = JsonMissing.of()
        private var online: JsonField<OnlineScoreConfig> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(projectScoreConfig: ProjectScoreConfig) = apply {
            this.multiSelect = projectScoreConfig.multiSelect
            this.destination = projectScoreConfig.destination
            this.online = projectScoreConfig.online
            additionalProperties(projectScoreConfig.additionalProperties)
        }

        fun multiSelect(multiSelect: Boolean) = multiSelect(JsonField.of(multiSelect))

        @JsonProperty("multi_select")
        @ExcludeMissing
        fun multiSelect(multiSelect: JsonField<Boolean>) = apply { this.multiSelect = multiSelect }

        fun destination(destination: Destination) = destination(JsonField.of(destination))

        @JsonProperty("destination")
        @ExcludeMissing
        fun destination(destination: JsonField<Destination>) = apply {
            this.destination = destination
        }

        fun online(online: OnlineScoreConfig) = online(JsonField.of(online))

        @JsonProperty("online")
        @ExcludeMissing
        fun online(online: JsonField<OnlineScoreConfig>) = apply { this.online = online }

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

        fun build(): ProjectScoreConfig =
            ProjectScoreConfig(
                multiSelect,
                destination,
                online,
                additionalProperties.toImmutable(),
            )
    }

    class Destination
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Destination && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val EXPECTED = Destination(JsonField.of("expected"))

            @JvmStatic fun of(value: String) = Destination(JsonField.of(value))
        }

        enum class Known {
            EXPECTED,
        }

        enum class Value {
            EXPECTED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                EXPECTED -> Value.EXPECTED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                EXPECTED -> Known.EXPECTED
                else -> throw BraintrustInvalidDataException("Unknown Destination: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ProjectScoreConfig && multiSelect == other.multiSelect && destination == other.destination && online == other.online && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(multiSelect, destination, online, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ProjectScoreConfig{multiSelect=$multiSelect, destination=$destination, online=$online, additionalProperties=$additionalProperties}"
}
