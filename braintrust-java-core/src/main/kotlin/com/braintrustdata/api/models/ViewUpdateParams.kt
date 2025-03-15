// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.Enum
import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.Params
import com.braintrustdata.api.core.checkRequired
import com.braintrustdata.api.core.http.Headers
import com.braintrustdata.api.core.http.QueryParams
import com.braintrustdata.api.core.immutableEmptyMap
import com.braintrustdata.api.core.toImmutable
import com.braintrustdata.api.errors.BraintrustInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Partially update a view object. Specify the fields to update in the payload. Any object-type
 * fields will be deep-merged with existing content. Currently we do not support removing fields or
 * setting them to null.
 */
class ViewUpdateParams
private constructor(
    private val viewId: String,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** View id */
    fun viewId(): String = viewId

    /**
     * The id of the object the view applies to
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun objectId(): String = body.objectId()

    /**
     * The object type that the ACL applies to
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun objectType(): AclObjectType = body.objectType()

    /**
     * Name of the view
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = body.name()

    /**
     * Options for the view in the app
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun options(): Optional<ViewOptions> = body.options()

    /**
     * Identifies the user who created the view
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun userId(): Optional<String> = body.userId()

    /**
     * The view definition
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun viewData(): Optional<ViewData> = body.viewData()

    /**
     * Type of table that the view corresponds to.
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun viewType(): Optional<ViewType> = body.viewType()

    /**
     * Returns the raw JSON value of [objectId].
     *
     * Unlike [objectId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _objectId(): JsonField<String> = body._objectId()

    /**
     * Returns the raw JSON value of [objectType].
     *
     * Unlike [objectType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _objectType(): JsonField<AclObjectType> = body._objectType()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [options].
     *
     * Unlike [options], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _options(): JsonField<ViewOptions> = body._options()

    /**
     * Returns the raw JSON value of [userId].
     *
     * Unlike [userId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _userId(): JsonField<String> = body._userId()

    /**
     * Returns the raw JSON value of [viewData].
     *
     * Unlike [viewData], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _viewData(): JsonField<ViewData> = body._viewData()

    /**
     * Returns the raw JSON value of [viewType].
     *
     * Unlike [viewType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _viewType(): JsonField<ViewType> = body._viewType()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> viewId
            else -> ""
        }
    }

    @NoAutoDetect
    class Body
    @JsonCreator
    private constructor(
        @JsonProperty("object_id")
        @ExcludeMissing
        private val objectId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("object_type")
        @ExcludeMissing
        private val objectType: JsonField<AclObjectType> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("options")
        @ExcludeMissing
        private val options: JsonField<ViewOptions> = JsonMissing.of(),
        @JsonProperty("user_id")
        @ExcludeMissing
        private val userId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("view_data")
        @ExcludeMissing
        private val viewData: JsonField<ViewData> = JsonMissing.of(),
        @JsonProperty("view_type")
        @ExcludeMissing
        private val viewType: JsonField<ViewType> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * The id of the object the view applies to
         *
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun objectId(): String = objectId.getRequired("object_id")

        /**
         * The object type that the ACL applies to
         *
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun objectType(): AclObjectType = objectType.getRequired("object_type")

        /**
         * Name of the view
         *
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

        /**
         * Options for the view in the app
         *
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun options(): Optional<ViewOptions> = Optional.ofNullable(options.getNullable("options"))

        /**
         * Identifies the user who created the view
         *
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun userId(): Optional<String> = Optional.ofNullable(userId.getNullable("user_id"))

        /**
         * The view definition
         *
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun viewData(): Optional<ViewData> = Optional.ofNullable(viewData.getNullable("view_data"))

        /**
         * Type of table that the view corresponds to.
         *
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun viewType(): Optional<ViewType> = Optional.ofNullable(viewType.getNullable("view_type"))

        /**
         * Returns the raw JSON value of [objectId].
         *
         * Unlike [objectId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("object_id") @ExcludeMissing fun _objectId(): JsonField<String> = objectId

        /**
         * Returns the raw JSON value of [objectType].
         *
         * Unlike [objectType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("object_type")
        @ExcludeMissing
        fun _objectType(): JsonField<AclObjectType> = objectType

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [options].
         *
         * Unlike [options], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("options") @ExcludeMissing fun _options(): JsonField<ViewOptions> = options

        /**
         * Returns the raw JSON value of [userId].
         *
         * Unlike [userId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("user_id") @ExcludeMissing fun _userId(): JsonField<String> = userId

        /**
         * Returns the raw JSON value of [viewData].
         *
         * Unlike [viewData], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("view_data") @ExcludeMissing fun _viewData(): JsonField<ViewData> = viewData

        /**
         * Returns the raw JSON value of [viewType].
         *
         * Unlike [viewType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("view_type") @ExcludeMissing fun _viewType(): JsonField<ViewType> = viewType

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            objectId()
            objectType()
            name()
            options().ifPresent { it.validate() }
            userId()
            viewData().ifPresent { it.validate() }
            viewType()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .objectId()
             * .objectType()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var objectId: JsonField<String>? = null
            private var objectType: JsonField<AclObjectType>? = null
            private var name: JsonField<String> = JsonMissing.of()
            private var options: JsonField<ViewOptions> = JsonMissing.of()
            private var userId: JsonField<String> = JsonMissing.of()
            private var viewData: JsonField<ViewData> = JsonMissing.of()
            private var viewType: JsonField<ViewType> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                objectId = body.objectId
                objectType = body.objectType
                name = body.name
                options = body.options
                userId = body.userId
                viewData = body.viewData
                viewType = body.viewType
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The id of the object the view applies to */
            fun objectId(objectId: String) = objectId(JsonField.of(objectId))

            /**
             * Sets [Builder.objectId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.objectId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun objectId(objectId: JsonField<String>) = apply { this.objectId = objectId }

            /** The object type that the ACL applies to */
            fun objectType(objectType: AclObjectType) = objectType(JsonField.of(objectType))

            /**
             * Sets [Builder.objectType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.objectType] with a well-typed [AclObjectType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun objectType(objectType: JsonField<AclObjectType>) = apply {
                this.objectType = objectType
            }

            /** Name of the view */
            fun name(name: String?) = name(JsonField.ofNullable(name))

            /** Alias for calling [Builder.name] with `name.orElse(null)`. */
            fun name(name: Optional<String>) = name(name.getOrNull())

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** Options for the view in the app */
            fun options(options: ViewOptions?) = options(JsonField.ofNullable(options))

            /** Alias for calling [Builder.options] with `options.orElse(null)`. */
            fun options(options: Optional<ViewOptions>) = options(options.getOrNull())

            /**
             * Sets [Builder.options] to an arbitrary JSON value.
             *
             * You should usually call [Builder.options] with a well-typed [ViewOptions] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun options(options: JsonField<ViewOptions>) = apply { this.options = options }

            /** Identifies the user who created the view */
            fun userId(userId: String?) = userId(JsonField.ofNullable(userId))

            /** Alias for calling [Builder.userId] with `userId.orElse(null)`. */
            fun userId(userId: Optional<String>) = userId(userId.getOrNull())

            /**
             * Sets [Builder.userId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.userId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun userId(userId: JsonField<String>) = apply { this.userId = userId }

            /** The view definition */
            fun viewData(viewData: ViewData?) = viewData(JsonField.ofNullable(viewData))

            /** Alias for calling [Builder.viewData] with `viewData.orElse(null)`. */
            fun viewData(viewData: Optional<ViewData>) = viewData(viewData.getOrNull())

            /**
             * Sets [Builder.viewData] to an arbitrary JSON value.
             *
             * You should usually call [Builder.viewData] with a well-typed [ViewData] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun viewData(viewData: JsonField<ViewData>) = apply { this.viewData = viewData }

            /** Type of table that the view corresponds to. */
            fun viewType(viewType: ViewType?) = viewType(JsonField.ofNullable(viewType))

            /** Alias for calling [Builder.viewType] with `viewType.orElse(null)`. */
            fun viewType(viewType: Optional<ViewType>) = viewType(viewType.getOrNull())

            /**
             * Sets [Builder.viewType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.viewType] with a well-typed [ViewType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun viewType(viewType: JsonField<ViewType>) = apply { this.viewType = viewType }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            fun build(): Body =
                Body(
                    checkRequired("objectId", objectId),
                    checkRequired("objectType", objectType),
                    name,
                    options,
                    userId,
                    viewData,
                    viewType,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && objectId == other.objectId && objectType == other.objectType && name == other.name && options == other.options && userId == other.userId && viewData == other.viewData && viewType == other.viewType && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(objectId, objectType, name, options, userId, viewData, viewType, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{objectId=$objectId, objectType=$objectType, name=$name, options=$options, userId=$userId, viewData=$viewData, viewType=$viewType, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ViewUpdateParams].
         *
         * The following fields are required:
         * ```java
         * .viewId()
         * .objectId()
         * .objectType()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ViewUpdateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var viewId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(viewUpdateParams: ViewUpdateParams) = apply {
            viewId = viewUpdateParams.viewId
            body = viewUpdateParams.body.toBuilder()
            additionalHeaders = viewUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = viewUpdateParams.additionalQueryParams.toBuilder()
        }

        /** View id */
        fun viewId(viewId: String) = apply { this.viewId = viewId }

        /** The id of the object the view applies to */
        fun objectId(objectId: String) = apply { body.objectId(objectId) }

        /**
         * Sets [Builder.objectId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.objectId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun objectId(objectId: JsonField<String>) = apply { body.objectId(objectId) }

        /** The object type that the ACL applies to */
        fun objectType(objectType: AclObjectType) = apply { body.objectType(objectType) }

        /**
         * Sets [Builder.objectType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.objectType] with a well-typed [AclObjectType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun objectType(objectType: JsonField<AclObjectType>) = apply { body.objectType(objectType) }

        /** Name of the view */
        fun name(name: String?) = apply { body.name(name) }

        /** Alias for calling [Builder.name] with `name.orElse(null)`. */
        fun name(name: Optional<String>) = name(name.getOrNull())

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /** Options for the view in the app */
        fun options(options: ViewOptions?) = apply { body.options(options) }

        /** Alias for calling [Builder.options] with `options.orElse(null)`. */
        fun options(options: Optional<ViewOptions>) = options(options.getOrNull())

        /**
         * Sets [Builder.options] to an arbitrary JSON value.
         *
         * You should usually call [Builder.options] with a well-typed [ViewOptions] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun options(options: JsonField<ViewOptions>) = apply { body.options(options) }

        /** Identifies the user who created the view */
        fun userId(userId: String?) = apply { body.userId(userId) }

        /** Alias for calling [Builder.userId] with `userId.orElse(null)`. */
        fun userId(userId: Optional<String>) = userId(userId.getOrNull())

        /**
         * Sets [Builder.userId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun userId(userId: JsonField<String>) = apply { body.userId(userId) }

        /** The view definition */
        fun viewData(viewData: ViewData?) = apply { body.viewData(viewData) }

        /** Alias for calling [Builder.viewData] with `viewData.orElse(null)`. */
        fun viewData(viewData: Optional<ViewData>) = viewData(viewData.getOrNull())

        /**
         * Sets [Builder.viewData] to an arbitrary JSON value.
         *
         * You should usually call [Builder.viewData] with a well-typed [ViewData] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun viewData(viewData: JsonField<ViewData>) = apply { body.viewData(viewData) }

        /** Type of table that the view corresponds to. */
        fun viewType(viewType: ViewType?) = apply { body.viewType(viewType) }

        /** Alias for calling [Builder.viewType] with `viewType.orElse(null)`. */
        fun viewType(viewType: Optional<ViewType>) = viewType(viewType.getOrNull())

        /**
         * Sets [Builder.viewType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.viewType] with a well-typed [ViewType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun viewType(viewType: JsonField<ViewType>) = apply { body.viewType(viewType) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        fun build(): ViewUpdateParams =
            ViewUpdateParams(
                checkRequired("viewId", viewId),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    /** Type of table that the view corresponds to. */
    class ViewType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val PROJECTS = of("projects")

            @JvmField val EXPERIMENTS = of("experiments")

            @JvmField val EXPERIMENT = of("experiment")

            @JvmField val PLAYGROUNDS = of("playgrounds")

            @JvmField val PLAYGROUND = of("playground")

            @JvmField val DATASETS = of("datasets")

            @JvmField val DATASET = of("dataset")

            @JvmField val PROMPTS = of("prompts")

            @JvmField val TOOLS = of("tools")

            @JvmField val SCORERS = of("scorers")

            @JvmField val LOGS = of("logs")

            @JvmStatic fun of(value: String) = ViewType(JsonField.of(value))
        }

        /** An enum containing [ViewType]'s known values. */
        enum class Known {
            PROJECTS,
            EXPERIMENTS,
            EXPERIMENT,
            PLAYGROUNDS,
            PLAYGROUND,
            DATASETS,
            DATASET,
            PROMPTS,
            TOOLS,
            SCORERS,
            LOGS,
        }

        /**
         * An enum containing [ViewType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ViewType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PROJECTS,
            EXPERIMENTS,
            EXPERIMENT,
            PLAYGROUNDS,
            PLAYGROUND,
            DATASETS,
            DATASET,
            PROMPTS,
            TOOLS,
            SCORERS,
            LOGS,
            /** An enum member indicating that [ViewType] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                PROJECTS -> Value.PROJECTS
                EXPERIMENTS -> Value.EXPERIMENTS
                EXPERIMENT -> Value.EXPERIMENT
                PLAYGROUNDS -> Value.PLAYGROUNDS
                PLAYGROUND -> Value.PLAYGROUND
                DATASETS -> Value.DATASETS
                DATASET -> Value.DATASET
                PROMPTS -> Value.PROMPTS
                TOOLS -> Value.TOOLS
                SCORERS -> Value.SCORERS
                LOGS -> Value.LOGS
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws BraintrustInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                PROJECTS -> Known.PROJECTS
                EXPERIMENTS -> Known.EXPERIMENTS
                EXPERIMENT -> Known.EXPERIMENT
                PLAYGROUNDS -> Known.PLAYGROUNDS
                PLAYGROUND -> Known.PLAYGROUND
                DATASETS -> Known.DATASETS
                DATASET -> Known.DATASET
                PROMPTS -> Known.PROMPTS
                TOOLS -> Known.TOOLS
                SCORERS -> Known.SCORERS
                LOGS -> Known.LOGS
                else -> throw BraintrustInvalidDataException("Unknown ViewType: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws BraintrustInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                BraintrustInvalidDataException("Value is not a String")
            }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ViewType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ViewUpdateParams && viewId == other.viewId && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(viewId, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ViewUpdateParams{viewId=$viewId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
