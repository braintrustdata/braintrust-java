// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ProjectLogInsertResponseTest {

    @Test
    fun createProjectLogInsertResponse() {
        val projectLogInsertResponse =
            ProjectLogInsertResponse.builder().rowIds(listOf("string")).build()
        assertThat(projectLogInsertResponse).isNotNull
        assertThat(projectLogInsertResponse.rowIds()).containsExactly("string")
    }
}
