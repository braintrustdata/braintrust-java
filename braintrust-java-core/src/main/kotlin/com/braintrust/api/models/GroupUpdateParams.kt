// File generated from our OpenAPI spec by Stainless.

package com.braintrust.api.models

import com.braintrust.api.core.ExcludeMissing
import com.braintrust.api.core.JsonValue
import com.braintrust.api.core.NoAutoDetect
import com.braintrust.api.core.toUnmodifiable
import com.braintrust.api.models.*
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import java.util.Objects
import java.util.Optional

class GroupUpdateParams
constructor(
    private val groupId: String,
    private val description: String?,
    private val memberGroups: List<String>?,
    private val memberUsers: List<String>?,
    private val name: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun groupId(): String = groupId

    fun description(): Optional<String> = Optional.ofNullable(description)

    fun memberGroups(): Optional<List<String>> = Optional.ofNullable(memberGroups)

    fun memberUsers(): Optional<List<String>> = Optional.ofNullable(memberUsers)

    fun name(): Optional<String> = Optional.ofNullable(name)

    @JvmSynthetic
    internal fun getBody(): GroupUpdateBody {
        return GroupUpdateBody(
            description,
            memberGroups,
            memberUsers,
            name,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> groupId
            else -> ""
        }
    }

    @JsonDeserialize(builder = GroupUpdateBody.Builder::class)
    @NoAutoDetect
    class GroupUpdateBody
    internal constructor(
        private val description: String?,
        private val memberGroups: List<String>?,
        private val memberUsers: List<String>?,
        private val name: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

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

        /** Name of the group */
        @JsonProperty("name") fun name(): String? = name

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is GroupUpdateBody &&
                this.description == other.description &&
                this.memberGroups == other.memberGroups &&
                this.memberUsers == other.memberUsers &&
                this.name == other.name &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        description,
                        memberGroups,
                        memberUsers,
                        name,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "GroupUpdateBody{description=$description, memberGroups=$memberGroups, memberUsers=$memberUsers, name=$name, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var description: String? = null
            private var memberGroups: List<String>? = null
            private var memberUsers: List<String>? = null
            private var name: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(groupUpdateBody: GroupUpdateBody) = apply {
                this.description = groupUpdateBody.description
                this.memberGroups = groupUpdateBody.memberGroups
                this.memberUsers = groupUpdateBody.memberUsers
                this.name = groupUpdateBody.name
                additionalProperties(groupUpdateBody.additionalProperties)
            }

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

            /** Name of the group */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

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

            fun build(): GroupUpdateBody =
                GroupUpdateBody(
                    description,
                    memberGroups?.toUnmodifiable(),
                    memberUsers?.toUnmodifiable(),
                    name,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is GroupUpdateParams &&
            this.groupId == other.groupId &&
            this.description == other.description &&
            this.memberGroups == other.memberGroups &&
            this.memberUsers == other.memberUsers &&
            this.name == other.name &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            groupId,
            description,
            memberGroups,
            memberUsers,
            name,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "GroupUpdateParams{groupId=$groupId, description=$description, memberGroups=$memberGroups, memberUsers=$memberUsers, name=$name, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var groupId: String? = null
        private var description: String? = null
        private var memberGroups: MutableList<String> = mutableListOf()
        private var memberUsers: MutableList<String> = mutableListOf()
        private var name: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(groupUpdateParams: GroupUpdateParams) = apply {
            this.groupId = groupUpdateParams.groupId
            this.description = groupUpdateParams.description
            this.memberGroups(groupUpdateParams.memberGroups ?: listOf())
            this.memberUsers(groupUpdateParams.memberUsers ?: listOf())
            this.name = groupUpdateParams.name
            additionalQueryParams(groupUpdateParams.additionalQueryParams)
            additionalHeaders(groupUpdateParams.additionalHeaders)
            additionalBodyProperties(groupUpdateParams.additionalBodyProperties)
        }

        /** Group id */
        fun groupId(groupId: String) = apply { this.groupId = groupId }

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

        /** Name of the group */
        fun name(name: String) = apply { this.name = name }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

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

        fun build(): GroupUpdateParams =
            GroupUpdateParams(
                checkNotNull(groupId) { "`groupId` is required but was not set" },
                description,
                if (memberGroups.size == 0) null else memberGroups.toUnmodifiable(),
                if (memberUsers.size == 0) null else memberUsers.toUnmodifiable(),
                name,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }
}
