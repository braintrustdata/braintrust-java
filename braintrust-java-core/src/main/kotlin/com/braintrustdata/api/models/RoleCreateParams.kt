// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.Enum
import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.toUnmodifiable
import com.braintrustdata.api.errors.BraintrustInvalidDataException
import com.braintrustdata.api.models.*
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import java.util.Objects
import java.util.Optional

class RoleCreateParams
constructor(
    private val name: String,
    private val description: String?,
    private val memberPermissions: List<MemberPermission?>?,
    private val memberRoles: List<String>?,
    private val orgName: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun name(): String = name

    fun description(): Optional<String> = Optional.ofNullable(description)

    fun memberPermissions(): Optional<List<MemberPermission?>> =
        Optional.ofNullable(memberPermissions)

    fun memberRoles(): Optional<List<String>> = Optional.ofNullable(memberRoles)

    fun orgName(): Optional<String> = Optional.ofNullable(orgName)

    @JvmSynthetic
    internal fun getBody(): RoleCreateBody {
        return RoleCreateBody(
            name,
            description,
            memberPermissions,
            memberRoles,
            orgName,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = RoleCreateBody.Builder::class)
    @NoAutoDetect
    class RoleCreateBody
    internal constructor(
        private val name: String?,
        private val description: String?,
        private val memberPermissions: List<MemberPermission?>?,
        private val memberRoles: List<String>?,
        private val orgName: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** Name of the role */
        @JsonProperty("name") fun name(): String? = name

        /** Textual description of the role */
        @JsonProperty("description") fun description(): String? = description

        /** Permissions which belong to this role */
        @JsonProperty("member_permissions")
        fun memberPermissions(): List<MemberPermission?>? = memberPermissions

        /**
         * Ids of the roles this role inherits from
         *
         * An inheriting role has all the permissions contained in its member roles, as well as all
         * of their inherited permissions
         */
        @JsonProperty("member_roles") fun memberRoles(): List<String>? = memberRoles

        /**
         * For nearly all users, this parameter should be unnecessary. But in the rare case that
         * your API key belongs to multiple organizations, you may specify the name of the
         * organization the role belongs in.
         */
        @JsonProperty("org_name") fun orgName(): String? = orgName

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is RoleCreateBody &&
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
            "RoleCreateBody{name=$name, description=$description, memberPermissions=$memberPermissions, memberRoles=$memberRoles, orgName=$orgName, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var name: String? = null
            private var description: String? = null
            private var memberPermissions: List<MemberPermission?>? = null
            private var memberRoles: List<String>? = null
            private var orgName: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(roleCreateBody: RoleCreateBody) = apply {
                this.name = roleCreateBody.name
                this.description = roleCreateBody.description
                this.memberPermissions = roleCreateBody.memberPermissions
                this.memberRoles = roleCreateBody.memberRoles
                this.orgName = roleCreateBody.orgName
                additionalProperties(roleCreateBody.additionalProperties)
            }

            /** Name of the role */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            /** Textual description of the role */
            @JsonProperty("description")
            fun description(description: String) = apply { this.description = description }

            /** Permissions which belong to this role */
            @JsonProperty("member_permissions")
            fun memberPermissions(memberPermissions: List<MemberPermission?>) = apply {
                this.memberPermissions = memberPermissions
            }

            /**
             * Ids of the roles this role inherits from
             *
             * An inheriting role has all the permissions contained in its member roles, as well as
             * all of their inherited permissions
             */
            @JsonProperty("member_roles")
            fun memberRoles(memberRoles: List<String>) = apply { this.memberRoles = memberRoles }

            /**
             * For nearly all users, this parameter should be unnecessary. But in the rare case that
             * your API key belongs to multiple organizations, you may specify the name of the
             * organization the role belongs in.
             */
            @JsonProperty("org_name")
            fun orgName(orgName: String) = apply { this.orgName = orgName }

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

            fun build(): RoleCreateBody =
                RoleCreateBody(
                    checkNotNull(name) { "`name` is required but was not set" },
                    description,
                    memberPermissions?.toUnmodifiable(),
                    memberRoles?.toUnmodifiable(),
                    orgName,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RoleCreateParams &&
            this.name == other.name &&
            this.description == other.description &&
            this.memberPermissions == other.memberPermissions &&
            this.memberRoles == other.memberRoles &&
            this.orgName == other.orgName &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            name,
            description,
            memberPermissions,
            memberRoles,
            orgName,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "RoleCreateParams{name=$name, description=$description, memberPermissions=$memberPermissions, memberRoles=$memberRoles, orgName=$orgName, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var name: String? = null
        private var description: String? = null
        private var memberPermissions: MutableList<MemberPermission?> = mutableListOf()
        private var memberRoles: MutableList<String> = mutableListOf()
        private var orgName: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(roleCreateParams: RoleCreateParams) = apply {
            this.name = roleCreateParams.name
            this.description = roleCreateParams.description
            this.memberPermissions(roleCreateParams.memberPermissions ?: listOf())
            this.memberRoles(roleCreateParams.memberRoles ?: listOf())
            this.orgName = roleCreateParams.orgName
            additionalQueryParams(roleCreateParams.additionalQueryParams)
            additionalHeaders(roleCreateParams.additionalHeaders)
            additionalBodyProperties(roleCreateParams.additionalBodyProperties)
        }

        /** Name of the role */
        fun name(name: String) = apply { this.name = name }

        /** Textual description of the role */
        fun description(description: String) = apply { this.description = description }

        /** Permissions which belong to this role */
        fun memberPermissions(memberPermissions: List<MemberPermission?>) = apply {
            this.memberPermissions.clear()
            this.memberPermissions.addAll(memberPermissions)
        }

        /** Permissions which belong to this role */
        fun addMemberPermission(memberPermission: MemberPermission) = apply {
            this.memberPermissions.add(memberPermission)
        }

        /**
         * Ids of the roles this role inherits from
         *
         * An inheriting role has all the permissions contained in its member roles, as well as all
         * of their inherited permissions
         */
        fun memberRoles(memberRoles: List<String>) = apply {
            this.memberRoles.clear()
            this.memberRoles.addAll(memberRoles)
        }

        /**
         * Ids of the roles this role inherits from
         *
         * An inheriting role has all the permissions contained in its member roles, as well as all
         * of their inherited permissions
         */
        fun addMemberRole(memberRole: String) = apply { this.memberRoles.add(memberRole) }

        /**
         * For nearly all users, this parameter should be unnecessary. But in the rare case that
         * your API key belongs to multiple organizations, you may specify the name of the
         * organization the role belongs in.
         */
        fun orgName(orgName: String) = apply { this.orgName = orgName }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): RoleCreateParams =
            RoleCreateParams(
                checkNotNull(name) { "`name` is required but was not set" },
                description,
                if (memberPermissions.size == 0) null else memberPermissions.toUnmodifiable(),
                if (memberRoles.size == 0) null else memberRoles.toUnmodifiable(),
                orgName,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
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
