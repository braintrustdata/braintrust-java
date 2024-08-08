// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.braintrustdata.api.client

import com.braintrustdata.api.models.*
import com.braintrustdata.api.services.blocking.*

interface BraintrustClient {

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

    fun functions(): FunctionService

    fun views(): ViewService

    fun organizations(): OrganizationService

    fun apiKeys(): ApiKeyService
}
