// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SpanIFrameTest {

    @Test
    fun create() {
        val spanIFrame =
            SpanIFrame.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("name")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .url("url")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .postMessage(true)
                .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(spanIFrame.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(spanIFrame.name()).isEqualTo("name")
        assertThat(spanIFrame.projectId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(spanIFrame.url()).isEqualTo("url")
        assertThat(spanIFrame.created()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(spanIFrame.deletedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(spanIFrame.description()).contains("description")
        assertThat(spanIFrame.postMessage()).contains(true)
        assertThat(spanIFrame.userId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val spanIFrame =
            SpanIFrame.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("name")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .url("url")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .postMessage(true)
                .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val roundtrippedSpanIFrame =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(spanIFrame),
                jacksonTypeRef<SpanIFrame>(),
            )

        assertThat(roundtrippedSpanIFrame).isEqualTo(spanIFrame)
    }
}
