// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.Enum
import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.toUnmodifiable
import com.braintrustdata.api.errors.BraintrustInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = View.Builder::class)
@NoAutoDetect
class View
private constructor(
    private val id: JsonField<String>,
    private val objectType: JsonField<ObjectType>,
    private val objectId: JsonField<String>,
    private val viewType: JsonField<ViewType>,
    private val name: JsonField<String>,
    private val created: JsonField<OffsetDateTime>,
    private val viewData: JsonField<ViewData>,
    private val options: JsonField<Options>,
    private val userId: JsonField<String>,
    private val deletedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** Unique identifier for the view */
    fun id(): String = id.getRequired("id")

    /** The object type that the ACL applies to */
    fun objectType(): Optional<ObjectType> =
        Optional.ofNullable(objectType.getNullable("object_type"))

    /** The id of the object the view applies to */
    fun objectId(): String = objectId.getRequired("object_id")

    /** Type of table that the view corresponds to. */
    fun viewType(): Optional<ViewType> = Optional.ofNullable(viewType.getNullable("view_type"))

    /** Name of the view */
    fun name(): String = name.getRequired("name")

    /** Date of view creation */
    fun created(): Optional<OffsetDateTime> = Optional.ofNullable(created.getNullable("created"))

    /** The view definition */
    fun viewData(): Optional<ViewData> = Optional.ofNullable(viewData.getNullable("view_data"))

    /** Options for the view in the app */
    fun options(): Optional<Options> = Optional.ofNullable(options.getNullable("options"))

    /** Identifies the user who created the view */
    fun userId(): Optional<String> = Optional.ofNullable(userId.getNullable("user_id"))

    /** Date of role deletion, or null if the role is still active */
    fun deletedAt(): Optional<OffsetDateTime> =
        Optional.ofNullable(deletedAt.getNullable("deleted_at"))

    /** Unique identifier for the view */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /** The object type that the ACL applies to */
    @JsonProperty("object_type") @ExcludeMissing fun _objectType() = objectType

    /** The id of the object the view applies to */
    @JsonProperty("object_id") @ExcludeMissing fun _objectId() = objectId

    /** Type of table that the view corresponds to. */
    @JsonProperty("view_type") @ExcludeMissing fun _viewType() = viewType

    /** Name of the view */
    @JsonProperty("name") @ExcludeMissing fun _name() = name

    /** Date of view creation */
    @JsonProperty("created") @ExcludeMissing fun _created() = created

    /** The view definition */
    @JsonProperty("view_data") @ExcludeMissing fun _viewData() = viewData

    /** Options for the view in the app */
    @JsonProperty("options") @ExcludeMissing fun _options() = options

    /** Identifies the user who created the view */
    @JsonProperty("user_id") @ExcludeMissing fun _userId() = userId

    /** Date of role deletion, or null if the role is still active */
    @JsonProperty("deleted_at") @ExcludeMissing fun _deletedAt() = deletedAt

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): View = apply {
        if (!validated) {
            id()
            objectType()
            objectId()
            viewType()
            name()
            created()
            viewData().map { it.validate() }
            options().map { it.validate() }
            userId()
            deletedAt()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is View &&
            this.id == other.id &&
            this.objectType == other.objectType &&
            this.objectId == other.objectId &&
            this.viewType == other.viewType &&
            this.name == other.name &&
            this.created == other.created &&
            this.viewData == other.viewData &&
            this.options == other.options &&
            this.userId == other.userId &&
            this.deletedAt == other.deletedAt &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    id,
                    objectType,
                    objectId,
                    viewType,
                    name,
                    created,
                    viewData,
                    options,
                    userId,
                    deletedAt,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "View{id=$id, objectType=$objectType, objectId=$objectId, viewType=$viewType, name=$name, created=$created, viewData=$viewData, options=$options, userId=$userId, deletedAt=$deletedAt, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var objectType: JsonField<ObjectType> = JsonMissing.of()
        private var objectId: JsonField<String> = JsonMissing.of()
        private var viewType: JsonField<ViewType> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var created: JsonField<OffsetDateTime> = JsonMissing.of()
        private var viewData: JsonField<ViewData> = JsonMissing.of()
        private var options: JsonField<Options> = JsonMissing.of()
        private var userId: JsonField<String> = JsonMissing.of()
        private var deletedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(view: View) = apply {
            this.id = view.id
            this.objectType = view.objectType
            this.objectId = view.objectId
            this.viewType = view.viewType
            this.name = view.name
            this.created = view.created
            this.viewData = view.viewData
            this.options = view.options
            this.userId = view.userId
            this.deletedAt = view.deletedAt
            additionalProperties(view.additionalProperties)
        }

        /** Unique identifier for the view */
        fun id(id: String) = id(JsonField.of(id))

        /** Unique identifier for the view */
        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        /** The object type that the ACL applies to */
        fun objectType(objectType: ObjectType) = objectType(JsonField.of(objectType))

        /** The object type that the ACL applies to */
        @JsonProperty("object_type")
        @ExcludeMissing
        fun objectType(objectType: JsonField<ObjectType>) = apply { this.objectType = objectType }

        /** The id of the object the view applies to */
        fun objectId(objectId: String) = objectId(JsonField.of(objectId))

        /** The id of the object the view applies to */
        @JsonProperty("object_id")
        @ExcludeMissing
        fun objectId(objectId: JsonField<String>) = apply { this.objectId = objectId }

        /** Type of table that the view corresponds to. */
        fun viewType(viewType: ViewType) = viewType(JsonField.of(viewType))

        /** Type of table that the view corresponds to. */
        @JsonProperty("view_type")
        @ExcludeMissing
        fun viewType(viewType: JsonField<ViewType>) = apply { this.viewType = viewType }

        /** Name of the view */
        fun name(name: String) = name(JsonField.of(name))

        /** Name of the view */
        @JsonProperty("name")
        @ExcludeMissing
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Date of view creation */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /** Date of view creation */
        @JsonProperty("created")
        @ExcludeMissing
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /** The view definition */
        fun viewData(viewData: ViewData) = viewData(JsonField.of(viewData))

        /** The view definition */
        @JsonProperty("view_data")
        @ExcludeMissing
        fun viewData(viewData: JsonField<ViewData>) = apply { this.viewData = viewData }

        /** Options for the view in the app */
        fun options(options: Options) = options(JsonField.of(options))

        /** Options for the view in the app */
        @JsonProperty("options")
        @ExcludeMissing
        fun options(options: JsonField<Options>) = apply { this.options = options }

        /** Identifies the user who created the view */
        fun userId(userId: String) = userId(JsonField.of(userId))

        /** Identifies the user who created the view */
        @JsonProperty("user_id")
        @ExcludeMissing
        fun userId(userId: JsonField<String>) = apply { this.userId = userId }

        /** Date of role deletion, or null if the role is still active */
        fun deletedAt(deletedAt: OffsetDateTime) = deletedAt(JsonField.of(deletedAt))

        /** Date of role deletion, or null if the role is still active */
        @JsonProperty("deleted_at")
        @ExcludeMissing
        fun deletedAt(deletedAt: JsonField<OffsetDateTime>) = apply { this.deletedAt = deletedAt }

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

        fun build(): View =
            View(
                id,
                objectType,
                objectId,
                viewType,
                name,
                created,
                viewData,
                options,
                userId,
                deletedAt,
                additionalProperties.toUnmodifiable(),
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

    /** Options for the view in the app */
    @JsonDeserialize(builder = Options.Builder::class)
    @NoAutoDetect
    class Options
    private constructor(
        private val columnVisibility: JsonField<ColumnVisibility>,
        private val columnOrder: JsonField<List<String>>,
        private val columnSizing: JsonField<ColumnSizing>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        fun columnVisibility(): Optional<ColumnVisibility> =
            Optional.ofNullable(columnVisibility.getNullable("columnVisibility"))

        fun columnOrder(): Optional<List<String>> =
            Optional.ofNullable(columnOrder.getNullable("columnOrder"))

        fun columnSizing(): Optional<ColumnSizing> =
            Optional.ofNullable(columnSizing.getNullable("columnSizing"))

        @JsonProperty("columnVisibility") @ExcludeMissing fun _columnVisibility() = columnVisibility

        @JsonProperty("columnOrder") @ExcludeMissing fun _columnOrder() = columnOrder

        @JsonProperty("columnSizing") @ExcludeMissing fun _columnSizing() = columnSizing

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Options = apply {
            if (!validated) {
                columnVisibility().map { it.validate() }
                columnOrder()
                columnSizing().map { it.validate() }
                validated = true
            }
        }

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

            private var columnVisibility: JsonField<ColumnVisibility> = JsonMissing.of()
            private var columnOrder: JsonField<List<String>> = JsonMissing.of()
            private var columnSizing: JsonField<ColumnSizing> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(options: Options) = apply {
                this.columnVisibility = options.columnVisibility
                this.columnOrder = options.columnOrder
                this.columnSizing = options.columnSizing
                additionalProperties(options.additionalProperties)
            }

            fun columnVisibility(columnVisibility: ColumnVisibility) =
                columnVisibility(JsonField.of(columnVisibility))

            @JsonProperty("columnVisibility")
            @ExcludeMissing
            fun columnVisibility(columnVisibility: JsonField<ColumnVisibility>) = apply {
                this.columnVisibility = columnVisibility
            }

            fun columnOrder(columnOrder: List<String>) = columnOrder(JsonField.of(columnOrder))

            @JsonProperty("columnOrder")
            @ExcludeMissing
            fun columnOrder(columnOrder: JsonField<List<String>>) = apply {
                this.columnOrder = columnOrder
            }

            fun columnSizing(columnSizing: ColumnSizing) = columnSizing(JsonField.of(columnSizing))

            @JsonProperty("columnSizing")
            @ExcludeMissing
            fun columnSizing(columnSizing: JsonField<ColumnSizing>) = apply {
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
                    columnOrder.map { it.toUnmodifiable() },
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

            private var validated: Boolean = false

            private var hashCode: Int = 0

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): ColumnSizing = apply {
                if (!validated) {
                    validated = true
                }
            }

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

            private var validated: Boolean = false

            private var hashCode: Int = 0

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): ColumnVisibility = apply {
                if (!validated) {
                    validated = true
                }
            }

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
        private val search: JsonField<Search>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        fun search(): Optional<Search> = Optional.ofNullable(search.getNullable("search"))

        @JsonProperty("search") @ExcludeMissing fun _search() = search

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): ViewData = apply {
            if (!validated) {
                search().map { it.validate() }
                validated = true
            }
        }

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

            private var search: JsonField<Search> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(viewData: ViewData) = apply {
                this.search = viewData.search
                additionalProperties(viewData.additionalProperties)
            }

            fun search(search: Search) = search(JsonField.of(search))

            @JsonProperty("search")
            @ExcludeMissing
            fun search(search: JsonField<Search>) = apply { this.search = search }

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
            private val filter: JsonField<List<JsonValue>>,
            private val tag: JsonField<List<JsonValue>>,
            private val match: JsonField<List<JsonValue>>,
            private val sort: JsonField<List<JsonValue>>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun filter(): Optional<List<JsonValue>> =
                Optional.ofNullable(filter.getNullable("filter"))

            fun tag(): Optional<List<JsonValue>> = Optional.ofNullable(tag.getNullable("tag"))

            fun match(): Optional<List<JsonValue>> = Optional.ofNullable(match.getNullable("match"))

            fun sort(): Optional<List<JsonValue>> = Optional.ofNullable(sort.getNullable("sort"))

            @JsonProperty("filter") @ExcludeMissing fun _filter() = filter

            @JsonProperty("tag") @ExcludeMissing fun _tag() = tag

            @JsonProperty("match") @ExcludeMissing fun _match() = match

            @JsonProperty("sort") @ExcludeMissing fun _sort() = sort

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Search = apply {
                if (!validated) {
                    filter()
                    tag()
                    match()
                    sort()
                    validated = true
                }
            }

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

                private var filter: JsonField<List<JsonValue>> = JsonMissing.of()
                private var tag: JsonField<List<JsonValue>> = JsonMissing.of()
                private var match: JsonField<List<JsonValue>> = JsonMissing.of()
                private var sort: JsonField<List<JsonValue>> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(search: Search) = apply {
                    this.filter = search.filter
                    this.tag = search.tag
                    this.match = search.match
                    this.sort = search.sort
                    additionalProperties(search.additionalProperties)
                }

                fun filter(filter: List<JsonValue>) = filter(JsonField.of(filter))

                @JsonProperty("filter")
                @ExcludeMissing
                fun filter(filter: JsonField<List<JsonValue>>) = apply { this.filter = filter }

                fun tag(tag: List<JsonValue>) = tag(JsonField.of(tag))

                @JsonProperty("tag")
                @ExcludeMissing
                fun tag(tag: JsonField<List<JsonValue>>) = apply { this.tag = tag }

                fun match(match: List<JsonValue>) = match(JsonField.of(match))

                @JsonProperty("match")
                @ExcludeMissing
                fun match(match: JsonField<List<JsonValue>>) = apply { this.match = match }

                fun sort(sort: List<JsonValue>) = sort(JsonField.of(sort))

                @JsonProperty("sort")
                @ExcludeMissing
                fun sort(sort: JsonField<List<JsonValue>>) = apply { this.sort = sort }

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
                        filter.map { it.toUnmodifiable() },
                        tag.map { it.toUnmodifiable() },
                        match.map { it.toUnmodifiable() },
                        sort.map { it.toUnmodifiable() },
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }
    }
}
