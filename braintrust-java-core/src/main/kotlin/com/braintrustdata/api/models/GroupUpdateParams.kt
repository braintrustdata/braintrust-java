// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.Params
import com.braintrustdata.api.core.checkKnown
import com.braintrustdata.api.core.checkRequired
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

/**
 * Partially update a group object. Specify the fields to update in the payload.
 * Any object-type fields will be deep-merged with existing content. Currently we
 * do not support removing fields or setting them to null.
 */
class GroupUpdateParams private constructor(
    private val groupId: String,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,

) : Params {

    /** Group id */
    fun groupId(): String = groupId

    /** A list of group IDs to add to the group's inheriting-from set */
    fun addMemberGroups(): Optional<List<String>> = body.addMemberGroups()

    /** A list of user IDs to add to the group */
    fun addMemberUsers(): Optional<List<String>> = body.addMemberUsers()

    /** Textual description of the group */
    fun description(): Optional<String> = body.description()

    /** Name of the group */
    fun name(): Optional<String> = body.name()

    /** A list of group IDs to remove from the group's inheriting-from set */
    fun removeMemberGroups(): Optional<List<String>> = body.removeMemberGroups()

    /** A list of user IDs to remove from the group */
    fun removeMemberUsers(): Optional<List<String>> = body.removeMemberUsers()

    /** A list of group IDs to add to the group's inheriting-from set */
    fun _addMemberGroups(): JsonField<List<String>> = body._addMemberGroups()

    /** A list of user IDs to add to the group */
    fun _addMemberUsers(): JsonField<List<String>> = body._addMemberUsers()

    /** Textual description of the group */
    fun _description(): JsonField<String> = body._description()

    /** Name of the group */
    fun _name(): JsonField<String> = body._name()

    /** A list of group IDs to remove from the group's inheriting-from set */
    fun _removeMemberGroups(): JsonField<List<String>> = body._removeMemberGroups()

    /** A list of user IDs to remove from the group */
    fun _removeMemberUsers(): JsonField<List<String>> = body._removeMemberUsers()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic
    internal fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
      return when (index) {
          0 -> groupId
          else -> ""
      }
    }

    @NoAutoDetect
    class Body @JsonCreator private constructor(
        @JsonProperty("add_member_groups") @ExcludeMissing private val addMemberGroups: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("add_member_users") @ExcludeMissing private val addMemberUsers: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("description") @ExcludeMissing private val description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("remove_member_groups") @ExcludeMissing private val removeMemberGroups: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("remove_member_users") @ExcludeMissing private val removeMemberUsers: JsonField<List<String>> = JsonMissing.of(),
        @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),

    ) {

        /** A list of group IDs to add to the group's inheriting-from set */
        fun addMemberGroups(): Optional<List<String>> = Optional.ofNullable(addMemberGroups.getNullable("add_member_groups"))

        /** A list of user IDs to add to the group */
        fun addMemberUsers(): Optional<List<String>> = Optional.ofNullable(addMemberUsers.getNullable("add_member_users"))

        /** Textual description of the group */
        fun description(): Optional<String> = Optional.ofNullable(description.getNullable("description"))

        /** Name of the group */
        fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

        /** A list of group IDs to remove from the group's inheriting-from set */
        fun removeMemberGroups(): Optional<List<String>> = Optional.ofNullable(removeMemberGroups.getNullable("remove_member_groups"))

        /** A list of user IDs to remove from the group */
        fun removeMemberUsers(): Optional<List<String>> = Optional.ofNullable(removeMemberUsers.getNullable("remove_member_users"))

        /** A list of group IDs to add to the group's inheriting-from set */
        @JsonProperty("add_member_groups")
        @ExcludeMissing
        fun _addMemberGroups(): JsonField<List<String>> = addMemberGroups

        /** A list of user IDs to add to the group */
        @JsonProperty("add_member_users")
        @ExcludeMissing
        fun _addMemberUsers(): JsonField<List<String>> = addMemberUsers

        /** Textual description of the group */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /** Name of the group */
        @JsonProperty("name")
        @ExcludeMissing
        fun _name(): JsonField<String> = name

        /** A list of group IDs to remove from the group's inheriting-from set */
        @JsonProperty("remove_member_groups")
        @ExcludeMissing
        fun _removeMemberGroups(): JsonField<List<String>> = removeMemberGroups

        /** A list of user IDs to remove from the group */
        @JsonProperty("remove_member_users")
        @ExcludeMissing
        fun _removeMemberUsers(): JsonField<List<String>> = removeMemberUsers

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Body =
            apply {
                if (validated) {
                  return@apply
                }

                addMemberGroups()
                addMemberUsers()
                description()
                name()
                removeMemberGroups()
                removeMemberUsers()
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

            private var addMemberGroups: JsonField<MutableList<String>>? = null
            private var addMemberUsers: JsonField<MutableList<String>>? = null
            private var description: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var removeMemberGroups: JsonField<MutableList<String>>? = null
            private var removeMemberUsers: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) =
                apply {
                    addMemberGroups = body.addMemberGroups.map { it.toMutableList() }
                    addMemberUsers = body.addMemberUsers.map { it.toMutableList() }
                    description = body.description
                    name = body.name
                    removeMemberGroups = body.removeMemberGroups.map { it.toMutableList() }
                    removeMemberUsers = body.removeMemberUsers.map { it.toMutableList() }
                    additionalProperties = body.additionalProperties.toMutableMap()
                }

            /** A list of group IDs to add to the group's inheriting-from set */
            fun addMemberGroups(addMemberGroups: List<String>?) = addMemberGroups(JsonField.ofNullable(addMemberGroups))

            /** A list of group IDs to add to the group's inheriting-from set */
            fun addMemberGroups(addMemberGroups: Optional<List<String>>) = addMemberGroups(addMemberGroups.getOrNull())

            /** A list of group IDs to add to the group's inheriting-from set */
            fun addMemberGroups(addMemberGroups: JsonField<List<String>>) =
                apply {
                    this.addMemberGroups = addMemberGroups.map { it.toMutableList() }
                }

            /** A list of group IDs to add to the group's inheriting-from set */
            fun addAddMemberGroup(addMemberGroup: String) =
                apply {
                    addMemberGroups = (addMemberGroups ?: JsonField.of(mutableListOf())).also {
                        checkKnown("addMemberGroups", it).add(addMemberGroup)
                    }
                }

            /** A list of user IDs to add to the group */
            fun addMemberUsers(addMemberUsers: List<String>?) = addMemberUsers(JsonField.ofNullable(addMemberUsers))

            /** A list of user IDs to add to the group */
            fun addMemberUsers(addMemberUsers: Optional<List<String>>) = addMemberUsers(addMemberUsers.getOrNull())

            /** A list of user IDs to add to the group */
            fun addMemberUsers(addMemberUsers: JsonField<List<String>>) =
                apply {
                    this.addMemberUsers = addMemberUsers.map { it.toMutableList() }
                }

            /** A list of user IDs to add to the group */
            fun addAddMemberUser(addMemberUser: String) =
                apply {
                    addMemberUsers = (addMemberUsers ?: JsonField.of(mutableListOf())).also {
                        checkKnown("addMemberUsers", it).add(addMemberUser)
                    }
                }

            /** Textual description of the group */
            fun description(description: String?) = description(JsonField.ofNullable(description))

            /** Textual description of the group */
            fun description(description: Optional<String>) = description(description.getOrNull())

            /** Textual description of the group */
            fun description(description: JsonField<String>) =
                apply {
                    this.description = description
                }

            /** Name of the group */
            fun name(name: String?) = name(JsonField.ofNullable(name))

            /** Name of the group */
            fun name(name: Optional<String>) = name(name.getOrNull())

            /** Name of the group */
            fun name(name: JsonField<String>) =
                apply {
                    this.name = name
                }

            /** A list of group IDs to remove from the group's inheriting-from set */
            fun removeMemberGroups(removeMemberGroups: List<String>?) = removeMemberGroups(JsonField.ofNullable(removeMemberGroups))

            /** A list of group IDs to remove from the group's inheriting-from set */
            fun removeMemberGroups(removeMemberGroups: Optional<List<String>>) = removeMemberGroups(removeMemberGroups.getOrNull())

            /** A list of group IDs to remove from the group's inheriting-from set */
            fun removeMemberGroups(removeMemberGroups: JsonField<List<String>>) =
                apply {
                    this.removeMemberGroups = removeMemberGroups.map { it.toMutableList() }
                }

            /** A list of group IDs to remove from the group's inheriting-from set */
            fun addRemoveMemberGroup(removeMemberGroup: String) =
                apply {
                    removeMemberGroups = (removeMemberGroups ?: JsonField.of(mutableListOf())).also {
                        checkKnown("removeMemberGroups", it).add(removeMemberGroup)
                    }
                }

            /** A list of user IDs to remove from the group */
            fun removeMemberUsers(removeMemberUsers: List<String>?) = removeMemberUsers(JsonField.ofNullable(removeMemberUsers))

            /** A list of user IDs to remove from the group */
            fun removeMemberUsers(removeMemberUsers: Optional<List<String>>) = removeMemberUsers(removeMemberUsers.getOrNull())

            /** A list of user IDs to remove from the group */
            fun removeMemberUsers(removeMemberUsers: JsonField<List<String>>) =
                apply {
                    this.removeMemberUsers = removeMemberUsers.map { it.toMutableList() }
                }

            /** A list of user IDs to remove from the group */
            fun addRemoveMemberUser(removeMemberUser: String) =
                apply {
                    removeMemberUsers = (removeMemberUsers ?: JsonField.of(mutableListOf())).also {
                        checkKnown("removeMemberUsers", it).add(removeMemberUser)
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

            fun build(): Body =
                Body(
                  (addMemberGroups ?: JsonMissing.of()).map { it.toImmutable() },
                  (addMemberUsers ?: JsonMissing.of()).map { it.toImmutable() },
                  description,
                  name,
                  (removeMemberGroups ?: JsonMissing.of()).map { it.toImmutable() },
                  (removeMemberUsers ?: JsonMissing.of()).map { it.toImmutable() },
                  additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return /* spotless:off */ other is Body && addMemberGroups == other.addMemberGroups && addMemberUsers == other.addMemberUsers && description == other.description && name == other.name && removeMemberGroups == other.removeMemberGroups && removeMemberUsers == other.removeMemberUsers && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(addMemberGroups, addMemberUsers, description, name, removeMemberGroups, removeMemberUsers, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Body{addMemberGroups=$addMemberGroups, addMemberUsers=$addMemberUsers, description=$description, name=$name, removeMemberGroups=$removeMemberGroups, removeMemberUsers=$removeMemberUsers, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [GroupUpdateParams].
         *
         * The following fields are required:
         *
         * ```java
         * .groupId()
         * ```
         */
        @JvmStatic
        fun builder() = Builder()
    }

    /** A builder for [GroupUpdateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var groupId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(groupUpdateParams: GroupUpdateParams) =
            apply {
                groupId = groupUpdateParams.groupId
                body = groupUpdateParams.body.toBuilder()
                additionalHeaders = groupUpdateParams.additionalHeaders.toBuilder()
                additionalQueryParams = groupUpdateParams.additionalQueryParams.toBuilder()
            }

        /** Group id */
        fun groupId(groupId: String) =
            apply {
                this.groupId = groupId
            }

        /** A list of group IDs to add to the group's inheriting-from set */
        fun addMemberGroups(addMemberGroups: List<String>?) =
            apply {
                body.addMemberGroups(addMemberGroups)
            }

        /** A list of group IDs to add to the group's inheriting-from set */
        fun addMemberGroups(addMemberGroups: Optional<List<String>>) = addMemberGroups(addMemberGroups.getOrNull())

        /** A list of group IDs to add to the group's inheriting-from set */
        fun addMemberGroups(addMemberGroups: JsonField<List<String>>) =
            apply {
                body.addMemberGroups(addMemberGroups)
            }

        /** A list of group IDs to add to the group's inheriting-from set */
        fun addAddMemberGroup(addMemberGroup: String) =
            apply {
                body.addAddMemberGroup(addMemberGroup)
            }

        /** A list of user IDs to add to the group */
        fun addMemberUsers(addMemberUsers: List<String>?) =
            apply {
                body.addMemberUsers(addMemberUsers)
            }

        /** A list of user IDs to add to the group */
        fun addMemberUsers(addMemberUsers: Optional<List<String>>) = addMemberUsers(addMemberUsers.getOrNull())

        /** A list of user IDs to add to the group */
        fun addMemberUsers(addMemberUsers: JsonField<List<String>>) =
            apply {
                body.addMemberUsers(addMemberUsers)
            }

        /** A list of user IDs to add to the group */
        fun addAddMemberUser(addMemberUser: String) =
            apply {
                body.addAddMemberUser(addMemberUser)
            }

        /** Textual description of the group */
        fun description(description: String?) =
            apply {
                body.description(description)
            }

        /** Textual description of the group */
        fun description(description: Optional<String>) = description(description.getOrNull())

        /** Textual description of the group */
        fun description(description: JsonField<String>) =
            apply {
                body.description(description)
            }

        /** Name of the group */
        fun name(name: String?) =
            apply {
                body.name(name)
            }

        /** Name of the group */
        fun name(name: Optional<String>) = name(name.getOrNull())

        /** Name of the group */
        fun name(name: JsonField<String>) =
            apply {
                body.name(name)
            }

        /** A list of group IDs to remove from the group's inheriting-from set */
        fun removeMemberGroups(removeMemberGroups: List<String>?) =
            apply {
                body.removeMemberGroups(removeMemberGroups)
            }

        /** A list of group IDs to remove from the group's inheriting-from set */
        fun removeMemberGroups(removeMemberGroups: Optional<List<String>>) = removeMemberGroups(removeMemberGroups.getOrNull())

        /** A list of group IDs to remove from the group's inheriting-from set */
        fun removeMemberGroups(removeMemberGroups: JsonField<List<String>>) =
            apply {
                body.removeMemberGroups(removeMemberGroups)
            }

        /** A list of group IDs to remove from the group's inheriting-from set */
        fun addRemoveMemberGroup(removeMemberGroup: String) =
            apply {
                body.addRemoveMemberGroup(removeMemberGroup)
            }

        /** A list of user IDs to remove from the group */
        fun removeMemberUsers(removeMemberUsers: List<String>?) =
            apply {
                body.removeMemberUsers(removeMemberUsers)
            }

        /** A list of user IDs to remove from the group */
        fun removeMemberUsers(removeMemberUsers: Optional<List<String>>) = removeMemberUsers(removeMemberUsers.getOrNull())

        /** A list of user IDs to remove from the group */
        fun removeMemberUsers(removeMemberUsers: JsonField<List<String>>) =
            apply {
                body.removeMemberUsers(removeMemberUsers)
            }

        /** A list of user IDs to remove from the group */
        fun addRemoveMemberUser(removeMemberUser: String) =
            apply {
                body.addRemoveMemberUser(removeMemberUser)
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

        fun build(): GroupUpdateParams =
            GroupUpdateParams(
              checkRequired(
                "groupId", groupId
              ),
              body.build(),
              additionalHeaders.build(),
              additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return /* spotless:off */ other is GroupUpdateParams && groupId == other.groupId && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(groupId, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() = "GroupUpdateParams{groupId=$groupId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
