// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import kotlin.jvm.optionals.getOrNull
import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GroupUpdateParamsTest {

    @Test
    fun create() {
        GroupUpdateParams.builder()
            .groupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .addAddMemberGroup("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .addAddMemberUser("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .description("description")
            .name("x")
            .addRemoveMemberGroup("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .addRemoveMemberUser("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            GroupUpdateParams.builder().groupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            GroupUpdateParams.builder()
                .groupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addAddMemberGroup("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addAddMemberUser("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .description("description")
                .name("x")
                .addRemoveMemberGroup("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addRemoveMemberUser("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.addMemberGroups().getOrNull())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.addMemberUsers().getOrNull())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.description()).contains("description")
        assertThat(body.name()).contains("x")
        assertThat(body.removeMemberGroups().getOrNull())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.removeMemberUsers().getOrNull())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            GroupUpdateParams.builder().groupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        val body = params._body()

        assertNotNull(body)
    }
}
