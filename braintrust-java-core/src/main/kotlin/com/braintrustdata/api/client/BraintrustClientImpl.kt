// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.client

import com.braintrustdata.api.core.ClientOptions
import com.braintrustdata.api.core.getPackageVersion
import com.braintrustdata.api.models.*
import com.braintrustdata.api.services.blocking.*

class BraintrustClientImpl
constructor(
    private val clientOptions: ClientOptions,
) : BraintrustClient {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val async: BraintrustClientAsync by lazy { BraintrustClientAsyncImpl(clientOptions) }

    private val topLevel: TopLevelService by lazy {
        TopLevelServiceImpl(clientOptionsWithUserAgent)
    }

    private val projects: ProjectService by lazy { ProjectServiceImpl(clientOptionsWithUserAgent) }

    private val experiments: ExperimentService by lazy {
        ExperimentServiceImpl(clientOptionsWithUserAgent)
    }

    private val datasets: DatasetService by lazy { DatasetServiceImpl(clientOptionsWithUserAgent) }

    private val prompts: PromptService by lazy { PromptServiceImpl(clientOptionsWithUserAgent) }

    private val roles: RoleService by lazy { RoleServiceImpl(clientOptionsWithUserAgent) }

    private val groups: GroupService by lazy { GroupServiceImpl(clientOptionsWithUserAgent) }

    private val acls: AclService by lazy { AclServiceImpl(clientOptionsWithUserAgent) }

    private val users: UserService by lazy { UserServiceImpl(clientOptionsWithUserAgent) }

    private val projectScores: ProjectScoreService by lazy {
        ProjectScoreServiceImpl(clientOptionsWithUserAgent)
    }

    private val projectTags: ProjectTagService by lazy {
        ProjectTagServiceImpl(clientOptionsWithUserAgent)
    }

    private val spanIframes: SpanIframeService by lazy {
        SpanIframeServiceImpl(clientOptionsWithUserAgent)
    }

    private val functions: FunctionService by lazy {
        FunctionServiceImpl(clientOptionsWithUserAgent)
    }

    private val views: ViewService by lazy { ViewServiceImpl(clientOptionsWithUserAgent) }

    private val organizations: OrganizationService by lazy {
        OrganizationServiceImpl(clientOptionsWithUserAgent)
    }

    private val apiKeys: ApiKeyService by lazy { ApiKeyServiceImpl(clientOptionsWithUserAgent) }

    private val aiSecrets: AiSecretService by lazy {
        AiSecretServiceImpl(clientOptionsWithUserAgent)
    }

    private val envVars: EnvVarService by lazy { EnvVarServiceImpl(clientOptionsWithUserAgent) }

    private val evals: EvalService by lazy { EvalServiceImpl(clientOptionsWithUserAgent) }

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

    override fun spanIframes(): SpanIframeService = spanIframes

    override fun functions(): FunctionService = functions

    override fun views(): ViewService = views

    override fun organizations(): OrganizationService = organizations

    override fun apiKeys(): ApiKeyService = apiKeys

    override fun aiSecrets(): AiSecretService = aiSecrets

    override fun envVars(): EnvVarService = envVars

    override fun evals(): EvalService = evals
}
