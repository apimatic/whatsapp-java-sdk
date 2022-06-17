
# Document

## Structure

`Document`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Optional | It is the media object ID. Required when you are not using a link. | String getId() | setId(String id) |
| `Link` | `String` | Optional | The protocol and URL of the media to be sent. Use only with HTTP/HTTPS URLs. Required when you are not using an uploaded media ID. | String getLink() | setLink(String link) |
| `Caption` | `String` | Optional | Describes the specified document media. | String getCaption() | setCaption(String caption) |
| `Filename` | `String` | Optional | Describes the filename for the specific document. | String getFilename() | setFilename(String filename) |

## Example (as JSON)

```json
{
  "id": "<your-media-id>",
  "caption": "<your-document-caption-to-be-sent>",
  "filename": "<your-document-filename>"
}
```

