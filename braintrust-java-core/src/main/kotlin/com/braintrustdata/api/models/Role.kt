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
 * A role is a collection of permissions which can be granted as part of an ACL
 *
 * Roles can consist of individual permissions, as well as a set of roles they inherit from
 */
@NoAutoDetect
class Role
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
    @JsonProperty("created")
    @ExcludeMissing
    private val created: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("deleted_at")
    @ExcludeMissing
    private val deletedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("description")
    @ExcludeMissing
    private val description: JsonField<String> = JsonMissing.of(),
    @JsonProperty("member_permissions")
    @ExcludeMissing
    private val memberPermissions: JsonField<List<MemberPermission>> = JsonMissing.of(),
    @JsonProperty("member_roles")
    @ExcludeMissing
    private val memberRoles: JsonField<List<String>> = JsonMissing.of(),
    @JsonProperty("org_id") @ExcludeMissing private val orgId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("user_id")
    @ExcludeMissing
    private val userId: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** Unique identifier for the role */
    fun id(): String = id.getRequired("id")

    /** Name of the role */
    fun name(): String = name.getRequired("name")

    /** Date of role creation */
    fun created(): Optional<OffsetDateTime> = Optional.ofNullable(created.getNullable("created"))

    /** Date of role deletion, or null if the role is still active */
    fun deletedAt(): Optional<OffsetDateTime> =
        Optional.ofNullable(deletedAt.getNullable("deleted_at"))

    /** Textual description of the role */
    fun description(): Optional<String> =
        Optional.ofNullable(description.getNullable("description"))

    /** (permission, restrict_object_type) tuples which belong to this role */
    fun memberPermissions(): Optional<List<MemberPermission>> =
        Optional.ofNullable(memberPermissions.getNullable("member_permissions"))

    /**
     * Ids of the roles this role inherits from
     *
     * An inheriting role has all the permissions contained in its member roles, as well as all of
     * their inherited permissions
     */
    fun memberRoles(): Optional<List<String>> =
        Optional.ofNullable(memberRoles.getNullable("member_roles"))

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

    /** Unique identifier for the role */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /** Name of the role */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /** Date of role creation */
    @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<OffsetDateTime> = created

    /** Date of role deletion, or null if the role is still active */
    @JsonProperty("deleted_at")
    @ExcludeMissing
    fun _deletedAt(): JsonField<OffsetDateTime> = deletedAt

    /** Textual description of the role */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /** (permission, restrict_object_type) tuples which belong to this role */
    @JsonProperty("member_permissions")
    @ExcludeMissing
    fun _memberPermissions(): JsonField<List<MemberPermission>> = memberPermissions

    /**
     * Ids of the roles this role inherits from
     *
     * An inheriting role has all the permissions contained in its member roles, as well as all of
     * their inherited permissions
     */
    @JsonProperty("member_roles")
    @ExcludeMissing
    fun _memberRoles(): JsonField<List<String>> = memberRoles

    /**
     * Unique id for the organization that the role belongs under
     *
     * A null org_id indicates a system role, which may be assigned to anybody and inherited by any
     * other role, but cannot be edited.
     *
     * It is forbidden to change the org after creating a role
     */
    @JsonProperty("org_id") @ExcludeMissing fun _orgId(): JsonField<String> = orgId

    /** Identifies the user who created the role */
    @JsonProperty("user_id") @ExcludeMissing fun _userId(): JsonField<String> = userId

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): Role = apply {
        if (validated) {
            return@apply
        }

        id()
        name()
        created()
        deletedAt()
        description()
        memberPermissions().ifPresent { it.forEach { it.validate() } }
        memberRoles()
        orgId()
        userId()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [Role].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .name()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Role]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var created: JsonField<OffsetDateTime> = JsonMissing.of()
        private var deletedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var memberPermissions: JsonField<MutableList<MemberPermission>>? = null
        private var memberRoles: JsonField<MutableList<String>>? = null
        private var orgId: JsonField<String> = JsonMissing.of()
        private var userId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(role: Role) = apply {
            id = role.id
            name = role.name
            created = role.created
            deletedAt = role.deletedAt
            description = role.description
            memberPermissions = role.memberPermissions.map { it.toMutableList() }
            memberRoles = role.memberRoles.map { it.toMutableList() }
            orgId = role.orgId
            userId = role.userId
            additionalProperties = role.additionalProperties.toMutableMap()
        }

        /** Unique identifier for the role */
        fun id(id: String) = id(JsonField.of(id))

        /** Unique identifier for the role */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Name of the role */
        fun name(name: String) = name(JsonField.of(name))

        /** Name of the role */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Date of role creation */
        fun created(created: OffsetDateTime?) = created(JsonField.ofNullable(created))

        /** Date of role creation */
        fun created(created: Optional<OffsetDateTime>) = created(created.getOrNull())

        /** Date of role creation */
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /** Date of role deletion, or null if the role is still active */
        fun deletedAt(deletedAt: OffsetDateTime?) = deletedAt(JsonField.ofNullable(deletedAt))

        /** Date of role deletion, or null if the role is still active */
        fun deletedAt(deletedAt: Optional<OffsetDateTime>) = deletedAt(deletedAt.getOrNull())

        /** Date of role deletion, or null if the role is still active */
        fun deletedAt(deletedAt: JsonField<OffsetDateTime>) = apply { this.deletedAt = deletedAt }

        /** Textual description of the role */
        fun description(description: String?) = description(JsonField.ofNullable(description))

        /** Textual description of the role */
        fun description(description: Optional<String>) = description(description.getOrNull())

        /** Textual description of the role */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** (permission, restrict_object_type) tuples which belong to this role */
        fun memberPermissions(memberPermissions: List<MemberPermission>?) =
            memberPermissions(JsonField.ofNullable(memberPermissions))

        /** (permission, restrict_object_type) tuples which belong to this role */
        fun memberPermissions(memberPermissions: Optional<List<MemberPermission>>) =
            memberPermissions(memberPermissions.getOrNull())

        /** (permission, restrict_object_type) tuples which belong to this role */
        fun memberPermissions(memberPermissions: JsonField<List<MemberPermission>>) = apply {
            this.memberPermissions = memberPermissions.map { it.toMutableList() }
        }

        /** (permission, restrict_object_type) tuples which belong to this role */
        fun addMemberPermission(memberPermission: MemberPermission) = apply {
            memberPermissions =
                (memberPermissions ?: JsonField.of(mutableListOf())).also {
                    checkKnown("memberPermissions", it).add(memberPermission)
                }
        }

        /**
         * Ids of the roles this role inherits from
         *
         * An inheriting role has all the permissions contained in its member roles, as well as all
         * of their inherited permissions
         */
        fun memberRoles(memberRoles: List<String>?) = memberRoles(JsonField.ofNullable(memberRoles))

        /**
         * Ids of the roles this role inherits from
         *
         * An inheriting role has all the permissions contained in its member roles, as well as all
         * of their inherited permissions
         */
        fun memberRoles(memberRoles: Optional<List<String>>) = memberRoles(memberRoles.getOrNull())

        /**
         * Ids of the roles this role inherits from
         *
         * An inheriting role has all the permissions contained in its member roles, as well as all
         * of their inherited permissions
         */
        fun memberRoles(memberRoles: JsonField<List<String>>) = apply {
            this.memberRoles = memberRoles.map { it.toMutableList() }
        }

        /**
         * Ids of the roles this role inherits from
         *
         * An inheriting role has all the permissions contained in its member roles, as well as all
         * of their inherited permissions
         */
        fun addMemberRole(memberRole: String) = apply {
            memberRoles =
                (memberRoles ?: JsonField.of(mutableListOf())).also {
                    checkKnown("memberRoles", it).add(memberRole)
                }
        }

        /**
         * Unique id for the organization that the role belongs under
         *
         * A null org_id indicates a system role, which may be assigned to anybody and inherited by
         * any other role, but cannot be edited.
         *
         * It is forbidden to change the org after creating a role
         */
        fun orgId(orgId: String?) = orgId(JsonField.ofNullable(orgId))

        /**
         * Unique id for the organization that the role belongs under
         *
         * A null org_id indicates a system role, which may be assigned to anybody and inherited by
         * any other role, but cannot be edited.
         *
         * It is forbidden to change the org after creating a role
         */
        fun orgId(orgId: Optional<String>) = orgId(orgId.getOrNull())

        /**
         * Unique id for the organization that the role belongs under
         *
         * A null org_id indicates a system role, which may be assigned to anybody and inherited by
         * any other role, but cannot be edited.
         *
         * It is forbidden to change the org after creating a role
         */
        fun orgId(orgId: JsonField<String>) = apply { this.orgId = orgId }

        /** Identifies the user who created the role */
        fun userId(userId: String?) = userId(JsonField.ofNullable(userId))

        /** Identifies the user who created the role */
        fun userId(userId: Optional<String>) = userId(userId.getOrNull())

        /** Identifies the user who created the role */
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

        fun build(): Role =
            Role(
                checkRequired("id", id),
                checkRequired("name", name),
                created,
                deletedAt,
                description,
                (memberPermissions ?: JsonMissing.of()).map { it.toImmutable() },
                (memberRoles ?: JsonMissing.of()).map { it.toImmutable() },
                orgId,
                userId,
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class MemberPermission
    @JsonCreator
    private constructor(
        @JsonProperty("permission")
        @ExcludeMissing
        private val permission: JsonField<Permission> = JsonMissing.of(),
        @JsonProperty("restrict_object_type")
        @ExcludeMissing
        private val restrictObjectType: JsonField<AclObjectType> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * Each permission permits a certain type of operation on an object in the system
         *
         * Permissions can be assigned to to objects on an individual basis, or grouped into roles
         */
        fun permission(): Permission = permission.getRequired("permission")

        /** The object type that the ACL applies to */
        fun restrictObjectType(): Optional<AclObjectType> =
            Optional.ofNullable(restrictObjectType.getNullable("restrict_object_type"))

        /**
         * Each permission permits a certain type of operation on an object in the system
         *
         * Permissions can be assigned to to objects on an individual basis, or grouped into roles
         */
        @JsonProperty("permission")
        @ExcludeMissing
        fun _permission(): JsonField<Permission> = permission

        /** The object type that the ACL applies to */
        @JsonProperty("restrict_object_type")
        @ExcludeMissing
        fun _restrictObjectType(): JsonField<AclObjectType> = restrictObjectType

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): MemberPermission = apply {
            if (validated) {
                return@apply
            }

            permission()
            restrictObjectType()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [MemberPermission].
             *
             * The following fields are required:
             * ```java
             * .permission()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [MemberPermission]. */
        class Builder internal constructor() {

            private var permission: JsonField<Permission>? = null
            private var restrictObjectType: JsonField<AclObjectType> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(memberPermission: MemberPermission) = apply {
                permission = memberPermission.permission
                restrictObjectType = memberPermission.restrictObjectType
                additionalProperties = memberPermission.additionalProperties.toMutableMap()
            }

            /**
             * Each permission permits a certain type of operation on an object in the system
             *
             * Permissions can be assigned to to objects on an individual basis, or grouped into
             * roles
             */
            fun permission(permission: Permission) = permission(JsonField.of(permission))

            /**
             * Each permission permits a certain type of operation on an object in the system
             *
             * Permissions can be assigned to to objects on an individual basis, or grouped into
             * roles
             */
            fun permission(permission: JsonField<Permission>) = apply {
                this.permission = permission
            }

            /** The object type that the ACL applies to */
            fun restrictObjectType(restrictObjectType: AclObjectType?) =
                restrictObjectType(JsonField.ofNullable(restrictObjectType))

            /** The object type that the ACL applies to */
            fun restrictObjectType(restrictObjectType: Optional<AclObjectType>) =
                restrictObjectType(restrictObjectType.getOrNull())

            /** The object type that the ACL applies to */
            fun restrictObjectType(restrictObjectType: JsonField<AclObjectType>) = apply {
                this.restrictObjectType = restrictObjectType
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

            fun build(): MemberPermission =
                MemberPermission(
                    checkRequired("permission", permission),
                    restrictObjectType,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is MemberPermission && permission == other.permission && restrictObjectType == other.restrictObjectType && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(permission, restrictObjectType, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "MemberPermission{permission=$permission, restrictObjectType=$restrictObjectType, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Role && id == other.id && name == other.name && created == other.created && deletedAt == other.deletedAt && description == other.description && memberPermissions == other.memberPermissions && memberRoles == other.memberRoles && orgId == other.orgId && userId == other.userId && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, name, created, deletedAt, description, memberPermissions, memberRoles, orgId, userId, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Role{id=$id, name=$name, created=$created, deletedAt=$deletedAt, description=$description, memberPermissions=$memberPermissions, memberRoles=$memberRoles, orgId=$orgId, userId=$userId, additionalProperties=$additionalProperties}"
}
