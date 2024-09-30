// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.JsonNull
import com.braintrustdata.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ProjectLogFeedbackParamsTest {

    @Test
    fun createProjectLogFeedbackParams() {
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
    }

    @Test
    fun getBody() {
        val params =
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
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.feedback())
            .isEqualTo(
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
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            ProjectLogFeedbackParams.builder()
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .feedback(listOf(FeedbackProjectLogsItem.builder().id("id").build()))
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.feedback())
            .isEqualTo(listOf(FeedbackProjectLogsItem.builder().id("id").build()))
    }

    @Test
    fun getPathParam() {
        val params =
            ProjectLogFeedbackParams.builder()
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .feedback(listOf(FeedbackProjectLogsItem.builder().id("id").build()))
                .build()
        assertThat(params).isNotNull
        // path param "projectId"
        assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
