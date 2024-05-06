// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.braintrust.api.client

import com.braintrust.api.models.*
import com.braintrust.api.services.blocking.*

interface BraintrustClient {

    fun async(): BraintrustClientAsync

    fun topLevel(): TopLevelService

    fun project(): ProjectService

    fun experiment(): ExperimentService

    fun dataset(): DatasetService

    fun prompt(): PromptService

    fun promptSession(): PromptSessionService

    fun role(): RoleService

    fun group(): GroupService

    fun acl(): AclService

    fun user(): UserService
}
