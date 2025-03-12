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
class CreateApiKeyOutput @JsonCreator private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("key") @ExcludeMissing private val key: JsonField<String> = JsonMissing.of(),
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
    @JsonProperty("preview_name") @ExcludeMissing private val previewName: JsonField<String> = JsonMissing.of(),
    @JsonProperty("created") @ExcludeMissing private val created: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("org_id") @ExcludeMissing private val orgId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("user_id") @ExcludeMissing private val userId: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),

) {

    /** Unique identifier for the api key */
    fun id(): String = id.getRequired("id")

    /** The raw API key. It will only be exposed this one time */
    fun key(): String = key.getRequired("key")

    /** Name of the api key */
    fun name(): String = name.getRequired("name")

    fun previewName(): String = previewName.getRequired("preview_name")

    /** Date of api key creation */
    fun created(): Optional<OffsetDateTime> = Optional.ofNullable(created.getNullable("created"))

    /** Unique identifier for the organization */
    fun orgId(): Optional<String> = Optional.ofNullable(orgId.getNullable("org_id"))

    /** Unique identifier for the user */
    fun userId(): Optional<String> = Optional.ofNullable(userId.getNullable("user_id"))

    /** Unique identifier for the api key */
    @JsonProperty("id")
    @ExcludeMissing
    fun _id(): JsonField<String> = id

    /** The raw API key. It will only be exposed this one time */
    @JsonProperty("key")
    @ExcludeMissing
    fun _key(): JsonField<String> = key

    /** Name of the api key */
    @JsonProperty("name")
    @ExcludeMissing
    fun _name(): JsonField<String> = name

    @JsonProperty("preview_name")
    @ExcludeMissing
    fun _previewName(): JsonField<String> = previewName

    /** Date of api key creation */
    @JsonProperty("created")
    @ExcludeMissing
    fun _created(): JsonField<OffsetDateTime> = created

    /** Unique identifier for the organization */
    @JsonProperty("org_id")
    @ExcludeMissing
    fun _orgId(): JsonField<String> = orgId

    /** Unique identifier for the user */
    @JsonProperty("user_id")
    @ExcludeMissing
    fun _userId(): JsonField<String> = userId

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): CreateApiKeyOutput =
        apply {
            if (validated) {
              return@apply
            }

            id()
            key()
            name()
            previewName()
            created()
            orgId()
            userId()
            validated = true
        }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CreateApiKeyOutput].
         *
         * The following fields are required:
         *
         * ```java
         * .id()
         * .key()
         * .name()
         * .previewName()
         * ```
         */
        @JvmStatic
        fun builder() = Builder()
    }

    /** A builder for [CreateApiKeyOutput]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var key: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var previewName: JsonField<String>? = null
        private var created: JsonField<OffsetDateTime> = JsonMissing.of()
        private var orgId: JsonField<String> = JsonMissing.of()
        private var userId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(createApiKeyOutput: CreateApiKeyOutput) =
            apply {
                id = createApiKeyOutput.id
                key = createApiKeyOutput.key
                name = createApiKeyOutput.name
                previewName = createApiKeyOutput.previewName
                created = createApiKeyOutput.created
                orgId = createApiKeyOutput.orgId
                userId = createApiKeyOutput.userId
                additionalProperties = createApiKeyOutput.additionalProperties.toMutableMap()
            }

        /** Unique identifier for the api key */
        fun id(id: String) = id(JsonField.of(id))

        /** Unique identifier for the api key */
        fun id(id: JsonField<String>) =
            apply {
                this.id = id
            }

        /** The raw API key. It will only be exposed this one time */
        fun key(key: String) = key(JsonField.of(key))

        /** The raw API key. It will only be exposed this one time */
        fun key(key: JsonField<String>) =
            apply {
                this.key = key
            }

        /** Name of the api key */
        fun name(name: String) = name(JsonField.of(name))

        /** Name of the api key */
        fun name(name: JsonField<String>) =
            apply {
                this.name = name
            }

        fun previewName(previewName: String) = previewName(JsonField.of(previewName))

        fun previewName(previewName: JsonField<String>) =
            apply {
                this.previewName = previewName
            }

        /** Date of api key creation */
        fun created(created: OffsetDateTime?) = created(JsonField.ofNullable(created))

        /** Date of api key creation */
        fun created(created: Optional<OffsetDateTime>) = created(created.getOrNull())

        /** Date of api key creation */
        fun created(created: JsonField<OffsetDateTime>) =
            apply {
                this.created = created
            }

        /** Unique identifier for the organization */
        fun orgId(orgId: String?) = orgId(JsonField.ofNullable(orgId))

        /** Unique identifier for the organization */
        fun orgId(orgId: Optional<String>) = orgId(orgId.getOrNull())

        /** Unique identifier for the organization */
        fun orgId(orgId: JsonField<String>) =
            apply {
                this.orgId = orgId
            }

        /** Unique identifier for the user */
        fun userId(userId: String?) = userId(JsonField.ofNullable(userId))

        /** Unique identifier for the user */
        fun userId(userId: Optional<String>) = userId(userId.getOrNull())

        /** Unique identifier for the user */
        fun userId(userId: JsonField<String>) =
            apply {
                this.userId = userId
            }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
            apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

        fun putAdditionalProperty(key: String, value: JsonValue) =
            apply {
                additionalProperties.put(key, value)
            }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
            apply {
                this.additionalProperties.putAll(additionalProperties)
            }

        fun removeAdditionalProperty(key: String) =
            apply {
                additionalProperties.remove(key)
            }

        fun removeAllAdditionalProperties(keys: Set<String>) =
            apply {
                keys.forEach(::removeAdditionalProperty)
            }

        fun build(): CreateApiKeyOutput =
            CreateApiKeyOutput(
              checkRequired(
                "id", id
              ),
              checkRequired(
                "key", key
              ),
              checkRequired(
                "name", name
              ),
              checkRequired(
                "previewName", previewName
              ),
              created,
              orgId,
              userId,
              additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return /* spotless:off */ other is CreateApiKeyOutput && id == other.id && key == other.key && name == other.name && previewName == other.previewName && created == other.created && orgId == other.orgId && userId == other.userId && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, key, name, previewName, created, orgId, userId, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() = "CreateApiKeyOutput{id=$id, key=$key, name=$name, previewName=$previewName, created=$created, orgId=$orgId, userId=$userId, additionalProperties=$additionalProperties}"
}
