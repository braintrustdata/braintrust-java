// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.services.blocking

import com.braintrustdata.api.TestServerExtension
import com.braintrustdata.api.client.okhttp.BraintrustOkHttpClient
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.models.*
import com.braintrustdata.api.models.ViewListParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class ViewServiceTest {

    @Test
    fun callCreate() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val viewService = client.views()
        val view =
            viewService.create(
                ViewCreateParams.builder()
                    .name("name")
                    .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .objectType(ViewCreateParams.ObjectType.ORGANIZATION)
                    .viewType(ViewCreateParams.ViewType.PROJECTS)
                    .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .options(
                        ViewOptions.builder()
                            .columnOrder(listOf("string"))
                            .columnSizing(ViewOptions.ColumnSizing.builder().build())
                            .columnVisibility(ViewOptions.ColumnVisibility.builder().build())
                            .build()
                    )
                    .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .viewData(
                        ViewData.builder()
                            .search(
                                ViewDataSearch.builder()
                                    .filter(listOf(JsonValue.from(mapOf<String, Any>())))
                                    .match(listOf(JsonValue.from(mapOf<String, Any>())))
                                    .sort(listOf(JsonValue.from(mapOf<String, Any>())))
                                    .tag(listOf(JsonValue.from(mapOf<String, Any>())))
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )
        println(view)
        view.validate()
    }

    @Test
    fun callRetrieve() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val viewService = client.views()
        val view =
            viewService.retrieve(
                ViewRetrieveParams.builder()
                    .viewId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .objectType(ViewRetrieveParams.ObjectType.ORGANIZATION)
                    .build()
            )
        println(view)
        view.validate()
    }

    @Test
    fun callUpdate() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val viewService = client.views()
        val view =
            viewService.update(
                ViewUpdateParams.builder()
                    .viewId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .objectType(ViewUpdateParams.ObjectType.ORGANIZATION)
                    .name("name")
                    .options(
                        ViewOptions.builder()
                            .columnOrder(listOf("string"))
                            .columnSizing(ViewOptions.ColumnSizing.builder().build())
                            .columnVisibility(ViewOptions.ColumnVisibility.builder().build())
                            .build()
                    )
                    .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .viewData(
                        ViewData.builder()
                            .search(
                                ViewDataSearch.builder()
                                    .filter(listOf(JsonValue.from(mapOf<String, Any>())))
                                    .match(listOf(JsonValue.from(mapOf<String, Any>())))
                                    .sort(listOf(JsonValue.from(mapOf<String, Any>())))
                                    .tag(listOf(JsonValue.from(mapOf<String, Any>())))
                                    .build()
                            )
                            .build()
                    )
                    .viewType(ViewUpdateParams.ViewType.PROJECTS)
                    .build()
            )
        println(view)
        view.validate()
    }

    @Test
    fun callList() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val viewService = client.views()
        val response =
            viewService.list(
                ViewListParams.builder()
                    .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .objectType(ViewListParams.ObjectType.ORGANIZATION)
                    .build()
            )
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
        val viewService = client.views()
        val view =
            viewService.delete(
                ViewDeleteParams.builder()
                    .viewId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .objectType(ViewDeleteParams.ObjectType.ORGANIZATION)
                    .build()
            )
        println(view)
        view.validate()
    }

    @Test
    fun callReplace() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val viewService = client.views()
        val view =
            viewService.replace(
                ViewReplaceParams.builder()
                    .name("name")
                    .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .objectType(ViewReplaceParams.ObjectType.ORGANIZATION)
                    .viewType(ViewReplaceParams.ViewType.PROJECTS)
                    .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .options(
                        ViewOptions.builder()
                            .columnOrder(listOf("string"))
                            .columnSizing(ViewOptions.ColumnSizing.builder().build())
                            .columnVisibility(ViewOptions.ColumnVisibility.builder().build())
                            .build()
                    )
                    .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .viewData(
                        ViewData.builder()
                            .search(
                                ViewDataSearch.builder()
                                    .filter(listOf(JsonValue.from(mapOf<String, Any>())))
                                    .match(listOf(JsonValue.from(mapOf<String, Any>())))
                                    .sort(listOf(JsonValue.from(mapOf<String, Any>())))
                                    .tag(listOf(JsonValue.from(mapOf<String, Any>())))
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )
        println(view)
        view.validate()
    }
}
