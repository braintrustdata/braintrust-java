// File generated from our OpenAPI spec by Stainless.

package com.braintrust.api.models

import com.braintrust.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RoleCreateParamsTest {

    @Test
    fun createRoleCreateParams() {
        RoleCreateParams.builder()
            .name("string")
            .description("string")
            .memberPermissions(listOf(RoleCreateParams.MemberPermission.CREATE))
            .memberRoles(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
            .orgName("string")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            RoleCreateParams.builder()
                .name("string")
                .description("string")
                .memberPermissions(listOf(RoleCreateParams.MemberPermission.CREATE))
                .memberRoles(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                .orgName("string")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.name()).isEqualTo("string")
        assertThat(body.description()).isEqualTo("string")
        assertThat(body.memberPermissions())
            .isEqualTo(listOf(RoleCreateParams.MemberPermission.CREATE))
        assertThat(body.memberRoles()).isEqualTo(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
        assertThat(body.orgName()).isEqualTo("string")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = RoleCreateParams.builder().name("string").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.name()).isEqualTo("string")
    }
}
