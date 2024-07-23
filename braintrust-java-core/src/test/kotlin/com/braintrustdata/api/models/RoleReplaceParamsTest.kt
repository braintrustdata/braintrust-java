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
import com.braintrustdata.api.models.RoleReplaceParams
import com.braintrustdata.api.models.RoleReplaceParams.RoleReplaceBody

class RoleReplaceParamsTest {

    @Test
    fun createRoleReplaceParams() {
      RoleReplaceParams.builder()
          .name("string")
          .description("string")
          .memberPermissions(listOf(RoleReplaceParams.MemberPermission.builder()
              .permission(RoleReplaceParams.MemberPermission.Permission.CREATE)
              .restrictObjectType(RoleReplaceParams.MemberPermission.RestrictObjectType.ORGANIZATION)
              .build()))
          .memberRoles(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
          .orgName("string")
          .build()
    }

    @Test
    fun getBody() {
      val params = RoleReplaceParams.builder()
          .name("string")
          .description("string")
          .memberPermissions(listOf(RoleReplaceParams.MemberPermission.builder()
              .permission(RoleReplaceParams.MemberPermission.Permission.CREATE)
              .restrictObjectType(RoleReplaceParams.MemberPermission.RestrictObjectType.ORGANIZATION)
              .build()))
          .memberRoles(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
          .orgName("string")
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.name()).isEqualTo("string")
      assertThat(body.description()).isEqualTo("string")
      assertThat(body.memberPermissions()).isEqualTo(listOf(RoleReplaceParams.MemberPermission.builder()
          .permission(RoleReplaceParams.MemberPermission.Permission.CREATE)
          .restrictObjectType(RoleReplaceParams.MemberPermission.RestrictObjectType.ORGANIZATION)
          .build()))
      assertThat(body.memberRoles()).isEqualTo(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
      assertThat(body.orgName()).isEqualTo("string")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
      val params = RoleReplaceParams.builder()
          .name("string")
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.name()).isEqualTo("string")
    }
}
