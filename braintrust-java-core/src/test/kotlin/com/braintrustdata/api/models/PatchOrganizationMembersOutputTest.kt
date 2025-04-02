// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PatchOrganizationMembersOutputTest {

    @Test
    fun create() {
        val patchOrganizationMembersOutput =
            PatchOrganizationMembersOutput.builder()
                .orgId("org_id")
                .status(PatchOrganizationMembersOutput.Status.SUCCESS)
                .sendEmailError("send_email_error")
                .build()

        assertThat(patchOrganizationMembersOutput.orgId()).isEqualTo("org_id")
        assertThat(patchOrganizationMembersOutput.status())
            .isEqualTo(PatchOrganizationMembersOutput.Status.SUCCESS)
        assertThat(patchOrganizationMembersOutput.sendEmailError()).contains("send_email_error")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val patchOrganizationMembersOutput =
            PatchOrganizationMembersOutput.builder()
                .orgId("org_id")
                .status(PatchOrganizationMembersOutput.Status.SUCCESS)
                .sendEmailError("send_email_error")
                .build()

        val roundtrippedPatchOrganizationMembersOutput =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(patchOrganizationMembersOutput),
                jacksonTypeRef<PatchOrganizationMembersOutput>(),
            )

        assertThat(roundtrippedPatchOrganizationMembersOutput)
            .isEqualTo(patchOrganizationMembersOutput)
    }
}
