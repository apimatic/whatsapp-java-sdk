
# Image

## Structure

`Image`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Optional | The media object ID. Required when you are not using a link. | String getId() | setId(String id) |
| `Link` | `String` | Optional | The protocol and URL of the media to be sent. Use only with HTTP/HTTPS URLs. Required when you are not using an uploaded media ID. | String getLink() | setLink(String link) |
| `Caption` | `String` | Optional | Describes the specified image media. | String getCaption() | setCaption(String caption) |

## Example (as JSON)

```json
{
  "id": "<image-object-id>"
}
```

