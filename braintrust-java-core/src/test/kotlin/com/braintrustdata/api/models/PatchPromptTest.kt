// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PatchPromptTest {

    @Test
    fun createPatchPrompt() {
        val patchPrompt =
            PatchPrompt.builder()
                .description("description")
                .name("name")
                .promptData(
                    PromptData.builder()
                        .options(
                            PromptData.Options.builder()
                                .model("model")
                                .params(
                                    PromptData.Options.Params.ofOpenAIModelParams(
                                        PromptData.Options.Params.OpenAIModelParams.builder()
                                            .frequencyPenalty(42.23)
                                            .functionCall(
                                                PromptData.Options.Params.OpenAIModelParams
                                                    .FunctionCall
                                                    .ofAuto(
                                                        PromptData.Options.Params.OpenAIModelParams
                                                            .FunctionCall
                                                            .Auto
                                                            .AUTO
                                                    )
                                            )
                                            .maxTokens(42.23)
                                            .n(42.23)
                                            .presencePenalty(42.23)
                                            .responseFormat(
                                                PromptData.Options.Params.OpenAIModelParams
                                                    .ResponseFormat
                                                    .builder()
                                                    .type(
                                                        PromptData.Options.Params.OpenAIModelParams
                                                            .ResponseFormat
                                                            .Type
                                                            .JSON_OBJECT
                                                    )
                                                    .build()
                                            )
                                            .stop(listOf("string"))
                                            .temperature(42.23)
                                            .toolChoice(
                                                PromptData.Options.Params.OpenAIModelParams
                                                    .ToolChoice
                                                    .ofAuto(
                                                        PromptData.Options.Params.OpenAIModelParams
                                                            .ToolChoice
                                                            .Auto
                                                            .AUTO
                                                    )
                                            )
                                            .topP(42.23)
                                            .useCache(true)
                                            .build()
                                    )
                                )
                                .position("position")
                                .build()
                        )
                        .origin(
                            PromptData.Origin.builder()
                                .projectId("project_id")
                                .promptId("prompt_id")
                                .promptVersion("prompt_version")
                                .build()
                        )
                        .prompt(
                            PromptData.Prompt.ofCompletion(
                                PromptData.Prompt.Completion.builder()
                                    .content("content")
                                    .type(PromptData.Prompt.Completion.Type.COMPLETION)
                                    .build()
                            )
                        )
                        .build()
                )
                .tags(listOf("string"))
                .build()
        assertThat(patchPrompt).isNotNull
        assertThat(patchPrompt.description()).contains("description")
        assertThat(patchPrompt.name()).contains("name")
        assertThat(patchPrompt.promptData())
            .contains(
                PromptData.builder()
                    .options(
                        PromptData.Options.builder()
                            .model("model")
                            .params(
                                PromptData.Options.Params.ofOpenAIModelParams(
                                    PromptData.Options.Params.OpenAIModelParams.builder()
                                        .frequencyPenalty(42.23)
                                        .functionCall(
                                            PromptData.Options.Params.OpenAIModelParams.FunctionCall
                                                .ofAuto(
                                                    PromptData.Options.Params.OpenAIModelParams
                                                        .FunctionCall
                                                        .Auto
                                                        .AUTO
                                                )
                                        )
                                        .maxTokens(42.23)
                                        .n(42.23)
                                        .presencePenalty(42.23)
                                        .responseFormat(
                                            PromptData.Options.Params.OpenAIModelParams
                                                .ResponseFormat
                                                .builder()
                                                .type(
                                                    PromptData.Options.Params.OpenAIModelParams
                                                        .ResponseFormat
                                                        .Type
                                                        .JSON_OBJECT
                                                )
                                                .build()
                                        )
                                        .stop(listOf("string"))
                                        .temperature(42.23)
                                        .toolChoice(
                                            PromptData.Options.Params.OpenAIModelParams.ToolChoice
                                                .ofAuto(
                                                    PromptData.Options.Params.OpenAIModelParams
                                                        .ToolChoice
                                                        .Auto
                                                        .AUTO
                                                )
                                        )
                                        .topP(42.23)
                                        .useCache(true)
                                        .build()
                                )
                            )
                            .position("position")
                            .build()
                    )
                    .origin(
                        PromptData.Origin.builder()
                            .projectId("project_id")
                            .promptId("prompt_id")
                            .promptVersion("prompt_version")
                            .build()
                    )
                    .prompt(
                        PromptData.Prompt.ofCompletion(
                            PromptData.Prompt.Completion.builder()
                                .content("content")
                                .type(PromptData.Prompt.Completion.Type.COMPLETION)
                                .build()
                        )
                    )
                    .build()
            )
        assertThat(patchPrompt.tags().get()).containsExactly("string")
    }
}