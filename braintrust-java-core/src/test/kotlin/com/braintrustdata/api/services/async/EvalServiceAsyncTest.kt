// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.services.async

import com.braintrustdata.api.TestServerExtension
import com.braintrustdata.api.client.okhttp.BraintrustOkHttpClientAsync
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.models.EvalCreateParams
import com.braintrustdata.api.models.RepoInfo
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class EvalServiceAsyncTest {

    @Test
    fun create() {
        val client =
            BraintrustOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val evalServiceAsync = client.evals()

        val summarizeExperimentResponseFuture =
            evalServiceAsync.create(
                EvalCreateParams.builder()
                    .data(EvalCreateParams.Data.DatasetId.builder().datasetId("dataset_id").build())
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
            )

        val summarizeExperimentResponse = summarizeExperimentResponseFuture.get()
        summarizeExperimentResponse.validate()
    }
}
