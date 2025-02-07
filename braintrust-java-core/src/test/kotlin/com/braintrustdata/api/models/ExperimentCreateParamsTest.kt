// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ExperimentCreateParamsTest {

    @Test
    fun create() {
        ExperimentCreateParams.builder()
            .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .baseExpId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .datasetVersion("dataset_version")
            .description("description")
            .ensureNew(true)
            .metadata(
                ExperimentCreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .name("x")
            .public_(true)
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
            .build()
    }

    @Test
    fun body() {
        val params =
            ExperimentCreateParams.builder()
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .baseExpId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .datasetVersion("dataset_version")
                .description("description")
                .ensureNew(true)
                .metadata(
                    ExperimentCreateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .name("x")
                .public_(true)
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
                .build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.projectId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.baseExpId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.datasetId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.datasetVersion()).contains("dataset_version")
        assertThat(body.description()).contains("description")
        assertThat(body.ensureNew()).contains(true)
        assertThat(body.metadata())
            .contains(
                ExperimentCreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.name()).contains("x")
        assertThat(body.public_()).contains(true)
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
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ExperimentCreateParams.builder()
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.projectId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
