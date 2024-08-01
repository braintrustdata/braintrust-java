// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.services.blocking

import com.braintrustdata.api.TestServerExtension
import com.braintrustdata.api.client.okhttp.BraintrustOkHttpClient
import com.braintrustdata.api.models.*
import com.braintrustdata.api.models.FunctionListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class FunctionServiceTest {

    @Test
    fun callCreate() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val functionService = client.functions()
        val function =
            functionService.create(
                FunctionCreateParams.builder()
                    .functionData(
                        FunctionCreateParams.FunctionData.ofPrompt(
                            FunctionCreateParams.FunctionData.Prompt.builder()
                                .type(FunctionCreateParams.FunctionData.Prompt.Type.PROMPT)
                                .build()
                        )
                    )
                    .name("name")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .slug("slug")
                    .description("description")
                    .promptData(
                        FunctionCreateParams.PromptData.builder()
                            .options(
                                FunctionCreateParams.PromptData.Options.builder()
                                    .model("model")
                                    .params(
                                        FunctionCreateParams.PromptData.Options.Params
                                            .ofOpenAIModelParams(
                                                FunctionCreateParams.PromptData.Options.Params
                                                    .OpenAIModelParams
                                                    .builder()
                                                    .frequencyPenalty(42.23)
                                                    .functionCall(
                                                        FunctionCreateParams.PromptData.Options
                                                            .Params
                                                            .OpenAIModelParams
                                                            .FunctionCall
                                                            .ofAuto(
                                                                FunctionCreateParams.PromptData
                                                                    .Options
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
                                                        FunctionCreateParams.PromptData.Options
                                                            .Params
                                                            .OpenAIModelParams
                                                            .ResponseFormat
                                                            .builder()
                                                            .type(
                                                                FunctionCreateParams.PromptData
                                                                    .Options
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
                                                        FunctionCreateParams.PromptData.Options
                                                            .Params
                                                            .OpenAIModelParams
                                                            .ToolChoice
                                                            .ofAuto(
                                                                FunctionCreateParams.PromptData
                                                                    .Options
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
                                FunctionCreateParams.PromptData.Origin.builder()
                                    .projectId("project_id")
                                    .promptId("prompt_id")
                                    .promptVersion("prompt_version")
                                    .build()
                            )
                            .prompt(
                                FunctionCreateParams.PromptData.Prompt.ofCompletion(
                                    FunctionCreateParams.PromptData.Prompt.Completion.builder()
                                        .content("content")
                                        .type(
                                            FunctionCreateParams.PromptData.Prompt.Completion.Type
                                                .COMPLETION
                                        )
                                        .build()
                                )
                            )
                            .build()
                    )
                    .tags(listOf("string"))
                    .build()
            )
        println(function)
        function.validate()
    }

    @Test
    fun callRetrieve() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val functionService = client.functions()
        val function =
            functionService.retrieve(
                FunctionRetrieveParams.builder()
                    .functionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        println(function)
        function.validate()
    }

    @Test
    fun callUpdate() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val functionService = client.functions()
        val function =
            functionService.update(
                FunctionUpdateParams.builder()
                    .functionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .description("description")
                    .functionData(
                        FunctionUpdateParams.FunctionData.ofPrompt(
                            FunctionUpdateParams.FunctionData.Prompt.builder()
                                .type(FunctionUpdateParams.FunctionData.Prompt.Type.PROMPT)
                                .build()
                        )
                    )
                    .name("name")
                    .promptData(
                        FunctionUpdateParams.PromptData.builder()
                            .options(
                                FunctionUpdateParams.PromptData.Options.builder()
                                    .model("model")
                                    .params(
                                        FunctionUpdateParams.PromptData.Options.Params
                                            .ofOpenAIModelParams(
                                                FunctionUpdateParams.PromptData.Options.Params
                                                    .OpenAIModelParams
                                                    .builder()
                                                    .frequencyPenalty(42.23)
                                                    .functionCall(
                                                        FunctionUpdateParams.PromptData.Options
                                                            .Params
                                                            .OpenAIModelParams
                                                            .FunctionCall
                                                            .ofAuto(
                                                                FunctionUpdateParams.PromptData
                                                                    .Options
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
                                                        FunctionUpdateParams.PromptData.Options
                                                            .Params
                                                            .OpenAIModelParams
                                                            .ResponseFormat
                                                            .builder()
                                                            .type(
                                                                FunctionUpdateParams.PromptData
                                                                    .Options
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
                                                        FunctionUpdateParams.PromptData.Options
                                                            .Params
                                                            .OpenAIModelParams
                                                            .ToolChoice
                                                            .ofAuto(
                                                                FunctionUpdateParams.PromptData
                                                                    .Options
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
                                FunctionUpdateParams.PromptData.Origin.builder()
                                    .projectId("project_id")
                                    .promptId("prompt_id")
                                    .promptVersion("prompt_version")
                                    .build()
                            )
                            .prompt(
                                FunctionUpdateParams.PromptData.Prompt.ofCompletion(
                                    FunctionUpdateParams.PromptData.Prompt.Completion.builder()
                                        .content("content")
                                        .type(
                                            FunctionUpdateParams.PromptData.Prompt.Completion.Type
                                                .COMPLETION
                                        )
                                        .build()
                                )
                            )
                            .build()
                    )
                    .tags(listOf("string"))
                    .build()
            )
        println(function)
        function.validate()
    }

    @Test
    fun callList() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val functionService = client.functions()
        val response = functionService.list(FunctionListParams.builder().build())
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
        val functionService = client.functions()
        val function =
            functionService.delete(
                FunctionDeleteParams.builder()
                    .functionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        println(function)
        function.validate()
    }

    @Test
    fun callReplace() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val functionService = client.functions()
        val function =
            functionService.replace(
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
                                                        FunctionReplaceParams.PromptData.Options
                                                            .Params
                                                            .OpenAIModelParams
                                                            .FunctionCall
                                                            .ofAuto(
                                                                FunctionReplaceParams.PromptData
                                                                    .Options
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
                                                        FunctionReplaceParams.PromptData.Options
                                                            .Params
                                                            .OpenAIModelParams
                                                            .ResponseFormat
                                                            .builder()
                                                            .type(
                                                                FunctionReplaceParams.PromptData
                                                                    .Options
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
                                                        FunctionReplaceParams.PromptData.Options
                                                            .Params
                                                            .OpenAIModelParams
                                                            .ToolChoice
                                                            .ofAuto(
                                                                FunctionReplaceParams.PromptData
                                                                    .Options
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
            )
        println(function)
        function.validate()
    }
}
