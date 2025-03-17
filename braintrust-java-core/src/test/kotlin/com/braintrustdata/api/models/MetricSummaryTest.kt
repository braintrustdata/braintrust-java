// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MetricSummaryTest {

    @Test
    fun createMetricSummary() {
        val metricSummary =
            MetricSummary.builder()
                .improvements(0L)
                .metric(0.0)
                .name("name")
                .regressions(0L)
                .unit("unit")
                .diff(0.0)
                .build()
        assertThat(metricSummary).isNotNull
        assertThat(metricSummary.improvements()).isEqualTo(0L)
        assertThat(metricSummary.metric()).isEqualTo(0.0)
        assertThat(metricSummary.name()).isEqualTo("name")
        assertThat(metricSummary.regressions()).isEqualTo(0L)
        assertThat(metricSummary.unit()).isEqualTo("unit")
        assertThat(metricSummary.diff()).contains(0.0)
    }
}
