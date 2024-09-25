// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ViewRetrieveParamsTest {

    @Test
    fun createViewRetrieveParams() {
        ViewRetrieveParams.builder()
            .viewId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .objectType(ViewRetrieveParams.ObjectType.ORGANIZATION)
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            ViewRetrieveParams.builder()
                .viewId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .objectType(ViewRetrieveParams.ObjectType.ORGANIZATION)
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("object_id", listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
        expected.put("object_type", listOf(ViewRetrieveParams.ObjectType.ORGANIZATION.toString()))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params =
            ViewRetrieveParams.builder()
                .viewId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .objectType(ViewRetrieveParams.ObjectType.ORGANIZATION)
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("object_id", listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
        expected.put("object_type", listOf(ViewRetrieveParams.ObjectType.ORGANIZATION.toString()))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getPathParam() {
        val params =
            ViewRetrieveParams.builder()
                .viewId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .objectType(ViewRetrieveParams.ObjectType.ORGANIZATION)
                .build()
        assertThat(params).isNotNull
        // path param "viewId"
        assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
