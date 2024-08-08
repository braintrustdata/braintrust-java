// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.JsonValue
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
                    DatasetInsertParams.Event.ofInsertDatasetEventReplace(
                        DatasetInsertParams.Event.InsertDatasetEventReplace.builder()
                            .id("id")
                            ._isMerge(true)
                            ._objectDelete(true)
                            ._parentId("_parent_id")
                            .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .expected(JsonValue.from(mapOf<String, Any>()))
                            .input(JsonValue.from(mapOf<String, Any>()))
                            .metadata(
                                DatasetInsertParams.Event.InsertDatasetEventReplace.Metadata
                                    .builder()
                                    .build()
                            )
                            .tags(listOf("string"))
                            .build()
                    )
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
                        DatasetInsertParams.Event.ofInsertDatasetEventReplace(
                            DatasetInsertParams.Event.InsertDatasetEventReplace.builder()
                                .id("id")
                                ._isMerge(true)
                                ._objectDelete(true)
                                ._parentId("_parent_id")
                                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .expected(JsonValue.from(mapOf<String, Any>()))
                                .input(JsonValue.from(mapOf<String, Any>()))
                                .metadata(
                                    DatasetInsertParams.Event.InsertDatasetEventReplace.Metadata
                                        .builder()
                                        .build()
                                )
                                .tags(listOf("string"))
                                .build()
                        )
                    )
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.events())
            .isEqualTo(
                listOf(
                    DatasetInsertParams.Event.ofInsertDatasetEventReplace(
                        DatasetInsertParams.Event.InsertDatasetEventReplace.builder()
                            .id("id")
                            ._isMerge(true)
                            ._objectDelete(true)
                            ._parentId("_parent_id")
                            .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .expected(JsonValue.from(mapOf<String, Any>()))
                            .input(JsonValue.from(mapOf<String, Any>()))
                            .metadata(
                                DatasetInsertParams.Event.InsertDatasetEventReplace.Metadata
                                    .builder()
                                    .build()
                            )
                            .tags(listOf("string"))
                            .build()
                    )
                )
            )
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            DatasetInsertParams.builder()
                .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .events(
                    listOf(
                        DatasetInsertParams.Event.ofInsertDatasetEventReplace(
                            DatasetInsertParams.Event.InsertDatasetEventReplace.builder().build()
                        )
                    )
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.events())
            .isEqualTo(
                listOf(
                    DatasetInsertParams.Event.ofInsertDatasetEventReplace(
                        DatasetInsertParams.Event.InsertDatasetEventReplace.builder().build()
                    )
                )
            )
    }

    @Test
    fun getPathParam() {
        val params =
            DatasetInsertParams.builder()
                .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .events(
                    listOf(
                        DatasetInsertParams.Event.ofInsertDatasetEventReplace(
                            DatasetInsertParams.Event.InsertDatasetEventReplace.builder().build()
                        )
                    )
                )
                .build()
        assertThat(params).isNotNull
        // path param "datasetId"
        assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
