// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AclFindAndDeleteParamsTest {

    @Test
    fun create() {
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
    fun body() {
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
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.objectId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.objectType()).isEqualTo(AclFindAndDeleteParams.ObjectType.ORGANIZATION)
        assertThat(body.groupId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.permission()).contains(AclFindAndDeleteParams.Permission.CREATE)
        assertThat(body.restrictObjectType())
            .contains(AclFindAndDeleteParams.RestrictObjectType.ORGANIZATION)
        assertThat(body.roleId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.userId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AclFindAndDeleteParams.builder()
                .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .objectType(AclFindAndDeleteParams.ObjectType.ORGANIZATION)
                .build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.objectId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.objectType()).isEqualTo(AclFindAndDeleteParams.ObjectType.ORGANIZATION)
    }
}
