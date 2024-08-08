// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.services.blocking.projects

import com.braintrustdata.api.TestServerExtension
import com.braintrustdata.api.client.okhttp.BraintrustOkHttpClient
import com.braintrustdata.api.core.JsonValue
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
        logService.feedback(
            ProjectLogFeedbackParams.builder()
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .feedback(
                    listOf(
                        ProjectLogFeedbackParams.Feedback.builder()
                            .id("id")
                            .comment("comment")
                            .expected(JsonValue.from(mapOf<String, Any>()))
                            .metadata(ProjectLogFeedbackParams.Feedback.Metadata.builder().build())
                            .scores(ProjectLogFeedbackParams.Feedback.Scores.builder().build())
                            .source(ProjectLogFeedbackParams.Feedback.Source.APP)
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
        val logService = client.projects().logs()
        val projectLogFetchResponse =
            logService.fetch(
                ProjectLogFetchParams.builder()
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .limit(123L)
                    .maxRootSpanId("max_root_span_id")
                    .maxXactId("max_xact_id")
                    .version("version")
                    .build()
            )
        println(projectLogFetchResponse)
        projectLogFetchResponse.validate()
    }

    @Test
    fun callFetchPost() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val logService = client.projects().logs()
        val projectLogFetchPostResponse =
            logService.fetchPost(
                ProjectLogFetchPostParams.builder()
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .cursor("cursor")
                    .filters(
                        listOf(
                            ProjectLogFetchPostParams.Filter.builder()
                                .path(listOf("string"))
                                .type(ProjectLogFetchPostParams.Filter.Type.PATH_LOOKUP)
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
        println(projectLogFetchPostResponse)
        projectLogFetchPostResponse.validate()
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
                                ProjectLogInsertParams.Event.InsertProjectLogsEventReplace.builder()
                                    .id("id")
                                    ._isMerge(true)
                                    ._objectDelete(true)
                                    ._parentId("_parent_id")
                                    .context(
                                        ProjectLogInsertParams.Event.InsertProjectLogsEventReplace
                                            .Context
                                            .builder()
                                            .callerFilename("caller_filename")
                                            .callerFunctionname("caller_functionname")
                                            .callerLineno(123L)
                                            .build()
                                    )
                                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .expected(JsonValue.from(mapOf<String, Any>()))
                                    .input(JsonValue.from(mapOf<String, Any>()))
                                    .metadata(
                                        ProjectLogInsertParams.Event.InsertProjectLogsEventReplace
                                            .Metadata
                                            .builder()
                                            .build()
                                    )
                                    .metrics(
                                        ProjectLogInsertParams.Event.InsertProjectLogsEventReplace
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
                                        ProjectLogInsertParams.Event.InsertProjectLogsEventReplace
                                            .Scores
                                            .builder()
                                            .build()
                                    )
                                    .spanAttributes(
                                        ProjectLogInsertParams.Event.InsertProjectLogsEventReplace
                                            .SpanAttributes
                                            .builder()
                                            .name("name")
                                            .type(
                                                ProjectLogInsertParams.Event
                                                    .InsertProjectLogsEventReplace
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
        println(projectLogInsertResponse)
        projectLogInsertResponse.validate()
    }
}
