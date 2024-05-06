// File generated from our OpenAPI spec by Stainless.

package com.braintrust.api.models

import com.braintrust.api.core.BaseDeserializer
import com.braintrust.api.core.BaseSerializer
import com.braintrust.api.core.Enum
import com.braintrust.api.core.ExcludeMissing
import com.braintrust.api.core.JsonField
import com.braintrust.api.core.JsonMissing
import com.braintrust.api.core.JsonValue
import com.braintrust.api.core.NoAutoDetect
import com.braintrust.api.core.getOrThrow
import com.braintrust.api.core.toUnmodifiable
import com.braintrust.api.errors.BraintrustInvalidDataException
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
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@JsonDeserialize(using = Acl.Deserializer::class)
@JsonSerialize(using = Acl.Serializer::class)
class Acl
private constructor(
    private val userPermissionAcl: UserPermissionAcl? = null,
    private val userRoleAcl: UserRoleAcl? = null,
    private val groupPermissionAcl: GroupPermissionAcl? = null,
    private val groupRoleAcl: GroupRoleAcl? = null,
    private val _json: JsonValue? = null,
) {

    private var validated: Boolean = false

    fun userPermissionAcl(): Optional<UserPermissionAcl> = Optional.ofNullable(userPermissionAcl)

    fun userRoleAcl(): Optional<UserRoleAcl> = Optional.ofNullable(userRoleAcl)

    fun groupPermissionAcl(): Optional<GroupPermissionAcl> = Optional.ofNullable(groupPermissionAcl)

    fun groupRoleAcl(): Optional<GroupRoleAcl> = Optional.ofNullable(groupRoleAcl)

    fun isUserPermissionAcl(): Boolean = userPermissionAcl != null

    fun isUserRoleAcl(): Boolean = userRoleAcl != null

    fun isGroupPermissionAcl(): Boolean = groupPermissionAcl != null

    fun isGroupRoleAcl(): Boolean = groupRoleAcl != null

    fun asUserPermissionAcl(): UserPermissionAcl = userPermissionAcl.getOrThrow("userPermissionAcl")

    fun asUserRoleAcl(): UserRoleAcl = userRoleAcl.getOrThrow("userRoleAcl")

    fun asGroupPermissionAcl(): GroupPermissionAcl =
        groupPermissionAcl.getOrThrow("groupPermissionAcl")

    fun asGroupRoleAcl(): GroupRoleAcl = groupRoleAcl.getOrThrow("groupRoleAcl")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    fun <T> accept(visitor: Visitor<T>): T {
        return when {
            userPermissionAcl != null -> visitor.visitUserPermissionAcl(userPermissionAcl)
            userRoleAcl != null -> visitor.visitUserRoleAcl(userRoleAcl)
            groupPermissionAcl != null -> visitor.visitGroupPermissionAcl(groupPermissionAcl)
            groupRoleAcl != null -> visitor.visitGroupRoleAcl(groupRoleAcl)
            else -> visitor.unknown(_json)
        }
    }

    fun validate(): Acl = apply {
        if (!validated) {
            if (
                userPermissionAcl == null &&
                    userRoleAcl == null &&
                    groupPermissionAcl == null &&
                    groupRoleAcl == null
            ) {
                throw BraintrustInvalidDataException("Unknown Acl: $_json")
            }
            userPermissionAcl?.validate()
            userRoleAcl?.validate()
            groupPermissionAcl?.validate()
            groupRoleAcl?.validate()
            validated = true
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Acl &&
            this.userPermissionAcl == other.userPermissionAcl &&
            this.userRoleAcl == other.userRoleAcl &&
            this.groupPermissionAcl == other.groupPermissionAcl &&
            this.groupRoleAcl == other.groupRoleAcl
    }

    override fun hashCode(): Int {
        return Objects.hash(
            userPermissionAcl,
            userRoleAcl,
            groupPermissionAcl,
            groupRoleAcl,
        )
    }

    override fun toString(): String {
        return when {
            userPermissionAcl != null -> "Acl{userPermissionAcl=$userPermissionAcl}"
            userRoleAcl != null -> "Acl{userRoleAcl=$userRoleAcl}"
            groupPermissionAcl != null -> "Acl{groupPermissionAcl=$groupPermissionAcl}"
            groupRoleAcl != null -> "Acl{groupRoleAcl=$groupRoleAcl}"
            _json != null -> "Acl{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid Acl")
        }
    }

    companion object {

        @JvmStatic
        fun ofUserPermissionAcl(userPermissionAcl: UserPermissionAcl) =
            Acl(userPermissionAcl = userPermissionAcl)

        @JvmStatic fun ofUserRoleAcl(userRoleAcl: UserRoleAcl) = Acl(userRoleAcl = userRoleAcl)

        @JvmStatic
        fun ofGroupPermissionAcl(groupPermissionAcl: GroupPermissionAcl) =
            Acl(groupPermissionAcl = groupPermissionAcl)

        @JvmStatic fun ofGroupRoleAcl(groupRoleAcl: GroupRoleAcl) = Acl(groupRoleAcl = groupRoleAcl)
    }

    interface Visitor<out T> {

        fun visitUserPermissionAcl(userPermissionAcl: UserPermissionAcl): T

        fun visitUserRoleAcl(userRoleAcl: UserRoleAcl): T

        fun visitGroupPermissionAcl(groupPermissionAcl: GroupPermissionAcl): T

        fun visitGroupRoleAcl(groupRoleAcl: GroupRoleAcl): T

        fun unknown(json: JsonValue?): T {
            throw BraintrustInvalidDataException("Unknown Acl: $json")
        }
    }

    class Deserializer : BaseDeserializer<Acl>(Acl::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): Acl {
            val json = JsonValue.fromJsonNode(node)
            tryDeserialize(node, jacksonTypeRef<UserPermissionAcl>()) { it.validate() }
                ?.let {
                    return Acl(userPermissionAcl = it, _json = json)
                }
            tryDeserialize(node, jacksonTypeRef<UserRoleAcl>()) { it.validate() }
                ?.let {
                    return Acl(userRoleAcl = it, _json = json)
                }
            tryDeserialize(node, jacksonTypeRef<GroupPermissionAcl>()) { it.validate() }
                ?.let {
                    return Acl(groupPermissionAcl = it, _json = json)
                }
            tryDeserialize(node, jacksonTypeRef<GroupRoleAcl>()) { it.validate() }
                ?.let {
                    return Acl(groupRoleAcl = it, _json = json)
                }

            return Acl(_json = json)
        }
    }

    class Serializer : BaseSerializer<Acl>(Acl::class) {

        override fun serialize(value: Acl, generator: JsonGenerator, provider: SerializerProvider) {
            when {
                value.userPermissionAcl != null -> generator.writeObject(value.userPermissionAcl)
                value.userRoleAcl != null -> generator.writeObject(value.userRoleAcl)
                value.groupPermissionAcl != null -> generator.writeObject(value.groupPermissionAcl)
                value.groupRoleAcl != null -> generator.writeObject(value.groupRoleAcl)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid Acl")
            }
        }
    }

    @JsonDeserialize(builder = UserPermissionAcl.Builder::class)
    @NoAutoDetect
    class UserPermissionAcl
    private constructor(
        private val id: JsonField<String>,
        private val objectType: JsonField<ObjectType>,
        private val objectId: JsonField<String>,
        private val restrictObjectType: JsonField<RestrictObjectType>,
        private val _objectOrgId: JsonField<String>,
        private val created: JsonField<OffsetDateTime>,
        private val userId: JsonField<String>,
        private val permission: JsonField<Permission>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /** Unique identifier for the acl */
        fun id(): String = id.getRequired("id")

        /** The object type that the ACL applies to */
        fun objectType(): ObjectType = objectType.getRequired("object_type")

        /** The id of the object the ACL applies to */
        fun objectId(): String = objectId.getRequired("object_id")

        /** Optionally restricts the permission grant to just the specified object type */
        fun restrictObjectType(): Optional<RestrictObjectType> =
            Optional.ofNullable(restrictObjectType.getNullable("restrict_object_type"))

        /** The organization the ACL's referred object belongs to */
        fun _objectOrgId(): String = _objectOrgId.getRequired("_object_org_id")

        /** Date of acl creation */
        fun created(): Optional<OffsetDateTime> =
            Optional.ofNullable(created.getNullable("created"))

        /** Id of the user the ACL applies to */
        fun userId(): String = userId.getRequired("user_id")

        /** Permission the ACL grants */
        fun permission(): Permission = permission.getRequired("permission")

        /** Unique identifier for the acl */
        @JsonProperty("id") @ExcludeMissing fun _id() = id

        /** The object type that the ACL applies to */
        @JsonProperty("object_type") @ExcludeMissing fun _objectType() = objectType

        /** The id of the object the ACL applies to */
        @JsonProperty("object_id") @ExcludeMissing fun _objectId() = objectId

        /** Optionally restricts the permission grant to just the specified object type */
        @JsonProperty("restrict_object_type")
        @ExcludeMissing
        fun _restrictObjectType() = restrictObjectType

        /** The organization the ACL's referred object belongs to */
        @JsonProperty("_object_org_id") @ExcludeMissing fun __objectOrgId() = _objectOrgId

        /** Date of acl creation */
        @JsonProperty("created") @ExcludeMissing fun _created() = created

        /** Id of the user the ACL applies to */
        @JsonProperty("user_id") @ExcludeMissing fun _userId() = userId

        /** Permission the ACL grants */
        @JsonProperty("permission") @ExcludeMissing fun _permission() = permission

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): UserPermissionAcl = apply {
            if (!validated) {
                id()
                objectType()
                objectId()
                restrictObjectType()
                _objectOrgId()
                created()
                userId()
                permission()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is UserPermissionAcl &&
                this.id == other.id &&
                this.objectType == other.objectType &&
                this.objectId == other.objectId &&
                this.restrictObjectType == other.restrictObjectType &&
                this._objectOrgId == other._objectOrgId &&
                this.created == other.created &&
                this.userId == other.userId &&
                this.permission == other.permission &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        id,
                        objectType,
                        objectId,
                        restrictObjectType,
                        _objectOrgId,
                        created,
                        userId,
                        permission,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "UserPermissionAcl{id=$id, objectType=$objectType, objectId=$objectId, restrictObjectType=$restrictObjectType, _objectOrgId=$_objectOrgId, created=$created, userId=$userId, permission=$permission, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var id: JsonField<String> = JsonMissing.of()
            private var objectType: JsonField<ObjectType> = JsonMissing.of()
            private var objectId: JsonField<String> = JsonMissing.of()
            private var restrictObjectType: JsonField<RestrictObjectType> = JsonMissing.of()
            private var _objectOrgId: JsonField<String> = JsonMissing.of()
            private var created: JsonField<OffsetDateTime> = JsonMissing.of()
            private var userId: JsonField<String> = JsonMissing.of()
            private var permission: JsonField<Permission> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(userPermissionAcl: UserPermissionAcl) = apply {
                this.id = userPermissionAcl.id
                this.objectType = userPermissionAcl.objectType
                this.objectId = userPermissionAcl.objectId
                this.restrictObjectType = userPermissionAcl.restrictObjectType
                this._objectOrgId = userPermissionAcl._objectOrgId
                this.created = userPermissionAcl.created
                this.userId = userPermissionAcl.userId
                this.permission = userPermissionAcl.permission
                additionalProperties(userPermissionAcl.additionalProperties)
            }

            /** Unique identifier for the acl */
            fun id(id: String) = id(JsonField.of(id))

            /** Unique identifier for the acl */
            @JsonProperty("id")
            @ExcludeMissing
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** The object type that the ACL applies to */
            fun objectType(objectType: ObjectType) = objectType(JsonField.of(objectType))

            /** The object type that the ACL applies to */
            @JsonProperty("object_type")
            @ExcludeMissing
            fun objectType(objectType: JsonField<ObjectType>) = apply {
                this.objectType = objectType
            }

            /** The id of the object the ACL applies to */
            fun objectId(objectId: String) = objectId(JsonField.of(objectId))

            /** The id of the object the ACL applies to */
            @JsonProperty("object_id")
            @ExcludeMissing
            fun objectId(objectId: JsonField<String>) = apply { this.objectId = objectId }

            /** Optionally restricts the permission grant to just the specified object type */
            fun restrictObjectType(restrictObjectType: RestrictObjectType) =
                restrictObjectType(JsonField.of(restrictObjectType))

            /** Optionally restricts the permission grant to just the specified object type */
            @JsonProperty("restrict_object_type")
            @ExcludeMissing
            fun restrictObjectType(restrictObjectType: JsonField<RestrictObjectType>) = apply {
                this.restrictObjectType = restrictObjectType
            }

            /** The organization the ACL's referred object belongs to */
            fun _objectOrgId(_objectOrgId: String) = _objectOrgId(JsonField.of(_objectOrgId))

            /** The organization the ACL's referred object belongs to */
            @JsonProperty("_object_org_id")
            @ExcludeMissing
            fun _objectOrgId(_objectOrgId: JsonField<String>) = apply {
                this._objectOrgId = _objectOrgId
            }

            /** Date of acl creation */
            fun created(created: OffsetDateTime) = created(JsonField.of(created))

            /** Date of acl creation */
            @JsonProperty("created")
            @ExcludeMissing
            fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

            /** Id of the user the ACL applies to */
            fun userId(userId: String) = userId(JsonField.of(userId))

            /** Id of the user the ACL applies to */
            @JsonProperty("user_id")
            @ExcludeMissing
            fun userId(userId: JsonField<String>) = apply { this.userId = userId }

            /** Permission the ACL grants */
            fun permission(permission: Permission) = permission(JsonField.of(permission))

            /** Permission the ACL grants */
            @JsonProperty("permission")
            @ExcludeMissing
            fun permission(permission: JsonField<Permission>) = apply {
                this.permission = permission
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

            fun build(): UserPermissionAcl =
                UserPermissionAcl(
                    id,
                    objectType,
                    objectId,
                    restrictObjectType,
                    _objectOrgId,
                    created,
                    userId,
                    permission,
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
            private val _reservedOnlyAllowNull: _ReservedOnlyAllowNull? = null,
            private val _json: JsonValue? = null,
        ) {

            private var validated: Boolean = false

            /** The object type that the ACL applies to */
            fun unionMember0(): Optional<UnionMember0> = Optional.ofNullable(unionMember0)

            fun _reservedOnlyAllowNull(): Optional<_ReservedOnlyAllowNull> =
                Optional.ofNullable(_reservedOnlyAllowNull)

            fun isUnionMember0(): Boolean = unionMember0 != null

            fun is_ReservedOnlyAllowNull(): Boolean = _reservedOnlyAllowNull != null

            fun asUnionMember0(): UnionMember0 = unionMember0.getOrThrow("unionMember0")

            fun as_ReservedOnlyAllowNull(): _ReservedOnlyAllowNull =
                _reservedOnlyAllowNull.getOrThrow("_reservedOnlyAllowNull")

            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

            fun <T> accept(visitor: Visitor<T>): T {
                return when {
                    unionMember0 != null -> visitor.visitUnionMember0(unionMember0)
                    _reservedOnlyAllowNull != null ->
                        visitor.visit_ReservedOnlyAllowNull(_reservedOnlyAllowNull)
                    else -> visitor.unknown(_json)
                }
            }

            fun validate(): RestrictObjectType = apply {
                if (!validated) {
                    if (unionMember0 == null && _reservedOnlyAllowNull == null) {
                        throw BraintrustInvalidDataException("Unknown RestrictObjectType: $_json")
                    }
                    _reservedOnlyAllowNull?.validate()
                    validated = true
                }
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is RestrictObjectType &&
                    this.unionMember0 == other.unionMember0 &&
                    this._reservedOnlyAllowNull == other._reservedOnlyAllowNull
            }

            override fun hashCode(): Int {
                return Objects.hash(unionMember0, _reservedOnlyAllowNull)
            }

            override fun toString(): String {
                return when {
                    unionMember0 != null -> "RestrictObjectType{unionMember0=$unionMember0}"
                    _reservedOnlyAllowNull != null ->
                        "RestrictObjectType{_reservedOnlyAllowNull=$_reservedOnlyAllowNull}"
                    _json != null -> "RestrictObjectType{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid RestrictObjectType")
                }
            }

            companion object {

                @JvmStatic
                fun ofUnionMember0(unionMember0: UnionMember0) =
                    RestrictObjectType(unionMember0 = unionMember0)

                @JvmStatic
                fun of_ReservedOnlyAllowNull(_reservedOnlyAllowNull: _ReservedOnlyAllowNull) =
                    RestrictObjectType(_reservedOnlyAllowNull = _reservedOnlyAllowNull)
            }

            interface Visitor<out T> {

                fun visitUnionMember0(unionMember0: UnionMember0): T

                fun visit_ReservedOnlyAllowNull(_reservedOnlyAllowNull: _ReservedOnlyAllowNull): T

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
                    tryDeserialize(node, jacksonTypeRef<_ReservedOnlyAllowNull>()) { it.validate() }
                        ?.let {
                            return RestrictObjectType(_reservedOnlyAllowNull = it, _json = json)
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
                        value._reservedOnlyAllowNull != null ->
                            generator.writeObject(value._reservedOnlyAllowNull)
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

            @JsonDeserialize(builder = _ReservedOnlyAllowNull.Builder::class)
            @NoAutoDetect
            class _ReservedOnlyAllowNull
            private constructor(
                private val _reservedOnlyAllowNull: JsonValue,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /**
                 * This is just a placeholder nullable object. Only pass null, not the object itself
                 */
                @JsonProperty("__reserved_only_allow_null")
                @ExcludeMissing
                fun __reservedOnlyAllowNull() = _reservedOnlyAllowNull

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): _ReservedOnlyAllowNull = apply {
                    if (!validated) {
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is _ReservedOnlyAllowNull &&
                        this._reservedOnlyAllowNull == other._reservedOnlyAllowNull &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = Objects.hash(_reservedOnlyAllowNull, additionalProperties)
                    }
                    return hashCode
                }

                override fun toString() =
                    "_ReservedOnlyAllowNull{_reservedOnlyAllowNull=$_reservedOnlyAllowNull, additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var _reservedOnlyAllowNull: JsonValue = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(_reservedOnlyAllowNull: _ReservedOnlyAllowNull) = apply {
                        this._reservedOnlyAllowNull = _reservedOnlyAllowNull._reservedOnlyAllowNull
                        additionalProperties(_reservedOnlyAllowNull.additionalProperties)
                    }

                    /**
                     * This is just a placeholder nullable object. Only pass null, not the object
                     * itself
                     */
                    @JsonProperty("__reserved_only_allow_null")
                    @ExcludeMissing
                    fun _reservedOnlyAllowNull(_reservedOnlyAllowNull: JsonValue) = apply {
                        this._reservedOnlyAllowNull = _reservedOnlyAllowNull
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

                    fun build(): _ReservedOnlyAllowNull =
                        _ReservedOnlyAllowNull(
                            _reservedOnlyAllowNull,
                            additionalProperties.toUnmodifiable()
                        )
                }
            }
        }
    }

    @JsonDeserialize(builder = UserRoleAcl.Builder::class)
    @NoAutoDetect
    class UserRoleAcl
    private constructor(
        private val id: JsonField<String>,
        private val objectType: JsonField<ObjectType>,
        private val objectId: JsonField<String>,
        private val restrictObjectType: JsonField<RestrictObjectType>,
        private val _objectOrgId: JsonField<String>,
        private val created: JsonField<OffsetDateTime>,
        private val userId: JsonField<String>,
        private val roleId: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /** Unique identifier for the acl */
        fun id(): String = id.getRequired("id")

        /** The object type that the ACL applies to */
        fun objectType(): ObjectType = objectType.getRequired("object_type")

        /** The id of the object the ACL applies to */
        fun objectId(): String = objectId.getRequired("object_id")

        /** Optionally restricts the permission grant to just the specified object type */
        fun restrictObjectType(): Optional<RestrictObjectType> =
            Optional.ofNullable(restrictObjectType.getNullable("restrict_object_type"))

        /** The organization the ACL's referred object belongs to */
        fun _objectOrgId(): String = _objectOrgId.getRequired("_object_org_id")

        /** Date of acl creation */
        fun created(): Optional<OffsetDateTime> =
            Optional.ofNullable(created.getNullable("created"))

        /** Id of the user the ACL applies to */
        fun userId(): String = userId.getRequired("user_id")

        /** Id of the role the ACL grants */
        fun roleId(): String = roleId.getRequired("role_id")

        /** Unique identifier for the acl */
        @JsonProperty("id") @ExcludeMissing fun _id() = id

        /** The object type that the ACL applies to */
        @JsonProperty("object_type") @ExcludeMissing fun _objectType() = objectType

        /** The id of the object the ACL applies to */
        @JsonProperty("object_id") @ExcludeMissing fun _objectId() = objectId

        /** Optionally restricts the permission grant to just the specified object type */
        @JsonProperty("restrict_object_type")
        @ExcludeMissing
        fun _restrictObjectType() = restrictObjectType

        /** The organization the ACL's referred object belongs to */
        @JsonProperty("_object_org_id") @ExcludeMissing fun __objectOrgId() = _objectOrgId

        /** Date of acl creation */
        @JsonProperty("created") @ExcludeMissing fun _created() = created

        /** Id of the user the ACL applies to */
        @JsonProperty("user_id") @ExcludeMissing fun _userId() = userId

        /** Id of the role the ACL grants */
        @JsonProperty("role_id") @ExcludeMissing fun _roleId() = roleId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): UserRoleAcl = apply {
            if (!validated) {
                id()
                objectType()
                objectId()
                restrictObjectType()
                _objectOrgId()
                created()
                userId()
                roleId()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is UserRoleAcl &&
                this.id == other.id &&
                this.objectType == other.objectType &&
                this.objectId == other.objectId &&
                this.restrictObjectType == other.restrictObjectType &&
                this._objectOrgId == other._objectOrgId &&
                this.created == other.created &&
                this.userId == other.userId &&
                this.roleId == other.roleId &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        id,
                        objectType,
                        objectId,
                        restrictObjectType,
                        _objectOrgId,
                        created,
                        userId,
                        roleId,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "UserRoleAcl{id=$id, objectType=$objectType, objectId=$objectId, restrictObjectType=$restrictObjectType, _objectOrgId=$_objectOrgId, created=$created, userId=$userId, roleId=$roleId, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var id: JsonField<String> = JsonMissing.of()
            private var objectType: JsonField<ObjectType> = JsonMissing.of()
            private var objectId: JsonField<String> = JsonMissing.of()
            private var restrictObjectType: JsonField<RestrictObjectType> = JsonMissing.of()
            private var _objectOrgId: JsonField<String> = JsonMissing.of()
            private var created: JsonField<OffsetDateTime> = JsonMissing.of()
            private var userId: JsonField<String> = JsonMissing.of()
            private var roleId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(userRoleAcl: UserRoleAcl) = apply {
                this.id = userRoleAcl.id
                this.objectType = userRoleAcl.objectType
                this.objectId = userRoleAcl.objectId
                this.restrictObjectType = userRoleAcl.restrictObjectType
                this._objectOrgId = userRoleAcl._objectOrgId
                this.created = userRoleAcl.created
                this.userId = userRoleAcl.userId
                this.roleId = userRoleAcl.roleId
                additionalProperties(userRoleAcl.additionalProperties)
            }

            /** Unique identifier for the acl */
            fun id(id: String) = id(JsonField.of(id))

            /** Unique identifier for the acl */
            @JsonProperty("id")
            @ExcludeMissing
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** The object type that the ACL applies to */
            fun objectType(objectType: ObjectType) = objectType(JsonField.of(objectType))

            /** The object type that the ACL applies to */
            @JsonProperty("object_type")
            @ExcludeMissing
            fun objectType(objectType: JsonField<ObjectType>) = apply {
                this.objectType = objectType
            }

            /** The id of the object the ACL applies to */
            fun objectId(objectId: String) = objectId(JsonField.of(objectId))

            /** The id of the object the ACL applies to */
            @JsonProperty("object_id")
            @ExcludeMissing
            fun objectId(objectId: JsonField<String>) = apply { this.objectId = objectId }

            /** Optionally restricts the permission grant to just the specified object type */
            fun restrictObjectType(restrictObjectType: RestrictObjectType) =
                restrictObjectType(JsonField.of(restrictObjectType))

            /** Optionally restricts the permission grant to just the specified object type */
            @JsonProperty("restrict_object_type")
            @ExcludeMissing
            fun restrictObjectType(restrictObjectType: JsonField<RestrictObjectType>) = apply {
                this.restrictObjectType = restrictObjectType
            }

            /** The organization the ACL's referred object belongs to */
            fun _objectOrgId(_objectOrgId: String) = _objectOrgId(JsonField.of(_objectOrgId))

            /** The organization the ACL's referred object belongs to */
            @JsonProperty("_object_org_id")
            @ExcludeMissing
            fun _objectOrgId(_objectOrgId: JsonField<String>) = apply {
                this._objectOrgId = _objectOrgId
            }

            /** Date of acl creation */
            fun created(created: OffsetDateTime) = created(JsonField.of(created))

            /** Date of acl creation */
            @JsonProperty("created")
            @ExcludeMissing
            fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

            /** Id of the user the ACL applies to */
            fun userId(userId: String) = userId(JsonField.of(userId))

            /** Id of the user the ACL applies to */
            @JsonProperty("user_id")
            @ExcludeMissing
            fun userId(userId: JsonField<String>) = apply { this.userId = userId }

            /** Id of the role the ACL grants */
            fun roleId(roleId: String) = roleId(JsonField.of(roleId))

            /** Id of the role the ACL grants */
            @JsonProperty("role_id")
            @ExcludeMissing
            fun roleId(roleId: JsonField<String>) = apply { this.roleId = roleId }

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

            fun build(): UserRoleAcl =
                UserRoleAcl(
                    id,
                    objectType,
                    objectId,
                    restrictObjectType,
                    _objectOrgId,
                    created,
                    userId,
                    roleId,
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
            private val _reservedOnlyAllowNull: _ReservedOnlyAllowNull? = null,
            private val _json: JsonValue? = null,
        ) {

            private var validated: Boolean = false

            /** The object type that the ACL applies to */
            fun unionMember0(): Optional<UnionMember0> = Optional.ofNullable(unionMember0)

            fun _reservedOnlyAllowNull(): Optional<_ReservedOnlyAllowNull> =
                Optional.ofNullable(_reservedOnlyAllowNull)

            fun isUnionMember0(): Boolean = unionMember0 != null

            fun is_ReservedOnlyAllowNull(): Boolean = _reservedOnlyAllowNull != null

            fun asUnionMember0(): UnionMember0 = unionMember0.getOrThrow("unionMember0")

            fun as_ReservedOnlyAllowNull(): _ReservedOnlyAllowNull =
                _reservedOnlyAllowNull.getOrThrow("_reservedOnlyAllowNull")

            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

            fun <T> accept(visitor: Visitor<T>): T {
                return when {
                    unionMember0 != null -> visitor.visitUnionMember0(unionMember0)
                    _reservedOnlyAllowNull != null ->
                        visitor.visit_ReservedOnlyAllowNull(_reservedOnlyAllowNull)
                    else -> visitor.unknown(_json)
                }
            }

            fun validate(): RestrictObjectType = apply {
                if (!validated) {
                    if (unionMember0 == null && _reservedOnlyAllowNull == null) {
                        throw BraintrustInvalidDataException("Unknown RestrictObjectType: $_json")
                    }
                    _reservedOnlyAllowNull?.validate()
                    validated = true
                }
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is RestrictObjectType &&
                    this.unionMember0 == other.unionMember0 &&
                    this._reservedOnlyAllowNull == other._reservedOnlyAllowNull
            }

            override fun hashCode(): Int {
                return Objects.hash(unionMember0, _reservedOnlyAllowNull)
            }

            override fun toString(): String {
                return when {
                    unionMember0 != null -> "RestrictObjectType{unionMember0=$unionMember0}"
                    _reservedOnlyAllowNull != null ->
                        "RestrictObjectType{_reservedOnlyAllowNull=$_reservedOnlyAllowNull}"
                    _json != null -> "RestrictObjectType{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid RestrictObjectType")
                }
            }

            companion object {

                @JvmStatic
                fun ofUnionMember0(unionMember0: UnionMember0) =
                    RestrictObjectType(unionMember0 = unionMember0)

                @JvmStatic
                fun of_ReservedOnlyAllowNull(_reservedOnlyAllowNull: _ReservedOnlyAllowNull) =
                    RestrictObjectType(_reservedOnlyAllowNull = _reservedOnlyAllowNull)
            }

            interface Visitor<out T> {

                fun visitUnionMember0(unionMember0: UnionMember0): T

                fun visit_ReservedOnlyAllowNull(_reservedOnlyAllowNull: _ReservedOnlyAllowNull): T

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
                    tryDeserialize(node, jacksonTypeRef<_ReservedOnlyAllowNull>()) { it.validate() }
                        ?.let {
                            return RestrictObjectType(_reservedOnlyAllowNull = it, _json = json)
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
                        value._reservedOnlyAllowNull != null ->
                            generator.writeObject(value._reservedOnlyAllowNull)
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

            @JsonDeserialize(builder = _ReservedOnlyAllowNull.Builder::class)
            @NoAutoDetect
            class _ReservedOnlyAllowNull
            private constructor(
                private val _reservedOnlyAllowNull: JsonValue,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /**
                 * This is just a placeholder nullable object. Only pass null, not the object itself
                 */
                @JsonProperty("__reserved_only_allow_null")
                @ExcludeMissing
                fun __reservedOnlyAllowNull() = _reservedOnlyAllowNull

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): _ReservedOnlyAllowNull = apply {
                    if (!validated) {
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is _ReservedOnlyAllowNull &&
                        this._reservedOnlyAllowNull == other._reservedOnlyAllowNull &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = Objects.hash(_reservedOnlyAllowNull, additionalProperties)
                    }
                    return hashCode
                }

                override fun toString() =
                    "_ReservedOnlyAllowNull{_reservedOnlyAllowNull=$_reservedOnlyAllowNull, additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var _reservedOnlyAllowNull: JsonValue = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(_reservedOnlyAllowNull: _ReservedOnlyAllowNull) = apply {
                        this._reservedOnlyAllowNull = _reservedOnlyAllowNull._reservedOnlyAllowNull
                        additionalProperties(_reservedOnlyAllowNull.additionalProperties)
                    }

                    /**
                     * This is just a placeholder nullable object. Only pass null, not the object
                     * itself
                     */
                    @JsonProperty("__reserved_only_allow_null")
                    @ExcludeMissing
                    fun _reservedOnlyAllowNull(_reservedOnlyAllowNull: JsonValue) = apply {
                        this._reservedOnlyAllowNull = _reservedOnlyAllowNull
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

                    fun build(): _ReservedOnlyAllowNull =
                        _ReservedOnlyAllowNull(
                            _reservedOnlyAllowNull,
                            additionalProperties.toUnmodifiable()
                        )
                }
            }
        }
    }

    @JsonDeserialize(builder = GroupPermissionAcl.Builder::class)
    @NoAutoDetect
    class GroupPermissionAcl
    private constructor(
        private val id: JsonField<String>,
        private val objectType: JsonField<ObjectType>,
        private val objectId: JsonField<String>,
        private val restrictObjectType: JsonField<RestrictObjectType>,
        private val _objectOrgId: JsonField<String>,
        private val created: JsonField<OffsetDateTime>,
        private val groupId: JsonField<String>,
        private val permission: JsonField<Permission>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /** Unique identifier for the acl */
        fun id(): String = id.getRequired("id")

        /** The object type that the ACL applies to */
        fun objectType(): ObjectType = objectType.getRequired("object_type")

        /** The id of the object the ACL applies to */
        fun objectId(): String = objectId.getRequired("object_id")

        /** Optionally restricts the permission grant to just the specified object type */
        fun restrictObjectType(): Optional<RestrictObjectType> =
            Optional.ofNullable(restrictObjectType.getNullable("restrict_object_type"))

        /** The organization the ACL's referred object belongs to */
        fun _objectOrgId(): String = _objectOrgId.getRequired("_object_org_id")

        /** Date of acl creation */
        fun created(): Optional<OffsetDateTime> =
            Optional.ofNullable(created.getNullable("created"))

        /** Id of the group the ACL applies to */
        fun groupId(): String = groupId.getRequired("group_id")

        /** Permission the ACL grants */
        fun permission(): Permission = permission.getRequired("permission")

        /** Unique identifier for the acl */
        @JsonProperty("id") @ExcludeMissing fun _id() = id

        /** The object type that the ACL applies to */
        @JsonProperty("object_type") @ExcludeMissing fun _objectType() = objectType

        /** The id of the object the ACL applies to */
        @JsonProperty("object_id") @ExcludeMissing fun _objectId() = objectId

        /** Optionally restricts the permission grant to just the specified object type */
        @JsonProperty("restrict_object_type")
        @ExcludeMissing
        fun _restrictObjectType() = restrictObjectType

        /** The organization the ACL's referred object belongs to */
        @JsonProperty("_object_org_id") @ExcludeMissing fun __objectOrgId() = _objectOrgId

        /** Date of acl creation */
        @JsonProperty("created") @ExcludeMissing fun _created() = created

        /** Id of the group the ACL applies to */
        @JsonProperty("group_id") @ExcludeMissing fun _groupId() = groupId

        /** Permission the ACL grants */
        @JsonProperty("permission") @ExcludeMissing fun _permission() = permission

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): GroupPermissionAcl = apply {
            if (!validated) {
                id()
                objectType()
                objectId()
                restrictObjectType()
                _objectOrgId()
                created()
                groupId()
                permission()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is GroupPermissionAcl &&
                this.id == other.id &&
                this.objectType == other.objectType &&
                this.objectId == other.objectId &&
                this.restrictObjectType == other.restrictObjectType &&
                this._objectOrgId == other._objectOrgId &&
                this.created == other.created &&
                this.groupId == other.groupId &&
                this.permission == other.permission &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        id,
                        objectType,
                        objectId,
                        restrictObjectType,
                        _objectOrgId,
                        created,
                        groupId,
                        permission,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "GroupPermissionAcl{id=$id, objectType=$objectType, objectId=$objectId, restrictObjectType=$restrictObjectType, _objectOrgId=$_objectOrgId, created=$created, groupId=$groupId, permission=$permission, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var id: JsonField<String> = JsonMissing.of()
            private var objectType: JsonField<ObjectType> = JsonMissing.of()
            private var objectId: JsonField<String> = JsonMissing.of()
            private var restrictObjectType: JsonField<RestrictObjectType> = JsonMissing.of()
            private var _objectOrgId: JsonField<String> = JsonMissing.of()
            private var created: JsonField<OffsetDateTime> = JsonMissing.of()
            private var groupId: JsonField<String> = JsonMissing.of()
            private var permission: JsonField<Permission> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(groupPermissionAcl: GroupPermissionAcl) = apply {
                this.id = groupPermissionAcl.id
                this.objectType = groupPermissionAcl.objectType
                this.objectId = groupPermissionAcl.objectId
                this.restrictObjectType = groupPermissionAcl.restrictObjectType
                this._objectOrgId = groupPermissionAcl._objectOrgId
                this.created = groupPermissionAcl.created
                this.groupId = groupPermissionAcl.groupId
                this.permission = groupPermissionAcl.permission
                additionalProperties(groupPermissionAcl.additionalProperties)
            }

            /** Unique identifier for the acl */
            fun id(id: String) = id(JsonField.of(id))

            /** Unique identifier for the acl */
            @JsonProperty("id")
            @ExcludeMissing
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** The object type that the ACL applies to */
            fun objectType(objectType: ObjectType) = objectType(JsonField.of(objectType))

            /** The object type that the ACL applies to */
            @JsonProperty("object_type")
            @ExcludeMissing
            fun objectType(objectType: JsonField<ObjectType>) = apply {
                this.objectType = objectType
            }

            /** The id of the object the ACL applies to */
            fun objectId(objectId: String) = objectId(JsonField.of(objectId))

            /** The id of the object the ACL applies to */
            @JsonProperty("object_id")
            @ExcludeMissing
            fun objectId(objectId: JsonField<String>) = apply { this.objectId = objectId }

            /** Optionally restricts the permission grant to just the specified object type */
            fun restrictObjectType(restrictObjectType: RestrictObjectType) =
                restrictObjectType(JsonField.of(restrictObjectType))

            /** Optionally restricts the permission grant to just the specified object type */
            @JsonProperty("restrict_object_type")
            @ExcludeMissing
            fun restrictObjectType(restrictObjectType: JsonField<RestrictObjectType>) = apply {
                this.restrictObjectType = restrictObjectType
            }

            /** The organization the ACL's referred object belongs to */
            fun _objectOrgId(_objectOrgId: String) = _objectOrgId(JsonField.of(_objectOrgId))

            /** The organization the ACL's referred object belongs to */
            @JsonProperty("_object_org_id")
            @ExcludeMissing
            fun _objectOrgId(_objectOrgId: JsonField<String>) = apply {
                this._objectOrgId = _objectOrgId
            }

            /** Date of acl creation */
            fun created(created: OffsetDateTime) = created(JsonField.of(created))

            /** Date of acl creation */
            @JsonProperty("created")
            @ExcludeMissing
            fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

            /** Id of the group the ACL applies to */
            fun groupId(groupId: String) = groupId(JsonField.of(groupId))

            /** Id of the group the ACL applies to */
            @JsonProperty("group_id")
            @ExcludeMissing
            fun groupId(groupId: JsonField<String>) = apply { this.groupId = groupId }

            /** Permission the ACL grants */
            fun permission(permission: Permission) = permission(JsonField.of(permission))

            /** Permission the ACL grants */
            @JsonProperty("permission")
            @ExcludeMissing
            fun permission(permission: JsonField<Permission>) = apply {
                this.permission = permission
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

            fun build(): GroupPermissionAcl =
                GroupPermissionAcl(
                    id,
                    objectType,
                    objectId,
                    restrictObjectType,
                    _objectOrgId,
                    created,
                    groupId,
                    permission,
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
            private val _reservedOnlyAllowNull: _ReservedOnlyAllowNull? = null,
            private val _json: JsonValue? = null,
        ) {

            private var validated: Boolean = false

            /** The object type that the ACL applies to */
            fun unionMember0(): Optional<UnionMember0> = Optional.ofNullable(unionMember0)

            fun _reservedOnlyAllowNull(): Optional<_ReservedOnlyAllowNull> =
                Optional.ofNullable(_reservedOnlyAllowNull)

            fun isUnionMember0(): Boolean = unionMember0 != null

            fun is_ReservedOnlyAllowNull(): Boolean = _reservedOnlyAllowNull != null

            fun asUnionMember0(): UnionMember0 = unionMember0.getOrThrow("unionMember0")

            fun as_ReservedOnlyAllowNull(): _ReservedOnlyAllowNull =
                _reservedOnlyAllowNull.getOrThrow("_reservedOnlyAllowNull")

            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

            fun <T> accept(visitor: Visitor<T>): T {
                return when {
                    unionMember0 != null -> visitor.visitUnionMember0(unionMember0)
                    _reservedOnlyAllowNull != null ->
                        visitor.visit_ReservedOnlyAllowNull(_reservedOnlyAllowNull)
                    else -> visitor.unknown(_json)
                }
            }

            fun validate(): RestrictObjectType = apply {
                if (!validated) {
                    if (unionMember0 == null && _reservedOnlyAllowNull == null) {
                        throw BraintrustInvalidDataException("Unknown RestrictObjectType: $_json")
                    }
                    _reservedOnlyAllowNull?.validate()
                    validated = true
                }
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is RestrictObjectType &&
                    this.unionMember0 == other.unionMember0 &&
                    this._reservedOnlyAllowNull == other._reservedOnlyAllowNull
            }

            override fun hashCode(): Int {
                return Objects.hash(unionMember0, _reservedOnlyAllowNull)
            }

            override fun toString(): String {
                return when {
                    unionMember0 != null -> "RestrictObjectType{unionMember0=$unionMember0}"
                    _reservedOnlyAllowNull != null ->
                        "RestrictObjectType{_reservedOnlyAllowNull=$_reservedOnlyAllowNull}"
                    _json != null -> "RestrictObjectType{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid RestrictObjectType")
                }
            }

            companion object {

                @JvmStatic
                fun ofUnionMember0(unionMember0: UnionMember0) =
                    RestrictObjectType(unionMember0 = unionMember0)

                @JvmStatic
                fun of_ReservedOnlyAllowNull(_reservedOnlyAllowNull: _ReservedOnlyAllowNull) =
                    RestrictObjectType(_reservedOnlyAllowNull = _reservedOnlyAllowNull)
            }

            interface Visitor<out T> {

                fun visitUnionMember0(unionMember0: UnionMember0): T

                fun visit_ReservedOnlyAllowNull(_reservedOnlyAllowNull: _ReservedOnlyAllowNull): T

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
                    tryDeserialize(node, jacksonTypeRef<_ReservedOnlyAllowNull>()) { it.validate() }
                        ?.let {
                            return RestrictObjectType(_reservedOnlyAllowNull = it, _json = json)
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
                        value._reservedOnlyAllowNull != null ->
                            generator.writeObject(value._reservedOnlyAllowNull)
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

            @JsonDeserialize(builder = _ReservedOnlyAllowNull.Builder::class)
            @NoAutoDetect
            class _ReservedOnlyAllowNull
            private constructor(
                private val _reservedOnlyAllowNull: JsonValue,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /**
                 * This is just a placeholder nullable object. Only pass null, not the object itself
                 */
                @JsonProperty("__reserved_only_allow_null")
                @ExcludeMissing
                fun __reservedOnlyAllowNull() = _reservedOnlyAllowNull

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): _ReservedOnlyAllowNull = apply {
                    if (!validated) {
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is _ReservedOnlyAllowNull &&
                        this._reservedOnlyAllowNull == other._reservedOnlyAllowNull &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = Objects.hash(_reservedOnlyAllowNull, additionalProperties)
                    }
                    return hashCode
                }

                override fun toString() =
                    "_ReservedOnlyAllowNull{_reservedOnlyAllowNull=$_reservedOnlyAllowNull, additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var _reservedOnlyAllowNull: JsonValue = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(_reservedOnlyAllowNull: _ReservedOnlyAllowNull) = apply {
                        this._reservedOnlyAllowNull = _reservedOnlyAllowNull._reservedOnlyAllowNull
                        additionalProperties(_reservedOnlyAllowNull.additionalProperties)
                    }

                    /**
                     * This is just a placeholder nullable object. Only pass null, not the object
                     * itself
                     */
                    @JsonProperty("__reserved_only_allow_null")
                    @ExcludeMissing
                    fun _reservedOnlyAllowNull(_reservedOnlyAllowNull: JsonValue) = apply {
                        this._reservedOnlyAllowNull = _reservedOnlyAllowNull
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

                    fun build(): _ReservedOnlyAllowNull =
                        _ReservedOnlyAllowNull(
                            _reservedOnlyAllowNull,
                            additionalProperties.toUnmodifiable()
                        )
                }
            }
        }
    }

    @JsonDeserialize(builder = GroupRoleAcl.Builder::class)
    @NoAutoDetect
    class GroupRoleAcl
    private constructor(
        private val id: JsonField<String>,
        private val objectType: JsonField<ObjectType>,
        private val objectId: JsonField<String>,
        private val restrictObjectType: JsonField<RestrictObjectType>,
        private val _objectOrgId: JsonField<String>,
        private val created: JsonField<OffsetDateTime>,
        private val groupId: JsonField<String>,
        private val roleId: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /** Unique identifier for the acl */
        fun id(): String = id.getRequired("id")

        /** The object type that the ACL applies to */
        fun objectType(): ObjectType = objectType.getRequired("object_type")

        /** The id of the object the ACL applies to */
        fun objectId(): String = objectId.getRequired("object_id")

        /** Optionally restricts the permission grant to just the specified object type */
        fun restrictObjectType(): Optional<RestrictObjectType> =
            Optional.ofNullable(restrictObjectType.getNullable("restrict_object_type"))

        /** The organization the ACL's referred object belongs to */
        fun _objectOrgId(): String = _objectOrgId.getRequired("_object_org_id")

        /** Date of acl creation */
        fun created(): Optional<OffsetDateTime> =
            Optional.ofNullable(created.getNullable("created"))

        /** Id of the group the ACL applies to */
        fun groupId(): String = groupId.getRequired("group_id")

        /** Id of the role the ACL grants */
        fun roleId(): String = roleId.getRequired("role_id")

        /** Unique identifier for the acl */
        @JsonProperty("id") @ExcludeMissing fun _id() = id

        /** The object type that the ACL applies to */
        @JsonProperty("object_type") @ExcludeMissing fun _objectType() = objectType

        /** The id of the object the ACL applies to */
        @JsonProperty("object_id") @ExcludeMissing fun _objectId() = objectId

        /** Optionally restricts the permission grant to just the specified object type */
        @JsonProperty("restrict_object_type")
        @ExcludeMissing
        fun _restrictObjectType() = restrictObjectType

        /** The organization the ACL's referred object belongs to */
        @JsonProperty("_object_org_id") @ExcludeMissing fun __objectOrgId() = _objectOrgId

        /** Date of acl creation */
        @JsonProperty("created") @ExcludeMissing fun _created() = created

        /** Id of the group the ACL applies to */
        @JsonProperty("group_id") @ExcludeMissing fun _groupId() = groupId

        /** Id of the role the ACL grants */
        @JsonProperty("role_id") @ExcludeMissing fun _roleId() = roleId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): GroupRoleAcl = apply {
            if (!validated) {
                id()
                objectType()
                objectId()
                restrictObjectType()
                _objectOrgId()
                created()
                groupId()
                roleId()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is GroupRoleAcl &&
                this.id == other.id &&
                this.objectType == other.objectType &&
                this.objectId == other.objectId &&
                this.restrictObjectType == other.restrictObjectType &&
                this._objectOrgId == other._objectOrgId &&
                this.created == other.created &&
                this.groupId == other.groupId &&
                this.roleId == other.roleId &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        id,
                        objectType,
                        objectId,
                        restrictObjectType,
                        _objectOrgId,
                        created,
                        groupId,
                        roleId,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "GroupRoleAcl{id=$id, objectType=$objectType, objectId=$objectId, restrictObjectType=$restrictObjectType, _objectOrgId=$_objectOrgId, created=$created, groupId=$groupId, roleId=$roleId, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var id: JsonField<String> = JsonMissing.of()
            private var objectType: JsonField<ObjectType> = JsonMissing.of()
            private var objectId: JsonField<String> = JsonMissing.of()
            private var restrictObjectType: JsonField<RestrictObjectType> = JsonMissing.of()
            private var _objectOrgId: JsonField<String> = JsonMissing.of()
            private var created: JsonField<OffsetDateTime> = JsonMissing.of()
            private var groupId: JsonField<String> = JsonMissing.of()
            private var roleId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(groupRoleAcl: GroupRoleAcl) = apply {
                this.id = groupRoleAcl.id
                this.objectType = groupRoleAcl.objectType
                this.objectId = groupRoleAcl.objectId
                this.restrictObjectType = groupRoleAcl.restrictObjectType
                this._objectOrgId = groupRoleAcl._objectOrgId
                this.created = groupRoleAcl.created
                this.groupId = groupRoleAcl.groupId
                this.roleId = groupRoleAcl.roleId
                additionalProperties(groupRoleAcl.additionalProperties)
            }

            /** Unique identifier for the acl */
            fun id(id: String) = id(JsonField.of(id))

            /** Unique identifier for the acl */
            @JsonProperty("id")
            @ExcludeMissing
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** The object type that the ACL applies to */
            fun objectType(objectType: ObjectType) = objectType(JsonField.of(objectType))

            /** The object type that the ACL applies to */
            @JsonProperty("object_type")
            @ExcludeMissing
            fun objectType(objectType: JsonField<ObjectType>) = apply {
                this.objectType = objectType
            }

            /** The id of the object the ACL applies to */
            fun objectId(objectId: String) = objectId(JsonField.of(objectId))

            /** The id of the object the ACL applies to */
            @JsonProperty("object_id")
            @ExcludeMissing
            fun objectId(objectId: JsonField<String>) = apply { this.objectId = objectId }

            /** Optionally restricts the permission grant to just the specified object type */
            fun restrictObjectType(restrictObjectType: RestrictObjectType) =
                restrictObjectType(JsonField.of(restrictObjectType))

            /** Optionally restricts the permission grant to just the specified object type */
            @JsonProperty("restrict_object_type")
            @ExcludeMissing
            fun restrictObjectType(restrictObjectType: JsonField<RestrictObjectType>) = apply {
                this.restrictObjectType = restrictObjectType
            }

            /** The organization the ACL's referred object belongs to */
            fun _objectOrgId(_objectOrgId: String) = _objectOrgId(JsonField.of(_objectOrgId))

            /** The organization the ACL's referred object belongs to */
            @JsonProperty("_object_org_id")
            @ExcludeMissing
            fun _objectOrgId(_objectOrgId: JsonField<String>) = apply {
                this._objectOrgId = _objectOrgId
            }

            /** Date of acl creation */
            fun created(created: OffsetDateTime) = created(JsonField.of(created))

            /** Date of acl creation */
            @JsonProperty("created")
            @ExcludeMissing
            fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

            /** Id of the group the ACL applies to */
            fun groupId(groupId: String) = groupId(JsonField.of(groupId))

            /** Id of the group the ACL applies to */
            @JsonProperty("group_id")
            @ExcludeMissing
            fun groupId(groupId: JsonField<String>) = apply { this.groupId = groupId }

            /** Id of the role the ACL grants */
            fun roleId(roleId: String) = roleId(JsonField.of(roleId))

            /** Id of the role the ACL grants */
            @JsonProperty("role_id")
            @ExcludeMissing
            fun roleId(roleId: JsonField<String>) = apply { this.roleId = roleId }

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

            fun build(): GroupRoleAcl =
                GroupRoleAcl(
                    id,
                    objectType,
                    objectId,
                    restrictObjectType,
                    _objectOrgId,
                    created,
                    groupId,
                    roleId,
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
            private val _reservedOnlyAllowNull: _ReservedOnlyAllowNull? = null,
            private val _json: JsonValue? = null,
        ) {

            private var validated: Boolean = false

            /** The object type that the ACL applies to */
            fun unionMember0(): Optional<UnionMember0> = Optional.ofNullable(unionMember0)

            fun _reservedOnlyAllowNull(): Optional<_ReservedOnlyAllowNull> =
                Optional.ofNullable(_reservedOnlyAllowNull)

            fun isUnionMember0(): Boolean = unionMember0 != null

            fun is_ReservedOnlyAllowNull(): Boolean = _reservedOnlyAllowNull != null

            fun asUnionMember0(): UnionMember0 = unionMember0.getOrThrow("unionMember0")

            fun as_ReservedOnlyAllowNull(): _ReservedOnlyAllowNull =
                _reservedOnlyAllowNull.getOrThrow("_reservedOnlyAllowNull")

            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

            fun <T> accept(visitor: Visitor<T>): T {
                return when {
                    unionMember0 != null -> visitor.visitUnionMember0(unionMember0)
                    _reservedOnlyAllowNull != null ->
                        visitor.visit_ReservedOnlyAllowNull(_reservedOnlyAllowNull)
                    else -> visitor.unknown(_json)
                }
            }

            fun validate(): RestrictObjectType = apply {
                if (!validated) {
                    if (unionMember0 == null && _reservedOnlyAllowNull == null) {
                        throw BraintrustInvalidDataException("Unknown RestrictObjectType: $_json")
                    }
                    _reservedOnlyAllowNull?.validate()
                    validated = true
                }
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is RestrictObjectType &&
                    this.unionMember0 == other.unionMember0 &&
                    this._reservedOnlyAllowNull == other._reservedOnlyAllowNull
            }

            override fun hashCode(): Int {
                return Objects.hash(unionMember0, _reservedOnlyAllowNull)
            }

            override fun toString(): String {
                return when {
                    unionMember0 != null -> "RestrictObjectType{unionMember0=$unionMember0}"
                    _reservedOnlyAllowNull != null ->
                        "RestrictObjectType{_reservedOnlyAllowNull=$_reservedOnlyAllowNull}"
                    _json != null -> "RestrictObjectType{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid RestrictObjectType")
                }
            }

            companion object {

                @JvmStatic
                fun ofUnionMember0(unionMember0: UnionMember0) =
                    RestrictObjectType(unionMember0 = unionMember0)

                @JvmStatic
                fun of_ReservedOnlyAllowNull(_reservedOnlyAllowNull: _ReservedOnlyAllowNull) =
                    RestrictObjectType(_reservedOnlyAllowNull = _reservedOnlyAllowNull)
            }

            interface Visitor<out T> {

                fun visitUnionMember0(unionMember0: UnionMember0): T

                fun visit_ReservedOnlyAllowNull(_reservedOnlyAllowNull: _ReservedOnlyAllowNull): T

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
                    tryDeserialize(node, jacksonTypeRef<_ReservedOnlyAllowNull>()) { it.validate() }
                        ?.let {
                            return RestrictObjectType(_reservedOnlyAllowNull = it, _json = json)
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
                        value._reservedOnlyAllowNull != null ->
                            generator.writeObject(value._reservedOnlyAllowNull)
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

            @JsonDeserialize(builder = _ReservedOnlyAllowNull.Builder::class)
            @NoAutoDetect
            class _ReservedOnlyAllowNull
            private constructor(
                private val _reservedOnlyAllowNull: JsonValue,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /**
                 * This is just a placeholder nullable object. Only pass null, not the object itself
                 */
                @JsonProperty("__reserved_only_allow_null")
                @ExcludeMissing
                fun __reservedOnlyAllowNull() = _reservedOnlyAllowNull

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): _ReservedOnlyAllowNull = apply {
                    if (!validated) {
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is _ReservedOnlyAllowNull &&
                        this._reservedOnlyAllowNull == other._reservedOnlyAllowNull &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = Objects.hash(_reservedOnlyAllowNull, additionalProperties)
                    }
                    return hashCode
                }

                override fun toString() =
                    "_ReservedOnlyAllowNull{_reservedOnlyAllowNull=$_reservedOnlyAllowNull, additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var _reservedOnlyAllowNull: JsonValue = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(_reservedOnlyAllowNull: _ReservedOnlyAllowNull) = apply {
                        this._reservedOnlyAllowNull = _reservedOnlyAllowNull._reservedOnlyAllowNull
                        additionalProperties(_reservedOnlyAllowNull.additionalProperties)
                    }

                    /**
                     * This is just a placeholder nullable object. Only pass null, not the object
                     * itself
                     */
                    @JsonProperty("__reserved_only_allow_null")
                    @ExcludeMissing
                    fun _reservedOnlyAllowNull(_reservedOnlyAllowNull: JsonValue) = apply {
                        this._reservedOnlyAllowNull = _reservedOnlyAllowNull
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

                    fun build(): _ReservedOnlyAllowNull =
                        _ReservedOnlyAllowNull(
                            _reservedOnlyAllowNull,
                            additionalProperties.toUnmodifiable()
                        )
                }
            }
        }
    }
}
