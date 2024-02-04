// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.services.blocking.project

import com.braintrustdata.api.TestServerExtension
import com.braintrustdata.api.client.okhttp.BraintrustOkHttpClient
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.models.*
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
        val logService = client.project().logs()
        logService.feedback(
            ProjectLogFeedbackParams.builder()
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .feedback(
                    listOf(
                        ProjectLogFeedbackParams.Feedback.builder()
                            .id("string")
                            .comment("string")
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
        val logService = client.project().logs()
        val projectLogFetchResponse =
            logService.fetch(
                ProjectLogFetchParams.builder()
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .limit(123L)
                    .maxRootSpanId("string")
                    .maxXactId(123L)
                    .version(123L)
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
        val logService = client.project().logs()
        val projectLogFetchPostResponse =
            logService.fetchPost(
                ProjectLogFetchPostParams.builder()
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
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
                    .maxRootSpanId("string")
                    .maxXactId(123L)
                    .version(123L)
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
        val logService = client.project().logs()
        val projectLogInsertResponse =
            logService.insert(
                ProjectLogInsertParams.builder()
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .events(
                        listOf(
                            ProjectLogInsertParams.Event.ofInsertProjectLogsEventReplace(
                                ProjectLogInsertParams.Event.InsertProjectLogsEventReplace.builder()
                                    .id("string")
                                    ._isMerge(true)
                                    ._objectDelete(true)
                                    ._parentId("string")
                                    .context(
                                        ProjectLogInsertParams.Event.InsertProjectLogsEventReplace
                                            .Context
                                            .builder()
                                            .callerFilename("string")
                                            .callerFunctionname("string")
                                            .callerLineno(123L)
                                            .build()
                                    )
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
                                            .end(42.23)
                                            .start(42.23)
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
                                            .name("string")
                                            .type(
                                                ProjectLogInsertParams.Event
                                                    .InsertProjectLogsEventReplace
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
        println(projectLogInsertResponse)
        projectLogInsertResponse.validate()
    }
}
