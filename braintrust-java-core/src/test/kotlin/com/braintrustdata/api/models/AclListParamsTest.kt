// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AclListParamsTest {

    @Test
    fun create() {
        AclListParams.builder()
            .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .objectType(AclListParams.ObjectType.ORGANIZATION)
            .endingBefore("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .ids("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .limit(0L)
            .startingAfter("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            AclListParams.builder()
                .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .objectType(AclListParams.ObjectType.ORGANIZATION)
                .endingBefore("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .ids("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .limit(0L)
                .startingAfter("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val expected = QueryParams.builder()
        expected.put("object_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        expected.put("object_type", AclListParams.ObjectType.ORGANIZATION.toString())
        expected.put("ending_before", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        expected.put(
            "ids",
            AclListParams.Ids.ofString("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").toString()
        )
        expected.put("limit", "0")
        expected.put("starting_after", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            AclListParams.builder()
                .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .objectType(AclListParams.ObjectType.ORGANIZATION)
                .build()
        val expected = QueryParams.builder()
        expected.put("object_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        expected.put("object_type", AclListParams.ObjectType.ORGANIZATION.toString())
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }
}
