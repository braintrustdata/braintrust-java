// File generated from our OpenAPI spec by Stainless.

package com.braintrust.api.services.blocking

import com.braintrust.api.TestServerExtension
import com.braintrust.api.client.okhttp.BraintrustOkHttpClient
import com.braintrust.api.models.*
import com.braintrust.api.models.AclListParams
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
        val aclService = client.acl()
        val acl =
            aclService.create(
                AclCreateParams.builder()
                    .forCreateUserPermissionAcl(
                        AclCreateParams.CreateUserPermissionAcl.builder()
                            .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .objectType(
                                AclCreateParams.CreateUserPermissionAcl.ObjectType.ORGANIZATION
                            )
                            .permission(AclCreateParams.CreateUserPermissionAcl.Permission.CREATE)
                            .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .restrictObjectType(
                                AclCreateParams.CreateUserPermissionAcl.RestrictObjectType
                                    .ofUnionMember0(
                                        AclCreateParams.CreateUserPermissionAcl.RestrictObjectType
                                            .UnionMember0
                                            .ORGANIZATION
                                    )
                            )
                            .build()
                    )
                    .build()
            )
        println(acl)
    }

    @Test
    fun callRetrieve() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val aclService = client.acl()
        val acl =
            aclService.retrieve(
                AclRetrieveParams.builder().aclId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()
            )
        println(acl)
    }

    @Test
    fun callList() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val aclService = client.acl()
        val response =
            aclService.list(
                AclListParams.builder()
                    .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .objectType(AclListParams.ObjectType.ORGANIZATION)
                    .build()
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
        val aclService = client.acl()
        val acl =
            aclService.delete(
                AclDeleteParams.builder().aclId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()
            )
        println(acl)
    }

    @Test
    fun callReplace() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val aclService = client.acl()
        val acl =
            aclService.replace(
                AclReplaceParams.builder()
                    .forCreateUserPermissionAcl(
                        AclReplaceParams.CreateUserPermissionAcl.builder()
                            .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .objectType(
                                AclReplaceParams.CreateUserPermissionAcl.ObjectType.ORGANIZATION
                            )
                            .permission(AclReplaceParams.CreateUserPermissionAcl.Permission.CREATE)
                            .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .restrictObjectType(
                                AclReplaceParams.CreateUserPermissionAcl.RestrictObjectType
                                    .ofUnionMember0(
                                        AclReplaceParams.CreateUserPermissionAcl.RestrictObjectType
                                            .UnionMember0
                                            .ORGANIZATION
                                    )
                            )
                            .build()
                    )
                    .build()
            )
        println(acl)
    }
}
