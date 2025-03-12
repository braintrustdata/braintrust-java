// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ProjectSettingsTest {

    @Test
    fun createProjectSettings() {
      val projectSettings = ProjectSettings.builder()
          .comparisonKey("comparison_key")
          .build()
      assertThat(projectSettings).isNotNull
      assertThat(projectSettings.comparisonKey()).contains("comparison_key")
    }
}
