// File generated from our OpenAPI spec by Stainless.

package com.braintrust.api.models

import com.braintrust.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AclCreateParamsTest {

    @Test
    fun createAclCreateParams() {
        AclCreateParams.builder()
            .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .objectType(AclCreateParams.ObjectType.ORGANIZATION)
            .groupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .permission(
                AclCreateParams.Permission.ofUnionMember0(
                    AclCreateParams.Permission.UnionMember0.CREATE
                )
            )
            .restrictObjectType(
                AclCreateParams.RestrictObjectType.ofUnionMember0(
                    AclCreateParams.RestrictObjectType.UnionMember0.ORGANIZATION
                )
            )
            .roleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            AclCreateParams.builder()
                .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .objectType(AclCreateParams.ObjectType.ORGANIZATION)
                .groupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .permission(
                    AclCreateParams.Permission.ofUnionMember0(
                        AclCreateParams.Permission.UnionMember0.CREATE
                    )
                )
                .restrictObjectType(
                    AclCreateParams.RestrictObjectType.ofUnionMember0(
                        AclCreateParams.RestrictObjectType.UnionMember0.ORGANIZATION
                    )
                )
                .roleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.objectId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.objectType()).isEqualTo(AclCreateParams.ObjectType.ORGANIZATION)
        assertThat(body.groupId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.permission())
            .isEqualTo(
                AclCreateParams.Permission.ofUnionMember0(
                    AclCreateParams.Permission.UnionMember0.CREATE
                )
            )
        assertThat(body.restrictObjectType())
            .isEqualTo(
                AclCreateParams.RestrictObjectType.ofUnionMember0(
                    AclCreateParams.RestrictObjectType.UnionMember0.ORGANIZATION
                )
            )
        assertThat(body.roleId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.userId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            AclCreateParams.builder()
                .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .objectType(AclCreateParams.ObjectType.ORGANIZATION)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.objectId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.objectType()).isEqualTo(AclCreateParams.ObjectType.ORGANIZATION)
    }
}
