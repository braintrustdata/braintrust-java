// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.services.async

import com.braintrustdata.api.TestServerExtension
import com.braintrustdata.api.client.okhttp.BraintrustOkHttpClientAsync
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.models.DatasetCreateParams
import com.braintrustdata.api.models.DatasetDeleteParams
import com.braintrustdata.api.models.DatasetFeedbackParams
import com.braintrustdata.api.models.DatasetFetchParams
import com.braintrustdata.api.models.DatasetFetchPostParams
import com.braintrustdata.api.models.DatasetInsertParams
import com.braintrustdata.api.models.DatasetRetrieveParams
import com.braintrustdata.api.models.DatasetSummarizeParams
import com.braintrustdata.api.models.DatasetUpdateParams
import com.braintrustdata.api.models.FeedbackDatasetItem
import com.braintrustdata.api.models.InsertDatasetEvent
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class DatasetServiceAsyncTest {

    @Test
    fun create() {
        val client =
            BraintrustOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val datasetServiceAsync = client.datasets()

        val datasetFuture =
            datasetServiceAsync.create(
                DatasetCreateParams.builder()
                    .name("x")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .description("description")
                    .metadata(
                        DatasetCreateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .build()
            )

        val dataset = datasetFuture.get()
        dataset.validate()
    }

    @Test
    fun retrieve() {
        val client =
            BraintrustOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val datasetServiceAsync = client.datasets()

        val datasetFuture =
            datasetServiceAsync.retrieve(
                DatasetRetrieveParams.builder()
                    .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val dataset = datasetFuture.get()
        dataset.validate()
    }

    @Test
    fun update() {
        val client =
            BraintrustOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val datasetServiceAsync = client.datasets()

        val datasetFuture =
            datasetServiceAsync.update(
                DatasetUpdateParams.builder()
                    .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .description("description")
                    .metadata(
                        DatasetUpdateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .name("name")
                    .build()
            )

        val dataset = datasetFuture.get()
        dataset.validate()
    }

    @Test
    fun list() {
        val client =
            BraintrustOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val datasetServiceAsync = client.datasets()

        val pageFuture = datasetServiceAsync.list()

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
        val datasetServiceAsync = client.datasets()

        val datasetFuture =
            datasetServiceAsync.delete(
                DatasetDeleteParams.builder()
                    .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val dataset = datasetFuture.get()
        dataset.validate()
    }

    @Test
    fun feedback() {
        val client =
            BraintrustOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val datasetServiceAsync = client.datasets()

        val feedbackResponseSchemaFuture =
            datasetServiceAsync.feedback(
                DatasetFeedbackParams.builder()
                    .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addFeedback(
                        FeedbackDatasetItem.builder()
                            .id("id")
                            .comment("comment")
                            .metadata(
                                FeedbackDatasetItem.Metadata.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .source(FeedbackDatasetItem.Source.APP)
                            .addTag("string")
                            .build()
                    )
                    .build()
            )

        val feedbackResponseSchema = feedbackResponseSchemaFuture.get()
        feedbackResponseSchema.validate()
    }

    @Test
    fun fetch() {
        val client =
            BraintrustOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val datasetServiceAsync = client.datasets()

        val fetchDatasetEventsResponseFuture =
            datasetServiceAsync.fetch(
                DatasetFetchParams.builder()
                    .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .limit(0L)
                    .maxRootSpanId("max_root_span_id")
                    .maxXactId("max_xact_id")
                    .version("version")
                    .build()
            )

        val fetchDatasetEventsResponse = fetchDatasetEventsResponseFuture.get()
        fetchDatasetEventsResponse.validate()
    }

    @Test
    fun fetchPost() {
        val client =
            BraintrustOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val datasetServiceAsync = client.datasets()

        val fetchDatasetEventsResponseFuture =
            datasetServiceAsync.fetchPost(
                DatasetFetchPostParams.builder()
                    .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .cursor("cursor")
                    .limit(0L)
                    .maxRootSpanId("max_root_span_id")
                    .maxXactId("max_xact_id")
                    .version("version")
                    .build()
            )

        val fetchDatasetEventsResponse = fetchDatasetEventsResponseFuture.get()
        fetchDatasetEventsResponse.validate()
    }

    @Test
    fun insert() {
        val client =
            BraintrustOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val datasetServiceAsync = client.datasets()

        val insertEventsResponseFuture =
            datasetServiceAsync.insert(
                DatasetInsertParams.builder()
                    .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addEvent(
                        InsertDatasetEvent.builder()
                            .id("id")
                            ._isMerge(true)
                            .addMergePath(listOf("string"))
                            ._objectDelete(true)
                            ._parentId("_parent_id")
                            .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .expected(JsonValue.from(mapOf<String, Any>()))
                            .input(JsonValue.from(mapOf<String, Any>()))
                            .metadata(
                                InsertDatasetEvent.Metadata.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .rootSpanId("root_span_id")
                            .spanId("span_id")
                            .addSpanParent("string")
                            .addTag("string")
                            .build()
                    )
                    .build()
            )

        val insertEventsResponse = insertEventsResponseFuture.get()
        insertEventsResponse.validate()
    }

    @Test
    fun summarize() {
        val client =
            BraintrustOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val datasetServiceAsync = client.datasets()

        val summarizeDatasetResponseFuture =
            datasetServiceAsync.summarize(
                DatasetSummarizeParams.builder()
                    .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .summarizeData(true)
                    .build()
            )

        val summarizeDatasetResponse = summarizeDatasetResponseFuture.get()
        summarizeDatasetResponse.validate()
    }
}
