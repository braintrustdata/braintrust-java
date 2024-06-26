// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.client

import com.braintrustdata.api.core.ClientOptions
import com.braintrustdata.api.core.http.HttpResponse.Handler
import com.braintrustdata.api.errors.BraintrustError
import com.braintrustdata.api.models.*
import com.braintrustdata.api.services.blocking.*
import com.braintrustdata.api.services.errorHandler

class BraintrustClientImpl
constructor(
    private val clientOptions: ClientOptions,
) : BraintrustClient {

    private val errorHandler: Handler<BraintrustError> = errorHandler(clientOptions.jsonMapper)

    private val async: BraintrustClientAsync by lazy { BraintrustClientAsyncImpl(clientOptions) }

    private val topLevel: TopLevelService by lazy { TopLevelServiceImpl(clientOptions) }

    private val project: ProjectService by lazy { ProjectServiceImpl(clientOptions) }

    private val experiment: ExperimentService by lazy { ExperimentServiceImpl(clientOptions) }

    private val dataset: DatasetService by lazy { DatasetServiceImpl(clientOptions) }

    private val prompt: PromptService by lazy { PromptServiceImpl(clientOptions) }

    private val role: RoleService by lazy { RoleServiceImpl(clientOptions) }

    private val group: GroupService by lazy { GroupServiceImpl(clientOptions) }

    private val acl: AclService by lazy { AclServiceImpl(clientOptions) }

    private val user: UserService by lazy { UserServiceImpl(clientOptions) }

    override fun async(): BraintrustClientAsync = async

    override fun topLevel(): TopLevelService = topLevel

    override fun project(): ProjectService = project

    override fun experiment(): ExperimentService = experiment

    override fun dataset(): DatasetService = dataset

    override fun prompt(): PromptService = prompt

    override fun role(): RoleService = role

    override fun group(): GroupService = group

    override fun acl(): AclService = acl

    override fun user(): UserService = user
}
