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

class GroupReplaceParams
constructor(
    private val name: String,
    private val description: String?,
    private val memberGroups: List<String>?,
    private val memberUsers: List<String>?,
    private val orgName: String?,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun name(): String = name

    fun description(): Optional<String> = Optional.ofNullable(description)

    fun memberGroups(): Optional<List<String>> = Optional.ofNullable(memberGroups)

    fun memberUsers(): Optional<List<String>> = Optional.ofNullable(memberUsers)

    fun orgName(): Optional<String> = Optional.ofNullable(orgName)

    @JvmSynthetic
    internal fun getBody(): GroupReplaceBody {
        return GroupReplaceBody(
            name,
            description,
            memberGroups,
            memberUsers,
            orgName,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JsonDeserialize(builder = GroupReplaceBody.Builder::class)
    @NoAutoDetect
    class GroupReplaceBody
    internal constructor(
        private val name: String?,
        private val description: String?,
        private val memberGroups: List<String>?,
        private val memberUsers: List<String>?,
        private val orgName: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** Name of the group */
        @JsonProperty("name") fun name(): String? = name

        /** Textual description of the group */
        @JsonProperty("description") fun description(): String? = description

        /**
         * Ids of the groups this group inherits from
         *
         * An inheriting group has all the users contained in its member groups, as well as all of
         * their inherited users
         */
        @JsonProperty("member_groups") fun memberGroups(): List<String>? = memberGroups

        /** Ids of users which belong to this group */
        @JsonProperty("member_users") fun memberUsers(): List<String>? = memberUsers

        /**
         * For nearly all users, this parameter should be unnecessary. But in the rare case that
         * your API key belongs to multiple organizations, you may specify the name of the
         * organization the group belongs in.
         */
        @JsonProperty("org_name") fun orgName(): String? = orgName

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var name: String? = null
            private var description: String? = null
            private var memberGroups: List<String>? = null
            private var memberUsers: List<String>? = null
            private var orgName: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(groupReplaceBody: GroupReplaceBody) = apply {
                this.name = groupReplaceBody.name
                this.description = groupReplaceBody.description
                this.memberGroups = groupReplaceBody.memberGroups
                this.memberUsers = groupReplaceBody.memberUsers
                this.orgName = groupReplaceBody.orgName
                additionalProperties(groupReplaceBody.additionalProperties)
            }

            /** Name of the group */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            /** Textual description of the group */
            @JsonProperty("description")
            fun description(description: String) = apply { this.description = description }

            /**
             * Ids of the groups this group inherits from
             *
             * An inheriting group has all the users contained in its member groups, as well as all
             * of their inherited users
             */
            @JsonProperty("member_groups")
            fun memberGroups(memberGroups: List<String>) = apply {
                this.memberGroups = memberGroups
            }

            /** Ids of users which belong to this group */
            @JsonProperty("member_users")
            fun memberUsers(memberUsers: List<String>) = apply { this.memberUsers = memberUsers }

            /**
             * For nearly all users, this parameter should be unnecessary. But in the rare case that
             * your API key belongs to multiple organizations, you may specify the name of the
             * organization the group belongs in.
             */
            @JsonProperty("org_name")
            fun orgName(orgName: String) = apply { this.orgName = orgName }

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

            fun build(): GroupReplaceBody =
                GroupReplaceBody(
                    checkNotNull(name) { "`name` is required but was not set" },
                    description,
                    memberGroups?.toImmutable(),
                    memberUsers?.toImmutable(),
                    orgName,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is GroupReplaceBody && this.name == other.name && this.description == other.description && this.memberGroups == other.memberGroups && this.memberUsers == other.memberUsers && this.orgName == other.orgName && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(name, description, memberGroups, memberUsers, orgName, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "GroupReplaceBody{name=$name, description=$description, memberGroups=$memberGroups, memberUsers=$memberUsers, orgName=$orgName, additionalProperties=$additionalProperties}"
    }

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is GroupReplaceParams && this.name == other.name && this.description == other.description && this.memberGroups == other.memberGroups && this.memberUsers == other.memberUsers && this.orgName == other.orgName && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(name, description, memberGroups, memberUsers, orgName, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "GroupReplaceParams{name=$name, description=$description, memberGroups=$memberGroups, memberUsers=$memberUsers, orgName=$orgName, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var name: String? = null
        private var description: String? = null
        private var memberGroups: MutableList<String> = mutableListOf()
        private var memberUsers: MutableList<String> = mutableListOf()
        private var orgName: String? = null
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(groupReplaceParams: GroupReplaceParams) = apply {
            this.name = groupReplaceParams.name
            this.description = groupReplaceParams.description
            this.memberGroups(groupReplaceParams.memberGroups ?: listOf())
            this.memberUsers(groupReplaceParams.memberUsers ?: listOf())
            this.orgName = groupReplaceParams.orgName
            additionalHeaders(groupReplaceParams.additionalHeaders)
            additionalQueryParams(groupReplaceParams.additionalQueryParams)
            additionalBodyProperties(groupReplaceParams.additionalBodyProperties)
        }

        /** Name of the group */
        fun name(name: String) = apply { this.name = name }

        /** Textual description of the group */
        fun description(description: String) = apply { this.description = description }

        /**
         * Ids of the groups this group inherits from
         *
         * An inheriting group has all the users contained in its member groups, as well as all of
         * their inherited users
         */
        fun memberGroups(memberGroups: List<String>) = apply {
            this.memberGroups.clear()
            this.memberGroups.addAll(memberGroups)
        }

        /**
         * Ids of the groups this group inherits from
         *
         * An inheriting group has all the users contained in its member groups, as well as all of
         * their inherited users
         */
        fun addMemberGroup(memberGroup: String) = apply { this.memberGroups.add(memberGroup) }

        /** Ids of users which belong to this group */
        fun memberUsers(memberUsers: List<String>) = apply {
            this.memberUsers.clear()
            this.memberUsers.addAll(memberUsers)
        }

        /** Ids of users which belong to this group */
        fun addMemberUser(memberUser: String) = apply { this.memberUsers.add(memberUser) }

        /**
         * For nearly all users, this parameter should be unnecessary. But in the rare case that
         * your API key belongs to multiple organizations, you may specify the name of the
         * organization the group belongs in.
         */
        fun orgName(orgName: String) = apply { this.orgName = orgName }

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

        fun build(): GroupReplaceParams =
            GroupReplaceParams(
                checkNotNull(name) { "`name` is required but was not set" },
                description,
                if (memberGroups.size == 0) null else memberGroups.toImmutable(),
                if (memberUsers.size == 0) null else memberUsers.toImmutable(),
                orgName,
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
}
