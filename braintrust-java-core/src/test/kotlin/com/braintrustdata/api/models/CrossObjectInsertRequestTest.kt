// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CrossObjectInsertRequestTest {

    @Test
    fun createCrossObjectInsertRequest() {
        val crossObjectInsertRequest =
            CrossObjectInsertRequest.builder()
                .dataset(CrossObjectInsertRequest.Dataset.builder().build())
                .experiment(CrossObjectInsertRequest.Experiment.builder().build())
                .projectLogs(CrossObjectInsertRequest.ProjectLogs.builder().build())
                .build()
        assertThat(crossObjectInsertRequest).isNotNull
        assertThat(crossObjectInsertRequest.dataset())
            .contains(CrossObjectInsertRequest.Dataset.builder().build())
        assertThat(crossObjectInsertRequest.experiment())
            .contains(CrossObjectInsertRequest.Experiment.builder().build())
        assertThat(crossObjectInsertRequest.projectLogs())
            .contains(CrossObjectInsertRequest.ProjectLogs.builder().build())
    }
}
