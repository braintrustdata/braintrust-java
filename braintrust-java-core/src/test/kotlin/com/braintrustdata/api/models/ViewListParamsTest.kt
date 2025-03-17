// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ViewListParamsTest {

    @Test
    fun create() {
        ViewListParams.builder()
            .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .objectType(AclObjectType.ORGANIZATION)
            .endingBefore("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .ids("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .limit(0L)
            .startingAfter("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .viewName("view_name")
            .viewType(ViewType.PROJECTS)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            ViewListParams.builder()
                .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .objectType(AclObjectType.ORGANIZATION)
                .endingBefore("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .ids("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .limit(0L)
                .startingAfter("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .viewName("view_name")
                .viewType(ViewType.PROJECTS)
                .build()
        val expected = QueryParams.builder()
        expected.put("object_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        expected.put("object_type", AclObjectType.ORGANIZATION.toString())
        expected.put("ending_before", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        expected.put(
            "ids",
            ViewListParams.Ids.ofString("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").toString(),
        )
        expected.put("limit", "0")
        expected.put("starting_after", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        expected.put("view_name", "view_name")
        expected.put("view_type", ViewType.PROJECTS.toString())
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            ViewListParams.builder()
                .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .objectType(AclObjectType.ORGANIZATION)
                .build()
        val expected = QueryParams.builder()
        expected.put("object_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        expected.put("object_type", AclObjectType.ORGANIZATION.toString())
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }
}
