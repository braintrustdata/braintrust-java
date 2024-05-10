// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ExperimentReplaceParamsTest {

    @Test
    fun createExperimentReplaceParams() {
        ExperimentReplaceParams.builder()
            .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .baseExpId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .datasetVersion("string")
            .description("string")
            .ensureNew(true)
            .metadata(ExperimentReplaceParams.Metadata.builder().build())
            .name("string")
            .public_(true)
            .repoInfo(
                ExperimentReplaceParams.RepoInfo.builder()
                    .authorEmail("string")
                    .authorName("string")
                    .branch("string")
                    .commit("string")
                    .commitMessage("string")
                    .commitTime("string")
                    .dirty(true)
                    .gitDiff("string")
                    .tag("string")
                    .build()
            )
            .build()
    }

    @Test
    fun getBody() {
        val params =
            ExperimentReplaceParams.builder()
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .baseExpId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .datasetVersion("string")
                .description("string")
                .ensureNew(true)
                .metadata(ExperimentReplaceParams.Metadata.builder().build())
                .name("string")
                .public_(true)
                .repoInfo(
                    ExperimentReplaceParams.RepoInfo.builder()
                        .authorEmail("string")
                        .authorName("string")
                        .branch("string")
                        .commit("string")
                        .commitMessage("string")
                        .commitTime("string")
                        .dirty(true)
                        .gitDiff("string")
                        .tag("string")
                        .build()
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.projectId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.baseExpId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.datasetId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.datasetVersion()).isEqualTo("string")
        assertThat(body.description()).isEqualTo("string")
        assertThat(body.ensureNew()).isEqualTo(true)
        assertThat(body.metadata()).isEqualTo(ExperimentReplaceParams.Metadata.builder().build())
        assertThat(body.name()).isEqualTo("string")
        assertThat(body.public_()).isEqualTo(true)
        assertThat(body.repoInfo())
            .isEqualTo(
                ExperimentReplaceParams.RepoInfo.builder()
                    .authorEmail("string")
                    .authorName("string")
                    .branch("string")
                    .commit("string")
                    .commitMessage("string")
                    .commitTime("string")
                    .dirty(true)
                    .gitDiff("string")
                    .tag("string")
                    .build()
            )
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            ExperimentReplaceParams.builder()
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.projectId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
