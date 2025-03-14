// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.services.blocking

import com.braintrustdata.api.TestServerExtension
import com.braintrustdata.api.client.okhttp.BraintrustOkHttpClient
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.models.FunctionCreateParams
import com.braintrustdata.api.models.FunctionDeleteParams
import com.braintrustdata.api.models.FunctionInvokeParams
import com.braintrustdata.api.models.FunctionReplaceParams
import com.braintrustdata.api.models.FunctionRetrieveParams
import com.braintrustdata.api.models.FunctionUpdateParams
import com.braintrustdata.api.models.PromptData
import com.braintrustdata.api.models.PromptOptions
import kotlin.jvm.optionals.getOrNull
import kotlin.test.assertNotNull
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class FunctionServiceTest {

    @Test
    fun create() {
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
                        FunctionCreateParams.FunctionData.Prompt.builder()
                            .type(FunctionCreateParams.FunctionData.Prompt.Type.PROMPT)
                            .build()
                    )
                    .name("x")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .slug("x")
                    .description("description")
                    .functionSchema(
                        FunctionCreateParams.FunctionSchema.builder()
                            .parameters(JsonValue.from(mapOf<String, Any>()))
                            .returns(JsonValue.from(mapOf<String, Any>()))
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

        function.validate()
    }

    @Test
    fun retrieve() {
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

        function.validate()
    }

    @Test
    fun update() {
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

        function.validate()
    }

    @Test
    fun list() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val functionService = client.functions()

        val page = functionService.list()

        page.response().validate()
    }

    @Test
    fun delete() {
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

        function.validate()
    }

    @Test
    fun invoke() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val functionService = client.functions()

        val response =
            functionService.invoke(
                FunctionInvokeParams.builder()
                    .functionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .expected(JsonValue.from(mapOf<String, Any>()))
                    .input(JsonValue.from(mapOf<String, Any>()))
                    .addMessage(
                        FunctionInvokeParams.Message.System.builder()
                            .role(FunctionInvokeParams.Message.System.Role.SYSTEM)
                            .content("content")
                            .name("name")
                            .build()
                    )
                    .metadata(
                        FunctionInvokeParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .mode(FunctionInvokeParams.Mode.AUTO)
                    .parent(
                        FunctionInvokeParams.Parent.SpanParentStruct.builder()
                            .objectId("object_id")
                            .objectType(
                                FunctionInvokeParams.Parent.SpanParentStruct.ObjectType.PROJECT_LOGS
                            )
                            .propagatedEvent(
                                FunctionInvokeParams.Parent.SpanParentStruct.PropagatedEvent
                                    .builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
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
                    .stream(true)
                    .version("version")
                    .build()
            )

        val unwrappedResponse = response.getOrNull()
        assertNotNull(unwrappedResponse)
        unwrappedResponse.validate()
    }

    @Test
    fun replace() {
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

        function.validate()
    }
}
