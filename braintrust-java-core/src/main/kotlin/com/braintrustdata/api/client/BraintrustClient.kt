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
import com.braintrustdata.api.services.blocking.*
import com.braintrustdata.api.services.emptyHandler
import com.braintrustdata.api.services.errorHandler
import com.braintrustdata.api.services.json
import com.braintrustdata.api.services.jsonHandler
import com.braintrustdata.api.services.stringHandler
import com.braintrustdata.api.services.binaryHandler
import com.braintrustdata.api.services.withErrorHandler

interface BraintrustClient {

    fun async(): BraintrustClientAsync

    fun topLevel(): TopLevelService

    fun project(): ProjectService

    fun experiment(): ExperimentService

    fun dataset(): DatasetService

    fun prompt(): PromptService

    fun role(): RoleService

    fun group(): GroupService

    fun acl(): AclService

    fun user(): UserService

    fun projectScore(): ProjectScoreService

    fun projectTag(): ProjectTagService

    fun function(): FunctionService

    fun view(): ViewService

    fun organization(): OrganizationService

    fun apiKey(): ApiKeyService
}
