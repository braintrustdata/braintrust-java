// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.braintrustdata.api.services.async

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
import com.braintrustdata.api.models.Prompt
import com.braintrustdata.api.models.PromptCreateParams
import com.braintrustdata.api.models.PromptDeleteParams
import com.braintrustdata.api.models.PromptFeedbackParams
import com.braintrustdata.api.models.PromptListPageAsync
import com.braintrustdata.api.models.PromptListParams
import com.braintrustdata.api.models.PromptReplaceParams
import com.braintrustdata.api.models.PromptRetrieveParams
import com.braintrustdata.api.models.PromptUpdateParams
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

interface PromptServiceAsync {

    /**
     * Create a new prompt. If there is an existing prompt in the project with the same
     * slug as the one specified in the request, will return the existing prompt
     * unmodified
     */
    @JvmOverloads
    fun create(params: PromptCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Prompt>

    /** Get a prompt object by its id */
    @JvmOverloads
    fun retrieve(params: PromptRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Prompt>

    /**
     * Partially update a prompt object. Specify the fields to update in the payload.
     * Any object-type fields will be deep-merged with existing content. Currently we
     * do not support removing fields or setting them to null.
     */
    @JvmOverloads
    fun update(params: PromptUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Prompt>

    /**
     * List out all prompts. The prompts are sorted by creation date, with the most
     * recently-created prompts coming first
     */
    @JvmOverloads
    fun list(params: PromptListParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<PromptListPageAsync>

    /** Delete a prompt object by its id */
    @JvmOverloads
    fun delete(params: PromptDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Prompt>

    /** Log feedback for a set of prompt events */
    @JvmOverloads
    fun feedback(params: PromptFeedbackParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void>

    /**
     * Create or replace prompt. If there is an existing prompt in the project with the
     * same slug as the one specified in the request, will replace the existing prompt
     * with the provided fields
     */
    @JvmOverloads
    fun replace(params: PromptReplaceParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Prompt>
}
