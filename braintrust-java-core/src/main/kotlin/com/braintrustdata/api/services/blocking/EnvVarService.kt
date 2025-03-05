// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.braintrustdata.api.services.blocking

import com.braintrustdata.api.core.RequestOptions
import com.braintrustdata.api.core.http.HttpResponseFor
import com.braintrustdata.api.models.EnvVar
import com.braintrustdata.api.models.EnvVarCreateParams
import com.braintrustdata.api.models.EnvVarDeleteParams
import com.braintrustdata.api.models.EnvVarListParams
import com.braintrustdata.api.models.EnvVarListResponse
import com.braintrustdata.api.models.EnvVarReplaceParams
import com.braintrustdata.api.models.EnvVarRetrieveParams
import com.braintrustdata.api.models.EnvVarUpdateParams
import com.google.errorprone.annotations.MustBeClosed

interface EnvVarService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Create a new env_var. If there is an existing env_var with the same name as the one specified
     * in the request, will return the existing env_var unmodified
     */
    @JvmOverloads
    fun create(
        params: EnvVarCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EnvVar

    /** Get an env_var object by its id */
    @JvmOverloads
    fun retrieve(
        params: EnvVarRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EnvVar

    /**
     * Partially update an env_var object. Specify the fields to update in the payload. Any
     * object-type fields will be deep-merged with existing content. Currently we do not support
     * removing fields or setting them to null.
     */
    @JvmOverloads
    fun update(
        params: EnvVarUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EnvVar

    /**
     * List out all env_vars. The env_vars are sorted by creation date, with the most
     * recently-created env_vars coming first
     */
    @JvmOverloads
    fun list(
        params: EnvVarListParams = EnvVarListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EnvVarListResponse

    /**
     * List out all env_vars. The env_vars are sorted by creation date, with the most
     * recently-created env_vars coming first
     */
    fun list(requestOptions: RequestOptions): EnvVarListResponse =
        list(EnvVarListParams.none(), requestOptions)

    /** Delete an env_var object by its id */
    @JvmOverloads
    fun delete(
        params: EnvVarDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EnvVar

    /**
     * Create or replace env_var. If there is an existing env_var with the same name as the one
     * specified in the request, will replace the existing env_var with the provided fields
     */
    @JvmOverloads
    fun replace(
        params: EnvVarReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EnvVar

    /** A view of [EnvVarService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /v1/env_var`, but is otherwise the same as
         * [EnvVarService.create].
         */
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: EnvVarCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EnvVar>

        /**
         * Returns a raw HTTP response for `get /v1/env_var/{env_var_id}`, but is otherwise the same
         * as [EnvVarService.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: EnvVarRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EnvVar>

        /**
         * Returns a raw HTTP response for `patch /v1/env_var/{env_var_id}`, but is otherwise the
         * same as [EnvVarService.update].
         */
        @JvmOverloads
        @MustBeClosed
        fun update(
            params: EnvVarUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EnvVar>

        /**
         * Returns a raw HTTP response for `get /v1/env_var`, but is otherwise the same as
         * [EnvVarService.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: EnvVarListParams = EnvVarListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EnvVarListResponse>

        /**
         * Returns a raw HTTP response for `get /v1/env_var`, but is otherwise the same as
         * [EnvVarService.list].
         */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<EnvVarListResponse> =
            list(EnvVarListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/env_var/{env_var_id}`, but is otherwise the
         * same as [EnvVarService.delete].
         */
        @JvmOverloads
        @MustBeClosed
        fun delete(
            params: EnvVarDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EnvVar>

        /**
         * Returns a raw HTTP response for `put /v1/env_var`, but is otherwise the same as
         * [EnvVarService.replace].
         */
        @JvmOverloads
        @MustBeClosed
        fun replace(
            params: EnvVarReplaceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EnvVar>
    }
}
