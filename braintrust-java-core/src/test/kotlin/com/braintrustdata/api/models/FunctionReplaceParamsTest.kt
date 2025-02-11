// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class FunctionReplaceParamsTest {

    @Test
    fun create() {
        FunctionReplaceParams.builder()
            .functionData(
                FunctionReplaceParams.FunctionData.Prompt.builder()
                    .type(FunctionReplaceParams.FunctionData.Prompt.Type.PROMPT)
                    .build()
            )
            .name("x")
            .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .slug("x")
            .description("description")
            .functionSchema(
                FunctionReplaceParams.FunctionSchema.builder()
                    .parameters(JsonValue.from(mapOf<String, Any>()))
                    .returns(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
            .functionType(FunctionReplaceParams.FunctionType.LLM)
            .origin(
                FunctionReplaceParams.Origin.builder()
                    .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .objectType(FunctionReplaceParams.Origin.ObjectType.ORGANIZATION)
                    .internal_(true)
                    .build()
            )
            .promptData(
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
            )
            .addTag("string")
            .build()
    }

    @Test
    fun body() {
        val params =
            FunctionReplaceParams.builder()
                .functionData(
                    FunctionReplaceParams.FunctionData.Prompt.builder()
                        .type(FunctionReplaceParams.FunctionData.Prompt.Type.PROMPT)
                        .build()
                )
                .name("x")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .slug("x")
                .description("description")
                .functionSchema(
                    FunctionReplaceParams.FunctionSchema.builder()
                        .parameters(JsonValue.from(mapOf<String, Any>()))
                        .returns(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .functionType(FunctionReplaceParams.FunctionType.LLM)
                .origin(
                    FunctionReplaceParams.Origin.builder()
                        .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .objectType(FunctionReplaceParams.Origin.ObjectType.ORGANIZATION)
                        .internal_(true)
                        .build()
                )
                .promptData(
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
                )
                .addTag("string")
                .build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.functionData())
            .isEqualTo(
                FunctionReplaceParams.FunctionData.ofPrompt(
                    FunctionReplaceParams.FunctionData.Prompt.builder()
                        .type(FunctionReplaceParams.FunctionData.Prompt.Type.PROMPT)
                        .build()
                )
            )
        assertThat(body.name()).isEqualTo("x")
        assertThat(body.projectId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.slug()).isEqualTo("x")
        assertThat(body.description()).contains("description")
        assertThat(body.functionSchema())
            .contains(
                FunctionReplaceParams.FunctionSchema.builder()
                    .parameters(JsonValue.from(mapOf<String, Any>()))
                    .returns(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
        assertThat(body.functionType()).contains(FunctionReplaceParams.FunctionType.LLM)
        assertThat(body.origin())
            .contains(
                FunctionReplaceParams.Origin.builder()
                    .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .objectType(FunctionReplaceParams.Origin.ObjectType.ORGANIZATION)
                    .internal_(true)
                    .build()
            )
        assertThat(body.promptData())
            .contains(
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
            )
        assertThat(body.tags()).contains(listOf("string"))
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            FunctionReplaceParams.builder()
                .functionData(
                    FunctionReplaceParams.FunctionData.Prompt.builder()
                        .type(FunctionReplaceParams.FunctionData.Prompt.Type.PROMPT)
                        .build()
                )
                .name("x")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .slug("x")
                .build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.functionData())
            .isEqualTo(
                FunctionReplaceParams.FunctionData.ofPrompt(
                    FunctionReplaceParams.FunctionData.Prompt.builder()
                        .type(FunctionReplaceParams.FunctionData.Prompt.Type.PROMPT)
                        .build()
                )
            )
        assertThat(body.name()).isEqualTo("x")
        assertThat(body.projectId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.slug()).isEqualTo("x")
    }
}
