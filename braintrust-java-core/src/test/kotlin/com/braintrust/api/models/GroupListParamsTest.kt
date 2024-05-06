// File generated from our OpenAPI spec by Stainless.

package com.braintrust.api.models

import com.braintrust.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class GroupListParamsTest {

    @Test
    fun createGroupListParams() {
        GroupListParams.builder()
            .endingBefore("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .groupName("string")
            .ids(GroupListParams.Ids.ofString("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
            .limit(123L)
            .orgName("string")
            .startingAfter("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            GroupListParams.builder()
                .endingBefore("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .groupName("string")
                .ids(GroupListParams.Ids.ofString("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                .limit(123L)
                .orgName("string")
                .startingAfter("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("ending_before", listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
        expected.put("group_name", listOf("string"))
        expected.put(
            "ids",
            listOf(GroupListParams.Ids.ofString("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").toString())
        )
        expected.put("limit", listOf("123"))
        expected.put("org_name", listOf("string"))
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
