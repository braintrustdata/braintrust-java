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
import com.braintrustdata.api.models.PromptListParams

class PromptListParamsTest {

    @Test
    fun createPromptListParams() {
      PromptListParams.builder()
          .endingBefore("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .ids(PromptListParams.Ids.ofString("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
          .limit(123L)
          .orgName("string")
          .projectName("string")
          .promptName("string")
          .slug("string")
          .startingAfter("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .version("string")
          .build()
    }

    @Test
    fun getQueryParams() {
      val params = PromptListParams.builder()
          .endingBefore("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .ids(PromptListParams.Ids.ofString("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
          .limit(123L)
          .orgName("string")
          .projectName("string")
          .promptName("string")
          .slug("string")
          .startingAfter("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .version("string")
          .build()
      val expected = mutableMapOf<String, List<String>>()
      expected.put("ending_before", listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
      expected.put("ids", listOf(PromptListParams.Ids.ofString("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").toString()))
      expected.put("limit", listOf("123"))
      expected.put("org_name", listOf("string"))
      expected.put("project_name", listOf("string"))
      expected.put("prompt_name", listOf("string"))
      expected.put("slug", listOf("string"))
      expected.put("starting_after", listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
      expected.put("version", listOf("string"))
      assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
      val params = PromptListParams.builder().build()
      val expected = mutableMapOf<String, List<String>>()
      assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
