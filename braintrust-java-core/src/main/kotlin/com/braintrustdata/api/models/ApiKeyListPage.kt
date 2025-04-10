// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.services.blocking.ApiKeyService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/**
 * List out all api_keys. The api_keys are sorted by creation date, with the most recently-created
 * api_keys coming first
 */
class ApiKeyListPage
private constructor(
    private val apiKeysService: ApiKeyService,
    private val params: ApiKeyListParams,
    private val response: ApiKeyListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): ApiKeyListPageResponse = response

    /**
     * Delegates to [ApiKeyListPageResponse], but gracefully handles missing data.
     *
     * @see [ApiKeyListPageResponse.objects]
     */
    fun objects(): List<ApiKey> =
        response._objects().getOptional("objects").getOrNull() ?: emptyList()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ApiKeyListPage && apiKeysService == other.apiKeysService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(apiKeysService, params, response) /* spotless:on */

    override fun toString() =
        "ApiKeyListPage{apiKeysService=$apiKeysService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = objects().isNotEmpty()

    fun getNextPageParams(): Optional<ApiKeyListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            if (params.endingBefore().isPresent) {
                params.toBuilder().endingBefore(objects().first()._id().getOptional("id")).build()
            } else {
                params.toBuilder().startingAfter(objects().last()._id().getOptional("id")).build()
            }
        )
    }

    fun getNextPage(): Optional<ApiKeyListPage> {
        return getNextPageParams().map { apiKeysService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            apiKeysService: ApiKeyService,
            params: ApiKeyListParams,
            response: ApiKeyListPageResponse,
        ) = ApiKeyListPage(apiKeysService, params, response)
    }

    class AutoPager(private val firstPage: ApiKeyListPage) : Iterable<ApiKey> {

        override fun iterator(): Iterator<ApiKey> = iterator {
            var page = firstPage
            var index = 0
            while (true) {
                while (index < page.objects().size) {
                    yield(page.objects()[index++])
                }
                page = page.getNextPage().getOrNull() ?: break
                index = 0
            }
        }

        fun stream(): Stream<ApiKey> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
