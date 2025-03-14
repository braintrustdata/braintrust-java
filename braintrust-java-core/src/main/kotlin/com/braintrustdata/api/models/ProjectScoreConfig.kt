// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.immutableEmptyMap
import com.braintrustdata.api.core.toImmutable
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
    private val destination: JsonField<String> = JsonMissing.of(),
    @JsonProperty("multi_select")
    @ExcludeMissing
    private val multiSelect: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("online")
    @ExcludeMissing
    private val online: JsonField<OnlineScoreConfig> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun destination(): Optional<String> =
        Optional.ofNullable(destination.getNullable("destination"))

    fun multiSelect(): Optional<Boolean> =
        Optional.ofNullable(multiSelect.getNullable("multi_select"))

    fun online(): Optional<OnlineScoreConfig> = Optional.ofNullable(online.getNullable("online"))

    @JsonProperty("destination") @ExcludeMissing fun _destination(): JsonField<String> = destination

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

        fun destination(destination: Optional<String>) = destination(destination.getOrNull())

        fun destination(destination: JsonField<String>) = apply { this.destination = destination }

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
