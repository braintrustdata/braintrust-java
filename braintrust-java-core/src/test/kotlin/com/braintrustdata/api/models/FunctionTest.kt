// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FunctionTest {

    @Test
    fun create() {
        val function =
            Function.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                ._xactId("_xact_id")
                .functionData(
                    Function.FunctionData.Prompt.builder()
                        .type(Function.FunctionData.Prompt.Type.PROMPT)
                        .build()
                )
                .logId(Function.LogId.P)
                .name("name")
                .orgId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .slug("slug")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .functionSchema(
                    Function.FunctionSchema.builder()
                        .parameters(JsonValue.from(mapOf<String, Any>()))
                        .returns(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .functionType(Function.FunctionType.LLM)
                .metadata(
                    Function.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .origin(
                    Function.Origin.builder()
                        .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .objectType(AclObjectType.ORGANIZATION)
                        .internal_(true)
                        .build()
                )
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

        assertThat(function.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(function._xactId()).isEqualTo("_xact_id")
        assertThat(function.functionData())
            .isEqualTo(
                Function.FunctionData.ofPrompt(
                    Function.FunctionData.Prompt.builder()
                        .type(Function.FunctionData.Prompt.Type.PROMPT)
                        .build()
                )
            )
        assertThat(function.logId()).isEqualTo(Function.LogId.P)
        assertThat(function.name()).isEqualTo("name")
        assertThat(function.orgId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(function.projectId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(function.slug()).isEqualTo("slug")
        assertThat(function.created()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(function.description()).contains("description")
        assertThat(function.functionSchema())
            .contains(
                Function.FunctionSchema.builder()
                    .parameters(JsonValue.from(mapOf<String, Any>()))
                    .returns(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
        assertThat(function.functionType()).contains(Function.FunctionType.LLM)
        assertThat(function.metadata())
            .contains(
                Function.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(function.origin())
            .contains(
                Function.Origin.builder()
                    .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .objectType(AclObjectType.ORGANIZATION)
                    .internal_(true)
                    .build()
            )
        assertThat(function.promptData())
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
        assertThat(function.tags().getOrNull()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val function =
            Function.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                ._xactId("_xact_id")
                .functionData(
                    Function.FunctionData.Prompt.builder()
                        .type(Function.FunctionData.Prompt.Type.PROMPT)
                        .build()
                )
                .logId(Function.LogId.P)
                .name("name")
                .orgId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .slug("slug")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .functionSchema(
                    Function.FunctionSchema.builder()
                        .parameters(JsonValue.from(mapOf<String, Any>()))
                        .returns(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .functionType(Function.FunctionType.LLM)
                .metadata(
                    Function.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .origin(
                    Function.Origin.builder()
                        .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .objectType(AclObjectType.ORGANIZATION)
                        .internal_(true)
                        .build()
                )
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

        val roundtrippedFunction =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(function),
                jacksonTypeRef<Function>(),
            )

        assertThat(roundtrippedFunction).isEqualTo(function)
    }
}
