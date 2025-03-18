// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.immutableEmptyMap
import com.braintrustdata.api.core.toImmutable
import com.braintrustdata.api.services.async.AclServiceAsync
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate

/**
 * List out all acls. The acls are sorted by creation date, with the most recently-created acls
 * coming first
 */
class AclListPageAsync
private constructor(
    private val aclsService: AclServiceAsync,
    private val params: AclListParams,
    private val response: Response,
) {

    fun response(): Response = response

    fun objects(): List<Acl> = response().objects()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AclListPageAsync && aclsService == other.aclsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(aclsService, params, response) /* spotless:on */

    override fun toString() =
        "AclListPageAsync{aclsService=$aclsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
        return !objects().isEmpty()
    }

    fun getNextPageParams(): Optional<AclListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return if (params.endingBefore().isPresent) {
            Optional.of(
                AclListParams.builder().from(params).endingBefore(objects().first().id()).build()
            )
        } else {
            Optional.of(
                AclListParams.builder().from(params).startingAfter(objects().last().id()).build()
            )
        }
    }

    fun getNextPage(): CompletableFuture<Optional<AclListPageAsync>> {
        return getNextPageParams()
            .map { aclsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(aclsService: AclServiceAsync, params: AclListParams, response: Response) =
            AclListPageAsync(aclsService, params, response)
    }

    @NoAutoDetect
    class Response
    @JsonCreator
    constructor(
        @JsonProperty("objects") private val objects: JsonField<List<Acl>> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun objects(): List<Acl> = objects.getNullable("objects") ?: listOf()

        @JsonProperty("objects")
        fun _objects(): Optional<JsonField<List<Acl>>> = Optional.ofNullable(objects)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Response = apply {
            if (validated) {
                return@apply
            }

            objects().map { it.validate() }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Response && objects == other.objects && additionalProperties == other.additionalProperties /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(objects, additionalProperties) /* spotless:on */

        override fun toString() =
            "Response{objects=$objects, additionalProperties=$additionalProperties}"

        companion object {

            /** Returns a mutable builder for constructing an instance of [AclListPageAsync]. */
            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var objects: JsonField<List<Acl>> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(page: Response) = apply {
                this.objects = page.objects
                this.additionalProperties.putAll(page.additionalProperties)
            }

            fun objects(objects: List<Acl>) = objects(JsonField.of(objects))

            fun objects(objects: JsonField<List<Acl>>) = apply { this.objects = objects }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            /**
             * Returns an immutable instance of [Response].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Response = Response(objects, additionalProperties.toImmutable())
        }
    }

    class AutoPager(private val firstPage: AclListPageAsync) {

        fun forEach(action: Predicate<Acl>, executor: Executor): CompletableFuture<Void> {
            fun CompletableFuture<Optional<AclListPageAsync>>.forEach(
                action: (Acl) -> Boolean,
                executor: Executor,
            ): CompletableFuture<Void> =
                thenComposeAsync(
                    { page ->
                        page
                            .filter { it.objects().all(action) }
                            .map { it.getNextPage().forEach(action, executor) }
                            .orElseGet { CompletableFuture.completedFuture(null) }
                    },
                    executor,
                )
            return CompletableFuture.completedFuture(Optional.of(firstPage))
                .forEach(action::test, executor)
        }

        fun toList(executor: Executor): CompletableFuture<List<Acl>> {
            val values = mutableListOf<Acl>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
