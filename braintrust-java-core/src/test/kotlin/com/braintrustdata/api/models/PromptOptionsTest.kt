// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PromptOptionsTest {

    @Test
    fun create() {
        val promptOptions =
            PromptOptions.builder()
                .model("model")
                .params(
                    PromptOptions.Params.OpenAIModelParams.builder()
                        .frequencyPenalty(0.0)
                        .functionCall(
                            PromptOptions.Params.OpenAIModelParams.FunctionCall.UnionMember0.AUTO
                        )
                        .maxCompletionTokens(0.0)
                        .maxTokens(0.0)
                        .n(0.0)
                        .presencePenalty(0.0)
                        .reasoningEffort(PromptOptions.Params.OpenAIModelParams.ReasoningEffort.LOW)
                        .responseFormat(
                            PromptOptions.Params.OpenAIModelParams.ResponseFormat.JsonObject
                                .builder()
                                .type(
                                    PromptOptions.Params.OpenAIModelParams.ResponseFormat.JsonObject
                                        .Type
                                        .JSON_OBJECT
                                )
                                .build()
                        )
                        .addStop("string")
                        .temperature(0.0)
                        .toolChoice(
                            PromptOptions.Params.OpenAIModelParams.ToolChoice.UnionMember0.AUTO
                        )
                        .topP(0.0)
                        .useCache(true)
                        .build()
                )
                .position("position")
                .build()

        assertThat(promptOptions.model()).contains("model")
        assertThat(promptOptions.params())
            .contains(
                PromptOptions.Params.ofOpenAIModel(
                    PromptOptions.Params.OpenAIModelParams.builder()
                        .frequencyPenalty(0.0)
                        .functionCall(
                            PromptOptions.Params.OpenAIModelParams.FunctionCall.UnionMember0.AUTO
                        )
                        .maxCompletionTokens(0.0)
                        .maxTokens(0.0)
                        .n(0.0)
                        .presencePenalty(0.0)
                        .reasoningEffort(PromptOptions.Params.OpenAIModelParams.ReasoningEffort.LOW)
                        .responseFormat(
                            PromptOptions.Params.OpenAIModelParams.ResponseFormat.JsonObject
                                .builder()
                                .type(
                                    PromptOptions.Params.OpenAIModelParams.ResponseFormat.JsonObject
                                        .Type
                                        .JSON_OBJECT
                                )
                                .build()
                        )
                        .addStop("string")
                        .temperature(0.0)
                        .toolChoice(
                            PromptOptions.Params.OpenAIModelParams.ToolChoice.UnionMember0.AUTO
                        )
                        .topP(0.0)
                        .useCache(true)
                        .build()
                )
            )
        assertThat(promptOptions.position()).contains("position")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val promptOptions =
            PromptOptions.builder()
                .model("model")
                .params(
                    PromptOptions.Params.OpenAIModelParams.builder()
                        .frequencyPenalty(0.0)
                        .functionCall(
                            PromptOptions.Params.OpenAIModelParams.FunctionCall.UnionMember0.AUTO
                        )
                        .maxCompletionTokens(0.0)
                        .maxTokens(0.0)
                        .n(0.0)
                        .presencePenalty(0.0)
                        .reasoningEffort(PromptOptions.Params.OpenAIModelParams.ReasoningEffort.LOW)
                        .responseFormat(
                            PromptOptions.Params.OpenAIModelParams.ResponseFormat.JsonObject
                                .builder()
                                .type(
                                    PromptOptions.Params.OpenAIModelParams.ResponseFormat.JsonObject
                                        .Type
                                        .JSON_OBJECT
                                )
                                .build()
                        )
                        .addStop("string")
                        .temperature(0.0)
                        .toolChoice(
                            PromptOptions.Params.OpenAIModelParams.ToolChoice.UnionMember0.AUTO
                        )
                        .topP(0.0)
                        .useCache(true)
                        .build()
                )
                .position("position")
                .build()

        val roundtrippedPromptOptions =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(promptOptions),
                jacksonTypeRef<PromptOptions>(),
            )

        assertThat(roundtrippedPromptOptions).isEqualTo(promptOptions)
    }
}
