// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EnvVarListParamsTest {

    @Test
    fun create() {
        EnvVarListParams.builder()
            .envVarName("env_var_name")
            .ids("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .limit(0L)
            .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .objectType(EnvVarListParams.ObjectType.ORGANIZATION)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            EnvVarListParams.builder()
                .envVarName("env_var_name")
                .ids("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .limit(0L)
                .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .objectType(EnvVarListParams.ObjectType.ORGANIZATION)
                .build()
        val expected = QueryParams.builder()
        expected.put("env_var_name", "env_var_name")
        expected.put(
            "ids",
            EnvVarListParams.Ids.ofString("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").toString(),
        )
        expected.put("limit", "0")
        expected.put("object_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        expected.put("object_type", EnvVarListParams.ObjectType.ORGANIZATION.toString())
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = EnvVarListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }
}
