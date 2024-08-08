// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class GroupListParamsTest {

    @Test
    fun createGroupListParams() {
        GroupListParams.builder()
            .endingBefore("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .groupName("group_name")
            .ids(Ids.ofString("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
            .limit(123L)
            .orgName("org_name")
            .startingAfter("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            GroupListParams.builder()
                .endingBefore("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .groupName("group_name")
                .ids(Ids.ofString("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                .limit(123L)
                .orgName("org_name")
                .startingAfter("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("ending_before", listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
        expected.put("group_name", listOf("group_name"))
        expected.put(
            "ids",
            listOf(GroupListParams.Ids.ofString("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").toString())
        )
        expected.put("limit", listOf("123"))
        expected.put("org_name", listOf("org_name"))
        expected.put("starting_after", listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = GroupListParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
