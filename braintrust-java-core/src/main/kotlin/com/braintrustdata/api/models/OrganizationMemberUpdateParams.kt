// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.Params
import com.braintrustdata.api.core.checkKnown
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

/** Modify organization membership */
class OrganizationMemberUpdateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Users to invite to the organization
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun inviteUsers(): Optional<InviteUsers> = body.inviteUsers()

    /**
     * For nearly all users, this parameter should be unnecessary. But in the rare case that your
     * API key belongs to multiple organizations, or in case you want to explicitly assert the
     * organization you are modifying, you may specify the id of the organization.
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun orgId(): Optional<String> = body.orgId()

    /**
     * For nearly all users, this parameter should be unnecessary. But in the rare case that your
     * API key belongs to multiple organizations, or in case you want to explicitly assert the
     * organization you are modifying, you may specify the name of the organization.
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun orgName(): Optional<String> = body.orgName()

    /**
     * Users to remove from the organization
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun removeUsers(): Optional<RemoveUsers> = body.removeUsers()

    /**
     * Returns the raw JSON value of [inviteUsers].
     *
     * Unlike [inviteUsers], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _inviteUsers(): JsonField<InviteUsers> = body._inviteUsers()

    /**
     * Returns the raw JSON value of [orgId].
     *
     * Unlike [orgId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _orgId(): JsonField<String> = body._orgId()

    /**
     * Returns the raw JSON value of [orgName].
     *
     * Unlike [orgName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _orgName(): JsonField<String> = body._orgName()

    /**
     * Returns the raw JSON value of [removeUsers].
     *
     * Unlike [removeUsers], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _removeUsers(): JsonField<RemoveUsers> = body._removeUsers()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): OrganizationMemberUpdateParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [OrganizationMemberUpdateParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [OrganizationMemberUpdateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(organizationMemberUpdateParams: OrganizationMemberUpdateParams) = apply {
            body = organizationMemberUpdateParams.body.toBuilder()
            additionalHeaders = organizationMemberUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = organizationMemberUpdateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [inviteUsers]
         * - [orgId]
         * - [orgName]
         * - [removeUsers]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Users to invite to the organization */
        fun inviteUsers(inviteUsers: InviteUsers?) = apply { body.inviteUsers(inviteUsers) }

        /** Alias for calling [Builder.inviteUsers] with `inviteUsers.orElse(null)`. */
        fun inviteUsers(inviteUsers: Optional<InviteUsers>) = inviteUsers(inviteUsers.getOrNull())

        /**
         * Sets [Builder.inviteUsers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inviteUsers] with a well-typed [InviteUsers] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun inviteUsers(inviteUsers: JsonField<InviteUsers>) = apply {
            body.inviteUsers(inviteUsers)
        }

        /**
         * For nearly all users, this parameter should be unnecessary. But in the rare case that
         * your API key belongs to multiple organizations, or in case you want to explicitly assert
         * the organization you are modifying, you may specify the id of the organization.
         */
        fun orgId(orgId: String?) = apply { body.orgId(orgId) }

        /** Alias for calling [Builder.orgId] with `orgId.orElse(null)`. */
        fun orgId(orgId: Optional<String>) = orgId(orgId.getOrNull())

        /**
         * Sets [Builder.orgId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.orgId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun orgId(orgId: JsonField<String>) = apply { body.orgId(orgId) }

        /**
         * For nearly all users, this parameter should be unnecessary. But in the rare case that
         * your API key belongs to multiple organizations, or in case you want to explicitly assert
         * the organization you are modifying, you may specify the name of the organization.
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

        /** Users to remove from the organization */
        fun removeUsers(removeUsers: RemoveUsers?) = apply { body.removeUsers(removeUsers) }

        /** Alias for calling [Builder.removeUsers] with `removeUsers.orElse(null)`. */
        fun removeUsers(removeUsers: Optional<RemoveUsers>) = removeUsers(removeUsers.getOrNull())

        /**
         * Sets [Builder.removeUsers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.removeUsers] with a well-typed [RemoveUsers] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun removeUsers(removeUsers: JsonField<RemoveUsers>) = apply {
            body.removeUsers(removeUsers)
        }

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
         * Returns an immutable instance of [OrganizationMemberUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): OrganizationMemberUpdateParams =
            OrganizationMemberUpdateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    private constructor(
        private val inviteUsers: JsonField<InviteUsers>,
        private val orgId: JsonField<String>,
        private val orgName: JsonField<String>,
        private val removeUsers: JsonField<RemoveUsers>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("invite_users")
            @ExcludeMissing
            inviteUsers: JsonField<InviteUsers> = JsonMissing.of(),
            @JsonProperty("org_id") @ExcludeMissing orgId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("org_name") @ExcludeMissing orgName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("remove_users")
            @ExcludeMissing
            removeUsers: JsonField<RemoveUsers> = JsonMissing.of(),
        ) : this(inviteUsers, orgId, orgName, removeUsers, mutableMapOf())

        /**
         * Users to invite to the organization
         *
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun inviteUsers(): Optional<InviteUsers> = inviteUsers.getOptional("invite_users")

        /**
         * For nearly all users, this parameter should be unnecessary. But in the rare case that
         * your API key belongs to multiple organizations, or in case you want to explicitly assert
         * the organization you are modifying, you may specify the id of the organization.
         *
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun orgId(): Optional<String> = orgId.getOptional("org_id")

        /**
         * For nearly all users, this parameter should be unnecessary. But in the rare case that
         * your API key belongs to multiple organizations, or in case you want to explicitly assert
         * the organization you are modifying, you may specify the name of the organization.
         *
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun orgName(): Optional<String> = orgName.getOptional("org_name")

        /**
         * Users to remove from the organization
         *
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun removeUsers(): Optional<RemoveUsers> = removeUsers.getOptional("remove_users")

        /**
         * Returns the raw JSON value of [inviteUsers].
         *
         * Unlike [inviteUsers], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("invite_users")
        @ExcludeMissing
        fun _inviteUsers(): JsonField<InviteUsers> = inviteUsers

        /**
         * Returns the raw JSON value of [orgId].
         *
         * Unlike [orgId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("org_id") @ExcludeMissing fun _orgId(): JsonField<String> = orgId

        /**
         * Returns the raw JSON value of [orgName].
         *
         * Unlike [orgName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("org_name") @ExcludeMissing fun _orgName(): JsonField<String> = orgName

        /**
         * Returns the raw JSON value of [removeUsers].
         *
         * Unlike [removeUsers], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("remove_users")
        @ExcludeMissing
        fun _removeUsers(): JsonField<RemoveUsers> = removeUsers

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var inviteUsers: JsonField<InviteUsers> = JsonMissing.of()
            private var orgId: JsonField<String> = JsonMissing.of()
            private var orgName: JsonField<String> = JsonMissing.of()
            private var removeUsers: JsonField<RemoveUsers> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                inviteUsers = body.inviteUsers
                orgId = body.orgId
                orgName = body.orgName
                removeUsers = body.removeUsers
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Users to invite to the organization */
            fun inviteUsers(inviteUsers: InviteUsers?) =
                inviteUsers(JsonField.ofNullable(inviteUsers))

            /** Alias for calling [Builder.inviteUsers] with `inviteUsers.orElse(null)`. */
            fun inviteUsers(inviteUsers: Optional<InviteUsers>) =
                inviteUsers(inviteUsers.getOrNull())

            /**
             * Sets [Builder.inviteUsers] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inviteUsers] with a well-typed [InviteUsers] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun inviteUsers(inviteUsers: JsonField<InviteUsers>) = apply {
                this.inviteUsers = inviteUsers
            }

            /**
             * For nearly all users, this parameter should be unnecessary. But in the rare case that
             * your API key belongs to multiple organizations, or in case you want to explicitly
             * assert the organization you are modifying, you may specify the id of the
             * organization.
             */
            fun orgId(orgId: String?) = orgId(JsonField.ofNullable(orgId))

            /** Alias for calling [Builder.orgId] with `orgId.orElse(null)`. */
            fun orgId(orgId: Optional<String>) = orgId(orgId.getOrNull())

            /**
             * Sets [Builder.orgId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.orgId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun orgId(orgId: JsonField<String>) = apply { this.orgId = orgId }

            /**
             * For nearly all users, this parameter should be unnecessary. But in the rare case that
             * your API key belongs to multiple organizations, or in case you want to explicitly
             * assert the organization you are modifying, you may specify the name of the
             * organization.
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

            /** Users to remove from the organization */
            fun removeUsers(removeUsers: RemoveUsers?) =
                removeUsers(JsonField.ofNullable(removeUsers))

            /** Alias for calling [Builder.removeUsers] with `removeUsers.orElse(null)`. */
            fun removeUsers(removeUsers: Optional<RemoveUsers>) =
                removeUsers(removeUsers.getOrNull())

            /**
             * Sets [Builder.removeUsers] to an arbitrary JSON value.
             *
             * You should usually call [Builder.removeUsers] with a well-typed [RemoveUsers] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun removeUsers(removeUsers: JsonField<RemoveUsers>) = apply {
                this.removeUsers = removeUsers
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
                Body(inviteUsers, orgId, orgName, removeUsers, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            inviteUsers().ifPresent { it.validate() }
            orgId()
            orgName()
            removeUsers().ifPresent { it.validate() }
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
            (inviteUsers.asKnown().getOrNull()?.validity() ?: 0) +
                (if (orgId.asKnown().isPresent) 1 else 0) +
                (if (orgName.asKnown().isPresent) 1 else 0) +
                (removeUsers.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && inviteUsers == other.inviteUsers && orgId == other.orgId && orgName == other.orgName && removeUsers == other.removeUsers && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(inviteUsers, orgId, orgName, removeUsers, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{inviteUsers=$inviteUsers, orgId=$orgId, orgName=$orgName, removeUsers=$removeUsers, additionalProperties=$additionalProperties}"
    }

    /** Users to invite to the organization */
    class InviteUsers
    private constructor(
        private val emails: JsonField<List<String>>,
        private val groupId: JsonField<String>,
        private val groupIds: JsonField<List<String>>,
        private val groupName: JsonField<String>,
        private val groupNames: JsonField<List<String>>,
        private val ids: JsonField<List<String>>,
        private val sendInviteEmails: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("emails")
            @ExcludeMissing
            emails: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("group_id") @ExcludeMissing groupId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("group_ids")
            @ExcludeMissing
            groupIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("group_name")
            @ExcludeMissing
            groupName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("group_names")
            @ExcludeMissing
            groupNames: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("ids") @ExcludeMissing ids: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("send_invite_emails")
            @ExcludeMissing
            sendInviteEmails: JsonField<Boolean> = JsonMissing.of(),
        ) : this(
            emails,
            groupId,
            groupIds,
            groupName,
            groupNames,
            ids,
            sendInviteEmails,
            mutableMapOf(),
        )

        /**
         * Emails of users to invite
         *
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun emails(): Optional<List<String>> = emails.getOptional("emails")

        /**
         * Singular form of group_ids
         *
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun groupId(): Optional<String> = groupId.getOptional("group_id")

        /**
         * Optional list of group ids to add newly-invited users to.
         *
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun groupIds(): Optional<List<String>> = groupIds.getOptional("group_ids")

        /**
         * Singular form of group_names
         *
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun groupName(): Optional<String> = groupName.getOptional("group_name")

        /**
         * Optional list of group names to add newly-invited users to.
         *
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun groupNames(): Optional<List<String>> = groupNames.getOptional("group_names")

        /**
         * Ids of existing users to invite
         *
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun ids(): Optional<List<String>> = ids.getOptional("ids")

        /**
         * If true, send invite emails to the users who wore actually added
         *
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun sendInviteEmails(): Optional<Boolean> =
            sendInviteEmails.getOptional("send_invite_emails")

        /**
         * Returns the raw JSON value of [emails].
         *
         * Unlike [emails], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("emails") @ExcludeMissing fun _emails(): JsonField<List<String>> = emails

        /**
         * Returns the raw JSON value of [groupId].
         *
         * Unlike [groupId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("group_id") @ExcludeMissing fun _groupId(): JsonField<String> = groupId

        /**
         * Returns the raw JSON value of [groupIds].
         *
         * Unlike [groupIds], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("group_ids")
        @ExcludeMissing
        fun _groupIds(): JsonField<List<String>> = groupIds

        /**
         * Returns the raw JSON value of [groupName].
         *
         * Unlike [groupName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("group_name") @ExcludeMissing fun _groupName(): JsonField<String> = groupName

        /**
         * Returns the raw JSON value of [groupNames].
         *
         * Unlike [groupNames], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("group_names")
        @ExcludeMissing
        fun _groupNames(): JsonField<List<String>> = groupNames

        /**
         * Returns the raw JSON value of [ids].
         *
         * Unlike [ids], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("ids") @ExcludeMissing fun _ids(): JsonField<List<String>> = ids

        /**
         * Returns the raw JSON value of [sendInviteEmails].
         *
         * Unlike [sendInviteEmails], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("send_invite_emails")
        @ExcludeMissing
        fun _sendInviteEmails(): JsonField<Boolean> = sendInviteEmails

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

            /** Returns a mutable builder for constructing an instance of [InviteUsers]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [InviteUsers]. */
        class Builder internal constructor() {

            private var emails: JsonField<MutableList<String>>? = null
            private var groupId: JsonField<String> = JsonMissing.of()
            private var groupIds: JsonField<MutableList<String>>? = null
            private var groupName: JsonField<String> = JsonMissing.of()
            private var groupNames: JsonField<MutableList<String>>? = null
            private var ids: JsonField<MutableList<String>>? = null
            private var sendInviteEmails: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(inviteUsers: InviteUsers) = apply {
                emails = inviteUsers.emails.map { it.toMutableList() }
                groupId = inviteUsers.groupId
                groupIds = inviteUsers.groupIds.map { it.toMutableList() }
                groupName = inviteUsers.groupName
                groupNames = inviteUsers.groupNames.map { it.toMutableList() }
                ids = inviteUsers.ids.map { it.toMutableList() }
                sendInviteEmails = inviteUsers.sendInviteEmails
                additionalProperties = inviteUsers.additionalProperties.toMutableMap()
            }

            /** Emails of users to invite */
            fun emails(emails: List<String>?) = emails(JsonField.ofNullable(emails))

            /** Alias for calling [Builder.emails] with `emails.orElse(null)`. */
            fun emails(emails: Optional<List<String>>) = emails(emails.getOrNull())

            /**
             * Sets [Builder.emails] to an arbitrary JSON value.
             *
             * You should usually call [Builder.emails] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun emails(emails: JsonField<List<String>>) = apply {
                this.emails = emails.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [emails].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addEmail(email: String) = apply {
                emails =
                    (emails ?: JsonField.of(mutableListOf())).also {
                        checkKnown("emails", it).add(email)
                    }
            }

            /** Singular form of group_ids */
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

            /** Optional list of group ids to add newly-invited users to. */
            fun groupIds(groupIds: List<String>?) = groupIds(JsonField.ofNullable(groupIds))

            /** Alias for calling [Builder.groupIds] with `groupIds.orElse(null)`. */
            fun groupIds(groupIds: Optional<List<String>>) = groupIds(groupIds.getOrNull())

            /**
             * Sets [Builder.groupIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.groupIds] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun groupIds(groupIds: JsonField<List<String>>) = apply {
                this.groupIds = groupIds.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [groupIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addGroupId(groupId: String) = apply {
                groupIds =
                    (groupIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("groupIds", it).add(groupId)
                    }
            }

            /** Singular form of group_names */
            fun groupName(groupName: String?) = groupName(JsonField.ofNullable(groupName))

            /** Alias for calling [Builder.groupName] with `groupName.orElse(null)`. */
            fun groupName(groupName: Optional<String>) = groupName(groupName.getOrNull())

            /**
             * Sets [Builder.groupName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.groupName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun groupName(groupName: JsonField<String>) = apply { this.groupName = groupName }

            /** Optional list of group names to add newly-invited users to. */
            fun groupNames(groupNames: List<String>?) = groupNames(JsonField.ofNullable(groupNames))

            /** Alias for calling [Builder.groupNames] with `groupNames.orElse(null)`. */
            fun groupNames(groupNames: Optional<List<String>>) = groupNames(groupNames.getOrNull())

            /**
             * Sets [Builder.groupNames] to an arbitrary JSON value.
             *
             * You should usually call [Builder.groupNames] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun groupNames(groupNames: JsonField<List<String>>) = apply {
                this.groupNames = groupNames.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [groupNames].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addGroupName(groupName: String) = apply {
                groupNames =
                    (groupNames ?: JsonField.of(mutableListOf())).also {
                        checkKnown("groupNames", it).add(groupName)
                    }
            }

            /** Ids of existing users to invite */
            fun ids(ids: List<String>?) = ids(JsonField.ofNullable(ids))

            /** Alias for calling [Builder.ids] with `ids.orElse(null)`. */
            fun ids(ids: Optional<List<String>>) = ids(ids.getOrNull())

            /**
             * Sets [Builder.ids] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ids] with a well-typed `List<String>` value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ids(ids: JsonField<List<String>>) = apply {
                this.ids = ids.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [ids].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addId(id: String) = apply {
                ids = (ids ?: JsonField.of(mutableListOf())).also { checkKnown("ids", it).add(id) }
            }

            /** If true, send invite emails to the users who wore actually added */
            fun sendInviteEmails(sendInviteEmails: Boolean?) =
                sendInviteEmails(JsonField.ofNullable(sendInviteEmails))

            /**
             * Alias for [Builder.sendInviteEmails].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun sendInviteEmails(sendInviteEmails: Boolean) =
                sendInviteEmails(sendInviteEmails as Boolean?)

            /**
             * Alias for calling [Builder.sendInviteEmails] with `sendInviteEmails.orElse(null)`.
             */
            fun sendInviteEmails(sendInviteEmails: Optional<Boolean>) =
                sendInviteEmails(sendInviteEmails.getOrNull())

            /**
             * Sets [Builder.sendInviteEmails] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sendInviteEmails] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sendInviteEmails(sendInviteEmails: JsonField<Boolean>) = apply {
                this.sendInviteEmails = sendInviteEmails
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
             * Returns an immutable instance of [InviteUsers].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): InviteUsers =
                InviteUsers(
                    (emails ?: JsonMissing.of()).map { it.toImmutable() },
                    groupId,
                    (groupIds ?: JsonMissing.of()).map { it.toImmutable() },
                    groupName,
                    (groupNames ?: JsonMissing.of()).map { it.toImmutable() },
                    (ids ?: JsonMissing.of()).map { it.toImmutable() },
                    sendInviteEmails,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): InviteUsers = apply {
            if (validated) {
                return@apply
            }

            emails()
            groupId()
            groupIds()
            groupName()
            groupNames()
            ids()
            sendInviteEmails()
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
            (emails.asKnown().getOrNull()?.size ?: 0) +
                (if (groupId.asKnown().isPresent) 1 else 0) +
                (groupIds.asKnown().getOrNull()?.size ?: 0) +
                (if (groupName.asKnown().isPresent) 1 else 0) +
                (groupNames.asKnown().getOrNull()?.size ?: 0) +
                (ids.asKnown().getOrNull()?.size ?: 0) +
                (if (sendInviteEmails.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is InviteUsers && emails == other.emails && groupId == other.groupId && groupIds == other.groupIds && groupName == other.groupName && groupNames == other.groupNames && ids == other.ids && sendInviteEmails == other.sendInviteEmails && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(emails, groupId, groupIds, groupName, groupNames, ids, sendInviteEmails, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "InviteUsers{emails=$emails, groupId=$groupId, groupIds=$groupIds, groupName=$groupName, groupNames=$groupNames, ids=$ids, sendInviteEmails=$sendInviteEmails, additionalProperties=$additionalProperties}"
    }

    /** Users to remove from the organization */
    class RemoveUsers
    private constructor(
        private val emails: JsonField<List<String>>,
        private val ids: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("emails")
            @ExcludeMissing
            emails: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("ids") @ExcludeMissing ids: JsonField<List<String>> = JsonMissing.of(),
        ) : this(emails, ids, mutableMapOf())

        /**
         * Emails of users to remove
         *
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun emails(): Optional<List<String>> = emails.getOptional("emails")

        /**
         * Ids of users to remove
         *
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun ids(): Optional<List<String>> = ids.getOptional("ids")

        /**
         * Returns the raw JSON value of [emails].
         *
         * Unlike [emails], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("emails") @ExcludeMissing fun _emails(): JsonField<List<String>> = emails

        /**
         * Returns the raw JSON value of [ids].
         *
         * Unlike [ids], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("ids") @ExcludeMissing fun _ids(): JsonField<List<String>> = ids

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

            /** Returns a mutable builder for constructing an instance of [RemoveUsers]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [RemoveUsers]. */
        class Builder internal constructor() {

            private var emails: JsonField<MutableList<String>>? = null
            private var ids: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(removeUsers: RemoveUsers) = apply {
                emails = removeUsers.emails.map { it.toMutableList() }
                ids = removeUsers.ids.map { it.toMutableList() }
                additionalProperties = removeUsers.additionalProperties.toMutableMap()
            }

            /** Emails of users to remove */
            fun emails(emails: List<String>?) = emails(JsonField.ofNullable(emails))

            /** Alias for calling [Builder.emails] with `emails.orElse(null)`. */
            fun emails(emails: Optional<List<String>>) = emails(emails.getOrNull())

            /**
             * Sets [Builder.emails] to an arbitrary JSON value.
             *
             * You should usually call [Builder.emails] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun emails(emails: JsonField<List<String>>) = apply {
                this.emails = emails.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [emails].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addEmail(email: String) = apply {
                emails =
                    (emails ?: JsonField.of(mutableListOf())).also {
                        checkKnown("emails", it).add(email)
                    }
            }

            /** Ids of users to remove */
            fun ids(ids: List<String>?) = ids(JsonField.ofNullable(ids))

            /** Alias for calling [Builder.ids] with `ids.orElse(null)`. */
            fun ids(ids: Optional<List<String>>) = ids(ids.getOrNull())

            /**
             * Sets [Builder.ids] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ids] with a well-typed `List<String>` value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ids(ids: JsonField<List<String>>) = apply {
                this.ids = ids.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [ids].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addId(id: String) = apply {
                ids = (ids ?: JsonField.of(mutableListOf())).also { checkKnown("ids", it).add(id) }
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
             * Returns an immutable instance of [RemoveUsers].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): RemoveUsers =
                RemoveUsers(
                    (emails ?: JsonMissing.of()).map { it.toImmutable() },
                    (ids ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): RemoveUsers = apply {
            if (validated) {
                return@apply
            }

            emails()
            ids()
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
            (emails.asKnown().getOrNull()?.size ?: 0) + (ids.asKnown().getOrNull()?.size ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is RemoveUsers && emails == other.emails && ids == other.ids && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(emails, ids, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "RemoveUsers{emails=$emails, ids=$ids, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is OrganizationMemberUpdateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "OrganizationMemberUpdateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
