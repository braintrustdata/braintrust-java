// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CodeTest {

    @Test
    fun createCode() {
        val code =
            Code.builder()
                .data(
                    Code.Data.ofBundle(
                        Code.Data.Bundle.builder()
                            .bundleId("bundle_id")
                            .location(
                                Code.Data.Bundle.Location.ofExperiment(
                                    Code.Data.Bundle.Location.Experiment.builder()
                                        .evalName("eval_name")
                                        .position(
                                            Code.Data.Bundle.Location.Experiment.Position.ofTask(
                                                Task.builder().type(Task.Type.TASK).build()
                                            )
                                        )
                                        .type(Code.Data.Bundle.Location.Experiment.Type.EXPERIMENT)
                                        .build()
                                )
                            )
                            .runtimeContext(
                                Code.Data.Bundle.RuntimeContext.builder()
                                    .runtime(Code.Data.Bundle.RuntimeContext.Runtime.NODE)
                                    .version("version")
                                    .build()
                            )
                            .type(Code.Data.Bundle.Type.BUNDLE)
                            .preview("preview")
                            .build()
                    )
                )
                .type(Code.Type.CODE)
                .build()
        assertThat(code).isNotNull
        assertThat(code.data())
            .isEqualTo(
                Code.Data.ofBundle(
                    Code.Data.Bundle.builder()
                        .bundleId("bundle_id")
                        .location(
                            Code.Data.Bundle.Location.ofExperiment(
                                Code.Data.Bundle.Location.Experiment.builder()
                                    .evalName("eval_name")
                                    .position(
                                        Code.Data.Bundle.Location.Experiment.Position.ofTask(
                                            Task.builder().type(Task.Type.TASK).build()
                                        )
                                    )
                                    .type(Code.Data.Bundle.Location.Experiment.Type.EXPERIMENT)
                                    .build()
                            )
                        )
                        .runtimeContext(
                            Code.Data.Bundle.RuntimeContext.builder()
                                .runtime(Code.Data.Bundle.RuntimeContext.Runtime.NODE)
                                .version("version")
                                .build()
                        )
                        .type(Code.Data.Bundle.Type.BUNDLE)
                        .preview("preview")
                        .build()
                )
            )
        assertThat(code.type()).isEqualTo(Code.Type.CODE)
    }
}
