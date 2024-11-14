// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.services.blocking

import com.braintrustdata.api.TestServerExtension
import com.braintrustdata.api.client.okhttp.BraintrustOkHttpClient
import com.braintrustdata.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class EvalServiceTest {

    @Test
    fun callCreate() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val evalService = client.evals()
        val summarizeExperimentResponse =
            evalService.create(
                EvalCreateParams.builder()
                    .data(
                        EvalCreateParams.Data.ofDatasetId(
                            EvalCreateParams.Data.DatasetId.builder()
                                .datasetId("dataset_id")
                                .build()
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
                    .baseExperimentId("base_experiment_id")
                    .baseExperimentName("base_experiment_name")
                    .experimentName("experiment_name")
                    .gitMetadataSettings(
                        EvalCreateParams.GitMetadataSettings.builder()
                            .collect(EvalCreateParams.GitMetadataSettings.Collect.ALL)
                            .fields(listOf(EvalCreateParams.GitMetadataSettings.Field.COMMIT))
                            .build()
                    )
                    .isPublic(true)
                    .maxConcurrency(42.23)
                    .metadata(EvalCreateParams.Metadata.builder().build())
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
                    .timeout(42.23)
                    .trialCount(42.23)
                    .build()
            )
        println(summarizeExperimentResponse)
        summarizeExperimentResponse.validate()
    }
}
