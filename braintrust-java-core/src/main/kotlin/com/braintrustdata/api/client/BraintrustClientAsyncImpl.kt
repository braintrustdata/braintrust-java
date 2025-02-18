// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.client

import com.braintrustdata.api.core.ClientOptions
import com.braintrustdata.api.core.getPackageVersion
import com.braintrustdata.api.services.async.AclServiceAsync
import com.braintrustdata.api.services.async.AclServiceAsyncImpl
import com.braintrustdata.api.services.async.AiSecretServiceAsync
import com.braintrustdata.api.services.async.AiSecretServiceAsyncImpl
import com.braintrustdata.api.services.async.ApiKeyServiceAsync
import com.braintrustdata.api.services.async.ApiKeyServiceAsyncImpl
import com.braintrustdata.api.services.async.DatasetServiceAsync
import com.braintrustdata.api.services.async.DatasetServiceAsyncImpl
import com.braintrustdata.api.services.async.EnvVarServiceAsync
import com.braintrustdata.api.services.async.EnvVarServiceAsyncImpl
import com.braintrustdata.api.services.async.EvalServiceAsync
import com.braintrustdata.api.services.async.EvalServiceAsyncImpl
import com.braintrustdata.api.services.async.ExperimentServiceAsync
import com.braintrustdata.api.services.async.ExperimentServiceAsyncImpl
import com.braintrustdata.api.services.async.FunctionServiceAsync
import com.braintrustdata.api.services.async.FunctionServiceAsyncImpl
import com.braintrustdata.api.services.async.GroupServiceAsync
import com.braintrustdata.api.services.async.GroupServiceAsyncImpl
import com.braintrustdata.api.services.async.OrganizationServiceAsync
import com.braintrustdata.api.services.async.OrganizationServiceAsyncImpl
import com.braintrustdata.api.services.async.ProjectScoreServiceAsync
import com.braintrustdata.api.services.async.ProjectScoreServiceAsyncImpl
import com.braintrustdata.api.services.async.ProjectServiceAsync
import com.braintrustdata.api.services.async.ProjectServiceAsyncImpl
import com.braintrustdata.api.services.async.ProjectTagServiceAsync
import com.braintrustdata.api.services.async.ProjectTagServiceAsyncImpl
import com.braintrustdata.api.services.async.PromptServiceAsync
import com.braintrustdata.api.services.async.PromptServiceAsyncImpl
import com.braintrustdata.api.services.async.RoleServiceAsync
import com.braintrustdata.api.services.async.RoleServiceAsyncImpl
import com.braintrustdata.api.services.async.SpanIframeServiceAsync
import com.braintrustdata.api.services.async.SpanIframeServiceAsyncImpl
import com.braintrustdata.api.services.async.TopLevelServiceAsync
import com.braintrustdata.api.services.async.TopLevelServiceAsyncImpl
import com.braintrustdata.api.services.async.UserServiceAsync
import com.braintrustdata.api.services.async.UserServiceAsyncImpl
import com.braintrustdata.api.services.async.ViewServiceAsync
import com.braintrustdata.api.services.async.ViewServiceAsyncImpl

class BraintrustClientAsyncImpl(private val clientOptions: ClientOptions) : BraintrustClientAsync {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
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

    private val spanIframes: SpanIframeServiceAsync by lazy {
        SpanIframeServiceAsyncImpl(clientOptionsWithUserAgent)
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

    override fun spanIframes(): SpanIframeServiceAsync = spanIframes

    override fun functions(): FunctionServiceAsync = functions

    override fun views(): ViewServiceAsync = views

    override fun organizations(): OrganizationServiceAsync = organizations

    override fun apiKeys(): ApiKeyServiceAsync = apiKeys

    override fun aiSecrets(): AiSecretServiceAsync = aiSecrets

    override fun envVars(): EnvVarServiceAsync = envVars

    override fun evals(): EvalServiceAsync = evals

    override fun close() = clientOptions.httpClient.close()
}
