// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserListPageResponseTest {

    @Test
    fun create() {
        val userListPageResponse =
            UserListPageResponse.builder()
                .addObject(
                    User.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .avatarUrl("avatar_url")
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .email("email")
                        .familyName("family_name")
                        .givenName("given_name")
                        .build()
                )
                .build()

        assertThat(userListPageResponse.objects())
            .containsExactly(
                User.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .avatarUrl("avatar_url")
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .email("email")
                    .familyName("family_name")
                    .givenName("given_name")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val userListPageResponse =
            UserListPageResponse.builder()
                .addObject(
                    User.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .avatarUrl("avatar_url")
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .email("email")
                        .familyName("family_name")
                        .givenName("given_name")
                        .build()
                )
                .build()

        val roundtrippedUserListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(userListPageResponse),
                jacksonTypeRef<UserListPageResponse>(),
            )

        assertThat(roundtrippedUserListPageResponse).isEqualTo(userListPageResponse)
    }
}
