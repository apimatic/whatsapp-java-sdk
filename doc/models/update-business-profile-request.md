
# Update Business Profile Request

## Structure

`UpdateBusinessProfileRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `MessagingProduct` | `String` | Required | The messaging service used for the request. Always set it to "whatsapp" if you are using the WhatsApp Business API. | String getMessagingProduct() | setMessagingProduct(String messagingProduct) |
| `Address` | `String` | Optional | Address of the business.<br>**Constraints**: *Maximum Length*: `256` | String getAddress() | setAddress(String address) |
| `Description` | `String` | Optional | Description of the business.<br>**Constraints**: *Maximum Length*: `256` | String getDescription() | setDescription(String description) |
| `Vertical` | [`VerticalEnum`](../../doc/models/vertical-enum.md) | Optional | Industry of the business. This can be either an empty string or one of the accepted values. | VerticalEnum getVertical() | setVertical(VerticalEnum vertical) |
| `Email` | `String` | Optional | The contact email address (in valid email format) of the business.<br>**Constraints**: *Maximum Length*: `128` | String getEmail() | setEmail(String email) |
| `Websites` | `List<String>` | Optional | The URLs associated with the business. For instance, a website, Facebook Page, or Instagram. You must include the http:// or https:// portion of the URL.<br>**Constraints**: *Maximum Items*: `2`, *Maximum Length*: `256` | List<String> getWebsites() | setWebsites(List<String> websites) |
| `ProfilePictureUrl` | `String` | Optional | URL of the profile picture generated from a call to the Resumable Upload API. | String getProfilePictureUrl() | setProfilePictureUrl(String profilePictureUrl) |

## Example (as JSON)

```json
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
  "profile_picture_url": "https://URL"
}
```

