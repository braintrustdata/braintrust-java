// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.JsonValue
import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EvalCreateParamsTest {

    @Test
    fun create() {
        EvalCreateParams.builder()
            .data(
                EvalCreateParams.Data.DatasetId.builder()
                    .datasetId("dataset_id")
                    ._internalBtql(
                        EvalCreateParams.Data.DatasetId._InternalBtql
                            .builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .build()
            )
            .projectId("project_id")
            .addScore(
                EvalCreateParams.Score.FunctionId.builder()
                    .functionId("function_id")
                    .version("version")
                    .build()
            )
            .task(
                EvalCreateParams.Task.FunctionId.builder()
                    .functionId("function_id")
                    .version("version")
                    .build()
            )
            .baseExperimentId("base_experiment_id")
            .baseExperimentName("base_experiment_name")
            .experimentName("experiment_name")
            .gitMetadataSettings(
                EvalCreateParams.GitMetadataSettings.builder()
                    .collect(EvalCreateParams.GitMetadataSettings.Collect.ALL)
                    .addField(EvalCreateParams.GitMetadataSettings.Field.COMMIT)
                    .build()
            )
            .isPublic(true)
            .maxConcurrency(0.0)
            .metadata(
                EvalCreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .parent(
                EvalCreateParams.Parent.SpanParentStruct.builder()
                    .objectId("object_id")
                    .objectType(EvalCreateParams.Parent.SpanParentStruct.ObjectType.PROJECT_LOGS)
                    .propagatedEvent(
                        EvalCreateParams.Parent.SpanParentStruct.PropagatedEvent.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .rowIds(
                        EvalCreateParams.Parent.SpanParentStruct.RowIds.builder()
                            .id("id")
                            .rootSpanId("root_span_id")
                            .spanId("span_id")
                            .build()
                    )
                    .build()
            )
            .repoInfo(
                RepoInfo.builder()
                    .authorEmail("author_email")
                    .authorName("author_name")
                    .branch("branch")
                    .commit("commit")
                    .commitMessage("commit_message")
                    .commitTime("commit_time")
                    .dirty(true)
                    .gitDiff("git_diff")
                    .tag("tag")
                    .build()
            )
            .stream(true)
            .timeout(0.0)
            .trialCount(0.0)
            .build()
    }

    @Test
    fun body() {
        val params =
            EvalCreateParams.builder()
                .data(
                    EvalCreateParams.Data.DatasetId.builder()
                        .datasetId("dataset_id")
                        ._internalBtql(
                            EvalCreateParams.Data.DatasetId._InternalBtql
                                .builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
                .projectId("project_id")
                .addScore(
                    EvalCreateParams.Score.FunctionId.builder()
                        .functionId("function_id")
                        .version("version")
                        .build()
                )
                .task(
                    EvalCreateParams.Task.FunctionId.builder()
                        .functionId("function_id")
                        .version("version")
                        .build()
                )
                .baseExperimentId("base_experiment_id")
                .baseExperimentName("base_experiment_name")
                .experimentName("experiment_name")
                .gitMetadataSettings(
                    EvalCreateParams.GitMetadataSettings.builder()
                        .collect(EvalCreateParams.GitMetadataSettings.Collect.ALL)
                        .addField(EvalCreateParams.GitMetadataSettings.Field.COMMIT)
                        .build()
                )
                .isPublic(true)
                .maxConcurrency(0.0)
                .metadata(
                    EvalCreateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .parent(
                    EvalCreateParams.Parent.SpanParentStruct.builder()
                        .objectId("object_id")
                        .objectType(
                            EvalCreateParams.Parent.SpanParentStruct.ObjectType.PROJECT_LOGS
                        )
                        .propagatedEvent(
                            EvalCreateParams.Parent.SpanParentStruct.PropagatedEvent.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .rowIds(
                            EvalCreateParams.Parent.SpanParentStruct.RowIds.builder()
                                .id("id")
                                .rootSpanId("root_span_id")
                                .spanId("span_id")
                                .build()
                        )
                        .build()
                )
                .repoInfo(
                    RepoInfo.builder()
                        .authorEmail("author_email")
                        .authorName("author_name")
                        .branch("branch")
                        .commit("commit")
                        .commitMessage("commit_message")
                        .commitTime("commit_time")
                        .dirty(true)
                        .gitDiff("git_diff")
                        .tag("tag")
                        .build()
                )
                .stream(true)
                .timeout(0.0)
                .trialCount(0.0)
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.data())
            .isEqualTo(
                EvalCreateParams.Data.ofDatasetId(
                    EvalCreateParams.Data.DatasetId.builder()
                        .datasetId("dataset_id")
                        ._internalBtql(
                            EvalCreateParams.Data.DatasetId._InternalBtql
                                .builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
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
        assertThat(body.baseExperimentId()).contains("base_experiment_id")
        assertThat(body.baseExperimentName()).contains("base_experiment_name")
        assertThat(body.experimentName()).contains("experiment_name")
        assertThat(body.gitMetadataSettings())
            .contains(
                EvalCreateParams.GitMetadataSettings.builder()
                    .collect(EvalCreateParams.GitMetadataSettings.Collect.ALL)
                    .addField(EvalCreateParams.GitMetadataSettings.Field.COMMIT)
                    .build()
            )
        assertThat(body.isPublic()).contains(true)
        assertThat(body.maxConcurrency()).contains(0.0)
        assertThat(body.metadata())
            .contains(
                EvalCreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.parent())
            .contains(
                EvalCreateParams.Parent.ofSpanParentStruct(
                    EvalCreateParams.Parent.SpanParentStruct.builder()
                        .objectId("object_id")
                        .objectType(
                            EvalCreateParams.Parent.SpanParentStruct.ObjectType.PROJECT_LOGS
                        )
                        .propagatedEvent(
                            EvalCreateParams.Parent.SpanParentStruct.PropagatedEvent.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .rowIds(
                            EvalCreateParams.Parent.SpanParentStruct.RowIds.builder()
                                .id("id")
                                .rootSpanId("root_span_id")
                                .spanId("span_id")
                                .build()
                        )
                        .build()
                )
            )
        assertThat(body.repoInfo())
            .contains(
                RepoInfo.builder()
                    .authorEmail("author_email")
                    .authorName("author_name")
                    .branch("branch")
                    .commit("commit")
                    .commitMessage("commit_message")
                    .commitTime("commit_time")
                    .dirty(true)
                    .gitDiff("git_diff")
                    .tag("tag")
                    .build()
            )
        assertThat(body.stream()).contains(true)
        assertThat(body.timeout()).contains(0.0)
        assertThat(body.trialCount()).contains(0.0)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            EvalCreateParams.builder()
                .data(EvalCreateParams.Data.DatasetId.builder().datasetId("dataset_id").build())
                .projectId("project_id")
                .addScore(
                    EvalCreateParams.Score.FunctionId.builder().functionId("function_id").build()
                )
                .task(EvalCreateParams.Task.FunctionId.builder().functionId("function_id").build())
                .build()

        val body = params._body()

        assertNotNull(body)
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
