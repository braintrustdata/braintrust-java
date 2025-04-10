// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.checkRequired
import com.braintrustdata.api.services.blocking.AiSecretService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** @see [AiSecretService.list] */
class AiSecretListPage
private constructor(
    private val service: AiSecretService,
    private val params: AiSecretListParams,
    private val response: AiSecretListPageResponse,
) {

    /**
     * Delegates to [AiSecretListPageResponse], but gracefully handles missing data.
     *
     * @see [AiSecretListPageResponse.objects]
     */
    fun objects(): List<AISecret> =
        response._objects().getOptional("objects").getOrNull() ?: emptyList()

    fun hasNextPage(): Boolean = objects().isNotEmpty()

    fun getNextPageParams(): Optional<AiSecretListParams> {
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

    fun getNextPage(): Optional<AiSecretListPage> = getNextPageParams().map { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): AiSecretListParams = params

    /** The response that this page was parsed from. */
    fun response(): AiSecretListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AiSecretListPage].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AiSecretListPage]. */
    class Builder internal constructor() {

        private var service: AiSecretService? = null
        private var params: AiSecretListParams? = null
        private var response: AiSecretListPageResponse? = null

        @JvmSynthetic
        internal fun from(aiSecretListPage: AiSecretListPage) = apply {
            service = aiSecretListPage.service
            params = aiSecretListPage.params
            response = aiSecretListPage.response
        }

        fun service(service: AiSecretService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: AiSecretListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AiSecretListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [AiSecretListPage].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AiSecretListPage =
            AiSecretListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: AiSecretListPage) : Iterable<AISecret> {

        override fun iterator(): Iterator<AISecret> = iterator {
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

        fun stream(): Stream<AISecret> {
            return StreamSupport.stream(spliterator(), false)
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AiSecretListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "AiSecretListPage{service=$service, params=$params, response=$response}"
}
