// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.toUnmodifiable
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import java.util.Objects

@JsonDeserialize(builder = FeedbackExperimentEventRequest.Builder::class)
@NoAutoDetect
class FeedbackExperimentEventRequest
private constructor(
    private val feedback: JsonField<List<FeedbackExperimentItem>>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** A list of experiment feedback items */
    fun feedback(): List<FeedbackExperimentItem> = feedback.getRequired("feedback")

    /** A list of experiment feedback items */
    @JsonProperty("feedback") @ExcludeMissing fun _feedback() = feedback

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): FeedbackExperimentEventRequest = apply {
        if (!validated) {
            feedback().forEach { it.validate() }
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FeedbackExperimentEventRequest &&
            this.feedback == other.feedback &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = Objects.hash(feedback, additionalProperties)
        }
        return hashCode
    }

    override fun toString() =
        "FeedbackExperimentEventRequest{feedback=$feedback, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var feedback: JsonField<List<FeedbackExperimentItem>> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(feedbackExperimentEventRequest: FeedbackExperimentEventRequest) = apply {
            this.feedback = feedbackExperimentEventRequest.feedback
            additionalProperties(feedbackExperimentEventRequest.additionalProperties)
        }

        /** A list of experiment feedback items */
        fun feedback(feedback: List<FeedbackExperimentItem>) = feedback(JsonField.of(feedback))

        /** A list of experiment feedback items */
        @JsonProperty("feedback")
        @ExcludeMissing
        fun feedback(feedback: JsonField<List<FeedbackExperimentItem>>) = apply {
            this.feedback = feedback
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

        fun build(): FeedbackExperimentEventRequest =
            FeedbackExperimentEventRequest(
                feedback.map { it.toUnmodifiable() },
                additionalProperties.toUnmodifiable()
            )
    }
}
