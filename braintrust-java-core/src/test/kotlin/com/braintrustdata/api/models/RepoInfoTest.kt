// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RepoInfoTest {

    @Test
    fun create() {
        val repoInfo =
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

        assertThat(repoInfo.authorEmail()).contains("author_email")
        assertThat(repoInfo.authorName()).contains("author_name")
        assertThat(repoInfo.branch()).contains("branch")
        assertThat(repoInfo.commit()).contains("commit")
        assertThat(repoInfo.commitMessage()).contains("commit_message")
        assertThat(repoInfo.commitTime()).contains("commit_time")
        assertThat(repoInfo.dirty()).contains(true)
        assertThat(repoInfo.gitDiff()).contains("git_diff")
        assertThat(repoInfo.tag()).contains("tag")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val repoInfo =
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

        val roundtrippedRepoInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(repoInfo),
                jacksonTypeRef<RepoInfo>(),
            )

        assertThat(roundtrippedRepoInfo).isEqualTo(repoInfo)
    }
}
