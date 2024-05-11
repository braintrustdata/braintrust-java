// File generated from our OpenAPI spec by Stainless.

package com.braintrust.api.models

import com.braintrust.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ProjectReplaceParamsTest {

    @Test
    fun createProjectReplaceParams() {
        ProjectReplaceParams.builder().name("string").orgName("string").build()
    }

    @Test
    fun getBody() {
        val params = ProjectReplaceParams.builder().name("string").orgName("string").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.name()).isEqualTo("string")
        assertThat(body.orgName()).isEqualTo("string")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = ProjectReplaceParams.builder().name("string").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.name()).isEqualTo("string")
    }
}
