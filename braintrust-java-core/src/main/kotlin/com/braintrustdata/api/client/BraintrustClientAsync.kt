// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.client

import com.braintrustdata.api.models.*
import com.braintrustdata.api.services.async.*

interface BraintrustClientAsync {

    fun sync(): BraintrustClient

    fun topLevel(): TopLevelServiceAsync

    fun projects(): ProjectServiceAsync

    fun experiments(): ExperimentServiceAsync

    fun datasets(): DatasetServiceAsync

    fun prompts(): PromptServiceAsync

    fun roles(): RoleServiceAsync

    fun groups(): GroupServiceAsync

    fun acls(): AclServiceAsync

    fun users(): UserServiceAsync

    fun projectScores(): ProjectScoreServiceAsync

    fun projectTags(): ProjectTagServiceAsync

    fun spanIframes(): SpanIframeServiceAsync

    fun functions(): FunctionServiceAsync

    fun views(): ViewServiceAsync

    fun organizations(): OrganizationServiceAsync

    fun apiKeys(): ApiKeyServiceAsync

    fun aiSecrets(): AiSecretServiceAsync

    fun envVars(): EnvVarServiceAsync

    fun evals(): EvalServiceAsync
}
