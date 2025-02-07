// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.Enum
import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.checkRequired
import com.braintrustdata.api.core.immutableEmptyMap
import com.braintrustdata.api.core.toImmutable
import com.braintrustdata.api.errors.BraintrustInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

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
        fun created(created: Optional<OffsetDateTime>) = created(created.orElse(null))

        /** Date of role creation */
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /** Date of role deletion, or null if the role is still active */
        fun deletedAt(deletedAt: OffsetDateTime?) = deletedAt(JsonField.ofNullable(deletedAt))

        /** Date of role deletion, or null if the role is still active */
        fun deletedAt(deletedAt: Optional<OffsetDateTime>) = deletedAt(deletedAt.orElse(null))

        /** Date of role deletion, or null if the role is still active */
        fun deletedAt(deletedAt: JsonField<OffsetDateTime>) = apply { this.deletedAt = deletedAt }

        /** Textual description of the role */
        fun description(description: String?) = description(JsonField.ofNullable(description))

        /** Textual description of the role */
        fun description(description: Optional<String>) = description(description.orElse(null))

        /** Textual description of the role */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** (permission, restrict_object_type) tuples which belong to this role */
        fun memberPermissions(memberPermissions: List<MemberPermission>?) =
            memberPermissions(JsonField.ofNullable(memberPermissions))

        /** (permission, restrict_object_type) tuples which belong to this role */
        fun memberPermissions(memberPermissions: Optional<List<MemberPermission>>) =
            memberPermissions(memberPermissions.orElse(null))

        /** (permission, restrict_object_type) tuples which belong to this role */
        fun memberPermissions(memberPermissions: JsonField<List<MemberPermission>>) = apply {
            this.memberPermissions = memberPermissions.map { it.toMutableList() }
        }

        /** (permission, restrict_object_type) tuples which belong to this role */
        fun addMemberPermission(memberPermission: MemberPermission) = apply {
            memberPermissions =
                (memberPermissions ?: JsonField.of(mutableListOf())).apply {
                    asKnown()
                        .orElseThrow {
                            IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            )
                        }
                        .add(memberPermission)
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
        fun memberRoles(memberRoles: Optional<List<String>>) = memberRoles(memberRoles.orElse(null))

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
                (memberRoles ?: JsonField.of(mutableListOf())).apply {
                    asKnown()
                        .orElseThrow {
                            IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            )
                        }
                        .add(memberRole)
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
        fun orgId(orgId: Optional<String>) = orgId(orgId.orElse(null))

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
        fun userId(userId: Optional<String>) = userId(userId.orElse(null))

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
        private val restrictObjectType: JsonField<RestrictObjectType> = JsonMissing.of(),
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
        fun restrictObjectType(): Optional<RestrictObjectType> =
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
        fun _restrictObjectType(): JsonField<RestrictObjectType> = restrictObjectType

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

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [MemberPermission]. */
        class Builder internal constructor() {

            private var permission: JsonField<Permission>? = null
            private var restrictObjectType: JsonField<RestrictObjectType> = JsonMissing.of()
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
            fun restrictObjectType(restrictObjectType: RestrictObjectType?) =
                restrictObjectType(JsonField.ofNullable(restrictObjectType))

            /** The object type that the ACL applies to */
            fun restrictObjectType(restrictObjectType: Optional<RestrictObjectType>) =
                restrictObjectType(restrictObjectType.orElse(null))

            /** The object type that the ACL applies to */
            fun restrictObjectType(restrictObjectType: JsonField<RestrictObjectType>) = apply {
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

        /**
         * Each permission permits a certain type of operation on an object in the system
         *
         * Permissions can be assigned to to objects on an individual basis, or grouped into roles
         */
        class Permission
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val CREATE = of("create")

                @JvmField val READ = of("read")

                @JvmField val UPDATE = of("update")

                @JvmField val DELETE = of("delete")

                @JvmField val CREATE_ACLS = of("create_acls")

                @JvmField val READ_ACLS = of("read_acls")

                @JvmField val UPDATE_ACLS = of("update_acls")

                @JvmField val DELETE_ACLS = of("delete_acls")

                @JvmStatic fun of(value: String) = Permission(JsonField.of(value))
            }

            /** An enum containing [Permission]'s known values. */
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

            /**
             * An enum containing [Permission]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Permission] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                CREATE,
                READ,
                UPDATE,
                DELETE,
                CREATE_ACLS,
                READ_ACLS,
                UPDATE_ACLS,
                DELETE_ACLS,
                /**
                 * An enum member indicating that [Permission] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
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

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws BraintrustInvalidDataException if this class instance's value is a not a
             *   known member.
             */
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
                    else -> throw BraintrustInvalidDataException("Unknown Permission: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Permission && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** The object type that the ACL applies to */
        class RestrictObjectType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val ORGANIZATION = of("organization")

                @JvmField val PROJECT = of("project")

                @JvmField val EXPERIMENT = of("experiment")

                @JvmField val DATASET = of("dataset")

                @JvmField val PROMPT = of("prompt")

                @JvmField val PROMPT_SESSION = of("prompt_session")

                @JvmField val GROUP = of("group")

                @JvmField val ROLE = of("role")

                @JvmField val ORG_MEMBER = of("org_member")

                @JvmField val PROJECT_LOG = of("project_log")

                @JvmField val ORG_PROJECT = of("org_project")

                @JvmStatic fun of(value: String) = RestrictObjectType(JsonField.of(value))
            }

            /** An enum containing [RestrictObjectType]'s known values. */
            enum class Known {
                ORGANIZATION,
                PROJECT,
                EXPERIMENT,
                DATASET,
                PROMPT,
                PROMPT_SESSION,
                GROUP,
                ROLE,
                ORG_MEMBER,
                PROJECT_LOG,
                ORG_PROJECT,
            }

            /**
             * An enum containing [RestrictObjectType]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [RestrictObjectType] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ORGANIZATION,
                PROJECT,
                EXPERIMENT,
                DATASET,
                PROMPT,
                PROMPT_SESSION,
                GROUP,
                ROLE,
                ORG_MEMBER,
                PROJECT_LOG,
                ORG_PROJECT,
                /**
                 * An enum member indicating that [RestrictObjectType] was instantiated with an
                 * unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    ORGANIZATION -> Value.ORGANIZATION
                    PROJECT -> Value.PROJECT
                    EXPERIMENT -> Value.EXPERIMENT
                    DATASET -> Value.DATASET
                    PROMPT -> Value.PROMPT
                    PROMPT_SESSION -> Value.PROMPT_SESSION
                    GROUP -> Value.GROUP
                    ROLE -> Value.ROLE
                    ORG_MEMBER -> Value.ORG_MEMBER
                    PROJECT_LOG -> Value.PROJECT_LOG
                    ORG_PROJECT -> Value.ORG_PROJECT
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws BraintrustInvalidDataException if this class instance's value is a not a
             *   known member.
             */
            fun known(): Known =
                when (this) {
                    ORGANIZATION -> Known.ORGANIZATION
                    PROJECT -> Known.PROJECT
                    EXPERIMENT -> Known.EXPERIMENT
                    DATASET -> Known.DATASET
                    PROMPT -> Known.PROMPT
                    PROMPT_SESSION -> Known.PROMPT_SESSION
                    GROUP -> Known.GROUP
                    ROLE -> Known.ROLE
                    ORG_MEMBER -> Known.ORG_MEMBER
                    PROJECT_LOG -> Known.PROJECT_LOG
                    ORG_PROJECT -> Known.ORG_PROJECT
                    else ->
                        throw BraintrustInvalidDataException("Unknown RestrictObjectType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is RestrictObjectType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
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
