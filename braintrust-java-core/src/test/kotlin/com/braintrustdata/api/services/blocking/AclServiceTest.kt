// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.services.blocking

import com.braintrustdata.api.TestServerExtension
import com.braintrustdata.api.client.okhttp.BraintrustOkHttpClient
import com.braintrustdata.api.models.AclBatchUpdateParams
import com.braintrustdata.api.models.AclCreateParams
import com.braintrustdata.api.models.AclDeleteParams
import com.braintrustdata.api.models.AclFindAndDeleteParams
import com.braintrustdata.api.models.AclListParams
import com.braintrustdata.api.models.AclObjectType
import com.braintrustdata.api.models.AclRetrieveParams
import com.braintrustdata.api.models.Permission
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AclServiceTest {

    @Test
    fun create() {
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
                    .objectType(AclObjectType.ORGANIZATION)
                    .groupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .permission(Permission.CREATE)
                    .restrictObjectType(AclObjectType.ORGANIZATION)
                    .roleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        acl.validate()
    }

    @Test
    fun retrieve() {
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

        acl.validate()
    }

    @Test
    fun list() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val aclService = client.acls()

        val page =
            aclService.list(
                AclListParams.builder()
                    .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .objectType(AclObjectType.ORGANIZATION)
                    .build()
            )

        page.response().validate()
    }

    @Test
    fun delete() {
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

        acl.validate()
    }

    @Test
    fun batchUpdate() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val aclService = client.acls()

        val aclBatchUpdateResponse =
            aclService.batchUpdate(
                AclBatchUpdateParams.builder()
                    .addAddAcl(
                        AclBatchUpdateParams.AddAcl.builder()
                            .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .objectType(AclObjectType.ORGANIZATION)
                            .groupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .permission(Permission.CREATE)
                            .restrictObjectType(AclObjectType.ORGANIZATION)
                            .roleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .build()
                    )
                    .addRemoveAcl(
                        AclBatchUpdateParams.RemoveAcl.builder()
                            .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .objectType(AclObjectType.ORGANIZATION)
                            .groupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .permission(Permission.CREATE)
                            .restrictObjectType(AclObjectType.ORGANIZATION)
                            .roleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .build()
                    )
                    .build()
            )

        aclBatchUpdateResponse.validate()
    }

    @Test
    fun findAndDelete() {
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
                    .objectType(AclObjectType.ORGANIZATION)
                    .groupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .permission(Permission.CREATE)
                    .restrictObjectType(AclObjectType.ORGANIZATION)
                    .roleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        acl.validate()
    }
}
