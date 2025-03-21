// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ViewDeleteParamsTest {

    @Test
    fun create() {
        ViewDeleteParams.builder()
            .viewId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .objectType(AclObjectType.ORGANIZATION)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ViewDeleteParams.builder()
                .viewId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .objectType(AclObjectType.ORGANIZATION)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ViewDeleteParams.builder()
                .viewId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .objectType(AclObjectType.ORGANIZATION)
                .build()

        val body = params._body()

        assertThat(body.objectId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.objectType()).isEqualTo(AclObjectType.ORGANIZATION)
    }
}
