// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.BaseDeserializer
import com.braintrustdata.api.core.BaseSerializer
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.getOrThrow
import com.braintrustdata.api.core.http.Headers
import com.braintrustdata.api.core.http.QueryParams
import com.braintrustdata.api.errors.BraintrustInvalidDataException
import com.braintrustdata.api.models.*
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.util.Objects
import java.util.Optional

class UserListParams
constructor(
    private val email: Email?,
    private val endingBefore: String?,
    private val familyName: FamilyName?,
    private val givenName: GivenName?,
    private val ids: Ids?,
    private val limit: Long?,
    private val orgName: String?,
    private val startingAfter: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun email(): Optional<Email> = Optional.ofNullable(email)

    fun endingBefore(): Optional<String> = Optional.ofNullable(endingBefore)

    fun familyName(): Optional<FamilyName> = Optional.ofNullable(familyName)

    fun givenName(): Optional<GivenName> = Optional.ofNullable(givenName)

    fun ids(): Optional<Ids> = Optional.ofNullable(ids)

    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    fun orgName(): Optional<String> = Optional.ofNullable(orgName)

    fun startingAfter(): Optional<String> = Optional.ofNullable(startingAfter)

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic
    internal fun getQueryParams(): QueryParams {
        val queryParams = QueryParams.builder()
        this.email?.let { queryParams.put("email", listOf(it.toString())) }
        this.endingBefore?.let { queryParams.put("ending_before", listOf(it.toString())) }
        this.familyName?.let { queryParams.put("family_name", listOf(it.toString())) }
        this.givenName?.let { queryParams.put("given_name", listOf(it.toString())) }
        this.ids?.let { queryParams.put("ids", listOf(it.toString())) }
        this.limit?.let { queryParams.put("limit", listOf(it.toString())) }
        this.orgName?.let { queryParams.put("org_name", listOf(it.toString())) }
        this.startingAfter?.let { queryParams.put("starting_after", listOf(it.toString())) }
        queryParams.putAll(additionalQueryParams)
        return queryParams.build()
    }

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is UserListParams && this.email == other.email && this.endingBefore == other.endingBefore && this.familyName == other.familyName && this.givenName == other.givenName && this.ids == other.ids && this.limit == other.limit && this.orgName == other.orgName && this.startingAfter == other.startingAfter && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(email, endingBefore, familyName, givenName, ids, limit, orgName, startingAfter, additionalHeaders, additionalQueryParams) /* spotless:on */
    }

    override fun toString() =
        "UserListParams{email=$email, endingBefore=$endingBefore, familyName=$familyName, givenName=$givenName, ids=$ids, limit=$limit, orgName=$orgName, startingAfter=$startingAfter, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var email: Email? = null
        private var endingBefore: String? = null
        private var familyName: FamilyName? = null
        private var givenName: GivenName? = null
        private var ids: Ids? = null
        private var limit: Long? = null
        private var orgName: String? = null
        private var startingAfter: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(userListParams: UserListParams) = apply {
            this.email = userListParams.email
            this.endingBefore = userListParams.endingBefore
            this.familyName = userListParams.familyName
            this.givenName = userListParams.givenName
            this.ids = userListParams.ids
            this.limit = userListParams.limit
            this.orgName = userListParams.orgName
            this.startingAfter = userListParams.startingAfter
            additionalHeaders(userListParams.additionalHeaders)
            additionalQueryParams(userListParams.additionalQueryParams)
        }

        /**
         * Email of the user to search for. You may pass the param multiple times to filter for more
         * than one email
         */
        fun email(email: Email) = apply { this.email = email }

        /**
         * Email of the user to search for. You may pass the param multiple times to filter for more
         * than one email
         */
        fun email(string: String) = apply { this.email = Email.ofString(string) }

        /**
         * Email of the user to search for. You may pass the param multiple times to filter for more
         * than one email
         */
        fun emailOfStrings(strings: List<String>) = apply { this.email = Email.ofStrings(strings) }

        /**
         * Pagination cursor id.
         *
         * For example, if the initial item in the last page you fetched had an id of `foo`, pass
         * `ending_before=foo` to fetch the previous page. Note: you may only pass one of
         * `starting_after` and `ending_before`
         */
        fun endingBefore(endingBefore: String) = apply { this.endingBefore = endingBefore }

        /**
         * Family name of the user to search for. You may pass the param multiple times to filter
         * for more than one family name
         */
        fun familyName(familyName: FamilyName) = apply { this.familyName = familyName }

        /**
         * Family name of the user to search for. You may pass the param multiple times to filter
         * for more than one family name
         */
        fun familyName(string: String) = apply { this.familyName = FamilyName.ofString(string) }

        /**
         * Family name of the user to search for. You may pass the param multiple times to filter
         * for more than one family name
         */
        fun familyNameOfStrings(strings: List<String>) = apply {
            this.familyName = FamilyName.ofStrings(strings)
        }

        /**
         * Given name of the user to search for. You may pass the param multiple times to filter for
         * more than one given name
         */
        fun givenName(givenName: GivenName) = apply { this.givenName = givenName }

        /**
         * Given name of the user to search for. You may pass the param multiple times to filter for
         * more than one given name
         */
        fun givenName(string: String) = apply { this.givenName = GivenName.ofString(string) }

        /**
         * Given name of the user to search for. You may pass the param multiple times to filter for
         * more than one given name
         */
        fun givenNameOfStrings(strings: List<String>) = apply {
            this.givenName = GivenName.ofStrings(strings)
        }

        /**
         * Filter search results to a particular set of object IDs. To specify a list of IDs,
         * include the query param multiple times
         */
        fun ids(ids: Ids) = apply { this.ids = ids }

        /**
         * Filter search results to a particular set of object IDs. To specify a list of IDs,
         * include the query param multiple times
         */
        fun ids(string: String) = apply { this.ids = Ids.ofString(string) }

        /**
         * Filter search results to a particular set of object IDs. To specify a list of IDs,
         * include the query param multiple times
         */
        fun idsOfStrings(strings: List<String>) = apply { this.ids = Ids.ofStrings(strings) }

        /** Limit the number of objects to return */
        fun limit(limit: Long) = apply { this.limit = limit }

        /** Filter search results to within a particular organization */
        fun orgName(orgName: String) = apply { this.orgName = orgName }

        /**
         * Pagination cursor id.
         *
         * For example, if the final item in the last page you fetched had an id of `foo`, pass
         * `starting_after=foo` to fetch the next page. Note: you may only pass one of
         * `starting_after` and `ending_before`
         */
        fun startingAfter(startingAfter: String) = apply { this.startingAfter = startingAfter }

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

        fun build(): UserListParams =
            UserListParams(
                email,
                endingBefore,
                familyName,
                givenName,
                ids,
                limit,
                orgName,
                startingAfter,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    @JsonDeserialize(using = Email.Deserializer::class)
    @JsonSerialize(using = Email.Serializer::class)
    class Email
    private constructor(
        private val string: String? = null,
        private val strings: List<String>? = null,
        private val _json: JsonValue? = null,
    ) {

        private var validated: Boolean = false

        fun string(): Optional<String> = Optional.ofNullable(string)

        fun strings(): Optional<List<String>> = Optional.ofNullable(strings)

        fun isString(): Boolean = string != null

        fun isStrings(): Boolean = strings != null

        fun asString(): String = string.getOrThrow("string")

        fun asStrings(): List<String> = strings.getOrThrow("strings")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                string != null -> visitor.visitString(string)
                strings != null -> visitor.visitStrings(strings)
                else -> visitor.unknown(_json)
            }
        }

        fun validate(): Email = apply {
            if (!validated) {
                if (string == null && strings == null) {
                    throw BraintrustInvalidDataException("Unknown Email: $_json")
                }
                validated = true
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Email && this.string == other.string && this.strings == other.strings /* spotless:on */
        }

        override fun hashCode(): Int {
            return /* spotless:off */ Objects.hash(string, strings) /* spotless:on */
        }

        override fun toString(): String {
            return when {
                string != null -> "Email{string=$string}"
                strings != null -> "Email{strings=$strings}"
                _json != null -> "Email{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Email")
            }
        }

        companion object {

            @JvmStatic fun ofString(string: String) = Email(string = string)

            @JvmStatic fun ofStrings(strings: List<String>) = Email(strings = strings)
        }

        interface Visitor<out T> {

            fun visitString(string: String): T

            fun visitStrings(strings: List<String>): T

            fun unknown(json: JsonValue?): T {
                throw BraintrustInvalidDataException("Unknown Email: $json")
            }
        }

        class Deserializer : BaseDeserializer<Email>(Email::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Email {
                val json = JsonValue.fromJsonNode(node)

                tryDeserialize(node, jacksonTypeRef<String>())?.let {
                    return Email(string = it, _json = json)
                }
                tryDeserialize(node, jacksonTypeRef<List<String>>())?.let {
                    return Email(strings = it, _json = json)
                }

                return Email(_json = json)
            }
        }

        class Serializer : BaseSerializer<Email>(Email::class) {

            override fun serialize(
                value: Email,
                generator: JsonGenerator,
                provider: SerializerProvider
            ) {
                when {
                    value.string != null -> generator.writeObject(value.string)
                    value.strings != null -> generator.writeObject(value.strings)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Email")
                }
            }
        }
    }

    @JsonDeserialize(using = FamilyName.Deserializer::class)
    @JsonSerialize(using = FamilyName.Serializer::class)
    class FamilyName
    private constructor(
        private val string: String? = null,
        private val strings: List<String>? = null,
        private val _json: JsonValue? = null,
    ) {

        private var validated: Boolean = false

        fun string(): Optional<String> = Optional.ofNullable(string)

        fun strings(): Optional<List<String>> = Optional.ofNullable(strings)

        fun isString(): Boolean = string != null

        fun isStrings(): Boolean = strings != null

        fun asString(): String = string.getOrThrow("string")

        fun asStrings(): List<String> = strings.getOrThrow("strings")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                string != null -> visitor.visitString(string)
                strings != null -> visitor.visitStrings(strings)
                else -> visitor.unknown(_json)
            }
        }

        fun validate(): FamilyName = apply {
            if (!validated) {
                if (string == null && strings == null) {
                    throw BraintrustInvalidDataException("Unknown FamilyName: $_json")
                }
                validated = true
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is FamilyName && this.string == other.string && this.strings == other.strings /* spotless:on */
        }

        override fun hashCode(): Int {
            return /* spotless:off */ Objects.hash(string, strings) /* spotless:on */
        }

        override fun toString(): String {
            return when {
                string != null -> "FamilyName{string=$string}"
                strings != null -> "FamilyName{strings=$strings}"
                _json != null -> "FamilyName{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid FamilyName")
            }
        }

        companion object {

            @JvmStatic fun ofString(string: String) = FamilyName(string = string)

            @JvmStatic fun ofStrings(strings: List<String>) = FamilyName(strings = strings)
        }

        interface Visitor<out T> {

            fun visitString(string: String): T

            fun visitStrings(strings: List<String>): T

            fun unknown(json: JsonValue?): T {
                throw BraintrustInvalidDataException("Unknown FamilyName: $json")
            }
        }

        class Deserializer : BaseDeserializer<FamilyName>(FamilyName::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): FamilyName {
                val json = JsonValue.fromJsonNode(node)

                tryDeserialize(node, jacksonTypeRef<String>())?.let {
                    return FamilyName(string = it, _json = json)
                }
                tryDeserialize(node, jacksonTypeRef<List<String>>())?.let {
                    return FamilyName(strings = it, _json = json)
                }

                return FamilyName(_json = json)
            }
        }

        class Serializer : BaseSerializer<FamilyName>(FamilyName::class) {

            override fun serialize(
                value: FamilyName,
                generator: JsonGenerator,
                provider: SerializerProvider
            ) {
                when {
                    value.string != null -> generator.writeObject(value.string)
                    value.strings != null -> generator.writeObject(value.strings)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid FamilyName")
                }
            }
        }
    }

    @JsonDeserialize(using = GivenName.Deserializer::class)
    @JsonSerialize(using = GivenName.Serializer::class)
    class GivenName
    private constructor(
        private val string: String? = null,
        private val strings: List<String>? = null,
        private val _json: JsonValue? = null,
    ) {

        private var validated: Boolean = false

        fun string(): Optional<String> = Optional.ofNullable(string)

        fun strings(): Optional<List<String>> = Optional.ofNullable(strings)

        fun isString(): Boolean = string != null

        fun isStrings(): Boolean = strings != null

        fun asString(): String = string.getOrThrow("string")

        fun asStrings(): List<String> = strings.getOrThrow("strings")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                string != null -> visitor.visitString(string)
                strings != null -> visitor.visitStrings(strings)
                else -> visitor.unknown(_json)
            }
        }

        fun validate(): GivenName = apply {
            if (!validated) {
                if (string == null && strings == null) {
                    throw BraintrustInvalidDataException("Unknown GivenName: $_json")
                }
                validated = true
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is GivenName && this.string == other.string && this.strings == other.strings /* spotless:on */
        }

        override fun hashCode(): Int {
            return /* spotless:off */ Objects.hash(string, strings) /* spotless:on */
        }

        override fun toString(): String {
            return when {
                string != null -> "GivenName{string=$string}"
                strings != null -> "GivenName{strings=$strings}"
                _json != null -> "GivenName{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid GivenName")
            }
        }

        companion object {

            @JvmStatic fun ofString(string: String) = GivenName(string = string)

            @JvmStatic fun ofStrings(strings: List<String>) = GivenName(strings = strings)
        }

        interface Visitor<out T> {

            fun visitString(string: String): T

            fun visitStrings(strings: List<String>): T

            fun unknown(json: JsonValue?): T {
                throw BraintrustInvalidDataException("Unknown GivenName: $json")
            }
        }

        class Deserializer : BaseDeserializer<GivenName>(GivenName::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): GivenName {
                val json = JsonValue.fromJsonNode(node)

                tryDeserialize(node, jacksonTypeRef<String>())?.let {
                    return GivenName(string = it, _json = json)
                }
                tryDeserialize(node, jacksonTypeRef<List<String>>())?.let {
                    return GivenName(strings = it, _json = json)
                }

                return GivenName(_json = json)
            }
        }

        class Serializer : BaseSerializer<GivenName>(GivenName::class) {

            override fun serialize(
                value: GivenName,
                generator: JsonGenerator,
                provider: SerializerProvider
            ) {
                when {
                    value.string != null -> generator.writeObject(value.string)
                    value.strings != null -> generator.writeObject(value.strings)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid GivenName")
                }
            }
        }
    }

    @JsonDeserialize(using = Ids.Deserializer::class)
    @JsonSerialize(using = Ids.Serializer::class)
    class Ids
    private constructor(
        private val string: String? = null,
        private val strings: List<String>? = null,
        private val _json: JsonValue? = null,
    ) {

        private var validated: Boolean = false

        fun string(): Optional<String> = Optional.ofNullable(string)

        fun strings(): Optional<List<String>> = Optional.ofNullable(strings)

        fun isString(): Boolean = string != null

        fun isStrings(): Boolean = strings != null

        fun asString(): String = string.getOrThrow("string")

        fun asStrings(): List<String> = strings.getOrThrow("strings")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                string != null -> visitor.visitString(string)
                strings != null -> visitor.visitStrings(strings)
                else -> visitor.unknown(_json)
            }
        }

        fun validate(): Ids = apply {
            if (!validated) {
                if (string == null && strings == null) {
                    throw BraintrustInvalidDataException("Unknown Ids: $_json")
                }
                validated = true
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Ids && this.string == other.string && this.strings == other.strings /* spotless:on */
        }

        override fun hashCode(): Int {
            return /* spotless:off */ Objects.hash(string, strings) /* spotless:on */
        }

        override fun toString(): String {
            return when {
                string != null -> "Ids{string=$string}"
                strings != null -> "Ids{strings=$strings}"
                _json != null -> "Ids{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Ids")
            }
        }

        companion object {

            @JvmStatic fun ofString(string: String) = Ids(string = string)

            @JvmStatic fun ofStrings(strings: List<String>) = Ids(strings = strings)
        }

        interface Visitor<out T> {

            fun visitString(string: String): T

            fun visitStrings(strings: List<String>): T

            fun unknown(json: JsonValue?): T {
                throw BraintrustInvalidDataException("Unknown Ids: $json")
            }
        }

        class Deserializer : BaseDeserializer<Ids>(Ids::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Ids {
                val json = JsonValue.fromJsonNode(node)

                tryDeserialize(node, jacksonTypeRef<String>())?.let {
                    return Ids(string = it, _json = json)
                }
                tryDeserialize(node, jacksonTypeRef<List<String>>())?.let {
                    return Ids(strings = it, _json = json)
                }

                return Ids(_json = json)
            }
        }

        class Serializer : BaseSerializer<Ids>(Ids::class) {

            override fun serialize(
                value: Ids,
                generator: JsonGenerator,
                provider: SerializerProvider
            ) {
                when {
                    value.string != null -> generator.writeObject(value.string)
                    value.strings != null -> generator.writeObject(value.strings)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Ids")
                }
            }
        }
    }
}
