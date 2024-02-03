// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.braintrust.api.client

import com.braintrust.api.models.*
import com.braintrust.api.services.async.*

interface BraintrustClientAsync {

    fun sync(): BraintrustClient

    fun topLevel(): TopLevelServiceAsync

    fun project(): ProjectServiceAsync

    fun experiment(): ExperimentServiceAsync

    fun dataset(): DatasetServiceAsync
}
