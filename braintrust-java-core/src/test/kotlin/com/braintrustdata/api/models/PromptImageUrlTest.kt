// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PromptImageUrlTest {

    @Test
    fun createPromptImageUrl() {
        val promptImageUrl =
            PromptImageUrl.builder().url("url").detail(PromptImageUrl.Detail.AUTO).build()
        assertThat(promptImageUrl).isNotNull
        assertThat(promptImageUrl.url()).isEqualTo("url")
        assertThat(promptImageUrl.detail()).contains(PromptImageUrl.Detail.AUTO)
    }
}
