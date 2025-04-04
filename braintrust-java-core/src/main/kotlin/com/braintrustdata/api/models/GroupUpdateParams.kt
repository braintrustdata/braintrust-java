// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.Params
import com.braintrustdata.api.core.checkKnown
import com.braintrustdata.api.core.checkRequired
import com.braintrustdata.api.core.http.Headers
import com.braintrustdata.api.core.http.QueryParams
import com.braintrustdata.api.core.toImmutable
import com.braintrustdata.api.errors.BraintrustInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Partially update a group object. Specify the fields to update in the payload. Any object-type
 * fields will be deep-merged with existing content. Currently we do not support removing fields or
 * setting them to null.
 */
class GroupUpdateParams
private constructor(
    private val groupId: String,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Group id */
    fun groupId(): String = groupId

    /**
     * A list of group IDs to add to the group's inheriting-from set
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun addMemberGroups(): Optional<List<String>> = body.addMemberGroups()

    /**
     * A list of user IDs to add to the group
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun addMemberUsers(): Optional<List<String>> = body.addMemberUsers()

    /**
     * Textual description of the group
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = body.description()

    /**
     * Name of the group
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = body.name()

    /**
     * A list of group IDs to remove from the group's inheriting-from set
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun removeMemberGroups(): Optional<List<String>> = body.removeMemberGroups()

    /**
     * A list of user IDs to remove from the group
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun removeMemberUsers(): Optional<List<String>> = body.removeMemberUsers()

    /**
     * Returns the raw JSON value of [addMemberGroups].
     *
     * Unlike [addMemberGroups], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _addMemberGroups(): JsonField<List<String>> = body._addMemberGroups()

    /**
     * Returns the raw JSON value of [addMemberUsers].
     *
     * Unlike [addMemberUsers], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _addMemberUsers(): JsonField<List<String>> = body._addMemberUsers()

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _description(): JsonField<String> = body._description()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [removeMemberGroups].
     *
     * Unlike [removeMemberGroups], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _removeMemberGroups(): JsonField<List<String>> = body._removeMemberGroups()

    /**
     * Returns the raw JSON value of [removeMemberUsers].
     *
     * Unlike [removeMemberUsers], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _removeMemberUsers(): JsonField<List<String>> = body._removeMemberUsers()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [GroupUpdateParams].
         *
         * The following fields are required:
         * ```java
         * .groupId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [GroupUpdateParams]. */
    class Builder internal constructor() {

        private var groupId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(groupUpdateParams: GroupUpdateParams) = apply {
            groupId = groupUpdateParams.groupId
            body = groupUpdateParams.body.toBuilder()
            additionalHeaders = groupUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = groupUpdateParams.additionalQueryParams.toBuilder()
        }

        /** Group id */
        fun groupId(groupId: String) = apply { this.groupId = groupId }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [addMemberGroups]
         * - [addMemberUsers]
         * - [description]
         * - [name]
         * - [removeMemberGroups]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** A list of group IDs to add to the group's inheriting-from set */
        fun addMemberGroups(addMemberGroups: List<String>?) = apply {
            body.addMemberGroups(addMemberGroups)
        }

        /** Alias for calling [Builder.addMemberGroups] with `addMemberGroups.orElse(null)`. */
        fun addMemberGroups(addMemberGroups: Optional<List<String>>) =
            addMemberGroups(addMemberGroups.getOrNull())

        /**
         * Sets [Builder.addMemberGroups] to an arbitrary JSON value.
         *
         * You should usually call [Builder.addMemberGroups] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun addMemberGroups(addMemberGroups: JsonField<List<String>>) = apply {
            body.addMemberGroups(addMemberGroups)
        }

        /**
         * Adds a single [String] to [addMemberGroups].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAddMemberGroup(addMemberGroup: String) = apply {
            body.addAddMemberGroup(addMemberGroup)
        }

        /** A list of user IDs to add to the group */
        fun addMemberUsers(addMemberUsers: List<String>?) = apply {
            body.addMemberUsers(addMemberUsers)
        }

        /** Alias for calling [Builder.addMemberUsers] with `addMemberUsers.orElse(null)`. */
        fun addMemberUsers(addMemberUsers: Optional<List<String>>) =
            addMemberUsers(addMemberUsers.getOrNull())

        /**
         * Sets [Builder.addMemberUsers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.addMemberUsers] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun addMemberUsers(addMemberUsers: JsonField<List<String>>) = apply {
            body.addMemberUsers(addMemberUsers)
        }

        /**
         * Adds a single [String] to [addMemberUsers].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAddMemberUser(addMemberUser: String) = apply { body.addAddMemberUser(addMemberUser) }

        /** Textual description of the group */
        fun description(description: String?) = apply { body.description(description) }

        /** Alias for calling [Builder.description] with `description.orElse(null)`. */
        fun description(description: Optional<String>) = description(description.getOrNull())

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        /** Name of the group */
        fun name(name: String?) = apply { body.name(name) }

        /** Alias for calling [Builder.name] with `name.orElse(null)`. */
        fun name(name: Optional<String>) = name(name.getOrNull())

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /** A list of group IDs to remove from the group's inheriting-from set */
        fun removeMemberGroups(removeMemberGroups: List<String>?) = apply {
            body.removeMemberGroups(removeMemberGroups)
        }

        /**
         * Alias for calling [Builder.removeMemberGroups] with `removeMemberGroups.orElse(null)`.
         */
        fun removeMemberGroups(removeMemberGroups: Optional<List<String>>) =
            removeMemberGroups(removeMemberGroups.getOrNull())

        /**
         * Sets [Builder.removeMemberGroups] to an arbitrary JSON value.
         *
         * You should usually call [Builder.removeMemberGroups] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun removeMemberGroups(removeMemberGroups: JsonField<List<String>>) = apply {
            body.removeMemberGroups(removeMemberGroups)
        }

        /**
         * Adds a single [String] to [removeMemberGroups].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRemoveMemberGroup(removeMemberGroup: String) = apply {
            body.addRemoveMemberGroup(removeMemberGroup)
        }

        /** A list of user IDs to remove from the group */
        fun removeMemberUsers(removeMemberUsers: List<String>?) = apply {
            body.removeMemberUsers(removeMemberUsers)
        }

        /** Alias for calling [Builder.removeMemberUsers] with `removeMemberUsers.orElse(null)`. */
        fun removeMemberUsers(removeMemberUsers: Optional<List<String>>) =
            removeMemberUsers(removeMemberUsers.getOrNull())

        /**
         * Sets [Builder.removeMemberUsers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.removeMemberUsers] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun removeMemberUsers(removeMemberUsers: JsonField<List<String>>) = apply {
            body.removeMemberUsers(removeMemberUsers)
        }

        /**
         * Adds a single [String] to [removeMemberUsers].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRemoveMemberUser(removeMemberUser: String) = apply {
            body.addRemoveMemberUser(removeMemberUser)
        }

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

        /**
         * Returns an immutable instance of [GroupUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .groupId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): GroupUpdateParams =
            GroupUpdateParams(
                checkRequired("groupId", groupId),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> groupId
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    private constructor(
        private val addMemberGroups: JsonField<List<String>>,
        private val addMemberUsers: JsonField<List<String>>,
        private val description: JsonField<String>,
        private val name: JsonField<String>,
        private val removeMemberGroups: JsonField<List<String>>,
        private val removeMemberUsers: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("add_member_groups")
            @ExcludeMissing
            addMemberGroups: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("add_member_users")
            @ExcludeMissing
            addMemberUsers: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("remove_member_groups")
            @ExcludeMissing
            removeMemberGroups: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("remove_member_users")
            @ExcludeMissing
            removeMemberUsers: JsonField<List<String>> = JsonMissing.of(),
        ) : this(
            addMemberGroups,
            addMemberUsers,
            description,
            name,
            removeMemberGroups,
            removeMemberUsers,
            mutableMapOf(),
        )

        /**
         * A list of group IDs to add to the group's inheriting-from set
         *
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun addMemberGroups(): Optional<List<String>> =
            addMemberGroups.getOptional("add_member_groups")

        /**
         * A list of user IDs to add to the group
         *
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun addMemberUsers(): Optional<List<String>> =
            addMemberUsers.getOptional("add_member_users")

        /**
         * Textual description of the group
         *
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * Name of the group
         *
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * A list of group IDs to remove from the group's inheriting-from set
         *
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun removeMemberGroups(): Optional<List<String>> =
            removeMemberGroups.getOptional("remove_member_groups")

        /**
         * A list of user IDs to remove from the group
         *
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun removeMemberUsers(): Optional<List<String>> =
            removeMemberUsers.getOptional("remove_member_users")

        /**
         * Returns the raw JSON value of [addMemberGroups].
         *
         * Unlike [addMemberGroups], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("add_member_groups")
        @ExcludeMissing
        fun _addMemberGroups(): JsonField<List<String>> = addMemberGroups

        /**
         * Returns the raw JSON value of [addMemberUsers].
         *
         * Unlike [addMemberUsers], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("add_member_users")
        @ExcludeMissing
        fun _addMemberUsers(): JsonField<List<String>> = addMemberUsers

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [removeMemberGroups].
         *
         * Unlike [removeMemberGroups], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("remove_member_groups")
        @ExcludeMissing
        fun _removeMemberGroups(): JsonField<List<String>> = removeMemberGroups

        /**
         * Returns the raw JSON value of [removeMemberUsers].
         *
         * Unlike [removeMemberUsers], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("remove_member_users")
        @ExcludeMissing
        fun _removeMemberUsers(): JsonField<List<String>> = removeMemberUsers

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
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
            internal fun from(body: Body) = apply {
                addMemberGroups = body.addMemberGroups.map { it.toMutableList() }
                addMemberUsers = body.addMemberUsers.map { it.toMutableList() }
                description = body.description
                name = body.name
                removeMemberGroups = body.removeMemberGroups.map { it.toMutableList() }
                removeMemberUsers = body.removeMemberUsers.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** A list of group IDs to add to the group's inheriting-from set */
            fun addMemberGroups(addMemberGroups: List<String>?) =
                addMemberGroups(JsonField.ofNullable(addMemberGroups))

            /** Alias for calling [Builder.addMemberGroups] with `addMemberGroups.orElse(null)`. */
            fun addMemberGroups(addMemberGroups: Optional<List<String>>) =
                addMemberGroups(addMemberGroups.getOrNull())

            /**
             * Sets [Builder.addMemberGroups] to an arbitrary JSON value.
             *
             * You should usually call [Builder.addMemberGroups] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun addMemberGroups(addMemberGroups: JsonField<List<String>>) = apply {
                this.addMemberGroups = addMemberGroups.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [addMemberGroups].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAddMemberGroup(addMemberGroup: String) = apply {
                addMemberGroups =
                    (addMemberGroups ?: JsonField.of(mutableListOf())).also {
                        checkKnown("addMemberGroups", it).add(addMemberGroup)
                    }
            }

            /** A list of user IDs to add to the group */
            fun addMemberUsers(addMemberUsers: List<String>?) =
                addMemberUsers(JsonField.ofNullable(addMemberUsers))

            /** Alias for calling [Builder.addMemberUsers] with `addMemberUsers.orElse(null)`. */
            fun addMemberUsers(addMemberUsers: Optional<List<String>>) =
                addMemberUsers(addMemberUsers.getOrNull())

            /**
             * Sets [Builder.addMemberUsers] to an arbitrary JSON value.
             *
             * You should usually call [Builder.addMemberUsers] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun addMemberUsers(addMemberUsers: JsonField<List<String>>) = apply {
                this.addMemberUsers = addMemberUsers.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [addMemberUsers].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAddMemberUser(addMemberUser: String) = apply {
                addMemberUsers =
                    (addMemberUsers ?: JsonField.of(mutableListOf())).also {
                        checkKnown("addMemberUsers", it).add(addMemberUser)
                    }
            }

            /** Textual description of the group */
            fun description(description: String?) = description(JsonField.ofNullable(description))

            /** Alias for calling [Builder.description] with `description.orElse(null)`. */
            fun description(description: Optional<String>) = description(description.getOrNull())

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /** Name of the group */
            fun name(name: String?) = name(JsonField.ofNullable(name))

            /** Alias for calling [Builder.name] with `name.orElse(null)`. */
            fun name(name: Optional<String>) = name(name.getOrNull())

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** A list of group IDs to remove from the group's inheriting-from set */
            fun removeMemberGroups(removeMemberGroups: List<String>?) =
                removeMemberGroups(JsonField.ofNullable(removeMemberGroups))

            /**
             * Alias for calling [Builder.removeMemberGroups] with
             * `removeMemberGroups.orElse(null)`.
             */
            fun removeMemberGroups(removeMemberGroups: Optional<List<String>>) =
                removeMemberGroups(removeMemberGroups.getOrNull())

            /**
             * Sets [Builder.removeMemberGroups] to an arbitrary JSON value.
             *
             * You should usually call [Builder.removeMemberGroups] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun removeMemberGroups(removeMemberGroups: JsonField<List<String>>) = apply {
                this.removeMemberGroups = removeMemberGroups.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [removeMemberGroups].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addRemoveMemberGroup(removeMemberGroup: String) = apply {
                removeMemberGroups =
                    (removeMemberGroups ?: JsonField.of(mutableListOf())).also {
                        checkKnown("removeMemberGroups", it).add(removeMemberGroup)
                    }
            }

            /** A list of user IDs to remove from the group */
            fun removeMemberUsers(removeMemberUsers: List<String>?) =
                removeMemberUsers(JsonField.ofNullable(removeMemberUsers))

            /**
             * Alias for calling [Builder.removeMemberUsers] with `removeMemberUsers.orElse(null)`.
             */
            fun removeMemberUsers(removeMemberUsers: Optional<List<String>>) =
                removeMemberUsers(removeMemberUsers.getOrNull())

            /**
             * Sets [Builder.removeMemberUsers] to an arbitrary JSON value.
             *
             * You should usually call [Builder.removeMemberUsers] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun removeMemberUsers(removeMemberUsers: JsonField<List<String>>) = apply {
                this.removeMemberUsers = removeMemberUsers.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [removeMemberUsers].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addRemoveMemberUser(removeMemberUser: String) = apply {
                removeMemberUsers =
                    (removeMemberUsers ?: JsonField.of(mutableListOf())).also {
                        checkKnown("removeMemberUsers", it).add(removeMemberUser)
                    }
            }

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

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body =
                Body(
                    (addMemberGroups ?: JsonMissing.of()).map { it.toImmutable() },
                    (addMemberUsers ?: JsonMissing.of()).map { it.toImmutable() },
                    description,
                    name,
                    (removeMemberGroups ?: JsonMissing.of()).map { it.toImmutable() },
                    (removeMemberUsers ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
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

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: BraintrustInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (addMemberGroups.asKnown().getOrNull()?.size ?: 0) +
                (addMemberUsers.asKnown().getOrNull()?.size ?: 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (removeMemberGroups.asKnown().getOrNull()?.size ?: 0) +
                (removeMemberUsers.asKnown().getOrNull()?.size ?: 0)

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

        override fun toString() =
            "Body{addMemberGroups=$addMemberGroups, addMemberUsers=$addMemberUsers, description=$description, name=$name, removeMemberGroups=$removeMemberGroups, removeMemberUsers=$removeMemberUsers, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is GroupUpdateParams && groupId == other.groupId && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(groupId, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "GroupUpdateParams{groupId=$groupId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
