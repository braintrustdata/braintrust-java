// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProjectCreateParamsTest {

    @Test
    fun create() {
        ProjectCreateParams.builder().name("x").orgName("org_name").build()
    }

    @Test
    fun body() {
        val params = ProjectCreateParams.builder().name("x").orgName("org_name").build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("x")
        assertThat(body.orgName()).contains("org_name")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ProjectCreateParams.builder().name("x").build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("x")
    }
}
