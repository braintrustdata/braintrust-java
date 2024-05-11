// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RoleUpdateParamsTest {

    @Test
    fun createRoleUpdateParams() {
        RoleUpdateParams.builder()
            .roleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .description("string")
            .memberPermissions(listOf(RoleUpdateParams.MemberPermission.CREATE))
            .memberRoles(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
            .name("string")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            RoleUpdateParams.builder()
                .roleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .description("string")
                .memberPermissions(listOf(RoleUpdateParams.MemberPermission.CREATE))
                .memberRoles(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                .name("string")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.description()).isEqualTo("string")
        assertThat(body.memberPermissions())
            .isEqualTo(listOf(RoleUpdateParams.MemberPermission.CREATE))
        assertThat(body.memberRoles()).isEqualTo(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
        assertThat(body.name()).isEqualTo("string")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            RoleUpdateParams.builder().roleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params =
            RoleUpdateParams.builder().roleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()
        assertThat(params).isNotNull
        // path param "roleId"
        assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
