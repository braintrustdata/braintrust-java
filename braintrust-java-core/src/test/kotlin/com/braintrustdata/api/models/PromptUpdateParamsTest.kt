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
import com.braintrustdata.api.models.PromptUpdateParams
import com.braintrustdata.api.models.PromptUpdateParams.PromptUpdateBody

class PromptUpdateParamsTest {

    @Test
    fun createPromptUpdateParams() {
      PromptUpdateParams.builder()
          .promptId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .description("description")
          .name("name")
          .promptData(PromptUpdateParams.PromptData.builder()
              .options(PromptUpdateParams.PromptData.Options.builder()
                  .model("model")
                  .params(PromptUpdateParams.PromptData.Options.Params.ofUnionMember0(PromptUpdateParams.PromptData.Options.Params.UnionMember0.builder()
                      .frequencyPenalty(42.23)
                      .functionCall(PromptUpdateParams.PromptData.Options.Params.UnionMember0.FunctionCall.ofUnionMember0(PromptUpdateParams.PromptData.Options.Params.UnionMember0.FunctionCall.UnionMember0.AUTO))
                      .maxTokens(42.23)
                      .n(42.23)
                      .presencePenalty(42.23)
                      .responseFormat(PromptUpdateParams.PromptData.Options.Params.UnionMember0.ResponseFormat.builder()
                          .type(PromptUpdateParams.PromptData.Options.Params.UnionMember0.ResponseFormat.Type.JSON_OBJECT)
                          .build())
                      .stop(listOf("string"))
                      .temperature(42.23)
                      .toolChoice(PromptUpdateParams.PromptData.Options.Params.UnionMember0.ToolChoice.ofUnionMember0(PromptUpdateParams.PromptData.Options.Params.UnionMember0.ToolChoice.UnionMember0.AUTO))
                      .topP(42.23)
                      .useCache(true)
                      .build()))
                  .position("position")
                  .build())
              .origin(PromptUpdateParams.PromptData.Origin.builder()
                  .projectId("project_id")
                  .promptId("prompt_id")
                  .promptVersion("prompt_version")
                  .build())
              .prompt(PromptUpdateParams.PromptData.Prompt.ofUnionMember0(PromptUpdateParams.PromptData.Prompt.UnionMember0.builder()
                  .content("content")
                  .type(PromptUpdateParams.PromptData.Prompt.UnionMember0.Type.COMPLETION)
                  .build()))
              .build())
          .tags(listOf("string"))
          .build()
    }

    @Test
    fun getBody() {
      val params = PromptUpdateParams.builder()
          .promptId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .description("description")
          .name("name")
          .promptData(PromptUpdateParams.PromptData.builder()
              .options(PromptUpdateParams.PromptData.Options.builder()
                  .model("model")
                  .params(PromptUpdateParams.PromptData.Options.Params.ofUnionMember0(PromptUpdateParams.PromptData.Options.Params.UnionMember0.builder()
                      .frequencyPenalty(42.23)
                      .functionCall(PromptUpdateParams.PromptData.Options.Params.UnionMember0.FunctionCall.ofUnionMember0(PromptUpdateParams.PromptData.Options.Params.UnionMember0.FunctionCall.UnionMember0.AUTO))
                      .maxTokens(42.23)
                      .n(42.23)
                      .presencePenalty(42.23)
                      .responseFormat(PromptUpdateParams.PromptData.Options.Params.UnionMember0.ResponseFormat.builder()
                          .type(PromptUpdateParams.PromptData.Options.Params.UnionMember0.ResponseFormat.Type.JSON_OBJECT)
                          .build())
                      .stop(listOf("string"))
                      .temperature(42.23)
                      .toolChoice(PromptUpdateParams.PromptData.Options.Params.UnionMember0.ToolChoice.ofUnionMember0(PromptUpdateParams.PromptData.Options.Params.UnionMember0.ToolChoice.UnionMember0.AUTO))
                      .topP(42.23)
                      .useCache(true)
                      .build()))
                  .position("position")
                  .build())
              .origin(PromptUpdateParams.PromptData.Origin.builder()
                  .projectId("project_id")
                  .promptId("prompt_id")
                  .promptVersion("prompt_version")
                  .build())
              .prompt(PromptUpdateParams.PromptData.Prompt.ofUnionMember0(PromptUpdateParams.PromptData.Prompt.UnionMember0.builder()
                  .content("content")
                  .type(PromptUpdateParams.PromptData.Prompt.UnionMember0.Type.COMPLETION)
                  .build()))
              .build())
          .tags(listOf("string"))
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.description()).isEqualTo("description")
      assertThat(body.name()).isEqualTo("name")
      assertThat(body.promptData()).isEqualTo(PromptUpdateParams.PromptData.builder()
          .options(PromptUpdateParams.PromptData.Options.builder()
              .model("model")
              .params(PromptUpdateParams.PromptData.Options.Params.ofUnionMember0(PromptUpdateParams.PromptData.Options.Params.UnionMember0.builder()
                  .frequencyPenalty(42.23)
                  .functionCall(PromptUpdateParams.PromptData.Options.Params.UnionMember0.FunctionCall.ofUnionMember0(PromptUpdateParams.PromptData.Options.Params.UnionMember0.FunctionCall.UnionMember0.AUTO))
                  .maxTokens(42.23)
                  .n(42.23)
                  .presencePenalty(42.23)
                  .responseFormat(PromptUpdateParams.PromptData.Options.Params.UnionMember0.ResponseFormat.builder()
                      .type(PromptUpdateParams.PromptData.Options.Params.UnionMember0.ResponseFormat.Type.JSON_OBJECT)
                      .build())
                  .stop(listOf("string"))
                  .temperature(42.23)
                  .toolChoice(PromptUpdateParams.PromptData.Options.Params.UnionMember0.ToolChoice.ofUnionMember0(PromptUpdateParams.PromptData.Options.Params.UnionMember0.ToolChoice.UnionMember0.AUTO))
                  .topP(42.23)
                  .useCache(true)
                  .build()))
              .position("position")
              .build())
          .origin(PromptUpdateParams.PromptData.Origin.builder()
              .projectId("project_id")
              .promptId("prompt_id")
              .promptVersion("prompt_version")
              .build())
          .prompt(PromptUpdateParams.PromptData.Prompt.ofUnionMember0(PromptUpdateParams.PromptData.Prompt.UnionMember0.builder()
              .content("content")
              .type(PromptUpdateParams.PromptData.Prompt.UnionMember0.Type.COMPLETION)
              .build()))
          .build())
      assertThat(body.tags()).isEqualTo(listOf("string"))
    }

    @Test
    fun getBodyWithoutOptionalFields() {
      val params = PromptUpdateParams.builder()
          .promptId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
      val params = PromptUpdateParams.builder()
          .promptId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .build()
      assertThat(params).isNotNull
      // path param "promptId"
      assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
      // out-of-bound path param
      assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
