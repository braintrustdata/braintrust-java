// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.Enum
import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.http.Headers
import com.braintrustdata.api.core.http.QueryParams
import com.braintrustdata.api.core.toImmutable
import com.braintrustdata.api.errors.BraintrustInvalidDataException
import com.braintrustdata.api.models.*
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import java.util.Objects
import java.util.Optional

class RoleUpdateParams
constructor(
    private val roleId: String,
    private val addMemberPermissions: List<AddMemberPermission>?,
    private val addMemberRoles: List<String>?,
    private val description: String?,
    private val name: String?,
    private val removeMemberPermissions: List<RemoveMemberPermission>?,
    private val removeMemberRoles: List<String>?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun roleId(): String = roleId

    fun addMemberPermissions(): Optional<List<AddMemberPermission>> =
        Optional.ofNullable(addMemberPermissions)

    fun addMemberRoles(): Optional<List<String>> = Optional.ofNullable(addMemberRoles)

    fun description(): Optional<String> = Optional.ofNullable(description)

    fun name(): Optional<String> = Optional.ofNullable(name)

    fun removeMemberPermissions(): Optional<List<RemoveMemberPermission>> =
        Optional.ofNullable(removeMemberPermissions)

    fun removeMemberRoles(): Optional<List<String>> = Optional.ofNullable(removeMemberRoles)

    @JvmSynthetic
    internal fun getBody(): RoleUpdateBody {
        return RoleUpdateBody(
            addMemberPermissions,
            addMemberRoles,
            description,
            name,
            removeMemberPermissions,
            removeMemberRoles,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> roleId
            else -> ""
        }
    }

    @JsonDeserialize(builder = RoleUpdateBody.Builder::class)
    @NoAutoDetect
    class RoleUpdateBody
    internal constructor(
        private val addMemberPermissions: List<AddMemberPermission>?,
        private val addMemberRoles: List<String>?,
        private val description: String?,
        private val name: String?,
        private val removeMemberPermissions: List<RemoveMemberPermission>?,
        private val removeMemberRoles: List<String>?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** A list of permissions to add to the role */
        @JsonProperty("add_member_permissions")
        fun addMemberPermissions(): List<AddMemberPermission>? = addMemberPermissions

        /** A list of role IDs to add to the role's inheriting-from set */
        @JsonProperty("add_member_roles") fun addMemberRoles(): List<String>? = addMemberRoles

        /** Textual description of the role */
        @JsonProperty("description") fun description(): String? = description

        /** Name of the role */
        @JsonProperty("name") fun name(): String? = name

        /** A list of permissions to remove from the role */
        @JsonProperty("remove_member_permissions")
        fun removeMemberPermissions(): List<RemoveMemberPermission>? = removeMemberPermissions

        /** A list of role IDs to remove from the role's inheriting-from set */
        @JsonProperty("remove_member_roles")
        fun removeMemberRoles(): List<String>? = removeMemberRoles

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var addMemberPermissions: List<AddMemberPermission>? = null
            private var addMemberRoles: List<String>? = null
            private var description: String? = null
            private var name: String? = null
            private var removeMemberPermissions: List<RemoveMemberPermission>? = null
            private var removeMemberRoles: List<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(roleUpdateBody: RoleUpdateBody) = apply {
                this.addMemberPermissions = roleUpdateBody.addMemberPermissions
                this.addMemberRoles = roleUpdateBody.addMemberRoles
                this.description = roleUpdateBody.description
                this.name = roleUpdateBody.name
                this.removeMemberPermissions = roleUpdateBody.removeMemberPermissions
                this.removeMemberRoles = roleUpdateBody.removeMemberRoles
                additionalProperties(roleUpdateBody.additionalProperties)
            }

            /** A list of permissions to add to the role */
            @JsonProperty("add_member_permissions")
            fun addMemberPermissions(addMemberPermissions: List<AddMemberPermission>) = apply {
                this.addMemberPermissions = addMemberPermissions
            }

            /** A list of role IDs to add to the role's inheriting-from set */
            @JsonProperty("add_member_roles")
            fun addMemberRoles(addMemberRoles: List<String>) = apply {
                this.addMemberRoles = addMemberRoles
            }

            /** Textual description of the role */
            @JsonProperty("description")
            fun description(description: String) = apply { this.description = description }

            /** Name of the role */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            /** A list of permissions to remove from the role */
            @JsonProperty("remove_member_permissions")
            fun removeMemberPermissions(removeMemberPermissions: List<RemoveMemberPermission>) =
                apply {
                    this.removeMemberPermissions = removeMemberPermissions
                }

            /** A list of role IDs to remove from the role's inheriting-from set */
            @JsonProperty("remove_member_roles")
            fun removeMemberRoles(removeMemberRoles: List<String>) = apply {
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

            fun build(): RoleUpdateBody =
                RoleUpdateBody(
                    addMemberPermissions?.toImmutable(),
                    addMemberRoles?.toImmutable(),
                    description,
                    name,
                    removeMemberPermissions?.toImmutable(),
                    removeMemberRoles?.toImmutable(),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is RoleUpdateBody && addMemberPermissions == other.addMemberPermissions && addMemberRoles == other.addMemberRoles && description == other.description && name == other.name && removeMemberPermissions == other.removeMemberPermissions && removeMemberRoles == other.removeMemberRoles && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(addMemberPermissions, addMemberRoles, description, name, removeMemberPermissions, removeMemberRoles, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "RoleUpdateBody{addMemberPermissions=$addMemberPermissions, addMemberRoles=$addMemberRoles, description=$description, name=$name, removeMemberPermissions=$removeMemberPermissions, removeMemberRoles=$removeMemberRoles, additionalProperties=$additionalProperties}"
    }

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is RoleUpdateParams && roleId == other.roleId && addMemberPermissions == other.addMemberPermissions && addMemberRoles == other.addMemberRoles && description == other.description && name == other.name && removeMemberPermissions == other.removeMemberPermissions && removeMemberRoles == other.removeMemberRoles && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(roleId, addMemberPermissions, addMemberRoles, description, name, removeMemberPermissions, removeMemberRoles, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "RoleUpdateParams{roleId=$roleId, addMemberPermissions=$addMemberPermissions, addMemberRoles=$addMemberRoles, description=$description, name=$name, removeMemberPermissions=$removeMemberPermissions, removeMemberRoles=$removeMemberRoles, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var roleId: String? = null
        private var addMemberPermissions: MutableList<AddMemberPermission> = mutableListOf()
        private var addMemberRoles: MutableList<String> = mutableListOf()
        private var description: String? = null
        private var name: String? = null
        private var removeMemberPermissions: MutableList<RemoveMemberPermission> = mutableListOf()
        private var removeMemberRoles: MutableList<String> = mutableListOf()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(roleUpdateParams: RoleUpdateParams) = apply {
            this.roleId = roleUpdateParams.roleId
            this.addMemberPermissions(roleUpdateParams.addMemberPermissions ?: listOf())
            this.addMemberRoles(roleUpdateParams.addMemberRoles ?: listOf())
            this.description = roleUpdateParams.description
            this.name = roleUpdateParams.name
            this.removeMemberPermissions(roleUpdateParams.removeMemberPermissions ?: listOf())
            this.removeMemberRoles(roleUpdateParams.removeMemberRoles ?: listOf())
            additionalHeaders(roleUpdateParams.additionalHeaders)
            additionalQueryParams(roleUpdateParams.additionalQueryParams)
            additionalBodyProperties(roleUpdateParams.additionalBodyProperties)
        }

        /** Role id */
        fun roleId(roleId: String) = apply { this.roleId = roleId }

        /** A list of permissions to add to the role */
        fun addMemberPermissions(addMemberPermissions: List<AddMemberPermission>) = apply {
            this.addMemberPermissions.clear()
            this.addMemberPermissions.addAll(addMemberPermissions)
        }

        /** A list of permissions to add to the role */
        fun addAddMemberPermission(addMemberPermission: AddMemberPermission) = apply {
            this.addMemberPermissions.add(addMemberPermission)
        }

        /** A list of role IDs to add to the role's inheriting-from set */
        fun addMemberRoles(addMemberRoles: List<String>) = apply {
            this.addMemberRoles.clear()
            this.addMemberRoles.addAll(addMemberRoles)
        }

        /** A list of role IDs to add to the role's inheriting-from set */
        fun addAddMemberRole(addMemberRole: String) = apply {
            this.addMemberRoles.add(addMemberRole)
        }

        /** Textual description of the role */
        fun description(description: String) = apply { this.description = description }

        /** Name of the role */
        fun name(name: String) = apply { this.name = name }

        /** A list of permissions to remove from the role */
        fun removeMemberPermissions(removeMemberPermissions: List<RemoveMemberPermission>) = apply {
            this.removeMemberPermissions.clear()
            this.removeMemberPermissions.addAll(removeMemberPermissions)
        }

        /** A list of permissions to remove from the role */
        fun addRemoveMemberPermission(removeMemberPermission: RemoveMemberPermission) = apply {
            this.removeMemberPermissions.add(removeMemberPermission)
        }

        /** A list of role IDs to remove from the role's inheriting-from set */
        fun removeMemberRoles(removeMemberRoles: List<String>) = apply {
            this.removeMemberRoles.clear()
            this.removeMemberRoles.addAll(removeMemberRoles)
        }

        /** A list of role IDs to remove from the role's inheriting-from set */
        fun addRemoveMemberRole(removeMemberRole: String) = apply {
            this.removeMemberRoles.add(removeMemberRole)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            putAllAdditionalBodyProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply {
            additionalBodyProperties.remove(key)
        }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalBodyProperty)
        }

        fun build(): RoleUpdateParams =
            RoleUpdateParams(
                checkNotNull(roleId) { "`roleId` is required but was not set" },
                if (addMemberPermissions.size == 0) null else addMemberPermissions.toImmutable(),
                if (addMemberRoles.size == 0) null else addMemberRoles.toImmutable(),
                description,
                name,
                if (removeMemberPermissions.size == 0) null
                else removeMemberPermissions.toImmutable(),
                if (removeMemberRoles.size == 0) null else removeMemberRoles.toImmutable(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    @JsonDeserialize(builder = AddMemberPermission.Builder::class)
    @NoAutoDetect
    class AddMemberPermission
    private constructor(
        private val permission: Permission?,
        private val restrictObjectType: RestrictObjectType?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /**
         * Each permission permits a certain type of operation on an object in the system
         *
         * Permissions can be assigned to to objects on an individual basis, or grouped into roles
         */
        @JsonProperty("permission") fun permission(): Permission? = permission

        /** The object type that the ACL applies to */
        @JsonProperty("restrict_object_type")
        fun restrictObjectType(): RestrictObjectType? = restrictObjectType

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var permission: Permission? = null
            private var restrictObjectType: RestrictObjectType? = null
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
            @JsonProperty("permission")
            fun permission(permission: Permission) = apply { this.permission = permission }

            /** The object type that the ACL applies to */
            @JsonProperty("restrict_object_type")
            fun restrictObjectType(restrictObjectType: RestrictObjectType) = apply {
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
                    checkNotNull(permission) { "`permission` is required but was not set" },
                    restrictObjectType,
                    additionalProperties.toImmutable(),
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

                return /* spotless:off */ other is Permission && value == other.value /* spotless:on */
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

                return /* spotless:off */ other is RestrictObjectType && value == other.value /* spotless:on */
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AddMemberPermission && permission == other.permission && restrictObjectType == other.restrictObjectType && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(permission, restrictObjectType, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AddMemberPermission{permission=$permission, restrictObjectType=$restrictObjectType, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = RemoveMemberPermission.Builder::class)
    @NoAutoDetect
    class RemoveMemberPermission
    private constructor(
        private val permission: Permission?,
        private val restrictObjectType: RestrictObjectType?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /**
         * Each permission permits a certain type of operation on an object in the system
         *
         * Permissions can be assigned to to objects on an individual basis, or grouped into roles
         */
        @JsonProperty("permission") fun permission(): Permission? = permission

        /** The object type that the ACL applies to */
        @JsonProperty("restrict_object_type")
        fun restrictObjectType(): RestrictObjectType? = restrictObjectType

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var permission: Permission? = null
            private var restrictObjectType: RestrictObjectType? = null
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
            @JsonProperty("permission")
            fun permission(permission: Permission) = apply { this.permission = permission }

            /** The object type that the ACL applies to */
            @JsonProperty("restrict_object_type")
            fun restrictObjectType(restrictObjectType: RestrictObjectType) = apply {
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
                    checkNotNull(permission) { "`permission` is required but was not set" },
                    restrictObjectType,
                    additionalProperties.toImmutable(),
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

                return /* spotless:off */ other is Permission && value == other.value /* spotless:on */
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

                return /* spotless:off */ other is RestrictObjectType && value == other.value /* spotless:on */
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is RemoveMemberPermission && permission == other.permission && restrictObjectType == other.restrictObjectType && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(permission, restrictObjectType, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "RemoveMemberPermission{permission=$permission, restrictObjectType=$restrictObjectType, additionalProperties=$additionalProperties}"
    }
}
