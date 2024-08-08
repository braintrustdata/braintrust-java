// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PatchOrganizationMembersTest {

    @Test
    fun createPatchOrganizationMembers() {
        val patchOrganizationMembers =
            PatchOrganizationMembers.builder()
                .inviteUsers(
                    PatchOrganizationMembers.InviteUsers.builder()
                        .emails(listOf("string"))
                        .groupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .groupName("group_name")
                        .ids(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                        .sendInviteEmails(true)
                        .build()
                )
                .orgId("org_id")
                .orgName("org_name")
                .removeUsers(
                    PatchOrganizationMembers.RemoveUsers.builder()
                        .emails(listOf("string"))
                        .ids(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                        .build()
                )
                .build()
        assertThat(patchOrganizationMembers).isNotNull
        assertThat(patchOrganizationMembers.inviteUsers())
            .contains(
                PatchOrganizationMembers.InviteUsers.builder()
                    .emails(listOf("string"))
                    .groupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .groupName("group_name")
                    .ids(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                    .sendInviteEmails(true)
                    .build()
            )
        assertThat(patchOrganizationMembers.orgId()).contains("org_id")
        assertThat(patchOrganizationMembers.orgName()).contains("org_name")
        assertThat(patchOrganizationMembers.removeUsers())
            .contains(
                PatchOrganizationMembers.RemoveUsers.builder()
                    .emails(listOf("string"))
                    .ids(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                    .build()
            )
    }
}
