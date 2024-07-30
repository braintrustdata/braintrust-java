// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.toUnmodifiable
import com.braintrustdata.api.models.*
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
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
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
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
        private val addMemberGroups: List<String>?,
        private val addMemberUsers: List<String>?,
        private val description: String?,
        private val name: String?,
        private val removeMemberGroups: List<String>?,
        private val removeMemberUsers: List<String>?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is GroupUpdateBody &&
                this.addMemberGroups == other.addMemberGroups &&
                this.addMemberUsers == other.addMemberUsers &&
                this.description == other.description &&
                this.name == other.name &&
                this.removeMemberGroups == other.removeMemberGroups &&
                this.removeMemberUsers == other.removeMemberUsers &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        addMemberGroups,
                        addMemberUsers,
                        description,
                        name,
                        removeMemberGroups,
                        removeMemberUsers,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "GroupUpdateBody{addMemberGroups=$addMemberGroups, addMemberUsers=$addMemberUsers, description=$description, name=$name, removeMemberGroups=$removeMemberGroups, removeMemberUsers=$removeMemberUsers, additionalProperties=$additionalProperties}"

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
                    addMemberGroups?.toUnmodifiable(),
                    addMemberUsers?.toUnmodifiable(),
                    description,
                    name,
                    removeMemberGroups?.toUnmodifiable(),
                    removeMemberUsers?.toUnmodifiable(),
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
            this.addMemberGroups == other.addMemberGroups &&
            this.addMemberUsers == other.addMemberUsers &&
            this.description == other.description &&
            this.name == other.name &&
            this.removeMemberGroups == other.removeMemberGroups &&
            this.removeMemberUsers == other.removeMemberUsers &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            groupId,
            addMemberGroups,
            addMemberUsers,
            description,
            name,
            removeMemberGroups,
            removeMemberUsers,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "GroupUpdateParams{groupId=$groupId, addMemberGroups=$addMemberGroups, addMemberUsers=$addMemberUsers, description=$description, name=$name, removeMemberGroups=$removeMemberGroups, removeMemberUsers=$removeMemberUsers, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

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
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
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
            additionalQueryParams(groupUpdateParams.additionalQueryParams)
            additionalHeaders(groupUpdateParams.additionalHeaders)
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
                if (addMemberGroups.size == 0) null else addMemberGroups.toUnmodifiable(),
                if (addMemberUsers.size == 0) null else addMemberUsers.toUnmodifiable(),
                description,
                name,
                if (removeMemberGroups.size == 0) null else removeMemberGroups.toUnmodifiable(),
                if (removeMemberUsers.size == 0) null else removeMemberUsers.toUnmodifiable(),
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }
}
