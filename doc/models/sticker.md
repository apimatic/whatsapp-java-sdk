
# Sticker

## Structure

`Sticker`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Link` | `String` | Optional | The protocol and URL of the media to be sent. Use only with HTTP/HTTPS URLs. Required when you are not using an uploaded media ID. | String getLink() | setLink(String link) |
| `Id` | `String` | Optional | The media object ID. Required when you are not using a link. | String getId() | setId(String id) |

## Example (as JSON)

```json
{
  "link": "<link>"
}
```

