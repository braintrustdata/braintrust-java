// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PatchViewTest {

    @Test
    fun createPatchView() {
        val patchView =
            PatchView.builder()
                .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .objectType(PatchView.ObjectType.ORGANIZATION)
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
                .viewType(PatchView.ViewType.PROJECTS)
                .build()
        assertThat(patchView).isNotNull
        assertThat(patchView.objectId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(patchView.objectType()).contains(PatchView.ObjectType.ORGANIZATION)
        assertThat(patchView.name()).contains("name")
        assertThat(patchView.options())
            .contains(
                ViewOptions.builder()
                    .columnOrder(listOf("string"))
                    .columnSizing(ViewOptions.ColumnSizing.builder().build())
                    .columnVisibility(ViewOptions.ColumnVisibility.builder().build())
                    .build()
            )
        assertThat(patchView.userId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(patchView.viewData())
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
        assertThat(patchView.viewType()).contains(PatchView.ViewType.PROJECTS)
    }
}
