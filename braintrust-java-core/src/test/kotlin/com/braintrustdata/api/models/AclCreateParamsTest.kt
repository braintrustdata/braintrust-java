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
import com.braintrustdata.api.models.AclCreateParams
import com.braintrustdata.api.models.AclCreateParams.AclCreateBody

class AclCreateParamsTest {

    @Test
    fun createAclCreateParams() {
      AclCreateParams.builder()
          .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .objectType(AclCreateParams.ObjectType.ORGANIZATION)
          .groupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .permission(AclCreateParams.Permission.CREATE)
          .restrictObjectType(AclCreateParams.RestrictObjectType.ORGANIZATION)
          .roleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .build()
    }

    @Test
    fun getBody() {
      val params = AclCreateParams.builder()
          .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .objectType(AclCreateParams.ObjectType.ORGANIZATION)
          .groupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .permission(AclCreateParams.Permission.CREATE)
          .restrictObjectType(AclCreateParams.RestrictObjectType.ORGANIZATION)
          .roleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.objectId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
      assertThat(body.objectType()).isEqualTo(AclCreateParams.ObjectType.ORGANIZATION)
      assertThat(body.groupId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
      assertThat(body.permission()).isEqualTo(AclCreateParams.Permission.CREATE)
      assertThat(body.restrictObjectType()).isEqualTo(AclCreateParams.RestrictObjectType.ORGANIZATION)
      assertThat(body.roleId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
      assertThat(body.userId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
      val params = AclCreateParams.builder()
          .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.objectId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
