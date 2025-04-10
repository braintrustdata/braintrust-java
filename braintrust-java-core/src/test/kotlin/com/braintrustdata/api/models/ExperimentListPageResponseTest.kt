// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExperimentListPageResponseTest {

    @Test
    fun create() {
        val experimentListPageResponse =
            ExperimentListPageResponse.builder()
                .addObject(
                    Experiment.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .name("name")
                        .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .public_(true)
                        .baseExpId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .commit("commit")
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .datasetVersion("dataset_version")
                        .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("description")
                        .metadata(
                            Experiment.Metadata.builder()
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
                        .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        assertThat(experimentListPageResponse.objects())
            .containsExactly(
                Experiment.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .name("name")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .public_(true)
                    .baseExpId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .commit("commit")
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .datasetVersion("dataset_version")
                    .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .description("description")
                    .metadata(
                        Experiment.Metadata.builder()
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
                    .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val experimentListPageResponse =
            ExperimentListPageResponse.builder()
                .addObject(
                    Experiment.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .name("name")
                        .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .public_(true)
                        .baseExpId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .commit("commit")
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .datasetVersion("dataset_version")
                        .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("description")
                        .metadata(
                            Experiment.Metadata.builder()
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
                        .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        val roundtrippedExperimentListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(experimentListPageResponse),
                jacksonTypeRef<ExperimentListPageResponse>(),
            )

        assertThat(roundtrippedExperimentListPageResponse).isEqualTo(experimentListPageResponse)
    }
}
