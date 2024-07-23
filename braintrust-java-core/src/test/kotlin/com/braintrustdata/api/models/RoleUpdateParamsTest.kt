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
import com.braintrustdata.api.models.RoleUpdateParams
import com.braintrustdata.api.models.RoleUpdateParams.RoleUpdateBody

class RoleUpdateParamsTest {

    @Test
    fun createRoleUpdateParams() {
      RoleUpdateParams.builder()
          .roleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .addMemberPermissions(listOf(RoleUpdateParams.AddMemberPermission.builder()
              .permission(RoleUpdateParams.AddMemberPermission.Permission.CREATE)
              .restrictObjectType(RoleUpdateParams.AddMemberPermission.RestrictObjectType.ORGANIZATION)
              .build()))
          .addMemberRoles(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
          .description("description")
          .name("name")
          .removeMemberPermissions(listOf(RoleUpdateParams.RemoveMemberPermission.builder()
              .permission(RoleUpdateParams.RemoveMemberPermission.Permission.CREATE)
              .restrictObjectType(RoleUpdateParams.RemoveMemberPermission.RestrictObjectType.ORGANIZATION)
              .build()))
          .removeMemberRoles(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
          .build()
    }

    @Test
    fun getBody() {
      val params = RoleUpdateParams.builder()
          .roleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .addMemberPermissions(listOf(RoleUpdateParams.AddMemberPermission.builder()
              .permission(RoleUpdateParams.AddMemberPermission.Permission.CREATE)
              .restrictObjectType(RoleUpdateParams.AddMemberPermission.RestrictObjectType.ORGANIZATION)
              .build()))
          .addMemberRoles(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
          .description("description")
          .name("name")
          .removeMemberPermissions(listOf(RoleUpdateParams.RemoveMemberPermission.builder()
              .permission(RoleUpdateParams.RemoveMemberPermission.Permission.CREATE)
              .restrictObjectType(RoleUpdateParams.RemoveMemberPermission.RestrictObjectType.ORGANIZATION)
              .build()))
          .removeMemberRoles(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.addMemberPermissions()).isEqualTo(listOf(RoleUpdateParams.AddMemberPermission.builder()
          .permission(RoleUpdateParams.AddMemberPermission.Permission.CREATE)
          .restrictObjectType(RoleUpdateParams.AddMemberPermission.RestrictObjectType.ORGANIZATION)
          .build()))
      assertThat(body.addMemberRoles()).isEqualTo(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
      assertThat(body.description()).isEqualTo("description")
      assertThat(body.name()).isEqualTo("name")
      assertThat(body.removeMemberPermissions()).isEqualTo(listOf(RoleUpdateParams.RemoveMemberPermission.builder()
          .permission(RoleUpdateParams.RemoveMemberPermission.Permission.CREATE)
          .restrictObjectType(RoleUpdateParams.RemoveMemberPermission.RestrictObjectType.ORGANIZATION)
          .build()))
      assertThat(body.removeMemberRoles()).isEqualTo(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
    }

    @Test
    fun getBodyWithoutOptionalFields() {
      val params = RoleUpdateParams.builder()
          .roleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
      val params = RoleUpdateParams.builder()
          .roleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .build()
      assertThat(params).isNotNull
      // path param "roleId"
      assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
      // out-of-bound path param
      assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
