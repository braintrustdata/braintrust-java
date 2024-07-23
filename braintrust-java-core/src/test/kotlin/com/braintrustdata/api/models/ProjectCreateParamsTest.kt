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
import com.braintrustdata.api.models.ProjectCreateParams
import com.braintrustdata.api.models.ProjectCreateParams.ProjectCreateBody

class ProjectCreateParamsTest {

    @Test
    fun createProjectCreateParams() {
      ProjectCreateParams.builder()
          .name("string")
          .orgName("string")
          .build()
    }

    @Test
    fun getBody() {
      val params = ProjectCreateParams.builder()
          .name("string")
          .orgName("string")
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.name()).isEqualTo("string")
      assertThat(body.orgName()).isEqualTo("string")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
      val params = ProjectCreateParams.builder()
          .name("string")
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.name()).isEqualTo("string")
    }
}
