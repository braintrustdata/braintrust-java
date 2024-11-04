// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.BaseDeserializer
import com.braintrustdata.api.core.BaseSerializer
import com.braintrustdata.api.core.Enum
import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.getOrThrow
import com.braintrustdata.api.core.toImmutable
import com.braintrustdata.api.errors.BraintrustInvalidDataException
import com.braintrustdata.api.models.*
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import java.util.Objects
import java.util.Optional

class FunctionInvokeParams
constructor(
    private val functionId: String,
    private val input: JsonValue?,
    private val messages: List<Message>?,
    private val mode: Mode?,
    private val parent: Parent?,
    private val stream: Boolean?,
    private val version: String?,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun functionId(): String = functionId

    fun input(): Optional<JsonValue> = Optional.ofNullable(input)

    fun messages(): Optional<List<Message>> = Optional.ofNullable(messages)

    fun mode(): Optional<Mode> = Optional.ofNullable(mode)

    fun parent(): Optional<Parent> = Optional.ofNullable(parent)

    fun stream(): Optional<Boolean> = Optional.ofNullable(stream)

    fun version(): Optional<String> = Optional.ofNullable(version)

    @JvmSynthetic
    internal fun getBody(): FunctionInvokeBody {
        return FunctionInvokeBody(
            input,
            messages,
            mode,
            parent,
            stream,
            version,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> functionId
            else -> ""
        }
    }

    /** The request to invoke a function */
    @JsonDeserialize(builder = FunctionInvokeBody.Builder::class)
    @NoAutoDetect
    class FunctionInvokeBody
    internal constructor(
        private val input: JsonValue?,
        private val messages: List<Message>?,
        private val mode: Mode?,
        private val parent: Parent?,
        private val stream: Boolean?,
        private val version: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** Argument to the function, which can be any JSON serializable value */
        @JsonProperty("input") fun input(): JsonValue? = input

        /** If the function is an LLM, additional messages to pass along to it */
        @JsonProperty("messages") fun messages(): List<Message>? = messages

        /** The mode format of the returned value (defaults to 'auto') */
        @JsonProperty("mode") fun mode(): Mode? = mode

        /** Options for tracing the function call */
        @JsonProperty("parent") fun parent(): Parent? = parent

        /**
         * Whether to stream the response. If true, results will be returned in the Braintrust SSE
         * format.
         */
        @JsonProperty("stream") fun stream(): Boolean? = stream

        /** The version of the function */
        @JsonProperty("version") fun version(): String? = version

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var input: JsonValue? = null
            private var messages: List<Message>? = null
            private var mode: Mode? = null
            private var parent: Parent? = null
            private var stream: Boolean? = null
            private var version: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(functionInvokeBody: FunctionInvokeBody) = apply {
                this.input = functionInvokeBody.input
                this.messages = functionInvokeBody.messages
                this.mode = functionInvokeBody.mode
                this.parent = functionInvokeBody.parent
                this.stream = functionInvokeBody.stream
                this.version = functionInvokeBody.version
                additionalProperties(functionInvokeBody.additionalProperties)
            }

            /** Argument to the function, which can be any JSON serializable value */
            @JsonProperty("input") fun input(input: JsonValue) = apply { this.input = input }

            /** If the function is an LLM, additional messages to pass along to it */
            @JsonProperty("messages")
            fun messages(messages: List<Message>) = apply { this.messages = messages }

            /** The mode format of the returned value (defaults to 'auto') */
            @JsonProperty("mode") fun mode(mode: Mode) = apply { this.mode = mode }

            /** Options for tracing the function call */
            @JsonProperty("parent") fun parent(parent: Parent) = apply { this.parent = parent }

            /**
             * Whether to stream the response. If true, results will be returned in the Braintrust
             * SSE format.
             */
            @JsonProperty("stream") fun stream(stream: Boolean) = apply { this.stream = stream }

            /** The version of the function */
            @JsonProperty("version") fun version(version: String) = apply { this.version = version }

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

            fun build(): FunctionInvokeBody =
                FunctionInvokeBody(
                    input,
                    messages?.toImmutable(),
                    mode,
                    parent,
                    stream,
                    version,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is FunctionInvokeBody && this.input == other.input && this.messages == other.messages && this.mode == other.mode && this.parent == other.parent && this.stream == other.stream && this.version == other.version && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(input, messages, mode, parent, stream, version, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "FunctionInvokeBody{input=$input, messages=$messages, mode=$mode, parent=$parent, stream=$stream, version=$version, additionalProperties=$additionalProperties}"
    }

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is FunctionInvokeParams && this.functionId == other.functionId && this.input == other.input && this.messages == other.messages && this.mode == other.mode && this.parent == other.parent && this.stream == other.stream && this.version == other.version && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(functionId, input, messages, mode, parent, stream, version, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "FunctionInvokeParams{functionId=$functionId, input=$input, messages=$messages, mode=$mode, parent=$parent, stream=$stream, version=$version, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var functionId: String? = null
        private var input: JsonValue? = null
        private var messages: MutableList<Message> = mutableListOf()
        private var mode: Mode? = null
        private var parent: Parent? = null
        private var stream: Boolean? = null
        private var version: String? = null
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(functionInvokeParams: FunctionInvokeParams) = apply {
            this.functionId = functionInvokeParams.functionId
            this.input = functionInvokeParams.input
            this.messages(functionInvokeParams.messages ?: listOf())
            this.mode = functionInvokeParams.mode
            this.parent = functionInvokeParams.parent
            this.stream = functionInvokeParams.stream
            this.version = functionInvokeParams.version
            additionalHeaders(functionInvokeParams.additionalHeaders)
            additionalQueryParams(functionInvokeParams.additionalQueryParams)
            additionalBodyProperties(functionInvokeParams.additionalBodyProperties)
        }

        /** Function id */
        fun functionId(functionId: String) = apply { this.functionId = functionId }

        /** Argument to the function, which can be any JSON serializable value */
        fun input(input: JsonValue) = apply { this.input = input }

        /** If the function is an LLM, additional messages to pass along to it */
        fun messages(messages: List<Message>) = apply {
            this.messages.clear()
            this.messages.addAll(messages)
        }

        /** If the function is an LLM, additional messages to pass along to it */
        fun addMessage(message: Message) = apply { this.messages.add(message) }

        /** The mode format of the returned value (defaults to 'auto') */
        fun mode(mode: Mode) = apply { this.mode = mode }

        /** Options for tracing the function call */
        fun parent(parent: Parent) = apply { this.parent = parent }

        /** Options for tracing the function call */
        fun parent(spanParentStruct: Parent.SpanParentStruct) = apply {
            this.parent = Parent.ofSpanParentStruct(spanParentStruct)
        }

        /** Options for tracing the function call */
        fun parent(string: String) = apply { this.parent = Parent.ofString(string) }

        /**
         * Whether to stream the response. If true, results will be returned in the Braintrust SSE
         * format.
         */
        fun stream(stream: Boolean) = apply { this.stream = stream }

        /** The version of the function */
        fun version(version: String) = apply { this.version = version }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.putAll(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(::putAdditionalHeaders)
        }

        fun removeAdditionalHeader(name: String) = apply { additionalHeaders.removeAll(name) }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.putAll(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                additionalQueryParams.forEach(::putAdditionalQueryParams)
            }

        fun removeAdditionalQueryParam(key: String) = apply { additionalQueryParams.removeAll(key) }

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

        fun build(): FunctionInvokeParams =
            FunctionInvokeParams(
                checkNotNull(functionId) { "`functionId` is required but was not set" },
                input,
                if (messages.size == 0) null else messages.toImmutable(),
                mode,
                parent,
                stream,
                version,
                additionalHeaders
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalQueryParams
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalBodyProperties.toImmutable(),
            )
    }

    @JsonDeserialize(using = Message.Deserializer::class)
    @JsonSerialize(using = Message.Serializer::class)
    class Message
    private constructor(
        private val system: System? = null,
        private val user: User? = null,
        private val assistant: Assistant? = null,
        private val tool: Tool? = null,
        private val function: Function? = null,
        private val fallback: Fallback? = null,
        private val _json: JsonValue? = null,
    ) {

        private var validated: Boolean = false

        fun system(): Optional<System> = Optional.ofNullable(system)

        fun user(): Optional<User> = Optional.ofNullable(user)

        fun assistant(): Optional<Assistant> = Optional.ofNullable(assistant)

        fun tool(): Optional<Tool> = Optional.ofNullable(tool)

        fun function(): Optional<Function> = Optional.ofNullable(function)

        fun fallback(): Optional<Fallback> = Optional.ofNullable(fallback)

        fun isSystem(): Boolean = system != null

        fun isUser(): Boolean = user != null

        fun isAssistant(): Boolean = assistant != null

        fun isTool(): Boolean = tool != null

        fun isFunction(): Boolean = function != null

        fun isFallback(): Boolean = fallback != null

        fun asSystem(): System = system.getOrThrow("system")

        fun asUser(): User = user.getOrThrow("user")

        fun asAssistant(): Assistant = assistant.getOrThrow("assistant")

        fun asTool(): Tool = tool.getOrThrow("tool")

        fun asFunction(): Function = function.getOrThrow("function")

        fun asFallback(): Fallback = fallback.getOrThrow("fallback")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                system != null -> visitor.visitSystem(system)
                user != null -> visitor.visitUser(user)
                assistant != null -> visitor.visitAssistant(assistant)
                tool != null -> visitor.visitTool(tool)
                function != null -> visitor.visitFunction(function)
                fallback != null -> visitor.visitFallback(fallback)
                else -> visitor.unknown(_json)
            }
        }

        fun validate(): Message = apply {
            if (!validated) {
                if (
                    system == null &&
                        user == null &&
                        assistant == null &&
                        tool == null &&
                        function == null &&
                        fallback == null
                ) {
                    throw BraintrustInvalidDataException("Unknown Message: $_json")
                }
                system?.validate()
                user?.validate()
                assistant?.validate()
                tool?.validate()
                function?.validate()
                fallback?.validate()
                validated = true
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Message && this.system == other.system && this.user == other.user && this.assistant == other.assistant && this.tool == other.tool && this.function == other.function && this.fallback == other.fallback /* spotless:on */
        }

        override fun hashCode(): Int {
            return /* spotless:off */ Objects.hash(system, user, assistant, tool, function, fallback) /* spotless:on */
        }

        override fun toString(): String {
            return when {
                system != null -> "Message{system=$system}"
                user != null -> "Message{user=$user}"
                assistant != null -> "Message{assistant=$assistant}"
                tool != null -> "Message{tool=$tool}"
                function != null -> "Message{function=$function}"
                fallback != null -> "Message{fallback=$fallback}"
                _json != null -> "Message{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Message")
            }
        }

        companion object {

            @JvmStatic fun ofSystem(system: System) = Message(system = system)

            @JvmStatic fun ofUser(user: User) = Message(user = user)

            @JvmStatic fun ofAssistant(assistant: Assistant) = Message(assistant = assistant)

            @JvmStatic fun ofTool(tool: Tool) = Message(tool = tool)

            @JvmStatic fun ofFunction(function: Function) = Message(function = function)

            @JvmStatic fun ofFallback(fallback: Fallback) = Message(fallback = fallback)
        }

        interface Visitor<out T> {

            fun visitSystem(system: System): T

            fun visitUser(user: User): T

            fun visitAssistant(assistant: Assistant): T

            fun visitTool(tool: Tool): T

            fun visitFunction(function: Function): T

            fun visitFallback(fallback: Fallback): T

            fun unknown(json: JsonValue?): T {
                throw BraintrustInvalidDataException("Unknown Message: $json")
            }
        }

        class Deserializer : BaseDeserializer<Message>(Message::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Message {
                val json = JsonValue.fromJsonNode(node)

                tryDeserialize(node, jacksonTypeRef<System>()) { it.validate() }
                    ?.let {
                        return Message(system = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<User>()) { it.validate() }
                    ?.let {
                        return Message(user = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<Assistant>()) { it.validate() }
                    ?.let {
                        return Message(assistant = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<Tool>()) { it.validate() }
                    ?.let {
                        return Message(tool = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<Function>()) { it.validate() }
                    ?.let {
                        return Message(function = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<Fallback>()) { it.validate() }
                    ?.let {
                        return Message(fallback = it, _json = json)
                    }

                return Message(_json = json)
            }
        }

        class Serializer : BaseSerializer<Message>(Message::class) {

            override fun serialize(
                value: Message,
                generator: JsonGenerator,
                provider: SerializerProvider
            ) {
                when {
                    value.system != null -> generator.writeObject(value.system)
                    value.user != null -> generator.writeObject(value.user)
                    value.assistant != null -> generator.writeObject(value.assistant)
                    value.tool != null -> generator.writeObject(value.tool)
                    value.function != null -> generator.writeObject(value.function)
                    value.fallback != null -> generator.writeObject(value.fallback)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Message")
                }
            }
        }

        @JsonDeserialize(builder = System.Builder::class)
        @NoAutoDetect
        class System
        private constructor(
            private val content: JsonField<String>,
            private val role: JsonField<Role>,
            private val name: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            fun content(): Optional<String> = Optional.ofNullable(content.getNullable("content"))

            fun role(): Role = role.getRequired("role")

            fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

            @JsonProperty("content") @ExcludeMissing fun _content() = content

            @JsonProperty("role") @ExcludeMissing fun _role() = role

            @JsonProperty("name") @ExcludeMissing fun _name() = name

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): System = apply {
                if (!validated) {
                    content()
                    role()
                    name()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var content: JsonField<String> = JsonMissing.of()
                private var role: JsonField<Role> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(system: System) = apply {
                    this.content = system.content
                    this.role = system.role
                    this.name = system.name
                    additionalProperties(system.additionalProperties)
                }

                fun content(content: String) = content(JsonField.of(content))

                @JsonProperty("content")
                @ExcludeMissing
                fun content(content: JsonField<String>) = apply { this.content = content }

                fun role(role: Role) = role(JsonField.of(role))

                @JsonProperty("role")
                @ExcludeMissing
                fun role(role: JsonField<Role>) = apply { this.role = role }

                fun name(name: String) = name(JsonField.of(name))

                @JsonProperty("name")
                @ExcludeMissing
                fun name(name: JsonField<String>) = apply { this.name = name }

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

                fun build(): System =
                    System(
                        content,
                        role,
                        name,
                        additionalProperties.toImmutable(),
                    )
            }

            class Role
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Role && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    @JvmField val SYSTEM = Role(JsonField.of("system"))

                    @JvmStatic fun of(value: String) = Role(JsonField.of(value))
                }

                enum class Known {
                    SYSTEM,
                }

                enum class Value {
                    SYSTEM,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        SYSTEM -> Value.SYSTEM
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        SYSTEM -> Known.SYSTEM
                        else -> throw BraintrustInvalidDataException("Unknown Role: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is System && this.content == other.content && this.role == other.role && this.name == other.name && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(content, role, name, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "System{content=$content, role=$role, name=$name, additionalProperties=$additionalProperties}"
        }

        @JsonDeserialize(builder = User.Builder::class)
        @NoAutoDetect
        class User
        private constructor(
            private val content: JsonField<Content>,
            private val role: JsonField<Role>,
            private val name: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            fun content(): Optional<Content> = Optional.ofNullable(content.getNullable("content"))

            fun role(): Role = role.getRequired("role")

            fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

            @JsonProperty("content") @ExcludeMissing fun _content() = content

            @JsonProperty("role") @ExcludeMissing fun _role() = role

            @JsonProperty("name") @ExcludeMissing fun _name() = name

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): User = apply {
                if (!validated) {
                    content()
                    role()
                    name()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var content: JsonField<Content> = JsonMissing.of()
                private var role: JsonField<Role> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(user: User) = apply {
                    this.content = user.content
                    this.role = user.role
                    this.name = user.name
                    additionalProperties(user.additionalProperties)
                }

                fun content(content: Content) = content(JsonField.of(content))

                @JsonProperty("content")
                @ExcludeMissing
                fun content(content: JsonField<Content>) = apply { this.content = content }

                fun role(role: Role) = role(JsonField.of(role))

                @JsonProperty("role")
                @ExcludeMissing
                fun role(role: JsonField<Role>) = apply { this.role = role }

                fun name(name: String) = name(JsonField.of(name))

                @JsonProperty("name")
                @ExcludeMissing
                fun name(name: JsonField<String>) = apply { this.name = name }

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

                fun build(): User =
                    User(
                        content,
                        role,
                        name,
                        additionalProperties.toImmutable(),
                    )
            }

            class Role
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Role && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    @JvmField val USER = Role(JsonField.of("user"))

                    @JvmStatic fun of(value: String) = Role(JsonField.of(value))
                }

                enum class Known {
                    USER,
                }

                enum class Value {
                    USER,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        USER -> Value.USER
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        USER -> Known.USER
                        else -> throw BraintrustInvalidDataException("Unknown Role: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            @JsonDeserialize(using = Content.Deserializer::class)
            @JsonSerialize(using = Content.Serializer::class)
            class Content
            private constructor(
                private val text: String? = null,
                private val array: List<ChatCompletionContentPart>? = null,
                private val _json: JsonValue? = null,
            ) {

                private var validated: Boolean = false

                fun text(): Optional<String> = Optional.ofNullable(text)

                fun array(): Optional<List<ChatCompletionContentPart>> = Optional.ofNullable(array)

                fun isText(): Boolean = text != null

                fun isArray(): Boolean = array != null

                fun asText(): String = text.getOrThrow("text")

                fun asArray(): List<ChatCompletionContentPart> = array.getOrThrow("array")

                fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                fun <T> accept(visitor: Visitor<T>): T {
                    return when {
                        text != null -> visitor.visitText(text)
                        array != null -> visitor.visitArray(array)
                        else -> visitor.unknown(_json)
                    }
                }

                fun validate(): Content = apply {
                    if (!validated) {
                        if (text == null && array == null) {
                            throw BraintrustInvalidDataException("Unknown Content: $_json")
                        }
                        validated = true
                    }
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Content && this.text == other.text && this.array == other.array /* spotless:on */
                }

                override fun hashCode(): Int {
                    return /* spotless:off */ Objects.hash(text, array) /* spotless:on */
                }

                override fun toString(): String {
                    return when {
                        text != null -> "Content{text=$text}"
                        array != null -> "Content{array=$array}"
                        _json != null -> "Content{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid Content")
                    }
                }

                companion object {

                    @JvmStatic fun ofText(text: String) = Content(text = text)

                    @JvmStatic
                    fun ofArray(array: List<ChatCompletionContentPart>) = Content(array = array)
                }

                interface Visitor<out T> {

                    fun visitText(text: String): T

                    fun visitArray(array: List<ChatCompletionContentPart>): T

                    fun unknown(json: JsonValue?): T {
                        throw BraintrustInvalidDataException("Unknown Content: $json")
                    }
                }

                class Deserializer : BaseDeserializer<Content>(Content::class) {

                    override fun ObjectCodec.deserialize(node: JsonNode): Content {
                        val json = JsonValue.fromJsonNode(node)

                        tryDeserialize(node, jacksonTypeRef<String>())?.let {
                            return Content(text = it, _json = json)
                        }
                        tryDeserialize(node, jacksonTypeRef<List<ChatCompletionContentPart>>())
                            ?.let {
                                return Content(array = it, _json = json)
                            }

                        return Content(_json = json)
                    }
                }

                class Serializer : BaseSerializer<Content>(Content::class) {

                    override fun serialize(
                        value: Content,
                        generator: JsonGenerator,
                        provider: SerializerProvider
                    ) {
                        when {
                            value.text != null -> generator.writeObject(value.text)
                            value.array != null -> generator.writeObject(value.array)
                            value._json != null -> generator.writeObject(value._json)
                            else -> throw IllegalStateException("Invalid Content")
                        }
                    }
                }
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is User && this.content == other.content && this.role == other.role && this.name == other.name && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(content, role, name, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "User{content=$content, role=$role, name=$name, additionalProperties=$additionalProperties}"
        }

        @JsonDeserialize(builder = Assistant.Builder::class)
        @NoAutoDetect
        class Assistant
        private constructor(
            private val role: JsonField<Role>,
            private val content: JsonField<String>,
            private val functionCall: JsonField<FunctionCall>,
            private val name: JsonField<String>,
            private val toolCalls: JsonField<List<ChatCompletionMessageToolCall>>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            fun role(): Role = role.getRequired("role")

            fun content(): Optional<String> = Optional.ofNullable(content.getNullable("content"))

            fun functionCall(): Optional<FunctionCall> =
                Optional.ofNullable(functionCall.getNullable("function_call"))

            fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

            fun toolCalls(): Optional<List<ChatCompletionMessageToolCall>> =
                Optional.ofNullable(toolCalls.getNullable("tool_calls"))

            @JsonProperty("role") @ExcludeMissing fun _role() = role

            @JsonProperty("content") @ExcludeMissing fun _content() = content

            @JsonProperty("function_call") @ExcludeMissing fun _functionCall() = functionCall

            @JsonProperty("name") @ExcludeMissing fun _name() = name

            @JsonProperty("tool_calls") @ExcludeMissing fun _toolCalls() = toolCalls

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Assistant = apply {
                if (!validated) {
                    role()
                    content()
                    functionCall().map { it.validate() }
                    name()
                    toolCalls().map { it.forEach { it.validate() } }
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var role: JsonField<Role> = JsonMissing.of()
                private var content: JsonField<String> = JsonMissing.of()
                private var functionCall: JsonField<FunctionCall> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var toolCalls: JsonField<List<ChatCompletionMessageToolCall>> =
                    JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(assistant: Assistant) = apply {
                    this.role = assistant.role
                    this.content = assistant.content
                    this.functionCall = assistant.functionCall
                    this.name = assistant.name
                    this.toolCalls = assistant.toolCalls
                    additionalProperties(assistant.additionalProperties)
                }

                fun role(role: Role) = role(JsonField.of(role))

                @JsonProperty("role")
                @ExcludeMissing
                fun role(role: JsonField<Role>) = apply { this.role = role }

                fun content(content: String) = content(JsonField.of(content))

                @JsonProperty("content")
                @ExcludeMissing
                fun content(content: JsonField<String>) = apply { this.content = content }

                fun functionCall(functionCall: FunctionCall) =
                    functionCall(JsonField.of(functionCall))

                @JsonProperty("function_call")
                @ExcludeMissing
                fun functionCall(functionCall: JsonField<FunctionCall>) = apply {
                    this.functionCall = functionCall
                }

                fun name(name: String) = name(JsonField.of(name))

                @JsonProperty("name")
                @ExcludeMissing
                fun name(name: JsonField<String>) = apply { this.name = name }

                fun toolCalls(toolCalls: List<ChatCompletionMessageToolCall>) =
                    toolCalls(JsonField.of(toolCalls))

                @JsonProperty("tool_calls")
                @ExcludeMissing
                fun toolCalls(toolCalls: JsonField<List<ChatCompletionMessageToolCall>>) = apply {
                    this.toolCalls = toolCalls
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

                fun build(): Assistant =
                    Assistant(
                        role,
                        content,
                        functionCall,
                        name,
                        toolCalls.map { it.toImmutable() },
                        additionalProperties.toImmutable(),
                    )
            }

            class Role
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Role && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    @JvmField val ASSISTANT = Role(JsonField.of("assistant"))

                    @JvmStatic fun of(value: String) = Role(JsonField.of(value))
                }

                enum class Known {
                    ASSISTANT,
                }

                enum class Value {
                    ASSISTANT,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        ASSISTANT -> Value.ASSISTANT
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        ASSISTANT -> Known.ASSISTANT
                        else -> throw BraintrustInvalidDataException("Unknown Role: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            @JsonDeserialize(builder = FunctionCall.Builder::class)
            @NoAutoDetect
            class FunctionCall
            private constructor(
                private val arguments: JsonField<String>,
                private val name: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                fun arguments(): String = arguments.getRequired("arguments")

                fun name(): String = name.getRequired("name")

                @JsonProperty("arguments") @ExcludeMissing fun _arguments() = arguments

                @JsonProperty("name") @ExcludeMissing fun _name() = name

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): FunctionCall = apply {
                    if (!validated) {
                        arguments()
                        name()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var arguments: JsonField<String> = JsonMissing.of()
                    private var name: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(functionCall: FunctionCall) = apply {
                        this.arguments = functionCall.arguments
                        this.name = functionCall.name
                        additionalProperties(functionCall.additionalProperties)
                    }

                    fun arguments(arguments: String) = arguments(JsonField.of(arguments))

                    @JsonProperty("arguments")
                    @ExcludeMissing
                    fun arguments(arguments: JsonField<String>) = apply {
                        this.arguments = arguments
                    }

                    fun name(name: String) = name(JsonField.of(name))

                    @JsonProperty("name")
                    @ExcludeMissing
                    fun name(name: JsonField<String>) = apply { this.name = name }

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

                    fun build(): FunctionCall =
                        FunctionCall(
                            arguments,
                            name,
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is FunctionCall && this.arguments == other.arguments && this.name == other.name && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(arguments, name, additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

                override fun toString() =
                    "FunctionCall{arguments=$arguments, name=$name, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Assistant && this.role == other.role && this.content == other.content && this.functionCall == other.functionCall && this.name == other.name && this.toolCalls == other.toolCalls && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(role, content, functionCall, name, toolCalls, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "Assistant{role=$role, content=$content, functionCall=$functionCall, name=$name, toolCalls=$toolCalls, additionalProperties=$additionalProperties}"
        }

        @JsonDeserialize(builder = Tool.Builder::class)
        @NoAutoDetect
        class Tool
        private constructor(
            private val content: JsonField<String>,
            private val role: JsonField<Role>,
            private val toolCallId: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            fun content(): Optional<String> = Optional.ofNullable(content.getNullable("content"))

            fun role(): Role = role.getRequired("role")

            fun toolCallId(): Optional<String> =
                Optional.ofNullable(toolCallId.getNullable("tool_call_id"))

            @JsonProperty("content") @ExcludeMissing fun _content() = content

            @JsonProperty("role") @ExcludeMissing fun _role() = role

            @JsonProperty("tool_call_id") @ExcludeMissing fun _toolCallId() = toolCallId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Tool = apply {
                if (!validated) {
                    content()
                    role()
                    toolCallId()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var content: JsonField<String> = JsonMissing.of()
                private var role: JsonField<Role> = JsonMissing.of()
                private var toolCallId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(tool: Tool) = apply {
                    this.content = tool.content
                    this.role = tool.role
                    this.toolCallId = tool.toolCallId
                    additionalProperties(tool.additionalProperties)
                }

                fun content(content: String) = content(JsonField.of(content))

                @JsonProperty("content")
                @ExcludeMissing
                fun content(content: JsonField<String>) = apply { this.content = content }

                fun role(role: Role) = role(JsonField.of(role))

                @JsonProperty("role")
                @ExcludeMissing
                fun role(role: JsonField<Role>) = apply { this.role = role }

                fun toolCallId(toolCallId: String) = toolCallId(JsonField.of(toolCallId))

                @JsonProperty("tool_call_id")
                @ExcludeMissing
                fun toolCallId(toolCallId: JsonField<String>) = apply {
                    this.toolCallId = toolCallId
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

                fun build(): Tool =
                    Tool(
                        content,
                        role,
                        toolCallId,
                        additionalProperties.toImmutable(),
                    )
            }

            class Role
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Role && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    @JvmField val TOOL = Role(JsonField.of("tool"))

                    @JvmStatic fun of(value: String) = Role(JsonField.of(value))
                }

                enum class Known {
                    TOOL,
                }

                enum class Value {
                    TOOL,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        TOOL -> Value.TOOL
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        TOOL -> Known.TOOL
                        else -> throw BraintrustInvalidDataException("Unknown Role: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Tool && this.content == other.content && this.role == other.role && this.toolCallId == other.toolCallId && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(content, role, toolCallId, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "Tool{content=$content, role=$role, toolCallId=$toolCallId, additionalProperties=$additionalProperties}"
        }

        @JsonDeserialize(builder = Function.Builder::class)
        @NoAutoDetect
        class Function
        private constructor(
            private val content: JsonField<String>,
            private val name: JsonField<String>,
            private val role: JsonField<Role>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            fun content(): Optional<String> = Optional.ofNullable(content.getNullable("content"))

            fun name(): String = name.getRequired("name")

            fun role(): Role = role.getRequired("role")

            @JsonProperty("content") @ExcludeMissing fun _content() = content

            @JsonProperty("name") @ExcludeMissing fun _name() = name

            @JsonProperty("role") @ExcludeMissing fun _role() = role

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Function = apply {
                if (!validated) {
                    content()
                    name()
                    role()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var content: JsonField<String> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var role: JsonField<Role> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(function: Function) = apply {
                    this.content = function.content
                    this.name = function.name
                    this.role = function.role
                    additionalProperties(function.additionalProperties)
                }

                fun content(content: String) = content(JsonField.of(content))

                @JsonProperty("content")
                @ExcludeMissing
                fun content(content: JsonField<String>) = apply { this.content = content }

                fun name(name: String) = name(JsonField.of(name))

                @JsonProperty("name")
                @ExcludeMissing
                fun name(name: JsonField<String>) = apply { this.name = name }

                fun role(role: Role) = role(JsonField.of(role))

                @JsonProperty("role")
                @ExcludeMissing
                fun role(role: JsonField<Role>) = apply { this.role = role }

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

                fun build(): Function =
                    Function(
                        content,
                        name,
                        role,
                        additionalProperties.toImmutable(),
                    )
            }

            class Role
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Role && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    @JvmField val FUNCTION = Role(JsonField.of("function"))

                    @JvmStatic fun of(value: String) = Role(JsonField.of(value))
                }

                enum class Known {
                    FUNCTION,
                }

                enum class Value {
                    FUNCTION,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        FUNCTION -> Value.FUNCTION
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        FUNCTION -> Known.FUNCTION
                        else -> throw BraintrustInvalidDataException("Unknown Role: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Function && this.content == other.content && this.name == other.name && this.role == other.role && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(content, name, role, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "Function{content=$content, name=$name, role=$role, additionalProperties=$additionalProperties}"
        }

        @JsonDeserialize(builder = Fallback.Builder::class)
        @NoAutoDetect
        class Fallback
        private constructor(
            private val role: JsonField<Role>,
            private val content: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            fun role(): Role = role.getRequired("role")

            fun content(): Optional<String> = Optional.ofNullable(content.getNullable("content"))

            @JsonProperty("role") @ExcludeMissing fun _role() = role

            @JsonProperty("content") @ExcludeMissing fun _content() = content

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Fallback = apply {
                if (!validated) {
                    role()
                    content()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var role: JsonField<Role> = JsonMissing.of()
                private var content: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(fallback: Fallback) = apply {
                    this.role = fallback.role
                    this.content = fallback.content
                    additionalProperties(fallback.additionalProperties)
                }

                fun role(role: Role) = role(JsonField.of(role))

                @JsonProperty("role")
                @ExcludeMissing
                fun role(role: JsonField<Role>) = apply { this.role = role }

                fun content(content: String) = content(JsonField.of(content))

                @JsonProperty("content")
                @ExcludeMissing
                fun content(content: JsonField<String>) = apply { this.content = content }

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

                fun build(): Fallback =
                    Fallback(
                        role,
                        content,
                        additionalProperties.toImmutable(),
                    )
            }

            class Role
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Role && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    @JvmField val MODEL = Role(JsonField.of("model"))

                    @JvmStatic fun of(value: String) = Role(JsonField.of(value))
                }

                enum class Known {
                    MODEL,
                }

                enum class Value {
                    MODEL,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        MODEL -> Value.MODEL
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        MODEL -> Known.MODEL
                        else -> throw BraintrustInvalidDataException("Unknown Role: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Fallback && this.role == other.role && this.content == other.content && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(role, content, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "Fallback{role=$role, content=$content, additionalProperties=$additionalProperties}"
        }
    }

    class Mode
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Mode && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val AUTO = Mode(JsonField.of("auto"))

            @JvmField val PARALLEL = Mode(JsonField.of("parallel"))

            @JvmStatic fun of(value: String) = Mode(JsonField.of(value))
        }

        enum class Known {
            AUTO,
            PARALLEL,
        }

        enum class Value {
            AUTO,
            PARALLEL,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                AUTO -> Value.AUTO
                PARALLEL -> Value.PARALLEL
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                AUTO -> Known.AUTO
                PARALLEL -> Known.PARALLEL
                else -> throw BraintrustInvalidDataException("Unknown Mode: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    @JsonDeserialize(using = Parent.Deserializer::class)
    @JsonSerialize(using = Parent.Serializer::class)
    class Parent
    private constructor(
        private val spanParentStruct: SpanParentStruct? = null,
        private val string: String? = null,
        private val _json: JsonValue? = null,
    ) {

        private var validated: Boolean = false

        /** Span parent properties */
        fun spanParentStruct(): Optional<SpanParentStruct> = Optional.ofNullable(spanParentStruct)
        /** The parent's span identifier, created by calling `.export()` on a span */
        fun string(): Optional<String> = Optional.ofNullable(string)

        fun isSpanParentStruct(): Boolean = spanParentStruct != null

        fun isString(): Boolean = string != null

        fun asSpanParentStruct(): SpanParentStruct = spanParentStruct.getOrThrow("spanParentStruct")

        fun asString(): String = string.getOrThrow("string")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                spanParentStruct != null -> visitor.visitSpanParentStruct(spanParentStruct)
                string != null -> visitor.visitString(string)
                else -> visitor.unknown(_json)
            }
        }

        fun validate(): Parent = apply {
            if (!validated) {
                if (spanParentStruct == null && string == null) {
                    throw BraintrustInvalidDataException("Unknown Parent: $_json")
                }
                spanParentStruct?.validate()
                validated = true
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Parent && this.spanParentStruct == other.spanParentStruct && this.string == other.string /* spotless:on */
        }

        override fun hashCode(): Int {
            return /* spotless:off */ Objects.hash(spanParentStruct, string) /* spotless:on */
        }

        override fun toString(): String {
            return when {
                spanParentStruct != null -> "Parent{spanParentStruct=$spanParentStruct}"
                string != null -> "Parent{string=$string}"
                _json != null -> "Parent{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Parent")
            }
        }

        companion object {

            @JvmStatic
            fun ofSpanParentStruct(spanParentStruct: SpanParentStruct) =
                Parent(spanParentStruct = spanParentStruct)

            @JvmStatic fun ofString(string: String) = Parent(string = string)
        }

        interface Visitor<out T> {

            fun visitSpanParentStruct(spanParentStruct: SpanParentStruct): T

            fun visitString(string: String): T

            fun unknown(json: JsonValue?): T {
                throw BraintrustInvalidDataException("Unknown Parent: $json")
            }
        }

        class Deserializer : BaseDeserializer<Parent>(Parent::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Parent {
                val json = JsonValue.fromJsonNode(node)

                tryDeserialize(node, jacksonTypeRef<SpanParentStruct>()) { it.validate() }
                    ?.let {
                        return Parent(spanParentStruct = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<String>())?.let {
                    return Parent(string = it, _json = json)
                }

                return Parent(_json = json)
            }
        }

        class Serializer : BaseSerializer<Parent>(Parent::class) {

            override fun serialize(
                value: Parent,
                generator: JsonGenerator,
                provider: SerializerProvider
            ) {
                when {
                    value.spanParentStruct != null -> generator.writeObject(value.spanParentStruct)
                    value.string != null -> generator.writeObject(value.string)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Parent")
                }
            }
        }

        /** Span parent properties */
        @JsonDeserialize(builder = SpanParentStruct.Builder::class)
        @NoAutoDetect
        class SpanParentStruct
        private constructor(
            private val objectType: JsonField<ObjectType>,
            private val objectId: JsonField<String>,
            private val rowIds: JsonField<RowIds>,
            private val propagatedEvent: JsonField<PropagatedEvent>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            fun objectType(): ObjectType = objectType.getRequired("object_type")

            /** The id of the container object you are logging to */
            fun objectId(): String = objectId.getRequired("object_id")

            /** Identifiers for the row to to log a subspan under */
            fun rowIds(): Optional<RowIds> = Optional.ofNullable(rowIds.getNullable("row_ids"))

            /** Include these properties in every span created under this parent */
            fun propagatedEvent(): Optional<PropagatedEvent> =
                Optional.ofNullable(propagatedEvent.getNullable("propagated_event"))

            @JsonProperty("object_type") @ExcludeMissing fun _objectType() = objectType

            /** The id of the container object you are logging to */
            @JsonProperty("object_id") @ExcludeMissing fun _objectId() = objectId

            /** Identifiers for the row to to log a subspan under */
            @JsonProperty("row_ids") @ExcludeMissing fun _rowIds() = rowIds

            /** Include these properties in every span created under this parent */
            @JsonProperty("propagated_event")
            @ExcludeMissing
            fun _propagatedEvent() = propagatedEvent

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): SpanParentStruct = apply {
                if (!validated) {
                    objectType()
                    objectId()
                    rowIds().map { it.validate() }
                    propagatedEvent().map { it.validate() }
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var objectType: JsonField<ObjectType> = JsonMissing.of()
                private var objectId: JsonField<String> = JsonMissing.of()
                private var rowIds: JsonField<RowIds> = JsonMissing.of()
                private var propagatedEvent: JsonField<PropagatedEvent> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(spanParentStruct: SpanParentStruct) = apply {
                    this.objectType = spanParentStruct.objectType
                    this.objectId = spanParentStruct.objectId
                    this.rowIds = spanParentStruct.rowIds
                    this.propagatedEvent = spanParentStruct.propagatedEvent
                    additionalProperties(spanParentStruct.additionalProperties)
                }

                fun objectType(objectType: ObjectType) = objectType(JsonField.of(objectType))

                @JsonProperty("object_type")
                @ExcludeMissing
                fun objectType(objectType: JsonField<ObjectType>) = apply {
                    this.objectType = objectType
                }

                /** The id of the container object you are logging to */
                fun objectId(objectId: String) = objectId(JsonField.of(objectId))

                /** The id of the container object you are logging to */
                @JsonProperty("object_id")
                @ExcludeMissing
                fun objectId(objectId: JsonField<String>) = apply { this.objectId = objectId }

                /** Identifiers for the row to to log a subspan under */
                fun rowIds(rowIds: RowIds) = rowIds(JsonField.of(rowIds))

                /** Identifiers for the row to to log a subspan under */
                @JsonProperty("row_ids")
                @ExcludeMissing
                fun rowIds(rowIds: JsonField<RowIds>) = apply { this.rowIds = rowIds }

                /** Include these properties in every span created under this parent */
                fun propagatedEvent(propagatedEvent: PropagatedEvent) =
                    propagatedEvent(JsonField.of(propagatedEvent))

                /** Include these properties in every span created under this parent */
                @JsonProperty("propagated_event")
                @ExcludeMissing
                fun propagatedEvent(propagatedEvent: JsonField<PropagatedEvent>) = apply {
                    this.propagatedEvent = propagatedEvent
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

                fun build(): SpanParentStruct =
                    SpanParentStruct(
                        objectType,
                        objectId,
                        rowIds,
                        propagatedEvent,
                        additionalProperties.toImmutable(),
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

                    return /* spotless:off */ other is ObjectType && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    @JvmField val PROJECT_LOGS = ObjectType(JsonField.of("project_logs"))

                    @JvmField val EXPERIMENT = ObjectType(JsonField.of("experiment"))

                    @JvmStatic fun of(value: String) = ObjectType(JsonField.of(value))
                }

                enum class Known {
                    PROJECT_LOGS,
                    EXPERIMENT,
                }

                enum class Value {
                    PROJECT_LOGS,
                    EXPERIMENT,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        PROJECT_LOGS -> Value.PROJECT_LOGS
                        EXPERIMENT -> Value.EXPERIMENT
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        PROJECT_LOGS -> Known.PROJECT_LOGS
                        EXPERIMENT -> Known.EXPERIMENT
                        else -> throw BraintrustInvalidDataException("Unknown ObjectType: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            /** Include these properties in every span created under this parent */
            @JsonDeserialize(builder = PropagatedEvent.Builder::class)
            @NoAutoDetect
            class PropagatedEvent
            private constructor(
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): PropagatedEvent = apply {
                    if (!validated) {
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(propagatedEvent: PropagatedEvent) = apply {
                        additionalProperties(propagatedEvent.additionalProperties)
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

                    fun build(): PropagatedEvent =
                        PropagatedEvent(additionalProperties.toImmutable())
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is PropagatedEvent && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

                override fun toString() =
                    "PropagatedEvent{additionalProperties=$additionalProperties}"
            }

            /** Identifiers for the row to to log a subspan under */
            @JsonDeserialize(builder = RowIds.Builder::class)
            @NoAutoDetect
            class RowIds
            private constructor(
                private val id: JsonField<String>,
                private val spanId: JsonField<String>,
                private val rootSpanId: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                /** The id of the row */
                fun id(): String = id.getRequired("id")

                /** The span_id of the row */
                fun spanId(): String = spanId.getRequired("span_id")

                /** The root_span_id of the row */
                fun rootSpanId(): String = rootSpanId.getRequired("root_span_id")

                /** The id of the row */
                @JsonProperty("id") @ExcludeMissing fun _id() = id

                /** The span_id of the row */
                @JsonProperty("span_id") @ExcludeMissing fun _spanId() = spanId

                /** The root_span_id of the row */
                @JsonProperty("root_span_id") @ExcludeMissing fun _rootSpanId() = rootSpanId

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): RowIds = apply {
                    if (!validated) {
                        id()
                        spanId()
                        rootSpanId()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var id: JsonField<String> = JsonMissing.of()
                    private var spanId: JsonField<String> = JsonMissing.of()
                    private var rootSpanId: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(rowIds: RowIds) = apply {
                        this.id = rowIds.id
                        this.spanId = rowIds.spanId
                        this.rootSpanId = rowIds.rootSpanId
                        additionalProperties(rowIds.additionalProperties)
                    }

                    /** The id of the row */
                    fun id(id: String) = id(JsonField.of(id))

                    /** The id of the row */
                    @JsonProperty("id")
                    @ExcludeMissing
                    fun id(id: JsonField<String>) = apply { this.id = id }

                    /** The span_id of the row */
                    fun spanId(spanId: String) = spanId(JsonField.of(spanId))

                    /** The span_id of the row */
                    @JsonProperty("span_id")
                    @ExcludeMissing
                    fun spanId(spanId: JsonField<String>) = apply { this.spanId = spanId }

                    /** The root_span_id of the row */
                    fun rootSpanId(rootSpanId: String) = rootSpanId(JsonField.of(rootSpanId))

                    /** The root_span_id of the row */
                    @JsonProperty("root_span_id")
                    @ExcludeMissing
                    fun rootSpanId(rootSpanId: JsonField<String>) = apply {
                        this.rootSpanId = rootSpanId
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

                    fun build(): RowIds =
                        RowIds(
                            id,
                            spanId,
                            rootSpanId,
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is RowIds && this.id == other.id && this.spanId == other.spanId && this.rootSpanId == other.rootSpanId && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(id, spanId, rootSpanId, additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

                override fun toString() =
                    "RowIds{id=$id, spanId=$spanId, rootSpanId=$rootSpanId, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is SpanParentStruct && this.objectType == other.objectType && this.objectId == other.objectId && this.rowIds == other.rowIds && this.propagatedEvent == other.propagatedEvent && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(objectType, objectId, rowIds, propagatedEvent, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "SpanParentStruct{objectType=$objectType, objectId=$objectId, rowIds=$rowIds, propagatedEvent=$propagatedEvent, additionalProperties=$additionalProperties}"
        }
    }
}
