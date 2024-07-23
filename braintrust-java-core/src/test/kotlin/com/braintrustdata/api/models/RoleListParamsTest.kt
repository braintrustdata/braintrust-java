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
import com.braintrustdata.api.models.RoleListParams

class RoleListParamsTest {

    @Test
    fun createRoleListParams() {
      RoleListParams.builder()
          .endingBefore("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .ids(RoleListParams.Ids.ofString("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
          .limit(123L)
          .orgName("org_name")
          .roleName("role_name")
          .startingAfter("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .build()
    }

    @Test
    fun getQueryParams() {
      val params = RoleListParams.builder()
          .endingBefore("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .ids(RoleListParams.Ids.ofString("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
          .limit(123L)
          .orgName("org_name")
          .roleName("role_name")
          .startingAfter("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .build()
      val expected = mutableMapOf<String, List<String>>()
      expected.put("ending_before", listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
      expected.put("ids", listOf(RoleListParams.Ids.ofString("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").toString()))
      expected.put("limit", listOf("123"))
      expected.put("org_name", listOf("org_name"))
      expected.put("role_name", listOf("role_name"))
      expected.put("starting_after", listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
      assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
      val params = RoleListParams.builder().build()
      val expected = mutableMapOf<String, List<String>>()
      assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
