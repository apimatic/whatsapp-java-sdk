
# Parameter

## Structure

`Parameter`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Type` | [`ParameterTypeEnum`](../../doc/models/parameter-type-enum.md) | Required | Describes the parameter type. For text-based templates, the only supported parameter types are text, currency, date_time. | ParameterTypeEnum getType() | setType(ParameterTypeEnum type) |
| `Text` | `String` | Optional | Required when type=text. The message’s text. For the header component, the character limit is 60 characters. For the body component, the character limit is 1024 characters. | String getText() | setText(String text) |
| `Currency` | [`Currency`](../../doc/models/currency.md) | Optional | Required when type=currency. | Currency getCurrency() | setCurrency(Currency currency) |
| `DateTime` | [`DateTimeObject`](../../doc/models/date-time-object.md) | Optional | Required when type=date_time. | DateTimeObject getDateTime() | setDateTime(DateTimeObject dateTime) |
| `Image` | [`Image`](../../doc/models/image.md) | Optional | Required when type=image. | Image getImage() | setImage(Image image) |
| `Document` | [`Document`](../../doc/models/document.md) | Optional | Required when type=document. Only PDF documents are supported for media-based message templates. | Document getDocument() | setDocument(Document document) |
| `Video` | [`Video`](../../doc/models/video.md) | Optional | Required when type=video. | Video getVideo() | setVideo(Video video) |

## Example (as JSON)

```json
{
  "type": "text",
  "text": "text-string"
}
```

