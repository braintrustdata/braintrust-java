// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class UserListParamsTest {

    @Test
    fun createUserListParams() {
        UserListParams.builder()
            .email(UserEmail.ofString("string"))
            .endingBefore("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .familyName(UserFamilyName.ofString("string"))
            .givenName(UserGivenName.ofString("string"))
            .ids(Ids.ofString("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
            .limit(123L)
            .orgName("org_name")
            .startingAfter("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            UserListParams.builder()
                .email(UserEmail.ofString("string"))
                .endingBefore("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .familyName(UserFamilyName.ofString("string"))
                .givenName(UserGivenName.ofString("string"))
                .ids(Ids.ofString("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                .limit(123L)
                .orgName("org_name")
                .startingAfter("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("email", listOf(UserListParams.UserEmail.ofString("string").toString()))
        expected.put("ending_before", listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
        expected.put(
            "family_name",
            listOf(UserListParams.UserFamilyName.ofString("string").toString())
        )
        expected.put(
            "given_name",
            listOf(UserListParams.UserGivenName.ofString("string").toString())
        )
        expected.put(
            "ids",
            listOf(UserListParams.Ids.ofString("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").toString())
        )
        expected.put("limit", listOf("123"))
        expected.put("org_name", listOf("org_name"))
        expected.put("starting_after", listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = UserListParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
