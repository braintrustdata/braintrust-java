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
import com.braintrustdata.api.core.toUnmodifiable
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

@JsonDeserialize(using = Messages.Deserializer::class)
@JsonSerialize(using = Messages.Serializer::class)
class Messages
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

    fun validate(): Messages = apply {
        if (!validated) {
            if (
                system == null &&
                    user == null &&
                    assistant == null &&
                    tool == null &&
                    function == null &&
                    fallback == null
            ) {
                throw BraintrustInvalidDataException("Unknown Messages: $_json")
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

        return other is Messages &&
            this.system == other.system &&
            this.user == other.user &&
            this.assistant == other.assistant &&
            this.tool == other.tool &&
            this.function == other.function &&
            this.fallback == other.fallback
    }

    override fun hashCode(): Int {
        return Objects.hash(
            system,
            user,
            assistant,
            tool,
            function,
            fallback,
        )
    }

    override fun toString(): String {
        return when {
            system != null -> "Messages{system=$system}"
            user != null -> "Messages{user=$user}"
            assistant != null -> "Messages{assistant=$assistant}"
            tool != null -> "Messages{tool=$tool}"
            function != null -> "Messages{function=$function}"
            fallback != null -> "Messages{fallback=$fallback}"
            _json != null -> "Messages{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid Messages")
        }
    }

    companion object {

        @JvmStatic fun ofSystem(system: System) = Messages(system = system)

        @JvmStatic fun ofUser(user: User) = Messages(user = user)

        @JvmStatic fun ofAssistant(assistant: Assistant) = Messages(assistant = assistant)

        @JvmStatic fun ofTool(tool: Tool) = Messages(tool = tool)

        @JvmStatic fun ofFunction(function: Function) = Messages(function = function)

        @JvmStatic fun ofFallback(fallback: Fallback) = Messages(fallback = fallback)
    }

    interface Visitor<out T> {

        fun visitSystem(system: System): T

        fun visitUser(user: User): T

        fun visitAssistant(assistant: Assistant): T

        fun visitTool(tool: Tool): T

        fun visitFunction(function: Function): T

        fun visitFallback(fallback: Fallback): T

        fun unknown(json: JsonValue?): T {
            throw BraintrustInvalidDataException("Unknown Messages: $json")
        }
    }

    class Deserializer : BaseDeserializer<Messages>(Messages::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): Messages {
            val json = JsonValue.fromJsonNode(node)
            tryDeserialize(node, jacksonTypeRef<System>()) { it.validate() }
                ?.let {
                    return Messages(system = it, _json = json)
                }
            tryDeserialize(node, jacksonTypeRef<User>()) { it.validate() }
                ?.let {
                    return Messages(user = it, _json = json)
                }
            tryDeserialize(node, jacksonTypeRef<Assistant>()) { it.validate() }
                ?.let {
                    return Messages(assistant = it, _json = json)
                }
            tryDeserialize(node, jacksonTypeRef<Tool>()) { it.validate() }
                ?.let {
                    return Messages(tool = it, _json = json)
                }
            tryDeserialize(node, jacksonTypeRef<Function>()) { it.validate() }
                ?.let {
                    return Messages(function = it, _json = json)
                }
            tryDeserialize(node, jacksonTypeRef<Fallback>()) { it.validate() }
                ?.let {
                    return Messages(fallback = it, _json = json)
                }

            return Messages(_json = json)
        }
    }

    class Serializer : BaseSerializer<Messages>(Messages::class) {

        override fun serialize(
            value: Messages,
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
                else -> throw IllegalStateException("Invalid Messages")
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

        private var hashCode: Int = 0

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is System &&
                this.content == other.content &&
                this.role == other.role &&
                this.name == other.name &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        content,
                        role,
                        name,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "System{content=$content, role=$role, name=$name, additionalProperties=$additionalProperties}"

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
                    additionalProperties.toUnmodifiable(),
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

                return other is Role && this.value == other.value
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

        private var hashCode: Int = 0

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is User &&
                this.content == other.content &&
                this.role == other.role &&
                this.name == other.name &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        content,
                        role,
                        name,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "User{content=$content, role=$role, name=$name, additionalProperties=$additionalProperties}"

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

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): User =
                User(
                    content,
                    role,
                    name,
                    additionalProperties.toUnmodifiable(),
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

                return other is Role && this.value == other.value
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
            private val string: String? = null,
            private val chatCompletionContentParts: List<ChatCompletionContentPart>? = null,
            private val _json: JsonValue? = null,
        ) {

            private var validated: Boolean = false

            fun string(): Optional<String> = Optional.ofNullable(string)

            fun chatCompletionContentParts(): Optional<List<ChatCompletionContentPart>> =
                Optional.ofNullable(chatCompletionContentParts)

            fun isString(): Boolean = string != null

            fun isChatCompletionContentParts(): Boolean = chatCompletionContentParts != null

            fun asString(): String = string.getOrThrow("string")

            fun asChatCompletionContentParts(): List<ChatCompletionContentPart> =
                chatCompletionContentParts.getOrThrow("chatCompletionContentParts")

            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

            fun <T> accept(visitor: Visitor<T>): T {
                return when {
                    string != null -> visitor.visitString(string)
                    chatCompletionContentParts != null ->
                        visitor.visitChatCompletionContentParts(chatCompletionContentParts)
                    else -> visitor.unknown(_json)
                }
            }

            fun validate(): Content = apply {
                if (!validated) {
                    if (string == null && chatCompletionContentParts == null) {
                        throw BraintrustInvalidDataException("Unknown Content: $_json")
                    }
                    validated = true
                }
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Content &&
                    this.string == other.string &&
                    this.chatCompletionContentParts == other.chatCompletionContentParts
            }

            override fun hashCode(): Int {
                return Objects.hash(string, chatCompletionContentParts)
            }

            override fun toString(): String {
                return when {
                    string != null -> "Content{string=$string}"
                    chatCompletionContentParts != null ->
                        "Content{chatCompletionContentParts=$chatCompletionContentParts}"
                    _json != null -> "Content{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Content")
                }
            }

            companion object {

                @JvmStatic fun ofString(string: String) = Content(string = string)

                @JvmStatic
                fun ofChatCompletionContentParts(
                    chatCompletionContentParts: List<ChatCompletionContentPart>
                ) = Content(chatCompletionContentParts = chatCompletionContentParts)
            }

            interface Visitor<out T> {

                fun visitString(string: String): T

                fun visitChatCompletionContentParts(
                    chatCompletionContentParts: List<ChatCompletionContentPart>
                ): T

                fun unknown(json: JsonValue?): T {
                    throw BraintrustInvalidDataException("Unknown Content: $json")
                }
            }

            class Deserializer : BaseDeserializer<Content>(Content::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): Content {
                    val json = JsonValue.fromJsonNode(node)
                    tryDeserialize(node, jacksonTypeRef<String>())?.let {
                        return Content(string = it, _json = json)
                    }
                    tryDeserialize(node, jacksonTypeRef<List<ChatCompletionContentPart>>())?.let {
                        return Content(chatCompletionContentParts = it, _json = json)
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
                        value.string != null -> generator.writeObject(value.string)
                        value.chatCompletionContentParts != null ->
                            generator.writeObject(value.chatCompletionContentParts)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid Content")
                    }
                }
            }

            @JsonDeserialize(using = ChatCompletionContentPart.Deserializer::class)
            @JsonSerialize(using = ChatCompletionContentPart.Serializer::class)
            class ChatCompletionContentPart
            private constructor(
                private val text: Text? = null,
                private val imageUrl: ImageUrl? = null,
                private val _json: JsonValue? = null,
            ) {

                private var validated: Boolean = false

                fun text(): Optional<Text> = Optional.ofNullable(text)

                fun imageUrl(): Optional<ImageUrl> = Optional.ofNullable(imageUrl)

                fun isText(): Boolean = text != null

                fun isImageUrl(): Boolean = imageUrl != null

                fun asText(): Text = text.getOrThrow("text")

                fun asImageUrl(): ImageUrl = imageUrl.getOrThrow("imageUrl")

                fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                fun <T> accept(visitor: Visitor<T>): T {
                    return when {
                        text != null -> visitor.visitText(text)
                        imageUrl != null -> visitor.visitImageUrl(imageUrl)
                        else -> visitor.unknown(_json)
                    }
                }

                fun validate(): ChatCompletionContentPart = apply {
                    if (!validated) {
                        if (text == null && imageUrl == null) {
                            throw BraintrustInvalidDataException(
                                "Unknown ChatCompletionContentPart: $_json"
                            )
                        }
                        text?.validate()
                        imageUrl?.validate()
                        validated = true
                    }
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is ChatCompletionContentPart &&
                        this.text == other.text &&
                        this.imageUrl == other.imageUrl
                }

                override fun hashCode(): Int {
                    return Objects.hash(text, imageUrl)
                }

                override fun toString(): String {
                    return when {
                        text != null -> "ChatCompletionContentPart{text=$text}"
                        imageUrl != null -> "ChatCompletionContentPart{imageUrl=$imageUrl}"
                        _json != null -> "ChatCompletionContentPart{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid ChatCompletionContentPart")
                    }
                }

                companion object {

                    @JvmStatic fun ofText(text: Text) = ChatCompletionContentPart(text = text)

                    @JvmStatic
                    fun ofImageUrl(imageUrl: ImageUrl) =
                        ChatCompletionContentPart(imageUrl = imageUrl)
                }

                interface Visitor<out T> {

                    fun visitText(text: Text): T

                    fun visitImageUrl(imageUrl: ImageUrl): T

                    fun unknown(json: JsonValue?): T {
                        throw BraintrustInvalidDataException(
                            "Unknown ChatCompletionContentPart: $json"
                        )
                    }
                }

                class Deserializer :
                    BaseDeserializer<ChatCompletionContentPart>(ChatCompletionContentPart::class) {

                    override fun ObjectCodec.deserialize(
                        node: JsonNode
                    ): ChatCompletionContentPart {
                        val json = JsonValue.fromJsonNode(node)
                        tryDeserialize(node, jacksonTypeRef<Text>()) { it.validate() }
                            ?.let {
                                return ChatCompletionContentPart(text = it, _json = json)
                            }
                        tryDeserialize(node, jacksonTypeRef<ImageUrl>()) { it.validate() }
                            ?.let {
                                return ChatCompletionContentPart(imageUrl = it, _json = json)
                            }

                        return ChatCompletionContentPart(_json = json)
                    }
                }

                class Serializer :
                    BaseSerializer<ChatCompletionContentPart>(ChatCompletionContentPart::class) {

                    override fun serialize(
                        value: ChatCompletionContentPart,
                        generator: JsonGenerator,
                        provider: SerializerProvider
                    ) {
                        when {
                            value.text != null -> generator.writeObject(value.text)
                            value.imageUrl != null -> generator.writeObject(value.imageUrl)
                            value._json != null -> generator.writeObject(value._json)
                            else -> throw IllegalStateException("Invalid ChatCompletionContentPart")
                        }
                    }
                }

                @JsonDeserialize(builder = Text.Builder::class)
                @NoAutoDetect
                class Text
                private constructor(
                    private val text: JsonField<String>,
                    private val type: JsonField<Type>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    fun text(): Optional<String> = Optional.ofNullable(text.getNullable("text"))

                    fun type(): Type = type.getRequired("type")

                    @JsonProperty("text") @ExcludeMissing fun _text() = text

                    @JsonProperty("type") @ExcludeMissing fun _type() = type

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): Text = apply {
                        if (!validated) {
                            text()
                            type()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Text &&
                            this.text == other.text &&
                            this.type == other.type &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode =
                                Objects.hash(
                                    text,
                                    type,
                                    additionalProperties,
                                )
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "Text{text=$text, type=$type, additionalProperties=$additionalProperties}"

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var text: JsonField<String> = JsonMissing.of()
                        private var type: JsonField<Type> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(text: Text) = apply {
                            this.text = text.text
                            this.type = text.type
                            additionalProperties(text.additionalProperties)
                        }

                        fun text(text: String) = text(JsonField.of(text))

                        @JsonProperty("text")
                        @ExcludeMissing
                        fun text(text: JsonField<String>) = apply { this.text = text }

                        fun type(type: Type) = type(JsonField.of(type))

                        @JsonProperty("type")
                        @ExcludeMissing
                        fun type(type: JsonField<Type>) = apply { this.type = type }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): Text =
                            Text(
                                text,
                                type,
                                additionalProperties.toUnmodifiable(),
                            )
                    }

                    class Type
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) : Enum {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Type && this.value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()

                        companion object {

                            @JvmField val TEXT = Type(JsonField.of("text"))

                            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                        }

                        enum class Known {
                            TEXT,
                        }

                        enum class Value {
                            TEXT,
                            _UNKNOWN,
                        }

                        fun value(): Value =
                            when (this) {
                                TEXT -> Value.TEXT
                                else -> Value._UNKNOWN
                            }

                        fun known(): Known =
                            when (this) {
                                TEXT -> Known.TEXT
                                else -> throw BraintrustInvalidDataException("Unknown Type: $value")
                            }

                        fun asString(): String = _value().asStringOrThrow()
                    }
                }

                @JsonDeserialize(builder = ImageUrl.Builder::class)
                @NoAutoDetect
                class ImageUrl
                private constructor(
                    private val imageUrl: JsonField<ImageUrl>,
                    private val type: JsonField<Type>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    fun imageUrl(): ImageUrl = imageUrl.getRequired("image_url")

                    fun type(): Type = type.getRequired("type")

                    @JsonProperty("image_url") @ExcludeMissing fun _imageUrl() = imageUrl

                    @JsonProperty("type") @ExcludeMissing fun _type() = type

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): ImageUrl = apply {
                        if (!validated) {
                            imageUrl().validate()
                            type()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is ImageUrl &&
                            this.imageUrl == other.imageUrl &&
                            this.type == other.type &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode =
                                Objects.hash(
                                    imageUrl,
                                    type,
                                    additionalProperties,
                                )
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "ImageUrl{imageUrl=$imageUrl, type=$type, additionalProperties=$additionalProperties}"

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var imageUrl: JsonField<ImageUrl> = JsonMissing.of()
                        private var type: JsonField<Type> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(imageUrl: ImageUrl) = apply {
                            this.imageUrl = imageUrl.imageUrl
                            this.type = imageUrl.type
                            additionalProperties(imageUrl.additionalProperties)
                        }

                        fun imageUrl(imageUrl: ImageUrl) = imageUrl(JsonField.of(imageUrl))

                        @JsonProperty("image_url")
                        @ExcludeMissing
                        fun imageUrl(imageUrl: JsonField<ImageUrl>) = apply {
                            this.imageUrl = imageUrl
                        }

                        fun type(type: Type) = type(JsonField.of(type))

                        @JsonProperty("type")
                        @ExcludeMissing
                        fun type(type: JsonField<Type>) = apply { this.type = type }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): ImageUrl =
                            ImageUrl(
                                imageUrl,
                                type,
                                additionalProperties.toUnmodifiable(),
                            )
                    }

                    class Type
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) : Enum {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Type && this.value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()

                        companion object {

                            @JvmField val IMAGE_URL = Type(JsonField.of("image_url"))

                            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                        }

                        enum class Known {
                            IMAGE_URL,
                        }

                        enum class Value {
                            IMAGE_URL,
                            _UNKNOWN,
                        }

                        fun value(): Value =
                            when (this) {
                                IMAGE_URL -> Value.IMAGE_URL
                                else -> Value._UNKNOWN
                            }

                        fun known(): Known =
                            when (this) {
                                IMAGE_URL -> Known.IMAGE_URL
                                else -> throw BraintrustInvalidDataException("Unknown Type: $value")
                            }

                        fun asString(): String = _value().asStringOrThrow()
                    }
                }
            }
        }
    }

    @JsonDeserialize(builder = Assistant.Builder::class)
    @NoAutoDetect
    class Assistant
    private constructor(
        private val role: JsonField<Role>,
        private val content: JsonField<String>,
        private val functionCall: JsonField<FunctionCall>,
        private val name: JsonField<String>,
        private val toolCalls: JsonField<List<ToolCall>>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        fun role(): Role = role.getRequired("role")

        fun content(): Optional<String> = Optional.ofNullable(content.getNullable("content"))

        fun functionCall(): Optional<FunctionCall> =
            Optional.ofNullable(functionCall.getNullable("function_call"))

        fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

        fun toolCalls(): Optional<List<ToolCall>> =
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Assistant &&
                this.role == other.role &&
                this.content == other.content &&
                this.functionCall == other.functionCall &&
                this.name == other.name &&
                this.toolCalls == other.toolCalls &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        role,
                        content,
                        functionCall,
                        name,
                        toolCalls,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Assistant{role=$role, content=$content, functionCall=$functionCall, name=$name, toolCalls=$toolCalls, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var role: JsonField<Role> = JsonMissing.of()
            private var content: JsonField<String> = JsonMissing.of()
            private var functionCall: JsonField<FunctionCall> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var toolCalls: JsonField<List<ToolCall>> = JsonMissing.of()
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

            fun toolCalls(toolCalls: List<ToolCall>) = toolCalls(JsonField.of(toolCalls))

            @JsonProperty("tool_calls")
            @ExcludeMissing
            fun toolCalls(toolCalls: JsonField<List<ToolCall>>) = apply {
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
                    toolCalls.map { it.toUnmodifiable() },
                    additionalProperties.toUnmodifiable(),
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

                return other is Role && this.value == other.value
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

            private var hashCode: Int = 0

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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is FunctionCall &&
                    this.arguments == other.arguments &&
                    this.name == other.name &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            arguments,
                            name,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "FunctionCall{arguments=$arguments, name=$name, additionalProperties=$additionalProperties}"

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
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        @JsonDeserialize(builder = ToolCall.Builder::class)
        @NoAutoDetect
        class ToolCall
        private constructor(
            private val id: JsonField<String>,
            private val function: JsonField<Function>,
            private val type: JsonField<Type>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun id(): String = id.getRequired("id")

            fun function(): Function = function.getRequired("function")

            fun type(): Type = type.getRequired("type")

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonProperty("function") @ExcludeMissing fun _function() = function

            @JsonProperty("type") @ExcludeMissing fun _type() = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): ToolCall = apply {
                if (!validated) {
                    id()
                    function().validate()
                    type()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ToolCall &&
                    this.id == other.id &&
                    this.function == other.function &&
                    this.type == other.type &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            id,
                            function,
                            type,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "ToolCall{id=$id, function=$function, type=$type, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var function: JsonField<Function> = JsonMissing.of()
                private var type: JsonField<Type> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(toolCall: ToolCall) = apply {
                    this.id = toolCall.id
                    this.function = toolCall.function
                    this.type = toolCall.type
                    additionalProperties(toolCall.additionalProperties)
                }

                fun id(id: String) = id(JsonField.of(id))

                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun function(function: Function) = function(JsonField.of(function))

                @JsonProperty("function")
                @ExcludeMissing
                fun function(function: JsonField<Function>) = apply { this.function = function }

                fun type(type: Type) = type(JsonField.of(type))

                @JsonProperty("type")
                @ExcludeMissing
                fun type(type: JsonField<Type>) = apply { this.type = type }

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

                fun build(): ToolCall =
                    ToolCall(
                        id,
                        function,
                        type,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            @JsonDeserialize(builder = Function.Builder::class)
            @NoAutoDetect
            class Function
            private constructor(
                private val arguments: JsonField<String>,
                private val name: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                fun arguments(): String = arguments.getRequired("arguments")

                fun name(): String = name.getRequired("name")

                @JsonProperty("arguments") @ExcludeMissing fun _arguments() = arguments

                @JsonProperty("name") @ExcludeMissing fun _name() = name

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): Function = apply {
                    if (!validated) {
                        arguments()
                        name()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Function &&
                        this.arguments == other.arguments &&
                        this.name == other.name &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                arguments,
                                name,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "Function{arguments=$arguments, name=$name, additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var arguments: JsonField<String> = JsonMissing.of()
                    private var name: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(function: Function) = apply {
                        this.arguments = function.arguments
                        this.name = function.name
                        additionalProperties(function.additionalProperties)
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

                    fun build(): Function =
                        Function(
                            arguments,
                            name,
                            additionalProperties.toUnmodifiable(),
                        )
                }
            }

            class Type
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Type && this.value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    @JvmField val FUNCTION = Type(JsonField.of("function"))

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
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
                        else -> throw BraintrustInvalidDataException("Unknown Type: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }
        }
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

        private var hashCode: Int = 0

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Tool &&
                this.content == other.content &&
                this.role == other.role &&
                this.toolCallId == other.toolCallId &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        content,
                        role,
                        toolCallId,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Tool{content=$content, role=$role, toolCallId=$toolCallId, additionalProperties=$additionalProperties}"

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
                    additionalProperties.toUnmodifiable(),
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

                return other is Role && this.value == other.value
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

        private var hashCode: Int = 0

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Function &&
                this.content == other.content &&
                this.name == other.name &&
                this.role == other.role &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        content,
                        name,
                        role,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Function{content=$content, name=$name, role=$role, additionalProperties=$additionalProperties}"

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
                    additionalProperties.toUnmodifiable(),
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

                return other is Role && this.value == other.value
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

        private var hashCode: Int = 0

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Fallback &&
                this.role == other.role &&
                this.content == other.content &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        role,
                        content,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Fallback{role=$role, content=$content, additionalProperties=$additionalProperties}"

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
                    additionalProperties.toUnmodifiable(),
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

                return other is Role && this.value == other.value
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
    }
}
