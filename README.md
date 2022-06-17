
# Getting Started with WhatsApp Cloud API

## Introduction

Welcome to the WhatsApp API from Meta.

Individual developers and existing Business Service Providers (BSPs) can now send and receive messages via the WhatsApp API using a cloud-hosted version of the WhatsApp Business API. Compared to the previous solutions, the cloud-based WhatsApp API is simpler to use and is a more cost-effective way for businesses to use WhatsApp. Please keep in mind the following configurations:

| Name | Description |
| --- | --- |
| Version | Latest [Graph API version](https://developers.facebook.com/docs/graph-api/). For example: v13.0 |
| User-Access-Token | Your user access token after signing up at [developers.facebook.com](https://developers.facebook.com). |
| WABA-ID | Your WhatsApp Business Account (WABA) ID. |
| Phone-Number-ID | ID for the phone number connected to the WhatsApp Business API. You can get this with a [Get Phone Number ID request](3184f675-d289-46f1-88e5-e2b11549c418). |
| Business-ID | Your Business' ID. Once you have your Phone-Number-ID, make a [Get Business Profile request](#99fd3743-46cf-46c4-95b5-431c6a4eb0b0) to get your Business' ID. |
| Recipient-Phone-Number | Phone number that you want to send a WhatsApp message to. |
| Media-ID | ID for the media to [send a media message](#0a632754-3788-43bf-b785-ac6a73423d5a) or [media template message](#439c926a-8a6c-4972-ab2c-d99297716da9) to your customers. |
| Media-URL | URL for the media to [download media content](#cbe5ece3-246c-48f3-b338-074187dfef66). |

## Building

The generated code uses a few Maven dependencies e.g., Jackson, OkHttp,
and Apache HttpClient. The reference to these dependencies is already
added in the pom.xml file will be installed automatically. Therefore,
you will need internet access for a successful build.

* In order to open the client library in Eclipse click on `File -> Import`.

![Importing SDK into Eclipse - Step 1](https://apidocs.io/illustration/java?workspaceFolder=WhatsApp%20Cloud%20API-Java&workspaceName=WhatsAppCloudAPI&projectName=WhatsAppCloudAPILib&rootNamespace=com.facebook.graph&groupId=WhatsAppCloudAPILib&artifactId=whats-app-cloud-apilib&version=1.0.0&step=import0)

* In the import dialog, select `Existing Java Project` and click `Next`.

![Importing SDK into Eclipse - Step 2](https://apidocs.io/illustration/java?workspaceFolder=WhatsApp%20Cloud%20API-Java&workspaceName=WhatsAppCloudAPI&projectName=WhatsAppCloudAPILib&rootNamespace=com.facebook.graph&groupId=WhatsAppCloudAPILib&artifactId=whats-app-cloud-apilib&version=1.0.0&step=import1)

* Browse to locate the folder containing the source code. Select the detected location of the project and click `Finish`.

![Importing SDK into Eclipse - Step 3](https://apidocs.io/illustration/java?workspaceFolder=WhatsApp%20Cloud%20API-Java&workspaceName=WhatsAppCloudAPI&projectName=WhatsAppCloudAPILib&rootNamespace=com.facebook.graph&groupId=WhatsAppCloudAPILib&artifactId=whats-app-cloud-apilib&version=1.0.0&step=import2)

* Upon successful import, the project will be automatically built by Eclipse after automatically resolving the dependencies.

![Importing SDK into Eclipse - Step 4](https://apidocs.io/illustration/java?workspaceFolder=WhatsApp%20Cloud%20API-Java&workspaceName=WhatsAppCloudAPI&projectName=WhatsAppCloudAPILib&rootNamespace=com.facebook.graph&groupId=WhatsAppCloudAPILib&artifactId=whats-app-cloud-apilib&version=1.0.0&step=import3)

## Installation

The following section explains how to use the WhatsAppCloudAPILib library in a new project.

### 1. Starting a new project

For starting a new project, click the menu command `File > New > Project`.

![Add a new project in Eclipse](https://apidocs.io/illustration/java?workspaceFolder=WhatsApp%20Cloud%20API-Java&workspaceName=WhatsAppCloudAPI&projectName=WhatsAppCloudAPILib&rootNamespace=com.facebook.graph&groupId=WhatsAppCloudAPILib&artifactId=whats-app-cloud-apilib&version=1.0.0&step=createNewProject0)

Next, choose `Maven > Maven Project` and click `Next`.

![Create a new Maven Project - Step 1](https://apidocs.io/illustration/java?workspaceFolder=WhatsApp%20Cloud%20API-Java&workspaceName=WhatsAppCloudAPI&projectName=WhatsAppCloudAPILib&rootNamespace=com.facebook.graph&groupId=WhatsAppCloudAPILib&artifactId=whats-app-cloud-apilib&version=1.0.0&step=createNewProject1)

Here, make sure to use the current workspace by choosing `Use default Workspace location`, as shown in the picture below and click `Next`.

![Create a new Maven Project - Step 2](https://apidocs.io/illustration/java?workspaceFolder=WhatsApp%20Cloud%20API-Java&workspaceName=WhatsAppCloudAPI&projectName=WhatsAppCloudAPILib&rootNamespace=com.facebook.graph&groupId=WhatsAppCloudAPILib&artifactId=whats-app-cloud-apilib&version=1.0.0&step=createNewProject2)

Following this, select the *quick start* project type to create a simple project with an existing class and a `main` method. To do this, choose `maven-archetype-quickstart` item from the list and click `Next`.

![Create a new Maven Project - Step 3](https://apidocs.io/illustration/java?workspaceFolder=WhatsApp%20Cloud%20API-Java&workspaceName=WhatsAppCloudAPI&projectName=WhatsAppCloudAPILib&rootNamespace=com.facebook.graph&groupId=WhatsAppCloudAPILib&artifactId=whats-app-cloud-apilib&version=1.0.0&step=createNewProject3)

In the last step, provide a `Group Id` and `Artifact Id` as shown in the picture below and click `Finish`.

![Create a new Maven Project - Step 4](https://apidocs.io/illustration/java?workspaceFolder=WhatsApp%20Cloud%20API-Java&workspaceName=WhatsAppCloudAPI&projectName=WhatsAppCloudAPILib&rootNamespace=com.facebook.graph&groupId=WhatsAppCloudAPILib&artifactId=whats-app-cloud-apilib&version=1.0.0&step=createNewProject4)

### 2. Add reference of the library project

The created Maven project manages its dependencies using its `pom.xml` file. In order to add a dependency on the *WhatsAppCloudAPILib* client library, double click on the `pom.xml` file in the `Package Explorer`. Opening the `pom.xml` file will render a graphical view on the canvas. Here, switch to the `Dependencies` tab and click the `Add` button as shown in the picture below.

![Adding dependency to the client library - Step 1](https://apidocs.io/illustration/java?workspaceFolder=WhatsApp%20Cloud%20API-Java&workspaceName=WhatsAppCloudAPI&projectName=WhatsAppCloudAPILib&rootNamespace=com.facebook.graph&groupId=WhatsAppCloudAPILib&artifactId=whats-app-cloud-apilib&version=1.0.0&step=testProject0)

Clicking the `Add` button will open a dialog where you need to specify WhatsAppCloudAPILib in `Group Id`, whats-app-cloud-apilib in `Artifact Id` and 1.0.0 in the `Version` fields. Once added click `OK`. Save the `pom.xml` file.

![Adding dependency to the client library - Step 2](https://apidocs.io/illustration/java?workspaceFolder=WhatsApp%20Cloud%20API-Java&workspaceName=WhatsAppCloudAPI&projectName=WhatsAppCloudAPILib&rootNamespace=com.facebook.graph&groupId=WhatsAppCloudAPILib&artifactId=whats-app-cloud-apilib&version=1.0.0&step=testProject1)

![Adding sample code](https://apidocs.io/illustration/java?workspaceFolder=WhatsApp%20Cloud%20API-Java&workspaceName=WhatsAppCloudAPI&projectName=WhatsAppCloudAPILib&rootNamespace=com.facebook.graph&groupId=WhatsAppCloudAPILib&artifactId=whats-app-cloud-apilib&version=1.0.0&step=testProject2)

### 3. Write sample code

Once the `SimpleConsoleApp` is created, a file named `App.java` will be visible in the *Package Explorer* with a `main` method. This is the entry point for the execution of the created project.
Here, you can add code to initialize the client library and instantiate a *Controller* class. Sample code to initialize the client library and using controller methods is given in the subsequent sections.

## Initialize the API Client

**_Note:_** Documentation for the client can be found [here.](doc/client.md)

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

## Authorization

This API uses `OAuth 2 Bearer token`.

## List of APIs

* [Business Profiles](doc/controllers/business-profiles.md)
* [Phone Numbers](doc/controllers/phone-numbers.md)
* [Two-Step Verification](doc/controllers/two-step-verification.md)
* [Messages](doc/controllers/messages.md)
* [Registration](doc/controllers/registration.md)
* [Media](doc/controllers/media.md)

## Classes Documentation

* [Utility Classes](doc/utility-classes.md)
* [HttpRequest](doc/http-request.md)
* [HttpResponse](doc/http-response.md)
* [HttpStringResponse](doc/http-string-response.md)
* [HttpContext](doc/http-context.md)
* [HttpBodyRequest](doc/http-body-request.md)
* [Headers](doc/headers.md)
* [ApiException](doc/api-exception.md)
* [Configuration Interface](doc/configuration-interface.md)
* [HttpClientConfiguration](doc/http-client-configuration.md)
* [HttpClientConfiguration.Builder](doc/http-client-configuration-builder.md)

