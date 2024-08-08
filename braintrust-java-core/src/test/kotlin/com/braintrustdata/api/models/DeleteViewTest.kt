// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DeleteViewTest {

    @Test
    fun createDeleteView() {
        val deleteView =
            DeleteView.builder()
                .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .objectType(DeleteView.ObjectType.ORGANIZATION)
                .build()
        assertThat(deleteView).isNotNull
        assertThat(deleteView.objectId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(deleteView.objectType()).contains(DeleteView.ObjectType.ORGANIZATION)
    }
}
