// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AclCreateParamsTest {

    @Test
    fun create() {
        AclCreateParams.builder()
            .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .objectType(AclCreateParams.ObjectType.ORGANIZATION)
            .groupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .permission(AclCreateParams.Permission.CREATE)
            .restrictObjectType(AclCreateParams.RestrictObjectType.ORGANIZATION)
            .roleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .build()
    }

    @Test
    fun body() {
        val params =
            AclCreateParams.builder()
                .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .objectType(AclCreateParams.ObjectType.ORGANIZATION)
                .groupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .permission(AclCreateParams.Permission.CREATE)
                .restrictObjectType(AclCreateParams.RestrictObjectType.ORGANIZATION)
                .roleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.objectId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.objectType()).isEqualTo(AclCreateParams.ObjectType.ORGANIZATION)
        assertThat(body.groupId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.permission()).contains(AclCreateParams.Permission.CREATE)
        assertThat(body.restrictObjectType())
            .contains(AclCreateParams.RestrictObjectType.ORGANIZATION)
        assertThat(body.roleId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.userId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AclCreateParams.builder()
                .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .objectType(AclCreateParams.ObjectType.ORGANIZATION)
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.objectId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.objectType()).isEqualTo(AclCreateParams.ObjectType.ORGANIZATION)
    }
}
