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

    private val withRawResponse: BraintrustClientAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

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

    override fun withRawResponse(): BraintrustClientAsync.WithRawResponse = withRawResponse

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

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BraintrustClientAsync.WithRawResponse {

        private val topLevel: TopLevelServiceAsync.WithRawResponse by lazy {
            TopLevelServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val projects: ProjectServiceAsync.WithRawResponse by lazy {
            ProjectServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val experiments: ExperimentServiceAsync.WithRawResponse by lazy {
            ExperimentServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val datasets: DatasetServiceAsync.WithRawResponse by lazy {
            DatasetServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val prompts: PromptServiceAsync.WithRawResponse by lazy {
            PromptServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val roles: RoleServiceAsync.WithRawResponse by lazy {
            RoleServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val groups: GroupServiceAsync.WithRawResponse by lazy {
            GroupServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val acls: AclServiceAsync.WithRawResponse by lazy {
            AclServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val users: UserServiceAsync.WithRawResponse by lazy {
            UserServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val projectScores: ProjectScoreServiceAsync.WithRawResponse by lazy {
            ProjectScoreServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val projectTags: ProjectTagServiceAsync.WithRawResponse by lazy {
            ProjectTagServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val spanIframes: SpanIframeServiceAsync.WithRawResponse by lazy {
            SpanIframeServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val functions: FunctionServiceAsync.WithRawResponse by lazy {
            FunctionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val views: ViewServiceAsync.WithRawResponse by lazy {
            ViewServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val organizations: OrganizationServiceAsync.WithRawResponse by lazy {
            OrganizationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val apiKeys: ApiKeyServiceAsync.WithRawResponse by lazy {
            ApiKeyServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val aiSecrets: AiSecretServiceAsync.WithRawResponse by lazy {
            AiSecretServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val envVars: EnvVarServiceAsync.WithRawResponse by lazy {
            EnvVarServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val evals: EvalServiceAsync.WithRawResponse by lazy {
            EvalServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun topLevel(): TopLevelServiceAsync.WithRawResponse = topLevel

        override fun projects(): ProjectServiceAsync.WithRawResponse = projects

        override fun experiments(): ExperimentServiceAsync.WithRawResponse = experiments

        override fun datasets(): DatasetServiceAsync.WithRawResponse = datasets

        override fun prompts(): PromptServiceAsync.WithRawResponse = prompts

        override fun roles(): RoleServiceAsync.WithRawResponse = roles

        override fun groups(): GroupServiceAsync.WithRawResponse = groups

        override fun acls(): AclServiceAsync.WithRawResponse = acls

        override fun users(): UserServiceAsync.WithRawResponse = users

        override fun projectScores(): ProjectScoreServiceAsync.WithRawResponse = projectScores

        override fun projectTags(): ProjectTagServiceAsync.WithRawResponse = projectTags

        override fun spanIframes(): SpanIframeServiceAsync.WithRawResponse = spanIframes

        override fun functions(): FunctionServiceAsync.WithRawResponse = functions

        override fun views(): ViewServiceAsync.WithRawResponse = views

        override fun organizations(): OrganizationServiceAsync.WithRawResponse = organizations

        override fun apiKeys(): ApiKeyServiceAsync.WithRawResponse = apiKeys

        override fun aiSecrets(): AiSecretServiceAsync.WithRawResponse = aiSecrets

        override fun envVars(): EnvVarServiceAsync.WithRawResponse = envVars

        override fun evals(): EvalServiceAsync.WithRawResponse = evals
    }
}
