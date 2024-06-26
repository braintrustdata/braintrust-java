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

class RoleUpdateParams
constructor(
    private val roleId: String,
    private val description: String?,
    private val memberPermissions: List<MemberPermission?>?,
    private val memberRoles: List<String>?,
    private val name: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun roleId(): String = roleId

    fun description(): Optional<String> = Optional.ofNullable(description)

    fun memberPermissions(): Optional<List<MemberPermission?>> =
        Optional.ofNullable(memberPermissions)

    fun memberRoles(): Optional<List<String>> = Optional.ofNullable(memberRoles)

    fun name(): Optional<String> = Optional.ofNullable(name)

    @JvmSynthetic
    internal fun getBody(): RoleUpdateBody {
        return RoleUpdateBody(
            description,
            memberPermissions,
            memberRoles,
            name,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

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
        private val description: String?,
        private val memberPermissions: List<MemberPermission?>?,
        private val memberRoles: List<String>?,
        private val name: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

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

        /** Name of the role */
        @JsonProperty("name") fun name(): String? = name

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is RoleUpdateBody &&
                this.description == other.description &&
                this.memberPermissions == other.memberPermissions &&
                this.memberRoles == other.memberRoles &&
                this.name == other.name &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        description,
                        memberPermissions,
                        memberRoles,
                        name,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "RoleUpdateBody{description=$description, memberPermissions=$memberPermissions, memberRoles=$memberRoles, name=$name, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var description: String? = null
            private var memberPermissions: List<MemberPermission?>? = null
            private var memberRoles: List<String>? = null
            private var name: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(roleUpdateBody: RoleUpdateBody) = apply {
                this.description = roleUpdateBody.description
                this.memberPermissions = roleUpdateBody.memberPermissions
                this.memberRoles = roleUpdateBody.memberRoles
                this.name = roleUpdateBody.name
                additionalProperties(roleUpdateBody.additionalProperties)
            }

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

            /** Name of the role */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

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
                    description,
                    memberPermissions?.toUnmodifiable(),
                    memberRoles?.toUnmodifiable(),
                    name,
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

        return other is RoleUpdateParams &&
            this.roleId == other.roleId &&
            this.description == other.description &&
            this.memberPermissions == other.memberPermissions &&
            this.memberRoles == other.memberRoles &&
            this.name == other.name &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            roleId,
            description,
            memberPermissions,
            memberRoles,
            name,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "RoleUpdateParams{roleId=$roleId, description=$description, memberPermissions=$memberPermissions, memberRoles=$memberRoles, name=$name, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var roleId: String? = null
        private var description: String? = null
        private var memberPermissions: MutableList<MemberPermission?> = mutableListOf()
        private var memberRoles: MutableList<String> = mutableListOf()
        private var name: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(roleUpdateParams: RoleUpdateParams) = apply {
            this.roleId = roleUpdateParams.roleId
            this.description = roleUpdateParams.description
            this.memberPermissions(roleUpdateParams.memberPermissions ?: listOf())
            this.memberRoles(roleUpdateParams.memberRoles ?: listOf())
            this.name = roleUpdateParams.name
            additionalQueryParams(roleUpdateParams.additionalQueryParams)
            additionalHeaders(roleUpdateParams.additionalHeaders)
            additionalBodyProperties(roleUpdateParams.additionalBodyProperties)
        }

        /** Role id */
        fun roleId(roleId: String) = apply { this.roleId = roleId }

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

        /** Name of the role */
        fun name(name: String) = apply { this.name = name }

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

        fun build(): RoleUpdateParams =
            RoleUpdateParams(
                checkNotNull(roleId) { "`roleId` is required but was not set" },
                description,
                if (memberPermissions.size == 0) null else memberPermissions.toUnmodifiable(),
                if (memberRoles.size == 0) null else memberRoles.toUnmodifiable(),
                name,
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
