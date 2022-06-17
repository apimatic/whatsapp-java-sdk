
# Send Message Response

## Structure

`SendMessageResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `MessagingProduct` | `String` | Required | - | String getMessagingProduct() | setMessagingProduct(String messagingProduct) |
| `Contacts` | [`List<ResponseContact>`](../../doc/models/response-contact.md) | Required | - | List<ResponseContact> getContacts() | setContacts(List<ResponseContact> contacts) |
| `Messages` | [`List<ResponseMessage>`](../../doc/models/response-message.md) | Required | - | List<ResponseMessage> getMessages() | setMessages(List<ResponseMessage> messages) |

## Example (as JSON)

```json
{
  "messaging_product": "whatsapp",
  "contacts": [
    {
      "input": "48XXXXXXXXX",
      "wa_id": "48XXXXXXXXX "
    }
  ],
  "messages": [
    {
      "id": "wamid.gBGGSFcCNEOPAgkO_KJ55r4w_ww"
    }
  ]
}
```

