# Business Profiles

```java
BusinessProfilesController businessProfilesController = client.getBusinessProfilesController();
```

## Class Name

`BusinessProfilesController`

## Methods

* [Update Business Profile](../../doc/controllers/business-profiles.md#update-business-profile)
* [Get Business Profile ID](../../doc/controllers/business-profiles.md#get-business-profile-id)


# Update Business Profile

Use this endpoint to update your business’ profile information such as the business description, email or address.

```java
CompletableFuture<SuccessResponse> updateBusinessProfileAsync(
    final String phoneNumberID,
    final UpdateBusinessProfileRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `phoneNumberID` | `String` | Template, Required | - |
| `body` | [`UpdateBusinessProfileRequest`](../../doc/models/update-business-profile-request.md) | Body, Required | - |

## Response Type

[`SuccessResponse`](../../doc/models/success-response.md)

## Example Usage

```java
String phoneNumberID = "Phone-Number-ID6";
UpdateBusinessProfileRequest body = new UpdateBusinessProfileRequest();
body.setMessagingProduct("whatsapp");
body.setAddress("ADDRESS");
body.setDescription("DESCRIPTION");
body.setVertical(VerticalEnum.UNDEFINED);
body.setEmail("EMAIL");
body.setWebsites(new LinkedList<>());
body.getWebsites().add("https://WEBSITE-1");
body.getWebsites().add("https://WEBSITE-2");
body.setProfilePictureUrl("https://URL");

businessProfilesController.updateBusinessProfileAsync(phoneNumberID, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "success": true
}
```


# Get Business Profile ID

Use this endpoint to retrieve your business’ profile. This business profile is visible to consumers in the chat thread next to the profile photo. The profile information will contain a business profile ID which you can use to make API calls.

```java
CompletableFuture<GetBusinessProfileIDResponse> getBusinessProfileIDAsync(
    final String phoneNumberID,
    final String fields)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `phoneNumberID` | `String` | Template, Required | - |
| `fields` | `String` | Query, Optional | Here you can specify what you want to know from your business as a comma separated list of fields. Available fields include: id, about, messaging_product, address, description, vertical, email, websites, profile_picture_url |

## Response Type

[`GetBusinessProfileIDResponse`](../../doc/models/get-business-profile-id-response.md)

## Example Usage

```java
String phoneNumberID = "Phone-Number-ID6";
String fields = "about,address,description,email,profile_picture_url,websites,vertical";

businessProfilesController.getBusinessProfileIDAsync(phoneNumberID, fields).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "data": [
    {
      "messaging_product": "whatsapp",
      "address": "ADDRESS",
      "description": "DESCRIPTION",
      "vertical": "UNDEFINED",
      "email": "EMAIL",
      "websites": [
        "https://WEBSITE-1",
        "https://WEBSITE-2"
      ],
      "profile_picture_url": "https://URL",
      "id": "BUSINESS_PROFILE_ID"
    }
  ]
}
```

