// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.services.async

import com.braintrustdata.api.TestServerExtension
import com.braintrustdata.api.client.okhttp.BraintrustOkHttpClientAsync
import com.braintrustdata.api.models.ProjectTagCreateParams
import com.braintrustdata.api.models.ProjectTagReplaceParams
import com.braintrustdata.api.models.ProjectTagUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ProjectTagServiceAsyncTest {

    @Test
    fun create() {
        val client =
            BraintrustOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val projectTagServiceAsync = client.projectTags()

        val projectTagFuture =
            projectTagServiceAsync.create(
                ProjectTagCreateParams.builder()
                    .name("name")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .color("color")
                    .description("description")
                    .build()
            )

        val projectTag = projectTagFuture.get()
        projectTag.validate()
    }

    @Test
    fun retrieve() {
        val client =
            BraintrustOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val projectTagServiceAsync = client.projectTags()

        val projectTagFuture =
            projectTagServiceAsync.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val projectTag = projectTagFuture.get()
        projectTag.validate()
    }

    @Test
    fun update() {
        val client =
            BraintrustOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val projectTagServiceAsync = client.projectTags()

        val projectTagFuture =
            projectTagServiceAsync.update(
                ProjectTagUpdateParams.builder()
                    .projectTagId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .color("color")
                    .description("description")
                    .name("name")
                    .build()
            )

        val projectTag = projectTagFuture.get()
        projectTag.validate()
    }

    @Test
    fun list() {
        val client =
            BraintrustOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val projectTagServiceAsync = client.projectTags()

        val pageFuture = projectTagServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Test
    fun delete() {
        val client =
            BraintrustOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val projectTagServiceAsync = client.projectTags()

        val projectTagFuture = projectTagServiceAsync.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val projectTag = projectTagFuture.get()
        projectTag.validate()
    }

    @Test
    fun replace() {
        val client =
            BraintrustOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val projectTagServiceAsync = client.projectTags()

        val projectTagFuture =
            projectTagServiceAsync.replace(
                ProjectTagReplaceParams.builder()
                    .name("name")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .color("color")
                    .description("description")
                    .build()
            )

        val projectTag = projectTagFuture.get()
        projectTag.validate()
    }
}
