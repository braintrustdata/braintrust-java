// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.services.async.organizations

import com.braintrustdata.api.core.ClientOptions
import com.braintrustdata.api.core.RequestOptions
import com.braintrustdata.api.core.http.HttpMethod
import com.braintrustdata.api.core.http.HttpRequest
import com.braintrustdata.api.core.http.HttpResponse.Handler
import com.braintrustdata.api.errors.BraintrustError
import com.braintrustdata.api.models.OrganizationMemberUpdateParams
import com.braintrustdata.api.models.PatchOrganizationMembersOutput
import com.braintrustdata.api.services.errorHandler
import com.braintrustdata.api.services.json
import com.braintrustdata.api.services.jsonHandler
import com.braintrustdata.api.services.withErrorHandler
import java.util.concurrent.CompletableFuture

class MemberServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : MemberServiceAsync {

    private val errorHandler: Handler<BraintrustError> = errorHandler(clientOptions.jsonMapper)

    private val updateHandler: Handler<PatchOrganizationMembersOutput> =
        jsonHandler<PatchOrganizationMembersOutput>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Modify organization membership */
    override fun update(
        params: OrganizationMemberUpdateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<PatchOrganizationMembersOutput> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PATCH)
                .addPathSegments("v1", "organization", "members")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { updateHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
