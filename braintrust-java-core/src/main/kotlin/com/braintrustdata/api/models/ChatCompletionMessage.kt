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

@JsonDeserialize(using = ChatCompletionMessage.Deserializer::class)
@JsonSerialize(using = ChatCompletionMessage.Serializer::class)
class ChatCompletionMessage
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

    fun validate(): ChatCompletionMessage = apply {
        if (!validated) {
            if (
                system == null &&
                    user == null &&
                    assistant == null &&
                    tool == null &&
                    function == null &&
                    fallback == null
            ) {
                throw BraintrustInvalidDataException("Unknown ChatCompletionMessage: $_json")
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

        return /* spotless:off */ other is ChatCompletionMessage && this.system == other.system && this.user == other.user && this.assistant == other.assistant && this.tool == other.tool && this.function == other.function && this.fallback == other.fallback /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(system, user, assistant, tool, function, fallback) /* spotless:on */
    }

    override fun toString(): String {
        return when {
            system != null -> "ChatCompletionMessage{system=$system}"
            user != null -> "ChatCompletionMessage{user=$user}"
            assistant != null -> "ChatCompletionMessage{assistant=$assistant}"
            tool != null -> "ChatCompletionMessage{tool=$tool}"
            function != null -> "ChatCompletionMessage{function=$function}"
            fallback != null -> "ChatCompletionMessage{fallback=$fallback}"
            _json != null -> "ChatCompletionMessage{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid ChatCompletionMessage")
        }
    }

    companion object {

        @JvmStatic fun ofSystem(system: System) = ChatCompletionMessage(system = system)

        @JvmStatic fun ofUser(user: User) = ChatCompletionMessage(user = user)

        @JvmStatic
        fun ofAssistant(assistant: Assistant) = ChatCompletionMessage(assistant = assistant)

        @JvmStatic fun ofTool(tool: Tool) = ChatCompletionMessage(tool = tool)

        @JvmStatic fun ofFunction(function: Function) = ChatCompletionMessage(function = function)

        @JvmStatic fun ofFallback(fallback: Fallback) = ChatCompletionMessage(fallback = fallback)
    }

    interface Visitor<out T> {

        fun visitSystem(system: System): T

        fun visitUser(user: User): T

        fun visitAssistant(assistant: Assistant): T

        fun visitTool(tool: Tool): T

        fun visitFunction(function: Function): T

        fun visitFallback(fallback: Fallback): T

        fun unknown(json: JsonValue?): T {
            throw BraintrustInvalidDataException("Unknown ChatCompletionMessage: $json")
        }
    }

    class Deserializer : BaseDeserializer<ChatCompletionMessage>(ChatCompletionMessage::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): ChatCompletionMessage {
            val json = JsonValue.fromJsonNode(node)

            tryDeserialize(node, jacksonTypeRef<System>()) { it.validate() }
                ?.let {
                    return ChatCompletionMessage(system = it, _json = json)
                }
            tryDeserialize(node, jacksonTypeRef<User>()) { it.validate() }
                ?.let {
                    return ChatCompletionMessage(user = it, _json = json)
                }
            tryDeserialize(node, jacksonTypeRef<Assistant>()) { it.validate() }
                ?.let {
                    return ChatCompletionMessage(assistant = it, _json = json)
                }
            tryDeserialize(node, jacksonTypeRef<Tool>()) { it.validate() }
                ?.let {
                    return ChatCompletionMessage(tool = it, _json = json)
                }
            tryDeserialize(node, jacksonTypeRef<Function>()) { it.validate() }
                ?.let {
                    return ChatCompletionMessage(function = it, _json = json)
                }
            tryDeserialize(node, jacksonTypeRef<Fallback>()) { it.validate() }
                ?.let {
                    return ChatCompletionMessage(fallback = it, _json = json)
                }

            return ChatCompletionMessage(_json = json)
        }
    }

    class Serializer : BaseSerializer<ChatCompletionMessage>(ChatCompletionMessage::class) {

        override fun serialize(
            value: ChatCompletionMessage,
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
                else -> throw IllegalStateException("Invalid ChatCompletionMessage")
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

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
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
        private val content: JsonField<ChatCompletionContent>,
        private val role: JsonField<Role>,
        private val name: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun content(): Optional<ChatCompletionContent> =
            Optional.ofNullable(content.getNullable("content"))

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

            private var content: JsonField<ChatCompletionContent> = JsonMissing.of()
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

            fun content(content: ChatCompletionContent) = content(JsonField.of(content))

            @JsonProperty("content")
            @ExcludeMissing
            fun content(content: JsonField<ChatCompletionContent>) = apply {
                this.content = content
            }

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

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
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
            private var toolCalls: JsonField<List<ChatCompletionMessageToolCall>> = JsonMissing.of()
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

            fun functionCall(functionCall: FunctionCall) = functionCall(JsonField.of(functionCall))

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

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
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
                fun arguments(arguments: JsonField<String>) = apply { this.arguments = arguments }

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
            fun toolCallId(toolCallId: JsonField<String>) = apply { this.toolCallId = toolCallId }

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

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
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

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
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
