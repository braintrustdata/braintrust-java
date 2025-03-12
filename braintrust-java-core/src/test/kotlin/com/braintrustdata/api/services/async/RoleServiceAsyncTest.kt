// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.services.async

import com.braintrustdata.api.TestServerExtension
import com.braintrustdata.api.client.okhttp.BraintrustOkHttpClientAsync
import com.braintrustdata.api.models.RoleCreateParams
import com.braintrustdata.api.models.RoleDeleteParams
import com.braintrustdata.api.models.RoleListParams
import com.braintrustdata.api.models.RoleReplaceParams
import com.braintrustdata.api.models.RoleRetrieveParams
import com.braintrustdata.api.models.RoleUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class RoleServiceAsyncTest {

    @Test
    fun create() {
      val client = BraintrustOkHttpClientAsync.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val roleServiceAsync = client.roles()

      val roleFuture = roleServiceAsync.create(RoleCreateParams.builder()
          .name("x")
          .description("description")
          .addMemberPermission(RoleCreateParams.MemberPermission.builder()
              .permission(RoleCreateParams.MemberPermission.Permission.CREATE)
              .restrictObjectType(RoleCreateParams.MemberPermission.RestrictObjectType.ORGANIZATION)
              .build())
          .addMemberRole("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .orgName("org_name")
          .build())

      val role = roleFuture.get()
      role.validate()
    }

    @Test
    fun retrieve() {
      val client = BraintrustOkHttpClientAsync.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val roleServiceAsync = client.roles()

      val roleFuture = roleServiceAsync.retrieve(RoleRetrieveParams.builder()
          .roleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .build())

      val role = roleFuture.get()
      role.validate()
    }

    @Test
    fun update() {
      val client = BraintrustOkHttpClientAsync.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val roleServiceAsync = client.roles()

      val roleFuture = roleServiceAsync.update(RoleUpdateParams.builder()
          .roleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .addAddMemberPermission(RoleUpdateParams.AddMemberPermission.builder()
              .permission(RoleUpdateParams.AddMemberPermission.Permission.CREATE)
              .restrictObjectType(RoleUpdateParams.AddMemberPermission.RestrictObjectType.ORGANIZATION)
              .build())
          .addAddMemberRole("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .description("description")
          .name("x")
          .addRemoveMemberPermission(RoleUpdateParams.RemoveMemberPermission.builder()
              .permission(RoleUpdateParams.RemoveMemberPermission.Permission.CREATE)
              .restrictObjectType(RoleUpdateParams.RemoveMemberPermission.RestrictObjectType.ORGANIZATION)
              .build())
          .addRemoveMemberRole("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .build())

      val role = roleFuture.get()
      role.validate()
    }

    @Test
    fun list() {
      val client = BraintrustOkHttpClientAsync.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val roleServiceAsync = client.roles()

      val pageFuture = roleServiceAsync.list()

      val page = pageFuture.get()
      page.response().validate()
    }

    @Test
    fun delete() {
      val client = BraintrustOkHttpClientAsync.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val roleServiceAsync = client.roles()

      val roleFuture = roleServiceAsync.delete(RoleDeleteParams.builder()
          .roleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .build())

      val role = roleFuture.get()
      role.validate()
    }

    @Test
    fun replace() {
      val client = BraintrustOkHttpClientAsync.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val roleServiceAsync = client.roles()

      val roleFuture = roleServiceAsync.replace(RoleReplaceParams.builder()
          .name("x")
          .description("description")
          .addMemberPermission(RoleReplaceParams.MemberPermission.builder()
              .permission(RoleReplaceParams.MemberPermission.Permission.CREATE)
              .restrictObjectType(RoleReplaceParams.MemberPermission.RestrictObjectType.ORGANIZATION)
              .build())
          .addMemberRole("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .orgName("org_name")
          .build())

      val role = roleFuture.get()
      role.validate()
    }
}
