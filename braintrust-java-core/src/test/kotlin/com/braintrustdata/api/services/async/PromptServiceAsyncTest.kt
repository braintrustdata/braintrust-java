// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.services.async

import com.braintrustdata.api.TestServerExtension
import com.braintrustdata.api.client.okhttp.BraintrustOkHttpClientAsync
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.models.PromptCreateParams
import com.braintrustdata.api.models.PromptData
import com.braintrustdata.api.models.PromptOptions
import com.braintrustdata.api.models.PromptReplaceParams
import com.braintrustdata.api.models.PromptUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PromptServiceAsyncTest {

    @Test
    fun create() {
        val client =
            BraintrustOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val promptServiceAsync = client.prompts()

        val promptFuture =
            promptServiceAsync.create(
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
                                                PromptOptions.Params.OpenAIModelParams
                                                    .ReasoningEffort
                                                    .LOW
                                            )
                                            .responseFormat(
                                                PromptOptions.Params.OpenAIModelParams
                                                    .ResponseFormat
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
            )

        val prompt = promptFuture.get()
        prompt.validate()
    }

    @Test
    fun retrieve() {
        val client =
            BraintrustOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val promptServiceAsync = client.prompts()

        val promptFuture = promptServiceAsync.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val prompt = promptFuture.get()
        prompt.validate()
    }

    @Test
    fun update() {
        val client =
            BraintrustOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val promptServiceAsync = client.prompts()

        val promptFuture =
            promptServiceAsync.update(
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
                                                PromptOptions.Params.OpenAIModelParams
                                                    .ReasoningEffort
                                                    .LOW
                                            )
                                            .responseFormat(
                                                PromptOptions.Params.OpenAIModelParams
                                                    .ResponseFormat
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
                    .slug("slug")
                    .addTag("string")
                    .build()
            )

        val prompt = promptFuture.get()
        prompt.validate()
    }

    @Test
    fun list() {
        val client =
            BraintrustOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val promptServiceAsync = client.prompts()

        val pageFuture = promptServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Test
    fun delete() {
        val client =
            BraintrustOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val promptServiceAsync = client.prompts()

        val promptFuture = promptServiceAsync.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val prompt = promptFuture.get()
        prompt.validate()
    }

    @Test
    fun replace() {
        val client =
            BraintrustOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val promptServiceAsync = client.prompts()

        val promptFuture =
            promptServiceAsync.replace(
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
                                                PromptOptions.Params.OpenAIModelParams
                                                    .ReasoningEffort
                                                    .LOW
                                            )
                                            .responseFormat(
                                                PromptOptions.Params.OpenAIModelParams
                                                    .ResponseFormat
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
            )

        val prompt = promptFuture.get()
        prompt.validate()
    }
}
