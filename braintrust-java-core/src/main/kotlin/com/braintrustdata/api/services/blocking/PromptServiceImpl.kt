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
import com.braintrustdata.api.models.Prompt
import com.braintrustdata.api.models.PromptCreateParams
import com.braintrustdata.api.models.PromptDeleteParams
import com.braintrustdata.api.models.PromptListPage
import com.braintrustdata.api.models.PromptListParams
import com.braintrustdata.api.models.PromptReplaceParams
import com.braintrustdata.api.models.PromptRetrieveParams
import com.braintrustdata.api.models.PromptUpdateParams

class PromptServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PromptService {

    private val errorHandler: Handler<BraintrustError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<Prompt> =
        jsonHandler<Prompt>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Create a new prompt. If there is an existing prompt in the project with the same slug as the
     * one specified in the request, will return the existing prompt unmodified
     */
    override fun create(params: PromptCreateParams, requestOptions: RequestOptions): Prompt {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "prompt")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { createHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation!!) {
                    it.validate()
                }
            }
    }

    private val retrieveHandler: Handler<Prompt> =
        jsonHandler<Prompt>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get a prompt object by its id */
    override fun retrieve(params: PromptRetrieveParams, requestOptions: RequestOptions): Prompt {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "prompt", params.getPathParam(0))
                .build()
                .prepare(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { retrieveHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation!!) {
                    it.validate()
                }
            }
    }

    private val updateHandler: Handler<Prompt> =
        jsonHandler<Prompt>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Partially update a prompt object. Specify the fields to update in the payload. Any
     * object-type fields will be deep-merged with existing content. Currently we do not support
     * removing fields or setting them to null.
     */
    override fun update(params: PromptUpdateParams, requestOptions: RequestOptions): Prompt {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PATCH)
                .addPathSegments("v1", "prompt", params.getPathParam(0))
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { updateHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation!!) {
                    it.validate()
                }
            }
    }

    private val listHandler: Handler<PromptListPage.Response> =
        jsonHandler<PromptListPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * List out all prompts. The prompts are sorted by creation date, with the most recently-created
     * prompts coming first
     */
    override fun list(params: PromptListParams, requestOptions: RequestOptions): PromptListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "prompt")
                .build()
                .prepare(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { listHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation!!) {
                    it.validate()
                }
            }
            .let { PromptListPage.of(this, params, it) }
    }

    private val deleteHandler: Handler<Prompt> =
        jsonHandler<Prompt>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Delete a prompt object by its id */
    override fun delete(params: PromptDeleteParams, requestOptions: RequestOptions): Prompt {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.DELETE)
                .addPathSegments("v1", "prompt", params.getPathParam(0))
                .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                .build()
                .prepare(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { deleteHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation!!) {
                    it.validate()
                }
            }
    }

    private val replaceHandler: Handler<Prompt> =
        jsonHandler<Prompt>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Create or replace prompt. If there is an existing prompt in the project with the same slug as
     * the one specified in the request, will replace the existing prompt with the provided fields
     */
    override fun replace(params: PromptReplaceParams, requestOptions: RequestOptions): Prompt {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PUT)
                .addPathSegments("v1", "prompt")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { replaceHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation!!) {
                    it.validate()
                }
            }
    }
}
