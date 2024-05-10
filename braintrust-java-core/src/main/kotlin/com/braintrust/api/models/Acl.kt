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

/**
 * An ACL grants a certain permission or role to a certain user or group on an object.
 *
 * ACLs are inherited across the object hierarchy. So for example, if a user has read permissions on
 * a project, they will also have read permissions on any experiment, dataset, etc. created within
 * that project.
 *
 * To restrict a grant to a particular sub-object, you may specify `restrict_object_type` in the
 * ACL.
 */
@JsonDeserialize(builder = Acl.Builder::class)
@NoAutoDetect
class Acl
private constructor(
    private val id: JsonField<String>,
    private val objectType: JsonField<ObjectType>,
    private val objectId: JsonField<String>,
    private val restrictObjectType: JsonField<RestrictObjectType>,
    private val _objectOrgId: JsonField<String>,
    private val created: JsonField<OffsetDateTime>,
    private val userId: JsonField<String>,
    private val groupId: JsonField<String>,
    private val permission: JsonField<Permission>,
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
    fun created(): Optional<OffsetDateTime> = Optional.ofNullable(created.getNullable("created"))

    /**
     * Id of the user the ACL applies to. Exactly one of `user_id` and `group_id` will be provided
     */
    fun userId(): Optional<String> = Optional.ofNullable(userId.getNullable("user_id"))

    /**
     * Id of the group the ACL applies to. Exactly one of `user_id` and `group_id` will be provided
     */
    fun groupId(): Optional<String> = Optional.ofNullable(groupId.getNullable("group_id"))

    /** Permission the ACL grants. Exactly one of `permission` and `role_id` will be provided */
    fun permission(): Optional<Permission> =
        Optional.ofNullable(permission.getNullable("permission"))

    /** Id of the role the ACL grants. Exactly one of `permission` and `role_id` will be provided */
    fun roleId(): Optional<String> = Optional.ofNullable(roleId.getNullable("role_id"))

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

    /**
     * Id of the user the ACL applies to. Exactly one of `user_id` and `group_id` will be provided
     */
    @JsonProperty("user_id") @ExcludeMissing fun _userId() = userId

    /**
     * Id of the group the ACL applies to. Exactly one of `user_id` and `group_id` will be provided
     */
    @JsonProperty("group_id") @ExcludeMissing fun _groupId() = groupId

    /** Permission the ACL grants. Exactly one of `permission` and `role_id` will be provided */
    @JsonProperty("permission") @ExcludeMissing fun _permission() = permission

    /** Id of the role the ACL grants. Exactly one of `permission` and `role_id` will be provided */
    @JsonProperty("role_id") @ExcludeMissing fun _roleId() = roleId

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): Acl = apply {
        if (!validated) {
            id()
            objectType()
            objectId()
            restrictObjectType()
            _objectOrgId()
            created()
            userId()
            groupId()
            permission()
            roleId()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Acl &&
            this.id == other.id &&
            this.objectType == other.objectType &&
            this.objectId == other.objectId &&
            this.restrictObjectType == other.restrictObjectType &&
            this._objectOrgId == other._objectOrgId &&
            this.created == other.created &&
            this.userId == other.userId &&
            this.groupId == other.groupId &&
            this.permission == other.permission &&
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
                    groupId,
                    permission,
                    roleId,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "Acl{id=$id, objectType=$objectType, objectId=$objectId, restrictObjectType=$restrictObjectType, _objectOrgId=$_objectOrgId, created=$created, userId=$userId, groupId=$groupId, permission=$permission, roleId=$roleId, additionalProperties=$additionalProperties}"

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
        private var groupId: JsonField<String> = JsonMissing.of()
        private var permission: JsonField<Permission> = JsonMissing.of()
        private var roleId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(acl: Acl) = apply {
            this.id = acl.id
            this.objectType = acl.objectType
            this.objectId = acl.objectId
            this.restrictObjectType = acl.restrictObjectType
            this._objectOrgId = acl._objectOrgId
            this.created = acl.created
            this.userId = acl.userId
            this.groupId = acl.groupId
            this.permission = acl.permission
            this.roleId = acl.roleId
            additionalProperties(acl.additionalProperties)
        }

        /** Unique identifier for the acl */
        fun id(id: String) = id(JsonField.of(id))

        /** Unique identifier for the acl */
        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        /** The object type that the ACL applies to */
        fun objectType(objectType: ObjectType) = objectType(JsonField.of(objectType))

        /** The object type that the ACL applies to */
        @JsonProperty("object_type")
        @ExcludeMissing
        fun objectType(objectType: JsonField<ObjectType>) = apply { this.objectType = objectType }

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

        /**
         * Id of the user the ACL applies to. Exactly one of `user_id` and `group_id` will be
         * provided
         */
        fun userId(userId: String) = userId(JsonField.of(userId))

        /**
         * Id of the user the ACL applies to. Exactly one of `user_id` and `group_id` will be
         * provided
         */
        @JsonProperty("user_id")
        @ExcludeMissing
        fun userId(userId: JsonField<String>) = apply { this.userId = userId }

        /**
         * Id of the group the ACL applies to. Exactly one of `user_id` and `group_id` will be
         * provided
         */
        fun groupId(groupId: String) = groupId(JsonField.of(groupId))

        /**
         * Id of the group the ACL applies to. Exactly one of `user_id` and `group_id` will be
         * provided
         */
        @JsonProperty("group_id")
        @ExcludeMissing
        fun groupId(groupId: JsonField<String>) = apply { this.groupId = groupId }

        /** Permission the ACL grants. Exactly one of `permission` and `role_id` will be provided */
        fun permission(permission: Permission) = permission(JsonField.of(permission))

        /** Permission the ACL grants. Exactly one of `permission` and `role_id` will be provided */
        @JsonProperty("permission")
        @ExcludeMissing
        fun permission(permission: JsonField<Permission>) = apply { this.permission = permission }

        /**
         * Id of the role the ACL grants. Exactly one of `permission` and `role_id` will be provided
         */
        fun roleId(roleId: String) = roleId(JsonField.of(roleId))

        /**
         * Id of the role the ACL grants. Exactly one of `permission` and `role_id` will be provided
         */
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

        fun build(): Acl =
            Acl(
                id,
                objectType,
                objectId,
                restrictObjectType,
                _objectOrgId,
                created,
                userId,
                groupId,
                permission,
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
