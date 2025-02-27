// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.services.async.organizations

import com.braintrustdata.api.TestServerExtension
import com.braintrustdata.api.client.okhttp.BraintrustOkHttpClientAsync
import com.braintrustdata.api.models.OrganizationMemberUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class MemberServiceAsyncTest {

    @Test
    fun update() {
        val client =
            BraintrustOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val memberServiceAsync = client.organizations().members()

        val patchOrganizationMembersOutputFuture =
            memberServiceAsync.update(
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
            )

        val patchOrganizationMembersOutput = patchOrganizationMembersOutputFuture.get()
        patchOrganizationMembersOutput.validate()
    }
}
