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
        val promptService = client.prompt()
        val prompt =
            promptService.create(
                PromptCreateParams.builder()
                    .name("string")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .slug("string")
                    .description("string")
                    .promptData(
                        PromptCreateParams.PromptData.builder()
                            .options(
                                PromptCreateParams.PromptData.Options.builder()
                                    .model("string")
                                    .params(
                                        PromptCreateParams.PromptData.Options.Params.ofUnionMember0(
                                            PromptCreateParams.PromptData.Options.Params
                                                .UnionMember0
                                                .builder()
                                                .frequencyPenalty(42.23)
                                                .functionCall(
                                                    PromptCreateParams.PromptData.Options.Params
                                                        .UnionMember0
                                                        .FunctionCall
                                                        .ofUnionMember0(
                                                            PromptCreateParams.PromptData.Options
                                                                .Params
                                                                .UnionMember0
                                                                .FunctionCall
                                                                .UnionMember0
                                                                .AUTO
                                                        )
                                                )
                                                .maxTokens(42.23)
                                                .n(42.23)
                                                .presencePenalty(42.23)
                                                .responseFormat(
                                                    PromptCreateParams.PromptData.Options.Params
                                                        .UnionMember0
                                                        .ResponseFormat
                                                        .builder()
                                                        .type(
                                                            PromptCreateParams.PromptData.Options
                                                                .Params
                                                                .UnionMember0
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
                                                        .UnionMember0
                                                        .ToolChoice
                                                        .ofUnionMember0(
                                                            PromptCreateParams.PromptData.Options
                                                                .Params
                                                                .UnionMember0
                                                                .ToolChoice
                                                                .UnionMember0
                                                                .AUTO
                                                        )
                                                )
                                                .topP(42.23)
                                                .useCache(true)
                                                .build()
                                        )
                                    )
                                    .position("string")
                                    .build()
                            )
                            .origin(
                                PromptCreateParams.PromptData.Origin.builder()
                                    .projectId("string")
                                    .promptId("string")
                                    .promptVersion("string")
                                    .build()
                            )
                            .prompt(
                                PromptCreateParams.PromptData.Prompt.ofUnionMember0(
                                    PromptCreateParams.PromptData.Prompt.UnionMember0.builder()
                                        .content("string")
                                        .type(
                                            PromptCreateParams.PromptData.Prompt.UnionMember0.Type
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
        val promptService = client.prompt()
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
        val promptService = client.prompt()
        val prompt =
            promptService.update(
                PromptUpdateParams.builder()
                    .promptId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .description("string")
                    .name("string")
                    .promptData(
                        PromptUpdateParams.PromptData.builder()
                            .options(
                                PromptUpdateParams.PromptData.Options.builder()
                                    .model("string")
                                    .params(
                                        PromptUpdateParams.PromptData.Options.Params.ofUnionMember0(
                                            PromptUpdateParams.PromptData.Options.Params
                                                .UnionMember0
                                                .builder()
                                                .frequencyPenalty(42.23)
                                                .functionCall(
                                                    PromptUpdateParams.PromptData.Options.Params
                                                        .UnionMember0
                                                        .FunctionCall
                                                        .ofUnionMember0(
                                                            PromptUpdateParams.PromptData.Options
                                                                .Params
                                                                .UnionMember0
                                                                .FunctionCall
                                                                .UnionMember0
                                                                .AUTO
                                                        )
                                                )
                                                .maxTokens(42.23)
                                                .n(42.23)
                                                .presencePenalty(42.23)
                                                .responseFormat(
                                                    PromptUpdateParams.PromptData.Options.Params
                                                        .UnionMember0
                                                        .ResponseFormat
                                                        .builder()
                                                        .type(
                                                            PromptUpdateParams.PromptData.Options
                                                                .Params
                                                                .UnionMember0
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
                                                        .UnionMember0
                                                        .ToolChoice
                                                        .ofUnionMember0(
                                                            PromptUpdateParams.PromptData.Options
                                                                .Params
                                                                .UnionMember0
                                                                .ToolChoice
                                                                .UnionMember0
                                                                .AUTO
                                                        )
                                                )
                                                .topP(42.23)
                                                .useCache(true)
                                                .build()
                                        )
                                    )
                                    .position("string")
                                    .build()
                            )
                            .origin(
                                PromptUpdateParams.PromptData.Origin.builder()
                                    .projectId("string")
                                    .promptId("string")
                                    .promptVersion("string")
                                    .build()
                            )
                            .prompt(
                                PromptUpdateParams.PromptData.Prompt.ofUnionMember0(
                                    PromptUpdateParams.PromptData.Prompt.UnionMember0.builder()
                                        .content("string")
                                        .type(
                                            PromptUpdateParams.PromptData.Prompt.UnionMember0.Type
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
        val promptService = client.prompt()
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
        val promptService = client.prompt()
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
    fun callFeedback() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val promptService = client.prompt()
        promptService.feedback(
            PromptFeedbackParams.builder()
                .promptId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .feedback(
                    listOf(
                        PromptFeedbackParams.Feedback.builder()
                            .id("string")
                            .comment("string")
                            .metadata(PromptFeedbackParams.Feedback.Metadata.builder().build())
                            .source(PromptFeedbackParams.Feedback.Source.APP)
                            .build()
                    )
                )
                .build()
        )
    }

    @Test
    fun callReplace() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val promptService = client.prompt()
        val prompt =
            promptService.replace(
                PromptReplaceParams.builder()
                    .name("string")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .slug("string")
                    .description("string")
                    .promptData(
                        PromptReplaceParams.PromptData.builder()
                            .options(
                                PromptReplaceParams.PromptData.Options.builder()
                                    .model("string")
                                    .params(
                                        PromptReplaceParams.PromptData.Options.Params
                                            .ofUnionMember0(
                                                PromptReplaceParams.PromptData.Options.Params
                                                    .UnionMember0
                                                    .builder()
                                                    .frequencyPenalty(42.23)
                                                    .functionCall(
                                                        PromptReplaceParams.PromptData.Options
                                                            .Params
                                                            .UnionMember0
                                                            .FunctionCall
                                                            .ofUnionMember0(
                                                                PromptReplaceParams.PromptData
                                                                    .Options
                                                                    .Params
                                                                    .UnionMember0
                                                                    .FunctionCall
                                                                    .UnionMember0
                                                                    .AUTO
                                                            )
                                                    )
                                                    .maxTokens(42.23)
                                                    .n(42.23)
                                                    .presencePenalty(42.23)
                                                    .responseFormat(
                                                        PromptReplaceParams.PromptData.Options
                                                            .Params
                                                            .UnionMember0
                                                            .ResponseFormat
                                                            .builder()
                                                            .type(
                                                                PromptReplaceParams.PromptData
                                                                    .Options
                                                                    .Params
                                                                    .UnionMember0
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
                                                            .UnionMember0
                                                            .ToolChoice
                                                            .ofUnionMember0(
                                                                PromptReplaceParams.PromptData
                                                                    .Options
                                                                    .Params
                                                                    .UnionMember0
                                                                    .ToolChoice
                                                                    .UnionMember0
                                                                    .AUTO
                                                            )
                                                    )
                                                    .topP(42.23)
                                                    .useCache(true)
                                                    .build()
                                            )
                                    )
                                    .position("string")
                                    .build()
                            )
                            .origin(
                                PromptReplaceParams.PromptData.Origin.builder()
                                    .projectId("string")
                                    .promptId("string")
                                    .promptVersion("string")
                                    .build()
                            )
                            .prompt(
                                PromptReplaceParams.PromptData.Prompt.ofUnionMember0(
                                    PromptReplaceParams.PromptData.Prompt.UnionMember0.builder()
                                        .content("string")
                                        .type(
                                            PromptReplaceParams.PromptData.Prompt.UnionMember0.Type
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
