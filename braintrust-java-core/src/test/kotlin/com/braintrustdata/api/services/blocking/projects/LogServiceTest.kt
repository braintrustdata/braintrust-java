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
                    .filters(
                        listOf(
                            PathLookupFilter.builder()
                                .path(listOf("string"))
                                .type(PathLookupFilter.Type.PATH_LOOKUP)
                                .value(JsonNull.of())
                                .build()
                        )
                    )
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
        val projectLogInsertResponse =
            logService.insert(
                ProjectLogInsertParams.builder()
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .events(
                        listOf(
                            ProjectLogInsertParams.Event.ofInsertProjectLogsEventReplace(
                                InsertProjectLogsEventReplace.builder()
                                    .id("id")
                                    ._isMerge(true)
                                    ._objectDelete(true)
                                    ._parentId("_parent_id")
                                    .context(
                                        InsertProjectLogsEventReplace.Context.builder()
                                            .callerFilename("caller_filename")
                                            .callerFunctionname("caller_functionname")
                                            .callerLineno(123L)
                                            .build()
                                    )
                                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .error(JsonNull.of())
                                    .expected(JsonNull.of())
                                    .input(JsonNull.of())
                                    .metadata(
                                        InsertProjectLogsEventReplace.Metadata.builder().build()
                                    )
                                    .metrics(
                                        InsertProjectLogsEventReplace.Metrics.builder()
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
                                    .scores(InsertProjectLogsEventReplace.Scores.builder().build())
                                    .spanAttributes(
                                        InsertProjectLogsEventReplace.SpanAttributes.builder()
                                            .name("name")
                                            .type(
                                                InsertProjectLogsEventReplace.SpanAttributes.Type
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
        println(projectLogInsertResponse)
    }
}
