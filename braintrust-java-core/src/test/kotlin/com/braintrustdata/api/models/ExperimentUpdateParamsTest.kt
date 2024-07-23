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
import com.braintrustdata.api.models.ExperimentUpdateParams
import com.braintrustdata.api.models.ExperimentUpdateParams.ExperimentUpdateBody

class ExperimentUpdateParamsTest {

    @Test
    fun createExperimentUpdateParams() {
      ExperimentUpdateParams.builder()
          .experimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .baseExpId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .datasetVersion("string")
          .description("string")
          .metadata(ExperimentUpdateParams.Metadata.builder().build())
          .name("string")
          .public_(true)
          .repoInfo(ExperimentUpdateParams.RepoInfo.builder()
              .authorEmail("string")
              .authorName("string")
              .branch("string")
              .commit("string")
              .commitMessage("string")
              .commitTime("string")
              .dirty(true)
              .gitDiff("string")
              .tag("string")
              .build())
          .build()
    }

    @Test
    fun getBody() {
      val params = ExperimentUpdateParams.builder()
          .experimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .baseExpId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .datasetVersion("string")
          .description("string")
          .metadata(ExperimentUpdateParams.Metadata.builder().build())
          .name("string")
          .public_(true)
          .repoInfo(ExperimentUpdateParams.RepoInfo.builder()
              .authorEmail("string")
              .authorName("string")
              .branch("string")
              .commit("string")
              .commitMessage("string")
              .commitTime("string")
              .dirty(true)
              .gitDiff("string")
              .tag("string")
              .build())
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.baseExpId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
      assertThat(body.datasetId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
      assertThat(body.datasetVersion()).isEqualTo("string")
      assertThat(body.description()).isEqualTo("string")
      assertThat(body.metadata()).isEqualTo(ExperimentUpdateParams.Metadata.builder().build())
      assertThat(body.name()).isEqualTo("string")
      assertThat(body.public_()).isEqualTo(true)
      assertThat(body.repoInfo()).isEqualTo(ExperimentUpdateParams.RepoInfo.builder()
          .authorEmail("string")
          .authorName("string")
          .branch("string")
          .commit("string")
          .commitMessage("string")
          .commitTime("string")
          .dirty(true)
          .gitDiff("string")
          .tag("string")
          .build())
    }

    @Test
    fun getBodyWithoutOptionalFields() {
      val params = ExperimentUpdateParams.builder()
          .experimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
      val params = ExperimentUpdateParams.builder()
          .experimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .build()
      assertThat(params).isNotNull
      // path param "experimentId"
      assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
      // out-of-bound path param
      assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
