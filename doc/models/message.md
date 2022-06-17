
# Message

## Structure

`Message`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Audio` | [`Audio`](../../doc/models/audio.md) | Optional | A media object containing audio. Required when type=audio. | Audio getAudio() | setAudio(Audio audio) |
| `Contacts` | [`List<Contact>`](../../doc/models/contact.md) | Optional | A contact object. Required when type=contacts. | List<Contact> getContacts() | setContacts(List<Contact> contacts) |
| `Document` | [`Document`](../../doc/models/document.md) | Optional | A media object containing a document. Required when type=document. | Document getDocument() | setDocument(Document document) |
| `Image` | [`Image`](../../doc/models/image.md) | Optional | A media object containing an image. Required when type=image. | Image getImage() | setImage(Image image) |
| `Interactive` | [`Interactive`](../../doc/models/interactive.md) | Optional | This option is used to send List Messages and Reply Buttons. The components of each interactive object generally follow a consistent pattern: header, body, footer, and action. Required when type=interactive. | Interactive getInteractive() | setInteractive(Interactive interactive) |
| `Location` | [`Location`](../../doc/models/location.md) | Optional | A location object. Required when type=location. | Location getLocation() | setLocation(Location location) |
| `MessagingProduct` | `String` | Required | Messaging service used for the request. | String getMessagingProduct() | setMessagingProduct(String messagingProduct) |
| `RecipientType` | `String` | Optional | Currently, you can only send messages to individuals.<br>**Default**: `"individual"` | String getRecipientType() | setRecipientType(String recipientType) |
| `Sticker` | [`Sticker`](../../doc/models/sticker.md) | Optional | A media object containing a sticker. Currently, we support inbound both and outbound stickers: For outbound, we only support static third-party stickers. For inbound, we support all types of stickers. The sticker needs to be 512x512 pixels and the file’s size needs to be less than 100 KB. Required when type=sticker. | Sticker getSticker() | setSticker(Sticker sticker) |
| `Template` | [`Template`](../../doc/models/template.md) | Optional | A template object. Required when type=template. | Template getTemplate() | setTemplate(Template template) |
| `Text` | [`Text`](../../doc/models/text.md) | Optional | Required for text messages. | Text getText() | setText(Text text) |
| `To` | `String` | Required | WhatsApp ID or phone number for the person you want to send a message to. | String getTo() | setTo(String to) |
| `Type` | [`MessageTypeEnum`](../../doc/models/message-type-enum.md) | Optional | The type of message you want to send. | MessageTypeEnum getType() | setType(MessageTypeEnum type) |
| `Video` | [`Video`](../../doc/models/video.md) | Optional | A media object containing a video. Required when type=video. | Video getVideo() | setVideo(Video video) |

## Example (as JSON)

```json
{
  "messaging_product": "whatsapp",
  "to": "{{Recipient-Phone-Number}}",
  "type": "template",
  "template": {
    "name": "hello_world",
    "language": {
      "code": "en_US"
    }
  }
}
```

