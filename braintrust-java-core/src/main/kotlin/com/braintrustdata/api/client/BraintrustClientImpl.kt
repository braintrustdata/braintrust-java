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

    private val projects: ProjectService by lazy { ProjectServiceImpl(clientOptions) }

    private val experiments: ExperimentService by lazy { ExperimentServiceImpl(clientOptions) }

    private val datasets: DatasetService by lazy { DatasetServiceImpl(clientOptions) }

    private val prompts: PromptService by lazy { PromptServiceImpl(clientOptions) }

    private val roles: RoleService by lazy { RoleServiceImpl(clientOptions) }

    private val groups: GroupService by lazy { GroupServiceImpl(clientOptions) }

    private val acls: AclService by lazy { AclServiceImpl(clientOptions) }

    private val users: UserService by lazy { UserServiceImpl(clientOptions) }

    private val projectScores: ProjectScoreService by lazy { ProjectScoreServiceImpl(clientOptions) }

    private val projectTags: ProjectTagService by lazy { ProjectTagServiceImpl(clientOptions) }

    private val functions: FunctionService by lazy { FunctionServiceImpl(clientOptions) }

    private val views: ViewService by lazy { ViewServiceImpl(clientOptions) }

    private val organizations: OrganizationService by lazy { OrganizationServiceImpl(clientOptions) }

    private val apiKeys: ApiKeyService by lazy { ApiKeyServiceImpl(clientOptions) }

    override fun async(): BraintrustClientAsync = async

    override fun topLevel(): TopLevelService = topLevel

    override fun projects(): ProjectService = projects

    override fun experiments(): ExperimentService = experiments

    override fun datasets(): DatasetService = datasets

    override fun prompts(): PromptService = prompts

    override fun roles(): RoleService = roles

    override fun groups(): GroupService = groups

    override fun acls(): AclService = acls

    override fun users(): UserService = users

    override fun projectScores(): ProjectScoreService = projectScores

    override fun projectTags(): ProjectTagService = projectTags

    override fun functions(): FunctionService = functions

    override fun views(): ViewService = views

    override fun organizations(): OrganizationService = organizations

    override fun apiKeys(): ApiKeyService = apiKeys
}
