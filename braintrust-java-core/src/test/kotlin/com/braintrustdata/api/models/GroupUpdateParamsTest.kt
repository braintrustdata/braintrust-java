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
import com.braintrustdata.api.models.GroupUpdateParams
import com.braintrustdata.api.models.GroupUpdateParams.GroupUpdateBody

class GroupUpdateParamsTest {

    @Test
    fun createGroupUpdateParams() {
      GroupUpdateParams.builder()
          .groupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .addMemberGroups(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
          .addMemberUsers(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
          .description("description")
          .name("name")
          .removeMemberGroups(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
          .removeMemberUsers(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
          .build()
    }

    @Test
    fun getBody() {
      val params = GroupUpdateParams.builder()
          .groupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .addMemberGroups(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
          .addMemberUsers(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
          .description("description")
          .name("name")
          .removeMemberGroups(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
          .removeMemberUsers(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.addMemberGroups()).isEqualTo(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
      assertThat(body.addMemberUsers()).isEqualTo(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
      assertThat(body.description()).isEqualTo("description")
      assertThat(body.name()).isEqualTo("name")
      assertThat(body.removeMemberGroups()).isEqualTo(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
      assertThat(body.removeMemberUsers()).isEqualTo(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
    }

    @Test
    fun getBodyWithoutOptionalFields() {
      val params = GroupUpdateParams.builder()
          .groupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
      val params = GroupUpdateParams.builder()
          .groupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .build()
      assertThat(params).isNotNull
      // path param "groupId"
      assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
      // out-of-bound path param
      assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
