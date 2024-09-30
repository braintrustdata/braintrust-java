// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EvalCreateParamsTest {

    @Test
    fun createEvalCreateParams() {
        EvalCreateParams.builder()
            .data(
                EvalCreateParams.Data.ofDatasetId(
                    EvalCreateParams.Data.DatasetId.builder().datasetId("dataset_id").build()
                )
            )
            .projectId("project_id")
            .scores(
                listOf(
                    EvalCreateParams.Score.ofFunctionId(
                        EvalCreateParams.Score.FunctionId.builder()
                            .functionId("function_id")
                            .version("version")
                            .build()
                    )
                )
            )
            .task(
                EvalCreateParams.Task.ofFunctionId(
                    EvalCreateParams.Task.FunctionId.builder()
                        .functionId("function_id")
                        .version("version")
                        .build()
                )
            )
            .experimentName("experiment_name")
            .metadata(EvalCreateParams.Metadata.builder().build())
            .stream(true)
            .build()
    }

    @Test
    fun getBody() {
        val params =
            EvalCreateParams.builder()
                .data(
                    EvalCreateParams.Data.ofDatasetId(
                        EvalCreateParams.Data.DatasetId.builder().datasetId("dataset_id").build()
                    )
                )
                .projectId("project_id")
                .scores(
                    listOf(
                        EvalCreateParams.Score.ofFunctionId(
                            EvalCreateParams.Score.FunctionId.builder()
                                .functionId("function_id")
                                .version("version")
                                .build()
                        )
                    )
                )
                .task(
                    EvalCreateParams.Task.ofFunctionId(
                        EvalCreateParams.Task.FunctionId.builder()
                            .functionId("function_id")
                            .version("version")
                            .build()
                    )
                )
                .experimentName("experiment_name")
                .metadata(EvalCreateParams.Metadata.builder().build())
                .stream(true)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.data())
            .isEqualTo(
                EvalCreateParams.Data.ofDatasetId(
                    EvalCreateParams.Data.DatasetId.builder().datasetId("dataset_id").build()
                )
            )
        assertThat(body.projectId()).isEqualTo("project_id")
        assertThat(body.scores())
            .isEqualTo(
                listOf(
                    EvalCreateParams.Score.ofFunctionId(
                        EvalCreateParams.Score.FunctionId.builder()
                            .functionId("function_id")
                            .version("version")
                            .build()
                    )
                )
            )
        assertThat(body.task())
            .isEqualTo(
                EvalCreateParams.Task.ofFunctionId(
                    EvalCreateParams.Task.FunctionId.builder()
                        .functionId("function_id")
                        .version("version")
                        .build()
                )
            )
        assertThat(body.experimentName()).isEqualTo("experiment_name")
        assertThat(body.metadata()).isEqualTo(EvalCreateParams.Metadata.builder().build())
        assertThat(body.stream()).isEqualTo(true)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            EvalCreateParams.builder()
                .data(
                    EvalCreateParams.Data.ofDatasetId(
                        EvalCreateParams.Data.DatasetId.builder().datasetId("dataset_id").build()
                    )
                )
                .projectId("project_id")
                .scores(
                    listOf(
                        EvalCreateParams.Score.ofFunctionId(
                            EvalCreateParams.Score.FunctionId.builder()
                                .functionId("function_id")
                                .build()
                        )
                    )
                )
                .task(
                    EvalCreateParams.Task.ofFunctionId(
                        EvalCreateParams.Task.FunctionId.builder().functionId("function_id").build()
                    )
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.data())
            .isEqualTo(
                EvalCreateParams.Data.ofDatasetId(
                    EvalCreateParams.Data.DatasetId.builder().datasetId("dataset_id").build()
                )
            )
        assertThat(body.projectId()).isEqualTo("project_id")
        assertThat(body.scores())
            .isEqualTo(
                listOf(
                    EvalCreateParams.Score.ofFunctionId(
                        EvalCreateParams.Score.FunctionId.builder()
                            .functionId("function_id")
                            .build()
                    )
                )
            )
        assertThat(body.task())
            .isEqualTo(
                EvalCreateParams.Task.ofFunctionId(
                    EvalCreateParams.Task.FunctionId.builder().functionId("function_id").build()
                )
            )
    }
}
