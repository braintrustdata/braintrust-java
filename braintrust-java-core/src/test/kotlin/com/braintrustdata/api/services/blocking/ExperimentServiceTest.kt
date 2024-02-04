// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.services.blocking

import com.braintrustdata.api.TestServerExtension
import com.braintrustdata.api.client.okhttp.BraintrustOkHttpClient
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.models.*
import com.braintrustdata.api.models.ExperimentListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class ExperimentServiceTest {

    @Test
    fun callCreate() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val experimentService = client.experiment()
        val experiment =
            experimentService.create(
                ExperimentCreateParams.builder()
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .baseExpId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .datasetVersion("string")
                    .description("string")
                    .metadata(ExperimentCreateParams.Metadata.builder().build())
                    .name("string")
                    .public_(true)
                    .repoInfo(
                        ExperimentCreateParams.RepoInfo.builder()
                            .authorEmail("string")
                            .authorName("string")
                            .branch("string")
                            .commit("string")
                            .commitMessage("string")
                            .commitTime("string")
                            .dirty(true)
                            .gitDiff("string")
                            .tag("string")
                            .build()
                    )
                    .build()
            )
        println(experiment)
        experiment.validate()
    }

    @Test
    fun callRetrieve() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val experimentService = client.experiment()
        val experiment =
            experimentService.retrieve(
                ExperimentRetrieveParams.builder()
                    .experimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        println(experiment)
        experiment.validate()
    }

    @Test
    fun callUpdate() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val experimentService = client.experiment()
        val experiment =
            experimentService.update(
                ExperimentUpdateParams.builder()
                    .experimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .baseExpId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .datasetVersion("string")
                    .description("string")
                    .metadata(ExperimentUpdateParams.Metadata.builder().build())
                    .name("string")
                    .public_(true)
                    .repoInfo(
                        ExperimentUpdateParams.RepoInfo.builder()
                            .authorEmail("string")
                            .authorName("string")
                            .branch("string")
                            .commit("string")
                            .commitMessage("string")
                            .commitTime("string")
                            .dirty(true)
                            .gitDiff("string")
                            .tag("string")
                            .build()
                    )
                    .build()
            )
        println(experiment)
        experiment.validate()
    }

    @Test
    fun callList() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val experimentService = client.experiment()
        val response = experimentService.list(ExperimentListParams.builder().build())
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
        val experimentService = client.experiment()
        val experiment =
            experimentService.delete(
                ExperimentDeleteParams.builder()
                    .experimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        println(experiment)
        experiment.validate()
    }

    @Test
    fun callFeedback() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val experimentService = client.experiment()
        experimentService.feedback(
            ExperimentFeedbackParams.builder()
                .experimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .feedback(
                    listOf(
                        ExperimentFeedbackParams.Feedback.builder()
                            .id("string")
                            .comment("string")
                            .expected(JsonValue.from(mapOf<String, Any>()))
                            .metadata(ExperimentFeedbackParams.Feedback.Metadata.builder().build())
                            .scores(ExperimentFeedbackParams.Feedback.Scores.builder().build())
                            .source(ExperimentFeedbackParams.Feedback.Source.APP)
                            .build()
                    )
                )
                .build()
        )
    }

    @Test
    fun callFetch() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val experimentService = client.experiment()
        val experimentFetchResponse =
            experimentService.fetch(
                ExperimentFetchParams.builder()
                    .experimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .limit(123L)
                    .maxRootSpanId("string")
                    .maxXactId(123L)
                    .version(123L)
                    .build()
            )
        println(experimentFetchResponse)
        experimentFetchResponse.validate()
    }

    @Test
    fun callFetchPost() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val experimentService = client.experiment()
        val experimentFetchPostResponse =
            experimentService.fetchPost(
                ExperimentFetchPostParams.builder()
                    .experimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .filters(
                        listOf(
                            ExperimentFetchPostParams.Filter.builder()
                                .path(listOf("string"))
                                .type(ExperimentFetchPostParams.Filter.Type.PATH_LOOKUP)
                                .value(JsonValue.from(mapOf<String, Any>()))
                                .build()
                        )
                    )
                    .limit(123L)
                    .maxRootSpanId("string")
                    .maxXactId(123L)
                    .version(123L)
                    .build()
            )
        println(experimentFetchPostResponse)
        experimentFetchPostResponse.validate()
    }

    @Test
    fun callInsert() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val experimentService = client.experiment()
        val experimentInsertResponse =
            experimentService.insert(
                ExperimentInsertParams.builder()
                    .experimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .events(
                        listOf(
                            ExperimentInsertParams.Event.ofInsertExperimentEventReplace(
                                ExperimentInsertParams.Event.InsertExperimentEventReplace.builder()
                                    .id("string")
                                    ._isMerge(true)
                                    ._objectDelete(true)
                                    ._parentId("string")
                                    .context(
                                        ExperimentInsertParams.Event.InsertExperimentEventReplace
                                            .Context
                                            .builder()
                                            .callerFilename("string")
                                            .callerFunctionname("string")
                                            .callerLineno(123L)
                                            .build()
                                    )
                                    .datasetRecordId("string")
                                    .expected(JsonValue.from(mapOf<String, Any>()))
                                    .input(JsonValue.from(mapOf<String, Any>()))
                                    .metadata(
                                        ExperimentInsertParams.Event.InsertExperimentEventReplace
                                            .Metadata
                                            .builder()
                                            .build()
                                    )
                                    .metrics(
                                        ExperimentInsertParams.Event.InsertExperimentEventReplace
                                            .Metrics
                                            .builder()
                                            .end(42.23)
                                            .start(42.23)
                                            .build()
                                    )
                                    .output(JsonValue.from(mapOf<String, Any>()))
                                    .scores(
                                        ExperimentInsertParams.Event.InsertExperimentEventReplace
                                            .Scores
                                            .builder()
                                            .build()
                                    )
                                    .spanAttributes(
                                        ExperimentInsertParams.Event.InsertExperimentEventReplace
                                            .SpanAttributes
                                            .builder()
                                            .name("string")
                                            .type(
                                                ExperimentInsertParams.Event
                                                    .InsertExperimentEventReplace
                                                    .SpanAttributes
                                                    .Type
                                                    .LLM
                                            )
                                            .build()
                                    )
                                    .build()
                            )
                        )
                    )
                    .build()
            )
        println(experimentInsertResponse)
        experimentInsertResponse.validate()
    }

    @Test
    fun callReplace() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val experimentService = client.experiment()
        val experiment =
            experimentService.replace(
                ExperimentReplaceParams.builder()
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .baseExpId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .datasetVersion("string")
                    .description("string")
                    .metadata(ExperimentReplaceParams.Metadata.builder().build())
                    .name("string")
                    .public_(true)
                    .repoInfo(
                        ExperimentReplaceParams.RepoInfo.builder()
                            .authorEmail("string")
                            .authorName("string")
                            .branch("string")
                            .commit("string")
                            .commitMessage("string")
                            .commitTime("string")
                            .dirty(true)
                            .gitDiff("string")
                            .tag("string")
                            .build()
                    )
                    .build()
            )
        println(experiment)
        experiment.validate()
    }
}
