// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.services.async

import com.braintrustdata.api.TestServerExtension
import com.braintrustdata.api.client.okhttp.BraintrustOkHttpClientAsync
import com.braintrustdata.api.models.EnvVarCreateParams
import com.braintrustdata.api.models.EnvVarListParams
import com.braintrustdata.api.models.EnvVarObjectType
import com.braintrustdata.api.models.EnvVarReplaceParams
import com.braintrustdata.api.models.EnvVarUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class EnvVarServiceAsyncTest {

    @Test
    fun create() {
        val client =
            BraintrustOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val envVarServiceAsync = client.envVars()

        val envVarFuture =
            envVarServiceAsync.create(
                EnvVarCreateParams.builder()
                    .name("name")
                    .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .objectType(EnvVarCreateParams.ObjectType.ORGANIZATION)
                    .value("value")
                    .build()
            )

        val envVar = envVarFuture.get()
        envVar.validate()
    }

    @Test
    fun retrieve() {
        val client =
            BraintrustOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val envVarServiceAsync = client.envVars()

        val envVarFuture = envVarServiceAsync.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val envVar = envVarFuture.get()
        envVar.validate()
    }

    @Test
    fun update() {
        val client =
            BraintrustOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val envVarServiceAsync = client.envVars()

        val envVarFuture =
            envVarServiceAsync.update(
                EnvVarUpdateParams.builder()
                    .envVarId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .name("name")
                    .value("value")
                    .build()
            )

        val envVar = envVarFuture.get()
        envVar.validate()
    }

    @Test
    fun list() {
        val client =
            BraintrustOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val envVarServiceAsync = client.envVars()

        val envVarsFuture =
            envVarServiceAsync.list(
                EnvVarListParams.builder()
                    .envVarName("env_var_name")
                    .ids("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .limit(0L)
                    .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .objectType(EnvVarObjectType.ORGANIZATION)
                    .build()
            )

        val envVars = envVarsFuture.get()
        envVars.validate()
    }

    @Test
    fun delete() {
        val client =
            BraintrustOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val envVarServiceAsync = client.envVars()

        val envVarFuture = envVarServiceAsync.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val envVar = envVarFuture.get()
        envVar.validate()
    }

    @Test
    fun replace() {
        val client =
            BraintrustOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val envVarServiceAsync = client.envVars()

        val envVarFuture =
            envVarServiceAsync.replace(
                EnvVarReplaceParams.builder()
                    .name("name")
                    .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .objectType(EnvVarReplaceParams.ObjectType.ORGANIZATION)
                    .value("value")
                    .build()
            )

        val envVar = envVarFuture.get()
        envVar.validate()
    }
}
