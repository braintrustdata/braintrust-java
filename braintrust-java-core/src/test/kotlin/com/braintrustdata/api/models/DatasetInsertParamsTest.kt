// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.JsonNull
import com.braintrustdata.api.models.*
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DatasetInsertParamsTest {

    @Test
    fun createDatasetInsertParams() {
        DatasetInsertParams.builder()
            .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .events(
                listOf(
                    InsertDatasetEvent.builder()
                        .id("id")
                        ._isMerge(true)
                        ._mergePaths(listOf(listOf("string")))
                        ._objectDelete(true)
                        ._parentId("_parent_id")
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .expected(JsonNull.of())
                        .input(JsonNull.of())
                        .metadata(InsertDatasetEvent.Metadata.builder().build())
                        .rootSpanId("root_span_id")
                        .spanId("span_id")
                        .spanParents(listOf("string"))
                        .tags(listOf("string"))
                        .build()
                )
            )
            .build()
    }

    @Test
    fun getBody() {
        val params =
            DatasetInsertParams.builder()
                .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .events(
                    listOf(
                        InsertDatasetEvent.builder()
                            .id("id")
                            ._isMerge(true)
                            ._mergePaths(listOf(listOf("string")))
                            ._objectDelete(true)
                            ._parentId("_parent_id")
                            .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .expected(JsonNull.of())
                            .input(JsonNull.of())
                            .metadata(InsertDatasetEvent.Metadata.builder().build())
                            .rootSpanId("root_span_id")
                            .spanId("span_id")
                            .spanParents(listOf("string"))
                            .tags(listOf("string"))
                            .build()
                    )
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.events())
            .isEqualTo(
                listOf(
                    InsertDatasetEvent.builder()
                        .id("id")
                        ._isMerge(true)
                        ._mergePaths(listOf(listOf("string")))
                        ._objectDelete(true)
                        ._parentId("_parent_id")
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .expected(JsonNull.of())
                        .input(JsonNull.of())
                        .metadata(InsertDatasetEvent.Metadata.builder().build())
                        .rootSpanId("root_span_id")
                        .spanId("span_id")
                        .spanParents(listOf("string"))
                        .tags(listOf("string"))
                        .build()
                )
            )
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            DatasetInsertParams.builder()
                .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .events(listOf(InsertDatasetEvent.builder().build()))
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.events()).isEqualTo(listOf(InsertDatasetEvent.builder().build()))
    }

    @Test
    fun getPathParam() {
        val params =
            DatasetInsertParams.builder()
                .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .events(listOf(InsertDatasetEvent.builder().build()))
                .build()
        assertThat(params).isNotNull
        // path param "datasetId"
        assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
