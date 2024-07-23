// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import org.apache.hc.core5.http.ContentType
import com.braintrustdata.api.core.ContentTypes
import com.braintrustdata.api.core.JsonNull
import com.braintrustdata.api.core.JsonString
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.MultipartFormValue
import com.braintrustdata.api.models.*
import com.braintrustdata.api.models.PromptCreateParams
import com.braintrustdata.api.models.PromptCreateParams.PromptCreateBody

class PromptCreateParamsTest {

    @Test
    fun createPromptCreateParams() {
      PromptCreateParams.builder()
          .name("string")
          .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .slug("string")
          .description("string")
          .promptData(PromptCreateParams.PromptData.builder()
              .options(PromptCreateParams.PromptData.Options.builder()
                  .model("string")
                  .params(PromptCreateParams.PromptData.Options.Params.ofUnionMember0(PromptCreateParams.PromptData.Options.Params.UnionMember0.builder()
                      .frequencyPenalty(42.23)
                      .functionCall(PromptCreateParams.PromptData.Options.Params.UnionMember0.FunctionCall.ofUnionMember0(PromptCreateParams.PromptData.Options.Params.UnionMember0.FunctionCall.UnionMember0.AUTO))
                      .maxTokens(42.23)
                      .n(42.23)
                      .presencePenalty(42.23)
                      .responseFormat(PromptCreateParams.PromptData.Options.Params.UnionMember0.ResponseFormat.builder()
                          .type(PromptCreateParams.PromptData.Options.Params.UnionMember0.ResponseFormat.Type.JSON_OBJECT)
                          .build())
                      .stop(listOf("string"))
                      .temperature(42.23)
                      .toolChoice(PromptCreateParams.PromptData.Options.Params.UnionMember0.ToolChoice.ofUnionMember0(PromptCreateParams.PromptData.Options.Params.UnionMember0.ToolChoice.UnionMember0.AUTO))
                      .topP(42.23)
                      .useCache(true)
                      .build()))
                  .position("string")
                  .build())
              .origin(PromptCreateParams.PromptData.Origin.builder()
                  .projectId("string")
                  .promptId("string")
                  .promptVersion("string")
                  .build())
              .prompt(PromptCreateParams.PromptData.Prompt.ofUnionMember0(PromptCreateParams.PromptData.Prompt.UnionMember0.builder()
                  .content("string")
                  .type(PromptCreateParams.PromptData.Prompt.UnionMember0.Type.COMPLETION)
                  .build()))
              .build())
          .tags(listOf("string"))
          .build()
    }

    @Test
    fun getBody() {
      val params = PromptCreateParams.builder()
          .name("string")
          .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .slug("string")
          .description("string")
          .promptData(PromptCreateParams.PromptData.builder()
              .options(PromptCreateParams.PromptData.Options.builder()
                  .model("string")
                  .params(PromptCreateParams.PromptData.Options.Params.ofUnionMember0(PromptCreateParams.PromptData.Options.Params.UnionMember0.builder()
                      .frequencyPenalty(42.23)
                      .functionCall(PromptCreateParams.PromptData.Options.Params.UnionMember0.FunctionCall.ofUnionMember0(PromptCreateParams.PromptData.Options.Params.UnionMember0.FunctionCall.UnionMember0.AUTO))
                      .maxTokens(42.23)
                      .n(42.23)
                      .presencePenalty(42.23)
                      .responseFormat(PromptCreateParams.PromptData.Options.Params.UnionMember0.ResponseFormat.builder()
                          .type(PromptCreateParams.PromptData.Options.Params.UnionMember0.ResponseFormat.Type.JSON_OBJECT)
                          .build())
                      .stop(listOf("string"))
                      .temperature(42.23)
                      .toolChoice(PromptCreateParams.PromptData.Options.Params.UnionMember0.ToolChoice.ofUnionMember0(PromptCreateParams.PromptData.Options.Params.UnionMember0.ToolChoice.UnionMember0.AUTO))
                      .topP(42.23)
                      .useCache(true)
                      .build()))
                  .position("string")
                  .build())
              .origin(PromptCreateParams.PromptData.Origin.builder()
                  .projectId("string")
                  .promptId("string")
                  .promptVersion("string")
                  .build())
              .prompt(PromptCreateParams.PromptData.Prompt.ofUnionMember0(PromptCreateParams.PromptData.Prompt.UnionMember0.builder()
                  .content("string")
                  .type(PromptCreateParams.PromptData.Prompt.UnionMember0.Type.COMPLETION)
                  .build()))
              .build())
          .tags(listOf("string"))
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.name()).isEqualTo("string")
      assertThat(body.projectId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
      assertThat(body.slug()).isEqualTo("string")
      assertThat(body.description()).isEqualTo("string")
      assertThat(body.promptData()).isEqualTo(PromptCreateParams.PromptData.builder()
          .options(PromptCreateParams.PromptData.Options.builder()
              .model("string")
              .params(PromptCreateParams.PromptData.Options.Params.ofUnionMember0(PromptCreateParams.PromptData.Options.Params.UnionMember0.builder()
                  .frequencyPenalty(42.23)
                  .functionCall(PromptCreateParams.PromptData.Options.Params.UnionMember0.FunctionCall.ofUnionMember0(PromptCreateParams.PromptData.Options.Params.UnionMember0.FunctionCall.UnionMember0.AUTO))
                  .maxTokens(42.23)
                  .n(42.23)
                  .presencePenalty(42.23)
                  .responseFormat(PromptCreateParams.PromptData.Options.Params.UnionMember0.ResponseFormat.builder()
                      .type(PromptCreateParams.PromptData.Options.Params.UnionMember0.ResponseFormat.Type.JSON_OBJECT)
                      .build())
                  .stop(listOf("string"))
                  .temperature(42.23)
                  .toolChoice(PromptCreateParams.PromptData.Options.Params.UnionMember0.ToolChoice.ofUnionMember0(PromptCreateParams.PromptData.Options.Params.UnionMember0.ToolChoice.UnionMember0.AUTO))
                  .topP(42.23)
                  .useCache(true)
                  .build()))
              .position("string")
              .build())
          .origin(PromptCreateParams.PromptData.Origin.builder()
              .projectId("string")
              .promptId("string")
              .promptVersion("string")
              .build())
          .prompt(PromptCreateParams.PromptData.Prompt.ofUnionMember0(PromptCreateParams.PromptData.Prompt.UnionMember0.builder()
              .content("string")
              .type(PromptCreateParams.PromptData.Prompt.UnionMember0.Type.COMPLETION)
              .build()))
          .build())
      assertThat(body.tags()).isEqualTo(listOf("string"))
    }

    @Test
    fun getBodyWithoutOptionalFields() {
      val params = PromptCreateParams.builder()
          .name("string")
          .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .slug("string")
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.name()).isEqualTo("string")
      assertThat(body.projectId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
      assertThat(body.slug()).isEqualTo("string")
    }
}
