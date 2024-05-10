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
    private val createUserPermissionAcl: CreateUserPermissionAcl?,
    private val createUserRoleAcl: CreateUserRoleAcl?,
    private val createGroupPermissionAcl: CreateGroupPermissionAcl?,
    private val createGroupRoleAcl: CreateGroupRoleAcl?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
) {

    fun createUserPermissionAcl(): Optional<CreateUserPermissionAcl> =
        Optional.ofNullable(createUserPermissionAcl)

    fun createUserRoleAcl(): Optional<CreateUserRoleAcl> = Optional.ofNullable(createUserRoleAcl)

    fun createGroupPermissionAcl(): Optional<CreateGroupPermissionAcl> =
        Optional.ofNullable(createGroupPermissionAcl)

    fun createGroupRoleAcl(): Optional<CreateGroupRoleAcl> = Optional.ofNullable(createGroupRoleAcl)

    @JvmSynthetic
    internal fun getBody(): AclCreateBody {
        return AclCreateBody(
            createUserPermissionAcl,
            createUserRoleAcl,
            createGroupPermissionAcl,
            createGroupRoleAcl,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(using = AclCreateBody.Deserializer::class)
    @JsonSerialize(using = AclCreateBody.Serializer::class)
    class AclCreateBody
    internal constructor(
        private val createUserPermissionAcl: CreateUserPermissionAcl? = null,
        private val createUserRoleAcl: CreateUserRoleAcl? = null,
        private val createGroupPermissionAcl: CreateGroupPermissionAcl? = null,
        private val createGroupRoleAcl: CreateGroupRoleAcl? = null,
        private val _json: JsonValue? = null,
    ) {

        fun createUserPermissionAcl(): Optional<CreateUserPermissionAcl> =
            Optional.ofNullable(createUserPermissionAcl)

        fun createUserRoleAcl(): Optional<CreateUserRoleAcl> =
            Optional.ofNullable(createUserRoleAcl)

        fun createGroupPermissionAcl(): Optional<CreateGroupPermissionAcl> =
            Optional.ofNullable(createGroupPermissionAcl)

        fun createGroupRoleAcl(): Optional<CreateGroupRoleAcl> =
            Optional.ofNullable(createGroupRoleAcl)

        fun isCreateUserPermissionAcl(): Boolean = createUserPermissionAcl != null

        fun isCreateUserRoleAcl(): Boolean = createUserRoleAcl != null

        fun isCreateGroupPermissionAcl(): Boolean = createGroupPermissionAcl != null

        fun isCreateGroupRoleAcl(): Boolean = createGroupRoleAcl != null

        fun asCreateUserPermissionAcl(): CreateUserPermissionAcl =
            createUserPermissionAcl.getOrThrow("createUserPermissionAcl")

        fun asCreateUserRoleAcl(): CreateUserRoleAcl =
            createUserRoleAcl.getOrThrow("createUserRoleAcl")

        fun asCreateGroupPermissionAcl(): CreateGroupPermissionAcl =
            createGroupPermissionAcl.getOrThrow("createGroupPermissionAcl")

        fun asCreateGroupRoleAcl(): CreateGroupRoleAcl =
            createGroupRoleAcl.getOrThrow("createGroupRoleAcl")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                createUserPermissionAcl != null ->
                    visitor.visitCreateUserPermissionAcl(createUserPermissionAcl)
                createUserRoleAcl != null -> visitor.visitCreateUserRoleAcl(createUserRoleAcl)
                createGroupPermissionAcl != null ->
                    visitor.visitCreateGroupPermissionAcl(createGroupPermissionAcl)
                createGroupRoleAcl != null -> visitor.visitCreateGroupRoleAcl(createGroupRoleAcl)
                else -> visitor.unknown(_json)
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AclCreateBody &&
                this.createUserPermissionAcl == other.createUserPermissionAcl &&
                this.createUserRoleAcl == other.createUserRoleAcl &&
                this.createGroupPermissionAcl == other.createGroupPermissionAcl &&
                this.createGroupRoleAcl == other.createGroupRoleAcl
        }

        override fun hashCode(): Int {
            return Objects.hash(
                createUserPermissionAcl,
                createUserRoleAcl,
                createGroupPermissionAcl,
                createGroupRoleAcl,
            )
        }

        override fun toString(): String {
            return when {
                createUserPermissionAcl != null ->
                    "AclCreateBody{createUserPermissionAcl=$createUserPermissionAcl}"
                createUserRoleAcl != null -> "AclCreateBody{createUserRoleAcl=$createUserRoleAcl}"
                createGroupPermissionAcl != null ->
                    "AclCreateBody{createGroupPermissionAcl=$createGroupPermissionAcl}"
                createGroupRoleAcl != null ->
                    "AclCreateBody{createGroupRoleAcl=$createGroupRoleAcl}"
                _json != null -> "AclCreateBody{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid AclCreateBody")
            }
        }

        companion object {

            @JvmStatic
            fun ofCreateUserPermissionAcl(createUserPermissionAcl: CreateUserPermissionAcl) =
                AclCreateBody(createUserPermissionAcl = createUserPermissionAcl)

            @JvmStatic
            fun ofCreateUserRoleAcl(createUserRoleAcl: CreateUserRoleAcl) =
                AclCreateBody(createUserRoleAcl = createUserRoleAcl)

            @JvmStatic
            fun ofCreateGroupPermissionAcl(createGroupPermissionAcl: CreateGroupPermissionAcl) =
                AclCreateBody(createGroupPermissionAcl = createGroupPermissionAcl)

            @JvmStatic
            fun ofCreateGroupRoleAcl(createGroupRoleAcl: CreateGroupRoleAcl) =
                AclCreateBody(createGroupRoleAcl = createGroupRoleAcl)
        }

        interface Visitor<out T> {

            fun visitCreateUserPermissionAcl(createUserPermissionAcl: CreateUserPermissionAcl): T

            fun visitCreateUserRoleAcl(createUserRoleAcl: CreateUserRoleAcl): T

            fun visitCreateGroupPermissionAcl(createGroupPermissionAcl: CreateGroupPermissionAcl): T

            fun visitCreateGroupRoleAcl(createGroupRoleAcl: CreateGroupRoleAcl): T

            fun unknown(json: JsonValue?): T {
                throw BraintrustInvalidDataException("Unknown AclCreateBody: $json")
            }
        }

        class Deserializer : BaseDeserializer<AclCreateBody>(AclCreateBody::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): AclCreateBody {
                val json = JsonValue.fromJsonNode(node)
                tryDeserialize(node, jacksonTypeRef<CreateUserPermissionAcl>())?.let {
                    return AclCreateBody(createUserPermissionAcl = it, _json = json)
                }
                tryDeserialize(node, jacksonTypeRef<CreateUserRoleAcl>())?.let {
                    return AclCreateBody(createUserRoleAcl = it, _json = json)
                }
                tryDeserialize(node, jacksonTypeRef<CreateGroupPermissionAcl>())?.let {
                    return AclCreateBody(createGroupPermissionAcl = it, _json = json)
                }
                tryDeserialize(node, jacksonTypeRef<CreateGroupRoleAcl>())?.let {
                    return AclCreateBody(createGroupRoleAcl = it, _json = json)
                }

                return AclCreateBody(_json = json)
            }
        }

        class Serializer : BaseSerializer<AclCreateBody>(AclCreateBody::class) {

            override fun serialize(
                value: AclCreateBody,
                generator: JsonGenerator,
                provider: SerializerProvider
            ) {
                when {
                    value.createUserPermissionAcl != null ->
                        generator.writeObject(value.createUserPermissionAcl)
                    value.createUserRoleAcl != null ->
                        generator.writeObject(value.createUserRoleAcl)
                    value.createGroupPermissionAcl != null ->
                        generator.writeObject(value.createGroupPermissionAcl)
                    value.createGroupRoleAcl != null ->
                        generator.writeObject(value.createGroupRoleAcl)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid AclCreateBody")
                }
            }
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AclCreateParams &&
            this.createUserPermissionAcl == other.createUserPermissionAcl &&
            this.createUserRoleAcl == other.createUserRoleAcl &&
            this.createGroupPermissionAcl == other.createGroupPermissionAcl &&
            this.createGroupRoleAcl == other.createGroupRoleAcl &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders
    }

    override fun hashCode(): Int {
        return Objects.hash(
            createUserPermissionAcl,
            createUserRoleAcl,
            createGroupPermissionAcl,
            createGroupRoleAcl,
            additionalQueryParams,
            additionalHeaders,
        )
    }

    override fun toString() =
        "AclCreateParams{createUserPermissionAcl=$createUserPermissionAcl, createUserRoleAcl=$createUserRoleAcl, createGroupPermissionAcl=$createGroupPermissionAcl, createGroupRoleAcl=$createGroupRoleAcl, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var createUserPermissionAcl: CreateUserPermissionAcl? = null
        private var createUserRoleAcl: CreateUserRoleAcl? = null
        private var createGroupPermissionAcl: CreateGroupPermissionAcl? = null
        private var createGroupRoleAcl: CreateGroupRoleAcl? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

        @JvmSynthetic
        internal fun from(aclCreateParams: AclCreateParams) = apply {
            this.createUserPermissionAcl = aclCreateParams.createUserPermissionAcl
            this.createUserRoleAcl = aclCreateParams.createUserRoleAcl
            this.createGroupPermissionAcl = aclCreateParams.createGroupPermissionAcl
            this.createGroupRoleAcl = aclCreateParams.createGroupRoleAcl
            additionalQueryParams(aclCreateParams.additionalQueryParams)
            additionalHeaders(aclCreateParams.additionalHeaders)
        }

        fun forCreateUserPermissionAcl(createUserPermissionAcl: CreateUserPermissionAcl) = apply {
            this.createUserPermissionAcl = createUserPermissionAcl
            this.createUserRoleAcl = null
            this.createGroupPermissionAcl = null
            this.createGroupRoleAcl = null
        }

        fun forCreateUserRoleAcl(createUserRoleAcl: CreateUserRoleAcl) = apply {
            this.createUserPermissionAcl = null
            this.createUserRoleAcl = createUserRoleAcl
            this.createGroupPermissionAcl = null
            this.createGroupRoleAcl = null
        }

        fun forCreateGroupPermissionAcl(createGroupPermissionAcl: CreateGroupPermissionAcl) =
            apply {
                this.createUserPermissionAcl = null
                this.createUserRoleAcl = null
                this.createGroupPermissionAcl = createGroupPermissionAcl
                this.createGroupRoleAcl = null
            }

        fun forCreateGroupRoleAcl(createGroupRoleAcl: CreateGroupRoleAcl) = apply {
            this.createUserPermissionAcl = null
            this.createUserRoleAcl = null
            this.createGroupPermissionAcl = null
            this.createGroupRoleAcl = createGroupRoleAcl
        }

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

        fun build(): AclCreateParams =
            AclCreateParams(
                createUserPermissionAcl,
                createUserRoleAcl,
                createGroupPermissionAcl,
                createGroupRoleAcl,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            )
    }

    @JsonDeserialize(builder = CreateUserPermissionAcl.Builder::class)
    @NoAutoDetect
    class CreateUserPermissionAcl
    private constructor(
        private val objectType: ObjectType?,
        private val objectId: String?,
        private val restrictObjectType: RestrictObjectType?,
        private val userId: String?,
        private val permission: Permission?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** The object type that the ACL applies to */
        @JsonProperty("object_type") fun objectType(): ObjectType? = objectType

        /** The id of the object the ACL applies to */
        @JsonProperty("object_id") fun objectId(): String? = objectId

        /** Optionally restricts the permission grant to just the specified object type */
        @JsonProperty("restrict_object_type")
        fun restrictObjectType(): RestrictObjectType? = restrictObjectType

        /** Id of the user the ACL applies to */
        @JsonProperty("user_id") fun userId(): String? = userId

        /** Permission the ACL grants */
        @JsonProperty("permission") fun permission(): Permission? = permission

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CreateUserPermissionAcl &&
                this.objectType == other.objectType &&
                this.objectId == other.objectId &&
                this.restrictObjectType == other.restrictObjectType &&
                this.userId == other.userId &&
                this.permission == other.permission &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        objectType,
                        objectId,
                        restrictObjectType,
                        userId,
                        permission,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "CreateUserPermissionAcl{objectType=$objectType, objectId=$objectId, restrictObjectType=$restrictObjectType, userId=$userId, permission=$permission, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var objectType: ObjectType? = null
            private var objectId: String? = null
            private var restrictObjectType: RestrictObjectType? = null
            private var userId: String? = null
            private var permission: Permission? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(createUserPermissionAcl: CreateUserPermissionAcl) = apply {
                this.objectType = createUserPermissionAcl.objectType
                this.objectId = createUserPermissionAcl.objectId
                this.restrictObjectType = createUserPermissionAcl.restrictObjectType
                this.userId = createUserPermissionAcl.userId
                this.permission = createUserPermissionAcl.permission
                additionalProperties(createUserPermissionAcl.additionalProperties)
            }

            /** The object type that the ACL applies to */
            @JsonProperty("object_type")
            fun objectType(objectType: ObjectType) = apply { this.objectType = objectType }

            /** The id of the object the ACL applies to */
            @JsonProperty("object_id")
            fun objectId(objectId: String) = apply { this.objectId = objectId }

            /** Optionally restricts the permission grant to just the specified object type */
            @JsonProperty("restrict_object_type")
            fun restrictObjectType(restrictObjectType: RestrictObjectType) = apply {
                this.restrictObjectType = restrictObjectType
            }

            /** Id of the user the ACL applies to */
            @JsonProperty("user_id") fun userId(userId: String) = apply { this.userId = userId }

            /** Permission the ACL grants */
            @JsonProperty("permission")
            fun permission(permission: Permission) = apply { this.permission = permission }

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

            fun build(): CreateUserPermissionAcl =
                CreateUserPermissionAcl(
                    checkNotNull(objectType) { "`objectType` is required but was not set" },
                    checkNotNull(objectId) { "`objectId` is required but was not set" },
                    restrictObjectType,
                    checkNotNull(userId) { "`userId` is required but was not set" },
                    checkNotNull(permission) { "`permission` is required but was not set" },
                    additionalProperties.toUnmodifiable(),
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

    @JsonDeserialize(builder = CreateUserRoleAcl.Builder::class)
    @NoAutoDetect
    class CreateUserRoleAcl
    private constructor(
        private val objectType: ObjectType?,
        private val objectId: String?,
        private val restrictObjectType: RestrictObjectType?,
        private val userId: String?,
        private val roleId: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** The object type that the ACL applies to */
        @JsonProperty("object_type") fun objectType(): ObjectType? = objectType

        /** The id of the object the ACL applies to */
        @JsonProperty("object_id") fun objectId(): String? = objectId

        /** Optionally restricts the permission grant to just the specified object type */
        @JsonProperty("restrict_object_type")
        fun restrictObjectType(): RestrictObjectType? = restrictObjectType

        /** Id of the user the ACL applies to */
        @JsonProperty("user_id") fun userId(): String? = userId

        /** Id of the role the ACL grants */
        @JsonProperty("role_id") fun roleId(): String? = roleId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CreateUserRoleAcl &&
                this.objectType == other.objectType &&
                this.objectId == other.objectId &&
                this.restrictObjectType == other.restrictObjectType &&
                this.userId == other.userId &&
                this.roleId == other.roleId &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        objectType,
                        objectId,
                        restrictObjectType,
                        userId,
                        roleId,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "CreateUserRoleAcl{objectType=$objectType, objectId=$objectId, restrictObjectType=$restrictObjectType, userId=$userId, roleId=$roleId, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var objectType: ObjectType? = null
            private var objectId: String? = null
            private var restrictObjectType: RestrictObjectType? = null
            private var userId: String? = null
            private var roleId: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(createUserRoleAcl: CreateUserRoleAcl) = apply {
                this.objectType = createUserRoleAcl.objectType
                this.objectId = createUserRoleAcl.objectId
                this.restrictObjectType = createUserRoleAcl.restrictObjectType
                this.userId = createUserRoleAcl.userId
                this.roleId = createUserRoleAcl.roleId
                additionalProperties(createUserRoleAcl.additionalProperties)
            }

            /** The object type that the ACL applies to */
            @JsonProperty("object_type")
            fun objectType(objectType: ObjectType) = apply { this.objectType = objectType }

            /** The id of the object the ACL applies to */
            @JsonProperty("object_id")
            fun objectId(objectId: String) = apply { this.objectId = objectId }

            /** Optionally restricts the permission grant to just the specified object type */
            @JsonProperty("restrict_object_type")
            fun restrictObjectType(restrictObjectType: RestrictObjectType) = apply {
                this.restrictObjectType = restrictObjectType
            }

            /** Id of the user the ACL applies to */
            @JsonProperty("user_id") fun userId(userId: String) = apply { this.userId = userId }

            /** Id of the role the ACL grants */
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

            fun build(): CreateUserRoleAcl =
                CreateUserRoleAcl(
                    checkNotNull(objectType) { "`objectType` is required but was not set" },
                    checkNotNull(objectId) { "`objectId` is required but was not set" },
                    restrictObjectType,
                    checkNotNull(userId) { "`userId` is required but was not set" },
                    checkNotNull(roleId) { "`roleId` is required but was not set" },
                    additionalProperties.toUnmodifiable(),
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

    @JsonDeserialize(builder = CreateGroupPermissionAcl.Builder::class)
    @NoAutoDetect
    class CreateGroupPermissionAcl
    private constructor(
        private val objectType: ObjectType?,
        private val objectId: String?,
        private val restrictObjectType: RestrictObjectType?,
        private val groupId: String?,
        private val permission: Permission?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** The object type that the ACL applies to */
        @JsonProperty("object_type") fun objectType(): ObjectType? = objectType

        /** The id of the object the ACL applies to */
        @JsonProperty("object_id") fun objectId(): String? = objectId

        /** Optionally restricts the permission grant to just the specified object type */
        @JsonProperty("restrict_object_type")
        fun restrictObjectType(): RestrictObjectType? = restrictObjectType

        /** Id of the group the ACL applies to */
        @JsonProperty("group_id") fun groupId(): String? = groupId

        /** Permission the ACL grants */
        @JsonProperty("permission") fun permission(): Permission? = permission

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CreateGroupPermissionAcl &&
                this.objectType == other.objectType &&
                this.objectId == other.objectId &&
                this.restrictObjectType == other.restrictObjectType &&
                this.groupId == other.groupId &&
                this.permission == other.permission &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        objectType,
                        objectId,
                        restrictObjectType,
                        groupId,
                        permission,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "CreateGroupPermissionAcl{objectType=$objectType, objectId=$objectId, restrictObjectType=$restrictObjectType, groupId=$groupId, permission=$permission, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var objectType: ObjectType? = null
            private var objectId: String? = null
            private var restrictObjectType: RestrictObjectType? = null
            private var groupId: String? = null
            private var permission: Permission? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(createGroupPermissionAcl: CreateGroupPermissionAcl) = apply {
                this.objectType = createGroupPermissionAcl.objectType
                this.objectId = createGroupPermissionAcl.objectId
                this.restrictObjectType = createGroupPermissionAcl.restrictObjectType
                this.groupId = createGroupPermissionAcl.groupId
                this.permission = createGroupPermissionAcl.permission
                additionalProperties(createGroupPermissionAcl.additionalProperties)
            }

            /** The object type that the ACL applies to */
            @JsonProperty("object_type")
            fun objectType(objectType: ObjectType) = apply { this.objectType = objectType }

            /** The id of the object the ACL applies to */
            @JsonProperty("object_id")
            fun objectId(objectId: String) = apply { this.objectId = objectId }

            /** Optionally restricts the permission grant to just the specified object type */
            @JsonProperty("restrict_object_type")
            fun restrictObjectType(restrictObjectType: RestrictObjectType) = apply {
                this.restrictObjectType = restrictObjectType
            }

            /** Id of the group the ACL applies to */
            @JsonProperty("group_id")
            fun groupId(groupId: String) = apply { this.groupId = groupId }

            /** Permission the ACL grants */
            @JsonProperty("permission")
            fun permission(permission: Permission) = apply { this.permission = permission }

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

            fun build(): CreateGroupPermissionAcl =
                CreateGroupPermissionAcl(
                    checkNotNull(objectType) { "`objectType` is required but was not set" },
                    checkNotNull(objectId) { "`objectId` is required but was not set" },
                    restrictObjectType,
                    checkNotNull(groupId) { "`groupId` is required but was not set" },
                    checkNotNull(permission) { "`permission` is required but was not set" },
                    additionalProperties.toUnmodifiable(),
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

    @JsonDeserialize(builder = CreateGroupRoleAcl.Builder::class)
    @NoAutoDetect
    class CreateGroupRoleAcl
    private constructor(
        private val objectType: ObjectType?,
        private val objectId: String?,
        private val restrictObjectType: RestrictObjectType?,
        private val groupId: String?,
        private val roleId: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** The object type that the ACL applies to */
        @JsonProperty("object_type") fun objectType(): ObjectType? = objectType

        /** The id of the object the ACL applies to */
        @JsonProperty("object_id") fun objectId(): String? = objectId

        /** Optionally restricts the permission grant to just the specified object type */
        @JsonProperty("restrict_object_type")
        fun restrictObjectType(): RestrictObjectType? = restrictObjectType

        /** Id of the group the ACL applies to */
        @JsonProperty("group_id") fun groupId(): String? = groupId

        /** Id of the role the ACL grants */
        @JsonProperty("role_id") fun roleId(): String? = roleId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CreateGroupRoleAcl &&
                this.objectType == other.objectType &&
                this.objectId == other.objectId &&
                this.restrictObjectType == other.restrictObjectType &&
                this.groupId == other.groupId &&
                this.roleId == other.roleId &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        objectType,
                        objectId,
                        restrictObjectType,
                        groupId,
                        roleId,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "CreateGroupRoleAcl{objectType=$objectType, objectId=$objectId, restrictObjectType=$restrictObjectType, groupId=$groupId, roleId=$roleId, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var objectType: ObjectType? = null
            private var objectId: String? = null
            private var restrictObjectType: RestrictObjectType? = null
            private var groupId: String? = null
            private var roleId: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(createGroupRoleAcl: CreateGroupRoleAcl) = apply {
                this.objectType = createGroupRoleAcl.objectType
                this.objectId = createGroupRoleAcl.objectId
                this.restrictObjectType = createGroupRoleAcl.restrictObjectType
                this.groupId = createGroupRoleAcl.groupId
                this.roleId = createGroupRoleAcl.roleId
                additionalProperties(createGroupRoleAcl.additionalProperties)
            }

            /** The object type that the ACL applies to */
            @JsonProperty("object_type")
            fun objectType(objectType: ObjectType) = apply { this.objectType = objectType }

            /** The id of the object the ACL applies to */
            @JsonProperty("object_id")
            fun objectId(objectId: String) = apply { this.objectId = objectId }

            /** Optionally restricts the permission grant to just the specified object type */
            @JsonProperty("restrict_object_type")
            fun restrictObjectType(restrictObjectType: RestrictObjectType) = apply {
                this.restrictObjectType = restrictObjectType
            }

            /** Id of the group the ACL applies to */
            @JsonProperty("group_id")
            fun groupId(groupId: String) = apply { this.groupId = groupId }

            /** Id of the role the ACL grants */
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

            fun build(): CreateGroupRoleAcl =
                CreateGroupRoleAcl(
                    checkNotNull(objectType) { "`objectType` is required but was not set" },
                    checkNotNull(objectId) { "`objectId` is required but was not set" },
                    restrictObjectType,
                    checkNotNull(groupId) { "`groupId` is required but was not set" },
                    checkNotNull(roleId) { "`roleId` is required but was not set" },
                    additionalProperties.toUnmodifiable(),
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
}
