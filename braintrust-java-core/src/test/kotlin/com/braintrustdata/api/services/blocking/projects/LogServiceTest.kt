// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.services.blocking.projects

import com.braintrustdata.api.TestServerExtension
import com.braintrustdata.api.client.okhttp.BraintrustOkHttpClient
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.models.FeedbackProjectLogsItem
import com.braintrustdata.api.models.InsertProjectLogsEvent
import com.braintrustdata.api.models.ObjectReference
import com.braintrustdata.api.models.ProjectLogFeedbackParams
import com.braintrustdata.api.models.ProjectLogFetchParams
import com.braintrustdata.api.models.ProjectLogFetchPostParams
import com.braintrustdata.api.models.ProjectLogInsertParams
import com.braintrustdata.api.models.SpanAttributes
import com.braintrustdata.api.models.SpanType
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class LogServiceTest {

    @Test
    fun feedback() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val logService = client.projects().logs()

        val feedbackResponseSchema =
            logService.feedback(
                ProjectLogFeedbackParams.builder()
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addFeedback(
                        FeedbackProjectLogsItem.builder()
                            .id("id")
                            .comment("comment")
                            .expected(JsonValue.from(mapOf<String, Any>()))
                            .metadata(
                                FeedbackProjectLogsItem.Metadata.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .scores(
                                FeedbackProjectLogsItem.Scores.builder()
                                    .putAdditionalProperty("foo", JsonValue.from(0))
                                    .build()
                            )
                            .source(FeedbackProjectLogsItem.Source.APP)
                            .addTag("string")
                            .build()
                    )
                    .build()
            )

        feedbackResponseSchema.validate()
    }

    @Test
    fun fetch() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val logService = client.projects().logs()

        val fetchProjectLogsEventsResponse =
            logService.fetch(
                ProjectLogFetchParams.builder()
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .limit(0L)
                    .maxRootSpanId("max_root_span_id")
                    .maxXactId("max_xact_id")
                    .version("version")
                    .build()
            )

        fetchProjectLogsEventsResponse.validate()
    }

    @Test
    fun fetchPost() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val logService = client.projects().logs()

        val fetchProjectLogsEventsResponse =
            logService.fetchPost(
                ProjectLogFetchPostParams.builder()
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .cursor("cursor")
                    .limit(0L)
                    .maxRootSpanId("max_root_span_id")
                    .maxXactId("max_xact_id")
                    .version("version")
                    .build()
            )

        fetchProjectLogsEventsResponse.validate()
    }

    @Test
    fun insert() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val logService = client.projects().logs()

        val insertEventsResponse =
            logService.insert(
                ProjectLogInsertParams.builder()
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addEvent(
                        InsertProjectLogsEvent.builder()
                            .id("id")
                            ._isMerge(true)
                            .addMergePath(listOf("string"))
                            ._objectDelete(true)
                            ._parentId("_parent_id")
                            .context(
                                InsertProjectLogsEvent.Context.builder()
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
                                InsertProjectLogsEvent.Metadata.builder().model("model").build()
                            )
                            .metrics(
                                InsertProjectLogsEvent.Metrics.builder()
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
                                InsertProjectLogsEvent.Scores.builder()
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

        insertEventsResponse.validate()
    }
}
