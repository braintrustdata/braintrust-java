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

class GroupUpdateParams
constructor(
    private val groupId: String,
    private val addMemberGroups: List<String>?,
    private val addMemberUsers: List<String>?,
    private val description: String?,
    private val name: String?,
    private val removeMemberGroups: List<String>?,
    private val removeMemberUsers: List<String>?,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun groupId(): String = groupId

    fun addMemberGroups(): Optional<List<String>> = Optional.ofNullable(addMemberGroups)

    fun addMemberUsers(): Optional<List<String>> = Optional.ofNullable(addMemberUsers)

    fun description(): Optional<String> = Optional.ofNullable(description)

    fun name(): Optional<String> = Optional.ofNullable(name)

    fun removeMemberGroups(): Optional<List<String>> = Optional.ofNullable(removeMemberGroups)

    fun removeMemberUsers(): Optional<List<String>> = Optional.ofNullable(removeMemberUsers)

    @JvmSynthetic
    internal fun getBody(): GroupUpdateBody {
        return GroupUpdateBody(
            addMemberGroups,
            addMemberUsers,
            description,
            name,
            removeMemberGroups,
            removeMemberUsers,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

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
        private val addMemberGroups: List<String>?,
        private val addMemberUsers: List<String>?,
        private val description: String?,
        private val name: String?,
        private val removeMemberGroups: List<String>?,
        private val removeMemberUsers: List<String>?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** A list of group IDs to add to the group's inheriting-from set */
        @JsonProperty("add_member_groups") fun addMemberGroups(): List<String>? = addMemberGroups

        /** A list of user IDs to add to the group */
        @JsonProperty("add_member_users") fun addMemberUsers(): List<String>? = addMemberUsers

        /** Textual description of the group */
        @JsonProperty("description") fun description(): String? = description

        /** Name of the group */
        @JsonProperty("name") fun name(): String? = name

        /** A list of group IDs to remove from the group's inheriting-from set */
        @JsonProperty("remove_member_groups")
        fun removeMemberGroups(): List<String>? = removeMemberGroups

        /** A list of user IDs to remove from the group */
        @JsonProperty("remove_member_users")
        fun removeMemberUsers(): List<String>? = removeMemberUsers

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var addMemberGroups: List<String>? = null
            private var addMemberUsers: List<String>? = null
            private var description: String? = null
            private var name: String? = null
            private var removeMemberGroups: List<String>? = null
            private var removeMemberUsers: List<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(groupUpdateBody: GroupUpdateBody) = apply {
                this.addMemberGroups = groupUpdateBody.addMemberGroups
                this.addMemberUsers = groupUpdateBody.addMemberUsers
                this.description = groupUpdateBody.description
                this.name = groupUpdateBody.name
                this.removeMemberGroups = groupUpdateBody.removeMemberGroups
                this.removeMemberUsers = groupUpdateBody.removeMemberUsers
                additionalProperties(groupUpdateBody.additionalProperties)
            }

            /** A list of group IDs to add to the group's inheriting-from set */
            @JsonProperty("add_member_groups")
            fun addMemberGroups(addMemberGroups: List<String>) = apply {
                this.addMemberGroups = addMemberGroups
            }

            /** A list of user IDs to add to the group */
            @JsonProperty("add_member_users")
            fun addMemberUsers(addMemberUsers: List<String>) = apply {
                this.addMemberUsers = addMemberUsers
            }

            /** Textual description of the group */
            @JsonProperty("description")
            fun description(description: String) = apply { this.description = description }

            /** Name of the group */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            /** A list of group IDs to remove from the group's inheriting-from set */
            @JsonProperty("remove_member_groups")
            fun removeMemberGroups(removeMemberGroups: List<String>) = apply {
                this.removeMemberGroups = removeMemberGroups
            }

            /** A list of user IDs to remove from the group */
            @JsonProperty("remove_member_users")
            fun removeMemberUsers(removeMemberUsers: List<String>) = apply {
                this.removeMemberUsers = removeMemberUsers
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

            fun build(): GroupUpdateBody =
                GroupUpdateBody(
                    addMemberGroups?.toImmutable(),
                    addMemberUsers?.toImmutable(),
                    description,
                    name,
                    removeMemberGroups?.toImmutable(),
                    removeMemberUsers?.toImmutable(),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is GroupUpdateBody && this.addMemberGroups == other.addMemberGroups && this.addMemberUsers == other.addMemberUsers && this.description == other.description && this.name == other.name && this.removeMemberGroups == other.removeMemberGroups && this.removeMemberUsers == other.removeMemberUsers && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(addMemberGroups, addMemberUsers, description, name, removeMemberGroups, removeMemberUsers, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "GroupUpdateBody{addMemberGroups=$addMemberGroups, addMemberUsers=$addMemberUsers, description=$description, name=$name, removeMemberGroups=$removeMemberGroups, removeMemberUsers=$removeMemberUsers, additionalProperties=$additionalProperties}"
    }

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is GroupUpdateParams && this.groupId == other.groupId && this.addMemberGroups == other.addMemberGroups && this.addMemberUsers == other.addMemberUsers && this.description == other.description && this.name == other.name && this.removeMemberGroups == other.removeMemberGroups && this.removeMemberUsers == other.removeMemberUsers && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(groupId, addMemberGroups, addMemberUsers, description, name, removeMemberGroups, removeMemberUsers, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "GroupUpdateParams{groupId=$groupId, addMemberGroups=$addMemberGroups, addMemberUsers=$addMemberUsers, description=$description, name=$name, removeMemberGroups=$removeMemberGroups, removeMemberUsers=$removeMemberUsers, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var groupId: String? = null
        private var addMemberGroups: MutableList<String> = mutableListOf()
        private var addMemberUsers: MutableList<String> = mutableListOf()
        private var description: String? = null
        private var name: String? = null
        private var removeMemberGroups: MutableList<String> = mutableListOf()
        private var removeMemberUsers: MutableList<String> = mutableListOf()
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(groupUpdateParams: GroupUpdateParams) = apply {
            this.groupId = groupUpdateParams.groupId
            this.addMemberGroups(groupUpdateParams.addMemberGroups ?: listOf())
            this.addMemberUsers(groupUpdateParams.addMemberUsers ?: listOf())
            this.description = groupUpdateParams.description
            this.name = groupUpdateParams.name
            this.removeMemberGroups(groupUpdateParams.removeMemberGroups ?: listOf())
            this.removeMemberUsers(groupUpdateParams.removeMemberUsers ?: listOf())
            additionalHeaders(groupUpdateParams.additionalHeaders)
            additionalQueryParams(groupUpdateParams.additionalQueryParams)
            additionalBodyProperties(groupUpdateParams.additionalBodyProperties)
        }

        /** Group id */
        fun groupId(groupId: String) = apply { this.groupId = groupId }

        /** A list of group IDs to add to the group's inheriting-from set */
        fun addMemberGroups(addMemberGroups: List<String>) = apply {
            this.addMemberGroups.clear()
            this.addMemberGroups.addAll(addMemberGroups)
        }

        /** A list of group IDs to add to the group's inheriting-from set */
        fun addAddMemberGroup(addMemberGroup: String) = apply {
            this.addMemberGroups.add(addMemberGroup)
        }

        /** A list of user IDs to add to the group */
        fun addMemberUsers(addMemberUsers: List<String>) = apply {
            this.addMemberUsers.clear()
            this.addMemberUsers.addAll(addMemberUsers)
        }

        /** A list of user IDs to add to the group */
        fun addAddMemberUser(addMemberUser: String) = apply {
            this.addMemberUsers.add(addMemberUser)
        }

        /** Textual description of the group */
        fun description(description: String) = apply { this.description = description }

        /** Name of the group */
        fun name(name: String) = apply { this.name = name }

        /** A list of group IDs to remove from the group's inheriting-from set */
        fun removeMemberGroups(removeMemberGroups: List<String>) = apply {
            this.removeMemberGroups.clear()
            this.removeMemberGroups.addAll(removeMemberGroups)
        }

        /** A list of group IDs to remove from the group's inheriting-from set */
        fun addRemoveMemberGroup(removeMemberGroup: String) = apply {
            this.removeMemberGroups.add(removeMemberGroup)
        }

        /** A list of user IDs to remove from the group */
        fun removeMemberUsers(removeMemberUsers: List<String>) = apply {
            this.removeMemberUsers.clear()
            this.removeMemberUsers.addAll(removeMemberUsers)
        }

        /** A list of user IDs to remove from the group */
        fun addRemoveMemberUser(removeMemberUser: String) = apply {
            this.removeMemberUsers.add(removeMemberUser)
        }

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

        fun build(): GroupUpdateParams =
            GroupUpdateParams(
                checkNotNull(groupId) { "`groupId` is required but was not set" },
                if (addMemberGroups.size == 0) null else addMemberGroups.toImmutable(),
                if (addMemberUsers.size == 0) null else addMemberUsers.toImmutable(),
                description,
                name,
                if (removeMemberGroups.size == 0) null else removeMemberGroups.toImmutable(),
                if (removeMemberUsers.size == 0) null else removeMemberUsers.toImmutable(),
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
