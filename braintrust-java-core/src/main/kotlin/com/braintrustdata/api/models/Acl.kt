// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.Enum
import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.toImmutable
import com.braintrustdata.api.errors.BraintrustInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
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
 * ACL, as part of a direct permission grant or as part of a role.
 */
@JsonDeserialize(builder = Acl.Builder::class)
@NoAutoDetect
class Acl
private constructor(
    private val id: JsonField<String>,
    private val objectType: JsonField<ObjectType>,
    private val objectId: JsonField<String>,
    private val userId: JsonField<String>,
    private val groupId: JsonField<String>,
    private val permission: JsonField<Permission>,
    private val restrictObjectType: JsonField<RestrictObjectType>,
    private val roleId: JsonField<String>,
    private val _objectOrgId: JsonField<String>,
    private val created: JsonField<OffsetDateTime>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /** Unique identifier for the acl */
    fun id(): String = id.getRequired("id")

    /** The object type that the ACL applies to */
    fun objectType(): ObjectType = objectType.getRequired("object_type")

    /** The id of the object the ACL applies to */
    fun objectId(): String = objectId.getRequired("object_id")

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

    /**
     * When setting a permission directly, optionally restricts the permission grant to just the
     * specified object type. Cannot be set alongside a `role_id`.
     */
    fun restrictObjectType(): Optional<RestrictObjectType> =
        Optional.ofNullable(restrictObjectType.getNullable("restrict_object_type"))

    /** Id of the role the ACL grants. Exactly one of `permission` and `role_id` will be provided */
    fun roleId(): Optional<String> = Optional.ofNullable(roleId.getNullable("role_id"))

    /** The organization the ACL's referred object belongs to */
    fun _objectOrgId(): String = _objectOrgId.getRequired("_object_org_id")

    /** Date of acl creation */
    fun created(): Optional<OffsetDateTime> = Optional.ofNullable(created.getNullable("created"))

    /** Unique identifier for the acl */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /** The object type that the ACL applies to */
    @JsonProperty("object_type") @ExcludeMissing fun _objectType() = objectType

    /** The id of the object the ACL applies to */
    @JsonProperty("object_id") @ExcludeMissing fun _objectId() = objectId

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

    /**
     * When setting a permission directly, optionally restricts the permission grant to just the
     * specified object type. Cannot be set alongside a `role_id`.
     */
    @JsonProperty("restrict_object_type")
    @ExcludeMissing
    fun _restrictObjectType() = restrictObjectType

    /** Id of the role the ACL grants. Exactly one of `permission` and `role_id` will be provided */
    @JsonProperty("role_id") @ExcludeMissing fun _roleId() = roleId

    /** The organization the ACL's referred object belongs to */
    @JsonProperty("_object_org_id") @ExcludeMissing fun __objectOrgId() = _objectOrgId

    /** Date of acl creation */
    @JsonProperty("created") @ExcludeMissing fun _created() = created

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): Acl = apply {
        if (!validated) {
            id()
            objectType()
            objectId()
            userId()
            groupId()
            permission()
            restrictObjectType()
            roleId()
            _objectOrgId()
            created()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var objectType: JsonField<ObjectType> = JsonMissing.of()
        private var objectId: JsonField<String> = JsonMissing.of()
        private var userId: JsonField<String> = JsonMissing.of()
        private var groupId: JsonField<String> = JsonMissing.of()
        private var permission: JsonField<Permission> = JsonMissing.of()
        private var restrictObjectType: JsonField<RestrictObjectType> = JsonMissing.of()
        private var roleId: JsonField<String> = JsonMissing.of()
        private var _objectOrgId: JsonField<String> = JsonMissing.of()
        private var created: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(acl: Acl) = apply {
            this.id = acl.id
            this.objectType = acl.objectType
            this.objectId = acl.objectId
            this.userId = acl.userId
            this.groupId = acl.groupId
            this.permission = acl.permission
            this.restrictObjectType = acl.restrictObjectType
            this.roleId = acl.roleId
            this._objectOrgId = acl._objectOrgId
            this.created = acl.created
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
         * When setting a permission directly, optionally restricts the permission grant to just the
         * specified object type. Cannot be set alongside a `role_id`.
         */
        fun restrictObjectType(restrictObjectType: RestrictObjectType) =
            restrictObjectType(JsonField.of(restrictObjectType))

        /**
         * When setting a permission directly, optionally restricts the permission grant to just the
         * specified object type. Cannot be set alongside a `role_id`.
         */
        @JsonProperty("restrict_object_type")
        @ExcludeMissing
        fun restrictObjectType(restrictObjectType: JsonField<RestrictObjectType>) = apply {
            this.restrictObjectType = restrictObjectType
        }

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
                userId,
                groupId,
                permission,
                restrictObjectType,
                roleId,
                _objectOrgId,
                created,
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

            return /* spotless:off */ other is ObjectType && value == other.value /* spotless:on */
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
                else -> throw BraintrustInvalidDataException("Unknown RestrictObjectType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Acl && id == other.id && objectType == other.objectType && objectId == other.objectId && userId == other.userId && groupId == other.groupId && permission == other.permission && restrictObjectType == other.restrictObjectType && roleId == other.roleId && _objectOrgId == other._objectOrgId && created == other.created && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, objectType, objectId, userId, groupId, permission, restrictObjectType, roleId, _objectOrgId, created, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Acl{id=$id, objectType=$objectType, objectId=$objectId, userId=$userId, groupId=$groupId, permission=$permission, restrictObjectType=$restrictObjectType, roleId=$roleId, _objectOrgId=$_objectOrgId, created=$created, additionalProperties=$additionalProperties}"
}
