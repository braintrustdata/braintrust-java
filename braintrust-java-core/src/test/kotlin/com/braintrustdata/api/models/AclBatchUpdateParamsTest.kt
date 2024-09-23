// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AclBatchUpdateParamsTest {

    @Test
    fun createAclBatchUpdateParams() {
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
    }

    @Test
    fun getBody() {
        val params =
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
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.addAcls())
            .isEqualTo(
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
        assertThat(body.removeAcls())
            .isEqualTo(
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
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = AclBatchUpdateParams.builder().build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }
}
