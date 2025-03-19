// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.JsonValue
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InsertDatasetEventTest {

    @Test
    fun create() {
        val insertDatasetEvent =
            InsertDatasetEvent.builder()
                .id("id")
                ._isMerge(true)
                .addMergePath(listOf("string"))
                ._objectDelete(true)
                ._parentId("_parent_id")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .expected(JsonValue.from(mapOf<String, Any>()))
                .input(JsonValue.from(mapOf<String, Any>()))
                .metadata(InsertDatasetEvent.Metadata.builder().model("model").build())
                .origin(
                    ObjectReference.builder()
                        .id("id")
                        ._xactId("_xact_id")
                        .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .objectType(ObjectReference.ObjectType.EXPERIMENT)
                        .created("created")
                        .build()
                )
                .rootSpanId("root_span_id")
                .spanId("span_id")
                .addSpanParent("string")
                .addTag("string")
                .build()

        assertThat(insertDatasetEvent.id()).contains("id")
        assertThat(insertDatasetEvent._isMerge()).contains(true)
        assertThat(insertDatasetEvent._mergePaths().getOrNull()).containsExactly(listOf("string"))
        assertThat(insertDatasetEvent._objectDelete()).contains(true)
        assertThat(insertDatasetEvent._parentId()).contains("_parent_id")
        assertThat(insertDatasetEvent.created())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(insertDatasetEvent._expected()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(insertDatasetEvent._input()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(insertDatasetEvent.metadata())
            .contains(InsertDatasetEvent.Metadata.builder().model("model").build())
        assertThat(insertDatasetEvent.origin())
            .contains(
                ObjectReference.builder()
                    .id("id")
                    ._xactId("_xact_id")
                    .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .objectType(ObjectReference.ObjectType.EXPERIMENT)
                    .created("created")
                    .build()
            )
        assertThat(insertDatasetEvent.rootSpanId()).contains("root_span_id")
        assertThat(insertDatasetEvent.spanId()).contains("span_id")
        assertThat(insertDatasetEvent.spanParents().getOrNull()).containsExactly("string")
        assertThat(insertDatasetEvent.tags().getOrNull()).containsExactly("string")
    }
}
