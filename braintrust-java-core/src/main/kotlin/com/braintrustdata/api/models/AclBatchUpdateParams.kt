// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.Params
import com.braintrustdata.api.core.checkKnown
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
import kotlin.jvm.optionals.getOrNull

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
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
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
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun removeAcls(): Optional<List<RemoveAcl>> = body.removeAcls()

    /**
     * Returns the raw JSON value of [addAcls].
     *
     * Unlike [addAcls], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _addAcls(): JsonField<List<AddAcl>> = body._addAcls()

    /**
     * Returns the raw JSON value of [removeAcls].
     *
     * Unlike [removeAcls], this method doesn't throw if the JSON field has an unexpected type.
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
         *
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
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
         *
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun removeAcls(): Optional<List<RemoveAcl>> =
            Optional.ofNullable(removeAcls.getNullable("remove_acls"))

        /**
         * Returns the raw JSON value of [addAcls].
         *
         * Unlike [addAcls], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("add_acls") @ExcludeMissing fun _addAcls(): JsonField<List<AddAcl>> = addAcls

        /**
         * Returns the raw JSON value of [removeAcls].
         *
         * Unlike [removeAcls], this method doesn't throw if the JSON field has an unexpected type.
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

            /** Returns a mutable builder for constructing an instance of [Body]. */
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

            /** Alias for calling [Builder.addAcls] with `addAcls.orElse(null)`. */
            fun addAcls(addAcls: Optional<List<AddAcl>>) = addAcls(addAcls.getOrNull())

            /**
             * Sets [Builder.addAcls] to an arbitrary JSON value.
             *
             * You should usually call [Builder.addAcls] with a well-typed `List<AddAcl>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun addAcls(addAcls: JsonField<List<AddAcl>>) = apply {
                this.addAcls = addAcls.map { it.toMutableList() }
            }

            /**
             * Adds a single [AddAcl] to [addAcls].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAddAcl(addAcl: AddAcl) = apply {
                addAcls =
                    (addAcls ?: JsonField.of(mutableListOf())).also {
                        checkKnown("addAcls", it).add(addAcl)
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

            /** Alias for calling [Builder.removeAcls] with `removeAcls.orElse(null)`. */
            fun removeAcls(removeAcls: Optional<List<RemoveAcl>>) =
                removeAcls(removeAcls.getOrNull())

            /**
             * Sets [Builder.removeAcls] to an arbitrary JSON value.
             *
             * You should usually call [Builder.removeAcls] with a well-typed `List<RemoveAcl>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun removeAcls(removeAcls: JsonField<List<RemoveAcl>>) = apply {
                this.removeAcls = removeAcls.map { it.toMutableList() }
            }

            /**
             * Adds a single [RemoveAcl] to [removeAcls].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addRemoveAcl(removeAcl: RemoveAcl) = apply {
                removeAcls =
                    (removeAcls ?: JsonField.of(mutableListOf())).also {
                        checkKnown("removeAcls", it).add(removeAcl)
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

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
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

        @JvmStatic fun none(): AclBatchUpdateParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [AclBatchUpdateParams]. */
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

        /** Alias for calling [Builder.addAcls] with `addAcls.orElse(null)`. */
        fun addAcls(addAcls: Optional<List<AddAcl>>) = addAcls(addAcls.getOrNull())

        /**
         * Sets [Builder.addAcls] to an arbitrary JSON value.
         *
         * You should usually call [Builder.addAcls] with a well-typed `List<AddAcl>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun addAcls(addAcls: JsonField<List<AddAcl>>) = apply { body.addAcls(addAcls) }

        /**
         * Adds a single [AddAcl] to [addAcls].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
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

        /** Alias for calling [Builder.removeAcls] with `removeAcls.orElse(null)`. */
        fun removeAcls(removeAcls: Optional<List<RemoveAcl>>) = removeAcls(removeAcls.getOrNull())

        /**
         * Sets [Builder.removeAcls] to an arbitrary JSON value.
         *
         * You should usually call [Builder.removeAcls] with a well-typed `List<RemoveAcl>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun removeAcls(removeAcls: JsonField<List<RemoveAcl>>) = apply {
            body.removeAcls(removeAcls)
        }

        /**
         * Adds a single [RemoveAcl] to [removeAcls].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
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

        /**
         * Returns an immutable instance of [AclBatchUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
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
        private val objectType: JsonField<AclObjectType> = JsonMissing.of(),
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
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * The id of the object the ACL applies to
         *
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun objectId(): String = objectId.getRequired("object_id")

        /**
         * The object type that the ACL applies to
         *
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun objectType(): AclObjectType = objectType.getRequired("object_type")

        /**
         * Id of the group the ACL applies to. Exactly one of `user_id` and `group_id` will be
         * provided
         *
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun groupId(): Optional<String> = Optional.ofNullable(groupId.getNullable("group_id"))

        /**
         * Permission the ACL grants. Exactly one of `permission` and `role_id` will be provided
         *
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun permission(): Optional<Permission> =
            Optional.ofNullable(permission.getNullable("permission"))

        /**
         * When setting a permission directly, optionally restricts the permission grant to just the
         * specified object type. Cannot be set alongside a `role_id`.
         *
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun restrictObjectType(): Optional<AclObjectType> =
            Optional.ofNullable(restrictObjectType.getNullable("restrict_object_type"))

        /**
         * Id of the role the ACL grants. Exactly one of `permission` and `role_id` will be provided
         *
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun roleId(): Optional<String> = Optional.ofNullable(roleId.getNullable("role_id"))

        /**
         * Id of the user the ACL applies to. Exactly one of `user_id` and `group_id` will be
         * provided
         *
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun userId(): Optional<String> = Optional.ofNullable(userId.getNullable("user_id"))

        /**
         * Returns the raw JSON value of [objectId].
         *
         * Unlike [objectId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("object_id") @ExcludeMissing fun _objectId(): JsonField<String> = objectId

        /**
         * Returns the raw JSON value of [objectType].
         *
         * Unlike [objectType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("object_type")
        @ExcludeMissing
        fun _objectType(): JsonField<AclObjectType> = objectType

        /**
         * Returns the raw JSON value of [groupId].
         *
         * Unlike [groupId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("group_id") @ExcludeMissing fun _groupId(): JsonField<String> = groupId

        /**
         * Returns the raw JSON value of [permission].
         *
         * Unlike [permission], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("permission")
        @ExcludeMissing
        fun _permission(): JsonField<Permission> = permission

        /**
         * Returns the raw JSON value of [restrictObjectType].
         *
         * Unlike [restrictObjectType], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("restrict_object_type")
        @ExcludeMissing
        fun _restrictObjectType(): JsonField<AclObjectType> = restrictObjectType

        /**
         * Returns the raw JSON value of [roleId].
         *
         * Unlike [roleId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("role_id") @ExcludeMissing fun _roleId(): JsonField<String> = roleId

        /**
         * Returns the raw JSON value of [userId].
         *
         * Unlike [userId], this method doesn't throw if the JSON field has an unexpected type.
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

            /**
             * Returns a mutable builder for constructing an instance of [AddAcl].
             *
             * The following fields are required:
             * ```java
             * .objectId()
             * .objectType()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [AddAcl]. */
        class Builder internal constructor() {

            private var objectId: JsonField<String>? = null
            private var objectType: JsonField<AclObjectType>? = null
            private var groupId: JsonField<String> = JsonMissing.of()
            private var permission: JsonField<Permission> = JsonMissing.of()
            private var restrictObjectType: JsonField<AclObjectType> = JsonMissing.of()
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

            /**
             * Sets [Builder.objectId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.objectId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun objectId(objectId: JsonField<String>) = apply { this.objectId = objectId }

            /** The object type that the ACL applies to */
            fun objectType(objectType: AclObjectType) = objectType(JsonField.of(objectType))

            /**
             * Sets [Builder.objectType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.objectType] with a well-typed [AclObjectType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun objectType(objectType: JsonField<AclObjectType>) = apply {
                this.objectType = objectType
            }

            /**
             * Id of the group the ACL applies to. Exactly one of `user_id` and `group_id` will be
             * provided
             */
            fun groupId(groupId: String?) = groupId(JsonField.ofNullable(groupId))

            /** Alias for calling [Builder.groupId] with `groupId.orElse(null)`. */
            fun groupId(groupId: Optional<String>) = groupId(groupId.getOrNull())

            /**
             * Sets [Builder.groupId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.groupId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun groupId(groupId: JsonField<String>) = apply { this.groupId = groupId }

            /**
             * Permission the ACL grants. Exactly one of `permission` and `role_id` will be provided
             */
            fun permission(permission: Permission?) = permission(JsonField.ofNullable(permission))

            /** Alias for calling [Builder.permission] with `permission.orElse(null)`. */
            fun permission(permission: Optional<Permission>) = permission(permission.getOrNull())

            /**
             * Sets [Builder.permission] to an arbitrary JSON value.
             *
             * You should usually call [Builder.permission] with a well-typed [Permission] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun permission(permission: JsonField<Permission>) = apply {
                this.permission = permission
            }

            /**
             * When setting a permission directly, optionally restricts the permission grant to just
             * the specified object type. Cannot be set alongside a `role_id`.
             */
            fun restrictObjectType(restrictObjectType: AclObjectType?) =
                restrictObjectType(JsonField.ofNullable(restrictObjectType))

            /**
             * Alias for calling [Builder.restrictObjectType] with
             * `restrictObjectType.orElse(null)`.
             */
            fun restrictObjectType(restrictObjectType: Optional<AclObjectType>) =
                restrictObjectType(restrictObjectType.getOrNull())

            /**
             * Sets [Builder.restrictObjectType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.restrictObjectType] with a well-typed
             * [AclObjectType] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun restrictObjectType(restrictObjectType: JsonField<AclObjectType>) = apply {
                this.restrictObjectType = restrictObjectType
            }

            /**
             * Id of the role the ACL grants. Exactly one of `permission` and `role_id` will be
             * provided
             */
            fun roleId(roleId: String?) = roleId(JsonField.ofNullable(roleId))

            /** Alias for calling [Builder.roleId] with `roleId.orElse(null)`. */
            fun roleId(roleId: Optional<String>) = roleId(roleId.getOrNull())

            /**
             * Sets [Builder.roleId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.roleId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun roleId(roleId: JsonField<String>) = apply { this.roleId = roleId }

            /**
             * Id of the user the ACL applies to. Exactly one of `user_id` and `group_id` will be
             * provided
             */
            fun userId(userId: String?) = userId(JsonField.ofNullable(userId))

            /** Alias for calling [Builder.userId] with `userId.orElse(null)`. */
            fun userId(userId: Optional<String>) = userId(userId.getOrNull())

            /**
             * Sets [Builder.userId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.userId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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

            /**
             * Returns an immutable instance of [AddAcl].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .objectId()
             * .objectType()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
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
        private val objectType: JsonField<AclObjectType> = JsonMissing.of(),
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
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * The id of the object the ACL applies to
         *
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun objectId(): String = objectId.getRequired("object_id")

        /**
         * The object type that the ACL applies to
         *
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun objectType(): AclObjectType = objectType.getRequired("object_type")

        /**
         * Id of the group the ACL applies to. Exactly one of `user_id` and `group_id` will be
         * provided
         *
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun groupId(): Optional<String> = Optional.ofNullable(groupId.getNullable("group_id"))

        /**
         * Permission the ACL grants. Exactly one of `permission` and `role_id` will be provided
         *
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun permission(): Optional<Permission> =
            Optional.ofNullable(permission.getNullable("permission"))

        /**
         * When setting a permission directly, optionally restricts the permission grant to just the
         * specified object type. Cannot be set alongside a `role_id`.
         *
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun restrictObjectType(): Optional<AclObjectType> =
            Optional.ofNullable(restrictObjectType.getNullable("restrict_object_type"))

        /**
         * Id of the role the ACL grants. Exactly one of `permission` and `role_id` will be provided
         *
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun roleId(): Optional<String> = Optional.ofNullable(roleId.getNullable("role_id"))

        /**
         * Id of the user the ACL applies to. Exactly one of `user_id` and `group_id` will be
         * provided
         *
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun userId(): Optional<String> = Optional.ofNullable(userId.getNullable("user_id"))

        /**
         * Returns the raw JSON value of [objectId].
         *
         * Unlike [objectId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("object_id") @ExcludeMissing fun _objectId(): JsonField<String> = objectId

        /**
         * Returns the raw JSON value of [objectType].
         *
         * Unlike [objectType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("object_type")
        @ExcludeMissing
        fun _objectType(): JsonField<AclObjectType> = objectType

        /**
         * Returns the raw JSON value of [groupId].
         *
         * Unlike [groupId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("group_id") @ExcludeMissing fun _groupId(): JsonField<String> = groupId

        /**
         * Returns the raw JSON value of [permission].
         *
         * Unlike [permission], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("permission")
        @ExcludeMissing
        fun _permission(): JsonField<Permission> = permission

        /**
         * Returns the raw JSON value of [restrictObjectType].
         *
         * Unlike [restrictObjectType], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("restrict_object_type")
        @ExcludeMissing
        fun _restrictObjectType(): JsonField<AclObjectType> = restrictObjectType

        /**
         * Returns the raw JSON value of [roleId].
         *
         * Unlike [roleId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("role_id") @ExcludeMissing fun _roleId(): JsonField<String> = roleId

        /**
         * Returns the raw JSON value of [userId].
         *
         * Unlike [userId], this method doesn't throw if the JSON field has an unexpected type.
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

            /**
             * Returns a mutable builder for constructing an instance of [RemoveAcl].
             *
             * The following fields are required:
             * ```java
             * .objectId()
             * .objectType()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [RemoveAcl]. */
        class Builder internal constructor() {

            private var objectId: JsonField<String>? = null
            private var objectType: JsonField<AclObjectType>? = null
            private var groupId: JsonField<String> = JsonMissing.of()
            private var permission: JsonField<Permission> = JsonMissing.of()
            private var restrictObjectType: JsonField<AclObjectType> = JsonMissing.of()
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

            /**
             * Sets [Builder.objectId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.objectId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun objectId(objectId: JsonField<String>) = apply { this.objectId = objectId }

            /** The object type that the ACL applies to */
            fun objectType(objectType: AclObjectType) = objectType(JsonField.of(objectType))

            /**
             * Sets [Builder.objectType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.objectType] with a well-typed [AclObjectType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun objectType(objectType: JsonField<AclObjectType>) = apply {
                this.objectType = objectType
            }

            /**
             * Id of the group the ACL applies to. Exactly one of `user_id` and `group_id` will be
             * provided
             */
            fun groupId(groupId: String?) = groupId(JsonField.ofNullable(groupId))

            /** Alias for calling [Builder.groupId] with `groupId.orElse(null)`. */
            fun groupId(groupId: Optional<String>) = groupId(groupId.getOrNull())

            /**
             * Sets [Builder.groupId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.groupId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun groupId(groupId: JsonField<String>) = apply { this.groupId = groupId }

            /**
             * Permission the ACL grants. Exactly one of `permission` and `role_id` will be provided
             */
            fun permission(permission: Permission?) = permission(JsonField.ofNullable(permission))

            /** Alias for calling [Builder.permission] with `permission.orElse(null)`. */
            fun permission(permission: Optional<Permission>) = permission(permission.getOrNull())

            /**
             * Sets [Builder.permission] to an arbitrary JSON value.
             *
             * You should usually call [Builder.permission] with a well-typed [Permission] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun permission(permission: JsonField<Permission>) = apply {
                this.permission = permission
            }

            /**
             * When setting a permission directly, optionally restricts the permission grant to just
             * the specified object type. Cannot be set alongside a `role_id`.
             */
            fun restrictObjectType(restrictObjectType: AclObjectType?) =
                restrictObjectType(JsonField.ofNullable(restrictObjectType))

            /**
             * Alias for calling [Builder.restrictObjectType] with
             * `restrictObjectType.orElse(null)`.
             */
            fun restrictObjectType(restrictObjectType: Optional<AclObjectType>) =
                restrictObjectType(restrictObjectType.getOrNull())

            /**
             * Sets [Builder.restrictObjectType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.restrictObjectType] with a well-typed
             * [AclObjectType] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun restrictObjectType(restrictObjectType: JsonField<AclObjectType>) = apply {
                this.restrictObjectType = restrictObjectType
            }

            /**
             * Id of the role the ACL grants. Exactly one of `permission` and `role_id` will be
             * provided
             */
            fun roleId(roleId: String?) = roleId(JsonField.ofNullable(roleId))

            /** Alias for calling [Builder.roleId] with `roleId.orElse(null)`. */
            fun roleId(roleId: Optional<String>) = roleId(roleId.getOrNull())

            /**
             * Sets [Builder.roleId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.roleId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun roleId(roleId: JsonField<String>) = apply { this.roleId = roleId }

            /**
             * Id of the user the ACL applies to. Exactly one of `user_id` and `group_id` will be
             * provided
             */
            fun userId(userId: String?) = userId(JsonField.ofNullable(userId))

            /** Alias for calling [Builder.userId] with `userId.orElse(null)`. */
            fun userId(userId: Optional<String>) = userId(userId.getOrNull())

            /**
             * Sets [Builder.userId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.userId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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

            /**
             * Returns an immutable instance of [RemoveAcl].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .objectId()
             * .objectType()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
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
