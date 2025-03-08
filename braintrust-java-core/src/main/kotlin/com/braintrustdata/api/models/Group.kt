// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.checkKnown
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

/**
 * A group is a collection of users which can be assigned an ACL
 *
 * Groups can consist of individual users, as well as a set of groups they inherit from
 */
@NoAutoDetect
class Group
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
    @JsonProperty("org_id") @ExcludeMissing private val orgId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("created")
    @ExcludeMissing
    private val created: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("deleted_at")
    @ExcludeMissing
    private val deletedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("description")
    @ExcludeMissing
    private val description: JsonField<String> = JsonMissing.of(),
    @JsonProperty("member_groups")
    @ExcludeMissing
    private val memberGroups: JsonField<List<String>> = JsonMissing.of(),
    @JsonProperty("member_users")
    @ExcludeMissing
    private val memberUsers: JsonField<List<String>> = JsonMissing.of(),
    @JsonProperty("user_id")
    @ExcludeMissing
    private val userId: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** Unique identifier for the group */
    fun id(): String = id.getRequired("id")

    /** Name of the group */
    fun name(): String = name.getRequired("name")

    /**
     * Unique id for the organization that the group belongs under
     *
     * It is forbidden to change the org after creating a group
     */
    fun orgId(): String = orgId.getRequired("org_id")

    /** Date of group creation */
    fun created(): Optional<OffsetDateTime> = Optional.ofNullable(created.getNullable("created"))

    /** Date of group deletion, or null if the group is still active */
    fun deletedAt(): Optional<OffsetDateTime> =
        Optional.ofNullable(deletedAt.getNullable("deleted_at"))

    /** Textual description of the group */
    fun description(): Optional<String> =
        Optional.ofNullable(description.getNullable("description"))

    /**
     * Ids of the groups this group inherits from
     *
     * An inheriting group has all the users contained in its member groups, as well as all of their
     * inherited users
     */
    fun memberGroups(): Optional<List<String>> =
        Optional.ofNullable(memberGroups.getNullable("member_groups"))

    /** Ids of users which belong to this group */
    fun memberUsers(): Optional<List<String>> =
        Optional.ofNullable(memberUsers.getNullable("member_users"))

    /** Identifies the user who created the group */
    fun userId(): Optional<String> = Optional.ofNullable(userId.getNullable("user_id"))

    /** Unique identifier for the group */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /** Name of the group */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Unique id for the organization that the group belongs under
     *
     * It is forbidden to change the org after creating a group
     */
    @JsonProperty("org_id") @ExcludeMissing fun _orgId(): JsonField<String> = orgId

    /** Date of group creation */
    @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<OffsetDateTime> = created

    /** Date of group deletion, or null if the group is still active */
    @JsonProperty("deleted_at")
    @ExcludeMissing
    fun _deletedAt(): JsonField<OffsetDateTime> = deletedAt

    /** Textual description of the group */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Ids of the groups this group inherits from
     *
     * An inheriting group has all the users contained in its member groups, as well as all of their
     * inherited users
     */
    @JsonProperty("member_groups")
    @ExcludeMissing
    fun _memberGroups(): JsonField<List<String>> = memberGroups

    /** Ids of users which belong to this group */
    @JsonProperty("member_users")
    @ExcludeMissing
    fun _memberUsers(): JsonField<List<String>> = memberUsers

    /** Identifies the user who created the group */
    @JsonProperty("user_id") @ExcludeMissing fun _userId(): JsonField<String> = userId

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): Group = apply {
        if (validated) {
            return@apply
        }

        id()
        name()
        orgId()
        created()
        deletedAt()
        description()
        memberGroups()
        memberUsers()
        userId()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [Group].
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

    /** A builder for [Group]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var orgId: JsonField<String>? = null
        private var created: JsonField<OffsetDateTime> = JsonMissing.of()
        private var deletedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var memberGroups: JsonField<MutableList<String>>? = null
        private var memberUsers: JsonField<MutableList<String>>? = null
        private var userId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(group: Group) = apply {
            id = group.id
            name = group.name
            orgId = group.orgId
            created = group.created
            deletedAt = group.deletedAt
            description = group.description
            memberGroups = group.memberGroups.map { it.toMutableList() }
            memberUsers = group.memberUsers.map { it.toMutableList() }
            userId = group.userId
            additionalProperties = group.additionalProperties.toMutableMap()
        }

        /** Unique identifier for the group */
        fun id(id: String) = id(JsonField.of(id))

        /** Unique identifier for the group */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Name of the group */
        fun name(name: String) = name(JsonField.of(name))

        /** Name of the group */
        fun name(name: JsonField<String>) = apply { this.name = name }

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
        fun orgId(orgId: JsonField<String>) = apply { this.orgId = orgId }

        /** Date of group creation */
        fun created(created: OffsetDateTime?) = created(JsonField.ofNullable(created))

        /** Date of group creation */
        fun created(created: Optional<OffsetDateTime>) = created(created.getOrNull())

        /** Date of group creation */
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /** Date of group deletion, or null if the group is still active */
        fun deletedAt(deletedAt: OffsetDateTime?) = deletedAt(JsonField.ofNullable(deletedAt))

        /** Date of group deletion, or null if the group is still active */
        fun deletedAt(deletedAt: Optional<OffsetDateTime>) = deletedAt(deletedAt.getOrNull())

        /** Date of group deletion, or null if the group is still active */
        fun deletedAt(deletedAt: JsonField<OffsetDateTime>) = apply { this.deletedAt = deletedAt }

        /** Textual description of the group */
        fun description(description: String?) = description(JsonField.ofNullable(description))

        /** Textual description of the group */
        fun description(description: Optional<String>) = description(description.getOrNull())

        /** Textual description of the group */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /**
         * Ids of the groups this group inherits from
         *
         * An inheriting group has all the users contained in its member groups, as well as all of
         * their inherited users
         */
        fun memberGroups(memberGroups: List<String>?) =
            memberGroups(JsonField.ofNullable(memberGroups))

        /**
         * Ids of the groups this group inherits from
         *
         * An inheriting group has all the users contained in its member groups, as well as all of
         * their inherited users
         */
        fun memberGroups(memberGroups: Optional<List<String>>) =
            memberGroups(memberGroups.getOrNull())

        /**
         * Ids of the groups this group inherits from
         *
         * An inheriting group has all the users contained in its member groups, as well as all of
         * their inherited users
         */
        fun memberGroups(memberGroups: JsonField<List<String>>) = apply {
            this.memberGroups = memberGroups.map { it.toMutableList() }
        }

        /**
         * Ids of the groups this group inherits from
         *
         * An inheriting group has all the users contained in its member groups, as well as all of
         * their inherited users
         */
        fun addMemberGroup(memberGroup: String) = apply {
            memberGroups =
                (memberGroups ?: JsonField.of(mutableListOf())).also {
                    checkKnown("memberGroups", it).add(memberGroup)
                }
        }

        /** Ids of users which belong to this group */
        fun memberUsers(memberUsers: List<String>?) = memberUsers(JsonField.ofNullable(memberUsers))

        /** Ids of users which belong to this group */
        fun memberUsers(memberUsers: Optional<List<String>>) = memberUsers(memberUsers.getOrNull())

        /** Ids of users which belong to this group */
        fun memberUsers(memberUsers: JsonField<List<String>>) = apply {
            this.memberUsers = memberUsers.map { it.toMutableList() }
        }

        /** Ids of users which belong to this group */
        fun addMemberUser(memberUser: String) = apply {
            memberUsers =
                (memberUsers ?: JsonField.of(mutableListOf())).also {
                    checkKnown("memberUsers", it).add(memberUser)
                }
        }

        /** Identifies the user who created the group */
        fun userId(userId: String?) = userId(JsonField.ofNullable(userId))

        /** Identifies the user who created the group */
        fun userId(userId: Optional<String>) = userId(userId.getOrNull())

        /** Identifies the user who created the group */
        fun userId(userId: JsonField<String>) = apply { this.userId = userId }

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

        fun build(): Group =
            Group(
                checkRequired("id", id),
                checkRequired("name", name),
                checkRequired("orgId", orgId),
                created,
                deletedAt,
                description,
                (memberGroups ?: JsonMissing.of()).map { it.toImmutable() },
                (memberUsers ?: JsonMissing.of()).map { it.toImmutable() },
                userId,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Group && id == other.id && name == other.name && orgId == other.orgId && created == other.created && deletedAt == other.deletedAt && description == other.description && memberGroups == other.memberGroups && memberUsers == other.memberUsers && userId == other.userId && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, name, orgId, created, deletedAt, description, memberGroups, memberUsers, userId, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Group{id=$id, name=$name, orgId=$orgId, created=$created, deletedAt=$deletedAt, description=$description, memberGroups=$memberGroups, memberUsers=$memberUsers, userId=$userId, additionalProperties=$additionalProperties}"
}
