// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.braintrustdata.api.client

import com.braintrustdata.api.models.*
import com.braintrustdata.api.services.blocking.*

interface BraintrustClient {

    fun async(): BraintrustClientAsync

    fun topLevel(): TopLevelService

    fun project(): ProjectService

    fun experiment(): ExperimentService

    fun dataset(): DatasetService

    fun prompt(): PromptService

    fun role(): RoleService

    fun group(): GroupService

    fun acl(): AclService

    fun user(): UserService
}
