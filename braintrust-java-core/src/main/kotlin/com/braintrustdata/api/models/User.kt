// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.toImmutable
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = User.Builder::class)
@NoAutoDetect
class User
private constructor(
    private val id: JsonField<String>,
    private val givenName: JsonField<String>,
    private val familyName: JsonField<String>,
    private val email: JsonField<String>,
    private val avatarUrl: JsonField<String>,
    private val created: JsonField<OffsetDateTime>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /** Unique identifier for the user */
    fun id(): String = id.getRequired("id")

    /** Given name of the user */
    fun givenName(): Optional<String> = Optional.ofNullable(givenName.getNullable("given_name"))

    /** Family name of the user */
    fun familyName(): Optional<String> = Optional.ofNullable(familyName.getNullable("family_name"))

    /** The user's email */
    fun email(): Optional<String> = Optional.ofNullable(email.getNullable("email"))

    /** URL of the user's Avatar image */
    fun avatarUrl(): Optional<String> = Optional.ofNullable(avatarUrl.getNullable("avatar_url"))

    /** Date of user creation */
    fun created(): Optional<OffsetDateTime> = Optional.ofNullable(created.getNullable("created"))

    /** Unique identifier for the user */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /** Given name of the user */
    @JsonProperty("given_name") @ExcludeMissing fun _givenName() = givenName

    /** Family name of the user */
    @JsonProperty("family_name") @ExcludeMissing fun _familyName() = familyName

    /** The user's email */
    @JsonProperty("email") @ExcludeMissing fun _email() = email

    /** URL of the user's Avatar image */
    @JsonProperty("avatar_url") @ExcludeMissing fun _avatarUrl() = avatarUrl

    /** Date of user creation */
    @JsonProperty("created") @ExcludeMissing fun _created() = created

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): User = apply {
        if (!validated) {
            id()
            givenName()
            familyName()
            email()
            avatarUrl()
            created()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var givenName: JsonField<String> = JsonMissing.of()
        private var familyName: JsonField<String> = JsonMissing.of()
        private var email: JsonField<String> = JsonMissing.of()
        private var avatarUrl: JsonField<String> = JsonMissing.of()
        private var created: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(user: User) = apply {
            this.id = user.id
            this.givenName = user.givenName
            this.familyName = user.familyName
            this.email = user.email
            this.avatarUrl = user.avatarUrl
            this.created = user.created
            additionalProperties(user.additionalProperties)
        }

        /** Unique identifier for the user */
        fun id(id: String) = id(JsonField.of(id))

        /** Unique identifier for the user */
        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        /** Given name of the user */
        fun givenName(givenName: String) = givenName(JsonField.of(givenName))

        /** Given name of the user */
        @JsonProperty("given_name")
        @ExcludeMissing
        fun givenName(givenName: JsonField<String>) = apply { this.givenName = givenName }

        /** Family name of the user */
        fun familyName(familyName: String) = familyName(JsonField.of(familyName))

        /** Family name of the user */
        @JsonProperty("family_name")
        @ExcludeMissing
        fun familyName(familyName: JsonField<String>) = apply { this.familyName = familyName }

        /** The user's email */
        fun email(email: String) = email(JsonField.of(email))

        /** The user's email */
        @JsonProperty("email")
        @ExcludeMissing
        fun email(email: JsonField<String>) = apply { this.email = email }

        /** URL of the user's Avatar image */
        fun avatarUrl(avatarUrl: String) = avatarUrl(JsonField.of(avatarUrl))

        /** URL of the user's Avatar image */
        @JsonProperty("avatar_url")
        @ExcludeMissing
        fun avatarUrl(avatarUrl: JsonField<String>) = apply { this.avatarUrl = avatarUrl }

        /** Date of user creation */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /** Date of user creation */
        @JsonProperty("created")
        @ExcludeMissing
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

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

        fun build(): User =
            User(
                id,
                givenName,
                familyName,
                email,
                avatarUrl,
                created,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is User && id == other.id && givenName == other.givenName && familyName == other.familyName && email == other.email && avatarUrl == other.avatarUrl && created == other.created && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, givenName, familyName, email, avatarUrl, created, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "User{id=$id, givenName=$givenName, familyName=$familyName, email=$email, avatarUrl=$avatarUrl, created=$created, additionalProperties=$additionalProperties}"
}
