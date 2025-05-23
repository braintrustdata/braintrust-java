// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.Enum
import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.checkRequired
import com.braintrustdata.api.errors.BraintrustInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PatchOrganizationMembersOutput
private constructor(
    private val orgId: JsonField<String>,
    private val status: JsonField<Status>,
    private val sendEmailError: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("org_id") @ExcludeMissing orgId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("send_email_error")
        @ExcludeMissing
        sendEmailError: JsonField<String> = JsonMissing.of(),
    ) : this(orgId, status, sendEmailError, mutableMapOf())

    /**
     * The id of the org that was modified.
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun orgId(): String = orgId.getRequired("org_id")

    /**
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * If invite emails failed to send for some reason, the patch operation will still complete, but
     * we will return an error message here
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sendEmailError(): Optional<String> = sendEmailError.getOptional("send_email_error")

    /**
     * Returns the raw JSON value of [orgId].
     *
     * Unlike [orgId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("org_id") @ExcludeMissing fun _orgId(): JsonField<String> = orgId

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [sendEmailError].
     *
     * Unlike [sendEmailError], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("send_email_error")
    @ExcludeMissing
    fun _sendEmailError(): JsonField<String> = sendEmailError

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

        /**
         * Returns a mutable builder for constructing an instance of
         * [PatchOrganizationMembersOutput].
         *
         * The following fields are required:
         * ```java
         * .orgId()
         * .status()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PatchOrganizationMembersOutput]. */
    class Builder internal constructor() {

        private var orgId: JsonField<String>? = null
        private var status: JsonField<Status>? = null
        private var sendEmailError: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(patchOrganizationMembersOutput: PatchOrganizationMembersOutput) = apply {
            orgId = patchOrganizationMembersOutput.orgId
            status = patchOrganizationMembersOutput.status
            sendEmailError = patchOrganizationMembersOutput.sendEmailError
            additionalProperties =
                patchOrganizationMembersOutput.additionalProperties.toMutableMap()
        }

        /** The id of the org that was modified. */
        fun orgId(orgId: String) = orgId(JsonField.of(orgId))

        /**
         * Sets [Builder.orgId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.orgId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun orgId(orgId: JsonField<String>) = apply { this.orgId = orgId }

        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /**
         * If invite emails failed to send for some reason, the patch operation will still complete,
         * but we will return an error message here
         */
        fun sendEmailError(sendEmailError: String?) =
            sendEmailError(JsonField.ofNullable(sendEmailError))

        /** Alias for calling [Builder.sendEmailError] with `sendEmailError.orElse(null)`. */
        fun sendEmailError(sendEmailError: Optional<String>) =
            sendEmailError(sendEmailError.getOrNull())

        /**
         * Sets [Builder.sendEmailError] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sendEmailError] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sendEmailError(sendEmailError: JsonField<String>) = apply {
            this.sendEmailError = sendEmailError
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
         * Returns an immutable instance of [PatchOrganizationMembersOutput].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .orgId()
         * .status()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PatchOrganizationMembersOutput =
            PatchOrganizationMembersOutput(
                checkRequired("orgId", orgId),
                checkRequired("status", status),
                sendEmailError,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PatchOrganizationMembersOutput = apply {
        if (validated) {
            return@apply
        }

        orgId()
        status().validate()
        sendEmailError()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (orgId.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (sendEmailError.asKnown().isPresent) 1 else 0)

    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val SUCCESS = of("success")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            SUCCESS
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            SUCCESS,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                SUCCESS -> Value.SUCCESS
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws BraintrustInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                SUCCESS -> Known.SUCCESS
                else -> throw BraintrustInvalidDataException("Unknown Status: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws BraintrustInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                BraintrustInvalidDataException("Value is not a String")
            }

        private var validated: Boolean = false

        fun validate(): Status = apply {
            if (validated) {
                return@apply
            }

            known()
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
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PatchOrganizationMembersOutput && orgId == other.orgId && status == other.status && sendEmailError == other.sendEmailError && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(orgId, status, sendEmailError, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PatchOrganizationMembersOutput{orgId=$orgId, status=$status, sendEmailError=$sendEmailError, additionalProperties=$additionalProperties}"
}
