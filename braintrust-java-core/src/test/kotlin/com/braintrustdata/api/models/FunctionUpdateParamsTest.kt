// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.JsonValue
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FunctionUpdateParamsTest {

    @Test
    fun create() {
        FunctionUpdateParams.builder()
            .functionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .description("description")
            .functionData(
                FunctionUpdateParams.FunctionData.Prompt.builder()
                    .type(FunctionUpdateParams.FunctionData.Prompt.Type.PROMPT)
                    .build()
            )
            .name("name")
            .promptData(
                PromptData.builder()
                    .options(
                        PromptOptions.builder()
                            .model("model")
                            .params(
                                PromptOptions.Params.OpenAIModelParams.builder()
                                    .frequencyPenalty(0.0)
                                    .functionCall(
                                        PromptOptions.Params.OpenAIModelParams.FunctionCall
                                            .UnionMember0
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
                                        PromptOptions.Params.OpenAIModelParams.ResponseFormat
                                            .JsonObject
                                            .builder()
                                            .type(
                                                PromptOptions.Params.OpenAIModelParams
                                                    .ResponseFormat
                                                    .JsonObject
                                                    .Type
                                                    .JSON_OBJECT
                                            )
                                            .build()
                                    )
                                    .addStop("string")
                                    .temperature(0.0)
                                    .toolChoice(
                                        PromptOptions.Params.OpenAIModelParams.ToolChoice
                                            .UnionMember0
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
            )
            .addTag("string")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            FunctionUpdateParams.builder()
                .functionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            FunctionUpdateParams.builder()
                .functionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .description("description")
                .functionData(
                    FunctionUpdateParams.FunctionData.Prompt.builder()
                        .type(FunctionUpdateParams.FunctionData.Prompt.Type.PROMPT)
                        .build()
                )
                .name("name")
                .promptData(
                    PromptData.builder()
                        .options(
                            PromptOptions.builder()
                                .model("model")
                                .params(
                                    PromptOptions.Params.OpenAIModelParams.builder()
                                        .frequencyPenalty(0.0)
                                        .functionCall(
                                            PromptOptions.Params.OpenAIModelParams.FunctionCall
                                                .UnionMember0
                                                .AUTO
                                        )
                                        .maxCompletionTokens(0.0)
                                        .maxTokens(0.0)
                                        .n(0.0)
                                        .presencePenalty(0.0)
                                        .reasoningEffort(
                                            PromptOptions.Params.OpenAIModelParams.ReasoningEffort
                                                .LOW
                                        )
                                        .responseFormat(
                                            PromptOptions.Params.OpenAIModelParams.ResponseFormat
                                                .JsonObject
                                                .builder()
                                                .type(
                                                    PromptOptions.Params.OpenAIModelParams
                                                        .ResponseFormat
                                                        .JsonObject
                                                        .Type
                                                        .JSON_OBJECT
                                                )
                                                .build()
                                        )
                                        .addStop("string")
                                        .temperature(0.0)
                                        .toolChoice(
                                            PromptOptions.Params.OpenAIModelParams.ToolChoice
                                                .UnionMember0
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
                )
                .addTag("string")
                .build()

        val body = params._body()

        assertThat(body.description()).contains("description")
        assertThat(body.functionData())
            .contains(
                FunctionUpdateParams.FunctionData.ofPrompt(
                    FunctionUpdateParams.FunctionData.Prompt.builder()
                        .type(FunctionUpdateParams.FunctionData.Prompt.Type.PROMPT)
                        .build()
                )
            )
        assertThat(body.name()).contains("name")
        assertThat(body.promptData())
            .contains(
                PromptData.builder()
                    .options(
                        PromptOptions.builder()
                            .model("model")
                            .params(
                                PromptOptions.Params.OpenAIModelParams.builder()
                                    .frequencyPenalty(0.0)
                                    .functionCall(
                                        PromptOptions.Params.OpenAIModelParams.FunctionCall
                                            .UnionMember0
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
                                        PromptOptions.Params.OpenAIModelParams.ResponseFormat
                                            .JsonObject
                                            .builder()
                                            .type(
                                                PromptOptions.Params.OpenAIModelParams
                                                    .ResponseFormat
                                                    .JsonObject
                                                    .Type
                                                    .JSON_OBJECT
                                            )
                                            .build()
                                    )
                                    .addStop("string")
                                    .temperature(0.0)
                                    .toolChoice(
                                        PromptOptions.Params.OpenAIModelParams.ToolChoice
                                            .UnionMember0
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
            )
        assertThat(body.tags().getOrNull()).containsExactly("string")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            FunctionUpdateParams.builder()
                .functionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val body = params._body()
    }
}
