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
import java.util.Optional

@JsonDeserialize(builder = PatchOrganizationMembers.Builder::class)
@NoAutoDetect
class PatchOrganizationMembers
private constructor(
    private val inviteUsers: JsonField<InviteUsers>,
    private val removeUsers: JsonField<RemoveUsers>,
    private val orgName: JsonField<String>,
    private val orgId: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** Users to invite to the organization */
    fun inviteUsers(): Optional<InviteUsers> =
        Optional.ofNullable(inviteUsers.getNullable("invite_users"))

    /** Users to remove from the organization */
    fun removeUsers(): Optional<RemoveUsers> =
        Optional.ofNullable(removeUsers.getNullable("remove_users"))

    /**
     * For nearly all users, this parameter should be unnecessary. But in the rare case that your
     * API key belongs to multiple organizations, or in case you want to explicitly assert the
     * organization you are modifying, you may specify the name of the organization.
     */
    fun orgName(): Optional<String> = Optional.ofNullable(orgName.getNullable("org_name"))

    /**
     * For nearly all users, this parameter should be unnecessary. But in the rare case that your
     * API key belongs to multiple organizations, or in case you want to explicitly assert the
     * organization you are modifying, you may specify the id of the organization.
     */
    fun orgId(): Optional<String> = Optional.ofNullable(orgId.getNullable("org_id"))

    /** Users to invite to the organization */
    @JsonProperty("invite_users") @ExcludeMissing fun _inviteUsers() = inviteUsers

    /** Users to remove from the organization */
    @JsonProperty("remove_users") @ExcludeMissing fun _removeUsers() = removeUsers

    /**
     * For nearly all users, this parameter should be unnecessary. But in the rare case that your
     * API key belongs to multiple organizations, or in case you want to explicitly assert the
     * organization you are modifying, you may specify the name of the organization.
     */
    @JsonProperty("org_name") @ExcludeMissing fun _orgName() = orgName

    /**
     * For nearly all users, this parameter should be unnecessary. But in the rare case that your
     * API key belongs to multiple organizations, or in case you want to explicitly assert the
     * organization you are modifying, you may specify the id of the organization.
     */
    @JsonProperty("org_id") @ExcludeMissing fun _orgId() = orgId

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): PatchOrganizationMembers = apply {
        if (!validated) {
            inviteUsers().map { it.validate() }
            removeUsers().map { it.validate() }
            orgName()
            orgId()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PatchOrganizationMembers &&
            this.inviteUsers == other.inviteUsers &&
            this.removeUsers == other.removeUsers &&
            this.orgName == other.orgName &&
            this.orgId == other.orgId &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    inviteUsers,
                    removeUsers,
                    orgName,
                    orgId,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "PatchOrganizationMembers{inviteUsers=$inviteUsers, removeUsers=$removeUsers, orgName=$orgName, orgId=$orgId, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var inviteUsers: JsonField<InviteUsers> = JsonMissing.of()
        private var removeUsers: JsonField<RemoveUsers> = JsonMissing.of()
        private var orgName: JsonField<String> = JsonMissing.of()
        private var orgId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(patchOrganizationMembers: PatchOrganizationMembers) = apply {
            this.inviteUsers = patchOrganizationMembers.inviteUsers
            this.removeUsers = patchOrganizationMembers.removeUsers
            this.orgName = patchOrganizationMembers.orgName
            this.orgId = patchOrganizationMembers.orgId
            additionalProperties(patchOrganizationMembers.additionalProperties)
        }

        /** Users to invite to the organization */
        fun inviteUsers(inviteUsers: InviteUsers) = inviteUsers(JsonField.of(inviteUsers))

        /** Users to invite to the organization */
        @JsonProperty("invite_users")
        @ExcludeMissing
        fun inviteUsers(inviteUsers: JsonField<InviteUsers>) = apply {
            this.inviteUsers = inviteUsers
        }

        /** Users to remove from the organization */
        fun removeUsers(removeUsers: RemoveUsers) = removeUsers(JsonField.of(removeUsers))

        /** Users to remove from the organization */
        @JsonProperty("remove_users")
        @ExcludeMissing
        fun removeUsers(removeUsers: JsonField<RemoveUsers>) = apply {
            this.removeUsers = removeUsers
        }

        /**
         * For nearly all users, this parameter should be unnecessary. But in the rare case that
         * your API key belongs to multiple organizations, or in case you want to explicitly assert
         * the organization you are modifying, you may specify the name of the organization.
         */
        fun orgName(orgName: String) = orgName(JsonField.of(orgName))

        /**
         * For nearly all users, this parameter should be unnecessary. But in the rare case that
         * your API key belongs to multiple organizations, or in case you want to explicitly assert
         * the organization you are modifying, you may specify the name of the organization.
         */
        @JsonProperty("org_name")
        @ExcludeMissing
        fun orgName(orgName: JsonField<String>) = apply { this.orgName = orgName }

        /**
         * For nearly all users, this parameter should be unnecessary. But in the rare case that
         * your API key belongs to multiple organizations, or in case you want to explicitly assert
         * the organization you are modifying, you may specify the id of the organization.
         */
        fun orgId(orgId: String) = orgId(JsonField.of(orgId))

        /**
         * For nearly all users, this parameter should be unnecessary. But in the rare case that
         * your API key belongs to multiple organizations, or in case you want to explicitly assert
         * the organization you are modifying, you may specify the id of the organization.
         */
        @JsonProperty("org_id")
        @ExcludeMissing
        fun orgId(orgId: JsonField<String>) = apply { this.orgId = orgId }

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

        fun build(): PatchOrganizationMembers =
            PatchOrganizationMembers(
                inviteUsers,
                removeUsers,
                orgName,
                orgId,
                additionalProperties.toUnmodifiable(),
            )
    }

    /** Users to invite to the organization */
    @JsonDeserialize(builder = InviteUsers.Builder::class)
    @NoAutoDetect
    class InviteUsers
    private constructor(
        private val ids: JsonField<List<String>>,
        private val emails: JsonField<List<String>>,
        private val sendInviteEmails: JsonField<Boolean>,
        private val groupId: JsonField<String>,
        private val groupName: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /** Ids of existing users to invite */
        fun ids(): Optional<List<String>> = Optional.ofNullable(ids.getNullable("ids"))

        /** Emails of users to invite */
        fun emails(): Optional<List<String>> = Optional.ofNullable(emails.getNullable("emails"))

        /** If true, send invite emails to the users who wore actually added */
        fun sendInviteEmails(): Optional<Boolean> =
            Optional.ofNullable(sendInviteEmails.getNullable("send_invite_emails"))

        /**
         * Optional id of a group to add newly-invited users to. Cannot specify both a group id and
         * a group name.
         */
        fun groupId(): Optional<String> = Optional.ofNullable(groupId.getNullable("group_id"))

        /**
         * Optional name of a group to add newly-invited users to. Cannot specify both a group id
         * and a group name.
         */
        fun groupName(): Optional<String> = Optional.ofNullable(groupName.getNullable("group_name"))

        /** Ids of existing users to invite */
        @JsonProperty("ids") @ExcludeMissing fun _ids() = ids

        /** Emails of users to invite */
        @JsonProperty("emails") @ExcludeMissing fun _emails() = emails

        /** If true, send invite emails to the users who wore actually added */
        @JsonProperty("send_invite_emails")
        @ExcludeMissing
        fun _sendInviteEmails() = sendInviteEmails

        /**
         * Optional id of a group to add newly-invited users to. Cannot specify both a group id and
         * a group name.
         */
        @JsonProperty("group_id") @ExcludeMissing fun _groupId() = groupId

        /**
         * Optional name of a group to add newly-invited users to. Cannot specify both a group id
         * and a group name.
         */
        @JsonProperty("group_name") @ExcludeMissing fun _groupName() = groupName

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): InviteUsers = apply {
            if (!validated) {
                ids()
                emails()
                sendInviteEmails()
                groupId()
                groupName()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is InviteUsers &&
                this.ids == other.ids &&
                this.emails == other.emails &&
                this.sendInviteEmails == other.sendInviteEmails &&
                this.groupId == other.groupId &&
                this.groupName == other.groupName &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        ids,
                        emails,
                        sendInviteEmails,
                        groupId,
                        groupName,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "InviteUsers{ids=$ids, emails=$emails, sendInviteEmails=$sendInviteEmails, groupId=$groupId, groupName=$groupName, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var ids: JsonField<List<String>> = JsonMissing.of()
            private var emails: JsonField<List<String>> = JsonMissing.of()
            private var sendInviteEmails: JsonField<Boolean> = JsonMissing.of()
            private var groupId: JsonField<String> = JsonMissing.of()
            private var groupName: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(inviteUsers: InviteUsers) = apply {
                this.ids = inviteUsers.ids
                this.emails = inviteUsers.emails
                this.sendInviteEmails = inviteUsers.sendInviteEmails
                this.groupId = inviteUsers.groupId
                this.groupName = inviteUsers.groupName
                additionalProperties(inviteUsers.additionalProperties)
            }

            /** Ids of existing users to invite */
            fun ids(ids: List<String>) = ids(JsonField.of(ids))

            /** Ids of existing users to invite */
            @JsonProperty("ids")
            @ExcludeMissing
            fun ids(ids: JsonField<List<String>>) = apply { this.ids = ids }

            /** Emails of users to invite */
            fun emails(emails: List<String>) = emails(JsonField.of(emails))

            /** Emails of users to invite */
            @JsonProperty("emails")
            @ExcludeMissing
            fun emails(emails: JsonField<List<String>>) = apply { this.emails = emails }

            /** If true, send invite emails to the users who wore actually added */
            fun sendInviteEmails(sendInviteEmails: Boolean) =
                sendInviteEmails(JsonField.of(sendInviteEmails))

            /** If true, send invite emails to the users who wore actually added */
            @JsonProperty("send_invite_emails")
            @ExcludeMissing
            fun sendInviteEmails(sendInviteEmails: JsonField<Boolean>) = apply {
                this.sendInviteEmails = sendInviteEmails
            }

            /**
             * Optional id of a group to add newly-invited users to. Cannot specify both a group id
             * and a group name.
             */
            fun groupId(groupId: String) = groupId(JsonField.of(groupId))

            /**
             * Optional id of a group to add newly-invited users to. Cannot specify both a group id
             * and a group name.
             */
            @JsonProperty("group_id")
            @ExcludeMissing
            fun groupId(groupId: JsonField<String>) = apply { this.groupId = groupId }

            /**
             * Optional name of a group to add newly-invited users to. Cannot specify both a group
             * id and a group name.
             */
            fun groupName(groupName: String) = groupName(JsonField.of(groupName))

            /**
             * Optional name of a group to add newly-invited users to. Cannot specify both a group
             * id and a group name.
             */
            @JsonProperty("group_name")
            @ExcludeMissing
            fun groupName(groupName: JsonField<String>) = apply { this.groupName = groupName }

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
                    ids.map { it.toUnmodifiable() },
                    emails.map { it.toUnmodifiable() },
                    sendInviteEmails,
                    groupId,
                    groupName,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    /** Users to remove from the organization */
    @JsonDeserialize(builder = RemoveUsers.Builder::class)
    @NoAutoDetect
    class RemoveUsers
    private constructor(
        private val ids: JsonField<List<String>>,
        private val emails: JsonField<List<String>>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /** Ids of users to remove */
        fun ids(): Optional<List<String>> = Optional.ofNullable(ids.getNullable("ids"))

        /** Emails of users to remove */
        fun emails(): Optional<List<String>> = Optional.ofNullable(emails.getNullable("emails"))

        /** Ids of users to remove */
        @JsonProperty("ids") @ExcludeMissing fun _ids() = ids

        /** Emails of users to remove */
        @JsonProperty("emails") @ExcludeMissing fun _emails() = emails

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): RemoveUsers = apply {
            if (!validated) {
                ids()
                emails()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is RemoveUsers &&
                this.ids == other.ids &&
                this.emails == other.emails &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        ids,
                        emails,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "RemoveUsers{ids=$ids, emails=$emails, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var ids: JsonField<List<String>> = JsonMissing.of()
            private var emails: JsonField<List<String>> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(removeUsers: RemoveUsers) = apply {
                this.ids = removeUsers.ids
                this.emails = removeUsers.emails
                additionalProperties(removeUsers.additionalProperties)
            }

            /** Ids of users to remove */
            fun ids(ids: List<String>) = ids(JsonField.of(ids))

            /** Ids of users to remove */
            @JsonProperty("ids")
            @ExcludeMissing
            fun ids(ids: JsonField<List<String>>) = apply { this.ids = ids }

            /** Emails of users to remove */
            fun emails(emails: List<String>) = emails(JsonField.of(emails))

            /** Emails of users to remove */
            @JsonProperty("emails")
            @ExcludeMissing
            fun emails(emails: JsonField<List<String>>) = apply { this.emails = emails }

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
                    ids.map { it.toUnmodifiable() },
                    emails.map { it.toUnmodifiable() },
                    additionalProperties.toUnmodifiable(),
                )
        }
    }
}
