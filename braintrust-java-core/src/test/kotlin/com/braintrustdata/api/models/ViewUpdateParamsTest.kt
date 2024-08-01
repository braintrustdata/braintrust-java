// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ViewUpdateParamsTest {

    @Test
    fun createViewUpdateParams() {
        ViewUpdateParams.builder()
            .viewId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .objectType(ViewUpdateParams.ObjectType.ORGANIZATION)
            .name("name")
            .options(
                ViewOptions.builder()
                    .columnOrder(listOf("string"))
                    .columnSizing(ViewOptions.ColumnSizing.builder().build())
                    .columnVisibility(ViewOptions.ColumnVisibility.builder().build())
                    .build()
            )
            .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .viewData(
                ViewData.builder()
                    .search(
                        ViewDataSearch.builder()
                            .filter(listOf(JsonValue.from(mapOf<String, Any>())))
                            .match(listOf(JsonValue.from(mapOf<String, Any>())))
                            .sort(listOf(JsonValue.from(mapOf<String, Any>())))
                            .tag(listOf(JsonValue.from(mapOf<String, Any>())))
                            .build()
                    )
                    .build()
            )
            .viewType(ViewUpdateParams.ViewType.PROJECTS)
            .build()
    }

    @Test
    fun getBody() {
        val params =
            ViewUpdateParams.builder()
                .viewId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .objectType(ViewUpdateParams.ObjectType.ORGANIZATION)
                .name("name")
                .options(
                    ViewOptions.builder()
                        .columnOrder(listOf("string"))
                        .columnSizing(ViewOptions.ColumnSizing.builder().build())
                        .columnVisibility(ViewOptions.ColumnVisibility.builder().build())
                        .build()
                )
                .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .viewData(
                    ViewData.builder()
                        .search(
                            ViewDataSearch.builder()
                                .filter(listOf(JsonValue.from(mapOf<String, Any>())))
                                .match(listOf(JsonValue.from(mapOf<String, Any>())))
                                .sort(listOf(JsonValue.from(mapOf<String, Any>())))
                                .tag(listOf(JsonValue.from(mapOf<String, Any>())))
                                .build()
                        )
                        .build()
                )
                .viewType(ViewUpdateParams.ViewType.PROJECTS)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.objectId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.objectType()).isEqualTo(ViewUpdateParams.ObjectType.ORGANIZATION)
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.options())
            .isEqualTo(
                ViewOptions.builder()
                    .columnOrder(listOf("string"))
                    .columnSizing(ViewOptions.ColumnSizing.builder().build())
                    .columnVisibility(ViewOptions.ColumnVisibility.builder().build())
                    .build()
            )
        assertThat(body.userId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.viewData())
            .isEqualTo(
                ViewData.builder()
                    .search(
                        ViewDataSearch.builder()
                            .filter(listOf(JsonValue.from(mapOf<String, Any>())))
                            .match(listOf(JsonValue.from(mapOf<String, Any>())))
                            .sort(listOf(JsonValue.from(mapOf<String, Any>())))
                            .tag(listOf(JsonValue.from(mapOf<String, Any>())))
                            .build()
                    )
                    .build()
            )
        assertThat(body.viewType()).isEqualTo(ViewUpdateParams.ViewType.PROJECTS)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            ViewUpdateParams.builder()
                .viewId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.objectId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun getPathParam() {
        val params =
            ViewUpdateParams.builder()
                .viewId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        assertThat(params).isNotNull
        // path param "viewId"
        assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
