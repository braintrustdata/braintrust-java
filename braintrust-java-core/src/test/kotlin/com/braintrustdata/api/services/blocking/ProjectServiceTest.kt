// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.services.blocking

import com.braintrustdata.api.TestServerExtension
import com.braintrustdata.api.client.okhttp.BraintrustOkHttpClient
import com.braintrustdata.api.models.ProjectCreateParams
import com.braintrustdata.api.models.ProjectDeleteParams
import com.braintrustdata.api.models.ProjectListParams
import com.braintrustdata.api.models.ProjectRetrieveParams
import com.braintrustdata.api.models.ProjectSettings
import com.braintrustdata.api.models.ProjectUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class ProjectServiceTest {

    @Test
    fun create() {
      val client = BraintrustOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val projectService = client.projects()

      val project = projectService.create(ProjectCreateParams.builder()
          .name("x")
          .orgName("org_name")
          .build())

      project.validate()
    }

    @Test
    fun retrieve() {
      val client = BraintrustOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val projectService = client.projects()

      val project = projectService.retrieve(ProjectRetrieveParams.builder()
          .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .build())

      project.validate()
    }

    @Test
    fun update() {
      val client = BraintrustOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val projectService = client.projects()

      val project = projectService.update(ProjectUpdateParams.builder()
          .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .name("name")
          .settings(ProjectSettings.builder()
              .comparisonKey("comparison_key")
              .build())
          .build())

      project.validate()
    }

    @Test
    fun list() {
      val client = BraintrustOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val projectService = client.projects()

      val page = projectService.list()

      page.response().validate()
    }

    @Test
    fun delete() {
      val client = BraintrustOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val projectService = client.projects()

      val project = projectService.delete(ProjectDeleteParams.builder()
          .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .build())

      project.validate()
    }
}
