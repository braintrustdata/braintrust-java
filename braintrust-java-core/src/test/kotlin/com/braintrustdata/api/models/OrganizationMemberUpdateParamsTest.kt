// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class OrganizationMemberUpdateParamsTest {

    @Test
    fun create() {
        OrganizationMemberUpdateParams.builder()
            .inviteUsers(
                OrganizationMemberUpdateParams.InviteUsers.builder()
                    .addEmail("string")
                    .groupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addGroupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .groupName("group_name")
                    .addGroupName("string")
                    .addId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .sendInviteEmails(true)
                    .build()
            )
            .orgId("org_id")
            .orgName("org_name")
            .removeUsers(
                OrganizationMemberUpdateParams.RemoveUsers.builder()
                    .addEmail("string")
                    .addId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            OrganizationMemberUpdateParams.builder()
                .inviteUsers(
                    OrganizationMemberUpdateParams.InviteUsers.builder()
                        .addEmail("string")
                        .groupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addGroupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .groupName("group_name")
                        .addGroupName("string")
                        .addId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .sendInviteEmails(true)
                        .build()
                )
                .orgId("org_id")
                .orgName("org_name")
                .removeUsers(
                    OrganizationMemberUpdateParams.RemoveUsers.builder()
                        .addEmail("string")
                        .addId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.inviteUsers())
            .contains(
                OrganizationMemberUpdateParams.InviteUsers.builder()
                    .addEmail("string")
                    .groupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addGroupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .groupName("group_name")
                    .addGroupName("string")
                    .addId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .sendInviteEmails(true)
                    .build()
            )
        assertThat(body.orgId()).contains("org_id")
        assertThat(body.orgName()).contains("org_name")
        assertThat(body.removeUsers())
            .contains(
                OrganizationMemberUpdateParams.RemoveUsers.builder()
                    .addEmail("string")
                    .addId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = OrganizationMemberUpdateParams.builder().build()

        val body = params._body()

        assertNotNull(body)
    }
}
