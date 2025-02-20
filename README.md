# Braintrust Java API Library

<!-- x-release-please-start-version -->

[![Maven Central](https://img.shields.io/maven-central/v/com.braintrustdata.api/braintrust-java)](https://central.sonatype.com/artifact/com.braintrustdata.api/braintrust-java/0.7.0)

<!-- x-release-please-end -->

The Braintrust Java SDK provides convenient access to the Braintrust REST API from applications written in Java.

The Braintrust Java SDK is similar to the Braintrust Kotlin SDK but with minor differences that make it more ergonomic for use in Java, such as `Optional` instead of nullable values, `Stream` instead of `Sequence`, and `CompletableFuture` instead of suspend functions.

It is generated with [Stainless](https://www.stainlessapi.com/).

The REST API documentation can be found on [www.braintrustdata.com](https://www.braintrustdata.com/docs/api/spec).

## Installation

<!-- x-release-please-start-version -->

### Gradle

```kotlin
implementation("com.braintrustdata.api:braintrust-java:0.7.0")
```

### Maven

```xml
<dependency>
    <groupId>com.braintrustdata.api</groupId>
    <artifactId>braintrust-java</artifactId>
    <version>0.7.0</version>
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

## Error handling

The SDK throws custom unchecked exception types:

- `BraintrustServiceException`: Base class for HTTP errors. See this table for which exception subclass is thrown for each HTTP status code:

  | Status | Exception                       |
  | ------ | ------------------------------- |
  | 400    | `BadRequestException`           |
  | 401    | `AuthenticationException`       |
  | 403    | `PermissionDeniedException`     |
  | 404    | `NotFoundException`             |
  | 422    | `UnprocessableEntityException`  |
  | 429    | `RateLimitException`            |
  | 5xx    | `InternalServerException`       |
  | others | `UnexpectedStatusCodeException` |

- `BraintrustIoException`: I/O networking errors.

- `BraintrustInvalidDataException`: Failure to interpret successfully parsed data. For example, when accessing a property that's supposed to be required, but the API unexpectedly omitted it from the response.

- `BraintrustException`: Base class for all exceptions. Most errors will result in one of the previously mentioned ones, but completely generic errors may be thrown using the base class.

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

These can be accessed on the built object later using the `_additionalHeaders()`, `_additionalQueryParams()`, and `_additionalBodyProperties()` methods. You can also set undocumented parameters on nested headers, query params, or body classes using the `putAdditionalProperty` method. These properties can be accessed on the built object later using the `_additionalProperties()` method.

To set a documented parameter or property to an undocumented or not yet supported _value_, pass a `JsonValue` object to its setter:

```java
import com.braintrustdata.api.core.JsonValue;
import com.braintrustdata.api.models.ProjectCreateParams;

ProjectCreateParams params = ProjectCreateParams.builder()
    .name(JsonValue.from(42))
    .build();
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

By default, the SDK will not throw an exception in this case. It will throw `BraintrustInvalidDataException` only if you directly access the property.

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

## Semantic versioning

This package generally follows [SemVer](https://semver.org/spec/v2.0.0.html) conventions, though certain backwards-incompatible changes may be released as minor versions:

1. Changes to library internals which are technically public but not intended or documented for external use. _(Please open a GitHub issue to let us know if you are relying on such internals.)_
2. Changes that we do not expect to impact the vast majority of users in practice.

We take backwards-compatibility seriously and work hard to ensure you can rely on a smooth upgrade experience.

We are keen for your feedback; please open an [issue](https://www.github.com/braintrustdata/braintrust-java/issues) with questions, bugs, or suggestions.
