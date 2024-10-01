// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TaskTest {

    @Test
    fun createTask() {
        val task = Task.builder().type(Task.Type.TASK).build()
        assertThat(task).isNotNull
        assertThat(task.type()).isEqualTo(Task.Type.TASK)
    }
}
