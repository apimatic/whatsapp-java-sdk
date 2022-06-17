
# Button

## Structure

`Button`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Type` | `String` | Required | **Default**: `"reply"` | String getType() | setType(String type) |
| `Title` | `String` | Optional | Button title. It cannot be an empty string and must be unique within the message. Emojis are supported, markdown is not.<br>**Constraints**: *Maximum Length*: `20` | String getTitle() | setTitle(String title) |
| `Id` | `String` | Optional | Unique identifier for your button. This ID is returned in the webhook when the button is clicked by the user.<br>**Constraints**: *Maximum Length*: `256` | String getId() | setId(String id) |

## Example (as JSON)

```json
{
  "type": "reply"
}
```

