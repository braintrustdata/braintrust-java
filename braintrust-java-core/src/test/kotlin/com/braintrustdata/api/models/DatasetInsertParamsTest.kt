// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.JsonValue
import java.time.OffsetDateTime
import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DatasetInsertParamsTest {

    @Test
    fun create() {
        DatasetInsertParams.builder()
            .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .addEvent(
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
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            DatasetInsertParams.builder()
                .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addEvent(InsertDatasetEvent.builder().build())
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            DatasetInsertParams.builder()
                .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addEvent(
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
                )
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.events())
            .containsExactly(
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
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            DatasetInsertParams.builder()
                .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addEvent(InsertDatasetEvent.builder().build())
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.events()).containsExactly(InsertDatasetEvent.builder().build())
    }
}
