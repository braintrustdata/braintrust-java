// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.braintrustdata.api.services.blocking

import com.braintrustdata.api.core.RequestOptions
import com.braintrustdata.api.core.http.HttpResponseFor
import com.braintrustdata.api.models.Function
import com.braintrustdata.api.models.FunctionCreateParams
import com.braintrustdata.api.models.FunctionDeleteParams
import com.braintrustdata.api.models.FunctionInvokeParams
import com.braintrustdata.api.models.FunctionInvokeResponse
import com.braintrustdata.api.models.FunctionListPage
import com.braintrustdata.api.models.FunctionListParams
import com.braintrustdata.api.models.FunctionReplaceParams
import com.braintrustdata.api.models.FunctionRetrieveParams
import com.braintrustdata.api.models.FunctionUpdateParams
import com.google.errorprone.annotations.MustBeClosed
import java.util.Optional

interface FunctionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Create a new function. If there is an existing function in the project with the same slug as
     * the one specified in the request, will return the existing function unmodified
     */
    @JvmOverloads
    fun create(
        params: FunctionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Function

    /** Get a function object by its id */
    @JvmOverloads
    fun retrieve(
        params: FunctionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Function

    /**
     * Partially update a function object. Specify the fields to update in the payload. Any
     * object-type fields will be deep-merged with existing content. Currently we do not support
     * removing fields or setting them to null.
     */
    @JvmOverloads
    fun update(
        params: FunctionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Function

    /**
     * List out all functions. The functions are sorted by creation date, with the most
     * recently-created functions coming first
     */
    @JvmOverloads
    fun list(
        params: FunctionListParams = FunctionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FunctionListPage

    /**
     * List out all functions. The functions are sorted by creation date, with the most
     * recently-created functions coming first
     */
    fun list(requestOptions: RequestOptions): FunctionListPage =
        list(FunctionListParams.none(), requestOptions)

    /** Delete a function object by its id */
    @JvmOverloads
    fun delete(
        params: FunctionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Function

    /** Invoke a function. */
    @JvmOverloads
    fun invoke(
        params: FunctionInvokeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Optional<FunctionInvokeResponse>

    /**
     * Create or replace function. If there is an existing function in the project with the same
     * slug as the one specified in the request, will replace the existing function with the
     * provided fields
     */
    @JvmOverloads
    fun replace(
        params: FunctionReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Function

    /** A view of [FunctionService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /v1/function`, but is otherwise the same as
         * [FunctionService.create].
         */
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: FunctionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Function>

        /**
         * Returns a raw HTTP response for `get /v1/function/{function_id}`, but is otherwise the
         * same as [FunctionService.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: FunctionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Function>

        /**
         * Returns a raw HTTP response for `patch /v1/function/{function_id}`, but is otherwise the
         * same as [FunctionService.update].
         */
        @JvmOverloads
        @MustBeClosed
        fun update(
            params: FunctionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Function>

        /**
         * Returns a raw HTTP response for `get /v1/function`, but is otherwise the same as
         * [FunctionService.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: FunctionListParams = FunctionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FunctionListPage>

        /**
         * Returns a raw HTTP response for `get /v1/function`, but is otherwise the same as
         * [FunctionService.list].
         */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<FunctionListPage> =
            list(FunctionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/function/{function_id}`, but is otherwise the
         * same as [FunctionService.delete].
         */
        @JvmOverloads
        @MustBeClosed
        fun delete(
            params: FunctionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Function>

        /**
         * Returns a raw HTTP response for `post /v1/function/{function_id}/invoke`, but is
         * otherwise the same as [FunctionService.invoke].
         */
        @JvmOverloads
        @MustBeClosed
        fun invoke(
            params: FunctionInvokeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Optional<FunctionInvokeResponse>>

        /**
         * Returns a raw HTTP response for `put /v1/function`, but is otherwise the same as
         * [FunctionService.replace].
         */
        @JvmOverloads
        @MustBeClosed
        fun replace(
            params: FunctionReplaceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Function>
    }
}
