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
                    .name("name")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .slug("slug")
                    .description("description")
                    .promptData(
                        PromptCreateParams.PromptData.builder()
                            .options(
                                PromptCreateParams.PromptData.Options.builder()
                                    .model("model")
                                    .params(
                                        PromptCreateParams.PromptData.Options.Params
                                            .ofOpenAIModelParams(
                                                PromptCreateParams.PromptData.Options.Params
                                                    .OpenAIModelParams
                                                    .builder()
                                                    .frequencyPenalty(42.23)
                                                    .functionCall(
                                                        PromptCreateParams.PromptData.Options.Params
                                                            .OpenAIModelParams
                                                            .FunctionCall
                                                            .ofAuto(
                                                                PromptCreateParams.PromptData
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
                                                        PromptCreateParams.PromptData.Options.Params
                                                            .OpenAIModelParams
                                                            .ResponseFormat
                                                            .builder()
                                                            .type(
                                                                PromptCreateParams.PromptData
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
                                                        PromptCreateParams.PromptData.Options.Params
                                                            .OpenAIModelParams
                                                            .ToolChoice
                                                            .ofAuto(
                                                                PromptCreateParams.PromptData
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
                                PromptCreateParams.PromptData.Origin.builder()
                                    .projectId("project_id")
                                    .promptId("prompt_id")
                                    .promptVersion("prompt_version")
                                    .build()
                            )
                            .prompt(
                                PromptCreateParams.PromptData.Prompt.ofCompletion(
                                    PromptCreateParams.PromptData.Prompt.Completion.builder()
                                        .content("content")
                                        .type(
                                            PromptCreateParams.PromptData.Prompt.Completion.Type
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
                        PromptUpdateParams.PromptData.builder()
                            .options(
                                PromptUpdateParams.PromptData.Options.builder()
                                    .model("model")
                                    .params(
                                        PromptUpdateParams.PromptData.Options.Params
                                            .ofOpenAIModelParams(
                                                PromptUpdateParams.PromptData.Options.Params
                                                    .OpenAIModelParams
                                                    .builder()
                                                    .frequencyPenalty(42.23)
                                                    .functionCall(
                                                        PromptUpdateParams.PromptData.Options.Params
                                                            .OpenAIModelParams
                                                            .FunctionCall
                                                            .ofAuto(
                                                                PromptUpdateParams.PromptData
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
                                                        PromptUpdateParams.PromptData.Options.Params
                                                            .OpenAIModelParams
                                                            .ResponseFormat
                                                            .builder()
                                                            .type(
                                                                PromptUpdateParams.PromptData
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
                                                        PromptUpdateParams.PromptData.Options.Params
                                                            .OpenAIModelParams
                                                            .ToolChoice
                                                            .ofAuto(
                                                                PromptUpdateParams.PromptData
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
                                PromptUpdateParams.PromptData.Origin.builder()
                                    .projectId("project_id")
                                    .promptId("prompt_id")
                                    .promptVersion("prompt_version")
                                    .build()
                            )
                            .prompt(
                                PromptUpdateParams.PromptData.Prompt.ofCompletion(
                                    PromptUpdateParams.PromptData.Prompt.Completion.builder()
                                        .content("content")
                                        .type(
                                            PromptUpdateParams.PromptData.Prompt.Completion.Type
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
                    .name("name")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .slug("slug")
                    .description("description")
                    .promptData(
                        PromptReplaceParams.PromptData.builder()
                            .options(
                                PromptReplaceParams.PromptData.Options.builder()
                                    .model("model")
                                    .params(
                                        PromptReplaceParams.PromptData.Options.Params
                                            .ofOpenAIModelParams(
                                                PromptReplaceParams.PromptData.Options.Params
                                                    .OpenAIModelParams
                                                    .builder()
                                                    .frequencyPenalty(42.23)
                                                    .functionCall(
                                                        PromptReplaceParams.PromptData.Options
                                                            .Params
                                                            .OpenAIModelParams
                                                            .FunctionCall
                                                            .ofAuto(
                                                                PromptReplaceParams.PromptData
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
                                                        PromptReplaceParams.PromptData.Options
                                                            .Params
                                                            .OpenAIModelParams
                                                            .ResponseFormat
                                                            .builder()
                                                            .type(
                                                                PromptReplaceParams.PromptData
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
                                                        PromptReplaceParams.PromptData.Options
                                                            .Params
                                                            .OpenAIModelParams
                                                            .ToolChoice
                                                            .ofAuto(
                                                                PromptReplaceParams.PromptData
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
                                PromptReplaceParams.PromptData.Origin.builder()
                                    .projectId("project_id")
                                    .promptId("prompt_id")
                                    .promptVersion("prompt_version")
                                    .build()
                            )
                            .prompt(
                                PromptReplaceParams.PromptData.Prompt.ofCompletion(
                                    PromptReplaceParams.PromptData.Prompt.Completion.builder()
                                        .content("content")
                                        .type(
                                            PromptReplaceParams.PromptData.Prompt.Completion.Type
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
        println(prompt)
        prompt.validate()
    }
}
