// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CreateExperimentTest {

    @Test
    fun createCreateExperiment() {
        val createExperiment =
            CreateExperiment.builder()
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .baseExpId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .datasetVersion("dataset_version")
                .description("description")
                .ensureNew(true)
                .metadata(CreateExperiment.Metadata.builder().build())
                .name("name")
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
        assertThat(createExperiment).isNotNull
        assertThat(createExperiment.projectId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(createExperiment.baseExpId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(createExperiment.datasetId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(createExperiment.datasetVersion()).contains("dataset_version")
        assertThat(createExperiment.description()).contains("description")
        assertThat(createExperiment.ensureNew()).contains(true)
        assertThat(createExperiment.metadata())
            .contains(CreateExperiment.Metadata.builder().build())
        assertThat(createExperiment.name()).contains("name")
        assertThat(createExperiment.public_()).contains(true)
        assertThat(createExperiment.repoInfo())
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
}
