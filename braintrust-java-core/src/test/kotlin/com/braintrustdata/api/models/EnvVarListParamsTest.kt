// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EnvVarListParamsTest {

    @Test
    fun createEnvVarListParams() {
        EnvVarListParams.builder()
            .envVarName("env_var_name")
            .ids(EnvVarListParams.Ids.ofString("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
            .limit(123L)
            .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .objectType(EnvVarListParams.ObjectType.ORGANIZATION)
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            EnvVarListParams.builder()
                .envVarName("env_var_name")
                .ids(EnvVarListParams.Ids.ofString("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                .limit(123L)
                .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .objectType(EnvVarListParams.ObjectType.ORGANIZATION)
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("env_var_name", listOf("env_var_name"))
        expected.put(
            "ids",
            listOf(EnvVarListParams.Ids.ofString("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").toString())
        )
        expected.put("limit", listOf("123"))
        expected.put("object_id", listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
        expected.put("object_type", listOf(EnvVarListParams.ObjectType.ORGANIZATION.toString()))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = EnvVarListParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
