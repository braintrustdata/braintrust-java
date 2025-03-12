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
class User
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("avatar_url")
    @ExcludeMissing
    private val avatarUrl: JsonField<String> = JsonMissing.of(),
    @JsonProperty("created")
    @ExcludeMissing
    private val created: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("email") @ExcludeMissing private val email: JsonField<String> = JsonMissing.of(),
    @JsonProperty("family_name")
    @ExcludeMissing
    private val familyName: JsonField<String> = JsonMissing.of(),
    @JsonProperty("given_name")
    @ExcludeMissing
    private val givenName: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** Unique identifier for the user */
    fun id(): String = id.getRequired("id")

    /** URL of the user's Avatar image */
    fun avatarUrl(): Optional<String> = Optional.ofNullable(avatarUrl.getNullable("avatar_url"))

    /** Date of user creation */
    fun created(): Optional<OffsetDateTime> = Optional.ofNullable(created.getNullable("created"))

    /** The user's email */
    fun email(): Optional<String> = Optional.ofNullable(email.getNullable("email"))

    /** Family name of the user */
    fun familyName(): Optional<String> = Optional.ofNullable(familyName.getNullable("family_name"))

    /** Given name of the user */
    fun givenName(): Optional<String> = Optional.ofNullable(givenName.getNullable("given_name"))

    /** Unique identifier for the user */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /** URL of the user's Avatar image */
    @JsonProperty("avatar_url") @ExcludeMissing fun _avatarUrl(): JsonField<String> = avatarUrl

    /** Date of user creation */
    @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<OffsetDateTime> = created

    /** The user's email */
    @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

    /** Family name of the user */
    @JsonProperty("family_name") @ExcludeMissing fun _familyName(): JsonField<String> = familyName

    /** Given name of the user */
    @JsonProperty("given_name") @ExcludeMissing fun _givenName(): JsonField<String> = givenName

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): User = apply {
        if (validated) {
            return@apply
        }

        id()
        avatarUrl()
        created()
        email()
        familyName()
        givenName()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [User].
         *
         * The following fields are required:
         * ```java
         * .id()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [User]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var avatarUrl: JsonField<String> = JsonMissing.of()
        private var created: JsonField<OffsetDateTime> = JsonMissing.of()
        private var email: JsonField<String> = JsonMissing.of()
        private var familyName: JsonField<String> = JsonMissing.of()
        private var givenName: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(user: User) = apply {
            id = user.id
            avatarUrl = user.avatarUrl
            created = user.created
            email = user.email
            familyName = user.familyName
            givenName = user.givenName
            additionalProperties = user.additionalProperties.toMutableMap()
        }

        /** Unique identifier for the user */
        fun id(id: String) = id(JsonField.of(id))

        /** Unique identifier for the user */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** URL of the user's Avatar image */
        fun avatarUrl(avatarUrl: String?) = avatarUrl(JsonField.ofNullable(avatarUrl))

        /** URL of the user's Avatar image */
        fun avatarUrl(avatarUrl: Optional<String>) = avatarUrl(avatarUrl.getOrNull())

        /** URL of the user's Avatar image */
        fun avatarUrl(avatarUrl: JsonField<String>) = apply { this.avatarUrl = avatarUrl }

        /** Date of user creation */
        fun created(created: OffsetDateTime?) = created(JsonField.ofNullable(created))

        /** Date of user creation */
        fun created(created: Optional<OffsetDateTime>) = created(created.getOrNull())

        /** Date of user creation */
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /** The user's email */
        fun email(email: String?) = email(JsonField.ofNullable(email))

        /** The user's email */
        fun email(email: Optional<String>) = email(email.getOrNull())

        /** The user's email */
        fun email(email: JsonField<String>) = apply { this.email = email }

        /** Family name of the user */
        fun familyName(familyName: String?) = familyName(JsonField.ofNullable(familyName))

        /** Family name of the user */
        fun familyName(familyName: Optional<String>) = familyName(familyName.getOrNull())

        /** Family name of the user */
        fun familyName(familyName: JsonField<String>) = apply { this.familyName = familyName }

        /** Given name of the user */
        fun givenName(givenName: String?) = givenName(JsonField.ofNullable(givenName))

        /** Given name of the user */
        fun givenName(givenName: Optional<String>) = givenName(givenName.getOrNull())

        /** Given name of the user */
        fun givenName(givenName: JsonField<String>) = apply { this.givenName = givenName }

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

        fun build(): User =
            User(
                checkRequired("id", id),
                avatarUrl,
                created,
                email,
                familyName,
                givenName,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is User && id == other.id && avatarUrl == other.avatarUrl && created == other.created && email == other.email && familyName == other.familyName && givenName == other.givenName && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, avatarUrl, created, email, familyName, givenName, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "User{id=$id, avatarUrl=$avatarUrl, created=$created, email=$email, familyName=$familyName, givenName=$givenName, additionalProperties=$additionalProperties}"
}
