// File generated from our OpenAPI spec by Stainless.

package com.braintrust.api.models

import com.braintrust.api.core.JsonValue
import com.braintrust.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ProjectLogFeedbackParamsTest {

    @Test
    fun createProjectLogFeedbackParams() {
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
    }

    @Test
    fun getBody() {
        val params =
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
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.feedback())
            .isEqualTo(
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
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            ProjectLogFeedbackParams.builder()
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .feedback(listOf(ProjectLogFeedbackParams.Feedback.builder().id("string").build()))
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.feedback())
            .isEqualTo(listOf(ProjectLogFeedbackParams.Feedback.builder().id("string").build()))
    }

    @Test
    fun getPathParam() {
        val params =
            ProjectLogFeedbackParams.builder()
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .feedback(listOf(ProjectLogFeedbackParams.Feedback.builder().id("string").build()))
                .build()
        assertThat(params).isNotNull
        // path param "projectId"
        assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
