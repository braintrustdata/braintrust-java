// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.Params
import com.braintrustdata.api.core.checkKnown
import com.braintrustdata.api.core.http.Headers
import com.braintrustdata.api.core.http.QueryParams
import com.braintrustdata.api.core.immutableEmptyMap
import com.braintrustdata.api.core.toImmutable
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Modify organization membership */
class OrganizationMemberUpdateParams private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,

) : Params {

    /** Users to invite to the organization */
    fun inviteUsers(): Optional<InviteUsers> = body.inviteUsers()

    /**
     * For nearly all users, this parameter should be unnecessary. But in the rare case
     * that your API key belongs to multiple organizations, or in case you want to
     * explicitly assert the organization you are modifying, you may specify the id of
     * the organization.
     */
    fun orgId(): Optional<String> = body.orgId()

    /**
     * For nearly all users, this parameter should be unnecessary. But in the rare case
     * that your API key belongs to multiple organizations, or in case you want to
     * explicitly assert the organization you are modifying, you may specify the name
     * of the organization.
     */
    fun orgName(): Optional<String> = body.orgName()

    /** Users to remove from the organization */
    fun removeUsers(): Optional<RemoveUsers> = body.removeUsers()

    /** Users to invite to the organization */
    fun _inviteUsers(): JsonField<InviteUsers> = body._inviteUsers()

    /**
     * For nearly all users, this parameter should be unnecessary. But in the rare case
     * that your API key belongs to multiple organizations, or in case you want to
     * explicitly assert the organization you are modifying, you may specify the id of
     * the organization.
     */
    fun _orgId(): JsonField<String> = body._orgId()

    /**
     * For nearly all users, this parameter should be unnecessary. But in the rare case
     * that your API key belongs to multiple organizations, or in case you want to
     * explicitly assert the organization you are modifying, you may specify the name
     * of the organization.
     */
    fun _orgName(): JsonField<String> = body._orgName()

    /** Users to remove from the organization */
    fun _removeUsers(): JsonField<RemoveUsers> = body._removeUsers()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic
    internal fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class Body @JsonCreator private constructor(
        @JsonProperty("invite_users") @ExcludeMissing private val inviteUsers: JsonField<InviteUsers> = JsonMissing.of(),
        @JsonProperty("org_id") @ExcludeMissing private val orgId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("org_name") @ExcludeMissing private val orgName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("remove_users") @ExcludeMissing private val removeUsers: JsonField<RemoveUsers> = JsonMissing.of(),
        @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),

    ) {

        /** Users to invite to the organization */
        fun inviteUsers(): Optional<InviteUsers> = Optional.ofNullable(inviteUsers.getNullable("invite_users"))

        /**
         * For nearly all users, this parameter should be unnecessary. But in the rare case
         * that your API key belongs to multiple organizations, or in case you want to
         * explicitly assert the organization you are modifying, you may specify the id of
         * the organization.
         */
        fun orgId(): Optional<String> = Optional.ofNullable(orgId.getNullable("org_id"))

        /**
         * For nearly all users, this parameter should be unnecessary. But in the rare case
         * that your API key belongs to multiple organizations, or in case you want to
         * explicitly assert the organization you are modifying, you may specify the name
         * of the organization.
         */
        fun orgName(): Optional<String> = Optional.ofNullable(orgName.getNullable("org_name"))

        /** Users to remove from the organization */
        fun removeUsers(): Optional<RemoveUsers> = Optional.ofNullable(removeUsers.getNullable("remove_users"))

        /** Users to invite to the organization */
        @JsonProperty("invite_users")
        @ExcludeMissing
        fun _inviteUsers(): JsonField<InviteUsers> = inviteUsers

        /**
         * For nearly all users, this parameter should be unnecessary. But in the rare case
         * that your API key belongs to multiple organizations, or in case you want to
         * explicitly assert the organization you are modifying, you may specify the id of
         * the organization.
         */
        @JsonProperty("org_id")
        @ExcludeMissing
        fun _orgId(): JsonField<String> = orgId

        /**
         * For nearly all users, this parameter should be unnecessary. But in the rare case
         * that your API key belongs to multiple organizations, or in case you want to
         * explicitly assert the organization you are modifying, you may specify the name
         * of the organization.
         */
        @JsonProperty("org_name")
        @ExcludeMissing
        fun _orgName(): JsonField<String> = orgName

        /** Users to remove from the organization */
        @JsonProperty("remove_users")
        @ExcludeMissing
        fun _removeUsers(): JsonField<RemoveUsers> = removeUsers

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Body =
            apply {
                if (validated) {
                  return@apply
                }

                inviteUsers().ifPresent { it.validate() }
                orgId()
                orgName()
                removeUsers().ifPresent { it.validate() }
                validated = true
            }

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var inviteUsers: JsonField<InviteUsers> = JsonMissing.of()
            private var orgId: JsonField<String> = JsonMissing.of()
            private var orgName: JsonField<String> = JsonMissing.of()
            private var removeUsers: JsonField<RemoveUsers> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) =
                apply {
                    inviteUsers = body.inviteUsers
                    orgId = body.orgId
                    orgName = body.orgName
                    removeUsers = body.removeUsers
                    additionalProperties = body.additionalProperties.toMutableMap()
                }

            /** Users to invite to the organization */
            fun inviteUsers(inviteUsers: InviteUsers?) = inviteUsers(JsonField.ofNullable(inviteUsers))

            /** Users to invite to the organization */
            fun inviteUsers(inviteUsers: Optional<InviteUsers>) = inviteUsers(inviteUsers.getOrNull())

            /** Users to invite to the organization */
            fun inviteUsers(inviteUsers: JsonField<InviteUsers>) =
                apply {
                    this.inviteUsers = inviteUsers
                }

            /**
             * For nearly all users, this parameter should be unnecessary. But in the rare case
             * that your API key belongs to multiple organizations, or in case you want to
             * explicitly assert the organization you are modifying, you may specify the id of
             * the organization.
             */
            fun orgId(orgId: String?) = orgId(JsonField.ofNullable(orgId))

            /**
             * For nearly all users, this parameter should be unnecessary. But in the rare case
             * that your API key belongs to multiple organizations, or in case you want to
             * explicitly assert the organization you are modifying, you may specify the id of
             * the organization.
             */
            fun orgId(orgId: Optional<String>) = orgId(orgId.getOrNull())

            /**
             * For nearly all users, this parameter should be unnecessary. But in the rare case
             * that your API key belongs to multiple organizations, or in case you want to
             * explicitly assert the organization you are modifying, you may specify the id of
             * the organization.
             */
            fun orgId(orgId: JsonField<String>) =
                apply {
                    this.orgId = orgId
                }

            /**
             * For nearly all users, this parameter should be unnecessary. But in the rare case
             * that your API key belongs to multiple organizations, or in case you want to
             * explicitly assert the organization you are modifying, you may specify the name
             * of the organization.
             */
            fun orgName(orgName: String?) = orgName(JsonField.ofNullable(orgName))

            /**
             * For nearly all users, this parameter should be unnecessary. But in the rare case
             * that your API key belongs to multiple organizations, or in case you want to
             * explicitly assert the organization you are modifying, you may specify the name
             * of the organization.
             */
            fun orgName(orgName: Optional<String>) = orgName(orgName.getOrNull())

            /**
             * For nearly all users, this parameter should be unnecessary. But in the rare case
             * that your API key belongs to multiple organizations, or in case you want to
             * explicitly assert the organization you are modifying, you may specify the name
             * of the organization.
             */
            fun orgName(orgName: JsonField<String>) =
                apply {
                    this.orgName = orgName
                }

            /** Users to remove from the organization */
            fun removeUsers(removeUsers: RemoveUsers?) = removeUsers(JsonField.ofNullable(removeUsers))

            /** Users to remove from the organization */
            fun removeUsers(removeUsers: Optional<RemoveUsers>) = removeUsers(removeUsers.getOrNull())

            /** Users to remove from the organization */
            fun removeUsers(removeUsers: JsonField<RemoveUsers>) =
                apply {
                    this.removeUsers = removeUsers
                }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

            fun putAdditionalProperty(key: String, value: JsonValue) =
                apply {
                    additionalProperties.put(key, value)
                }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun removeAdditionalProperty(key: String) =
                apply {
                    additionalProperties.remove(key)
                }

            fun removeAllAdditionalProperties(keys: Set<String>) =
                apply {
                    keys.forEach(::removeAdditionalProperty)
                }

            fun build(): Body =
                Body(
                  inviteUsers,
                  orgId,
                  orgName,
                  removeUsers,
                  additionalProperties.toImmutable(),
                )
        }

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

        override fun toString() = "Body{inviteUsers=$inviteUsers, orgId=$orgId, orgName=$orgName, removeUsers=$removeUsers, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic
        fun none(): OrganizationMemberUpdateParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [OrganizationMemberUpdateParams].
         */
        @JvmStatic
        fun builder() = Builder()
    }

    /** A builder for [OrganizationMemberUpdateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(organizationMemberUpdateParams: OrganizationMemberUpdateParams) =
            apply {
                body = organizationMemberUpdateParams.body.toBuilder()
                additionalHeaders = organizationMemberUpdateParams.additionalHeaders.toBuilder()
                additionalQueryParams = organizationMemberUpdateParams.additionalQueryParams.toBuilder()
            }

        /** Users to invite to the organization */
        fun inviteUsers(inviteUsers: InviteUsers?) =
            apply {
                body.inviteUsers(inviteUsers)
            }

        /** Users to invite to the organization */
        fun inviteUsers(inviteUsers: Optional<InviteUsers>) = inviteUsers(inviteUsers.getOrNull())

        /** Users to invite to the organization */
        fun inviteUsers(inviteUsers: JsonField<InviteUsers>) =
            apply {
                body.inviteUsers(inviteUsers)
            }

        /**
         * For nearly all users, this parameter should be unnecessary. But in the rare case
         * that your API key belongs to multiple organizations, or in case you want to
         * explicitly assert the organization you are modifying, you may specify the id of
         * the organization.
         */
        fun orgId(orgId: String?) =
            apply {
                body.orgId(orgId)
            }

        /**
         * For nearly all users, this parameter should be unnecessary. But in the rare case
         * that your API key belongs to multiple organizations, or in case you want to
         * explicitly assert the organization you are modifying, you may specify the id of
         * the organization.
         */
        fun orgId(orgId: Optional<String>) = orgId(orgId.getOrNull())

        /**
         * For nearly all users, this parameter should be unnecessary. But in the rare case
         * that your API key belongs to multiple organizations, or in case you want to
         * explicitly assert the organization you are modifying, you may specify the id of
         * the organization.
         */
        fun orgId(orgId: JsonField<String>) =
            apply {
                body.orgId(orgId)
            }

        /**
         * For nearly all users, this parameter should be unnecessary. But in the rare case
         * that your API key belongs to multiple organizations, or in case you want to
         * explicitly assert the organization you are modifying, you may specify the name
         * of the organization.
         */
        fun orgName(orgName: String?) =
            apply {
                body.orgName(orgName)
            }

        /**
         * For nearly all users, this parameter should be unnecessary. But in the rare case
         * that your API key belongs to multiple organizations, or in case you want to
         * explicitly assert the organization you are modifying, you may specify the name
         * of the organization.
         */
        fun orgName(orgName: Optional<String>) = orgName(orgName.getOrNull())

        /**
         * For nearly all users, this parameter should be unnecessary. But in the rare case
         * that your API key belongs to multiple organizations, or in case you want to
         * explicitly assert the organization you are modifying, you may specify the name
         * of the organization.
         */
        fun orgName(orgName: JsonField<String>) =
            apply {
                body.orgName(orgName)
            }

        /** Users to remove from the organization */
        fun removeUsers(removeUsers: RemoveUsers?) =
            apply {
                body.removeUsers(removeUsers)
            }

        /** Users to remove from the organization */
        fun removeUsers(removeUsers: Optional<RemoveUsers>) = removeUsers(removeUsers.getOrNull())

        /** Users to remove from the organization */
        fun removeUsers(removeUsers: JsonField<RemoveUsers>) =
            apply {
                body.removeUsers(removeUsers)
            }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.additionalProperties(additionalBodyProperties)
            }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) =
            apply {
                body.putAdditionalProperty(
                  key, value
                )
            }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) =
            apply {
                body.removeAdditionalProperty(key)
            }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) =
            apply {
                body.removeAllAdditionalProperties(keys)
            }

        fun additionalHeaders(additionalHeaders: Headers) =
            apply {
                this.additionalHeaders.clear()
                putAllAdditionalHeaders(additionalHeaders)
            }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) =
            apply {
                this.additionalHeaders.clear()
                putAllAdditionalHeaders(additionalHeaders)
            }

        fun putAdditionalHeader(name: String, value: String) =
            apply {
                additionalHeaders.put(name, value)
            }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) =
            apply {
                additionalHeaders.put(name, values)
            }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) =
            apply {
                this.additionalHeaders.putAll(additionalHeaders)
            }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) =
            apply {
                this.additionalHeaders.putAll(additionalHeaders)
            }

        fun replaceAdditionalHeaders(name: String, value: String) =
            apply {
                additionalHeaders.replace(name, value)
            }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) =
            apply {
                additionalHeaders.replace(name, values)
            }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) =
            apply {
                this.additionalHeaders.replaceAll(additionalHeaders)
            }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) =
            apply {
                this.additionalHeaders.replaceAll(additionalHeaders)
            }

        fun removeAdditionalHeaders(name: String) =
            apply {
                additionalHeaders.remove(name)
            }

        fun removeAllAdditionalHeaders(names: Set<String>) =
            apply {
                additionalHeaders.removeAll(names)
            }

        fun additionalQueryParams(additionalQueryParams: QueryParams) =
            apply {
                this.additionalQueryParams.clear()
                putAllAdditionalQueryParams(additionalQueryParams)
            }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.clear()
                putAllAdditionalQueryParams(additionalQueryParams)
            }

        fun putAdditionalQueryParam(key: String, value: String) =
            apply {
                additionalQueryParams.put(key, value)
            }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) =
            apply {
                additionalQueryParams.put(key, values)
            }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) =
            apply {
                additionalQueryParams.replace(key, value)
            }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) =
            apply {
                additionalQueryParams.replace(key, values)
            }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) =
            apply {
                additionalQueryParams.remove(key)
            }

        fun removeAllAdditionalQueryParams(keys: Set<String>) =
            apply {
                additionalQueryParams.removeAll(keys)
            }

        fun build(): OrganizationMemberUpdateParams =
            OrganizationMemberUpdateParams(
              body.build(),
              additionalHeaders.build(),
              additionalQueryParams.build(),
            )
    }

    /** Users to invite to the organization */
    @NoAutoDetect
    class InviteUsers @JsonCreator private constructor(
        @JsonProperty("emails") @ExcludeMissing private val emails: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("group_id") @ExcludeMissing private val groupId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("group_ids") @ExcludeMissing private val groupIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("group_name") @ExcludeMissing private val groupName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("group_names") @ExcludeMissing private val groupNames: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("ids") @ExcludeMissing private val ids: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("send_invite_emails") @ExcludeMissing private val sendInviteEmails: JsonField<Boolean> = JsonMissing.of(),
        @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),

    ) {

        /** Emails of users to invite */
        fun emails(): Optional<List<String>> = Optional.ofNullable(emails.getNullable("emails"))

        /** Singular form of group_ids */
        fun groupId(): Optional<String> = Optional.ofNullable(groupId.getNullable("group_id"))

        /** Optional list of group ids to add newly-invited users to. */
        fun groupIds(): Optional<List<String>> = Optional.ofNullable(groupIds.getNullable("group_ids"))

        /** Singular form of group_names */
        fun groupName(): Optional<String> = Optional.ofNullable(groupName.getNullable("group_name"))

        /** Optional list of group names to add newly-invited users to. */
        fun groupNames(): Optional<List<String>> = Optional.ofNullable(groupNames.getNullable("group_names"))

        /** Ids of existing users to invite */
        fun ids(): Optional<List<String>> = Optional.ofNullable(ids.getNullable("ids"))

        /** If true, send invite emails to the users who wore actually added */
        fun sendInviteEmails(): Optional<Boolean> = Optional.ofNullable(sendInviteEmails.getNullable("send_invite_emails"))

        /** Emails of users to invite */
        @JsonProperty("emails")
        @ExcludeMissing
        fun _emails(): JsonField<List<String>> = emails

        /** Singular form of group_ids */
        @JsonProperty("group_id")
        @ExcludeMissing
        fun _groupId(): JsonField<String> = groupId

        /** Optional list of group ids to add newly-invited users to. */
        @JsonProperty("group_ids")
        @ExcludeMissing
        fun _groupIds(): JsonField<List<String>> = groupIds

        /** Singular form of group_names */
        @JsonProperty("group_name")
        @ExcludeMissing
        fun _groupName(): JsonField<String> = groupName

        /** Optional list of group names to add newly-invited users to. */
        @JsonProperty("group_names")
        @ExcludeMissing
        fun _groupNames(): JsonField<List<String>> = groupNames

        /** Ids of existing users to invite */
        @JsonProperty("ids")
        @ExcludeMissing
        fun _ids(): JsonField<List<String>> = ids

        /** If true, send invite emails to the users who wore actually added */
        @JsonProperty("send_invite_emails")
        @ExcludeMissing
        fun _sendInviteEmails(): JsonField<Boolean> = sendInviteEmails

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): InviteUsers =
            apply {
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

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [InviteUsers]. */
            @JvmStatic
            fun builder() = Builder()
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
            internal fun from(inviteUsers: InviteUsers) =
                apply {
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

            /** Emails of users to invite */
            fun emails(emails: Optional<List<String>>) = emails(emails.getOrNull())

            /** Emails of users to invite */
            fun emails(emails: JsonField<List<String>>) =
                apply {
                    this.emails = emails.map { it.toMutableList() }
                }

            /** Emails of users to invite */
            fun addEmail(email: String) =
                apply {
                    emails = (emails ?: JsonField.of(mutableListOf())).also {
                        checkKnown("emails", it).add(email)
                    }
                }

            /** Singular form of group_ids */
            fun groupId(groupId: String?) = groupId(JsonField.ofNullable(groupId))

            /** Singular form of group_ids */
            fun groupId(groupId: Optional<String>) = groupId(groupId.getOrNull())

            /** Singular form of group_ids */
            fun groupId(groupId: JsonField<String>) =
                apply {
                    this.groupId = groupId
                }

            /** Optional list of group ids to add newly-invited users to. */
            fun groupIds(groupIds: List<String>?) = groupIds(JsonField.ofNullable(groupIds))

            /** Optional list of group ids to add newly-invited users to. */
            fun groupIds(groupIds: Optional<List<String>>) = groupIds(groupIds.getOrNull())

            /** Optional list of group ids to add newly-invited users to. */
            fun groupIds(groupIds: JsonField<List<String>>) =
                apply {
                    this.groupIds = groupIds.map { it.toMutableList() }
                }

            /** Optional list of group ids to add newly-invited users to. */
            fun addGroupId(groupId: String) =
                apply {
                    groupIds = (groupIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("groupIds", it).add(groupId)
                    }
                }

            /** Singular form of group_names */
            fun groupName(groupName: String?) = groupName(JsonField.ofNullable(groupName))

            /** Singular form of group_names */
            fun groupName(groupName: Optional<String>) = groupName(groupName.getOrNull())

            /** Singular form of group_names */
            fun groupName(groupName: JsonField<String>) =
                apply {
                    this.groupName = groupName
                }

            /** Optional list of group names to add newly-invited users to. */
            fun groupNames(groupNames: List<String>?) = groupNames(JsonField.ofNullable(groupNames))

            /** Optional list of group names to add newly-invited users to. */
            fun groupNames(groupNames: Optional<List<String>>) = groupNames(groupNames.getOrNull())

            /** Optional list of group names to add newly-invited users to. */
            fun groupNames(groupNames: JsonField<List<String>>) =
                apply {
                    this.groupNames = groupNames.map { it.toMutableList() }
                }

            /** Optional list of group names to add newly-invited users to. */
            fun addGroupName(groupName: String) =
                apply {
                    groupNames = (groupNames ?: JsonField.of(mutableListOf())).also {
                        checkKnown("groupNames", it).add(groupName)
                    }
                }

            /** Ids of existing users to invite */
            fun ids(ids: List<String>?) = ids(JsonField.ofNullable(ids))

            /** Ids of existing users to invite */
            fun ids(ids: Optional<List<String>>) = ids(ids.getOrNull())

            /** Ids of existing users to invite */
            fun ids(ids: JsonField<List<String>>) =
                apply {
                    this.ids = ids.map { it.toMutableList() }
                }

            /** Ids of existing users to invite */
            fun addId(id: String) =
                apply {
                    ids = (ids ?: JsonField.of(mutableListOf())).also {
                        checkKnown("ids", it).add(id)
                    }
                }

            /** If true, send invite emails to the users who wore actually added */
            fun sendInviteEmails(sendInviteEmails: Boolean?) = sendInviteEmails(JsonField.ofNullable(sendInviteEmails))

            /** If true, send invite emails to the users who wore actually added */
            fun sendInviteEmails(sendInviteEmails: Boolean) = sendInviteEmails(sendInviteEmails as Boolean?)

            /** If true, send invite emails to the users who wore actually added */
            fun sendInviteEmails(sendInviteEmails: Optional<Boolean>) = sendInviteEmails(sendInviteEmails.getOrNull())

            /** If true, send invite emails to the users who wore actually added */
            fun sendInviteEmails(sendInviteEmails: JsonField<Boolean>) =
                apply {
                    this.sendInviteEmails = sendInviteEmails
                }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

            fun putAdditionalProperty(key: String, value: JsonValue) =
                apply {
                    additionalProperties.put(key, value)
                }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun removeAdditionalProperty(key: String) =
                apply {
                    additionalProperties.remove(key)
                }

            fun removeAllAdditionalProperties(keys: Set<String>) =
                apply {
                    keys.forEach(::removeAdditionalProperty)
                }

            fun build(): InviteUsers =
                InviteUsers(
                  (emails ?: JsonMissing.of()).map { it.toImmutable() },
                  groupId,
                  (groupIds ?: JsonMissing.of()).map { it.toImmutable() },
                  groupName,
                  (groupNames ?: JsonMissing.of()).map { it.toImmutable() },
                  (ids ?: JsonMissing.of()).map { it.toImmutable() },
                  sendInviteEmails,
                  additionalProperties.toImmutable(),
                )
        }

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

        override fun toString() = "InviteUsers{emails=$emails, groupId=$groupId, groupIds=$groupIds, groupName=$groupName, groupNames=$groupNames, ids=$ids, sendInviteEmails=$sendInviteEmails, additionalProperties=$additionalProperties}"
    }

    /** Users to remove from the organization */
    @NoAutoDetect
    class RemoveUsers @JsonCreator private constructor(
        @JsonProperty("emails") @ExcludeMissing private val emails: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("ids") @ExcludeMissing private val ids: JsonField<List<String>> = JsonMissing.of(),
        @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),

    ) {

        /** Emails of users to remove */
        fun emails(): Optional<List<String>> = Optional.ofNullable(emails.getNullable("emails"))

        /** Ids of users to remove */
        fun ids(): Optional<List<String>> = Optional.ofNullable(ids.getNullable("ids"))

        /** Emails of users to remove */
        @JsonProperty("emails")
        @ExcludeMissing
        fun _emails(): JsonField<List<String>> = emails

        /** Ids of users to remove */
        @JsonProperty("ids")
        @ExcludeMissing
        fun _ids(): JsonField<List<String>> = ids

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): RemoveUsers =
            apply {
                if (validated) {
                  return@apply
                }

                emails()
                ids()
                validated = true
            }

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [RemoveUsers]. */
            @JvmStatic
            fun builder() = Builder()
        }

        /** A builder for [RemoveUsers]. */
        class Builder internal constructor() {

            private var emails: JsonField<MutableList<String>>? = null
            private var ids: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(removeUsers: RemoveUsers) =
                apply {
                    emails = removeUsers.emails.map { it.toMutableList() }
                    ids = removeUsers.ids.map { it.toMutableList() }
                    additionalProperties = removeUsers.additionalProperties.toMutableMap()
                }

            /** Emails of users to remove */
            fun emails(emails: List<String>?) = emails(JsonField.ofNullable(emails))

            /** Emails of users to remove */
            fun emails(emails: Optional<List<String>>) = emails(emails.getOrNull())

            /** Emails of users to remove */
            fun emails(emails: JsonField<List<String>>) =
                apply {
                    this.emails = emails.map { it.toMutableList() }
                }

            /** Emails of users to remove */
            fun addEmail(email: String) =
                apply {
                    emails = (emails ?: JsonField.of(mutableListOf())).also {
                        checkKnown("emails", it).add(email)
                    }
                }

            /** Ids of users to remove */
            fun ids(ids: List<String>?) = ids(JsonField.ofNullable(ids))

            /** Ids of users to remove */
            fun ids(ids: Optional<List<String>>) = ids(ids.getOrNull())

            /** Ids of users to remove */
            fun ids(ids: JsonField<List<String>>) =
                apply {
                    this.ids = ids.map { it.toMutableList() }
                }

            /** Ids of users to remove */
            fun addId(id: String) =
                apply {
                    ids = (ids ?: JsonField.of(mutableListOf())).also {
                        checkKnown("ids", it).add(id)
                    }
                }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

            fun putAdditionalProperty(key: String, value: JsonValue) =
                apply {
                    additionalProperties.put(key, value)
                }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun removeAdditionalProperty(key: String) =
                apply {
                    additionalProperties.remove(key)
                }

            fun removeAllAdditionalProperties(keys: Set<String>) =
                apply {
                    keys.forEach(::removeAdditionalProperty)
                }

            fun build(): RemoveUsers =
                RemoveUsers(
                  (emails ?: JsonMissing.of()).map { it.toImmutable() },
                  (ids ?: JsonMissing.of()).map { it.toImmutable() },
                  additionalProperties.toImmutable(),
                )
        }

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

        override fun toString() = "RemoveUsers{emails=$emails, ids=$ids, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return /* spotless:off */ other is OrganizationMemberUpdateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() = "OrganizationMemberUpdateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
