// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.Enum
import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.Params
import com.braintrustdata.api.core.checkRequired
import com.braintrustdata.api.core.http.Headers
import com.braintrustdata.api.core.http.QueryParams
import com.braintrustdata.api.core.immutableEmptyMap
import com.braintrustdata.api.core.toImmutable
import com.braintrustdata.api.errors.BraintrustInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Objects
import java.util.Optional

/**
 * Create or replace role. If there is an existing role with the same name as the one specified in
 * the request, will replace the existing role with the provided fields
 */
class RoleReplaceParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Name of the role */
    fun name(): String = body.name()

    /** Textual description of the role */
    fun description(): Optional<String> = body.description()

    /** (permission, restrict_object_type) tuples which belong to this role */
    fun memberPermissions(): Optional<List<MemberPermission>> = body.memberPermissions()

    /**
     * Ids of the roles this role inherits from
     *
     * An inheriting role has all the permissions contained in its member roles, as well as all of
     * their inherited permissions
     */
    fun memberRoles(): Optional<List<String>> = body.memberRoles()

    /**
     * For nearly all users, this parameter should be unnecessary. But in the rare case that your
     * API key belongs to multiple organizations, you may specify the name of the organization the
     * role belongs in.
     */
    fun orgName(): Optional<String> = body.orgName()

    /** Name of the role */
    fun _name(): JsonField<String> = body._name()

    /** Textual description of the role */
    fun _description(): JsonField<String> = body._description()

    /** (permission, restrict_object_type) tuples which belong to this role */
    fun _memberPermissions(): JsonField<List<MemberPermission>> = body._memberPermissions()

    /**
     * Ids of the roles this role inherits from
     *
     * An inheriting role has all the permissions contained in its member roles, as well as all of
     * their inherited permissions
     */
    fun _memberRoles(): JsonField<List<String>> = body._memberRoles()

    /**
     * For nearly all users, this parameter should be unnecessary. But in the rare case that your
     * API key belongs to multiple organizations, you may specify the name of the organization the
     * role belongs in.
     */
    fun _orgName(): JsonField<String> = body._orgName()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class Body
    @JsonCreator
    private constructor(
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        private val description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("member_permissions")
        @ExcludeMissing
        private val memberPermissions: JsonField<List<MemberPermission>> = JsonMissing.of(),
        @JsonProperty("member_roles")
        @ExcludeMissing
        private val memberRoles: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("org_name")
        @ExcludeMissing
        private val orgName: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

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
         * An inheriting role has all the permissions contained in its member roles, as well as all
         * of their inherited permissions
         */
        fun memberRoles(): Optional<List<String>> =
            Optional.ofNullable(memberRoles.getNullable("member_roles"))

        /**
         * For nearly all users, this parameter should be unnecessary. But in the rare case that
         * your API key belongs to multiple organizations, you may specify the name of the
         * organization the role belongs in.
         */
        fun orgName(): Optional<String> = Optional.ofNullable(orgName.getNullable("org_name"))

        /** Name of the role */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /** Textual description of the role */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /** (permission, restrict_object_type) tuples which belong to this role */
        @JsonProperty("member_permissions")
        @ExcludeMissing
        fun _memberPermissions(): JsonField<List<MemberPermission>> = memberPermissions

        /**
         * Ids of the roles this role inherits from
         *
         * An inheriting role has all the permissions contained in its member roles, as well as all
         * of their inherited permissions
         */
        @JsonProperty("member_roles")
        @ExcludeMissing
        fun _memberRoles(): JsonField<List<String>> = memberRoles

        /**
         * For nearly all users, this parameter should be unnecessary. But in the rare case that
         * your API key belongs to multiple organizations, you may specify the name of the
         * organization the role belongs in.
         */
        @JsonProperty("org_name") @ExcludeMissing fun _orgName(): JsonField<String> = orgName

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            name()
            description()
            memberPermissions().ifPresent { it.forEach { it.validate() } }
            memberRoles()
            orgName()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var name: JsonField<String>? = null
            private var description: JsonField<String> = JsonMissing.of()
            private var memberPermissions: JsonField<MutableList<MemberPermission>>? = null
            private var memberRoles: JsonField<MutableList<String>>? = null
            private var orgName: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                name = body.name
                description = body.description
                memberPermissions = body.memberPermissions.map { it.toMutableList() }
                memberRoles = body.memberRoles.map { it.toMutableList() }
                orgName = body.orgName
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Name of the role */
            fun name(name: String) = name(JsonField.of(name))

            /** Name of the role */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** Textual description of the role */
            fun description(description: String?) = description(JsonField.ofNullable(description))

            /** Textual description of the role */
            fun description(description: Optional<String>) = description(description.orElse(null))

            /** Textual description of the role */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

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
             * An inheriting role has all the permissions contained in its member roles, as well as
             * all of their inherited permissions
             */
            fun memberRoles(memberRoles: List<String>?) =
                memberRoles(JsonField.ofNullable(memberRoles))

            /**
             * Ids of the roles this role inherits from
             *
             * An inheriting role has all the permissions contained in its member roles, as well as
             * all of their inherited permissions
             */
            fun memberRoles(memberRoles: Optional<List<String>>) =
                memberRoles(memberRoles.orElse(null))

            /**
             * Ids of the roles this role inherits from
             *
             * An inheriting role has all the permissions contained in its member roles, as well as
             * all of their inherited permissions
             */
            fun memberRoles(memberRoles: JsonField<List<String>>) = apply {
                this.memberRoles = memberRoles.map { it.toMutableList() }
            }

            /**
             * Ids of the roles this role inherits from
             *
             * An inheriting role has all the permissions contained in its member roles, as well as
             * all of their inherited permissions
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
             * For nearly all users, this parameter should be unnecessary. But in the rare case that
             * your API key belongs to multiple organizations, you may specify the name of the
             * organization the role belongs in.
             */
            fun orgName(orgName: String?) = orgName(JsonField.ofNullable(orgName))

            /**
             * For nearly all users, this parameter should be unnecessary. But in the rare case that
             * your API key belongs to multiple organizations, you may specify the name of the
             * organization the role belongs in.
             */
            fun orgName(orgName: Optional<String>) = orgName(orgName.orElse(null))

            /**
             * For nearly all users, this parameter should be unnecessary. But in the rare case that
             * your API key belongs to multiple organizations, you may specify the name of the
             * organization the role belongs in.
             */
            fun orgName(orgName: JsonField<String>) = apply { this.orgName = orgName }

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
                    checkRequired("name", name),
                    description,
                    (memberPermissions ?: JsonMissing.of()).map { it.toImmutable() },
                    (memberRoles ?: JsonMissing.of()).map { it.toImmutable() },
                    orgName,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && name == other.name && description == other.description && memberPermissions == other.memberPermissions && memberRoles == other.memberRoles && orgName == other.orgName && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(name, description, memberPermissions, memberRoles, orgName, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{name=$name, description=$description, memberPermissions=$memberPermissions, memberRoles=$memberRoles, orgName=$orgName, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RoleReplaceParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(roleReplaceParams: RoleReplaceParams) = apply {
            body = roleReplaceParams.body.toBuilder()
            additionalHeaders = roleReplaceParams.additionalHeaders.toBuilder()
            additionalQueryParams = roleReplaceParams.additionalQueryParams.toBuilder()
        }

        /** Name of the role */
        fun name(name: String) = apply { body.name(name) }

        /** Name of the role */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /** Textual description of the role */
        fun description(description: String?) = apply { body.description(description) }

        /** Textual description of the role */
        fun description(description: Optional<String>) = description(description.orElse(null))

        /** Textual description of the role */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        /** (permission, restrict_object_type) tuples which belong to this role */
        fun memberPermissions(memberPermissions: List<MemberPermission>?) = apply {
            body.memberPermissions(memberPermissions)
        }

        /** (permission, restrict_object_type) tuples which belong to this role */
        fun memberPermissions(memberPermissions: Optional<List<MemberPermission>>) =
            memberPermissions(memberPermissions.orElse(null))

        /** (permission, restrict_object_type) tuples which belong to this role */
        fun memberPermissions(memberPermissions: JsonField<List<MemberPermission>>) = apply {
            body.memberPermissions(memberPermissions)
        }

        /** (permission, restrict_object_type) tuples which belong to this role */
        fun addMemberPermission(memberPermission: MemberPermission) = apply {
            body.addMemberPermission(memberPermission)
        }

        /**
         * Ids of the roles this role inherits from
         *
         * An inheriting role has all the permissions contained in its member roles, as well as all
         * of their inherited permissions
         */
        fun memberRoles(memberRoles: List<String>?) = apply { body.memberRoles(memberRoles) }

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
            body.memberRoles(memberRoles)
        }

        /**
         * Ids of the roles this role inherits from
         *
         * An inheriting role has all the permissions contained in its member roles, as well as all
         * of their inherited permissions
         */
        fun addMemberRole(memberRole: String) = apply { body.addMemberRole(memberRole) }

        /**
         * For nearly all users, this parameter should be unnecessary. But in the rare case that
         * your API key belongs to multiple organizations, you may specify the name of the
         * organization the role belongs in.
         */
        fun orgName(orgName: String?) = apply { body.orgName(orgName) }

        /**
         * For nearly all users, this parameter should be unnecessary. But in the rare case that
         * your API key belongs to multiple organizations, you may specify the name of the
         * organization the role belongs in.
         */
        fun orgName(orgName: Optional<String>) = orgName(orgName.orElse(null))

        /**
         * For nearly all users, this parameter should be unnecessary. But in the rare case that
         * your API key belongs to multiple organizations, you may specify the name of the
         * organization the role belongs in.
         */
        fun orgName(orgName: JsonField<String>) = apply { body.orgName(orgName) }

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

        fun build(): RoleReplaceParams =
            RoleReplaceParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
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
        class Permission @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

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
        private constructor(private val value: JsonField<String>) : Enum {

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

        return /* spotless:off */ other is RoleReplaceParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "RoleReplaceParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
