// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.services.blocking

import com.braintrustdata.api.TestServerExtension
import com.braintrustdata.api.client.okhttp.BraintrustOkHttpClient
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.models.DatasetCreateParams
import com.braintrustdata.api.models.DatasetFeedbackParams
import com.braintrustdata.api.models.DatasetFetchParams
import com.braintrustdata.api.models.DatasetFetchPostParams
import com.braintrustdata.api.models.DatasetInsertParams
import com.braintrustdata.api.models.DatasetSummarizeParams
import com.braintrustdata.api.models.DatasetUpdateParams
import com.braintrustdata.api.models.FeedbackDatasetItem
import com.braintrustdata.api.models.InsertDatasetEvent
import com.braintrustdata.api.models.ObjectReference
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DatasetServiceTest {

    @Test
    fun create() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val datasetService = client.datasets()

        val dataset =
            datasetService.create(
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

        dataset.validate()
    }

    @Test
    fun retrieve() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val datasetService = client.datasets()

        val dataset = datasetService.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        dataset.validate()
    }

    @Test
    fun update() {
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
                    .metadata(
                        DatasetUpdateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .name("name")
                    .build()
            )

        dataset.validate()
    }

    @Test
    fun list() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val datasetService = client.datasets()

        val page = datasetService.list()

        page.response().validate()
    }

    @Test
    fun delete() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val datasetService = client.datasets()

        val dataset = datasetService.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        dataset.validate()
    }

    @Test
    fun feedback() {
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

        feedbackResponseSchema.validate()
    }

    @Test
    fun fetch() {
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
                    .limit(0L)
                    .maxRootSpanId("max_root_span_id")
                    .maxXactId("max_xact_id")
                    .version("version")
                    .build()
            )

        fetchDatasetEventsResponse.validate()
    }

    @Test
    fun fetchPost() {
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
                    .limit(0L)
                    .maxRootSpanId("max_root_span_id")
                    .maxXactId("max_xact_id")
                    .version("version")
                    .build()
            )

        fetchDatasetEventsResponse.validate()
    }

    @Test
    fun insert() {
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
                            .metadata(InsertDatasetEvent.Metadata.builder().model("model").build())
                            .origin(
                                ObjectReference.builder()
                                    .id("id")
                                    ._xactId("_xact_id")
                                    .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .objectType(ObjectReference.ObjectType.EXPERIMENT)
                                    .created("created")
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

        insertEventsResponse.validate()
    }

    @Test
    fun summarize() {
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

        summarizeDatasetResponse.validate()
    }
}
