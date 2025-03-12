// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ChatCompletionContentPartTextTest {

    @Test
    fun createChatCompletionContentPartText() {
      val chatCompletionContentPartText = ChatCompletionContentPartText.builder()
          .type(ChatCompletionContentPartText.Type.TEXT)
          .text("text")
          .build()
      assertThat(chatCompletionContentPartText).isNotNull
      assertThat(chatCompletionContentPartText.type()).isEqualTo(ChatCompletionContentPartText.Type.TEXT)
      assertThat(chatCompletionContentPartText.text()).contains("text")
    }
}
