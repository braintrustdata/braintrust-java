// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CrossObjectInsertResponseTest {

    @Test
    fun createCrossObjectInsertResponse() {
        val crossObjectInsertResponse =
            CrossObjectInsertResponse.builder()
                .dataset(
                    CrossObjectInsertResponse.Dataset.builder()
                        .putAdditionalProperty(
                            "foo",
                            JsonValue.from(mapOf("row_ids" to listOf("string"))),
                        )
                        .build()
                )
                .experiment(
                    CrossObjectInsertResponse.Experiment.builder()
                        .putAdditionalProperty(
                            "foo",
                            JsonValue.from(mapOf("row_ids" to listOf("string"))),
                        )
                        .build()
                )
                .projectLogs(
                    CrossObjectInsertResponse.ProjectLogs.builder()
                        .putAdditionalProperty(
                            "foo",
                            JsonValue.from(mapOf("row_ids" to listOf("string"))),
                        )
                        .build()
                )
                .build()
        assertThat(crossObjectInsertResponse).isNotNull
        assertThat(crossObjectInsertResponse.dataset())
            .contains(
                CrossObjectInsertResponse.Dataset.builder()
                    .putAdditionalProperty(
                        "foo",
                        JsonValue.from(mapOf("row_ids" to listOf("string"))),
                    )
                    .build()
            )
        assertThat(crossObjectInsertResponse.experiment())
            .contains(
                CrossObjectInsertResponse.Experiment.builder()
                    .putAdditionalProperty(
                        "foo",
                        JsonValue.from(mapOf("row_ids" to listOf("string"))),
                    )
                    .build()
            )
        assertThat(crossObjectInsertResponse.projectLogs())
            .contains(
                CrossObjectInsertResponse.ProjectLogs.builder()
                    .putAdditionalProperty(
                        "foo",
                        JsonValue.from(mapOf("row_ids" to listOf("string"))),
                    )
                    .build()
            )
    }
}
