// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.services.blocking.project

import com.fasterxml.jackson.databind.json.JsonMapper
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import kotlin.LazyThreadSafetyMode.PUBLICATION
import java.time.LocalDate
import java.time.Duration
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Base64
import java.util.Optional
import java.util.UUID
import java.util.concurrent.CompletableFuture
import java.util.stream.Stream
import com.braintrustdata.api.core.Enum
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.errors.BraintrustInvalidDataException
import com.braintrustdata.api.models.ProjectLogFeedbackParams
import com.braintrustdata.api.models.ProjectLogFetchParams
import com.braintrustdata.api.models.ProjectLogFetchPostParams
import com.braintrustdata.api.models.ProjectLogFetchPostResponse
import com.braintrustdata.api.models.ProjectLogFetchResponse
import com.braintrustdata.api.models.ProjectLogInsertParams
import com.braintrustdata.api.models.ProjectLogInsertResponse
import com.braintrustdata.api.core.ClientOptions
import com.braintrustdata.api.core.http.HttpMethod
import com.braintrustdata.api.core.http.HttpRequest
import com.braintrustdata.api.core.http.HttpResponse.Handler
import com.braintrustdata.api.core.http.BinaryResponseContent
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.RequestOptions
import com.braintrustdata.api.errors.BraintrustError
import com.braintrustdata.api.services.emptyHandler
import com.braintrustdata.api.services.errorHandler
import com.braintrustdata.api.services.json
import com.braintrustdata.api.services.jsonHandler
import com.braintrustdata.api.services.multipartFormData
import com.braintrustdata.api.services.stringHandler
import com.braintrustdata.api.services.binaryHandler
import com.braintrustdata.api.services.withErrorHandler

class LogServiceImpl constructor(private val clientOptions: ClientOptions, ) : LogService {

    private val errorHandler: Handler<BraintrustError> = errorHandler(clientOptions.jsonMapper)

    private val feedbackHandler: Handler<Void?> =
    emptyHandler()
    .withErrorHandler(errorHandler)

    /** Log feedback for a set of project logs events */
    override fun feedback(params: ProjectLogFeedbackParams, requestOptions: RequestOptions) {
      val request = HttpRequest.builder()
        .method(HttpMethod.POST)
        .addPathSegments("v1", "project_logs", params.getPathParam(0), "feedback")
        .putAllQueryParams(clientOptions.queryParams)
        .putAllQueryParams(params.getQueryParams())
        .putAllHeaders(clientOptions.headers)
        .putAllHeaders(params.getHeaders())
        .body(json(clientOptions.jsonMapper, params.getBody()))
        .build()
      clientOptions.httpClient.execute(request, requestOptions)
      .let { response -> 
          response.use {
              feedbackHandler.handle(it)
          }
      }
    }

    private val fetchHandler: Handler<ProjectLogFetchResponse> =
    jsonHandler<ProjectLogFetchResponse>(clientOptions.jsonMapper)
    .withErrorHandler(errorHandler)

    /**
     * Fetch the events in a project logs. Equivalent to the POST form of the same
     * path, but with the parameters in the URL query rather than in the request body
     */
    override fun fetch(params: ProjectLogFetchParams, requestOptions: RequestOptions): ProjectLogFetchResponse {
      val request = HttpRequest.builder()
        .method(HttpMethod.GET)
        .addPathSegments("v1", "project_logs", params.getPathParam(0), "fetch")
        .putAllQueryParams(clientOptions.queryParams)
        .putAllQueryParams(params.getQueryParams())
        .putAllHeaders(clientOptions.headers)
        .putAllHeaders(params.getHeaders())
        .build()
      return clientOptions.httpClient.execute(request, requestOptions)
      .let { response -> 
          response.use {
              fetchHandler.handle(it)
          }
          .apply  {
              if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                validate()
              }
          }
      }
    }

    private val fetchPostHandler: Handler<ProjectLogFetchPostResponse> =
    jsonHandler<ProjectLogFetchPostResponse>(clientOptions.jsonMapper)
    .withErrorHandler(errorHandler)

    /**
     * Fetch the events in a project logs. Equivalent to the GET form of the same path,
     * but with the parameters in the request body rather than in the URL query
     */
    override fun fetchPost(params: ProjectLogFetchPostParams, requestOptions: RequestOptions): ProjectLogFetchPostResponse {
      val request = HttpRequest.builder()
        .method(HttpMethod.POST)
        .addPathSegments("v1", "project_logs", params.getPathParam(0), "fetch")
        .putAllQueryParams(clientOptions.queryParams)
        .putAllQueryParams(params.getQueryParams())
        .putAllHeaders(clientOptions.headers)
        .putAllHeaders(params.getHeaders())
        .body(json(clientOptions.jsonMapper, params.getBody()))
        .build()
      return clientOptions.httpClient.execute(request, requestOptions)
      .let { response -> 
          response.use {
              fetchPostHandler.handle(it)
          }
          .apply  {
              if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                validate()
              }
          }
      }
    }

    private val insertHandler: Handler<ProjectLogInsertResponse> =
    jsonHandler<ProjectLogInsertResponse>(clientOptions.jsonMapper)
    .withErrorHandler(errorHandler)

    /** Insert a set of events into the project logs */
    override fun insert(params: ProjectLogInsertParams, requestOptions: RequestOptions): ProjectLogInsertResponse {
      val request = HttpRequest.builder()
        .method(HttpMethod.POST)
        .addPathSegments("v1", "project_logs", params.getPathParam(0), "insert")
        .putAllQueryParams(clientOptions.queryParams)
        .putAllQueryParams(params.getQueryParams())
        .putAllHeaders(clientOptions.headers)
        .putAllHeaders(params.getHeaders())
        .body(json(clientOptions.jsonMapper, params.getBody()))
        .build()
      return clientOptions.httpClient.execute(request, requestOptions)
      .let { response -> 
          response.use {
              insertHandler.handle(it)
          }
          .apply  {
              if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                validate()
              }
          }
      }
    }
}
