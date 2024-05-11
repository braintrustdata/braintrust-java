// File generated from our OpenAPI spec by Stainless.

package com.braintrust.api.client

import com.braintrust.api.core.ClientOptions
import com.braintrust.api.core.http.HttpResponse.Handler
import com.braintrust.api.errors.BraintrustError
import com.braintrust.api.models.*
import com.braintrust.api.services.async.*
import com.braintrust.api.services.errorHandler

class BraintrustClientAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : BraintrustClientAsync {

    private val errorHandler: Handler<BraintrustError> = errorHandler(clientOptions.jsonMapper)

    private val sync: BraintrustClient by lazy { BraintrustClientImpl(clientOptions) }

    private val topLevel: TopLevelServiceAsync by lazy { TopLevelServiceAsyncImpl(clientOptions) }

    private val project: ProjectServiceAsync by lazy { ProjectServiceAsyncImpl(clientOptions) }

    private val experiment: ExperimentServiceAsync by lazy {
        ExperimentServiceAsyncImpl(clientOptions)
    }

    private val dataset: DatasetServiceAsync by lazy { DatasetServiceAsyncImpl(clientOptions) }

    private val prompt: PromptServiceAsync by lazy { PromptServiceAsyncImpl(clientOptions) }

    private val role: RoleServiceAsync by lazy { RoleServiceAsyncImpl(clientOptions) }

    private val group: GroupServiceAsync by lazy { GroupServiceAsyncImpl(clientOptions) }

    private val acl: AclServiceAsync by lazy { AclServiceAsyncImpl(clientOptions) }

    private val user: UserServiceAsync by lazy { UserServiceAsyncImpl(clientOptions) }

    override fun sync(): BraintrustClient = sync

    override fun topLevel(): TopLevelServiceAsync = topLevel

    override fun project(): ProjectServiceAsync = project

    override fun experiment(): ExperimentServiceAsync = experiment

    override fun dataset(): DatasetServiceAsync = dataset

    override fun prompt(): PromptServiceAsync = prompt

    override fun role(): RoleServiceAsync = role

    override fun group(): GroupServiceAsync = group

    override fun acl(): AclServiceAsync = acl

    override fun user(): UserServiceAsync = user
}
