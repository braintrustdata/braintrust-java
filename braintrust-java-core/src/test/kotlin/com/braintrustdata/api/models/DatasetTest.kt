// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DatasetTest {

    @Test
    fun createDataset() {
        val dataset =
            Dataset.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("name")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .metadata(Dataset.Metadata.builder().build())
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        assertThat(dataset).isNotNull
        assertThat(dataset.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(dataset.name()).isEqualTo("name")
        assertThat(dataset.created()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(dataset.deletedAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(dataset.description()).contains("description")
        assertThat(dataset.metadata()).contains(Dataset.Metadata.builder().build())
        assertThat(dataset.projectId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(dataset.userId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
