// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ViewTest {

    @Test
    fun createView() {
        val view =
            View.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("name")
                .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .objectType(View.ObjectType.ORGANIZATION)
                .viewType(View.ViewType.PROJECTS)
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .options(
                    View.Options.builder()
                        .columnOrder(listOf("string"))
                        .columnSizing(View.Options.ColumnSizing.builder().build())
                        .columnVisibility(View.Options.ColumnVisibility.builder().build())
                        .build()
                )
                .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .viewData(
                    View.ViewData.builder()
                        .search(
                            View.ViewData.Search.builder()
                                .filter(listOf(JsonValue.from(mapOf<String, Any>())))
                                .match(listOf(JsonValue.from(mapOf<String, Any>())))
                                .sort(listOf(JsonValue.from(mapOf<String, Any>())))
                                .tag(listOf(JsonValue.from(mapOf<String, Any>())))
                                .build()
                        )
                        .build()
                )
                .build()
        assertThat(view).isNotNull
        assertThat(view.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(view.name()).isEqualTo("name")
        assertThat(view.objectId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(view.objectType()).contains(View.ObjectType.ORGANIZATION)
        assertThat(view.viewType()).contains(View.ViewType.PROJECTS)
        assertThat(view.created()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(view.deletedAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(view.options())
            .contains(
                View.Options.builder()
                    .columnOrder(listOf("string"))
                    .columnSizing(View.Options.ColumnSizing.builder().build())
                    .columnVisibility(View.Options.ColumnVisibility.builder().build())
                    .build()
            )
        assertThat(view.userId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(view.viewData())
            .contains(
                View.ViewData.builder()
                    .search(
                        View.ViewData.Search.builder()
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
