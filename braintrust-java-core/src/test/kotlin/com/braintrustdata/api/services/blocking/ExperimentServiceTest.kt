// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.services.blocking

import com.braintrustdata.api.TestServerExtension
import com.braintrustdata.api.client.okhttp.BraintrustOkHttpClient
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.models.ExperimentCreateParams
import com.braintrustdata.api.models.ExperimentDeleteParams
import com.braintrustdata.api.models.ExperimentFeedbackParams
import com.braintrustdata.api.models.ExperimentFetchParams
import com.braintrustdata.api.models.ExperimentFetchPostParams
import com.braintrustdata.api.models.ExperimentInsertParams
import com.braintrustdata.api.models.ExperimentListParams
import com.braintrustdata.api.models.ExperimentRetrieveParams
import com.braintrustdata.api.models.ExperimentSummarizeParams
import com.braintrustdata.api.models.ExperimentUpdateParams
import com.braintrustdata.api.models.FeedbackExperimentItem
import com.braintrustdata.api.models.InsertExperimentEvent
import com.braintrustdata.api.models.RepoInfo
import com.braintrustdata.api.models.SpanAttributes
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class ExperimentServiceTest {

    @Test
    fun create() {
      val client = BraintrustOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val experimentService = client.experiments()

      val experiment = experimentService.create(ExperimentCreateParams.builder()
          .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .baseExpId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .datasetVersion("dataset_version")
          .description("description")
          .ensureNew(true)
          .metadata(ExperimentCreateParams.Metadata.builder()
              .putAdditionalProperty("foo", JsonValue.from("bar"))
              .build())
          .name("x")
          .public_(true)
          .repoInfo(RepoInfo.builder()
              .authorEmail("author_email")
              .authorName("author_name")
              .branch("branch")
              .commit("commit")
              .commitMessage("commit_message")
              .commitTime("commit_time")
              .dirty(true)
              .gitDiff("git_diff")
              .tag("tag")
              .build())
          .build())

      experiment.validate()
    }

    @Test
    fun retrieve() {
      val client = BraintrustOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val experimentService = client.experiments()

      val experiment = experimentService.retrieve(ExperimentRetrieveParams.builder()
          .experimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .build())

      experiment.validate()
    }

    @Test
    fun update() {
      val client = BraintrustOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val experimentService = client.experiments()

      val experiment = experimentService.update(ExperimentUpdateParams.builder()
          .experimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .baseExpId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .datasetVersion("dataset_version")
          .description("description")
          .metadata(ExperimentUpdateParams.Metadata.builder()
              .putAdditionalProperty("foo", JsonValue.from("bar"))
              .build())
          .name("name")
          .public_(true)
          .repoInfo(RepoInfo.builder()
              .authorEmail("author_email")
              .authorName("author_name")
              .branch("branch")
              .commit("commit")
              .commitMessage("commit_message")
              .commitTime("commit_time")
              .dirty(true)
              .gitDiff("git_diff")
              .tag("tag")
              .build())
          .build())

      experiment.validate()
    }

    @Test
    fun list() {
      val client = BraintrustOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val experimentService = client.experiments()

      val page = experimentService.list()

      page.response().validate()
    }

    @Test
    fun delete() {
      val client = BraintrustOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val experimentService = client.experiments()

      val experiment = experimentService.delete(ExperimentDeleteParams.builder()
          .experimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .build())

      experiment.validate()
    }

    @Test
    fun feedback() {
      val client = BraintrustOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val experimentService = client.experiments()

      val feedbackResponseSchema = experimentService.feedback(ExperimentFeedbackParams.builder()
          .experimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .addFeedback(FeedbackExperimentItem.builder()
              .id("id")
              .comment("comment")
              .expected(JsonValue.from(mapOf<String, Any>()))
              .metadata(FeedbackExperimentItem.Metadata.builder()
                  .putAdditionalProperty("foo", JsonValue.from("bar"))
                  .build())
              .scores(FeedbackExperimentItem.Scores.builder()
                  .putAdditionalProperty("foo", JsonValue.from(0))
                  .build())
              .source(FeedbackExperimentItem.Source.APP)
              .addTag("string")
              .build())
          .build())

      feedbackResponseSchema.validate()
    }

    @Test
    fun fetch() {
      val client = BraintrustOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val experimentService = client.experiments()

      val fetchExperimentEventsResponse = experimentService.fetch(ExperimentFetchParams.builder()
          .experimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .limit(0L)
          .maxRootSpanId("max_root_span_id")
          .maxXactId("max_xact_id")
          .version("version")
          .build())

      fetchExperimentEventsResponse.validate()
    }

    @Test
    fun fetchPost() {
      val client = BraintrustOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val experimentService = client.experiments()

      val fetchExperimentEventsResponse = experimentService.fetchPost(ExperimentFetchPostParams.builder()
          .experimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .cursor("cursor")
          .limit(0L)
          .maxRootSpanId("max_root_span_id")
          .maxXactId("max_xact_id")
          .version("version")
          .build())

      fetchExperimentEventsResponse.validate()
    }

    @Test
    fun insert() {
      val client = BraintrustOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val experimentService = client.experiments()

      val insertEventsResponse = experimentService.insert(ExperimentInsertParams.builder()
          .experimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .addEvent(InsertExperimentEvent.builder()
              .id("id")
              ._isMerge(true)
              .addMergePath(listOf("string"))
              ._objectDelete(true)
              ._parentId("_parent_id")
              .context(InsertExperimentEvent.Context.builder()
                  .callerFilename("caller_filename")
                  .callerFunctionname("caller_functionname")
                  .callerLineno(0L)
                  .build())
              .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .datasetRecordId("dataset_record_id")
              .error(JsonValue.from(mapOf<String, Any>()))
              .expected(JsonValue.from(mapOf<String, Any>()))
              .input(JsonValue.from(mapOf<String, Any>()))
              .metadata(InsertExperimentEvent.Metadata.builder()
                  .putAdditionalProperty("foo", JsonValue.from("bar"))
                  .build())
              .metrics(InsertExperimentEvent.Metrics.builder()
                  .callerFilename(JsonValue.from(mapOf<String, Any>()))
                  .callerFunctionname(JsonValue.from(mapOf<String, Any>()))
                  .callerLineno(JsonValue.from(mapOf<String, Any>()))
                  .completionTokens(0L)
                  .end(0.0)
                  .promptTokens(0L)
                  .start(0.0)
                  .tokens(0L)
                  .build())
              .output(JsonValue.from(mapOf<String, Any>()))
              .rootSpanId("root_span_id")
              .scores(InsertExperimentEvent.Scores.builder()
                  .putAdditionalProperty("foo", JsonValue.from(0))
                  .build())
              .spanAttributes(SpanAttributes.builder()
                  .name("name")
                  .type(SpanAttributes.Type.LLM)
                  .build())
              .spanId("span_id")
              .addSpanParent("string")
              .addTag("string")
              .build())
          .build())

      insertEventsResponse.validate()
    }

    @Test
    fun summarize() {
      val client = BraintrustOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val experimentService = client.experiments()

      val summarizeExperimentResponse = experimentService.summarize(ExperimentSummarizeParams.builder()
          .experimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .comparisonExperimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .summarizeScores(true)
          .build())

      summarizeExperimentResponse.validate()
    }
}
