// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.services.async

import com.braintrustdata.api.core.RequestOptions
import com.braintrustdata.api.core.http.HttpResponseFor
import com.braintrustdata.api.models.ApiKey
import com.braintrustdata.api.models.ApiKeyCreateParams
import com.braintrustdata.api.models.ApiKeyDeleteParams
import com.braintrustdata.api.models.ApiKeyListPageAsync
import com.braintrustdata.api.models.ApiKeyListParams
import com.braintrustdata.api.models.ApiKeyRetrieveParams
import com.braintrustdata.api.models.CreateApiKeyOutput
import com.google.errorprone.annotations.MustBeClosed
import java.util.concurrent.CompletableFuture

interface ApiKeyServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Create a new api_key. It is possible to have multiple API keys with the same name. There is
     * no de-duplication
     */
    fun create(params: ApiKeyCreateParams): CompletableFuture<CreateApiKeyOutput> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: ApiKeyCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CreateApiKeyOutput>

    /** Get an api_key object by its id */
    fun retrieve(apiKeyId: String): CompletableFuture<ApiKey> =
        retrieve(apiKeyId, ApiKeyRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        apiKeyId: String,
        params: ApiKeyRetrieveParams = ApiKeyRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ApiKey> =
        retrieve(params.toBuilder().apiKeyId(apiKeyId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        apiKeyId: String,
        params: ApiKeyRetrieveParams = ApiKeyRetrieveParams.none(),
    ): CompletableFuture<ApiKey> = retrieve(apiKeyId, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: ApiKeyRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ApiKey>

    /** @see [retrieve] */
    fun retrieve(params: ApiKeyRetrieveParams): CompletableFuture<ApiKey> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(apiKeyId: String, requestOptions: RequestOptions): CompletableFuture<ApiKey> =
        retrieve(apiKeyId, ApiKeyRetrieveParams.none(), requestOptions)

    /**
     * List out all api_keys. The api_keys are sorted by creation date, with the most
     * recently-created api_keys coming first
     */
    fun list(): CompletableFuture<ApiKeyListPageAsync> = list(ApiKeyListParams.none())

    /** @see [list] */
    fun list(
        params: ApiKeyListParams = ApiKeyListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ApiKeyListPageAsync>

    /** @see [list] */
    fun list(
        params: ApiKeyListParams = ApiKeyListParams.none()
    ): CompletableFuture<ApiKeyListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<ApiKeyListPageAsync> =
        list(ApiKeyListParams.none(), requestOptions)

    /** Delete an api_key object by its id */
    fun delete(apiKeyId: String): CompletableFuture<ApiKey> =
        delete(apiKeyId, ApiKeyDeleteParams.none())

    /** @see [delete] */
    fun delete(
        apiKeyId: String,
        params: ApiKeyDeleteParams = ApiKeyDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ApiKey> =
        delete(params.toBuilder().apiKeyId(apiKeyId).build(), requestOptions)

    /** @see [delete] */
    fun delete(
        apiKeyId: String,
        params: ApiKeyDeleteParams = ApiKeyDeleteParams.none(),
    ): CompletableFuture<ApiKey> = delete(apiKeyId, params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: ApiKeyDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ApiKey>

    /** @see [delete] */
    fun delete(params: ApiKeyDeleteParams): CompletableFuture<ApiKey> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(apiKeyId: String, requestOptions: RequestOptions): CompletableFuture<ApiKey> =
        delete(apiKeyId, ApiKeyDeleteParams.none(), requestOptions)

    /**
     * A view of [ApiKeyServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /v1/api_key`, but is otherwise the same as
         * [ApiKeyServiceAsync.create].
         */
        @MustBeClosed
        fun create(
            params: ApiKeyCreateParams
        ): CompletableFuture<HttpResponseFor<CreateApiKeyOutput>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: ApiKeyCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CreateApiKeyOutput>>

        /**
         * Returns a raw HTTP response for `get /v1/api_key/{api_key_id}`, but is otherwise the same
         * as [ApiKeyServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(apiKeyId: String): CompletableFuture<HttpResponseFor<ApiKey>> =
            retrieve(apiKeyId, ApiKeyRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            apiKeyId: String,
            params: ApiKeyRetrieveParams = ApiKeyRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ApiKey>> =
            retrieve(params.toBuilder().apiKeyId(apiKeyId).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            apiKeyId: String,
            params: ApiKeyRetrieveParams = ApiKeyRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<ApiKey>> =
            retrieve(apiKeyId, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: ApiKeyRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ApiKey>>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(params: ApiKeyRetrieveParams): CompletableFuture<HttpResponseFor<ApiKey>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            apiKeyId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ApiKey>> =
            retrieve(apiKeyId, ApiKeyRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/api_key`, but is otherwise the same as
         * [ApiKeyServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<ApiKeyListPageAsync>> =
            list(ApiKeyListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: ApiKeyListParams = ApiKeyListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ApiKeyListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: ApiKeyListParams = ApiKeyListParams.none()
        ): CompletableFuture<HttpResponseFor<ApiKeyListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ApiKeyListPageAsync>> =
            list(ApiKeyListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/api_key/{api_key_id}`, but is otherwise the
         * same as [ApiKeyServiceAsync.delete].
         */
        @MustBeClosed
        fun delete(apiKeyId: String): CompletableFuture<HttpResponseFor<ApiKey>> =
            delete(apiKeyId, ApiKeyDeleteParams.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            apiKeyId: String,
            params: ApiKeyDeleteParams = ApiKeyDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ApiKey>> =
            delete(params.toBuilder().apiKeyId(apiKeyId).build(), requestOptions)

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            apiKeyId: String,
            params: ApiKeyDeleteParams = ApiKeyDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<ApiKey>> =
            delete(apiKeyId, params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: ApiKeyDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ApiKey>>

        /** @see [delete] */
        @MustBeClosed
        fun delete(params: ApiKeyDeleteParams): CompletableFuture<HttpResponseFor<ApiKey>> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            apiKeyId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ApiKey>> =
            delete(apiKeyId, ApiKeyDeleteParams.none(), requestOptions)
    }
}
