// File generated from our OpenAPI spec by Stainless.

package com.braintrust.api.client

import com.braintrust.api.core.ClientOptions
import com.braintrust.api.core.http.HttpResponse.Handler
import com.braintrust.api.errors.BraintrustError
import com.braintrust.api.models.*
import com.braintrust.api.services.blocking.*
import com.braintrust.api.services.errorHandler

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

    override fun async(): BraintrustClientAsync = async

    override fun topLevel(): TopLevelService = topLevel

    override fun project(): ProjectService = project

    override fun experiment(): ExperimentService = experiment

    override fun dataset(): DatasetService = dataset
}
