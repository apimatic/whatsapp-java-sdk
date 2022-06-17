
# Retrieve Media URL Response

## Structure

`RetrieveMediaURLResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `MessagingProduct` | `String` | Required | - | String getMessagingProduct() | setMessagingProduct(String messagingProduct) |
| `Url` | `String` | Required | - | String getUrl() | setUrl(String url) |
| `MimeType` | `String` | Required | - | String getMimeType() | setMimeType(String mimeType) |
| `Sha256` | `String` | Required | - | String getSha256() | setSha256(String sha256) |
| `FileSize` | `String` | Required | - | String getFileSize() | setFileSize(String fileSize) |
| `Id` | `String` | Required | - | String getId() | setId(String id) |

## Example (as JSON)

```json
{
  "messaging_product": "whatsapp",
  "url": "<URL>",
  "mime_type": "image/jpeg",
  "sha256": "<HASH>",
  "file_size": "303833",
  "id": "2621233374848975"
}
```

