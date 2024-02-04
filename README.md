# Braintrust Java API Library

<!-- x-release-please-start-version -->

[![Maven Central](https://img.shields.io/maven-central/v/com.braintrustdata.api/braintrust-java)](https://central.sonatype.com/artifact/com.braintrustdata.api/braintrust-java/0.2.0)

<!-- x-release-please-end -->

The Braintrust Java SDK provides convenient access to the Braintrust REST API from applications written in Java. It includes helper classes with helpful types and documentation for every request and response property.

The Braintrust Java SDK is similar to the Braintrust Kotlin SDK but with minor differences that make it more ergonomic for use in Java, such as `Optional` instead of nullable values, `Stream` instead of `Sequence`, and `CompletableFuture` instead of suspend functions.

## Documentation

The REST API documentation can be found [on www.braintrustdata.com](https://www.braintrustdata.com/docs/api/spec). The full API of this library can be found in [api.md](api.md).

---

## Getting started

### Install dependencies

#### Gradle

<!-- x-release-please-start-version -->

```kotlin
implementation("com.braintrustdata.api:braintrust-java:0.2.0")
```

#### Maven

```xml
<dependency>
    <groupId>com.braintrustdata.api</groupId>
    <artifactId>braintrust-java</artifactId>
    <version>0.2.0</version>
</dependency>
```

<!-- x-release-please-end -->

### Configure the client

Use `BraintrustOkHttpClient.builder()` to configure the client. At a minimum you need to set `.apiKey()`:

```java
import com.braintrustdata.api.client.BraintrustOkHttpClient;
import com.braintrustdata.api.client.okhttp.BraintrustOkHttpClient;

BraintrustClient client = BraintrustOkHttpClient.builder()
    .apiKey("My API Key")
    .build();
```

Alternately, set the environment with `BRAINTRUST_API_KEY`, and use `BraintrustOkHttpClient.fromEnv()` to read from the environment.

```java
BraintrustClient client = BraintrustOkHttpClient.fromEnv();

// Note: you can also call fromEnv() from the client builder, for example if you need to set additional properties
BraintrustClient client = BraintrustOkHttpClient.builder()
    .fromEnv()
    // ... set properties on the builder
    .build();
```

| Property | Environment variable | Required | Default value |
| -------- | -------------------- | -------- | ------------- |
| apiKey   | `BRAINTRUST_API_KEY` | true     | —             |

Read the documentation for more configuration options.

---

### Example: creating a resource

To create a new project, first use the `ProjectCreateParams` builder to specify attributes,
then pass that to the `create` method of the `project` service.

```java
import com.braintrustdata.api.models.Project;
import com.braintrustdata.api.models.ProjectCreateParams;

ProjectCreateParams params = ProjectCreateParams.builder()
    .bodyparam(true)
    .build();
Project project = client.project().create(params);
```

### Example: listing resources

The Braintrust API provides a `list` method to get a paginated list of project.
You can retrieve the first page by:

```java
import com.braintrustdata.api.models.Page;
import com.braintrustdata.api.models.Project;

ProjectListPage page = client.project().list();
for (Project project : page.objects()) {
    System.out.println(project);
}
```

See [Pagination](#pagination) below for more information on transparently working with lists of objects without worrying about fetching each page.

---

## Requests

### Parameters and bodies

To make a request to the Braintrust API, you generally build an instance of the appropriate `Params` class.

In [Example: creating a resource](#example-creating-a-resource) above, we used the `ProjectCreateParams.builder()` to pass to
the `create` method of the `project` service.

Sometimes, the API may support other properties that are not yet supported in the Java SDK types. In that case,
you can attach them using the `putAdditionalProperty` method.

```java
ProjectCreateParams params = ProjectCreateParams.builder()
    // ... normal properties
    .putAdditionalProperty("secret_param", "4242")
    .build();
```

## Responses

### Response validation

When receiving a response, the Braintrust Java SDK will deserialize it into instances of the typed model classes. In rare cases, the API may return a response property that doesn't match the expected Java type. If you directly access the mistaken property, the SDK will throw an unchecked `BraintrustInvalidDataException` at runtime. If you would prefer to check in advance that that response is completely well-typed, call `.validate()` on the returned model.

```java
Project project = client.project().create().validate();
```

### Response properties as JSON

In rare cases, you may want to access the underlying JSON value for a response property rather than using the typed version provided by
this SDK. Each model property has a corresponding JSON version, with an underscore before the method name, which returns a `JsonField` value.

```java
JsonField field = responseObj._field();

if (field.isMissing()) {
  // Value was not specified in the JSON response
} else if (field.isNull()) {
  // Value was provided as a literal null
} else {
  // See if value was provided as a string
  Optional<String> jsonString = field.asString();

  // If the value given by the API did not match the shape that the SDK expects
  // you can deserialise into a custom type
  MyClass myObj = responseObj._field().asUnknown().orElseThrow().convert(MyClass.class);
}
```

### Additional model properties

Sometimes, the server response may include additional properties that are not yet available in this library's types. You can access them using the model's `_additionalProperties` method:

```java
JsonValue secret = project._additionalProperties().get("secret_field");
```

---

## Pagination

For methods that return a paginated list of results, this library provides convenient ways access
the results either one page at a time, or item-by-item across all pages.

### Auto-pagination

To iterate through all results across all pages, you can use `autoPager`,
which automatically handles fetching more pages for you:

### Synchronous

```java
// As an Iterable:
ProjectListPage page = client.project().list(params);
for (Project project : page.autoPager()) {
    System.out.println(project);
};

// As a Stream:
client.project().list(params).autoPager().stream()
    .limit(50)
    .forEach(project -> System.out.println(project));
```

### Asynchronous

```java
// Using forEach, which returns CompletableFuture<Void>:
asyncClient.project().list(params).autoPager()
    .forEach(project -> System.out.println(project), executor);
```

### Manual pagination

If none of the above helpers meet your needs, you can also manually request pages one-by-one.
A page of results has a `data()` method to fetch the list of objects, as well as top-level
`response` and other methods to fetch top-level data about the page. It also has methods
`hasNextPage`, `getNextPage`, and `getNextPageParams` methods to help with pagination.

```java
ProjectListPage page = client.project().list(params);
while (page != null) {
    for (Project project : page.objects()) {
        System.out.println(project);
    }

    page = page.getNextPage().orElse(null);
}
```

---

## Error handling

This library throws exceptions in a single hierarchy for easy handling:

- **`BraintrustException`** - Base exception for all exceptions

  - **`BraintrustServiceException`** - HTTP errors with a well-formed response body we were able to parse. The exception message and the `.debuggingRequestId()` will be set by the server.

    | 400    | BadRequestException           |
    | ------ | ----------------------------- |
    | 401    | AuthenticationException       |
    | 403    | PermissionDeniedException     |
    | 404    | NotFoundException             |
    | 422    | UnprocessableEntityException  |
    | 429    | RateLimitException            |
    | 5xx    | InternalServerException       |
    | others | UnexpectedStatusCodeException |

  - **`BraintrustIoException`** - I/O networking errors
  - **`BraintrustInvalidDataException`** - any other exceptions on the client side, e.g.:
    - We failed to serialize the request body
    - We failed to parse the response body (has access to response code and body)

## Network options

### Retries

Requests that experience certain errors are automatically retried 2 times by default, with a short exponential backoff. Connection errors (for example, due to a network connectivity problem), 408 Request Timeout, 409 Conflict, 429 Rate Limit, and >=500 Internal errors will all be retried by default.
You can provide a `maxRetries` on the client builder to configure this:

```java
BraintrustClient client = BraintrustOkHttpClient.builder()
    .fromEnv()
    .maxRetries(4)
    .build();
```

### Timeouts

Requests time out after 1 minute by default. You can configure this on the client builder:

```java
BraintrustClient client = BraintrustOkHttpClient.builder()
    .fromEnv()
    .timeout(Duration.ofSeconds(30))
    .build();
```

### Proxies

Requests can be routed through a proxy. You can configure this on the client builder:

```java
BraintrustClient client = BraintrustOkHttpClient.builder()
    .fromEnv()
    .proxy(new Proxy(
        Type.HTTP,
        new InetSocketAddress("proxy.com", 8080)
    ))
    .build();
```

## Semantic Versioning

This package generally follows [SemVer](https://semver.org/spec/v2.0.0.html) conventions, though certain backwards-incompatible changes may be released as minor versions:

1. Changes to library internals which are technically public but not intended or documented for external use. _(Please open a GitHub issue to let us know if you are relying on such internals)_.
2. Changes that we do not expect to impact the vast majority of users in practice.

We take backwards-compatibility seriously and work hard to ensure you can rely on a smooth upgrade experience.

We are keen for your feedback; please open an [issue](https://www.github.com/braintrustdata/braintrust-java/issues) with questions, bugs, or suggestions.
