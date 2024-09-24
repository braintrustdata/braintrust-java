// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.services.blocking

import com.braintrustdata.api.TestServerExtension
import com.braintrustdata.api.client.okhttp.BraintrustOkHttpClient
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.models.*
import com.braintrustdata.api.models.DatasetListParams
import java.time.OffsetDateTime
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
                .build()
        val datasetService = client.datasets()
        val dataset =
            datasetService.create(
                DatasetCreateParams.builder()
                    .name("name")
                    .description("description")
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
                .build()
        val datasetService = client.datasets()
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
                .build()
        val datasetService = client.datasets()
        val dataset =
            datasetService.update(
                DatasetUpdateParams.builder()
                    .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .description("description")
                    .metadata(DatasetUpdateParams.Metadata.builder().build())
                    .name("name")
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
                .build()
        val datasetService = client.datasets()
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
                .build()
        val datasetService = client.datasets()
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
                .build()
        val datasetService = client.datasets()
        val feedbackResponseSchema =
            datasetService.feedback(
                DatasetFeedbackParams.builder()
                    .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .feedback(
                        listOf(
                            FeedbackDatasetItem.builder()
                                .id("id")
                                .comment("comment")
                                .metadata(FeedbackDatasetItem.Metadata.builder().build())
                                .source(FeedbackDatasetItem.Source.APP)
                                .build()
                        )
                    )
                    .build()
            )
        println(feedbackResponseSchema)
        feedbackResponseSchema.validate()
    }

    @Test
    fun callFetch() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val datasetService = client.datasets()
        val fetchDatasetEventsResponse =
            datasetService.fetch(
                DatasetFetchParams.builder()
                    .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .limit(123L)
                    .maxRootSpanId("max_root_span_id")
                    .maxXactId("max_xact_id")
                    .version("version")
                    .build()
            )
        println(fetchDatasetEventsResponse)
        fetchDatasetEventsResponse.validate()
    }

    @Test
    fun callFetchPost() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val datasetService = client.datasets()
        val fetchDatasetEventsResponse =
            datasetService.fetchPost(
                DatasetFetchPostParams.builder()
                    .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .cursor("cursor")
                    .filters(
                        listOf(
                            PathLookupFilter.builder()
                                .path(listOf("string"))
                                .type(PathLookupFilter.Type.PATH_LOOKUP)
                                .value(JsonValue.from(mapOf<String, Any>()))
                                .build()
                        )
                    )
                    .limit(123L)
                    .maxRootSpanId("max_root_span_id")
                    .maxXactId("max_xact_id")
                    .version("version")
                    .build()
            )
        println(fetchDatasetEventsResponse)
        fetchDatasetEventsResponse.validate()
    }

    @Test
    fun callInsert() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val datasetService = client.datasets()
        val insertEventsResponse =
            datasetService.insert(
                DatasetInsertParams.builder()
                    .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .events(
                        listOf(
                            DatasetInsertParams.Event.ofInsertDatasetEventReplace(
                                InsertDatasetEventReplace.builder()
                                    .id("id")
                                    ._isMerge(true)
                                    ._objectDelete(true)
                                    ._parentId("_parent_id")
                                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .expected(JsonValue.from(mapOf<String, Any>()))
                                    .input(JsonValue.from(mapOf<String, Any>()))
                                    .metadata(InsertDatasetEventReplace.Metadata.builder().build())
                                    .tags(listOf("string"))
                                    .build()
                            )
                        )
                    )
                    .build()
            )
        println(insertEventsResponse)
        insertEventsResponse.validate()
    }

    @Test
    fun callSummarize() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val datasetService = client.datasets()
        val summarizeDatasetResponse =
            datasetService.summarize(
                DatasetSummarizeParams.builder()
                    .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .summarizeData(true)
                    .build()
            )
        println(summarizeDatasetResponse)
        summarizeDatasetResponse.validate()
    }
}
