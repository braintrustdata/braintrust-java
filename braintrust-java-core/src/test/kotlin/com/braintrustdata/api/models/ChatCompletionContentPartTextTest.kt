// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChatCompletionContentPartTextTest {

    @Test
    fun create() {
        val chatCompletionContentPartText =
            ChatCompletionContentPartText.builder()
                .type(ChatCompletionContentPartText.Type.TEXT)
                .text("text")
                .build()

        assertThat(chatCompletionContentPartText.type())
            .isEqualTo(ChatCompletionContentPartText.Type.TEXT)
        assertThat(chatCompletionContentPartText.text()).contains("text")
    }
}
