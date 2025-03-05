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
import com.braintrustdata.api.core.Params
import com.braintrustdata.api.core.checkKnown
import com.braintrustdata.api.core.checkRequired
import com.braintrustdata.api.core.getOrThrow
import com.braintrustdata.api.core.http.Headers
import com.braintrustdata.api.core.http.QueryParams
import com.braintrustdata.api.core.immutableEmptyMap
import com.braintrustdata.api.core.toImmutable
import com.braintrustdata.api.errors.BraintrustInvalidDataException
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
import java.util.Objects
import java.util.Optional

/** Invoke a function. */
class FunctionInvokeParams
private constructor(
    private val functionId: String,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Function id */
    fun functionId(): String = functionId

    /** Argument to the function, which can be any JSON serializable value */
    fun _input(): JsonValue = body._input()

    /** If the function is an LLM, additional messages to pass along to it */
    fun messages(): Optional<List<Message>> = body.messages()

    /** The mode format of the returned value (defaults to 'auto') */
    fun mode(): Optional<Mode> = body.mode()

    /** Options for tracing the function call */
    fun parent(): Optional<Parent> = body.parent()

    /**
     * Whether to stream the response. If true, results will be returned in the Braintrust SSE
     * format.
     */
    fun stream(): Optional<Boolean> = body.stream()

    /** The version of the function */
    fun version(): Optional<String> = body.version()

    /** If the function is an LLM, additional messages to pass along to it */
    fun _messages(): JsonField<List<Message>> = body._messages()

    /** The mode format of the returned value (defaults to 'auto') */
    fun _mode(): JsonField<Mode> = body._mode()

    /** Options for tracing the function call */
    fun _parent(): JsonField<Parent> = body._parent()

    /**
     * Whether to stream the response. If true, results will be returned in the Braintrust SSE
     * format.
     */
    fun _stream(): JsonField<Boolean> = body._stream()

    /** The version of the function */
    fun _version(): JsonField<String> = body._version()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> functionId
            else -> ""
        }
    }

    /** The request to invoke a function */
    @NoAutoDetect
    class Body
    @JsonCreator
    private constructor(
        @JsonProperty("input") @ExcludeMissing private val input: JsonValue = JsonMissing.of(),
        @JsonProperty("messages")
        @ExcludeMissing
        private val messages: JsonField<List<Message>> = JsonMissing.of(),
        @JsonProperty("mode") @ExcludeMissing private val mode: JsonField<Mode> = JsonMissing.of(),
        @JsonProperty("parent")
        @ExcludeMissing
        private val parent: JsonField<Parent> = JsonMissing.of(),
        @JsonProperty("stream")
        @ExcludeMissing
        private val stream: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("version")
        @ExcludeMissing
        private val version: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Argument to the function, which can be any JSON serializable value */
        @JsonProperty("input") @ExcludeMissing fun _input(): JsonValue = input

        /** If the function is an LLM, additional messages to pass along to it */
        fun messages(): Optional<List<Message>> =
            Optional.ofNullable(messages.getNullable("messages"))

        /** The mode format of the returned value (defaults to 'auto') */
        fun mode(): Optional<Mode> = Optional.ofNullable(mode.getNullable("mode"))

        /** Options for tracing the function call */
        fun parent(): Optional<Parent> = Optional.ofNullable(parent.getNullable("parent"))

        /**
         * Whether to stream the response. If true, results will be returned in the Braintrust SSE
         * format.
         */
        fun stream(): Optional<Boolean> = Optional.ofNullable(stream.getNullable("stream"))

        /** The version of the function */
        fun version(): Optional<String> = Optional.ofNullable(version.getNullable("version"))

        /** If the function is an LLM, additional messages to pass along to it */
        @JsonProperty("messages")
        @ExcludeMissing
        fun _messages(): JsonField<List<Message>> = messages

        /** The mode format of the returned value (defaults to 'auto') */
        @JsonProperty("mode") @ExcludeMissing fun _mode(): JsonField<Mode> = mode

        /** Options for tracing the function call */
        @JsonProperty("parent") @ExcludeMissing fun _parent(): JsonField<Parent> = parent

        /**
         * Whether to stream the response. If true, results will be returned in the Braintrust SSE
         * format.
         */
        @JsonProperty("stream") @ExcludeMissing fun _stream(): JsonField<Boolean> = stream

        /** The version of the function */
        @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<String> = version

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            messages().ifPresent { it.forEach { it.validate() } }
            mode()
            parent().ifPresent { it.validate() }
            stream()
            version()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var input: JsonValue = JsonMissing.of()
            private var messages: JsonField<MutableList<Message>>? = null
            private var mode: JsonField<Mode> = JsonMissing.of()
            private var parent: JsonField<Parent> = JsonMissing.of()
            private var stream: JsonField<Boolean> = JsonMissing.of()
            private var version: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                input = body.input
                messages = body.messages.map { it.toMutableList() }
                mode = body.mode
                parent = body.parent
                stream = body.stream
                version = body.version
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Argument to the function, which can be any JSON serializable value */
            fun input(input: JsonValue) = apply { this.input = input }

            /** If the function is an LLM, additional messages to pass along to it */
            fun messages(messages: List<Message>) = messages(JsonField.of(messages))

            /** If the function is an LLM, additional messages to pass along to it */
            fun messages(messages: JsonField<List<Message>>) = apply {
                this.messages = messages.map { it.toMutableList() }
            }

            /** If the function is an LLM, additional messages to pass along to it */
            fun addMessage(message: Message) = apply {
                messages =
                    (messages ?: JsonField.of(mutableListOf())).also {
                        checkKnown("messages", it).add(message)
                    }
            }

            /** If the function is an LLM, additional messages to pass along to it */
            fun addMessage(system: Message.System) = addMessage(Message.ofSystem(system))

            /** If the function is an LLM, additional messages to pass along to it */
            fun addMessage(user: Message.User) = addMessage(Message.ofUser(user))

            /** If the function is an LLM, additional messages to pass along to it */
            fun addMessage(assistant: Message.Assistant) =
                addMessage(Message.ofAssistant(assistant))

            /** If the function is an LLM, additional messages to pass along to it */
            fun addMessage(tool: Message.Tool) = addMessage(Message.ofTool(tool))

            /** If the function is an LLM, additional messages to pass along to it */
            fun addMessage(function: Message.Function) = addMessage(Message.ofFunction(function))

            /** If the function is an LLM, additional messages to pass along to it */
            fun addMessage(fallback: Message.Fallback) = addMessage(Message.ofFallback(fallback))

            /** The mode format of the returned value (defaults to 'auto') */
            fun mode(mode: Mode?) = mode(JsonField.ofNullable(mode))

            /** The mode format of the returned value (defaults to 'auto') */
            fun mode(mode: Optional<Mode>) = mode(mode.orElse(null))

            /** The mode format of the returned value (defaults to 'auto') */
            fun mode(mode: JsonField<Mode>) = apply { this.mode = mode }

            /** Options for tracing the function call */
            fun parent(parent: Parent) = parent(JsonField.of(parent))

            /** Options for tracing the function call */
            fun parent(parent: JsonField<Parent>) = apply { this.parent = parent }

            /** Span parent properties */
            fun parent(spanParentStruct: Parent.SpanParentStruct) =
                parent(Parent.ofSpanParentStruct(spanParentStruct))

            /** The parent's span identifier, created by calling `.export()` on a span */
            fun parent(string: String) = parent(Parent.ofString(string))

            /**
             * Whether to stream the response. If true, results will be returned in the Braintrust
             * SSE format.
             */
            fun stream(stream: Boolean?) = stream(JsonField.ofNullable(stream))

            /**
             * Whether to stream the response. If true, results will be returned in the Braintrust
             * SSE format.
             */
            fun stream(stream: Boolean) = stream(stream as Boolean?)

            /**
             * Whether to stream the response. If true, results will be returned in the Braintrust
             * SSE format.
             */
            @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
            fun stream(stream: Optional<Boolean>) = stream(stream.orElse(null) as Boolean?)

            /**
             * Whether to stream the response. If true, results will be returned in the Braintrust
             * SSE format.
             */
            fun stream(stream: JsonField<Boolean>) = apply { this.stream = stream }

            /** The version of the function */
            fun version(version: String) = version(JsonField.of(version))

            /** The version of the function */
            fun version(version: JsonField<String>) = apply { this.version = version }

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
                    input,
                    (messages ?: JsonMissing.of()).map { it.toImmutable() },
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

            return /* spotless:off */ other is Body && input == other.input && messages == other.messages && mode == other.mode && parent == other.parent && stream == other.stream && version == other.version && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(input, messages, mode, parent, stream, version, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{input=$input, messages=$messages, mode=$mode, parent=$parent, stream=$stream, version=$version, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FunctionInvokeParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var functionId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(functionInvokeParams: FunctionInvokeParams) = apply {
            functionId = functionInvokeParams.functionId
            body = functionInvokeParams.body.toBuilder()
            additionalHeaders = functionInvokeParams.additionalHeaders.toBuilder()
            additionalQueryParams = functionInvokeParams.additionalQueryParams.toBuilder()
        }

        /** Function id */
        fun functionId(functionId: String) = apply { this.functionId = functionId }

        /** Argument to the function, which can be any JSON serializable value */
        fun input(input: JsonValue) = apply { body.input(input) }

        /** If the function is an LLM, additional messages to pass along to it */
        fun messages(messages: List<Message>) = apply { body.messages(messages) }

        /** If the function is an LLM, additional messages to pass along to it */
        fun messages(messages: JsonField<List<Message>>) = apply { body.messages(messages) }

        /** If the function is an LLM, additional messages to pass along to it */
        fun addMessage(message: Message) = apply { body.addMessage(message) }

        /** If the function is an LLM, additional messages to pass along to it */
        fun addMessage(system: Message.System) = apply { body.addMessage(system) }

        /** If the function is an LLM, additional messages to pass along to it */
        fun addMessage(user: Message.User) = apply { body.addMessage(user) }

        /** If the function is an LLM, additional messages to pass along to it */
        fun addMessage(assistant: Message.Assistant) = apply { body.addMessage(assistant) }

        /** If the function is an LLM, additional messages to pass along to it */
        fun addMessage(tool: Message.Tool) = apply { body.addMessage(tool) }

        /** If the function is an LLM, additional messages to pass along to it */
        fun addMessage(function: Message.Function) = apply { body.addMessage(function) }

        /** If the function is an LLM, additional messages to pass along to it */
        fun addMessage(fallback: Message.Fallback) = apply { body.addMessage(fallback) }

        /** The mode format of the returned value (defaults to 'auto') */
        fun mode(mode: Mode?) = apply { body.mode(mode) }

        /** The mode format of the returned value (defaults to 'auto') */
        fun mode(mode: Optional<Mode>) = mode(mode.orElse(null))

        /** The mode format of the returned value (defaults to 'auto') */
        fun mode(mode: JsonField<Mode>) = apply { body.mode(mode) }

        /** Options for tracing the function call */
        fun parent(parent: Parent) = apply { body.parent(parent) }

        /** Options for tracing the function call */
        fun parent(parent: JsonField<Parent>) = apply { body.parent(parent) }

        /** Span parent properties */
        fun parent(spanParentStruct: Parent.SpanParentStruct) = apply {
            body.parent(spanParentStruct)
        }

        /** The parent's span identifier, created by calling `.export()` on a span */
        fun parent(string: String) = apply { body.parent(string) }

        /**
         * Whether to stream the response. If true, results will be returned in the Braintrust SSE
         * format.
         */
        fun stream(stream: Boolean?) = apply { body.stream(stream) }

        /**
         * Whether to stream the response. If true, results will be returned in the Braintrust SSE
         * format.
         */
        fun stream(stream: Boolean) = stream(stream as Boolean?)

        /**
         * Whether to stream the response. If true, results will be returned in the Braintrust SSE
         * format.
         */
        @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
        fun stream(stream: Optional<Boolean>) = stream(stream.orElse(null) as Boolean?)

        /**
         * Whether to stream the response. If true, results will be returned in the Braintrust SSE
         * format.
         */
        fun stream(stream: JsonField<Boolean>) = apply { body.stream(stream) }

        /** The version of the function */
        fun version(version: String) = apply { body.version(version) }

        /** The version of the function */
        fun version(version: JsonField<String>) = apply { body.version(version) }

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

        fun build(): FunctionInvokeParams =
            FunctionInvokeParams(
                checkRequired("functionId", functionId),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
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

        private var validated: Boolean = false

        fun validate(): Message = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitSystem(system: System) {
                        system.validate()
                    }

                    override fun visitUser(user: User) {
                        user.validate()
                    }

                    override fun visitAssistant(assistant: Assistant) {
                        assistant.validate()
                    }

                    override fun visitTool(tool: Tool) {
                        tool.validate()
                    }

                    override fun visitFunction(function: Function) {
                        function.validate()
                    }

                    override fun visitFallback(fallback: Fallback) {
                        fallback.validate()
                    }
                }
            )
            validated = true
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Message && system == other.system && user == other.user && assistant == other.assistant && tool == other.tool && function == other.function && fallback == other.fallback /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(system, user, assistant, tool, function, fallback) /* spotless:on */

        override fun toString(): String =
            when {
                system != null -> "Message{system=$system}"
                user != null -> "Message{user=$user}"
                assistant != null -> "Message{assistant=$assistant}"
                tool != null -> "Message{tool=$tool}"
                function != null -> "Message{function=$function}"
                fallback != null -> "Message{fallback=$fallback}"
                _json != null -> "Message{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Message")
            }

        companion object {

            @JvmStatic fun ofSystem(system: System) = Message(system = system)

            @JvmStatic fun ofUser(user: User) = Message(user = user)

            @JvmStatic fun ofAssistant(assistant: Assistant) = Message(assistant = assistant)

            @JvmStatic fun ofTool(tool: Tool) = Message(tool = tool)

            @JvmStatic fun ofFunction(function: Function) = Message(function = function)

            @JvmStatic fun ofFallback(fallback: Fallback) = Message(fallback = fallback)
        }

        /**
         * An interface that defines how to map each variant of [Message] to a value of type [T].
         */
        interface Visitor<out T> {

            fun visitSystem(system: System): T

            fun visitUser(user: User): T

            fun visitAssistant(assistant: Assistant): T

            fun visitTool(tool: Tool): T

            fun visitFunction(function: Function): T

            fun visitFallback(fallback: Fallback): T

            /**
             * Maps an unknown variant of [Message] to a value of type [T].
             *
             * An instance of [Message] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws BraintrustInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw BraintrustInvalidDataException("Unknown Message: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Message>(Message::class) {

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

        internal class Serializer : BaseSerializer<Message>(Message::class) {

            override fun serialize(
                value: Message,
                generator: JsonGenerator,
                provider: SerializerProvider,
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

        @NoAutoDetect
        class System
        @JsonCreator
        private constructor(
            @JsonProperty("role")
            @ExcludeMissing
            private val role: JsonField<Role> = JsonMissing.of(),
            @JsonProperty("content")
            @ExcludeMissing
            private val content: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name")
            @ExcludeMissing
            private val name: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun role(): Role = role.getRequired("role")

            fun content(): Optional<String> = Optional.ofNullable(content.getNullable("content"))

            fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

            @JsonProperty("role") @ExcludeMissing fun _role(): JsonField<Role> = role

            @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<String> = content

            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): System = apply {
                if (validated) {
                    return@apply
                }

                role()
                content()
                name()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [System]. */
            class Builder internal constructor() {

                private var role: JsonField<Role>? = null
                private var content: JsonField<String> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(system: System) = apply {
                    role = system.role
                    content = system.content
                    name = system.name
                    additionalProperties = system.additionalProperties.toMutableMap()
                }

                fun role(role: Role) = role(JsonField.of(role))

                fun role(role: JsonField<Role>) = apply { this.role = role }

                fun content(content: String) = content(JsonField.of(content))

                fun content(content: JsonField<String>) = apply { this.content = content }

                fun name(name: String) = name(JsonField.of(name))

                fun name(name: JsonField<String>) = apply { this.name = name }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): System =
                    System(
                        checkRequired("role", role),
                        content,
                        name,
                        additionalProperties.toImmutable(),
                    )
            }

            class Role @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val SYSTEM = of("system")

                    @JvmStatic fun of(value: String) = Role(JsonField.of(value))
                }

                /** An enum containing [Role]'s known values. */
                enum class Known {
                    SYSTEM
                }

                /**
                 * An enum containing [Role]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Role] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    SYSTEM,
                    /**
                     * An enum member indicating that [Role] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        SYSTEM -> Value.SYSTEM
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws BraintrustInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        SYSTEM -> Known.SYSTEM
                        else -> throw BraintrustInvalidDataException("Unknown Role: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws BraintrustInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        BraintrustInvalidDataException("Value is not a String")
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Role && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is System && role == other.role && content == other.content && name == other.name && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(role, content, name, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "System{role=$role, content=$content, name=$name, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class User
        @JsonCreator
        private constructor(
            @JsonProperty("role")
            @ExcludeMissing
            private val role: JsonField<Role> = JsonMissing.of(),
            @JsonProperty("content")
            @ExcludeMissing
            private val content: JsonField<Content> = JsonMissing.of(),
            @JsonProperty("name")
            @ExcludeMissing
            private val name: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun role(): Role = role.getRequired("role")

            fun content(): Optional<Content> = Optional.ofNullable(content.getNullable("content"))

            fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

            @JsonProperty("role") @ExcludeMissing fun _role(): JsonField<Role> = role

            @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<Content> = content

            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): User = apply {
                if (validated) {
                    return@apply
                }

                role()
                content().ifPresent { it.validate() }
                name()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [User]. */
            class Builder internal constructor() {

                private var role: JsonField<Role>? = null
                private var content: JsonField<Content> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(user: User) = apply {
                    role = user.role
                    content = user.content
                    name = user.name
                    additionalProperties = user.additionalProperties.toMutableMap()
                }

                fun role(role: Role) = role(JsonField.of(role))

                fun role(role: JsonField<Role>) = apply { this.role = role }

                fun content(content: Content) = content(JsonField.of(content))

                fun content(content: JsonField<Content>) = apply { this.content = content }

                fun content(text: String) = content(Content.ofText(text))

                fun contentOfArray(array: List<Content.ChatCompletionContentPart>) =
                    content(Content.ofArray(array))

                fun name(name: String) = name(JsonField.of(name))

                fun name(name: JsonField<String>) = apply { this.name = name }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): User =
                    User(
                        checkRequired("role", role),
                        content,
                        name,
                        additionalProperties.toImmutable(),
                    )
            }

            class Role @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val USER = of("user")

                    @JvmStatic fun of(value: String) = Role(JsonField.of(value))
                }

                /** An enum containing [Role]'s known values. */
                enum class Known {
                    USER
                }

                /**
                 * An enum containing [Role]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Role] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    USER,
                    /**
                     * An enum member indicating that [Role] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        USER -> Value.USER
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws BraintrustInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        USER -> Known.USER
                        else -> throw BraintrustInvalidDataException("Unknown Role: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws BraintrustInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        BraintrustInvalidDataException("Value is not a String")
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Role && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            @JsonDeserialize(using = Content.Deserializer::class)
            @JsonSerialize(using = Content.Serializer::class)
            class Content
            private constructor(
                private val text: String? = null,
                private val array: List<ChatCompletionContentPart>? = null,
                private val _json: JsonValue? = null,
            ) {

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

                private var validated: Boolean = false

                fun validate(): Content = apply {
                    if (validated) {
                        return@apply
                    }

                    accept(
                        object : Visitor<Unit> {
                            override fun visitText(text: String) {}

                            override fun visitArray(array: List<ChatCompletionContentPart>) {
                                array.forEach { it.validate() }
                            }
                        }
                    )
                    validated = true
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Content && text == other.text && array == other.array /* spotless:on */
                }

                override fun hashCode(): Int = /* spotless:off */ Objects.hash(text, array) /* spotless:on */

                override fun toString(): String =
                    when {
                        text != null -> "Content{text=$text}"
                        array != null -> "Content{array=$array}"
                        _json != null -> "Content{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid Content")
                    }

                companion object {

                    @JvmStatic fun ofText(text: String) = Content(text = text)

                    @JvmStatic
                    fun ofArray(array: List<ChatCompletionContentPart>) = Content(array = array)
                }

                /**
                 * An interface that defines how to map each variant of [Content] to a value of type
                 * [T].
                 */
                interface Visitor<out T> {

                    fun visitText(text: String): T

                    fun visitArray(array: List<ChatCompletionContentPart>): T

                    /**
                     * Maps an unknown variant of [Content] to a value of type [T].
                     *
                     * An instance of [Content] can contain an unknown variant if it was
                     * deserialized from data that doesn't match any known variant. For example, if
                     * the SDK is on an older version than the API, then the API may respond with
                     * new variants that the SDK is unaware of.
                     *
                     * @throws BraintrustInvalidDataException in the default implementation.
                     */
                    fun unknown(json: JsonValue?): T {
                        throw BraintrustInvalidDataException("Unknown Content: $json")
                    }
                }

                internal class Deserializer : BaseDeserializer<Content>(Content::class) {

                    override fun ObjectCodec.deserialize(node: JsonNode): Content {
                        val json = JsonValue.fromJsonNode(node)

                        tryDeserialize(node, jacksonTypeRef<String>())?.let {
                            return Content(text = it, _json = json)
                        }
                        tryDeserialize(node, jacksonTypeRef<List<ChatCompletionContentPart>>()) {
                                it.forEach { it.validate() }
                            }
                            ?.let {
                                return Content(array = it, _json = json)
                            }

                        return Content(_json = json)
                    }
                }

                internal class Serializer : BaseSerializer<Content>(Content::class) {

                    override fun serialize(
                        value: Content,
                        generator: JsonGenerator,
                        provider: SerializerProvider,
                    ) {
                        when {
                            value.text != null -> generator.writeObject(value.text)
                            value.array != null -> generator.writeObject(value.array)
                            value._json != null -> generator.writeObject(value._json)
                            else -> throw IllegalStateException("Invalid Content")
                        }
                    }
                }

                @JsonDeserialize(using = ChatCompletionContentPart.Deserializer::class)
                @JsonSerialize(using = ChatCompletionContentPart.Serializer::class)
                class ChatCompletionContentPart
                private constructor(
                    private val text: ChatCompletionContentPartText? = null,
                    private val image: ChatCompletionContentPartImage? = null,
                    private val _json: JsonValue? = null,
                ) {

                    fun text(): Optional<ChatCompletionContentPartText> = Optional.ofNullable(text)

                    fun image(): Optional<ChatCompletionContentPartImage> =
                        Optional.ofNullable(image)

                    fun isText(): Boolean = text != null

                    fun isImage(): Boolean = image != null

                    fun asText(): ChatCompletionContentPartText = text.getOrThrow("text")

                    fun asImage(): ChatCompletionContentPartImage = image.getOrThrow("image")

                    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                    fun <T> accept(visitor: Visitor<T>): T {
                        return when {
                            text != null -> visitor.visitText(text)
                            image != null -> visitor.visitImage(image)
                            else -> visitor.unknown(_json)
                        }
                    }

                    private var validated: Boolean = false

                    fun validate(): ChatCompletionContentPart = apply {
                        if (validated) {
                            return@apply
                        }

                        accept(
                            object : Visitor<Unit> {
                                override fun visitText(text: ChatCompletionContentPartText) {
                                    text.validate()
                                }

                                override fun visitImage(image: ChatCompletionContentPartImage) {
                                    image.validate()
                                }
                            }
                        )
                        validated = true
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is ChatCompletionContentPart && text == other.text && image == other.image /* spotless:on */
                    }

                    override fun hashCode(): Int = /* spotless:off */ Objects.hash(text, image) /* spotless:on */

                    override fun toString(): String =
                        when {
                            text != null -> "ChatCompletionContentPart{text=$text}"
                            image != null -> "ChatCompletionContentPart{image=$image}"
                            _json != null -> "ChatCompletionContentPart{_unknown=$_json}"
                            else -> throw IllegalStateException("Invalid ChatCompletionContentPart")
                        }

                    companion object {

                        @JvmStatic
                        fun ofText(text: ChatCompletionContentPartText) =
                            ChatCompletionContentPart(text = text)

                        @JvmStatic
                        fun ofImage(image: ChatCompletionContentPartImage) =
                            ChatCompletionContentPart(image = image)
                    }

                    /**
                     * An interface that defines how to map each variant of
                     * [ChatCompletionContentPart] to a value of type [T].
                     */
                    interface Visitor<out T> {

                        fun visitText(text: ChatCompletionContentPartText): T

                        fun visitImage(image: ChatCompletionContentPartImage): T

                        /**
                         * Maps an unknown variant of [ChatCompletionContentPart] to a value of type
                         * [T].
                         *
                         * An instance of [ChatCompletionContentPart] can contain an unknown variant
                         * if it was deserialized from data that doesn't match any known variant.
                         * For example, if the SDK is on an older version than the API, then the API
                         * may respond with new variants that the SDK is unaware of.
                         *
                         * @throws BraintrustInvalidDataException in the default implementation.
                         */
                        fun unknown(json: JsonValue?): T {
                            throw BraintrustInvalidDataException(
                                "Unknown ChatCompletionContentPart: $json"
                            )
                        }
                    }

                    internal class Deserializer :
                        BaseDeserializer<ChatCompletionContentPart>(
                            ChatCompletionContentPart::class
                        ) {

                        override fun ObjectCodec.deserialize(
                            node: JsonNode
                        ): ChatCompletionContentPart {
                            val json = JsonValue.fromJsonNode(node)

                            tryDeserialize(node, jacksonTypeRef<ChatCompletionContentPartText>()) {
                                    it.validate()
                                }
                                ?.let {
                                    return ChatCompletionContentPart(text = it, _json = json)
                                }
                            tryDeserialize(node, jacksonTypeRef<ChatCompletionContentPartImage>()) {
                                    it.validate()
                                }
                                ?.let {
                                    return ChatCompletionContentPart(image = it, _json = json)
                                }

                            return ChatCompletionContentPart(_json = json)
                        }
                    }

                    internal class Serializer :
                        BaseSerializer<ChatCompletionContentPart>(
                            ChatCompletionContentPart::class
                        ) {

                        override fun serialize(
                            value: ChatCompletionContentPart,
                            generator: JsonGenerator,
                            provider: SerializerProvider,
                        ) {
                            when {
                                value.text != null -> generator.writeObject(value.text)
                                value.image != null -> generator.writeObject(value.image)
                                value._json != null -> generator.writeObject(value._json)
                                else ->
                                    throw IllegalStateException("Invalid ChatCompletionContentPart")
                            }
                        }
                    }
                }
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is User && role == other.role && content == other.content && name == other.name && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(role, content, name, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "User{role=$role, content=$content, name=$name, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class Assistant
        @JsonCreator
        private constructor(
            @JsonProperty("role")
            @ExcludeMissing
            private val role: JsonField<Role> = JsonMissing.of(),
            @JsonProperty("content")
            @ExcludeMissing
            private val content: JsonField<String> = JsonMissing.of(),
            @JsonProperty("function_call")
            @ExcludeMissing
            private val functionCall: JsonField<FunctionCall> = JsonMissing.of(),
            @JsonProperty("name")
            @ExcludeMissing
            private val name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tool_calls")
            @ExcludeMissing
            private val toolCalls: JsonField<List<ChatCompletionMessageToolCall>> =
                JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun role(): Role = role.getRequired("role")

            fun content(): Optional<String> = Optional.ofNullable(content.getNullable("content"))

            fun functionCall(): Optional<FunctionCall> =
                Optional.ofNullable(functionCall.getNullable("function_call"))

            fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

            fun toolCalls(): Optional<List<ChatCompletionMessageToolCall>> =
                Optional.ofNullable(toolCalls.getNullable("tool_calls"))

            @JsonProperty("role") @ExcludeMissing fun _role(): JsonField<Role> = role

            @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<String> = content

            @JsonProperty("function_call")
            @ExcludeMissing
            fun _functionCall(): JsonField<FunctionCall> = functionCall

            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            @JsonProperty("tool_calls")
            @ExcludeMissing
            fun _toolCalls(): JsonField<List<ChatCompletionMessageToolCall>> = toolCalls

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Assistant = apply {
                if (validated) {
                    return@apply
                }

                role()
                content()
                functionCall().ifPresent { it.validate() }
                name()
                toolCalls().ifPresent { it.forEach { it.validate() } }
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Assistant]. */
            class Builder internal constructor() {

                private var role: JsonField<Role>? = null
                private var content: JsonField<String> = JsonMissing.of()
                private var functionCall: JsonField<FunctionCall> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var toolCalls: JsonField<MutableList<ChatCompletionMessageToolCall>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(assistant: Assistant) = apply {
                    role = assistant.role
                    content = assistant.content
                    functionCall = assistant.functionCall
                    name = assistant.name
                    toolCalls = assistant.toolCalls.map { it.toMutableList() }
                    additionalProperties = assistant.additionalProperties.toMutableMap()
                }

                fun role(role: Role) = role(JsonField.of(role))

                fun role(role: JsonField<Role>) = apply { this.role = role }

                fun content(content: String?) = content(JsonField.ofNullable(content))

                fun content(content: Optional<String>) = content(content.orElse(null))

                fun content(content: JsonField<String>) = apply { this.content = content }

                fun functionCall(functionCall: FunctionCall?) =
                    functionCall(JsonField.ofNullable(functionCall))

                fun functionCall(functionCall: Optional<FunctionCall>) =
                    functionCall(functionCall.orElse(null))

                fun functionCall(functionCall: JsonField<FunctionCall>) = apply {
                    this.functionCall = functionCall
                }

                fun name(name: String?) = name(JsonField.ofNullable(name))

                fun name(name: Optional<String>) = name(name.orElse(null))

                fun name(name: JsonField<String>) = apply { this.name = name }

                fun toolCalls(toolCalls: List<ChatCompletionMessageToolCall>?) =
                    toolCalls(JsonField.ofNullable(toolCalls))

                fun toolCalls(toolCalls: Optional<List<ChatCompletionMessageToolCall>>) =
                    toolCalls(toolCalls.orElse(null))

                fun toolCalls(toolCalls: JsonField<List<ChatCompletionMessageToolCall>>) = apply {
                    this.toolCalls = toolCalls.map { it.toMutableList() }
                }

                fun addToolCall(toolCall: ChatCompletionMessageToolCall) = apply {
                    toolCalls =
                        (toolCalls ?: JsonField.of(mutableListOf())).also {
                            checkKnown("toolCalls", it).add(toolCall)
                        }
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): Assistant =
                    Assistant(
                        checkRequired("role", role),
                        content,
                        functionCall,
                        name,
                        (toolCalls ?: JsonMissing.of()).map { it.toImmutable() },
                        additionalProperties.toImmutable(),
                    )
            }

            class Role @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val ASSISTANT = of("assistant")

                    @JvmStatic fun of(value: String) = Role(JsonField.of(value))
                }

                /** An enum containing [Role]'s known values. */
                enum class Known {
                    ASSISTANT
                }

                /**
                 * An enum containing [Role]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Role] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    ASSISTANT,
                    /**
                     * An enum member indicating that [Role] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        ASSISTANT -> Value.ASSISTANT
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws BraintrustInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        ASSISTANT -> Known.ASSISTANT
                        else -> throw BraintrustInvalidDataException("Unknown Role: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws BraintrustInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        BraintrustInvalidDataException("Value is not a String")
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Role && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            @NoAutoDetect
            class FunctionCall
            @JsonCreator
            private constructor(
                @JsonProperty("arguments")
                @ExcludeMissing
                private val arguments: JsonField<String> = JsonMissing.of(),
                @JsonProperty("name")
                @ExcludeMissing
                private val name: JsonField<String> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun arguments(): String = arguments.getRequired("arguments")

                fun name(): String = name.getRequired("name")

                @JsonProperty("arguments")
                @ExcludeMissing
                fun _arguments(): JsonField<String> = arguments

                @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): FunctionCall = apply {
                    if (validated) {
                        return@apply
                    }

                    arguments()
                    name()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [FunctionCall]. */
                class Builder internal constructor() {

                    private var arguments: JsonField<String>? = null
                    private var name: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(functionCall: FunctionCall) = apply {
                        arguments = functionCall.arguments
                        name = functionCall.name
                        additionalProperties = functionCall.additionalProperties.toMutableMap()
                    }

                    fun arguments(arguments: String) = arguments(JsonField.of(arguments))

                    fun arguments(arguments: JsonField<String>) = apply {
                        this.arguments = arguments
                    }

                    fun name(name: String) = name(JsonField.of(name))

                    fun name(name: JsonField<String>) = apply { this.name = name }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    fun build(): FunctionCall =
                        FunctionCall(
                            checkRequired("arguments", arguments),
                            checkRequired("name", name),
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is FunctionCall && arguments == other.arguments && name == other.name && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(arguments, name, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "FunctionCall{arguments=$arguments, name=$name, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Assistant && role == other.role && content == other.content && functionCall == other.functionCall && name == other.name && toolCalls == other.toolCalls && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(role, content, functionCall, name, toolCalls, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Assistant{role=$role, content=$content, functionCall=$functionCall, name=$name, toolCalls=$toolCalls, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class Tool
        @JsonCreator
        private constructor(
            @JsonProperty("role")
            @ExcludeMissing
            private val role: JsonField<Role> = JsonMissing.of(),
            @JsonProperty("content")
            @ExcludeMissing
            private val content: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tool_call_id")
            @ExcludeMissing
            private val toolCallId: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun role(): Role = role.getRequired("role")

            fun content(): Optional<String> = Optional.ofNullable(content.getNullable("content"))

            fun toolCallId(): Optional<String> =
                Optional.ofNullable(toolCallId.getNullable("tool_call_id"))

            @JsonProperty("role") @ExcludeMissing fun _role(): JsonField<Role> = role

            @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<String> = content

            @JsonProperty("tool_call_id")
            @ExcludeMissing
            fun _toolCallId(): JsonField<String> = toolCallId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Tool = apply {
                if (validated) {
                    return@apply
                }

                role()
                content()
                toolCallId()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Tool]. */
            class Builder internal constructor() {

                private var role: JsonField<Role>? = null
                private var content: JsonField<String> = JsonMissing.of()
                private var toolCallId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(tool: Tool) = apply {
                    role = tool.role
                    content = tool.content
                    toolCallId = tool.toolCallId
                    additionalProperties = tool.additionalProperties.toMutableMap()
                }

                fun role(role: Role) = role(JsonField.of(role))

                fun role(role: JsonField<Role>) = apply { this.role = role }

                fun content(content: String) = content(JsonField.of(content))

                fun content(content: JsonField<String>) = apply { this.content = content }

                fun toolCallId(toolCallId: String) = toolCallId(JsonField.of(toolCallId))

                fun toolCallId(toolCallId: JsonField<String>) = apply {
                    this.toolCallId = toolCallId
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): Tool =
                    Tool(
                        checkRequired("role", role),
                        content,
                        toolCallId,
                        additionalProperties.toImmutable(),
                    )
            }

            class Role @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val TOOL = of("tool")

                    @JvmStatic fun of(value: String) = Role(JsonField.of(value))
                }

                /** An enum containing [Role]'s known values. */
                enum class Known {
                    TOOL
                }

                /**
                 * An enum containing [Role]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Role] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    TOOL,
                    /**
                     * An enum member indicating that [Role] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        TOOL -> Value.TOOL
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws BraintrustInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        TOOL -> Known.TOOL
                        else -> throw BraintrustInvalidDataException("Unknown Role: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws BraintrustInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        BraintrustInvalidDataException("Value is not a String")
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Role && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Tool && role == other.role && content == other.content && toolCallId == other.toolCallId && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(role, content, toolCallId, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Tool{role=$role, content=$content, toolCallId=$toolCallId, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class Function
        @JsonCreator
        private constructor(
            @JsonProperty("name")
            @ExcludeMissing
            private val name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("role")
            @ExcludeMissing
            private val role: JsonField<Role> = JsonMissing.of(),
            @JsonProperty("content")
            @ExcludeMissing
            private val content: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun name(): String = name.getRequired("name")

            fun role(): Role = role.getRequired("role")

            fun content(): Optional<String> = Optional.ofNullable(content.getNullable("content"))

            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            @JsonProperty("role") @ExcludeMissing fun _role(): JsonField<Role> = role

            @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<String> = content

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Function = apply {
                if (validated) {
                    return@apply
                }

                name()
                role()
                content()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Function]. */
            class Builder internal constructor() {

                private var name: JsonField<String>? = null
                private var role: JsonField<Role>? = null
                private var content: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(function: Function) = apply {
                    name = function.name
                    role = function.role
                    content = function.content
                    additionalProperties = function.additionalProperties.toMutableMap()
                }

                fun name(name: String) = name(JsonField.of(name))

                fun name(name: JsonField<String>) = apply { this.name = name }

                fun role(role: Role) = role(JsonField.of(role))

                fun role(role: JsonField<Role>) = apply { this.role = role }

                fun content(content: String) = content(JsonField.of(content))

                fun content(content: JsonField<String>) = apply { this.content = content }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): Function =
                    Function(
                        checkRequired("name", name),
                        checkRequired("role", role),
                        content,
                        additionalProperties.toImmutable(),
                    )
            }

            class Role @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val FUNCTION = of("function")

                    @JvmStatic fun of(value: String) = Role(JsonField.of(value))
                }

                /** An enum containing [Role]'s known values. */
                enum class Known {
                    FUNCTION
                }

                /**
                 * An enum containing [Role]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Role] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    FUNCTION,
                    /**
                     * An enum member indicating that [Role] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        FUNCTION -> Value.FUNCTION
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws BraintrustInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        FUNCTION -> Known.FUNCTION
                        else -> throw BraintrustInvalidDataException("Unknown Role: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws BraintrustInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        BraintrustInvalidDataException("Value is not a String")
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Role && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Function && name == other.name && role == other.role && content == other.content && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(name, role, content, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Function{name=$name, role=$role, content=$content, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class Fallback
        @JsonCreator
        private constructor(
            @JsonProperty("role")
            @ExcludeMissing
            private val role: JsonField<Role> = JsonMissing.of(),
            @JsonProperty("content")
            @ExcludeMissing
            private val content: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun role(): Role = role.getRequired("role")

            fun content(): Optional<String> = Optional.ofNullable(content.getNullable("content"))

            @JsonProperty("role") @ExcludeMissing fun _role(): JsonField<Role> = role

            @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<String> = content

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Fallback = apply {
                if (validated) {
                    return@apply
                }

                role()
                content()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Fallback]. */
            class Builder internal constructor() {

                private var role: JsonField<Role>? = null
                private var content: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(fallback: Fallback) = apply {
                    role = fallback.role
                    content = fallback.content
                    additionalProperties = fallback.additionalProperties.toMutableMap()
                }

                fun role(role: Role) = role(JsonField.of(role))

                fun role(role: JsonField<Role>) = apply { this.role = role }

                fun content(content: String?) = content(JsonField.ofNullable(content))

                fun content(content: Optional<String>) = content(content.orElse(null))

                fun content(content: JsonField<String>) = apply { this.content = content }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): Fallback =
                    Fallback(
                        checkRequired("role", role),
                        content,
                        additionalProperties.toImmutable(),
                    )
            }

            class Role @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val MODEL = of("model")

                    @JvmStatic fun of(value: String) = Role(JsonField.of(value))
                }

                /** An enum containing [Role]'s known values. */
                enum class Known {
                    MODEL
                }

                /**
                 * An enum containing [Role]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Role] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    MODEL,
                    /**
                     * An enum member indicating that [Role] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        MODEL -> Value.MODEL
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws BraintrustInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        MODEL -> Known.MODEL
                        else -> throw BraintrustInvalidDataException("Unknown Role: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws BraintrustInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        BraintrustInvalidDataException("Value is not a String")
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Role && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Fallback && role == other.role && content == other.content && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(role, content, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Fallback{role=$role, content=$content, additionalProperties=$additionalProperties}"
        }
    }

    /** The mode format of the returned value (defaults to 'auto') */
    class Mode @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val AUTO = of("auto")

            @JvmField val PARALLEL = of("parallel")

            @JvmStatic fun of(value: String) = Mode(JsonField.of(value))
        }

        /** An enum containing [Mode]'s known values. */
        enum class Known {
            AUTO,
            PARALLEL,
        }

        /**
         * An enum containing [Mode]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Mode] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            AUTO,
            PARALLEL,
            /** An enum member indicating that [Mode] was instantiated with an unknown value. */
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
                AUTO -> Value.AUTO
                PARALLEL -> Value.PARALLEL
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
                AUTO -> Known.AUTO
                PARALLEL -> Known.PARALLEL
                else -> throw BraintrustInvalidDataException("Unknown Mode: $value")
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

            return /* spotless:off */ other is Mode && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Options for tracing the function call */
    @JsonDeserialize(using = Parent.Deserializer::class)
    @JsonSerialize(using = Parent.Serializer::class)
    class Parent
    private constructor(
        private val spanParentStruct: SpanParentStruct? = null,
        private val string: String? = null,
        private val _json: JsonValue? = null,
    ) {

        /** Span parent properties */
        fun spanParentStruct(): Optional<SpanParentStruct> = Optional.ofNullable(spanParentStruct)

        /** The parent's span identifier, created by calling `.export()` on a span */
        fun string(): Optional<String> = Optional.ofNullable(string)

        fun isSpanParentStruct(): Boolean = spanParentStruct != null

        fun isString(): Boolean = string != null

        /** Span parent properties */
        fun asSpanParentStruct(): SpanParentStruct = spanParentStruct.getOrThrow("spanParentStruct")

        /** The parent's span identifier, created by calling `.export()` on a span */
        fun asString(): String = string.getOrThrow("string")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                spanParentStruct != null -> visitor.visitSpanParentStruct(spanParentStruct)
                string != null -> visitor.visitString(string)
                else -> visitor.unknown(_json)
            }
        }

        private var validated: Boolean = false

        fun validate(): Parent = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitSpanParentStruct(spanParentStruct: SpanParentStruct) {
                        spanParentStruct.validate()
                    }

                    override fun visitString(string: String) {}
                }
            )
            validated = true
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Parent && spanParentStruct == other.spanParentStruct && string == other.string /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(spanParentStruct, string) /* spotless:on */

        override fun toString(): String =
            when {
                spanParentStruct != null -> "Parent{spanParentStruct=$spanParentStruct}"
                string != null -> "Parent{string=$string}"
                _json != null -> "Parent{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Parent")
            }

        companion object {

            /** Span parent properties */
            @JvmStatic
            fun ofSpanParentStruct(spanParentStruct: SpanParentStruct) =
                Parent(spanParentStruct = spanParentStruct)

            /** The parent's span identifier, created by calling `.export()` on a span */
            @JvmStatic fun ofString(string: String) = Parent(string = string)
        }

        /** An interface that defines how to map each variant of [Parent] to a value of type [T]. */
        interface Visitor<out T> {

            /** Span parent properties */
            fun visitSpanParentStruct(spanParentStruct: SpanParentStruct): T

            /** The parent's span identifier, created by calling `.export()` on a span */
            fun visitString(string: String): T

            /**
             * Maps an unknown variant of [Parent] to a value of type [T].
             *
             * An instance of [Parent] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws BraintrustInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw BraintrustInvalidDataException("Unknown Parent: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Parent>(Parent::class) {

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

        internal class Serializer : BaseSerializer<Parent>(Parent::class) {

            override fun serialize(
                value: Parent,
                generator: JsonGenerator,
                provider: SerializerProvider,
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
        @NoAutoDetect
        class SpanParentStruct
        @JsonCreator
        private constructor(
            @JsonProperty("object_id")
            @ExcludeMissing
            private val objectId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("object_type")
            @ExcludeMissing
            private val objectType: JsonField<ObjectType> = JsonMissing.of(),
            @JsonProperty("propagated_event")
            @ExcludeMissing
            private val propagatedEvent: JsonField<PropagatedEvent> = JsonMissing.of(),
            @JsonProperty("row_ids")
            @ExcludeMissing
            private val rowIds: JsonField<RowIds> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The id of the container object you are logging to */
            fun objectId(): String = objectId.getRequired("object_id")

            fun objectType(): ObjectType = objectType.getRequired("object_type")

            /** Include these properties in every span created under this parent */
            fun propagatedEvent(): Optional<PropagatedEvent> =
                Optional.ofNullable(propagatedEvent.getNullable("propagated_event"))

            /** Identifiers for the row to to log a subspan under */
            fun rowIds(): Optional<RowIds> = Optional.ofNullable(rowIds.getNullable("row_ids"))

            /** The id of the container object you are logging to */
            @JsonProperty("object_id") @ExcludeMissing fun _objectId(): JsonField<String> = objectId

            @JsonProperty("object_type")
            @ExcludeMissing
            fun _objectType(): JsonField<ObjectType> = objectType

            /** Include these properties in every span created under this parent */
            @JsonProperty("propagated_event")
            @ExcludeMissing
            fun _propagatedEvent(): JsonField<PropagatedEvent> = propagatedEvent

            /** Identifiers for the row to to log a subspan under */
            @JsonProperty("row_ids") @ExcludeMissing fun _rowIds(): JsonField<RowIds> = rowIds

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): SpanParentStruct = apply {
                if (validated) {
                    return@apply
                }

                objectId()
                objectType()
                propagatedEvent().ifPresent { it.validate() }
                rowIds().ifPresent { it.validate() }
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [SpanParentStruct]. */
            class Builder internal constructor() {

                private var objectId: JsonField<String>? = null
                private var objectType: JsonField<ObjectType>? = null
                private var propagatedEvent: JsonField<PropagatedEvent> = JsonMissing.of()
                private var rowIds: JsonField<RowIds> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(spanParentStruct: SpanParentStruct) = apply {
                    objectId = spanParentStruct.objectId
                    objectType = spanParentStruct.objectType
                    propagatedEvent = spanParentStruct.propagatedEvent
                    rowIds = spanParentStruct.rowIds
                    additionalProperties = spanParentStruct.additionalProperties.toMutableMap()
                }

                /** The id of the container object you are logging to */
                fun objectId(objectId: String) = objectId(JsonField.of(objectId))

                /** The id of the container object you are logging to */
                fun objectId(objectId: JsonField<String>) = apply { this.objectId = objectId }

                fun objectType(objectType: ObjectType) = objectType(JsonField.of(objectType))

                fun objectType(objectType: JsonField<ObjectType>) = apply {
                    this.objectType = objectType
                }

                /** Include these properties in every span created under this parent */
                fun propagatedEvent(propagatedEvent: PropagatedEvent?) =
                    propagatedEvent(JsonField.ofNullable(propagatedEvent))

                /** Include these properties in every span created under this parent */
                fun propagatedEvent(propagatedEvent: Optional<PropagatedEvent>) =
                    propagatedEvent(propagatedEvent.orElse(null))

                /** Include these properties in every span created under this parent */
                fun propagatedEvent(propagatedEvent: JsonField<PropagatedEvent>) = apply {
                    this.propagatedEvent = propagatedEvent
                }

                /** Identifiers for the row to to log a subspan under */
                fun rowIds(rowIds: RowIds?) = rowIds(JsonField.ofNullable(rowIds))

                /** Identifiers for the row to to log a subspan under */
                fun rowIds(rowIds: Optional<RowIds>) = rowIds(rowIds.orElse(null))

                /** Identifiers for the row to to log a subspan under */
                fun rowIds(rowIds: JsonField<RowIds>) = apply { this.rowIds = rowIds }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): SpanParentStruct =
                    SpanParentStruct(
                        checkRequired("objectId", objectId),
                        checkRequired("objectType", objectType),
                        propagatedEvent,
                        rowIds,
                        additionalProperties.toImmutable(),
                    )
            }

            class ObjectType
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val PROJECT_LOGS = of("project_logs")

                    @JvmField val EXPERIMENT = of("experiment")

                    @JvmStatic fun of(value: String) = ObjectType(JsonField.of(value))
                }

                /** An enum containing [ObjectType]'s known values. */
                enum class Known {
                    PROJECT_LOGS,
                    EXPERIMENT,
                }

                /**
                 * An enum containing [ObjectType]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [ObjectType] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    PROJECT_LOGS,
                    EXPERIMENT,
                    /**
                     * An enum member indicating that [ObjectType] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        PROJECT_LOGS -> Value.PROJECT_LOGS
                        EXPERIMENT -> Value.EXPERIMENT
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws BraintrustInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        PROJECT_LOGS -> Known.PROJECT_LOGS
                        EXPERIMENT -> Known.EXPERIMENT
                        else -> throw BraintrustInvalidDataException("Unknown ObjectType: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws BraintrustInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        BraintrustInvalidDataException("Value is not a String")
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is ObjectType && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** Include these properties in every span created under this parent */
            @NoAutoDetect
            class PropagatedEvent
            @JsonCreator
            private constructor(
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): PropagatedEvent = apply {
                    if (validated) {
                        return@apply
                    }

                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [PropagatedEvent]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(propagatedEvent: PropagatedEvent) = apply {
                        additionalProperties = propagatedEvent.additionalProperties.toMutableMap()
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    fun build(): PropagatedEvent =
                        PropagatedEvent(additionalProperties.toImmutable())
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is PropagatedEvent && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "PropagatedEvent{additionalProperties=$additionalProperties}"
            }

            /** Identifiers for the row to to log a subspan under */
            @NoAutoDetect
            class RowIds
            @JsonCreator
            private constructor(
                @JsonProperty("id")
                @ExcludeMissing
                private val id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("root_span_id")
                @ExcludeMissing
                private val rootSpanId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("span_id")
                @ExcludeMissing
                private val spanId: JsonField<String> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /** The id of the row */
                fun id(): String = id.getRequired("id")

                /** The root_span_id of the row */
                fun rootSpanId(): String = rootSpanId.getRequired("root_span_id")

                /** The span_id of the row */
                fun spanId(): String = spanId.getRequired("span_id")

                /** The id of the row */
                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                /** The root_span_id of the row */
                @JsonProperty("root_span_id")
                @ExcludeMissing
                fun _rootSpanId(): JsonField<String> = rootSpanId

                /** The span_id of the row */
                @JsonProperty("span_id") @ExcludeMissing fun _spanId(): JsonField<String> = spanId

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): RowIds = apply {
                    if (validated) {
                        return@apply
                    }

                    id()
                    rootSpanId()
                    spanId()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [RowIds]. */
                class Builder internal constructor() {

                    private var id: JsonField<String>? = null
                    private var rootSpanId: JsonField<String>? = null
                    private var spanId: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(rowIds: RowIds) = apply {
                        id = rowIds.id
                        rootSpanId = rowIds.rootSpanId
                        spanId = rowIds.spanId
                        additionalProperties = rowIds.additionalProperties.toMutableMap()
                    }

                    /** The id of the row */
                    fun id(id: String) = id(JsonField.of(id))

                    /** The id of the row */
                    fun id(id: JsonField<String>) = apply { this.id = id }

                    /** The root_span_id of the row */
                    fun rootSpanId(rootSpanId: String) = rootSpanId(JsonField.of(rootSpanId))

                    /** The root_span_id of the row */
                    fun rootSpanId(rootSpanId: JsonField<String>) = apply {
                        this.rootSpanId = rootSpanId
                    }

                    /** The span_id of the row */
                    fun spanId(spanId: String) = spanId(JsonField.of(spanId))

                    /** The span_id of the row */
                    fun spanId(spanId: JsonField<String>) = apply { this.spanId = spanId }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    fun build(): RowIds =
                        RowIds(
                            checkRequired("id", id),
                            checkRequired("rootSpanId", rootSpanId),
                            checkRequired("spanId", spanId),
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is RowIds && id == other.id && rootSpanId == other.rootSpanId && spanId == other.spanId && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(id, rootSpanId, spanId, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "RowIds{id=$id, rootSpanId=$rootSpanId, spanId=$spanId, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is SpanParentStruct && objectId == other.objectId && objectType == other.objectType && propagatedEvent == other.propagatedEvent && rowIds == other.rowIds && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(objectId, objectType, propagatedEvent, rowIds, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "SpanParentStruct{objectId=$objectId, objectType=$objectType, propagatedEvent=$propagatedEvent, rowIds=$rowIds, additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is FunctionInvokeParams && functionId == other.functionId && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(functionId, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "FunctionInvokeParams{functionId=$functionId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
