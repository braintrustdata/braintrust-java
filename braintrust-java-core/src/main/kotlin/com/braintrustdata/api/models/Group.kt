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

/**
 * A group is a collection of users which can be assigned an ACL
 *
 * Groups can consist of individual users, as well as a set of groups they inherit from
 */
@JsonDeserialize(builder = Group.Builder::class)
@NoAutoDetect
class Group
private constructor(
    private val id: JsonField<String>,
    private val orgId: JsonField<String>,
    private val userId: JsonField<String>,
    private val created: JsonField<OffsetDateTime>,
    private val name: JsonField<String>,
    private val description: JsonField<String>,
    private val deletedAt: JsonField<OffsetDateTime>,
    private val memberUsers: JsonField<List<String>>,
    private val memberGroups: JsonField<List<String>>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /** Unique identifier for the group */
    fun id(): String = id.getRequired("id")

    /**
     * Unique id for the organization that the group belongs under
     *
     * It is forbidden to change the org after creating a group
     */
    fun orgId(): String = orgId.getRequired("org_id")

    /** Identifies the user who created the group */
    fun userId(): Optional<String> = Optional.ofNullable(userId.getNullable("user_id"))

    /** Date of group creation */
    fun created(): Optional<OffsetDateTime> = Optional.ofNullable(created.getNullable("created"))

    /** Name of the group */
    fun name(): String = name.getRequired("name")

    /** Textual description of the group */
    fun description(): Optional<String> =
        Optional.ofNullable(description.getNullable("description"))

    /** Date of group deletion, or null if the group is still active */
    fun deletedAt(): Optional<OffsetDateTime> =
        Optional.ofNullable(deletedAt.getNullable("deleted_at"))

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

    /** Unique identifier for the group */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /**
     * Unique id for the organization that the group belongs under
     *
     * It is forbidden to change the org after creating a group
     */
    @JsonProperty("org_id") @ExcludeMissing fun _orgId() = orgId

    /** Identifies the user who created the group */
    @JsonProperty("user_id") @ExcludeMissing fun _userId() = userId

    /** Date of group creation */
    @JsonProperty("created") @ExcludeMissing fun _created() = created

    /** Name of the group */
    @JsonProperty("name") @ExcludeMissing fun _name() = name

    /** Textual description of the group */
    @JsonProperty("description") @ExcludeMissing fun _description() = description

    /** Date of group deletion, or null if the group is still active */
    @JsonProperty("deleted_at") @ExcludeMissing fun _deletedAt() = deletedAt

    /** Ids of users which belong to this group */
    @JsonProperty("member_users") @ExcludeMissing fun _memberUsers() = memberUsers

    /**
     * Ids of the groups this group inherits from
     *
     * An inheriting group has all the users contained in its member groups, as well as all of their
     * inherited users
     */
    @JsonProperty("member_groups") @ExcludeMissing fun _memberGroups() = memberGroups

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): Group = apply {
        if (!validated) {
            id()
            orgId()
            userId()
            created()
            name()
            description()
            deletedAt()
            memberUsers()
            memberGroups()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var orgId: JsonField<String> = JsonMissing.of()
        private var userId: JsonField<String> = JsonMissing.of()
        private var created: JsonField<OffsetDateTime> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var deletedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var memberUsers: JsonField<List<String>> = JsonMissing.of()
        private var memberGroups: JsonField<List<String>> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(group: Group) = apply {
            this.id = group.id
            this.orgId = group.orgId
            this.userId = group.userId
            this.created = group.created
            this.name = group.name
            this.description = group.description
            this.deletedAt = group.deletedAt
            this.memberUsers = group.memberUsers
            this.memberGroups = group.memberGroups
            additionalProperties(group.additionalProperties)
        }

        /** Unique identifier for the group */
        fun id(id: String) = id(JsonField.of(id))

        /** Unique identifier for the group */
        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * Unique id for the organization that the group belongs under
         *
         * It is forbidden to change the org after creating a group
         */
        fun orgId(orgId: String) = orgId(JsonField.of(orgId))

        /**
         * Unique id for the organization that the group belongs under
         *
         * It is forbidden to change the org after creating a group
         */
        @JsonProperty("org_id")
        @ExcludeMissing
        fun orgId(orgId: JsonField<String>) = apply { this.orgId = orgId }

        /** Identifies the user who created the group */
        fun userId(userId: String) = userId(JsonField.of(userId))

        /** Identifies the user who created the group */
        @JsonProperty("user_id")
        @ExcludeMissing
        fun userId(userId: JsonField<String>) = apply { this.userId = userId }

        /** Date of group creation */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /** Date of group creation */
        @JsonProperty("created")
        @ExcludeMissing
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

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

        /** Date of group deletion, or null if the group is still active */
        fun deletedAt(deletedAt: OffsetDateTime) = deletedAt(JsonField.of(deletedAt))

        /** Date of group deletion, or null if the group is still active */
        @JsonProperty("deleted_at")
        @ExcludeMissing
        fun deletedAt(deletedAt: JsonField<OffsetDateTime>) = apply { this.deletedAt = deletedAt }

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

        fun build(): Group =
            Group(
                id,
                orgId,
                userId,
                created,
                name,
                description,
                deletedAt,
                memberUsers.map { it.toImmutable() },
                memberGroups.map { it.toImmutable() },
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Group && id == other.id && orgId == other.orgId && userId == other.userId && created == other.created && name == other.name && description == other.description && deletedAt == other.deletedAt && memberUsers == other.memberUsers && memberGroups == other.memberGroups && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, orgId, userId, created, name, description, deletedAt, memberUsers, memberGroups, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Group{id=$id, orgId=$orgId, userId=$userId, created=$created, name=$name, description=$description, deletedAt=$deletedAt, memberUsers=$memberUsers, memberGroups=$memberGroups, additionalProperties=$additionalProperties}"
}
