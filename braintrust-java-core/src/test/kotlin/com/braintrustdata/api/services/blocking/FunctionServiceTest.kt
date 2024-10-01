// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.services.blocking

import com.braintrustdata.api.TestServerExtension
import com.braintrustdata.api.client.okhttp.BraintrustOkHttpClient
import com.braintrustdata.api.core.JsonNull
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
                    .functionSchema(
                        FunctionCreateParams.FunctionSchema.builder()
                            .parameters(JsonNull.of())
                            .returns(JsonNull.of())
                            .build()
                    )
                    .functionType(FunctionCreateParams.FunctionType.LLM)
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
                                                .toolChoice(ToolChoice.ofAuto(ToolChoice.Auto.AUTO))
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
                                                .toolChoice(ToolChoice.ofAuto(ToolChoice.Auto.AUTO))
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
    fun callInvoke() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val functionService = client.functions()
        val functionInvokeResponse =
            functionService.invoke(
                FunctionInvokeParams.builder()
                    .functionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .input(JsonNull.of())
                    .messages(
                        listOf(
                            FunctionInvokeParams.Message.ofSystem(
                                FunctionInvokeParams.Message.System.builder()
                                    .role(FunctionInvokeParams.Message.System.Role.SYSTEM)
                                    .content("content")
                                    .name("name")
                                    .build()
                            )
                        )
                    )
                    .mode(FunctionInvokeParams.Mode.AUTO)
                    .parent(
                        FunctionInvokeParams.Parent.ofSpanParentStruct(
                            FunctionInvokeParams.Parent.SpanParentStruct.builder()
                                .objectId("object_id")
                                .objectType(
                                    FunctionInvokeParams.Parent.SpanParentStruct.ObjectType
                                        .PROJECT_LOGS
                                )
                                .propagatedEvent(
                                    FunctionInvokeParams.Parent.SpanParentStruct.PropagatedEvent
                                        .builder()
                                        .build()
                                )
                                .rowIds(
                                    FunctionInvokeParams.Parent.SpanParentStruct.RowIds.builder()
                                        .id("id")
                                        .rootSpanId("root_span_id")
                                        .spanId("span_id")
                                        .build()
                                )
                                .build()
                        )
                    )
                    .stream(true)
                    .version("version")
                    .build()
            )
        println(functionInvokeResponse)
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
                    .functionSchema(
                        FunctionReplaceParams.FunctionSchema.builder()
                            .parameters(JsonNull.of())
                            .returns(JsonNull.of())
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
                                                .toolChoice(ToolChoice.ofAuto(ToolChoice.Auto.AUTO))
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
        println(function)
        function.validate()
    }
}
