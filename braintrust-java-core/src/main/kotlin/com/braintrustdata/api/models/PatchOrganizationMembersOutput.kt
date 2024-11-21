// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.Enum
import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.toImmutable
import com.braintrustdata.api.errors.BraintrustInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = PatchOrganizationMembersOutput.Builder::class)
@NoAutoDetect
class PatchOrganizationMembersOutput
private constructor(
    private val status: JsonField<Status>,
    private val orgId: JsonField<String>,
    private val sendEmailError: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    fun status(): Status = status.getRequired("status")

    /** The id of the org that was modified. */
    fun orgId(): String = orgId.getRequired("org_id")

    /**
     * If invite emails failed to send for some reason, the patch operation will still complete, but
     * we will return an error message here
     */
    fun sendEmailError(): Optional<String> =
        Optional.ofNullable(sendEmailError.getNullable("send_email_error"))

    @JsonProperty("status") @ExcludeMissing fun _status() = status

    /** The id of the org that was modified. */
    @JsonProperty("org_id") @ExcludeMissing fun _orgId() = orgId

    /**
     * If invite emails failed to send for some reason, the patch operation will still complete, but
     * we will return an error message here
     */
    @JsonProperty("send_email_error") @ExcludeMissing fun _sendEmailError() = sendEmailError

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): PatchOrganizationMembersOutput = apply {
        if (!validated) {
            status()
            orgId()
            sendEmailError()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var status: JsonField<Status> = JsonMissing.of()
        private var orgId: JsonField<String> = JsonMissing.of()
        private var sendEmailError: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(patchOrganizationMembersOutput: PatchOrganizationMembersOutput) = apply {
            this.status = patchOrganizationMembersOutput.status
            this.orgId = patchOrganizationMembersOutput.orgId
            this.sendEmailError = patchOrganizationMembersOutput.sendEmailError
            additionalProperties(patchOrganizationMembersOutput.additionalProperties)
        }

        fun status(status: Status) = status(JsonField.of(status))

        @JsonProperty("status")
        @ExcludeMissing
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** The id of the org that was modified. */
        fun orgId(orgId: String) = orgId(JsonField.of(orgId))

        /** The id of the org that was modified. */
        @JsonProperty("org_id")
        @ExcludeMissing
        fun orgId(orgId: JsonField<String>) = apply { this.orgId = orgId }

        /**
         * If invite emails failed to send for some reason, the patch operation will still complete,
         * but we will return an error message here
         */
        fun sendEmailError(sendEmailError: String) = sendEmailError(JsonField.of(sendEmailError))

        /**
         * If invite emails failed to send for some reason, the patch operation will still complete,
         * but we will return an error message here
         */
        @JsonProperty("send_email_error")
        @ExcludeMissing
        fun sendEmailError(sendEmailError: JsonField<String>) = apply {
            this.sendEmailError = sendEmailError
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

        fun build(): PatchOrganizationMembersOutput =
            PatchOrganizationMembersOutput(
                status,
                orgId,
                sendEmailError,
                additionalProperties.toImmutable(),
            )
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val SUCCESS = Status(JsonField.of("success"))

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            SUCCESS,
        }

        enum class Value {
            SUCCESS,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                SUCCESS -> Value.SUCCESS
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                SUCCESS -> Known.SUCCESS
                else -> throw BraintrustInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PatchOrganizationMembersOutput && status == other.status && orgId == other.orgId && sendEmailError == other.sendEmailError && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(status, orgId, sendEmailError, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PatchOrganizationMembersOutput{status=$status, orgId=$orgId, sendEmailError=$sendEmailError, additionalProperties=$additionalProperties}"
}
