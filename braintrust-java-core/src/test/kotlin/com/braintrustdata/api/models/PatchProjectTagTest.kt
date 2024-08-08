// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PatchProjectTagTest {

    @Test
    fun createPatchProjectTag() {
        val patchProjectTag =
            PatchProjectTag.builder().color("color").description("description").name("name").build()
        assertThat(patchProjectTag).isNotNull
        assertThat(patchProjectTag.color()).contains("color")
        assertThat(patchProjectTag.description()).contains("description")
        assertThat(patchProjectTag.name()).contains("name")
    }
}
