// File generated from our OpenAPI spec by Stainless.

package com.braintrust.api.models

import com.braintrust.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AclReplaceParamsTest {

    @Test
    fun createAclReplaceParams() {
        AclReplaceParams.builder()
            .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .objectType(AclReplaceParams.ObjectType.ORGANIZATION)
            .groupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .permission(
                AclReplaceParams.Permission.ofUnionMember0(
                    AclReplaceParams.Permission.UnionMember0.CREATE
                )
            )
            .restrictObjectType(
                AclReplaceParams.RestrictObjectType.ofUnionMember0(
                    AclReplaceParams.RestrictObjectType.UnionMember0.ORGANIZATION
                )
            )
            .roleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            AclReplaceParams.builder()
                .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .objectType(AclReplaceParams.ObjectType.ORGANIZATION)
                .groupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .permission(
                    AclReplaceParams.Permission.ofUnionMember0(
                        AclReplaceParams.Permission.UnionMember0.CREATE
                    )
                )
                .restrictObjectType(
                    AclReplaceParams.RestrictObjectType.ofUnionMember0(
                        AclReplaceParams.RestrictObjectType.UnionMember0.ORGANIZATION
                    )
                )
                .roleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.objectId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.objectType()).isEqualTo(AclReplaceParams.ObjectType.ORGANIZATION)
        assertThat(body.groupId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.permission())
            .isEqualTo(
                AclReplaceParams.Permission.ofUnionMember0(
                    AclReplaceParams.Permission.UnionMember0.CREATE
                )
            )
        assertThat(body.restrictObjectType())
            .isEqualTo(
                AclReplaceParams.RestrictObjectType.ofUnionMember0(
                    AclReplaceParams.RestrictObjectType.UnionMember0.ORGANIZATION
                )
            )
        assertThat(body.roleId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.userId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            AclReplaceParams.builder()
                .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .objectType(AclReplaceParams.ObjectType.ORGANIZATION)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.objectId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.objectType()).isEqualTo(AclReplaceParams.ObjectType.ORGANIZATION)
    }
}
