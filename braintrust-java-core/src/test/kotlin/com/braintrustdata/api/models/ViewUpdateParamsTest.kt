// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.JsonValue
import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ViewUpdateParamsTest {

    @Test
    fun create() {
        ViewUpdateParams.builder()
            .viewId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .objectType(AclObjectType.ORGANIZATION)
            .name("name")
            .options(
                ViewOptions.builder()
                    .addColumnOrder("string")
                    .columnSizing(
                        ViewOptions.ColumnSizing.builder()
                            .putAdditionalProperty("foo", JsonValue.from(0))
                            .build()
                    )
                    .columnVisibility(
                        ViewOptions.ColumnVisibility.builder()
                            .putAdditionalProperty("foo", JsonValue.from(true))
                            .build()
                    )
                    .grouping("grouping")
                    .layout("layout")
                    .rowHeight("rowHeight")
                    .build()
            )
            .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .viewData(
                ViewData.builder()
                    .search(
                        ViewDataSearch.builder()
                            .addFilter(JsonValue.from(mapOf<String, Any>()))
                            .addMatch(JsonValue.from(mapOf<String, Any>()))
                            .addSort(JsonValue.from(mapOf<String, Any>()))
                            .addTag(JsonValue.from(mapOf<String, Any>()))
                            .build()
                    )
                    .build()
            )
            .viewType(ViewUpdateParams.ViewType.PROJECTS)
            .build()
    }

    @Test
    fun body() {
        val params =
            ViewUpdateParams.builder()
                .viewId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .objectType(AclObjectType.ORGANIZATION)
                .name("name")
                .options(
                    ViewOptions.builder()
                        .addColumnOrder("string")
                        .columnSizing(
                            ViewOptions.ColumnSizing.builder()
                                .putAdditionalProperty("foo", JsonValue.from(0))
                                .build()
                        )
                        .columnVisibility(
                            ViewOptions.ColumnVisibility.builder()
                                .putAdditionalProperty("foo", JsonValue.from(true))
                                .build()
                        )
                        .grouping("grouping")
                        .layout("layout")
                        .rowHeight("rowHeight")
                        .build()
                )
                .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .viewData(
                    ViewData.builder()
                        .search(
                            ViewDataSearch.builder()
                                .addFilter(JsonValue.from(mapOf<String, Any>()))
                                .addMatch(JsonValue.from(mapOf<String, Any>()))
                                .addSort(JsonValue.from(mapOf<String, Any>()))
                                .addTag(JsonValue.from(mapOf<String, Any>()))
                                .build()
                        )
                        .build()
                )
                .viewType(ViewUpdateParams.ViewType.PROJECTS)
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.objectId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.objectType()).isEqualTo(AclObjectType.ORGANIZATION)
        assertThat(body.name()).contains("name")
        assertThat(body.options())
            .contains(
                ViewOptions.builder()
                    .addColumnOrder("string")
                    .columnSizing(
                        ViewOptions.ColumnSizing.builder()
                            .putAdditionalProperty("foo", JsonValue.from(0))
                            .build()
                    )
                    .columnVisibility(
                        ViewOptions.ColumnVisibility.builder()
                            .putAdditionalProperty("foo", JsonValue.from(true))
                            .build()
                    )
                    .grouping("grouping")
                    .layout("layout")
                    .rowHeight("rowHeight")
                    .build()
            )
        assertThat(body.userId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.viewData())
            .contains(
                ViewData.builder()
                    .search(
                        ViewDataSearch.builder()
                            .addFilter(JsonValue.from(mapOf<String, Any>()))
                            .addMatch(JsonValue.from(mapOf<String, Any>()))
                            .addSort(JsonValue.from(mapOf<String, Any>()))
                            .addTag(JsonValue.from(mapOf<String, Any>()))
                            .build()
                    )
                    .build()
            )
        assertThat(body.viewType()).contains(ViewUpdateParams.ViewType.PROJECTS)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ViewUpdateParams.builder()
                .viewId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .objectType(AclObjectType.ORGANIZATION)
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.objectId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.objectType()).isEqualTo(AclObjectType.ORGANIZATION)
    }

    @Test
    fun getPathParam() {
        val params =
            ViewUpdateParams.builder()
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
