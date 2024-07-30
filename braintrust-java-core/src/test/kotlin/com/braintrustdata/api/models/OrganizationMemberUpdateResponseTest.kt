// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class OrganizationMemberUpdateResponseTest {

    @Test
    fun createOrganizationMemberUpdateResponse() {
        val organizationMemberUpdateResponse =
            OrganizationMemberUpdateResponse.builder()
                .status(OrganizationMemberUpdateResponse.Status.SUCCESS)
                .sendEmailError("send_email_error")
                .build()
        assertThat(organizationMemberUpdateResponse).isNotNull
        assertThat(organizationMemberUpdateResponse.status())
            .isEqualTo(OrganizationMemberUpdateResponse.Status.SUCCESS)
        assertThat(organizationMemberUpdateResponse.sendEmailError()).contains("send_email_error")
    }
}
