// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PatchOrganizationMembersOutputTest {

    @Test
    fun createPatchOrganizationMembersOutput() {
        val patchOrganizationMembersOutput =
            PatchOrganizationMembersOutput.builder()
                .status(PatchOrganizationMembersOutput.Status.SUCCESS)
                .sendEmailError("send_email_error")
                .build()
        assertThat(patchOrganizationMembersOutput).isNotNull
        assertThat(patchOrganizationMembersOutput.status())
            .isEqualTo(PatchOrganizationMembersOutput.Status.SUCCESS)
        assertThat(patchOrganizationMembersOutput.sendEmailError()).contains("send_email_error")
    }
}
