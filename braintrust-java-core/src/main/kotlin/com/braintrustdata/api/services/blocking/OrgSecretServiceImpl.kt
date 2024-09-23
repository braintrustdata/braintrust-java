// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.services.blocking

import com.braintrustdata.api.core.ClientOptions
import com.braintrustdata.api.core.RequestOptions
import com.braintrustdata.api.core.http.HttpMethod
import com.braintrustdata.api.core.http.HttpRequest
import com.braintrustdata.api.core.http.HttpResponse.Handler
import com.braintrustdata.api.errors.BraintrustError
import com.braintrustdata.api.models.OrgSecret
import com.braintrustdata.api.models.OrgSecretCreateParams
import com.braintrustdata.api.models.OrgSecretDeleteParams
import com.braintrustdata.api.models.OrgSecretFindAndDeleteParams
import com.braintrustdata.api.models.OrgSecretListPage
import com.braintrustdata.api.models.OrgSecretListParams
import com.braintrustdata.api.models.OrgSecretReplaceParams
import com.braintrustdata.api.models.OrgSecretRetrieveParams
import com.braintrustdata.api.models.OrgSecretUpdateParams
import com.braintrustdata.api.services.errorHandler
import com.braintrustdata.api.services.json
import com.braintrustdata.api.services.jsonHandler
import com.braintrustdata.api.services.withErrorHandler

class OrgSecretServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : OrgSecretService {

    private val errorHandler: Handler<BraintrustError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<OrgSecret> =
        jsonHandler<OrgSecret>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Create a new org_secret. If there is an existing org_secret with the same name as the one
     * specified in the request, will return the existing org_secret unmodified
     */
    override fun create(params: OrgSecretCreateParams, requestOptions: RequestOptions): OrgSecret {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "org_secret")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { createHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val retrieveHandler: Handler<OrgSecret> =
        jsonHandler<OrgSecret>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get an org_secret object by its id */
    override fun retrieve(
        params: OrgSecretRetrieveParams,
        requestOptions: RequestOptions
    ): OrgSecret {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "org_secret", params.getPathParam(0))
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { retrieveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val updateHandler: Handler<OrgSecret> =
        jsonHandler<OrgSecret>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Partially update an org_secret object. Specify the fields to update in the payload. Any
     * object-type fields will be deep-merged with existing content. Currently we do not support
     * removing fields or setting them to null.
     */
    override fun update(params: OrgSecretUpdateParams, requestOptions: RequestOptions): OrgSecret {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PATCH)
                .addPathSegments("v1", "org_secret", params.getPathParam(0))
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { updateHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listHandler: Handler<OrgSecretListPage.Response> =
        jsonHandler<OrgSecretListPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * List out all org_secrets. The org_secrets are sorted by creation date, with the most
     * recently-created org_secrets coming first
     */
    override fun list(
        params: OrgSecretListParams,
        requestOptions: RequestOptions
    ): OrgSecretListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "org_secret")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
                .let { OrgSecretListPage.of(this, params, it) }
        }
    }

    private val deleteHandler: Handler<OrgSecret> =
        jsonHandler<OrgSecret>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Delete an org_secret object by its id */
    override fun delete(params: OrgSecretDeleteParams, requestOptions: RequestOptions): OrgSecret {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.DELETE)
                .addPathSegments("v1", "org_secret", params.getPathParam(0))
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .apply { params.getBody().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { deleteHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val findAndDeleteHandler: Handler<OrgSecret> =
        jsonHandler<OrgSecret>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Delete a single org_secret */
    override fun findAndDelete(
        params: OrgSecretFindAndDeleteParams,
        requestOptions: RequestOptions
    ): OrgSecret {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.DELETE)
                .addPathSegments("v1", "org_secret")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { findAndDeleteHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val replaceHandler: Handler<OrgSecret> =
        jsonHandler<OrgSecret>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Create or replace org_secret. If there is an existing org_secret with the same name as the
     * one specified in the request, will replace the existing org_secret with the provided fields
     */
    override fun replace(
        params: OrgSecretReplaceParams,
        requestOptions: RequestOptions
    ): OrgSecret {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PUT)
                .addPathSegments("v1", "org_secret")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { replaceHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
