// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.client

import com.braintrustdata.api.core.ClientOptions
import com.braintrustdata.api.core.getPackageVersion
import com.braintrustdata.api.models.*
import com.braintrustdata.api.services.async.*

class BraintrustClientAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : BraintrustClientAsync {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.containsKey("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val sync: BraintrustClient by lazy { BraintrustClientImpl(clientOptions) }

    private val topLevel: TopLevelServiceAsync by lazy {
        TopLevelServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val projects: ProjectServiceAsync by lazy {
        ProjectServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val experiments: ExperimentServiceAsync by lazy {
        ExperimentServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val datasets: DatasetServiceAsync by lazy {
        DatasetServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val prompts: PromptServiceAsync by lazy {
        PromptServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val roles: RoleServiceAsync by lazy { RoleServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val groups: GroupServiceAsync by lazy {
        GroupServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val acls: AclServiceAsync by lazy { AclServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val users: UserServiceAsync by lazy { UserServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val projectScores: ProjectScoreServiceAsync by lazy {
        ProjectScoreServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val projectTags: ProjectTagServiceAsync by lazy {
        ProjectTagServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val functions: FunctionServiceAsync by lazy {
        FunctionServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val views: ViewServiceAsync by lazy { ViewServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val organizations: OrganizationServiceAsync by lazy {
        OrganizationServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val apiKeys: ApiKeyServiceAsync by lazy {
        ApiKeyServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val aiSecrets: AiSecretServiceAsync by lazy {
        AiSecretServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val envVars: EnvVarServiceAsync by lazy {
        EnvVarServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val evals: EvalServiceAsync by lazy { EvalServiceAsyncImpl(clientOptionsWithUserAgent) }

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

    override fun aiSecrets(): AiSecretServiceAsync = aiSecrets

    override fun envVars(): EnvVarServiceAsync = envVars

    override fun evals(): EvalServiceAsync = evals
}
