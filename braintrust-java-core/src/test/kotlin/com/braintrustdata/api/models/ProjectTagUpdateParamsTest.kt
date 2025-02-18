// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ProjectTagUpdateParamsTest {

    @Test
    fun create() {
        ProjectTagUpdateParams.builder()
            .projectTagId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .color("color")
            .description("description")
            .name("name")
            .build()
    }

    @Test
    fun body() {
        val params =
            ProjectTagUpdateParams.builder()
                .projectTagId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .color("color")
                .description("description")
                .name("name")
                .build()

        val body = params._body()

        assertThat(body).isNotNull
        assertThat(body.color()).contains("color")
        assertThat(body.description()).contains("description")
        assertThat(body.name()).contains("name")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ProjectTagUpdateParams.builder()
                .projectTagId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val body = params._body()

        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params =
            ProjectTagUpdateParams.builder()
                .projectTagId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        assertThat(params).isNotNull
        // path param "projectTagId"
        assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
