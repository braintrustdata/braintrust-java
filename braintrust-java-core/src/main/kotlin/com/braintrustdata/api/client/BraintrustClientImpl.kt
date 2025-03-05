// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.client

import com.braintrustdata.api.core.ClientOptions
import com.braintrustdata.api.core.getPackageVersion
import com.braintrustdata.api.services.blocking.AclService
import com.braintrustdata.api.services.blocking.AclServiceImpl
import com.braintrustdata.api.services.blocking.AiSecretService
import com.braintrustdata.api.services.blocking.AiSecretServiceImpl
import com.braintrustdata.api.services.blocking.ApiKeyService
import com.braintrustdata.api.services.blocking.ApiKeyServiceImpl
import com.braintrustdata.api.services.blocking.DatasetService
import com.braintrustdata.api.services.blocking.DatasetServiceImpl
import com.braintrustdata.api.services.blocking.EnvVarService
import com.braintrustdata.api.services.blocking.EnvVarServiceImpl
import com.braintrustdata.api.services.blocking.EvalService
import com.braintrustdata.api.services.blocking.EvalServiceImpl
import com.braintrustdata.api.services.blocking.ExperimentService
import com.braintrustdata.api.services.blocking.ExperimentServiceImpl
import com.braintrustdata.api.services.blocking.FunctionService
import com.braintrustdata.api.services.blocking.FunctionServiceImpl
import com.braintrustdata.api.services.blocking.GroupService
import com.braintrustdata.api.services.blocking.GroupServiceImpl
import com.braintrustdata.api.services.blocking.OrganizationService
import com.braintrustdata.api.services.blocking.OrganizationServiceImpl
import com.braintrustdata.api.services.blocking.ProjectScoreService
import com.braintrustdata.api.services.blocking.ProjectScoreServiceImpl
import com.braintrustdata.api.services.blocking.ProjectService
import com.braintrustdata.api.services.blocking.ProjectServiceImpl
import com.braintrustdata.api.services.blocking.ProjectTagService
import com.braintrustdata.api.services.blocking.ProjectTagServiceImpl
import com.braintrustdata.api.services.blocking.PromptService
import com.braintrustdata.api.services.blocking.PromptServiceImpl
import com.braintrustdata.api.services.blocking.RoleService
import com.braintrustdata.api.services.blocking.RoleServiceImpl
import com.braintrustdata.api.services.blocking.SpanIframeService
import com.braintrustdata.api.services.blocking.SpanIframeServiceImpl
import com.braintrustdata.api.services.blocking.TopLevelService
import com.braintrustdata.api.services.blocking.TopLevelServiceImpl
import com.braintrustdata.api.services.blocking.UserService
import com.braintrustdata.api.services.blocking.UserServiceImpl
import com.braintrustdata.api.services.blocking.ViewService
import com.braintrustdata.api.services.blocking.ViewServiceImpl

class BraintrustClientImpl(private val clientOptions: ClientOptions) : BraintrustClient {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val async: BraintrustClientAsync by lazy { BraintrustClientAsyncImpl(clientOptions) }

    private val withRawResponse: BraintrustClient.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

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

    override fun withRawResponse(): BraintrustClient.WithRawResponse = withRawResponse

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

    override fun close() = clientOptions.httpClient.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BraintrustClient.WithRawResponse {

        private val topLevel: TopLevelService.WithRawResponse by lazy {
            TopLevelServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val projects: ProjectService.WithRawResponse by lazy {
            ProjectServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val experiments: ExperimentService.WithRawResponse by lazy {
            ExperimentServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val datasets: DatasetService.WithRawResponse by lazy {
            DatasetServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val prompts: PromptService.WithRawResponse by lazy {
            PromptServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val roles: RoleService.WithRawResponse by lazy {
            RoleServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val groups: GroupService.WithRawResponse by lazy {
            GroupServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val acls: AclService.WithRawResponse by lazy {
            AclServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val users: UserService.WithRawResponse by lazy {
            UserServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val projectScores: ProjectScoreService.WithRawResponse by lazy {
            ProjectScoreServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val projectTags: ProjectTagService.WithRawResponse by lazy {
            ProjectTagServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val spanIframes: SpanIframeService.WithRawResponse by lazy {
            SpanIframeServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val functions: FunctionService.WithRawResponse by lazy {
            FunctionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val views: ViewService.WithRawResponse by lazy {
            ViewServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val organizations: OrganizationService.WithRawResponse by lazy {
            OrganizationServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val apiKeys: ApiKeyService.WithRawResponse by lazy {
            ApiKeyServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val aiSecrets: AiSecretService.WithRawResponse by lazy {
            AiSecretServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val envVars: EnvVarService.WithRawResponse by lazy {
            EnvVarServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val evals: EvalService.WithRawResponse by lazy {
            EvalServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun topLevel(): TopLevelService.WithRawResponse = topLevel

        override fun projects(): ProjectService.WithRawResponse = projects

        override fun experiments(): ExperimentService.WithRawResponse = experiments

        override fun datasets(): DatasetService.WithRawResponse = datasets

        override fun prompts(): PromptService.WithRawResponse = prompts

        override fun roles(): RoleService.WithRawResponse = roles

        override fun groups(): GroupService.WithRawResponse = groups

        override fun acls(): AclService.WithRawResponse = acls

        override fun users(): UserService.WithRawResponse = users

        override fun projectScores(): ProjectScoreService.WithRawResponse = projectScores

        override fun projectTags(): ProjectTagService.WithRawResponse = projectTags

        override fun spanIframes(): SpanIframeService.WithRawResponse = spanIframes

        override fun functions(): FunctionService.WithRawResponse = functions

        override fun views(): ViewService.WithRawResponse = views

        override fun organizations(): OrganizationService.WithRawResponse = organizations

        override fun apiKeys(): ApiKeyService.WithRawResponse = apiKeys

        override fun aiSecrets(): AiSecretService.WithRawResponse = aiSecrets

        override fun envVars(): EnvVarService.WithRawResponse = envVars

        override fun evals(): EvalService.WithRawResponse = evals
    }
}
