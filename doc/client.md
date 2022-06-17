
# Client Class Documentation

The following parameters are configurable for the API Client:

| Parameter | Type | Description |
|  --- | --- | --- |
| `version` | `String` | *Default*: `"v13.0"` |
| `environment` | Environment | The API environment. <br> **Default: `Environment.PRODUCTION`** |
| `httpClientConfig` | `ReadonlyHttpClientConfiguration` | Http Client Configuration instance. |
| `accessToken` | `String` | The OAuth 2.0 Access Token to use for API requests. |

The API client can be initialized as follows:

```java
WhatsAppCloudAPIClient client = new WhatsAppCloudAPIClient.Builder()
    .httpClientConfig(configBuilder -> configBuilder
            .timeout(0))
    .accessToken("AccessToken")
    .environment(Environment.PRODUCTION)
    .version("v13.0")
    .build();
```

## WhatsApp Cloud APIClient Class

The gateway for the SDK. This class acts as a factory for the Controllers and also holds the configuration of the SDK.

### Controllers

| Name | Description | Return Type |
|  --- | --- | --- |
| `getBusinessProfilesController()` | Provides access to BusinessProfiles controller. | `BusinessProfilesController` |
| `getMessagesController()` | Provides access to Messages controller. | `MessagesController` |
| `getMediaController()` | Provides access to Media controller. | `MediaController` |
| `getPhoneNumbersController()` | Provides access to PhoneNumbers controller. | `PhoneNumbersController` |
| `getRegistrationController()` | Provides access to Registration controller. | `RegistrationController` |
| `getTwoStepVerificationController()` | Provides access to TwoStepVerification controller. | `TwoStepVerificationController` |

### Methods

| Name | Description | Return Type |
|  --- | --- | --- |
| `shutdown()` | Shutdown the underlying HttpClient instance. | `void` |
| `getEnvironment()` | Current API environment. | `Environment` |
| `getVersion()` | version value. | `String` |
| `getHttpClient()` | The HTTP Client instance to use for making HTTP requests. | `HttpClient` |
| `getHttpClientConfig()` | Http Client Configuration instance. | `ReadonlyHttpClientConfiguration` |
| `getBearerAuthCredentials()` | The credentials to use with BearerAuth. | `BearerAuthCredentials` |
| `getAccessToken()` | OAuth 2.0 Access Token. | `String` |
| `getBaseUri(Server server)` | Get base URI by current environment | `String` |
| `getBaseUri()` | Get base URI by current environment | `String` |

