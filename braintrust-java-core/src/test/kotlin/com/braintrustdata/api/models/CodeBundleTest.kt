// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CodeBundleTest {

    @Test
    fun create() {
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

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
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

        val roundtrippedCodeBundle =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(codeBundle),
                jacksonTypeRef<CodeBundle>(),
            )

        assertThat(roundtrippedCodeBundle).isEqualTo(codeBundle)
    }
}
