// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.services.blocking

import com.braintrustdata.api.TestServerExtension
import com.braintrustdata.api.client.okhttp.BraintrustOkHttpClient
import com.braintrustdata.api.models.*
import com.braintrustdata.api.models.AclListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class AclServiceTest {

    @Test
    fun callCreate() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val aclService = client.acls()
        val acl =
            aclService.create(
                AclCreateParams.builder()
                    .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .objectType(AclCreateParams.ObjectType.ORGANIZATION)
                    .groupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .permission(AclCreateParams.Permission.CREATE)
                    .restrictObjectType(AclCreateParams.RestrictObjectType.ORGANIZATION)
                    .roleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        println(acl)
        acl.validate()
    }

    @Test
    fun callRetrieve() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val aclService = client.acls()
        val acl =
            aclService.retrieve(
                AclRetrieveParams.builder().aclId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()
            )
        println(acl)
        acl.validate()
    }

    @Test
    fun callList() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val aclService = client.acls()
        val response =
            aclService.list(
                AclListParams.builder().objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()
            )
        println(response)
        response.objects().forEach { it.validate() }
    }

    @Test
    fun callDelete() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val aclService = client.acls()
        val acl =
            aclService.delete(
                AclDeleteParams.builder().aclId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()
            )
        println(acl)
        acl.validate()
    }

    @Test
    fun callBatchUpdate() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val aclService = client.acls()
        val aclBatchUpdateResponse =
            aclService.batchUpdate(
                AclBatchUpdateParams.builder()
                    .addAcls(
                        listOf(
                            AclBatchUpdateParams.AddAcl.builder()
                                .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .objectType(AclBatchUpdateParams.AddAcl.ObjectType.ORGANIZATION)
                                .groupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .permission(AclBatchUpdateParams.AddAcl.Permission.CREATE)
                                .restrictObjectType(
                                    AclBatchUpdateParams.AddAcl.RestrictObjectType.ORGANIZATION
                                )
                                .roleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .build()
                        )
                    )
                    .removeAcls(
                        listOf(
                            AclBatchUpdateParams.RemoveAcl.builder()
                                .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .objectType(AclBatchUpdateParams.RemoveAcl.ObjectType.ORGANIZATION)
                                .groupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .permission(AclBatchUpdateParams.RemoveAcl.Permission.CREATE)
                                .restrictObjectType(
                                    AclBatchUpdateParams.RemoveAcl.RestrictObjectType.ORGANIZATION
                                )
                                .roleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .build()
                        )
                    )
                    .build()
            )
        println(aclBatchUpdateResponse)
        aclBatchUpdateResponse.validate()
    }

    @Test
    fun callFindAndDelete() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val aclService = client.acls()
        val acl =
            aclService.findAndDelete(
                AclFindAndDeleteParams.builder()
                    .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .objectType(AclFindAndDeleteParams.ObjectType.ORGANIZATION)
                    .groupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .permission(AclFindAndDeleteParams.Permission.CREATE)
                    .restrictObjectType(AclFindAndDeleteParams.RestrictObjectType.ORGANIZATION)
                    .roleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        println(acl)
        acl.validate()
    }
}
