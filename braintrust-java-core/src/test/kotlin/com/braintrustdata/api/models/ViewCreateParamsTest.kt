// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ViewCreateParamsTest {

    @Test
    fun create() {
        ViewCreateParams.builder()
            .name("name")
            .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .objectType(ViewCreateParams.ObjectType.ORGANIZATION)
            .viewType(ViewCreateParams.ViewType.PROJECTS)
            .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
            .build()
    }

    @Test
    fun body() {
        val params =
            ViewCreateParams.builder()
                .name("name")
                .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .objectType(ViewCreateParams.ObjectType.ORGANIZATION)
                .viewType(ViewCreateParams.ViewType.PROJECTS)
                .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
                .build()

        val body = params._body()

        assertThat(body).isNotNull
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.objectId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.objectType()).isEqualTo(ViewCreateParams.ObjectType.ORGANIZATION)
        assertThat(body.viewType()).contains(ViewCreateParams.ViewType.PROJECTS)
        assertThat(body.deletedAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ViewCreateParams.builder()
                .name("name")
                .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .objectType(ViewCreateParams.ObjectType.ORGANIZATION)
                .viewType(ViewCreateParams.ViewType.PROJECTS)
                .build()

        val body = params._body()

        assertThat(body).isNotNull
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.objectId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.objectType()).isEqualTo(ViewCreateParams.ObjectType.ORGANIZATION)
        assertThat(body.viewType()).contains(ViewCreateParams.ViewType.PROJECTS)
    }
}
