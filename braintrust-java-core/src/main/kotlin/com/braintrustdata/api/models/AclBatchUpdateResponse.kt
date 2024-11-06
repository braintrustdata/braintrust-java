// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.toUnmodifiable
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import java.util.Objects

@JsonDeserialize(builder = AclBatchUpdateResponse.Builder::class)
@NoAutoDetect
class AclBatchUpdateResponse
private constructor(
    private val addedAcls: JsonField<List<Acl>>,
    private val removedAcls: JsonField<List<Acl>>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

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
    @JsonProperty("added_acls") @ExcludeMissing fun _addedAcls() = addedAcls

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
    @JsonProperty("removed_acls") @ExcludeMissing fun _removedAcls() = removedAcls

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): AclBatchUpdateResponse = apply {
        if (!validated) {
            addedAcls().forEach { it.validate() }
            removedAcls().forEach { it.validate() }
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var addedAcls: JsonField<List<Acl>> = JsonMissing.of()
        private var removedAcls: JsonField<List<Acl>> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(aclBatchUpdateResponse: AclBatchUpdateResponse) = apply {
            this.addedAcls = aclBatchUpdateResponse.addedAcls
            this.removedAcls = aclBatchUpdateResponse.removedAcls
            additionalProperties(aclBatchUpdateResponse.additionalProperties)
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
        @JsonProperty("added_acls")
        @ExcludeMissing
        fun addedAcls(addedAcls: JsonField<List<Acl>>) = apply { this.addedAcls = addedAcls }

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
        @JsonProperty("removed_acls")
        @ExcludeMissing
        fun removedAcls(removedAcls: JsonField<List<Acl>>) = apply {
            this.removedAcls = removedAcls
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

        fun build(): AclBatchUpdateResponse =
            AclBatchUpdateResponse(
                addedAcls.map { it.toUnmodifiable() },
                removedAcls.map { it.toUnmodifiable() },
                additionalProperties.toUnmodifiable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AclBatchUpdateResponse && this.addedAcls == other.addedAcls && this.removedAcls == other.removedAcls && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(addedAcls, removedAcls, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() =
        "AclBatchUpdateResponse{addedAcls=$addedAcls, removedAcls=$removedAcls, additionalProperties=$additionalProperties}"
}
