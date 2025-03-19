// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ObjectReferenceTest {

    @Test
    fun create() {
        val objectReference =
            ObjectReference.builder()
                .id("id")
                ._xactId("_xact_id")
                .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .objectType(ObjectReference.ObjectType.EXPERIMENT)
                .created("created")
                .build()

        assertThat(objectReference.id()).isEqualTo("id")
        assertThat(objectReference._xactId()).isEqualTo("_xact_id")
        assertThat(objectReference.objectId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(objectReference.objectType()).isEqualTo(ObjectReference.ObjectType.EXPERIMENT)
        assertThat(objectReference.created()).contains("created")
    }
}
