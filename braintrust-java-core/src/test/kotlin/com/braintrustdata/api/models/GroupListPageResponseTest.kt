// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GroupListPageResponseTest {

    @Test
    fun create() {
        val groupListPageResponse =
            GroupListPageResponse.builder()
                .addObject(
                    Group.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .name("name")
                        .orgId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("description")
                        .addMemberGroup("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addMemberUser("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        assertThat(groupListPageResponse.objects())
            .containsExactly(
                Group.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .name("name")
                    .orgId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .description("description")
                    .addMemberGroup("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addMemberUser("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val groupListPageResponse =
            GroupListPageResponse.builder()
                .addObject(
                    Group.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .name("name")
                        .orgId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("description")
                        .addMemberGroup("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addMemberUser("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        val roundtrippedGroupListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(groupListPageResponse),
                jacksonTypeRef<GroupListPageResponse>(),
            )

        assertThat(roundtrippedGroupListPageResponse).isEqualTo(groupListPageResponse)
    }
}
