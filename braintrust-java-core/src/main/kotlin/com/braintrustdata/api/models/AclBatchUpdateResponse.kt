// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.checkKnown
import com.braintrustdata.api.core.checkRequired
import com.braintrustdata.api.core.immutableEmptyMap
import com.braintrustdata.api.core.toImmutable
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Objects

@NoAutoDetect
class AclBatchUpdateResponse
@JsonCreator
private constructor(
    @JsonProperty("added_acls")
    @ExcludeMissing
    private val addedAcls: JsonField<List<Acl>> = JsonMissing.of(),
    @JsonProperty("removed_acls")
    @ExcludeMissing
    private val removedAcls: JsonField<List<Acl>> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

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
    fun addedAcls(): List<Acl> = addedAcls.getRequired("added_acls")

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
    fun removedAcls(): List<Acl> = removedAcls.getRequired("removed_acls")

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
    @JsonProperty("added_acls") @ExcludeMissing fun _addedAcls(): JsonField<List<Acl>> = addedAcls

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
    @JsonProperty("removed_acls")
    @ExcludeMissing
    fun _removedAcls(): JsonField<List<Acl>> = removedAcls

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): AclBatchUpdateResponse = apply {
        if (validated) {
            return@apply
        }

        addedAcls().forEach { it.validate() }
        removedAcls().forEach { it.validate() }
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AclBatchUpdateResponse]. */
    class Builder internal constructor() {

        private var addedAcls: JsonField<MutableList<Acl>>? = null
        private var removedAcls: JsonField<MutableList<Acl>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(aclBatchUpdateResponse: AclBatchUpdateResponse) = apply {
            addedAcls = aclBatchUpdateResponse.addedAcls.map { it.toMutableList() }
            removedAcls = aclBatchUpdateResponse.removedAcls.map { it.toMutableList() }
            additionalProperties = aclBatchUpdateResponse.additionalProperties.toMutableMap()
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
        fun addedAcls(addedAcls: List<Acl>) = addedAcls(JsonField.of(addedAcls))

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
        fun addedAcls(addedAcls: JsonField<List<Acl>>) = apply {
            this.addedAcls = addedAcls.map { it.toMutableList() }
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
        fun addAddedAcl(addedAcl: Acl) = apply {
            addedAcls =
                (addedAcls ?: JsonField.of(mutableListOf())).also {
                    checkKnown("addedAcls", it).add(addedAcl)
                }
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
        fun removedAcls(removedAcls: List<Acl>) = removedAcls(JsonField.of(removedAcls))

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
        fun removedAcls(removedAcls: JsonField<List<Acl>>) = apply {
            this.removedAcls = removedAcls.map { it.toMutableList() }
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
        fun addRemovedAcl(removedAcl: Acl) = apply {
            removedAcls =
                (removedAcls ?: JsonField.of(mutableListOf())).also {
                    checkKnown("removedAcls", it).add(removedAcl)
                }
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

        fun build(): AclBatchUpdateResponse =
            AclBatchUpdateResponse(
                checkRequired("addedAcls", addedAcls).map { it.toImmutable() },
                checkRequired("removedAcls", removedAcls).map { it.toImmutable() },
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AclBatchUpdateResponse && addedAcls == other.addedAcls && removedAcls == other.removedAcls && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(addedAcls, removedAcls, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AclBatchUpdateResponse{addedAcls=$addedAcls, removedAcls=$removedAcls, additionalProperties=$additionalProperties}"
}
