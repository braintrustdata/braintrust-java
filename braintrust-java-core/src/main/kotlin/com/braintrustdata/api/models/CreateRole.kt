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
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = CreateRole.Builder::class)
@NoAutoDetect
class CreateRole
private constructor(
    private val name: JsonField<String>,
    private val description: JsonField<String>,
    private val memberPermissions: JsonField<List<MemberPermission>>,
    private val memberRoles: JsonField<List<String>>,
    private val orgName: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** Name of the role */
    fun name(): String = name.getRequired("name")

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
     * For nearly all users, this parameter should be unnecessary. But in the rare case that your
     * API key belongs to multiple organizations, you may specify the name of the organization the
     * role belongs in.
     */
    fun orgName(): Optional<String> = Optional.ofNullable(orgName.getNullable("org_name"))

    /** Name of the role */
    @JsonProperty("name") @ExcludeMissing fun _name() = name

    /** Textual description of the role */
    @JsonProperty("description") @ExcludeMissing fun _description() = description

    /** (permission, restrict_object_type) tuples which belong to this role */
    @JsonProperty("member_permissions") @ExcludeMissing fun _memberPermissions() = memberPermissions

    /**
     * Ids of the roles this role inherits from
     *
     * An inheriting role has all the permissions contained in its member roles, as well as all of
     * their inherited permissions
     */
    @JsonProperty("member_roles") @ExcludeMissing fun _memberRoles() = memberRoles

    /**
     * For nearly all users, this parameter should be unnecessary. But in the rare case that your
     * API key belongs to multiple organizations, you may specify the name of the organization the
     * role belongs in.
     */
    @JsonProperty("org_name") @ExcludeMissing fun _orgName() = orgName

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): CreateRole = apply {
        if (!validated) {
            name()
            description()
            memberPermissions().map { it.forEach { it.validate() } }
            memberRoles()
            orgName()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CreateRole &&
            this.name == other.name &&
            this.description == other.description &&
            this.memberPermissions == other.memberPermissions &&
            this.memberRoles == other.memberRoles &&
            this.orgName == other.orgName &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    name,
                    description,
                    memberPermissions,
                    memberRoles,
                    orgName,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "CreateRole{name=$name, description=$description, memberPermissions=$memberPermissions, memberRoles=$memberRoles, orgName=$orgName, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var name: JsonField<String> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var memberPermissions: JsonField<List<MemberPermission>> = JsonMissing.of()
        private var memberRoles: JsonField<List<String>> = JsonMissing.of()
        private var orgName: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(createRole: CreateRole) = apply {
            this.name = createRole.name
            this.description = createRole.description
            this.memberPermissions = createRole.memberPermissions
            this.memberRoles = createRole.memberRoles
            this.orgName = createRole.orgName
            additionalProperties(createRole.additionalProperties)
        }

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

        /** (permission, restrict_object_type) tuples which belong to this role */
        fun memberPermissions(memberPermissions: List<MemberPermission>) =
            memberPermissions(JsonField.of(memberPermissions))

        /** (permission, restrict_object_type) tuples which belong to this role */
        @JsonProperty("member_permissions")
        @ExcludeMissing
        fun memberPermissions(memberPermissions: JsonField<List<MemberPermission>>) = apply {
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

        /**
         * For nearly all users, this parameter should be unnecessary. But in the rare case that
         * your API key belongs to multiple organizations, you may specify the name of the
         * organization the role belongs in.
         */
        fun orgName(orgName: String) = orgName(JsonField.of(orgName))

        /**
         * For nearly all users, this parameter should be unnecessary. But in the rare case that
         * your API key belongs to multiple organizations, you may specify the name of the
         * organization the role belongs in.
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

        fun build(): CreateRole =
            CreateRole(
                name,
                description,
                memberPermissions.map { it.toUnmodifiable() },
                memberRoles.map { it.toUnmodifiable() },
                orgName,
                additionalProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(builder = MemberPermission.Builder::class)
    @NoAutoDetect
    class MemberPermission
    private constructor(
        private val permission: JsonField<Permission>,
        private val restrictObjectType: JsonField<RestrictObjectType>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /**
         * Each permission permits a certain type of operation on an object in the system
         *
         * Permissions can be assigned to to objects on an individual basis, or grouped into roles
         */
        fun permission(): Optional<Permission> =
            Optional.ofNullable(permission.getNullable("permission"))

        /** The object type that the ACL applies to */
        fun restrictObjectType(): Optional<RestrictObjectType> =
            Optional.ofNullable(restrictObjectType.getNullable("restrict_object_type"))

        /**
         * Each permission permits a certain type of operation on an object in the system
         *
         * Permissions can be assigned to to objects on an individual basis, or grouped into roles
         */
        @JsonProperty("permission") @ExcludeMissing fun _permission() = permission

        /** The object type that the ACL applies to */
        @JsonProperty("restrict_object_type")
        @ExcludeMissing
        fun _restrictObjectType() = restrictObjectType

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): MemberPermission = apply {
            if (!validated) {
                permission()
                restrictObjectType()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is MemberPermission &&
                this.permission == other.permission &&
                this.restrictObjectType == other.restrictObjectType &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        permission,
                        restrictObjectType,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "MemberPermission{permission=$permission, restrictObjectType=$restrictObjectType, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var permission: JsonField<Permission> = JsonMissing.of()
            private var restrictObjectType: JsonField<RestrictObjectType> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(memberPermission: MemberPermission) = apply {
                this.permission = memberPermission.permission
                this.restrictObjectType = memberPermission.restrictObjectType
                additionalProperties(memberPermission.additionalProperties)
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
            @JsonProperty("permission")
            @ExcludeMissing
            fun permission(permission: JsonField<Permission>) = apply {
                this.permission = permission
            }

            /** The object type that the ACL applies to */
            fun restrictObjectType(restrictObjectType: RestrictObjectType) =
                restrictObjectType(JsonField.of(restrictObjectType))

            /** The object type that the ACL applies to */
            @JsonProperty("restrict_object_type")
            @ExcludeMissing
            fun restrictObjectType(restrictObjectType: JsonField<RestrictObjectType>) = apply {
                this.restrictObjectType = restrictObjectType
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

            fun build(): MemberPermission =
                MemberPermission(
                    permission,
                    restrictObjectType,
                    additionalProperties.toUnmodifiable(),
                )
        }

        class Permission
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Permission && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val CREATE = Permission(JsonField.of("create"))

                @JvmField val READ = Permission(JsonField.of("read"))

                @JvmField val UPDATE = Permission(JsonField.of("update"))

                @JvmField val DELETE = Permission(JsonField.of("delete"))

                @JvmField val CREATE_ACLS = Permission(JsonField.of("create_acls"))

                @JvmField val READ_ACLS = Permission(JsonField.of("read_acls"))

                @JvmField val UPDATE_ACLS = Permission(JsonField.of("update_acls"))

                @JvmField val DELETE_ACLS = Permission(JsonField.of("delete_acls"))

                @JvmStatic fun of(value: String) = Permission(JsonField.of(value))
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
                    else -> throw BraintrustInvalidDataException("Unknown Permission: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        class RestrictObjectType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is RestrictObjectType && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val ORGANIZATION = RestrictObjectType(JsonField.of("organization"))

                @JvmField val PROJECT = RestrictObjectType(JsonField.of("project"))

                @JvmField val EXPERIMENT = RestrictObjectType(JsonField.of("experiment"))

                @JvmField val DATASET = RestrictObjectType(JsonField.of("dataset"))

                @JvmField val PROMPT = RestrictObjectType(JsonField.of("prompt"))

                @JvmField val PROMPT_SESSION = RestrictObjectType(JsonField.of("prompt_session"))

                @JvmField val GROUP = RestrictObjectType(JsonField.of("group"))

                @JvmField val ROLE = RestrictObjectType(JsonField.of("role"))

                @JvmField val ORG_MEMBER = RestrictObjectType(JsonField.of("org_member"))

                @JvmField val PROJECT_LOG = RestrictObjectType(JsonField.of("project_log"))

                @JvmField val ORG_PROJECT = RestrictObjectType(JsonField.of("org_project"))

                @JvmStatic fun of(value: String) = RestrictObjectType(JsonField.of(value))
            }

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
                _UNKNOWN,
            }

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
        }
    }
}
