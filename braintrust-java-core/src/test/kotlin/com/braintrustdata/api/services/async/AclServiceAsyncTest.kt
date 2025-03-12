// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.services.async

import com.braintrustdata.api.TestServerExtension
import com.braintrustdata.api.client.okhttp.BraintrustOkHttpClientAsync
import com.braintrustdata.api.models.AclBatchUpdateParams
import com.braintrustdata.api.models.AclCreateParams
import com.braintrustdata.api.models.AclDeleteParams
import com.braintrustdata.api.models.AclFindAndDeleteParams
import com.braintrustdata.api.models.AclListParams
import com.braintrustdata.api.models.AclRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class AclServiceAsyncTest {

    @Test
    fun create() {
      val client = BraintrustOkHttpClientAsync.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val aclServiceAsync = client.acls()

      val aclFuture = aclServiceAsync.create(AclCreateParams.builder()
          .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .objectType(AclCreateParams.ObjectType.ORGANIZATION)
          .groupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .permission(AclCreateParams.Permission.CREATE)
          .restrictObjectType(AclCreateParams.RestrictObjectType.ORGANIZATION)
          .roleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .build())

      val acl = aclFuture.get()
      acl.validate()
    }

    @Test
    fun retrieve() {
      val client = BraintrustOkHttpClientAsync.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val aclServiceAsync = client.acls()

      val aclFuture = aclServiceAsync.retrieve(AclRetrieveParams.builder()
          .aclId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .build())

      val acl = aclFuture.get()
      acl.validate()
    }

    @Test
    fun list() {
      val client = BraintrustOkHttpClientAsync.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val aclServiceAsync = client.acls()

      val pageFuture = aclServiceAsync.list(AclListParams.builder()
          .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .objectType(AclListParams.ObjectType.ORGANIZATION)
          .build())

      val page = pageFuture.get()
      page.response().validate()
    }

    @Test
    fun delete() {
      val client = BraintrustOkHttpClientAsync.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val aclServiceAsync = client.acls()

      val aclFuture = aclServiceAsync.delete(AclDeleteParams.builder()
          .aclId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .build())

      val acl = aclFuture.get()
      acl.validate()
    }

    @Test
    fun batchUpdate() {
      val client = BraintrustOkHttpClientAsync.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val aclServiceAsync = client.acls()

      val aclBatchUpdateResponseFuture = aclServiceAsync.batchUpdate(AclBatchUpdateParams.builder()
          .addAddAcl(AclBatchUpdateParams.AddAcl.builder()
              .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
              .objectType(AclBatchUpdateParams.AddAcl.ObjectType.ORGANIZATION)
              .groupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
              .permission(AclBatchUpdateParams.AddAcl.Permission.CREATE)
              .restrictObjectType(AclBatchUpdateParams.AddAcl.RestrictObjectType.ORGANIZATION)
              .roleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
              .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
              .build())
          .addRemoveAcl(AclBatchUpdateParams.RemoveAcl.builder()
              .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
              .objectType(AclBatchUpdateParams.RemoveAcl.ObjectType.ORGANIZATION)
              .groupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
              .permission(AclBatchUpdateParams.RemoveAcl.Permission.CREATE)
              .restrictObjectType(AclBatchUpdateParams.RemoveAcl.RestrictObjectType.ORGANIZATION)
              .roleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
              .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
              .build())
          .build())

      val aclBatchUpdateResponse = aclBatchUpdateResponseFuture.get()
      aclBatchUpdateResponse.validate()
    }

    @Test
    fun findAndDelete() {
      val client = BraintrustOkHttpClientAsync.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val aclServiceAsync = client.acls()

      val aclFuture = aclServiceAsync.findAndDelete(AclFindAndDeleteParams.builder()
          .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .objectType(AclFindAndDeleteParams.ObjectType.ORGANIZATION)
          .groupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .permission(AclFindAndDeleteParams.Permission.CREATE)
          .restrictObjectType(AclFindAndDeleteParams.RestrictObjectType.ORGANIZATION)
          .roleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .build())

      val acl = aclFuture.get()
      acl.validate()
    }
}
