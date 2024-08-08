// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ProjectListParamsTest {

    @Test
    fun createProjectListParams() {
        ProjectListParams.builder()
            .endingBefore("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .ids(Ids.ofString("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
            .limit(123L)
            .orgName("org_name")
            .projectName("project_name")
            .startingAfter("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            ProjectListParams.builder()
                .endingBefore("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .ids(Ids.ofString("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                .limit(123L)
                .orgName("org_name")
                .projectName("project_name")
                .startingAfter("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("ending_before", listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
        expected.put(
            "ids",
            listOf(
                ProjectListParams.Ids.ofString("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").toString()
            )
        )
        expected.put("limit", listOf("123"))
        expected.put("org_name", listOf("org_name"))
        expected.put("project_name", listOf("project_name"))
        expected.put("starting_after", listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = ProjectListParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
