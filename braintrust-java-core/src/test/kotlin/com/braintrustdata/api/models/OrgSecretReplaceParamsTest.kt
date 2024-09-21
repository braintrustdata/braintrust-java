// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class OrgSecretReplaceParamsTest {

    @Test
    fun createOrgSecretReplaceParams() {
        OrgSecretReplaceParams.builder()
            .name("name")
            .metadata(OrgSecretReplaceParams.Metadata.builder().build())
            .orgName("org_name")
            .secret("secret")
            .type("type")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            OrgSecretReplaceParams.builder()
                .name("name")
                .metadata(OrgSecretReplaceParams.Metadata.builder().build())
                .orgName("org_name")
                .secret("secret")
                .type("type")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.metadata()).isEqualTo(OrgSecretReplaceParams.Metadata.builder().build())
        assertThat(body.orgName()).isEqualTo("org_name")
        assertThat(body.secret()).isEqualTo("secret")
        assertThat(body.type()).isEqualTo("type")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = OrgSecretReplaceParams.builder().name("name").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.name()).isEqualTo("name")
    }
}
