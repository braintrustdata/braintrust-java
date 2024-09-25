// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AclFindAndDeleteParamsTest {

    @Test
    fun createAclFindAndDeleteParams() {
        AclFindAndDeleteParams.builder()
            .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .objectType(AclFindAndDeleteParams.ObjectType.ORGANIZATION)
            .groupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .permission(AclFindAndDeleteParams.Permission.CREATE)
            .restrictObjectType(AclFindAndDeleteParams.RestrictObjectType.ORGANIZATION)
            .roleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            AclFindAndDeleteParams.builder()
                .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .objectType(AclFindAndDeleteParams.ObjectType.ORGANIZATION)
                .groupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .permission(AclFindAndDeleteParams.Permission.CREATE)
                .restrictObjectType(AclFindAndDeleteParams.RestrictObjectType.ORGANIZATION)
                .roleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.objectId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.objectType()).isEqualTo(AclFindAndDeleteParams.ObjectType.ORGANIZATION)
        assertThat(body.groupId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.permission()).isEqualTo(AclFindAndDeleteParams.Permission.CREATE)
        assertThat(body.restrictObjectType())
            .isEqualTo(AclFindAndDeleteParams.RestrictObjectType.ORGANIZATION)
        assertThat(body.roleId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.userId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            AclFindAndDeleteParams.builder()
                .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .objectType(AclFindAndDeleteParams.ObjectType.ORGANIZATION)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.objectId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.objectType()).isEqualTo(AclFindAndDeleteParams.ObjectType.ORGANIZATION)
    }
}
