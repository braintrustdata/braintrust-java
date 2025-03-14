// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.checkRequired
import com.braintrustdata.api.core.immutableEmptyMap
import com.braintrustdata.api.core.toImmutable
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

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
@NoAutoDetect
class Acl
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("_object_org_id")
    @ExcludeMissing
    private val _objectOrgId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("object_id")
    @ExcludeMissing
    private val objectId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("object_type")
    @ExcludeMissing
    private val objectType: JsonField<AclObjectType> = JsonMissing.of(),
    @JsonProperty("created")
    @ExcludeMissing
    private val created: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("group_id")
    @ExcludeMissing
    private val groupId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("permission")
    @ExcludeMissing
    private val permission: JsonField<Permission> = JsonMissing.of(),
    @JsonProperty("restrict_object_type")
    @ExcludeMissing
    private val restrictObjectType: JsonField<AclObjectType> = JsonMissing.of(),
    @JsonProperty("role_id")
    @ExcludeMissing
    private val roleId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("user_id")
    @ExcludeMissing
    private val userId: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** Unique identifier for the acl */
    fun id(): String = id.getRequired("id")

    /** The organization the ACL's referred object belongs to */
    fun _objectOrgId(): String = _objectOrgId.getRequired("_object_org_id")

    /** The id of the object the ACL applies to */
    fun objectId(): String = objectId.getRequired("object_id")

    /** The object type that the ACL applies to */
    fun objectType(): AclObjectType = objectType.getRequired("object_type")

    /** Date of acl creation */
    fun created(): Optional<OffsetDateTime> = Optional.ofNullable(created.getNullable("created"))

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
    fun restrictObjectType(): Optional<AclObjectType> =
        Optional.ofNullable(restrictObjectType.getNullable("restrict_object_type"))

    /** Id of the role the ACL grants. Exactly one of `permission` and `role_id` will be provided */
    fun roleId(): Optional<String> = Optional.ofNullable(roleId.getNullable("role_id"))

    /**
     * Id of the user the ACL applies to. Exactly one of `user_id` and `group_id` will be provided
     */
    fun userId(): Optional<String> = Optional.ofNullable(userId.getNullable("user_id"))

    /** Unique identifier for the acl */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /** The organization the ACL's referred object belongs to */
    @JsonProperty("_object_org_id")
    @ExcludeMissing
    fun __objectOrgId(): JsonField<String> = _objectOrgId

    /** The id of the object the ACL applies to */
    @JsonProperty("object_id") @ExcludeMissing fun _objectId(): JsonField<String> = objectId

    /** The object type that the ACL applies to */
    @JsonProperty("object_type")
    @ExcludeMissing
    fun _objectType(): JsonField<AclObjectType> = objectType

    /** Date of acl creation */
    @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<OffsetDateTime> = created

    /**
     * Id of the group the ACL applies to. Exactly one of `user_id` and `group_id` will be provided
     */
    @JsonProperty("group_id") @ExcludeMissing fun _groupId(): JsonField<String> = groupId

    /** Permission the ACL grants. Exactly one of `permission` and `role_id` will be provided */
    @JsonProperty("permission")
    @ExcludeMissing
    fun _permission(): JsonField<Permission> = permission

    /**
     * When setting a permission directly, optionally restricts the permission grant to just the
     * specified object type. Cannot be set alongside a `role_id`.
     */
    @JsonProperty("restrict_object_type")
    @ExcludeMissing
    fun _restrictObjectType(): JsonField<AclObjectType> = restrictObjectType

    /** Id of the role the ACL grants. Exactly one of `permission` and `role_id` will be provided */
    @JsonProperty("role_id") @ExcludeMissing fun _roleId(): JsonField<String> = roleId

    /**
     * Id of the user the ACL applies to. Exactly one of `user_id` and `group_id` will be provided
     */
    @JsonProperty("user_id") @ExcludeMissing fun _userId(): JsonField<String> = userId

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): Acl = apply {
        if (validated) {
            return@apply
        }

        id()
        _objectOrgId()
        objectId()
        objectType()
        created()
        groupId()
        permission()
        restrictObjectType()
        roleId()
        userId()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [Acl].
         *
         * The following fields are required:
         * ```java
         * .id()
         * ._objectOrgId()
         * .objectId()
         * .objectType()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Acl]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var _objectOrgId: JsonField<String>? = null
        private var objectId: JsonField<String>? = null
        private var objectType: JsonField<AclObjectType>? = null
        private var created: JsonField<OffsetDateTime> = JsonMissing.of()
        private var groupId: JsonField<String> = JsonMissing.of()
        private var permission: JsonField<Permission> = JsonMissing.of()
        private var restrictObjectType: JsonField<AclObjectType> = JsonMissing.of()
        private var roleId: JsonField<String> = JsonMissing.of()
        private var userId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(acl: Acl) = apply {
            id = acl.id
            _objectOrgId = acl._objectOrgId
            objectId = acl.objectId
            objectType = acl.objectType
            created = acl.created
            groupId = acl.groupId
            permission = acl.permission
            restrictObjectType = acl.restrictObjectType
            roleId = acl.roleId
            userId = acl.userId
            additionalProperties = acl.additionalProperties.toMutableMap()
        }

        /** Unique identifier for the acl */
        fun id(id: String) = id(JsonField.of(id))

        /** Unique identifier for the acl */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The organization the ACL's referred object belongs to */
        fun _objectOrgId(_objectOrgId: String) = _objectOrgId(JsonField.of(_objectOrgId))

        /** The organization the ACL's referred object belongs to */
        fun _objectOrgId(_objectOrgId: JsonField<String>) = apply {
            this._objectOrgId = _objectOrgId
        }

        /** The id of the object the ACL applies to */
        fun objectId(objectId: String) = objectId(JsonField.of(objectId))

        /** The id of the object the ACL applies to */
        fun objectId(objectId: JsonField<String>) = apply { this.objectId = objectId }

        /** The object type that the ACL applies to */
        fun objectType(objectType: AclObjectType) = objectType(JsonField.of(objectType))

        /** The object type that the ACL applies to */
        fun objectType(objectType: JsonField<AclObjectType>) = apply {
            this.objectType = objectType
        }

        /** Date of acl creation */
        fun created(created: OffsetDateTime?) = created(JsonField.ofNullable(created))

        /** Date of acl creation */
        fun created(created: Optional<OffsetDateTime>) = created(created.getOrNull())

        /** Date of acl creation */
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /**
         * Id of the group the ACL applies to. Exactly one of `user_id` and `group_id` will be
         * provided
         */
        fun groupId(groupId: String?) = groupId(JsonField.ofNullable(groupId))

        /**
         * Id of the group the ACL applies to. Exactly one of `user_id` and `group_id` will be
         * provided
         */
        fun groupId(groupId: Optional<String>) = groupId(groupId.getOrNull())

        /**
         * Id of the group the ACL applies to. Exactly one of `user_id` and `group_id` will be
         * provided
         */
        fun groupId(groupId: JsonField<String>) = apply { this.groupId = groupId }

        /** Permission the ACL grants. Exactly one of `permission` and `role_id` will be provided */
        fun permission(permission: Permission?) = permission(JsonField.ofNullable(permission))

        /** Permission the ACL grants. Exactly one of `permission` and `role_id` will be provided */
        fun permission(permission: Optional<Permission>) = permission(permission.getOrNull())

        /** Permission the ACL grants. Exactly one of `permission` and `role_id` will be provided */
        fun permission(permission: JsonField<Permission>) = apply { this.permission = permission }

        /**
         * When setting a permission directly, optionally restricts the permission grant to just the
         * specified object type. Cannot be set alongside a `role_id`.
         */
        fun restrictObjectType(restrictObjectType: AclObjectType?) =
            restrictObjectType(JsonField.ofNullable(restrictObjectType))

        /**
         * When setting a permission directly, optionally restricts the permission grant to just the
         * specified object type. Cannot be set alongside a `role_id`.
         */
        fun restrictObjectType(restrictObjectType: Optional<AclObjectType>) =
            restrictObjectType(restrictObjectType.getOrNull())

        /**
         * When setting a permission directly, optionally restricts the permission grant to just the
         * specified object type. Cannot be set alongside a `role_id`.
         */
        fun restrictObjectType(restrictObjectType: JsonField<AclObjectType>) = apply {
            this.restrictObjectType = restrictObjectType
        }

        /**
         * Id of the role the ACL grants. Exactly one of `permission` and `role_id` will be provided
         */
        fun roleId(roleId: String?) = roleId(JsonField.ofNullable(roleId))

        /**
         * Id of the role the ACL grants. Exactly one of `permission` and `role_id` will be provided
         */
        fun roleId(roleId: Optional<String>) = roleId(roleId.getOrNull())

        /**
         * Id of the role the ACL grants. Exactly one of `permission` and `role_id` will be provided
         */
        fun roleId(roleId: JsonField<String>) = apply { this.roleId = roleId }

        /**
         * Id of the user the ACL applies to. Exactly one of `user_id` and `group_id` will be
         * provided
         */
        fun userId(userId: String?) = userId(JsonField.ofNullable(userId))

        /**
         * Id of the user the ACL applies to. Exactly one of `user_id` and `group_id` will be
         * provided
         */
        fun userId(userId: Optional<String>) = userId(userId.getOrNull())

        /**
         * Id of the user the ACL applies to. Exactly one of `user_id` and `group_id` will be
         * provided
         */
        fun userId(userId: JsonField<String>) = apply { this.userId = userId }

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

        fun build(): Acl =
            Acl(
                checkRequired("id", id),
                checkRequired("_objectOrgId", _objectOrgId),
                checkRequired("objectId", objectId),
                checkRequired("objectType", objectType),
                created,
                groupId,
                permission,
                restrictObjectType,
                roleId,
                userId,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Acl && id == other.id && _objectOrgId == other._objectOrgId && objectId == other.objectId && objectType == other.objectType && created == other.created && groupId == other.groupId && permission == other.permission && restrictObjectType == other.restrictObjectType && roleId == other.roleId && userId == other.userId && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, _objectOrgId, objectId, objectType, created, groupId, permission, restrictObjectType, roleId, userId, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Acl{id=$id, _objectOrgId=$_objectOrgId, objectId=$objectId, objectType=$objectType, created=$created, groupId=$groupId, permission=$permission, restrictObjectType=$restrictObjectType, roleId=$roleId, userId=$userId, additionalProperties=$additionalProperties}"
}
