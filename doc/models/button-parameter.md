
# Button Parameter

## Structure

`ButtonParameter`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Type` | [`ButtonParameterTypeEnum`](../../doc/models/button-parameter-type-enum.md) | Required | Indicates the type of parameter for the button. | ButtonParameterTypeEnum getType() | setType(ButtonParameterTypeEnum type) |
| `Payload` | `String` | Optional | Required for quick_reply buttons. Developer-defined payload that is returned when the button is clicked in addition to the display text on the button. | String getPayload() | setPayload(String payload) |
| `Text` | `String` | Optional | Required for URL buttons. Developer-provided suffix that is appended to the predefined prefix URL in the template. | String getText() | setText(String text) |

## Example (as JSON)

```json
{
  "type": "payload",
  "payload": null,
  "text": null
}
```

