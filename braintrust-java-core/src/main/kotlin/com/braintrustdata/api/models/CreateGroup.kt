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

@JsonDeserialize(builder = CreateGroup.Builder::class)
@NoAutoDetect
class CreateGroup
private constructor(
    private val name: JsonField<String>,
    private val description: JsonField<String>,
    private val memberUsers: JsonField<List<String>>,
    private val memberGroups: JsonField<List<String>>,
    private val orgName: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** Name of the group */
    fun name(): String = name.getRequired("name")

    /** Textual description of the group */
    fun description(): Optional<String> =
        Optional.ofNullable(description.getNullable("description"))

    /** Ids of users which belong to this group */
    fun memberUsers(): Optional<List<String>> =
        Optional.ofNullable(memberUsers.getNullable("member_users"))

    /**
     * Ids of the groups this group inherits from
     *
     * An inheriting group has all the users contained in its member groups, as well as all of their
     * inherited users
     */
    fun memberGroups(): Optional<List<String>> =
        Optional.ofNullable(memberGroups.getNullable("member_groups"))

    /**
     * For nearly all users, this parameter should be unnecessary. But in the rare case that your
     * API key belongs to multiple organizations, you may specify the name of the organization the
     * group belongs in.
     */
    fun orgName(): Optional<String> = Optional.ofNullable(orgName.getNullable("org_name"))

    /** Name of the group */
    @JsonProperty("name") @ExcludeMissing fun _name() = name

    /** Textual description of the group */
    @JsonProperty("description") @ExcludeMissing fun _description() = description

    /** Ids of users which belong to this group */
    @JsonProperty("member_users") @ExcludeMissing fun _memberUsers() = memberUsers

    /**
     * Ids of the groups this group inherits from
     *
     * An inheriting group has all the users contained in its member groups, as well as all of their
     * inherited users
     */
    @JsonProperty("member_groups") @ExcludeMissing fun _memberGroups() = memberGroups

    /**
     * For nearly all users, this parameter should be unnecessary. But in the rare case that your
     * API key belongs to multiple organizations, you may specify the name of the organization the
     * group belongs in.
     */
    @JsonProperty("org_name") @ExcludeMissing fun _orgName() = orgName

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): CreateGroup = apply {
        if (!validated) {
            name()
            description()
            memberUsers()
            memberGroups()
            orgName()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CreateGroup &&
            this.name == other.name &&
            this.description == other.description &&
            this.memberUsers == other.memberUsers &&
            this.memberGroups == other.memberGroups &&
            this.orgName == other.orgName &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    name,
                    description,
                    memberUsers,
                    memberGroups,
                    orgName,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "CreateGroup{name=$name, description=$description, memberUsers=$memberUsers, memberGroups=$memberGroups, orgName=$orgName, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var name: JsonField<String> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var memberUsers: JsonField<List<String>> = JsonMissing.of()
        private var memberGroups: JsonField<List<String>> = JsonMissing.of()
        private var orgName: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(createGroup: CreateGroup) = apply {
            this.name = createGroup.name
            this.description = createGroup.description
            this.memberUsers = createGroup.memberUsers
            this.memberGroups = createGroup.memberGroups
            this.orgName = createGroup.orgName
            additionalProperties(createGroup.additionalProperties)
        }

        /** Name of the group */
        fun name(name: String) = name(JsonField.of(name))

        /** Name of the group */
        @JsonProperty("name")
        @ExcludeMissing
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Textual description of the group */
        fun description(description: String) = description(JsonField.of(description))

        /** Textual description of the group */
        @JsonProperty("description")
        @ExcludeMissing
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** Ids of users which belong to this group */
        fun memberUsers(memberUsers: List<String>) = memberUsers(JsonField.of(memberUsers))

        /** Ids of users which belong to this group */
        @JsonProperty("member_users")
        @ExcludeMissing
        fun memberUsers(memberUsers: JsonField<List<String>>) = apply {
            this.memberUsers = memberUsers
        }

        /**
         * Ids of the groups this group inherits from
         *
         * An inheriting group has all the users contained in its member groups, as well as all of
         * their inherited users
         */
        fun memberGroups(memberGroups: List<String>) = memberGroups(JsonField.of(memberGroups))

        /**
         * Ids of the groups this group inherits from
         *
         * An inheriting group has all the users contained in its member groups, as well as all of
         * their inherited users
         */
        @JsonProperty("member_groups")
        @ExcludeMissing
        fun memberGroups(memberGroups: JsonField<List<String>>) = apply {
            this.memberGroups = memberGroups
        }

        /**
         * For nearly all users, this parameter should be unnecessary. But in the rare case that
         * your API key belongs to multiple organizations, you may specify the name of the
         * organization the group belongs in.
         */
        fun orgName(orgName: String) = orgName(JsonField.of(orgName))

        /**
         * For nearly all users, this parameter should be unnecessary. But in the rare case that
         * your API key belongs to multiple organizations, you may specify the name of the
         * organization the group belongs in.
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

        fun build(): CreateGroup =
            CreateGroup(
                name,
                description,
                memberUsers.map { it.toUnmodifiable() },
                memberGroups.map { it.toUnmodifiable() },
                orgName,
                additionalProperties.toUnmodifiable(),
            )
    }
}
