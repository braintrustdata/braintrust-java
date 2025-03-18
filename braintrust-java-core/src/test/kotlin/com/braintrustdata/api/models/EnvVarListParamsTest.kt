// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EnvVarListParamsTest {

    @Test
    fun create() {
        EnvVarListParams.builder()
            .envVarName("env_var_name")
            .ids("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .limit(0L)
            .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .objectType(EnvVarObjectType.ORGANIZATION)
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
                .objectType(EnvVarObjectType.ORGANIZATION)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("env_var_name", "env_var_name")
                    .put("ids", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("limit", "0")
                    .put("object_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("object_type", "organization")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = EnvVarListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
