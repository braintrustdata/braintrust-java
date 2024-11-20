// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PromptOptionsTest {

    @Test
    fun createPromptOptions() {
        val promptOptions =
            PromptOptions.builder()
                .model("model")
                .params(
                    PromptOptions.Params.ofOpenAIModelParams(
                        PromptOptions.Params.OpenAIModelParams.builder()
                            .frequencyPenalty(42.23)
                            .functionCall(
                                PromptOptions.Params.OpenAIModelParams.FunctionCall.ofAuto(
                                    PromptOptions.Params.OpenAIModelParams.FunctionCall.Auto.AUTO
                                )
                            )
                            .maxTokens(42.23)
                            .n(42.23)
                            .presencePenalty(42.23)
                            .responseFormat(
                                PromptOptions.Params.OpenAIModelParams.ResponseFormat.ofJsonObject(
                                    PromptOptions.Params.OpenAIModelParams.ResponseFormat.JsonObject
                                        .builder()
                                        .type(
                                            PromptOptions.Params.OpenAIModelParams.ResponseFormat
                                                .JsonObject
                                                .Type
                                                .JSON_OBJECT
                                        )
                                        .build()
                                )
                            )
                            .stop(listOf("string"))
                            .temperature(42.23)
                            .toolChoice(
                                PromptOptions.Params.OpenAIModelParams.ToolChoice.ofAuto(
                                    PromptOptions.Params.OpenAIModelParams.ToolChoice.Auto.AUTO
                                )
                            )
                            .topP(42.23)
                            .useCache(true)
                            .build()
                    )
                )
                .position("position")
                .build()
        assertThat(promptOptions).isNotNull
        assertThat(promptOptions.model()).contains("model")
        assertThat(promptOptions.params())
            .contains(
                PromptOptions.Params.ofOpenAIModelParams(
                    PromptOptions.Params.OpenAIModelParams.builder()
                        .frequencyPenalty(42.23)
                        .functionCall(
                            PromptOptions.Params.OpenAIModelParams.FunctionCall.ofAuto(
                                PromptOptions.Params.OpenAIModelParams.FunctionCall.Auto.AUTO
                            )
                        )
                        .maxTokens(42.23)
                        .n(42.23)
                        .presencePenalty(42.23)
                        .responseFormat(
                            PromptOptions.Params.OpenAIModelParams.ResponseFormat.ofJsonObject(
                                PromptOptions.Params.OpenAIModelParams.ResponseFormat.JsonObject
                                    .builder()
                                    .type(
                                        PromptOptions.Params.OpenAIModelParams.ResponseFormat
                                            .JsonObject
                                            .Type
                                            .JSON_OBJECT
                                    )
                                    .build()
                            )
                        )
                        .stop(listOf("string"))
                        .temperature(42.23)
                        .toolChoice(
                            PromptOptions.Params.OpenAIModelParams.ToolChoice.ofAuto(
                                PromptOptions.Params.OpenAIModelParams.ToolChoice.Auto.AUTO
                            )
                        )
                        .topP(42.23)
                        .useCache(true)
                        .build()
                )
            )
        assertThat(promptOptions.position()).contains("position")
    }
}
