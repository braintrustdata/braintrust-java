// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.services.async.RoleServiceAsync
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate

/**
 * List out all roles. The roles are sorted by creation date, with the most recently-created roles
 * coming first
 */
class RoleListPageAsync
private constructor(
    private val rolesService: RoleServiceAsync,
    private val params: RoleListParams,
    private val response: Response,
) {

    fun response(): Response = response

    fun objects(): List<Role> = response().objects()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is RoleListPageAsync && rolesService == other.rolesService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(rolesService, params, response) /* spotless:on */

    override fun toString() =
        "RoleListPageAsync{rolesService=$rolesService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
        return !objects().isEmpty()
    }

    fun getNextPageParams(): Optional<RoleListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return if (params.endingBefore().isPresent) {
            Optional.of(params.toBuilder().endingBefore(objects().first().id()).build())
        } else {
            Optional.of(params.toBuilder().startingAfter(objects().last().id()).build())
        }
    }

    fun getNextPage(): CompletableFuture<Optional<RoleListPageAsync>> {
        return getNextPageParams()
            .map { rolesService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(rolesService: RoleServiceAsync, params: RoleListParams, response: Response) =
            RoleListPageAsync(rolesService, params, response)
    }

    class Response(
        private val objects: JsonField<List<Role>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("objects") objects: JsonField<List<Role>> = JsonMissing.of()
        ) : this(objects, mutableMapOf())

        fun objects(): List<Role> = objects.getNullable("objects") ?: listOf()

        @JsonProperty("objects")
        fun _objects(): Optional<JsonField<List<Role>>> = Optional.ofNullable(objects)

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

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

            /** Returns a mutable builder for constructing an instance of [RoleListPageAsync]. */
            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var objects: JsonField<List<Role>> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(page: Response) = apply {
                this.objects = page.objects
                this.additionalProperties.putAll(page.additionalProperties)
            }

            fun objects(objects: List<Role>) = objects(JsonField.of(objects))

            fun objects(objects: JsonField<List<Role>>) = apply { this.objects = objects }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            /**
             * Returns an immutable instance of [Response].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Response = Response(objects, additionalProperties.toMutableMap())
        }
    }

    class AutoPager(private val firstPage: RoleListPageAsync) {

        fun forEach(action: Predicate<Role>, executor: Executor): CompletableFuture<Void> {
            fun CompletableFuture<Optional<RoleListPageAsync>>.forEach(
                action: (Role) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<Role>> {
            val values = mutableListOf<Role>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
