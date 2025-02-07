// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.client

import com.braintrustdata.api.services.blocking.AclService
import com.braintrustdata.api.services.blocking.AiSecretService
import com.braintrustdata.api.services.blocking.ApiKeyService
import com.braintrustdata.api.services.blocking.DatasetService
import com.braintrustdata.api.services.blocking.EnvVarService
import com.braintrustdata.api.services.blocking.EvalService
import com.braintrustdata.api.services.blocking.ExperimentService
import com.braintrustdata.api.services.blocking.FunctionService
import com.braintrustdata.api.services.blocking.GroupService
import com.braintrustdata.api.services.blocking.OrganizationService
import com.braintrustdata.api.services.blocking.ProjectScoreService
import com.braintrustdata.api.services.blocking.ProjectService
import com.braintrustdata.api.services.blocking.ProjectTagService
import com.braintrustdata.api.services.blocking.PromptService
import com.braintrustdata.api.services.blocking.RoleService
import com.braintrustdata.api.services.blocking.SpanIframeService
import com.braintrustdata.api.services.blocking.TopLevelService
import com.braintrustdata.api.services.blocking.UserService
import com.braintrustdata.api.services.blocking.ViewService

/**
 * A client for interacting with the Braintrust REST API synchronously. You can also switch to
 * asynchronous execution via the [async] method.
 *
 * This client performs best when you create a single instance and reuse it for all interactions
 * with the REST API. This is because each client holds its own connection pool and thread pools.
 * Reusing connections and threads reduces latency and saves memory. The client also handles rate
 * limiting per client. This means that creating and using multiple instances at the same time will
 * not respect rate limits.
 *
 * The threads and connections that are held will be released automatically if they remain idle. But
 * if you are writing an application that needs to aggressively release unused resources, then you
 * may call [close].
 */
interface BraintrustClient {

    /**
     * Returns a version of this client that uses asynchronous execution.
     *
     * The returned client shares its resources, like its connection pool and thread pools, with
     * this client.
     */
    fun async(): BraintrustClientAsync

    fun topLevel(): TopLevelService

    fun projects(): ProjectService

    fun experiments(): ExperimentService

    fun datasets(): DatasetService

    fun prompts(): PromptService

    fun roles(): RoleService

    fun groups(): GroupService

    fun acls(): AclService

    fun users(): UserService

    fun projectScores(): ProjectScoreService

    fun projectTags(): ProjectTagService

    fun spanIframes(): SpanIframeService

    fun functions(): FunctionService

    fun views(): ViewService

    fun organizations(): OrganizationService

    fun apiKeys(): ApiKeyService

    fun aiSecrets(): AiSecretService

    fun envVars(): EnvVarService

    fun evals(): EvalService

    /**
     * Closes this client, relinquishing any underlying resources.
     *
     * This is purposefully not inherited from [AutoCloseable] because the client is long-lived and
     * usually should not be synchronously closed via try-with-resources.
     *
     * It's also usually not necessary to call this method at all. the default HTTP client
     * automatically releases threads and connections if they remain idle, but if you are writing an
     * application that needs to aggressively release unused resources, then you may call this
     * method.
     */
    fun close()
}
