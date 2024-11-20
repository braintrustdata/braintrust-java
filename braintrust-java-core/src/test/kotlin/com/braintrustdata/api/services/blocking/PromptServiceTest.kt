// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.services.blocking

import com.braintrustdata.api.TestServerExtension
import com.braintrustdata.api.client.okhttp.BraintrustOkHttpClient
import com.braintrustdata.api.models.*
import com.braintrustdata.api.models.PromptListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class PromptServiceTest {

    @Test
    fun callCreate() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val promptService = client.prompts()
        val prompt =
            promptService.create(
                PromptCreateParams.builder()
                    .name("x")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .slug("x")
                    .description("description")
                    .functionType(PromptCreateParams.FunctionType.LLM)
                    .promptData(
                        PromptData.builder()
                            .options(
                                PromptOptions.builder()
                                    .model("model")
                                    .params(
                                        PromptOptions.Params.ofOpenAIModelParams(
                                            PromptOptions.Params.OpenAIModelParams.builder()
                                                .frequencyPenalty(42.23)
                                                .functionCall(
                                                    PromptOptions.Params.OpenAIModelParams
                                                        .FunctionCall
                                                        .ofAuto(
                                                            PromptOptions.Params.OpenAIModelParams
                                                                .FunctionCall
                                                                .Auto
                                                                .AUTO
                                                        )
                                                )
                                                .maxTokens(42.23)
                                                .n(42.23)
                                                .presencePenalty(42.23)
                                                .responseFormat(
                                                    PromptOptions.Params.OpenAIModelParams
                                                        .ResponseFormat
                                                        .ofJsonObject(
                                                            PromptOptions.Params.OpenAIModelParams
                                                                .ResponseFormat
                                                                .JsonObject
                                                                .builder()
                                                                .type(
                                                                    PromptOptions.Params
                                                                        .OpenAIModelParams
                                                                        .ResponseFormat
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
                                                    PromptOptions.Params.OpenAIModelParams
                                                        .ToolChoice
                                                        .ofAuto(
                                                            PromptOptions.Params.OpenAIModelParams
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
                            .parser(
                                PromptData.Parser.builder()
                                    .choiceScores(PromptData.Parser.ChoiceScores.builder().build())
                                    .type(PromptData.Parser.Type.LLM_CLASSIFIER)
                                    .useCot(true)
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
                            .toolFunctions(
                                listOf(
                                    PromptData.ToolFunction.ofFunction(
                                        PromptData.ToolFunction.Function.builder()
                                            .id("id")
                                            .type(PromptData.ToolFunction.Function.Type.FUNCTION)
                                            .build()
                                    )
                                )
                            )
                            .build()
                    )
                    .tags(listOf("string"))
                    .build()
            )
        println(prompt)
        prompt.validate()
    }

    @Test
    fun callRetrieve() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val promptService = client.prompts()
        val prompt =
            promptService.retrieve(
                PromptRetrieveParams.builder()
                    .promptId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        println(prompt)
        prompt.validate()
    }

    @Test
    fun callUpdate() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val promptService = client.prompts()
        val prompt =
            promptService.update(
                PromptUpdateParams.builder()
                    .promptId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .description("description")
                    .name("name")
                    .promptData(
                        PromptData.builder()
                            .options(
                                PromptOptions.builder()
                                    .model("model")
                                    .params(
                                        PromptOptions.Params.ofOpenAIModelParams(
                                            PromptOptions.Params.OpenAIModelParams.builder()
                                                .frequencyPenalty(42.23)
                                                .functionCall(
                                                    PromptOptions.Params.OpenAIModelParams
                                                        .FunctionCall
                                                        .ofAuto(
                                                            PromptOptions.Params.OpenAIModelParams
                                                                .FunctionCall
                                                                .Auto
                                                                .AUTO
                                                        )
                                                )
                                                .maxTokens(42.23)
                                                .n(42.23)
                                                .presencePenalty(42.23)
                                                .responseFormat(
                                                    PromptOptions.Params.OpenAIModelParams
                                                        .ResponseFormat
                                                        .ofJsonObject(
                                                            PromptOptions.Params.OpenAIModelParams
                                                                .ResponseFormat
                                                                .JsonObject
                                                                .builder()
                                                                .type(
                                                                    PromptOptions.Params
                                                                        .OpenAIModelParams
                                                                        .ResponseFormat
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
                                                    PromptOptions.Params.OpenAIModelParams
                                                        .ToolChoice
                                                        .ofAuto(
                                                            PromptOptions.Params.OpenAIModelParams
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
                            .parser(
                                PromptData.Parser.builder()
                                    .choiceScores(PromptData.Parser.ChoiceScores.builder().build())
                                    .type(PromptData.Parser.Type.LLM_CLASSIFIER)
                                    .useCot(true)
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
                            .toolFunctions(
                                listOf(
                                    PromptData.ToolFunction.ofFunction(
                                        PromptData.ToolFunction.Function.builder()
                                            .id("id")
                                            .type(PromptData.ToolFunction.Function.Type.FUNCTION)
                                            .build()
                                    )
                                )
                            )
                            .build()
                    )
                    .slug("slug")
                    .tags(listOf("string"))
                    .build()
            )
        println(prompt)
        prompt.validate()
    }

    @Test
    fun callList() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val promptService = client.prompts()
        val response = promptService.list(PromptListParams.builder().build())
        println(response)
        response.objects().forEach { it.validate() }
    }

    @Test
    fun callDelete() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val promptService = client.prompts()
        val prompt =
            promptService.delete(
                PromptDeleteParams.builder()
                    .promptId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        println(prompt)
        prompt.validate()
    }

    @Test
    fun callReplace() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val promptService = client.prompts()
        val prompt =
            promptService.replace(
                PromptReplaceParams.builder()
                    .name("x")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .slug("x")
                    .description("description")
                    .functionType(PromptReplaceParams.FunctionType.LLM)
                    .promptData(
                        PromptData.builder()
                            .options(
                                PromptOptions.builder()
                                    .model("model")
                                    .params(
                                        PromptOptions.Params.ofOpenAIModelParams(
                                            PromptOptions.Params.OpenAIModelParams.builder()
                                                .frequencyPenalty(42.23)
                                                .functionCall(
                                                    PromptOptions.Params.OpenAIModelParams
                                                        .FunctionCall
                                                        .ofAuto(
                                                            PromptOptions.Params.OpenAIModelParams
                                                                .FunctionCall
                                                                .Auto
                                                                .AUTO
                                                        )
                                                )
                                                .maxTokens(42.23)
                                                .n(42.23)
                                                .presencePenalty(42.23)
                                                .responseFormat(
                                                    PromptOptions.Params.OpenAIModelParams
                                                        .ResponseFormat
                                                        .ofJsonObject(
                                                            PromptOptions.Params.OpenAIModelParams
                                                                .ResponseFormat
                                                                .JsonObject
                                                                .builder()
                                                                .type(
                                                                    PromptOptions.Params
                                                                        .OpenAIModelParams
                                                                        .ResponseFormat
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
                                                    PromptOptions.Params.OpenAIModelParams
                                                        .ToolChoice
                                                        .ofAuto(
                                                            PromptOptions.Params.OpenAIModelParams
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
                            .parser(
                                PromptData.Parser.builder()
                                    .choiceScores(PromptData.Parser.ChoiceScores.builder().build())
                                    .type(PromptData.Parser.Type.LLM_CLASSIFIER)
                                    .useCot(true)
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
                            .toolFunctions(
                                listOf(
                                    PromptData.ToolFunction.ofFunction(
                                        PromptData.ToolFunction.Function.builder()
                                            .id("id")
                                            .type(PromptData.ToolFunction.Function.Type.FUNCTION)
                                            .build()
                                    )
                                )
                            )
                            .build()
                    )
                    .tags(listOf("string"))
                    .build()
            )
        println(prompt)
        prompt.validate()
    }
}
