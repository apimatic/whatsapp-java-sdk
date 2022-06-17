
# Register Phone Request

## Structure

`RegisterPhoneRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `MessagingProduct` | `String` | Required | Messaging service used. In this case, use "whatsapp". | String getMessagingProduct() | setMessagingProduct(String messagingProduct) |
| `Pin` | `String` | Required | A 6-digit pin you have previously set up - See Set Two-Step Verification. | String getPin() | setPin(String pin) |

## Example (as JSON)

```json
{
  "messaging_product": "whatsapp",
  "pin": "<your-6-digit-pin>"
}
```

