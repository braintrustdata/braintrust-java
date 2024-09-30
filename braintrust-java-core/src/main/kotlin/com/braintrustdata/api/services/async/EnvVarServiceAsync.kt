// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.braintrustdata.api.services.async

import com.braintrustdata.api.core.RequestOptions
import com.braintrustdata.api.models.EnvVar
import com.braintrustdata.api.models.EnvVarCreateParams
import com.braintrustdata.api.models.EnvVarDeleteParams
import com.braintrustdata.api.models.EnvVarListParams
import com.braintrustdata.api.models.EnvVarListResponse
import com.braintrustdata.api.models.EnvVarReplaceParams
import com.braintrustdata.api.models.EnvVarRetrieveParams
import com.braintrustdata.api.models.EnvVarUpdateParams
import java.util.concurrent.CompletableFuture

interface EnvVarServiceAsync {

    /**
     * Create a new env_var. If there is an existing env_var with the same name as the one specified
     * in the request, will return the existing env_var unmodified
     */
    @JvmOverloads
    fun create(
        params: EnvVarCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<EnvVar>

    /** Get an env_var object by its id */
    @JvmOverloads
    fun retrieve(
        params: EnvVarRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<EnvVar>

    /**
     * Partially update an env_var object. Specify the fields to update in the payload. Any
     * object-type fields will be deep-merged with existing content. Currently we do not support
     * removing fields or setting them to null.
     */
    @JvmOverloads
    fun update(
        params: EnvVarUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<EnvVar>

    /**
     * List out all env_vars. The env_vars are sorted by creation date, with the most
     * recently-created env_vars coming first
     */
    @JvmOverloads
    fun list(
        params: EnvVarListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<EnvVarListResponse>

    /** Delete an env_var object by its id */
    @JvmOverloads
    fun delete(
        params: EnvVarDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<EnvVar>

    /**
     * Create or replace env_var. If there is an existing env_var with the same name as the one
     * specified in the request, will replace the existing env_var with the provided fields
     */
    @JvmOverloads
    fun replace(
        params: EnvVarReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<EnvVar>
}
