// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PromptOptionsTest {

    @Test
    fun createPromptOptions() {
        val promptOptions =
            PromptOptions.builder()
                .model("model")
                .params(
                    PromptOptions.Params.AnthropicModelParams.builder()
                        .maxTokens(0.0)
                        .temperature(0.0)
                        .topP(0.0)
                        .useCache(true)
                        .build()
                )
                .position("position")
                .build()
        assertThat(promptOptions).isNotNull
        assertThat(promptOptions.model()).contains("model")
        assertThat(promptOptions.params())
            .contains(
                PromptOptions.Params.ofAnthropicModel(
                    PromptOptions.Params.AnthropicModelParams.builder()
                        .maxTokens(0.0)
                        .temperature(0.0)
                        .topP(0.0)
                        .useCache(true)
                        .build()
                )
            )
        assertThat(promptOptions.position()).contains("position")
    }
}
