// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RepoInfoTest {

    @Test
    fun createRepoInfo() {
      val repoInfo = RepoInfo.builder()
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
      assertThat(repoInfo).isNotNull
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
}
