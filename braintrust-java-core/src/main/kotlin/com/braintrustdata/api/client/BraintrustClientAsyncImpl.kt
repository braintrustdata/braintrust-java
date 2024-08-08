// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.client

import com.braintrustdata.api.core.ClientOptions
import com.braintrustdata.api.core.http.HttpResponse.Handler
import com.braintrustdata.api.errors.BraintrustError
import com.braintrustdata.api.models.*
import com.braintrustdata.api.services.async.*
import com.braintrustdata.api.services.errorHandler

class BraintrustClientAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : BraintrustClientAsync {

    private val errorHandler: Handler<BraintrustError> = errorHandler(clientOptions.jsonMapper)

    private val sync: BraintrustClient by lazy { BraintrustClientImpl(clientOptions) }

    private val topLevel: TopLevelServiceAsync by lazy { TopLevelServiceAsyncImpl(clientOptions) }

    private val projects: ProjectServiceAsync by lazy { ProjectServiceAsyncImpl(clientOptions) }

    private val experiments: ExperimentServiceAsync by lazy {
        ExperimentServiceAsyncImpl(clientOptions)
    }

    private val datasets: DatasetServiceAsync by lazy { DatasetServiceAsyncImpl(clientOptions) }

    private val prompts: PromptServiceAsync by lazy { PromptServiceAsyncImpl(clientOptions) }

    private val roles: RoleServiceAsync by lazy { RoleServiceAsyncImpl(clientOptions) }

    private val groups: GroupServiceAsync by lazy { GroupServiceAsyncImpl(clientOptions) }

    private val acls: AclServiceAsync by lazy { AclServiceAsyncImpl(clientOptions) }

    private val users: UserServiceAsync by lazy { UserServiceAsyncImpl(clientOptions) }

    private val projectScores: ProjectScoreServiceAsync by lazy {
        ProjectScoreServiceAsyncImpl(clientOptions)
    }

    private val projectTags: ProjectTagServiceAsync by lazy {
        ProjectTagServiceAsyncImpl(clientOptions)
    }

    private val functions: FunctionServiceAsync by lazy { FunctionServiceAsyncImpl(clientOptions) }

    private val views: ViewServiceAsync by lazy { ViewServiceAsyncImpl(clientOptions) }

    private val organizations: OrganizationServiceAsync by lazy {
        OrganizationServiceAsyncImpl(clientOptions)
    }

    private val apiKeys: ApiKeyServiceAsync by lazy { ApiKeyServiceAsyncImpl(clientOptions) }

    override fun sync(): BraintrustClient = sync

    override fun topLevel(): TopLevelServiceAsync = topLevel

    override fun projects(): ProjectServiceAsync = projects

    override fun experiments(): ExperimentServiceAsync = experiments

    override fun datasets(): DatasetServiceAsync = datasets

    override fun prompts(): PromptServiceAsync = prompts

    override fun roles(): RoleServiceAsync = roles

    override fun groups(): GroupServiceAsync = groups

    override fun acls(): AclServiceAsync = acls

    override fun users(): UserServiceAsync = users

    override fun projectScores(): ProjectScoreServiceAsync = projectScores

    override fun projectTags(): ProjectTagServiceAsync = projectTags

    override fun functions(): FunctionServiceAsync = functions

    override fun views(): ViewServiceAsync = views

    override fun organizations(): OrganizationServiceAsync = organizations

    override fun apiKeys(): ApiKeyServiceAsync = apiKeys
}
