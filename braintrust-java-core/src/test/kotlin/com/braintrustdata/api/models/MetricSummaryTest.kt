// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MetricSummaryTest {

    @Test
    fun create() {
        val metricSummary =
            MetricSummary.builder()
                .improvements(0L)
                .metric(0.0)
                .name("name")
                .regressions(0L)
                .unit("unit")
                .diff(0.0)
                .build()

        assertThat(metricSummary.improvements()).isEqualTo(0L)
        assertThat(metricSummary.metric()).isEqualTo(0.0)
        assertThat(metricSummary.name()).isEqualTo("name")
        assertThat(metricSummary.regressions()).isEqualTo(0L)
        assertThat(metricSummary.unit()).isEqualTo("unit")
        assertThat(metricSummary.diff()).contains(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val metricSummary =
            MetricSummary.builder()
                .improvements(0L)
                .metric(0.0)
                .name("name")
                .regressions(0L)
                .unit("unit")
                .diff(0.0)
                .build()

        val roundtrippedMetricSummary =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(metricSummary),
                jacksonTypeRef<MetricSummary>(),
            )

        assertThat(roundtrippedMetricSummary).isEqualTo(metricSummary)
    }
}
