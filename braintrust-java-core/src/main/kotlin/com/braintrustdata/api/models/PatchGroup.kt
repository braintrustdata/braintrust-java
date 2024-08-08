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

@JsonDeserialize(builder = PatchGroup.Builder::class)
@NoAutoDetect
class PatchGroup
private constructor(
    private val description: JsonField<String>,
    private val name: JsonField<String>,
    private val addMemberUsers: JsonField<List<String>>,
    private val removeMemberUsers: JsonField<List<String>>,
    private val addMemberGroups: JsonField<List<String>>,
    private val removeMemberGroups: JsonField<List<String>>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** Textual description of the group */
    fun description(): Optional<String> =
        Optional.ofNullable(description.getNullable("description"))

    /** Name of the group */
    fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

    /** A list of user IDs to add to the group */
    fun addMemberUsers(): Optional<List<String>> =
        Optional.ofNullable(addMemberUsers.getNullable("add_member_users"))

    /** A list of user IDs to remove from the group */
    fun removeMemberUsers(): Optional<List<String>> =
        Optional.ofNullable(removeMemberUsers.getNullable("remove_member_users"))

    /** A list of group IDs to add to the group's inheriting-from set */
    fun addMemberGroups(): Optional<List<String>> =
        Optional.ofNullable(addMemberGroups.getNullable("add_member_groups"))

    /** A list of group IDs to remove from the group's inheriting-from set */
    fun removeMemberGroups(): Optional<List<String>> =
        Optional.ofNullable(removeMemberGroups.getNullable("remove_member_groups"))

    /** Textual description of the group */
    @JsonProperty("description") @ExcludeMissing fun _description() = description

    /** Name of the group */
    @JsonProperty("name") @ExcludeMissing fun _name() = name

    /** A list of user IDs to add to the group */
    @JsonProperty("add_member_users") @ExcludeMissing fun _addMemberUsers() = addMemberUsers

    /** A list of user IDs to remove from the group */
    @JsonProperty("remove_member_users")
    @ExcludeMissing
    fun _removeMemberUsers() = removeMemberUsers

    /** A list of group IDs to add to the group's inheriting-from set */
    @JsonProperty("add_member_groups") @ExcludeMissing fun _addMemberGroups() = addMemberGroups

    /** A list of group IDs to remove from the group's inheriting-from set */
    @JsonProperty("remove_member_groups")
    @ExcludeMissing
    fun _removeMemberGroups() = removeMemberGroups

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): PatchGroup = apply {
        if (!validated) {
            description()
            name()
            addMemberUsers()
            removeMemberUsers()
            addMemberGroups()
            removeMemberGroups()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PatchGroup &&
            this.description == other.description &&
            this.name == other.name &&
            this.addMemberUsers == other.addMemberUsers &&
            this.removeMemberUsers == other.removeMemberUsers &&
            this.addMemberGroups == other.addMemberGroups &&
            this.removeMemberGroups == other.removeMemberGroups &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    description,
                    name,
                    addMemberUsers,
                    removeMemberUsers,
                    addMemberGroups,
                    removeMemberGroups,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "PatchGroup{description=$description, name=$name, addMemberUsers=$addMemberUsers, removeMemberUsers=$removeMemberUsers, addMemberGroups=$addMemberGroups, removeMemberGroups=$removeMemberGroups, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var description: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var addMemberUsers: JsonField<List<String>> = JsonMissing.of()
        private var removeMemberUsers: JsonField<List<String>> = JsonMissing.of()
        private var addMemberGroups: JsonField<List<String>> = JsonMissing.of()
        private var removeMemberGroups: JsonField<List<String>> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(patchGroup: PatchGroup) = apply {
            this.description = patchGroup.description
            this.name = patchGroup.name
            this.addMemberUsers = patchGroup.addMemberUsers
            this.removeMemberUsers = patchGroup.removeMemberUsers
            this.addMemberGroups = patchGroup.addMemberGroups
            this.removeMemberGroups = patchGroup.removeMemberGroups
            additionalProperties(patchGroup.additionalProperties)
        }

        /** Textual description of the group */
        fun description(description: String) = description(JsonField.of(description))

        /** Textual description of the group */
        @JsonProperty("description")
        @ExcludeMissing
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** Name of the group */
        fun name(name: String) = name(JsonField.of(name))

        /** Name of the group */
        @JsonProperty("name")
        @ExcludeMissing
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** A list of user IDs to add to the group */
        fun addMemberUsers(addMemberUsers: List<String>) =
            addMemberUsers(JsonField.of(addMemberUsers))

        /** A list of user IDs to add to the group */
        @JsonProperty("add_member_users")
        @ExcludeMissing
        fun addMemberUsers(addMemberUsers: JsonField<List<String>>) = apply {
            this.addMemberUsers = addMemberUsers
        }

        /** A list of user IDs to remove from the group */
        fun removeMemberUsers(removeMemberUsers: List<String>) =
            removeMemberUsers(JsonField.of(removeMemberUsers))

        /** A list of user IDs to remove from the group */
        @JsonProperty("remove_member_users")
        @ExcludeMissing
        fun removeMemberUsers(removeMemberUsers: JsonField<List<String>>) = apply {
            this.removeMemberUsers = removeMemberUsers
        }

        /** A list of group IDs to add to the group's inheriting-from set */
        fun addMemberGroups(addMemberGroups: List<String>) =
            addMemberGroups(JsonField.of(addMemberGroups))

        /** A list of group IDs to add to the group's inheriting-from set */
        @JsonProperty("add_member_groups")
        @ExcludeMissing
        fun addMemberGroups(addMemberGroups: JsonField<List<String>>) = apply {
            this.addMemberGroups = addMemberGroups
        }

        /** A list of group IDs to remove from the group's inheriting-from set */
        fun removeMemberGroups(removeMemberGroups: List<String>) =
            removeMemberGroups(JsonField.of(removeMemberGroups))

        /** A list of group IDs to remove from the group's inheriting-from set */
        @JsonProperty("remove_member_groups")
        @ExcludeMissing
        fun removeMemberGroups(removeMemberGroups: JsonField<List<String>>) = apply {
            this.removeMemberGroups = removeMemberGroups
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

        fun build(): PatchGroup =
            PatchGroup(
                description,
                name,
                addMemberUsers.map { it.toUnmodifiable() },
                removeMemberUsers.map { it.toUnmodifiable() },
                addMemberGroups.map { it.toUnmodifiable() },
                removeMemberGroups.map { it.toUnmodifiable() },
                additionalProperties.toUnmodifiable(),
            )
    }
}
