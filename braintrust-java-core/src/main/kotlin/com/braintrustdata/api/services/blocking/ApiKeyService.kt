// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.services.blocking

import com.braintrustdata.api.core.RequestOptions
import com.braintrustdata.api.core.http.HttpResponseFor
import com.braintrustdata.api.models.ApiKey
import com.braintrustdata.api.models.ApiKeyCreateParams
import com.braintrustdata.api.models.ApiKeyDeleteParams
import com.braintrustdata.api.models.ApiKeyListPage
import com.braintrustdata.api.models.ApiKeyListParams
import com.braintrustdata.api.models.ApiKeyRetrieveParams
import com.braintrustdata.api.models.CreateApiKeyOutput
import com.google.errorprone.annotations.MustBeClosed

interface ApiKeyService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Create a new api_key. It is possible to have multiple API keys with the same name. There is
     * no de-duplication
     */
    fun create(params: ApiKeyCreateParams): CreateApiKeyOutput =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: ApiKeyCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreateApiKeyOutput

    /** Get an api_key object by its id */
    fun retrieve(params: ApiKeyRetrieveParams): ApiKey = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: ApiKeyRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ApiKey

    /**
     * List out all api_keys. The api_keys are sorted by creation date, with the most
     * recently-created api_keys coming first
     */
    fun list(): ApiKeyListPage = list(ApiKeyListParams.none())

    /** @see [list] */
    fun list(
        params: ApiKeyListParams = ApiKeyListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ApiKeyListPage

    /** @see [list] */
    fun list(params: ApiKeyListParams = ApiKeyListParams.none()): ApiKeyListPage =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): ApiKeyListPage =
        list(ApiKeyListParams.none(), requestOptions)

    /** Delete an api_key object by its id */
    fun delete(params: ApiKeyDeleteParams): ApiKey = delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: ApiKeyDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ApiKey

    /** A view of [ApiKeyService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /v1/api_key`, but is otherwise the same as
         * [ApiKeyService.create].
         */
        @MustBeClosed
        fun create(params: ApiKeyCreateParams): HttpResponseFor<CreateApiKeyOutput> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: ApiKeyCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CreateApiKeyOutput>

        /**
         * Returns a raw HTTP response for `get /v1/api_key/{api_key_id}`, but is otherwise the same
         * as [ApiKeyService.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: ApiKeyRetrieveParams): HttpResponseFor<ApiKey> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: ApiKeyRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ApiKey>

        /**
         * Returns a raw HTTP response for `get /v1/api_key`, but is otherwise the same as
         * [ApiKeyService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<ApiKeyListPage> = list(ApiKeyListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: ApiKeyListParams = ApiKeyListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ApiKeyListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: ApiKeyListParams = ApiKeyListParams.none()
        ): HttpResponseFor<ApiKeyListPage> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ApiKeyListPage> =
            list(ApiKeyListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/api_key/{api_key_id}`, but is otherwise the
         * same as [ApiKeyService.delete].
         */
        @MustBeClosed
        fun delete(params: ApiKeyDeleteParams): HttpResponseFor<ApiKey> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: ApiKeyDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ApiKey>
    }
}
