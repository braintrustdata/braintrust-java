// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.models.*
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ViewCreateParamsTest {

    @Test
    fun createViewCreateParams() {
        ViewCreateParams.builder()
            .name("name")
            .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .objectType(ViewCreateParams.ObjectType.ORGANIZATION)
            .viewType(ViewCreateParams.ViewType.PROJECTS)
            .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .options(
                ViewCreateParams.Options.builder()
                    .columnOrder(listOf("string"))
                    .columnSizing(ViewCreateParams.Options.ColumnSizing.builder().build())
                    .columnVisibility(ViewCreateParams.Options.ColumnVisibility.builder().build())
                    .build()
            )
            .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .viewData(
                ViewCreateParams.ViewData.builder()
                    .search(
                        ViewCreateParams.ViewData.Search.builder()
                            .filter(listOf(JsonValue.from(mapOf<String, Any>())))
                            .match(listOf(JsonValue.from(mapOf<String, Any>())))
                            .sort(listOf(JsonValue.from(mapOf<String, Any>())))
                            .tag(listOf(JsonValue.from(mapOf<String, Any>())))
                            .build()
                    )
                    .build()
            )
            .build()
    }

    @Test
    fun getBody() {
        val params =
            ViewCreateParams.builder()
                .name("name")
                .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .objectType(ViewCreateParams.ObjectType.ORGANIZATION)
                .viewType(ViewCreateParams.ViewType.PROJECTS)
                .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .options(
                    ViewCreateParams.Options.builder()
                        .columnOrder(listOf("string"))
                        .columnSizing(ViewCreateParams.Options.ColumnSizing.builder().build())
                        .columnVisibility(
                            ViewCreateParams.Options.ColumnVisibility.builder().build()
                        )
                        .build()
                )
                .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .viewData(
                    ViewCreateParams.ViewData.builder()
                        .search(
                            ViewCreateParams.ViewData.Search.builder()
                                .filter(listOf(JsonValue.from(mapOf<String, Any>())))
                                .match(listOf(JsonValue.from(mapOf<String, Any>())))
                                .sort(listOf(JsonValue.from(mapOf<String, Any>())))
                                .tag(listOf(JsonValue.from(mapOf<String, Any>())))
                                .build()
                        )
                        .build()
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.objectId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.objectType()).isEqualTo(ViewCreateParams.ObjectType.ORGANIZATION)
        assertThat(body.viewType()).isEqualTo(ViewCreateParams.ViewType.PROJECTS)
        assertThat(body.deletedAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.options())
            .isEqualTo(
                ViewCreateParams.Options.builder()
                    .columnOrder(listOf("string"))
                    .columnSizing(ViewCreateParams.Options.ColumnSizing.builder().build())
                    .columnVisibility(ViewCreateParams.Options.ColumnVisibility.builder().build())
                    .build()
            )
        assertThat(body.userId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.viewData())
            .isEqualTo(
                ViewCreateParams.ViewData.builder()
                    .search(
                        ViewCreateParams.ViewData.Search.builder()
                            .filter(listOf(JsonValue.from(mapOf<String, Any>())))
                            .match(listOf(JsonValue.from(mapOf<String, Any>())))
                            .sort(listOf(JsonValue.from(mapOf<String, Any>())))
                            .tag(listOf(JsonValue.from(mapOf<String, Any>())))
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            ViewCreateParams.builder()
                .name("name")
                .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.objectId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
