// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.Params
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

/**
 * Create or replace group. If there is an existing group with the same name as the one specified in
 * the request, will replace the existing group with the provided fields
 */
class GroupReplaceParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Name of the group */
    fun name(): String = body.name()

    /** Textual description of the group */
    fun description(): Optional<String> = body.description()

    /**
     * Ids of the groups this group inherits from
     *
     * An inheriting group has all the users contained in its member groups, as well as all of their
     * inherited users
     */
    fun memberGroups(): Optional<List<String>> = body.memberGroups()

    /** Ids of users which belong to this group */
    fun memberUsers(): Optional<List<String>> = body.memberUsers()

    /**
     * For nearly all users, this parameter should be unnecessary. But in the rare case that your
     * API key belongs to multiple organizations, you may specify the name of the organization the
     * group belongs in.
     */
    fun orgName(): Optional<String> = body.orgName()

    /** Name of the group */
    fun _name(): JsonField<String> = body._name()

    /** Textual description of the group */
    fun _description(): JsonField<String> = body._description()

    /**
     * Ids of the groups this group inherits from
     *
     * An inheriting group has all the users contained in its member groups, as well as all of their
     * inherited users
     */
    fun _memberGroups(): JsonField<List<String>> = body._memberGroups()

    /** Ids of users which belong to this group */
    fun _memberUsers(): JsonField<List<String>> = body._memberUsers()

    /**
     * For nearly all users, this parameter should be unnecessary. But in the rare case that your
     * API key belongs to multiple organizations, you may specify the name of the organization the
     * group belongs in.
     */
    fun _orgName(): JsonField<String> = body._orgName()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class Body
    @JsonCreator
    private constructor(
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        private val description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("member_groups")
        @ExcludeMissing
        private val memberGroups: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("member_users")
        @ExcludeMissing
        private val memberUsers: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("org_name")
        @ExcludeMissing
        private val orgName: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Name of the group */
        fun name(): String = name.getRequired("name")

        /** Textual description of the group */
        fun description(): Optional<String> =
            Optional.ofNullable(description.getNullable("description"))

        /**
         * Ids of the groups this group inherits from
         *
         * An inheriting group has all the users contained in its member groups, as well as all of
         * their inherited users
         */
        fun memberGroups(): Optional<List<String>> =
            Optional.ofNullable(memberGroups.getNullable("member_groups"))

        /** Ids of users which belong to this group */
        fun memberUsers(): Optional<List<String>> =
            Optional.ofNullable(memberUsers.getNullable("member_users"))

        /**
         * For nearly all users, this parameter should be unnecessary. But in the rare case that
         * your API key belongs to multiple organizations, you may specify the name of the
         * organization the group belongs in.
         */
        fun orgName(): Optional<String> = Optional.ofNullable(orgName.getNullable("org_name"))

        /** Name of the group */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /** Textual description of the group */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Ids of the groups this group inherits from
         *
         * An inheriting group has all the users contained in its member groups, as well as all of
         * their inherited users
         */
        @JsonProperty("member_groups")
        @ExcludeMissing
        fun _memberGroups(): JsonField<List<String>> = memberGroups

        /** Ids of users which belong to this group */
        @JsonProperty("member_users")
        @ExcludeMissing
        fun _memberUsers(): JsonField<List<String>> = memberUsers

        /**
         * For nearly all users, this parameter should be unnecessary. But in the rare case that
         * your API key belongs to multiple organizations, you may specify the name of the
         * organization the group belongs in.
         */
        @JsonProperty("org_name") @ExcludeMissing fun _orgName(): JsonField<String> = orgName

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            name()
            description()
            memberGroups()
            memberUsers()
            orgName()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var name: JsonField<String>? = null
            private var description: JsonField<String> = JsonMissing.of()
            private var memberGroups: JsonField<MutableList<String>>? = null
            private var memberUsers: JsonField<MutableList<String>>? = null
            private var orgName: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                name = body.name
                description = body.description
                memberGroups = body.memberGroups.map { it.toMutableList() }
                memberUsers = body.memberUsers.map { it.toMutableList() }
                orgName = body.orgName
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Name of the group */
            fun name(name: String) = name(JsonField.of(name))

            /** Name of the group */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** Textual description of the group */
            fun description(description: String?) = description(JsonField.ofNullable(description))

            /** Textual description of the group */
            fun description(description: Optional<String>) = description(description.orElse(null))

            /** Textual description of the group */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /**
             * Ids of the groups this group inherits from
             *
             * An inheriting group has all the users contained in its member groups, as well as all
             * of their inherited users
             */
            fun memberGroups(memberGroups: List<String>?) =
                memberGroups(JsonField.ofNullable(memberGroups))

            /**
             * Ids of the groups this group inherits from
             *
             * An inheriting group has all the users contained in its member groups, as well as all
             * of their inherited users
             */
            fun memberGroups(memberGroups: Optional<List<String>>) =
                memberGroups(memberGroups.orElse(null))

            /**
             * Ids of the groups this group inherits from
             *
             * An inheriting group has all the users contained in its member groups, as well as all
             * of their inherited users
             */
            fun memberGroups(memberGroups: JsonField<List<String>>) = apply {
                this.memberGroups = memberGroups.map { it.toMutableList() }
            }

            /**
             * Ids of the groups this group inherits from
             *
             * An inheriting group has all the users contained in its member groups, as well as all
             * of their inherited users
             */
            fun addMemberGroup(memberGroup: String) = apply {
                memberGroups =
                    (memberGroups ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(memberGroup)
                    }
            }

            /** Ids of users which belong to this group */
            fun memberUsers(memberUsers: List<String>?) =
                memberUsers(JsonField.ofNullable(memberUsers))

            /** Ids of users which belong to this group */
            fun memberUsers(memberUsers: Optional<List<String>>) =
                memberUsers(memberUsers.orElse(null))

            /** Ids of users which belong to this group */
            fun memberUsers(memberUsers: JsonField<List<String>>) = apply {
                this.memberUsers = memberUsers.map { it.toMutableList() }
            }

            /** Ids of users which belong to this group */
            fun addMemberUser(memberUser: String) = apply {
                memberUsers =
                    (memberUsers ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(memberUser)
                    }
            }

            /**
             * For nearly all users, this parameter should be unnecessary. But in the rare case that
             * your API key belongs to multiple organizations, you may specify the name of the
             * organization the group belongs in.
             */
            fun orgName(orgName: String?) = orgName(JsonField.ofNullable(orgName))

            /**
             * For nearly all users, this parameter should be unnecessary. But in the rare case that
             * your API key belongs to multiple organizations, you may specify the name of the
             * organization the group belongs in.
             */
            fun orgName(orgName: Optional<String>) = orgName(orgName.orElse(null))

            /**
             * For nearly all users, this parameter should be unnecessary. But in the rare case that
             * your API key belongs to multiple organizations, you may specify the name of the
             * organization the group belongs in.
             */
            fun orgName(orgName: JsonField<String>) = apply { this.orgName = orgName }

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

            fun build(): Body =
                Body(
                    checkRequired("name", name),
                    description,
                    (memberGroups ?: JsonMissing.of()).map { it.toImmutable() },
                    (memberUsers ?: JsonMissing.of()).map { it.toImmutable() },
                    orgName,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && name == other.name && description == other.description && memberGroups == other.memberGroups && memberUsers == other.memberUsers && orgName == other.orgName && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(name, description, memberGroups, memberUsers, orgName, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{name=$name, description=$description, memberGroups=$memberGroups, memberUsers=$memberUsers, orgName=$orgName, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [GroupReplaceParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(groupReplaceParams: GroupReplaceParams) = apply {
            body = groupReplaceParams.body.toBuilder()
            additionalHeaders = groupReplaceParams.additionalHeaders.toBuilder()
            additionalQueryParams = groupReplaceParams.additionalQueryParams.toBuilder()
        }

        /** Name of the group */
        fun name(name: String) = apply { body.name(name) }

        /** Name of the group */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /** Textual description of the group */
        fun description(description: String?) = apply { body.description(description) }

        /** Textual description of the group */
        fun description(description: Optional<String>) = description(description.orElse(null))

        /** Textual description of the group */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        /**
         * Ids of the groups this group inherits from
         *
         * An inheriting group has all the users contained in its member groups, as well as all of
         * their inherited users
         */
        fun memberGroups(memberGroups: List<String>?) = apply { body.memberGroups(memberGroups) }

        /**
         * Ids of the groups this group inherits from
         *
         * An inheriting group has all the users contained in its member groups, as well as all of
         * their inherited users
         */
        fun memberGroups(memberGroups: Optional<List<String>>) =
            memberGroups(memberGroups.orElse(null))

        /**
         * Ids of the groups this group inherits from
         *
         * An inheriting group has all the users contained in its member groups, as well as all of
         * their inherited users
         */
        fun memberGroups(memberGroups: JsonField<List<String>>) = apply {
            body.memberGroups(memberGroups)
        }

        /**
         * Ids of the groups this group inherits from
         *
         * An inheriting group has all the users contained in its member groups, as well as all of
         * their inherited users
         */
        fun addMemberGroup(memberGroup: String) = apply { body.addMemberGroup(memberGroup) }

        /** Ids of users which belong to this group */
        fun memberUsers(memberUsers: List<String>?) = apply { body.memberUsers(memberUsers) }

        /** Ids of users which belong to this group */
        fun memberUsers(memberUsers: Optional<List<String>>) = memberUsers(memberUsers.orElse(null))

        /** Ids of users which belong to this group */
        fun memberUsers(memberUsers: JsonField<List<String>>) = apply {
            body.memberUsers(memberUsers)
        }

        /** Ids of users which belong to this group */
        fun addMemberUser(memberUser: String) = apply { body.addMemberUser(memberUser) }

        /**
         * For nearly all users, this parameter should be unnecessary. But in the rare case that
         * your API key belongs to multiple organizations, you may specify the name of the
         * organization the group belongs in.
         */
        fun orgName(orgName: String?) = apply { body.orgName(orgName) }

        /**
         * For nearly all users, this parameter should be unnecessary. But in the rare case that
         * your API key belongs to multiple organizations, you may specify the name of the
         * organization the group belongs in.
         */
        fun orgName(orgName: Optional<String>) = orgName(orgName.orElse(null))

        /**
         * For nearly all users, this parameter should be unnecessary. But in the rare case that
         * your API key belongs to multiple organizations, you may specify the name of the
         * organization the group belongs in.
         */
        fun orgName(orgName: JsonField<String>) = apply { body.orgName(orgName) }

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

        fun build(): GroupReplaceParams =
            GroupReplaceParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is GroupReplaceParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "GroupReplaceParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
