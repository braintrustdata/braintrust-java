// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AclBatchUpdateParamsTest {

    @Test
    fun create() {
        AclBatchUpdateParams.builder()
            .addAddAcl(
                AclBatchUpdateParams.AddAcl.builder()
                    .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .objectType(AclBatchUpdateParams.AddAcl.ObjectType.ORGANIZATION)
                    .groupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .permission(AclBatchUpdateParams.AddAcl.Permission.CREATE)
                    .restrictObjectType(AclBatchUpdateParams.AddAcl.RestrictObjectType.ORGANIZATION)
                    .roleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
            .addRemoveAcl(
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
            .build()
    }

    @Test
    fun body() {
        val params =
            AclBatchUpdateParams.builder()
                .addAddAcl(
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
                .addRemoveAcl(
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
                .build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.addAcls())
            .contains(
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
            .contains(
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
    fun bodyWithoutOptionalFields() {
        val params = AclBatchUpdateParams.builder().build()
        val body = params._body()
        assertThat(body).isNotNull
    }
}
