// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PatchGroupTest {

    @Test
    fun createPatchGroup() {
        val patchGroup =
            PatchGroup.builder()
                .addMemberGroups(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                .addMemberUsers(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                .description("description")
                .name("name")
                .removeMemberGroups(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                .removeMemberUsers(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                .build()
        assertThat(patchGroup).isNotNull
        assertThat(patchGroup.addMemberGroups().get())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(patchGroup.addMemberUsers().get())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(patchGroup.description()).contains("description")
        assertThat(patchGroup.name()).contains("name")
        assertThat(patchGroup.removeMemberGroups().get())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(patchGroup.removeMemberUsers().get())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
