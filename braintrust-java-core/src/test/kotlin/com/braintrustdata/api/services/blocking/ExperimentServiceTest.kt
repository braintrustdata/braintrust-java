// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.services.blocking

import com.braintrustdata.api.TestServerExtension
import com.braintrustdata.api.client.okhttp.BraintrustOkHttpClient
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.models.*
import com.braintrustdata.api.models.ExperimentListParams
import java.time.OffsetDateTime
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
        val experimentService = client.experiments()
        val experiment =
            experimentService.create(
                ExperimentCreateParams.builder()
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .baseExpId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .datasetVersion("dataset_version")
                    .description("description")
                    .ensureNew(true)
                    .metadata(ExperimentCreateParams.Metadata.builder().build())
                    .name("name")
                    .public_(true)
                    .repoInfo(
                        ExperimentCreateParams.RepoInfo.builder()
                            .authorEmail("author_email")
                            .authorName("author_name")
                            .branch("branch")
                            .commit("commit")
                            .commitMessage("commit_message")
                            .commitTime("commit_time")
                            .dirty(true)
                            .gitDiff("git_diff")
                            .tag("tag")
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
        val experimentService = client.experiments()
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
        val experimentService = client.experiments()
        val experiment =
            experimentService.update(
                ExperimentUpdateParams.builder()
                    .experimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .baseExpId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .datasetVersion("dataset_version")
                    .description("description")
                    .metadata(ExperimentUpdateParams.Metadata.builder().build())
                    .name("name")
                    .public_(true)
                    .repoInfo(
                        ExperimentUpdateParams.RepoInfo.builder()
                            .authorEmail("author_email")
                            .authorName("author_name")
                            .branch("branch")
                            .commit("commit")
                            .commitMessage("commit_message")
                            .commitTime("commit_time")
                            .dirty(true)
                            .gitDiff("git_diff")
                            .tag("tag")
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
        val experimentService = client.experiments()
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
        val experimentService = client.experiments()
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
        val experimentService = client.experiments()
        experimentService.feedback(
            ExperimentFeedbackParams.builder()
                .experimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .feedback(
                    listOf(
                        ExperimentFeedbackParams.Feedback.builder()
                            .id("id")
                            .comment("comment")
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
        val experimentService = client.experiments()
        val experimentFetchResponse =
            experimentService.fetch(
                ExperimentFetchParams.builder()
                    .experimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .limit(123L)
                    .maxRootSpanId("max_root_span_id")
                    .maxXactId("max_xact_id")
                    .version("version")
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
        val experimentService = client.experiments()
        val experimentFetchPostResponse =
            experimentService.fetchPost(
                ExperimentFetchPostParams.builder()
                    .experimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .cursor("cursor")
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
                    .maxRootSpanId("max_root_span_id")
                    .maxXactId("max_xact_id")
                    .version("version")
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
        val experimentService = client.experiments()
        val experimentInsertResponse =
            experimentService.insert(
                ExperimentInsertParams.builder()
                    .experimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .events(
                        listOf(
                            ExperimentInsertParams.Event.ofInsertExperimentEventReplace(
                                ExperimentInsertParams.Event.InsertExperimentEventReplace.builder()
                                    .id("id")
                                    ._isMerge(true)
                                    ._objectDelete(true)
                                    ._parentId("_parent_id")
                                    .context(
                                        ExperimentInsertParams.Event.InsertExperimentEventReplace
                                            .Context
                                            .builder()
                                            .callerFilename("caller_filename")
                                            .callerFunctionname("caller_functionname")
                                            .callerLineno(123L)
                                            .build()
                                    )
                                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .datasetRecordId("dataset_record_id")
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
                                            .completionTokens(123L)
                                            .end(42.23)
                                            .promptTokens(123L)
                                            .start(42.23)
                                            .tokens(123L)
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
                                            .name("name")
                                            .type(
                                                ExperimentInsertParams.Event
                                                    .InsertExperimentEventReplace
                                                    .SpanAttributes
                                                    .Type
                                                    .LLM
                                            )
                                            .build()
                                    )
                                    .tags(listOf("string"))
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
    fun callSummarize() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val experimentService = client.experiments()
        val experimentSummarizeResponse =
            experimentService.summarize(
                ExperimentSummarizeParams.builder()
                    .experimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .comparisonExperimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .summarizeScores(true)
                    .build()
            )
        println(experimentSummarizeResponse)
        experimentSummarizeResponse.validate()
    }
}
