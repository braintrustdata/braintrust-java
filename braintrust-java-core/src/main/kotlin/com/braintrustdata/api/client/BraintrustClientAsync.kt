// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.braintrustdata.api.client

import java.time.Duration
import java.util.Base64
import java.util.Optional
import java.util.concurrent.CompletableFuture
import com.braintrustdata.api.core.ClientOptions
import com.braintrustdata.api.core.http.HttpMethod
import com.braintrustdata.api.core.http.HttpRequest
import com.braintrustdata.api.core.http.HttpResponse.Handler
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.RequestOptions
import com.braintrustdata.api.errors.BraintrustError
import com.braintrustdata.api.errors.BraintrustInvalidDataException
import com.braintrustdata.api.models.*
import com.braintrustdata.api.services.async.*
import com.braintrustdata.api.services.emptyHandler
import com.braintrustdata.api.services.errorHandler
import com.braintrustdata.api.services.json
import com.braintrustdata.api.services.jsonHandler
import com.braintrustdata.api.services.stringHandler
import com.braintrustdata.api.services.binaryHandler
import com.braintrustdata.api.services.withErrorHandler

interface BraintrustClientAsync {

    fun sync(): BraintrustClient

    fun topLevel(): TopLevelServiceAsync

    fun project(): ProjectServiceAsync

    fun experiment(): ExperimentServiceAsync

    fun dataset(): DatasetServiceAsync

    fun prompt(): PromptServiceAsync

    fun role(): RoleServiceAsync

    fun group(): GroupServiceAsync

    fun acl(): AclServiceAsync

    fun user(): UserServiceAsync

    fun projectScore(): ProjectScoreServiceAsync

    fun projectTag(): ProjectTagServiceAsync

    fun function(): FunctionServiceAsync

    fun view(): ViewServiceAsync

    fun organization(): OrganizationServiceAsync

    fun apiKey(): ApiKeyServiceAsync
}
