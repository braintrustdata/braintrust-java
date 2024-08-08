// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CreateDatasetTest {

    @Test
    fun createCreateDataset() {
        val createDataset =
            CreateDataset.builder()
                .name("name")
                .description("description")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        assertThat(createDataset).isNotNull
        assertThat(createDataset.name()).isEqualTo("name")
        assertThat(createDataset.description()).contains("description")
        assertThat(createDataset.projectId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
