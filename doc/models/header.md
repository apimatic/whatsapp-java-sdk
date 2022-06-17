
# Header

## Structure

`Header`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Type` | [`HeaderTypeEnum`](../../doc/models/header-type-enum.md) | Required | The header type you would like to use. | HeaderTypeEnum getType() | setType(HeaderTypeEnum type) |
| `Text` | `String` | Optional | Required if type is set to text. Text for the header. Formatting allows emojis, but not markdown.<br>**Constraints**: *Maximum Length*: `60` | String getText() | setText(String text) |
| `Video` | [`Video`](../../doc/models/video.md) | Optional | Required if type is set to video. Contains the media object for this video. | Video getVideo() | setVideo(Video video) |
| `Image` | [`Image`](../../doc/models/image.md) | Optional | Required if type is set to image. Contains the media object for this image. | Image getImage() | setImage(Image image) |
| `Document` | [`Document`](../../doc/models/document.md) | Optional | Required if type is set to document. Contains the media object for this document. | Document getDocument() | setDocument(Document document) |

## Example (as JSON)

```json
{
  "type": "text",
  "text": "<Header List Message>"
}
```

