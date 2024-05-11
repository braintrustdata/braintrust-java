// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ExperimentTest {

    @Test
    fun createExperiment() {
        val experiment =
            Experiment.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("string")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .public_(true)
                .baseExpId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .commit("string")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .datasetVersion("string")
                .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("string")
                .metadata(Experiment.Metadata.builder().build())
                .repoInfo(
                    Experiment.RepoInfo.builder()
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
                .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        assertThat(experiment).isNotNull
        assertThat(experiment.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(experiment.name()).isEqualTo("string")
        assertThat(experiment.projectId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(experiment.public_()).isEqualTo(true)
        assertThat(experiment.baseExpId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(experiment.commit()).contains("string")
        assertThat(experiment.created()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(experiment.datasetId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(experiment.datasetVersion()).contains("string")
        assertThat(experiment.deletedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(experiment.description()).contains("string")
        assertThat(experiment.metadata()).contains(Experiment.Metadata.builder().build())
        assertThat(experiment.repoInfo())
            .contains(
                Experiment.RepoInfo.builder()
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
        assertThat(experiment.userId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
