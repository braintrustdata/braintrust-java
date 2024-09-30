// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.JsonNull
import com.braintrustdata.api.models.*
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ViewReplaceParamsTest {

    @Test
    fun createViewReplaceParams() {
        ViewReplaceParams.builder()
            .name("name")
            .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .objectType(ViewReplaceParams.ObjectType.ORGANIZATION)
            .viewType(ViewReplaceParams.ViewType.PROJECTS)
            .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
                            .filter(listOf(JsonNull.of()))
                            .match(listOf(JsonNull.of()))
                            .sort(listOf(JsonNull.of()))
                            .tag(listOf(JsonNull.of()))
                            .build()
                    )
                    .build()
            )
            .build()
    }

    @Test
    fun getBody() {
        val params =
            ViewReplaceParams.builder()
                .name("name")
                .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .objectType(ViewReplaceParams.ObjectType.ORGANIZATION)
                .viewType(ViewReplaceParams.ViewType.PROJECTS)
                .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
                                .filter(listOf(JsonNull.of()))
                                .match(listOf(JsonNull.of()))
                                .sort(listOf(JsonNull.of()))
                                .tag(listOf(JsonNull.of()))
                                .build()
                        )
                        .build()
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.objectId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.objectType()).isEqualTo(ViewReplaceParams.ObjectType.ORGANIZATION)
        assertThat(body.viewType()).isEqualTo(ViewReplaceParams.ViewType.PROJECTS)
        assertThat(body.deletedAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
                            .filter(listOf(JsonNull.of()))
                            .match(listOf(JsonNull.of()))
                            .sort(listOf(JsonNull.of()))
                            .tag(listOf(JsonNull.of()))
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            ViewReplaceParams.builder()
                .name("name")
                .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .objectType(ViewReplaceParams.ObjectType.ORGANIZATION)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.objectId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.objectType()).isEqualTo(ViewReplaceParams.ObjectType.ORGANIZATION)
    }
}
