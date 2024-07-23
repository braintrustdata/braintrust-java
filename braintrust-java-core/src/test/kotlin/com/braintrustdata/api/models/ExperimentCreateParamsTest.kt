// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import org.apache.hc.core5.http.ContentType
import com.braintrustdata.api.core.ContentTypes
import com.braintrustdata.api.core.JsonNull
import com.braintrustdata.api.core.JsonString
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.MultipartFormValue
import com.braintrustdata.api.models.*
import com.braintrustdata.api.models.ExperimentCreateParams
import com.braintrustdata.api.models.ExperimentCreateParams.ExperimentCreateBody

class ExperimentCreateParamsTest {

    @Test
    fun createExperimentCreateParams() {
      ExperimentCreateParams.builder()
          .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .baseExpId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .datasetVersion("dataset_version")
          .description("description")
          .ensureNew(true)
          .metadata(ExperimentCreateParams.Metadata.builder().build())
          .name("name")
          .public_(true)
          .repoInfo(ExperimentCreateParams.RepoInfo.builder()
              .authorEmail("author_email")
              .authorName("author_name")
              .branch("branch")
              .commit("commit")
              .commitMessage("commit_message")
              .commitTime("commit_time")
              .dirty(true)
              .gitDiff("git_diff")
              .tag("tag")
              .build())
          .build()
    }

    @Test
    fun getBody() {
      val params = ExperimentCreateParams.builder()
          .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .baseExpId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .datasetVersion("dataset_version")
          .description("description")
          .ensureNew(true)
          .metadata(ExperimentCreateParams.Metadata.builder().build())
          .name("name")
          .public_(true)
          .repoInfo(ExperimentCreateParams.RepoInfo.builder()
              .authorEmail("author_email")
              .authorName("author_name")
              .branch("branch")
              .commit("commit")
              .commitMessage("commit_message")
              .commitTime("commit_time")
              .dirty(true)
              .gitDiff("git_diff")
              .tag("tag")
              .build())
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.projectId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
      assertThat(body.baseExpId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
      assertThat(body.datasetId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
      assertThat(body.datasetVersion()).isEqualTo("dataset_version")
      assertThat(body.description()).isEqualTo("description")
      assertThat(body.ensureNew()).isEqualTo(true)
      assertThat(body.metadata()).isEqualTo(ExperimentCreateParams.Metadata.builder().build())
      assertThat(body.name()).isEqualTo("name")
      assertThat(body.public_()).isEqualTo(true)
      assertThat(body.repoInfo()).isEqualTo(ExperimentCreateParams.RepoInfo.builder()
          .authorEmail("author_email")
          .authorName("author_name")
          .branch("branch")
          .commit("commit")
          .commitMessage("commit_message")
          .commitTime("commit_time")
          .dirty(true)
          .gitDiff("git_diff")
          .tag("tag")
          .build())
    }

    @Test
    fun getBodyWithoutOptionalFields() {
      val params = ExperimentCreateParams.builder()
          .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.projectId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
