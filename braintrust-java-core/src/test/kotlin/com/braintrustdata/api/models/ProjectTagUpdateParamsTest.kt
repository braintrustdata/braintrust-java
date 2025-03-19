// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProjectTagUpdateParamsTest {

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
    fun pathParams() {
        val params =
            ProjectTagUpdateParams.builder()
                .projectTagId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
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

        assertNotNull(body)
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

        assertNotNull(body)
    }
}
