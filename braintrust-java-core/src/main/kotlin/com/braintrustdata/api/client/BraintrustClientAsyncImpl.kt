// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.client

import com.braintrustdata.api.core.ClientOptions
import com.braintrustdata.api.core.http.HttpResponse.Handler
import com.braintrustdata.api.errors.BraintrustError
import com.braintrustdata.api.models.*
import com.braintrustdata.api.services.async.*
import com.braintrustdata.api.services.errorHandler

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

    override fun sync(): BraintrustClient = sync

    override fun topLevel(): TopLevelServiceAsync = topLevel

    override fun project(): ProjectServiceAsync = project

    override fun experiment(): ExperimentServiceAsync = experiment

    override fun dataset(): DatasetServiceAsync = dataset
}
