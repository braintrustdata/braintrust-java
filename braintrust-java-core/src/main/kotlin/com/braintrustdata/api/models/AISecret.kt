// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.checkRequired
import com.braintrustdata.api.core.immutableEmptyMap
import com.braintrustdata.api.core.toImmutable
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

@NoAutoDetect
class AISecret
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
    @JsonProperty("org_id") @ExcludeMissing private val orgId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("created")
    @ExcludeMissing
    private val created: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("metadata")
    @ExcludeMissing
    private val metadata: JsonField<Metadata> = JsonMissing.of(),
    @JsonProperty("preview_secret")
    @ExcludeMissing
    private val previewSecret: JsonField<String> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonField<String> = JsonMissing.of(),
    @JsonProperty("updated_at")
    @ExcludeMissing
    private val updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** Unique identifier for the AI secret */
    fun id(): String = id.getRequired("id")

    /** Name of the AI secret */
    fun name(): String = name.getRequired("name")

    /** Unique identifier for the organization */
    fun orgId(): String = orgId.getRequired("org_id")

    /** Date of AI secret creation */
    fun created(): Optional<OffsetDateTime> = Optional.ofNullable(created.getNullable("created"))

    fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata.getNullable("metadata"))

    fun previewSecret(): Optional<String> =
        Optional.ofNullable(previewSecret.getNullable("preview_secret"))

    fun type(): Optional<String> = Optional.ofNullable(type.getNullable("type"))

    /** Date of last AI secret update */
    fun updatedAt(): Optional<OffsetDateTime> =
        Optional.ofNullable(updatedAt.getNullable("updated_at"))

    /** Unique identifier for the AI secret */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /** Name of the AI secret */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /** Unique identifier for the organization */
    @JsonProperty("org_id") @ExcludeMissing fun _orgId(): JsonField<String> = orgId

    /** Date of AI secret creation */
    @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<OffsetDateTime> = created

    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    @JsonProperty("preview_secret")
    @ExcludeMissing
    fun _previewSecret(): JsonField<String> = previewSecret

    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

    /** Date of last AI secret update */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): AISecret = apply {
        if (validated) {
            return@apply
        }

        id()
        name()
        orgId()
        created()
        metadata().ifPresent { it.validate() }
        previewSecret()
        type()
        updatedAt()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AISecret].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .name()
         * .orgId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AISecret]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var orgId: JsonField<String>? = null
        private var created: JsonField<OffsetDateTime> = JsonMissing.of()
        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var previewSecret: JsonField<String> = JsonMissing.of()
        private var type: JsonField<String> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(aiSecret: AISecret) = apply {
            id = aiSecret.id
            name = aiSecret.name
            orgId = aiSecret.orgId
            created = aiSecret.created
            metadata = aiSecret.metadata
            previewSecret = aiSecret.previewSecret
            type = aiSecret.type
            updatedAt = aiSecret.updatedAt
            additionalProperties = aiSecret.additionalProperties.toMutableMap()
        }

        /** Unique identifier for the AI secret */
        fun id(id: String) = id(JsonField.of(id))

        /** Unique identifier for the AI secret */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Name of the AI secret */
        fun name(name: String) = name(JsonField.of(name))

        /** Name of the AI secret */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Unique identifier for the organization */
        fun orgId(orgId: String) = orgId(JsonField.of(orgId))

        /** Unique identifier for the organization */
        fun orgId(orgId: JsonField<String>) = apply { this.orgId = orgId }

        /** Date of AI secret creation */
        fun created(created: OffsetDateTime?) = created(JsonField.ofNullable(created))

        /** Date of AI secret creation */
        fun created(created: Optional<OffsetDateTime>) = created(created.getOrNull())

        /** Date of AI secret creation */
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        fun metadata(metadata: Metadata?) = metadata(JsonField.ofNullable(metadata))

        fun metadata(metadata: Optional<Metadata>) = metadata(metadata.getOrNull())

        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        fun previewSecret(previewSecret: String?) =
            previewSecret(JsonField.ofNullable(previewSecret))

        fun previewSecret(previewSecret: Optional<String>) =
            previewSecret(previewSecret.getOrNull())

        fun previewSecret(previewSecret: JsonField<String>) = apply {
            this.previewSecret = previewSecret
        }

        fun type(type: String?) = type(JsonField.ofNullable(type))

        fun type(type: Optional<String>) = type(type.getOrNull())

        fun type(type: JsonField<String>) = apply { this.type = type }

        /** Date of last AI secret update */
        fun updatedAt(updatedAt: OffsetDateTime?) = updatedAt(JsonField.ofNullable(updatedAt))

        /** Date of last AI secret update */
        fun updatedAt(updatedAt: Optional<OffsetDateTime>) = updatedAt(updatedAt.getOrNull())

        /** Date of last AI secret update */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

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

        fun build(): AISecret =
            AISecret(
                checkRequired("id", id),
                checkRequired("name", name),
                checkRequired("orgId", orgId),
                created,
                metadata,
                previewSecret,
                type,
                updatedAt,
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class Metadata
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Metadata = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Metadata]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Metadata]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(metadata: Metadata) = apply {
                additionalProperties = metadata.additionalProperties.toMutableMap()
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

            fun build(): Metadata = Metadata(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Metadata && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AISecret && id == other.id && name == other.name && orgId == other.orgId && created == other.created && metadata == other.metadata && previewSecret == other.previewSecret && type == other.type && updatedAt == other.updatedAt && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, name, orgId, created, metadata, previewSecret, type, updatedAt, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AISecret{id=$id, name=$name, orgId=$orgId, created=$created, metadata=$metadata, previewSecret=$previewSecret, type=$type, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
