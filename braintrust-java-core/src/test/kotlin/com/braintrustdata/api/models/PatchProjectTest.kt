// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PatchProjectTest {

    @Test
    fun createPatchProject() {
        val patchProject =
            PatchProject.builder()
                .name("name")
                .settings(PatchProject.Settings.builder().comparisonKey("comparison_key").build())
                .build()
        assertThat(patchProject).isNotNull
        assertThat(patchProject.name()).contains("name")
        assertThat(patchProject.settings())
            .contains(PatchProject.Settings.builder().comparisonKey("comparison_key").build())
    }
}
