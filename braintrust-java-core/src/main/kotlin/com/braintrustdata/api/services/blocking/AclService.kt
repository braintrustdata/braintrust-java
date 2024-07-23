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
import com.braintrustdata.api.models.Acl
import com.braintrustdata.api.models.AclCreateParams
import com.braintrustdata.api.models.AclDeleteParams
import com.braintrustdata.api.models.AclListPage
import com.braintrustdata.api.models.AclListParams
import com.braintrustdata.api.models.AclRetrieveParams
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

interface AclService {

    /**
     * Create a new acl. If there is an existing acl with the same contents as the one
     * specified in the request, will return the existing acl unmodified
     */
    @JvmOverloads
    fun create(params: AclCreateParams, requestOptions: RequestOptions = RequestOptions.none()): Acl

    /** Get an acl object by its id */
    @JvmOverloads
    fun retrieve(params: AclRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): Acl

    /**
     * List out all acls. The acls are sorted by creation date, with the most
     * recently-created acls coming first
     */
    @JvmOverloads
    fun list(params: AclListParams, requestOptions: RequestOptions = RequestOptions.none()): AclListPage

    /** Delete an acl object by its id */
    @JvmOverloads
    fun delete(params: AclDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): Acl
}
