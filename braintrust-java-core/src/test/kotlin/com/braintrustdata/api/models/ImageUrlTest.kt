// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ImageUrlTest {

    @Test
    fun createImageUrl() {
        val imageUrl = ImageUrl.builder().url("url").detail(ImageUrl.Detail.AUTO).build()
        assertThat(imageUrl).isNotNull
        assertThat(imageUrl.url()).isEqualTo("url")
        assertThat(imageUrl.detail()).contains(ImageUrl.Detail.AUTO)
    }
}
