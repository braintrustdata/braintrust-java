// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.http.Headers
import com.braintrustdata.api.core.http.QueryParams
import com.braintrustdata.api.core.toImmutable
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
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun groupId(): String = groupId

    fun addMemberGroups(): Optional<List<String>> = Optional.ofNullable(addMemberGroups)

    fun addMemberUsers(): Optional<List<String>> = Optional.ofNullable(addMemberUsers)

    fun description(): Optional<String> = Optional.ofNullable(description)

    fun name(): Optional<String> = Optional.ofNullable(name)

    fun removeMemberGroups(): Optional<List<String>> = Optional.ofNullable(removeMemberGroups)

    fun removeMemberUsers(): Optional<List<String>> = Optional.ofNullable(removeMemberUsers)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

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

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

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

            return /* spotless:off */ other is GroupUpdateBody && addMemberGroups == other.addMemberGroups && addMemberUsers == other.addMemberUsers && description == other.description && name == other.name && removeMemberGroups == other.removeMemberGroups && removeMemberUsers == other.removeMemberUsers && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(addMemberGroups, addMemberUsers, description, name, removeMemberGroups, removeMemberUsers, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "GroupUpdateBody{addMemberGroups=$addMemberGroups, addMemberUsers=$addMemberUsers, description=$description, name=$name, removeMemberGroups=$removeMemberGroups, removeMemberUsers=$removeMemberUsers, additionalProperties=$additionalProperties}"
    }

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
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(groupUpdateParams: GroupUpdateParams) = apply {
            groupId = groupUpdateParams.groupId
            addMemberGroups = groupUpdateParams.addMemberGroups?.toMutableList() ?: mutableListOf()
            addMemberUsers = groupUpdateParams.addMemberUsers?.toMutableList() ?: mutableListOf()
            description = groupUpdateParams.description
            name = groupUpdateParams.name
            removeMemberGroups =
                groupUpdateParams.removeMemberGroups?.toMutableList() ?: mutableListOf()
            removeMemberUsers =
                groupUpdateParams.removeMemberUsers?.toMutableList() ?: mutableListOf()
            additionalHeaders = groupUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = groupUpdateParams.additionalQueryParams.toBuilder()
            additionalBodyProperties = groupUpdateParams.additionalBodyProperties.toMutableMap()
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

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            putAllAdditionalBodyProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply {
            additionalBodyProperties.remove(key)
        }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalBodyProperty)
        }

        fun build(): GroupUpdateParams =
            GroupUpdateParams(
                checkNotNull(groupId) { "`groupId` is required but was not set" },
                addMemberGroups.toImmutable().ifEmpty { null },
                addMemberUsers.toImmutable().ifEmpty { null },
                description,
                name,
                removeMemberGroups.toImmutable().ifEmpty { null },
                removeMemberUsers.toImmutable().ifEmpty { null },
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is GroupUpdateParams && groupId == other.groupId && addMemberGroups == other.addMemberGroups && addMemberUsers == other.addMemberUsers && description == other.description && name == other.name && removeMemberGroups == other.removeMemberGroups && removeMemberUsers == other.removeMemberUsers && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(groupId, addMemberGroups, addMemberUsers, description, name, removeMemberGroups, removeMemberUsers, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "GroupUpdateParams{groupId=$groupId, addMemberGroups=$addMemberGroups, addMemberUsers=$addMemberUsers, description=$description, name=$name, removeMemberGroups=$removeMemberGroups, removeMemberUsers=$removeMemberUsers, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
