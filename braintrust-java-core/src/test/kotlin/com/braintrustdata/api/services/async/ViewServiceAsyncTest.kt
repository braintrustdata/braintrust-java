// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.services.async

import com.braintrustdata.api.TestServerExtension
import com.braintrustdata.api.client.okhttp.BraintrustOkHttpClientAsync
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.models.ViewCreateParams
import com.braintrustdata.api.models.ViewData
import com.braintrustdata.api.models.ViewDataSearch
import com.braintrustdata.api.models.ViewDeleteParams
import com.braintrustdata.api.models.ViewListParams
import com.braintrustdata.api.models.ViewOptions
import com.braintrustdata.api.models.ViewReplaceParams
import com.braintrustdata.api.models.ViewRetrieveParams
import com.braintrustdata.api.models.ViewUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class ViewServiceAsyncTest {

    @Test
    fun create() {
        val client =
            BraintrustOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val viewServiceAsync = client.views()

        val viewFuture =
            viewServiceAsync.create(
                ViewCreateParams.builder()
                    .name("name")
                    .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .objectType(ViewCreateParams.ObjectType.ORGANIZATION)
                    .viewType(ViewCreateParams.ViewType.PROJECTS)
                    .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .options(
                        ViewOptions.builder()
                            .addColumnOrder("string")
                            .columnSizing(
                                ViewOptions.ColumnSizing.builder()
                                    .putAdditionalProperty("foo", JsonValue.from(0))
                                    .build()
                            )
                            .columnVisibility(
                                ViewOptions.ColumnVisibility.builder()
                                    .putAdditionalProperty("foo", JsonValue.from(true))
                                    .build()
                            )
                            .grouping("grouping")
                            .layout("layout")
                            .rowHeight("rowHeight")
                            .build()
                    )
                    .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .viewData(
                        ViewData.builder()
                            .search(
                                ViewDataSearch.builder()
                                    .addFilter(JsonValue.from(mapOf<String, Any>()))
                                    .addMatch(JsonValue.from(mapOf<String, Any>()))
                                    .addSort(JsonValue.from(mapOf<String, Any>()))
                                    .addTag(JsonValue.from(mapOf<String, Any>()))
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        val view = viewFuture.get()
        view.validate()
    }

    @Test
    fun retrieve() {
        val client =
            BraintrustOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val viewServiceAsync = client.views()

        val viewFuture =
            viewServiceAsync.retrieve(
                ViewRetrieveParams.builder()
                    .viewId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .objectType(ViewRetrieveParams.ObjectType.ORGANIZATION)
                    .build()
            )

        val view = viewFuture.get()
        view.validate()
    }

    @Test
    fun update() {
        val client =
            BraintrustOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val viewServiceAsync = client.views()

        val viewFuture =
            viewServiceAsync.update(
                ViewUpdateParams.builder()
                    .viewId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .objectType(ViewUpdateParams.ObjectType.ORGANIZATION)
                    .name("name")
                    .options(
                        ViewOptions.builder()
                            .addColumnOrder("string")
                            .columnSizing(
                                ViewOptions.ColumnSizing.builder()
                                    .putAdditionalProperty("foo", JsonValue.from(0))
                                    .build()
                            )
                            .columnVisibility(
                                ViewOptions.ColumnVisibility.builder()
                                    .putAdditionalProperty("foo", JsonValue.from(true))
                                    .build()
                            )
                            .grouping("grouping")
                            .layout("layout")
                            .rowHeight("rowHeight")
                            .build()
                    )
                    .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .viewData(
                        ViewData.builder()
                            .search(
                                ViewDataSearch.builder()
                                    .addFilter(JsonValue.from(mapOf<String, Any>()))
                                    .addMatch(JsonValue.from(mapOf<String, Any>()))
                                    .addSort(JsonValue.from(mapOf<String, Any>()))
                                    .addTag(JsonValue.from(mapOf<String, Any>()))
                                    .build()
                            )
                            .build()
                    )
                    .viewType(ViewUpdateParams.ViewType.PROJECTS)
                    .build()
            )

        val view = viewFuture.get()
        view.validate()
    }

    @Test
    fun list() {
        val client =
            BraintrustOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val viewServiceAsync = client.views()

        val pageFuture =
            viewServiceAsync.list(
                ViewListParams.builder()
                    .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .objectType(ViewListParams.ObjectType.ORGANIZATION)
                    .build()
            )

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
        val viewServiceAsync = client.views()

        val viewFuture =
            viewServiceAsync.delete(
                ViewDeleteParams.builder()
                    .viewId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .objectType(ViewDeleteParams.ObjectType.ORGANIZATION)
                    .build()
            )

        val view = viewFuture.get()
        view.validate()
    }

    @Test
    fun replace() {
        val client =
            BraintrustOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val viewServiceAsync = client.views()

        val viewFuture =
            viewServiceAsync.replace(
                ViewReplaceParams.builder()
                    .name("name")
                    .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .objectType(ViewReplaceParams.ObjectType.ORGANIZATION)
                    .viewType(ViewReplaceParams.ViewType.PROJECTS)
                    .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .options(
                        ViewOptions.builder()
                            .addColumnOrder("string")
                            .columnSizing(
                                ViewOptions.ColumnSizing.builder()
                                    .putAdditionalProperty("foo", JsonValue.from(0))
                                    .build()
                            )
                            .columnVisibility(
                                ViewOptions.ColumnVisibility.builder()
                                    .putAdditionalProperty("foo", JsonValue.from(true))
                                    .build()
                            )
                            .grouping("grouping")
                            .layout("layout")
                            .rowHeight("rowHeight")
                            .build()
                    )
                    .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .viewData(
                        ViewData.builder()
                            .search(
                                ViewDataSearch.builder()
                                    .addFilter(JsonValue.from(mapOf<String, Any>()))
                                    .addMatch(JsonValue.from(mapOf<String, Any>()))
                                    .addSort(JsonValue.from(mapOf<String, Any>()))
                                    .addTag(JsonValue.from(mapOf<String, Any>()))
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        val view = viewFuture.get()
        view.validate()
    }
}
