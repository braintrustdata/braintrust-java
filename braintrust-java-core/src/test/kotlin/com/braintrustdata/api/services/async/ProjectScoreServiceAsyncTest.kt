// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.services.async

import com.braintrustdata.api.TestServerExtension
import com.braintrustdata.api.client.okhttp.BraintrustOkHttpClientAsync
import com.braintrustdata.api.models.OnlineScoreConfig
import com.braintrustdata.api.models.ProjectScoreCategory
import com.braintrustdata.api.models.ProjectScoreConfig
import com.braintrustdata.api.models.ProjectScoreCreateParams
import com.braintrustdata.api.models.ProjectScoreDeleteParams
import com.braintrustdata.api.models.ProjectScoreReplaceParams
import com.braintrustdata.api.models.ProjectScoreRetrieveParams
import com.braintrustdata.api.models.ProjectScoreUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class ProjectScoreServiceAsyncTest {

    @Test
    fun create() {
        val client =
            BraintrustOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val projectScoreServiceAsync = client.projectScores()

        val projectScoreFuture =
            projectScoreServiceAsync.create(
                ProjectScoreCreateParams.builder()
                    .name("name")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .scoreType(ProjectScoreCreateParams.ScoreType.SLIDER)
                    .categoriesOfCategorical(
                        listOf(ProjectScoreCategory.builder().name("name").value(0.0).build())
                    )
                    .config(
                        ProjectScoreConfig.builder()
                            .destination(ProjectScoreConfig.Destination.EXPECTED)
                            .multiSelect(true)
                            .online(
                                OnlineScoreConfig.builder()
                                    .samplingRate(0.0)
                                    .addScorer(
                                        OnlineScoreConfig.Scorer.Function.builder()
                                            .id("id")
                                            .type(OnlineScoreConfig.Scorer.Function.Type.FUNCTION)
                                            .build()
                                    )
                                    .applyToRootSpan(true)
                                    .addApplyToSpanName("string")
                                    .build()
                            )
                            .build()
                    )
                    .description("description")
                    .build()
            )

        val projectScore = projectScoreFuture.get()
        projectScore.validate()
    }

    @Test
    fun retrieve() {
        val client =
            BraintrustOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val projectScoreServiceAsync = client.projectScores()

        val projectScoreFuture =
            projectScoreServiceAsync.retrieve(
                ProjectScoreRetrieveParams.builder()
                    .projectScoreId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val projectScore = projectScoreFuture.get()
        projectScore.validate()
    }

    @Test
    fun update() {
        val client =
            BraintrustOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val projectScoreServiceAsync = client.projectScores()

        val projectScoreFuture =
            projectScoreServiceAsync.update(
                ProjectScoreUpdateParams.builder()
                    .projectScoreId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .categoriesOfCategorical(
                        listOf(ProjectScoreCategory.builder().name("name").value(0.0).build())
                    )
                    .config(
                        ProjectScoreConfig.builder()
                            .destination(ProjectScoreConfig.Destination.EXPECTED)
                            .multiSelect(true)
                            .online(
                                OnlineScoreConfig.builder()
                                    .samplingRate(0.0)
                                    .addScorer(
                                        OnlineScoreConfig.Scorer.Function.builder()
                                            .id("id")
                                            .type(OnlineScoreConfig.Scorer.Function.Type.FUNCTION)
                                            .build()
                                    )
                                    .applyToRootSpan(true)
                                    .addApplyToSpanName("string")
                                    .build()
                            )
                            .build()
                    )
                    .description("description")
                    .name("name")
                    .scoreType(ProjectScoreUpdateParams.ScoreType.SLIDER)
                    .build()
            )

        val projectScore = projectScoreFuture.get()
        projectScore.validate()
    }

    @Test
    fun list() {
        val client =
            BraintrustOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val projectScoreServiceAsync = client.projectScores()

        val pageFuture = projectScoreServiceAsync.list()

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
        val projectScoreServiceAsync = client.projectScores()

        val projectScoreFuture =
            projectScoreServiceAsync.delete(
                ProjectScoreDeleteParams.builder()
                    .projectScoreId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val projectScore = projectScoreFuture.get()
        projectScore.validate()
    }

    @Test
    fun replace() {
        val client =
            BraintrustOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val projectScoreServiceAsync = client.projectScores()

        val projectScoreFuture =
            projectScoreServiceAsync.replace(
                ProjectScoreReplaceParams.builder()
                    .name("name")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .scoreType(ProjectScoreReplaceParams.ScoreType.SLIDER)
                    .categoriesOfCategorical(
                        listOf(ProjectScoreCategory.builder().name("name").value(0.0).build())
                    )
                    .config(
                        ProjectScoreConfig.builder()
                            .destination(ProjectScoreConfig.Destination.EXPECTED)
                            .multiSelect(true)
                            .online(
                                OnlineScoreConfig.builder()
                                    .samplingRate(0.0)
                                    .addScorer(
                                        OnlineScoreConfig.Scorer.Function.builder()
                                            .id("id")
                                            .type(OnlineScoreConfig.Scorer.Function.Type.FUNCTION)
                                            .build()
                                    )
                                    .applyToRootSpan(true)
                                    .addApplyToSpanName("string")
                                    .build()
                            )
                            .build()
                    )
                    .description("description")
                    .build()
            )

        val projectScore = projectScoreFuture.get()
        projectScore.validate()
    }
}
