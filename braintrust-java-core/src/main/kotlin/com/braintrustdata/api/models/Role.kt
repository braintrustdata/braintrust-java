// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.Enum
import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.toUnmodifiable
import com.braintrustdata.api.errors.BraintrustInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

/**
 * A role is a collection of permissions which can be granted as part of an ACL
 *
 * Roles can consist of individual permissions, as well as a set of roles they inherit from
 */
@JsonDeserialize(builder = Role.Builder::class)
@NoAutoDetect
class Role
private constructor(
    private val id: JsonField<String>,
    private val orgId: JsonField<String>,
    private val userId: JsonField<String>,
    private val created: JsonField<OffsetDateTime>,
    private val name: JsonField<String>,
    private val description: JsonField<String>,
    private val deletedAt: JsonField<OffsetDateTime>,
    private val memberPermissions: JsonField<List<MemberPermission?>>,
    private val memberRoles: JsonField<List<String>>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** Unique identifier for the role */
    fun id(): String = id.getRequired("id")

    /**
     * Unique id for the organization that the role belongs under
     *
     * A null org_id indicates a system role, which may be assigned to anybody and inherited by any
     * other role, but cannot be edited.
     *
     * It is forbidden to change the org after creating a role
     */
    fun orgId(): Optional<String> = Optional.ofNullable(orgId.getNullable("org_id"))

    /** Identifies the user who created the role */
    fun userId(): Optional<String> = Optional.ofNullable(userId.getNullable("user_id"))

    /** Date of role creation */
    fun created(): Optional<OffsetDateTime> = Optional.ofNullable(created.getNullable("created"))

    /** Name of the role */
    fun name(): String = name.getRequired("name")

    /** Textual description of the role */
    fun description(): Optional<String> =
        Optional.ofNullable(description.getNullable("description"))

    /** Date of role deletion, or null if the role is still active */
    fun deletedAt(): Optional<OffsetDateTime> =
        Optional.ofNullable(deletedAt.getNullable("deleted_at"))

    /** Permissions which belong to this role */
    fun memberPermissions(): Optional<List<MemberPermission?>> =
        Optional.ofNullable(memberPermissions.getNullable("member_permissions"))

    /**
     * Ids of the roles this role inherits from
     *
     * An inheriting role has all the permissions contained in its member roles, as well as all of
     * their inherited permissions
     */
    fun memberRoles(): Optional<List<String>> =
        Optional.ofNullable(memberRoles.getNullable("member_roles"))

    /** Unique identifier for the role */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /**
     * Unique id for the organization that the role belongs under
     *
     * A null org_id indicates a system role, which may be assigned to anybody and inherited by any
     * other role, but cannot be edited.
     *
     * It is forbidden to change the org after creating a role
     */
    @JsonProperty("org_id") @ExcludeMissing fun _orgId() = orgId

    /** Identifies the user who created the role */
    @JsonProperty("user_id") @ExcludeMissing fun _userId() = userId

    /** Date of role creation */
    @JsonProperty("created") @ExcludeMissing fun _created() = created

    /** Name of the role */
    @JsonProperty("name") @ExcludeMissing fun _name() = name

    /** Textual description of the role */
    @JsonProperty("description") @ExcludeMissing fun _description() = description

    /** Date of role deletion, or null if the role is still active */
    @JsonProperty("deleted_at") @ExcludeMissing fun _deletedAt() = deletedAt

    /** Permissions which belong to this role */
    @JsonProperty("member_permissions") @ExcludeMissing fun _memberPermissions() = memberPermissions

    /**
     * Ids of the roles this role inherits from
     *
     * An inheriting role has all the permissions contained in its member roles, as well as all of
     * their inherited permissions
     */
    @JsonProperty("member_roles") @ExcludeMissing fun _memberRoles() = memberRoles

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): Role = apply {
        if (!validated) {
            id()
            orgId()
            userId()
            created()
            name()
            description()
            deletedAt()
            memberPermissions()
            memberRoles()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Role &&
            this.id == other.id &&
            this.orgId == other.orgId &&
            this.userId == other.userId &&
            this.created == other.created &&
            this.name == other.name &&
            this.description == other.description &&
            this.deletedAt == other.deletedAt &&
            this.memberPermissions == other.memberPermissions &&
            this.memberRoles == other.memberRoles &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    id,
                    orgId,
                    userId,
                    created,
                    name,
                    description,
                    deletedAt,
                    memberPermissions,
                    memberRoles,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "Role{id=$id, orgId=$orgId, userId=$userId, created=$created, name=$name, description=$description, deletedAt=$deletedAt, memberPermissions=$memberPermissions, memberRoles=$memberRoles, additionalProperties=$additionalProperties}"

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
        private var memberPermissions: JsonField<List<MemberPermission?>> = JsonMissing.of()
        private var memberRoles: JsonField<List<String>> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(role: Role) = apply {
            this.id = role.id
            this.orgId = role.orgId
            this.userId = role.userId
            this.created = role.created
            this.name = role.name
            this.description = role.description
            this.deletedAt = role.deletedAt
            this.memberPermissions = role.memberPermissions
            this.memberRoles = role.memberRoles
            additionalProperties(role.additionalProperties)
        }

        /** Unique identifier for the role */
        fun id(id: String) = id(JsonField.of(id))

        /** Unique identifier for the role */
        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * Unique id for the organization that the role belongs under
         *
         * A null org_id indicates a system role, which may be assigned to anybody and inherited by
         * any other role, but cannot be edited.
         *
         * It is forbidden to change the org after creating a role
         */
        fun orgId(orgId: String) = orgId(JsonField.of(orgId))

        /**
         * Unique id for the organization that the role belongs under
         *
         * A null org_id indicates a system role, which may be assigned to anybody and inherited by
         * any other role, but cannot be edited.
         *
         * It is forbidden to change the org after creating a role
         */
        @JsonProperty("org_id")
        @ExcludeMissing
        fun orgId(orgId: JsonField<String>) = apply { this.orgId = orgId }

        /** Identifies the user who created the role */
        fun userId(userId: String) = userId(JsonField.of(userId))

        /** Identifies the user who created the role */
        @JsonProperty("user_id")
        @ExcludeMissing
        fun userId(userId: JsonField<String>) = apply { this.userId = userId }

        /** Date of role creation */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /** Date of role creation */
        @JsonProperty("created")
        @ExcludeMissing
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /** Name of the role */
        fun name(name: String) = name(JsonField.of(name))

        /** Name of the role */
        @JsonProperty("name")
        @ExcludeMissing
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Textual description of the role */
        fun description(description: String) = description(JsonField.of(description))

        /** Textual description of the role */
        @JsonProperty("description")
        @ExcludeMissing
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** Date of role deletion, or null if the role is still active */
        fun deletedAt(deletedAt: OffsetDateTime) = deletedAt(JsonField.of(deletedAt))

        /** Date of role deletion, or null if the role is still active */
        @JsonProperty("deleted_at")
        @ExcludeMissing
        fun deletedAt(deletedAt: JsonField<OffsetDateTime>) = apply { this.deletedAt = deletedAt }

        /** Permissions which belong to this role */
        fun memberPermissions(memberPermissions: List<MemberPermission?>) =
            memberPermissions(JsonField.of(memberPermissions))

        /** Permissions which belong to this role */
        @JsonProperty("member_permissions")
        @ExcludeMissing
        fun memberPermissions(memberPermissions: JsonField<List<MemberPermission?>>) = apply {
            this.memberPermissions = memberPermissions
        }

        /**
         * Ids of the roles this role inherits from
         *
         * An inheriting role has all the permissions contained in its member roles, as well as all
         * of their inherited permissions
         */
        fun memberRoles(memberRoles: List<String>) = memberRoles(JsonField.of(memberRoles))

        /**
         * Ids of the roles this role inherits from
         *
         * An inheriting role has all the permissions contained in its member roles, as well as all
         * of their inherited permissions
         */
        @JsonProperty("member_roles")
        @ExcludeMissing
        fun memberRoles(memberRoles: JsonField<List<String>>) = apply {
            this.memberRoles = memberRoles
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

        fun build(): Role =
            Role(
                id,
                orgId,
                userId,
                created,
                name,
                description,
                deletedAt,
                memberPermissions.map { it.toUnmodifiable() },
                memberRoles.map { it.toUnmodifiable() },
                additionalProperties.toUnmodifiable(),
            )
    }

    class MemberPermission
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is MemberPermission && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val CREATE = MemberPermission(JsonField.of("create"))

            @JvmField val READ = MemberPermission(JsonField.of("read"))

            @JvmField val UPDATE = MemberPermission(JsonField.of("update"))

            @JvmField val DELETE = MemberPermission(JsonField.of("delete"))

            @JvmField val CREATE_ACLS = MemberPermission(JsonField.of("create_acls"))

            @JvmField val READ_ACLS = MemberPermission(JsonField.of("read_acls"))

            @JvmField val UPDATE_ACLS = MemberPermission(JsonField.of("update_acls"))

            @JvmField val DELETE_ACLS = MemberPermission(JsonField.of("delete_acls"))

            @JvmStatic fun of(value: String) = MemberPermission(JsonField.of(value))
        }

        enum class Known {
            CREATE,
            READ,
            UPDATE,
            DELETE,
            CREATE_ACLS,
            READ_ACLS,
            UPDATE_ACLS,
            DELETE_ACLS,
        }

        enum class Value {
            CREATE,
            READ,
            UPDATE,
            DELETE,
            CREATE_ACLS,
            READ_ACLS,
            UPDATE_ACLS,
            DELETE_ACLS,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                CREATE -> Value.CREATE
                READ -> Value.READ
                UPDATE -> Value.UPDATE
                DELETE -> Value.DELETE
                CREATE_ACLS -> Value.CREATE_ACLS
                READ_ACLS -> Value.READ_ACLS
                UPDATE_ACLS -> Value.UPDATE_ACLS
                DELETE_ACLS -> Value.DELETE_ACLS
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                CREATE -> Known.CREATE
                READ -> Known.READ
                UPDATE -> Known.UPDATE
                DELETE -> Known.DELETE
                CREATE_ACLS -> Known.CREATE_ACLS
                READ_ACLS -> Known.READ_ACLS
                UPDATE_ACLS -> Known.UPDATE_ACLS
                DELETE_ACLS -> Known.DELETE_ACLS
                else -> throw BraintrustInvalidDataException("Unknown MemberPermission: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
