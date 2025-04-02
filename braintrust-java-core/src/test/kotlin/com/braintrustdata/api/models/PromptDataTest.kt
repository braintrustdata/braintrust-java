// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PromptDataTest {

    @Test
    fun create() {
        val promptData =
            PromptData.builder()
                .options(
                    PromptOptions.builder()
                        .model("model")
                        .params(
                            PromptOptions.Params.OpenAIModelParams.builder()
                                .frequencyPenalty(0.0)
                                .functionCall(
                                    PromptOptions.Params.OpenAIModelParams.FunctionCall.UnionMember0
                                        .AUTO
                                )
                                .maxCompletionTokens(0.0)
                                .maxTokens(0.0)
                                .n(0.0)
                                .presencePenalty(0.0)
                                .reasoningEffort(
                                    PromptOptions.Params.OpenAIModelParams.ReasoningEffort.LOW
                                )
                                .responseFormat(
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
                                .addStop("string")
                                .temperature(0.0)
                                .toolChoice(
                                    PromptOptions.Params.OpenAIModelParams.ToolChoice.UnionMember0
                                        .AUTO
                                )
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

        assertThat(promptData.options())
            .contains(
                PromptOptions.builder()
                    .model("model")
                    .params(
                        PromptOptions.Params.OpenAIModelParams.builder()
                            .frequencyPenalty(0.0)
                            .functionCall(
                                PromptOptions.Params.OpenAIModelParams.FunctionCall.UnionMember0
                                    .AUTO
                            )
                            .maxCompletionTokens(0.0)
                            .maxTokens(0.0)
                            .n(0.0)
                            .presencePenalty(0.0)
                            .reasoningEffort(
                                PromptOptions.Params.OpenAIModelParams.ReasoningEffort.LOW
                            )
                            .responseFormat(
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
        assertThat(promptData.toolFunctions().getOrNull())
            .containsExactly(
                PromptData.ToolFunction.ofFunction(
                    PromptData.ToolFunction.Function.builder()
                        .id("id")
                        .type(PromptData.ToolFunction.Function.Type.FUNCTION)
                        .build()
                )
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val promptData =
            PromptData.builder()
                .options(
                    PromptOptions.builder()
                        .model("model")
                        .params(
                            PromptOptions.Params.OpenAIModelParams.builder()
                                .frequencyPenalty(0.0)
                                .functionCall(
                                    PromptOptions.Params.OpenAIModelParams.FunctionCall.UnionMember0
                                        .AUTO
                                )
                                .maxCompletionTokens(0.0)
                                .maxTokens(0.0)
                                .n(0.0)
                                .presencePenalty(0.0)
                                .reasoningEffort(
                                    PromptOptions.Params.OpenAIModelParams.ReasoningEffort.LOW
                                )
                                .responseFormat(
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
                                .addStop("string")
                                .temperature(0.0)
                                .toolChoice(
                                    PromptOptions.Params.OpenAIModelParams.ToolChoice.UnionMember0
                                        .AUTO
                                )
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

        val roundtrippedPromptData =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(promptData),
                jacksonTypeRef<PromptData>(),
            )

        assertThat(roundtrippedPromptData).isEqualTo(promptData)
    }
}
