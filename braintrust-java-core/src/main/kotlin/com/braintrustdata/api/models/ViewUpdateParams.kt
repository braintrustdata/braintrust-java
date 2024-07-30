// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.Enum
import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.toUnmodifiable
import com.braintrustdata.api.errors.BraintrustInvalidDataException
import com.braintrustdata.api.models.*
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import java.util.Objects
import java.util.Optional

class ViewUpdateParams
constructor(
    private val viewId: String,
    private val objectId: String,
    private val objectType: ObjectType?,
    private val name: String?,
    private val options: Options?,
    private val userId: String?,
    private val viewData: ViewData?,
    private val viewType: ViewType?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun viewId(): String = viewId

    fun objectId(): String = objectId

    fun objectType(): Optional<ObjectType> = Optional.ofNullable(objectType)

    fun name(): Optional<String> = Optional.ofNullable(name)

    fun options(): Optional<Options> = Optional.ofNullable(options)

    fun userId(): Optional<String> = Optional.ofNullable(userId)

    fun viewData(): Optional<ViewData> = Optional.ofNullable(viewData)

    fun viewType(): Optional<ViewType> = Optional.ofNullable(viewType)

    @JvmSynthetic
    internal fun getBody(): ViewUpdateBody {
        return ViewUpdateBody(
            objectId,
            objectType,
            name,
            options,
            userId,
            viewData,
            viewType,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> viewId
            else -> ""
        }
    }

    @JsonDeserialize(builder = ViewUpdateBody.Builder::class)
    @NoAutoDetect
    class ViewUpdateBody
    internal constructor(
        private val objectId: String?,
        private val objectType: ObjectType?,
        private val name: String?,
        private val options: Options?,
        private val userId: String?,
        private val viewData: ViewData?,
        private val viewType: ViewType?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** The id of the object the view applies to */
        @JsonProperty("object_id") fun objectId(): String? = objectId

        /** The object type that the ACL applies to */
        @JsonProperty("object_type") fun objectType(): ObjectType? = objectType

        /** Name of the view */
        @JsonProperty("name") fun name(): String? = name

        /** Options for the view in the app */
        @JsonProperty("options") fun options(): Options? = options

        /** Identifies the user who created the view */
        @JsonProperty("user_id") fun userId(): String? = userId

        /** The view definition */
        @JsonProperty("view_data") fun viewData(): ViewData? = viewData

        /** Type of table that the view corresponds to. */
        @JsonProperty("view_type") fun viewType(): ViewType? = viewType

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ViewUpdateBody &&
                this.objectId == other.objectId &&
                this.objectType == other.objectType &&
                this.name == other.name &&
                this.options == other.options &&
                this.userId == other.userId &&
                this.viewData == other.viewData &&
                this.viewType == other.viewType &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        objectId,
                        objectType,
                        name,
                        options,
                        userId,
                        viewData,
                        viewType,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "ViewUpdateBody{objectId=$objectId, objectType=$objectType, name=$name, options=$options, userId=$userId, viewData=$viewData, viewType=$viewType, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var objectId: String? = null
            private var objectType: ObjectType? = null
            private var name: String? = null
            private var options: Options? = null
            private var userId: String? = null
            private var viewData: ViewData? = null
            private var viewType: ViewType? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(viewUpdateBody: ViewUpdateBody) = apply {
                this.objectId = viewUpdateBody.objectId
                this.objectType = viewUpdateBody.objectType
                this.name = viewUpdateBody.name
                this.options = viewUpdateBody.options
                this.userId = viewUpdateBody.userId
                this.viewData = viewUpdateBody.viewData
                this.viewType = viewUpdateBody.viewType
                additionalProperties(viewUpdateBody.additionalProperties)
            }

            /** The id of the object the view applies to */
            @JsonProperty("object_id")
            fun objectId(objectId: String) = apply { this.objectId = objectId }

            /** The object type that the ACL applies to */
            @JsonProperty("object_type")
            fun objectType(objectType: ObjectType) = apply { this.objectType = objectType }

            /** Name of the view */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            /** Options for the view in the app */
            @JsonProperty("options")
            fun options(options: Options) = apply { this.options = options }

            /** Identifies the user who created the view */
            @JsonProperty("user_id") fun userId(userId: String) = apply { this.userId = userId }

            /** The view definition */
            @JsonProperty("view_data")
            fun viewData(viewData: ViewData) = apply { this.viewData = viewData }

            /** Type of table that the view corresponds to. */
            @JsonProperty("view_type")
            fun viewType(viewType: ViewType) = apply { this.viewType = viewType }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): ViewUpdateBody =
                ViewUpdateBody(
                    checkNotNull(objectId) { "`objectId` is required but was not set" },
                    objectType,
                    name,
                    options,
                    userId,
                    viewData,
                    viewType,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ViewUpdateParams &&
            this.viewId == other.viewId &&
            this.objectId == other.objectId &&
            this.objectType == other.objectType &&
            this.name == other.name &&
            this.options == other.options &&
            this.userId == other.userId &&
            this.viewData == other.viewData &&
            this.viewType == other.viewType &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            viewId,
            objectId,
            objectType,
            name,
            options,
            userId,
            viewData,
            viewType,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "ViewUpdateParams{viewId=$viewId, objectId=$objectId, objectType=$objectType, name=$name, options=$options, userId=$userId, viewData=$viewData, viewType=$viewType, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var viewId: String? = null
        private var objectId: String? = null
        private var objectType: ObjectType? = null
        private var name: String? = null
        private var options: Options? = null
        private var userId: String? = null
        private var viewData: ViewData? = null
        private var viewType: ViewType? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(viewUpdateParams: ViewUpdateParams) = apply {
            this.viewId = viewUpdateParams.viewId
            this.objectId = viewUpdateParams.objectId
            this.objectType = viewUpdateParams.objectType
            this.name = viewUpdateParams.name
            this.options = viewUpdateParams.options
            this.userId = viewUpdateParams.userId
            this.viewData = viewUpdateParams.viewData
            this.viewType = viewUpdateParams.viewType
            additionalQueryParams(viewUpdateParams.additionalQueryParams)
            additionalHeaders(viewUpdateParams.additionalHeaders)
            additionalBodyProperties(viewUpdateParams.additionalBodyProperties)
        }

        /** View id */
        fun viewId(viewId: String) = apply { this.viewId = viewId }

        /** The id of the object the view applies to */
        fun objectId(objectId: String) = apply { this.objectId = objectId }

        /** The object type that the ACL applies to */
        fun objectType(objectType: ObjectType) = apply { this.objectType = objectType }

        /** Name of the view */
        fun name(name: String) = apply { this.name = name }

        /** Options for the view in the app */
        fun options(options: Options) = apply { this.options = options }

        /** Identifies the user who created the view */
        fun userId(userId: String) = apply { this.userId = userId }

        /** The view definition */
        fun viewData(viewData: ViewData) = apply { this.viewData = viewData }

        /** Type of table that the view corresponds to. */
        fun viewType(viewType: ViewType) = apply { this.viewType = viewType }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): ViewUpdateParams =
            ViewUpdateParams(
                checkNotNull(viewId) { "`viewId` is required but was not set" },
                checkNotNull(objectId) { "`objectId` is required but was not set" },
                objectType,
                name,
                options,
                userId,
                viewData,
                viewType,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    class ObjectType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ObjectType && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val ORGANIZATION = ObjectType(JsonField.of("organization"))

            @JvmField val PROJECT = ObjectType(JsonField.of("project"))

            @JvmField val EXPERIMENT = ObjectType(JsonField.of("experiment"))

            @JvmField val DATASET = ObjectType(JsonField.of("dataset"))

            @JvmField val PROMPT = ObjectType(JsonField.of("prompt"))

            @JvmField val PROMPT_SESSION = ObjectType(JsonField.of("prompt_session"))

            @JvmField val GROUP = ObjectType(JsonField.of("group"))

            @JvmField val ROLE = ObjectType(JsonField.of("role"))

            @JvmField val ORG_MEMBER = ObjectType(JsonField.of("org_member"))

            @JvmField val PROJECT_LOG = ObjectType(JsonField.of("project_log"))

            @JvmField val ORG_PROJECT = ObjectType(JsonField.of("org_project"))

            @JvmStatic fun of(value: String) = ObjectType(JsonField.of(value))
        }

        enum class Known {
            ORGANIZATION,
            PROJECT,
            EXPERIMENT,
            DATASET,
            PROMPT,
            PROMPT_SESSION,
            GROUP,
            ROLE,
            ORG_MEMBER,
            PROJECT_LOG,
            ORG_PROJECT,
        }

        enum class Value {
            ORGANIZATION,
            PROJECT,
            EXPERIMENT,
            DATASET,
            PROMPT,
            PROMPT_SESSION,
            GROUP,
            ROLE,
            ORG_MEMBER,
            PROJECT_LOG,
            ORG_PROJECT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ORGANIZATION -> Value.ORGANIZATION
                PROJECT -> Value.PROJECT
                EXPERIMENT -> Value.EXPERIMENT
                DATASET -> Value.DATASET
                PROMPT -> Value.PROMPT
                PROMPT_SESSION -> Value.PROMPT_SESSION
                GROUP -> Value.GROUP
                ROLE -> Value.ROLE
                ORG_MEMBER -> Value.ORG_MEMBER
                PROJECT_LOG -> Value.PROJECT_LOG
                ORG_PROJECT -> Value.ORG_PROJECT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ORGANIZATION -> Known.ORGANIZATION
                PROJECT -> Known.PROJECT
                EXPERIMENT -> Known.EXPERIMENT
                DATASET -> Known.DATASET
                PROMPT -> Known.PROMPT
                PROMPT_SESSION -> Known.PROMPT_SESSION
                GROUP -> Known.GROUP
                ROLE -> Known.ROLE
                ORG_MEMBER -> Known.ORG_MEMBER
                PROJECT_LOG -> Known.PROJECT_LOG
                ORG_PROJECT -> Known.ORG_PROJECT
                else -> throw BraintrustInvalidDataException("Unknown ObjectType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    /** Options for the view in the app */
    @JsonDeserialize(builder = Options.Builder::class)
    @NoAutoDetect
    class Options
    private constructor(
        private val columnVisibility: ColumnVisibility?,
        private val columnOrder: List<String>?,
        private val columnSizing: ColumnSizing?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        @JsonProperty("columnVisibility")
        fun columnVisibility(): ColumnVisibility? = columnVisibility

        @JsonProperty("columnOrder") fun columnOrder(): List<String>? = columnOrder

        @JsonProperty("columnSizing") fun columnSizing(): ColumnSizing? = columnSizing

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Options &&
                this.columnVisibility == other.columnVisibility &&
                this.columnOrder == other.columnOrder &&
                this.columnSizing == other.columnSizing &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        columnVisibility,
                        columnOrder,
                        columnSizing,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Options{columnVisibility=$columnVisibility, columnOrder=$columnOrder, columnSizing=$columnSizing, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var columnVisibility: ColumnVisibility? = null
            private var columnOrder: List<String>? = null
            private var columnSizing: ColumnSizing? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(options: Options) = apply {
                this.columnVisibility = options.columnVisibility
                this.columnOrder = options.columnOrder
                this.columnSizing = options.columnSizing
                additionalProperties(options.additionalProperties)
            }

            @JsonProperty("columnVisibility")
            fun columnVisibility(columnVisibility: ColumnVisibility) = apply {
                this.columnVisibility = columnVisibility
            }

            @JsonProperty("columnOrder")
            fun columnOrder(columnOrder: List<String>) = apply { this.columnOrder = columnOrder }

            @JsonProperty("columnSizing")
            fun columnSizing(columnSizing: ColumnSizing) = apply {
                this.columnSizing = columnSizing
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): Options =
                Options(
                    columnVisibility,
                    columnOrder?.toUnmodifiable(),
                    columnSizing,
                    additionalProperties.toUnmodifiable(),
                )
        }

        @JsonDeserialize(builder = ColumnSizing.Builder::class)
        @NoAutoDetect
        class ColumnSizing
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var hashCode: Int = 0

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ColumnSizing &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = Objects.hash(additionalProperties)
                }
                return hashCode
            }

            override fun toString() = "ColumnSizing{additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(columnSizing: ColumnSizing) = apply {
                    additionalProperties(columnSizing.additionalProperties)
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): ColumnSizing = ColumnSizing(additionalProperties.toUnmodifiable())
            }
        }

        @JsonDeserialize(builder = ColumnVisibility.Builder::class)
        @NoAutoDetect
        class ColumnVisibility
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var hashCode: Int = 0

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ColumnVisibility &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = Objects.hash(additionalProperties)
                }
                return hashCode
            }

            override fun toString() = "ColumnVisibility{additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(columnVisibility: ColumnVisibility) = apply {
                    additionalProperties(columnVisibility.additionalProperties)
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): ColumnVisibility =
                    ColumnVisibility(additionalProperties.toUnmodifiable())
            }
        }
    }

    /** The view definition */
    @JsonDeserialize(builder = ViewData.Builder::class)
    @NoAutoDetect
    class ViewData
    private constructor(
        private val search: Search?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        @JsonProperty("search") fun search(): Search? = search

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ViewData &&
                this.search == other.search &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(search, additionalProperties)
            }
            return hashCode
        }

        override fun toString() =
            "ViewData{search=$search, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var search: Search? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(viewData: ViewData) = apply {
                this.search = viewData.search
                additionalProperties(viewData.additionalProperties)
            }

            @JsonProperty("search") fun search(search: Search) = apply { this.search = search }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): ViewData = ViewData(search, additionalProperties.toUnmodifiable())
        }

        @JsonDeserialize(builder = Search.Builder::class)
        @NoAutoDetect
        class Search
        private constructor(
            private val filter: List<JsonValue>?,
            private val tag: List<JsonValue>?,
            private val match: List<JsonValue>?,
            private val sort: List<JsonValue>?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var hashCode: Int = 0

            @JsonProperty("filter") fun filter(): List<JsonValue>? = filter

            @JsonProperty("tag") fun tag(): List<JsonValue>? = tag

            @JsonProperty("match") fun match(): List<JsonValue>? = match

            @JsonProperty("sort") fun sort(): List<JsonValue>? = sort

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Search &&
                    this.filter == other.filter &&
                    this.tag == other.tag &&
                    this.match == other.match &&
                    this.sort == other.sort &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            filter,
                            tag,
                            match,
                            sort,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Search{filter=$filter, tag=$tag, match=$match, sort=$sort, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var filter: List<JsonValue>? = null
                private var tag: List<JsonValue>? = null
                private var match: List<JsonValue>? = null
                private var sort: List<JsonValue>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(search: Search) = apply {
                    this.filter = search.filter
                    this.tag = search.tag
                    this.match = search.match
                    this.sort = search.sort
                    additionalProperties(search.additionalProperties)
                }

                @JsonProperty("filter")
                fun filter(filter: List<JsonValue>) = apply { this.filter = filter }

                @JsonProperty("tag") fun tag(tag: List<JsonValue>) = apply { this.tag = tag }

                @JsonProperty("match")
                fun match(match: List<JsonValue>) = apply { this.match = match }

                @JsonProperty("sort") fun sort(sort: List<JsonValue>) = apply { this.sort = sort }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Search =
                    Search(
                        filter?.toUnmodifiable(),
                        tag?.toUnmodifiable(),
                        match?.toUnmodifiable(),
                        sort?.toUnmodifiable(),
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }
    }

    class ViewType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ViewType && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val PROJECTS = ViewType(JsonField.of("projects"))

            @JvmField val LOGS = ViewType(JsonField.of("logs"))

            @JvmField val EXPERIMENTS = ViewType(JsonField.of("experiments"))

            @JvmField val DATASETS = ViewType(JsonField.of("datasets"))

            @JvmField val PROMPTS = ViewType(JsonField.of("prompts"))

            @JvmField val PLAYGROUNDS = ViewType(JsonField.of("playgrounds"))

            @JvmField val EXPERIMENT = ViewType(JsonField.of("experiment"))

            @JvmField val DATASET = ViewType(JsonField.of("dataset"))

            @JvmStatic fun of(value: String) = ViewType(JsonField.of(value))
        }

        enum class Known {
            PROJECTS,
            LOGS,
            EXPERIMENTS,
            DATASETS,
            PROMPTS,
            PLAYGROUNDS,
            EXPERIMENT,
            DATASET,
        }

        enum class Value {
            PROJECTS,
            LOGS,
            EXPERIMENTS,
            DATASETS,
            PROMPTS,
            PLAYGROUNDS,
            EXPERIMENT,
            DATASET,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                PROJECTS -> Value.PROJECTS
                LOGS -> Value.LOGS
                EXPERIMENTS -> Value.EXPERIMENTS
                DATASETS -> Value.DATASETS
                PROMPTS -> Value.PROMPTS
                PLAYGROUNDS -> Value.PLAYGROUNDS
                EXPERIMENT -> Value.EXPERIMENT
                DATASET -> Value.DATASET
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                PROJECTS -> Known.PROJECTS
                LOGS -> Known.LOGS
                EXPERIMENTS -> Known.EXPERIMENTS
                DATASETS -> Known.DATASETS
                PROMPTS -> Known.PROMPTS
                PLAYGROUNDS -> Known.PLAYGROUNDS
                EXPERIMENT -> Known.EXPERIMENT
                DATASET -> Known.DATASET
                else -> throw BraintrustInvalidDataException("Unknown ViewType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
