// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ProjectUpdateParamsTest {

    @Test
    fun create() {
        ProjectUpdateParams.builder()
            .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .name("name")
            .settings(ProjectSettings.builder().comparisonKey("comparison_key").build())
            .build()
    }

    @Test
    fun body() {
        val params =
            ProjectUpdateParams.builder()
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("name")
                .settings(ProjectSettings.builder().comparisonKey("comparison_key").build())
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.name()).contains("name")
        assertThat(body.settings())
            .contains(ProjectSettings.builder().comparisonKey("comparison_key").build())
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ProjectUpdateParams.builder().projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        val body = params._body()

        assertNotNull(body)
    }

    @Test
    fun getPathParam() {
        val params =
            ProjectUpdateParams.builder().projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()
        assertThat(params).isNotNull
        // path param "projectId"
        assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
