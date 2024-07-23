// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.braintrustdata.api.services.blocking

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
import com.braintrustdata.api.models.Function
import com.braintrustdata.api.models.FunctionCreateParams
import com.braintrustdata.api.models.FunctionDeleteParams
import com.braintrustdata.api.models.FunctionFeedbackParams
import com.braintrustdata.api.models.FunctionListPage
import com.braintrustdata.api.models.FunctionListParams
import com.braintrustdata.api.models.FunctionReplaceParams
import com.braintrustdata.api.models.FunctionRetrieveParams
import com.braintrustdata.api.models.FunctionUpdateParams
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

interface FunctionService {

    /**
     * Create a new function. If there is an existing function in the project with the
     * same slug as the one specified in the request, will return the existing function
     * unmodified
     */
    @JvmOverloads
    fun create(params: FunctionCreateParams, requestOptions: RequestOptions = RequestOptions.none()): Function

    /** Get a function object by its id */
    @JvmOverloads
    fun retrieve(params: FunctionRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): Function

    /**
     * Partially update a function object. Specify the fields to update in the payload.
     * Any object-type fields will be deep-merged with existing content. Currently we
     * do not support removing fields or setting them to null.
     */
    @JvmOverloads
    fun update(params: FunctionUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): Function

    /**
     * List out all functions. The functions are sorted by creation date, with the most
     * recently-created functions coming first
     */
    @JvmOverloads
    fun list(params: FunctionListParams, requestOptions: RequestOptions = RequestOptions.none()): FunctionListPage

    /** Delete a function object by its id */
    @JvmOverloads
    fun delete(params: FunctionDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): Function

    /** Log feedback for a set of function events */
    @JvmOverloads
    fun feedback(params: FunctionFeedbackParams, requestOptions: RequestOptions = RequestOptions.none())

    /**
     * Create or replace function. If there is an existing function in the project with
     * the same slug as the one specified in the request, will replace the existing
     * function with the provided fields
     */
    @JvmOverloads
    fun replace(params: FunctionReplaceParams, requestOptions: RequestOptions = RequestOptions.none()): Function
}
