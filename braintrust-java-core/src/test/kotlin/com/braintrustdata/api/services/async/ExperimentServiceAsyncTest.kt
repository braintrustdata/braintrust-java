// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.services.async

import com.braintrustdata.api.TestServerExtension
import com.braintrustdata.api.client.okhttp.BraintrustOkHttpClientAsync
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.models.ExperimentCreateParams
import com.braintrustdata.api.models.ExperimentFeedbackParams
import com.braintrustdata.api.models.ExperimentFetchParams
import com.braintrustdata.api.models.ExperimentFetchPostParams
import com.braintrustdata.api.models.ExperimentInsertParams
import com.braintrustdata.api.models.ExperimentSummarizeParams
import com.braintrustdata.api.models.ExperimentUpdateParams
import com.braintrustdata.api.models.FeedbackExperimentItem
import com.braintrustdata.api.models.InsertExperimentEvent
import com.braintrustdata.api.models.ObjectReference
import com.braintrustdata.api.models.RepoInfo
import com.braintrustdata.api.models.SpanAttributes
import com.braintrustdata.api.models.SpanType
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ExperimentServiceAsyncTest {

    @Test
    fun create() {
        val client =
            BraintrustOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val experimentServiceAsync = client.experiments()

        val experimentFuture =
            experimentServiceAsync.create(
                ExperimentCreateParams.builder()
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .baseExpId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .datasetVersion("dataset_version")
                    .description("description")
                    .ensureNew(true)
                    .metadata(
                        ExperimentCreateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .name("x")
                    .public_(true)
                    .repoInfo(
                        RepoInfo.builder()
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

        val experiment = experimentFuture.get()
        experiment.validate()
    }

    @Test
    fun retrieve() {
        val client =
            BraintrustOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val experimentServiceAsync = client.experiments()

        val experimentFuture =
            experimentServiceAsync.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val experiment = experimentFuture.get()
        experiment.validate()
    }

    @Test
    fun update() {
        val client =
            BraintrustOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val experimentServiceAsync = client.experiments()

        val experimentFuture =
            experimentServiceAsync.update(
                ExperimentUpdateParams.builder()
                    .experimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .baseExpId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .datasetVersion("dataset_version")
                    .description("description")
                    .metadata(
                        ExperimentUpdateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .name("name")
                    .public_(true)
                    .repoInfo(
                        RepoInfo.builder()
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

        val experiment = experimentFuture.get()
        experiment.validate()
    }

    @Test
    fun list() {
        val client =
            BraintrustOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val experimentServiceAsync = client.experiments()

        val pageFuture = experimentServiceAsync.list()

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
        val experimentServiceAsync = client.experiments()

        val experimentFuture = experimentServiceAsync.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val experiment = experimentFuture.get()
        experiment.validate()
    }

    @Test
    fun feedback() {
        val client =
            BraintrustOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val experimentServiceAsync = client.experiments()

        val feedbackResponseSchemaFuture =
            experimentServiceAsync.feedback(
                ExperimentFeedbackParams.builder()
                    .experimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addFeedback(
                        FeedbackExperimentItem.builder()
                            .id("id")
                            .comment("comment")
                            .expected(JsonValue.from(mapOf<String, Any>()))
                            .metadata(
                                FeedbackExperimentItem.Metadata.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .scores(
                                FeedbackExperimentItem.Scores.builder()
                                    .putAdditionalProperty("foo", JsonValue.from(0))
                                    .build()
                            )
                            .source(FeedbackExperimentItem.Source.APP)
                            .addTag("string")
                            .build()
                    )
                    .build()
            )

        val feedbackResponseSchema = feedbackResponseSchemaFuture.get()
        feedbackResponseSchema.validate()
    }

    @Test
    fun fetch() {
        val client =
            BraintrustOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val experimentServiceAsync = client.experiments()

        val fetchExperimentEventsResponseFuture =
            experimentServiceAsync.fetch(
                ExperimentFetchParams.builder()
                    .experimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .limit(0L)
                    .maxRootSpanId("max_root_span_id")
                    .maxXactId("max_xact_id")
                    .version("version")
                    .build()
            )

        val fetchExperimentEventsResponse = fetchExperimentEventsResponseFuture.get()
        fetchExperimentEventsResponse.validate()
    }

    @Test
    fun fetchPost() {
        val client =
            BraintrustOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val experimentServiceAsync = client.experiments()

        val fetchExperimentEventsResponseFuture =
            experimentServiceAsync.fetchPost(
                ExperimentFetchPostParams.builder()
                    .experimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .cursor("cursor")
                    .limit(0L)
                    .maxRootSpanId("max_root_span_id")
                    .maxXactId("max_xact_id")
                    .version("version")
                    .build()
            )

        val fetchExperimentEventsResponse = fetchExperimentEventsResponseFuture.get()
        fetchExperimentEventsResponse.validate()
    }

    @Test
    fun insert() {
        val client =
            BraintrustOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val experimentServiceAsync = client.experiments()

        val insertEventsResponseFuture =
            experimentServiceAsync.insert(
                ExperimentInsertParams.builder()
                    .experimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addEvent(
                        InsertExperimentEvent.builder()
                            .id("id")
                            ._isMerge(true)
                            .addMergePath(listOf("string"))
                            ._objectDelete(true)
                            ._parentId("_parent_id")
                            .context(
                                InsertExperimentEvent.Context.builder()
                                    .callerFilename("caller_filename")
                                    .callerFunctionname("caller_functionname")
                                    .callerLineno(0L)
                                    .build()
                            )
                            .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .error(JsonValue.from(mapOf<String, Any>()))
                            .expected(JsonValue.from(mapOf<String, Any>()))
                            .input(JsonValue.from(mapOf<String, Any>()))
                            .metadata(
                                InsertExperimentEvent.Metadata.builder().model("model").build()
                            )
                            .metrics(
                                InsertExperimentEvent.Metrics.builder()
                                    .callerFilename(JsonValue.from(mapOf<String, Any>()))
                                    .callerFunctionname(JsonValue.from(mapOf<String, Any>()))
                                    .callerLineno(JsonValue.from(mapOf<String, Any>()))
                                    .completionTokens(0L)
                                    .end(0.0)
                                    .promptTokens(0L)
                                    .start(0.0)
                                    .tokens(0L)
                                    .build()
                            )
                            .origin(
                                ObjectReference.builder()
                                    .id("id")
                                    ._xactId("_xact_id")
                                    .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .objectType(ObjectReference.ObjectType.EXPERIMENT)
                                    .created("created")
                                    .build()
                            )
                            .output(JsonValue.from(mapOf<String, Any>()))
                            .rootSpanId("root_span_id")
                            .scores(
                                InsertExperimentEvent.Scores.builder()
                                    .putAdditionalProperty("foo", JsonValue.from(0))
                                    .build()
                            )
                            .spanAttributes(
                                SpanAttributes.builder().name("name").type(SpanType.LLM).build()
                            )
                            .spanId("span_id")
                            .addSpanParent("string")
                            .addTag("string")
                            .build()
                    )
                    .build()
            )

        val insertEventsResponse = insertEventsResponseFuture.get()
        insertEventsResponse.validate()
    }

    @Test
    fun summarize() {
        val client =
            BraintrustOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val experimentServiceAsync = client.experiments()

        val summarizeExperimentResponseFuture =
            experimentServiceAsync.summarize(
                ExperimentSummarizeParams.builder()
                    .experimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .comparisonExperimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .summarizeScores(true)
                    .build()
            )

        val summarizeExperimentResponse = summarizeExperimentResponseFuture.get()
        summarizeExperimentResponse.validate()
    }
}
