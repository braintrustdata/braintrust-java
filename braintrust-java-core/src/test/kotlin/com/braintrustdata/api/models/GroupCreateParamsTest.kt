// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GroupCreateParamsTest {

    @Test
    fun create() {
        GroupCreateParams.builder()
            .name("x")
            .description("description")
            .addMemberGroup("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .addMemberUser("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .orgName("org_name")
            .build()
    }

    @Test
    fun body() {
        val params =
            GroupCreateParams.builder()
                .name("x")
                .description("description")
                .addMemberGroup("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addMemberUser("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .orgName("org_name")
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("x")
        assertThat(body.description()).contains("description")
        assertThat(body.memberGroups().getOrNull())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.memberUsers().getOrNull())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.orgName()).contains("org_name")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = GroupCreateParams.builder().name("x").build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("x")
    }
}
