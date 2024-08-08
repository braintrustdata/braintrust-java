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

@JsonDeserialize(builder = PatchProject.Builder::class)
@NoAutoDetect
class PatchProject
private constructor(
    private val name: JsonField<String>,
    private val settings: JsonField<Settings>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** Name of the project */
    fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

    /**
     * Project settings. Patch operations replace all settings, so make sure you include all
     * settings you want to keep.
     */
    fun settings(): Optional<Settings> = Optional.ofNullable(settings.getNullable("settings"))

    /** Name of the project */
    @JsonProperty("name") @ExcludeMissing fun _name() = name

    /**
     * Project settings. Patch operations replace all settings, so make sure you include all
     * settings you want to keep.
     */
    @JsonProperty("settings") @ExcludeMissing fun _settings() = settings

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): PatchProject = apply {
        if (!validated) {
            name()
            settings().map { it.validate() }
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PatchProject &&
            this.name == other.name &&
            this.settings == other.settings &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    name,
                    settings,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "PatchProject{name=$name, settings=$settings, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var name: JsonField<String> = JsonMissing.of()
        private var settings: JsonField<Settings> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(patchProject: PatchProject) = apply {
            this.name = patchProject.name
            this.settings = patchProject.settings
            additionalProperties(patchProject.additionalProperties)
        }

        /** Name of the project */
        fun name(name: String) = name(JsonField.of(name))

        /** Name of the project */
        @JsonProperty("name")
        @ExcludeMissing
        fun name(name: JsonField<String>) = apply { this.name = name }

        /**
         * Project settings. Patch operations replace all settings, so make sure you include all
         * settings you want to keep.
         */
        fun settings(settings: Settings) = settings(JsonField.of(settings))

        /**
         * Project settings. Patch operations replace all settings, so make sure you include all
         * settings you want to keep.
         */
        @JsonProperty("settings")
        @ExcludeMissing
        fun settings(settings: JsonField<Settings>) = apply { this.settings = settings }

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

        fun build(): PatchProject =
            PatchProject(
                name,
                settings,
                additionalProperties.toUnmodifiable(),
            )
    }

    /**
     * Project settings. Patch operations replace all settings, so make sure you include all
     * settings you want to keep.
     */
    @JsonDeserialize(builder = Settings.Builder::class)
    @NoAutoDetect
    class Settings
    private constructor(
        private val comparisonKey: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /** The key used to join two experiments (defaults to `input`). */
        fun comparisonKey(): Optional<String> =
            Optional.ofNullable(comparisonKey.getNullable("comparison_key"))

        /** The key used to join two experiments (defaults to `input`). */
        @JsonProperty("comparison_key") @ExcludeMissing fun _comparisonKey() = comparisonKey

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Settings = apply {
            if (!validated) {
                comparisonKey()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Settings &&
                this.comparisonKey == other.comparisonKey &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(comparisonKey, additionalProperties)
            }
            return hashCode
        }

        override fun toString() =
            "Settings{comparisonKey=$comparisonKey, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var comparisonKey: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(settings: Settings) = apply {
                this.comparisonKey = settings.comparisonKey
                additionalProperties(settings.additionalProperties)
            }

            /** The key used to join two experiments (defaults to `input`). */
            fun comparisonKey(comparisonKey: String) = comparisonKey(JsonField.of(comparisonKey))

            /** The key used to join two experiments (defaults to `input`). */
            @JsonProperty("comparison_key")
            @ExcludeMissing
            fun comparisonKey(comparisonKey: JsonField<String>) = apply {
                this.comparisonKey = comparisonKey
            }

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

            fun build(): Settings = Settings(comparisonKey, additionalProperties.toUnmodifiable())
        }
    }
}
