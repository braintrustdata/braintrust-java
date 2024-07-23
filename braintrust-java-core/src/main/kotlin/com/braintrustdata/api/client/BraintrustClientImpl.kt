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
import com.braintrustdata.api.services.blocking.*
import com.braintrustdata.api.services.emptyHandler
import com.braintrustdata.api.services.errorHandler
import com.braintrustdata.api.services.json
import com.braintrustdata.api.services.jsonHandler
import com.braintrustdata.api.services.stringHandler
import com.braintrustdata.api.services.binaryHandler
import com.braintrustdata.api.services.withErrorHandler

class BraintrustClientImpl constructor(private val clientOptions: ClientOptions, ) : BraintrustClient {

    private val errorHandler: Handler<BraintrustError> = errorHandler(clientOptions.jsonMapper)

    private val async: BraintrustClientAsync by lazy { BraintrustClientAsyncImpl(clientOptions) }

    private val topLevel: TopLevelService by lazy { TopLevelServiceImpl(clientOptions) }

    private val project: ProjectService by lazy { ProjectServiceImpl(clientOptions) }

    private val experiment: ExperimentService by lazy { ExperimentServiceImpl(clientOptions) }

    private val dataset: DatasetService by lazy { DatasetServiceImpl(clientOptions) }

    private val prompt: PromptService by lazy { PromptServiceImpl(clientOptions) }

    private val role: RoleService by lazy { RoleServiceImpl(clientOptions) }

    private val group: GroupService by lazy { GroupServiceImpl(clientOptions) }

    private val acl: AclService by lazy { AclServiceImpl(clientOptions) }

    private val user: UserService by lazy { UserServiceImpl(clientOptions) }

    private val projectScore: ProjectScoreService by lazy { ProjectScoreServiceImpl(clientOptions) }

    private val projectTag: ProjectTagService by lazy { ProjectTagServiceImpl(clientOptions) }

    private val function: FunctionService by lazy { FunctionServiceImpl(clientOptions) }

    private val view: ViewService by lazy { ViewServiceImpl(clientOptions) }

    private val organization: OrganizationService by lazy { OrganizationServiceImpl(clientOptions) }

    private val apiKey: ApiKeyService by lazy { ApiKeyServiceImpl(clientOptions) }

    override fun async(): BraintrustClientAsync = async

    override fun topLevel(): TopLevelService = topLevel

    override fun project(): ProjectService = project

    override fun experiment(): ExperimentService = experiment

    override fun dataset(): DatasetService = dataset

    override fun prompt(): PromptService = prompt

    override fun role(): RoleService = role

    override fun group(): GroupService = group

    override fun acl(): AclService = acl

    override fun user(): UserService = user

    override fun projectScore(): ProjectScoreService = projectScore

    override fun projectTag(): ProjectTagService = projectTag

    override fun function(): FunctionService = function

    override fun view(): ViewService = view

    override fun organization(): OrganizationService = organization

    override fun apiKey(): ApiKeyService = apiKey
}
