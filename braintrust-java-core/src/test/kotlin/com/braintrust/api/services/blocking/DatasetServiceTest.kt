// File generated from our OpenAPI spec by Stainless.

package com.braintrust.api.services.blocking

import com.braintrust.api.TestServerExtension
import com.braintrust.api.client.okhttp.BraintrustOkHttpClient
import com.braintrust.api.core.JsonValue
import com.braintrust.api.models.*
import com.braintrust.api.models.DatasetListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class DatasetServiceTest {

    @Test
    fun callCreate() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .baseUrl("My Base URL")
                .build()
        val datasetService = client.dataset()
        val dataset =
            datasetService.create(
                DatasetCreateParams.builder()
                    .name("string")
                    .description("string")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        println(dataset)
        dataset.validate()
    }

    @Test
    fun callRetrieve() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .baseUrl("My Base URL")
                .build()
        val datasetService = client.dataset()
        val dataset =
            datasetService.retrieve(
                DatasetRetrieveParams.builder()
                    .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        println(dataset)
        dataset.validate()
    }

    @Test
    fun callUpdate() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .baseUrl("My Base URL")
                .build()
        val datasetService = client.dataset()
        val dataset =
            datasetService.update(
                DatasetUpdateParams.builder()
                    .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .description("string")
                    .name("string")
                    .build()
            )
        println(dataset)
        dataset.validate()
    }

    @Test
    fun callList() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .baseUrl("My Base URL")
                .build()
        val datasetService = client.dataset()
        val response = datasetService.list(DatasetListParams.builder().build())
        println(response)
        response.objects().forEach { it.validate() }
    }

    @Test
    fun callDelete() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .baseUrl("My Base URL")
                .build()
        val datasetService = client.dataset()
        val dataset =
            datasetService.delete(
                DatasetDeleteParams.builder()
                    .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        println(dataset)
        dataset.validate()
    }

    @Test
    fun callFeedback() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .baseUrl("My Base URL")
                .build()
        val datasetService = client.dataset()
        datasetService.feedback(
            DatasetFeedbackParams.builder()
                .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .feedback(
                    listOf(
                        DatasetFeedbackParams.Feedback.builder()
                            .id("string")
                            .comment("string")
                            .metadata(DatasetFeedbackParams.Feedback.Metadata.builder().build())
                            .source(DatasetFeedbackParams.Feedback.Source.APP)
                            .build()
                    )
                )
                .build()
        )
    }

    @Test
    fun callFetch() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .baseUrl("My Base URL")
                .build()
        val datasetService = client.dataset()
        val datasetFetchResponse =
            datasetService.fetch(
                DatasetFetchParams.builder()
                    .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .limit(123L)
                    .maxRootSpanId("string")
                    .maxXactId("string")
                    .version("string")
                    .build()
            )
        println(datasetFetchResponse)
        datasetFetchResponse.validate()
    }

    @Test
    fun callFetchPost() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .baseUrl("My Base URL")
                .build()
        val datasetService = client.dataset()
        val datasetFetchPostResponse =
            datasetService.fetchPost(
                DatasetFetchPostParams.builder()
                    .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .cursor("string")
                    .filters(
                        listOf(
                            DatasetFetchPostParams.Filter.builder()
                                .path(listOf("string"))
                                .type(DatasetFetchPostParams.Filter.Type.PATH_LOOKUP)
                                .value(JsonValue.from(mapOf<String, Any>()))
                                .build()
                        )
                    )
                    .limit(123L)
                    .maxRootSpanId("string")
                    .maxXactId("string")
                    .version("string")
                    .build()
            )
        println(datasetFetchPostResponse)
        datasetFetchPostResponse.validate()
    }

    @Test
    fun callInsert() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .baseUrl("My Base URL")
                .build()
        val datasetService = client.dataset()
        val datasetInsertResponse =
            datasetService.insert(
                DatasetInsertParams.builder()
                    .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .events(
                        listOf(
                            DatasetInsertParams.Event.ofInsertDatasetEventReplace(
                                DatasetInsertParams.Event.InsertDatasetEventReplace.builder()
                                    .id("string")
                                    ._isMerge(true)
                                    ._objectDelete(true)
                                    ._parentId("string")
                                    .expected(JsonValue.from(mapOf<String, Any>()))
                                    .input(JsonValue.from(mapOf<String, Any>()))
                                    .metadata(
                                        DatasetInsertParams.Event.InsertDatasetEventReplace.Metadata
                                            .builder()
                                            .build()
                                    )
                                    .tags(listOf("string"))
                                    .build()
                            )
                        )
                    )
                    .build()
            )
        println(datasetInsertResponse)
        datasetInsertResponse.validate()
    }

    @Test
    fun callReplace() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .baseUrl("My Base URL")
                .build()
        val datasetService = client.dataset()
        val dataset =
            datasetService.replace(
                DatasetReplaceParams.builder()
                    .name("string")
                    .description("string")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        println(dataset)
        dataset.validate()
    }

    @Test
    fun callSummarize() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .baseUrl("My Base URL")
                .build()
        val datasetService = client.dataset()
        val datasetSummarizeResponse =
            datasetService.summarize(
                DatasetSummarizeParams.builder()
                    .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .summarizeData(true)
                    .build()
            )
        println(datasetSummarizeResponse)
        datasetSummarizeResponse.validate()
    }
}
