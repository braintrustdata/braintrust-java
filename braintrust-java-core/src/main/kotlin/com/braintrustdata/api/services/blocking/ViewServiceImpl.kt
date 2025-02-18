// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.services.blocking

import com.braintrustdata.api.core.ClientOptions
import com.braintrustdata.api.core.RequestOptions
import com.braintrustdata.api.core.handlers.errorHandler
import com.braintrustdata.api.core.handlers.jsonHandler
import com.braintrustdata.api.core.handlers.withErrorHandler
import com.braintrustdata.api.core.http.HttpMethod
import com.braintrustdata.api.core.http.HttpRequest
import com.braintrustdata.api.core.http.HttpResponse.Handler
import com.braintrustdata.api.core.json
import com.braintrustdata.api.core.prepare
import com.braintrustdata.api.errors.BraintrustError
import com.braintrustdata.api.models.View
import com.braintrustdata.api.models.ViewCreateParams
import com.braintrustdata.api.models.ViewDeleteParams
import com.braintrustdata.api.models.ViewListPage
import com.braintrustdata.api.models.ViewListParams
import com.braintrustdata.api.models.ViewReplaceParams
import com.braintrustdata.api.models.ViewRetrieveParams
import com.braintrustdata.api.models.ViewUpdateParams

class ViewServiceImpl internal constructor(private val clientOptions: ClientOptions) : ViewService {

    private val errorHandler: Handler<BraintrustError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<View> =
        jsonHandler<View>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Create a new view. If there is an existing view with the same name as the one specified in
     * the request, will return the existing view unmodified
     */
    override fun create(params: ViewCreateParams, requestOptions: RequestOptions): View {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "view")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { createHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val retrieveHandler: Handler<View> =
        jsonHandler<View>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get a view object by its id */
    override fun retrieve(params: ViewRetrieveParams, requestOptions: RequestOptions): View {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "view", params.getPathParam(0))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { retrieveHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val updateHandler: Handler<View> =
        jsonHandler<View>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Partially update a view object. Specify the fields to update in the payload. Any object-type
     * fields will be deep-merged with existing content. Currently we do not support removing fields
     * or setting them to null.
     */
    override fun update(params: ViewUpdateParams, requestOptions: RequestOptions): View {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PATCH)
                .addPathSegments("v1", "view", params.getPathParam(0))
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { updateHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val listHandler: Handler<ViewListPage.Response> =
        jsonHandler<ViewListPage.Response>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * List out all views. The views are sorted by creation date, with the most recently-created
     * views coming first
     */
    override fun list(params: ViewListParams, requestOptions: RequestOptions): ViewListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "view")
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { listHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
            .let { ViewListPage.of(this, params, it) }
    }

    private val deleteHandler: Handler<View> =
        jsonHandler<View>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Delete a view object by its id */
    override fun delete(params: ViewDeleteParams, requestOptions: RequestOptions): View {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.DELETE)
                .addPathSegments("v1", "view", params.getPathParam(0))
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { deleteHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val replaceHandler: Handler<View> =
        jsonHandler<View>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Create or replace view. If there is an existing view with the same name as the one specified
     * in the request, will replace the existing view with the provided fields
     */
    override fun replace(params: ViewReplaceParams, requestOptions: RequestOptions): View {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PUT)
                .addPathSegments("v1", "view")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { replaceHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }
}
