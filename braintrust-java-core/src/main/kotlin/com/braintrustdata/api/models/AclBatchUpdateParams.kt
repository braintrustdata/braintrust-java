// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.Enum
import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.Params
import com.braintrustdata.api.core.checkRequired
import com.braintrustdata.api.core.http.Headers
import com.braintrustdata.api.core.http.QueryParams
import com.braintrustdata.api.core.immutableEmptyMap
import com.braintrustdata.api.core.toImmutable
import com.braintrustdata.api.errors.BraintrustInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Objects
import java.util.Optional

/**
 * Batch update acls. This operation is idempotent, so adding acls which already exist will have no
 * effect, and removing acls which do not exist will have no effect.
 */
class AclBatchUpdateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

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
    fun addAcls(): Optional<List<AddAcl>> = body.addAcls()

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
    fun removeAcls(): Optional<List<RemoveAcl>> = body.removeAcls()

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
    fun _addAcls(): JsonField<List<AddAcl>> = body._addAcls()

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
    fun _removeAcls(): JsonField<List<RemoveAcl>> = body._removeAcls()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class Body
    @JsonCreator
    private constructor(
        @JsonProperty("add_acls")
        @ExcludeMissing
        private val addAcls: JsonField<List<AddAcl>> = JsonMissing.of(),
        @JsonProperty("remove_acls")
        @ExcludeMissing
        private val removeAcls: JsonField<List<RemoveAcl>> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
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
        fun addAcls(): Optional<List<AddAcl>> = Optional.ofNullable(addAcls.getNullable("add_acls"))

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
        fun removeAcls(): Optional<List<RemoveAcl>> =
            Optional.ofNullable(removeAcls.getNullable("remove_acls"))

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
        @JsonProperty("add_acls") @ExcludeMissing fun _addAcls(): JsonField<List<AddAcl>> = addAcls

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
        @JsonProperty("remove_acls")
        @ExcludeMissing
        fun _removeAcls(): JsonField<List<RemoveAcl>> = removeAcls

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            addAcls().ifPresent { it.forEach { it.validate() } }
            removeAcls().ifPresent { it.forEach { it.validate() } }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var addAcls: JsonField<MutableList<AddAcl>>? = null
            private var removeAcls: JsonField<MutableList<RemoveAcl>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                addAcls = body.addAcls.map { it.toMutableList() }
                removeAcls = body.removeAcls.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
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
            fun addAcls(addAcls: List<AddAcl>?) = addAcls(JsonField.ofNullable(addAcls))

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
            fun addAcls(addAcls: Optional<List<AddAcl>>) = addAcls(addAcls.orElse(null))

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
            fun addAcls(addAcls: JsonField<List<AddAcl>>) = apply {
                this.addAcls = addAcls.map { it.toMutableList() }
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
            fun addAddAcl(addAcl: AddAcl) = apply {
                addAcls =
                    (addAcls ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(addAcl)
                    }
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
            fun removeAcls(removeAcls: List<RemoveAcl>?) =
                removeAcls(JsonField.ofNullable(removeAcls))

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
            fun removeAcls(removeAcls: Optional<List<RemoveAcl>>) =
                removeAcls(removeAcls.orElse(null))

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
            fun removeAcls(removeAcls: JsonField<List<RemoveAcl>>) = apply {
                this.removeAcls = removeAcls.map { it.toMutableList() }
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
            fun addRemoveAcl(removeAcl: RemoveAcl) = apply {
                removeAcls =
                    (removeAcls ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(removeAcl)
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

            fun build(): Body =
                Body(
                    (addAcls ?: JsonMissing.of()).map { it.toImmutable() },
                    (removeAcls ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && addAcls == other.addAcls && removeAcls == other.removeAcls && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(addAcls, removeAcls, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{addAcls=$addAcls, removeAcls=$removeAcls, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AclBatchUpdateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(aclBatchUpdateParams: AclBatchUpdateParams) = apply {
            body = aclBatchUpdateParams.body.toBuilder()
            additionalHeaders = aclBatchUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = aclBatchUpdateParams.additionalQueryParams.toBuilder()
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
        fun addAcls(addAcls: List<AddAcl>?) = apply { body.addAcls(addAcls) }

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
        fun addAcls(addAcls: Optional<List<AddAcl>>) = addAcls(addAcls.orElse(null))

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
        fun addAcls(addAcls: JsonField<List<AddAcl>>) = apply { body.addAcls(addAcls) }

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
        fun addAddAcl(addAcl: AddAcl) = apply { body.addAddAcl(addAcl) }

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
        fun removeAcls(removeAcls: List<RemoveAcl>?) = apply { body.removeAcls(removeAcls) }

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
        fun removeAcls(removeAcls: Optional<List<RemoveAcl>>) = removeAcls(removeAcls.orElse(null))

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
        fun removeAcls(removeAcls: JsonField<List<RemoveAcl>>) = apply {
            body.removeAcls(removeAcls)
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
        fun addRemoveAcl(removeAcl: RemoveAcl) = apply { body.addRemoveAcl(removeAcl) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        fun build(): AclBatchUpdateParams =
            AclBatchUpdateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
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
    @NoAutoDetect
    class AddAcl
    @JsonCreator
    private constructor(
        @JsonProperty("object_id")
        @ExcludeMissing
        private val objectId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("object_type")
        @ExcludeMissing
        private val objectType: JsonField<ObjectType> = JsonMissing.of(),
        @JsonProperty("group_id")
        @ExcludeMissing
        private val groupId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("permission")
        @ExcludeMissing
        private val permission: JsonField<Permission> = JsonMissing.of(),
        @JsonProperty("restrict_object_type")
        @ExcludeMissing
        private val restrictObjectType: JsonField<RestrictObjectType> = JsonMissing.of(),
        @JsonProperty("role_id")
        @ExcludeMissing
        private val roleId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("user_id")
        @ExcludeMissing
        private val userId: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The id of the object the ACL applies to */
        fun objectId(): String = objectId.getRequired("object_id")

        /** The object type that the ACL applies to */
        fun objectType(): ObjectType = objectType.getRequired("object_type")

        /**
         * Id of the group the ACL applies to. Exactly one of `user_id` and `group_id` will be
         * provided
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

        /**
         * Id of the role the ACL grants. Exactly one of `permission` and `role_id` will be provided
         */
        fun roleId(): Optional<String> = Optional.ofNullable(roleId.getNullable("role_id"))

        /**
         * Id of the user the ACL applies to. Exactly one of `user_id` and `group_id` will be
         * provided
         */
        fun userId(): Optional<String> = Optional.ofNullable(userId.getNullable("user_id"))

        /** The id of the object the ACL applies to */
        @JsonProperty("object_id") @ExcludeMissing fun _objectId(): JsonField<String> = objectId

        /** The object type that the ACL applies to */
        @JsonProperty("object_type")
        @ExcludeMissing
        fun _objectType(): JsonField<ObjectType> = objectType

        /**
         * Id of the group the ACL applies to. Exactly one of `user_id` and `group_id` will be
         * provided
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
        fun _restrictObjectType(): JsonField<RestrictObjectType> = restrictObjectType

        /**
         * Id of the role the ACL grants. Exactly one of `permission` and `role_id` will be provided
         */
        @JsonProperty("role_id") @ExcludeMissing fun _roleId(): JsonField<String> = roleId

        /**
         * Id of the user the ACL applies to. Exactly one of `user_id` and `group_id` will be
         * provided
         */
        @JsonProperty("user_id") @ExcludeMissing fun _userId(): JsonField<String> = userId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): AddAcl = apply {
            if (validated) {
                return@apply
            }

            objectId()
            objectType()
            groupId()
            permission()
            restrictObjectType()
            roleId()
            userId()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [AddAcl]. */
        class Builder internal constructor() {

            private var objectId: JsonField<String>? = null
            private var objectType: JsonField<ObjectType>? = null
            private var groupId: JsonField<String> = JsonMissing.of()
            private var permission: JsonField<Permission> = JsonMissing.of()
            private var restrictObjectType: JsonField<RestrictObjectType> = JsonMissing.of()
            private var roleId: JsonField<String> = JsonMissing.of()
            private var userId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(addAcl: AddAcl) = apply {
                objectId = addAcl.objectId
                objectType = addAcl.objectType
                groupId = addAcl.groupId
                permission = addAcl.permission
                restrictObjectType = addAcl.restrictObjectType
                roleId = addAcl.roleId
                userId = addAcl.userId
                additionalProperties = addAcl.additionalProperties.toMutableMap()
            }

            /** The id of the object the ACL applies to */
            fun objectId(objectId: String) = objectId(JsonField.of(objectId))

            /** The id of the object the ACL applies to */
            fun objectId(objectId: JsonField<String>) = apply { this.objectId = objectId }

            /** The object type that the ACL applies to */
            fun objectType(objectType: ObjectType) = objectType(JsonField.of(objectType))

            /** The object type that the ACL applies to */
            fun objectType(objectType: JsonField<ObjectType>) = apply {
                this.objectType = objectType
            }

            /**
             * Id of the group the ACL applies to. Exactly one of `user_id` and `group_id` will be
             * provided
             */
            fun groupId(groupId: String?) = groupId(JsonField.ofNullable(groupId))

            /**
             * Id of the group the ACL applies to. Exactly one of `user_id` and `group_id` will be
             * provided
             */
            fun groupId(groupId: Optional<String>) = groupId(groupId.orElse(null))

            /**
             * Id of the group the ACL applies to. Exactly one of `user_id` and `group_id` will be
             * provided
             */
            fun groupId(groupId: JsonField<String>) = apply { this.groupId = groupId }

            /**
             * Permission the ACL grants. Exactly one of `permission` and `role_id` will be provided
             */
            fun permission(permission: Permission?) = permission(JsonField.ofNullable(permission))

            /**
             * Permission the ACL grants. Exactly one of `permission` and `role_id` will be provided
             */
            fun permission(permission: Optional<Permission>) = permission(permission.orElse(null))

            /**
             * Permission the ACL grants. Exactly one of `permission` and `role_id` will be provided
             */
            fun permission(permission: JsonField<Permission>) = apply {
                this.permission = permission
            }

            /**
             * When setting a permission directly, optionally restricts the permission grant to just
             * the specified object type. Cannot be set alongside a `role_id`.
             */
            fun restrictObjectType(restrictObjectType: RestrictObjectType?) =
                restrictObjectType(JsonField.ofNullable(restrictObjectType))

            /**
             * When setting a permission directly, optionally restricts the permission grant to just
             * the specified object type. Cannot be set alongside a `role_id`.
             */
            fun restrictObjectType(restrictObjectType: Optional<RestrictObjectType>) =
                restrictObjectType(restrictObjectType.orElse(null))

            /**
             * When setting a permission directly, optionally restricts the permission grant to just
             * the specified object type. Cannot be set alongside a `role_id`.
             */
            fun restrictObjectType(restrictObjectType: JsonField<RestrictObjectType>) = apply {
                this.restrictObjectType = restrictObjectType
            }

            /**
             * Id of the role the ACL grants. Exactly one of `permission` and `role_id` will be
             * provided
             */
            fun roleId(roleId: String?) = roleId(JsonField.ofNullable(roleId))

            /**
             * Id of the role the ACL grants. Exactly one of `permission` and `role_id` will be
             * provided
             */
            fun roleId(roleId: Optional<String>) = roleId(roleId.orElse(null))

            /**
             * Id of the role the ACL grants. Exactly one of `permission` and `role_id` will be
             * provided
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
            fun userId(userId: Optional<String>) = userId(userId.orElse(null))

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

            fun build(): AddAcl =
                AddAcl(
                    checkRequired("objectId", objectId),
                    checkRequired("objectType", objectType),
                    groupId,
                    permission,
                    restrictObjectType,
                    roleId,
                    userId,
                    additionalProperties.toImmutable(),
                )
        }

        /** The object type that the ACL applies to */
        class ObjectType @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val ORGANIZATION = of("organization")

                @JvmField val PROJECT = of("project")

                @JvmField val EXPERIMENT = of("experiment")

                @JvmField val DATASET = of("dataset")

                @JvmField val PROMPT = of("prompt")

                @JvmField val PROMPT_SESSION = of("prompt_session")

                @JvmField val GROUP = of("group")

                @JvmField val ROLE = of("role")

                @JvmField val ORG_MEMBER = of("org_member")

                @JvmField val PROJECT_LOG = of("project_log")

                @JvmField val ORG_PROJECT = of("org_project")

                @JvmStatic fun of(value: String) = ObjectType(JsonField.of(value))
            }

            /** An enum containing [ObjectType]'s known values. */
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

            /**
             * An enum containing [ObjectType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [ObjectType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
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
                /**
                 * An enum member indicating that [ObjectType] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
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

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws BraintrustInvalidDataException if this class instance's value is a not a
             *   known member.
             */
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

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws BraintrustInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    BraintrustInvalidDataException("Value is not a String")
                }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ObjectType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Permission the ACL grants. Exactly one of `permission` and `role_id` will be provided */
        class Permission @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val CREATE = of("create")

                @JvmField val READ = of("read")

                @JvmField val UPDATE = of("update")

                @JvmField val DELETE = of("delete")

                @JvmField val CREATE_ACLS = of("create_acls")

                @JvmField val READ_ACLS = of("read_acls")

                @JvmField val UPDATE_ACLS = of("update_acls")

                @JvmField val DELETE_ACLS = of("delete_acls")

                @JvmStatic fun of(value: String) = Permission(JsonField.of(value))
            }

            /** An enum containing [Permission]'s known values. */
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

            /**
             * An enum containing [Permission]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Permission] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                CREATE,
                READ,
                UPDATE,
                DELETE,
                CREATE_ACLS,
                READ_ACLS,
                UPDATE_ACLS,
                DELETE_ACLS,
                /**
                 * An enum member indicating that [Permission] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
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

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws BraintrustInvalidDataException if this class instance's value is a not a
             *   known member.
             */
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

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws BraintrustInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    BraintrustInvalidDataException("Value is not a String")
                }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Permission && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * When setting a permission directly, optionally restricts the permission grant to just the
         * specified object type. Cannot be set alongside a `role_id`.
         */
        class RestrictObjectType
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val ORGANIZATION = of("organization")

                @JvmField val PROJECT = of("project")

                @JvmField val EXPERIMENT = of("experiment")

                @JvmField val DATASET = of("dataset")

                @JvmField val PROMPT = of("prompt")

                @JvmField val PROMPT_SESSION = of("prompt_session")

                @JvmField val GROUP = of("group")

                @JvmField val ROLE = of("role")

                @JvmField val ORG_MEMBER = of("org_member")

                @JvmField val PROJECT_LOG = of("project_log")

                @JvmField val ORG_PROJECT = of("org_project")

                @JvmStatic fun of(value: String) = RestrictObjectType(JsonField.of(value))
            }

            /** An enum containing [RestrictObjectType]'s known values. */
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

            /**
             * An enum containing [RestrictObjectType]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [RestrictObjectType] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
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
                /**
                 * An enum member indicating that [RestrictObjectType] was instantiated with an
                 * unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
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

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws BraintrustInvalidDataException if this class instance's value is a not a
             *   known member.
             */
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

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws BraintrustInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    BraintrustInvalidDataException("Value is not a String")
                }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is RestrictObjectType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AddAcl && objectId == other.objectId && objectType == other.objectType && groupId == other.groupId && permission == other.permission && restrictObjectType == other.restrictObjectType && roleId == other.roleId && userId == other.userId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(objectId, objectType, groupId, permission, restrictObjectType, roleId, userId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AddAcl{objectId=$objectId, objectType=$objectType, groupId=$groupId, permission=$permission, restrictObjectType=$restrictObjectType, roleId=$roleId, userId=$userId, additionalProperties=$additionalProperties}"
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
    @NoAutoDetect
    class RemoveAcl
    @JsonCreator
    private constructor(
        @JsonProperty("object_id")
        @ExcludeMissing
        private val objectId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("object_type")
        @ExcludeMissing
        private val objectType: JsonField<ObjectType> = JsonMissing.of(),
        @JsonProperty("group_id")
        @ExcludeMissing
        private val groupId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("permission")
        @ExcludeMissing
        private val permission: JsonField<Permission> = JsonMissing.of(),
        @JsonProperty("restrict_object_type")
        @ExcludeMissing
        private val restrictObjectType: JsonField<RestrictObjectType> = JsonMissing.of(),
        @JsonProperty("role_id")
        @ExcludeMissing
        private val roleId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("user_id")
        @ExcludeMissing
        private val userId: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The id of the object the ACL applies to */
        fun objectId(): String = objectId.getRequired("object_id")

        /** The object type that the ACL applies to */
        fun objectType(): ObjectType = objectType.getRequired("object_type")

        /**
         * Id of the group the ACL applies to. Exactly one of `user_id` and `group_id` will be
         * provided
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

        /**
         * Id of the role the ACL grants. Exactly one of `permission` and `role_id` will be provided
         */
        fun roleId(): Optional<String> = Optional.ofNullable(roleId.getNullable("role_id"))

        /**
         * Id of the user the ACL applies to. Exactly one of `user_id` and `group_id` will be
         * provided
         */
        fun userId(): Optional<String> = Optional.ofNullable(userId.getNullable("user_id"))

        /** The id of the object the ACL applies to */
        @JsonProperty("object_id") @ExcludeMissing fun _objectId(): JsonField<String> = objectId

        /** The object type that the ACL applies to */
        @JsonProperty("object_type")
        @ExcludeMissing
        fun _objectType(): JsonField<ObjectType> = objectType

        /**
         * Id of the group the ACL applies to. Exactly one of `user_id` and `group_id` will be
         * provided
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
        fun _restrictObjectType(): JsonField<RestrictObjectType> = restrictObjectType

        /**
         * Id of the role the ACL grants. Exactly one of `permission` and `role_id` will be provided
         */
        @JsonProperty("role_id") @ExcludeMissing fun _roleId(): JsonField<String> = roleId

        /**
         * Id of the user the ACL applies to. Exactly one of `user_id` and `group_id` will be
         * provided
         */
        @JsonProperty("user_id") @ExcludeMissing fun _userId(): JsonField<String> = userId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): RemoveAcl = apply {
            if (validated) {
                return@apply
            }

            objectId()
            objectType()
            groupId()
            permission()
            restrictObjectType()
            roleId()
            userId()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [RemoveAcl]. */
        class Builder internal constructor() {

            private var objectId: JsonField<String>? = null
            private var objectType: JsonField<ObjectType>? = null
            private var groupId: JsonField<String> = JsonMissing.of()
            private var permission: JsonField<Permission> = JsonMissing.of()
            private var restrictObjectType: JsonField<RestrictObjectType> = JsonMissing.of()
            private var roleId: JsonField<String> = JsonMissing.of()
            private var userId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(removeAcl: RemoveAcl) = apply {
                objectId = removeAcl.objectId
                objectType = removeAcl.objectType
                groupId = removeAcl.groupId
                permission = removeAcl.permission
                restrictObjectType = removeAcl.restrictObjectType
                roleId = removeAcl.roleId
                userId = removeAcl.userId
                additionalProperties = removeAcl.additionalProperties.toMutableMap()
            }

            /** The id of the object the ACL applies to */
            fun objectId(objectId: String) = objectId(JsonField.of(objectId))

            /** The id of the object the ACL applies to */
            fun objectId(objectId: JsonField<String>) = apply { this.objectId = objectId }

            /** The object type that the ACL applies to */
            fun objectType(objectType: ObjectType) = objectType(JsonField.of(objectType))

            /** The object type that the ACL applies to */
            fun objectType(objectType: JsonField<ObjectType>) = apply {
                this.objectType = objectType
            }

            /**
             * Id of the group the ACL applies to. Exactly one of `user_id` and `group_id` will be
             * provided
             */
            fun groupId(groupId: String?) = groupId(JsonField.ofNullable(groupId))

            /**
             * Id of the group the ACL applies to. Exactly one of `user_id` and `group_id` will be
             * provided
             */
            fun groupId(groupId: Optional<String>) = groupId(groupId.orElse(null))

            /**
             * Id of the group the ACL applies to. Exactly one of `user_id` and `group_id` will be
             * provided
             */
            fun groupId(groupId: JsonField<String>) = apply { this.groupId = groupId }

            /**
             * Permission the ACL grants. Exactly one of `permission` and `role_id` will be provided
             */
            fun permission(permission: Permission?) = permission(JsonField.ofNullable(permission))

            /**
             * Permission the ACL grants. Exactly one of `permission` and `role_id` will be provided
             */
            fun permission(permission: Optional<Permission>) = permission(permission.orElse(null))

            /**
             * Permission the ACL grants. Exactly one of `permission` and `role_id` will be provided
             */
            fun permission(permission: JsonField<Permission>) = apply {
                this.permission = permission
            }

            /**
             * When setting a permission directly, optionally restricts the permission grant to just
             * the specified object type. Cannot be set alongside a `role_id`.
             */
            fun restrictObjectType(restrictObjectType: RestrictObjectType?) =
                restrictObjectType(JsonField.ofNullable(restrictObjectType))

            /**
             * When setting a permission directly, optionally restricts the permission grant to just
             * the specified object type. Cannot be set alongside a `role_id`.
             */
            fun restrictObjectType(restrictObjectType: Optional<RestrictObjectType>) =
                restrictObjectType(restrictObjectType.orElse(null))

            /**
             * When setting a permission directly, optionally restricts the permission grant to just
             * the specified object type. Cannot be set alongside a `role_id`.
             */
            fun restrictObjectType(restrictObjectType: JsonField<RestrictObjectType>) = apply {
                this.restrictObjectType = restrictObjectType
            }

            /**
             * Id of the role the ACL grants. Exactly one of `permission` and `role_id` will be
             * provided
             */
            fun roleId(roleId: String?) = roleId(JsonField.ofNullable(roleId))

            /**
             * Id of the role the ACL grants. Exactly one of `permission` and `role_id` will be
             * provided
             */
            fun roleId(roleId: Optional<String>) = roleId(roleId.orElse(null))

            /**
             * Id of the role the ACL grants. Exactly one of `permission` and `role_id` will be
             * provided
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
            fun userId(userId: Optional<String>) = userId(userId.orElse(null))

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

            fun build(): RemoveAcl =
                RemoveAcl(
                    checkRequired("objectId", objectId),
                    checkRequired("objectType", objectType),
                    groupId,
                    permission,
                    restrictObjectType,
                    roleId,
                    userId,
                    additionalProperties.toImmutable(),
                )
        }

        /** The object type that the ACL applies to */
        class ObjectType @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val ORGANIZATION = of("organization")

                @JvmField val PROJECT = of("project")

                @JvmField val EXPERIMENT = of("experiment")

                @JvmField val DATASET = of("dataset")

                @JvmField val PROMPT = of("prompt")

                @JvmField val PROMPT_SESSION = of("prompt_session")

                @JvmField val GROUP = of("group")

                @JvmField val ROLE = of("role")

                @JvmField val ORG_MEMBER = of("org_member")

                @JvmField val PROJECT_LOG = of("project_log")

                @JvmField val ORG_PROJECT = of("org_project")

                @JvmStatic fun of(value: String) = ObjectType(JsonField.of(value))
            }

            /** An enum containing [ObjectType]'s known values. */
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

            /**
             * An enum containing [ObjectType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [ObjectType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
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
                /**
                 * An enum member indicating that [ObjectType] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
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

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws BraintrustInvalidDataException if this class instance's value is a not a
             *   known member.
             */
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

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws BraintrustInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    BraintrustInvalidDataException("Value is not a String")
                }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ObjectType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Permission the ACL grants. Exactly one of `permission` and `role_id` will be provided */
        class Permission @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val CREATE = of("create")

                @JvmField val READ = of("read")

                @JvmField val UPDATE = of("update")

                @JvmField val DELETE = of("delete")

                @JvmField val CREATE_ACLS = of("create_acls")

                @JvmField val READ_ACLS = of("read_acls")

                @JvmField val UPDATE_ACLS = of("update_acls")

                @JvmField val DELETE_ACLS = of("delete_acls")

                @JvmStatic fun of(value: String) = Permission(JsonField.of(value))
            }

            /** An enum containing [Permission]'s known values. */
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

            /**
             * An enum containing [Permission]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Permission] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                CREATE,
                READ,
                UPDATE,
                DELETE,
                CREATE_ACLS,
                READ_ACLS,
                UPDATE_ACLS,
                DELETE_ACLS,
                /**
                 * An enum member indicating that [Permission] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
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

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws BraintrustInvalidDataException if this class instance's value is a not a
             *   known member.
             */
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

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws BraintrustInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    BraintrustInvalidDataException("Value is not a String")
                }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Permission && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * When setting a permission directly, optionally restricts the permission grant to just the
         * specified object type. Cannot be set alongside a `role_id`.
         */
        class RestrictObjectType
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val ORGANIZATION = of("organization")

                @JvmField val PROJECT = of("project")

                @JvmField val EXPERIMENT = of("experiment")

                @JvmField val DATASET = of("dataset")

                @JvmField val PROMPT = of("prompt")

                @JvmField val PROMPT_SESSION = of("prompt_session")

                @JvmField val GROUP = of("group")

                @JvmField val ROLE = of("role")

                @JvmField val ORG_MEMBER = of("org_member")

                @JvmField val PROJECT_LOG = of("project_log")

                @JvmField val ORG_PROJECT = of("org_project")

                @JvmStatic fun of(value: String) = RestrictObjectType(JsonField.of(value))
            }

            /** An enum containing [RestrictObjectType]'s known values. */
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

            /**
             * An enum containing [RestrictObjectType]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [RestrictObjectType] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
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
                /**
                 * An enum member indicating that [RestrictObjectType] was instantiated with an
                 * unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
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

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws BraintrustInvalidDataException if this class instance's value is a not a
             *   known member.
             */
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

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws BraintrustInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    BraintrustInvalidDataException("Value is not a String")
                }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is RestrictObjectType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is RemoveAcl && objectId == other.objectId && objectType == other.objectType && groupId == other.groupId && permission == other.permission && restrictObjectType == other.restrictObjectType && roleId == other.roleId && userId == other.userId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(objectId, objectType, groupId, permission, restrictObjectType, roleId, userId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "RemoveAcl{objectId=$objectId, objectType=$objectType, groupId=$groupId, permission=$permission, restrictObjectType=$restrictObjectType, roleId=$roleId, userId=$userId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AclBatchUpdateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "AclBatchUpdateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
