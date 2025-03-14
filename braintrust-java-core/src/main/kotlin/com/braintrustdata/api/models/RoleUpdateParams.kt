// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.Params
import com.braintrustdata.api.core.checkKnown
import com.braintrustdata.api.core.checkRequired
import com.braintrustdata.api.core.http.Headers
import com.braintrustdata.api.core.http.QueryParams
import com.braintrustdata.api.core.immutableEmptyMap
import com.braintrustdata.api.core.toImmutable
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Partially update a role object. Specify the fields to update in the payload. Any object-type
 * fields will be deep-merged with existing content. Currently we do not support removing fields or
 * setting them to null.
 */
class RoleUpdateParams
private constructor(
    private val roleId: String,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Role id */
    fun roleId(): String = roleId

    /** A list of permissions to add to the role */
    fun addMemberPermissions(): Optional<List<AddMemberPermission>> = body.addMemberPermissions()

    /** A list of role IDs to add to the role's inheriting-from set */
    fun addMemberRoles(): Optional<List<String>> = body.addMemberRoles()

    /** Textual description of the role */
    fun description(): Optional<String> = body.description()

    /** Name of the role */
    fun name(): Optional<String> = body.name()

    /** A list of permissions to remove from the role */
    fun removeMemberPermissions(): Optional<List<RemoveMemberPermission>> =
        body.removeMemberPermissions()

    /** A list of role IDs to remove from the role's inheriting-from set */
    fun removeMemberRoles(): Optional<List<String>> = body.removeMemberRoles()

    /** A list of permissions to add to the role */
    fun _addMemberPermissions(): JsonField<List<AddMemberPermission>> = body._addMemberPermissions()

    /** A list of role IDs to add to the role's inheriting-from set */
    fun _addMemberRoles(): JsonField<List<String>> = body._addMemberRoles()

    /** Textual description of the role */
    fun _description(): JsonField<String> = body._description()

    /** Name of the role */
    fun _name(): JsonField<String> = body._name()

    /** A list of permissions to remove from the role */
    fun _removeMemberPermissions(): JsonField<List<RemoveMemberPermission>> =
        body._removeMemberPermissions()

    /** A list of role IDs to remove from the role's inheriting-from set */
    fun _removeMemberRoles(): JsonField<List<String>> = body._removeMemberRoles()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> roleId
            else -> ""
        }
    }

    @NoAutoDetect
    class Body
    @JsonCreator
    private constructor(
        @JsonProperty("add_member_permissions")
        @ExcludeMissing
        private val addMemberPermissions: JsonField<List<AddMemberPermission>> = JsonMissing.of(),
        @JsonProperty("add_member_roles")
        @ExcludeMissing
        private val addMemberRoles: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        private val description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("remove_member_permissions")
        @ExcludeMissing
        private val removeMemberPermissions: JsonField<List<RemoveMemberPermission>> =
            JsonMissing.of(),
        @JsonProperty("remove_member_roles")
        @ExcludeMissing
        private val removeMemberRoles: JsonField<List<String>> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** A list of permissions to add to the role */
        fun addMemberPermissions(): Optional<List<AddMemberPermission>> =
            Optional.ofNullable(addMemberPermissions.getNullable("add_member_permissions"))

        /** A list of role IDs to add to the role's inheriting-from set */
        fun addMemberRoles(): Optional<List<String>> =
            Optional.ofNullable(addMemberRoles.getNullable("add_member_roles"))

        /** Textual description of the role */
        fun description(): Optional<String> =
            Optional.ofNullable(description.getNullable("description"))

        /** Name of the role */
        fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

        /** A list of permissions to remove from the role */
        fun removeMemberPermissions(): Optional<List<RemoveMemberPermission>> =
            Optional.ofNullable(removeMemberPermissions.getNullable("remove_member_permissions"))

        /** A list of role IDs to remove from the role's inheriting-from set */
        fun removeMemberRoles(): Optional<List<String>> =
            Optional.ofNullable(removeMemberRoles.getNullable("remove_member_roles"))

        /** A list of permissions to add to the role */
        @JsonProperty("add_member_permissions")
        @ExcludeMissing
        fun _addMemberPermissions(): JsonField<List<AddMemberPermission>> = addMemberPermissions

        /** A list of role IDs to add to the role's inheriting-from set */
        @JsonProperty("add_member_roles")
        @ExcludeMissing
        fun _addMemberRoles(): JsonField<List<String>> = addMemberRoles

        /** Textual description of the role */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /** Name of the role */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /** A list of permissions to remove from the role */
        @JsonProperty("remove_member_permissions")
        @ExcludeMissing
        fun _removeMemberPermissions(): JsonField<List<RemoveMemberPermission>> =
            removeMemberPermissions

        /** A list of role IDs to remove from the role's inheriting-from set */
        @JsonProperty("remove_member_roles")
        @ExcludeMissing
        fun _removeMemberRoles(): JsonField<List<String>> = removeMemberRoles

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            addMemberPermissions().ifPresent { it.forEach { it.validate() } }
            addMemberRoles()
            description()
            name()
            removeMemberPermissions().ifPresent { it.forEach { it.validate() } }
            removeMemberRoles()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var addMemberPermissions: JsonField<MutableList<AddMemberPermission>>? = null
            private var addMemberRoles: JsonField<MutableList<String>>? = null
            private var description: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var removeMemberPermissions: JsonField<MutableList<RemoveMemberPermission>>? =
                null
            private var removeMemberRoles: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                addMemberPermissions = body.addMemberPermissions.map { it.toMutableList() }
                addMemberRoles = body.addMemberRoles.map { it.toMutableList() }
                description = body.description
                name = body.name
                removeMemberPermissions = body.removeMemberPermissions.map { it.toMutableList() }
                removeMemberRoles = body.removeMemberRoles.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** A list of permissions to add to the role */
            fun addMemberPermissions(addMemberPermissions: List<AddMemberPermission>?) =
                addMemberPermissions(JsonField.ofNullable(addMemberPermissions))

            /** A list of permissions to add to the role */
            fun addMemberPermissions(addMemberPermissions: Optional<List<AddMemberPermission>>) =
                addMemberPermissions(addMemberPermissions.getOrNull())

            /** A list of permissions to add to the role */
            fun addMemberPermissions(addMemberPermissions: JsonField<List<AddMemberPermission>>) =
                apply {
                    this.addMemberPermissions = addMemberPermissions.map { it.toMutableList() }
                }

            /** A list of permissions to add to the role */
            fun addAddMemberPermission(addMemberPermission: AddMemberPermission) = apply {
                addMemberPermissions =
                    (addMemberPermissions ?: JsonField.of(mutableListOf())).also {
                        checkKnown("addMemberPermissions", it).add(addMemberPermission)
                    }
            }

            /** A list of role IDs to add to the role's inheriting-from set */
            fun addMemberRoles(addMemberRoles: List<String>?) =
                addMemberRoles(JsonField.ofNullable(addMemberRoles))

            /** A list of role IDs to add to the role's inheriting-from set */
            fun addMemberRoles(addMemberRoles: Optional<List<String>>) =
                addMemberRoles(addMemberRoles.getOrNull())

            /** A list of role IDs to add to the role's inheriting-from set */
            fun addMemberRoles(addMemberRoles: JsonField<List<String>>) = apply {
                this.addMemberRoles = addMemberRoles.map { it.toMutableList() }
            }

            /** A list of role IDs to add to the role's inheriting-from set */
            fun addAddMemberRole(addMemberRole: String) = apply {
                addMemberRoles =
                    (addMemberRoles ?: JsonField.of(mutableListOf())).also {
                        checkKnown("addMemberRoles", it).add(addMemberRole)
                    }
            }

            /** Textual description of the role */
            fun description(description: String?) = description(JsonField.ofNullable(description))

            /** Textual description of the role */
            fun description(description: Optional<String>) = description(description.getOrNull())

            /** Textual description of the role */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /** Name of the role */
            fun name(name: String?) = name(JsonField.ofNullable(name))

            /** Name of the role */
            fun name(name: Optional<String>) = name(name.getOrNull())

            /** Name of the role */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** A list of permissions to remove from the role */
            fun removeMemberPermissions(removeMemberPermissions: List<RemoveMemberPermission>?) =
                removeMemberPermissions(JsonField.ofNullable(removeMemberPermissions))

            /** A list of permissions to remove from the role */
            fun removeMemberPermissions(
                removeMemberPermissions: Optional<List<RemoveMemberPermission>>
            ) = removeMemberPermissions(removeMemberPermissions.getOrNull())

            /** A list of permissions to remove from the role */
            fun removeMemberPermissions(
                removeMemberPermissions: JsonField<List<RemoveMemberPermission>>
            ) = apply {
                this.removeMemberPermissions = removeMemberPermissions.map { it.toMutableList() }
            }

            /** A list of permissions to remove from the role */
            fun addRemoveMemberPermission(removeMemberPermission: RemoveMemberPermission) = apply {
                removeMemberPermissions =
                    (removeMemberPermissions ?: JsonField.of(mutableListOf())).also {
                        checkKnown("removeMemberPermissions", it).add(removeMemberPermission)
                    }
            }

            /** A list of role IDs to remove from the role's inheriting-from set */
            fun removeMemberRoles(removeMemberRoles: List<String>?) =
                removeMemberRoles(JsonField.ofNullable(removeMemberRoles))

            /** A list of role IDs to remove from the role's inheriting-from set */
            fun removeMemberRoles(removeMemberRoles: Optional<List<String>>) =
                removeMemberRoles(removeMemberRoles.getOrNull())

            /** A list of role IDs to remove from the role's inheriting-from set */
            fun removeMemberRoles(removeMemberRoles: JsonField<List<String>>) = apply {
                this.removeMemberRoles = removeMemberRoles.map { it.toMutableList() }
            }

            /** A list of role IDs to remove from the role's inheriting-from set */
            fun addRemoveMemberRole(removeMemberRole: String) = apply {
                removeMemberRoles =
                    (removeMemberRoles ?: JsonField.of(mutableListOf())).also {
                        checkKnown("removeMemberRoles", it).add(removeMemberRole)
                    }
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

            fun build(): Body =
                Body(
                    (addMemberPermissions ?: JsonMissing.of()).map { it.toImmutable() },
                    (addMemberRoles ?: JsonMissing.of()).map { it.toImmutable() },
                    description,
                    name,
                    (removeMemberPermissions ?: JsonMissing.of()).map { it.toImmutable() },
                    (removeMemberRoles ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && addMemberPermissions == other.addMemberPermissions && addMemberRoles == other.addMemberRoles && description == other.description && name == other.name && removeMemberPermissions == other.removeMemberPermissions && removeMemberRoles == other.removeMemberRoles && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(addMemberPermissions, addMemberRoles, description, name, removeMemberPermissions, removeMemberRoles, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{addMemberPermissions=$addMemberPermissions, addMemberRoles=$addMemberRoles, description=$description, name=$name, removeMemberPermissions=$removeMemberPermissions, removeMemberRoles=$removeMemberRoles, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RoleUpdateParams].
         *
         * The following fields are required:
         * ```java
         * .roleId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RoleUpdateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var roleId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(roleUpdateParams: RoleUpdateParams) = apply {
            roleId = roleUpdateParams.roleId
            body = roleUpdateParams.body.toBuilder()
            additionalHeaders = roleUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = roleUpdateParams.additionalQueryParams.toBuilder()
        }

        /** Role id */
        fun roleId(roleId: String) = apply { this.roleId = roleId }

        /** A list of permissions to add to the role */
        fun addMemberPermissions(addMemberPermissions: List<AddMemberPermission>?) = apply {
            body.addMemberPermissions(addMemberPermissions)
        }

        /** A list of permissions to add to the role */
        fun addMemberPermissions(addMemberPermissions: Optional<List<AddMemberPermission>>) =
            addMemberPermissions(addMemberPermissions.getOrNull())

        /** A list of permissions to add to the role */
        fun addMemberPermissions(addMemberPermissions: JsonField<List<AddMemberPermission>>) =
            apply {
                body.addMemberPermissions(addMemberPermissions)
            }

        /** A list of permissions to add to the role */
        fun addAddMemberPermission(addMemberPermission: AddMemberPermission) = apply {
            body.addAddMemberPermission(addMemberPermission)
        }

        /** A list of role IDs to add to the role's inheriting-from set */
        fun addMemberRoles(addMemberRoles: List<String>?) = apply {
            body.addMemberRoles(addMemberRoles)
        }

        /** A list of role IDs to add to the role's inheriting-from set */
        fun addMemberRoles(addMemberRoles: Optional<List<String>>) =
            addMemberRoles(addMemberRoles.getOrNull())

        /** A list of role IDs to add to the role's inheriting-from set */
        fun addMemberRoles(addMemberRoles: JsonField<List<String>>) = apply {
            body.addMemberRoles(addMemberRoles)
        }

        /** A list of role IDs to add to the role's inheriting-from set */
        fun addAddMemberRole(addMemberRole: String) = apply { body.addAddMemberRole(addMemberRole) }

        /** Textual description of the role */
        fun description(description: String?) = apply { body.description(description) }

        /** Textual description of the role */
        fun description(description: Optional<String>) = description(description.getOrNull())

        /** Textual description of the role */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        /** Name of the role */
        fun name(name: String?) = apply { body.name(name) }

        /** Name of the role */
        fun name(name: Optional<String>) = name(name.getOrNull())

        /** Name of the role */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /** A list of permissions to remove from the role */
        fun removeMemberPermissions(removeMemberPermissions: List<RemoveMemberPermission>?) =
            apply {
                body.removeMemberPermissions(removeMemberPermissions)
            }

        /** A list of permissions to remove from the role */
        fun removeMemberPermissions(
            removeMemberPermissions: Optional<List<RemoveMemberPermission>>
        ) = removeMemberPermissions(removeMemberPermissions.getOrNull())

        /** A list of permissions to remove from the role */
        fun removeMemberPermissions(
            removeMemberPermissions: JsonField<List<RemoveMemberPermission>>
        ) = apply { body.removeMemberPermissions(removeMemberPermissions) }

        /** A list of permissions to remove from the role */
        fun addRemoveMemberPermission(removeMemberPermission: RemoveMemberPermission) = apply {
            body.addRemoveMemberPermission(removeMemberPermission)
        }

        /** A list of role IDs to remove from the role's inheriting-from set */
        fun removeMemberRoles(removeMemberRoles: List<String>?) = apply {
            body.removeMemberRoles(removeMemberRoles)
        }

        /** A list of role IDs to remove from the role's inheriting-from set */
        fun removeMemberRoles(removeMemberRoles: Optional<List<String>>) =
            removeMemberRoles(removeMemberRoles.getOrNull())

        /** A list of role IDs to remove from the role's inheriting-from set */
        fun removeMemberRoles(removeMemberRoles: JsonField<List<String>>) = apply {
            body.removeMemberRoles(removeMemberRoles)
        }

        /** A list of role IDs to remove from the role's inheriting-from set */
        fun addRemoveMemberRole(removeMemberRole: String) = apply {
            body.addRemoveMemberRole(removeMemberRole)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
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

        fun build(): RoleUpdateParams =
            RoleUpdateParams(
                checkRequired("roleId", roleId),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    @NoAutoDetect
    class AddMemberPermission
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

        fun validate(): AddMemberPermission = apply {
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
             * Returns a mutable builder for constructing an instance of [AddMemberPermission].
             *
             * The following fields are required:
             * ```java
             * .permission()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [AddMemberPermission]. */
        class Builder internal constructor() {

            private var permission: JsonField<Permission>? = null
            private var restrictObjectType: JsonField<AclObjectType> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(addMemberPermission: AddMemberPermission) = apply {
                permission = addMemberPermission.permission
                restrictObjectType = addMemberPermission.restrictObjectType
                additionalProperties = addMemberPermission.additionalProperties.toMutableMap()
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

            fun build(): AddMemberPermission =
                AddMemberPermission(
                    checkRequired("permission", permission),
                    restrictObjectType,
                    additionalProperties.toImmutable(),
                )
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

    @NoAutoDetect
    class RemoveMemberPermission
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

        fun validate(): RemoveMemberPermission = apply {
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
             * Returns a mutable builder for constructing an instance of [RemoveMemberPermission].
             *
             * The following fields are required:
             * ```java
             * .permission()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [RemoveMemberPermission]. */
        class Builder internal constructor() {

            private var permission: JsonField<Permission>? = null
            private var restrictObjectType: JsonField<AclObjectType> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(removeMemberPermission: RemoveMemberPermission) = apply {
                permission = removeMemberPermission.permission
                restrictObjectType = removeMemberPermission.restrictObjectType
                additionalProperties = removeMemberPermission.additionalProperties.toMutableMap()
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

            fun build(): RemoveMemberPermission =
                RemoveMemberPermission(
                    checkRequired("permission", permission),
                    restrictObjectType,
                    additionalProperties.toImmutable(),
                )
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is RoleUpdateParams && roleId == other.roleId && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(roleId, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "RoleUpdateParams{roleId=$roleId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
