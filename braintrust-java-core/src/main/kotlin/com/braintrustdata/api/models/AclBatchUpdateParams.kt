// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.Enum
import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.toImmutable
import com.braintrustdata.api.errors.BraintrustInvalidDataException
import com.braintrustdata.api.models.*
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import java.util.Objects
import java.util.Optional

class AclBatchUpdateParams
constructor(
    private val addAcls: List<AddAcl>?,
    private val removeAcls: List<RemoveAcl>?,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun addAcls(): Optional<List<AddAcl>> = Optional.ofNullable(addAcls)

    fun removeAcls(): Optional<List<RemoveAcl>> = Optional.ofNullable(removeAcls)

    @JvmSynthetic
    internal fun getBody(): AclBatchUpdateBody {
        return AclBatchUpdateBody(
            addAcls,
            removeAcls,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JsonDeserialize(builder = AclBatchUpdateBody.Builder::class)
    @NoAutoDetect
    class AclBatchUpdateBody
    internal constructor(
        private val addAcls: List<AddAcl>?,
        private val removeAcls: List<RemoveAcl>?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /**
         * An ACL grants a certain permission or role to a certain user or group on an object.
         *
         * ACLs are inherited across the object hierarchy. So for example, if a user has read
         * permissions on a project, they will also have read permissions on any experiment,
         * dataset, etc. created within that project.
         *
         * To restrict a grant to a particular sub-object, you may specify `restrict_object_type` in
         * the ACL, as part of a direct permission grant or as part of a role.
         */
        @JsonProperty("add_acls") fun addAcls(): List<AddAcl>? = addAcls

        /**
         * An ACL grants a certain permission or role to a certain user or group on an object.
         *
         * ACLs are inherited across the object hierarchy. So for example, if a user has read
         * permissions on a project, they will also have read permissions on any experiment,
         * dataset, etc. created within that project.
         *
         * To restrict a grant to a particular sub-object, you may specify `restrict_object_type` in
         * the ACL, as part of a direct permission grant or as part of a role.
         */
        @JsonProperty("remove_acls") fun removeAcls(): List<RemoveAcl>? = removeAcls

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var addAcls: List<AddAcl>? = null
            private var removeAcls: List<RemoveAcl>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(aclBatchUpdateBody: AclBatchUpdateBody) = apply {
                this.addAcls = aclBatchUpdateBody.addAcls
                this.removeAcls = aclBatchUpdateBody.removeAcls
                additionalProperties(aclBatchUpdateBody.additionalProperties)
            }

            /**
             * An ACL grants a certain permission or role to a certain user or group on an object.
             *
             * ACLs are inherited across the object hierarchy. So for example, if a user has read
             * permissions on a project, they will also have read permissions on any experiment,
             * dataset, etc. created within that project.
             *
             * To restrict a grant to a particular sub-object, you may specify
             * `restrict_object_type` in the ACL, as part of a direct permission grant or as part of
             * a role.
             */
            @JsonProperty("add_acls")
            fun addAcls(addAcls: List<AddAcl>) = apply { this.addAcls = addAcls }

            /**
             * An ACL grants a certain permission or role to a certain user or group on an object.
             *
             * ACLs are inherited across the object hierarchy. So for example, if a user has read
             * permissions on a project, they will also have read permissions on any experiment,
             * dataset, etc. created within that project.
             *
             * To restrict a grant to a particular sub-object, you may specify
             * `restrict_object_type` in the ACL, as part of a direct permission grant or as part of
             * a role.
             */
            @JsonProperty("remove_acls")
            fun removeAcls(removeAcls: List<RemoveAcl>) = apply { this.removeAcls = removeAcls }

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

            fun build(): AclBatchUpdateBody =
                AclBatchUpdateBody(
                    addAcls?.toImmutable(),
                    removeAcls?.toImmutable(),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AclBatchUpdateBody && this.addAcls == other.addAcls && this.removeAcls == other.removeAcls && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(addAcls, removeAcls, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "AclBatchUpdateBody{addAcls=$addAcls, removeAcls=$removeAcls, additionalProperties=$additionalProperties}"
    }

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AclBatchUpdateParams && this.addAcls == other.addAcls && this.removeAcls == other.removeAcls && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(addAcls, removeAcls, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "AclBatchUpdateParams{addAcls=$addAcls, removeAcls=$removeAcls, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var addAcls: MutableList<AddAcl> = mutableListOf()
        private var removeAcls: MutableList<RemoveAcl> = mutableListOf()
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(aclBatchUpdateParams: AclBatchUpdateParams) = apply {
            this.addAcls(aclBatchUpdateParams.addAcls ?: listOf())
            this.removeAcls(aclBatchUpdateParams.removeAcls ?: listOf())
            additionalHeaders(aclBatchUpdateParams.additionalHeaders)
            additionalQueryParams(aclBatchUpdateParams.additionalQueryParams)
            additionalBodyProperties(aclBatchUpdateParams.additionalBodyProperties)
        }

        /**
         * An ACL grants a certain permission or role to a certain user or group on an object.
         *
         * ACLs are inherited across the object hierarchy. So for example, if a user has read
         * permissions on a project, they will also have read permissions on any experiment,
         * dataset, etc. created within that project.
         *
         * To restrict a grant to a particular sub-object, you may specify `restrict_object_type` in
         * the ACL, as part of a direct permission grant or as part of a role.
         */
        fun addAcls(addAcls: List<AddAcl>) = apply {
            this.addAcls.clear()
            this.addAcls.addAll(addAcls)
        }

        /**
         * An ACL grants a certain permission or role to a certain user or group on an object.
         *
         * ACLs are inherited across the object hierarchy. So for example, if a user has read
         * permissions on a project, they will also have read permissions on any experiment,
         * dataset, etc. created within that project.
         *
         * To restrict a grant to a particular sub-object, you may specify `restrict_object_type` in
         * the ACL, as part of a direct permission grant or as part of a role.
         */
        fun addAddAcl(addAcl: AddAcl) = apply { this.addAcls.add(addAcl) }

        /**
         * An ACL grants a certain permission or role to a certain user or group on an object.
         *
         * ACLs are inherited across the object hierarchy. So for example, if a user has read
         * permissions on a project, they will also have read permissions on any experiment,
         * dataset, etc. created within that project.
         *
         * To restrict a grant to a particular sub-object, you may specify `restrict_object_type` in
         * the ACL, as part of a direct permission grant or as part of a role.
         */
        fun removeAcls(removeAcls: List<RemoveAcl>) = apply {
            this.removeAcls.clear()
            this.removeAcls.addAll(removeAcls)
        }

        /**
         * An ACL grants a certain permission or role to a certain user or group on an object.
         *
         * ACLs are inherited across the object hierarchy. So for example, if a user has read
         * permissions on a project, they will also have read permissions on any experiment,
         * dataset, etc. created within that project.
         *
         * To restrict a grant to a particular sub-object, you may specify `restrict_object_type` in
         * the ACL, as part of a direct permission grant or as part of a role.
         */
        fun addRemoveAcl(removeAcl: RemoveAcl) = apply { this.removeAcls.add(removeAcl) }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.putAll(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(::putAdditionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replaceValues(name, listOf(value))
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replaceValues(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(::replaceAdditionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.removeAll(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            names.forEach(::removeAdditionalHeaders)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.putAll(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                additionalQueryParams.forEach(::putAdditionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replaceValues(key, listOf(value))
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replaceValues(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                additionalQueryParams.forEach(::replaceAdditionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply {
            additionalQueryParams.removeAll(key)
        }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalQueryParams)
        }

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

        fun build(): AclBatchUpdateParams =
            AclBatchUpdateParams(
                if (addAcls.size == 0) null else addAcls.toImmutable(),
                if (removeAcls.size == 0) null else removeAcls.toImmutable(),
                additionalHeaders
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalQueryParams
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalBodyProperties.toImmutable(),
            )
    }

    /**
     * An ACL grants a certain permission or role to a certain user or group on an object.
     *
     * ACLs are inherited across the object hierarchy. So for example, if a user has read
     * permissions on a project, they will also have read permissions on any experiment, dataset,
     * etc. created within that project.
     *
     * To restrict a grant to a particular sub-object, you may specify `restrict_object_type` in the
     * ACL, as part of a direct permission grant or as part of a role.
     */
    @JsonDeserialize(builder = AddAcl.Builder::class)
    @NoAutoDetect
    class AddAcl
    private constructor(
        private val objectType: ObjectType?,
        private val objectId: String?,
        private val userId: String?,
        private val groupId: String?,
        private val permission: Permission?,
        private val restrictObjectType: RestrictObjectType?,
        private val roleId: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The object type that the ACL applies to */
        @JsonProperty("object_type") fun objectType(): ObjectType? = objectType

        /** The id of the object the ACL applies to */
        @JsonProperty("object_id") fun objectId(): String? = objectId

        /**
         * Id of the user the ACL applies to. Exactly one of `user_id` and `group_id` will be
         * provided
         */
        @JsonProperty("user_id") fun userId(): String? = userId

        /**
         * Id of the group the ACL applies to. Exactly one of `user_id` and `group_id` will be
         * provided
         */
        @JsonProperty("group_id") fun groupId(): String? = groupId

        /**
         * Each permission permits a certain type of operation on an object in the system
         *
         * Permissions can be assigned to to objects on an individual basis, or grouped into roles
         */
        @JsonProperty("permission") fun permission(): Permission? = permission

        /** The object type that the ACL applies to */
        @JsonProperty("restrict_object_type")
        fun restrictObjectType(): RestrictObjectType? = restrictObjectType

        /**
         * Id of the role the ACL grants. Exactly one of `permission` and `role_id` will be provided
         */
        @JsonProperty("role_id") fun roleId(): String? = roleId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var objectType: ObjectType? = null
            private var objectId: String? = null
            private var userId: String? = null
            private var groupId: String? = null
            private var permission: Permission? = null
            private var restrictObjectType: RestrictObjectType? = null
            private var roleId: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(addAcl: AddAcl) = apply {
                this.objectType = addAcl.objectType
                this.objectId = addAcl.objectId
                this.userId = addAcl.userId
                this.groupId = addAcl.groupId
                this.permission = addAcl.permission
                this.restrictObjectType = addAcl.restrictObjectType
                this.roleId = addAcl.roleId
                additionalProperties(addAcl.additionalProperties)
            }

            /** The object type that the ACL applies to */
            @JsonProperty("object_type")
            fun objectType(objectType: ObjectType) = apply { this.objectType = objectType }

            /** The id of the object the ACL applies to */
            @JsonProperty("object_id")
            fun objectId(objectId: String) = apply { this.objectId = objectId }

            /**
             * Id of the user the ACL applies to. Exactly one of `user_id` and `group_id` will be
             * provided
             */
            @JsonProperty("user_id") fun userId(userId: String) = apply { this.userId = userId }

            /**
             * Id of the group the ACL applies to. Exactly one of `user_id` and `group_id` will be
             * provided
             */
            @JsonProperty("group_id")
            fun groupId(groupId: String) = apply { this.groupId = groupId }

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

            /**
             * Id of the role the ACL grants. Exactly one of `permission` and `role_id` will be
             * provided
             */
            @JsonProperty("role_id") fun roleId(roleId: String) = apply { this.roleId = roleId }

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

            fun build(): AddAcl =
                AddAcl(
                    checkNotNull(objectType) { "`objectType` is required but was not set" },
                    checkNotNull(objectId) { "`objectId` is required but was not set" },
                    userId,
                    groupId,
                    permission,
                    restrictObjectType,
                    roleId,
                    additionalProperties.toImmutable(),
                )
        }

        class ObjectType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ObjectType && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val ORGANIZATION = ObjectType(JsonField.of("organization"))

                @JvmField val PROJECT = ObjectType(JsonField.of("project"))

                @JvmField val EXPERIMENT = ObjectType(JsonField.of("experiment"))

                @JvmField val DATASET = ObjectType(JsonField.of("dataset"))

                @JvmField val PROMPT = ObjectType(JsonField.of("prompt"))

                @JvmField val PROMPT_SESSION = ObjectType(JsonField.of("prompt_session"))

                @JvmField val GROUP = ObjectType(JsonField.of("group"))

                @JvmField val ROLE = ObjectType(JsonField.of("role"))

                @JvmField val ORG_MEMBER = ObjectType(JsonField.of("org_member"))

                @JvmField val PROJECT_LOG = ObjectType(JsonField.of("project_log"))

                @JvmField val ORG_PROJECT = ObjectType(JsonField.of("org_project"))

                @JvmStatic fun of(value: String) = ObjectType(JsonField.of(value))
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
                    else -> throw BraintrustInvalidDataException("Unknown ObjectType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
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

                return /* spotless:off */ other is Permission && this.value == other.value /* spotless:on */
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

                return /* spotless:off */ other is RestrictObjectType && this.value == other.value /* spotless:on */
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

            return /* spotless:off */ other is AddAcl && this.objectType == other.objectType && this.objectId == other.objectId && this.userId == other.userId && this.groupId == other.groupId && this.permission == other.permission && this.restrictObjectType == other.restrictObjectType && this.roleId == other.roleId && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(objectType, objectId, userId, groupId, permission, restrictObjectType, roleId, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "AddAcl{objectType=$objectType, objectId=$objectId, userId=$userId, groupId=$groupId, permission=$permission, restrictObjectType=$restrictObjectType, roleId=$roleId, additionalProperties=$additionalProperties}"
    }

    /**
     * An ACL grants a certain permission or role to a certain user or group on an object.
     *
     * ACLs are inherited across the object hierarchy. So for example, if a user has read
     * permissions on a project, they will also have read permissions on any experiment, dataset,
     * etc. created within that project.
     *
     * To restrict a grant to a particular sub-object, you may specify `restrict_object_type` in the
     * ACL, as part of a direct permission grant or as part of a role.
     */
    @JsonDeserialize(builder = RemoveAcl.Builder::class)
    @NoAutoDetect
    class RemoveAcl
    private constructor(
        private val objectType: ObjectType?,
        private val objectId: String?,
        private val userId: String?,
        private val groupId: String?,
        private val permission: Permission?,
        private val restrictObjectType: RestrictObjectType?,
        private val roleId: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The object type that the ACL applies to */
        @JsonProperty("object_type") fun objectType(): ObjectType? = objectType

        /** The id of the object the ACL applies to */
        @JsonProperty("object_id") fun objectId(): String? = objectId

        /**
         * Id of the user the ACL applies to. Exactly one of `user_id` and `group_id` will be
         * provided
         */
        @JsonProperty("user_id") fun userId(): String? = userId

        /**
         * Id of the group the ACL applies to. Exactly one of `user_id` and `group_id` will be
         * provided
         */
        @JsonProperty("group_id") fun groupId(): String? = groupId

        /**
         * Each permission permits a certain type of operation on an object in the system
         *
         * Permissions can be assigned to to objects on an individual basis, or grouped into roles
         */
        @JsonProperty("permission") fun permission(): Permission? = permission

        /** The object type that the ACL applies to */
        @JsonProperty("restrict_object_type")
        fun restrictObjectType(): RestrictObjectType? = restrictObjectType

        /**
         * Id of the role the ACL grants. Exactly one of `permission` and `role_id` will be provided
         */
        @JsonProperty("role_id") fun roleId(): String? = roleId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var objectType: ObjectType? = null
            private var objectId: String? = null
            private var userId: String? = null
            private var groupId: String? = null
            private var permission: Permission? = null
            private var restrictObjectType: RestrictObjectType? = null
            private var roleId: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(removeAcl: RemoveAcl) = apply {
                this.objectType = removeAcl.objectType
                this.objectId = removeAcl.objectId
                this.userId = removeAcl.userId
                this.groupId = removeAcl.groupId
                this.permission = removeAcl.permission
                this.restrictObjectType = removeAcl.restrictObjectType
                this.roleId = removeAcl.roleId
                additionalProperties(removeAcl.additionalProperties)
            }

            /** The object type that the ACL applies to */
            @JsonProperty("object_type")
            fun objectType(objectType: ObjectType) = apply { this.objectType = objectType }

            /** The id of the object the ACL applies to */
            @JsonProperty("object_id")
            fun objectId(objectId: String) = apply { this.objectId = objectId }

            /**
             * Id of the user the ACL applies to. Exactly one of `user_id` and `group_id` will be
             * provided
             */
            @JsonProperty("user_id") fun userId(userId: String) = apply { this.userId = userId }

            /**
             * Id of the group the ACL applies to. Exactly one of `user_id` and `group_id` will be
             * provided
             */
            @JsonProperty("group_id")
            fun groupId(groupId: String) = apply { this.groupId = groupId }

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

            /**
             * Id of the role the ACL grants. Exactly one of `permission` and `role_id` will be
             * provided
             */
            @JsonProperty("role_id") fun roleId(roleId: String) = apply { this.roleId = roleId }

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

            fun build(): RemoveAcl =
                RemoveAcl(
                    checkNotNull(objectType) { "`objectType` is required but was not set" },
                    checkNotNull(objectId) { "`objectId` is required but was not set" },
                    userId,
                    groupId,
                    permission,
                    restrictObjectType,
                    roleId,
                    additionalProperties.toImmutable(),
                )
        }

        class ObjectType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ObjectType && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val ORGANIZATION = ObjectType(JsonField.of("organization"))

                @JvmField val PROJECT = ObjectType(JsonField.of("project"))

                @JvmField val EXPERIMENT = ObjectType(JsonField.of("experiment"))

                @JvmField val DATASET = ObjectType(JsonField.of("dataset"))

                @JvmField val PROMPT = ObjectType(JsonField.of("prompt"))

                @JvmField val PROMPT_SESSION = ObjectType(JsonField.of("prompt_session"))

                @JvmField val GROUP = ObjectType(JsonField.of("group"))

                @JvmField val ROLE = ObjectType(JsonField.of("role"))

                @JvmField val ORG_MEMBER = ObjectType(JsonField.of("org_member"))

                @JvmField val PROJECT_LOG = ObjectType(JsonField.of("project_log"))

                @JvmField val ORG_PROJECT = ObjectType(JsonField.of("org_project"))

                @JvmStatic fun of(value: String) = ObjectType(JsonField.of(value))
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
                    else -> throw BraintrustInvalidDataException("Unknown ObjectType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
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

                return /* spotless:off */ other is Permission && this.value == other.value /* spotless:on */
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

                return /* spotless:off */ other is RestrictObjectType && this.value == other.value /* spotless:on */
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

            return /* spotless:off */ other is RemoveAcl && this.objectType == other.objectType && this.objectId == other.objectId && this.userId == other.userId && this.groupId == other.groupId && this.permission == other.permission && this.restrictObjectType == other.restrictObjectType && this.roleId == other.roleId && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(objectType, objectId, userId, groupId, permission, restrictObjectType, roleId, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "RemoveAcl{objectType=$objectType, objectId=$objectId, userId=$userId, groupId=$groupId, permission=$permission, restrictObjectType=$restrictObjectType, roleId=$roleId, additionalProperties=$additionalProperties}"
    }
}
