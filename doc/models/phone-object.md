
# Phone Object

## Structure

`PhoneObject`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Phone` | `String` | Optional | Automatically populated with the wa_id value as a formatted phone number. | String getPhone() | setPhone(String phone) |
| `WaId` | `String` | Optional | WhatsApp ID. | String getWaId() | setWaId(String waId) |
| `Type` | [`PhoneTypeEnum`](../../doc/models/phone-type-enum.md) | Optional | - | PhoneTypeEnum getType() | setType(PhoneTypeEnum type) |

## Example (as JSON)

```json
{
  "phone": "<CONTACT_PHONE>",
  "wa_id": "<CONTACT_WA_ID>",
  "type": "HOME"
}
```

