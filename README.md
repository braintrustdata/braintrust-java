# Braintrust Java API Library

<!-- x-release-please-start-version -->

[![Maven Central](https://img.shields.io/maven-central/v/com.braintrustdata.api/braintrust-java)](https://central.sonatype.com/artifact/com.braintrustdata.api/braintrust-java/0.8.0)
[![javadoc](https://javadoc.io/badge2/com.braintrustdata.api/braintrust-java/0.8.0/javadoc.svg)](https://javadoc.io/doc/com.braintrustdata.api/braintrust-java/0.8.0)

<!-- x-release-please-end -->

The Braintrust Java SDK provides convenient access to the [Braintrust REST API](https://www.braintrustdata.com/docs/api/spec) from applications written in Java.

The Braintrust Java SDK is similar to the Braintrust Kotlin SDK but with minor differences that make it more ergonomic for use in Java, such as `Optional` instead of nullable values, `Stream` instead of `Sequence`, and `CompletableFuture` instead of suspend functions.

It is generated with [Stainless](https://www.stainless.com/).

<!-- x-release-please-start-version -->

The REST API documentation can be found on [www.braintrustdata.com](https://www.braintrustdata.com/docs/api/spec). Javadocs are also available on [javadoc.io](https://javadoc.io/doc/com.braintrustdata.api/braintrust-java/0.8.0).

<!-- x-release-please-end -->

## Installation

<!-- x-release-please-start-version -->

### Gradle

```kotlin
implementation("com.braintrustdata.api:braintrust-java:0.8.0")
```

### Maven

```xml
<dependency>
  <groupId>com.braintrustdata.api</groupId>
  <artifactId>braintrust-java</artifactId>
  <version>0.8.0</version>
</dependency>
```

<!-- x-release-please-end -->

## Requirements

This library requires Java 8 or later.

## Usage

```java
import com.braintrustdata.api.client.BraintrustClient;
import com.braintrustdata.api.client.okhttp.BraintrustOkHttpClient;
import com.braintrustdata.api.models.Project;
import com.braintrustdata.api.models.ProjectCreateParams;

// Configures using the `BRAINTRUST_API_KEY` environment variable
BraintrustClient client = BraintrustOkHttpClient.fromEnv();

ProjectCreateParams params = ProjectCreateParams.builder()
    .name("foobar")
    .build();
Project project = client.projects().create(params);
```

## Client configuration

Configure the client using environment variables:

```java
import com.braintrustdata.api.client.BraintrustClient;
import com.braintrustdata.api.client.okhttp.BraintrustOkHttpClient;

// Configures using the `BRAINTRUST_API_KEY` environment variable
BraintrustClient client = BraintrustOkHttpClient.fromEnv();
```

Or manually:

```java
import com.braintrustdata.api.client.BraintrustClient;
import com.braintrustdata.api.client.okhttp.BraintrustOkHttpClient;

BraintrustClient client = BraintrustOkHttpClient.builder()
    .apiKey("My API Key")
    .build();
```

Or using a combination of the two approaches:

```java
import com.braintrustdata.api.client.BraintrustClient;
import com.braintrustdata.api.client.okhttp.BraintrustOkHttpClient;

BraintrustClient client = BraintrustOkHttpClient.builder()
    // Configures using the `BRAINTRUST_API_KEY` environment variable
    .fromEnv()
    .apiKey("My API Key")
    .build();
```

See this table for the available options:

| Setter   | Environment variable | Required | Default value |
| -------- | -------------------- | -------- | ------------- |
| `apiKey` | `BRAINTRUST_API_KEY` | false    | -             |

> [!TIP]
> Don't create more than one client in the same application. Each client has a connection pool and
> thread pools, which are more efficient to share between requests.

## Requests and responses

To send a request to the Braintrust API, build an instance of some `Params` class and pass it to the corresponding client method. When the response is received, it will be deserialized into an instance of a Java class.

For example, `client.projects().create(...)` should be called with an instance of `ProjectCreateParams`, and it will return an instance of `Project`.

## Immutability

Each class in the SDK has an associated [builder](https://blogs.oracle.com/javamagazine/post/exploring-joshua-blochs-builder-design-pattern-in-java) or factory method for constructing it.

Each class is [immutable](https://docs.oracle.com/javase/tutorial/essential/concurrency/immutable.html) once constructed. If the class has an associated builder, then it has a `toBuilder()` method, which can be used to convert it back to a builder for making a modified copy.

Because each class is immutable, builder modification will _never_ affect already built class instances.

## Asynchronous execution

The default client is synchronous. To switch to asynchronous execution, call the `async()` method:

```java
import com.braintrustdata.api.client.BraintrustClient;
import com.braintrustdata.api.client.okhttp.BraintrustOkHttpClient;
import com.braintrustdata.api.models.Project;
import com.braintrustdata.api.models.ProjectCreateParams;
import java.util.concurrent.CompletableFuture;

// Configures using the `BRAINTRUST_API_KEY` environment variable
BraintrustClient client = BraintrustOkHttpClient.fromEnv();

ProjectCreateParams params = ProjectCreateParams.builder()
    .name("foobar")
    .build();
CompletableFuture<Project> project = client.async().projects().create(params);
```

Or create an asynchronous client from the beginning:

```java
import com.braintrustdata.api.client.BraintrustClientAsync;
import com.braintrustdata.api.client.okhttp.BraintrustOkHttpClientAsync;
import com.braintrustdata.api.models.Project;
import com.braintrustdata.api.models.ProjectCreateParams;
import java.util.concurrent.CompletableFuture;

// Configures using the `BRAINTRUST_API_KEY` environment variable
BraintrustClientAsync client = BraintrustOkHttpClientAsync.fromEnv();

ProjectCreateParams params = ProjectCreateParams.builder()
    .name("foobar")
    .build();
CompletableFuture<Project> project = client.projects().create(params);
```

The asynchronous client supports the same options as the synchronous one, except most methods return `CompletableFuture`s.

## Raw responses

The SDK defines methods that deserialize responses into instances of Java classes. However, these methods don't provide access to the response headers, status code, or the raw response body.

To access this data, prefix any HTTP method call on a client or service with `withRawResponse()`:

```java
import com.braintrustdata.api.core.http.Headers;
import com.braintrustdata.api.core.http.HttpResponseFor;
import com.braintrustdata.api.models.Project;
import com.braintrustdata.api.models.ProjectCreateParams;

ProjectCreateParams params = ProjectCreateParams.builder()
    .name("foobar")
    .build();
HttpResponseFor<Project> project = client.projects().withRawResponse().create(params);

int statusCode = project.statusCode();
Headers headers = project.headers();
```

You can still deserialize the response into an instance of a Java class if needed:

```java
import com.braintrustdata.api.models.Project;

Project parsedProject = project.parse();
```

## Error handling

The SDK throws custom unchecked exception types:

- [`BraintrustServiceException`](braintrust-java-core/src/main/kotlin/com/braintrustdata/api/errors/BraintrustServiceException.kt): Base class for HTTP errors. See this table for which exception subclass is thrown for each HTTP status code:

  | Status | Exception                                                                                                                              |
  | ------ | -------------------------------------------------------------------------------------------------------------------------------------- |
  | 400    | [`BadRequestException`](braintrust-java-core/src/main/kotlin/com/braintrustdata/api/errors/BadRequestException.kt)                     |
  | 401    | [`UnauthorizedException`](braintrust-java-core/src/main/kotlin/com/braintrustdata/api/errors/UnauthorizedException.kt)                 |
  | 403    | [`PermissionDeniedException`](braintrust-java-core/src/main/kotlin/com/braintrustdata/api/errors/PermissionDeniedException.kt)         |
  | 404    | [`NotFoundException`](braintrust-java-core/src/main/kotlin/com/braintrustdata/api/errors/NotFoundException.kt)                         |
  | 422    | [`UnprocessableEntityException`](braintrust-java-core/src/main/kotlin/com/braintrustdata/api/errors/UnprocessableEntityException.kt)   |
  | 429    | [`RateLimitException`](braintrust-java-core/src/main/kotlin/com/braintrustdata/api/errors/RateLimitException.kt)                       |
  | 5xx    | [`InternalServerException`](braintrust-java-core/src/main/kotlin/com/braintrustdata/api/errors/InternalServerException.kt)             |
  | others | [`UnexpectedStatusCodeException`](braintrust-java-core/src/main/kotlin/com/braintrustdata/api/errors/UnexpectedStatusCodeException.kt) |

- [`BraintrustIoException`](braintrust-java-core/src/main/kotlin/com/braintrustdata/api/errors/BraintrustIoException.kt): I/O networking errors.

- [`BraintrustInvalidDataException`](braintrust-java-core/src/main/kotlin/com/braintrustdata/api/errors/BraintrustInvalidDataException.kt): Failure to interpret successfully parsed data. For example, when accessing a property that's supposed to be required, but the API unexpectedly omitted it from the response.

- [`BraintrustException`](braintrust-java-core/src/main/kotlin/com/braintrustdata/api/errors/BraintrustException.kt): Base class for all exceptions. Most errors will result in one of the previously mentioned ones, but completely generic errors may be thrown using the base class.

## Pagination

For methods that return a paginated list of results, this library provides convenient ways access the results either one page at a time, or item-by-item across all pages.

### Auto-pagination

To iterate through all results across all pages, you can use `autoPager`, which automatically handles fetching more pages for you:

### Synchronous

```java
import com.braintrustdata.api.models.Project;
import com.braintrustdata.api.models.ProjectListPage;

// As an Iterable:
ProjectListPage page = client.projects().list(params);
for (Project project : page.autoPager()) {
    System.out.println(project);
};

// As a Stream:
client.projects().list(params).autoPager().stream()
    .limit(50)
    .forEach(project -> System.out.println(project));
```

### Asynchronous

```java
// Using forEach, which returns CompletableFuture<Void>:
asyncClient.projects().list(params).autoPager()
    .forEach(project -> System.out.println(project), executor);
```

### Manual pagination

If none of the above helpers meet your needs, you can also manually request pages one-by-one. A page of results has a `data()` method to fetch the list of objects, as well as top-level `response` and other methods to fetch top-level data about the page. It also has methods `hasNextPage`, `getNextPage`, and `getNextPageParams` methods to help with pagination.

```java
import com.braintrustdata.api.models.Project;
import com.braintrustdata.api.models.ProjectListPage;

ProjectListPage page = client.projects().list(params);
while (page != null) {
    for (Project project : page.objects()) {
        System.out.println(project);
    }

    page = page.getNextPage().orElse(null);
}
```

## Logging

The SDK uses the standard [OkHttp logging interceptor](https://github.com/square/okhttp/tree/master/okhttp-logging-interceptor).

Enable logging by setting the `BRAINTRUST_LOG` environment variable to `info`:

```sh
$ export BRAINTRUST_LOG=info
```

Or to `debug` for more verbose logging:

```sh
$ export BRAINTRUST_LOG=debug
```

## Network options

### Retries

The SDK automatically retries 2 times by default, with a short exponential backoff.

Only the following error types are retried:

- Connection errors (for example, due to a network connectivity problem)
- 408 Request Timeout
- 409 Conflict
- 429 Rate Limit
- 5xx Internal

The API may also explicitly instruct the SDK to retry or not retry a response.

To set a custom number of retries, configure the client using the `maxRetries` method:

```java
import com.braintrustdata.api.client.BraintrustClient;
import com.braintrustdata.api.client.okhttp.BraintrustOkHttpClient;

BraintrustClient client = BraintrustOkHttpClient.builder()
    .fromEnv()
    .maxRetries(4)
    .build();
```

### Timeouts

Requests time out after 1 minute by default.

To set a custom timeout, configure the method call using the `timeout` method:

```java
import com.braintrustdata.api.models.Project;
import com.braintrustdata.api.models.ProjectCreateParams;

Project project = client.projects().create(
  params, RequestOptions.builder().timeout(Duration.ofSeconds(30)).build()
);
```

Or configure the default for all method calls at the client level:

```java
import com.braintrustdata.api.client.BraintrustClient;
import com.braintrustdata.api.client.okhttp.BraintrustOkHttpClient;
import java.time.Duration;

BraintrustClient client = BraintrustOkHttpClient.builder()
    .fromEnv()
    .timeout(Duration.ofSeconds(30))
    .build();
```

### Proxies

To route requests through a proxy, configure the client using the `proxy` method:

```java
import com.braintrustdata.api.client.BraintrustClient;
import com.braintrustdata.api.client.okhttp.BraintrustOkHttpClient;
import java.net.InetSocketAddress;
import java.net.Proxy;

BraintrustClient client = BraintrustOkHttpClient.builder()
    .fromEnv()
    .proxy(new Proxy(
      Proxy.Type.HTTP, new InetSocketAddress(
        "https://example.com", 8080
      )
    ))
    .build();
```

## Undocumented API functionality

The SDK is typed for convenient usage of the documented API. However, it also supports working with undocumented or not yet supported parts of the API.

### Parameters

To set undocumented parameters, call the `putAdditionalHeader`, `putAdditionalQueryParam`, or `putAdditionalBodyProperty` methods on any `Params` class:

```java
import com.braintrustdata.api.core.JsonValue;
import com.braintrustdata.api.models.ProjectCreateParams;

ProjectCreateParams params = ProjectCreateParams.builder()
    .putAdditionalHeader("Secret-Header", "42")
    .putAdditionalQueryParam("secret_query_param", "42")
    .putAdditionalBodyProperty("secretProperty", JsonValue.from("42"))
    .build();
```

These can be accessed on the built object later using the `_additionalHeaders()`, `_additionalQueryParams()`, and `_additionalBodyProperties()` methods.

To set undocumented parameters on _nested_ headers, query params, or body classes, call the `putAdditionalProperty` method on the nested class:

```java
import com.braintrustdata.api.core.JsonValue;
import com.braintrustdata.api.models.ProjectSettings;
import com.braintrustdata.api.models.ProjectUpdateParams;

ProjectUpdateParams params = ProjectUpdateParams.builder()
    .settings(ProjectSettings.builder()
        .putAdditionalProperty("secretProperty", JsonValue.from("42"))
        .build())
    .build();
```

These properties can be accessed on the nested built object later using the `_additionalProperties()` method.

To set a documented parameter or property to an undocumented or not yet supported _value_, pass a [`JsonValue`](braintrust-java-core/src/main/kotlin/com/braintrustdata/api/core/Values.kt) object to its setter:

```java
import com.braintrustdata.api.core.JsonValue;
import com.braintrustdata.api.models.ProjectCreateParams;

ProjectCreateParams params = ProjectCreateParams.builder()
    .name(JsonValue.from(42))
    .build();
```

The most straightforward way to create a [`JsonValue`](braintrust-java-core/src/main/kotlin/com/braintrustdata/api/core/Values.kt) is using its `from(...)` method:

```java
import com.braintrustdata.api.core.JsonValue;
import java.util.List;
import java.util.Map;

// Create primitive JSON values
JsonValue nullValue = JsonValue.from(null);
JsonValue booleanValue = JsonValue.from(true);
JsonValue numberValue = JsonValue.from(42);
JsonValue stringValue = JsonValue.from("Hello World!");

// Create a JSON array value equivalent to `["Hello", "World"]`
JsonValue arrayValue = JsonValue.from(List.of(
  "Hello", "World"
));

// Create a JSON object value equivalent to `{ "a": 1, "b": 2 }`
JsonValue objectValue = JsonValue.from(Map.of(
  "a", 1,
  "b", 2
));

// Create an arbitrarily nested JSON equivalent to:
// {
//   "a": [1, 2],
//   "b": [3, 4]
// }
JsonValue complexValue = JsonValue.from(Map.of(
  "a", List.of(
    1, 2
  ),
  "b", List.of(
    3, 4
  )
));
```

### Response properties

To access undocumented response properties, call the `_additionalProperties()` method:

```java
import com.braintrustdata.api.core.JsonValue;
import java.util.Map;

Map<String, JsonValue> additionalProperties = client.projects().create(params)._additionalProperties();
JsonValue secretPropertyValue = additionalProperties.get("secretProperty");

String result = secretPropertyValue.accept(new JsonValue.Visitor<>() {
    @Override
    public String visitNull() {
        return "It's null!";
    }

    @Override
    public String visitBoolean(boolean value) {
        return "It's a boolean!";
    }

    @Override
    public String visitNumber(Number value) {
        return "It's a number!";
    }

    // Other methods include `visitMissing`, `visitString`, `visitArray`, and `visitObject`
    // The default implementation of each unimplemented method delegates to `visitDefault`, which throws by default, but can also be overridden
});
```

To access a property's raw JSON value, which may be undocumented, call its `_` prefixed method:

```java
import com.braintrustdata.api.core.JsonField;
import java.util.Optional;

JsonField<String> name = client.projects().create(params)._name();

if (name.isMissing()) {
  // The property is absent from the JSON response
} else if (name.isNull()) {
  // The property was set to literal null
} else {
  // Check if value was provided as a string
  // Other methods include `asNumber()`, `asBoolean()`, etc.
  Optional<String> jsonString = name.asString();

  // Try to deserialize into a custom type
  MyClass myObject = name.asUnknown().orElseThrow().convert(MyClass.class);
}
```

### Response validation

In rare cases, the API may return a response that doesn't match the expected type. For example, the SDK may expect a property to contain a `String`, but the API could return something else.

By default, the SDK will not throw an exception in this case. It will throw [`BraintrustInvalidDataException`](braintrust-java-core/src/main/kotlin/com/braintrustdata/api/errors/BraintrustInvalidDataException.kt) only if you directly access the property.

If you would prefer to check that the response is completely well-typed upfront, then either call `validate()`:

```java
import com.braintrustdata.api.models.Project;

Project project = client.projects().create(params).validate();
```

Or configure the method call to validate the response using the `responseValidation` method:

```java
import com.braintrustdata.api.models.Project;
import com.braintrustdata.api.models.ProjectCreateParams;

Project project = client.projects().create(
  params, RequestOptions.builder().responseValidation(true).build()
);
```

Or configure the default for all method calls at the client level:

```java
import com.braintrustdata.api.client.BraintrustClient;
import com.braintrustdata.api.client.okhttp.BraintrustOkHttpClient;

BraintrustClient client = BraintrustOkHttpClient.builder()
    .fromEnv()
    .responseValidation(true)
    .build();
```

## FAQ

### Why don't you use plain `enum` classes?

Java `enum` classes are not trivially [forwards compatible](https://www.stainless.com/blog/making-java-enums-forwards-compatible). Using them in the SDK could cause runtime exceptions if the API is updated to respond with a new enum value.

### Why do you represent fields using `JsonField<T>` instead of just plain `T`?

Using `JsonField<T>` enables a few features:

- Allowing usage of [undocumented API functionality](#undocumented-api-functionality)
- Lazily [validating the API response against the expected shape](#response-validation)
- Representing absent vs explicitly null values

### Why don't you use [`data` classes](https://kotlinlang.org/docs/data-classes.html)?

It is not [backwards compatible to add new fields to a data class](https://kotlinlang.org/docs/api-guidelines-backward-compatibility.html#avoid-using-data-classes-in-your-api) and we don't want to introduce a breaking change every time we add a field to a class.

### Why don't you use checked exceptions?

Checked exceptions are widely considered a mistake in the Java programming language. In fact, they were omitted from Kotlin for this reason.

Checked exceptions:

- Are verbose to handle
- Encourage error handling at the wrong level of abstraction, where nothing can be done about the error
- Are tedious to propagate due to the [function coloring problem](https://journal.stuffwithstuff.com/2015/02/01/what-color-is-your-function)
- Don't play well with lambdas (also due to the function coloring problem)

## Semantic versioning

This package generally follows [SemVer](https://semver.org/spec/v2.0.0.html) conventions, though certain backwards-incompatible changes may be released as minor versions:

1. Changes to library internals which are technically public but not intended or documented for external use. _(Please open a GitHub issue to let us know if you are relying on such internals.)_
2. Changes that we do not expect to impact the vast majority of users in practice.

We take backwards-compatibility seriously and work hard to ensure you can rely on a smooth upgrade experience.

We are keen for your feedback; please open an [issue](https://www.github.com/braintrustdata/braintrust-java/issues) with questions, bugs, or suggestions.
