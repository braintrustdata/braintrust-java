// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AiSecretListParamsTest {

    @Test
    fun create() {
      AiSecretListParams.builder()
          .aiSecretName("ai_secret_name")
          .aiSecretType("string")
          .endingBefore("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .ids("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .limit(0L)
          .orgName("org_name")
          .startingAfter("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .build()
    }

    @Test
    fun queryParams() {
      val params = AiSecretListParams.builder()
          .aiSecretName("ai_secret_name")
          .aiSecretType("string")
          .endingBefore("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .ids("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .limit(0L)
          .orgName("org_name")
          .startingAfter("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .build()
      val expected = QueryParams.builder()
      expected.put("ai_secret_name", "ai_secret_name")
      expected.put("ai_secret_type", AiSecretListParams.AiSecretType.ofString("string").toString())
      expected.put("ending_before", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
      expected.put("ids", AiSecretListParams.Ids.ofString("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").toString())
      expected.put("limit", "0")
      expected.put("org_name", "org_name")
      expected.put("starting_after", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
      assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
      val params = AiSecretListParams.builder().build()
      val expected = QueryParams.builder()
      assertThat(params._queryParams()).isEqualTo(expected.build())
    }
}
