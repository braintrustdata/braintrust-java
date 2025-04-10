// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ViewListPageResponseTest {

    @Test
    fun create() {
        val viewListPageResponse =
            ViewListPageResponse.builder()
                .addObject(
                    View.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .name("name")
                        .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .objectType(AclObjectType.ORGANIZATION)
                        .viewType(View.ViewType.PROJECTS)
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
                        .build()
                )
                .build()

        assertThat(viewListPageResponse.objects())
            .containsExactly(
                View.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .name("name")
                    .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .objectType(AclObjectType.ORGANIZATION)
                    .viewType(View.ViewType.PROJECTS)
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val viewListPageResponse =
            ViewListPageResponse.builder()
                .addObject(
                    View.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .name("name")
                        .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .objectType(AclObjectType.ORGANIZATION)
                        .viewType(View.ViewType.PROJECTS)
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
                        .build()
                )
                .build()

        val roundtrippedViewListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(viewListPageResponse),
                jacksonTypeRef<ViewListPageResponse>(),
            )

        assertThat(roundtrippedViewListPageResponse).isEqualTo(viewListPageResponse)
    }
}
