// File generated from our OpenAPI spec by Stainless.

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

class BraintrustClientAsyncImpl constructor(private val clientOptions: ClientOptions, ) : BraintrustClientAsync {

    private val errorHandler: Handler<BraintrustError> = errorHandler(clientOptions.jsonMapper)

    private val sync: BraintrustClient by lazy { BraintrustClientImpl(clientOptions) }

    private val topLevel: TopLevelServiceAsync by lazy { TopLevelServiceAsyncImpl(clientOptions) }

    private val project: ProjectServiceAsync by lazy { ProjectServiceAsyncImpl(clientOptions) }

    private val experiment: ExperimentServiceAsync by lazy { ExperimentServiceAsyncImpl(clientOptions) }

    private val dataset: DatasetServiceAsync by lazy { DatasetServiceAsyncImpl(clientOptions) }

    private val prompt: PromptServiceAsync by lazy { PromptServiceAsyncImpl(clientOptions) }

    private val role: RoleServiceAsync by lazy { RoleServiceAsyncImpl(clientOptions) }

    private val group: GroupServiceAsync by lazy { GroupServiceAsyncImpl(clientOptions) }

    private val acl: AclServiceAsync by lazy { AclServiceAsyncImpl(clientOptions) }

    private val user: UserServiceAsync by lazy { UserServiceAsyncImpl(clientOptions) }

    private val projectScore: ProjectScoreServiceAsync by lazy { ProjectScoreServiceAsyncImpl(clientOptions) }

    private val projectTag: ProjectTagServiceAsync by lazy { ProjectTagServiceAsyncImpl(clientOptions) }

    private val function: FunctionServiceAsync by lazy { FunctionServiceAsyncImpl(clientOptions) }

    private val view: ViewServiceAsync by lazy { ViewServiceAsyncImpl(clientOptions) }

    private val organization: OrganizationServiceAsync by lazy { OrganizationServiceAsyncImpl(clientOptions) }

    private val apiKey: ApiKeyServiceAsync by lazy { ApiKeyServiceAsyncImpl(clientOptions) }

    override fun sync(): BraintrustClient = sync

    override fun topLevel(): TopLevelServiceAsync = topLevel

    override fun project(): ProjectServiceAsync = project

    override fun experiment(): ExperimentServiceAsync = experiment

    override fun dataset(): DatasetServiceAsync = dataset

    override fun prompt(): PromptServiceAsync = prompt

    override fun role(): RoleServiceAsync = role

    override fun group(): GroupServiceAsync = group

    override fun acl(): AclServiceAsync = acl

    override fun user(): UserServiceAsync = user

    override fun projectScore(): ProjectScoreServiceAsync = projectScore

    override fun projectTag(): ProjectTagServiceAsync = projectTag

    override fun function(): FunctionServiceAsync = function

    override fun view(): ViewServiceAsync = view

    override fun organization(): OrganizationServiceAsync = organization

    override fun apiKey(): ApiKeyServiceAsync = apiKey
}
