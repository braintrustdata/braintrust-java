// File generated from our OpenAPI spec by Stainless.

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
    fun create(params: EnvVarCreateParams): EnvVar = create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: EnvVarCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EnvVar

    /** Get an env_var object by its id */
    fun retrieve(envVarId: String): EnvVar = retrieve(envVarId, EnvVarRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        envVarId: String,
        params: EnvVarRetrieveParams = EnvVarRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EnvVar = retrieve(params.toBuilder().envVarId(envVarId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        envVarId: String,
        params: EnvVarRetrieveParams = EnvVarRetrieveParams.none(),
    ): EnvVar = retrieve(envVarId, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: EnvVarRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EnvVar

    /** @see [retrieve] */
    fun retrieve(params: EnvVarRetrieveParams): EnvVar = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(envVarId: String, requestOptions: RequestOptions): EnvVar =
        retrieve(envVarId, EnvVarRetrieveParams.none(), requestOptions)

    /**
     * Partially update an env_var object. Specify the fields to update in the payload. Any
     * object-type fields will be deep-merged with existing content. Currently we do not support
     * removing fields or setting them to null.
     */
    fun update(envVarId: String, params: EnvVarUpdateParams): EnvVar =
        update(envVarId, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        envVarId: String,
        params: EnvVarUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EnvVar = update(params.toBuilder().envVarId(envVarId).build(), requestOptions)

    /** @see [update] */
    fun update(params: EnvVarUpdateParams): EnvVar = update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: EnvVarUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EnvVar

    /**
     * List out all env_vars. The env_vars are sorted by creation date, with the most
     * recently-created env_vars coming first
     */
    fun list(): EnvVarListResponse = list(EnvVarListParams.none())

    /** @see [list] */
    fun list(
        params: EnvVarListParams = EnvVarListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EnvVarListResponse

    /** @see [list] */
    fun list(params: EnvVarListParams = EnvVarListParams.none()): EnvVarListResponse =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): EnvVarListResponse =
        list(EnvVarListParams.none(), requestOptions)

    /** Delete an env_var object by its id */
    fun delete(envVarId: String): EnvVar = delete(envVarId, EnvVarDeleteParams.none())

    /** @see [delete] */
    fun delete(
        envVarId: String,
        params: EnvVarDeleteParams = EnvVarDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EnvVar = delete(params.toBuilder().envVarId(envVarId).build(), requestOptions)

    /** @see [delete] */
    fun delete(envVarId: String, params: EnvVarDeleteParams = EnvVarDeleteParams.none()): EnvVar =
        delete(envVarId, params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: EnvVarDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EnvVar

    /** @see [delete] */
    fun delete(params: EnvVarDeleteParams): EnvVar = delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(envVarId: String, requestOptions: RequestOptions): EnvVar =
        delete(envVarId, EnvVarDeleteParams.none(), requestOptions)

    /**
     * Create or replace env_var. If there is an existing env_var with the same name as the one
     * specified in the request, will replace the existing env_var with the provided fields
     */
    fun replace(params: EnvVarReplaceParams): EnvVar = replace(params, RequestOptions.none())

    /** @see [replace] */
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
        @MustBeClosed
        fun create(params: EnvVarCreateParams): HttpResponseFor<EnvVar> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: EnvVarCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EnvVar>

        /**
         * Returns a raw HTTP response for `get /v1/env_var/{env_var_id}`, but is otherwise the same
         * as [EnvVarService.retrieve].
         */
        @MustBeClosed
        fun retrieve(envVarId: String): HttpResponseFor<EnvVar> =
            retrieve(envVarId, EnvVarRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            envVarId: String,
            params: EnvVarRetrieveParams = EnvVarRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EnvVar> =
            retrieve(params.toBuilder().envVarId(envVarId).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            envVarId: String,
            params: EnvVarRetrieveParams = EnvVarRetrieveParams.none(),
        ): HttpResponseFor<EnvVar> = retrieve(envVarId, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: EnvVarRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EnvVar>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(params: EnvVarRetrieveParams): HttpResponseFor<EnvVar> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(envVarId: String, requestOptions: RequestOptions): HttpResponseFor<EnvVar> =
            retrieve(envVarId, EnvVarRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /v1/env_var/{env_var_id}`, but is otherwise the
         * same as [EnvVarService.update].
         */
        @MustBeClosed
        fun update(envVarId: String, params: EnvVarUpdateParams): HttpResponseFor<EnvVar> =
            update(envVarId, params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            envVarId: String,
            params: EnvVarUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EnvVar> =
            update(params.toBuilder().envVarId(envVarId).build(), requestOptions)

        /** @see [update] */
        @MustBeClosed
        fun update(params: EnvVarUpdateParams): HttpResponseFor<EnvVar> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: EnvVarUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EnvVar>

        /**
         * Returns a raw HTTP response for `get /v1/env_var`, but is otherwise the same as
         * [EnvVarService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<EnvVarListResponse> = list(EnvVarListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: EnvVarListParams = EnvVarListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EnvVarListResponse>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: EnvVarListParams = EnvVarListParams.none()
        ): HttpResponseFor<EnvVarListResponse> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<EnvVarListResponse> =
            list(EnvVarListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/env_var/{env_var_id}`, but is otherwise the
         * same as [EnvVarService.delete].
         */
        @MustBeClosed
        fun delete(envVarId: String): HttpResponseFor<EnvVar> =
            delete(envVarId, EnvVarDeleteParams.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            envVarId: String,
            params: EnvVarDeleteParams = EnvVarDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EnvVar> =
            delete(params.toBuilder().envVarId(envVarId).build(), requestOptions)

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            envVarId: String,
            params: EnvVarDeleteParams = EnvVarDeleteParams.none(),
        ): HttpResponseFor<EnvVar> = delete(envVarId, params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: EnvVarDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EnvVar>

        /** @see [delete] */
        @MustBeClosed
        fun delete(params: EnvVarDeleteParams): HttpResponseFor<EnvVar> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(envVarId: String, requestOptions: RequestOptions): HttpResponseFor<EnvVar> =
            delete(envVarId, EnvVarDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /v1/env_var`, but is otherwise the same as
         * [EnvVarService.replace].
         */
        @MustBeClosed
        fun replace(params: EnvVarReplaceParams): HttpResponseFor<EnvVar> =
            replace(params, RequestOptions.none())

        /** @see [replace] */
        @MustBeClosed
        fun replace(
            params: EnvVarReplaceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EnvVar>
    }
}
