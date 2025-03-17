// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CodeBundleTest {

    @Test
    fun createCodeBundle() {
        val codeBundle =
            CodeBundle.builder()
                .bundleId("bundle_id")
                .location(
                    CodeBundle.Location.Experiment.builder()
                        .evalName("eval_name")
                        .position(
                            CodeBundle.Location.Experiment.Position.Type.builder()
                                .type(CodeBundle.Location.Experiment.Position.Type.InnerType.TASK)
                                .build()
                        )
                        .type(CodeBundle.Location.Experiment.Type.EXPERIMENT)
                        .build()
                )
                .runtimeContext(
                    CodeBundle.RuntimeContext.builder()
                        .runtime(CodeBundle.RuntimeContext.Runtime.NODE)
                        .version("version")
                        .build()
                )
                .preview("preview")
                .build()
        assertThat(codeBundle).isNotNull
        assertThat(codeBundle.bundleId()).isEqualTo("bundle_id")
        assertThat(codeBundle.location())
            .isEqualTo(
                CodeBundle.Location.ofExperiment(
                    CodeBundle.Location.Experiment.builder()
                        .evalName("eval_name")
                        .position(
                            CodeBundle.Location.Experiment.Position.Type.builder()
                                .type(CodeBundle.Location.Experiment.Position.Type.InnerType.TASK)
                                .build()
                        )
                        .type(CodeBundle.Location.Experiment.Type.EXPERIMENT)
                        .build()
                )
            )
        assertThat(codeBundle.runtimeContext())
            .isEqualTo(
                CodeBundle.RuntimeContext.builder()
                    .runtime(CodeBundle.RuntimeContext.Runtime.NODE)
                    .version("version")
                    .build()
            )
        assertThat(codeBundle.preview()).contains("preview")
    }
}
