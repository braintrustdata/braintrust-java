// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.toImmutable
import com.braintrustdata.api.models.*
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import java.util.Objects
import java.util.Optional

class OrganizationMemberUpdateParams
constructor(
    private val inviteUsers: InviteUsers?,
    private val orgId: String?,
    private val orgName: String?,
    private val removeUsers: RemoveUsers?,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun inviteUsers(): Optional<InviteUsers> = Optional.ofNullable(inviteUsers)

    fun orgId(): Optional<String> = Optional.ofNullable(orgId)

    fun orgName(): Optional<String> = Optional.ofNullable(orgName)

    fun removeUsers(): Optional<RemoveUsers> = Optional.ofNullable(removeUsers)

    @JvmSynthetic
    internal fun getBody(): OrganizationMemberUpdateBody {
        return OrganizationMemberUpdateBody(
            inviteUsers,
            orgId,
            orgName,
            removeUsers,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JsonDeserialize(builder = OrganizationMemberUpdateBody.Builder::class)
    @NoAutoDetect
    class OrganizationMemberUpdateBody
    internal constructor(
        private val inviteUsers: InviteUsers?,
        private val orgId: String?,
        private val orgName: String?,
        private val removeUsers: RemoveUsers?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** Users to invite to the organization */
        @JsonProperty("invite_users") fun inviteUsers(): InviteUsers? = inviteUsers

        /**
         * For nearly all users, this parameter should be unnecessary. But in the rare case that
         * your API key belongs to multiple organizations, or in case you want to explicitly assert
         * the organization you are modifying, you may specify the id of the organization.
         */
        @JsonProperty("org_id") fun orgId(): String? = orgId

        /**
         * For nearly all users, this parameter should be unnecessary. But in the rare case that
         * your API key belongs to multiple organizations, or in case you want to explicitly assert
         * the organization you are modifying, you may specify the name of the organization.
         */
        @JsonProperty("org_name") fun orgName(): String? = orgName

        /** Users to remove from the organization */
        @JsonProperty("remove_users") fun removeUsers(): RemoveUsers? = removeUsers

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var inviteUsers: InviteUsers? = null
            private var orgId: String? = null
            private var orgName: String? = null
            private var removeUsers: RemoveUsers? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(organizationMemberUpdateBody: OrganizationMemberUpdateBody) = apply {
                this.inviteUsers = organizationMemberUpdateBody.inviteUsers
                this.orgId = organizationMemberUpdateBody.orgId
                this.orgName = organizationMemberUpdateBody.orgName
                this.removeUsers = organizationMemberUpdateBody.removeUsers
                additionalProperties(organizationMemberUpdateBody.additionalProperties)
            }

            /** Users to invite to the organization */
            @JsonProperty("invite_users")
            fun inviteUsers(inviteUsers: InviteUsers) = apply { this.inviteUsers = inviteUsers }

            /**
             * For nearly all users, this parameter should be unnecessary. But in the rare case that
             * your API key belongs to multiple organizations, or in case you want to explicitly
             * assert the organization you are modifying, you may specify the id of the
             * organization.
             */
            @JsonProperty("org_id") fun orgId(orgId: String) = apply { this.orgId = orgId }

            /**
             * For nearly all users, this parameter should be unnecessary. But in the rare case that
             * your API key belongs to multiple organizations, or in case you want to explicitly
             * assert the organization you are modifying, you may specify the name of the
             * organization.
             */
            @JsonProperty("org_name")
            fun orgName(orgName: String) = apply { this.orgName = orgName }

            /** Users to remove from the organization */
            @JsonProperty("remove_users")
            fun removeUsers(removeUsers: RemoveUsers) = apply { this.removeUsers = removeUsers }

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

            fun build(): OrganizationMemberUpdateBody =
                OrganizationMemberUpdateBody(
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

            return /* spotless:off */ other is OrganizationMemberUpdateBody && this.inviteUsers == other.inviteUsers && this.orgId == other.orgId && this.orgName == other.orgName && this.removeUsers == other.removeUsers && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(inviteUsers, orgId, orgName, removeUsers, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "OrganizationMemberUpdateBody{inviteUsers=$inviteUsers, orgId=$orgId, orgName=$orgName, removeUsers=$removeUsers, additionalProperties=$additionalProperties}"
    }

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is OrganizationMemberUpdateParams && this.inviteUsers == other.inviteUsers && this.orgId == other.orgId && this.orgName == other.orgName && this.removeUsers == other.removeUsers && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(inviteUsers, orgId, orgName, removeUsers, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "OrganizationMemberUpdateParams{inviteUsers=$inviteUsers, orgId=$orgId, orgName=$orgName, removeUsers=$removeUsers, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var inviteUsers: InviteUsers? = null
        private var orgId: String? = null
        private var orgName: String? = null
        private var removeUsers: RemoveUsers? = null
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(organizationMemberUpdateParams: OrganizationMemberUpdateParams) = apply {
            this.inviteUsers = organizationMemberUpdateParams.inviteUsers
            this.orgId = organizationMemberUpdateParams.orgId
            this.orgName = organizationMemberUpdateParams.orgName
            this.removeUsers = organizationMemberUpdateParams.removeUsers
            additionalHeaders(organizationMemberUpdateParams.additionalHeaders)
            additionalQueryParams(organizationMemberUpdateParams.additionalQueryParams)
            additionalBodyProperties(organizationMemberUpdateParams.additionalBodyProperties)
        }

        /** Users to invite to the organization */
        fun inviteUsers(inviteUsers: InviteUsers) = apply { this.inviteUsers = inviteUsers }

        /**
         * For nearly all users, this parameter should be unnecessary. But in the rare case that
         * your API key belongs to multiple organizations, or in case you want to explicitly assert
         * the organization you are modifying, you may specify the id of the organization.
         */
        fun orgId(orgId: String) = apply { this.orgId = orgId }

        /**
         * For nearly all users, this parameter should be unnecessary. But in the rare case that
         * your API key belongs to multiple organizations, or in case you want to explicitly assert
         * the organization you are modifying, you may specify the name of the organization.
         */
        fun orgName(orgName: String) = apply { this.orgName = orgName }

        /** Users to remove from the organization */
        fun removeUsers(removeUsers: RemoveUsers) = apply { this.removeUsers = removeUsers }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.putAll(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(::putAdditionalHeaders)
        }

        fun removeAdditionalHeader(name: String) = apply { additionalHeaders.removeAll(name) }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.putAll(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                additionalQueryParams.forEach(::putAdditionalQueryParams)
            }

        fun removeAdditionalQueryParam(key: String) = apply { additionalQueryParams.removeAll(key) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): OrganizationMemberUpdateParams =
            OrganizationMemberUpdateParams(
                inviteUsers,
                orgId,
                orgName,
                removeUsers,
                additionalHeaders
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalQueryParams
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalBodyProperties.toImmutable(),
            )
    }

    /** Users to invite to the organization */
    @JsonDeserialize(builder = InviteUsers.Builder::class)
    @NoAutoDetect
    class InviteUsers
    private constructor(
        private val ids: List<String>?,
        private val emails: List<String>?,
        private val sendInviteEmails: Boolean?,
        private val groupIds: List<String>?,
        private val groupNames: List<String>?,
        private val groupId: String?,
        private val groupName: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** Ids of existing users to invite */
        @JsonProperty("ids") fun ids(): List<String>? = ids

        /** Emails of users to invite */
        @JsonProperty("emails") fun emails(): List<String>? = emails

        /** If true, send invite emails to the users who wore actually added */
        @JsonProperty("send_invite_emails") fun sendInviteEmails(): Boolean? = sendInviteEmails

        /** Optional list of group ids to add newly-invited users to. */
        @JsonProperty("group_ids") fun groupIds(): List<String>? = groupIds

        /** Optional list of group names to add newly-invited users to. */
        @JsonProperty("group_names") fun groupNames(): List<String>? = groupNames

        /** Singular form of group_ids */
        @JsonProperty("group_id") fun groupId(): String? = groupId

        /** Singular form of group_names */
        @JsonProperty("group_name") fun groupName(): String? = groupName

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var ids: List<String>? = null
            private var emails: List<String>? = null
            private var sendInviteEmails: Boolean? = null
            private var groupIds: List<String>? = null
            private var groupNames: List<String>? = null
            private var groupId: String? = null
            private var groupName: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(inviteUsers: InviteUsers) = apply {
                this.ids = inviteUsers.ids
                this.emails = inviteUsers.emails
                this.sendInviteEmails = inviteUsers.sendInviteEmails
                this.groupIds = inviteUsers.groupIds
                this.groupNames = inviteUsers.groupNames
                this.groupId = inviteUsers.groupId
                this.groupName = inviteUsers.groupName
                additionalProperties(inviteUsers.additionalProperties)
            }

            /** Ids of existing users to invite */
            @JsonProperty("ids") fun ids(ids: List<String>) = apply { this.ids = ids }

            /** Emails of users to invite */
            @JsonProperty("emails")
            fun emails(emails: List<String>) = apply { this.emails = emails }

            /** If true, send invite emails to the users who wore actually added */
            @JsonProperty("send_invite_emails")
            fun sendInviteEmails(sendInviteEmails: Boolean) = apply {
                this.sendInviteEmails = sendInviteEmails
            }

            /** Optional list of group ids to add newly-invited users to. */
            @JsonProperty("group_ids")
            fun groupIds(groupIds: List<String>) = apply { this.groupIds = groupIds }

            /** Optional list of group names to add newly-invited users to. */
            @JsonProperty("group_names")
            fun groupNames(groupNames: List<String>) = apply { this.groupNames = groupNames }

            /** Singular form of group_ids */
            @JsonProperty("group_id")
            fun groupId(groupId: String) = apply { this.groupId = groupId }

            /** Singular form of group_names */
            @JsonProperty("group_name")
            fun groupName(groupName: String) = apply { this.groupName = groupName }

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

            fun build(): InviteUsers =
                InviteUsers(
                    ids?.toImmutable(),
                    emails?.toImmutable(),
                    sendInviteEmails,
                    groupIds?.toImmutable(),
                    groupNames?.toImmutable(),
                    groupId,
                    groupName,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is InviteUsers && this.ids == other.ids && this.emails == other.emails && this.sendInviteEmails == other.sendInviteEmails && this.groupIds == other.groupIds && this.groupNames == other.groupNames && this.groupId == other.groupId && this.groupName == other.groupName && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(ids, emails, sendInviteEmails, groupIds, groupNames, groupId, groupName, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "InviteUsers{ids=$ids, emails=$emails, sendInviteEmails=$sendInviteEmails, groupIds=$groupIds, groupNames=$groupNames, groupId=$groupId, groupName=$groupName, additionalProperties=$additionalProperties}"
    }

    /** Users to remove from the organization */
    @JsonDeserialize(builder = RemoveUsers.Builder::class)
    @NoAutoDetect
    class RemoveUsers
    private constructor(
        private val ids: List<String>?,
        private val emails: List<String>?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** Ids of users to remove */
        @JsonProperty("ids") fun ids(): List<String>? = ids

        /** Emails of users to remove */
        @JsonProperty("emails") fun emails(): List<String>? = emails

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var ids: List<String>? = null
            private var emails: List<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(removeUsers: RemoveUsers) = apply {
                this.ids = removeUsers.ids
                this.emails = removeUsers.emails
                additionalProperties(removeUsers.additionalProperties)
            }

            /** Ids of users to remove */
            @JsonProperty("ids") fun ids(ids: List<String>) = apply { this.ids = ids }

            /** Emails of users to remove */
            @JsonProperty("emails")
            fun emails(emails: List<String>) = apply { this.emails = emails }

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

            fun build(): RemoveUsers =
                RemoveUsers(
                    ids?.toImmutable(),
                    emails?.toImmutable(),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is RemoveUsers && this.ids == other.ids && this.emails == other.emails && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(ids, emails, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "RemoveUsers{ids=$ids, emails=$emails, additionalProperties=$additionalProperties}"
    }
}
