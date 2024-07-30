// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class FunctionReplaceParamsTest {

    @Test
    fun createFunctionReplaceParams() {
        FunctionReplaceParams.builder()
            .functionData(
                FunctionReplaceParams.FunctionData.ofPrompt(
                    FunctionReplaceParams.FunctionData.Prompt.builder()
                        .type(FunctionReplaceParams.FunctionData.Prompt.Type.PROMPT)
                        .build()
                )
            )
            .name("name")
            .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .slug("slug")
            .description("description")
            .promptData(
                FunctionReplaceParams.PromptData.builder()
                    .options(
                        FunctionReplaceParams.PromptData.Options.builder()
                            .model("model")
                            .params(
                                FunctionReplaceParams.PromptData.Options.Params.ofOpenAIModelParams(
                                    FunctionReplaceParams.PromptData.Options.Params
                                        .OpenAIModelParams
                                        .builder()
                                        .frequencyPenalty(42.23)
                                        .functionCall(
                                            FunctionReplaceParams.PromptData.Options.Params
                                                .OpenAIModelParams
                                                .FunctionCall
                                                .ofAuto(
                                                    FunctionReplaceParams.PromptData.Options.Params
                                                        .OpenAIModelParams
                                                        .FunctionCall
                                                        .Auto
                                                        .AUTO
                                                )
                                        )
                                        .maxTokens(42.23)
                                        .n(42.23)
                                        .presencePenalty(42.23)
                                        .responseFormat(
                                            FunctionReplaceParams.PromptData.Options.Params
                                                .OpenAIModelParams
                                                .ResponseFormat
                                                .builder()
                                                .type(
                                                    FunctionReplaceParams.PromptData.Options.Params
                                                        .OpenAIModelParams
                                                        .ResponseFormat
                                                        .Type
                                                        .JSON_OBJECT
                                                )
                                                .build()
                                        )
                                        .stop(listOf("string"))
                                        .temperature(42.23)
                                        .toolChoice(
                                            FunctionReplaceParams.PromptData.Options.Params
                                                .OpenAIModelParams
                                                .ToolChoice
                                                .ofAuto(
                                                    FunctionReplaceParams.PromptData.Options.Params
                                                        .OpenAIModelParams
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
                        FunctionReplaceParams.PromptData.Origin.builder()
                            .projectId("project_id")
                            .promptId("prompt_id")
                            .promptVersion("prompt_version")
                            .build()
                    )
                    .prompt(
                        FunctionReplaceParams.PromptData.Prompt.ofCompletion(
                            FunctionReplaceParams.PromptData.Prompt.Completion.builder()
                                .content("content")
                                .type(
                                    FunctionReplaceParams.PromptData.Prompt.Completion.Type
                                        .COMPLETION
                                )
                                .build()
                        )
                    )
                    .build()
            )
            .tags(listOf("string"))
            .build()
    }

    @Test
    fun getBody() {
        val params =
            FunctionReplaceParams.builder()
                .functionData(
                    FunctionReplaceParams.FunctionData.ofPrompt(
                        FunctionReplaceParams.FunctionData.Prompt.builder()
                            .type(FunctionReplaceParams.FunctionData.Prompt.Type.PROMPT)
                            .build()
                    )
                )
                .name("name")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .slug("slug")
                .description("description")
                .promptData(
                    FunctionReplaceParams.PromptData.builder()
                        .options(
                            FunctionReplaceParams.PromptData.Options.builder()
                                .model("model")
                                .params(
                                    FunctionReplaceParams.PromptData.Options.Params
                                        .ofOpenAIModelParams(
                                            FunctionReplaceParams.PromptData.Options.Params
                                                .OpenAIModelParams
                                                .builder()
                                                .frequencyPenalty(42.23)
                                                .functionCall(
                                                    FunctionReplaceParams.PromptData.Options.Params
                                                        .OpenAIModelParams
                                                        .FunctionCall
                                                        .ofAuto(
                                                            FunctionReplaceParams.PromptData.Options
                                                                .Params
                                                                .OpenAIModelParams
                                                                .FunctionCall
                                                                .Auto
                                                                .AUTO
                                                        )
                                                )
                                                .maxTokens(42.23)
                                                .n(42.23)
                                                .presencePenalty(42.23)
                                                .responseFormat(
                                                    FunctionReplaceParams.PromptData.Options.Params
                                                        .OpenAIModelParams
                                                        .ResponseFormat
                                                        .builder()
                                                        .type(
                                                            FunctionReplaceParams.PromptData.Options
                                                                .Params
                                                                .OpenAIModelParams
                                                                .ResponseFormat
                                                                .Type
                                                                .JSON_OBJECT
                                                        )
                                                        .build()
                                                )
                                                .stop(listOf("string"))
                                                .temperature(42.23)
                                                .toolChoice(
                                                    FunctionReplaceParams.PromptData.Options.Params
                                                        .OpenAIModelParams
                                                        .ToolChoice
                                                        .ofAuto(
                                                            FunctionReplaceParams.PromptData.Options
                                                                .Params
                                                                .OpenAIModelParams
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
                            FunctionReplaceParams.PromptData.Origin.builder()
                                .projectId("project_id")
                                .promptId("prompt_id")
                                .promptVersion("prompt_version")
                                .build()
                        )
                        .prompt(
                            FunctionReplaceParams.PromptData.Prompt.ofCompletion(
                                FunctionReplaceParams.PromptData.Prompt.Completion.builder()
                                    .content("content")
                                    .type(
                                        FunctionReplaceParams.PromptData.Prompt.Completion.Type
                                            .COMPLETION
                                    )
                                    .build()
                            )
                        )
                        .build()
                )
                .tags(listOf("string"))
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.functionData())
            .isEqualTo(
                FunctionReplaceParams.FunctionData.ofPrompt(
                    FunctionReplaceParams.FunctionData.Prompt.builder()
                        .type(FunctionReplaceParams.FunctionData.Prompt.Type.PROMPT)
                        .build()
                )
            )
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.projectId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.slug()).isEqualTo("slug")
        assertThat(body.description()).isEqualTo("description")
        assertThat(body.promptData())
            .isEqualTo(
                FunctionReplaceParams.PromptData.builder()
                    .options(
                        FunctionReplaceParams.PromptData.Options.builder()
                            .model("model")
                            .params(
                                FunctionReplaceParams.PromptData.Options.Params.ofOpenAIModelParams(
                                    FunctionReplaceParams.PromptData.Options.Params
                                        .OpenAIModelParams
                                        .builder()
                                        .frequencyPenalty(42.23)
                                        .functionCall(
                                            FunctionReplaceParams.PromptData.Options.Params
                                                .OpenAIModelParams
                                                .FunctionCall
                                                .ofAuto(
                                                    FunctionReplaceParams.PromptData.Options.Params
                                                        .OpenAIModelParams
                                                        .FunctionCall
                                                        .Auto
                                                        .AUTO
                                                )
                                        )
                                        .maxTokens(42.23)
                                        .n(42.23)
                                        .presencePenalty(42.23)
                                        .responseFormat(
                                            FunctionReplaceParams.PromptData.Options.Params
                                                .OpenAIModelParams
                                                .ResponseFormat
                                                .builder()
                                                .type(
                                                    FunctionReplaceParams.PromptData.Options.Params
                                                        .OpenAIModelParams
                                                        .ResponseFormat
                                                        .Type
                                                        .JSON_OBJECT
                                                )
                                                .build()
                                        )
                                        .stop(listOf("string"))
                                        .temperature(42.23)
                                        .toolChoice(
                                            FunctionReplaceParams.PromptData.Options.Params
                                                .OpenAIModelParams
                                                .ToolChoice
                                                .ofAuto(
                                                    FunctionReplaceParams.PromptData.Options.Params
                                                        .OpenAIModelParams
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
                        FunctionReplaceParams.PromptData.Origin.builder()
                            .projectId("project_id")
                            .promptId("prompt_id")
                            .promptVersion("prompt_version")
                            .build()
                    )
                    .prompt(
                        FunctionReplaceParams.PromptData.Prompt.ofCompletion(
                            FunctionReplaceParams.PromptData.Prompt.Completion.builder()
                                .content("content")
                                .type(
                                    FunctionReplaceParams.PromptData.Prompt.Completion.Type
                                        .COMPLETION
                                )
                                .build()
                        )
                    )
                    .build()
            )
        assertThat(body.tags()).isEqualTo(listOf("string"))
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            FunctionReplaceParams.builder()
                .functionData(
                    FunctionReplaceParams.FunctionData.ofPrompt(
                        FunctionReplaceParams.FunctionData.Prompt.builder()
                            .type(FunctionReplaceParams.FunctionData.Prompt.Type.PROMPT)
                            .build()
                    )
                )
                .name("name")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .slug("slug")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.functionData())
            .isEqualTo(
                FunctionReplaceParams.FunctionData.ofPrompt(
                    FunctionReplaceParams.FunctionData.Prompt.builder()
                        .type(FunctionReplaceParams.FunctionData.Prompt.Type.PROMPT)
                        .build()
                )
            )
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.projectId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.slug()).isEqualTo("slug")
    }
}
