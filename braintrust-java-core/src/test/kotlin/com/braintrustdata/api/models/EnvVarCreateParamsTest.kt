// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EnvVarCreateParamsTest {

    @Test
    fun createEnvVarCreateParams() {
        EnvVarCreateParams.builder()
            .name("name")
            .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .objectType(EnvVarCreateParams.ObjectType.ORGANIZATION)
            .value("value")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            EnvVarCreateParams.builder()
                .name("name")
                .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .objectType(EnvVarCreateParams.ObjectType.ORGANIZATION)
                .value("value")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.objectId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.objectType()).isEqualTo(EnvVarCreateParams.ObjectType.ORGANIZATION)
        assertThat(body.value()).isEqualTo("value")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            EnvVarCreateParams.builder()
                .name("name")
                .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .objectType(EnvVarCreateParams.ObjectType.ORGANIZATION)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.objectId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.objectType()).isEqualTo(EnvVarCreateParams.ObjectType.ORGANIZATION)
    }
}
