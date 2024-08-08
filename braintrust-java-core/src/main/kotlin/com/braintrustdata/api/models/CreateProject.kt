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

@JsonDeserialize(builder = CreateProject.Builder::class)
@NoAutoDetect
class CreateProject
private constructor(
    private val name: JsonField<String>,
    private val orgName: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** Name of the project */
    fun name(): String = name.getRequired("name")

    /**
     * For nearly all users, this parameter should be unnecessary. But in the rare case that your
     * API key belongs to multiple organizations, you may specify the name of the organization the
     * project belongs in.
     */
    fun orgName(): Optional<String> = Optional.ofNullable(orgName.getNullable("org_name"))

    /** Name of the project */
    @JsonProperty("name") @ExcludeMissing fun _name() = name

    /**
     * For nearly all users, this parameter should be unnecessary. But in the rare case that your
     * API key belongs to multiple organizations, you may specify the name of the organization the
     * project belongs in.
     */
    @JsonProperty("org_name") @ExcludeMissing fun _orgName() = orgName

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): CreateProject = apply {
        if (!validated) {
            name()
            orgName()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CreateProject &&
            this.name == other.name &&
            this.orgName == other.orgName &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    name,
                    orgName,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "CreateProject{name=$name, orgName=$orgName, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var name: JsonField<String> = JsonMissing.of()
        private var orgName: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(createProject: CreateProject) = apply {
            this.name = createProject.name
            this.orgName = createProject.orgName
            additionalProperties(createProject.additionalProperties)
        }

        /** Name of the project */
        fun name(name: String) = name(JsonField.of(name))

        /** Name of the project */
        @JsonProperty("name")
        @ExcludeMissing
        fun name(name: JsonField<String>) = apply { this.name = name }

        /**
         * For nearly all users, this parameter should be unnecessary. But in the rare case that
         * your API key belongs to multiple organizations, you may specify the name of the
         * organization the project belongs in.
         */
        fun orgName(orgName: String) = orgName(JsonField.of(orgName))

        /**
         * For nearly all users, this parameter should be unnecessary. But in the rare case that
         * your API key belongs to multiple organizations, you may specify the name of the
         * organization the project belongs in.
         */
        @JsonProperty("org_name")
        @ExcludeMissing
        fun orgName(orgName: JsonField<String>) = apply { this.orgName = orgName }

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

        fun build(): CreateProject =
            CreateProject(
                name,
                orgName,
                additionalProperties.toUnmodifiable(),
            )
    }
}
