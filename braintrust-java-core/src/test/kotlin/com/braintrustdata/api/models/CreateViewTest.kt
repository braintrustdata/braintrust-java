// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CreateViewTest {

    @Test
    fun createCreateView() {
        val createView =
            CreateView.builder()
                .name("name")
                .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .objectType(CreateView.ObjectType.ORGANIZATION)
                .viewType(CreateView.ViewType.PROJECTS)
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
                                .filter(listOf(JsonValue.from(mapOf<String, Any>())))
                                .match(listOf(JsonValue.from(mapOf<String, Any>())))
                                .sort(listOf(JsonValue.from(mapOf<String, Any>())))
                                .tag(listOf(JsonValue.from(mapOf<String, Any>())))
                                .build()
                        )
                        .build()
                )
                .build()
        assertThat(createView).isNotNull
        assertThat(createView.name()).isEqualTo("name")
        assertThat(createView.objectId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(createView.objectType()).contains(CreateView.ObjectType.ORGANIZATION)
        assertThat(createView.viewType()).contains(CreateView.ViewType.PROJECTS)
        assertThat(createView.deletedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(createView.options())
            .contains(
                ViewOptions.builder()
                    .columnOrder(listOf("string"))
                    .columnSizing(ViewOptions.ColumnSizing.builder().build())
                    .columnVisibility(ViewOptions.ColumnVisibility.builder().build())
                    .build()
            )
        assertThat(createView.userId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(createView.viewData())
            .contains(
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
    }
}
