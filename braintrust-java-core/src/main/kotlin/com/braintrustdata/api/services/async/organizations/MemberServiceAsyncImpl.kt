// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.services.async.organizations

import com.braintrustdata.api.core.ClientOptions
import com.braintrustdata.api.core.RequestOptions
import com.braintrustdata.api.core.handlers.errorHandler
import com.braintrustdata.api.core.handlers.jsonHandler
import com.braintrustdata.api.core.handlers.withErrorHandler
import com.braintrustdata.api.core.http.HttpMethod
import com.braintrustdata.api.core.http.HttpRequest
import com.braintrustdata.api.core.http.HttpResponse.Handler
import com.braintrustdata.api.core.http.HttpResponseFor
import com.braintrustdata.api.core.http.parseable
import com.braintrustdata.api.core.json
import com.braintrustdata.api.core.prepareAsync
import com.braintrustdata.api.errors.BraintrustError
import com.braintrustdata.api.models.OrganizationMemberUpdateParams
import com.braintrustdata.api.models.PatchOrganizationMembersOutput
import java.util.concurrent.CompletableFuture

class MemberServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    MemberServiceAsync {

    private val withRawResponse: MemberServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): MemberServiceAsync.WithRawResponse = withRawResponse

    override fun update(
        params: OrganizationMemberUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PatchOrganizationMembersOutput> =
        // patch /v1/organization/members
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MemberServiceAsync.WithRawResponse {

        private val errorHandler: Handler<BraintrustError> = errorHandler(clientOptions.jsonMapper)

        private val updateHandler: Handler<PatchOrganizationMembersOutput> =
            jsonHandler<PatchOrganizationMembersOutput>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun update(
            params: OrganizationMemberUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PatchOrganizationMembersOutput>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .addPathSegments("v1", "organization", "members")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { updateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }
    }
}
