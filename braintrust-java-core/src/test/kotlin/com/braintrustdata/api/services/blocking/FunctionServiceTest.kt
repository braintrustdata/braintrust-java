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
        val functionService = client.function()
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
                    .functionType(FunctionCreateParams.FunctionType.TASK)
                    .origin(
                        FunctionCreateParams.Origin.builder()
                            .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .objectType(FunctionCreateParams.Origin.ObjectType.ORGANIZATION)
                            .internal_(true)
                            .build()
                    )
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
                                                            PromptData.Options.Params
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
                                                    PromptData.Options.Params.OpenAIModelParams
                                                        .ResponseFormat
                                                        .builder()
                                                        .type(
                                                            PromptData.Options.Params
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
                                                    PromptData.Options.Params.OpenAIModelParams
                                                        .ToolChoice
                                                        .ofAuto(
                                                            PromptData.Options.Params
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
        val functionService = client.function()
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
        val functionService = client.function()
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
                                                            PromptData.Options.Params
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
                                                    PromptData.Options.Params.OpenAIModelParams
                                                        .ResponseFormat
                                                        .builder()
                                                        .type(
                                                            PromptData.Options.Params
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
                                                    PromptData.Options.Params.OpenAIModelParams
                                                        .ToolChoice
                                                        .ofAuto(
                                                            PromptData.Options.Params
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
        val functionService = client.function()
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
        val functionService = client.function()
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
        val functionService = client.function()
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
                    .functionType(FunctionReplaceParams.FunctionType.TASK)
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
                                                            PromptData.Options.Params
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
                                                    PromptData.Options.Params.OpenAIModelParams
                                                        .ResponseFormat
                                                        .builder()
                                                        .type(
                                                            PromptData.Options.Params
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
                                                    PromptData.Options.Params.OpenAIModelParams
                                                        .ToolChoice
                                                        .ofAuto(
                                                            PromptData.Options.Params
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
                            .build()
                    )
                    .tags(listOf("string"))
                    .build()
            )
        println(function)
        function.validate()
    }
}
