// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.services.blocking.projects

import com.braintrustdata.api.TestServerExtension
import com.braintrustdata.api.client.okhttp.BraintrustOkHttpClient
import com.braintrustdata.api.core.JsonNull
import com.braintrustdata.api.models.*
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class LogServiceTest {

    @Test
    fun callFeedback() {
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
                    .feedback(
                        listOf(
                            FeedbackProjectLogsItem.builder()
                                .id("id")
                                .comment("comment")
                                .expected(JsonNull.of())
                                .metadata(FeedbackProjectLogsItem.Metadata.builder().build())
                                .scores(FeedbackProjectLogsItem.Scores.builder().build())
                                .source(FeedbackProjectLogsItem.Source.APP)
                                .tags(listOf("string"))
                                .build()
                        )
                    )
                    .build()
            )
        println(feedbackResponseSchema)
        feedbackResponseSchema.validate()
    }

    @Test
    fun callFetch() {
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
                    .limit(123L)
                    .maxRootSpanId("max_root_span_id")
                    .maxXactId("max_xact_id")
                    .version("version")
                    .build()
            )
        println(fetchProjectLogsEventsResponse)
        fetchProjectLogsEventsResponse.validate()
    }

    @Test
    fun callFetchPost() {
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
                    .limit(123L)
                    .maxRootSpanId("max_root_span_id")
                    .maxXactId("max_xact_id")
                    .version("version")
                    .build()
            )
        println(fetchProjectLogsEventsResponse)
        fetchProjectLogsEventsResponse.validate()
    }

    @Test
    fun callInsert() {
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
                    .events(
                        listOf(
                            InsertProjectLogsEvent.builder()
                                .id("id")
                                ._isMerge(true)
                                ._mergePaths(listOf(listOf("string")))
                                ._objectDelete(true)
                                ._parentId("_parent_id")
                                .context(
                                    InsertProjectLogsEvent.Context.builder()
                                        .callerFilename("caller_filename")
                                        .callerFunctionname("caller_functionname")
                                        .callerLineno(123L)
                                        .build()
                                )
                                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .error(JsonNull.of())
                                .expected(JsonNull.of())
                                .input(JsonNull.of())
                                .metadata(InsertProjectLogsEvent.Metadata.builder().build())
                                .metrics(
                                    InsertProjectLogsEvent.Metrics.builder()
                                        .callerFilename(JsonNull.of())
                                        .callerFunctionname(JsonNull.of())
                                        .callerLineno(JsonNull.of())
                                        .completionTokens(123L)
                                        .end(42.23)
                                        .promptTokens(123L)
                                        .start(42.23)
                                        .tokens(123L)
                                        .build()
                                )
                                .output(JsonNull.of())
                                .rootSpanId("root_span_id")
                                .scores(InsertProjectLogsEvent.Scores.builder().build())
                                .spanAttributes(
                                    SpanAttributes.builder()
                                        .name("name")
                                        .type(SpanAttributes.Type.LLM)
                                        .build()
                                )
                                .spanId("span_id")
                                .spanParents(listOf("string"))
                                .tags(listOf("string"))
                                .build()
                        )
                    )
                    .build()
            )
        println(insertEventsResponse)
        insertEventsResponse.validate()
    }
}
