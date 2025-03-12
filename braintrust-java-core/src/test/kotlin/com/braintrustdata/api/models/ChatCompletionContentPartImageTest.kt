// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ChatCompletionContentPartImageTest {

    @Test
    fun createChatCompletionContentPartImage() {
        val chatCompletionContentPartImage =
            ChatCompletionContentPartImage.builder()
                .imageUrl(
                    ChatCompletionContentPartImage.ImageUrl.builder()
                        .url("url")
                        .detail(ChatCompletionContentPartImage.ImageUrl.Detail.AUTO)
                        .build()
                )
                .type(ChatCompletionContentPartImage.Type.IMAGE_URL)
                .build()
        assertThat(chatCompletionContentPartImage).isNotNull
        assertThat(chatCompletionContentPartImage.imageUrl())
            .isEqualTo(
                ChatCompletionContentPartImage.ImageUrl.builder()
                    .url("url")
                    .detail(ChatCompletionContentPartImage.ImageUrl.Detail.AUTO)
                    .build()
            )
        assertThat(chatCompletionContentPartImage.type())
            .isEqualTo(ChatCompletionContentPartImage.Type.IMAGE_URL)
    }
}
