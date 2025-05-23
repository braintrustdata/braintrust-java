// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.Params
import com.braintrustdata.api.core.checkKnown
import com.braintrustdata.api.core.checkRequired
import com.braintrustdata.api.core.http.Headers
import com.braintrustdata.api.core.http.QueryParams
import com.braintrustdata.api.core.toImmutable
import com.braintrustdata.api.errors.BraintrustInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Create a new role. If there is an existing role with the same name as the one specified in the
 * request, will return the existing role unmodified
 */
class RoleCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Name of the role
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = body.name()

    /**
     * Textual description of the role
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = body.description()

    /**
     * (permission, restrict_object_type) tuples which belong to this role
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun memberPermissions(): Optional<List<MemberPermission>> = body.memberPermissions()

    /**
     * Ids of the roles this role inherits from
     *
     * An inheriting role has all the permissions contained in its member roles, as well as all of
     * their inherited permissions
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun memberRoles(): Optional<List<String>> = body.memberRoles()

    /**
     * For nearly all users, this parameter should be unnecessary. But in the rare case that your
     * API key belongs to multiple organizations, you may specify the name of the organization the
     * role belongs in.
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun orgName(): Optional<String> = body.orgName()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _description(): JsonField<String> = body._description()

    /**
     * Returns the raw JSON value of [memberPermissions].
     *
     * Unlike [memberPermissions], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _memberPermissions(): JsonField<List<MemberPermission>> = body._memberPermissions()

    /**
     * Returns the raw JSON value of [memberRoles].
     *
     * Unlike [memberRoles], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _memberRoles(): JsonField<List<String>> = body._memberRoles()

    /**
     * Returns the raw JSON value of [orgName].
     *
     * Unlike [orgName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _orgName(): JsonField<String> = body._orgName()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RoleCreateParams].
         *
         * The following fields are required:
         * ```java
         * .name()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RoleCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(roleCreateParams: RoleCreateParams) = apply {
            body = roleCreateParams.body.toBuilder()
            additionalHeaders = roleCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = roleCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [name]
         * - [description]
         * - [memberPermissions]
         * - [memberRoles]
         * - [orgName]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Name of the role */
        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /** Textual description of the role */
        fun description(description: String?) = apply { body.description(description) }

        /** Alias for calling [Builder.description] with `description.orElse(null)`. */
        fun description(description: Optional<String>) = description(description.getOrNull())

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        /** (permission, restrict_object_type) tuples which belong to this role */
        fun memberPermissions(memberPermissions: List<MemberPermission>?) = apply {
            body.memberPermissions(memberPermissions)
        }

        /** Alias for calling [Builder.memberPermissions] with `memberPermissions.orElse(null)`. */
        fun memberPermissions(memberPermissions: Optional<List<MemberPermission>>) =
            memberPermissions(memberPermissions.getOrNull())

        /**
         * Sets [Builder.memberPermissions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.memberPermissions] with a well-typed
         * `List<MemberPermission>` value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun memberPermissions(memberPermissions: JsonField<List<MemberPermission>>) = apply {
            body.memberPermissions(memberPermissions)
        }

        /**
         * Adds a single [MemberPermission] to [memberPermissions].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addMemberPermission(memberPermission: MemberPermission) = apply {
            body.addMemberPermission(memberPermission)
        }

        /**
         * Ids of the roles this role inherits from
         *
         * An inheriting role has all the permissions contained in its member roles, as well as all
         * of their inherited permissions
         */
        fun memberRoles(memberRoles: List<String>?) = apply { body.memberRoles(memberRoles) }

        /** Alias for calling [Builder.memberRoles] with `memberRoles.orElse(null)`. */
        fun memberRoles(memberRoles: Optional<List<String>>) = memberRoles(memberRoles.getOrNull())

        /**
         * Sets [Builder.memberRoles] to an arbitrary JSON value.
         *
         * You should usually call [Builder.memberRoles] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun memberRoles(memberRoles: JsonField<List<String>>) = apply {
            body.memberRoles(memberRoles)
        }

        /**
         * Adds a single [String] to [memberRoles].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addMemberRole(memberRole: String) = apply { body.addMemberRole(memberRole) }

        /**
         * For nearly all users, this parameter should be unnecessary. But in the rare case that
         * your API key belongs to multiple organizations, you may specify the name of the
         * organization the role belongs in.
         */
        fun orgName(orgName: String?) = apply { body.orgName(orgName) }

        /** Alias for calling [Builder.orgName] with `orgName.orElse(null)`. */
        fun orgName(orgName: Optional<String>) = orgName(orgName.getOrNull())

        /**
         * Sets [Builder.orgName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.orgName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun orgName(orgName: JsonField<String>) = apply { body.orgName(orgName) }

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
         * Returns an immutable instance of [RoleCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .name()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RoleCreateParams =
            RoleCreateParams(body.build(), additionalHeaders.build(), additionalQueryParams.build())
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    private constructor(
        private val name: JsonField<String>,
        private val description: JsonField<String>,
        private val memberPermissions: JsonField<List<MemberPermission>>,
        private val memberRoles: JsonField<List<String>>,
        private val orgName: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("member_permissions")
            @ExcludeMissing
            memberPermissions: JsonField<List<MemberPermission>> = JsonMissing.of(),
            @JsonProperty("member_roles")
            @ExcludeMissing
            memberRoles: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("org_name") @ExcludeMissing orgName: JsonField<String> = JsonMissing.of(),
        ) : this(name, description, memberPermissions, memberRoles, orgName, mutableMapOf())

        /**
         * Name of the role
         *
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * Textual description of the role
         *
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * (permission, restrict_object_type) tuples which belong to this role
         *
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun memberPermissions(): Optional<List<MemberPermission>> =
            memberPermissions.getOptional("member_permissions")

        /**
         * Ids of the roles this role inherits from
         *
         * An inheriting role has all the permissions contained in its member roles, as well as all
         * of their inherited permissions
         *
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun memberRoles(): Optional<List<String>> = memberRoles.getOptional("member_roles")

        /**
         * For nearly all users, this parameter should be unnecessary. But in the rare case that
         * your API key belongs to multiple organizations, you may specify the name of the
         * organization the role belongs in.
         *
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun orgName(): Optional<String> = orgName.getOptional("org_name")

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [memberPermissions].
         *
         * Unlike [memberPermissions], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("member_permissions")
        @ExcludeMissing
        fun _memberPermissions(): JsonField<List<MemberPermission>> = memberPermissions

        /**
         * Returns the raw JSON value of [memberRoles].
         *
         * Unlike [memberRoles], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("member_roles")
        @ExcludeMissing
        fun _memberRoles(): JsonField<List<String>> = memberRoles

        /**
         * Returns the raw JSON value of [orgName].
         *
         * Unlike [orgName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("org_name") @ExcludeMissing fun _orgName(): JsonField<String> = orgName

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .name()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var name: JsonField<String>? = null
            private var description: JsonField<String> = JsonMissing.of()
            private var memberPermissions: JsonField<MutableList<MemberPermission>>? = null
            private var memberRoles: JsonField<MutableList<String>>? = null
            private var orgName: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                name = body.name
                description = body.description
                memberPermissions = body.memberPermissions.map { it.toMutableList() }
                memberRoles = body.memberRoles.map { it.toMutableList() }
                orgName = body.orgName
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Name of the role */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** Textual description of the role */
            fun description(description: String?) = description(JsonField.ofNullable(description))

            /** Alias for calling [Builder.description] with `description.orElse(null)`. */
            fun description(description: Optional<String>) = description(description.getOrNull())

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /** (permission, restrict_object_type) tuples which belong to this role */
            fun memberPermissions(memberPermissions: List<MemberPermission>?) =
                memberPermissions(JsonField.ofNullable(memberPermissions))

            /**
             * Alias for calling [Builder.memberPermissions] with `memberPermissions.orElse(null)`.
             */
            fun memberPermissions(memberPermissions: Optional<List<MemberPermission>>) =
                memberPermissions(memberPermissions.getOrNull())

            /**
             * Sets [Builder.memberPermissions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.memberPermissions] with a well-typed
             * `List<MemberPermission>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun memberPermissions(memberPermissions: JsonField<List<MemberPermission>>) = apply {
                this.memberPermissions = memberPermissions.map { it.toMutableList() }
            }

            /**
             * Adds a single [MemberPermission] to [memberPermissions].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addMemberPermission(memberPermission: MemberPermission) = apply {
                memberPermissions =
                    (memberPermissions ?: JsonField.of(mutableListOf())).also {
                        checkKnown("memberPermissions", it).add(memberPermission)
                    }
            }

            /**
             * Ids of the roles this role inherits from
             *
             * An inheriting role has all the permissions contained in its member roles, as well as
             * all of their inherited permissions
             */
            fun memberRoles(memberRoles: List<String>?) =
                memberRoles(JsonField.ofNullable(memberRoles))

            /** Alias for calling [Builder.memberRoles] with `memberRoles.orElse(null)`. */
            fun memberRoles(memberRoles: Optional<List<String>>) =
                memberRoles(memberRoles.getOrNull())

            /**
             * Sets [Builder.memberRoles] to an arbitrary JSON value.
             *
             * You should usually call [Builder.memberRoles] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun memberRoles(memberRoles: JsonField<List<String>>) = apply {
                this.memberRoles = memberRoles.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [memberRoles].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addMemberRole(memberRole: String) = apply {
                memberRoles =
                    (memberRoles ?: JsonField.of(mutableListOf())).also {
                        checkKnown("memberRoles", it).add(memberRole)
                    }
            }

            /**
             * For nearly all users, this parameter should be unnecessary. But in the rare case that
             * your API key belongs to multiple organizations, you may specify the name of the
             * organization the role belongs in.
             */
            fun orgName(orgName: String?) = orgName(JsonField.ofNullable(orgName))

            /** Alias for calling [Builder.orgName] with `orgName.orElse(null)`. */
            fun orgName(orgName: Optional<String>) = orgName(orgName.getOrNull())

            /**
             * Sets [Builder.orgName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.orgName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun orgName(orgName: JsonField<String>) = apply { this.orgName = orgName }

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
             *
             * The following fields are required:
             * ```java
             * .name()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("name", name),
                    description,
                    (memberPermissions ?: JsonMissing.of()).map { it.toImmutable() },
                    (memberRoles ?: JsonMissing.of()).map { it.toImmutable() },
                    orgName,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            name()
            description()
            memberPermissions().ifPresent { it.forEach { it.validate() } }
            memberRoles()
            orgName()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: BraintrustInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (name.asKnown().isPresent) 1 else 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (memberPermissions.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (memberRoles.asKnown().getOrNull()?.size ?: 0) +
                (if (orgName.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && name == other.name && description == other.description && memberPermissions == other.memberPermissions && memberRoles == other.memberRoles && orgName == other.orgName && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(name, description, memberPermissions, memberRoles, orgName, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{name=$name, description=$description, memberPermissions=$memberPermissions, memberRoles=$memberRoles, orgName=$orgName, additionalProperties=$additionalProperties}"
    }

    class MemberPermission
    private constructor(
        private val permission: JsonField<Permission>,
        private val restrictObjectType: JsonField<AclObjectType>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("permission")
            @ExcludeMissing
            permission: JsonField<Permission> = JsonMissing.of(),
            @JsonProperty("restrict_object_type")
            @ExcludeMissing
            restrictObjectType: JsonField<AclObjectType> = JsonMissing.of(),
        ) : this(permission, restrictObjectType, mutableMapOf())

        /**
         * Each permission permits a certain type of operation on an object in the system
         *
         * Permissions can be assigned to to objects on an individual basis, or grouped into roles
         *
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun permission(): Permission = permission.getRequired("permission")

        /**
         * The object type that the ACL applies to
         *
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun restrictObjectType(): Optional<AclObjectType> =
            restrictObjectType.getOptional("restrict_object_type")

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

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [MemberPermission].
             *
             * The following fields are required:
             * ```java
             * .permission()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [MemberPermission]. */
        class Builder internal constructor() {

            private var permission: JsonField<Permission>? = null
            private var restrictObjectType: JsonField<AclObjectType> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(memberPermission: MemberPermission) = apply {
                permission = memberPermission.permission
                restrictObjectType = memberPermission.restrictObjectType
                additionalProperties = memberPermission.additionalProperties.toMutableMap()
            }

            /**
             * Each permission permits a certain type of operation on an object in the system
             *
             * Permissions can be assigned to to objects on an individual basis, or grouped into
             * roles
             */
            fun permission(permission: Permission) = permission(JsonField.of(permission))

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

            /** The object type that the ACL applies to */
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
             * Returns an immutable instance of [MemberPermission].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .permission()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): MemberPermission =
                MemberPermission(
                    checkRequired("permission", permission),
                    restrictObjectType,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): MemberPermission = apply {
            if (validated) {
                return@apply
            }

            permission().validate()
            restrictObjectType().ifPresent { it.validate() }
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: BraintrustInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (permission.asKnown().getOrNull()?.validity() ?: 0) +
                (restrictObjectType.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is MemberPermission && permission == other.permission && restrictObjectType == other.restrictObjectType && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(permission, restrictObjectType, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "MemberPermission{permission=$permission, restrictObjectType=$restrictObjectType, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is RoleCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "RoleCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
