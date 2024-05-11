// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.braintrustdata.api.client

import com.braintrustdata.api.models.*
import com.braintrustdata.api.services.async.*

interface BraintrustClientAsync {

    fun sync(): BraintrustClient

    fun topLevel(): TopLevelServiceAsync

    fun project(): ProjectServiceAsync

    fun experiment(): ExperimentServiceAsync

    fun dataset(): DatasetServiceAsync

    fun prompt(): PromptServiceAsync

    fun role(): RoleServiceAsync

    fun group(): GroupServiceAsync

    fun acl(): AclServiceAsync

    fun user(): UserServiceAsync
}
