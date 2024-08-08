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

@JsonDeserialize(builder = PatchRole.Builder::class)
@NoAutoDetect
class PatchRole
private constructor(
    private val description: JsonField<String>,
    private val name: JsonField<String>,
    private val addMemberPermissions: JsonField<List<AddMemberPermission>>,
    private val removeMemberPermissions: JsonField<List<RemoveMemberPermission>>,
    private val addMemberRoles: JsonField<List<String>>,
    private val removeMemberRoles: JsonField<List<String>>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** Textual description of the role */
    fun description(): Optional<String> =
        Optional.ofNullable(description.getNullable("description"))

    /** Name of the role */
    fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

    /** A list of permissions to add to the role */
    fun addMemberPermissions(): Optional<List<AddMemberPermission>> =
        Optional.ofNullable(addMemberPermissions.getNullable("add_member_permissions"))

    /** A list of permissions to remove from the role */
    fun removeMemberPermissions(): Optional<List<RemoveMemberPermission>> =
        Optional.ofNullable(removeMemberPermissions.getNullable("remove_member_permissions"))

    /** A list of role IDs to add to the role's inheriting-from set */
    fun addMemberRoles(): Optional<List<String>> =
        Optional.ofNullable(addMemberRoles.getNullable("add_member_roles"))

    /** A list of role IDs to remove from the role's inheriting-from set */
    fun removeMemberRoles(): Optional<List<String>> =
        Optional.ofNullable(removeMemberRoles.getNullable("remove_member_roles"))

    /** Textual description of the role */
    @JsonProperty("description") @ExcludeMissing fun _description() = description

    /** Name of the role */
    @JsonProperty("name") @ExcludeMissing fun _name() = name

    /** A list of permissions to add to the role */
    @JsonProperty("add_member_permissions")
    @ExcludeMissing
    fun _addMemberPermissions() = addMemberPermissions

    /** A list of permissions to remove from the role */
    @JsonProperty("remove_member_permissions")
    @ExcludeMissing
    fun _removeMemberPermissions() = removeMemberPermissions

    /** A list of role IDs to add to the role's inheriting-from set */
    @JsonProperty("add_member_roles") @ExcludeMissing fun _addMemberRoles() = addMemberRoles

    /** A list of role IDs to remove from the role's inheriting-from set */
    @JsonProperty("remove_member_roles")
    @ExcludeMissing
    fun _removeMemberRoles() = removeMemberRoles

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): PatchRole = apply {
        if (!validated) {
            description()
            name()
            addMemberPermissions().map { it.forEach { it.validate() } }
            removeMemberPermissions().map { it.forEach { it.validate() } }
            addMemberRoles()
            removeMemberRoles()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PatchRole &&
            this.description == other.description &&
            this.name == other.name &&
            this.addMemberPermissions == other.addMemberPermissions &&
            this.removeMemberPermissions == other.removeMemberPermissions &&
            this.addMemberRoles == other.addMemberRoles &&
            this.removeMemberRoles == other.removeMemberRoles &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    description,
                    name,
                    addMemberPermissions,
                    removeMemberPermissions,
                    addMemberRoles,
                    removeMemberRoles,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "PatchRole{description=$description, name=$name, addMemberPermissions=$addMemberPermissions, removeMemberPermissions=$removeMemberPermissions, addMemberRoles=$addMemberRoles, removeMemberRoles=$removeMemberRoles, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var description: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var addMemberPermissions: JsonField<List<AddMemberPermission>> = JsonMissing.of()
        private var removeMemberPermissions: JsonField<List<RemoveMemberPermission>> =
            JsonMissing.of()
        private var addMemberRoles: JsonField<List<String>> = JsonMissing.of()
        private var removeMemberRoles: JsonField<List<String>> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(patchRole: PatchRole) = apply {
            this.description = patchRole.description
            this.name = patchRole.name
            this.addMemberPermissions = patchRole.addMemberPermissions
            this.removeMemberPermissions = patchRole.removeMemberPermissions
            this.addMemberRoles = patchRole.addMemberRoles
            this.removeMemberRoles = patchRole.removeMemberRoles
            additionalProperties(patchRole.additionalProperties)
        }

        /** Textual description of the role */
        fun description(description: String) = description(JsonField.of(description))

        /** Textual description of the role */
        @JsonProperty("description")
        @ExcludeMissing
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** Name of the role */
        fun name(name: String) = name(JsonField.of(name))

        /** Name of the role */
        @JsonProperty("name")
        @ExcludeMissing
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** A list of permissions to add to the role */
        fun addMemberPermissions(addMemberPermissions: List<AddMemberPermission>) =
            addMemberPermissions(JsonField.of(addMemberPermissions))

        /** A list of permissions to add to the role */
        @JsonProperty("add_member_permissions")
        @ExcludeMissing
        fun addMemberPermissions(addMemberPermissions: JsonField<List<AddMemberPermission>>) =
            apply {
                this.addMemberPermissions = addMemberPermissions
            }

        /** A list of permissions to remove from the role */
        fun removeMemberPermissions(removeMemberPermissions: List<RemoveMemberPermission>) =
            removeMemberPermissions(JsonField.of(removeMemberPermissions))

        /** A list of permissions to remove from the role */
        @JsonProperty("remove_member_permissions")
        @ExcludeMissing
        fun removeMemberPermissions(
            removeMemberPermissions: JsonField<List<RemoveMemberPermission>>
        ) = apply { this.removeMemberPermissions = removeMemberPermissions }

        /** A list of role IDs to add to the role's inheriting-from set */
        fun addMemberRoles(addMemberRoles: List<String>) =
            addMemberRoles(JsonField.of(addMemberRoles))

        /** A list of role IDs to add to the role's inheriting-from set */
        @JsonProperty("add_member_roles")
        @ExcludeMissing
        fun addMemberRoles(addMemberRoles: JsonField<List<String>>) = apply {
            this.addMemberRoles = addMemberRoles
        }

        /** A list of role IDs to remove from the role's inheriting-from set */
        fun removeMemberRoles(removeMemberRoles: List<String>) =
            removeMemberRoles(JsonField.of(removeMemberRoles))

        /** A list of role IDs to remove from the role's inheriting-from set */
        @JsonProperty("remove_member_roles")
        @ExcludeMissing
        fun removeMemberRoles(removeMemberRoles: JsonField<List<String>>) = apply {
            this.removeMemberRoles = removeMemberRoles
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

        fun build(): PatchRole =
            PatchRole(
                description,
                name,
                addMemberPermissions.map { it.toUnmodifiable() },
                removeMemberPermissions.map { it.toUnmodifiable() },
                addMemberRoles.map { it.toUnmodifiable() },
                removeMemberRoles.map { it.toUnmodifiable() },
                additionalProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(builder = AddMemberPermission.Builder::class)
    @NoAutoDetect
    class AddMemberPermission
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

        fun validate(): AddMemberPermission = apply {
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

            return other is AddMemberPermission &&
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
            "AddMemberPermission{permission=$permission, restrictObjectType=$restrictObjectType, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var permission: JsonField<Permission> = JsonMissing.of()
            private var restrictObjectType: JsonField<RestrictObjectType> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(addMemberPermission: AddMemberPermission) = apply {
                this.permission = addMemberPermission.permission
                this.restrictObjectType = addMemberPermission.restrictObjectType
                additionalProperties(addMemberPermission.additionalProperties)
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

            fun build(): AddMemberPermission =
                AddMemberPermission(
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

    @JsonDeserialize(builder = RemoveMemberPermission.Builder::class)
    @NoAutoDetect
    class RemoveMemberPermission
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

        fun validate(): RemoveMemberPermission = apply {
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

            return other is RemoveMemberPermission &&
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
            "RemoveMemberPermission{permission=$permission, restrictObjectType=$restrictObjectType, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var permission: JsonField<Permission> = JsonMissing.of()
            private var restrictObjectType: JsonField<RestrictObjectType> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(removeMemberPermission: RemoveMemberPermission) = apply {
                this.permission = removeMemberPermission.permission
                this.restrictObjectType = removeMemberPermission.restrictObjectType
                additionalProperties(removeMemberPermission.additionalProperties)
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

            fun build(): RemoveMemberPermission =
                RemoveMemberPermission(
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
