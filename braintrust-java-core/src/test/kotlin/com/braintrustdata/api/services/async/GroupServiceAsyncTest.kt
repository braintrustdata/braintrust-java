// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.services.async

import com.braintrustdata.api.TestServerExtension
import com.braintrustdata.api.client.okhttp.BraintrustOkHttpClientAsync
import com.braintrustdata.api.models.GroupCreateParams
import com.braintrustdata.api.models.GroupDeleteParams
import com.braintrustdata.api.models.GroupListParams
import com.braintrustdata.api.models.GroupReplaceParams
import com.braintrustdata.api.models.GroupRetrieveParams
import com.braintrustdata.api.models.GroupUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class GroupServiceAsyncTest {

    @Test
    fun create() {
      val client = BraintrustOkHttpClientAsync.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val groupServiceAsync = client.groups()

      val groupFuture = groupServiceAsync.create(GroupCreateParams.builder()
          .name("x")
          .description("description")
          .addMemberGroup("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .addMemberUser("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .orgName("org_name")
          .build())

      val group = groupFuture.get()
      group.validate()
    }

    @Test
    fun retrieve() {
      val client = BraintrustOkHttpClientAsync.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val groupServiceAsync = client.groups()

      val groupFuture = groupServiceAsync.retrieve(GroupRetrieveParams.builder()
          .groupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .build())

      val group = groupFuture.get()
      group.validate()
    }

    @Test
    fun update() {
      val client = BraintrustOkHttpClientAsync.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val groupServiceAsync = client.groups()

      val groupFuture = groupServiceAsync.update(GroupUpdateParams.builder()
          .groupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .addAddMemberGroup("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .addAddMemberUser("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .description("description")
          .name("x")
          .addRemoveMemberGroup("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .addRemoveMemberUser("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .build())

      val group = groupFuture.get()
      group.validate()
    }

    @Test
    fun list() {
      val client = BraintrustOkHttpClientAsync.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val groupServiceAsync = client.groups()

      val pageFuture = groupServiceAsync.list()

      val page = pageFuture.get()
      page.response().validate()
    }

    @Test
    fun delete() {
      val client = BraintrustOkHttpClientAsync.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val groupServiceAsync = client.groups()

      val groupFuture = groupServiceAsync.delete(GroupDeleteParams.builder()
          .groupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .build())

      val group = groupFuture.get()
      group.validate()
    }

    @Test
    fun replace() {
      val client = BraintrustOkHttpClientAsync.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val groupServiceAsync = client.groups()

      val groupFuture = groupServiceAsync.replace(GroupReplaceParams.builder()
          .name("x")
          .description("description")
          .addMemberGroup("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .addMemberUser("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .orgName("org_name")
          .build())

      val group = groupFuture.get()
      group.validate()
    }
}
