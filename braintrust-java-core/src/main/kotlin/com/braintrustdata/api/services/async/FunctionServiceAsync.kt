// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.services.async

import com.braintrustdata.api.core.RequestOptions
import com.braintrustdata.api.core.http.HttpResponseFor
import com.braintrustdata.api.models.Function
import com.braintrustdata.api.models.FunctionCreateParams
import com.braintrustdata.api.models.FunctionDeleteParams
import com.braintrustdata.api.models.FunctionInvokeParams
import com.braintrustdata.api.models.FunctionInvokeResponse
import com.braintrustdata.api.models.FunctionListPageAsync
import com.braintrustdata.api.models.FunctionListParams
import com.braintrustdata.api.models.FunctionReplaceParams
import com.braintrustdata.api.models.FunctionRetrieveParams
import com.braintrustdata.api.models.FunctionUpdateParams
import com.google.errorprone.annotations.MustBeClosed
import java.util.Optional
import java.util.concurrent.CompletableFuture

interface FunctionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Create a new function. If there is an existing function in the project with the same slug as
     * the one specified in the request, will return the existing function unmodified
     */
    fun create(params: FunctionCreateParams): CompletableFuture<Function> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: FunctionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Function>

    /** Get a function object by its id */
    fun retrieve(functionId: String): CompletableFuture<Function> =
        retrieve(functionId, FunctionRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        functionId: String,
        params: FunctionRetrieveParams = FunctionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Function> =
        retrieve(params.toBuilder().functionId(functionId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        functionId: String,
        params: FunctionRetrieveParams = FunctionRetrieveParams.none(),
    ): CompletableFuture<Function> = retrieve(functionId, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: FunctionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Function>

    /** @see [retrieve] */
    fun retrieve(params: FunctionRetrieveParams): CompletableFuture<Function> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(functionId: String, requestOptions: RequestOptions): CompletableFuture<Function> =
        retrieve(functionId, FunctionRetrieveParams.none(), requestOptions)

    /**
     * Partially update a function object. Specify the fields to update in the payload. Any
     * object-type fields will be deep-merged with existing content. Currently we do not support
     * removing fields or setting them to null.
     */
    fun update(functionId: String): CompletableFuture<Function> =
        update(functionId, FunctionUpdateParams.none())

    /** @see [update] */
    fun update(
        functionId: String,
        params: FunctionUpdateParams = FunctionUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Function> =
        update(params.toBuilder().functionId(functionId).build(), requestOptions)

    /** @see [update] */
    fun update(
        functionId: String,
        params: FunctionUpdateParams = FunctionUpdateParams.none(),
    ): CompletableFuture<Function> = update(functionId, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: FunctionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Function>

    /** @see [update] */
    fun update(params: FunctionUpdateParams): CompletableFuture<Function> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(functionId: String, requestOptions: RequestOptions): CompletableFuture<Function> =
        update(functionId, FunctionUpdateParams.none(), requestOptions)

    /**
     * List out all functions. The functions are sorted by creation date, with the most
     * recently-created functions coming first
     */
    fun list(): CompletableFuture<FunctionListPageAsync> = list(FunctionListParams.none())

    /** @see [list] */
    fun list(
        params: FunctionListParams = FunctionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FunctionListPageAsync>

    /** @see [list] */
    fun list(
        params: FunctionListParams = FunctionListParams.none()
    ): CompletableFuture<FunctionListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<FunctionListPageAsync> =
        list(FunctionListParams.none(), requestOptions)

    /** Delete a function object by its id */
    fun delete(functionId: String): CompletableFuture<Function> =
        delete(functionId, FunctionDeleteParams.none())

    /** @see [delete] */
    fun delete(
        functionId: String,
        params: FunctionDeleteParams = FunctionDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Function> =
        delete(params.toBuilder().functionId(functionId).build(), requestOptions)

    /** @see [delete] */
    fun delete(
        functionId: String,
        params: FunctionDeleteParams = FunctionDeleteParams.none(),
    ): CompletableFuture<Function> = delete(functionId, params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: FunctionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Function>

    /** @see [delete] */
    fun delete(params: FunctionDeleteParams): CompletableFuture<Function> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(functionId: String, requestOptions: RequestOptions): CompletableFuture<Function> =
        delete(functionId, FunctionDeleteParams.none(), requestOptions)

    /** Invoke a function. */
    fun invoke(functionId: String): CompletableFuture<Optional<FunctionInvokeResponse>> =
        invoke(functionId, FunctionInvokeParams.none())

    /** @see [invoke] */
    fun invoke(
        functionId: String,
        params: FunctionInvokeParams = FunctionInvokeParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Optional<FunctionInvokeResponse>> =
        invoke(params.toBuilder().functionId(functionId).build(), requestOptions)

    /** @see [invoke] */
    fun invoke(
        functionId: String,
        params: FunctionInvokeParams = FunctionInvokeParams.none(),
    ): CompletableFuture<Optional<FunctionInvokeResponse>> =
        invoke(functionId, params, RequestOptions.none())

    /** @see [invoke] */
    fun invoke(
        params: FunctionInvokeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Optional<FunctionInvokeResponse>>

    /** @see [invoke] */
    fun invoke(params: FunctionInvokeParams): CompletableFuture<Optional<FunctionInvokeResponse>> =
        invoke(params, RequestOptions.none())

    /** @see [invoke] */
    fun invoke(
        functionId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<Optional<FunctionInvokeResponse>> =
        invoke(functionId, FunctionInvokeParams.none(), requestOptions)

    /**
     * Create or replace function. If there is an existing function in the project with the same
     * slug as the one specified in the request, will replace the existing function with the
     * provided fields
     */
    fun replace(params: FunctionReplaceParams): CompletableFuture<Function> =
        replace(params, RequestOptions.none())

    /** @see [replace] */
    fun replace(
        params: FunctionReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Function>

    /**
     * A view of [FunctionServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /v1/function`, but is otherwise the same as
         * [FunctionServiceAsync.create].
         */
        @MustBeClosed
        fun create(params: FunctionCreateParams): CompletableFuture<HttpResponseFor<Function>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: FunctionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Function>>

        /**
         * Returns a raw HTTP response for `get /v1/function/{function_id}`, but is otherwise the
         * same as [FunctionServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(functionId: String): CompletableFuture<HttpResponseFor<Function>> =
            retrieve(functionId, FunctionRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            functionId: String,
            params: FunctionRetrieveParams = FunctionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Function>> =
            retrieve(params.toBuilder().functionId(functionId).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            functionId: String,
            params: FunctionRetrieveParams = FunctionRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<Function>> =
            retrieve(functionId, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: FunctionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Function>>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(params: FunctionRetrieveParams): CompletableFuture<HttpResponseFor<Function>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            functionId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Function>> =
            retrieve(functionId, FunctionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /v1/function/{function_id}`, but is otherwise the
         * same as [FunctionServiceAsync.update].
         */
        @MustBeClosed
        fun update(functionId: String): CompletableFuture<HttpResponseFor<Function>> =
            update(functionId, FunctionUpdateParams.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            functionId: String,
            params: FunctionUpdateParams = FunctionUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Function>> =
            update(params.toBuilder().functionId(functionId).build(), requestOptions)

        /** @see [update] */
        @MustBeClosed
        fun update(
            functionId: String,
            params: FunctionUpdateParams = FunctionUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<Function>> =
            update(functionId, params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: FunctionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Function>>

        /** @see [update] */
        @MustBeClosed
        fun update(params: FunctionUpdateParams): CompletableFuture<HttpResponseFor<Function>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            functionId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Function>> =
            update(functionId, FunctionUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/function`, but is otherwise the same as
         * [FunctionServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<FunctionListPageAsync>> =
            list(FunctionListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: FunctionListParams = FunctionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FunctionListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: FunctionListParams = FunctionListParams.none()
        ): CompletableFuture<HttpResponseFor<FunctionListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<FunctionListPageAsync>> =
            list(FunctionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/function/{function_id}`, but is otherwise the
         * same as [FunctionServiceAsync.delete].
         */
        @MustBeClosed
        fun delete(functionId: String): CompletableFuture<HttpResponseFor<Function>> =
            delete(functionId, FunctionDeleteParams.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            functionId: String,
            params: FunctionDeleteParams = FunctionDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Function>> =
            delete(params.toBuilder().functionId(functionId).build(), requestOptions)

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            functionId: String,
            params: FunctionDeleteParams = FunctionDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<Function>> =
            delete(functionId, params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: FunctionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Function>>

        /** @see [delete] */
        @MustBeClosed
        fun delete(params: FunctionDeleteParams): CompletableFuture<HttpResponseFor<Function>> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            functionId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Function>> =
            delete(functionId, FunctionDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/function/{function_id}/invoke`, but is
         * otherwise the same as [FunctionServiceAsync.invoke].
         */
        @MustBeClosed
        fun invoke(
            functionId: String
        ): CompletableFuture<HttpResponseFor<Optional<FunctionInvokeResponse>>> =
            invoke(functionId, FunctionInvokeParams.none())

        /** @see [invoke] */
        @MustBeClosed
        fun invoke(
            functionId: String,
            params: FunctionInvokeParams = FunctionInvokeParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Optional<FunctionInvokeResponse>>> =
            invoke(params.toBuilder().functionId(functionId).build(), requestOptions)

        /** @see [invoke] */
        @MustBeClosed
        fun invoke(
            functionId: String,
            params: FunctionInvokeParams = FunctionInvokeParams.none(),
        ): CompletableFuture<HttpResponseFor<Optional<FunctionInvokeResponse>>> =
            invoke(functionId, params, RequestOptions.none())

        /** @see [invoke] */
        @MustBeClosed
        fun invoke(
            params: FunctionInvokeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Optional<FunctionInvokeResponse>>>

        /** @see [invoke] */
        @MustBeClosed
        fun invoke(
            params: FunctionInvokeParams
        ): CompletableFuture<HttpResponseFor<Optional<FunctionInvokeResponse>>> =
            invoke(params, RequestOptions.none())

        /** @see [invoke] */
        @MustBeClosed
        fun invoke(
            functionId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Optional<FunctionInvokeResponse>>> =
            invoke(functionId, FunctionInvokeParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /v1/function`, but is otherwise the same as
         * [FunctionServiceAsync.replace].
         */
        @MustBeClosed
        fun replace(params: FunctionReplaceParams): CompletableFuture<HttpResponseFor<Function>> =
            replace(params, RequestOptions.none())

        /** @see [replace] */
        @MustBeClosed
        fun replace(
            params: FunctionReplaceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Function>>
    }
}
