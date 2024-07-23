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
import com.braintrustdata.api.models.RoleCreateParams
import com.braintrustdata.api.models.RoleCreateParams.RoleCreateBody

class RoleCreateParamsTest {

    @Test
    fun createRoleCreateParams() {
      RoleCreateParams.builder()
          .name("string")
          .description("string")
          .memberPermissions(listOf(RoleCreateParams.MemberPermission.builder()
              .permission(RoleCreateParams.MemberPermission.Permission.CREATE)
              .restrictObjectType(RoleCreateParams.MemberPermission.RestrictObjectType.ORGANIZATION)
              .build()))
          .memberRoles(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
          .orgName("string")
          .build()
    }

    @Test
    fun getBody() {
      val params = RoleCreateParams.builder()
          .name("string")
          .description("string")
          .memberPermissions(listOf(RoleCreateParams.MemberPermission.builder()
              .permission(RoleCreateParams.MemberPermission.Permission.CREATE)
              .restrictObjectType(RoleCreateParams.MemberPermission.RestrictObjectType.ORGANIZATION)
              .build()))
          .memberRoles(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
          .orgName("string")
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.name()).isEqualTo("string")
      assertThat(body.description()).isEqualTo("string")
      assertThat(body.memberPermissions()).isEqualTo(listOf(RoleCreateParams.MemberPermission.builder()
          .permission(RoleCreateParams.MemberPermission.Permission.CREATE)
          .restrictObjectType(RoleCreateParams.MemberPermission.RestrictObjectType.ORGANIZATION)
          .build()))
      assertThat(body.memberRoles()).isEqualTo(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
      assertThat(body.orgName()).isEqualTo("string")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
      val params = RoleCreateParams.builder()
          .name("string")
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.name()).isEqualTo("string")
    }
}
