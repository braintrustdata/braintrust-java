// File generated from our OpenAPI spec by Stainless.

package com.braintrust.api.models

import com.braintrust.api.core.BaseDeserializer
import com.braintrust.api.core.BaseSerializer
import com.braintrust.api.core.Enum
import com.braintrust.api.core.ExcludeMissing
import com.braintrust.api.core.JsonField
import com.braintrust.api.core.JsonValue
import com.braintrust.api.core.NoAutoDetect
import com.braintrust.api.core.getOrThrow
import com.braintrust.api.core.toUnmodifiable
import com.braintrust.api.errors.BraintrustInvalidDataException
import com.braintrust.api.models.*
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.util.Objects
import java.util.Optional

class AclCreateParams
constructor(
    private val objectId: String,
    private val objectType: ObjectType,
    private val groupId: String?,
    private val permission: Permission?,
    private val restrictObjectType: RestrictObjectType?,
    private val roleId: String?,
    private val userId: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun objectId(): String = objectId

    fun objectType(): ObjectType = objectType

    fun groupId(): Optional<String> = Optional.ofNullable(groupId)

    fun permission(): Optional<Permission> = Optional.ofNullable(permission)

    fun restrictObjectType(): Optional<RestrictObjectType> = Optional.ofNullable(restrictObjectType)

    fun roleId(): Optional<String> = Optional.ofNullable(roleId)

    fun userId(): Optional<String> = Optional.ofNullable(userId)

    @JvmSynthetic
    internal fun getBody(): AclCreateBody {
        return AclCreateBody(
            objectId,
            objectType,
            groupId,
            permission,
            restrictObjectType,
            roleId,
            userId,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    /**
     * An ACL grants a certain permission or role to a certain user or group on an object.
     *
     * ACLs are inherited across the object hierarchy. So for example, if a user has read
     * permissions on a project, they will also have read permissions on any experiment, dataset,
     * etc. created within that project.
     *
     * To restrict a grant to a particular sub-object, you may specify `restrict_object_type` in the
     * ACL.
     */
    @JsonDeserialize(builder = AclCreateBody.Builder::class)
    @NoAutoDetect
    class AclCreateBody
    internal constructor(
        private val objectId: String?,
        private val objectType: ObjectType?,
        private val groupId: String?,
        private val permission: Permission?,
        private val restrictObjectType: RestrictObjectType?,
        private val roleId: String?,
        private val userId: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** The id of the object the ACL applies to */
        @JsonProperty("object_id") fun objectId(): String? = objectId

        /** The object type that the ACL applies to */
        @JsonProperty("object_type") fun objectType(): ObjectType? = objectType

        /**
         * Id of the group the ACL applies to. Exactly one of `user_id` and `group_id` will be
         * provided
         */
        @JsonProperty("group_id") fun groupId(): String? = groupId

        /** Permission the ACL grants. Exactly one of `permission` and `role_id` will be provided */
        @JsonProperty("permission") fun permission(): Permission? = permission

        /** Optionally restricts the permission grant to just the specified object type */
        @JsonProperty("restrict_object_type")
        fun restrictObjectType(): RestrictObjectType? = restrictObjectType

        /**
         * Id of the role the ACL grants. Exactly one of `permission` and `role_id` will be provided
         */
        @JsonProperty("role_id") fun roleId(): String? = roleId

        /**
         * Id of the user the ACL applies to. Exactly one of `user_id` and `group_id` will be
         * provided
         */
        @JsonProperty("user_id") fun userId(): String? = userId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AclCreateBody &&
                this.objectId == other.objectId &&
                this.objectType == other.objectType &&
                this.groupId == other.groupId &&
                this.permission == other.permission &&
                this.restrictObjectType == other.restrictObjectType &&
                this.roleId == other.roleId &&
                this.userId == other.userId &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        objectId,
                        objectType,
                        groupId,
                        permission,
                        restrictObjectType,
                        roleId,
                        userId,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "AclCreateBody{objectId=$objectId, objectType=$objectType, groupId=$groupId, permission=$permission, restrictObjectType=$restrictObjectType, roleId=$roleId, userId=$userId, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var objectId: String? = null
            private var objectType: ObjectType? = null
            private var groupId: String? = null
            private var permission: Permission? = null
            private var restrictObjectType: RestrictObjectType? = null
            private var roleId: String? = null
            private var userId: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(aclCreateBody: AclCreateBody) = apply {
                this.objectId = aclCreateBody.objectId
                this.objectType = aclCreateBody.objectType
                this.groupId = aclCreateBody.groupId
                this.permission = aclCreateBody.permission
                this.restrictObjectType = aclCreateBody.restrictObjectType
                this.roleId = aclCreateBody.roleId
                this.userId = aclCreateBody.userId
                additionalProperties(aclCreateBody.additionalProperties)
            }

            /** The id of the object the ACL applies to */
            @JsonProperty("object_id")
            fun objectId(objectId: String) = apply { this.objectId = objectId }

            /** The object type that the ACL applies to */
            @JsonProperty("object_type")
            fun objectType(objectType: ObjectType) = apply { this.objectType = objectType }

            /**
             * Id of the group the ACL applies to. Exactly one of `user_id` and `group_id` will be
             * provided
             */
            @JsonProperty("group_id")
            fun groupId(groupId: String) = apply { this.groupId = groupId }

            /**
             * Permission the ACL grants. Exactly one of `permission` and `role_id` will be provided
             */
            @JsonProperty("permission")
            fun permission(permission: Permission) = apply { this.permission = permission }

            /** Optionally restricts the permission grant to just the specified object type */
            @JsonProperty("restrict_object_type")
            fun restrictObjectType(restrictObjectType: RestrictObjectType) = apply {
                this.restrictObjectType = restrictObjectType
            }

            /**
             * Id of the role the ACL grants. Exactly one of `permission` and `role_id` will be
             * provided
             */
            @JsonProperty("role_id") fun roleId(roleId: String) = apply { this.roleId = roleId }

            /**
             * Id of the user the ACL applies to. Exactly one of `user_id` and `group_id` will be
             * provided
             */
            @JsonProperty("user_id") fun userId(userId: String) = apply { this.userId = userId }

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

            fun build(): AclCreateBody =
                AclCreateBody(
                    checkNotNull(objectId) { "`objectId` is required but was not set" },
                    checkNotNull(objectType) { "`objectType` is required but was not set" },
                    groupId,
                    permission,
                    restrictObjectType,
                    roleId,
                    userId,
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

        return other is AclCreateParams &&
            this.objectId == other.objectId &&
            this.objectType == other.objectType &&
            this.groupId == other.groupId &&
            this.permission == other.permission &&
            this.restrictObjectType == other.restrictObjectType &&
            this.roleId == other.roleId &&
            this.userId == other.userId &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            objectId,
            objectType,
            groupId,
            permission,
            restrictObjectType,
            roleId,
            userId,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "AclCreateParams{objectId=$objectId, objectType=$objectType, groupId=$groupId, permission=$permission, restrictObjectType=$restrictObjectType, roleId=$roleId, userId=$userId, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var objectId: String? = null
        private var objectType: ObjectType? = null
        private var groupId: String? = null
        private var permission: Permission? = null
        private var restrictObjectType: RestrictObjectType? = null
        private var roleId: String? = null
        private var userId: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(aclCreateParams: AclCreateParams) = apply {
            this.objectId = aclCreateParams.objectId
            this.objectType = aclCreateParams.objectType
            this.groupId = aclCreateParams.groupId
            this.permission = aclCreateParams.permission
            this.restrictObjectType = aclCreateParams.restrictObjectType
            this.roleId = aclCreateParams.roleId
            this.userId = aclCreateParams.userId
            additionalQueryParams(aclCreateParams.additionalQueryParams)
            additionalHeaders(aclCreateParams.additionalHeaders)
            additionalBodyProperties(aclCreateParams.additionalBodyProperties)
        }

        /** The id of the object the ACL applies to */
        fun objectId(objectId: String) = apply { this.objectId = objectId }

        /** The object type that the ACL applies to */
        fun objectType(objectType: ObjectType) = apply { this.objectType = objectType }

        /**
         * Id of the group the ACL applies to. Exactly one of `user_id` and `group_id` will be
         * provided
         */
        fun groupId(groupId: String) = apply { this.groupId = groupId }

        /** Permission the ACL grants. Exactly one of `permission` and `role_id` will be provided */
        fun permission(permission: Permission) = apply { this.permission = permission }

        /** Permission the ACL grants. Exactly one of `permission` and `role_id` will be provided */
        fun permission(unionMember0: Permission.UnionMember0) = apply {
            this.permission = Permission.ofUnionMember0(unionMember0)
        }

        /** Permission the ACL grants. Exactly one of `permission` and `role_id` will be provided */
        fun permission(unionMember1: UnionMember1) = apply {
            this.permission = Permission.ofUnionMember1(unionMember1)
        }

        /** Optionally restricts the permission grant to just the specified object type */
        fun restrictObjectType(restrictObjectType: RestrictObjectType) = apply {
            this.restrictObjectType = restrictObjectType
        }

        /** Optionally restricts the permission grant to just the specified object type */
        fun restrictObjectType(unionMember0: RestrictObjectType.UnionMember0) = apply {
            this.restrictObjectType = RestrictObjectType.ofUnionMember0(unionMember0)
        }

        /** Optionally restricts the permission grant to just the specified object type */
        fun restrictObjectType(unionMember1: UnionMember1) = apply {
            this.restrictObjectType = RestrictObjectType.ofUnionMember1(unionMember1)
        }

        /**
         * Id of the role the ACL grants. Exactly one of `permission` and `role_id` will be provided
         */
        fun roleId(roleId: String) = apply { this.roleId = roleId }

        /**
         * Id of the user the ACL applies to. Exactly one of `user_id` and `group_id` will be
         * provided
         */
        fun userId(userId: String) = apply { this.userId = userId }

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

        fun build(): AclCreateParams =
            AclCreateParams(
                checkNotNull(objectId) { "`objectId` is required but was not set" },
                checkNotNull(objectType) { "`objectType` is required but was not set" },
                groupId,
                permission,
                restrictObjectType,
                roleId,
                userId,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
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

            return other is ObjectType && this.value == other.value
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

            @JvmField val PROJECT_SCORE = ObjectType(JsonField.of("project_score"))

            @JvmField val PROJECT_TAG = ObjectType(JsonField.of("project_tag"))

            @JvmField val GROUP = ObjectType(JsonField.of("group"))

            @JvmField val ROLE = ObjectType(JsonField.of("role"))

            @JvmStatic fun of(value: String) = ObjectType(JsonField.of(value))
        }

        enum class Known {
            ORGANIZATION,
            PROJECT,
            EXPERIMENT,
            DATASET,
            PROMPT,
            PROMPT_SESSION,
            PROJECT_SCORE,
            PROJECT_TAG,
            GROUP,
            ROLE,
        }

        enum class Value {
            ORGANIZATION,
            PROJECT,
            EXPERIMENT,
            DATASET,
            PROMPT,
            PROMPT_SESSION,
            PROJECT_SCORE,
            PROJECT_TAG,
            GROUP,
            ROLE,
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
                PROJECT_SCORE -> Value.PROJECT_SCORE
                PROJECT_TAG -> Value.PROJECT_TAG
                GROUP -> Value.GROUP
                ROLE -> Value.ROLE
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
                PROJECT_SCORE -> Known.PROJECT_SCORE
                PROJECT_TAG -> Known.PROJECT_TAG
                GROUP -> Known.GROUP
                ROLE -> Known.ROLE
                else -> throw BraintrustInvalidDataException("Unknown ObjectType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    @JsonDeserialize(using = Permission.Deserializer::class)
    @JsonSerialize(using = Permission.Serializer::class)
    class Permission
    private constructor(
        private val unionMember0: UnionMember0? = null,
        private val unionMember1: UnionMember1? = null,
        private val _json: JsonValue? = null,
    ) {

        private var validated: Boolean = false

        /**
         * Each permission permits a certain type of operation on an object in the system
         *
         * Permissions can be assigned to to objects on an individual basis, or grouped into roles
         */
        fun unionMember0(): Optional<UnionMember0> = Optional.ofNullable(unionMember0)

        fun unionMember1(): Optional<UnionMember1> = Optional.ofNullable(unionMember1)

        fun isUnionMember0(): Boolean = unionMember0 != null

        fun isUnionMember1(): Boolean = unionMember1 != null

        fun asUnionMember0(): UnionMember0 = unionMember0.getOrThrow("unionMember0")

        fun asUnionMember1(): UnionMember1 = unionMember1.getOrThrow("unionMember1")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                unionMember0 != null -> visitor.visitUnionMember0(unionMember0)
                unionMember1 != null -> visitor.visitUnionMember1(unionMember1)
                else -> visitor.unknown(_json)
            }
        }

        fun validate(): Permission = apply {
            if (!validated) {
                if (unionMember0 == null && unionMember1 == null) {
                    throw BraintrustInvalidDataException("Unknown Permission: $_json")
                }
                unionMember1?.validate()
                validated = true
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Permission &&
                this.unionMember0 == other.unionMember0 &&
                this.unionMember1 == other.unionMember1
        }

        override fun hashCode(): Int {
            return Objects.hash(unionMember0, unionMember1)
        }

        override fun toString(): String {
            return when {
                unionMember0 != null -> "Permission{unionMember0=$unionMember0}"
                unionMember1 != null -> "Permission{unionMember1=$unionMember1}"
                _json != null -> "Permission{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Permission")
            }
        }

        companion object {

            @JvmStatic
            fun ofUnionMember0(unionMember0: UnionMember0) = Permission(unionMember0 = unionMember0)

            @JvmStatic
            fun ofUnionMember1(unionMember1: UnionMember1) = Permission(unionMember1 = unionMember1)
        }

        interface Visitor<out T> {

            fun visitUnionMember0(unionMember0: UnionMember0): T

            fun visitUnionMember1(unionMember1: UnionMember1): T

            fun unknown(json: JsonValue?): T {
                throw BraintrustInvalidDataException("Unknown Permission: $json")
            }
        }

        class Deserializer : BaseDeserializer<Permission>(Permission::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Permission {
                val json = JsonValue.fromJsonNode(node)
                tryDeserialize(node, jacksonTypeRef<UnionMember0>())?.let {
                    return Permission(unionMember0 = it, _json = json)
                }
                tryDeserialize(node, jacksonTypeRef<UnionMember1>()) { it.validate() }
                    ?.let {
                        return Permission(unionMember1 = it, _json = json)
                    }

                return Permission(_json = json)
            }
        }

        class Serializer : BaseSerializer<Permission>(Permission::class) {

            override fun serialize(
                value: Permission,
                generator: JsonGenerator,
                provider: SerializerProvider
            ) {
                when {
                    value.unionMember0 != null -> generator.writeObject(value.unionMember0)
                    value.unionMember1 != null -> generator.writeObject(value.unionMember1)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Permission")
                }
            }
        }

        class UnionMember0
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is UnionMember0 && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val CREATE = UnionMember0(JsonField.of("create"))

                @JvmField val READ = UnionMember0(JsonField.of("read"))

                @JvmField val UPDATE = UnionMember0(JsonField.of("update"))

                @JvmField val DELETE = UnionMember0(JsonField.of("delete"))

                @JvmField val CREATE_ACLS = UnionMember0(JsonField.of("create_acls"))

                @JvmField val READ_ACLS = UnionMember0(JsonField.of("read_acls"))

                @JvmField val UPDATE_ACLS = UnionMember0(JsonField.of("update_acls"))

                @JvmField val DELETE_ACLS = UnionMember0(JsonField.of("delete_acls"))

                @JvmStatic fun of(value: String) = UnionMember0(JsonField.of(value))
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
                    else -> throw BraintrustInvalidDataException("Unknown UnionMember0: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        @JsonDeserialize(builder = UnionMember1.Builder::class)
        @NoAutoDetect
        class UnionMember1
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): UnionMember1 = apply {
                if (!validated) {
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is UnionMember1 &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = Objects.hash(additionalProperties)
                }
                return hashCode
            }

            override fun toString() = "UnionMember1{additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(unionMember1: UnionMember1) = apply {
                    additionalProperties(unionMember1.additionalProperties)
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): UnionMember1 = UnionMember1(additionalProperties.toUnmodifiable())
            }
        }
    }

    @JsonDeserialize(using = RestrictObjectType.Deserializer::class)
    @JsonSerialize(using = RestrictObjectType.Serializer::class)
    class RestrictObjectType
    private constructor(
        private val unionMember0: UnionMember0? = null,
        private val unionMember1: UnionMember1? = null,
        private val _json: JsonValue? = null,
    ) {

        private var validated: Boolean = false

        /** The object type that the ACL applies to */
        fun unionMember0(): Optional<UnionMember0> = Optional.ofNullable(unionMember0)

        fun unionMember1(): Optional<UnionMember1> = Optional.ofNullable(unionMember1)

        fun isUnionMember0(): Boolean = unionMember0 != null

        fun isUnionMember1(): Boolean = unionMember1 != null

        fun asUnionMember0(): UnionMember0 = unionMember0.getOrThrow("unionMember0")

        fun asUnionMember1(): UnionMember1 = unionMember1.getOrThrow("unionMember1")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                unionMember0 != null -> visitor.visitUnionMember0(unionMember0)
                unionMember1 != null -> visitor.visitUnionMember1(unionMember1)
                else -> visitor.unknown(_json)
            }
        }

        fun validate(): RestrictObjectType = apply {
            if (!validated) {
                if (unionMember0 == null && unionMember1 == null) {
                    throw BraintrustInvalidDataException("Unknown RestrictObjectType: $_json")
                }
                unionMember1?.validate()
                validated = true
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is RestrictObjectType &&
                this.unionMember0 == other.unionMember0 &&
                this.unionMember1 == other.unionMember1
        }

        override fun hashCode(): Int {
            return Objects.hash(unionMember0, unionMember1)
        }

        override fun toString(): String {
            return when {
                unionMember0 != null -> "RestrictObjectType{unionMember0=$unionMember0}"
                unionMember1 != null -> "RestrictObjectType{unionMember1=$unionMember1}"
                _json != null -> "RestrictObjectType{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid RestrictObjectType")
            }
        }

        companion object {

            @JvmStatic
            fun ofUnionMember0(unionMember0: UnionMember0) =
                RestrictObjectType(unionMember0 = unionMember0)

            @JvmStatic
            fun ofUnionMember1(unionMember1: UnionMember1) =
                RestrictObjectType(unionMember1 = unionMember1)
        }

        interface Visitor<out T> {

            fun visitUnionMember0(unionMember0: UnionMember0): T

            fun visitUnionMember1(unionMember1: UnionMember1): T

            fun unknown(json: JsonValue?): T {
                throw BraintrustInvalidDataException("Unknown RestrictObjectType: $json")
            }
        }

        class Deserializer : BaseDeserializer<RestrictObjectType>(RestrictObjectType::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): RestrictObjectType {
                val json = JsonValue.fromJsonNode(node)
                tryDeserialize(node, jacksonTypeRef<UnionMember0>())?.let {
                    return RestrictObjectType(unionMember0 = it, _json = json)
                }
                tryDeserialize(node, jacksonTypeRef<UnionMember1>()) { it.validate() }
                    ?.let {
                        return RestrictObjectType(unionMember1 = it, _json = json)
                    }

                return RestrictObjectType(_json = json)
            }
        }

        class Serializer : BaseSerializer<RestrictObjectType>(RestrictObjectType::class) {

            override fun serialize(
                value: RestrictObjectType,
                generator: JsonGenerator,
                provider: SerializerProvider
            ) {
                when {
                    value.unionMember0 != null -> generator.writeObject(value.unionMember0)
                    value.unionMember1 != null -> generator.writeObject(value.unionMember1)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid RestrictObjectType")
                }
            }
        }

        class UnionMember0
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is UnionMember0 && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val ORGANIZATION = UnionMember0(JsonField.of("organization"))

                @JvmField val PROJECT = UnionMember0(JsonField.of("project"))

                @JvmField val EXPERIMENT = UnionMember0(JsonField.of("experiment"))

                @JvmField val DATASET = UnionMember0(JsonField.of("dataset"))

                @JvmField val PROMPT = UnionMember0(JsonField.of("prompt"))

                @JvmField val PROMPT_SESSION = UnionMember0(JsonField.of("prompt_session"))

                @JvmField val PROJECT_SCORE = UnionMember0(JsonField.of("project_score"))

                @JvmField val PROJECT_TAG = UnionMember0(JsonField.of("project_tag"))

                @JvmField val GROUP = UnionMember0(JsonField.of("group"))

                @JvmField val ROLE = UnionMember0(JsonField.of("role"))

                @JvmStatic fun of(value: String) = UnionMember0(JsonField.of(value))
            }

            enum class Known {
                ORGANIZATION,
                PROJECT,
                EXPERIMENT,
                DATASET,
                PROMPT,
                PROMPT_SESSION,
                PROJECT_SCORE,
                PROJECT_TAG,
                GROUP,
                ROLE,
            }

            enum class Value {
                ORGANIZATION,
                PROJECT,
                EXPERIMENT,
                DATASET,
                PROMPT,
                PROMPT_SESSION,
                PROJECT_SCORE,
                PROJECT_TAG,
                GROUP,
                ROLE,
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
                    PROJECT_SCORE -> Value.PROJECT_SCORE
                    PROJECT_TAG -> Value.PROJECT_TAG
                    GROUP -> Value.GROUP
                    ROLE -> Value.ROLE
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
                    PROJECT_SCORE -> Known.PROJECT_SCORE
                    PROJECT_TAG -> Known.PROJECT_TAG
                    GROUP -> Known.GROUP
                    ROLE -> Known.ROLE
                    else -> throw BraintrustInvalidDataException("Unknown UnionMember0: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        @JsonDeserialize(builder = UnionMember1.Builder::class)
        @NoAutoDetect
        class UnionMember1
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): UnionMember1 = apply {
                if (!validated) {
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is UnionMember1 &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = Objects.hash(additionalProperties)
                }
                return hashCode
            }

            override fun toString() = "UnionMember1{additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(unionMember1: UnionMember1) = apply {
                    additionalProperties(unionMember1.additionalProperties)
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): UnionMember1 = UnionMember1(additionalProperties.toUnmodifiable())
            }
        }
    }
}
