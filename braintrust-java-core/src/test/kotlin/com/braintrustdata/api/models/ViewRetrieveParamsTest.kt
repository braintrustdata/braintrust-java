// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ViewRetrieveParamsTest {

    @Test
    fun create() {
        ViewRetrieveParams.builder()
            .viewId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .objectType(AclObjectType.ORGANIZATION)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            ViewRetrieveParams.builder()
                .viewId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .objectType(AclObjectType.ORGANIZATION)
                .build()
        val expected = QueryParams.builder()
        expected.put("object_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        expected.put("object_type", AclObjectType.ORGANIZATION.toString())
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            ViewRetrieveParams.builder()
                .viewId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .objectType(AclObjectType.ORGANIZATION)
                .build()
        val expected = QueryParams.builder()
        expected.put("object_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        expected.put("object_type", AclObjectType.ORGANIZATION.toString())
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getPathParam() {
        val params =
            ViewRetrieveParams.builder()
                .viewId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .objectType(AclObjectType.ORGANIZATION)
                .build()
        assertThat(params).isNotNull
        // path param "viewId"
        assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
