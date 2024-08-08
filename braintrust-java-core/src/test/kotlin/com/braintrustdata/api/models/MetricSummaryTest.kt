// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MetricSummaryTest {

    @Test
    fun createMetricSummary() {
        val metricSummary =
            MetricSummary.builder()
                .improvements(123L)
                .metric(42.23)
                .name("name")
                .regressions(123L)
                .unit("unit")
                .diff(42.23)
                .build()
        assertThat(metricSummary).isNotNull
        assertThat(metricSummary.improvements()).isEqualTo(123L)
        assertThat(metricSummary.metric()).isEqualTo(42.23)
        assertThat(metricSummary.name()).isEqualTo("name")
        assertThat(metricSummary.regressions()).isEqualTo(123L)
        assertThat(metricSummary.unit()).isEqualTo("unit")
        assertThat(metricSummary.diff()).contains(42.23)
    }
}
