// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class OrgSecretFindAndDeleteParamsTest {

    @Test
    fun createOrgSecretFindAndDeleteParams() {
        OrgSecretFindAndDeleteParams.builder().name("name").orgName("org_name").build()
    }

    @Test
    fun getBody() {
        val params = OrgSecretFindAndDeleteParams.builder().name("name").orgName("org_name").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.orgName()).isEqualTo("org_name")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = OrgSecretFindAndDeleteParams.builder().name("name").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.name()).isEqualTo("name")
    }
}
