// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CreateGroupTest {

    @Test
    fun createCreateGroup() {
        val createGroup =
            CreateGroup.builder()
                .name("name")
                .description("description")
                .memberGroups(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                .memberUsers(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                .orgName("org_name")
                .build()
        assertThat(createGroup).isNotNull
        assertThat(createGroup.name()).isEqualTo("name")
        assertThat(createGroup.description()).contains("description")
        assertThat(createGroup.memberGroups().get())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(createGroup.memberUsers().get())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(createGroup.orgName()).contains("org_name")
    }
}
