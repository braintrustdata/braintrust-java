// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChatCompletionMessageToolCallTest {

    @Test
    fun create() {
        val chatCompletionMessageToolCall =
            ChatCompletionMessageToolCall.builder()
                .id("id")
                .function(
                    ChatCompletionMessageToolCall.Function.builder()
                        .arguments("arguments")
                        .name("name")
                        .build()
                )
                .type(ChatCompletionMessageToolCall.Type.FUNCTION)
                .build()

        assertThat(chatCompletionMessageToolCall.id()).isEqualTo("id")
        assertThat(chatCompletionMessageToolCall.function())
            .isEqualTo(
                ChatCompletionMessageToolCall.Function.builder()
                    .arguments("arguments")
                    .name("name")
                    .build()
            )
        assertThat(chatCompletionMessageToolCall.type())
            .isEqualTo(ChatCompletionMessageToolCall.Type.FUNCTION)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val chatCompletionMessageToolCall =
            ChatCompletionMessageToolCall.builder()
                .id("id")
                .function(
                    ChatCompletionMessageToolCall.Function.builder()
                        .arguments("arguments")
                        .name("name")
                        .build()
                )
                .type(ChatCompletionMessageToolCall.Type.FUNCTION)
                .build()

        val roundtrippedChatCompletionMessageToolCall =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(chatCompletionMessageToolCall),
                jacksonTypeRef<ChatCompletionMessageToolCall>(),
            )

        assertThat(roundtrippedChatCompletionMessageToolCall)
            .isEqualTo(chatCompletionMessageToolCall)
    }
}
