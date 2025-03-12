// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.services.blocking

import com.braintrustdata.api.TestServerExtension
import com.braintrustdata.api.client.okhttp.BraintrustOkHttpClient
import com.braintrustdata.api.models.OrganizationDeleteParams
import com.braintrustdata.api.models.OrganizationListParams
import com.braintrustdata.api.models.OrganizationRetrieveParams
import com.braintrustdata.api.models.OrganizationUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class OrganizationServiceTest {

    @Test
    fun retrieve() {
      val client = BraintrustOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val organizationService = client.organizations()

      val organization = organizationService.retrieve(OrganizationRetrieveParams.builder()
          .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .build())

      organization.validate()
    }

    @Test
    fun update() {
      val client = BraintrustOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val organizationService = client.organizations()

      val organization = organizationService.update(OrganizationUpdateParams.builder()
          .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .apiUrl("api_url")
          .isUniversalApi(true)
          .name("name")
          .proxyUrl("proxy_url")
          .realtimeUrl("realtime_url")
          .build())

      organization.validate()
    }

    @Test
    fun list() {
      val client = BraintrustOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val organizationService = client.organizations()

      val page = organizationService.list()

      page.response().validate()
    }

    @Test
    fun delete() {
      val client = BraintrustOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val organizationService = client.organizations()

      val organization = organizationService.delete(OrganizationDeleteParams.builder()
          .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .build())

      organization.validate()
    }
}
