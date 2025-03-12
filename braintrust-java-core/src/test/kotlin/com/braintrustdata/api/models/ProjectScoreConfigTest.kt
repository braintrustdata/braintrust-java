// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ProjectScoreConfigTest {

    @Test
    fun createProjectScoreConfig() {
      val projectScoreConfig = ProjectScoreConfig.builder()
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
          .build()
      assertThat(projectScoreConfig).isNotNull
      assertThat(projectScoreConfig.destination()).contains(ProjectScoreConfig.Destination.EXPECTED)
      assertThat(projectScoreConfig.multiSelect()).contains(true)
      assertThat(projectScoreConfig.online()).contains(OnlineScoreConfig.builder()
          .samplingRate(0.0)
          .addScorer(OnlineScoreConfig.Scorer.Function.builder()
              .id("id")
              .type(OnlineScoreConfig.Scorer.Function.Type.FUNCTION)
              .build())
          .applyToRootSpan(true)
          .addApplyToSpanName("string")
          .build())
    }
}
