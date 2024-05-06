// File generated from our OpenAPI spec by Stainless.

package com.braintrust.api.services.blocking

import com.braintrust.api.core.ClientOptions
import com.braintrust.api.core.RequestOptions
import com.braintrust.api.core.http.HttpMethod
import com.braintrust.api.core.http.HttpRequest
import com.braintrust.api.core.http.HttpResponse.Handler
import com.braintrust.api.errors.BraintrustError
import com.braintrust.api.models.Role
import com.braintrust.api.models.RoleCreateParams
import com.braintrust.api.models.RoleDeleteParams
import com.braintrust.api.models.RoleListPage
import com.braintrust.api.models.RoleListParams
import com.braintrust.api.models.RoleReplaceParams
import com.braintrust.api.models.RoleRetrieveParams
import com.braintrust.api.models.RoleUpdateParams
import com.braintrust.api.services.errorHandler
import com.braintrust.api.services.json
import com.braintrust.api.services.jsonHandler
import com.braintrust.api.services.withErrorHandler

class RoleServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : RoleService {

    private val errorHandler: Handler<BraintrustError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<Role> =
        jsonHandler<Role>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Create a new role. If there is an existing role with the same name as the one specified in
     * the request, will return the existing role unmodified
     */
    override fun create(params: RoleCreateParams, requestOptions: RequestOptions): Role {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "role")
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

    private val retrieveHandler: Handler<Role> =
        jsonHandler<Role>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get a role object by its id */
    override fun retrieve(params: RoleRetrieveParams, requestOptions: RequestOptions): Role {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "role", params.getPathParam(0))
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

    private val updateHandler: Handler<Role> =
        jsonHandler<Role>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Partially update a role object. Specify the fields to update in the payload. Any object-type
     * fields will be deep-merged with existing content. Currently we do not support removing fields
     * or setting them to null.
     */
    override fun update(params: RoleUpdateParams, requestOptions: RequestOptions): Role {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PATCH)
                .addPathSegments("v1", "role", params.getPathParam(0))
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

    private val listHandler: Handler<RoleListPage.Response> =
        jsonHandler<RoleListPage.Response>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * List out all roles. The roles are sorted by creation date, with the most recently-created
     * roles coming first
     */
    override fun list(params: RoleListParams, requestOptions: RequestOptions): RoleListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "role")
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
                .let { RoleListPage.of(this, params, it) }
        }
    }

    private val deleteHandler: Handler<Role> =
        jsonHandler<Role>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Delete a role object by its id */
    override fun delete(params: RoleDeleteParams, requestOptions: RequestOptions): Role {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.DELETE)
                .addPathSegments("v1", "role", params.getPathParam(0))
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

    private val replaceHandler: Handler<Role> =
        jsonHandler<Role>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * NOTE: This operation is deprecated and will be removed in a future revision of the API.
     * Create or replace a new role. If there is an existing role with the same name as the one
     * specified in the request, will return the existing role unmodified, will replace the existing
     * role with the provided fields
     */
    override fun replace(params: RoleReplaceParams, requestOptions: RequestOptions): Role {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PUT)
                .addPathSegments("v1", "role")
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
