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
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = AISecret.Builder::class)
@NoAutoDetect
class AISecret
private constructor(
    private val id: JsonField<String>,
    private val created: JsonField<OffsetDateTime>,
    private val orgId: JsonField<String>,
    private val name: JsonField<String>,
    private val type: JsonField<String>,
    private val metadata: JsonField<Metadata>,
    private val previewSecret: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /** Unique identifier for the AI secret */
    fun id(): String = id.getRequired("id")

    /** Date of AI secret creation */
    fun created(): Optional<OffsetDateTime> = Optional.ofNullable(created.getNullable("created"))

    /** Unique identifier for the organization */
    fun orgId(): String = orgId.getRequired("org_id")

    /** Name of the AI secret */
    fun name(): String = name.getRequired("name")

    fun type(): Optional<String> = Optional.ofNullable(type.getNullable("type"))

    fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata.getNullable("metadata"))

    fun previewSecret(): Optional<String> =
        Optional.ofNullable(previewSecret.getNullable("preview_secret"))

    /** Unique identifier for the AI secret */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /** Date of AI secret creation */
    @JsonProperty("created") @ExcludeMissing fun _created() = created

    /** Unique identifier for the organization */
    @JsonProperty("org_id") @ExcludeMissing fun _orgId() = orgId

    /** Name of the AI secret */
    @JsonProperty("name") @ExcludeMissing fun _name() = name

    @JsonProperty("type") @ExcludeMissing fun _type() = type

    @JsonProperty("metadata") @ExcludeMissing fun _metadata() = metadata

    @JsonProperty("preview_secret") @ExcludeMissing fun _previewSecret() = previewSecret

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): AISecret = apply {
        if (!validated) {
            id()
            created()
            orgId()
            name()
            type()
            metadata().map { it.validate() }
            previewSecret()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var created: JsonField<OffsetDateTime> = JsonMissing.of()
        private var orgId: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var type: JsonField<String> = JsonMissing.of()
        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var previewSecret: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(aiSecret: AISecret) = apply {
            this.id = aiSecret.id
            this.created = aiSecret.created
            this.orgId = aiSecret.orgId
            this.name = aiSecret.name
            this.type = aiSecret.type
            this.metadata = aiSecret.metadata
            this.previewSecret = aiSecret.previewSecret
            additionalProperties(aiSecret.additionalProperties)
        }

        /** Unique identifier for the AI secret */
        fun id(id: String) = id(JsonField.of(id))

        /** Unique identifier for the AI secret */
        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        /** Date of AI secret creation */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /** Date of AI secret creation */
        @JsonProperty("created")
        @ExcludeMissing
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /** Unique identifier for the organization */
        fun orgId(orgId: String) = orgId(JsonField.of(orgId))

        /** Unique identifier for the organization */
        @JsonProperty("org_id")
        @ExcludeMissing
        fun orgId(orgId: JsonField<String>) = apply { this.orgId = orgId }

        /** Name of the AI secret */
        fun name(name: String) = name(JsonField.of(name))

        /** Name of the AI secret */
        @JsonProperty("name")
        @ExcludeMissing
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun type(type: String) = type(JsonField.of(type))

        @JsonProperty("type")
        @ExcludeMissing
        fun type(type: JsonField<String>) = apply { this.type = type }

        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

        @JsonProperty("metadata")
        @ExcludeMissing
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        fun previewSecret(previewSecret: String) = previewSecret(JsonField.of(previewSecret))

        @JsonProperty("preview_secret")
        @ExcludeMissing
        fun previewSecret(previewSecret: JsonField<String>) = apply {
            this.previewSecret = previewSecret
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

        fun build(): AISecret =
            AISecret(
                id,
                created,
                orgId,
                name,
                type,
                metadata,
                previewSecret,
                additionalProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(builder = Metadata.Builder::class)
    @NoAutoDetect
    class Metadata
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Metadata = apply {
            if (!validated) {
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(metadata: Metadata) = apply {
                additionalProperties(metadata.additionalProperties)
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

            fun build(): Metadata = Metadata(additionalProperties.toUnmodifiable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Metadata && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AISecret && this.id == other.id && this.created == other.created && this.orgId == other.orgId && this.name == other.name && this.type == other.type && this.metadata == other.metadata && this.previewSecret == other.previewSecret && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(id, created, orgId, name, type, metadata, previewSecret, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() =
        "AISecret{id=$id, created=$created, orgId=$orgId, name=$name, type=$type, metadata=$metadata, previewSecret=$previewSecret, additionalProperties=$additionalProperties}"
}
