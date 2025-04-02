// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
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

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val chatCompletionContentPartText =
            ChatCompletionContentPartText.builder()
                .type(ChatCompletionContentPartText.Type.TEXT)
                .text("text")
                .build()

        val roundtrippedChatCompletionContentPartText =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(chatCompletionContentPartText),
                jacksonTypeRef<ChatCompletionContentPartText>(),
            )

        assertThat(roundtrippedChatCompletionContentPartText)
            .isEqualTo(chatCompletionContentPartText)
    }
}
