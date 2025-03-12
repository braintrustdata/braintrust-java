// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.client

import com.braintrustdata.api.services.async.AclServiceAsync
import com.braintrustdata.api.services.async.AiSecretServiceAsync
import com.braintrustdata.api.services.async.ApiKeyServiceAsync
import com.braintrustdata.api.services.async.DatasetServiceAsync
import com.braintrustdata.api.services.async.EnvVarServiceAsync
import com.braintrustdata.api.services.async.EvalServiceAsync
import com.braintrustdata.api.services.async.ExperimentServiceAsync
import com.braintrustdata.api.services.async.FunctionServiceAsync
import com.braintrustdata.api.services.async.GroupServiceAsync
import com.braintrustdata.api.services.async.OrganizationServiceAsync
import com.braintrustdata.api.services.async.ProjectScoreServiceAsync
import com.braintrustdata.api.services.async.ProjectServiceAsync
import com.braintrustdata.api.services.async.ProjectTagServiceAsync
import com.braintrustdata.api.services.async.PromptServiceAsync
import com.braintrustdata.api.services.async.RoleServiceAsync
import com.braintrustdata.api.services.async.SpanIframeServiceAsync
import com.braintrustdata.api.services.async.TopLevelServiceAsync
import com.braintrustdata.api.services.async.UserServiceAsync
import com.braintrustdata.api.services.async.ViewServiceAsync

/**
 * A client for interacting with the Braintrust REST API asynchronously. You can also switch to
 * synchronous execution via the [sync] method.
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
interface BraintrustClientAsync {

    /**
     * Returns a version of this client that uses synchronous execution.
     *
     * The returned client shares its resources, like its connection pool and thread pools, with
     * this client.
     */
    fun sync(): BraintrustClient

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

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

    /**
     * A view of [BraintrustClientAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        fun topLevel(): TopLevelServiceAsync.WithRawResponse

        fun projects(): ProjectServiceAsync.WithRawResponse

        fun experiments(): ExperimentServiceAsync.WithRawResponse

        fun datasets(): DatasetServiceAsync.WithRawResponse

        fun prompts(): PromptServiceAsync.WithRawResponse

        fun roles(): RoleServiceAsync.WithRawResponse

        fun groups(): GroupServiceAsync.WithRawResponse

        fun acls(): AclServiceAsync.WithRawResponse

        fun users(): UserServiceAsync.WithRawResponse

        fun projectScores(): ProjectScoreServiceAsync.WithRawResponse

        fun projectTags(): ProjectTagServiceAsync.WithRawResponse

        fun spanIframes(): SpanIframeServiceAsync.WithRawResponse

        fun functions(): FunctionServiceAsync.WithRawResponse

        fun views(): ViewServiceAsync.WithRawResponse

        fun organizations(): OrganizationServiceAsync.WithRawResponse

        fun apiKeys(): ApiKeyServiceAsync.WithRawResponse

        fun aiSecrets(): AiSecretServiceAsync.WithRawResponse

        fun envVars(): EnvVarServiceAsync.WithRawResponse

        fun evals(): EvalServiceAsync.WithRawResponse
    }
}
