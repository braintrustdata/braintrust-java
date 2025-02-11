// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PromptDataTest {

    @Test
    fun createPromptData() {
        val promptData =
            PromptData.builder()
                .options(
                    PromptOptions.builder()
                        .model("model")
                        .params(
                            PromptOptions.Params.AnthropicModelParams.builder()
                                .maxTokens(0.0)
                                .temperature(0.0)
                                .topP(0.0)
                                .useCache(true)
                                .build()
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
                .parser(
                    PromptData.Parser.builder()
                        .choiceScores(
                            PromptData.Parser.ChoiceScores.builder()
                                .putAdditionalProperty("foo", JsonValue.from(0))
                                .build()
                        )
                        .type(PromptData.Parser.Type.LLM_CLASSIFIER)
                        .useCot(true)
                        .build()
                )
                .prompt(
                    PromptData.Prompt.Completion.builder()
                        .content("content")
                        .type(PromptData.Prompt.Completion.Type.COMPLETION)
                        .build()
                )
                .addToolFunction(
                    PromptData.ToolFunction.Function.builder()
                        .id("id")
                        .type(PromptData.ToolFunction.Function.Type.FUNCTION)
                        .build()
                )
                .build()
        assertThat(promptData).isNotNull
        assertThat(promptData.options())
            .contains(
                PromptOptions.builder()
                    .model("model")
                    .params(
                        PromptOptions.Params.AnthropicModelParams.builder()
                            .maxTokens(0.0)
                            .temperature(0.0)
                            .topP(0.0)
                            .useCache(true)
                            .build()
                    )
                    .position("position")
                    .build()
            )
        assertThat(promptData.origin())
            .contains(
                PromptData.Origin.builder()
                    .projectId("project_id")
                    .promptId("prompt_id")
                    .promptVersion("prompt_version")
                    .build()
            )
        assertThat(promptData.parser())
            .contains(
                PromptData.Parser.builder()
                    .choiceScores(
                        PromptData.Parser.ChoiceScores.builder()
                            .putAdditionalProperty("foo", JsonValue.from(0))
                            .build()
                    )
                    .type(PromptData.Parser.Type.LLM_CLASSIFIER)
                    .useCot(true)
                    .build()
            )
        assertThat(promptData.prompt())
            .contains(
                PromptData.Prompt.ofCompletion(
                    PromptData.Prompt.Completion.builder()
                        .content("content")
                        .type(PromptData.Prompt.Completion.Type.COMPLETION)
                        .build()
                )
            )
        assertThat(promptData.toolFunctions().get())
            .containsExactly(
                PromptData.ToolFunction.ofFunction(
                    PromptData.ToolFunction.Function.builder()
                        .id("id")
                        .type(PromptData.ToolFunction.Function.Type.FUNCTION)
                        .build()
                )
            )
    }
}
