// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserTest {

    @Test
    fun createUser() {
        val user =
            User.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .avatarUrl("avatar_url")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .email("email")
                .familyName("family_name")
                .givenName("given_name")
                .build()
        assertThat(user).isNotNull
        assertThat(user.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(user.avatarUrl()).contains("avatar_url")
        assertThat(user.created()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(user.email()).contains("email")
        assertThat(user.familyName()).contains("family_name")
        assertThat(user.givenName()).contains("given_name")
    }
}
