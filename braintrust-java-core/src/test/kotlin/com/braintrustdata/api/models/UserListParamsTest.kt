// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class UserListParamsTest {

    @Test
    fun create() {
      UserListParams.builder()
          .email("string")
          .endingBefore("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .familyName("string")
          .givenName("string")
          .ids("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .limit(0L)
          .orgName("org_name")
          .startingAfter("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .build()
    }

    @Test
    fun queryParams() {
      val params = UserListParams.builder()
          .email("string")
          .endingBefore("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .familyName("string")
          .givenName("string")
          .ids("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .limit(0L)
          .orgName("org_name")
          .startingAfter("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .build()
      val expected = QueryParams.builder()
      expected.put("email", UserListParams.Email.ofString("string").toString())
      expected.put("ending_before", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
      expected.put("family_name", UserListParams.FamilyName.ofString("string").toString())
      expected.put("given_name", UserListParams.GivenName.ofString("string").toString())
      expected.put("ids", UserListParams.Ids.ofString("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").toString())
      expected.put("limit", "0")
      expected.put("org_name", "org_name")
      expected.put("starting_after", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
      assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
      val params = UserListParams.builder().build()
      val expected = QueryParams.builder()
      assertThat(params._queryParams()).isEqualTo(expected.build())
    }
}
