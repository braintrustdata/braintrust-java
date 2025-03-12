// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.services.blocking

import com.braintrustdata.api.TestServerExtension
import com.braintrustdata.api.client.okhttp.BraintrustOkHttpClient
import com.braintrustdata.api.models.OnlineScoreConfig
import com.braintrustdata.api.models.ProjectScoreCategory
import com.braintrustdata.api.models.ProjectScoreConfig
import com.braintrustdata.api.models.ProjectScoreCreateParams
import com.braintrustdata.api.models.ProjectScoreDeleteParams
import com.braintrustdata.api.models.ProjectScoreListParams
import com.braintrustdata.api.models.ProjectScoreReplaceParams
import com.braintrustdata.api.models.ProjectScoreRetrieveParams
import com.braintrustdata.api.models.ProjectScoreUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class ProjectScoreServiceTest {

    @Test
    fun create() {
      val client = BraintrustOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val projectScoreService = client.projectScores()

      val projectScore = projectScoreService.create(ProjectScoreCreateParams.builder()
          .name("name")
          .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .scoreType(ProjectScoreCreateParams.ScoreType.SLIDER)
          .categoriesOfCategorical(listOf(ProjectScoreCategory.builder()
              .name("name")
              .value(0.0)
              .build()))
          .config(ProjectScoreConfig.builder()
              .destination(ProjectScoreConfig.Destination.EXPECTED)
              .multiSelect(true)
              .online(OnlineScoreConfig.builder()
                  .samplingRate(0.0)
                  .addScorer(OnlineScoreConfig.Scorer.Function.builder()
                      .id("id")
                      .type(OnlineScoreConfig.Scorer.Function.Type.FUNCTION)
                      .build())
                  .applyToRootSpan(true)
                  .addApplyToSpanName("string")
                  .build())
              .build())
          .description("description")
          .build())

      projectScore.validate()
    }

    @Test
    fun retrieve() {
      val client = BraintrustOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val projectScoreService = client.projectScores()

      val projectScore = projectScoreService.retrieve(ProjectScoreRetrieveParams.builder()
          .projectScoreId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .build())

      projectScore.validate()
    }

    @Test
    fun update() {
      val client = BraintrustOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val projectScoreService = client.projectScores()

      val projectScore = projectScoreService.update(ProjectScoreUpdateParams.builder()
          .projectScoreId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .categoriesOfCategorical(listOf(ProjectScoreCategory.builder()
              .name("name")
              .value(0.0)
              .build()))
          .config(ProjectScoreConfig.builder()
              .destination(ProjectScoreConfig.Destination.EXPECTED)
              .multiSelect(true)
              .online(OnlineScoreConfig.builder()
                  .samplingRate(0.0)
                  .addScorer(OnlineScoreConfig.Scorer.Function.builder()
                      .id("id")
                      .type(OnlineScoreConfig.Scorer.Function.Type.FUNCTION)
                      .build())
                  .applyToRootSpan(true)
                  .addApplyToSpanName("string")
                  .build())
              .build())
          .description("description")
          .name("name")
          .scoreType(ProjectScoreUpdateParams.ScoreType.SLIDER)
          .build())

      projectScore.validate()
    }

    @Test
    fun list() {
      val client = BraintrustOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val projectScoreService = client.projectScores()

      val page = projectScoreService.list()

      page.response().validate()
    }

    @Test
    fun delete() {
      val client = BraintrustOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val projectScoreService = client.projectScores()

      val projectScore = projectScoreService.delete(ProjectScoreDeleteParams.builder()
          .projectScoreId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .build())

      projectScore.validate()
    }

    @Test
    fun replace() {
      val client = BraintrustOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val projectScoreService = client.projectScores()

      val projectScore = projectScoreService.replace(ProjectScoreReplaceParams.builder()
          .name("name")
          .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .scoreType(ProjectScoreReplaceParams.ScoreType.SLIDER)
          .categoriesOfCategorical(listOf(ProjectScoreCategory.builder()
              .name("name")
              .value(0.0)
              .build()))
          .config(ProjectScoreConfig.builder()
              .destination(ProjectScoreConfig.Destination.EXPECTED)
              .multiSelect(true)
              .online(OnlineScoreConfig.builder()
                  .samplingRate(0.0)
                  .addScorer(OnlineScoreConfig.Scorer.Function.builder()
                      .id("id")
                      .type(OnlineScoreConfig.Scorer.Function.Type.FUNCTION)
                      .build())
                  .applyToRootSpan(true)
                  .addApplyToSpanName("string")
                  .build())
              .build())
          .description("description")
          .build())

      projectScore.validate()
    }
}
