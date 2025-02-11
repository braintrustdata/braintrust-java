// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PromptListParamsTest {

    @Test
    fun create() {
        PromptListParams.builder()
            .endingBefore("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .ids("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .limit(0L)
            .orgName("org_name")
            .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .projectName("project_name")
            .promptName("prompt_name")
            .slug("slug")
            .startingAfter("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .version("version")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            PromptListParams.builder()
                .endingBefore("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .ids("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .limit(0L)
                .orgName("org_name")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .projectName("project_name")
                .promptName("prompt_name")
                .slug("slug")
                .startingAfter("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .version("version")
                .build()
        val expected = QueryParams.builder()
        expected.put("ending_before", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        expected.put(
            "ids",
            PromptListParams.Ids.ofString("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").toString()
        )
        expected.put("limit", "0")
        expected.put("org_name", "org_name")
        expected.put("project_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        expected.put("project_name", "project_name")
        expected.put("prompt_name", "prompt_name")
        expected.put("slug", "slug")
        expected.put("starting_after", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        expected.put("version", "version")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = PromptListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }
}
